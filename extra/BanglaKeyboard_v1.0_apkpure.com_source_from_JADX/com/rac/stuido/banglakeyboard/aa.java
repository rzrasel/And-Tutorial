package com.rac.stuido.banglakeyboard;

import android.app.Activity;
import com.google.android.gms.ads.C0217b;
import com.google.android.gms.ads.C0219c;
import com.google.android.gms.ads.C0222e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class aa extends bg {
    C0222e f2568a;
    private String f2569c;

    public aa(String str) {
        this.f2569c = str;
    }

    private static C0219c m3863a(C0219c c0219c, List list) {
        if (!(c0219c == null || list.isEmpty())) {
            for (int i = 0; i < list.size(); i++) {
                c0219c.m918a((String) list.get(i));
            }
        }
        return c0219c;
    }

    private static C0217b m3865c() {
        C0219c a;
        int i = 1;
        C0219c c0219c = new C0219c();
        c0219c.m918a(C0217b.f417a);
        c0219c = m3863a(c0219c, Arrays.asList(new String[]{"C39203941AC786B976B85F06ACEB89BE", "5444FE11789FF7333B9F56DB9EC0C446", "390628E1FDFD79E35567637E2603A8EB", "EED192D773A9B7436C3A9A743587FA4D", "622AA3C27ADCC76B9ABFE62D22F8D4EF", "2286CDC2A13EC017EDC99FCD411F0C92", "40B1500D2CDD19C0520EF1919AB29C70"}));
        if ("".isEmpty()) {
            i = 0;
        }
        if (i != 0) {
            List arrayList = new ArrayList();
            if (!"".isEmpty()) {
                arrayList = Arrays.asList("".split("\\s*,\\s*"));
            }
            a = m3863a(c0219c, arrayList);
        } else {
            a = c0219c;
        }
        return a.m917a();
    }

    protected final boolean mo1356a() {
        return true;
    }

    protected final boolean mo1357a(Activity activity) {
        "showInterstitial - AdMob unitID" + this.f2569c;
        this.f2568a = new C0222e(activity);
        this.f2568a.m925a(this.f2569c);
        if (this.f2568a == null) {
            return false;
        }
        C0217b c = m3865c();
        this.f2568a.m923a(new ab(this));
        this.f2568a.m924a(c);
        return true;
    }

    protected final void mo1358b() {
        C0222e c0222e = this.f2568a;
    }
}
