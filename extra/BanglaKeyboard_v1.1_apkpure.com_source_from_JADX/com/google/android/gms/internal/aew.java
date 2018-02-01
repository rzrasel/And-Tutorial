package com.google.android.gms.internal;

import android.support.v4.p018f.C0477m;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;
import java.util.Arrays;
import java.util.List;

@aqv
public final class aew extends agq implements afc {
    public final String f5008a;
    private final aeo f5009b;
    private final C0477m<String, aeq> f5010c;
    private final C0477m<String, String> f5011d;
    private abv f5012e;
    private View f5013f;
    private final Object f5014g = new Object();
    private afa f5015h;

    public aew(String str, C0477m<String, aeq> c0477m, C0477m<String, String> c0477m2, aeo com_google_android_gms_internal_aeo, abv com_google_android_gms_internal_abv, View view) {
        this.f5008a = str;
        this.f5010c = c0477m;
        this.f5011d = c0477m2;
        this.f5009b = com_google_android_gms_internal_aeo;
        this.f5012e = com_google_android_gms_internal_abv;
        this.f5013f = view;
    }

    public final String mo1787a(String str) {
        return (String) this.f5011d.get(str);
    }

    public final List<String> mo1788a() {
        int i = 0;
        String[] strArr = new String[(this.f5010c.size() + this.f5011d.size())];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f5010c.size(); i3++) {
            strArr[i2] = (String) this.f5010c.m1249b(i3);
            i2++;
        }
        while (i < this.f5011d.size()) {
            strArr[i2] = (String) this.f5011d.m1249b(i);
            i++;
            i2++;
        }
        return Arrays.asList(strArr);
    }

    public final void mo1755a(afa com_google_android_gms_internal_afa) {
        synchronized (this.f5014g) {
            this.f5015h = com_google_android_gms_internal_afa;
        }
    }

    public final boolean mo1789a(C1398a c1398a) {
        if (this.f5015h == null) {
            id.m5372a(6);
            return false;
        } else if (this.f5013f == null) {
            return false;
        } else {
            View view = (FrameLayout) C1401c.m3585a(c1398a);
            this.f5015h.mo1802a(view, new aex(this));
            return true;
        }
    }

    public final C1398a mo1790b() {
        return C1401c.m3584a(this.f5015h);
    }

    public final afy mo1791b(String str) {
        return (afy) this.f5010c.get(str);
    }

    public final abv mo1792c() {
        return this.f5012e;
    }

    public final void mo1793c(String str) {
        synchronized (this.f5014g) {
            if (this.f5015h == null) {
                id.m5372a(6);
                return;
            }
            this.f5015h.mo1803a(null, str, null, null, null);
        }
    }

    public final void mo1794d() {
        synchronized (this.f5014g) {
            if (this.f5015h == null) {
                id.m5372a(6);
                return;
            }
            this.f5015h.mo1804a(null, null);
        }
    }

    public final C1398a mo1795e() {
        return C1401c.m3584a(this.f5015h.mo1815h().getApplicationContext());
    }

    public final void mo1796f() {
        this.f5015h = null;
        this.f5012e = null;
        this.f5013f = null;
    }

    public final String mo1767k() {
        return "3";
    }

    public final String mo1768l() {
        return this.f5008a;
    }

    public final aeo mo1769m() {
        return this.f5009b;
    }

    public final View mo1771o() {
        return this.f5013f;
    }
}
