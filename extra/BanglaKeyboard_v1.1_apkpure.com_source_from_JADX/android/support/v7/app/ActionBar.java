package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.p021a.C0780a.C0779j;
import android.support.v7.view.C0852b;
import android.support.v7.view.C0852b.C0806a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

public abstract class ActionBar {

    public static class LayoutParams extends MarginLayoutParams {
        public int gravity;

        public LayoutParams(int i) {
            this(-2, -1, i);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = 0;
            this.gravity = 8388627;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.gravity = 0;
            this.gravity = i3;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0779j.ActionBarLayout);
            this.gravity = obtainStyledAttributes.getInt(C0779j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }
    }

    @Deprecated
    public static abstract class C0781a {
        public abstract Drawable m2221a();

        public abstract CharSequence m2222b();

        public abstract View m2223c();

        public abstract CharSequence m2224d();
    }

    public C0852b mo840a(C0806a c0806a) {
        return null;
    }

    public abstract void mo802a();

    public abstract void mo803a(int i);

    public void mo804a(Configuration configuration) {
    }

    public void mo805a(Drawable drawable) {
    }

    public abstract void mo806a(CharSequence charSequence);

    public abstract void mo807a(boolean z);

    public boolean mo808a(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean mo809a(KeyEvent keyEvent) {
        return false;
    }

    public abstract void mo810b();

    public void mo811b(int i) {
    }

    public void mo812b(CharSequence charSequence) {
    }

    public abstract void mo813b(boolean z);

    public abstract int mo814c();

    public void mo815c(boolean z) {
    }

    public Context mo816d() {
        return null;
    }

    public void mo817d(boolean z) {
    }

    public void mo818e(boolean z) {
    }

    public boolean mo819e() {
        return false;
    }

    public void mo820f(boolean z) {
    }

    public boolean mo821f() {
        return false;
    }

    public boolean mo822g() {
        return false;
    }

    public boolean mo823h() {
        return false;
    }

    void mo824i() {
    }
}
