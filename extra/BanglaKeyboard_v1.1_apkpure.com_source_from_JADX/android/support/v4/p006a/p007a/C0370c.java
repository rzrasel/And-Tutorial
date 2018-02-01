package android.support.v4.p006a.p007a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

class C0370c extends Drawable implements Callback, C0367b, C0060f {
    static final Mode f1370a = Mode.SRC_IN;
    C0368a f1371b;
    Drawable f1372c;
    private int f1373d;
    private Mode f1374e;
    private boolean f1375f;
    private boolean f1376g;

    protected static abstract class C0368a extends ConstantState {
        int f1366a;
        ConstantState f1367b;
        ColorStateList f1368c = null;
        Mode f1369d = C0370c.f1370a;

        C0368a(C0368a c0368a) {
            if (c0368a != null) {
                this.f1366a = c0368a.f1366a;
                this.f1367b = c0368a.f1367b;
                this.f1368c = c0368a.f1368c;
                this.f1369d = c0368a.f1369d;
            }
        }

        public int getChangingConfigurations() {
            return (this.f1367b != null ? this.f1367b.getChangingConfigurations() : 0) | this.f1366a;
        }

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public abstract Drawable newDrawable(Resources resources);
    }

    private static class C0369b extends C0368a {
        C0369b(C0368a c0368a) {
            super(c0368a);
        }

        public final Drawable newDrawable(Resources resources) {
            return new C0370c(this, resources);
        }
    }

    C0370c(Drawable drawable) {
        this.f1371b = mo282b();
        mo281a(drawable);
    }

    C0370c(C0368a c0368a, Resources resources) {
        this.f1371b = c0368a;
        if (this.f1371b != null && this.f1371b.f1367b != null) {
            mo281a(this.f1371b.f1367b.newDrawable(resources));
        }
    }

    private boolean m1059a(int[] iArr) {
        if (!mo283c()) {
            return false;
        }
        ColorStateList colorStateList = this.f1371b.f1368c;
        Mode mode = this.f1371b.f1369d;
        if (colorStateList == null || mode == null) {
            this.f1375f = false;
            clearColorFilter();
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1375f && colorForState == this.f1373d && mode == this.f1374e) {
            return false;
        }
        setColorFilter(colorForState, mode);
        this.f1373d = colorForState;
        this.f1374e = mode;
        this.f1375f = true;
        return true;
    }

    public final Drawable mo280a() {
        return this.f1372c;
    }

    public final void mo281a(Drawable drawable) {
        if (this.f1372c != null) {
            this.f1372c.setCallback(null);
        }
        this.f1372c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f1371b != null) {
                this.f1371b.f1367b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    C0368a mo282b() {
        return new C0369b(this.f1371b);
    }

    protected boolean mo283c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f1372c.draw(canvas);
    }

    public int getChangingConfigurations() {
        return ((this.f1371b != null ? this.f1371b.getChangingConfigurations() : 0) | super.getChangingConfigurations()) | this.f1372c.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        if (this.f1371b != null) {
            if ((this.f1371b.f1367b != null ? 1 : null) != null) {
                this.f1371b.f1366a = getChangingConfigurations();
                return this.f1371b;
            }
        }
        return null;
    }

    public Drawable getCurrent() {
        return this.f1372c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1372c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1372c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f1372c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1372c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1372c.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f1372c.getPadding(rect);
    }

    public int[] getState() {
        return this.f1372c.getState();
    }

    public Region getTransparentRegion() {
        return this.f1372c.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList = (!mo283c() || this.f1371b == null) ? null : this.f1371b.f1368c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f1372c.isStateful();
    }

    public void jumpToCurrentState() {
        this.f1372c.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f1376g && super.mutate() == this) {
            this.f1371b = mo282b();
            if (this.f1372c != null) {
                this.f1372c.mutate();
            }
            if (this.f1371b != null) {
                this.f1371b.f1367b = this.f1372c != null ? this.f1372c.getConstantState() : null;
            }
            this.f1376g = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f1372c != null) {
            this.f1372c.setBounds(rect);
        }
    }

    protected boolean onLevelChange(int i) {
        return this.f1372c.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f1372c.setAlpha(i);
    }

    public void setChangingConfigurations(int i) {
        this.f1372c.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1372c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1372c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1372c.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m1059a(iArr) || this.f1372c.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1371b.f1368c = colorStateList;
        m1059a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f1371b.f1369d = mode;
        m1059a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1372c.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
