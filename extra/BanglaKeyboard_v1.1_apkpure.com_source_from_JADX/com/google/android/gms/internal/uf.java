package com.google.android.gms.internal;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class uf {
    private static final Logger f7165a = Logger.getLogger(uf.class.getName());
    private static final Unsafe f7166b = m6728d();
    private static final Class<?> f7167c = m6715a("libcore.io.Memory");
    private static final boolean f7168d = (m6715a("org.robolectric.Robolectric") != null);
    private static final boolean f7169e = m6727c(Long.TYPE);
    private static final boolean f7170f = m6727c(Integer.TYPE);
    private static final C1650d f7171g;
    private static final boolean f7172h = m6731g();
    private static final boolean f7173i = m6729e();
    private static final boolean f7174j = m6730f();
    private static final long f7175k = ((long) m6714a(byte[].class));
    private static final long f7176l = ((long) m6714a(boolean[].class));
    private static final long f7177m = ((long) m6722b(boolean[].class));
    private static final long f7178n = ((long) m6714a(int[].class));
    private static final long f7179o = ((long) m6722b(int[].class));
    private static final long f7180p = ((long) m6714a(long[].class));
    private static final long f7181q = ((long) m6722b(long[].class));
    private static final long f7182r = ((long) m6714a(float[].class));
    private static final long f7183s = ((long) m6722b(float[].class));
    private static final long f7184t = ((long) m6714a(double[].class));
    private static final long f7185u = ((long) m6722b(double[].class));
    private static final long f7186v = ((long) m6714a(Object[].class));
    private static final long f7187w = ((long) m6722b(Object[].class));
    private static final long f7188x;
    private static final boolean f7189y;

    static abstract class C1650d {
        Unsafe f7164a;

        C1650d(Unsafe unsafe) {
            this.f7164a = unsafe;
        }

        public abstract byte mo2291a(Object obj, long j);

        public abstract void mo2292a(Object obj, long j, byte b);
    }

    static final class C1651a extends C1650d {
        C1651a(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte mo2291a(Object obj, long j) {
            return uf.f7189y ? ((byte) (uf.m6725c(obj, -4 & j) >>> ((int) (((-1 ^ j) & 3) << 3)))) : ((byte) (uf.m6725c(obj, -4 & j) >>> ((int) ((3 & j) << 3))));
        }

        public final void mo2292a(Object obj, long j, byte b) {
            if (uf.f7189y) {
                uf.m6717a(obj, j, b);
            } else {
                uf.m6723b(obj, j, b);
            }
        }
    }

    static final class C1652b extends C1650d {
        C1652b(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte mo2291a(Object obj, long j) {
            return uf.f7189y ? ((byte) (uf.m6725c(obj, -4 & j) >>> ((int) (((-1 ^ j) & 3) << 3)))) : ((byte) (uf.m6725c(obj, -4 & j) >>> ((int) ((3 & j) << 3))));
        }

        public final void mo2292a(Object obj, long j, byte b) {
            if (uf.f7189y) {
                uf.m6717a(obj, j, b);
            } else {
                uf.m6723b(obj, j, b);
            }
        }
    }

    static final class C1653c extends C1650d {
        C1653c(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte mo2291a(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        public final void mo2292a(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static {
        /*
        r3 = 0;
        r1 = 1;
        r2 = 0;
        r0 = com.google.android.gms.internal.uf.class;
        r0 = r0.getName();
        r0 = java.util.logging.Logger.getLogger(r0);
        f7165a = r0;
        r0 = m6728d();
        f7166b = r0;
        r0 = "libcore.io.Memory";
        r0 = m6715a(r0);
        f7167c = r0;
        r0 = "org.robolectric.Robolectric";
        r0 = m6715a(r0);
        if (r0 == 0) goto L_0x00eb;
    L_0x0025:
        r0 = r1;
    L_0x0026:
        f7168d = r0;
        r0 = java.lang.Long.TYPE;
        r0 = m6727c(r0);
        f7169e = r0;
        r0 = java.lang.Integer.TYPE;
        r0 = m6727c(r0);
        f7170f = r0;
        r0 = f7166b;
        if (r0 != 0) goto L_0x00ee;
    L_0x003c:
        r0 = r3;
    L_0x003d:
        f7171g = r0;
        r0 = m6731g();
        f7172h = r0;
        r0 = m6729e();
        f7173i = r0;
        r0 = m6730f();
        f7174j = r0;
        r0 = byte[].class;
        r0 = m6714a(r0);
        r4 = (long) r0;
        f7175k = r4;
        r0 = boolean[].class;
        r0 = m6714a(r0);
        r4 = (long) r0;
        f7176l = r4;
        r0 = boolean[].class;
        r0 = m6722b(r0);
        r4 = (long) r0;
        f7177m = r4;
        r0 = int[].class;
        r0 = m6714a(r0);
        r4 = (long) r0;
        f7178n = r4;
        r0 = int[].class;
        r0 = m6722b(r0);
        r4 = (long) r0;
        f7179o = r4;
        r0 = long[].class;
        r0 = m6714a(r0);
        r4 = (long) r0;
        f7180p = r4;
        r0 = long[].class;
        r0 = m6722b(r0);
        r4 = (long) r0;
        f7181q = r4;
        r0 = float[].class;
        r0 = m6714a(r0);
        r4 = (long) r0;
        f7182r = r4;
        r0 = float[].class;
        r0 = m6722b(r0);
        r4 = (long) r0;
        f7183s = r4;
        r0 = double[].class;
        r0 = m6714a(r0);
        r4 = (long) r0;
        f7184t = r4;
        r0 = double[].class;
        r0 = m6722b(r0);
        r4 = (long) r0;
        f7185u = r4;
        r0 = java.lang.Object[].class;
        r0 = m6714a(r0);
        r4 = (long) r0;
        f7186v = r4;
        r0 = java.lang.Object[].class;
        r0 = m6722b(r0);
        r4 = (long) r0;
        f7187w = r4;
        r0 = m6732h();
        if (r0 == 0) goto L_0x011a;
    L_0x00cc:
        r0 = java.nio.Buffer.class;
        r3 = "effectiveDirectAddress";
        r0 = m6716a(r0, r3);
        if (r0 == 0) goto L_0x011a;
    L_0x00d6:
        if (r0 == 0) goto L_0x00dc;
    L_0x00d8:
        r3 = f7171g;
        if (r3 != 0) goto L_0x0123;
    L_0x00dc:
        r4 = -1;
    L_0x00de:
        f7188x = r4;
        r0 = java.nio.ByteOrder.nativeOrder();
        r3 = java.nio.ByteOrder.BIG_ENDIAN;
        if (r0 != r3) goto L_0x012c;
    L_0x00e8:
        f7189y = r1;
        return;
    L_0x00eb:
        r0 = r2;
        goto L_0x0026;
    L_0x00ee:
        r0 = m6732h();
        if (r0 == 0) goto L_0x0111;
    L_0x00f4:
        r0 = f7169e;
        if (r0 == 0) goto L_0x0101;
    L_0x00f8:
        r0 = new com.google.android.gms.internal.uf$b;
        r3 = f7166b;
        r0.<init>(r3);
        goto L_0x003d;
    L_0x0101:
        r0 = f7170f;
        if (r0 == 0) goto L_0x010e;
    L_0x0105:
        r0 = new com.google.android.gms.internal.uf$a;
        r3 = f7166b;
        r0.<init>(r3);
        goto L_0x003d;
    L_0x010e:
        r0 = r3;
        goto L_0x003d;
    L_0x0111:
        r0 = new com.google.android.gms.internal.uf$c;
        r3 = f7166b;
        r0.<init>(r3);
        goto L_0x003d;
    L_0x011a:
        r0 = java.nio.Buffer.class;
        r3 = "address";
        r0 = m6716a(r0, r3);
        goto L_0x00d6;
    L_0x0123:
        r3 = f7171g;
        r3 = r3.f7164a;
        r4 = r3.objectFieldOffset(r0);
        goto L_0x00de;
    L_0x012c:
        r1 = r2;
        goto L_0x00e8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.uf.<clinit>():void");
    }

    private uf() {
    }

    static byte m6713a(byte[] bArr, long j) {
        return f7171g.mo2291a(bArr, f7175k + j);
    }

    private static int m6714a(Class<?> cls) {
        return f7173i ? f7171g.f7164a.arrayBaseOffset(cls) : -1;
    }

    private static <T> Class<T> m6715a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            return null;
        }
    }

    private static Field m6716a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            return null;
        }
    }

    static /* synthetic */ void m6717a(Object obj, long j, byte b) {
        int i = ((((int) j) ^ -1) & 3) << 3;
        m6718a(obj, j & -4, (m6725c(obj, j & -4) & ((255 << i) ^ -1)) | ((b & 255) << i));
    }

    private static void m6718a(Object obj, long j, int i) {
        f7171g.f7164a.putInt(obj, j, i);
    }

    static void m6719a(byte[] bArr, long j, byte b) {
        f7171g.mo2292a(bArr, f7175k + j, b);
    }

    static boolean m6720a() {
        return f7173i;
    }

    private static int m6722b(Class<?> cls) {
        return f7173i ? f7171g.f7164a.arrayIndexScale(cls) : -1;
    }

    static /* synthetic */ void m6723b(Object obj, long j, byte b) {
        int i = (((int) j) & 3) << 3;
        m6718a(obj, j & -4, (m6725c(obj, j & -4) & ((255 << i) ^ -1)) | ((b & 255) << i));
    }

    static boolean m6724b() {
        return f7172h;
    }

    private static int m6725c(Object obj, long j) {
        return f7171g.f7164a.getInt(obj, j);
    }

    private static boolean m6727c(Class<?> cls) {
        if (!m6732h()) {
            return false;
        }
        try {
            Class cls2 = f7167c;
            cls2.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls2.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    private static Unsafe m6728d() {
        try {
            return (Unsafe) AccessController.doPrivileged(new ug());
        } catch (Throwable th) {
            return null;
        }
    }

    private static boolean m6729e() {
        if (f7166b == null) {
            return false;
        }
        try {
            Class cls = f7166b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (m6732h()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            f7165a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", new StringBuilder(String.valueOf(valueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    private static boolean m6730f() {
        if (f7166b == null) {
            return false;
        }
        try {
            f7166b.getClass().getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            f7165a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeCopyMemory", "copyMemory is missing from platform - proto runtime falling back to safer methods.");
            return false;
        }
    }

    private static boolean m6731g() {
        if (f7166b == null) {
            return false;
        }
        try {
            Class cls = f7166b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (m6732h()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            f7165a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", new StringBuilder(String.valueOf(valueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    private static boolean m6732h() {
        return (f7167c == null || f7168d) ? false : true;
    }
}
