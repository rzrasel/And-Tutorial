package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.C1483a;
import com.google.android.gms.common.C1489b;
import com.google.android.gms.common.C1493g;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class np {
    private static final String f6724m = np.class.getSimpleName();
    private static Object f6725q = new Object();
    private static C1493g f6726r = null;
    protected Context f6727a;
    Context f6728b;
    ExecutorService f6729c;
    DexClassLoader f6730d;
    nj f6731e;
    byte[] f6732f;
    volatile kz f6733g = null;
    Future f6734h = null;
    na f6735i;
    protected boolean f6736j = false;
    boolean f6737k = false;
    boolean f6738l = false;
    private volatile AdvertisingIdClient f6739n = null;
    private volatile boolean f6740o = false;
    private Future f6741p = null;
    private Map<Pair<String, String>, rp> f6742s;

    private np(Context context) {
        this.f6727a = context;
        this.f6728b = context.getApplicationContext();
        this.f6742s = new HashMap();
    }

    public static np m6075a(Context context, String str, String str2, boolean z) {
        File file;
        boolean z2 = true;
        np npVar = new np(context);
        try {
            npVar.f6729c = Executors.newCachedThreadPool();
            npVar.f6740o = z;
            if (z) {
                npVar.f6741p = npVar.f6729c.submit(new nq(npVar));
            }
            npVar.f6729c.execute(new ns(npVar));
            try {
                f6726r = C1493g.m3805a();
                npVar.f6736j = C1493g.m3806b(npVar.f6727a) > 0;
                if (C1493g.m3804a(npVar.f6727a) != 0) {
                    z2 = false;
                }
                npVar.f6737k = z2;
            } catch (Throwable th) {
            }
            npVar.m6085a(0, true);
            if (pd.m6376b()) {
                if (((Boolean) zzbv.zzen().m4217a(ado.by)).booleanValue()) {
                    throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
                }
            }
            npVar.f6731e = new nj();
            npVar.f6732f = nj.m6067a(str);
            File cacheDir = npVar.f6727a.getCacheDir();
            if (cacheDir == null) {
                cacheDir = npVar.f6727a.getDir("dex", 0);
                if (cacheDir == null) {
                    throw new nl();
                }
            }
            File file2 = cacheDir;
            String str3 = "1493867303508";
            file = new File(String.format("%s/%s.jar", new Object[]{file2, str3}));
            if (!file.exists()) {
                byte[] a = nj.m6068a(npVar.f6732f, str2);
                file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(a, 0, a.length);
                fileOutputStream.close();
            }
            npVar.m6081b(file2, str3);
            npVar.f6730d = new DexClassLoader(file.getAbsolutePath(), file2.getAbsolutePath(), null, npVar.f6727a.getClassLoader());
            m6077a(file);
            npVar.m6078a(file2, str3);
            m6079a(String.format("%s/%s.dex", new Object[]{file2, str3}));
            npVar.f6735i = new na(npVar);
            npVar.f6738l = true;
        } catch (Throwable e) {
            throw new nl(e);
        } catch (Throwable e2) {
            throw new nl(e2);
        } catch (Throwable e22) {
            throw new nl(e22);
        } catch (Throwable e222) {
            throw new nl(e222);
        } catch (Throwable e2222) {
            throw new nl(e2222);
        } catch (nl e3) {
        } catch (Throwable th2) {
            m6077a(file);
            npVar.m6078a(file2, str3);
            m6079a(String.format("%s/%s.dex", new Object[]{file2, str3}));
        }
        return npVar;
    }

    static /* synthetic */ void m6076a(np npVar) {
        try {
            if (npVar.f6739n == null && npVar.f6728b != null) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(npVar.f6728b);
                advertisingIdClient.start();
                npVar.f6739n = advertisingIdClient;
            }
        } catch (C1483a e) {
            npVar.f6739n = null;
        } catch (IOException e2) {
            npVar.f6739n = null;
        } catch (C1489b e3) {
            npVar.f6739n = null;
        }
    }

    private static void m6077a(File file) {
        if (file.exists()) {
            file.delete();
            return;
        }
        String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()});
    }

    private final void m6078a(File file, String str) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream2;
        Throwable th;
        FileOutputStream fileOutputStream2 = null;
        File file2 = new File(String.format("%s/%s.tmp", new Object[]{file, str}));
        if (!file2.exists()) {
            File file3 = new File(String.format("%s/%s.dex", new Object[]{file, str}));
            if (file3.exists()) {
                long length = file3.length();
                if (length > 0) {
                    byte[] bArr = new byte[((int) length)];
                    try {
                        fileInputStream = new FileInputStream(file3);
                        try {
                            if (fileInputStream.read(bArr) <= 0) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e) {
                                }
                                m6077a(file3);
                                return;
                            }
                            vb lfVar = new lf();
                            lfVar.f6565d = VERSION.SDK.getBytes();
                            lfVar.f6564c = str.getBytes();
                            bArr = nj.m6065a(this.f6732f, bArr).getBytes();
                            lfVar.f6562a = bArr;
                            lfVar.f6563b = lr.m5992a(bArr);
                            file2.createNewFile();
                            fileOutputStream = new FileOutputStream(file2);
                            try {
                                byte[] a = vb.m5895a(lfVar);
                                fileOutputStream.write(a, 0, a.length);
                                fileOutputStream.close();
                                try {
                                    fileInputStream.close();
                                } catch (IOException e2) {
                                }
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e3) {
                                }
                                m6077a(file3);
                            } catch (IOException e4) {
                                fileInputStream2 = fileInputStream;
                                if (fileInputStream2 != null) {
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException e5) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e6) {
                                    }
                                }
                                m6077a(file3);
                            } catch (NoSuchAlgorithmException e7) {
                                fileInputStream2 = fileInputStream;
                                if (fileInputStream2 != null) {
                                    fileInputStream2.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                m6077a(file3);
                            } catch (nk e8) {
                                fileInputStream2 = fileInputStream;
                                if (fileInputStream2 != null) {
                                    fileInputStream2.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                m6077a(file3);
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                fileOutputStream2 = fileOutputStream;
                                th = th3;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e9) {
                                    }
                                }
                                if (fileOutputStream2 != null) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException e10) {
                                    }
                                }
                                m6077a(file3);
                                throw th;
                            }
                        } catch (IOException e11) {
                            fileOutputStream = null;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            m6077a(file3);
                        } catch (NoSuchAlgorithmException e12) {
                            fileOutputStream = null;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            m6077a(file3);
                        } catch (nk e13) {
                            fileOutputStream = null;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            m6077a(file3);
                        } catch (Throwable th4) {
                            th = th4;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            m6077a(file3);
                            throw th;
                        }
                    } catch (IOException e14) {
                        fileOutputStream = null;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        m6077a(file3);
                    } catch (NoSuchAlgorithmException e15) {
                        fileOutputStream = null;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        m6077a(file3);
                    } catch (nk e16) {
                        fileOutputStream = null;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        m6077a(file3);
                    } catch (Throwable th5) {
                        th = th5;
                        fileInputStream = null;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        m6077a(file3);
                        throw th;
                    }
                }
            }
        }
    }

    private static void m6079a(String str) {
        m6077a(new File(str));
    }

    static /* synthetic */ boolean m6080a(int i, kz kzVar) {
        if (i < 4) {
            if (kzVar == null) {
                return true;
            }
            if (((Boolean) zzbv.zzen().m4217a(ado.bB)).booleanValue() && (kzVar.f6467n == null || kzVar.f6467n.equals("0000000000000000000000000000000000000000000000000000000000000000"))) {
                return true;
            }
            if (((Boolean) zzbv.zzen().m4217a(ado.bC)).booleanValue() && (kzVar.f6446Q == null || kzVar.f6446Q.f6566a == null || kzVar.f6446Q.f6566a.longValue() == -2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean m6081b(File file, String str) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream2;
        Throwable th;
        FileOutputStream fileOutputStream2 = null;
        File file2 = new File(String.format("%s/%s.tmp", new Object[]{file, str}));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", new Object[]{file, str}));
        if (file3.exists()) {
            return false;
        }
        try {
            long length = file2.length();
            if (length <= 0) {
                m6077a(file2);
                return false;
            }
            byte[] bArr = new byte[((int) length)];
            fileInputStream = new FileInputStream(file2);
            try {
                if (fileInputStream.read(bArr) <= 0) {
                    m6077a(file2);
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                    }
                    return false;
                }
                lf lfVar = (lf) vb.m5894a(new lf(), bArr, bArr.length);
                if (str.equals(new String(lfVar.f6564c)) && Arrays.equals(lfVar.f6563b, lr.m5992a(lfVar.f6562a)) && Arrays.equals(lfVar.f6565d, VERSION.SDK.getBytes())) {
                    byte[] a = nj.m6068a(this.f6732f, new String(lfVar.f6562a));
                    file3.createNewFile();
                    fileOutputStream = new FileOutputStream(file3);
                    try {
                        fileOutputStream.write(a, 0, a.length);
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                        }
                        return true;
                    } catch (IOException e4) {
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e6) {
                            }
                        }
                        return false;
                    } catch (NoSuchAlgorithmException e7) {
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return false;
                    } catch (nk e8) {
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        fileOutputStream2 = fileOutputStream;
                        th = th2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e9) {
                            }
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e10) {
                            }
                        }
                        throw th;
                    }
                }
                m6077a(file2);
                try {
                    fileInputStream.close();
                } catch (IOException e11) {
                }
                return false;
            } catch (IOException e12) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (NoSuchAlgorithmException e13) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (nk e14) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                throw th;
            }
        } catch (IOException e15) {
            fileOutputStream = null;
            fileInputStream2 = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        } catch (NoSuchAlgorithmException e16) {
            fileOutputStream = null;
            fileInputStream2 = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        } catch (nk e17) {
            fileOutputStream = null;
            fileInputStream2 = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    private final kz m6082e() {
        kz kzVar = null;
        try {
            kzVar = new lw(this.f6727a, this.f6727a.getPackageName(), Integer.toString(this.f6727a.getPackageManager().getPackageInfo(this.f6727a.getPackageName(), 0).versionCode)).m6006d();
        } catch (Throwable th) {
        }
        return kzVar;
    }

    public final Context m6083a() {
        return this.f6727a;
    }

    public final Method m6084a(String str, String str2) {
        rp rpVar = (rp) this.f6742s.get(new Pair(str, str2));
        return rpVar == null ? null : rpVar.m6506a();
    }

    final void m6085a(int i, boolean z) {
        if (this.f6737k) {
            Future submit = this.f6729c.submit(new nr(this, i, z));
            if (i == 0) {
                this.f6734h = submit;
            }
        }
    }

    public final boolean m6086a(String str, String str2, Class<?>... clsArr) {
        if (this.f6742s.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.f6742s.put(new Pair(str, str2), new rp(this, str, str2, clsArr));
        return true;
    }

    final kz m6087b(int i, boolean z) {
        if (i > 0 && z) {
            try {
                Thread.sleep((long) (i * 1000));
            } catch (InterruptedException e) {
            }
        }
        return m6082e();
    }

    public final boolean m6088b() {
        return this.f6736j;
    }

    public final AdvertisingIdClient m6089c() {
        if (!this.f6740o) {
            return null;
        }
        if (this.f6739n != null) {
            return this.f6739n;
        }
        if (this.f6741p != null) {
            try {
                this.f6741p.get(2000, TimeUnit.MILLISECONDS);
                this.f6741p = null;
            } catch (InterruptedException e) {
            } catch (ExecutionException e2) {
            } catch (TimeoutException e3) {
                this.f6741p.cancel(true);
            }
        }
        return this.f6739n;
    }

    public final int m6090d() {
        return this.f6735i != null ? na.m6031a() : Integer.MIN_VALUE;
    }
}
