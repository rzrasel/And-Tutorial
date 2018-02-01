package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;

public final class C0119t {
    Object f346a;
    C0120u f347b;

    private C0119t(int i, Context context, Interpolator interpolator) {
        if (i >= 14) {
            this.f347b = new C0123x();
        } else if (i >= 9) {
            this.f347b = new C0122w();
        } else {
            this.f347b = new C0121v();
        }
        this.f346a = this.f347b.mo297a(context, interpolator);
    }

    C0119t(Context context, Interpolator interpolator) {
        this(VERSION.SDK_INT, context, interpolator);
    }

    public final int m691a() {
        return this.f347b.mo300b(this.f346a);
    }

    public final int m692b() {
        return this.f347b.mo301c(this.f346a);
    }

    public final void m693c() {
        this.f347b.mo303e(this.f346a);
    }
}
