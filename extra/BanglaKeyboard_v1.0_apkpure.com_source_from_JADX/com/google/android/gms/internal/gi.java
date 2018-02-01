package com.google.android.gms.internal;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Map;

public class gi extends WebViewClient {
    protected final ge f1476a;
    private final HashMap f1477b = new HashMap();
    private final Object f1478c = new Object();
    private no f1479d;
    private cr f1480e;
    private gk f1481f;
    private ao f1482g;
    private boolean f1483h = false;
    private bb f1484i;
    private boolean f1485j;
    private cw f1486k;

    public gi(ge geVar, boolean z) {
        this.f1476a = geVar;
        this.f1485j = z;
    }

    private void m2116a(Uri uri) {
        String path = uri.getPath();
        ba baVar = (ba) this.f1477b.get(path);
        if (baVar != null) {
            Map a = fo.m1989a(uri);
            if (gb.m2071a(2)) {
                "Received GMSG: " + path;
                gb.m2071a(2);
                for (String path2 : a.keySet()) {
                    "  " + path2 + ": " + ((String) a.get(path2));
                    gb.m2071a(2);
                }
            }
            baVar.mo824a(this.f1476a, a);
            return;
        }
        "No GMSG handler found for GMSG: " + uri;
        gb.m2071a(2);
    }

    private void m2117a(ce ceVar) {
        cl.m1799a(this.f1476a.getContext(), ceVar);
    }

    public final void m2118a(cb cbVar) {
        cr crVar = null;
        boolean i = this.f1476a.m2100i();
        no noVar = (!i || this.f1476a.m2096e().f938e) ? this.f1479d : null;
        if (!i) {
            crVar = this.f1480e;
        }
        m2117a(new ce(cbVar, noVar, crVar, this.f1486k, this.f1476a.m2099h()));
    }

    public final void m2119a(gk gkVar) {
        this.f1481f = gkVar;
    }

    public final void m2120a(no noVar, cr crVar, ao aoVar, cw cwVar, boolean z, bb bbVar) {
        m2121a("/appEvent", new am(aoVar));
        m2121a("/canOpenURLs", aq.f1000b);
        m2121a("/click", aq.f1001c);
        m2121a("/close", aq.f1002d);
        m2121a("/customClose", aq.f1003e);
        m2121a("/httpTrack", aq.f1004f);
        m2121a("/log", aq.f1005g);
        m2121a("/open", new bc(bbVar));
        m2121a("/touch", aq.f1006h);
        m2121a("/video", aq.f1007i);
        this.f1479d = noVar;
        this.f1480e = crVar;
        this.f1482g = aoVar;
        this.f1484i = bbVar;
        this.f1486k = cwVar;
        this.f1483h = z;
    }

    public final void m2121a(String str, ba baVar) {
        this.f1477b.put(str, baVar);
    }

    public final void m2122a(boolean z, int i) {
        no noVar = (!this.f1476a.m2100i() || this.f1476a.m2096e().f938e) ? this.f1479d : null;
        m2117a(new ce(noVar, this.f1480e, this.f1486k, this.f1476a, z, i, this.f1476a.m2099h()));
    }

    public final void m2123a(boolean z, int i, String str) {
        cr crVar = null;
        boolean i2 = this.f1476a.m2100i();
        no noVar = (!i2 || this.f1476a.m2096e().f938e) ? this.f1479d : null;
        if (!i2) {
            crVar = this.f1480e;
        }
        m2117a(new ce(noVar, crVar, this.f1482g, this.f1486k, this.f1476a, z, i, str, this.f1476a.m2099h(), this.f1484i));
    }

    public final void m2124a(boolean z, int i, String str, String str2) {
        boolean i2 = this.f1476a.m2100i();
        no noVar = (!i2 || this.f1476a.m2096e().f938e) ? this.f1479d : null;
        m2117a(new ce(noVar, i2 ? null : this.f1480e, this.f1482g, this.f1486k, this.f1476a, z, i, str, str2, this.f1476a.m2099h(), this.f1484i));
    }

    public final boolean m2125a() {
        boolean z;
        synchronized (this.f1478c) {
            z = this.f1485j;
        }
        return z;
    }

    public final void m2126b() {
        synchronized (this.f1478c) {
            this.f1477b.clear();
            this.f1479d = null;
            this.f1480e = null;
            this.f1481f = null;
            this.f1482g = null;
            this.f1483h = false;
            this.f1485j = false;
            this.f1484i = null;
            this.f1486k = null;
        }
    }

    public final void m2127c() {
        this.f1483h = false;
    }

    public final void m2128d() {
        synchronized (this.f1478c) {
            this.f1483h = false;
            this.f1485j = true;
            cl d = this.f1476a.m2095d();
            if (d != null) {
                if (fz.m2036b()) {
                    d.m1821k();
                } else {
                    fz.f1434a.post(new gj(this, d));
                }
            }
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        "Loading resource: " + str;
        gb.m2071a(2);
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m2116a(parse);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (this.f1481f != null) {
            this.f1481f.mo867a(this.f1476a);
            this.f1481f = null;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        "AdWebView shouldOverrideUrlLoading: " + str;
        gb.m2071a(2);
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m2116a(parse);
        } else {
            if (this.f1483h && webView == this.f1476a) {
                String scheme = parse.getScheme();
                Object obj = ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) ? 1 : null;
                if (obj != null) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.f1476a.willNotDraw()) {
                gb.m2069a("AdWebView unable to handle URL: " + str);
            } else {
                Uri uri;
                try {
                    ne g = this.f1476a.m2098g();
                    if (g != null && g.m2669a(parse)) {
                        parse = g.m2668a(parse, this.f1476a.getContext());
                    }
                    uri = parse;
                } catch (nf e) {
                    gb.m2069a("Unable to append parameter to URL: " + str);
                    uri = parse;
                }
                m2118a(new cb("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
            }
        }
        return true;
    }
}
