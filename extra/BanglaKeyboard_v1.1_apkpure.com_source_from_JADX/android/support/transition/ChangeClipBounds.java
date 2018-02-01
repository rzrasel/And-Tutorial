package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.C0679r;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ChangeClipBounds extends Transition {
    private static final String[] f1162i = new String[]{"android:clipBounds:clip"};

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void m787d(ah ahVar) {
        View view = ahVar.f1274b;
        if (view.getVisibility() != 8) {
            Rect A = C0679r.m1900A(view);
            ahVar.f1273a.put("android:clipBounds:clip", A);
            if (A == null) {
                ahVar.f1273a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    public final Animator mo82a(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        if (ahVar == null || ahVar2 == null || !ahVar.f1273a.containsKey("android:clipBounds:clip") || !ahVar2.f1273a.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) ahVar.f1273a.get("android:clipBounds:clip");
        Object obj = (Rect) ahVar2.f1273a.get("android:clipBounds:clip");
        int i = obj == null ? 1 : 0;
        if (rect == null && obj == null) {
            return null;
        }
        if (rect == null) {
            rect = (Rect) ahVar.f1273a.get("android:clipBounds:bounds");
        } else if (obj == null) {
            Rect rect2 = (Rect) ahVar2.f1273a.get("android:clipBounds:bounds");
        }
        if (rect.equals(obj)) {
            return null;
        }
        C0679r.m1911a(ahVar2.f1274b, rect);
        Animator ofObject = ObjectAnimator.ofObject(ahVar2.f1274b, au.f1307b, new C0360z(new Rect()), new Rect[]{rect, obj});
        if (i == 0) {
            return ofObject;
        }
        final View view = ahVar2.f1274b;
        ofObject.addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ ChangeClipBounds f1161b;

            public final void onAnimationEnd(Animator animator) {
                C0679r.m1911a(view, null);
            }
        });
        return ofObject;
    }

    public final void mo83a(ah ahVar) {
        m787d(ahVar);
    }

    public final String[] mo224a() {
        return f1162i;
    }

    public final void mo84b(ah ahVar) {
        m787d(ahVar);
    }
}
