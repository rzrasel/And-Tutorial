package android.support.v4.view.p002a;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

class C0052b extends C0051g {
    C0052b() {
    }

    public final Object mo148a(Object obj) {
        return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo) obj);
    }

    public final void mo149a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).addAction(i);
    }

    public final void mo150a(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInParent(rect);
    }

    public final void mo151a(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).addChild(view);
    }

    public final void mo152a(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setClassName(charSequence);
    }

    public final void mo153a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setClickable(z);
    }

    public final int mo154b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getActions();
    }

    public final void mo156b(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInScreen(rect);
    }

    public final void mo157b(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setParent(view);
    }

    public final void mo158b(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setContentDescription(charSequence);
    }

    public final void mo159b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setEnabled(z);
    }

    public final CharSequence mo160c(Object obj) {
        return ((AccessibilityNodeInfo) obj).getClassName();
    }

    public final void mo161c(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInParent(rect);
    }

    public final void mo162c(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setSource(view);
    }

    public final void mo163c(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setPackageName(charSequence);
    }

    public final void mo164c(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocusable(z);
    }

    public final CharSequence mo165d(Object obj) {
        return ((AccessibilityNodeInfo) obj).getContentDescription();
    }

    public final void mo166d(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInScreen(rect);
    }

    public final void mo167d(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocused(z);
    }

    public final CharSequence mo168e(Object obj) {
        return ((AccessibilityNodeInfo) obj).getPackageName();
    }

    public final void mo169e(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setLongClickable(z);
    }

    public final CharSequence mo170f(Object obj) {
        return ((AccessibilityNodeInfo) obj).getText();
    }

    public final void mo171f(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setScrollable(z);
    }

    public final void mo172g(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setSelected(z);
    }

    public final boolean mo173g(Object obj) {
        return ((AccessibilityNodeInfo) obj).isCheckable();
    }

    public final boolean mo175h(Object obj) {
        return ((AccessibilityNodeInfo) obj).isChecked();
    }

    public final boolean mo177i(Object obj) {
        return ((AccessibilityNodeInfo) obj).isClickable();
    }

    public final boolean mo178j(Object obj) {
        return ((AccessibilityNodeInfo) obj).isEnabled();
    }

    public final boolean mo179k(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocusable();
    }

    public final boolean mo180l(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocused();
    }

    public final boolean mo181m(Object obj) {
        return ((AccessibilityNodeInfo) obj).isLongClickable();
    }

    public final boolean mo182n(Object obj) {
        return ((AccessibilityNodeInfo) obj).isPassword();
    }

    public final boolean mo183o(Object obj) {
        return ((AccessibilityNodeInfo) obj).isScrollable();
    }

    public final boolean mo184p(Object obj) {
        return ((AccessibilityNodeInfo) obj).isSelected();
    }

    public final void mo185q(Object obj) {
        ((AccessibilityNodeInfo) obj).recycle();
    }
}
