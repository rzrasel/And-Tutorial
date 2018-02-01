package android.support.constraint.p008a.p009a;

import android.support.constraint.p008a.C0101g;
import android.support.constraint.p008a.C0101g.C0100a;
import java.util.HashSet;

public final class C0081a {
    final C0084b f291a;
    final C0080c f292b;
    C0081a f293c;
    public int f294d = 0;
    int f295e = -1;
    int f296f = C0079b.f277a;
    int f297g = C0078a.f274a;
    int f298h = 0;
    public C0101g f299i;
    int f300j = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    public enum C0078a {
        ;

        static {
            f274a = 1;
            f275b = 2;
            f276c = new int[]{f274a, f275b};
        }
    }

    public enum C0079b {
        ;

        static {
            f277a = 1;
            f278b = 2;
            f279c = 3;
            f280d = new int[]{f277a, f278b, f279c};
        }
    }

    public enum C0080c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0081a(C0084b c0084b, C0080c c0080c) {
        this.f291a = c0084b;
        this.f292b = c0080c;
    }

    private String m98a(HashSet<C0081a> hashSet) {
        if (!hashSet.add(this)) {
            return "<-";
        }
        return this.f291a.f319M + ":" + this.f292b.toString() + (this.f293c != null ? " connected to " + this.f293c.m98a(hashSet) : "");
    }

    public final void m99a() {
        if (this.f299i == null) {
            this.f299i = new C0101g(C0100a.f407a);
        } else {
            this.f299i.m222b();
        }
    }

    public final boolean m100a(C0081a c0081a, int i, int i2, int i3, int i4, boolean z) {
        if (c0081a == null) {
            this.f293c = null;
            this.f294d = 0;
            this.f295e = -1;
            this.f296f = C0079b.f277a;
            this.f298h = 2;
            return true;
        }
        if (!z) {
            int i5;
            if (c0081a != null) {
                C0080c c0080c = c0081a.f292b;
                boolean z2;
                if (c0080c != this.f292b) {
                    switch (this.f292b) {
                        case CENTER:
                            if (c0080c != C0080c.BASELINE && c0080c != C0080c.CENTER_X && c0080c != C0080c.CENTER_Y) {
                                z2 = true;
                                break;
                            }
                            i5 = 0;
                            break;
                            break;
                        case LEFT:
                        case RIGHT:
                            i5 = (c0080c == C0080c.LEFT || c0080c == C0080c.RIGHT) ? true : 0;
                            if (c0081a.f291a instanceof C0088d) {
                                if (i5 == 0 && c0080c != C0080c.CENTER_X) {
                                    i5 = 0;
                                    break;
                                }
                                z2 = true;
                                break;
                            }
                            break;
                        case TOP:
                        case BOTTOM:
                            i5 = (c0080c == C0080c.TOP || c0080c == C0080c.BOTTOM) ? true : 0;
                            if (c0081a.f291a instanceof C0088d) {
                                if (i5 == 0 && c0080c != C0080c.CENTER_Y) {
                                    i5 = 0;
                                    break;
                                }
                                z2 = true;
                                break;
                            }
                            break;
                    }
                } else if (this.f292b != C0080c.CENTER) {
                    if (this.f292b != C0080c.BASELINE || (c0081a.f291a.m139r() && this.f291a.m139r())) {
                        z2 = true;
                    } else {
                        i5 = 0;
                    }
                    if (i5 == 0) {
                        return false;
                    }
                }
            }
            i5 = 0;
            if (i5 == 0) {
                return false;
            }
        }
        this.f293c = c0081a;
        if (i > 0) {
            this.f294d = i;
        } else {
            this.f294d = 0;
        }
        this.f295e = i2;
        this.f296f = i3;
        this.f298h = i4;
        return true;
    }

    public final int m101b() {
        return this.f291a.f318L == 8 ? 0 : (this.f295e < 0 || this.f293c == null || this.f293c.f291a.f318L != 8) ? this.f294d : this.f295e;
    }

    public final void m102c() {
        this.f293c = null;
        this.f294d = 0;
        this.f295e = -1;
        this.f296f = C0079b.f278b;
        this.f298h = 0;
        this.f297g = C0078a.f274a;
    }

    public final boolean m103d() {
        return this.f293c != null;
    }

    public final String toString() {
        return this.f291a.f319M + ":" + this.f292b.toString() + (this.f293c != null ? " connected to " + this.f293c.m98a(new HashSet()) : "");
    }
}
