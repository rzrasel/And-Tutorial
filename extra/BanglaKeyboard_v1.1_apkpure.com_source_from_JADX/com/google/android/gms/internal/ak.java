package com.google.android.gms.internal;

import java.util.Map;

public final class ak implements ail {
    public final void mo1470a(jf jfVar, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String str2 = "Invalid request: ";
        String valueOf = String.valueOf((String) map.get("errors"));
        id.m5370a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        ac.f4761g.m4572a(str);
    }
}
