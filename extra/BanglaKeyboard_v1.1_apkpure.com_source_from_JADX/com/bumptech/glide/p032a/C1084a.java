package com.bumptech.glide.p032a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class C1084a implements Closeable {
    final ThreadPoolExecutor f3147a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final File f3148b;
    private final File f3149c;
    private final File f3150d;
    private final File f3151e;
    private final int f3152f;
    private long f3153g;
    private final int f3154h;
    private long f3155i = 0;
    private Writer f3156j;
    private final LinkedHashMap<String, C1082b> f3157k = new LinkedHashMap(0, 0.75f, true);
    private int f3158l;
    private long f3159m = 0;
    private final Callable<Void> f3160n = new C10801(this);

    class C10801 implements Callable<Void> {
        final /* synthetic */ C1084a f3129a;

        C10801(C1084a c1084a) {
            this.f3129a = c1084a;
        }

        private Void m2842a() {
            synchronized (this.f3129a) {
                if (this.f3129a.f3156j == null) {
                } else {
                    this.f3129a.m2868f();
                    if (this.f3129a.m2864d()) {
                        this.f3129a.m2860c();
                        this.f3129a.f3158l = 0;
                    }
                }
            }
            return null;
        }

        public final /* synthetic */ Object call() {
            return m2842a();
        }
    }

    public final class C1081a {
        final C1082b f3130a;
        final boolean[] f3131b;
        final /* synthetic */ C1084a f3132c;
        private boolean f3133d;

        private C1081a(C1084a c1084a, C1082b c1082b) {
            this.f3132c = c1084a;
            this.f3130a = c1082b;
            this.f3131b = c1082b.f3138e ? null : new boolean[c1084a.f3154h];
        }

        public final File m2843a() {
            File file;
            synchronized (this.f3132c) {
                if (this.f3130a.f3139f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f3130a.f3138e) {
                    this.f3131b[0] = true;
                }
                file = this.f3130a.f3137d[0];
                if (!this.f3132c.f3148b.exists()) {
                    this.f3132c.f3148b.mkdirs();
                }
            }
            return file;
        }

        public final void m2844b() {
            this.f3132c.m2854a(this, true);
            this.f3133d = true;
        }

        public final void m2845c() {
            this.f3132c.m2854a(this, false);
        }

        public final void m2846d() {
            if (!this.f3133d) {
                try {
                    m2845c();
                } catch (IOException e) {
                }
            }
        }
    }

    private final class C1082b {
        final String f3134a;
        final long[] f3135b;
        File[] f3136c;
        File[] f3137d;
        boolean f3138e;
        C1081a f3139f;
        long f3140g;
        final /* synthetic */ C1084a f3141h;

        private C1082b(C1084a c1084a, String str) {
            this.f3141h = c1084a;
            this.f3134a = str;
            this.f3135b = new long[c1084a.f3154h];
            this.f3136c = new File[c1084a.f3154h];
            this.f3137d = new File[c1084a.f3154h];
            StringBuilder append = new StringBuilder(str).append('.');
            int length = append.length();
            for (int i = 0; i < c1084a.f3154h; i++) {
                append.append(i);
                this.f3136c[i] = new File(c1084a.f3148b, append.toString());
                append.append(".tmp");
                this.f3137d[i] = new File(c1084a.f3148b, append.toString());
                append.setLength(length);
            }
        }

        private static IOException m2847b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final String m2848a() {
            StringBuilder stringBuilder = new StringBuilder();
            for (long append : this.f3135b) {
                stringBuilder.append(' ').append(append);
            }
            return stringBuilder.toString();
        }

        final void m2849a(String[] strArr) {
            if (strArr.length != this.f3141h.f3154h) {
                throw C1082b.m2847b(strArr);
            }
            int i = 0;
            while (i < strArr.length) {
                try {
                    this.f3135b[i] = Long.parseLong(strArr[i]);
                    i++;
                } catch (NumberFormatException e) {
                    throw C1082b.m2847b(strArr);
                }
            }
        }
    }

    public final class C1083c {
        final /* synthetic */ C1084a f3142a;
        private final String f3143b;
        private final long f3144c;
        private final long[] f3145d;
        private final File[] f3146e;

        private C1083c(C1084a c1084a, String str, long j, File[] fileArr, long[] jArr) {
            this.f3142a = c1084a;
            this.f3143b = str;
            this.f3144c = j;
            this.f3146e = fileArr;
            this.f3145d = jArr;
        }

        public final File m2850a() {
            return this.f3146e[0];
        }
    }

    private C1084a(File file, long j) {
        this.f3148b = file;
        this.f3152f = 1;
        this.f3149c = new File(file, "journal");
        this.f3150d = new File(file, "journal.tmp");
        this.f3151e = new File(file, "journal.bkp");
        this.f3154h = 1;
        this.f3153g = j;
    }

    public static C1084a m2851a(File file, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                C1084a.m2857a(file2, file3, false);
            }
        }
        C1084a c1084a = new C1084a(file, j);
        if (c1084a.f3149c.exists()) {
            try {
                c1084a.m2853a();
                c1084a.m2858b();
                return c1084a;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c1084a.close();
                C1087c.m2876a(c1084a.f3148b);
            }
        }
        file.mkdirs();
        c1084a = new C1084a(file, j);
        c1084a.m2860c();
        return c1084a;
    }

    private void m2853a() {
        Closeable c1086b = new C1086b(new FileInputStream(this.f3149c), C1087c.f3167a);
        int i;
        try {
            String a = c1086b.m2874a();
            String a2 = c1086b.m2874a();
            String a3 = c1086b.m2874a();
            String a4 = c1086b.m2874a();
            String a5 = c1086b.m2874a();
            if ("libcore.io.DiskLruCache".equals(a) && "1".equals(a2) && Integer.toString(this.f3152f).equals(a3) && Integer.toString(this.f3154h).equals(a4) && "".equals(a5)) {
                i = 0;
                while (true) {
                    a4 = c1086b.m2874a();
                    int indexOf = a4.indexOf(32);
                    if (indexOf == -1) {
                        throw new IOException("unexpected journal line: " + a4);
                    }
                    int i2 = indexOf + 1;
                    int indexOf2 = a4.indexOf(32, i2);
                    C1082b c1082b;
                    if (indexOf2 != -1) {
                        a2 = a4.substring(i2, indexOf2);
                        c1082b = (C1082b) this.f3157k.get(a2);
                        if (c1082b == null) {
                            c1082b = new C1082b(a2);
                            this.f3157k.put(a2, c1082b);
                        }
                        if (indexOf2 == -1) {
                        }
                        if (indexOf2 != -1) {
                        }
                        if (indexOf2 == -1) {
                            break;
                        }
                        break;
                    }
                    a = a4.substring(i2);
                    if (indexOf == 6 && a4.startsWith("REMOVE")) {
                        this.f3157k.remove(a);
                    } else {
                        a2 = a;
                        c1082b = (C1082b) this.f3157k.get(a2);
                        if (c1082b == null) {
                            c1082b = new C1082b(a2);
                            this.f3157k.put(a2, c1082b);
                        }
                        if (indexOf2 == -1 && indexOf == 5 && a4.startsWith("CLEAN")) {
                            String[] split = a4.substring(indexOf2 + 1).split(" ");
                            c1082b.f3138e = true;
                            c1082b.f3139f = null;
                            c1082b.m2849a(split);
                        } else if (indexOf2 != -1 && indexOf == 5 && a4.startsWith("DIRTY")) {
                            c1082b.f3139f = new C1081a(c1082b);
                        } else if (indexOf2 == -1 && indexOf == 4 && a4.startsWith("READ")) {
                        }
                    }
                    i++;
                }
                throw new IOException("unexpected journal line: " + a4);
            }
            throw new IOException("unexpected journal header: [" + a + ", " + a2 + ", " + a4 + ", " + a5 + "]");
        } catch (EOFException e) {
            this.f3158l = i - this.f3157k.size();
            if ((c1086b.f3163b == -1 ? 1 : null) != null) {
                m2860c();
            } else {
                this.f3156j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3149c, true), C1087c.f3167a));
            }
            C1087c.m2875a(c1086b);
        } catch (Throwable th) {
            C1087c.m2875a(c1086b);
        }
    }

    private synchronized void m2854a(C1081a c1081a, boolean z) {
        int i = 0;
        synchronized (this) {
            C1082b c1082b = c1081a.f3130a;
            if (c1082b.f3139f != c1081a) {
                throw new IllegalStateException();
            }
            if (z) {
                if (!c1082b.f3138e) {
                    int i2 = 0;
                    while (i2 < this.f3154h) {
                        if (!c1081a.f3131b[i2]) {
                            c1081a.m2845c();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                        } else if (!c1082b.f3137d[i2].exists()) {
                            c1081a.m2845c();
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            while (i < this.f3154h) {
                File file = c1082b.f3137d[i];
                if (!z) {
                    C1084a.m2856a(file);
                } else if (file.exists()) {
                    File file2 = c1082b.f3136c[i];
                    file.renameTo(file2);
                    long j = c1082b.f3135b[i];
                    long length = file2.length();
                    c1082b.f3135b[i] = length;
                    this.f3155i = (this.f3155i - j) + length;
                }
                i++;
            }
            this.f3158l++;
            c1082b.f3139f = null;
            if ((c1082b.f3138e | z) != 0) {
                c1082b.f3138e = true;
                this.f3156j.append("CLEAN");
                this.f3156j.append(' ');
                this.f3156j.append(c1082b.f3134a);
                this.f3156j.append(c1082b.m2848a());
                this.f3156j.append('\n');
                if (z) {
                    long j2 = this.f3159m;
                    this.f3159m = 1 + j2;
                    c1082b.f3140g = j2;
                }
            } else {
                this.f3157k.remove(c1082b.f3134a);
                this.f3156j.append("REMOVE");
                this.f3156j.append(' ');
                this.f3156j.append(c1082b.f3134a);
                this.f3156j.append('\n');
            }
            this.f3156j.flush();
            if (this.f3155i > this.f3153g || m2864d()) {
                this.f3147a.submit(this.f3160n);
            }
        }
    }

    private static void m2856a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void m2857a(File file, File file2, boolean z) {
        if (z) {
            C1084a.m2856a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void m2858b() {
        C1084a.m2856a(this.f3150d);
        Iterator it = this.f3157k.values().iterator();
        while (it.hasNext()) {
            C1082b c1082b = (C1082b) it.next();
            int i;
            if (c1082b.f3139f == null) {
                for (i = 0; i < this.f3154h; i++) {
                    this.f3155i += c1082b.f3135b[i];
                }
            } else {
                c1082b.f3139f = null;
                for (i = 0; i < this.f3154h; i++) {
                    C1084a.m2856a(c1082b.f3136c[i]);
                    C1084a.m2856a(c1082b.f3137d[i]);
                }
                it.remove();
            }
        }
    }

    private synchronized void m2860c() {
        if (this.f3156j != null) {
            this.f3156j.close();
        }
        Writer bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3150d), C1087c.f3167a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f3152f));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f3154h));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C1082b c1082b : this.f3157k.values()) {
                if (c1082b.f3139f != null) {
                    bufferedWriter.write("DIRTY " + c1082b.f3134a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + c1082b.f3134a + c1082b.m2848a() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.f3149c.exists()) {
                C1084a.m2857a(this.f3149c, this.f3151e, true);
            }
            C1084a.m2857a(this.f3150d, this.f3149c, false);
            this.f3151e.delete();
            this.f3156j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3149c, true), C1087c.f3167a));
        } catch (Throwable th) {
            bufferedWriter.close();
        }
    }

    private synchronized C1081a m2862d(String str) {
        C1081a c1081a;
        m2866e();
        C1082b c1082b = (C1082b) this.f3157k.get(str);
        if (-1 == -1 || (c1082b != null && c1082b.f3140g == -1)) {
            C1082b c1082b2;
            if (c1082b == null) {
                c1082b = new C1082b(str);
                this.f3157k.put(str, c1082b);
                c1082b2 = c1082b;
            } else if (c1082b.f3139f != null) {
                c1081a = null;
            } else {
                c1082b2 = c1082b;
            }
            c1081a = new C1081a(c1082b2);
            c1082b2.f3139f = c1081a;
            this.f3156j.append("DIRTY");
            this.f3156j.append(' ');
            this.f3156j.append(str);
            this.f3156j.append('\n');
            this.f3156j.flush();
        } else {
            c1081a = null;
        }
        return c1081a;
    }

    private boolean m2864d() {
        return this.f3158l >= 2000 && this.f3158l >= this.f3157k.size();
    }

    private void m2866e() {
        if (this.f3156j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private void m2868f() {
        while (this.f3155i > this.f3153g) {
            m2872c((String) ((Entry) this.f3157k.entrySet().iterator().next()).getKey());
        }
    }

    public final synchronized C1083c m2870a(String str) {
        C1083c c1083c = null;
        synchronized (this) {
            m2866e();
            C1082b c1082b = (C1082b) this.f3157k.get(str);
            if (c1082b != null) {
                if (c1082b.f3138e) {
                    for (File exists : c1082b.f3136c) {
                        if (!exists.exists()) {
                            break;
                        }
                    }
                    this.f3158l++;
                    this.f3156j.append("READ");
                    this.f3156j.append(' ');
                    this.f3156j.append(str);
                    this.f3156j.append('\n');
                    if (m2864d()) {
                        this.f3147a.submit(this.f3160n);
                    }
                    c1083c = new C1083c(str, c1082b.f3140g, c1082b.f3136c, c1082b.f3135b);
                }
            }
        }
        return c1083c;
    }

    public final C1081a m2871b(String str) {
        return m2862d(str);
    }

    public final synchronized boolean m2872c(String str) {
        boolean z;
        int i = 0;
        synchronized (this) {
            m2866e();
            C1082b c1082b = (C1082b) this.f3157k.get(str);
            if (c1082b == null || c1082b.f3139f != null) {
                z = false;
            } else {
                while (i < this.f3154h) {
                    File file = c1082b.f3136c[i];
                    if (!file.exists() || file.delete()) {
                        this.f3155i -= c1082b.f3135b[i];
                        c1082b.f3135b[i] = 0;
                        i++;
                    } else {
                        throw new IOException("failed to delete " + file);
                    }
                }
                this.f3158l++;
                this.f3156j.append("REMOVE");
                this.f3156j.append(' ');
                this.f3156j.append(str);
                this.f3156j.append('\n');
                this.f3157k.remove(str);
                if (m2864d()) {
                    this.f3147a.submit(this.f3160n);
                }
                z = true;
            }
        }
        return z;
    }

    public final synchronized void close() {
        if (this.f3156j != null) {
            Iterator it = new ArrayList(this.f3157k.values()).iterator();
            while (it.hasNext()) {
                C1082b c1082b = (C1082b) it.next();
                if (c1082b.f3139f != null) {
                    c1082b.f3139f.m2845c();
                }
            }
            m2868f();
            this.f3156j.close();
            this.f3156j = null;
        }
    }
}
