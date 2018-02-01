package com.orange.studio.banglatype.p057a;

import android.databinding.C0020d;
import android.databinding.C0043k;
import android.databinding.C0043k.C0037b;
import android.databinding.C0045l;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.Space;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.orange.studio.banglatype.R;

public final class C1697d extends C0043k {
    private static final C0037b f8014p = null;
    private static final SparseIntArray f8015q;
    public final C0045l f8016f;
    public final ImageView f8017g;
    public final FrameLayout f8018h;
    public final View f8019i;
    public final View f8020j;
    public final Space f8021k;
    public final LinearLayout f8022l;
    public final DrawerLayout f8023m;
    public final CoordinatorLayout f8024n;
    public final C0045l f8025o;
    private long f8026r = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8015q = sparseIntArray;
        sparseIntArray.put(R.id.background_image, 2);
        f8015q.put(R.id.app_bar, 3);
        f8015q.put(R.id.music_controls, 4);
        f8015q.put(R.id.bannerScrimStart, 5);
        f8015q.put(R.id.bannerScrim, 6);
        f8015q.put(R.id.bannerDivider, 7);
        f8015q.put(R.id.bannerAdStaticContainer, 8);
        f8015q.put(R.id.contentAdLayout, 9);
    }

    private C1697d(C0020d c0020d, View view) {
        super(c0020d, view, 0);
        Object[] a = C0043k.m42a(c0020d, view, 10, f8014p, f8015q);
        this.f8016f = new C0045l((ViewStub) a[3]);
        this.f8016f.f59e = this;
        this.f8017g = (ImageView) a[2];
        this.f8018h = (FrameLayout) a[8];
        this.f8019i = (View) a[7];
        this.f8020j = (View) a[6];
        this.f8021k = (Space) a[5];
        this.f8022l = (LinearLayout) a[9];
        this.f8023m = (DrawerLayout) a[0];
        this.f8023m.setTag(null);
        this.f8024n = (CoordinatorLayout) a[1];
        this.f8024n.setTag(null);
        this.f8025o = new C0045l((ViewStub) a[4]);
        this.f8025o.f59e = this;
        b_(view);
        mo2376d();
    }

    public static C1697d m7210a(View view, C0020d c0020d) {
        if ("layout/webview_main_0".equals(view.getTag())) {
            return new C1697d(c0020d, view);
        }
        throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
    }

    protected final boolean mo2373a(int i, int i2) {
        return false;
    }

    public final boolean mo2374a(int i, Object obj) {
        return false;
    }

    protected final void mo2375c() {
        synchronized (this) {
            this.f8026r = 0;
        }
        if (this.f8016f.f56b != null) {
            this.f8016f.f56b.m51b();
        }
        if (this.f8025o.f56b != null) {
            this.f8025o.f56b.m51b();
        }
    }

    public final void mo2376d() {
        synchronized (this) {
            this.f8026r = 1;
        }
        m56g();
    }

    public final boolean mo2377e() {
        synchronized (this) {
            if (this.f8026r != 0) {
                return true;
            }
            return false;
        }
    }
}
