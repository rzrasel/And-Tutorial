package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.C0075a;
import android.support.v4.view.an;
import android.support.v4.view.p002a.C0049a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

final class C0109i extends C0075a {
    final /* synthetic */ DrawerLayout f336b;
    private final Rect f337c = new Rect();

    C0109i(DrawerLayout drawerLayout) {
        this.f336b = drawerLayout;
    }

    public final void mo239a(View view, C0049a c0049a) {
        C0049a a = C0049a.m92a(c0049a);
        super.mo239a(view, a);
        c0049a.m103b(DrawerLayout.class.getName());
        c0049a.m96a(view);
        ViewParent g = an.m340g(view);
        if (g instanceof View) {
            c0049a.m107c((View) g);
        }
        Rect rect = this.f337c;
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
        a.m128o();
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (DrawerLayout.m523f(childAt)) {
                c0049a.m102b(childAt);
            }
        }
    }

    public final boolean mo285a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return DrawerLayout.m523f(view) ? super.mo285a(viewGroup, view, accessibilityEvent) : false;
    }

    public final boolean mo286b(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.mo286b(view, accessibilityEvent);
        }
        List text = accessibilityEvent.getText();
        View a = this.f336b.m525g();
        if (a != null) {
            CharSequence a2 = this.f336b.m530a(this.f336b.m537c(a));
            if (a2 != null) {
                text.add(a2);
            }
        }
        return true;
    }

    public final void mo241d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo241d(view, accessibilityEvent);
        accessibilityEvent.setClassName(DrawerLayout.class.getName());
    }
}
