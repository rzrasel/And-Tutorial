package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

@aqv
public final class ans extends aof {
    final Context f5452a;
    String f5453b = m4984c("description");
    long f5454c = m4985d("start_ticks");
    long f5455d = m4985d("end_ticks");
    String f5456e = m4984c("summary");
    String f5457f = m4984c("location");
    private final Map<String, String> f5458g;

    public ans(jf jfVar, Map<String, String> map) {
        super(jfVar, "createCalendarEvent");
        this.f5458g = map;
        this.f5452a = jfVar.mo2157e();
    }

    private final String m4984c(String str) {
        return TextUtils.isEmpty((CharSequence) this.f5458g.get(str)) ? "" : (String) this.f5458g.get(str);
    }

    private final long m4985d(String str) {
        String str2 = (String) this.f5458g.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
