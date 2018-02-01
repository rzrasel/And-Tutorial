package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.p018f.C0478a;
import android.support.v4.view.C0679r;
import android.support.v7.p021a.C0780a.C0779j;
import android.support.v7.view.C0938d;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;

final class C0838l {
    private static final Class<?>[] f2530a = new Class[]{Context.class, AttributeSet.class};
    private static final int[] f2531b = new int[]{16843375};
    private static final String[] f2532c = new String[]{"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> f2533d = new C0478a();
    private final Object[] f2534e = new Object[2];

    private static class C0837a implements OnClickListener {
        private final View f2526a;
        private final String f2527b;
        private Method f2528c;
        private Context f2529d;

        public C0837a(View view, String str) {
            this.f2526a = view;
            this.f2527b = str;
        }

        public final void onClick(View view) {
            if (this.f2528c == null) {
                for (Context context = this.f2526a.getContext(); context != null; context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null) {
                    try {
                        if (!context.isRestricted()) {
                            Method method = context.getClass().getMethod(this.f2527b, new Class[]{View.class});
                            if (method != null) {
                                this.f2528c = method;
                                this.f2529d = context;
                            }
                        }
                    } catch (NoSuchMethodException e) {
                    }
                }
                int id = this.f2526a.getId();
                throw new IllegalStateException("Could not find method " + this.f2527b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f2526a.getClass() + (id == -1 ? "" : " with id '" + this.f2526a.getContext().getResources().getResourceEntryName(id) + "'"));
            }
            try {
                this.f2528c.invoke(this.f2529d, new Object[]{view});
            } catch (Throwable e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (Throwable e22) {
                throw new IllegalStateException("Could not execute method for android:onClick", e22);
            }
        }
    }

    C0838l() {
    }

    static Context m2420a(Context context, AttributeSet attributeSet, boolean z) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0779j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0779j.View_android_theme, 0) : 0;
        int resourceId2 = resourceId == 0 ? obtainStyledAttributes.getResourceId(C0779j.View_theme, 0) : resourceId;
        obtainStyledAttributes.recycle();
        return resourceId2 != 0 ? ((context instanceof C0938d) && ((C0938d) context).f2879a == resourceId2) ? context : new C0938d(context, resourceId2) : context;
    }

    private View m2421a(Context context, String str, String str2) {
        Constructor constructor = (Constructor) f2533d.get(str);
        if (constructor == null) {
            try {
                constructor = context.getClassLoader().loadClass(str2 != null ? str2 + str : str).asSubclass(View.class).getConstructor(f2530a);
                f2533d.put(str, constructor);
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2534e);
    }

    static void m2422a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (VERSION.SDK_INT < 15 || C0679r.m1902C(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2531b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0837a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    final View m2423a(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f2534e[0] = context;
            this.f2534e[1] = attributeSet;
            View a;
            if (-1 == str.indexOf(46)) {
                for (String a2 : f2532c) {
                    a = m2421a(context, str, a2);
                    if (a != null) {
                        return a;
                    }
                }
                this.f2534e[0] = null;
                this.f2534e[1] = null;
                return null;
            }
            a = m2421a(context, str, null);
            this.f2534e[0] = null;
            this.f2534e[1] = null;
            return a;
        } catch (Exception e) {
            return null;
        } finally {
            this.f2534e[0] = null;
            this.f2534e[1] = null;
        }
    }
}
