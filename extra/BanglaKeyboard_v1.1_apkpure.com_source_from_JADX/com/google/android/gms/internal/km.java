package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzbv;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@TargetApi(11)
@aqv
public class km extends jg {
    public km(jf jfVar, boolean z) {
        super(jfVar, z);
    }

    protected final WebResourceResponse m5884a(WebView webView, String str, Map<String, String> map) {
        String str2;
        Exception e;
        if (webView instanceof jf) {
            jf jfVar = (jf) webView;
            if (this.k != null) {
                this.k.mo2079a(str, map, 1);
            }
            if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
                return super.shouldInterceptRequest(webView, str);
            }
            if (jfVar.mo2163k() != null) {
                jg k = jfVar.mo2163k();
                synchronized (k.f6288b) {
                    k.f6292f = false;
                    k.f6293g = true;
                    zzbv.zzea();
                    gb.m5451a(new jj(k));
                }
            }
            String str3 = jfVar.mo2162j().f7761d ? (String) zzbv.zzen().m4217a(ado.f4867F) : jfVar.mo2170o() ? (String) zzbv.zzen().m4217a(ado.f4866E) : (String) zzbv.zzen().m4217a(ado.f4865D);
            try {
                Context context = jfVar.getContext();
                str2 = jfVar.mo2169n().f7706a;
                Map hashMap = new HashMap();
                hashMap.put("User-Agent", zzbv.zzea().m5502a(context, str2));
                hashMap.put("Cache-Control", "max-stale=3600");
                he heVar = new he(context);
                str2 = (String) he.m5582a(0, str3, hashMap, null).get(60, TimeUnit.SECONDS);
                return str2 == null ? null : new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str2.getBytes("UTF-8")));
            } catch (IOException e2) {
                e = e2;
                str3 = "Could not fetch MRAID JS. ";
                str2 = String.valueOf(e.getMessage());
                id.m5370a(str2.length() == 0 ? str3.concat(str2) : new String(str3));
                return null;
            } catch (ExecutionException e3) {
                e = e3;
                str3 = "Could not fetch MRAID JS. ";
                str2 = String.valueOf(e.getMessage());
                if (str2.length() == 0) {
                }
                id.m5370a(str2.length() == 0 ? str3.concat(str2) : new String(str3));
                return null;
            } catch (InterruptedException e4) {
                e = e4;
                str3 = "Could not fetch MRAID JS. ";
                str2 = String.valueOf(e.getMessage());
                if (str2.length() == 0) {
                }
                id.m5370a(str2.length() == 0 ? str3.concat(str2) : new String(str3));
                return null;
            } catch (TimeoutException e5) {
                e = e5;
                str3 = "Could not fetch MRAID JS. ";
                str2 = String.valueOf(e.getMessage());
                if (str2.length() == 0) {
                }
                id.m5370a(str2.length() == 0 ? str3.concat(str2) : new String(str3));
                return null;
            }
        }
        id.m5370a("Tried to intercept request from a WebView that wasn't an AdWebView.");
        return null;
    }
}
