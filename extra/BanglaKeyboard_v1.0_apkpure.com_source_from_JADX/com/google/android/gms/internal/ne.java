package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;

public final class ne {
    la f1971a;
    private String f1972b = "googleads.g.doubleclick.net";
    private String f1973c = "/pagead/ads";
    private String[] f1974d = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private final jn f1975e = new jn();

    public ne(la laVar) {
        this.f1971a = laVar;
    }

    private Uri m2667a(Uri uri, Context context, String str) {
        try {
            if (uri.getQueryParameter("ms") != null) {
                throw new nf("Query parameter already exists: ms");
            }
            String a = this.f1971a.mo939a(context, str);
            String str2 = "ms";
            String uri2 = uri.toString();
            int indexOf = uri2.indexOf("&adurl");
            if (indexOf == -1) {
                indexOf = uri2.indexOf("?adurl");
            }
            return indexOf != -1 ? Uri.parse(new StringBuilder(uri2.substring(0, indexOf + 1)).append(str2).append("=").append(a).append("&").append(uri2.substring(indexOf + 1)).toString()) : uri.buildUpon().appendQueryParameter(str2, a).build();
        } catch (UnsupportedOperationException e) {
            throw new nf("Provided Uri is not in a valid state");
        }
    }

    public final Uri m2668a(Uri uri, Context context) {
        try {
            return m2667a(uri, context, uri.getQueryParameter("ai"));
        } catch (UnsupportedOperationException e) {
            throw new nf("Provided Uri is not in a valid state");
        }
    }

    public final boolean m2669a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String endsWith : this.f1974d) {
                if (host.endsWith(endsWith)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
