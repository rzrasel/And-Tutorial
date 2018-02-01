package com.google.android.gms.internal;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbv;
import java.util.HashMap;
import java.util.Map;

final class aic implements ail {
    aic() {
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        WindowManager windowManager = (WindowManager) jfVar.getContext().getSystemService("window");
        zzbv.zzea();
        View view = (View) jfVar;
        DisplayMetrics a = gb.m5432a(windowManager);
        int i = a.widthPixels;
        int i2 = a.heightPixels;
        int[] iArr = new int[2];
        Map hashMap = new HashMap();
        view.getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        jfVar.mo2145a("locationReady", hashMap);
        id.m5370a("GET LOCATION COMPILED");
    }
}
