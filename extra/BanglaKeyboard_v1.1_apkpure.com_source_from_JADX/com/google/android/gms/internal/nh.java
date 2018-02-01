package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

public final class nh {
    static final String[] f6703d = new String[]{"/aclk", "/pcs/click"};
    String f6704a = "googleads.g.doubleclick.net";
    String f6705b = "/pagead/ads";
    String[] f6706c = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    public nc f6707e;
    private String f6708f = "ad.doubleclick.net";

    public nh(nc ncVar) {
        this.f6707e = ncVar;
    }

    private final boolean m6059c(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.f6708f);
        } catch (NullPointerException e) {
            return false;
        }
    }

    public final Uri m6060a(Uri uri, Context context, View view) {
        try {
            return m6061a(uri, context, uri.getQueryParameter("ai"), true, view);
        } catch (UnsupportedOperationException e) {
            throw new ni("Provided Uri is not in a valid state");
        }
    }

    final Uri m6061a(Uri uri, Context context, String str, boolean z, View view) {
        try {
            boolean c = m6059c(uri);
            if (c) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new ni("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new ni("Query parameter already exists: ms");
            }
            String zza = z ? this.f6707e.zza(context, str, view) : this.f6707e.zza(context);
            String uri2;
            String encodedPath;
            if (c) {
                String str2 = "dc_ms";
                uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    return Uri.parse(new StringBuilder(uri2.substring(0, indexOf + 1)).append(str2).append("=").append(zza).append(";").append(uri2.substring(indexOf + 1)).toString());
                }
                encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                return Uri.parse(new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2)).append(";").append(str2).append("=").append(zza).append(";").append(uri2.substring(encodedPath.length() + indexOf2)).toString());
            }
            uri2 = "ms";
            encodedPath = uri.toString();
            int indexOf3 = encodedPath.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = encodedPath.indexOf("?adurl");
            }
            return indexOf3 != -1 ? Uri.parse(new StringBuilder(encodedPath.substring(0, indexOf3 + 1)).append(uri2).append("=").append(zza).append("&").append(encodedPath.substring(indexOf3 + 1)).toString()) : uri.buildUpon().appendQueryParameter(uri2, zza).build();
        } catch (UnsupportedOperationException e) {
            throw new ni("Provided Uri is not in a valid state");
        }
    }

    public final void m6062a(MotionEvent motionEvent) {
        this.f6707e.zza(motionEvent);
    }

    public final boolean m6063a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.f6704a) && uri.getPath().equals(this.f6705b);
        } catch (NullPointerException e) {
            return false;
        }
    }

    public final boolean m6064b(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String endsWith : this.f6706c) {
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
