package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;
import java.util.List;

@aqv
public final class aer extends agi implements afd {
    public String f4980a;
    public List<aeq> f4981b;
    public String f4982c;
    public afy f4983d;
    public String f4984e;
    public double f4985f;
    public String f4986g;
    public String f4987h;
    public Bundle f4988i;
    private aeo f4989j;
    private abv f4990k;
    private View f4991l;
    private Object f4992m = new Object();
    private afa f4993n;

    public aer(String str, List<aeq> list, String str2, afy com_google_android_gms_internal_afy, String str3, double d, String str4, String str5, aeo com_google_android_gms_internal_aeo, Bundle bundle, abv com_google_android_gms_internal_abv, View view) {
        this.f4980a = str;
        this.f4981b = list;
        this.f4982c = str2;
        this.f4983d = com_google_android_gms_internal_afy;
        this.f4984e = str3;
        this.f4985f = d;
        this.f4986g = str4;
        this.f4987h = str5;
        this.f4989j = com_google_android_gms_internal_aeo;
        this.f4988i = bundle;
        this.f4990k = com_google_android_gms_internal_abv;
        this.f4991l = view;
    }

    public final String mo1753a() {
        return this.f4980a;
    }

    public final void mo1754a(Bundle bundle) {
        synchronized (this.f4992m) {
            if (this.f4993n == null) {
                id.m5372a(6);
                return;
            }
            this.f4993n.mo1808b(bundle);
        }
    }

    public final void mo1755a(afa com_google_android_gms_internal_afa) {
        synchronized (this.f4992m) {
            this.f4993n = com_google_android_gms_internal_afa;
        }
    }

    public final List mo1756b() {
        return this.f4981b;
    }

    public final boolean mo1757b(Bundle bundle) {
        boolean z;
        synchronized (this.f4992m) {
            if (this.f4993n == null) {
                id.m5372a(6);
                z = false;
            } else {
                z = this.f4993n.mo1807a(bundle);
            }
        }
        return z;
    }

    public final String mo1758c() {
        return this.f4982c;
    }

    public final void mo1759c(Bundle bundle) {
        synchronized (this.f4992m) {
            if (this.f4993n == null) {
                id.m5372a(6);
                return;
            }
            this.f4993n.mo1810c(bundle);
        }
    }

    public final afy mo1760d() {
        return this.f4983d;
    }

    public final String mo1761e() {
        return this.f4984e;
    }

    public final double mo1762f() {
        return this.f4985f;
    }

    public final String mo1763g() {
        return this.f4986g;
    }

    public final String mo1764h() {
        return this.f4987h;
    }

    public final abv mo1765i() {
        return this.f4990k;
    }

    public final C1398a mo1766j() {
        return C1401c.m3584a(this.f4993n);
    }

    public final String mo1767k() {
        return "2";
    }

    public final String mo1768l() {
        return "";
    }

    public final aeo mo1769m() {
        return this.f4989j;
    }

    public final Bundle mo1770n() {
        return this.f4988i;
    }

    public final View mo1771o() {
        return this.f4991l;
    }

    public final aft mo1772p() {
        return this.f4989j;
    }

    public final void mo1773q() {
        gb.f6131a.post(new aes(this));
        this.f4980a = null;
        this.f4981b = null;
        this.f4982c = null;
        this.f4983d = null;
        this.f4984e = null;
        this.f4985f = 0.0d;
        this.f4986g = null;
        this.f4987h = null;
        this.f4989j = null;
        this.f4988i = null;
        this.f4992m = null;
        this.f4990k = null;
        this.f4991l = null;
    }
}
