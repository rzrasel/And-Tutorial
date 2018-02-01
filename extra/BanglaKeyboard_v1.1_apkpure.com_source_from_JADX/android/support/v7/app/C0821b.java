package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

final class C0821b {
    private static final int[] f2504a = new int[]{16843531};

    static class C0820a {
        public Method f2501a;
        public Method f2502b;
        public ImageView f2503c;

        C0820a(Activity activity) {
            try {
                this.f2501a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.f2502b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException e) {
                View findViewById = activity.findViewById(16908332);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        findViewById = viewGroup.getChildAt(1);
                        if (childAt.getId() != 16908332) {
                            findViewById = childAt;
                        }
                        if (findViewById instanceof ImageView) {
                            this.f2503c = (ImageView) findViewById;
                        }
                    }
                }
            }
        }
    }

    public static Drawable m2386a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f2504a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public static C0820a m2387a(Activity activity, Drawable drawable, int i) {
        C0820a c0820a = new C0820a(activity);
        if (c0820a.f2501a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                c0820a.f2501a.invoke(actionBar, new Object[]{drawable});
                c0820a.f2502b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
            } catch (Throwable e) {
                Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator via JB-MR2 API", e);
            }
        } else if (c0820a.f2503c != null) {
            c0820a.f2503c.setImageDrawable(drawable);
        } else {
            Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator");
        }
        return c0820a;
    }

    public static C0820a m2388a(C0820a c0820a, Activity activity, int i) {
        if (c0820a == null) {
            c0820a = new C0820a(activity);
        }
        if (c0820a.f2501a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                c0820a.f2502b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
                if (VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Throwable e) {
                Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set content description via JB-MR2 API", e);
            }
        }
        return c0820a;
    }
}
