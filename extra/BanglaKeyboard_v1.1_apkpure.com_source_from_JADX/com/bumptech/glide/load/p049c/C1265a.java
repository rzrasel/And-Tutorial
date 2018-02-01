package com.bumptech.glide.load.p049c;

import android.net.Uri;

final class C1265a {
    private static final int f3645a = 22;

    public static boolean m3358a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    public static String m3359b(Uri uri) {
        return uri.toString().substring(f3645a);
    }
}
