package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.C0075a;
import android.support.v4.view.an;
import android.support.v4.view.p002a.C0049a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

final class C0124y extends C0075a {
    final /* synthetic */ SlidingPaneLayout f348b;
    private final Rect f349c = new Rect();

    C0124y(SlidingPaneLayout slidingPaneLayout) {
        this.f348b = slidingPaneLayout;
    }

    private boolean m721b(View view) {
        return this.f348b.m561b(view);
    }

    public final void mo239a(View view, C0049a c0049a) {
        C0049a a = C0049a.m92a(c0049a);
        super.mo239a(view, a);
        Rect rect = this.f349c;
        a.m95a(rect);
        c0049a.m101b(rect);
        a.m106c(rect);
        c0049a.m110d(rect);
        c0049a.m109c(a.m116f());
        c0049a.m97a(a.m125l());
        c0049a.m103b(a.m126m());
        c0049a.m108c(a.m127n());
        c0049a.m119h(a.m124k());
        c0049a.m115f(a.m122i());
        c0049a.m98a(a.m112d());
        c0049a.m104b(a.m114e());
        c0049a.m111d(a.m118g());
        c0049a.m113e(a.m120h());
        c0049a.m117g(a.m123j());
        c0049a.m94a(a.m99b());
        c0049a.m100b(a.m105c());
        a.m128o();
        c0049a.m103b(SlidingPaneLayout.class.getName());
        c0049a.m96a(view);
        ViewParent g = an.m340g(view);
        if (g instanceof View) {
            c0049a.m107c((View) g);
        }
        int childCount = this.f348b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f348b.getChildAt(i);
            if (!m721b(childAt) && childAt.getVisibility() == 0) {
                an.m335b(childAt, 1);
                c0049a.m102b(childAt);
            }
        }
    }

    public final boolean mo285a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return !m721b(view) ? super.mo285a(viewGroup, view, accessibilityEvent) : false;
    }

    public final void mo241d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo241d(view, accessibilityEvent);
        accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
    }
}
