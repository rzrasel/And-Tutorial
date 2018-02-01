package android.support.transition;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

final class C0330b implements C0329d {

    interface C0317a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    C0330b() {
    }

    public final void mo251a(Animator animator) {
        ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                if (animatorListener instanceof C0317a) {
                    ((C0317a) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }

    public final void mo252a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
    }

    public final void mo253b(Animator animator) {
        ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                if (animatorListener instanceof C0317a) {
                    ((C0317a) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }
}
