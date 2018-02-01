package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.jf;

@aqv
public final class zzr {
    public final int index;
    public final ViewGroup parent;
    public final Context zzaie;
    public final LayoutParams zzcgt;

    public zzr(jf jfVar) {
        this.zzcgt = jfVar.getLayoutParams();
        ViewParent parent = jfVar.getParent();
        this.zzaie = jfVar.mo2158f();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new C1465t("Could not get the parent of the WebView for an overlay.");
        }
        this.parent = (ViewGroup) parent;
        ViewGroup viewGroup = this.parent;
        if (jfVar == null) {
            throw null;
        }
        this.index = viewGroup.indexOfChild((View) jfVar);
        viewGroup = this.parent;
        if (jfVar == null) {
            throw null;
        }
        viewGroup.removeView((View) jfVar);
        jfVar.mo2146a(true);
    }
}
