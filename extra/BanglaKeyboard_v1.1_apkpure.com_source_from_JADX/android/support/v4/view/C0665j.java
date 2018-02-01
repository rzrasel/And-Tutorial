package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

public final class C0665j {
    public boolean f1965a;
    private ViewParent f1966b;
    private ViewParent f1967c;
    private final View f1968d;
    private int[] f1969e;

    public C0665j(View view) {
        this.f1968d = view;
    }

    private void m1780a(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.f1966b = viewParent;
                return;
            case 1:
                this.f1967c = viewParent;
                return;
            default:
                return;
        }
    }

    private ViewParent m1781c(int i) {
        switch (i) {
            case 0:
                return this.f1966b;
            case 1:
                return this.f1967c;
            default:
                return null;
        }
    }

    public final void m1782a(boolean z) {
        if (this.f1965a) {
            C0679r.m1951x(this.f1968d);
        }
        this.f1965a = z;
    }

    public final boolean m1783a(float f, float f2) {
        if (!this.f1965a) {
            return false;
        }
        ViewParent c = m1781c(0);
        return c != null ? C0688u.m1978a(c, this.f1968d, f, f2) : false;
    }

    public final boolean m1784a(float f, float f2, boolean z) {
        if (!this.f1965a) {
            return false;
        }
        ViewParent c = m1781c(0);
        return c != null ? C0688u.m1979a(c, this.f1968d, f, f2, z) : false;
    }

    public final boolean m1785a(int i) {
        return m1781c(i) != null;
    }

    public final boolean m1786a(int i, int i2) {
        if (m1785a(i2)) {
            return true;
        }
        if (this.f1965a) {
            View view = this.f1968d;
            for (ViewParent parent = this.f1968d.getParent(); parent != null; parent = parent.getParent()) {
                if (C0688u.m1980a(parent, view, this.f1968d, i, i2)) {
                    m1780a(i2, parent);
                    C0688u.m1981b(parent, view, this.f1968d, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final boolean m1787a(int i, int i2, int i3, int i4, int[] iArr) {
        return m1788a(i, i2, i3, i4, iArr, 0);
    }

    public final boolean m1788a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        if (this.f1965a) {
            ViewParent c = m1781c(i5);
            if (c == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                int i6;
                int i7;
                if (iArr != null) {
                    this.f1968d.getLocationInWindow(iArr);
                    int i8 = iArr[0];
                    i6 = iArr[1];
                    i7 = i8;
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                C0688u.m1976a(c, this.f1968d, i, i2, i3, i4, i5);
                if (iArr != null) {
                    this.f1968d.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i7;
                    iArr[1] = iArr[1] - i6;
                }
                return true;
            } else if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
        }
        return false;
    }

    public final boolean m1789a(int i, int i2, int[] iArr, int[] iArr2) {
        return m1790a(i, i2, iArr, iArr2, 0);
    }

    public final boolean m1790a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (this.f1965a) {
            ViewParent c = m1781c(i3);
            if (c == null) {
                return false;
            }
            if (i != 0 || i2 != 0) {
                int i4;
                int i5;
                int[] iArr3;
                if (iArr2 != null) {
                    this.f1968d.getLocationInWindow(iArr2);
                    int i6 = iArr2[0];
                    i4 = iArr2[1];
                    i5 = i6;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (iArr == null) {
                    if (this.f1969e == null) {
                        this.f1969e = new int[2];
                    }
                    iArr3 = this.f1969e;
                } else {
                    iArr3 = iArr;
                }
                iArr3[0] = 0;
                iArr3[1] = 0;
                C0688u.m1977a(c, this.f1968d, i, i2, iArr3, i3);
                if (iArr2 != null) {
                    this.f1968d.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    public final void m1791b(int i) {
        ViewParent c = m1781c(i);
        if (c != null) {
            C0688u.m1975a(c, this.f1968d, i);
            m1780a(i, null);
        }
    }
}
