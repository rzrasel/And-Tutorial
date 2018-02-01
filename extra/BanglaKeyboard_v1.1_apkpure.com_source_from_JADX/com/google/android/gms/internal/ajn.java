package com.google.android.gms.internal;

import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

final class ajn implements Runnable {
    private /* synthetic */ String f5202a;
    private /* synthetic */ String f5203b;
    private /* synthetic */ String f5204c;
    private /* synthetic */ String f5205d;
    private /* synthetic */ ajk f5206e;

    ajn(ajk com_google_android_gms_internal_ajk, String str, String str2, String str3, String str4) {
        this.f5206e = com_google_android_gms_internal_ajk;
        this.f5202a = str;
        this.f5203b = str2;
        this.f5204c = str3;
        this.f5205d = str4;
    }

    public final void run() {
        Map hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheCanceled");
        hashMap.put("src", this.f5202a);
        if (!TextUtils.isEmpty(this.f5203b)) {
            hashMap.put("cachedSrc", this.f5203b);
        }
        String str = "type";
        String str2 = this.f5204c;
        Object obj = "internal";
        Object obj2 = -1;
        switch (str2.hashCode()) {
            case -1396664534:
                if (str2.equals("badUrl")) {
                    obj2 = 6;
                    break;
                }
                break;
            case -1347010958:
                if (str2.equals("inProgress")) {
                    obj2 = 2;
                    break;
                }
                break;
            case -918817863:
                if (str2.equals("downloadTimeout")) {
                    obj2 = 7;
                    break;
                }
                break;
            case -659376217:
                if (str2.equals("contentLengthMissing")) {
                    obj2 = 3;
                    break;
                }
                break;
            case -642208130:
                if (str2.equals("playerFailed")) {
                    obj2 = 1;
                    break;
                }
                break;
            case -354048396:
                if (str2.equals("sizeExceeded")) {
                    obj2 = 8;
                    break;
                }
                break;
            case -32082395:
                if (str2.equals("externalAbort")) {
                    obj2 = 9;
                    break;
                }
                break;
            case 96784904:
                if (str2.equals("error")) {
                    obj2 = null;
                    break;
                }
                break;
            case 580119100:
                if (str2.equals("expireFailed")) {
                    obj2 = 5;
                    break;
                }
                break;
            case 725497484:
                if (str2.equals("noCacheDir")) {
                    obj2 = 4;
                    break;
                }
                break;
        }
        switch (obj2) {
            case null:
            case 1:
            case 2:
            case 3:
                obj = "internal";
                break;
            case 4:
            case 5:
                obj = "io";
                break;
            case 6:
            case 7:
                obj = "network";
                break;
            case 8:
            case 9:
                obj = "policy";
                break;
        }
        hashMap.put(str, obj);
        hashMap.put("reason", this.f5204c);
        if (!TextUtils.isEmpty(this.f5205d)) {
            hashMap.put("message", this.f5205d);
        }
        ajk.m4595a(this.f5206e, "onPrecacheEvent", hashMap);
    }
}
