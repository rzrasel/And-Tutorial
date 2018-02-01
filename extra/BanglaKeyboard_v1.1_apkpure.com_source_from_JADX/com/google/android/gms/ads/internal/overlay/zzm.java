package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C1538g;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.aoj;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.gf;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.zk;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;
import java.util.Collections;

@aqv
public final class zzm extends aoj implements zzaj {
    private static int f4244b = Color.argb(0, 0, 0, 0);
    AdOverlayInfoParcel f4245a;
    private final Activity f4246c;
    private jf f4247d;
    private zzr f4248e;
    private zzae f4249f;
    private boolean f4250g = false;
    private FrameLayout f4251h;
    private CustomViewCallback f4252i;
    private boolean f4253j = false;
    private boolean f4254k = false;
    private C1466u f4255l;
    private boolean f4256m = false;
    private int f4257n = 0;
    private final Object f4258o = new Object();
    private Runnable f4259p;
    private boolean f4260q;
    private boolean f4261r;
    private boolean f4262s = false;
    private boolean f4263t = false;
    private boolean f4264u = true;

    public zzm(Activity activity) {
        this.f4246c = activity;
    }

    private final void m3697a(boolean z) {
        int intValue = ((Integer) zzbv.zzen().m4217a(ado.cD)).intValue();
        C1448c c1448c = new C1448c();
        c1448c.f4118e = 50;
        c1448c.f4114a = z ? intValue : 0;
        c1448c.f4115b = z ? 0 : intValue;
        c1448c.f4116c = 0;
        c1448c.f4117d = intValue;
        this.f4249f = new zzae(this.f4246c, c1448c, this);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        this.f4249f.zza(z, this.f4245a.zzchc);
        this.f4255l.addView(this.f4249f, layoutParams);
    }

    private final void m3698b() {
        if (this.f4246c.isFinishing() && !this.f4262s) {
            this.f4262s = true;
            if (this.f4247d != null) {
                this.f4247d.mo2137a(this.f4257n);
                synchronized (this.f4258o) {
                    if (!this.f4260q && this.f4247d.mo2188z()) {
                        this.f4259p = new C1464s(this);
                        gb.f6131a.postDelayed(this.f4259p, ((Long) zzbv.zzen().m4217a(ado.aC)).longValue());
                        return;
                    }
                }
            }
            m3701a();
        }
    }

