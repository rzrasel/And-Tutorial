package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.p000a.C0001b;
import android.support.v4.p000a.C0002c;
import android.support.v4.p000a.C0003d;
import android.support.v4.widget.C0114o;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.actionbarsherlock.view.Menu;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ViewPager extends ViewGroup {
    private static final int[] f97a = new int[]{16842931};
    private static final bs af = new bs();
    private static final Comparator f98c = new bh();
    private static final Interpolator f99d = new bi();
    private boolean f100A;
    private boolean f101B;
    private int f102C;
    private int f103D;
    private int f104E;
    private float f105F;
    private float f106G;
    private float f107H;
    private float f108I;
    private int f109J = -1;
    private VelocityTracker f110K;
    private int f111L;
    private int f112M;
    private int f113N;
    private int f114O;
    private boolean f115P;
    private C0114o f116Q;
    private C0114o f117R;
    private boolean f118S = true;
    private boolean f119T = false;
    private boolean f120U;
    private int f121V;
    private bo f122W;
    private bo f123Z;
    private bn aa;
    private bp ab;
    private Method ac;
    private int ad;
    private ArrayList ae;
    private final Runnable ag = new bj(this);
    private int ah = 0;
    private int f124b;
    private final ArrayList f125e = new ArrayList();
    private final bl f126f = new bl();
    private final Rect f127g = new Rect();
    private aa f128h;
    private int f129i;
    private int f130j = -1;
    private Parcelable f131k = null;
    private ClassLoader f132l = null;
    private Scroller f133m;
    private bq f134n;
    private int f135o;
    private Drawable f136p;
    private int f137q;
    private int f138r;
    private float f139s = -3.4028235E38f;
    private float f140t = Float.MAX_VALUE;
    private int f141u;
    private int f142v;
    private boolean f143w;
    private boolean f144x;
    private boolean f145y;
    private int f146z = 1;

    public class LayoutParams extends android.view.ViewGroup.LayoutParams {
        public boolean f88a;
        public int f89b;
        float f90c = 0.0f;
        boolean f91d;
        int f92e;
        int f93f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f97a);
            this.f89b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        int f94a;
        Parcelable f95b;
        ClassLoader f96c;

        static {
            C0002c brVar = new br();
            if (VERSION.SDK_INT >= 13) {
                C0003d c0003d = new C0003d(brVar);
            }
            CREATOR = new C0001b(brVar);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f94a = parcel.readInt();
            this.f95b = parcel.readParcelable(classLoader);
            this.f96c = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f94a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f94a);
            parcel.writeParcelable(this.f95b, i);
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setDescendantFocusability(Menu.CATEGORY_ALTERNATIVE);
        setFocusable(true);
        Context context2 = getContext();
        this.f133m = new Scroller(context2, f99d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.f104E = ax.m391a(viewConfiguration);
        this.f111L = (int) (400.0f * f);
        this.f112M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f116Q = new C0114o(context2);
        this.f117R = new C0114o(context2);
        this.f113N = (int) (25.0f * f);
        this.f114O = (int) (2.0f * f);
        this.f102C = (int) (16.0f * f);
        an.m330a((View) this, new bm(this));
        if (an.m337d(this) == 0) {
            an.m335b(this, 1);
        }
    }

    private Rect m62a(Rect rect, View view) {
        Rect rect2 = rect == null ? new Rect() : rect;
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewPager parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    private bl m63a(int i, int i2) {
        bl blVar = new bl();
        blVar.f174b = i;
        blVar.f173a = this.f128h.instantiateItem((ViewGroup) this, i);
        blVar.f176d = this.f128h.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f125e.size()) {
            this.f125e.add(blVar);
        } else {
            this.f125e.add(i2, blVar);
        }
        return blVar;
    }

    private bl m64a(View view) {
        for (int i = 0; i < this.f125e.size(); i++) {
            bl blVar = (bl) this.f125e.get(i);
            if (this.f128h.isViewFromObject(view, blVar.f173a)) {
                return blVar;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m65a(int r19) {
        /*
        r18 = this;
        r3 = 0;
        r2 = 2;
        r0 = r18;
        r4 = r0.f129i;
        r0 = r19;
        if (r4 == r0) goto L_0x0334;
    L_0x000a:
        r0 = r18;
        r2 = r0.f129i;
        r0 = r19;
        if (r2 >= r0) goto L_0x0030;
    L_0x0012:
        r2 = 66;
    L_0x0014:
        r0 = r18;
        r3 = r0.f129i;
        r0 = r18;
        r3 = r0.m78b(r3);
        r0 = r19;
        r1 = r18;
        r1.f129i = r0;
        r4 = r3;
        r3 = r2;
    L_0x0026:
        r0 = r18;
        r2 = r0.f128h;
        if (r2 != 0) goto L_0x0033;
    L_0x002c:
        r18.m83d();
    L_0x002f:
        return;
    L_0x0030:
        r2 = 17;
        goto L_0x0014;
    L_0x0033:
        r0 = r18;
        r2 = r0.f145y;
        if (r2 == 0) goto L_0x003d;
    L_0x0039:
        r18.m83d();
        goto L_0x002f;
    L_0x003d:
        r2 = r18.getWindowToken();
        if (r2 == 0) goto L_0x002f;
    L_0x0043:
        r0 = r18;
        r2 = r0.f128h;
        r0 = r18;
        r2.startUpdate(r0);
        r0 = r18;
        r2 = r0.f146z;
        r5 = 0;
        r0 = r18;
        r6 = r0.f129i;
        r6 = r6 - r2;
        r11 = java.lang.Math.max(r5, r6);
        r0 = r18;
        r5 = r0.f128h;
        r12 = r5.getCount();
        r5 = r12 + -1;
        r0 = r18;
        r6 = r0.f129i;
        r2 = r2 + r6;
        r13 = java.lang.Math.min(r5, r2);
        r0 = r18;
        r2 = r0.f124b;
        if (r12 == r2) goto L_0x00d6;
    L_0x0073:
        r2 = r18.getResources();	 Catch:{ NotFoundException -> 0x00cc }
        r3 = r18.getId();	 Catch:{ NotFoundException -> 0x00cc }
        r2 = r2.getResourceName(r3);	 Catch:{ NotFoundException -> 0x00cc }
    L_0x007f:
        r3 = new java.lang.IllegalStateException;
        r4 = new java.lang.StringBuilder;
        r5 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r4.<init>(r5);
        r0 = r18;
        r5 = r0.f124b;
        r4 = r4.append(r5);
        r5 = ", found: ";
        r4 = r4.append(r5);
        r4 = r4.append(r12);
        r5 = " Pager id: ";
        r4 = r4.append(r5);
        r2 = r4.append(r2);
        r4 = " Pager class: ";
        r2 = r2.append(r4);
        r4 = r18.getClass();
        r2 = r2.append(r4);
        r4 = " Problematic adapter: ";
        r2 = r2.append(r4);
        r0 = r18;
        r4 = r0.f128h;
        r4 = r4.getClass();
        r2 = r2.append(r4);
        r2 = r2.toString();
        r3.<init>(r2);
        throw r3;
    L_0x00cc:
        r2 = move-exception;
        r2 = r18.getId();
        r2 = java.lang.Integer.toHexString(r2);
        goto L_0x007f;
    L_0x00d6:
        r6 = 0;
        r2 = 0;
        r5 = r2;
    L_0x00d9:
        r0 = r18;
        r2 = r0.f125e;
        r2 = r2.size();
        if (r5 >= r2) goto L_0x0331;
    L_0x00e3:
        r0 = r18;
        r2 = r0.f125e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.bl) r2;
        r7 = r2.f174b;
        r0 = r18;
        r8 = r0.f129i;
        if (r7 < r8) goto L_0x016b;
    L_0x00f5:
        r7 = r2.f174b;
        r0 = r18;
        r8 = r0.f129i;
        if (r7 != r8) goto L_0x0331;
    L_0x00fd:
        if (r2 != 0) goto L_0x032e;
    L_0x00ff:
        if (r12 <= 0) goto L_0x032e;
    L_0x0101:
        r0 = r18;
        r2 = r0.f129i;
        r0 = r18;
        r2 = r0.m63a(r2, r5);
        r10 = r2;
    L_0x010c:
        if (r10 == 0) goto L_0x028f;
    L_0x010e:
        r9 = 0;
        r8 = r5 + -1;
        if (r8 < 0) goto L_0x0170;
    L_0x0113:
        r0 = r18;
        r2 = r0.f125e;
        r2 = r2.get(r8);
        r2 = (android.support.v4.view.bl) r2;
    L_0x011d:
        r14 = r18.getClientWidth();
        if (r14 > 0) goto L_0x0172;
    L_0x0123:
        r6 = 0;
    L_0x0124:
        r0 = r18;
        r7 = r0.f129i;
        r7 = r7 + -1;
        r16 = r7;
        r7 = r9;
        r9 = r16;
        r17 = r8;
        r8 = r5;
        r5 = r17;
    L_0x0134:
        if (r9 < 0) goto L_0x01b8;
    L_0x0136:
        r15 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r15 < 0) goto L_0x0182;
    L_0x013a:
        if (r9 >= r11) goto L_0x0182;
    L_0x013c:
        if (r2 == 0) goto L_0x01b8;
    L_0x013e:
        r15 = r2.f174b;
        if (r9 != r15) goto L_0x0168;
    L_0x0142:
        r15 = r2.f175c;
        if (r15 != 0) goto L_0x0168;
    L_0x0146:
        r0 = r18;
        r15 = r0.f125e;
        r15.remove(r5);
        r0 = r18;
        r15 = r0.f128h;
        r2 = r2.f173a;
        r0 = r18;
        r15.destroyItem(r0, r9, r2);
        r5 = r5 + -1;
        r8 = r8 + -1;
        if (r5 < 0) goto L_0x0180;
    L_0x015e:
        r0 = r18;
        r2 = r0.f125e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.bl) r2;
    L_0x0168:
        r9 = r9 + -1;
        goto L_0x0134;
    L_0x016b:
        r2 = r5 + 1;
        r5 = r2;
        goto L_0x00d9;
    L_0x0170:
        r2 = 0;
        goto L_0x011d;
    L_0x0172:
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = r10.f176d;
        r6 = r6 - r7;
        r7 = r18.getPaddingLeft();
        r7 = (float) r7;
        r15 = (float) r14;
        r7 = r7 / r15;
        r6 = r6 + r7;
        goto L_0x0124;
    L_0x0180:
        r2 = 0;
        goto L_0x0168;
    L_0x0182:
        if (r2 == 0) goto L_0x019c;
    L_0x0184:
        r15 = r2.f174b;
        if (r9 != r15) goto L_0x019c;
    L_0x0188:
        r2 = r2.f176d;
        r7 = r7 + r2;
        r5 = r5 + -1;
        if (r5 < 0) goto L_0x019a;
    L_0x018f:
        r0 = r18;
        r2 = r0.f125e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.bl) r2;
        goto L_0x0168;
    L_0x019a:
        r2 = 0;
        goto L_0x0168;
    L_0x019c:
        r2 = r5 + 1;
        r0 = r18;
        r2 = r0.m63a(r9, r2);
        r2 = r2.f176d;
        r7 = r7 + r2;
        r8 = r8 + 1;
        if (r5 < 0) goto L_0x01b6;
    L_0x01ab:
        r0 = r18;
        r2 = r0.f125e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.bl) r2;
        goto L_0x0168;
    L_0x01b6:
        r2 = 0;
        goto L_0x0168;
    L_0x01b8:
        r6 = r10.f176d;
        r9 = r8 + 1;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x028a;
    L_0x01c2:
        r0 = r18;
        r2 = r0.f125e;
        r2 = r2.size();
        if (r9 >= r2) goto L_0x022c;
    L_0x01cc:
        r0 = r18;
        r2 = r0.f125e;
        r2 = r2.get(r9);
        r2 = (android.support.v4.view.bl) r2;
        r7 = r2;
    L_0x01d7:
        if (r14 > 0) goto L_0x022e;
    L_0x01d9:
        r2 = 0;
        r5 = r2;
    L_0x01db:
        r0 = r18;
        r2 = r0.f129i;
        r2 = r2 + 1;
        r16 = r7;
        r7 = r9;
        r9 = r2;
        r2 = r16;
    L_0x01e7:
        if (r9 >= r12) goto L_0x028a;
    L_0x01e9:
        r11 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1));
        if (r11 < 0) goto L_0x023c;
    L_0x01ed:
        if (r9 <= r13) goto L_0x023c;
    L_0x01ef:
        if (r2 == 0) goto L_0x028a;
    L_0x01f1:
        r11 = r2.f174b;
        if (r9 != r11) goto L_0x0327;
    L_0x01f5:
        r11 = r2.f175c;
        if (r11 != 0) goto L_0x0327;
    L_0x01f9:
        r0 = r18;
        r11 = r0.f125e;
        r11.remove(r7);
        r0 = r18;
        r11 = r0.f128h;
        r2 = r2.f173a;
        r0 = r18;
        r11.destroyItem(r0, r9, r2);
        r0 = r18;
        r2 = r0.f125e;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x023a;
    L_0x0215:
        r0 = r18;
        r2 = r0.f125e;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.bl) r2;
    L_0x021f:
        r16 = r6;
        r6 = r2;
        r2 = r16;
    L_0x0224:
        r9 = r9 + 1;
        r16 = r2;
        r2 = r6;
        r6 = r16;
        goto L_0x01e7;
    L_0x022c:
        r7 = 0;
        goto L_0x01d7;
    L_0x022e:
        r2 = r18.getPaddingRight();
        r2 = (float) r2;
        r5 = (float) r14;
        r2 = r2 / r5;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 + r5;
        r5 = r2;
        goto L_0x01db;
    L_0x023a:
        r2 = 0;
        goto L_0x021f;
    L_0x023c:
        if (r2 == 0) goto L_0x0263;
    L_0x023e:
        r11 = r2.f174b;
        if (r9 != r11) goto L_0x0263;
    L_0x0242:
        r2 = r2.f176d;
        r6 = r6 + r2;
        r7 = r7 + 1;
        r0 = r18;
        r2 = r0.f125e;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x0261;
    L_0x0251:
        r0 = r18;
        r2 = r0.f125e;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.bl) r2;
    L_0x025b:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x0224;
    L_0x0261:
        r2 = 0;
        goto L_0x025b;
    L_0x0263:
        r0 = r18;
        r2 = r0.m63a(r9, r7);
        r7 = r7 + 1;
        r2 = r2.f176d;
        r6 = r6 + r2;
        r0 = r18;
        r2 = r0.f125e;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x0288;
    L_0x0278:
        r0 = r18;
        r2 = r0.f125e;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.bl) r2;
    L_0x0282:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x0224;
    L_0x0288:
        r2 = 0;
        goto L_0x0282;
    L_0x028a:
        r0 = r18;
        r0.m72a(r10, r8, r4);
    L_0x028f:
        r0 = r18;
        r4 = r0.f128h;
        r0 = r18;
        r5 = r0.f129i;
        if (r10 == 0) goto L_0x02de;
    L_0x0299:
        r2 = r10.f173a;
    L_0x029b:
        r0 = r18;
        r4.setPrimaryItem(r0, r5, r2);
        r0 = r18;
        r2 = r0.f128h;
        r0 = r18;
        r2.finishUpdate(r0);
        r5 = r18.getChildCount();
        r2 = 0;
        r4 = r2;
    L_0x02af:
        if (r4 >= r5) goto L_0x02e0;
    L_0x02b1:
        r0 = r18;
        r6 = r0.getChildAt(r4);
        r2 = r6.getLayoutParams();
        r2 = (android.support.v4.view.ViewPager.LayoutParams) r2;
        r2.f93f = r4;
        r7 = r2.f88a;
        if (r7 != 0) goto L_0x02da;
    L_0x02c3:
        r7 = r2.f90c;
        r8 = 0;
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 != 0) goto L_0x02da;
    L_0x02ca:
        r0 = r18;
        r6 = r0.m64a(r6);
        if (r6 == 0) goto L_0x02da;
    L_0x02d2:
        r7 = r6.f176d;
        r2.f90c = r7;
        r6 = r6.f174b;
        r2.f92e = r6;
    L_0x02da:
        r2 = r4 + 1;
        r4 = r2;
        goto L_0x02af;
    L_0x02de:
        r2 = 0;
        goto L_0x029b;
    L_0x02e0:
        r18.m83d();
        r2 = r18.hasFocus();
        if (r2 == 0) goto L_0x002f;
    L_0x02e9:
        r2 = r18.findFocus();
        if (r2 == 0) goto L_0x0325;
    L_0x02ef:
        r0 = r18;
        r2 = r0.m79b(r2);
    L_0x02f5:
        if (r2 == 0) goto L_0x02ff;
    L_0x02f7:
        r2 = r2.f174b;
        r0 = r18;
        r4 = r0.f129i;
        if (r2 == r4) goto L_0x002f;
    L_0x02ff:
        r2 = 0;
    L_0x0300:
        r4 = r18.getChildCount();
        if (r2 >= r4) goto L_0x002f;
    L_0x0306:
        r0 = r18;
        r4 = r0.getChildAt(r2);
        r0 = r18;
        r5 = r0.m64a(r4);
        if (r5 == 0) goto L_0x0322;
    L_0x0314:
        r5 = r5.f174b;
        r0 = r18;
        r6 = r0.f129i;
        if (r5 != r6) goto L_0x0322;
    L_0x031c:
        r4 = r4.requestFocus(r3);
        if (r4 != 0) goto L_0x002f;
    L_0x0322:
        r2 = r2 + 1;
        goto L_0x0300;
    L_0x0325:
        r2 = 0;
        goto L_0x02f5;
    L_0x0327:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x0224;
    L_0x032e:
        r10 = r2;
        goto L_0x010c;
    L_0x0331:
        r2 = r6;
        goto L_0x00fd;
    L_0x0334:
        r4 = r3;
        r3 = r2;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.a(int):void");
    }

    private void m66a(int i, float f) {
        int paddingLeft;
        int paddingRight;
        if (this.f121V > 0) {
            int scrollX = getScrollX();
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                int i3;
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f88a) {
                    int max;
                    switch (layoutParams.f89b & 7) {
                        case 1:
                            max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            i3 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i3;
                            break;
                        case 3:
                            max = childAt.getWidth() + paddingLeft;
                            i3 = paddingLeft;
                            paddingLeft = paddingRight;
                            paddingRight = max;
                            max = i3;
                            break;
                        case 5:
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            i3 = paddingRight + childAt.getMeasuredWidth();
                            paddingRight = paddingLeft;
                            paddingLeft = i3;
                            break;
                        default:
                            max = paddingLeft;
                            i3 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i3;
                            break;
                    }
                    max = (max + scrollX) - childAt.getLeft();
                    if (max != 0) {
                        childAt.offsetLeftAndRight(max);
                    }
                } else {
                    i3 = paddingRight;
                    paddingRight = paddingLeft;
                    paddingLeft = i3;
                }
                i2++;
                i3 = paddingLeft;
                paddingLeft = paddingRight;
                paddingRight = i3;
            }
        }
        if (this.f122W != null) {
            this.f122W.mo205a(i, f);
        }
        if (this.f123Z != null) {
            this.f123Z.mo205a(i, f);
        }
        if (this.ab != null) {
            getScrollX();
            paddingRight = getChildCount();
            for (paddingLeft = 0; paddingLeft < paddingRight; paddingLeft++) {
                View childAt2 = getChildAt(paddingLeft);
                if (!((LayoutParams) childAt2.getLayoutParams()).f88a) {
                    childAt2.getLeft();
                    getClientWidth();
                    bp bpVar = this.ab;
                }
            }
        }
        this.f120U = true;
    }

    private void m67a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f125e.isEmpty()) {
            bl b = m78b(this.f129i);
            int min = (int) ((b != null ? Math.min(b.f177e, this.f140t) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m74a(false);
                scrollTo(min, getScrollY());
                return;
            }
            return;
        }
        int paddingLeft = (int) (((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)) * (((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))));
        scrollTo(paddingLeft, getScrollY());
        if (!this.f133m.isFinished()) {
            this.f133m.startScroll(paddingLeft, 0, (int) (m78b(this.f129i).f177e * ((float) i)), 0, this.f133m.getDuration() - this.f133m.timePassed());
        }
    }

    private void m68a(int i, boolean z, int i2, boolean z2) {
        bl b = m78b(i);
        int i3 = 0;
        if (b != null) {
            i3 = (int) (((float) getClientWidth()) * Math.max(this.f139s, Math.min(b.f177e, this.f140t)));
        }
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int i4 = i3 - scrollX;
                int i5 = 0 - scrollY;
                if (i4 == 0 && i5 == 0) {
                    m74a(false);
                    m91b();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    i3 = getClientWidth();
                    int i6 = i3 / 2;
                    float f = (float) i6;
                    float sin = (((float) i6) * ((float) Math.sin((double) ((float) (((double) (Math.min(1.0f, (1.0f * ((float) Math.abs(i4))) / ((float) i3)) - 0.5f)) * 0.4712389167638204d))))) + f;
                    int abs = Math.abs(i2);
                    if (abs > 0) {
                        i3 = Math.round(1000.0f * Math.abs(sin / ((float) abs))) * 4;
                    } else {
                        i3 = (int) (((((float) Math.abs(i4)) / ((((float) i3) * this.f128h.getPageWidth(this.f129i)) + ((float) this.f135o))) + 1.0f) * 100.0f);
                    }
                    this.f133m.startScroll(scrollX, scrollY, i4, i5, Math.min(i3, 600));
                    an.m336c(this);
                }
            }
            if (z2 && this.f122W != null) {
                this.f122W.mo203a();
            }
            if (z2 && this.f123Z != null) {
                this.f123Z.mo203a();
                return;
            }
            return;
        }
        if (z2 && this.f122W != null) {
            this.f122W.mo203a();
        }
        if (z2 && this.f123Z != null) {
            this.f123Z.mo203a();
        }
        m74a(false);
        scrollTo(i3, 0);
        m81c(i3);
    }

    private void m69a(int i, boolean z, boolean z2) {
        m70a(i, z, z2, 0);
    }

    private void m70a(int i, boolean z, boolean z2, int i2) {
        boolean z3 = false;
        if (this.f128h == null || this.f128h.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f129i != i || this.f125e.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f128h.getCount()) {
                i = this.f128h.getCount() - 1;
            }
            int i3 = this.f146z;
            if (i > this.f129i + i3 || i < this.f129i - i3) {
                for (int i4 = 0; i4 < this.f125e.size(); i4++) {
                    ((bl) this.f125e.get(i4)).f175c = true;
                }
            }
            if (this.f129i != i) {
                z3 = true;
            }
            if (this.f118S) {
                this.f129i = i;
                if (z3 && this.f122W != null) {
                    this.f122W.mo203a();
                }
                if (z3 && this.f123Z != null) {
                    this.f123Z.mo203a();
                }
                requestLayout();
                return;
            }
            m65a(i);
            m68a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    private void m72a(bl blVar, int i, bl blVar2) {
        float f;
        int i2;
        bl blVar3;
        int i3;
        int count = this.f128h.getCount();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? ((float) this.f135o) / ((float) clientWidth) : 0.0f;
        if (blVar2 != null) {
            clientWidth = blVar2.f174b;
            int i4;
            if (clientWidth < blVar.f174b) {
                f = (blVar2.f177e + blVar2.f176d) + f2;
                i4 = clientWidth + 1;
                i2 = 0;
                while (i4 <= blVar.f174b && i2 < this.f125e.size()) {
                    blVar3 = (bl) this.f125e.get(i2);
                    while (i4 > blVar3.f174b && i2 < this.f125e.size() - 1) {
                        i2++;
                        blVar3 = (bl) this.f125e.get(i2);
                    }
                    while (i4 < blVar3.f174b) {
                        f += this.f128h.getPageWidth(i4) + f2;
                        i4++;
                    }
                    blVar3.f177e = f;
                    f += blVar3.f176d + f2;
                    i4++;
                }
            } else if (clientWidth > blVar.f174b) {
                i2 = this.f125e.size() - 1;
                f = blVar2.f177e;
                i4 = clientWidth - 1;
                while (i4 >= blVar.f174b && i2 >= 0) {
                    blVar3 = (bl) this.f125e.get(i2);
                    while (i4 < blVar3.f174b && i2 > 0) {
                        i2--;
                        blVar3 = (bl) this.f125e.get(i2);
                    }
                    while (i4 > blVar3.f174b) {
                        f -= this.f128h.getPageWidth(i4) + f2;
                        i4--;
                    }
                    f -= blVar3.f176d + f2;
                    blVar3.f177e = f;
                    i4--;
                }
            }
        }
        int size = this.f125e.size();
        float f3 = blVar.f177e;
        i2 = blVar.f174b - 1;
        this.f139s = blVar.f174b == 0 ? blVar.f177e : -3.4028235E38f;
        this.f140t = blVar.f174b == count + -1 ? (blVar.f177e + blVar.f176d) - 1.0f : Float.MAX_VALUE;
        for (i3 = i - 1; i3 >= 0; i3--) {
            blVar3 = (bl) this.f125e.get(i3);
            f = f3;
            while (i2 > blVar3.f174b) {
                f -= this.f128h.getPageWidth(i2) + f2;
                i2--;
            }
            f3 = f - (blVar3.f176d + f2);
            blVar3.f177e = f3;
            if (blVar3.f174b == 0) {
                this.f139s = f3;
            }
            i2--;
        }
        f3 = (blVar.f177e + blVar.f176d) + f2;
        i2 = blVar.f174b + 1;
        for (i3 = i + 1; i3 < size; i3++) {
            blVar3 = (bl) this.f125e.get(i3);
            f = f3;
            while (i2 < blVar3.f174b) {
                f = (this.f128h.getPageWidth(i2) + f2) + f;
                i2++;
            }
            if (blVar3.f174b == count - 1) {
                this.f140t = (blVar3.f176d + f) - 1.0f;
            }
            blVar3.f177e = f;
            f3 = f + (blVar3.f176d + f2);
            i2++;
        }
        this.f119T = false;
    }

    private void m73a(MotionEvent motionEvent) {
        int b = C0097w.m492b(motionEvent);
        if (C0097w.m493b(motionEvent, b) == this.f109J) {
            b = b == 0 ? 1 : 0;
            this.f105F = C0097w.m494c(motionEvent, b);
            this.f109J = C0097w.m493b(motionEvent, b);
            if (this.f110K != null) {
                this.f110K.clear();
            }
        }
    }

    private void m74a(boolean z) {
        int scrollX;
        boolean z2 = this.ah == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            this.f133m.abortAnimation();
            scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f133m.getCurrX();
            int currY = this.f133m.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.f145y = false;
        boolean z3 = z2;
        for (scrollX = 0; scrollX < this.f125e.size(); scrollX++) {
            bl blVar = (bl) this.f125e.get(scrollX);
            if (blVar.f175c) {
                blVar.f175c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            an.m331a((View) this, this.ag);
        } else {
            this.ag.run();
        }
    }

    private boolean m75a(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        boolean z3 = false;
        float f3 = this.f105F - f;
        this.f105F = f;
        float scrollX = ((float) getScrollX()) + f3;
        int clientWidth = getClientWidth();
        float f4 = ((float) clientWidth) * this.f139s;
        float f5 = ((float) clientWidth) * this.f140t;
        bl blVar = (bl) this.f125e.get(0);
        bl blVar2 = (bl) this.f125e.get(this.f125e.size() - 1);
        if (blVar.f174b != 0) {
            f4 = blVar.f177e * ((float) clientWidth);
            z = false;
        } else {
            z = true;
        }
        if (blVar2.f174b != this.f128h.getCount() - 1) {
            f2 = blVar2.f177e * ((float) clientWidth);
            z2 = false;
        } else {
            f2 = f5;
        }
        if (scrollX < f4) {
            if (z) {
                z3 = this.f116Q.m666a(Math.abs(f4 - scrollX) / ((float) clientWidth));
            }
        } else if (scrollX > f2) {
            if (z2) {
                z3 = this.f117R.m666a(Math.abs(scrollX - f2) / ((float) clientWidth));
            }
            f4 = f2;
        } else {
            f4 = scrollX;
        }
        this.f105F += f4 - ((float) ((int) f4));
        scrollTo((int) f4, getScrollY());
        m81c((int) f4);
        return z3;
    }

    private boolean m76a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom()) {
                    if (m76a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && an.m333a(view, -i);
    }

    private bl m78b(int i) {
        for (int i2 = 0; i2 < this.f125e.size(); i2++) {
            bl blVar = (bl) this.f125e.get(i2);
            if (blVar.f174b == i) {
                return blVar;
            }
        }
        return null;
    }

    private bl m79b(View view) {
        while (true) {
            ViewPager parent = view.getParent();
            if (parent == this) {
                return m64a(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = parent;
            }
        }
        return null;
    }

    private boolean m81c(int i) {
        if (this.f125e.size() == 0) {
            this.f120U = false;
            m66a(0, 0.0f);
            if (this.f120U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        bl f = m86f();
        int clientWidth = getClientWidth();
        int i2 = this.f135o;
        float f2 = ((float) this.f135o) / ((float) clientWidth);
        int i3 = f.f174b;
        float f3 = ((((float) i) / ((float) clientWidth)) - f.f177e) / (f.f176d + f2);
        this.f120U = false;
        m66a(i3, f3);
        if (this.f120U) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void m83d() {
        if (this.ad != 0) {
            if (this.ae == null) {
                this.ae = new ArrayList();
            } else {
                this.ae.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ae.add(getChildAt(i));
            }
            Collections.sort(this.ae, af);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m84d(int r10) {
        /*
        r9 = this;
        r1 = 0;
        r8 = 66;
        r7 = 17;
        r3 = 1;
        r4 = 0;
        r2 = r9.findFocus();
        if (r2 != r9) goto L_0x003f;
    L_0x000d:
        r0 = r1;
    L_0x000e:
        r1 = android.view.FocusFinder.getInstance();
        r1 = r1.findNextFocus(r9, r0, r10);
        if (r1 == 0) goto L_0x00b7;
    L_0x0018:
        if (r1 == r0) goto L_0x00b7;
    L_0x001a:
        if (r10 != r7) goto L_0x009b;
    L_0x001c:
        r2 = r9.f127g;
        r2 = r9.m62a(r2, r1);
        r2 = r2.left;
        r3 = r9.f127g;
        r3 = r9.m62a(r3, r0);
        r3 = r3.left;
        if (r0 == 0) goto L_0x0096;
    L_0x002e:
        if (r2 < r3) goto L_0x0096;
    L_0x0030:
        r0 = r9.m88h();
    L_0x0034:
        r4 = r0;
    L_0x0035:
        if (r4 == 0) goto L_0x003e;
    L_0x0037:
        r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r10);
        r9.playSoundEffect(r0);
    L_0x003e:
        return r4;
    L_0x003f:
        if (r2 == 0) goto L_0x00e3;
    L_0x0041:
        r0 = r2.getParent();
    L_0x0045:
        r5 = r0 instanceof android.view.ViewGroup;
        if (r5 == 0) goto L_0x00e6;
    L_0x0049:
        if (r0 != r9) goto L_0x007c;
    L_0x004b:
        r0 = r3;
    L_0x004c:
        if (r0 != 0) goto L_0x00e3;
    L_0x004e:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r0 = r2.getClass();
        r0 = r0.getSimpleName();
        r5.append(r0);
        r0 = r2.getParent();
    L_0x0062:
        r2 = r0 instanceof android.view.ViewGroup;
        if (r2 == 0) goto L_0x0081;
    L_0x0066:
        r2 = " => ";
        r2 = r5.append(r2);
        r6 = r0.getClass();
        r6 = r6.getSimpleName();
        r2.append(r6);
        r0 = r0.getParent();
        goto L_0x0062;
    L_0x007c:
        r0 = r0.getParent();
        goto L_0x0045;
    L_0x0081:
        r0 = new java.lang.StringBuilder;
        r2 = "arrowScroll tried to find focus based on non-child current focused view ";
        r0.<init>(r2);
        r2 = r5.toString();
        r0 = r0.append(r2);
        r0.toString();
        r0 = r1;
        goto L_0x000e;
    L_0x0096:
        r0 = r1.requestFocus();
        goto L_0x0034;
    L_0x009b:
        if (r10 != r8) goto L_0x0035;
    L_0x009d:
        r2 = r9.f127g;
        r2 = r9.m62a(r2, r1);
        r2 = r2.left;
        r5 = r9.f127g;
        r5 = r9.m62a(r5, r0);
        r5 = r5.left;
        if (r0 == 0) goto L_0x00b1;
    L_0x00af:
        if (r2 <= r5) goto L_0x00c6;
    L_0x00b1:
        r0 = r1.requestFocus();
        goto L_0x0034;
    L_0x00b7:
        if (r10 == r7) goto L_0x00bb;
    L_0x00b9:
        if (r10 != r3) goto L_0x00c1;
    L_0x00bb:
        r0 = r9.m88h();
        goto L_0x0034;
    L_0x00c1:
        if (r10 == r8) goto L_0x00c6;
    L_0x00c3:
        r0 = 2;
        if (r10 != r0) goto L_0x0035;
    L_0x00c6:
        r0 = r9.f128h;
        if (r0 == 0) goto L_0x00e0;
    L_0x00ca:
        r0 = r9.f129i;
        r1 = r9.f128h;
        r1 = r1.getCount();
        r1 = r1 + -1;
        if (r0 >= r1) goto L_0x00e0;
    L_0x00d6:
        r0 = r9.f129i;
        r0 = r0 + 1;
        r9.setCurrentItem$2563266(r0);
        r0 = r3;
        goto L_0x0034;
    L_0x00e0:
        r0 = r4;
        goto L_0x0034;
    L_0x00e3:
        r0 = r2;
        goto L_0x000e;
    L_0x00e6:
        r0 = r4;
        goto L_0x004c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.d(int):boolean");
    }

    private void m85e() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private bl m86f() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.f135o) / ((float) clientWidth) : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = -1;
        int i2 = 0;
        Object obj = 1;
        bl blVar = null;
        while (i2 < this.f125e.size()) {
            int i3;
            bl blVar2;
            bl blVar3 = (bl) this.f125e.get(i2);
            bl blVar4;
            if (obj != null || blVar3.f174b == i + 1) {
                blVar4 = blVar3;
                i3 = i2;
                blVar2 = blVar4;
            } else {
                blVar3 = this.f126f;
                blVar3.f177e = (f2 + f3) + f;
                blVar3.f174b = i + 1;
                blVar3.f176d = this.f128h.getPageWidth(blVar3.f174b);
                blVar4 = blVar3;
                i3 = i2 - 1;
                blVar2 = blVar4;
            }
            f2 = blVar2.f177e;
            f3 = (blVar2.f176d + f2) + f;
            if (obj == null && scrollX < f2) {
                return blVar;
            }
            if (scrollX < f3 || i3 == this.f125e.size() - 1) {
                return blVar2;
            }
            f3 = f2;
            i = blVar2.f174b;
            obj = null;
            f2 = blVar2.f176d;
            blVar = blVar2;
            i2 = i3 + 1;
        }
        return blVar;
    }

    private void m87g() {
        this.f100A = false;
        this.f101B = false;
        if (this.f110K != null) {
            this.f110K.recycle();
            this.f110K = null;
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private boolean m88h() {
        if (this.f129i <= 0) {
            return false;
        }
        setCurrentItem$2563266(this.f129i - 1);
        return true;
    }

    private void setCurrentItem$2563266(int i) {
        this.f145y = false;
        m69a(i, true, false);
    }

    private void setScrollState(int i) {
        if (this.ah != i) {
            this.ah = i;
            if (this.ab != null) {
                Object obj = i != 0 ? 1 : null;
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    an.m328a(getChildAt(i2), obj != null ? 2 : 0, null);
                }
            }
            if (this.f122W != null) {
                this.f122W.mo204a(i);
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f144x != z) {
            this.f144x = z;
        }
    }

    final bo m89a(bo boVar) {
        bo boVar2 = this.f123Z;
        this.f123Z = boVar;
        return boVar2;
    }

    final void m90a() {
        int count = this.f128h.getCount();
        this.f124b = count;
        boolean z = this.f125e.size() < (this.f146z * 2) + 1 && this.f125e.size() < count;
        boolean z2 = false;
        int i = this.f129i;
        boolean z3 = z;
        int i2 = 0;
        while (i2 < this.f125e.size()) {
            int i3;
            boolean z4;
            int max;
            boolean z5;
            bl blVar = (bl) this.f125e.get(i2);
            int itemPosition = this.f128h.getItemPosition(blVar.f173a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f125e.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f128h.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.f128h.destroyItem((ViewGroup) this, blVar.f174b, blVar.f173a);
                    if (this.f129i == blVar.f174b) {
                        i3 = i2;
                        z4 = z2;
                        max = Math.max(0, Math.min(this.f129i, count - 1));
                        z5 = true;
                    } else {
                        i3 = i2;
                        z4 = z2;
                        max = i;
                        z5 = true;
                    }
                } else if (blVar.f174b != itemPosition) {
                    if (blVar.f174b == this.f129i) {
                        i = itemPosition;
                    }
                    blVar.f174b = itemPosition;
                    i3 = i2;
                    z4 = z2;
                    max = i;
                    z5 = true;
                }
                z3 = z5;
                i = max;
                z2 = z4;
                i2 = i3 + 1;
            }
            i3 = i2;
            z4 = z2;
            max = i;
            z5 = z3;
            z3 = z5;
            i = max;
            z2 = z4;
            i2 = i3 + 1;
        }
        if (z2) {
            this.f128h.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f125e, f98c);
        if (z3) {
            max = getChildCount();
            for (i2 = 0; i2 < max; i2++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
                if (!layoutParams.f88a) {
                    layoutParams.f90c = 0.0f;
                }
            }
            m69a(i, false, true);
            requestLayout();
        }
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    bl a = m64a(childAt);
                    if (a != null && a.f174b == this.f129i) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == Menu.CATEGORY_ALTERNATIVE && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                bl a = m64a(childAt);
                if (a != null && a.f174b == this.f129i) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.ViewGroup.LayoutParams generateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        LayoutParams layoutParams2 = (LayoutParams) generateLayoutParams;
        layoutParams2.f88a |= view instanceof bk;
        if (!this.f143w) {
            super.addView(view, i, generateLayoutParams);
        } else if (layoutParams2 == null || !layoutParams2.f88a) {
            layoutParams2.f91d = true;
            addViewInLayout(view, i, generateLayoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    final void m91b() {
        m65a(this.f129i);
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f128h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f139s)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f140t));
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (this.f133m.isFinished() || !this.f133m.computeScrollOffset()) {
            m74a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f133m.getCurrX();
        int currY = this.f133m.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m81c(currX)) {
                this.f133m.abortAnimation();
                scrollTo(0, currY);
            }
        }
        an.m336c(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
        r4 = this;
        r1 = 1;
        r0 = 0;
        r2 = super.dispatchKeyEvent(r5);
        if (r2 != 0) goto L_0x0018;
    L_0x0008:
        r2 = r5.getAction();
        if (r2 != 0) goto L_0x0015;
    L_0x000e:
        r2 = r5.getKeyCode();
        switch(r2) {
            case 21: goto L_0x001a;
            case 22: goto L_0x0021;
            case 61: goto L_0x0028;
            default: goto L_0x0015;
        };
    L_0x0015:
        r2 = r0;
    L_0x0016:
        if (r2 == 0) goto L_0x0019;
    L_0x0018:
        r0 = r1;
    L_0x0019:
        return r0;
    L_0x001a:
        r2 = 17;
        r2 = r4.m84d(r2);
        goto L_0x0016;
    L_0x0021:
        r2 = 66;
        r2 = r4.m84d(r2);
        goto L_0x0016;
    L_0x0028:
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 11;
        if (r2 < r3) goto L_0x0015;
    L_0x002e:
        r2 = android.support.v4.view.C0092r.m476b(r5);
        if (r2 == 0) goto L_0x003a;
    L_0x0034:
        r2 = 2;
        r2 = r4.m84d(r2);
        goto L_0x0016;
    L_0x003a:
        r2 = android.support.v4.view.C0092r.m475a(r5);
        if (r2 == 0) goto L_0x0015;
    L_0x0040:
        r2 = r4.m84d(r1);
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == FragmentTransaction.TRANSIT_ENTER_MASK) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                bl a = m64a(childAt);
                if (a != null && a.f174b == this.f129i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int i = 0;
        int b = an.m334b(this);
        if (b == 0 || (b == 1 && this.f128h != null && this.f128h.getCount() > 1)) {
            int width;
            if (!this.f116Q.m665a()) {
                b = canvas.save();
                i = (getHeight() - getPaddingTop()) - getPaddingBottom();
                width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-i) + getPaddingTop()), this.f139s * ((float) width));
                this.f116Q.m664a(i, width);
                i = this.f116Q.m667a(canvas) | 0;
                canvas.restoreToCount(b);
            }
            if (!this.f117R.m665a()) {
                b = canvas.save();
                width = getWidth();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f140t + 1.0f)) * ((float) width));
                this.f117R.m664a(height, width);
                i |= this.f117R.m667a(canvas);
                canvas.restoreToCount(b);
            }
        } else {
            this.f116Q.m668b();
            this.f117R.m668b();
        }
        if (i != 0) {
            an.m336c(this);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f136p;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public aa getAdapter() {
        return this.f128h;
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.ad == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.ae.get(i2)).getLayoutParams()).f93f;
    }

    public int getCurrentItem() {
        return this.f129i;
    }

    public int getOffscreenPageLimit() {
        return this.f146z;
    }

    public int getPageMargin() {
        return this.f135o;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f118S = true;
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.ag);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f135o > 0 && this.f136p != null && this.f125e.size() > 0 && this.f128h != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f = ((float) this.f135o) / ((float) width);
            bl blVar = (bl) this.f125e.get(0);
            float f2 = blVar.f177e;
            int size = this.f125e.size();
            int i = blVar.f174b;
            int i2 = ((bl) this.f125e.get(size - 1)).f174b;
            int i3 = 0;
            int i4 = i;
            while (i4 < i2) {
                float f3;
                while (i4 > blVar.f174b && i3 < size) {
                    i3++;
                    blVar = (bl) this.f125e.get(i3);
                }
                if (i4 == blVar.f174b) {
                    f3 = (blVar.f177e + blVar.f176d) * ((float) width);
                    f2 = (blVar.f177e + blVar.f176d) + f;
                } else {
                    float pageWidth = this.f128h.getPageWidth(i4);
                    f3 = (f2 + pageWidth) * ((float) width);
                    f2 += pageWidth + f;
                }
                if (((float) this.f135o) + f3 > ((float) scrollX)) {
                    this.f136p.setBounds((int) f3, this.f137q, (int) ((((float) this.f135o) + f3) + 0.5f), this.f138r);
                    this.f136p.draw(canvas);
                }
                if (f3 <= ((float) (scrollX + width))) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f100A = false;
            this.f101B = false;
            this.f109J = -1;
            if (this.f110K == null) {
                return false;
            }
            this.f110K.recycle();
            this.f110K = null;
            return false;
        }
        if (action != 0) {
            if (this.f100A) {
                return true;
            }
            if (this.f101B) {
                return false;
            }
        }
        float x;
        switch (action) {
            case 0:
                x = motionEvent.getX();
                this.f107H = x;
                this.f105F = x;
                x = motionEvent.getY();
                this.f108I = x;
                this.f106G = x;
                this.f109J = C0097w.m493b(motionEvent, 0);
                this.f101B = false;
                this.f133m.computeScrollOffset();
                if (this.ah == 2 && Math.abs(this.f133m.getFinalX() - this.f133m.getCurrX()) > this.f114O) {
                    this.f133m.abortAnimation();
                    this.f145y = false;
                    m91b();
                    this.f100A = true;
                    m85e();
                    setScrollState(1);
                    break;
                }
                m74a(false);
                this.f100A = false;
                break;
                break;
            case 2:
                action = this.f109J;
                if (action != -1) {
                    action = C0097w.m491a(motionEvent, action);
                    float c = C0097w.m494c(motionEvent, action);
                    float f = c - this.f105F;
                    float abs = Math.abs(f);
                    float d = C0097w.m496d(motionEvent, action);
                    float abs2 = Math.abs(d - this.f108I);
                    if (f != 0.0f) {
                        x = this.f105F;
                        boolean z = (x < ((float) this.f103D) && f > 0.0f) || (x > ((float) (getWidth() - this.f103D)) && f < 0.0f);
                        if (!z && m76a(this, false, (int) f, (int) c, (int) d)) {
                            this.f105F = c;
                            this.f106G = d;
                            this.f101B = true;
                            return false;
                        }
                    }
                    if (abs > ((float) this.f104E) && 0.5f * abs > abs2) {
                        this.f100A = true;
                        m85e();
                        setScrollState(1);
                        this.f105F = f > 0.0f ? this.f107H + ((float) this.f104E) : this.f107H - ((float) this.f104E);
                        this.f106G = d;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > ((float) this.f104E)) {
                        this.f101B = true;
                    }
                    if (this.f100A && m75a(c)) {
                        an.m336c(this);
                        break;
                    }
                }
                break;
            case 6:
                m73a(motionEvent);
                break;
        }
        if (this.f110K == null) {
            this.f110K = VelocityTracker.obtain();
        }
        this.f110K.addMovement(motionEvent);
        return this.f100A;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        int i8 = 0;
        while (i8 < childCount) {
            LayoutParams layoutParams;
            int measuredWidth;
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f88a) {
                    int i9 = layoutParams.f89b & 112;
                    switch (layoutParams.f89b & 7) {
                        case 1:
                            max = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 3:
                            max = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case 5:
                            measuredWidth = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            max = measuredWidth;
                            break;
                        default:
                            max = paddingLeft;
                            break;
                    }
                    int i10;
                    switch (i9) {
                        case 16:
                            measuredWidth = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        case 48:
                            measuredWidth = childAt.getMeasuredHeight() + paddingTop;
                            i10 = paddingTop;
                            paddingTop = paddingBottom;
                            paddingBottom = measuredWidth;
                            measuredWidth = i10;
                            break;
                        case 80:
                            measuredWidth = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            i10 = paddingBottom + childAt.getMeasuredHeight();
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        default:
                            measuredWidth = paddingTop;
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                    }
                    max += scrollX;
                    childAt.layout(max, measuredWidth, childAt.getMeasuredWidth() + max, childAt.getMeasuredHeight() + measuredWidth);
                    measuredWidth = i7 + 1;
                    i7 = paddingBottom;
                    paddingBottom = paddingTop;
                    paddingTop = paddingRight;
                    paddingRight = paddingLeft;
                    i8++;
                    paddingLeft = paddingRight;
                    paddingRight = paddingTop;
                    paddingTop = i7;
                    i7 = measuredWidth;
                }
            }
            measuredWidth = i7;
            i7 = paddingTop;
            paddingTop = paddingRight;
            paddingRight = paddingLeft;
            i8++;
            paddingLeft = paddingRight;
            paddingRight = paddingTop;
            paddingTop = i7;
            i7 = measuredWidth;
        }
        max = (i5 - paddingLeft) - paddingRight;
        for (paddingRight = 0; paddingRight < childCount; paddingRight++) {
            View childAt2 = getChildAt(paddingRight);
            if (childAt2.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams.f88a) {
                    bl a = m64a(childAt2);
                    if (a != null) {
                        i5 = ((int) (a.f177e * ((float) max))) + paddingLeft;
                        if (layoutParams.f91d) {
                            layoutParams.f91d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (layoutParams.f90c * ((float) max)), 1073741824), MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                        }
                        childAt2.layout(i5, paddingTop, childAt2.getMeasuredWidth() + i5, childAt2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.f137q = paddingTop;
        this.f138r = i6 - paddingBottom;
        this.f121V = i7;
        if (this.f118S) {
            m68a(this.f129i, false, 0, false);
        }
        this.f118S = false;
    }

    protected void onMeasure(int i, int i2) {
        LayoutParams layoutParams;
        int i3;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f103D = Math.min(measuredWidth / 10, this.f102C);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            int i5;
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams != null && layoutParams.f88a) {
                    int i6 = layoutParams.f89b & 7;
                    int i7 = layoutParams.f89b & 112;
                    i3 = Integer.MIN_VALUE;
                    i5 = Integer.MIN_VALUE;
                    Object obj = (i7 == 48 || i7 == 80) ? 1 : null;
                    Object obj2 = (i6 == 3 || i6 == 5) ? 1 : null;
                    if (obj != null) {
                        i3 = 1073741824;
                    } else if (obj2 != null) {
                        i5 = 1073741824;
                    }
                    if (layoutParams.width != -2) {
                        i7 = 1073741824;
                        i3 = layoutParams.width != -1 ? layoutParams.width : paddingLeft;
                    } else {
                        i7 = i3;
                        i3 = paddingLeft;
                    }
                    if (layoutParams.height != -2) {
                        i5 = 1073741824;
                        if (layoutParams.height != -1) {
                            measuredWidth = layoutParams.height;
                            childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                            if (obj != null) {
                                measuredHeight -= childAt.getMeasuredHeight();
                            } else if (obj2 != null) {
                                paddingLeft -= childAt.getMeasuredWidth();
                            }
                        }
                    }
                    measuredWidth = measuredHeight;
                    childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                    if (obj != null) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (obj2 != null) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
            }
        }
        this.f141u = MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f142v = MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f143w = true;
        m91b();
        this.f143w = false;
        i3 = getChildCount();
        for (i5 = 0; i5 < i3; i5++) {
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt2.getLayoutParams();
                if (layoutParams == null || !layoutParams.f88a) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (layoutParams.f90c * ((float) paddingLeft)), 1073741824), this.f142v);
                }
            }
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                bl a = m64a(childAt);
                if (a != null && a.f174b == this.f129i && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i2 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (this.f128h != null) {
                this.f128h.restoreState(savedState.f95b, savedState.f96c);
                m69a(savedState.f94a, false, true);
                return;
            }
            this.f130j = savedState.f94a;
            this.f131k = savedState.f95b;
            this.f132l = savedState.f96c;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f94a = this.f129i;
        if (this.f128h != null) {
            savedState.f95b = this.f128h.saveState();
        }
        return savedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m67a(i, i3, this.f135o, this.f135o);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f115P) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.f128h == null || this.f128h.getCount() == 0) {
            return false;
        }
        if (this.f110K == null) {
            this.f110K = VelocityTracker.obtain();
        }
        this.f110K.addMovement(motionEvent);
        float x;
        int i;
        float f;
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.f133m.abortAnimation();
                this.f145y = false;
                m91b();
                x = motionEvent.getX();
                this.f107H = x;
                this.f105F = x;
                x = motionEvent.getY();
                this.f108I = x;
                this.f106G = x;
                this.f109J = C0097w.m493b(motionEvent, 0);
                break;
            case 1:
                if (this.f100A) {
                    VelocityTracker velocityTracker = this.f110K;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f112M);
                    int a = (int) aj.m319a(velocityTracker, this.f109J);
                    this.f145y = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    bl f2 = m86f();
                    i = f2.f174b;
                    f = ((((float) scrollX) / ((float) clientWidth)) - f2.f177e) / f2.f176d;
                    if (Math.abs((int) (C0097w.m494c(motionEvent, C0097w.m491a(motionEvent, this.f109J)) - this.f107H)) <= this.f113N || Math.abs(a) <= this.f111L) {
                        scrollX = (int) ((((float) i) + f) + (i >= this.f129i ? 0.4f : 0.6f));
                    } else {
                        if (a <= 0) {
                            i++;
                        }
                        scrollX = i;
                    }
                    if (this.f125e.size() > 0) {
                        scrollX = Math.max(((bl) this.f125e.get(0)).f174b, Math.min(scrollX, ((bl) this.f125e.get(this.f125e.size() - 1)).f174b));
                    }
                    m70a(scrollX, true, true, a);
                    this.f109J = -1;
                    m87g();
                    z = this.f116Q.m669c() | this.f117R.m669c();
                    break;
                }
                break;
            case 2:
                if (!this.f100A) {
                    i = C0097w.m491a(motionEvent, this.f109J);
                    float c = C0097w.m494c(motionEvent, i);
                    f = Math.abs(c - this.f105F);
                    float d = C0097w.m496d(motionEvent, i);
                    x = Math.abs(d - this.f106G);
                    if (f > ((float) this.f104E) && f > x) {
                        this.f100A = true;
                        m85e();
                        this.f105F = c - this.f107H > 0.0f ? this.f107H + ((float) this.f104E) : this.f107H - ((float) this.f104E);
                        this.f106G = d;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.f100A) {
                    z = m75a(C0097w.m494c(motionEvent, C0097w.m491a(motionEvent, this.f109J))) | 0;
                    break;
                }
                break;
            case 3:
                if (this.f100A) {
                    m68a(this.f129i, true, 0, false);
                    this.f109J = -1;
                    m87g();
                    z = this.f116Q.m669c() | this.f117R.m669c();
                    break;
                }
                break;
            case 5:
                i = C0097w.m492b(motionEvent);
                this.f105F = C0097w.m494c(motionEvent, i);
                this.f109J = C0097w.m493b(motionEvent, i);
                break;
            case 6:
                m73a(motionEvent);
                this.f105F = C0097w.m494c(motionEvent, C0097w.m491a(motionEvent, this.f109J));
                break;
        }
        if (z) {
            an.m336c(this);
        }
        return true;
    }

    public void removeView(View view) {
        if (this.f143w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(aa aaVar) {
        if (this.f128h != null) {
            int i;
            this.f128h.unregisterDataSetObserver(this.f134n);
            this.f128h.startUpdate((ViewGroup) this);
            for (i = 0; i < this.f125e.size(); i++) {
                bl blVar = (bl) this.f125e.get(i);
                this.f128h.destroyItem((ViewGroup) this, blVar.f174b, blVar.f173a);
            }
            this.f128h.finishUpdate((ViewGroup) this);
            this.f125e.clear();
            i = 0;
            while (i < getChildCount()) {
                if (!((LayoutParams) getChildAt(i).getLayoutParams()).f88a) {
                    removeViewAt(i);
                    i--;
                }
                i++;
            }
            this.f129i = 0;
            scrollTo(0, 0);
        }
        aa aaVar2 = this.f128h;
        this.f128h = aaVar;
        this.f124b = 0;
        if (this.f128h != null) {
            if (this.f134n == null) {
                this.f134n = new bq();
            }
            this.f128h.registerDataSetObserver(this.f134n);
            this.f145y = false;
            boolean z = this.f118S;
            this.f118S = true;
            this.f124b = this.f128h.getCount();
            if (this.f130j >= 0) {
                this.f128h.restoreState(this.f131k, this.f132l);
                m69a(this.f130j, false, true);
                this.f130j = -1;
                this.f131k = null;
                this.f132l = null;
            } else if (z) {
                requestLayout();
            } else {
                m91b();
            }
        }
        if (this.aa != null && aaVar2 != aaVar) {
            this.aa.mo206a(aaVar2, aaVar);
        }
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (VERSION.SDK_INT >= 7) {
            if (this.ac == null) {
                try {
                    this.ac = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
                } catch (NoSuchMethodException e) {
                }
            }
            try {
                this.ac.invoke(this, new Object[]{Boolean.valueOf(z)});
            } catch (Exception e2) {
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f145y = false;
        m69a(i, !this.f118S, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f146z) {
            this.f146z = i;
            m91b();
        }
    }

    void setOnAdapterChangeListener(bn bnVar) {
        this.aa = bnVar;
    }

    public void setOnPageChangeListener(bo boVar) {
        this.f122W = boVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f135o;
        this.f135o = i;
        int width = getWidth();
        m67a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f136p = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f136p;
    }
}
