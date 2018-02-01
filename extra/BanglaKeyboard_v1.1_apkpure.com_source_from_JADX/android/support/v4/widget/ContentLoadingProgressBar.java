package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {
    long f2004a = -1;
    boolean f2005b = false;
    boolean f2006c = false;
    boolean f2007d = false;
    private final Runnable f2008e = new C06971(this);
    private final Runnable f2009f = new C06982(this);

    class C06971 implements Runnable {
        final /* synthetic */ ContentLoadingProgressBar f2002a;

        C06971(ContentLoadingProgressBar contentLoadingProgressBar) {
            this.f2002a = contentLoadingProgressBar;
        }

        public final void run() {
            this.f2002a.f2005b = false;
            this.f2002a.f2004a = -1;
            this.f2002a.setVisibility(8);
        }
    }

    class C06982 implements Runnable {
        final /* synthetic */ ContentLoadingProgressBar f2003a;

        C06982(ContentLoadingProgressBar contentLoadingProgressBar) {
            this.f2003a = contentLoadingProgressBar;
        }

        public final void run() {
            this.f2003a.f2006c = false;
            if (!this.f2003a.f2007d) {
                this.f2003a.f2004a = System.currentTimeMillis();
                this.f2003a.setVisibility(0);
            }
        }
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    private void m2000a() {
        removeCallbacks(this.f2008e);
        removeCallbacks(this.f2009f);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2000a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2000a();
    }
}
