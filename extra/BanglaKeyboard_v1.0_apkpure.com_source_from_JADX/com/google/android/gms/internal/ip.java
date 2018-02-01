package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

public final class ip {
    private static final Uri f1835a;
    private static final Uri f1836b;

    static {
        Uri parse = Uri.parse("http://plus.google.com/");
        f1835a = parse;
        f1836b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent m2403a() {
        return new Intent("android.settings.DATE_SETTINGS");
    }

    public static Intent m2404a(String str) {
        Uri fromParts = Uri.fromParts("package", str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    public static Intent m2405b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details").buildUpon().appendQueryParameter("id", str).build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }
}
