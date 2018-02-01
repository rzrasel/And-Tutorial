package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public final class cl extends dc {
    private final Activity f1127a;
    private ce f1128b;
    private cs f1129c;
    private ge f1130d;
    private cp f1131e;
    private cv f1132f;
    private boolean f1133g;
    private FrameLayout f1134h;
    private CustomViewCallback f1135i;
    private boolean f1136j = false;
    private boolean f1137k = false;
    private RelativeLayout f1138l;

    public cl(Activity activity) {
        this.f1127a = activity;
    }

    public static void m1799a(Context context, ce ceVar) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", ceVar.f1120n.f1225e);
        ce.m1757a(intent, ceVar);
        intent.addFlags(524288);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    private void m1800b(boolean z) {
        this.f1132f = new cv(this.f1127a, z ? 50 : 32);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        this.f1132f.m1840a(this.f1128b.f1114h);
        this.f1138l.addView(this.f1132f, layoutParams);
    }

    private static RelativeLayout.LayoutParams m1801c(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        return layoutParams;
    }

    private void m1802c(boolean z) {
        if (!this.f1133g) {
            this.f1127a.requestWindowFeature(1);
        }
        Window window = this.f1127a.getWindow();
        window.setFlags(1024, 1024);
        m1805a(this.f1128b.f1117k);
        if (VERSION.SDK_INT >= 11) {
            gb.m2071a(3);
            window.setFlags(16777216, 16777216);
        }
        this.f1138l = new co(this.f1127a, this.f1128b.f1122p);
        this.f1138l.setBackgroundColor(-16777216);
        this.f1127a.setContentView(this.f1138l);
        this.f1133g = true;
        boolean a = this.f1128b.f1111e.m2097f().m2125a();
        if (z) {
            this.f1130d = ge.m2081a(this.f1127a, this.f1128b.f1111e.m2096e(), true, a, null, this.f1128b.f1120n);
            this.f1130d.m2097f().m2120a(null, null, this.f1128b.f1112f, this.f1128b.f1116j, true, this.f1128b.f1121o);
            this.f1130d.m2097f().m2119a(new cm(this));
            if (this.f1128b.f1119m != null) {
                this.f1130d.loadUrl(this.f1128b.f1119m);
            } else if (this.f1128b.f1115i != null) {
                this.f1130d.loadDataWithBaseURL(this.f1128b.f1113g, this.f1128b.f1115i, "text/html", "UTF-8", null);
            } else {
                throw new cn("No URL or HTML to display in ad overlay.");
            }
        }
        this.f1130d = this.f1128b.f1111e;
        this.f1130d.setContext(this.f1127a);
        this.f1130d.m2089a(this);
        ViewParent parent = this.f1130d.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.f1130d);
        }
        this.f1138l.addView(this.f1130d, -1, -1);
        if (!z) {
            this.f1130d.m2094c();
        }
        m1800b(a);
    }

    private void m1803l() {
        if (this.f1127a.isFinishing() && !this.f1137k) {
            this.f1137k = true;
            if (this.f1127a.isFinishing()) {
                if (this.f1130d != null) {
                    this.f1130d.m2093b();
                    this.f1138l.removeView(this.f1130d);
                    if (this.f1131e != null) {
                        this.f1130d.m2092a(false);
                        this.f1131e.f1143c.addView(this.f1130d, this.f1131e.f1141a, this.f1131e.f1142b);
                    }
                }
                if (this.f1128b != null && this.f1128b.f1110d != null) {
                    this.f1128b.f1110d.mo995o();
                }
            }
        }
    }

    public final void m1804a() {
        this.f1127a.finish();
    }

    public final void m1805a(int i) {
        this.f1127a.setRequestedOrientation(i);
    }

    public final void m1806a(int i, int i2, int i3, int i4) {
        if (this.f1129c != null) {
            this.f1129c.setLayoutParams(m1801c(i, i2, i3, i4));
        }
    }

    public final void mo858a(Bundle bundle) {
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        this.f1136j = z;
        try {
            this.f1128b = ce.m1756a(this.f1127a.getIntent());
            if (this.f1128b == null) {
                throw new cn("Could not get info for ad overlay.");
            }
            if (bundle == null) {
                if (this.f1128b.f1110d != null) {
                    this.f1128b.f1110d.mo996p();
                }
                if (!(this.f1128b.f1118l == 1 || this.f1128b.f1109c == null)) {
                    this.f1128b.f1109c.mo998r();
                }
            }
            switch (this.f1128b.f1118l) {
                case 1:
                    m1802c(false);
                    return;
                case 2:
                    this.f1131e = new cp(this.f1128b.f1111e);
                    m1802c(false);
                    return;
                case 3:
                    m1802c(true);
                    return;
                case 4:
                    if (this.f1136j) {
                        this.f1127a.finish();
                        return;
                    } else if (!cj.m1787a(this.f1127a, this.f1128b.f1108b, this.f1128b.f1116j)) {
                        this.f1127a.finish();
                        return;
                    } else {
                        return;
                    }
                default:
                    throw new cn("Could not determine ad overlay type.");
            }
        } catch (cn e) {
            gb.m2069a(e.getMessage());
            this.f1127a.finish();
        }
    }

    public final void m1808a(View view, CustomViewCallback customViewCallback) {
        this.f1134h = new FrameLayout(this.f1127a);
        this.f1134h.setBackgroundColor(-16777216);
        this.f1134h.addView(view, -1, -1);
        this.f1127a.setContentView(this.f1134h);
        this.f1133g = true;
        this.f1135i = customViewCallback;
    }

    public final void m1809a(boolean z) {
        if (this.f1132f != null) {
            this.f1132f.m1840a(z);
        }
    }

    public final cs m1810b() {
        return this.f1129c;
    }

    public final void m1811b(int i, int i2, int i3, int i4) {
        if (this.f1129c == null) {
            this.f1129c = new cs(this.f1127a, this.f1130d);
            this.f1138l.addView(this.f1129c, 0, m1801c(i, i2, i3, i4));
            this.f1130d.m2097f().m2127c();
        }
    }

    public final void mo859b(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f1136j);
    }

    public final void m1813c() {
        if (this.f1128b != null) {
            m1805a(this.f1128b.f1117k);
        }
        if (this.f1134h != null) {
            this.f1127a.setContentView(this.f1138l);
            this.f1133g = true;
            this.f1134h.removeAllViews();
            this.f1134h = null;
        }
        if (this.f1135i != null) {
            this.f1135i.onCustomViewHidden();
            this.f1135i = null;
        }
    }

    public final void mo860d() {
    }

    public final void mo861e() {
    }

    public final void mo862f() {
        if (this.f1128b != null && this.f1128b.f1118l == 4) {
            if (this.f1136j) {
                this.f1127a.finish();
            } else {
                this.f1136j = true;
            }
        }
        if (this.f1130d != null) {
            fo.m2007b(this.f1130d);
        }
    }

    public final void mo863g() {
        if (this.f1129c != null) {
            this.f1129c.m1836c();
        }
        m1813c();
        if (this.f1130d != null && (!this.f1127a.isFinishing() || this.f1131e == null)) {
            fo.m1996a(this.f1130d);
        }
        m1803l();
    }

    public final void mo864h() {
        m1803l();
    }

    public final void mo865i() {
        if (this.f1129c != null) {
            this.f1129c.m1830a();
        }
        if (this.f1130d != null) {
            this.f1138l.removeView(this.f1130d);
        }
        m1803l();
    }

    public final void mo866j() {
        this.f1133g = true;
    }

    public final void m1821k() {
        this.f1138l.removeView(this.f1132f);
        m1800b(true);
    }
}
