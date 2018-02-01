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

public final class C1696c extends C0043k {
    private static final C0037b f8001p = null;
    private static final SparseIntArray f8002q;
    public final C0045l f8003f;
    public final ImageView f8004g;
    public final FrameLayout f8005h;
    public final View f8006i;
    public final View f8007j;
    public final Space f8008k;
    public final LinearLayout f8009l;
    public final DrawerLayout f8010m;
    public final CoordinatorLayout f8011n;
    public final C0045l f8012o;
    private long f8013r = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8002q = sparseIntArray;
        sparseIntArray.put(R.id.background_image, 2);
        f8002q.put(R.id.app_bar, 3);
        f8002q.put(R.id.music_controls, 4);
        f8002q.put(R.id.bannerScrimStart, 5);
        f8002q.put(R.id.bannerScrim, 6);
        f8002q.put(R.id.bannerDivider, 7);
        f8002q.put(R.id.bannerAdStaticContainer, 8);
        f8002q.put(R.id.contentAdLayout, 9);
    }

    private C1696c(C0020d c0020d, View view) {
        super(c0020d, view, 0);
        Object[] a = C0043k.m42a(c0020d, view, 10, f8001p, f8002q);
        this.f8003f = new C0045l((ViewStub) a[3]);
        this.f8003f.f59e = this;
        this.f8004g = (ImageView) a[2];
        this.f8005h = (FrameLayout) a[8];
        this.f8006i = (View) a[7];
        this.f8007j = (View) a[6];
        this.f8008k = (Space) a[5];
        this.f8009l = (LinearLayout) a[9];
        this.f8010m = (DrawerLayout) a[0];
        this.f8010m.setTag(null);
        this.f8011n = (CoordinatorLayout) a[1];
        this.f8011n.setTag(null);
        this.f8012o = new C0045l((ViewStub) a[4]);
        this.f8012o.f59e = this;
        b_(view);
        mo2376d();
    }

    public static C1696c m7204a(View view, C0020d c0020d) {
        if ("layout/material_dashboard_vertical_main_0".equals(view.getTag())) {
            return new C1696c(c0020d, view);
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
            this.f8013r = 0;
        }
        if (this.f8003f.f56b != null) {
            this.f8003f.f56b.m51b();
        }
        if (this.f8012o.f56b != null) {
            this.f8012o.f56b.m51b();
        }
    }

    public final void mo2376d() {
        synchronized (this) {
            this.f8013r = 1;
        }
        m56g();
    }

    public final boolean mo2377e() {
        synchronized (this) {
            if (this.f8013r != 0) {
                return true;
            }
            return false;
        }
    }
}
