package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.support.transition.C0359y.C0358a;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

final class C0345l implements C0344n {
    C0345l() {
    }

    public final void mo258a(ImageView imageView) {
        ScaleType scaleType = imageView.getScaleType();
        imageView.setTag(C0358a.save_scale_type, scaleType);
        if (scaleType == ScaleType.MATRIX) {
            imageView.setTag(C0358a.save_image_matrix, imageView.getImageMatrix());
        } else {
            imageView.setScaleType(ScaleType.MATRIX);
        }
        imageView.setImageMatrix(C0348o.f1351a);
    }

    public final void mo259a(final ImageView imageView, Animator animator) {
        animator.addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ C0345l f1348b;

            public final void onAnimationEnd(Animator animator) {
                ScaleType scaleType = (ScaleType) imageView.getTag(C0358a.save_scale_type);
                imageView.setScaleType(scaleType);
                imageView.setTag(C0358a.save_scale_type, null);
                if (scaleType == ScaleType.MATRIX) {
                    imageView.setImageMatrix((Matrix) imageView.getTag(C0358a.save_image_matrix));
                    imageView.setTag(C0358a.save_image_matrix, null);
                }
                animator.removeListener(this);
            }
        });
    }

    public final void mo260a(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
