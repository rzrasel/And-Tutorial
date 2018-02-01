package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

public final class C0688u {
    static final C0685c f1988a;

    static class C0685c {
        C0685c() {
        }

        public void mo690a(ViewParent viewParent, View view) {
            if (viewParent instanceof C0179k) {
                ((C0179k) viewParent).onStopNestedScroll(view);
            }
        }

        public void mo691a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof C0179k) {
                ((C0179k) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        public void mo692a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof C0179k) {
                ((C0179k) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        public boolean mo693a(ViewParent viewParent, View view, float f, float f2) {
            return viewParent instanceof C0179k ? ((C0179k) viewParent).onNestedPreFling(view, f, f2) : false;
        }

        public boolean mo694a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent instanceof C0179k ? ((C0179k) viewParent).onNestedFling(view, f, f2, z) : false;
        }

        public boolean mo695a(ViewParent viewParent, View view, View view2, int i) {
            return viewParent instanceof C0179k ? ((C0179k) viewParent).onStartNestedScroll(view, view2, i) : false;
        }

        public void mo696b(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof C0179k) {
                ((C0179k) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    static class C0686a extends C0685c {
        C0686a() {
        }
    }

    static class C0687b extends C0686a {
        C0687b() {
        }

        public final void mo690a(ViewParent viewParent, View view) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                new StringBuilder("ViewParent ").append(viewParent).append(" does not implement interface method onStopNestedScroll");
            }
        }

        public final void mo691a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                new StringBuilder("ViewParent ").append(viewParent).append(" does not implement interface method onNestedScroll");
            }
        }

        public final void mo692a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                new StringBuilder("ViewParent ").append(viewParent).append(" does not implement interface method onNestedPreScroll");
            }
        }

        public final boolean mo693a(ViewParent viewParent, View view, float f, float f2) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                new StringBuilder("ViewParent ").append(viewParent).append(" does not implement interface method onNestedPreFling");
                return false;
            }
        }

        public final boolean mo694a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                new StringBuilder("ViewParent ").append(viewParent).append(" does not implement interface method onNestedFling");
                return false;
            }
        }

        public final boolean mo695a(ViewParent viewParent, View view, View view2, int i) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                new StringBuilder("ViewParent ").append(viewParent).append(" does not implement interface method onStartNestedScroll");
                return false;
            }
        }

        public final void mo696b(ViewParent viewParent, View view, View view2, int i) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                new StringBuilder("ViewParent ").append(viewParent).append(" does not implement interface method onNestedScrollAccepted");
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1988a = new C0687b();
        } else if (VERSION.SDK_INT >= 19) {
            f1988a = new C0686a();
        } else {
            f1988a = new C0685c();
        }
    }

    public static void m1975a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C0180l) {
            ((C0180l) viewParent).mo149c(view, i);
        } else if (i == 0) {
            f1988a.mo690a(viewParent, view);
        }
    }

    public static void m1976a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof C0180l) {
            ((C0180l) viewParent).mo145a(i4, i5);
        } else if (i5 == 0) {
            f1988a.mo691a(viewParent, view, i, i2, i3, i4);
        }
    }

    public static void m1977a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C0180l) {
            ((C0180l) viewParent).mo146a(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            f1988a.mo692a(viewParent, view, i, i2, iArr);
        }
    }

    public static boolean m1978a(ViewParent viewParent, View view, float f, float f2) {
        return f1988a.mo693a(viewParent, view, f, f2);
    }

    public static boolean m1979a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return f1988a.mo694a(viewParent, view, f, f2, z);
    }

    public static boolean m1980a(ViewParent viewParent, View view, View view2, int i, int i2) {
        return viewParent instanceof C0180l ? ((C0180l) viewParent).mo148b(view, i, i2) : i2 == 0 ? f1988a.mo695a(viewParent, view, view2, i) : false;
    }

    public static void m1981b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C0180l) {
            ((C0180l) viewParent).mo147b(view2, i);
        } else if (i2 == 0) {
            f1988a.mo696b(viewParent, view, view2, i);
        }
    }
}
