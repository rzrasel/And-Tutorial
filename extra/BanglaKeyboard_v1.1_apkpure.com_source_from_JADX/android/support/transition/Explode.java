package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.support.transition.C0359y.C0358a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class Explode extends Visibility {
    private static final TimeInterpolator f1200j = new DecelerateInterpolator();
    private static final TimeInterpolator f1201k = new AccelerateInterpolator();
    private int[] f1202l;

    public Explode() {
        this.f1202l = new int[2];
        this.f560g = new C0332e();
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1202l = new int[2];
        this.f560g = new C0332e();
    }

    private static float m829a(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    private void m830a(View view, Rect rect, int[] iArr) {
        int round;
        int height;
        view.getLocationOnScreen(this.f1202l);
        int i = this.f1202l[0];
        int i2 = this.f1202l[1];
        Rect e = m326e();
        if (e == null) {
            round = Math.round(view.getTranslationX()) + ((view.getWidth() / 2) + i);
            height = ((view.getHeight() / 2) + i2) + Math.round(view.getTranslationY());
        } else {
            round = e.centerX();
            height = e.centerY();
        }
        float centerX = (float) (rect.centerX() - round);
        float centerY = (float) (rect.centerY() - height);
        if (centerX == 0.0f && centerY == 0.0f) {
            centerX = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float a = m829a(centerX, centerY);
        centerX /= a;
        centerY /= a;
        round -= i;
        height -= i2;
        float a2 = m829a((float) Math.max(round, view.getWidth() - round), (float) Math.max(height, view.getHeight() - height));
        iArr[0] = Math.round(centerX * a2);
        iArr[1] = Math.round(a2 * centerY);
    }

    private void m831d(ah ahVar) {
        View view = ahVar.f1274b;
        view.getLocationOnScreen(this.f1202l);
        int i = this.f1202l[0];
        int i2 = this.f1202l[1];
        ahVar.f1273a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    public final Animator mo226a(ViewGroup viewGroup, View view, ah ahVar) {
        if (ahVar == null) {
            return null;
        }
        float f;
        float f2;
        Rect rect = (Rect) ahVar.f1273a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) ahVar.f1274b.getTag(C0358a.transition_position);
        if (iArr != null) {
            float f3 = translationX + ((float) (iArr[0] - rect.left));
            f = ((float) (iArr[1] - rect.top)) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
            f2 = f;
            f = f3;
        } else {
            f2 = translationY;
            f = translationX;
        }
        m830a((View) viewGroup, rect, this.f1202l);
        return aj.m889a(view, ahVar, i, i2, translationX, translationY, f + ((float) this.f1202l[0]), f2 + ((float) this.f1202l[1]), f1201k);
    }

    public final Animator mo227a(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        if (ahVar2 == null) {
            return null;
        }
        Rect rect = (Rect) ahVar2.f1273a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        m830a((View) viewGroup, rect, this.f1202l);
        return aj.m889a(view, ahVar2, rect.left, rect.top, translationX + ((float) this.f1202l[0]), translationY + ((float) this.f1202l[1]), translationX, translationY, f1200j);
    }

    public final void mo83a(ah ahVar) {
        super.mo83a(ahVar);
        m831d(ahVar);
    }

    public final void mo84b(ah ahVar) {
        super.mo84b(ahVar);
        m831d(ahVar);
    }
}
