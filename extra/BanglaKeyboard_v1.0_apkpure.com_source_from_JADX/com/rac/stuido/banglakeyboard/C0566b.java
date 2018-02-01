package com.rac.stuido.banglakeyboard;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import com.actionbarsherlock.C0126R;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuItem;

final class C0566b {
    private static boolean f2672a;
    private static boolean f2673b;

    static int m3930a(Context context) {
        String[] stringArray = context.getResources().getStringArray(C0126R.array.activity_000_classes);
        String name = context.getClass().getName();
        String str = context.getPackageName() + ".";
        int length = stringArray.length;
        for (int i = 0; i < length; i++) {
            if (name.equals(str + stringArray[i])) {
                return i;
            }
        }
        return -1;
    }

    static Class m3931a(Activity activity) {
        String parentActivityName = NavUtils.getParentActivityName(activity);
        "trying parent: " + parentActivityName;
        String str = parentActivityName;
        while (str != null) {
            try {
                Class cls = Class.forName(str);
                if (bp.class.isAssignableFrom(cls)) {
                    cls = C0566b.m3932a(C0566b.m3940b((Context) activity, str));
                    "potential upClass: " + cls;
                    if (cls != null && !cls.equals(activity.getClass())) {
                        return cls;
                    }
                    try {
                        parentActivityName = NavUtils.getParentActivityName(activity, new ComponentName(activity.getPackageName(), str));
                        "trying parent: " + parentActivityName;
                        str = parentActivityName;
                    } catch (NameNotFoundException e) {
                        return null;
                    }
                }
                "using parent as upClass: " + cls;
                return cls;
            } catch (Throwable e2) {
                Log.w("ActionBarUtils", "ClassNotFoundException trying to get parent", e2);
                return null;
            }
        }
        return null;
    }

    private static Class m3932a(String[] strArr) {
        for (String str : strArr) {
            String str2;
            "checking: " + str2;
            try {
                str2 = "com.rac.stuido.banglakeyboard." + str2;
                "checking: " + str2;
                Class cls = Class.forName(str2);
                if (!bp.class.isAssignableFrom(cls) && Activity.class.isAssignableFrom(cls)) {
                    return cls;
                }
            } catch (Throwable e) {
                Log.w("ActionBarUtils", "ClassNotFoundException", e);
            }
        }
        return null;
    }

    static String m3933a(Context context, String str) {
        for (int stringArray : new int[]{C0126R.array.activity_000_classes}) {
            for (String str2 : context.getResources().getStringArray(stringArray)) {
                if (str2.equalsIgnoreCase(str)) {
                    return context.getPackageName() + "." + str2;
                }
            }
        }
        return "";
    }

    static void m3934a(ActionBar actionBar, int i) {
        if (actionBar != null && i >= 0) {
            actionBar.setSelectedNavigationItem(i);
        }
    }

    static void m3935a(ActionBar actionBar, boolean z, boolean z2) {
        if (actionBar != null) {
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayShowCustomEnabled(false);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(false);
            actionBar.setDisplayHomeAsUpEnabled(z2);
            actionBar.setDisplayShowTitleEnabled(z);
        }
    }

    private static boolean m3936a() {
        if (!f2673b) {
            try {
                Class.forName("com.rac.stuido.banglakeyboard.Dashboard_000");
                f2672a = true;
            } catch (ClassNotFoundException e) {
            }
            f2673b = true;
        }
        return f2672a;
    }

    static boolean m3937a(Activity activity, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                "home pressed on activity: " + activity;
                Intent parentActivityIntent = NavUtils.getParentActivityIntent(activity);
                if (parentActivityIntent == null) {
                    "No parent for " + activity + " -- NavUtils.getParentActivityIntent() returned null.";
                    return false;
                }
                if (C0566b.m3938a(parentActivityIntent.getComponent().getClassName())) {
                    Class a = C0566b.m3931a(activity);
                    "upClass: " + a;
                    if (a != null) {
                        "original upIntent: " + parentActivityIntent;
                        parentActivityIntent = new Intent("android.intent.action.MAIN").setClassName(activity, a.getName());
                    } else {
                        Log.w("ActionBarUtils", "No valid parent -- getUpClass() returned null.");
                        return false;
                    }
                }
                parentActivityIntent.putExtra("HomeAsUp", true);
                "upIntent: " + parentActivityIntent;
                if (NavUtils.shouldUpRecreateTask(activity, parentActivityIntent)) {
                    TaskStackBuilder.create(activity).addNextIntentWithParentStack(parentActivityIntent).startActivities();
                } else {
                    if (!"com.rac.stuido.banglakeyboard.Dashboard_000".equals(parentActivityIntent.getComponent().getClassName()) || C0566b.m3936a()) {
                        parentActivityIntent.addFlags(335544320);
                        activity.startActivity(parentActivityIntent);
                    }
                }
                return true;
            case C0126R.id.about:
                activity.showDialog(0);
                return true;
            default:
                return false;
        }
    }

    private static boolean m3938a(String str) {
        try {
            return bp.class.isAssignableFrom(Class.forName(str));
        } catch (Throwable e) {
            Log.w("ActionBarUtils", "ClassNotFoundException", e);
            return false;
        }
    }

    static void m3939b(ActionBar actionBar, int i) {
        if (i >= 0 && actionBar != null) {
            Context themedContext = actionBar.getThemedContext();
            SpinnerAdapter createFromResource = ArrayAdapter.createFromResource(themedContext, C0126R.array.activity_000_titles, C0126R.layout.sherlock_spinner_dropdown_item);
            createFromResource.setDropDownViewResource(C0126R.layout.sherlock_spinner_dropdown_item);
            actionBar.setNavigationMode(1);
            actionBar.setListNavigationCallbacks(createFromResource, new C0568c(themedContext, i, actionBar));
        }
    }

    private static String[] m3940b(Context context, String str) {
        if (str != null) {
            "getting category class names for: " + str;
            try {
                Class cls = Class.forName(str);
                if (ba.class.isAssignableFrom(cls)) {
                    return ((ba) cls.newInstance()).getClassNamesArray(context);
                }
            } catch (InstantiationException e) {
            } catch (IllegalAccessException e2) {
            } catch (ClassNotFoundException e3) {
            }
        }
        return null;
    }
}
