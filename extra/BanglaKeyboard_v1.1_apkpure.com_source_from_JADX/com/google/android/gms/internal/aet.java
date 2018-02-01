package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;
import java.util.List;

@aqv
public final class aet extends agm implements afd {
    public String f4995a;
    public List<aeq> f4996b;
    public String f4997c;
    public afy f4998d;
    public String f4999e;
    public String f5000f;
    public Bundle f5001g;
    private aeo f5002h;
    private abv f5003i;
    private View f5004j;
    private Object f5005k = new Object();
    private afa f5006l;

    public aet(String str, List<aeq> list, String str2, afy com_google_android_gms_internal_afy, String str3, String str4, aeo com_google_android_gms_internal_aeo, Bundle bundle, abv com_google_android_gms_internal_abv, View view) {
        this.f4995a = str;
        this.f4996b = list;
        this.f4997c = str2;
        this.f4998d = com_google_android_gms_internal_afy;
        this.f4999e = str3;
        this.f5000f = str4;
        this.f5002h = com_google_android_gms_internal_aeo;
        this.f5001g = bundle;
        this.f5003i = com_google_android_gms_internal_abv;
        this.f5004j = view;
    }

    public final String mo1774a() {
        return this.f4995a;
    }

    public final void mo1775a(Bundle bundle) {
        synchronized (this.f5005k) {
            if (this.f5006l == null) {
                id.m5372a(6);
                return;
            }
            this.f5006l.mo1808b(bundle);
        }
    }

    public final void mo1755a(afa com_google_android_gms_internal_afa) {
        synchronized (this.f5005k) {
            this.f5006l = com_google_android_gms_internal_afa;
        }
    }

    public final List mo1756b() {
        return this.f4996b;
    }

    public final boolean mo1776b(Bundle bundle) {
        boolean z;
        synchronized (this.f5005k) {
            if (this.f5006l == null) {
                id.m5372a(6);
                z = false;
            } else {
                z = this.f5006l.mo1807a(bundle);
            }
        }
        return z;
    }

    public final String mo1777c() {
        return this.f4997c;
    }

    public final void mo1778c(Bundle bundle) {
        synchronized (this.f5005k) {
            if (this.f5006l == null) {
                id.m5372a(6);
                return;
            }
            this.f5006l.mo1810c(bundle);
        }
    }

    public final afy mo1779d() {
        return this.f4998d;
    }

    public final String mo1780e() {
        return this.f4999e;
    }

    public final String mo1781f() {
        return this.f5000f;
    }

    public final abv mo1782g() {
        return this.f5003i;
    }

    public final C1398a mo1783h() {
        return C1401c.m3584a(this.f5006l);
    }

    public final Bundle mo1784i() {
        return this.f5001g;
    }

    public final aft mo1785j() {
        return this.f5002h;
    }

    public final String mo1767k() {
        return "1";
    }

    public final String mo1768l() {
        return "";
    }

    public final aeo mo1769m() {
        return this.f5002h;
    }

    public final void mo1786n() {
        gb.f6131a.post(new aeu(this));
        this.f4995a = null;
        this.f4996b = null;
        this.f4997c = null;
        this.f4998d = null;
        this.f4999e = null;
        this.f5000f = null;
        this.f5002h = null;
        this.f5001g = null;
        this.f5005k = null;
        this.f5003i = null;
        this.f5004j = null;
    }

    public final View mo1771o() {
        return this.f5004j;
    }
}
