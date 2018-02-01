package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.v4.p018f.C0477m;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.internal.aak;
import com.google.android.gms.internal.aan;
import com.google.android.gms.internal.aaq;
import com.google.android.gms.internal.abh;
import com.google.android.gms.internal.abn;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.adr;
import com.google.android.gms.internal.aei;
import com.google.android.gms.internal.agt;
import com.google.android.gms.internal.agx;
import com.google.android.gms.internal.aha;
import com.google.android.gms.internal.ahd;
import com.google.android.gms.internal.ahg;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.eo;
import com.google.android.gms.internal.eq;
import com.google.android.gms.internal.gp;
import com.google.android.gms.internal.hr;
import com.google.android.gms.internal.hz;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.nh;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzjb;
import com.google.android.gms.internal.zzle;
import com.google.android.gms.internal.zzmd;
import com.google.android.gms.internal.zzot;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@aqv
public final class zzbw implements OnGlobalLayoutListener, OnScrollChangedListener {
    private boolean f4418A;
    private boolean f4419B;
    final String f4420a;
    final nh f4421b;
    zzbx f4422c;
    aan f4423d;
    aaq f4424e;
    abh f4425f;
    abn f4426g;
    agt f4427h;
    agx f4428i;
    C0477m<String, aha> f4429j;
    C0477m<String, ahd> f4430k;
    zzot f4431l;
    zzmd f4432m;
    zzle f4433n;
    ahg f4434o;
    List<Integer> f4435p;
    aei f4436q;
    ch f4437r;
    List<String> f4438s;
    View f4439t;
    boolean f4440u;
    private HashSet<eg> f4441v;
    private int f4442w;
    private int f4443x;
    private hr f4444y;
    private boolean f4445z;
    public final Context zzaie;
    public String zzath;
    public final zzajk zzatj;
    public eq zzatl;
    public gp zzatm;
    public zzjb zzatn;
    public ee zzato;
    public ef zzatp;
    public eg zzatq;
    public eo zzauh;
    public int zzauj;

    public zzbw(Context context, zzjb com_google_android_gms_internal_zzjb, String str, zzajk com_google_android_gms_internal_zzajk) {
        this(context, com_google_android_gms_internal_zzjb, str, com_google_android_gms_internal_zzajk, (byte) 0);
    }

    private zzbw(Context context, zzjb com_google_android_gms_internal_zzjb, String str, zzajk com_google_android_gms_internal_zzajk, byte b) {
        this.zzauh = null;
        this.f4439t = null;
        this.zzauj = 0;
        this.f4440u = false;
        this.f4441v = null;
        this.f4442w = -1;
        this.f4443x = -1;
        this.f4445z = true;
        this.f4418A = true;
        this.f4419B = false;
        ado.m4219a(context);
        if (zzbv.zzee().m5347e() != null) {
            Iterable b2 = ado.m4221b();
            if (com_google_android_gms_internal_zzajk.f7707b != 0) {
                b2.add(Integer.toString(com_google_android_gms_internal_zzajk.f7707b));
            }
            adr e = zzbv.zzee().m5347e();
            if (!(b2 == null || b2.isEmpty())) {
                e.f4922b.put("e", TextUtils.join(",", b2));
            }
        }
        this.f4420a = UUID.randomUUID().toString();
        if (com_google_android_gms_internal_zzjb.f7761d || com_google_android_gms_internal_zzjb.f7765h) {
            this.f4422c = null;
        } else {
            this.f4422c = new zzbx(context, str, com_google_android_gms_internal_zzajk.f7706a, this, this);
            this.f4422c.setMinimumWidth(com_google_android_gms_internal_zzjb.f7763f);
            this.f4422c.setMinimumHeight(com_google_android_gms_internal_zzjb.f7760c);
            this.f4422c.setVisibility(4);
        }
        this.zzatn = com_google_android_gms_internal_zzjb;
        this.zzath = str;
        this.zzaie = context;
        this.zzatj = com_google_android_gms_internal_zzajk;
        this.f4421b = new nh(new zzah(this));
        this.f4444y = new hr(200);
        this.f4430k = new C0477m();
    }

    private final void m3774a(boolean z) {
        boolean z2 = true;
        if (this.f4422c != null && this.zzato != null && this.zzato.f5953b != null && this.zzato.f5953b.mo2163k() != null) {
            if (!z || this.f4444y.m5599a()) {
                if (this.zzato.f5953b.mo2163k().m5732a()) {
                    int[] iArr = new int[2];
                    this.f4422c.getLocationOnScreen(iArr);
                    aak.m4022a();
                    int b = hz.m5623b(this.zzaie, iArr[0]);
                    aak.m4022a();
                    int b2 = hz.m5623b(this.zzaie, iArr[1]);
                    if (!(b == this.f4442w && b2 == this.f4443x)) {
                        this.f4442w = b;
                        this.f4443x = b2;
                        jg k = this.zzato.f5953b.mo2163k();
                        b = this.f4442w;
                        int i = this.f4443x;
                        if (z) {
                            z2 = false;
                        }
                        k.m5724a(b, i, z2);
                    }
                }
                if (this.f4422c != null) {
                    View findViewById = this.f4422c.getRootView().findViewById(16908290);
                    if (findViewById != null) {
                        Rect rect = new Rect();
                        Rect rect2 = new Rect();
                        this.f4422c.getGlobalVisibleRect(rect);
                        findViewById.getGlobalVisibleRect(rect2);
                        if (rect.top != rect2.top) {
                            this.f4445z = false;
                        }
                        if (rect.bottom != rect2.bottom) {
                            this.f4418A = false;
                        }
                    }
                }
            }
        }
    }

    public final void onGlobalLayout() {
        m3774a(false);
    }

    public final void onScrollChanged() {
        m3774a(true);
        this.f4419B = true;
    }

    public final void zza(HashSet<eg> hashSet) {
        this.f4441v = hashSet;
    }

    public final void zzf(boolean z) {
        if (!(this.zzauj != 0 || this.zzato == null || this.zzato.f5953b == null)) {
            this.zzato.f5953b.stopLoading();
        }
        if (this.zzatl != null) {
            this.zzatl.mo1473f();
        }
        if (this.zzatm != null) {
            this.zzatm.mo1473f();
        }
        if (z) {
            this.zzato = null;
        }
    }

    public final HashSet<eg> zzfa() {
        return this.f4441v;
    }

    public final void zzfb() {
        if (this.zzato != null && this.zzato.f5953b != null) {
            this.zzato.f5953b.destroy();
        }
    }

    public final void zzfc() {
        if (this.zzato != null && this.zzato.f5966o != null) {
            try {
                this.zzato.f5966o.mo1908c();
            } catch (RemoteException e) {
                id.m5370a("Could not destroy mediation adapter.");
            }
        }
    }

    public final boolean zzfd() {
        return this.zzauj == 0;
    }

    public final boolean zzfe() {
        return this.zzauj == 1;
    }

    public final String zzff() {
        return (this.f4445z && this.f4418A) ? "" : this.f4445z ? this.f4419B ? "top-scrollable" : "top-locked" : this.f4418A ? this.f4419B ? "bottom-scrollable" : "bottom-locked" : "";
    }
}
