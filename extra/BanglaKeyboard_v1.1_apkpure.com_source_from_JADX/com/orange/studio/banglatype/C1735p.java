package com.orange.studio.banglatype;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class C1735p {
    private static boolean f8362a;
    private static boolean f8363b;

    static Class<?> m7514a(Activity activity) {
        String parentActivityName = NavUtils.getParentActivityName(activity);
        while (parentActivityName != null) {
            try {
                Class<?> cls = Class.forName(parentActivityName);
                if (!ax.class.isAssignableFrom(cls)) {
                    return cls;
                }
                cls = C1735p.m7515a(C1735p.m7524a((Context) activity, parentActivityName));
                if (cls != null && !cls.equals(activity.getClass())) {
                    return cls;
                }
                try {
                    parentActivityName = NavUtils.getParentActivityName(activity, new ComponentName(activity.getPackageName(), parentActivityName));
                } catch (NameNotFoundException e) {
                    return null;
                }
            } catch (ClassNotFoundException e2) {
                return null;
            }
        }
        return null;
    }

    private static Class<?> m7515a(String[] strArr) {
        for (String str : strArr) {
            try {
                Class<?> cls = Class.forName("com.orange.studio.banglatype." + str);
                if (!ax.class.isAssignableFrom(cls) && Activity.class.isAssignableFrom(cls)) {
                    return cls;
                }
            } catch (ClassNotFoundException e) {
            }
        }
        return null;
    }

    static String m7516a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionName;
        } catch (NameNotFoundException e) {
            return "";
        }
    }

    public static String m7517a(Context context, int i, int i2) {
        return context.getResources().getStringArray(i)[i2];
    }

    public static void m7518a(Activity activity, Intent intent) {
        C1723f.m7472e();
        C1723f.m7464a(activity, new C1719c(activity, intent));
    }

    public static void m7519a(Activity activity, String str) {
        try {
            Class cls = Class.forName(activity.getPackageName() + "." + str);
            if (Activity.class.isAssignableFrom(cls)) {
                Intent intent = new Intent(activity, cls);
                intent.addFlags(67108864);
                C1723f.m7472e();
                C1723f.m7464a(activity, new C1719c(activity, intent));
                return;
            }
            Object newInstance = cls.newInstance();
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().equals("runIntent")) {
                    try {
                        method.invoke(newInstance, new Object[]{activity});
                    } catch (InvocationTargetException e) {
                    }
                }
            }
        } catch (ClassNotFoundException e2) {
        } catch (InstantiationException e3) {
        } catch (IllegalAccessException e4) {
        }
    }

    static void m7520a(MenuInflater menuInflater, Menu menu, boolean z) {
        if (z) {
            menuInflater.inflate(R.menu.andromo_preferences_options_menu, menu);
        }
        menuInflater.inflate(R.menu.default_options_menu, menu);
    }

    private static boolean m7521a() {
        if (!f8363b) {
            try {
                Class.forName("com.orange.studio.banglatype.Dashboard_000");
                f8362a = true;
            } catch (ClassNotFoundException e) {
            }
            f8363b = true;
        }
        return f8362a;
    }

    public static boolean m7522a(AppCompatActivity appCompatActivity) {
        Intent parentActivityIntent = NavUtils.getParentActivityIntent(appCompatActivity);
        if (parentActivityIntent == null) {
            return false;
        }
        if (C1735p.m7523a(parentActivityIntent.getComponent().getClassName())) {
            Class a = C1735p.m7514a((Activity) appCompatActivity);
            if (a == null) {
                return false;
            }
            parentActivityIntent = new Intent("android.intent.action.MAIN").setClassName(appCompatActivity, a.getName());
        }
        parentActivityIntent.putExtra("HomeAsUp", true);
        appCompatActivity.supportFinishAfterTransition();
        if (NavUtils.shouldUpRecreateTask(appCompatActivity, parentActivityIntent)) {
            TaskStackBuilder.create(appCompatActivity).addNextIntentWithParentStack(parentActivityIntent).startActivities();
        } else {
            if (!"com.orange.studio.banglatype.Dashboard_000".equals(parentActivityIntent.getComponent().getClassName()) || C1735p.m7521a()) {
                parentActivityIntent.addFlags(603979776);
                C1735p.m7518a((Activity) appCompatActivity, parentActivityIntent);
            }
        }
        return true;
    }

    private static boolean m7523a(String str) {
        try {
            return ax.class.isAssignableFrom(Class.forName(str));
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    private static String[] m7524a(Context context, String str) {
        if (str != null) {
            try {
                Class cls = Class.forName(str);
                if (ab.class.isAssignableFrom(cls)) {
                    return ((ab) cls.newInstance()).getClassNamesArray(context);
                }
            } catch (InstantiationException e) {
            } catch (IllegalAccessException e2) {
            } catch (ClassNotFoundException e3) {
            }
        }
        return null;
    }

    static boolean m7525b(AppCompatActivity appCompatActivity) {
        Intent intent = new Intent(appCompatActivity, AndromoAboutActivity.class);
        intent.addFlags(67108864);
        appCompatActivity.startActivity(intent);
        return true;
    }
}
