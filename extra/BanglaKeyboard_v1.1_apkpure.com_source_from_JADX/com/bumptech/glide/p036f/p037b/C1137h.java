package com.bumptech.glide.p036f.p037b;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import com.bumptech.glide.load.resource.p040a.C1136b;

public final class C1137h extends C1136b {
    private C1136b f3395a;
    private C1135a f3396b;
    private boolean f3397c;

    static class C1135a extends ConstantState {
        private final ConstantState f3393a;
        private final int f3394b;

        C1135a(ConstantState constantState, int i) {
            this.f3393a = constantState;
            this.f3394b = i;
        }

        C1135a(C1135a c1135a) {
            this(c1135a.f3393a, c1135a.f3394b);
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return newDrawable(null);
        }

        public final Drawable newDrawable(Resources resources) {
            return new C1137h(this, null, resources);
        }
    }

    C1137h(C1135a c1135a, C1136b c1136b, Resources resources) {
        this.f3396b = c1135a;
        if (c1136b != null) {
            this.f3395a = c1136b;
        } else if (resources != null) {
            this.f3395a = (C1136b) c1135a.f3393a.newDrawable(resources);
        } else {
            this.f3395a = (C1136b) c1135a.f3393a.newDrawable();
        }
    }

    public C1137h(C1136b c1136b, int i) {
        this(new C1135a(c1136b.getConstantState(), i), c1136b, null);
    }

    public final void mo1314a(int i) {
        this.f3395a.mo1314a(i);
    }

    public final boolean mo1315a() {
        return this.f3395a.mo1315a();
    }

    public final void clearColorFilter() {
        this.f3395a.clearColorFilter();
    }

    public final void draw(Canvas canvas) {
        this.f3395a.draw(canvas);
    }

    @TargetApi(19)
    public final int getAlpha() {
        return this.f3395a.getAlpha();
    }

    @TargetApi(11)
    public final Callback getCallback() {
        return this.f3395a.getCallback();
    }

    public final int getChangingConfigurations() {
        return this.f3395a.getChangingConfigurations();
    }

    public final ConstantState getConstantState() {
        return this.f3396b;
    }

    public final Drawable getCurrent() {
        return this.f3395a.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.f3396b.f3394b;
    }

    public final int getIntrinsicWidth() {
        return this.f3396b.f3394b;
    }

    public final int getMinimumHeight() {
        return this.f3395a.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f3395a.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f3395a.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f3395a.getPadding(rect);
    }

    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f3395a.invalidateSelf();
    }

    public final boolean isRunning() {
        return this.f3395a.isRunning();
    }

    public final Drawable mutate() {
        if (!this.f3397c && super.mutate() == this) {
            this.f3395a = (C1136b) this.f3395a.mutate();
            this.f3396b = new C1135a(this.f3396b);
            this.f3397c = true;
        }
        return this;
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
        this.f3395a.scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        this.f3395a.setAlpha(i);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f3395a.setBounds(i, i2, i3, i4);
    }

    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f3395a.setBounds(rect);
    }

    public final void setChangingConfigurations(int i) {
        this.f3395a.setChangingConfigurations(i);
    }

    public final void setColorFilter(int i, Mode mode) {
        this.f3395a.setColorFilter(i, mode);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3395a.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z) {
        this.f3395a.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.f3395a.setFilterBitmap(z);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return this.f3395a.setVisible(z, z2);
    }

    public final void start() {
        this.f3395a.start();
    }

    public final void stop() {
        this.f3395a.stop();
    }

    public final void unscheduleSelf(Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f3395a.unscheduleSelf(runnable);
    }
}
