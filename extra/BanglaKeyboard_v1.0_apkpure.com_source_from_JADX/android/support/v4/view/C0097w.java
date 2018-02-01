package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MotionEvent;

public final class C0097w {
    static final C0098z f188a;

    static {
        if (VERSION.SDK_INT >= 5) {
            f188a = new C0100y();
        } else {
            f188a = new C0099x();
        }
    }

    public static int m490a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    public static int m491a(MotionEvent motionEvent, int i) {
        return f188a.mo266a(motionEvent, i);
    }

    public static int m492b(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    public static int m493b(MotionEvent motionEvent, int i) {
        return f188a.mo267b(motionEvent, i);
    }

    public static float m494c(MotionEvent motionEvent, int i) {
        return f188a.mo268c(motionEvent, i);
    }

    public static int m495c(MotionEvent motionEvent) {
        return f188a.mo265a(motionEvent);
    }

    public static float m496d(MotionEvent motionEvent, int i) {
        return f188a.mo269d(motionEvent, i);
    }
}
