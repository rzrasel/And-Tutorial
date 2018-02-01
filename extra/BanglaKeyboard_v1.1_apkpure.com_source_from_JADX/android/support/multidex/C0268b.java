package android.support.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

final class C0268b {
    private static Method f1091a;

    static {
        try {
            f1091a = Editor.class.getMethod("apply", new Class[0]);
        } catch (NoSuchMethodException e) {
            f1091a = null;
        }
    }

    private static SharedPreferences m715a(Context context) {
        return context.getSharedPreferences("multidex.version", VERSION.SDK_INT < 11 ? 0 : 4);
    }

    static List<File> m716a(Context context, ApplicationInfo applicationInfo, File file, boolean z) {
        List<File> a;
        Object obj = null;
        new StringBuilder("MultiDexExtractor.load(").append(applicationInfo.sourceDir).append(", ").append(z).append(")");
        File file2 = new File(applicationInfo.sourceDir);
        long a2 = C0270c.m725a(file2);
        if (a2 == -1) {
            a2--;
        }
        if (!z) {
            SharedPreferences a3 = C0268b.m715a(context);
            if (!(a3.getLong("timestamp", -1) == C0268b.m723b(file2) && a3.getLong("crc", -1) == a2)) {
                obj = 1;
            }
            if (obj == null) {
                try {
                    a = C0268b.m717a(context, file2, file);
                } catch (Throwable e) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                }
                new StringBuilder("load found ").append(a.size()).append(" secondary dex files");
                return a;
            }
        }
        a = C0268b.m718a(file2, file);
        long b = C0268b.m723b(file2);
        int size = a.size() + 1;
        Editor edit = C0268b.m715a(context).edit();
        edit.putLong("timestamp", b);
        edit.putLong("crc", a2);
        edit.putInt("dex.number", size);
        if (f1091a != null) {
            try {
                f1091a.invoke(edit, new Object[0]);
            } catch (InvocationTargetException e2) {
            } catch (IllegalAccessException e3) {
            }
            new StringBuilder("load found ").append(a.size()).append(" secondary dex files");
            return a;
        }
        edit.commit();
        new StringBuilder("load found ").append(a.size()).append(" secondary dex files");
        return a;
    }

    private static List<File> m717a(Context context, File file, File file2) {
        String str = file.getName() + ".classes";
        int i = C0268b.m715a(context).getInt("dex.number", 1);
        List<File> arrayList = new ArrayList(i);
        int i2 = 2;
        while (i2 <= i) {
            File file3 = new File(file2, str + i2 + ".zip");
            if (file3.isFile()) {
                arrayList.add(file3);
                if (C0268b.m722a(file3)) {
                    i2++;
                } else {
                    new StringBuilder("Invalid zip file: ").append(file3);
                    throw new IOException("Invalid ZIP file.");
                }
            }
            throw new IOException("Missing extracted secondary dex file '" + file3.getPath() + "'");
        }
        return arrayList;
    }

    private static List<File> m718a(File file, File file2) {
        String str = file.getName() + ".classes";
        C0268b.m720a(file2, str);
        List<File> arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i = 2;
            while (entry != null) {
                File file3 = new File(file2, str + i + ".zip");
                arrayList.add(file3);
                new StringBuilder("Extraction is needed for file ").append(file3);
                boolean z = false;
                int i2 = 0;
                while (i2 < 3 && !z) {
                    int i3 = i2 + 1;
                    C0268b.m721a(zipFile, entry, file3, str);
                    boolean a = C0268b.m722a(file3);
                    new StringBuilder("Extraction ").append(a ? "success" : "failed").append(" - length ").append(file3.getAbsolutePath()).append(": ").append(file3.length());
                    if (!a) {
                        file3.delete();
                        if (file3.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + file3.getPath() + "'");
                            z = a;
                            i2 = i3;
                        }
                    }
                    z = a;
                    i2 = i3;
                }
                if (z) {
                    i2 = i + 1;
                    entry = zipFile.getEntry("classes" + i2 + ".dex");
                    i = i2;
                } else {
                    throw new IOException("Could not create zip file " + file3.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (Throwable e) {
                Log.w("MultiDex", "Failed to close resource", e);
            }
        }
    }

    private static void m719a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Throwable e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    private static void m720a(File file, final String str) {
        C0268b.m724c(file.getParentFile());
        C0268b.m724c(file);
        File[] listFiles = file.listFiles(new FileFilter() {
            public final boolean accept(File file) {
                return !file.getName().startsWith(str);
            }
        });
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
            return;
        }
        for (File file2 : listFiles) {
            new StringBuilder("Trying to delete old file ").append(file2.getPath()).append(" of size ").append(file2.length());
            if (file2.delete()) {
                new StringBuilder("Deleted old file ").append(file2.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
            }
        }
    }

    private static void m721a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        Closeable inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(str, ".zip", file.getParentFile());
        new StringBuilder("Extracting ").append(createTempFile.getPath());
        ZipOutputStream zipOutputStream;
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            new StringBuilder("Renaming to ").append(file.getPath());
            if (createTempFile.renameTo(file)) {
                C0268b.m719a(inputStream);
                createTempFile.delete();
                return;
            }
            throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
        } catch (Throwable th) {
            C0268b.m719a(inputStream);
            createTempFile.delete();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m722a(java.io.File r4) {
        /*
        r0 = new java.util.zip.ZipFile;	 Catch:{ ZipException -> 0x0025, IOException -> 0x0045 }
        r0.<init>(r4);	 Catch:{ ZipException -> 0x0025, IOException -> 0x0045 }
        r0.close();	 Catch:{ IOException -> 0x000a, ZipException -> 0x0025 }
        r0 = 1;
    L_0x0009:
        return r0;
    L_0x000a:
        r0 = move-exception;
        r0 = "MultiDex";
        r1 = new java.lang.StringBuilder;	 Catch:{ ZipException -> 0x0025, IOException -> 0x0045 }
        r2 = "Failed to close zip file: ";
        r1.<init>(r2);	 Catch:{ ZipException -> 0x0025, IOException -> 0x0045 }
        r2 = r4.getAbsolutePath();	 Catch:{ ZipException -> 0x0025, IOException -> 0x0045 }
        r1 = r1.append(r2);	 Catch:{ ZipException -> 0x0025, IOException -> 0x0045 }
        r1 = r1.toString();	 Catch:{ ZipException -> 0x0025, IOException -> 0x0045 }
        android.util.Log.w(r0, r1);	 Catch:{ ZipException -> 0x0025, IOException -> 0x0045 }
    L_0x0023:
        r0 = 0;
        goto L_0x0009;
    L_0x0025:
        r0 = move-exception;
        r1 = "MultiDex";
        r2 = new java.lang.StringBuilder;
        r3 = "File ";
        r2.<init>(r3);
        r3 = r4.getAbsolutePath();
        r2 = r2.append(r3);
        r3 = " is not a valid zip file.";
        r2 = r2.append(r3);
        r2 = r2.toString();
        android.util.Log.w(r1, r2, r0);
        goto L_0x0023;
    L_0x0045:
        r0 = move-exception;
        r1 = "MultiDex";
        r2 = new java.lang.StringBuilder;
        r3 = "Got an IOException trying to open zip file: ";
        r2.<init>(r3);
        r3 = r4.getAbsolutePath();
        r2 = r2.append(r3);
        r2 = r2.toString();
        android.util.Log.w(r1, r2, r0);
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.multidex.b.a(java.io.File):boolean");
    }

    private static long m723b(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static void m724c(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                new StringBuilder("Failed to create dir ").append(file.getPath()).append(". Parent file is null.");
            } else {
                new StringBuilder("Failed to create dir ").append(file.getPath()).append(". parent file is a dir ").append(parentFile.isDirectory()).append(", a file ").append(parentFile.isFile()).append(", exists ").append(parentFile.exists()).append(", readable ").append(parentFile.canRead()).append(", writable ").append(parentFile.canWrite());
            }
            throw new IOException("Failed to create cache directory " + file.getPath());
        }
    }
}
