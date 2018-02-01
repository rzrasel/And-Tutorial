package com.rac.stuido.banglakeyboard;

import android.app.Activity;
import android.view.ViewGroup;

public final class C0588y {
    private static cc f2844a = new cc();
    private static aj f2845b = new aj();
    private static cd f2846c = new cd();
    private static ak f2847d = new ak();

    static void m4056a() {
        cd cdVar = f2846c;
        cd.m4008b();
        ak akVar = f2847d;
        ak.m3909a();
        cc ccVar = f2844a;
        cc.m4000e();
        aj ajVar = f2845b;
        aj.m3905c();
    }

    static void m4057a(Activity activity) {
        aj ajVar = f2845b;
        aj.m3902a(activity);
        cc ccVar = f2844a;
        cc.m3995a(activity);
        cd cdVar = f2846c;
        cd.m4010d();
        ak akVar = f2847d;
        ak.m3911c();
    }

    public static boolean m4058a(Activity activity, ViewGroup viewGroup) {
        cc ccVar = f2844a;
        cc.m3996b();
        C0586w c0586w = C0586w.NONE;
        cc ccVar2 = f2844a;
        cc.m3996b();
        ay e = C0588y.m4066e();
        return e != null ? e.mo1361a(activity, viewGroup, c0586w) : false;
    }

    public static boolean m4059a(Activity activity, ViewGroup viewGroup, C0586w c0586w) {
        cc ccVar = f2844a;
        cc.m3996b();
        ay e = C0588y.m4066e();
        return e != null ? e.mo1361a(activity, viewGroup, c0586w) : false;
    }

    static void m4060b() {
        cd cdVar = f2846c;
        cd.m4009c();
        ak akVar = f2847d;
        ak.m3910b();
    }

    static void m4061b(Activity activity) {
        "onActivityResumed: " + activity;
        aj ajVar = f2845b;
        aj.m3904b(activity);
        cc ccVar = f2844a;
        cc.m3997b(activity);
        cd cdVar = f2846c;
        cd.m4011e();
        ak akVar = f2847d;
        ak.m3912d();
    }

    static void m4062c() {
        aj ajVar = f2845b;
        aj.m3903b();
        cc ccVar = f2844a;
        cc.m3999d();
    }

    static void m4063c(Activity activity) {
        aj ajVar = f2845b;
        aj.m3906c(activity);
        cc ccVar = f2844a;
        cc.m3998c(activity);
        cd cdVar = f2846c;
        cd.m4012f();
        ak akVar = f2847d;
        ak.m3913e();
    }

    public static void m4064d() {
        cd cdVar = f2846c;
        bg a = cd.m4007a();
        if (a != null) {
            a.mo1358b();
        }
    }

    static void m4065d(Activity activity) {
        "onBackPressed: " + activity;
        cd cdVar = f2846c;
        cd.m4013g();
        ak akVar = f2847d;
        ak.m3914f();
    }

    private static ay m4066e() {
        ay c = f2844a.m4006c();
        ah ahVar = ai.f2576a;
        return c;
    }

    public static boolean m4067e(Activity activity) {
        cd cdVar = f2846c;
        bg a = cd.m4007a();
        return a != null ? a.m3862b(activity) : false;
    }
}
