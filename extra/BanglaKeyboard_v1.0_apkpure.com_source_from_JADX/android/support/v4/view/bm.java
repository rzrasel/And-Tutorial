package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.p002a.C0049a;
import android.support.v4.view.p002a.C0069u;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

final class bm extends C0075a {
    final /* synthetic */ ViewPager f178b;

    bm(ViewPager viewPager) {
        this.f178b = viewPager;
    }

    private boolean m430b() {
        return this.f178b.f128h != null && this.f178b.f128h.getCount() > 1;
    }

    public final void mo239a(View view, C0049a c0049a) {
        super.mo239a(view, c0049a);
        c0049a.m103b(ViewPager.class.getName());
        c0049a.m121i(m430b());
        if (this.f178b.canScrollHorizontally(1)) {
            c0049a.m94a((int) FragmentTransaction.TRANSIT_ENTER_MASK);
        }
        if (this.f178b.canScrollHorizontally(-1)) {
            c0049a.m94a((int) FragmentTransaction.TRANSIT_EXIT_MASK);
        }
    }

    public final boolean mo240a(View view, int i, Bundle bundle) {
        if (super.mo240a(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case FragmentTransaction.TRANSIT_ENTER_MASK /*4096*/:
                if (!this.f178b.canScrollHorizontally(1)) {
                    return false;
                }
                this.f178b.setCurrentItem(this.f178b.f129i + 1);
                return true;
            case FragmentTransaction.TRANSIT_EXIT_MASK /*8192*/:
                if (!this.f178b.canScrollHorizontally(-1)) {
                    return false;
                }
                this.f178b.setCurrentItem(this.f178b.f129i - 1);
                return true;
            default:
                return false;
        }
    }

    public final void mo241d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo241d(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        C0069u a = C0069u.m278a();
        a.m280a(m430b());
        if (accessibilityEvent.getEventType() == FragmentTransaction.TRANSIT_ENTER_MASK && this.f178b.f128h != null) {
            a.m279a(this.f178b.f128h.getCount());
            a.m281b(this.f178b.f129i);
            a.m282c(this.f178b.f129i);
        }
    }
}
