package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class dh extends dj {
    private String f1191a;
    private Context f1192b;
    private String f1193c;
    private ArrayList f1194d;

    public dh(String str, ArrayList arrayList, Context context, String str2) {
        this.f1193c = str;
        this.f1194d = arrayList;
        this.f1191a = str2;
        this.f1192b = context;
    }

    private String m1860a(String str, HashMap hashMap) {
        Object obj;
        Object obj2 = "";
        try {
            obj = this.f1192b.getPackageManager().getPackageInfo(this.f1192b.getPackageName(), 0).versionName;
        } catch (Throwable e) {
            gb.m2070a("Error to retrieve app version", e);
            obj = obj2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - fd.m1974c().f1391d;
        for (String str2 : hashMap.keySet()) {
            str = str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{str2}), String.format("$1%s$2", new Object[]{hashMap.get(str2)}));
        }
        return str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"sessionid"}), String.format("$1%s$2", new Object[]{fd.f1380a})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"appid"}), String.format("$1%s$2", new Object[]{r2})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"osversion"}), String.format("$1%s$2", new Object[]{String.valueOf(VERSION.SDK_INT)})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"sdkversion"}), String.format("$1%s$2", new Object[]{this.f1191a})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"appversion"}), String.format("$1%s$2", new Object[]{obj})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"timestamp"}), String.format("$1%s$2", new Object[]{String.valueOf(elapsedRealtime)})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"[^@]+"}), String.format("$1%s$2", new Object[]{""})).replaceAll("@@", "@");
    }

    private void m1861b() {
        try {
            this.f1192b.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter").getDeclaredMethod("reportWithProductId", new Class[]{Context.class, String.class, String.class, Boolean.TYPE}).invoke(null, new Object[]{this.f1192b, this.f1193c, "", Boolean.valueOf(true)});
        } catch (ClassNotFoundException e) {
            gb.m2069a("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (NoSuchMethodException e2) {
            gb.m2069a("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (Throwable e3) {
            gb.m2070a("Fail to report a conversion.", e3);
        }
    }

    public final String mo870a() {
        return this.f1193c;
    }

    public final void mo871a(int i) {
        if (i == 1) {
            m1861b();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("status", String.valueOf(i));
        hashMap.put("sku", this.f1193c);
        Iterator it = this.f1194d.iterator();
        while (it.hasNext()) {
            fl.m1985a(new fy(this.f1192b, this.f1191a, m1860a((String) it.next(), hashMap)).f1199e);
        }
    }

    public final void mo872b(int i) {
        int i2 = 1;
        if (i == 0) {
            m1861b();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("google_play_status", String.valueOf(i));
        hashMap.put("sku", this.f1193c);
        String str = "status";
        if (i != 0) {
            i2 = i == 1 ? 2 : i == 4 ? 3 : 0;
        }
        hashMap.put(str, String.valueOf(i2));
        Iterator it = this.f1194d.iterator();
        while (it.hasNext()) {
            fl.m1985a(new fy(this.f1192b, this.f1191a, m1860a((String) it.next(), hashMap)).f1199e);
        }
    }
}
