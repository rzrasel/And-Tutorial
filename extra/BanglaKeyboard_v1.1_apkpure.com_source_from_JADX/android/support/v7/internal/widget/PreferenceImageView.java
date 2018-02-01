package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.preference.C0935f.C0934d;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView;

public class PreferenceImageView extends ImageView {
    private int f2713a;
    private int f2714b;

    public PreferenceImageView(Context context) {
        this(context, null);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2713a = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f2714b = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0934d.PreferenceImageView, i, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(C0934d.PreferenceImageView_maxWidth, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(C0934d.PreferenceImageView_maxHeight, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
        obtainStyledAttributes.recycle();
    }

    public int getMaxHeight() {
        return this.f2714b;
    }

    public int getMaxWidth() {
        return this.f2713a;
    }

    protected void onMeasure(int i, int i2) {
        int maxWidth;
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = MeasureSpec.getSize(i);
            maxWidth = getMaxWidth();
            if (maxWidth != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED && (maxWidth < size || mode == 0)) {
                i = MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        mode = MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            size = MeasureSpec.getSize(i2);
            maxWidth = getMaxHeight();
            if (maxWidth != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED && (maxWidth < size || mode == 0)) {
                i2 = MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.f2714b = i;
        super.setMaxHeight(i);
    }

    public void setMaxWidth(int i) {
        this.f2713a = i;
        super.setMaxWidth(i);
    }
}
