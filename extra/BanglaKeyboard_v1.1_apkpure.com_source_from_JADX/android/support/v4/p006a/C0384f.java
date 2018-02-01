package android.support.v4.p006a;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface.Builder;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import android.support.v4.content.p015a.C0436a.C0433b;
import android.support.v4.content.p015a.C0436a.C0434c;
import android.support.v4.p016d.C0452b;
import android.support.v4.p016d.C0452b.C0451b;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

public final class C0384f extends C0382d {
    private static final Class f1389a;
    private static final Constructor f1390b;
    private static final Method f1391c;
    private static final Method f1392d;
    private static final Method f1393e;
    private static final Method f1394f;
    private static final Method f1395g;

    static {
        Method method;
        Method method2;
        Method method3;
        Method declaredMethod;
        Constructor constructor;
        Class cls;
        Object e;
        Method method4 = null;
        try {
            Class cls2 = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls2.getConstructor(new Class[0]);
            Method method5 = cls2.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
            method = cls2.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
            method2 = cls2.getMethod("freeze", new Class[0]);
            method3 = cls2.getMethod("abortCreation", new Class[0]);
            declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls2, 1).getClass(), Integer.TYPE, Integer.TYPE});
            declaredMethod.setAccessible(true);
            method4 = method3;
            method3 = method2;
            method2 = method;
            method = method5;
            constructor = constructor2;
            cls = cls2;
        } catch (ClassNotFoundException e2) {
            e = e2;
            new StringBuilder("Unable to collect necessary methods for class ").append(e.getClass().getName());
            declaredMethod = null;
            method3 = null;
            method2 = null;
            method = null;
            constructor = null;
            cls = null;
            f1390b = constructor;
            f1389a = cls;
            f1391c = method;
            f1392d = method2;
            f1393e = method3;
            f1394f = method4;
            f1395g = declaredMethod;
        } catch (NoSuchMethodException e3) {
            e = e3;
            new StringBuilder("Unable to collect necessary methods for class ").append(e.getClass().getName());
            declaredMethod = null;
            method3 = null;
            method2 = null;
            method = null;
            constructor = null;
            cls = null;
            f1390b = constructor;
            f1389a = cls;
            f1391c = method;
            f1392d = method2;
            f1393e = method3;
            f1394f = method4;
            f1395g = declaredMethod;
        }
        f1390b = constructor;
        f1389a = cls;
        f1391c = method;
        f1392d = method2;
        f1393e = method3;
        f1394f = method4;
        f1395g = declaredMethod;
    }

    private static Typeface m1117a(Object obj) {
        Throwable e;
        try {
            Array.set(Array.newInstance(f1389a, 1), 0, obj);
            return (Typeface) f1395g.invoke(null, new Object[]{r0, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    private static boolean m1118a() {
        if (f1391c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f1391c != null;
    }

    private static boolean m1119a(Context context, Object obj, String str, int i, int i2) {
        Throwable e;
        try {
            return ((Boolean) f1391c.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(0), Integer.valueOf(i), Integer.valueOf(i2), null})).booleanValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    private static boolean m1120a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        Throwable e;
        try {
            return ((Boolean) f1392d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    private static Object m1121b() {
        Throwable e;
        try {
            return f1390b.newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e4) {
            e = e4;
            throw new RuntimeException(e);
        }
    }

    private static boolean m1122b(Object obj) {
        Throwable e;
        try {
            return ((Boolean) f1393e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    private static boolean m1123c(Object obj) {
        Throwable e;
        try {
            return ((Boolean) f1394f.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    public final Typeface mo285a(Context context, Resources resources, int i, String str, int i2) {
        if (!C0384f.m1118a()) {
            return super.mo285a(context, resources, i, str, i2);
        }
        Object b = C0384f.m1121b();
        if (C0384f.m1119a(context, b, str, -1, -1)) {
            return C0384f.m1122b(b) ? C0384f.m1117a(b) : null;
        } else {
            C0384f.m1123c(b);
            return null;
        }
    }

    public final Typeface mo286a(Context context, C0433b c0433b, Resources resources, int i) {
        if (!C0384f.m1118a()) {
            return super.mo286a(context, c0433b, resources, i);
        }
        Object b = C0384f.m1121b();
        C0434c[] c0434cArr = c0433b.f1411a;
        int length = c0434cArr.length;
        int i2 = 0;
        while (i2 < length) {
            C0434c c0434c = c0434cArr[i2];
            if (C0384f.m1119a(context, b, c0434c.f1412a, c0434c.f1413b, c0434c.f1414c ? 1 : 0)) {
                i2++;
            } else {
                C0384f.m1123c(b);
                return null;
            }
        }
        return !C0384f.m1122b(b) ? null : C0384f.m1117a(b);
    }

    public final Typeface mo287a(Context context, C0451b[] c0451bArr, int i) {
        Throwable th;
        Throwable th2;
        if (c0451bArr.length <= 0) {
            return null;
        }
        if (C0384f.m1118a()) {
            Map a = C0452b.m1184a(context, c0451bArr);
            Object b = C0384f.m1121b();
            Object obj = null;
            int length = c0451bArr.length;
            int i2 = 0;
            while (i2 < length) {
                Object obj2;
                C0451b c0451b = c0451bArr[i2];
                ByteBuffer byteBuffer = (ByteBuffer) a.get(c0451b.f1445a);
                if (byteBuffer != null) {
                    if (C0384f.m1120a(b, byteBuffer, c0451b.f1446b, c0451b.f1447c, c0451b.f1448d ? 1 : 0)) {
                        obj2 = 1;
                    } else {
                        C0384f.m1123c(b);
                        return null;
                    }
                }
                obj2 = obj;
                i2++;
                obj = obj2;
            }
            if (obj != null) {
                return !C0384f.m1122b(b) ? null : C0384f.m1117a(b);
            } else {
                C0384f.m1123c(b);
                return null;
            }
        }
        ParcelFileDescriptor openFileDescriptor;
        C0451b a2 = m1108a(c0451bArr, i);
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(a2.f1445a, "r", null);
            th = null;
            try {
                Typeface build = new Builder(openFileDescriptor.getFileDescriptor()).setWeight(a2.f1447c).setItalic(a2.f1448d).build();
                if (openFileDescriptor == null) {
                    return build;
                }
                openFileDescriptor.close();
                return build;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                th3 = th2;
                th2 = th4;
            }
        } catch (IOException e) {
            return null;
        }
        if (openFileDescriptor != null) {
            if (th3 != null) {
                try {
                    openFileDescriptor.close();
                } catch (Throwable th5) {
                    th3.addSuppressed(th5);
                }
            } else {
                openFileDescriptor.close();
            }
        }
        throw th2;
        throw th2;
    }
}
