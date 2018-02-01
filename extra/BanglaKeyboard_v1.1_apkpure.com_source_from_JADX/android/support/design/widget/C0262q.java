package android.support.design.widget;

import android.support.v4.view.C0679r;
import android.view.View;

final class C0262q {
    int f1081a;
    int f1082b;
    int f1083c;
    private final View f1084d;
    private int f1085e;

    public C0262q(View view) {
        this.f1084d = view;
    }

    public final void m697a() {
        this.f1081a = this.f1084d.getTop();
        this.f1085e = this.f1084d.getLeft();
        m699b();
    }

    public final boolean m698a(int i) {
        if (this.f1082b == i) {
            return false;
        }
        this.f1082b = i;
        m699b();
        return true;
    }

    final void m699b() {
        C0679r.m1924b(this.f1084d, this.f1082b - (this.f1084d.getTop() - this.f1081a));
        C0679r.m1929c(this.f1084d, this.f1083c - (this.f1084d.getLeft() - this.f1085e));
    }
}
