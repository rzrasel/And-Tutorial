package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;

final class C0320a {
    private static final C0329d f1246a;

    static {
        if (VERSION.SDK_INT >= 19) {
            f1246a = new C0331c();
        } else {
            f1246a = new C0330b();
        }
    }

    static void m871a(Animator animator) {
        f1246a.mo251a(animator);
    }

    static void m872a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        f1246a.mo252a(animator, animatorListenerAdapter);
    }

    static void m873b(Animator animator) {
        f1246a.mo253b(animator);
    }
}
