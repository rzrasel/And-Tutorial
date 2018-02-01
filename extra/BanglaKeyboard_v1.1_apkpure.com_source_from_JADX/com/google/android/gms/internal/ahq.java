package com.google.android.gms.internal;

import java.util.Map;

@aqv
public final class ahq implements ail {
    private final ahr f5114a;

    public ahq(ahr com_google_android_gms_internal_ahr) {
        this.f5114a = com_google_android_gms_internal_ahr;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        String str = (String) map.get("name");
        if (str == null) {
            id.m5370a("App event with no name parameter.");
        } else {
            this.f5114a.onAppEvent(str, (String) map.get("info"));
        }
    }
}
