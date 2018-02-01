package android.support.v4.p006a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v4.content.p015a.C0436a.C0433b;
import android.support.v4.content.p015a.C0436a.C0434c;
import android.support.v4.p016d.C0452b.C0451b;
import android.support.v4.p018f.C0477m;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

final class C0383e extends C0381g {
    private static final Class f1385a;
    private static final Constructor f1386b;
    private static final Method f1387c;
    private static final Method f1388d;

    static {
        Method method;
        Constructor constructor;
        Class cls;
        Object e;
        Method method2 = null;
        try {
            Class cls2 = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls2.getConstructor(new Class[0]);
            Method method3 = cls2.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls2, 1).getClass()});
            method2 = method3;
            constructor = constructor2;
            cls = cls2;
        } catch (ClassNotFoundException e2) {
            e = e2;
            e.getClass().getName();
            method = null;
            constructor = null;
            cls = null;
            f1386b = constructor;
            f1385a = cls;
            f1387c = method2;
            f1388d = method;
        } catch (NoSuchMethodException e3) {
            e = e3;
            e.getClass().getName();
            method = null;
            constructor = null;
            cls = null;
            f1386b = constructor;
            f1385a = cls;
            f1387c = method2;
            f1388d = method;
        }
        f1386b = constructor;
        f1385a = cls;
        f1387c = method2;
        f1388d = method;
    }

    C0383e() {
    }

    private static Typeface m1111a(Object obj) {
        Throwable e;
        try {
            Array.set(Array.newInstance(f1385a, 1), 0, obj);
            return (Typeface) f1388d.invoke(null, new Object[]{r0});
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    public static boolean m1112a() {
        if (f1387c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f1387c != null;
    }

    private static boolean m1113a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        Throwable e;
        try {
            return ((Boolean) f1387c.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    private static Object m1114b() {
        Throwable e;
        try {
            return f1386b.newInstance(new Object[0]);
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

    public final Typeface mo286a(Context context, C0433b c0433b, Resources resources, int i) {
        Object b = C0383e.m1114b();
        for (C0434c c0434c : c0433b.f1411a) {
            if (!C0383e.m1113a(b, C0388h.m1134a(context, resources, c0434c.f1415d), 0, c0434c.f1413b, c0434c.f1414c)) {
                return null;
            }
        }
        return C0383e.m1111a(b);
    }

    public final Typeface mo287a(Context context, C0451b[] c0451bArr, int i) {
        Object b = C0383e.m1114b();
        C0477m c0477m = new C0477m();
        for (C0451b c0451b : c0451bArr) {
            Uri uri = c0451b.f1445a;
            ByteBuffer byteBuffer = (ByteBuffer) c0477m.get(uri);
            if (byteBuffer == null) {
                byteBuffer = C0388h.m1135a(context, uri);
                c0477m.put(uri, byteBuffer);
            }
            if (!C0383e.m1113a(b, byteBuffer, c0451b.f1446b, c0451b.f1447c, c0451b.f1448d)) {
                return null;
            }
        }
        return C0383e.m1111a(b);
    }
}