    private final void m3699b(boolean z) {
        if (!this.f4261r) {
            this.f4246c.requestWindowFeature(1);
        }
        Window window = this.f4246c.getWindow();
        if (window == null) {
            throw new C1465t("Invalid activity, no window available.");
        }
        boolean a;
        jg k;
        boolean a2;
        ViewParent parent;
        ViewGroup viewGroup;
        jf jfVar;
        C1466u c1466u;
        jf jfVar2;
        if (C1538g.m3946f()) {
            if (((Boolean) zzbv.zzen().m4217a(ado.cB)).booleanValue()) {
                zzbv.zzea();
                a = gb.m5456a(this.f4246c, this.f4246c.getResources().getConfiguration());
                Object obj = (this.f4245a.zzchh == null && this.f4245a.zzchh.zzapz) ? 1 : null;
                if (!(this.f4254k && obj == null) && r0) {
                    window.setFlags(1024, 1024);
                    if (((Boolean) zzbv.zzen().m4217a(ado.aD)).booleanValue() && C1538g.m3944d() && this.f4245a.zzchh != null && this.f4245a.zzchh.zzaqe) {
                        window.getDecorView().setSystemUiVisibility(4098);
                    }
                }
                k = this.f4245a.zzcgz.mo2163k();
                a2 = k == null ? k.m5732a() : false;
                this.f4256m = false;
                if (a2) {
                    if (this.f4245a.orientation == zzbv.zzec().mo2095a()) {
                        this.f4256m = this.f4246c.getResources().getConfiguration().orientation != 1;
                    } else if (this.f4245a.orientation == zzbv.zzec().mo2097b()) {
                        this.f4256m = this.f4246c.getResources().getConfiguration().orientation != 2;
                    }
                }
                new StringBuilder(46).append("Delay onShow to next orientation change: ").append(this.f4256m);
                id.m5372a(3);
                setRequestedOrientation(this.f4245a.orientation);
                if (zzbv.zzec().mo2101a(window)) {
                    id.m5372a(3);
                }
                if (this.f4254k) {
                    this.f4255l.setBackgroundColor(-16777216);
                } else {
                    this.f4255l.setBackgroundColor(f4244b);
                }
                this.f4246c.setContentView(this.f4255l);
                this.f4261r = true;
                if (z) {
                    this.f4247d = this.f4245a.zzcgz;
                    this.f4247d.mo2138a(this.f4246c);
                } else {
                    try {
                        zzbv.zzeb();
                        this.f4247d = jp.m5744a(this.f4246c, this.f4245a.zzcgz.mo2162j(), true, a2, null, this.f4245a.zzatj, null, null, this.f4245a.zzcgz.mo2159g(), new zk());
                        this.f4247d.mo2163k().m5727a(null, null, this.f4245a.zzcha, this.f4245a.zzche, true, null, this.f4245a.zzcgz.mo2163k().f6294h, null, null);
                        this.f4247d.mo2163k().f6289c = new C1463r();
                        if (this.f4245a.url != null) {
                            this.f4247d.loadUrl(this.f4245a.url);
                        } else if (this.f4245a.zzchd == null) {
                            this.f4247d.loadDataWithBaseURL(this.f4245a.zzchb, this.f4245a.zzchd, "text/html", "UTF-8", null);
                        } else {
                            throw new C1465t("No URL or HTML to display in ad overlay.");
                        }
                        if (this.f4245a.zzcgz != null) {
                            this.f4245a.zzcgz.mo2149b(this);
                        }
                    } catch (Exception e) {
                        throw new C1465t("Could not obtain webview for the overlay.");
                    }
                }
                this.f4247d.mo2140a(this);
                parent = this.f4247d.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) parent;
                    jfVar = this.f4247d;
                    if (jfVar != null) {
                        throw null;
                    }
                    viewGroup.removeView((View) jfVar);
                }
                if (this.f4254k) {
                    this.f4247d.mo2135E();
                }
                c1466u = this.f4255l;
                jfVar2 = this.f4247d;
                if (jfVar2 != null) {
                    throw null;
                }
                c1466u.addView((View) jfVar2, -1, -1);
                if (!(z || this.f4256m)) {
                    m3700c();
                }
                m3697a(a2);
                if (this.f4247d.mo2164l()) {
                    zza(a2, true);
                    return;
                }
                return;
            }
        }
        a = true;
        if (this.f4245a.zzchh == null) {
        }
        window.setFlags(1024, 1024);
        window.getDecorView().setSystemUiVisibility(4098);
        k = this.f4245a.zzcgz.mo2163k();
        if (k == null) {
        }
        this.f4256m = false;
        if (a2) {
            if (this.f4245a.orientation == zzbv.zzec().mo2095a()) {
                if (this.f4246c.getResources().getConfiguration().orientation != 1) {
                }
                this.f4256m = this.f4246c.getResources().getConfiguration().orientation != 1;
            } else if (this.f4245a.orientation == zzbv.zzec().mo2097b()) {
                if (this.f4246c.getResources().getConfiguration().orientation != 2) {
                }
                this.f4256m = this.f4246c.getResources().getConfiguration().orientation != 2;
            }
        }
        new StringBuilder(46).append("Delay onShow to next orientation change: ").append(this.f4256m);
        id.m5372a(3);
        setRequestedOrientation(this.f4245a.orientation);
        if (zzbv.zzec().mo2101a(window)) {
            id.m5372a(3);
        }
        if (this.f4254k) {
            this.f4255l.setBackgroundColor(f4244b);
        } else {
            this.f4255l.setBackgroundColor(-16777216);
        }
        this.f4246c.setContentView(this.f4255l);
        this.f4261r = true;
        if (z) {
            this.f4247d = this.f4245a.zzcgz;
            this.f4247d.mo2138a(this.f4246c);
        } else {
            zzbv.zzeb();
            this.f4247d = jp.m5744a(this.f4246c, this.f4245a.zzcgz.mo2162j(), true, a2, null, this.f4245a.zzatj, null, null, this.f4245a.zzcgz.mo2159g(), new zk());
            this.f4247d.mo2163k().m5727a(null, null, this.f4245a.zzcha, this.f4245a.zzche, true, null, this.f4245a.zzcgz.mo2163k().f6294h, null, null);
            this.f4247d.mo2163k().f6289c = new C1463r();
            if (this.f4245a.url != null) {
                this.f4247d.loadUrl(this.f4245a.url);
            } else if (this.f4245a.zzchd == null) {
                throw new C1465t("No URL or HTML to display in ad overlay.");
            } else {
                this.f4247d.loadDataWithBaseURL(this.f4245a.zzchb, this.f4245a.zzchd, "text/html", "UTF-8", null);
            }
            if (this.f4245a.zzcgz != null) {
                this.f4245a.zzcgz.mo2149b(this);
            }
        }
        this.f4247d.mo2140a(this);
        parent = this.f4247d.getParent();
        viewGroup = (ViewGroup) parent;
        jfVar = this.f4247d;
        if (jfVar != null) {
            viewGroup.removeView((View) jfVar);
            if (this.f4254k) {
                this.f4247d.mo2135E();
            }
            c1466u = this.f4255l;
            jfVar2 = this.f4247d;
            if (jfVar2 != null) {
                c1466u.addView((View) jfVar2, -1, -1);
                m3700c();
                m3697a(a2);
                if (this.f4247d.mo2164l()) {
                    zza(a2, true);
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    private final void m3700c() {
        this.f4247d.mo2152c();
    }

    final void m3701a() {
        if (!this.f4263t) {
            this.f4263t = true;
            if (this.f4247d != null) {
                C1466u c1466u = this.f4255l;
                jf jfVar = this.f4247d;
                if (jfVar == null) {
                    throw null;
                }
                c1466u.removeView((View) jfVar);
                if (this.f4248e != null) {
                    this.f4247d.mo2138a(this.f4248e.zzaie);
                    this.f4247d.mo2146a(false);
                    ViewGroup viewGroup = this.f4248e.parent;
                    jfVar = this.f4247d;
                    if (jfVar == null) {
                        throw null;
                    }
                    viewGroup.addView((View) jfVar, this.f4248e.index, this.f4248e.zzcgt);
                    this.f4248e = null;
                } else if (this.f4246c.getApplicationContext() != null) {
                    this.f4247d.mo2138a(this.f4246c.getApplicationContext());
                }
                this.f4247d = null;
            }
            if (this.f4245a != null && this.f4245a.zzcgy != null) {
                this.f4245a.zzcgy.zzbz();
            }
        }
    }

    public final void close() {
        this.f4257n = 2;
        this.f4246c.finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed() {
        this.f4257n = 0;
    }

    public final void onCreate(Bundle bundle) {
        boolean z = false;
        this.f4246c.requestWindowFeature(1);
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        this.f4253j = z;
        try {
            this.f4245a = AdOverlayInfoParcel.zzb(this.f4246c.getIntent());
            if (this.f4245a == null) {
                throw new C1465t("Could not get info for ad overlay.");
            }
            if (this.f4245a.zzatj.f7708c > 7500000) {
                this.f4257n = 3;
            }
            if (this.f4246c.getIntent() != null) {
                this.f4264u = this.f4246c.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.f4245a.zzchh != null) {
                this.f4254k = this.f4245a.zzchh.zzapy;
            } else {
                this.f4254k = false;
            }
            if (((Boolean) zzbv.zzen().m4217a(ado.bD)).booleanValue() && this.f4254k && this.f4245a.zzchh.zzaqd != -1) {
                new C1467v().m3624h();
            }
            if (bundle == null) {
                if (this.f4245a.zzcgy != null && this.f4264u) {
                    this.f4245a.zzcgy.zzca();
                }
                if (!(this.f4245a.zzchf == 1 || this.f4245a.zzcgx == null)) {
                    this.f4245a.zzcgx.onAdClicked();
                }
            }
            this.f4255l = new C1466u(this.f4246c, this.f4245a.zzchg, this.f4245a.zzatj.f7706a);
            this.f4255l.setId(1000);
            switch (this.f4245a.zzchf) {
                case 1:
                    m3699b(false);
                    return;
                case 2:
                    this.f4248e = new zzr(this.f4245a.zzcgz);
                    m3699b(false);
                    return;
                case 3:
                    m3699b(true);
                    return;
                case 4:
                    if (this.f4253j) {
                        this.f4257n = 3;
                        this.f4246c.finish();
                        return;
                    }
                    zzbv.zzdx();
                    if (!zza.zza(this.f4246c, this.f4245a.zzcgw, this.f4245a.zzche)) {
                        this.f4257n = 3;
                        this.f4246c.finish();
                        return;
                    }
                    return;
                default:
                    throw new C1465t("Could not determine ad overlay type.");
            }
        } catch (C1465t e) {
            id.m5370a(e.getMessage());
            this.f4257n = 3;
            this.f4246c.finish();
        }
    }

    public final void onDestroy() {
        if (this.f4247d != null) {
            C1466u c1466u = this.f4255l;
            jf jfVar = this.f4247d;
            if (jfVar == null) {
                throw null;
            }
            c1466u.removeView((View) jfVar);
        }
        m3698b();
    }

    public final void onPause() {
        zzml();
        if (this.f4245a.zzcgy != null) {
            this.f4245a.zzcgy.onPause();
        }
        if (!(((Boolean) zzbv.zzen().m4217a(ado.cC)).booleanValue() || this.f4247d == null || (this.f4246c.isFinishing() && this.f4248e != null))) {
            zzbv.zzec();
            gf.m5508a(this.f4247d);
        }
        m3698b();
    }

    public final void onRestart() {
    }

    public final void onResume() {
        if (this.f4245a != null && this.f4245a.zzchf == 4) {
            if (this.f4253j) {
                this.f4257n = 3;
                this.f4246c.finish();
            } else {
                this.f4253j = true;
            }
        }
        if (this.f4245a.zzcgy != null) {
            this.f4245a.zzcgy.onResume();
        }
        if (!((Boolean) zzbv.zzen().m4217a(ado.cC)).booleanValue()) {
            if (this.f4247d == null || this.f4247d.mo2174q()) {
                id.m5370a("The webview does not exist. Ignoring action.");
                return;
            }
            zzbv.zzec();
            gf.m5509b(this.f4247d);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f4253j);
    }

    public final void onStart() {
        if (!((Boolean) zzbv.zzen().m4217a(ado.cC)).booleanValue()) {
            return;
        }
        if (this.f4247d == null || this.f4247d.mo2174q()) {
            id.m5370a("The webview does not exist. Ignoring action.");
            return;
        }
        zzbv.zzec();
        gf.m5509b(this.f4247d);
    }

    public final void onStop() {
        if (((Boolean) zzbv.zzen().m4217a(ado.cC)).booleanValue() && this.f4247d != null && (!this.f4246c.isFinishing() || this.f4248e == null)) {
            zzbv.zzec();
            gf.m5508a(this.f4247d);
        }
        m3698b();
    }

    public final void setRequestedOrientation(int i) {
        this.f4246c.setRequestedOrientation(i);
    }

    public final void zza(View view, CustomViewCallback customViewCallback) {
        this.f4251h = new FrameLayout(this.f4246c);
        this.f4251h.setBackgroundColor(-16777216);
        this.f4251h.addView(view, -1, -1);
        this.f4246c.setContentView(this.f4251h);
        this.f4261r = true;
        this.f4252i = customViewCallback;
        this.f4250g = true;
    }

    public final void zza(boolean z, boolean z2) {
        if (this.f4249f != null) {
            this.f4249f.zza(z, z2);
        }
    }

    public final void zzay() {
        this.f4261r = true;
    }

    public final void zzml() {
        if (this.f4245a != null && this.f4250g) {
            setRequestedOrientation(this.f4245a.orientation);
        }
        if (this.f4251h != null) {
            this.f4246c.setContentView(this.f4255l);
            this.f4261r = true;
            this.f4251h.removeAllViews();
            this.f4251h = null;
        }
        if (this.f4252i != null) {
            this.f4252i.onCustomViewHidden();
            this.f4252i = null;
        }
        this.f4250g = false;
    }

    public final void zzmm() {
        this.f4257n = 1;
        this.f4246c.finish();
    }

    public final boolean zzmn() {
        this.f4257n = 0;
        if (this.f4247d == null) {
            return true;
        }
        boolean s = this.f4247d.mo2176s();
        if (s) {
            return s;
        }
        this.f4247d.mo2145a("onbackblocked", Collections.emptyMap());
        return s;
    }

    public final void zzmo() {
        this.f4255l.removeView(this.f4249f);
        m3697a(true);
    }

    public final void zzmr() {
        if (this.f4256m) {
            this.f4256m = false;
            m3700c();
        }
    }

    public final void zzmt() {
        this.f4255l.f4143a = true;
    }

    public final void zzmu() {
        synchronized (this.f4258o) {
            this.f4260q = true;
            if (this.f4259p != null) {
                gb.f6131a.removeCallbacks(this.f4259p);
                gb.f6131a.post(this.f4259p);
            }
        }
    }

    public final void zzo(C1398a c1398a) {
        if (((Boolean) zzbv.zzen().m4217a(ado.cB)).booleanValue() && C1538g.m3946f()) {
            Configuration configuration = (Configuration) C1401c.m3585a(c1398a);
            zzbv.zzea();
            if (gb.m5456a(this.f4246c, configuration)) {
                this.f4246c.getWindow().addFlags(1024);
                this.f4246c.getWindow().clearFlags(ItemAnimator.FLAG_MOVED);
                return;
            }
            this.f4246c.getWindow().addFlags(ItemAnimator.FLAG_MOVED);
            this.f4246c.getWindow().clearFlags(1024);
        }
    }
}
