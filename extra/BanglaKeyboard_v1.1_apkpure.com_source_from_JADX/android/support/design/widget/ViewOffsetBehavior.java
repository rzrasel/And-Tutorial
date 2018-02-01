package android.support.design.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.util.AttributeSet;
import android.view.View;

class ViewOffsetBehavior<V extends View> extends Behavior<V> {
    private C0262q f585a;
    private int f586b = 0;
    private int f587c = 0;

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean mo86a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo104c(coordinatorLayout, v, i);
        if (this.f585a == null) {
            this.f585a = new C0262q(v);
        }
        this.f585a.m697a();
        if (this.f586b != 0) {
            this.f585a.m698a(this.f586b);
            this.f586b = 0;
        }
        if (this.f587c != 0) {
            C0262q c0262q = this.f585a;
            int i2 = this.f587c;
            if (c0262q.f1083c != i2) {
                c0262q.f1083c = i2;
                c0262q.m699b();
            }
            this.f587c = 0;
        }
        return true;
    }

    public boolean a_(int i) {
        if (this.f585a != null) {
            return this.f585a.m698a(i);
        }
        this.f586b = i;
        return false;
    }

    public int mo103c() {
        return this.f585a != null ? this.f585a.f1082b : 0;
    }

    protected void mo104c(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m484a((View) v, i);
    }
}
