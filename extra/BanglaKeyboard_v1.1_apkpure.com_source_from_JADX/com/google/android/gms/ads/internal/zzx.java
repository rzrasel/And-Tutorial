package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.internal.aak;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.amc;
import com.google.android.gms.internal.amo;
import com.google.android.gms.internal.amr;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.dq;
import com.google.android.gms.internal.dt;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.hz;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.xh;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzix;
import com.google.android.gms.internal.zzjb;
import com.google.android.gms.p056a.C1401c;
import java.lang.ref.WeakReference;
import java.util.List;

@aqv
public final class zzx extends zzi implements OnGlobalLayoutListener, OnScrollChangedListener {
    private boolean f4456h;
    private WeakReference<Object> f4457i = new WeakReference(null);

    public zzx(Context context, zzjb com_google_android_gms_internal_zzjb, String str, amc com_google_android_gms_internal_amc, zzajk com_google_android_gms_internal_zzajk, zzv com_google_android_gms_ads_internal_zzv) {
        super(context, com_google_android_gms_internal_zzjb, str, com_google_android_gms_internal_amc, com_google_android_gms_internal_zzajk, com_google_android_gms_ads_internal_zzv);
    }

    private final boolean m3782a(ee eeVar, ee eeVar2) {
        if (eeVar2.f5964m) {
            View zzd = zzas.zzd(eeVar2);
            if (zzd == null) {
                id.m5370a("Could not get mediation view");
                return false;
            }
            View nextView = this.zzams.f4422c.getNextView();
            if (nextView != null) {
                if (nextView instanceof jf) {
                    ((jf) nextView).destroy();
                }
                this.zzams.f4422c.removeView(nextView);
            }
            if (!zzas.zze(eeVar2)) {
                try {
                    if (zzbv.zzez().m5299b(this.zzams.zzaie)) {
                        new xh(this.zzams.zzaie, zzd).m6989a(new dt(this.zzams.zzaie, this.zzams.zzath));
                    }
                    m3707a(zzd);
                } catch (Throwable e) {
                    zzbv.zzee().m5336a(e, "BannerAdManager.swapViews");
                    id.m5371a("Could not add mediation view to view hierarchy.", e);
                    return false;
                }
            }
        } else if (!(eeVar2.f5971t == null || eeVar2.f5953b == null)) {
            eeVar2.f5953b.mo2143a(eeVar2.f5971t);
            this.zzams.f4422c.removeAllViews();
            this.zzams.f4422c.setMinimumWidth(eeVar2.f5971t.f7763f);
            this.zzams.f4422c.setMinimumHeight(eeVar2.f5971t.f7760c);
            jf jfVar = eeVar2.f5953b;
            if (jfVar == null) {
                throw null;
            }
            m3707a((View) jfVar);
        }
        if (this.zzams.f4422c.getChildCount() > 1) {
            this.zzams.f4422c.showNext();
        }
        if (eeVar != null) {
            View nextView2 = this.zzams.f4422c.getNextView();
            if (nextView2 instanceof jf) {
                ((jf) nextView2).mo2139a(this.zzams.zzaie, this.zzams.zzatn, this.a);
            } else if (nextView2 != null) {
                this.zzams.f4422c.removeView(nextView2);
            }
            this.zzams.zzfc();
        }
        this.zzams.f4422c.setVisibility(0);
        return true;
    }

