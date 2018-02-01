package android.support.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.transition.ag.C0323a;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.Map;

public class ChangeImageTransform extends Transition {
    private static final String[] f1164i = new String[]{"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    private static final TypeEvaluator<Matrix> f1165j = new C02891();
    private static final Property<ImageView, Matrix> f1166k = new Property<ImageView, Matrix>(Matrix.class, "animatedTransform") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            C0342k.m983a((ImageView) obj, (Matrix) obj2);
        }
    };

    static class C02891 implements TypeEvaluator<Matrix> {
        C02891() {
        }

        public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
            return null;
        }
    }

    static /* synthetic */ class C02913 {
        static final /* synthetic */ int[] f1163a = new int[ScaleType.values().length];

        static {
            try {
                f1163a[ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f1163a[ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void m792d(ah ahVar) {
        View view = ahVar.f1274b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Object matrix;
                Map map = ahVar.f1273a;
                map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                String str = "android:changeImageTransform:matrix";
                switch (C02913.f1163a[imageView.getScaleType().ordinal()]) {
                    case 1:
                        Drawable drawable = imageView.getDrawable();
                        Matrix matrix2 = new Matrix();
                        matrix2.postScale(((float) imageView.getWidth()) / ((float) drawable.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable.getIntrinsicHeight()));
                        Matrix matrix3 = matrix2;
                        break;
                    case 2:
                        Drawable drawable2 = imageView.getDrawable();
                        int intrinsicWidth = drawable2.getIntrinsicWidth();
                        int width = imageView.getWidth();
                        float f = ((float) width) / ((float) intrinsicWidth);
                        int intrinsicHeight = drawable2.getIntrinsicHeight();
                        int height = imageView.getHeight();
                        f = Math.max(f, ((float) height) / ((float) intrinsicHeight));
                        float f2 = ((float) intrinsicHeight) * f;
                        intrinsicWidth = Math.round((((float) width) - (((float) intrinsicWidth) * f)) / 2.0f);
                        intrinsicHeight = Math.round((((float) height) - f2) / 2.0f);
                        matrix = new Matrix();
                        matrix.postScale(f, f);
                        matrix.postTranslate((float) intrinsicWidth, (float) intrinsicHeight);
                        break;
                    default:
                        matrix = new Matrix(imageView.getImageMatrix());
                        break;
                }
                map.put(str, matrix);
            }
        }
    }

    public final Animator mo82a(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        if (ahVar == null || ahVar2 == null) {
            return null;
        }
        Rect rect = (Rect) ahVar.f1273a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) ahVar2.f1273a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Object obj = (Matrix) ahVar.f1273a.get("android:changeImageTransform:matrix");
        Matrix matrix = (Matrix) ahVar2.f1273a.get("android:changeImageTransform:matrix");
        int i = (!(obj == null && matrix == null) && (obj == null || !obj.equals(matrix))) ? 0 : 1;
        if (rect.equals(rect2) && i != 0) {
            return null;
        }
        Animator ofObject;
        ImageView imageView = (ImageView) ahVar2.f1274b;
        Drawable drawable = imageView.getDrawable();
        i = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        C0342k.m981a(imageView);
        if (i == 0 || intrinsicHeight == 0) {
            ofObject = ObjectAnimator.ofObject(imageView, f1166k, f1165j, new Matrix[]{null, null});
        } else {
            if (obj == null) {
                obj = C0348o.f1351a;
            }
            if (matrix == null) {
                matrix = C0348o.f1351a;
            }
            f1166k.set(imageView, obj);
            ofObject = ObjectAnimator.ofObject(imageView, f1166k, new C0323a(), new Matrix[]{obj, matrix});
        }
        C0342k.m982a(imageView, ofObject);
        return ofObject;
    }

    public final void mo83a(ah ahVar) {
        m792d(ahVar);
    }

    public final String[] mo224a() {
        return f1164i;
    }

    public final void mo84b(ah ahVar) {
        m792d(ahVar);
    }
}
