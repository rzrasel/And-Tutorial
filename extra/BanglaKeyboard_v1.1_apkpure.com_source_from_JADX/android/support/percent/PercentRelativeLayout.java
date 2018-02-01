package android.support.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.percent.C0274a.C0271b;
import android.support.percent.C0274a.C0272a;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

@Deprecated
public class PercentRelativeLayout extends RelativeLayout {
    private final C0274a f1097a = new C0274a(this);

    @Deprecated
    public static class LayoutParams extends android.widget.RelativeLayout.LayoutParams implements C0271b {
        private C0272a f1096a;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1096a = C0274a.m739a(context, attributeSet);
        }

        public final C0272a mo205a() {
            if (this.f1096a == null) {
                this.f1096a = new C0272a();
            }
            return this.f1096a;
        }

        protected void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            C0274a.m740a(this, typedArray, i, i2);
        }
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private LayoutParams m732a(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m732a(attributeSet);
    }

    public /* synthetic */ android.widget.RelativeLayout.LayoutParams m7548generateLayoutParams(AttributeSet attributeSet) {
        return m732a(attributeSet);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1097a.m741a();
    }

    protected void onMeasure(int i, int i2) {
        this.f1097a.m742a(i, i2);
        super.onMeasure(i, i2);
        if (this.f1097a.m743b()) {
            super.onMeasure(i, i2);
        }
    }
}
