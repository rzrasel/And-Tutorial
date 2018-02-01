package android.support.v4.view.p002a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import com.actionbarsherlock.view.Menu;

public final class C0049a {
    private static final C0050c f147a;
    private final Object f148b;

    static {
        if (VERSION.SDK_INT >= 19) {
            f147a = new C0055f();
        } else if (VERSION.SDK_INT >= 18) {
            f147a = new C0054e();
        } else if (VERSION.SDK_INT >= 16) {
            f147a = new C0053d();
        } else if (VERSION.SDK_INT >= 14) {
            f147a = new C0052b();
        } else {
            f147a = new C0051g();
        }
    }

    public C0049a(Object obj) {
        this.f148b = obj;
    }

    public static C0049a m92a(C0049a c0049a) {
        Object a = f147a.mo148a(c0049a.f148b);
        return a != null ? new C0049a(a) : null;
    }

    public final Object m93a() {
        return this.f148b;
    }

    public final void m94a(int i) {
        f147a.mo149a(this.f148b, i);
    }

    public final void m95a(Rect rect) {
        f147a.mo150a(this.f148b, rect);
    }

    public final void m96a(View view) {
        f147a.mo162c(this.f148b, view);
    }

    public final void m97a(CharSequence charSequence) {
        f147a.mo163c(this.f148b, charSequence);
    }

    public final void m98a(boolean z) {
        f147a.mo164c(this.f148b, z);
    }

    public final int m99b() {
        return f147a.mo154b(this.f148b);
    }

    public final void m100b(int i) {
        f147a.mo155b(this.f148b, i);
    }

    public final void m101b(Rect rect) {
        f147a.mo161c(this.f148b, rect);
    }

    public final void m102b(View view) {
        f147a.mo151a(this.f148b, view);
    }

    public final void m103b(CharSequence charSequence) {
        f147a.mo152a(this.f148b, charSequence);
    }

    public final void m104b(boolean z) {
        f147a.mo167d(this.f148b, z);
    }

    public final int m105c() {
        return f147a.mo186r(this.f148b);
    }

    public final void m106c(Rect rect) {
        f147a.mo156b(this.f148b, rect);
    }

    public final void m107c(View view) {
        f147a.mo157b(this.f148b, view);
    }

    public final void m108c(CharSequence charSequence) {
        f147a.mo158b(this.f148b, charSequence);
    }

    public final void m109c(boolean z) {
        f147a.mo174h(this.f148b, z);
    }

    public final void m110d(Rect rect) {
        f147a.mo166d(this.f148b, rect);
    }

    public final void m111d(boolean z) {
        f147a.mo176i(this.f148b, z);
    }

    public final boolean m112d() {
        return f147a.mo179k(this.f148b);
    }

    public final void m113e(boolean z) {
        f147a.mo172g(this.f148b, z);
    }

