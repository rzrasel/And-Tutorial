package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class C0331c implements C0329d {
    C0331c() {
    }

    public final void mo251a(Animator animator) {
        animator.pause();
    }

    public final void mo252a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    public final void mo253b(Animator animator) {
        animator.resume();
    }
}
