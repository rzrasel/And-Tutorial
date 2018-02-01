package android.support.v7.p023c.p024a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.content.C0392a;
import android.support.v7.widget.AppCompatDrawableManager;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

public final class C0862b {
    private static final ThreadLocal<TypedValue> f2617a = new ThreadLocal();
    private static final WeakHashMap<Context, SparseArray<C0861a>> f2618b = new WeakHashMap(0);
    private static final Object f2619c = new Object();

    private static class C0861a {
        final ColorStateList f2615a;
        final Configuration f2616b;

        C0861a(ColorStateList colorStateList, Configuration configuration) {
            this.f2615a = colorStateList;
            this.f2616b = configuration;
        }
    }

    public static ColorStateList m2513a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = C0862b.m2516d(context, i);
        if (d != null) {
            return d;
        }
        ColorStateList c = C0862b.m2515c(context, i);
        if (c == null) {
            return C0392a.getColorStateList(context, i);
        }
        synchronized (f2619c) {
            SparseArray sparseArray = (SparseArray) f2618b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f2618b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0861a(c, context.getResources().getConfiguration()));
        }
        return c;
    }

    public static Drawable m2514b(Context context, int i) {
        return AppCompatDrawableManager.get().getDrawable(context, i);
    }

    private static ColorStateList m2515c(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue typedValue = (TypedValue) f2617a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f2617a.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        boolean z = typedValue.type >= 28 && typedValue.type <= 31;
        if (z) {
            return null;
        }
        Resources resources2 = context.getResources();
        try {
            return C0860a.m2511a(resources2, resources2.getXml(i), context.getTheme());
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m2516d(android.content.Context r5, int r6) {
        /*
        r2 = f2619c;
        monitor-enter(r2);
        r0 = f2618b;	 Catch:{ all -> 0x0035 }
        r0 = r0.get(r5);	 Catch:{ all -> 0x0035 }
        r0 = (android.util.SparseArray) r0;	 Catch:{ all -> 0x0035 }
        if (r0 == 0) goto L_0x0032;
    L_0x000d:
        r1 = r0.size();	 Catch:{ all -> 0x0035 }
        if (r1 <= 0) goto L_0x0032;
    L_0x0013:
        r1 = r0.get(r6);	 Catch:{ all -> 0x0035 }
        r1 = (android.support.v7.p023c.p024a.C0862b.C0861a) r1;	 Catch:{ all -> 0x0035 }
        if (r1 == 0) goto L_0x0032;
    L_0x001b:
        r3 = r1.f2616b;	 Catch:{ all -> 0x0035 }
        r4 = r5.getResources();	 Catch:{ all -> 0x0035 }
        r4 = r4.getConfiguration();	 Catch:{ all -> 0x0035 }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x0035 }
        if (r3 == 0) goto L_0x002f;
    L_0x002b:
        r0 = r1.f2615a;	 Catch:{ all -> 0x0035 }
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
    L_0x002e:
        return r0;
    L_0x002f:
        r0.remove(r6);	 Catch:{ all -> 0x0035 }
    L_0x0032:
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
        r0 = 0;
        goto L_0x002e;
    L_0x0035:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.c.a.b.d(android.content.Context, int):android.content.res.ColorStateList");
    }
}
