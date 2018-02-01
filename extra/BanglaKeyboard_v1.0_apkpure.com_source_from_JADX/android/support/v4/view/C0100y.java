package android.support.v4.view;

import android.view.MotionEvent;

final class C0100y implements C0098z {
    C0100y() {
    }

    public final int mo265a(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    public final int mo266a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    public final int mo267b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    public final float mo268c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    public final float mo269d(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }
}
