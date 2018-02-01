package com.orange.studio.banglatype;

import android.content.Context;
import android.support.v4.view.C0124h;
import android.support.v4.view.C0665j;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

public class NestedScrollWebView extends WebView implements C0124h {
    public static final String f7918a = NestedScrollWebView.class.getSimpleName();
    private int f7919b;
    private final int[] f7920c;
    private final int[] f7921d;
    private int f7922e;
    private C0665j f7923f;

    public NestedScrollWebView(Context context) {
        super(context);
        this.f7920c = new int[2];
        this.f7921d = new int[2];
        m7158a();
    }

    public NestedScrollWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7920c = new int[2];
        this.f7921d = new int[2];
        m7158a();
    }

    public NestedScrollWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7920c = new int[2];
        this.f7921d = new int[2];
        m7158a();
    }

    private void m7158a() {
        this.f7923f = new C0665j(this);
        setNestedScrollingEnabled(true);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f7923f.m1784a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f7923f.m1783a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f7923f.m1789a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f7923f.m1787a(i, i2, i3, i4, iArr);
    }

    public boolean hasNestedScrollingParent() {
        return this.f7923f.m1785a(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f7923f.f1965a;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7922e = 0;
        }
        int y = (int) motionEvent.getY();
        motionEvent.offsetLocation(0.0f, (float) this.f7922e);
        switch (actionMasked) {
            case 0:
                this.f7919b = y;
                startNestedScroll(2);
                return super.onTouchEvent(motionEvent);
            case 1:
            case 3:
            case 5:
            case 6:
                stopNestedScroll();
                return super.onTouchEvent(motionEvent);
            case 2:
                actionMasked = this.f7919b - y;
                if (dispatchNestedPreScroll(0, actionMasked, this.f7921d, this.f7920c)) {
                    actionMasked -= this.f7921d[1];
                    obtain.offsetLocation(0.0f, (float) this.f7920c[1]);
                    this.f7922e += this.f7920c[1];
                }
                int scrollY = getScrollY();
                this.f7919b = y - this.f7920c[1];
                y = Math.max(0, scrollY + actionMasked);
                int i = actionMasked - (y - scrollY);
                if (dispatchNestedScroll(0, y - i, 0, i, this.f7920c)) {
                    this.f7919b -= this.f7920c[1];
                    obtain.offsetLocation(0.0f, (float) this.f7920c[1]);
                    this.f7922e += this.f7920c[1];
                }
                obtain.recycle();
                return super.onTouchEvent(obtain);
            default:
                return false;
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f7923f.m1782a(z);
    }

    public boolean startNestedScroll(int i) {
        return this.f7923f.m1786a(i, 0);
    }

    public void stopNestedScroll() {
        this.f7923f.m1791b(0);
    }
}
