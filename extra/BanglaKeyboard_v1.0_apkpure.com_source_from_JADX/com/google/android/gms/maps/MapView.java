package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.C0488l;

public class MapView extends FrameLayout {
    private final C0442e f2054a;
    private C0439b f2055b;

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2054a = new C0442e(this, context, GoogleMapOptions.m2784a(context, attributeSet));
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2054a = new C0442e(this, context, GoogleMapOptions.m2784a(context, attributeSet));
    }

    public final C0439b getMap() {
        if (this.f2055b != null) {
            return this.f2055b;
        }
        this.f2054a.m3171g();
        if (this.f2054a.f387a == null) {
            return null;
        }
        try {
            this.f2055b = new C0439b(((C0441d) this.f2054a.f387a).f2103a.mo1131a());
            return this.f2055b;
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }
}
