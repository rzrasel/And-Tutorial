package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public abstract class ma extends li {
    static boolean f1937d = false;
    private static Method f1938e;
    private static Method f1939f;
    private static Method f1940g;
    private static Method f1941h;
    private static Method f1942i;
    private static Method f1943j;
    private static String f1944k;
    private static long f1945l = 0;
    private static ni f1946m;

    protected ma(Context context, ng ngVar, nh nhVar) {
        super(context, ngVar, nhVar);
    }

    private static String m2599a() {
        if (f1944k != null) {
            return f1944k;
        }
        throw new mb();
    }

    private static String m2600a(Context context, ng ngVar) {
        if (f1940g == null) {
            throw new mb();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) f1940g.invoke(null, new Object[]{context});
            if (byteBuffer != null) {
                return ngVar.mo894a(byteBuffer.array());
            }
            throw new mb();
        } catch (Throwable e) {
            throw new mb(e);
        } catch (Throwable e2) {
            throw new mb(e2);
        }
    }

    private static String m2601a(byte[] bArr, String str) {
        try {
            return new String(f1946m.m2675a(bArr, str), "UTF-8");
        } catch (Throwable e) {
            throw new mb(e);
        } catch (Throwable e2) {
            throw new mb(e2);
        }
    }

    private static ArrayList m2602a(MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        if (f1941h == null || motionEvent == null) {
            throw new mb();
        }
        try {
            return (ArrayList) f1941h.invoke(null, new Object[]{motionEvent, displayMetrics});
        } catch (Throwable e) {
            throw new mb(e);
        } catch (Throwable e2) {
            throw new mb(e2);
        }
    }

    protected static synchronized void m2603a(String str, Context context, ng ngVar) {
        synchronized (ma.class) {
            if (!f1937d) {
                try {
                    f1946m = new ni(ngVar);
                    f1944k = str;
                    byte[] a = f1946m.m2674a("lbxVRZn959z8Mby5/xIR5GY5qeai5a6plNW9YXQVEvQ=");
                    byte[] a2 = f1946m.m2675a(a, "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");
                    File cacheDir = context.getCacheDir();
                    if (cacheDir == null) {
                        cacheDir = context.getDir("dex", 0);
                        if (cacheDir == null) {
                            throw new mb();
                        }
                    }
                    File createTempFile = File.createTempFile("ads", ".jar", cacheDir);
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    fileOutputStream.write(a2, 0, a2.length);
                    fileOutputStream.close();
                    DexClassLoader dexClassLoader = new DexClassLoader(createTempFile.getAbsolutePath(), cacheDir.getAbsolutePath(), null, context.getClassLoader());
                    Class loadClass = dexClassLoader.loadClass(m2601a(a, "iJkf7Oi+A1kM/Uo7c1/aRZ8QWS9UVlE/WL/MFqAJx1e1JiM4/Gaeo4sQTSPvKVmT"));
                    Class loadClass2 = dexClassLoader.loadClass(m2601a(a, "DOrHUrlPAyNSeU+NvnrdUjcvyLXFYbygCQievG8bnnQ6HGThBdBkI9mrKGQjm39O"));
                    Class loadClass3 = dexClassLoader.loadClass(m2601a(a, "VSSWx/l6VwxyGcOtodSBdwbU3HNiBwMWuimDu0c2EPWrn/zcOJzth/9+/Qy0j39d"));
                    Class loadClass4 = dexClassLoader.loadClass(m2601a(a, "Ti3TvLpZz2b8sl8dGeICn4bYAUnGHyad7ShT92+gKCKZsyMRYG3KmvUcB5cToip2"));
                    Class loadClass5 = dexClassLoader.loadClass(m2601a(a, "V3Tb3wwZBH/MkprkkeKqg6pDa5tFOcttcgEaQ29QFMh2oue8xFqholngd6DkHA46"));
                    Class loadClass6 = dexClassLoader.loadClass(m2601a(a, "j4P2NZaGK6yZNP+XTUyWiXWJgkAL02JK2VGVbrzucp2hianTo+ZgBPr3yFUnt+1x"));
                    f1938e = loadClass.getMethod(m2601a(a, "7Kebxr/m40lXaqZ3f0vkkYGrrvm187cU3AS/kEduZcU="), new Class[0]);
                    f1939f = loadClass2.getMethod(m2601a(a, "bmksOiX7ckGJ44MHrSqSV7mO7PRFCiyl+RZbwT1Bv0k="), new Class[0]);
                    f1940g = loadClass3.getMethod(m2601a(a, "PXKtpEOwUKSYQwobOd9LzM63iwGUroqnoqPL7HLAkwA="), new Class[]{Context.class});
                    f1941h = loadClass4.getMethod(m2601a(a, "JzpLluqkhgPQ/w1TkrMPy9chUBDDjch5PM8hF9zAwuU="), new Class[]{MotionEvent.class, DisplayMetrics.class});
                    f1942i = loadClass5.getMethod(m2601a(a, "a7sqqI6lRQtagq0yU9TL4NZ7huWSqCHa/L531Ub273o="), new Class[]{Context.class});
                    f1943j = loadClass6.getMethod(m2601a(a, "ESnf6G2jUk6mqOv2P5Rlce2hoauGd+ogk4106OMMF9g="), new Class[]{Context.class});
                    String name = createTempFile.getName();
                    createTempFile.delete();
                    new File(cacheDir, name.replace(".jar", ".dex")).delete();
                    f1945l = m2604b().longValue();
                    f1937d = true;
                } catch (Throwable e) {
                    throw new mb(e);
                } catch (Throwable e2) {
                    throw new mb(e2);
                } catch (Throwable e22) {
                    throw new mb(e22);
                } catch (Throwable e222) {
                    throw new mb(e222);
                } catch (Throwable e2222) {
                    throw new mb(e2222);
                } catch (Throwable e22222) {
                    throw new mb(e22222);
                } catch (mb e3) {
                } catch (UnsupportedOperationException e4) {
                }
            }
        }
    }

    private static Long m2604b() {
        if (f1938e == null) {
            throw new mb();
        }
        try {
            return (Long) f1938e.invoke(null, new Object[0]);
        } catch (Throwable e) {
            throw new mb(e);
        } catch (Throwable e2) {
            throw new mb(e2);
        }
    }

    private static String m2605b(Context context, ng ngVar) {
        if (f1943j == null) {
            throw new mb();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) f1943j.invoke(null, new Object[]{context});
            if (byteBuffer != null) {
                return ngVar.mo894a(byteBuffer.array());
            }
            throw new mb();
        } catch (Throwable e) {
            throw new mb(e);
        } catch (Throwable e2) {
            throw new mb(e2);
        }
    }

    private static String m2606c() {
        if (f1939f == null) {
            throw new mb();
        }
        try {
            return (String) f1939f.invoke(null, new Object[0]);
        } catch (Throwable e) {
            throw new mb(e);
        } catch (Throwable e2) {
            throw new mb(e2);
        }
    }

    private static String m2607d(Context context) {
        if (f1942i == null) {
            throw new mb();
        }
        try {
            String str = (String) f1942i.invoke(null, new Object[]{context});
            if (str != null) {
                return str;
            }
            throw new mb();
        } catch (Throwable e) {
            throw new mb(e);
        } catch (Throwable e2) {
            throw new mb(e2);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void mo960b(android.content.Context r4) {
        /*
        r3 = this;
        r0 = 1;
        r1 = m2606c();	 Catch:{ mb -> 0x002f, IOException -> 0x0027 }
        r3.m2544a(r0, r1);	 Catch:{ mb -> 0x002f, IOException -> 0x0027 }
    L_0x0008:
        r0 = 2;
        r1 = m2599a();	 Catch:{ mb -> 0x002d, IOException -> 0x0027 }
        r3.m2544a(r0, r1);	 Catch:{ mb -> 0x002d, IOException -> 0x0027 }
    L_0x0010:
        r0 = 25;
        r1 = m2604b();	 Catch:{ mb -> 0x002b, IOException -> 0x0027 }
        r1 = r1.longValue();	 Catch:{ mb -> 0x002b, IOException -> 0x0027 }
        r3.m2543a(r0, r1);	 Catch:{ mb -> 0x002b, IOException -> 0x0027 }
    L_0x001d:
        r0 = 24;
        r1 = m2607d(r4);	 Catch:{ mb -> 0x0029, IOException -> 0x0027 }
        r3.m2544a(r0, r1);	 Catch:{ mb -> 0x0029, IOException -> 0x0027 }
    L_0x0026:
        return;
    L_0x0027:
        r0 = move-exception;
        goto L_0x0026;
    L_0x0029:
        r0 = move-exception;
        goto L_0x0026;
    L_0x002b:
        r0 = move-exception;
        goto L_0x001d;
    L_0x002d:
        r0 = move-exception;
        goto L_0x0010;
    L_0x002f:
        r0 = move-exception;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ma.b(android.content.Context):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void mo961c(android.content.Context r7) {
        /*
        r6 = this;
        r0 = 2;
        r1 = m2599a();	 Catch:{ mb -> 0x0097, IOException -> 0x008a }
        r6.m2544a(r0, r1);	 Catch:{ mb -> 0x0097, IOException -> 0x008a }
    L_0x0008:
        r0 = 1;
        r1 = m2606c();	 Catch:{ mb -> 0x0094, IOException -> 0x008a }
        r6.m2544a(r0, r1);	 Catch:{ mb -> 0x0094, IOException -> 0x008a }
    L_0x0010:
        r0 = m2604b();	 Catch:{ mb -> 0x0092, IOException -> 0x008a }
        r0 = r0.longValue();	 Catch:{ mb -> 0x0092, IOException -> 0x008a }
        r2 = 25;
        r6.m2543a(r2, r0);	 Catch:{ mb -> 0x0092, IOException -> 0x008a }
        r2 = f1945l;	 Catch:{ mb -> 0x0092, IOException -> 0x008a }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x0034;
    L_0x0025:
        r2 = 17;
        r3 = f1945l;	 Catch:{ mb -> 0x0092, IOException -> 0x008a }
        r0 = r0 - r3;
        r6.m2543a(r2, r0);	 Catch:{ mb -> 0x0092, IOException -> 0x008a }
        r0 = 23;
        r1 = f1945l;	 Catch:{ mb -> 0x0092, IOException -> 0x008a }
        r6.m2543a(r0, r1);	 Catch:{ mb -> 0x0092, IOException -> 0x008a }
    L_0x0034:
        r0 = r6.a;	 Catch:{ mb -> 0x0090, IOException -> 0x008a }
        r1 = r6.b;	 Catch:{ mb -> 0x0090, IOException -> 0x008a }
        r1 = m2602a(r0, r1);	 Catch:{ mb -> 0x0090, IOException -> 0x008a }
        r2 = 14;
        r0 = 0;
        r0 = r1.get(r0);	 Catch:{ mb -> 0x0090, IOException -> 0x008a }
        r0 = (java.lang.Long) r0;	 Catch:{ mb -> 0x0090, IOException -> 0x008a }
        r3 = r0.longValue();	 Catch:{ mb -> 0x0090, IOException -> 0x008a }
        r6.m2543a(r2, r3);	 Catch:{ mb -> 0x0090, IOException -> 0x008a }
        r2 = 15;
        r0 = 1;
        r0 = r1.get(r0);	 Catch:{ mb -> 0x0090, IOException -> 0x008a }
        r0 = (java.lang.Long) r0;	 Catch:{ mb -> 0x0090, IOException -> 0x008a }
        r3 = r0.longValue();	 Catch:{ mb -> 0x0090, IOException -> 0x008a }
        r6.m2543a(r2, r3);	 Catch:{ mb -> 0x0090, IOException -> 0x008a }
        r0 = r1.size();	 Catch:{ mb -> 0x0090, IOException -> 0x008a }
        r2 = 3;
        if (r0 < r2) goto L_0x0073;
    L_0x0063:
        r2 = 16;
        r0 = 2;
        r0 = r1.get(r0);	 Catch:{ mb -> 0x0090, IOException -> 0x008a }
        r0 = (java.lang.Long) r0;	 Catch:{ mb -> 0x0090, IOException -> 0x008a }
        r0 = r0.longValue();	 Catch:{ mb -> 0x0090, IOException -> 0x008a }
        r6.m2543a(r2, r0);	 Catch:{ mb -> 0x0090, IOException -> 0x008a }
    L_0x0073:
        r0 = 27;
        r1 = r6.c;	 Catch:{ mb -> 0x008e, IOException -> 0x008a }
        r1 = m2600a(r7, r1);	 Catch:{ mb -> 0x008e, IOException -> 0x008a }
        r6.m2544a(r0, r1);	 Catch:{ mb -> 0x008e, IOException -> 0x008a }
    L_0x007e:
        r0 = 29;
        r1 = r6.c;	 Catch:{ mb -> 0x008c, IOException -> 0x008a }
        r1 = m2605b(r7, r1);	 Catch:{ mb -> 0x008c, IOException -> 0x008a }
        r6.m2544a(r0, r1);	 Catch:{ mb -> 0x008c, IOException -> 0x008a }
    L_0x0089:
        return;
    L_0x008a:
        r0 = move-exception;
        goto L_0x0089;
    L_0x008c:
        r0 = move-exception;
        goto L_0x0089;
    L_0x008e:
        r0 = move-exception;
        goto L_0x007e;
    L_0x0090:
        r0 = move-exception;
        goto L_0x0073;
    L_0x0092:
        r0 = move-exception;
        goto L_0x0034;
    L_0x0094:
        r0 = move-exception;
        goto L_0x0010;
    L_0x0097:
        r0 = move-exception;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ma.c(android.content.Context):void");
    }
}
