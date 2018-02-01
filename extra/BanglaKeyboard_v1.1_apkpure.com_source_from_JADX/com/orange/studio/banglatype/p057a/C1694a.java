package com.orange.studio.banglatype.p057a;

import android.databinding.C0020d;
import android.databinding.C0043k;
import android.databinding.C0043k.C0037b;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;

public final class C1694a extends C0043k {
    private static final C0037b f7985g = null;
    private static final SparseIntArray f7986h = null;
    public final LinearLayout f7987f;
    private long f7988i = -1;

    private C1694a(C0020d c0020d, View view) {
        super(c0020d, view, 3);
        this.f7987f = (LinearLayout) C0043k.m42a(c0020d, view, 1, f7985g, f7986h)[0];
        this.f7987f.setTag(null);
        b_(view);
        mo2376d();
    }

    public static C1694a m7185a(View view, C0020d c0020d) {
        if ("layout/data_dummy_0".equals(view.getTag())) {
            return new C1694a(c0020d, view);
        }
        throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
    }

    private boolean m7186b(int i) {
        switch (i) {
            case 0:
                synchronized (this) {
                    this.f7988i |= 1;
                }
                return true;
            default:
                return false;
        }
    }

    private boolean m7187c(int i) {
        switch (i) {
            case 0:
                synchronized (this) {
                    this.f7988i |= 2;
                }
                return true;
            default:
                return false;
        }
    }

    private boolean m7188d(int i) {
        switch (i) {
            case 0:
                synchronized (this) {
                    this.f7988i |= 4;
                }
                return true;
            default:
                return false;
        }
    }

    protected final boolean mo2373a(int i, int i2) {
        switch (i) {
            case 0:
                return m7186b(i2);
            case 1:
                return m7187c(i2);
            case 2:
                return m7188d(i2);
            default:
                return false;
        }
    }

    public final boolean mo2374a(int i, Object obj) {
        switch (i) {
            case 18:
            case 23:
            case 25:
            case 37:
            case 46:
            case 47:
            case 49:
                return true;
            default:
                return false;
        }
    }

    protected final void mo2375c() {
        synchronized (this) {
            this.f7988i = 0;
        }
    }

    public final void mo2376d() {
        synchronized (this) {
            this.f7988i = 128;
        }
        m56g();
    }

    public final boolean mo2377e() {
        synchronized (this) {
            if (this.f7988i != 0) {
                return true;
            }
            return false;
        }
    }
}
