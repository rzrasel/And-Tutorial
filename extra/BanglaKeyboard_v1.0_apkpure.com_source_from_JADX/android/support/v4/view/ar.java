package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class ar extends aq {
    ar() {
    }

    final long mo225a() {
        return ValueAnimator.getFrameDelay();
    }

    public final void mo211a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    public void mo212a(View view, Paint paint) {
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    public final int mo221e(View view) {
        return view.getLayerType();
    }
}
