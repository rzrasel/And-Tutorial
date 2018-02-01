package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {
    private long f189a = -1;
    private boolean f190b = false;
    private boolean f191c = false;
    private boolean f192d = false;
    private final Runnable f193e = new C0102b(this);
    private final Runnable f194f = new C0103c(this);

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    private void m513a() {
        removeCallbacks(this.f193e);
        removeCallbacks(this.f194f);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m513a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m513a();
    }
}
