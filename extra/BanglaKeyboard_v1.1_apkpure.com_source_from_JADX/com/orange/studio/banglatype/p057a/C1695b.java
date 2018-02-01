package com.orange.studio.banglatype.p057a;

import android.databinding.C0020d;
import android.databinding.C0043k;
import android.databinding.C0043k.C0029a;
import android.databinding.C0043k.C0037b;
import android.databinding.C0043k.C0040e;
import android.databinding.p000a.C0012a;
import android.databinding.p001b.p002a.C0015a;
import android.databinding.p001b.p002a.C0015a.C0014a;
import android.databinding.p001b.p002a.C0017b;
import android.databinding.p001b.p002a.C0017b.C0016a;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.orange.studio.banglatype.R;
import com.orange.studio.banglatype.al;
import com.orange.studio.banglatype.al.C1708b.C1707a;
import com.orange.studio.banglatype.aq;

public class C1695b extends C0043k implements C0014a, C0016a {
    private static final C0037b f7989k = null;
    private static final SparseIntArray f7990l;
    public final Guideline f7991f;
    public final ImageView f7992g;
    public final ConstraintLayout f7993h;
    public final TextView f7994i;
    public final TextView f7995j;
    private al f7996m;
    private aq f7997n;
    private final OnLongClickListener f7998o;
    private final OnClickListener f7999p;
    private long f8000q = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f7990l = sparseIntArray;
        sparseIntArray.put(R.id.guideline, 4);
    }

    private C1695b(C0020d c0020d, View view) {
        super(c0020d, view, 2);
        Object[] a = C0043k.m42a(c0020d, view, 5, f7989k, f7990l);
        this.f7991f = (Guideline) a[4];
        this.f7992g = (ImageView) a[1];
        this.f7992g.setTag(null);
        this.f7993h = (ConstraintLayout) a[0];
        this.f7993h.setTag(null);
        this.f7994i = (TextView) a[3];
        this.f7994i.setTag(null);
        this.f7995j = (TextView) a[2];
        this.f7995j.setTag(null);
        b_(view);
        this.f7998o = new C0017b(this);
        this.f7999p = new C0015a(this);
        mo2376d();
    }

    public static C1695b m7194a(View view, C0020d c0020d) {
        if ("layout/list_square_title_subtitle_01_0".equals(view.getTag())) {
            return new C1695b(c0020d, view);
        }
        throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
    }

    private boolean m7195b(int i) {
        switch (i) {
            case 0:
                synchronized (this) {
                    this.f8000q |= 1;
                }
                return true;
            case 22:
                synchronized (this) {
                    this.f8000q |= 64;
                }
                return true;
            case 39:
                synchronized (this) {
                    this.f8000q |= 16;
                }
                return true;
            case 42:
                synchronized (this) {
                    this.f8000q |= 128;
                }
                return true;
            case 45:
                synchronized (this) {
                    this.f8000q |= 32;
                }
                return true;
            default:
                return false;
        }
    }

    private boolean m7196c(int i) {
        switch (i) {
            case 0:
                synchronized (this) {
                    this.f8000q |= 2;
                }
                return true;
            default:
                return false;
        }
    }

    public final void mo2378a(View view) {
        aq aqVar = this.f7997n;
        al alVar = this.f7996m;
        if ((alVar != null ? 1 : null) != null && alVar.f8075h != null) {
            alVar.f8075h.onItemClick(view, aqVar);
        }
    }

    public final boolean mo2379a() {
        al alVar = this.f7996m;
        return (!(alVar != null) || alVar.f8076i == null) ? false : alVar.f8076i.m7332a();
    }

    protected final boolean mo2373a(int i, int i2) {
        switch (i) {
            case 0:
                return m7195b(i2);
            case 1:
                return m7196c(i2);
            default:
                return false;
        }
    }

    public final boolean mo2374a(int i, Object obj) {
        switch (i) {
            case 18:
            case 37:
                return true;
            case 23:
                this.f7997n = (aq) obj;
                synchronized (this) {
                    this.f8000q |= 4;
                }
                m2a(23);
                super.m56g();
                return true;
            case 25:
                obj = (al) obj;
                C0029a c0029a = C0043k.f35b;
                if (obj == null) {
                    super.m55f();
                } else {
                    C0040e c0040e = this.f43c[0];
                    if (c0040e == null) {
                        super.m48a(obj, c0029a);
                    } else if (c0040e.f31c != obj) {
                        super.m55f();
                        super.m48a(obj, c0029a);
                    }
                }
                this.f7996m = obj;
                synchronized (this) {
                    this.f8000q |= 1;
                }
                m2a(25);
                super.m56g();
                return true;
            default:
                return false;
        }
    }

    protected final void mo2375c() {
        CharSequence c;
        C1707a c1707a;
        CharSequence charSequence;
        int i;
        long j;
        synchronized (this) {
            long j2 = this.f8000q;
            this.f8000q = 0;
        }
        int i2 = 0;
        al alVar = this.f7996m;
        int i3 = 0;
        CharSequence charSequence2 = null;
        C1707a c1707a2 = null;
        if ((497 & j2) != 0) {
            Object obj;
            if ((273 & j2) != 0) {
                if (alVar != null) {
                    i2 = alVar.f8071d;
                    if (alVar.f8074g != null) {
                        alVar.f8074g.get();
                    }
                    c1707a2 = alVar.mo2383d();
                }
                if (c1707a2 != null) {
                    c1707a2.f8156g = i2;
                    if ((321 & j2) != 0) {
                        if (alVar == null) {
                            c = alVar.mo2382c();
                            obj = (c != null || "".equals(c.toString())) ? null : 1;
                        } else {
                            obj = null;
                        }
                        if ((321 & j2) != 0) {
                            j2 = obj == null ? j2 | 1024 : j2 | 512;
                        }
                        i3 = obj == null ? 0 : 8;
                    }
                    if (!((385 & j2) == 0 || alVar == null)) {
                        charSequence2 = alVar.mo2382c();
                    }
                    if ((289 & j2) != 0 || alVar == null) {
                        c = null;
                        c1707a = c1707a2;
                        charSequence = charSequence2;
                        i = i3;
                        j = j2;
                    } else {
                        c = alVar.mo2381b();
                        c1707a = c1707a2;
                        charSequence = charSequence2;
                        i = i3;
                        j = j2;
                    }
                }
            }
            c1707a2 = null;
            if ((321 & j2) != 0) {
                if (alVar == null) {
                    obj = null;
                } else {
                    c = alVar.mo2382c();
                    if (c != null) {
                    }
                }
                if ((321 & j2) != 0) {
                    if (obj == null) {
                    }
                }
                if (obj == null) {
                }
                i3 = obj == null ? 0 : 8;
            }
            charSequence2 = alVar.mo2382c();
            if ((289 & j2) != 0) {
            }
            c = null;
            c1707a = c1707a2;
            charSequence = charSequence2;
            i = i3;
            j = j2;
        } else {
            charSequence = null;
            i = 0;
            j = j2;
            c = null;
            c1707a = null;
        }
        if ((273 & j) != 0) {
            al.m7261a(this.f7992g, c1707a);
        }
        if ((256 & j) != 0) {
            this.f7993h.setOnClickListener(this.f7999p);
            this.f7993h.setOnLongClickListener(this.f7998o);
        }
        if ((321 & j) != 0) {
            this.f7994i.setVisibility(i);
        }
        if ((385 & j) != 0) {
            C0012a.m5a(this.f7994i, charSequence);
        }
        if ((289 & j) != 0) {
            C0012a.m5a(this.f7995j, c);
        }
    }

    public final void mo2376d() {
        synchronized (this) {
            this.f8000q = 256;
        }
        m56g();
    }

    public final boolean mo2377e() {
        synchronized (this) {
            if (this.f8000q != 0) {
                return true;
            }
            return false;
        }
    }
}
