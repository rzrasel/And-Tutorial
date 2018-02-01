package android.support.v4.p006a.p007a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.p006a.p007a.C0370c.C0368a;
import android.util.Log;
import java.lang.reflect.Method;

final class C0374e extends C0372d {
    private static Method f1377d;

    private static class C0373a extends C0368a {
        C0373a(C0368a c0368a) {
            super(c0368a);
        }

        public final Drawable newDrawable(Resources resources) {
            return new C0374e(this, resources);
        }
    }

    C0374e(Drawable drawable) {
        super(drawable);
        C0374e.m1065d();
    }

    C0374e(C0368a c0368a, Resources resources) {
        super(c0368a, resources);
        C0374e.m1065d();
    }

    private static void m1065d() {
        if (f1377d == null) {
            try {
                f1377d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Throwable e) {
                Log.w("DrawableWrapperApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    final C0368a mo282b() {
        return new C0373a(this.b);
    }

    protected final boolean mo283c() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.c;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public final Rect getDirtyBounds() {
        return this.c.getDirtyBounds();
    }

    public final void getOutline(Outline outline) {
        this.c.getOutline(outline);
    }

    public final void setHotspot(float f, float f2) {
        this.c.setHotspot(f, f2);
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.c.setHotspotBounds(i, i2, i3, i4);
    }

    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public final void setTint(int i) {
        if (mo283c()) {
            super.setTint(i);
        } else {
            this.c.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (mo283c()) {
            super.setTintList(colorStateList);
        } else {
            this.c.setTintList(colorStateList);
        }
    }

    public final void setTintMode(Mode mode) {
        if (mo283c()) {
            super.setTintMode(mode);
        } else {
            this.c.setTintMode(mode);
        }
    }
}
