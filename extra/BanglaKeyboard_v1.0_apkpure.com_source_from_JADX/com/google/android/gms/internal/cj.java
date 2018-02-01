package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

public final class cj {
    public static boolean m1787a(Context context, cb cbVar, cw cwVar) {
        if (cbVar == null) {
            gb.m2069a("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(cbVar.f1094c)) {
            gb.m2069a("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(cbVar.f1095d)) {
            intent.setData(Uri.parse(cbVar.f1094c));
        } else {
            intent.setDataAndType(Uri.parse(cbVar.f1094c), cbVar.f1095d);
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(cbVar.f1096e)) {
            intent.setPackage(cbVar.f1096e);
        }
        if (!TextUtils.isEmpty(cbVar.f1097f)) {
            String[] split = cbVar.f1097f.split("/", 2);
            if (split.length < 2) {
                gb.m2069a("Could not parse component name from open GMSG: " + cbVar.f1097f);
                return false;
            }
            intent.setClassName(split[0], split[1]);
        }
        try {
            "Launching an intent: " + intent;
            gb.m2071a(2);
            context.startActivity(intent);
            cwVar.mo997q();
            return true;
        } catch (ActivityNotFoundException e) {
            gb.m2069a(e.getMessage());
            return false;
        }
    }
}
