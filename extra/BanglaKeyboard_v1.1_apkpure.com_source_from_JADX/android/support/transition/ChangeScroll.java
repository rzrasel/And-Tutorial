package android.support.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ChangeScroll extends Transition {
    private static final String[] f1167i = new String[]{"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void m797d(ah ahVar) {
        ahVar.f1273a.put("android:changeScroll:x", Integer.valueOf(ahVar.f1274b.getScrollX()));
        ahVar.f1273a.put("android:changeScroll:y", Integer.valueOf(ahVar.f1274b.getScrollY()));
    }

    public final Animator mo82a(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        if (ahVar == null || ahVar2 == null) {
            return null;
        }
        Animator ofInt;
        Animator ofInt2;
        View view = ahVar2.f1274b;
        int intValue = ((Integer) ahVar.f1273a.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) ahVar2.f1273a.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) ahVar.f1273a.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) ahVar2.f1273a.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            ofInt = ObjectAnimator.ofInt(view, "scrollX", new int[]{intValue, intValue2});
        } else {
            ofInt = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            ofInt2 = ObjectAnimator.ofInt(view, "scrollY", new int[]{intValue3, intValue4});
        } else {
            ofInt2 = null;
        }
        return ag.m888a(ofInt, ofInt2);
    }

    public final void mo83a(ah ahVar) {
        m797d(ahVar);
    }

    public final String[] mo224a() {
        return f1167i;
    }

    public final void mo84b(ah ahVar) {
        m797d(ahVar);
    }
}
