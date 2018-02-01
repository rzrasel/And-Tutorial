package android.support.p004b.p005a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.v4.content.p015a.C0438c;
import android.support.v4.p006a.p007a.C0366a;
import android.support.v4.p018f.C0478a;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public final class C0062c extends C0061h implements C0056b {
    final Callback f81a;
    private C0058a f82c;
    private Context f83d;
    private ArgbEvaluator f84e;
    private AnimatorListener f85f;
    private ArrayList<Object> f86g;

    class C00571 implements Callback {
        final /* synthetic */ C0062c f73a;

        C00571(C0062c c0062c) {
            this.f73a = c0062c;
        }

        public final void invalidateDrawable(Drawable drawable) {
            this.f73a.invalidateSelf();
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            this.f73a.scheduleSelf(runnable, j);
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            this.f73a.unscheduleSelf(runnable);
        }
    }

    private static class C0058a extends ConstantState {
        int f74a;
        C0075i f75b;
        AnimatorSet f76c;
        ArrayList<Animator> f77d;
        C0478a<Animator, String> f78e;

        public final int getChangingConfigurations() {
            return this.f74a;
        }

        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    private static class C0059b extends ConstantState {
        private final ConstantState f79a;

        public C0059b(ConstantState constantState) {
            this.f79a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.f79a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f79a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            Drawable c0062c = new C0062c();
            c0062c.b = this.f79a.newDrawable();
            c0062c.b.setCallback(c0062c.f81a);
            return c0062c;
        }

        public final Drawable newDrawable(Resources resources) {
            Drawable c0062c = new C0062c();
            c0062c.b = this.f79a.newDrawable(resources);
            c0062c.b.setCallback(c0062c.f81a);
            return c0062c;
        }

        public final Drawable newDrawable(Resources resources, Theme theme) {
            Drawable c0062c = new C0062c();
            c0062c.b = this.f79a.newDrawable(resources, theme);
            c0062c.b.setCallback(c0062c.f81a);
            return c0062c;
        }
    }

    C0062c() {
        this(null, (byte) 0);
    }

    private C0062c(Context context) {
        this(context, (byte) 0);
    }

    private C0062c(Context context, byte b) {
        this.f84e = null;
        this.f85f = null;
        this.f86g = null;
        this.f81a = new C00571(this);
        this.f83d = context;
        this.f82c = new C0058a();
    }

    public static C0062c m59a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C0062c c0062c = new C0062c(context);
        c0062c.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0062c;
    }

    private void m60a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            List childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m60a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f84e == null) {
                    this.f84e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f84e);
            }
        }
    }

    public final void applyTheme(Theme theme) {
        if (this.b != null) {
            C0366a.m1044a(this.b, theme);
        }
    }

    public final boolean canApplyTheme() {
        return this.b != null ? C0366a.m1051d(this.b) : false;
    }

    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final void draw(Canvas canvas) {
        if (this.b != null) {
            this.b.draw(canvas);
            return;
        }
        this.f82c.f75b.draw(canvas);
        if (this.f82c.f76c.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        return this.b != null ? C0366a.m1050c(this.b) : this.f82c.f75b.getAlpha();
    }

    public final int getChangingConfigurations() {
        return this.b != null ? this.b.getChangingConfigurations() : super.getChangingConfigurations() | this.f82c.f74a;
    }

    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public final ConstantState getConstantState() {
        return (this.b == null || VERSION.SDK_INT < 24) ? null : new C0059b(this.b.getConstantState());
    }

    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.b != null ? this.b.getIntrinsicHeight() : this.f82c.f75b.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.b != null ? this.b.getIntrinsicWidth() : this.f82c.f75b.getIntrinsicWidth();
    }

    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.b != null ? this.b.getOpacity() : this.f82c.f75b.getOpacity();
    }

    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.b != null) {
            C0366a.m1045a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray a = C0438c.m1162a(resources, theme, attributeSet, C0055a.f65e);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0075i a2 = C0075i.m89a(resources, resourceId, theme);
                        a2.f151d = false;
                        a2.setCallback(this.f81a);
                        if (this.f82c.f75b != null) {
                            this.f82c.f75b.setCallback(null);
                        }
                        this.f82c.f75b = a2;
                    }
                    a.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0055a.f66f);
                    String string = obtainAttributes.getString(0);
                    eventType = obtainAttributes.getResourceId(1, 0);
                    if (eventType != 0) {
                        if (this.f83d != null) {
                            Context context = this.f83d;
                            Animator loadAnimator = VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, eventType) : C0065e.m62a(context, context.getResources(), context.getTheme(), eventType);
                            loadAnimator.setTarget(this.f82c.f75b.f150c.f137b.f128h.get(string));
                            if (VERSION.SDK_INT < 21) {
                                m60a(loadAnimator);
                            }
                            if (this.f82c.f77d == null) {
                                this.f82c.f77d = new ArrayList();
                                this.f82c.f78e = new C0478a();
                            }
                            this.f82c.f77d.add(loadAnimator);
                            this.f82c.f78e.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        C0058a c0058a = this.f82c;
        if (c0058a.f76c == null) {
            c0058a.f76c = new AnimatorSet();
        }
        c0058a.f76c.playTogether(c0058a.f77d);
    }

    public final boolean isAutoMirrored() {
        return this.b != null ? C0366a.m1048b(this.b) : this.f82c.f75b.isAutoMirrored();
    }

    public final boolean isRunning() {
        return this.b != null ? ((AnimatedVectorDrawable) this.b).isRunning() : this.f82c.f76c.isRunning();
    }

    public final boolean isStateful() {
        return this.b != null ? this.b.isStateful() : this.f82c.f75b.isStateful();
    }

    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        }
        return this;
    }

    protected final void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        } else {
            this.f82c.f75b.setBounds(rect);
        }
    }

    protected final boolean onLevelChange(int i) {
        return this.b != null ? this.b.setLevel(i) : this.f82c.f75b.setLevel(i);
    }

    protected final boolean onStateChange(int[] iArr) {
        return this.b != null ? this.b.setState(iArr) : this.f82c.f75b.setState(iArr);
    }

    public final void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
        } else {
            this.f82c.f75b.setAlpha(i);
        }
    }

    public final void setAutoMirrored(boolean z) {
        if (this.b != null) {
            C0366a.m1047a(this.b, z);
        } else {
            this.f82c.f75b.setAutoMirrored(z);
        }
    }

    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
        } else {
            this.f82c.f75b.setColorFilter(colorFilter);
        }
    }

    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public final void setTint(int i) {
        if (this.b != null) {
            C0366a.m1041a(this.b, i);
        } else {
            this.f82c.f75b.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            C0366a.m1043a(this.b, colorStateList);
        } else {
            this.f82c.f75b.setTintList(colorStateList);
        }
    }

    public final void setTintMode(Mode mode) {
        if (this.b != null) {
            C0366a.m1046a(this.b, mode);
        } else {
            this.f82c.f75b.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.b != null) {
            return this.b.setVisible(z, z2);
        }
        this.f82c.f75b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public final void start() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).start();
        } else if (!this.f82c.f76c.isStarted()) {
            this.f82c.f76c.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).stop();
        } else {
            this.f82c.f76c.end();
        }
    }
}
