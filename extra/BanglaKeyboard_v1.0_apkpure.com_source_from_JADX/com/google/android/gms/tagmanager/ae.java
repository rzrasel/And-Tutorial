package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

class ae {
    private static ae f2275a;
    private volatile af f2276b = af.NONE;
    private volatile String f2277c = null;
    private volatile String f2278d = null;
    private volatile String f2279e = null;

    ae() {
    }

    static ae m3620a() {
        ae aeVar;
        synchronized (ae.class) {
            if (f2275a == null) {
                f2275a = new ae();
            }
            aeVar = f2275a;
        }
        return aeVar;
    }

    private static String m3621a(String str) {
        return str.split("&")[0].split("=")[1];
    }

    final synchronized boolean m3622a(Uri uri) {
        boolean z = true;
        synchronized (this) {
            try {
                String decode = URLDecoder.decode(uri.toString(), "UTF-8");
                if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                    "Container preview url: " + decode;
                    C0535t.m3734d();
                    if (decode.matches(".*?&gtm_debug=x$")) {
                        this.f2276b = af.CONTAINER_DEBUG;
                    } else {
                        this.f2276b = af.CONTAINER;
                    }
                    this.f2279e = uri.getQuery().replace("&gtm_debug=x", "");
                    if (this.f2276b == af.CONTAINER || this.f2276b == af.CONTAINER_DEBUG) {
                        this.f2278d = "/r?" + this.f2279e;
                    }
                    this.f2277c = m3621a(this.f2279e);
                } else {
                    if (!decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                        C0535t.m3731a("Invalid preview uri: " + decode);
                        z = false;
                    } else if (m3621a(uri.getQuery()).equals(this.f2277c)) {
                        "Exit preview mode for container: " + this.f2277c;
                        C0535t.m3734d();
                        this.f2276b = af.NONE;
                        this.f2278d = null;
                    } else {
                        z = false;
                    }
                }
            } catch (UnsupportedEncodingException e) {
                z = false;
            }
        }
        return z;
    }

    final af m3623b() {
        return this.f2276b;
    }

    final String m3624c() {
        return this.f2278d;
    }

    final String m3625d() {
        return this.f2277c;
    }
}
