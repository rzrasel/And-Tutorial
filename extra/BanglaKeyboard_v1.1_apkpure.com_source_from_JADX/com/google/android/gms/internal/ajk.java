package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;
import java.util.Map;

@aqv
public abstract class ajk {
    protected Context f5189a;
    private String f5190b;
    private WeakReference<jf> f5191c;

    public ajk(jf jfVar) {
        this.f5189a = jfVar.getContext();
        this.f5190b = zzbv.zzea().m5502a(this.f5189a, jfVar.mo2169n().f7706a);
        this.f5191c = new WeakReference(jfVar);
    }

    static /* synthetic */ void m4595a(ajk com_google_android_gms_internal_ajk, String str, Map map) {
        jf jfVar = (jf) com_google_android_gms_internal_ajk.f5191c.get();
        if (jfVar != null) {
            jfVar.mo2145a(str, map);
        }
    }

    public abstract void mo1866a();

    protected final void m4597a(String str, String str2, int i) {
        hz.f6240a.post(new ajm(this, str, str2, i));
    }

    public final void m4598a(String str, String str2, String str3, String str4) {
        hz.f6240a.post(new ajn(this, str, str2, str3, str4));
    }

    public abstract boolean mo1867a(String str);
}
