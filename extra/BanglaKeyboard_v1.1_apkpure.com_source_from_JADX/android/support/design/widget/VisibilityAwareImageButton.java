package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

class VisibilityAwareImageButton extends ImageButton {
    private int f740a;

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f740a = getVisibility();
    }

    final void m508a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f740a = i;
        }
    }

    final int getUserSetVisibility() {
        return this.f740a;
    }

    public void setVisibility(int i) {
        m508a(i, true);
    }
}
