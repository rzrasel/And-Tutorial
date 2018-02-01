package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.Map;

final class ju implements ail {
    private /* synthetic */ jt f6372a;

    ju(jt jtVar) {
        this.f6372a = jtVar;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f6372a.f6347b) {
                        if (this.f6372a.f6369x != parseInt) {
                            this.f6372a.f6369x = parseInt;
                            this.f6372a.requestLayout();
                        }
                    }
                } catch (Throwable e) {
                    id.m5371a("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
