package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C1493g;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {
    public static final C1544d f4669a = new C1546b();
    public static final C1544d f4670b = new C1548d();
    public static final C1544d f4671c = new C1549e();
    public static final C1544d f4672d = new C1550f();
    public static final C1544d f4673e = new C1551g();
    private static Boolean f4674g;
    private static C1554k f4675h;
    private static C1556m f4676i;
    private static String f4677j;
    private static final ThreadLocal<C1540a> f4678k = new ThreadLocal();
    private static final C1541i f4679l = new C1545a();
    private static C1544d f4680m = new C1547c();
    public final Context f4681f;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    static class C1540a {
        public Cursor f4666a;

        private C1540a() {
        }
    }

    static class C1542b implements C1541i {
        private final int f4667a;
        private final int f4668b = 0;

        public C1542b(int i) {
            this.f4667a = i;
        }

        public final int mo1672a(Context context, String str) {
            return this.f4667a;
        }

        public final int mo1673a(Context context, String str, boolean z) {
            return 0;
        }
    }

    public static class C1543c extends Exception {
        private C1543c(String str) {
            super(str);
        }

        private C1543c(String str, Throwable th) {
            super(str, th);
        }
    }

    public interface C1544d {
        C1553j mo1674a(Context context, String str, C1541i c1541i);
    }

    private DynamiteModule(Context context) {
        this.f4681f = (Context) C1516t.m3860a((Object) context);
    }

    public static int m3955a(Context context, String str) {
        String str2;
        int i = 0;
        String valueOf;
        try {
            str2 = "com.google.android.gms.dynamite.descriptors.";
            String str3 = "ModuleDescriptor";
            Class loadClass = context.getApplicationContext().getClassLoader().loadClass(new StringBuilder(((String.valueOf(str2).length() + 1) + String.valueOf(str).length()) + String.valueOf(str3).length()).append(str2).append(str).append(".").append(str3).toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                i = declaredField2.getInt(null);
            } else {
                valueOf = String.valueOf(declaredField.get(null));
                new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(str).length()).append("Module descriptor id '").append(valueOf).append("' didn't match expected id '").append(str).append("'");
            }
        } catch (ClassNotFoundException e) {
            Log.w("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 45).append("Local module descriptor class for ").append(str).append(" not found.").toString());
        } catch (Exception e2) {
            str2 = "Failed to load module descriptor class: ";
            valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        return i;
    }

    public static int m3956a(Context context, String str, boolean z) {
        Object e;
        synchronized (DynamiteModule.class) {
            Boolean bool = f4674g;
            if (bool == null) {
                try {
                    Class loadClass = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                    Field declaredField = loadClass.getDeclaredField("sClassLoader");
                    synchronized (loadClass) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    m3961a(classLoader);
                                } catch (C1543c e2) {
                                }
                                bool = Boolean.TRUE;
                            }
                        } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        } else {
                            try {
                                int c = m3965c(context, str, z);
                                if (f4677j == null || f4677j.isEmpty()) {
                                    return c;
                                }
                                ClassLoader c1552h = new C1552h(f4677j, ClassLoader.getSystemClassLoader());
                                m3961a(c1552h);
                                declaredField.set(null, c1552h);
                                f4674g = Boolean.TRUE;
                                return c;
                            } catch (C1543c e3) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                                f4674g = bool;
                                if (!bool.booleanValue()) {
                                    try {
                                    } catch (C1543c e4) {
                                        String str2 = "DynamiteModule";
                                        String str3 = "Failed to retrieve remote module version: ";
                                        String valueOf = String.valueOf(e4.getMessage());
                                        Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                } catch (ClassNotFoundException e5) {
                    e = e5;
                } catch (IllegalAccessException e6) {
                    e = e6;
                } catch (NoSuchFieldException e7) {
                    e = e7;
                }
            }
        }
        valueOf = String.valueOf(e);
        Log.w("DynamiteModule", new StringBuilder(String.valueOf(valueOf).length() + 30).append("Failed to load module via V2: ").append(valueOf).toString());
        bool = Boolean.FALSE;
        f4674g = bool;
        return !bool.booleanValue() ? m3963b(context, str, z) : m3965c(context, str, z);
    }

    private static Context m3957a(Context context, String str, int i, Cursor cursor, C1556m c1556m) {
        try {
            return (Context) C1401c.m3585a(c1556m.mo1677a(C1401c.m3584a((Object) context), str, i, C1401c.m3584a((Object) cursor)));
        } catch (Exception e) {
            String str2 = "Failed to load DynamiteLoader: ";
            String valueOf = String.valueOf(e.toString());
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            return null;
        }
    }

    public static DynamiteModule m3958a(Context context, C1544d c1544d, String str) {
        C1540a c1540a = (C1540a) f4678k.get();
        C1540a c1540a2 = new C1540a();
        f4678k.set(c1540a2);
        C1553j a;
        DynamiteModule c;
        try {
            a = c1544d.mo1674a(context, str, f4679l);
            new StringBuilder((String.valueOf(str).length() + 68) + String.valueOf(str).length()).append("Considering local module ").append(str).append(":").append(a.f4682a).append(" and remote module ").append(str).append(":").append(a.f4683b);
            if (a.f4684c == 0 || ((a.f4684c == -1 && a.f4682a == 0) || (a.f4684c == 1 && a.f4683b == 0))) {
                throw new C1543c("No acceptable module found. Local version is " + a.f4682a + " and remote version is " + a.f4683b + ".");
            } else if (a.f4684c == -1) {
                c = m3966c(context, str);
                if (c1540a2.f4666a != null) {
                    c1540a2.f4666a.close();
                }
                f4678k.set(c1540a);
                return c;
            } else if (a.f4684c == 1) {
                c = m3959a(context, str, a.f4683b);
                if (c1540a2.f4666a != null) {
                    c1540a2.f4666a.close();
                }
                f4678k.set(c1540a);
                return c;
            } else {
                throw new C1543c("VersionPolicy returned invalid code:" + a.f4684c);
            }
        } catch (Throwable e) {
            String str2 = "DynamiteModule";
            String str3 = "Failed to load remote module: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            if (a.f4682a == 0 || c1544d.mo1674a(context, str, new C1542b(a.f4682a)).f4684c != -1) {
                throw new C1543c("Remote load failed. No local fallback found.", e);
            }
            c = m3966c(context, str);
            if (c1540a2.f4666a != null) {
                c1540a2.f4666a.close();
            }
            f4678k.set(c1540a);
            return c;
        } catch (Throwable th) {
            if (c1540a2.f4666a != null) {
                c1540a2.f4666a.close();
            }
            f4678k.set(c1540a);
        }
    }

    private static DynamiteModule m3959a(Context context, String str, int i) {
        synchronized (DynamiteModule.class) {
            Boolean bool = f4674g;
        }
        if (bool != null) {
            return bool.booleanValue() ? m3967c(context, str, i) : m3964b(context, str, i);
        } else {
            throw new C1543c("Failed to determine which loading route to use.");
        }
    }

    private static C1554k m3960a(Context context) {
        String valueOf;
        synchronized (DynamiteModule.class) {
            if (f4675h != null) {
                C1554k c1554k = f4675h;
                return c1554k;
            }
            C1493g.m3805a();
            if (C1493g.m3804a(context) != 0) {
                return null;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c1554k = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof C1554k) {
                        c1554k = (C1554k) queryLocalInterface;
                    } else {
                        Object c1555l = new C1555l(iBinder);
                    }
                }
                if (c1554k != null) {
                    f4675h = c1554k;
                    return c1554k;
                }
            } catch (Exception e) {
                r2 = "Failed to load IDynamiteLoader from GmsCore: ";
                valueOf = String.valueOf(e.getMessage());
                String str;
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                return null;
            }
        }
    }

    private static void m3961a(ClassLoader classLoader) {
        Throwable e;
        try {
            C1556m c1556m;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                c1556m = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C1556m) {
                    c1556m = (C1556m) queryLocalInterface;
                } else {
                    Object c1557n = new C1557n(iBinder);
                }
            }
            f4676i = c1556m;
        } catch (ClassNotFoundException e2) {
            e = e2;
            throw new C1543c("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e3) {
            e = e3;
            throw new C1543c("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e4) {
            e = e4;
            throw new C1543c("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new C1543c("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e6) {
            e = e6;
            throw new C1543c("Failed to instantiate dynamite loader", e);
        }
    }

    public static int m3962b(Context context, String str) {
        return m3956a(context, str, false);
    }

    private static int m3963b(Context context, String str, boolean z) {
        C1554k a = m3960a(context);
        if (a == null) {
            return 0;
        }
        try {
            return a.mo1675a(C1401c.m3584a((Object) context), str, z);
        } catch (RemoteException e) {
            String str2 = "DynamiteModule";
            String str3 = "Failed to retrieve remote module version: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return 0;
        }
    }

    private static DynamiteModule m3964b(Context context, String str, int i) {
        new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i);
        C1554k a = m3960a(context);
        if (a == null) {
            throw new C1543c("Failed to create IDynamiteLoader.");
        }
        try {
            C1398a a2 = a.mo1676a(C1401c.m3584a((Object) context), str, i);
            if (C1401c.m3585a(a2) != null) {
                return new DynamiteModule((Context) C1401c.m3585a(a2));
            }
            throw new C1543c("Failed to load remote module.");
        } catch (Throwable e) {
            throw new C1543c("Failed to load remote module.", e);
        }
    }

    private static int m3965c(Context context, String str, boolean z) {
        String str2;
        Throwable e;
        Cursor cursor;
        if (z) {
            try {
                str2 = "api_force_staging";
            } catch (Exception e2) {
                e = e2;
                cursor = null;
                try {
                    if (e instanceof C1543c) {
                        throw e;
                    }
                    throw new C1543c("V2 version check failed", e);
                } catch (Throwable th) {
                    e = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                cursor = null;
                if (cursor != null) {
                    cursor.close();
                }
                throw e;
            }
        }
        str2 = "api";
        String str3 = "content://com.google.android.gms.chimera/";
        cursor = context.getContentResolver().query(Uri.parse(new StringBuilder(((String.valueOf(str3).length() + 1) + String.valueOf(str2).length()) + String.valueOf(str).length()).append(str3).append(str2).append("/").append(str).toString()), null, null, null, null);
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    int i = cursor.getInt(0);
                    if (i > 0) {
                        synchronized (DynamiteModule.class) {
                            f4677j = cursor.getString(2);
                        }
                        C1540a c1540a = (C1540a) f4678k.get();
                        if (c1540a != null && c1540a.f4666a == null) {
                            c1540a.f4666a = cursor;
                            cursor = null;
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return i;
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
        throw new C1543c("Failed to connect to dynamite module ContentResolver.");
    }

    private static DynamiteModule m3966c(Context context, String str) {
        String str2 = "Selected local version of ";
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        return new DynamiteModule(context.getApplicationContext());
    }

    private static DynamiteModule m3967c(Context context, String str, int i) {
        new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i);
        synchronized (DynamiteModule.class) {
            C1556m c1556m = f4676i;
        }
        if (c1556m == null) {
            throw new C1543c("DynamiteLoaderV2 was not cached.");
        }
        C1540a c1540a = (C1540a) f4678k.get();
        if (c1540a == null || c1540a.f4666a == null) {
            throw new C1543c("No result cursor");
        }
        Context a = m3957a(context.getApplicationContext(), str, i, c1540a.f4666a, c1556m);
        if (a != null) {
            return new DynamiteModule(a);
        }
        throw new C1543c("Failed to get module context");
    }

    public final IBinder m3968a(String str) {
        Throwable e;
        String str2;
        String valueOf;
        try {
            return (IBinder) this.f4681f.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException e2) {
            e = e2;
            str2 = "Failed to instantiate module class: ";
            valueOf = String.valueOf(str);
            throw new C1543c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        } catch (InstantiationException e3) {
            e = e3;
            str2 = "Failed to instantiate module class: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
            }
            throw new C1543c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        } catch (IllegalAccessException e4) {
            e = e4;
            str2 = "Failed to instantiate module class: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
            }
            throw new C1543c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        }
    }
}
