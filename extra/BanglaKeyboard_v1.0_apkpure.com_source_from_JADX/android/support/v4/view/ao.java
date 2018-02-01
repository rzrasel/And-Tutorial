package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

class ao implements aw {
    WeakHashMap f169a = null;

    ao() {
    }

    long mo225a() {
        return 10;
    }

    public void mo210a(View view, int i, int i2, int i3, int i4) {
        view.invalidate(i, i2, i3, i4);
    }

    public void mo211a(View view, int i, Paint paint) {
    }

    public void mo212a(View view, Paint paint) {
    }

    public void mo213a(View view, C0075a c0075a) {
    }

    public void mo214a(View view, Runnable runnable) {
        view.postDelayed(runnable, mo225a());
    }

    public boolean mo215a(View view) {
        return false;
    }

    public boolean mo216a(View view, int i) {
        return false;
    }

    public int mo217b(View view) {
        return 2;
    }

    public void mo218b(View view, int i) {
    }

    public void mo219c(View view) {
        view.invalidate();
    }

    public int mo220d(View view) {
        return 0;
    }

    public int mo221e(View view) {
        return 0;
    }

    public int mo222f(View view) {
        return 0;
    }

    public ViewParent mo223g(View view) {
        return view.getParent();
    }

    public boolean mo224h(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }
}
