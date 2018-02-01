package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.C0122a;
import android.support.v4.view.C0679r;
import android.support.v4.view.p019a.C0626b;
import android.support.v7.p021a.C0780a.C0770a;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    private static final int[] f659a = new int[]{16842912};
    private boolean f660b;

    class C01661 extends C0122a {
        final /* synthetic */ CheckableImageButton f658a;

        C01661(CheckableImageButton checkableImageButton) {
            this.f658a = checkableImageButton;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(this.f658a.isChecked());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0626b c0626b) {
            super.onInitializeAccessibilityNodeInfo(view, c0626b);
            c0626b.m1689a(true);
            c0626b.f1917b.setChecked(this.f658a.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0770a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0679r.m1913a((View) this, new C01661(this));
    }

    public boolean isChecked() {
        return this.f660b;
    }

    public int[] onCreateDrawableState(int i) {
        return this.f660b ? mergeDrawableStates(super.onCreateDrawableState(f659a.length + i), f659a) : super.onCreateDrawableState(i);
    }

    public void setChecked(boolean z) {
        if (this.f660b != z) {
            this.f660b = z;
            refreshDrawableState();
            sendAccessibilityEvent(ItemAnimator.FLAG_MOVED);
        }
    }

    public void toggle() {
        setChecked(!this.f660b);
    }
}