    protected final jf mo1616a(ef efVar, zzw com_google_android_gms_ads_internal_zzw, dq dqVar) {
        if (this.zzams.zzatn.f7764g == null && this.zzams.zzatn.f7766i) {
            zzjb com_google_android_gms_internal_zzjb;
            zzbw com_google_android_gms_ads_internal_zzbw = this.zzams;
            if (efVar.f5979b.f7679y) {
                com_google_android_gms_internal_zzjb = this.zzams.zzatn;
            } else {
                AdSize adSize;
                String str = efVar.f5979b.f7666l;
                if (str != null) {
                    String[] split = str.split("[xX]");
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    adSize = new AdSize(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } else {
                    adSize = this.zzams.zzatn.m7110c();
                }
                com_google_android_gms_internal_zzjb = new zzjb(this.zzams.zzaie, adSize);
            }
            com_google_android_gms_ads_internal_zzbw.zzatn = com_google_android_gms_internal_zzjb;
        }
        return super.mo1616a(efVar, com_google_android_gms_ads_internal_zzw, dqVar);
    }

    final void m3784b(ee eeVar) {
        if (eeVar != null && !eeVar.f5963l && this.zzams.f4422c != null) {
            zzbv.zzea();
            if (gb.m5459a(this.zzams.f4422c, this.zzams.zzaie) && this.zzams.f4422c.getGlobalVisibleRect(new Rect(), null)) {
                if (!(eeVar == null || eeVar.f5953b == null || eeVar.f5953b.mo2163k() == null)) {
                    eeVar.f5953b.mo2163k().f6296j = null;
                }
                zza(eeVar, false);
                eeVar.f5963l = true;
            }
        }
    }

    protected final boolean mo1637c() {
        boolean z = true;
        zzbv.zzea();
        if (!gb.m5458a(this.zzams.zzaie, this.zzams.zzaie.getPackageName(), "android.permission.INTERNET")) {
            aak.m4022a();
            hz.m5620a(this.zzams.f4422c, this.zzams.zzatn, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        }
        zzbv.zzea();
        if (!gb.m5457a(this.zzams.zzaie)) {
            aak.m4022a();
            hz.m5620a(this.zzams.f4422c, this.zzams.zzatn, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!(z || this.zzams.f4422c == null)) {
            this.zzams.f4422c.setVisibility(0);
        }
        return z;
    }

    public final abv getVideoController() {
        C1516t.m3867b("getVideoController must be called from the main thread.");
        return (this.zzams.zzato == null || this.zzams.zzato.f5953b == null) ? null : this.zzams.zzato.f5953b.mo2187y();
    }

    public final void onGlobalLayout() {
        m3784b(this.zzams.zzato);
    }

    public final void onScrollChanged() {
        m3784b(this.zzams.zzato);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        C1516t.m3867b("setManualImpressionsEnabled must be called from the main thread.");
        this.f4456h = z;
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    protected final void zza(ee eeVar, boolean z) {
        super.zza(eeVar, z);
        if (zzas.zze(eeVar)) {
            zzab com_google_android_gms_ads_internal_zzab = new zzab(this);
            if (eeVar != null && zzas.zze(eeVar)) {
                Object obj;
                jf jfVar = eeVar.f5953b;
                if (jfVar == null) {
                    obj = null;
                } else if (jfVar == null) {
                    throw null;
                } else {
                    obj = (View) jfVar;
                }
                if (obj == null) {
                    id.m5370a("AdWebView is null");
                    return;
                }
                try {
                    List list = eeVar.f5965n != null ? eeVar.f5965n.f5295p : null;
                    if (list == null || list.isEmpty()) {
                        id.m5370a("No template ids present in mediation response");
                        return;
                    }
                    amo h = eeVar.f5966o != null ? eeVar.f5966o.mo1913h() : null;
                    amr i = eeVar.f5966o != null ? eeVar.f5966o.mo1914i() : null;
                    if (list.contains("2") && h != null) {
                        h.mo1924b(C1401c.m3584a(obj));
                        if (!h.mo1933j()) {
                            h.mo1932i();
                        }
                        jfVar.mo2163k().m5728a("/nativeExpressViewClicked", zzas.m3741a(h, null, com_google_android_gms_ads_internal_zzab));
                    } else if (!list.contains("1") || i == null) {
                        id.m5370a("No matching template id and mapper");
                    } else {
                        i.mo1943b(C1401c.m3584a(obj));
                        if (!i.mo1950h()) {
                            i.mo1949g();
                        }
                        jfVar.mo2163k().m5728a("/nativeExpressViewClicked", zzas.m3741a(null, i, com_google_android_gms_ads_internal_zzab));
                    }
                } catch (Throwable e) {
                    id.m5371a("Error occurred while recording impression and registering for clicks", e);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(com.google.android.gms.internal.ee r5, com.google.android.gms.internal.ee r6) {
        /*
        r4 = this;
        r2 = 0;
        r1 = 0;
        r0 = super.zza(r5, r6);
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        r0 = r1;
    L_0x0009:
        return r0;
    L_0x000a:
        r0 = r4.zzams;
        r0 = r0.zzfd();
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r4.m3782a(r5, r6);
        if (r0 != 0) goto L_0x001d;
    L_0x0018:
        r4.zzg(r1);
        r0 = r1;
        goto L_0x0009;
    L_0x001d:
        r0 = r6.f5962k;
        if (r0 == 0) goto L_0x009e;
    L_0x0021:
        r4.m3784b(r6);
        com.google.android.gms.ads.internal.zzbv.zzey();
        r0 = r4.zzams;
        r0 = r0.f4422c;
        com.google.android.gms.internal.ja.m5655a(r0, r4);
        com.google.android.gms.ads.internal.zzbv.zzey();
        r0 = r4.zzams;
        r0 = r0.f4422c;
        com.google.android.gms.internal.ja.m5656a(r0, r4);
        r0 = r6.f5963l;
        if (r0 != 0) goto L_0x0054;
    L_0x003c:
        r1 = new com.google.android.gms.ads.internal.au;
        r1.<init>(r4);
        r0 = r6.f5953b;
        if (r0 == 0) goto L_0x009c;
    L_0x0045:
        r0 = r6.f5953b;
        r0 = r0.mo2163k();
    L_0x004b:
        if (r0 == 0) goto L_0x0054;
    L_0x004d:
        r3 = new com.google.android.gms.ads.internal.av;
        r3.<init>(r6, r1);
        r0.f6296j = r3;
    L_0x0054:
        r0 = r6.f5953b;
        if (r0 == 0) goto L_0x0078;
    L_0x0058:
        r0 = r6.f5953b;
        r0 = r0.mo2187y();
        r1 = r6.f5953b;
        r1 = r1.mo2163k();
        if (r1 == 0) goto L_0x0069;
    L_0x0066:
        r1.m5739g();
    L_0x0069:
        r1 = r4.zzams;
        r1 = r1.f4432m;
        if (r1 == 0) goto L_0x0078;
    L_0x006f:
        if (r0 == 0) goto L_0x0078;
    L_0x0071:
        r1 = r4.zzams;
        r1 = r1.f4432m;
        r0.m5868a(r1);
    L_0x0078:
        r0 = r4.zzams;
        r0 = r0.zzfd();
        if (r0 == 0) goto L_0x010d;
    L_0x0080:
        r0 = r6.f5953b;
        if (r0 == 0) goto L_0x00fc;
    L_0x0084:
        r0 = r6.f5961j;
        if (r0 == 0) goto L_0x0091;
    L_0x0088:
        r0 = r4.f;
        r1 = r4.zzams;
        r1 = r1.zzatn;
        r0.m6916a(r1, r6);
    L_0x0091:
        r1 = new com.google.android.gms.internal.xh;
        r0 = r4.zzams;
        r3 = r0.zzaie;
        r0 = r6.f5953b;
        if (r0 != 0) goto L_0x00bc;
    L_0x009b:
        throw r2;
    L_0x009c:
        r0 = r2;
        goto L_0x004b;
    L_0x009e:
        r0 = r4.zzams;
        r0 = r0.zzfe();
        if (r0 == 0) goto L_0x00b8;
    L_0x00a6:
        r0 = com.google.android.gms.internal.ado.bI;
        r3 = com.google.android.gms.ads.internal.zzbv.zzen();
        r0 = r3.m4217a(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0054;
    L_0x00b8:
        r4.zza(r6, r1);
        goto L_0x0054;
    L_0x00bc:
        r0 = (android.view.View) r0;
        r1.<init>(r3, r0);
        r0 = com.google.android.gms.ads.internal.zzbv.zzez();
        r2 = r4.zzams;
        r2 = r2.zzaie;
        r0 = r0.m5299b(r2);
        if (r0 == 0) goto L_0x00f1;
    L_0x00cf:
        r0 = r6.f5952a;
        r0 = com.google.android.gms.ads.internal.zza.m3703a(r0);
        if (r0 == 0) goto L_0x00f1;
    L_0x00d7:
        r0 = r4.zzams;
        r0 = r0.zzath;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x00f1;
    L_0x00e1:
        r0 = new com.google.android.gms.internal.dt;
        r2 = r4.zzams;
        r2 = r2.zzaie;
        r3 = r4.zzams;
        r3 = r3.zzath;
        r0.<init>(r2, r3);
        r1.m6989a(r0);
    L_0x00f1:
        r0 = r6.m5317a();
        if (r0 == 0) goto L_0x00ff;
    L_0x00f7:
        r0 = r6.f5953b;
        r1.m6989a(r0);
    L_0x00fc:
        r0 = 1;
        goto L_0x0009;
    L_0x00ff:
        r0 = r6.f5953b;
        r0 = r0.mo2163k();
        r2 = new com.google.android.gms.ads.internal.a;
        r2.<init>(r1, r6);
        r0.f6291e = r2;
        goto L_0x00fc;
    L_0x010d:
        r0 = r4.zzams;
        r0 = r0.f4439t;
        if (r0 == 0) goto L_0x00fc;
    L_0x0113:
        r0 = r6.f5961j;
        if (r0 == 0) goto L_0x00fc;
    L_0x0117:
        r0 = r4.f;
        r1 = r4.zzams;
        r1 = r1.zzatn;
        r2 = r4.zzams;
        r2 = r2.f4439t;
        r0.m6917a(r1, r6, r2);
        goto L_0x00fc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzx.zza(com.google.android.gms.internal.ee, com.google.android.gms.internal.ee):boolean");
    }

    public final boolean zzb(zzix com_google_android_gms_internal_zzix) {
        if (com_google_android_gms_internal_zzix.f7747h != this.f4456h) {
            int i = com_google_android_gms_internal_zzix.f7740a;
            long j = com_google_android_gms_internal_zzix.f7741b;
            Bundle bundle = com_google_android_gms_internal_zzix.f7742c;
            int i2 = com_google_android_gms_internal_zzix.f7743d;
            List list = com_google_android_gms_internal_zzix.f7744e;
            boolean z = com_google_android_gms_internal_zzix.f7745f;
            int i3 = com_google_android_gms_internal_zzix.f7746g;
            boolean z2 = com_google_android_gms_internal_zzix.f7747h || this.f4456h;
            com_google_android_gms_internal_zzix = new zzix(i, j, bundle, i2, list, z, i3, z2, com_google_android_gms_internal_zzix.f7748i, com_google_android_gms_internal_zzix.f7749j, com_google_android_gms_internal_zzix.f7750k, com_google_android_gms_internal_zzix.f7751l, com_google_android_gms_internal_zzix.f7752m, com_google_android_gms_internal_zzix.f7753n, com_google_android_gms_internal_zzix.f7754o, com_google_android_gms_internal_zzix.f7755p, com_google_android_gms_internal_zzix.f7756q, com_google_android_gms_internal_zzix.f7757r);
        }
        return super.zzb(com_google_android_gms_internal_zzix);
    }
}