    public final boolean m114e() {
        return f147a.mo180l(this.f148b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C0049a c0049a = (C0049a) obj;
        return this.f148b == null ? c0049a.f148b == null : this.f148b.equals(c0049a.f148b);
    }

    public final void m115f(boolean z) {
        f147a.mo153a(this.f148b, z);
    }

    public final boolean m116f() {
        return f147a.mo187s(this.f148b);
    }

    public final void m117g(boolean z) {
        f147a.mo169e(this.f148b, z);
    }

    public final boolean m118g() {
        return f147a.mo188t(this.f148b);
    }

    public final void m119h(boolean z) {
        f147a.mo159b(this.f148b, z);
    }

    public final boolean m120h() {
        return f147a.mo184p(this.f148b);
    }

    public final int hashCode() {
        return this.f148b == null ? 0 : this.f148b.hashCode();
    }

    public final void m121i(boolean z) {
        f147a.mo171f(this.f148b, z);
    }

    public final boolean m122i() {
        return f147a.mo177i(this.f148b);
    }

    public final boolean m123j() {
        return f147a.mo181m(this.f148b);
    }

    public final boolean m124k() {
        return f147a.mo178j(this.f148b);
    }

    public final CharSequence m125l() {
        return f147a.mo168e(this.f148b);
    }

    public final CharSequence m126m() {
        return f147a.mo160c(this.f148b);
    }

    public final CharSequence m127n() {
        return f147a.mo165d(this.f148b);
    }

    public final void m128o() {
        f147a.mo185q(this.f148b);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        m95a(rect);
        stringBuilder.append("; boundsInParent: " + rect);
        m106c(rect);
        stringBuilder.append("; boundsInScreen: " + rect);
        stringBuilder.append("; packageName: ").append(m125l());
        stringBuilder.append("; className: ").append(m126m());
        stringBuilder.append("; text: ").append(f147a.mo170f(this.f148b));
        stringBuilder.append("; contentDescription: ").append(m127n());
        stringBuilder.append("; viewId: ").append(f147a.mo189u(this.f148b));
        stringBuilder.append("; checkable: ").append(f147a.mo173g(this.f148b));
        stringBuilder.append("; checked: ").append(f147a.mo175h(this.f148b));
        stringBuilder.append("; focusable: ").append(m112d());
        stringBuilder.append("; focused: ").append(m114e());
        stringBuilder.append("; selected: ").append(m120h());
        stringBuilder.append("; clickable: ").append(m122i());
        stringBuilder.append("; longClickable: ").append(m123j());
        stringBuilder.append("; enabled: ").append(m124k());
        stringBuilder.append("; password: ").append(f147a.mo182n(this.f148b));
        stringBuilder.append("; scrollable: " + f147a.mo183o(this.f148b));
        stringBuilder.append("; [");
        int b = m99b();
        while (b != 0) {
            String str;
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
            int i = (numberOfTrailingZeros ^ -1) & b;
            switch (numberOfTrailingZeros) {
                case 1:
                    str = "ACTION_FOCUS";
                    break;
                case 2:
                    str = "ACTION_CLEAR_FOCUS";
                    break;
                case 4:
                    str = "ACTION_SELECT";
                    break;
                case 8:
                    str = "ACTION_CLEAR_SELECTION";
                    break;
                case 16:
                    str = "ACTION_CLICK";
                    break;
                case 32:
                    str = "ACTION_LONG_CLICK";
                    break;
                case 64:
                    str = "ACTION_ACCESSIBILITY_FOCUS";
                    break;
                case NotificationCompat.FLAG_HIGH_PRIORITY /*128*/:
                    str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    break;
                case NotificationCompat.FLAG_LOCAL_ONLY /*256*/:
                    str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    break;
                case NotificationCompat.FLAG_GROUP_SUMMARY /*512*/:
                    str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    break;
                case 1024:
                    str = "ACTION_NEXT_HTML_ELEMENT";
                    break;
                case 2048:
                    str = "ACTION_PREVIOUS_HTML_ELEMENT";
                    break;
                case FragmentTransaction.TRANSIT_ENTER_MASK /*4096*/:
                    str = "ACTION_SCROLL_FORWARD";
                    break;
                case FragmentTransaction.TRANSIT_EXIT_MASK /*8192*/:
                    str = "ACTION_SCROLL_BACKWARD";
                    break;
                case 16384:
                    str = "ACTION_COPY";
                    break;
                case 32768:
                    str = "ACTION_PASTE";
                    break;
                case Menu.CATEGORY_CONTAINER /*65536*/:
                    str = "ACTION_CUT";
                    break;
                case Menu.CATEGORY_SYSTEM /*131072*/:
                    str = "ACTION_SET_SELECTION";
                    break;
                default:
                    str = "ACTION_UNKNOWN";
                    break;
            }
            stringBuilder.append(str);
            if (i != 0) {
                stringBuilder.append(", ");
            }
            b = i;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
