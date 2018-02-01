package com.google.android.gms.internal;

import android.view.View;
import java.lang.ref.WeakReference;

public final class wq implements xv {
    private final WeakReference<View> f7366a;
    private final WeakReference<ee> f7367b;

    public wq(View view, ee eeVar) {
        this.f7366a = new WeakReference(view);
        this.f7367b = new WeakReference(eeVar);
    }

    public final View mo2318a() {
        return (View) this.f7366a.get();
    }

    public final boolean mo2319b() {
        return this.f7366a.get() == null || this.f7367b.get() == null;
    }

    public final xv mo2320c() {
        return new wp((View) this.f7366a.get(), (ee) this.f7367b.get());
    }
}
