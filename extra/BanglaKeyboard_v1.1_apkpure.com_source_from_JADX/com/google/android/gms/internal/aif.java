package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

final class aif implements ail {
    aif() {
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        String str = (String) map.get("u");
        if (str == null) {
            id.m5370a("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            Uri uri;
            nh m = jfVar.mo2168m();
            if (m == null || !m.m6064b(parse)) {
                uri = parse;
            } else {
                Context context = jfVar.getContext();
                if (jfVar == null) {
                    throw null;
                }
                uri = m.m6060a(parse, context, (View) jfVar);
            }
            parse = uri;
        } catch (ni e) {
            String str2 = "Unable to append parameter to URL: ";
            str = String.valueOf(str);
            id.m5370a(str.length() != 0 ? str2.concat(str) : new String(str2));
        }
        Object obj = (((Boolean) zzbv.zzen().m4217a(ado.al)).booleanValue() && zzbv.zzez().m5296a(jfVar.getContext())) ? 1 : null;
        if (obj != null && TextUtils.isEmpty(parse.getQueryParameter("fbs_aeid"))) {
            str = zzbv.zzez().m5308i(jfVar.getContext());
            zzbv.zzea();
            parse = gb.m5430a(parse.toString(), "fbs_aeid", str);
            zzbv.zzez().m5292a(jfVar.getContext(), str);
        }
        new hq(jfVar.getContext(), jfVar.mo2169n().f7706a, parse.toString()).m3624h();
    }
}
