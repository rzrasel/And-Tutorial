package android.support.p004b.p005a;

import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.p006a.p007a.C0060f;
import android.support.v4.p006a.p007a.C0366a;

abstract class C0061h extends Drawable implements C0060f {
    Drawable f80b;

    C0061h() {
    }

    public void applyTheme(Theme theme) {
        if (this.f80b != null) {
            C0366a.m1044a(this.f80b, theme);
        }
    }

    public void clearColorFilter() {
        if (this.f80b != null) {
            this.f80b.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public ColorFilter getColorFilter() {
        return this.f80b != null ? C0366a.m1052e(this.f80b) : null;
    }

    public Drawable getCurrent() {
        return this.f80b != null ? this.f80b.getCurrent() : super.getCurrent();
    }

    public int getMinimumHeight() {
        return this.f80b != null ? this.f80b.getMinimumHeight() : super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f80b != null ? this.f80b.getMinimumWidth() : super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        return this.f80b != null ? this.f80b.getPadding(rect) : super.getPadding(rect);
    }

    public int[] getState() {
        return this.f80b != null ? this.f80b.getState() : super.getState();
    }

    public Region getTransparentRegion() {
        return this.f80b != null ? this.f80b.getTransparentRegion() : super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        if (this.f80b != null) {
            C0366a.m1039a(this.f80b);
        }
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f80b != null) {
            this.f80b.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    protected boolean onLevelChange(int i) {
        return this.f80b != null ? this.f80b.setLevel(i) : super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        if (this.f80b != null) {
            this.f80b.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public void setColorFilter(int i, Mode mode) {
        if (this.f80b != null) {
            this.f80b.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.f80b != null) {
            this.f80b.setFilterBitmap(z);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f80b != null) {
            C0366a.m1040a(this.f80b, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f80b != null) {
            C0366a.m1042a(this.f80b, i, i2, i3, i4);
        }
    }

    public boolean setState(int[] iArr) {
        return this.f80b != null ? this.f80b.setState(iArr) : super.setState(iArr);
    }
}
