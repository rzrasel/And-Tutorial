package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.C0488l;

public class StreetViewPanoramaView extends FrameLayout {
    private final C0446i f2066a;
    private C0444g f2067b;

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2066a = new C0446i(this, context);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2066a = new C0446i(this, context);
    }

    public final C0444g getStreetViewPanorama() {
        if (this.f2067b != null) {
            return this.f2067b;
        }
        this.f2066a.m3176g();
        if (this.f2066a.f387a == null) {
            return null;
        }
        try {
            this.f2067b = new C0444g(((C0447j) this.f2066a.f387a).f2115a.mo1006a());
            return this.f2067b;
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }
}
