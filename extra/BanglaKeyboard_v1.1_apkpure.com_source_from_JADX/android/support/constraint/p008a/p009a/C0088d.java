package android.support.constraint.p008a.p009a;

import android.support.constraint.p008a.C0096e;
import android.support.constraint.p008a.p009a.C0081a.C0080c;
import java.util.ArrayList;

public final class C0088d extends C0084b {
    protected float af = -1.0f;
    protected int ag = -1;
    protected int ah = -1;
    int ai = 0;
    private C0081a aj = this.j;
    private boolean ak = false;
    private int al = 0;
    private C0089e am = new C0089e();
    private int an = 8;

    public C0088d() {
        this.q.clear();
        this.q.add(this.aj);
    }

    public final C0081a mo35a(C0080c c0080c) {
        switch (c0080c) {
            case LEFT:
            case RIGHT:
                if (this.ai == 1) {
                    return this.aj;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.ai == 0) {
                    return this.aj;
                }
                break;
        }
        return null;
    }

    public final void m161a(float f) {
        if (f > -1.0f) {
            this.af = f;
            this.ag = -1;
            this.ah = -1;
        }
    }

    public final void mo36a(C0096e c0096e) {
        C0086c c0086c = (C0086c) this.f350r;
        if (c0086c != null) {
            Object a;
            Object a2 = c0086c.mo35a(C0080c.LEFT);
            C0081a a3 = c0086c.mo35a(C0080c.RIGHT);
            if (this.ai == 0) {
                a3 = c0086c.mo35a(C0080c.TOP);
                a = c0086c.mo35a(C0080c.BOTTOM);
                a2 = a3;
            } else {
                C0081a c0081a = a3;
            }
            if (this.ag != -1) {
                c0096e.m204a(C0096e.m192a(c0096e, c0096e.m202a(this.aj), c0096e.m202a(a2), this.ag, false));
            } else if (this.ah != -1) {
                c0096e.m204a(C0096e.m192a(c0096e, c0096e.m202a(this.aj), c0096e.m202a(a), -this.ah, false));
            } else if (this.af != -1.0f) {
                c0096e.m204a(C0096e.m193a(c0096e, c0096e.m202a(this.aj), c0096e.m202a(a2), c0096e.m202a(a), this.af, this.ak));
            }
        }
    }

    public final void m163i(int i) {
        if (this.ai != i) {
            this.ai = i;
            this.q.clear();
            if (this.ai == 1) {
                this.aj = this.i;
            } else {
                this.aj = this.j;
            }
            this.q.add(this.aj);
        }
    }

    public final void m164j(int i) {
        if (i >= 0) {
            this.af = -1.0f;
            this.ag = i;
            this.ah = -1;
        }
    }

    public final void m165k(int i) {
        if (i >= 0) {
            this.af = -1.0f;
            this.ag = -1;
            this.ah = i;
        }
    }

    public final ArrayList<C0081a> mo37s() {
        return this.q;
    }

    public final void mo38v() {
        if (this.f350r != null) {
            int b = C0096e.m196b(this.aj);
            if (this.ai == 1) {
                m107a(b);
                m113b(0);
                m120d(this.f350r.m130i());
                m117c(0);
                return;
            }
            m107a(0);
            m113b(b);
            m117c(this.f350r.m124f());
            m120d(0);
        }
    }

    public final int m168w() {
        return this.ai;
    }

    public final float m169x() {
        return this.af;
    }

    public final int m170y() {
        return this.ag;
    }

    public final int m171z() {
        return this.ah;
    }
}
