package android.support.v4.view.p019a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

public final class C0626b {
    public static final C0615j f1916a;
    public final AccessibilityNodeInfo f1917b;
    public int f1918c = -1;

    public static class C0614a {
        public static final C0614a f1883A = new C0614a(C0626b.f1916a.mo616d());
        public static final C0614a f1884B = new C0614a(C0626b.f1916a.mo618f());
        public static final C0614a f1885C = new C0614a(C0626b.f1916a.mo619g());
        public static final C0614a f1886D = new C0614a(C0626b.f1916a.mo620h());
        public static final C0614a f1887a = new C0614a(1);
        public static final C0614a f1888b = new C0614a(2);
        public static final C0614a f1889c = new C0614a(4);
        public static final C0614a f1890d = new C0614a(8);
        public static final C0614a f1891e = new C0614a(16);
        public static final C0614a f1892f = new C0614a(32);
        public static final C0614a f1893g = new C0614a(64);
        public static final C0614a f1894h = new C0614a(128);
        public static final C0614a f1895i = new C0614a(256);
        public static final C0614a f1896j = new C0614a(512);
        public static final C0614a f1897k = new C0614a(1024);
        public static final C0614a f1898l = new C0614a((int) ItemAnimator.FLAG_MOVED);
        public static final C0614a f1899m = new C0614a(4096);
        public static final C0614a f1900n = new C0614a((int) FragmentTransaction.TRANSIT_EXIT_MASK);
        public static final C0614a f1901o = new C0614a(16384);
        public static final C0614a f1902p = new C0614a(32768);
        public static final C0614a f1903q = new C0614a(65536);
        public static final C0614a f1904r = new C0614a(131072);
        public static final C0614a f1905s = new C0614a(262144);
        public static final C0614a f1906t = new C0614a(524288);
        public static final C0614a f1907u = new C0614a(1048576);
        public static final C0614a f1908v = new C0614a(2097152);
        public static final C0614a f1909w = new C0614a(C0626b.f1916a.mo614b());
        public static final C0614a f1910x = new C0614a(C0626b.f1916a.mo613a());
        public static final C0614a f1911y = new C0614a(C0626b.f1916a.mo615c());
        public static final C0614a f1912z = new C0614a(C0626b.f1916a.mo617e());
        final Object f1913E;

        private C0614a(int i) {
            this(C0626b.f1916a.mo609a(i));
        }

        private C0614a(Object obj) {
            this.f1913E = obj;
        }
    }

    static class C0615j {
        C0615j() {
        }

        public int mo597a(Object obj) {
            return 0;
        }

        public Object mo613a() {
            return null;
        }

        public Object mo609a(int i) {
            return null;
        }

        public Object mo598a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return null;
        }

        public Object mo599a(int i, int i2, boolean z, int i3) {
            return null;
        }

        public void mo589a(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        }

        public void mo595a(AccessibilityNodeInfo accessibilityNodeInfo, View view) {
        }

        public void mo610a(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        }

        public void mo600a(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        }

        public void mo590a(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        }

