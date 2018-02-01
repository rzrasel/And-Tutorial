package com.orange.studio.banglatype;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

final class C1709b {
    static int m7361a(Context context) {
        String[] stringArray = context.getResources().getStringArray(R.array.activity_000_classes);
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

    static String m7362a(Context context, String str) {
        int[] iArr = new int[]{R.array.activity_000_classes};
        for (int i = 0; i <= 0; i++) {
            for (String str2 : context.getResources().getStringArray(iArr[i])) {
                if (str2.equalsIgnoreCase(str)) {
                    return context.getPackageName() + "." + str2;
                }
            }
        }
        return "";
    }

    static boolean m7363a(AppCompatActivity appCompatActivity, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                return C1735p.m7522a(appCompatActivity);
            case R.id.about:
                return C1735p.m7525b(appCompatActivity);
            default:
                return false;
        }
    }
}
