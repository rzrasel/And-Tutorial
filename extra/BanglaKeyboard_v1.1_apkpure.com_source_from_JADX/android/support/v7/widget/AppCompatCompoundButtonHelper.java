package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p006a.p007a.C0366a;
import android.support.v4.widget.C0739d;
import android.support.v7.p021a.C0780a.C0779j;
import android.support.v7.p023c.p024a.C0862b;
import android.util.AttributeSet;
import android.widget.CompoundButton;

class AppCompatCompoundButtonHelper {
    private ColorStateList mButtonTintList = null;
    private Mode mButtonTintMode = null;
    private boolean mHasButtonTint = false;
    private boolean mHasButtonTintMode = false;
    private boolean mSkipNextApply;
    private final CompoundButton mView;

    interface DirectSetButtonDrawableInterface {
        void setButtonDrawable(Drawable drawable);
    }

    AppCompatCompoundButtonHelper(CompoundButton compoundButton) {
        this.mView = compoundButton;
    }

    void applyButtonTint() {
        Drawable a = C0739d.m2139a(this.mView);
        if (a == null) {
            return;
        }
        if (this.mHasButtonTint || this.mHasButtonTintMode) {
            a = C0366a.m1054g(a).mutate();
            if (this.mHasButtonTint) {
                C0366a.m1043a(a, this.mButtonTintList);
            }
            if (this.mHasButtonTintMode) {
                C0366a.m1046a(a, this.mButtonTintMode);
            }
            if (a.isStateful()) {
                a.setState(this.mView.getDrawableState());
            }
            this.mView.setButtonDrawable(a);
        }
    }

    int getCompoundPaddingLeft(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = C0739d.m2139a(this.mView);
        return a != null ? i + a.getIntrinsicWidth() : i;
    }

    ColorStateList getSupportButtonTintList() {
        return this.mButtonTintList;
    }

    Mode getSupportButtonTintMode() {
        return this.mButtonTintMode;
    }

    void loadFromAttributes(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, C0779j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0779j.CompoundButton_android_button)) {
                int resourceId = obtainStyledAttributes.getResourceId(C0779j.CompoundButton_android_button, 0);
                if (resourceId != 0) {
                    this.mView.setButtonDrawable(C0862b.m2514b(this.mView.getContext(), resourceId));
                }
            }
            if (obtainStyledAttributes.hasValue(C0779j.CompoundButton_buttonTint)) {
                C0739d.m2140a(this.mView, obtainStyledAttributes.getColorStateList(C0779j.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C0779j.CompoundButton_buttonTintMode)) {
                C0739d.m2141a(this.mView, DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(C0779j.CompoundButton_buttonTintMode, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    void onSetButtonDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
            return;
        }
        this.mSkipNextApply = true;
        applyButtonTint();
    }

    void setSupportButtonTintList(ColorStateList colorStateList) {
        this.mButtonTintList = colorStateList;
        this.mHasButtonTint = true;
        applyButtonTint();
    }

    void setSupportButtonTintMode(Mode mode) {
        this.mButtonTintMode = mode;
        this.mHasButtonTintMode = true;
        applyButtonTint();
    }
}