        public boolean mo591a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return false;
        }

        public int mo601b(Object obj) {
            return 0;
        }

        public Object mo614b() {
            return null;
        }

        public void mo602b(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        }

        public void mo592b(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        }

        public boolean mo593b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return false;
        }

        public int mo594c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return 0;
        }

        public int mo603c(Object obj) {
            return 0;
        }

        public Object mo615c() {
            return null;
        }

        public void mo604c(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        }

        public boolean mo611c(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
            return false;
        }

        public int mo605d(Object obj) {
            return 0;
        }

        public Object mo616d() {
            return null;
        }

        public String mo596d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return null;
        }

        public Object mo617e() {
            return null;
        }

        public Object mo606e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return null;
        }

        public boolean mo612e(Object obj) {
            return false;
        }

        public Object mo618f() {
            return null;
        }

        public void mo607f(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public Object mo619g() {
            return null;
        }

        public void mo608g(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public Object mo620h() {
            return null;
        }
    }

    static class C0616b extends C0615j {
        C0616b() {
        }

        public final void mo589a(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            accessibilityNodeInfo.setMovementGranularities(i);
        }

        public final void mo590a(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setVisibleToUser(z);
        }

        public final boolean mo591a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isVisibleToUser();
        }

        public final void mo592b(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityFocused(z);
        }

        public final boolean mo593b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityFocused();
        }

        public final int mo594c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMovementGranularities();
        }
    }

    static class C0617c extends C0616b {
        C0617c() {
        }

        public final void mo595a(AccessibilityNodeInfo accessibilityNodeInfo, View view) {
            accessibilityNodeInfo.setLabelFor(view);
        }
    }

    static class C0618d extends C0617c {
        C0618d() {
        }

        public final String mo596d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getViewIdResourceName();
        }
    }

    static class C0619e extends C0618d {
        C0619e() {
        }

        public final int mo597a(Object obj) {
            return ((CollectionItemInfo) obj).getColumnIndex();
        }

        public Object mo598a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return CollectionItemInfo.obtain(i, i2, i3, i4, z);
        }

        public Object mo599a(int i, int i2, boolean z, int i3) {
            return CollectionInfo.obtain(i, i2, z);
        }

        public final void mo600a(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
            accessibilityNodeInfo.setCollectionInfo((CollectionInfo) obj);
        }

        public final int mo601b(Object obj) {
            return ((CollectionItemInfo) obj).getColumnSpan();
        }

        public final void mo602b(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
            accessibilityNodeInfo.setCollectionItemInfo((CollectionItemInfo) obj);
        }

        public final int mo603c(Object obj) {
            return ((CollectionItemInfo) obj).getRowIndex();
        }

        public final void mo604c(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setDismissable(z);
        }

        public final int mo605d(Object obj) {
            return ((CollectionItemInfo) obj).getRowSpan();
        }

        public final Object mo606e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getCollectionItemInfo();
        }

        public final void mo607f(AccessibilityNodeInfo accessibilityNodeInfo) {
            accessibilityNodeInfo.setContentInvalid(true);
        }

        public final void mo608g(AccessibilityNodeInfo accessibilityNodeInfo) {
            accessibilityNodeInfo.setCanOpenPopup(true);
        }
    }

    static class C0620f extends C0619e {
        C0620f() {
        }

        public final Object mo609a(int i) {
            return new AccessibilityAction(i, null);
        }

        public final Object mo598a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return CollectionItemInfo.obtain(i, i2, i3, i4, z, z2);
        }

        public final Object mo599a(int i, int i2, boolean z, int i3) {
            return CollectionInfo.obtain(i, i2, z, i3);
        }

        public final void mo610a(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setError(charSequence);
        }

        public final boolean mo611c(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
            return accessibilityNodeInfo.removeAction((AccessibilityAction) obj);
        }

        public final boolean mo612e(Object obj) {
            return ((CollectionItemInfo) obj).isSelected();
        }
    }

    static class C0621g extends C0620f {
        C0621g() {
        }
    }

    static class C0622h extends C0621g {
        C0622h() {
        }

        public final Object mo613a() {
            return AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        }

        public final Object mo614b() {
            return AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        }

        public final Object mo615c() {
            return AccessibilityAction.ACTION_SCROLL_UP;
        }

        public final Object mo616d() {
            return AccessibilityAction.ACTION_SCROLL_DOWN;
        }

        public final Object mo617e() {
            return AccessibilityAction.ACTION_SCROLL_LEFT;
        }

        public final Object mo618f() {
            return AccessibilityAction.ACTION_SCROLL_RIGHT;
        }

        public final Object mo619g() {
            return AccessibilityAction.ACTION_CONTEXT_CLICK;
        }
    }

    static class C0623i extends C0622h {
        C0623i() {
        }

        public final Object mo620h() {
            return AccessibilityAction.ACTION_SET_PROGRESS;
        }
    }

    public static class C0624k {
        public final Object f1914a;

        public C0624k(Object obj) {
            this.f1914a = obj;
        }
    }

    public static class C0625l {
        public final Object f1915a;

        public C0625l(Object obj) {
            this.f1915a = obj;
        }

        public static C0625l m1681a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new C0625l(C0626b.f1916a.mo598a(i, i2, i3, i4, z, z2));
        }
    }

    static {
        if (VERSION.SDK_INT >= 24) {
            f1916a = new C0623i();
        } else if (VERSION.SDK_INT >= 23) {
            f1916a = new C0622h();
        } else if (VERSION.SDK_INT >= 22) {
            f1916a = new C0621g();
        } else if (VERSION.SDK_INT >= 21) {
            f1916a = new C0620f();
        } else if (VERSION.SDK_INT >= 19) {
            f1916a = new C0619e();
        } else if (VERSION.SDK_INT >= 18) {
            f1916a = new C0618d();
        } else if (VERSION.SDK_INT >= 17) {
            f1916a = new C0617c();
        } else if (VERSION.SDK_INT >= 16) {
            f1916a = new C0616b();
        } else {
            f1916a = new C0615j();
        }
    }

    private C0626b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1917b = accessibilityNodeInfo;
    }

    public static C0626b m1682a(C0626b c0626b) {
        return C0626b.m1683a(AccessibilityNodeInfo.obtain(c0626b.f1917b));
    }

    public static C0626b m1683a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0626b(accessibilityNodeInfo);
    }

    public final void m1684a(int i) {
        this.f1917b.addAction(i);
    }

    public final void m1685a(Rect rect) {
        this.f1917b.getBoundsInParent(rect);
    }

    public final void m1686a(View view) {
        this.f1917b.setSource(view);
    }

    public final void m1687a(CharSequence charSequence) {
        this.f1917b.setPackageName(charSequence);
    }

    public final void m1688a(Object obj) {
        f1916a.mo602b(this.f1917b, ((C0625l) obj).f1915a);
    }

    public final void m1689a(boolean z) {
        this.f1917b.setCheckable(z);
    }

    public final boolean m1690a() {
        return f1916a.mo591a(this.f1917b);
    }

    public final boolean m1691a(C0614a c0614a) {
        return f1916a.mo611c(this.f1917b, c0614a.f1913E);
    }

    public final void m1692b(Rect rect) {
        this.f1917b.setBoundsInParent(rect);
    }

    public final void m1693b(View view) {
        this.f1917b.addChild(view);
    }

    public final void m1694b(CharSequence charSequence) {
        this.f1917b.setClassName(charSequence);
    }

    public final void m1695b(boolean z) {
        this.f1917b.setFocusable(z);
    }

    public final boolean m1696b() {
        return f1916a.mo593b(this.f1917b);
    }

    public final void m1697c(Rect rect) {
        this.f1917b.getBoundsInScreen(rect);
    }

    public final void m1698c(View view) {
        this.f1917b.setParent(view);
    }

    public final void m1699c(CharSequence charSequence) {
        this.f1917b.setContentDescription(charSequence);
    }

    public final void m1700c(boolean z) {
        this.f1917b.setFocused(z);
    }

    public final void m1701d(Rect rect) {
        this.f1917b.setBoundsInScreen(rect);
    }

    public final void m1702d(boolean z) {
        f1916a.mo590a(this.f1917b, z);
    }

    public final void m1703e(boolean z) {
        f1916a.mo592b(this.f1917b, z);
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
        C0626b c0626b = (C0626b) obj;
        return this.f1917b == null ? c0626b.f1917b == null : this.f1917b.equals(c0626b.f1917b);
    }

    public final void m1704f(boolean z) {
        this.f1917b.setSelected(z);
    }

    public final void m1705g(boolean z) {
        this.f1917b.setClickable(z);
    }

    public final void m1706h(boolean z) {
        this.f1917b.setLongClickable(z);
    }

    public final int hashCode() {
        return this.f1917b == null ? 0 : this.f1917b.hashCode();
    }

    public final void m1707i(boolean z) {
        this.f1917b.setEnabled(z);
    }

    public final void m1708j(boolean z) {
        this.f1917b.setScrollable(z);
    }

    public final void m1709k(boolean z) {
        f1916a.mo604c(this.f1917b, z);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        m1685a(rect);
        stringBuilder.append("; boundsInParent: " + rect);
        m1697c(rect);
        stringBuilder.append("; boundsInScreen: " + rect);
        stringBuilder.append("; packageName: ").append(this.f1917b.getPackageName());
        stringBuilder.append("; className: ").append(this.f1917b.getClassName());
        stringBuilder.append("; text: ").append(this.f1917b.getText());
        stringBuilder.append("; contentDescription: ").append(this.f1917b.getContentDescription());
        stringBuilder.append("; viewId: ").append(f1916a.mo596d(this.f1917b));
        stringBuilder.append("; checkable: ").append(this.f1917b.isCheckable());
        stringBuilder.append("; checked: ").append(this.f1917b.isChecked());
        stringBuilder.append("; focusable: ").append(this.f1917b.isFocusable());
        stringBuilder.append("; focused: ").append(this.f1917b.isFocused());
        stringBuilder.append("; selected: ").append(this.f1917b.isSelected());
        stringBuilder.append("; clickable: ").append(this.f1917b.isClickable());
        stringBuilder.append("; longClickable: ").append(this.f1917b.isLongClickable());
        stringBuilder.append("; enabled: ").append(this.f1917b.isEnabled());
        stringBuilder.append("; password: ").append(this.f1917b.isPassword());
        stringBuilder.append("; scrollable: " + this.f1917b.isScrollable());
        stringBuilder.append("; [");
        int actions = this.f1917b.getActions();
        while (actions != 0) {
            String str;
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
            int i = (numberOfTrailingZeros ^ -1) & actions;
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
                case 128:
                    str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    break;
                case 256:
                    str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    break;
                case 512:
                    str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    break;
                case 1024:
                    str = "ACTION_NEXT_HTML_ELEMENT";
                    break;
                case ItemAnimator.FLAG_MOVED /*2048*/:
                    str = "ACTION_PREVIOUS_HTML_ELEMENT";
                    break;
                case 4096:
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
                case 65536:
                    str = "ACTION_CUT";
                    break;
                case 131072:
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
            actions = i;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
