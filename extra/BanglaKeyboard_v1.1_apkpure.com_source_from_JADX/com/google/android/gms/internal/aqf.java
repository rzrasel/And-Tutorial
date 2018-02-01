package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.zzbc;
import java.lang.ref.WeakReference;

@aqv
public final class aqf {
    final Context f5633a;
    final nh f5634b;
    final ef f5635c;
    final aec f5636d;
    final zzbc f5637e;
    OnGlobalLayoutListener f5638f;
    OnScrollChangedListener f5639g;
    private final Object f5640h = new Object();
    private hr f5641i;
    private int f5642j = -1;
    private int f5643k = -1;

    public aqf(Context context, nh nhVar, ef efVar, aec com_google_android_gms_internal_aec, zzbc com_google_android_gms_ads_internal_zzbc) {
        this.f5633a = context;
        this.f5634b = nhVar;
        this.f5635c = efVar;
        this.f5636d = com_google_android_gms_internal_aec;
        this.f5637e = com_google_android_gms_ads_internal_zzbc;
        this.f5641i = new hr(200);
    }

    static /* synthetic */ void m5077a(aqf com_google_android_gms_internal_aqf, WeakReference weakReference, boolean z) {
        if (weakReference != null) {
            jf jfVar = (jf) weakReference.get();
            if (jfVar == null) {
                return;
            }
            if (jfVar == null) {
                throw null;
            } else if (((View) jfVar) != null) {
                if (z && !com_google_android_gms_internal_aqf.f5641i.m5599a()) {
                    return;
                }
                if (jfVar == null) {
                    throw null;
                }
                int[] iArr = new int[2];
                ((View) jfVar).getLocationOnScreen(iArr);
                aak.m4022a();
                int b = hz.m5623b(com_google_android_gms_internal_aqf.f5633a, iArr[0]);
                aak.m4022a();
                int b2 = hz.m5623b(com_google_android_gms_internal_aqf.f5633a, iArr[1]);
                synchronized (com_google_android_gms_internal_aqf.f5640h) {
                    if (!(com_google_android_gms_internal_aqf.f5642j == b && com_google_android_gms_internal_aqf.f5643k == b2)) {
                        com_google_android_gms_internal_aqf.f5642j = b;
                        com_google_android_gms_internal_aqf.f5643k = b2;
                        jfVar.mo2163k().m5724a(com_google_android_gms_internal_aqf.f5642j, com_google_android_gms_internal_aqf.f5643k, !z);
                    }
                }
            }
        }
    }
}
