package com.google.android.gms.internal;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

final class aqg implements Runnable {
    final /* synthetic */ JSONObject f5644a;
    final /* synthetic */ ir f5645b;
    final /* synthetic */ aqf f5646c;

    aqg(aqf com_google_android_gms_internal_aqf, JSONObject jSONObject, ir irVar) {
        this.f5646c = com_google_android_gms_internal_aqf;
        this.f5644a = jSONObject;
        this.f5645b = irVar;
    }

    public final void run() {
        try {
            aqf com_google_android_gms_internal_aqf = this.f5646c;
            zzbv.zzeb();
            jf a = jp.m5744a(com_google_android_gms_internal_aqf.f5633a, zzjb.m7106a(), false, false, com_google_android_gms_internal_aqf.f5634b, com_google_android_gms_internal_aqf.f5635c.f5978a.f7621k, com_google_android_gms_internal_aqf.f5636d, null, com_google_android_gms_internal_aqf.f5637e.zzbj(), com_google_android_gms_internal_aqf.f5635c.f5986i);
            this.f5646c.f5637e.zzd(a);
            WeakReference weakReference = new WeakReference(a);
            jg k = a.mo2163k();
            aqf com_google_android_gms_internal_aqf2 = this.f5646c;
            if (com_google_android_gms_internal_aqf2.f5638f == null) {
                com_google_android_gms_internal_aqf2.f5638f = new aql(com_google_android_gms_internal_aqf2, weakReference);
            }
            OnGlobalLayoutListener onGlobalLayoutListener = com_google_android_gms_internal_aqf2.f5638f;
            aqf com_google_android_gms_internal_aqf3 = this.f5646c;
            if (com_google_android_gms_internal_aqf3.f5639g == null) {
                com_google_android_gms_internal_aqf3.f5639g = new aqm(com_google_android_gms_internal_aqf3, weakReference);
            }
            k.m5725a(onGlobalLayoutListener, com_google_android_gms_internal_aqf3.f5639g);
            aqf com_google_android_gms_internal_aqf4 = this.f5646c;
            k = a.mo2163k();
            k.m5728a("/video", ahu.f5126l);
            k.m5728a("/videoMeta", ahu.f5127m);
            k.m5728a("/precache", ahu.f5129o);
            k.m5728a("/delayPageLoaded", ahu.f5132r);
            k.m5728a("/instrument", ahu.f5130p);
            k.m5728a("/log", ahu.f5121g);
            k.m5728a("/videoClicked", ahu.f5122h);
            k.m5728a("/trackActiveViewUnit", new aqj(com_google_android_gms_internal_aqf4));
            k.m5728a("/untrackActiveViewUnit", new aqk(com_google_android_gms_internal_aqf4));
            a.mo2163k().f6290d = new aqh(this, a);
            a.mo2163k().f6289c = new aqi(this);
            a.loadUrl((String) zzbv.zzen().m4217a(ado.bK));
        } catch (Throwable e) {
            id.m5371a("Exception occurred while getting video view", e);
            this.f5645b.m3633b(null);
        }
    }
}
