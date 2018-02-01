package android.support.v4.view;

import android.view.MotionEvent;

final class C0099x implements C0098z {
    C0099x() {
    }

    public final int mo265a(MotionEvent motionEvent) {
        return 1;
    }

    public final int mo266a(MotionEvent motionEvent, int i) {
        return i == 0 ? 0 : -1;
    }

    public final int mo267b(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return 0;
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }

    public final float mo268c(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return motionEvent.getX();
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }

    public final float mo269d(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return motionEvent.getY();
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }
}
