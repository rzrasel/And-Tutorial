package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public final class aj {
    static final am f167a;

    static {
        if (VERSION.SDK_INT >= 11) {
            f167a = new al();
        } else {
            f167a = new ak();
        }
    }

    public static float m319a(VelocityTracker velocityTracker, int i) {
        return f167a.mo208a(velocityTracker, i);
    }

    public static float m320b(VelocityTracker velocityTracker, int i) {
        return f167a.mo209b(velocityTracker, i);
    }
}
