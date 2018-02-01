package android.support.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.percent.C0274a.C0271b;
import android.support.percent.C0274a.C0272a;
import android.util.AttributeSet;
import android.widget.FrameLayout;

@Deprecated
public class PercentFrameLayout extends FrameLayout {
    private final C0274a f1095a = new C0274a(this);

    @Deprecated
    public static class LayoutParams extends android.widget.FrameLayout.LayoutParams implements C0271b {
        private C0272a f1094a;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1094a = C0274a.m739a(context, attributeSet);
        }

        public final C0272a mo205a() {
            if (this.f1094a == null) {
                this.f1094a = new C0272a();
            }
            return this.f1094a;
        }

        protected void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            C0274a.m740a(this, typedArray, i, i2);
        }
    }

    public PercentFrameLayout(Context context) {
        super(context);
    }

    public PercentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PercentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private LayoutParams m730a(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    protected /* synthetic */ android.widget.FrameLayout.LayoutParams m7546generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m730a(attributeSet);
    }

    public /* synthetic */ android.widget.FrameLayout.LayoutParams m7547generateLayoutParams(AttributeSet attributeSet) {
        return m730a(attributeSet);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1095a.m741a();
    }

    protected void onMeasure(int i, int i2) {
        this.f1095a.m742a(i, i2);
        super.onMeasure(i, i2);
        if (this.f1095a.m743b()) {
            super.onMeasure(i, i2);
        }
    }
}
