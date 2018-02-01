package com.rac.stuido.banglakeyboard;

import android.app.Activity;
import android.content.Intent;

public final class C0583s {
    public static void m4048a(Activity activity) {
        if (activity != null) {
            if (activity != null) {
                Intent intent = activity.getIntent();
                if (!(intent == null || intent.hasCategory("android.intent.category.LAUNCHER"))) {
                    String action = intent.getAction();
                    if (action != null) {
                        action.equals("android.intent.action.MAIN");
                    }
                }
            }
            C0588y.m4060b();
        }
    }
}
