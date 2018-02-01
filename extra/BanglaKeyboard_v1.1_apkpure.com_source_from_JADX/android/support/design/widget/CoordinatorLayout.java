package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.design.C0116a.C0114j;
import android.support.design.C0116a.C0115k;
import android.support.v4.content.C0392a;
import android.support.v4.p006a.p007a.C0366a;
import android.support.v4.p018f.C0493i;
import android.support.v4.p018f.C0498k.C0495a;
import android.support.v4.p018f.C0498k.C0497c;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0127n;
import android.support.v4.view.C0180l;
import android.support.v4.view.C0656d;
import android.support.v4.view.C0666m;
import android.support.v4.view.C0679r;
import android.support.v4.view.C0696z;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements C0180l {
    static final String f711a;
    static final Class<?>[] f712b = new Class[]{Context.class, AttributeSet.class};
    static final ThreadLocal<Map<String, Constructor<Behavior>>> f713c = new ThreadLocal();
    static final Comparator<View> f714d;
    private static final C0495a<Rect> f715j = new C0497c(12);
    final C0239g<View> f716e;
    final List<View> f717f;
    C0696z f718g;
    boolean f719h;
    OnHierarchyChangeListener f720i;
    private final List<View> f721k;
    private final List<View> f722l;
    private final int[] f723m;
    private boolean f724n;
    private boolean f725o;
    private int[] f726p;
    private View f727q;
    private View f728r;
    private C0177d f729s;
    private boolean f730t;
    private Drawable f731u;
    private C0127n f732v;
    private final C0666m f733w;

    public static abstract class Behavior<V extends View> {
        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public static C0696z m334a(C0696z c0696z) {
            return c0696z;
        }

        public void mo157a(C0176c c0176c) {
        }

        public void mo93a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public void mo94a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo120a((View) v, view);
            }
        }

        public void mo95a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int[] iArr, int i2) {
            if (i2 == 0) {
                mo121a((View) v, view, i, iArr);
            }
        }

        @Deprecated
        public void mo120a(V v, View view) {
        }

        @Deprecated
        public void mo121a(V v, View view, int i, int[] iArr) {
        }

        @Deprecated
        public boolean mo122a(int i) {
            return false;
        }

        public boolean mo86a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean mo96a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean mo106a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public boolean mo87a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean mo107a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public boolean mo123a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        public boolean mo97a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2) {
            return i2 == 0 ? mo122a(i) : false;
        }

        public boolean mo158a(V v, Rect rect) {
            return false;
        }

        public boolean a_(View view) {
            return false;
        }

        public Parcelable mo100b(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }

        public void mo101b(CoordinatorLayout coordinatorLayout, V v, int i) {
        }

        public boolean mo88b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }
    }

    class C01721 implements C0127n {
        final /* synthetic */ CoordinatorLayout f689a;

        C01721(CoordinatorLayout coordinatorLayout) {
            this.f689a = coordinatorLayout;
        }

        public final C0696z mo61a(View view, C0696z c0696z) {
            boolean z = true;
            int i = 0;
            CoordinatorLayout coordinatorLayout = this.f689a;
            if (C0493i.m1286a(coordinatorLayout.f718g, c0696z)) {
                return c0696z;
            }
            C0696z c0696z2;
            coordinatorLayout.f718g = c0696z;
            boolean z2 = c0696z != null && c0696z.m1995b() > 0;
            coordinatorLayout.f719h = z2;
            if (coordinatorLayout.f719h || coordinatorLayout.getBackground() != null) {
                z = false;
            }
            coordinatorLayout.setWillNotDraw(z);
            if (c0696z.m1998e()) {
                c0696z2 = c0696z;
            } else {
                int childCount = coordinatorLayout.getChildCount();
                C0696z c0696z3 = c0696z;
                while (i < childCount) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (C0679r.m1945r(childAt) && ((C0176c) childAt.getLayoutParams()).f692a != null) {
                        c0696z2 = Behavior.m334a(c0696z3);
                        if (c0696z2.m1998e()) {
                            break;
                        }
                    } else {
                        c0696z2 = c0696z3;
                    }
                    i++;
                    c0696z3 = c0696z2;
                }
                c0696z2 = c0696z3;
            }
            coordinatorLayout.requestLayout();
            return c0696z2;
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C01731();
        SparseArray<Parcelable> f690a;

        static class C01731 implements ClassLoaderCreator<SavedState> {
            C01731() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f690a = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f690a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2 = 0;
            super.writeToParcel(parcel, i);
            int size = this.f690a != null ? this.f690a.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            while (i2 < size) {
                iArr[i2] = this.f690a.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f690a.valueAt(i2);
                i2++;
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface C0174a {
        Class<? extends Behavior> m456a();
    }

    private class C0175b implements OnHierarchyChangeListener {
        final /* synthetic */ CoordinatorLayout f691a;

        C0175b(CoordinatorLayout coordinatorLayout) {
            this.f691a = coordinatorLayout;
        }

        public final void onChildViewAdded(View view, View view2) {
            if (this.f691a.f720i != null) {
                this.f691a.f720i.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            this.f691a.m482a(2);
            if (this.f691a.f720i != null) {
                this.f691a.f720i.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class C0176c extends MarginLayoutParams {
        Behavior f692a;
        boolean f693b = false;
        public int f694c = 0;
        public int f695d = 0;
        public int f696e = -1;
        int f697f = -1;
        public int f698g = 0;
        public int f699h = 0;
        int f700i;
        int f701j;
        View f702k;
        View f703l;
        boolean f704m;
        boolean f705n;
        final Rect f706o = new Rect();
        Object f707p;
        private boolean f708q;
        private boolean f709r;

        public C0176c() {
            super(-2, -2);
        }

        C0176c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0115k.CoordinatorLayout_Layout);
            this.f694c = obtainStyledAttributes.getInteger(C0115k.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f697f = obtainStyledAttributes.getResourceId(C0115k.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f695d = obtainStyledAttributes.getInteger(C0115k.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f696e = obtainStyledAttributes.getInteger(C0115k.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f698g = obtainStyledAttributes.getInt(C0115k.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f699h = obtainStyledAttributes.getInt(C0115k.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.f693b = obtainStyledAttributes.hasValue(C0115k.CoordinatorLayout_Layout_layout_behavior);
            if (this.f693b) {
                this.f692a = CoordinatorLayout.m466a(context, attributeSet, obtainStyledAttributes.getString(C0115k.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            if (this.f692a != null) {
                this.f692a.mo157a(this);
            }
        }

        public C0176c(C0176c c0176c) {
            super(c0176c);
        }

        public C0176c(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0176c(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        final void m457a(int i, boolean z) {
            switch (i) {
                case 0:
                    this.f708q = z;
                    return;
                case 1:
                    this.f709r = z;
                    return;
                default:
                    return;
            }
        }

        public final void m458a(Behavior behavior) {
            if (this.f692a != behavior) {
                this.f692a = behavior;
                this.f707p = null;
                this.f693b = true;
                if (behavior != null) {
                    behavior.mo157a(this);
                }
            }
        }

        final boolean m459a(int i) {
            switch (i) {
                case 0:
                    return this.f708q;
                case 1:
                    return this.f709r;
                default:
                    return false;
            }
        }
    }

    class C0177d implements OnPreDrawListener {
        final /* synthetic */ CoordinatorLayout f710a;

        C0177d(CoordinatorLayout coordinatorLayout) {
            this.f710a = coordinatorLayout;
        }

        public final boolean onPreDraw() {
            this.f710a.m482a(0);
            return true;
        }
    }

    static class C0178e implements Comparator<View> {
        C0178e() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            View view = (View) obj2;
            float z = C0679r.m1953z((View) obj);
            float z2 = C0679r.m1953z(view);
            return z > z2 ? -1 : z < z2 ? 1 : 0;
        }
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f711a = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            f714d = new C0178e();
        } else {
            f714d = null;
        }
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = 0;
        super(context, attributeSet, i);
        this.f721k = new ArrayList();
        this.f716e = new C0239g();
        this.f722l = new ArrayList();
        this.f717f = new ArrayList();
        this.f723m = new int[2];
        this.f733w = new C0666m(this);
        C0260o.m694a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0115k.CoordinatorLayout, i, C0114j.Widget_Design_CoordinatorLayout);
        int resourceId = obtainStyledAttributes.getResourceId(C0115k.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f726p = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f726p.length;
            while (i2 < length) {
                this.f726p[i2] = (int) (((float) this.f726p[i2]) * f);
                i2++;
            }
        }
        this.f731u = obtainStyledAttributes.getDrawable(C0115k.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m478d();
        super.setOnHierarchyChangeListener(new C0175b(this));
    }

    private static Rect m465a() {
        Rect rect = (Rect) f715j.mo485a();
        return rect == null ? new Rect() : rect;
    }

    static Behavior m466a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f711a)) {
            str = f711a + '.' + str;
        }
        try {
            Map map;
            Map map2 = (Map) f713c.get();
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                f713c.set(hashMap);
                map = hashMap;
            } else {
                map = map2;
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, true, context.getClassLoader()).getConstructor(f712b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Throwable e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    private static void m467a(int i, Rect rect, Rect rect2, C0176c c0176c, int i2, int i3) {
        int i4 = c0176c.f694c;
        if (i4 == 0) {
            i4 = 17;
        }
        i4 = C0656d.m1743a(i4, i);
        int a = C0656d.m1743a(m475c(c0176c.f695d), i);
        int i5 = i4 & 7;
        int i6 = i4 & 112;
        int i7 = a & 112;
        switch (a & 7) {
            case 1:
                a = (rect.width() / 2) + rect.left;
                break;
            case 5:
                a = rect.right;
                break;
            default:
                a = rect.left;
                break;
        }
        switch (i7) {
            case 16:
                i4 = rect.top + (rect.height() / 2);
                break;
            case 80:
                i4 = rect.bottom;
                break;
            default:
                i4 = rect.top;
                break;
        }
        switch (i5) {
            case 1:
                a -= i2 / 2;
                break;
            case 5:
                break;
            default:
                a -= i2;
                break;
        }
        switch (i6) {
            case 16:
                i4 -= i3 / 2;
                break;
            case 80:
                break;
            default:
                i4 -= i3;
                break;
        }
        rect2.set(a, i4, a + i2, i4 + i3);
    }

    private static void m468a(Rect rect) {
        rect.setEmpty();
        f715j.mo486a(rect);
    }

    private void m469a(C0176c c0176c, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        width = Math.max(getPaddingLeft() + c0176c.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - c0176c.rightMargin));
        height = Math.max(getPaddingTop() + c0176c.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - c0176c.bottomMargin));
        rect.set(width, height, width + i, height + i2);
    }

    private void m470a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            C0261p.m695a((ViewGroup) this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    private boolean m471a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2 = false;
        Object obj = null;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f722l;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i2 = childCount - 1;
        while (i2 >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
            i2--;
        }
        if (f714d != null) {
            Collections.sort(list, f714d);
        }
        int size = list.size();
        int i3 = 0;
        MotionEvent motionEvent2 = null;
        while (i3 < size) {
            Object obj2;
            MotionEvent motionEvent3;
            View view = (View) list.get(i3);
            C0176c c0176c = (C0176c) view.getLayoutParams();
            Behavior behavior = c0176c.f692a;
            if ((!z2 && obj == null) || actionMasked == 0) {
                if (!(z2 || behavior == null)) {
                    switch (i) {
                        case 0:
                            z2 = behavior.mo87a(this, view, motionEvent);
                            break;
                        case 1:
                            z2 = behavior.mo88b(this, view, motionEvent);
                            break;
                    }
                    if (z2) {
                        this.f727q = view;
                    }
                }
                z = z2;
                if (c0176c.f692a == null) {
                    c0176c.f704m = false;
                }
                boolean z3 = c0176c.f704m;
                if (c0176c.f704m) {
                    isChildrenDrawingOrderEnabled = true;
                } else {
                    isChildrenDrawingOrderEnabled = c0176c.f704m | 0;
                    c0176c.f704m = isChildrenDrawingOrderEnabled;
                }
                Object obj3 = (!isChildrenDrawingOrderEnabled || z3) ? null : 1;
                if (isChildrenDrawingOrderEnabled && obj3 == null) {
                    list.clear();
                    return z;
                }
                MotionEvent motionEvent4 = motionEvent2;
                obj2 = obj3;
                motionEvent3 = motionEvent4;
            } else if (behavior != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                } else {
                    motionEvent3 = motionEvent2;
                }
                switch (i) {
                    case 0:
                        behavior.mo87a(this, view, motionEvent3);
                        obj2 = obj;
                        z = z2;
                        continue;
                    case 1:
                        behavior.mo88b(this, view, motionEvent3);
                        break;
                }
                obj2 = obj;
                z = z2;
            } else {
                motionEvent3 = motionEvent2;
                z = z2;
                obj2 = obj;
            }
            i3++;
            obj = obj2;
            z2 = z;
            motionEvent2 = motionEvent3;
        }
        z = z2;
        list.clear();
        return z;
    }

    private int m472b(int i) {
        if (this.f726p == null) {
            new StringBuilder("No keylines defined for ").append(this).append(" - attempted index lookup ").append(i);
            return 0;
        } else if (i >= 0 && i < this.f726p.length) {
            return this.f726p[i];
        } else {
            new StringBuilder("Keyline index ").append(i).append(" out of range for ").append(this);
            return 0;
        }
    }

    private static C0176c m473b(View view) {
        C0176c c0176c = (C0176c) view.getLayoutParams();
        if (!c0176c.f693b) {
            C0174a c0174a = null;
            for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                c0174a = (C0174a) cls.getAnnotation(C0174a.class);
                if (c0174a != null) {
                    break;
                }
            }
            C0174a c0174a2 = c0174a;
            if (c0174a2 != null) {
                try {
                    c0176c.m458a((Behavior) c0174a2.m456a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e) {
                    new StringBuilder("Default behavior class ").append(c0174a2.m456a().getName()).append(" could not be instantiated. Did you forget a default constructor?");
                }
            }
            c0176c.f693b = true;
        }
        return c0176c;
    }

    private void m474b() {
        if (this.f727q != null) {
            Behavior behavior = ((C0176c) this.f727q.getLayoutParams()).f692a;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                behavior.mo88b(this, this.f727q, obtain);
                obtain.recycle();
            }
            this.f727q = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((C0176c) getChildAt(i).getLayoutParams()).f704m = false;
        }
        this.f724n = false;
    }

    private static int m475c(int i) {
        int i2 = (i & 7) == 0 ? 8388611 | i : i;
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m476c() {
        /*
        r12 = this;
        r4 = 1;
        r11 = 0;
        r3 = 0;
        r0 = r12.f721k;
        r0.clear();
        r2 = r12.f716e;
        r0 = r2.f1005b;
        r5 = r0.size();
        r1 = r3;
    L_0x0011:
        if (r1 >= r5) goto L_0x0029;
    L_0x0013:
        r0 = r2.f1005b;
        r0 = r0.m1250c(r1);
        r0 = (java.util.ArrayList) r0;
        if (r0 == 0) goto L_0x0025;
    L_0x001d:
        r0.clear();
        r6 = r2.f1004a;
        r6.mo486a(r0);
    L_0x0025:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0011;
    L_0x0029:
        r0 = r2.f1005b;
        r0.clear();
        r5 = r12.getChildCount();
        r2 = r3;
    L_0x0033:
        if (r2 >= r5) goto L_0x019f;
    L_0x0035:
        r6 = r12.getChildAt(r2);
        r7 = m473b(r6);
        r0 = r7.f697f;
        r1 = -1;
        if (r0 != r1) goto L_0x00ae;
    L_0x0042:
        r7.f703l = r11;
        r7.f702k = r11;
    L_0x0046:
        r0 = r12.f716e;
        r0.m641a(r6);
        r1 = r3;
    L_0x004c:
        if (r1 >= r5) goto L_0x019a;
    L_0x004e:
        if (r1 == r2) goto L_0x0195;
    L_0x0050:
        r8 = r12.getChildAt(r1);
        r0 = r7.f703l;
        if (r8 == r0) goto L_0x0082;
    L_0x0058:
        r9 = android.support.v4.view.C0679r.m1932e(r12);
        r0 = r8.getLayoutParams();
        r0 = (android.support.design.widget.CoordinatorLayout.C0176c) r0;
        r0 = r0.f698g;
        r0 = android.support.v4.view.C0656d.m1743a(r0, r9);
        if (r0 == 0) goto L_0x016e;
    L_0x006a:
        r10 = r7.f699h;
        r9 = android.support.v4.view.C0656d.m1743a(r10, r9);
        r9 = r9 & r0;
        if (r9 != r0) goto L_0x016e;
    L_0x0073:
        r0 = r4;
    L_0x0074:
        if (r0 != 0) goto L_0x0082;
    L_0x0076:
        r0 = r7.f692a;
        if (r0 == 0) goto L_0x0171;
    L_0x007a:
        r0 = r7.f692a;
        r0 = r0.a_(r8);
        if (r0 == 0) goto L_0x0171;
    L_0x0082:
        r0 = r4;
    L_0x0083:
        if (r0 == 0) goto L_0x0195;
    L_0x0085:
        r0 = r12.f716e;
        r0 = r0.f1005b;
        r0 = r0.containsKey(r8);
        if (r0 != 0) goto L_0x0094;
    L_0x008f:
        r0 = r12.f716e;
        r0.m641a(r8);
    L_0x0094:
        r9 = r12.f716e;
        r0 = r9.f1005b;
        r0 = r0.containsKey(r8);
        if (r0 == 0) goto L_0x00a6;
    L_0x009e:
        r0 = r9.f1005b;
        r0 = r0.containsKey(r6);
        if (r0 != 0) goto L_0x0174;
    L_0x00a6:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "All nodes must be present in the graph before being added as an edge";
        r0.<init>(r1);
        throw r0;
    L_0x00ae:
        r0 = r7.f702k;
        if (r0 == 0) goto L_0x00bf;
    L_0x00b2:
        r0 = r7.f702k;
        r0 = r0.getId();
        r1 = r7.f697f;
        if (r0 == r1) goto L_0x00db;
    L_0x00bc:
        r0 = r3;
    L_0x00bd:
        if (r0 != 0) goto L_0x0046;
    L_0x00bf:
        r0 = r7.f697f;
        r0 = r12.findViewById(r0);
        r7.f702k = r0;
        r0 = r7.f702k;
        if (r0 == 0) goto L_0x0139;
    L_0x00cb:
        r0 = r7.f702k;
        if (r0 != r12) goto L_0x0107;
    L_0x00cf:
        r0 = r12.isInEditMode();
        if (r0 == 0) goto L_0x00ff;
    L_0x00d5:
        r7.f703l = r11;
        r7.f702k = r11;
        goto L_0x0046;
    L_0x00db:
        r0 = r7.f702k;
        r1 = r7.f702k;
        r1 = r1.getParent();
    L_0x00e3:
        if (r1 == r12) goto L_0x00fb;
    L_0x00e5:
        if (r1 == 0) goto L_0x00e9;
    L_0x00e7:
        if (r1 != r6) goto L_0x00ef;
    L_0x00e9:
        r7.f703l = r11;
        r7.f702k = r11;
        r0 = r3;
        goto L_0x00bd;
    L_0x00ef:
        r8 = r1 instanceof android.view.View;
        if (r8 == 0) goto L_0x00f6;
    L_0x00f3:
        r0 = r1;
        r0 = (android.view.View) r0;
    L_0x00f6:
        r1 = r1.getParent();
        goto L_0x00e3;
    L_0x00fb:
        r7.f703l = r0;
        r0 = r4;
        goto L_0x00bd;
    L_0x00ff:
        r0 = new java.lang.IllegalStateException;
        r1 = "View can not be anchored to the the parent CoordinatorLayout";
        r0.<init>(r1);
        throw r0;
    L_0x0107:
        r0 = r7.f702k;
        r1 = r7.f702k;
        r1 = r1.getParent();
    L_0x010f:
        if (r1 == r12) goto L_0x0135;
    L_0x0111:
        if (r1 == 0) goto L_0x0135;
    L_0x0113:
        if (r1 != r6) goto L_0x0129;
    L_0x0115:
        r0 = r12.isInEditMode();
        if (r0 == 0) goto L_0x0121;
    L_0x011b:
        r7.f703l = r11;
        r7.f702k = r11;
        goto L_0x0046;
    L_0x0121:
        r0 = new java.lang.IllegalStateException;
        r1 = "Anchor must not be a descendant of the anchored view";
        r0.<init>(r1);
        throw r0;
    L_0x0129:
        r8 = r1 instanceof android.view.View;
        if (r8 == 0) goto L_0x0130;
    L_0x012d:
        r0 = r1;
        r0 = (android.view.View) r0;
    L_0x0130:
        r1 = r1.getParent();
        goto L_0x010f;
    L_0x0135:
        r7.f703l = r0;
        goto L_0x0046;
    L_0x0139:
        r0 = r12.isInEditMode();
        if (r0 == 0) goto L_0x0145;
    L_0x013f:
        r7.f703l = r11;
        r7.f702k = r11;
        goto L_0x0046;
    L_0x0145:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Could not find CoordinatorLayout descendant view with id ";
        r1.<init>(r2);
        r2 = r12.getResources();
        r3 = r7.f697f;
        r2 = r2.getResourceName(r3);
        r1 = r1.append(r2);
        r2 = " to anchor view ";
        r1 = r1.append(r2);
        r1 = r1.append(r6);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x016e:
        r0 = r3;
        goto L_0x0074;
    L_0x0171:
        r0 = r3;
        goto L_0x0083;
    L_0x0174:
        r0 = r9.f1005b;
        r0 = r0.get(r8);
        r0 = (java.util.ArrayList) r0;
        if (r0 != 0) goto L_0x0192;
    L_0x017e:
        r0 = r9.f1004a;
        r0 = r0.mo485a();
        r0 = (java.util.ArrayList) r0;
        if (r0 != 0) goto L_0x018d;
    L_0x0188:
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x018d:
        r9 = r9.f1005b;
        r9.put(r8, r0);
    L_0x0192:
        r0.add(r6);
    L_0x0195:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x004c;
    L_0x019a:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x0033;
    L_0x019f:
        r0 = r12.f721k;
        r1 = r12.f716e;
        r1 = r1.m640a();
        r0.addAll(r1);
        r0 = r12.f721k;
        java.util.Collections.reverse(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.c():void");
    }

    private static int m477d(int i) {
        return i == 0 ? 8388661 : i;
    }

    private void m478d() {
        if (VERSION.SDK_INT >= 21) {
            if (C0679r.m1945r(this)) {
                if (this.f732v == null) {
                    this.f732v = new C01721(this);
                }
                C0679r.m1914a((View) this, this.f732v);
                setSystemUiVisibility(1280);
                return;
            }
            C0679r.m1914a((View) this, null);
        }
    }

    private static void m479d(View view, int i) {
        C0176c c0176c = (C0176c) view.getLayoutParams();
        if (c0176c.f700i != i) {
            C0679r.m1929c(view, i - c0176c.f700i);
            c0176c.f700i = i;
        }
    }

    private static void m480e(View view, int i) {
        C0176c c0176c = (C0176c) view.getLayoutParams();
        if (c0176c.f701j != i) {
            C0679r.m1924b(view, i - c0176c.f701j);
            c0176c.f701j = i;
        }
    }

    public final List<View> m481a(View view) {
        C0239g c0239g = this.f716e;
        Collection collection = null;
        int size = c0239g.f1005b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) c0239g.f1005b.m1250c(i);
            if (arrayList != null && arrayList.contains(view)) {
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    Collection collection2 = collection;
                }
                arrayList.add(c0239g.f1005b.m1249b(i));
                collection = arrayList;
            }
        }
        this.f717f.clear();
        if (collection != null) {
            this.f717f.addAll(collection);
        }
        return this.f717f;
    }

    final void m482a(int i) {
        int e = C0679r.m1932e(this);
        int size = this.f721k.size();
        Rect a = m465a();
        Rect a2 = m465a();
        Rect a3 = m465a();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f721k.get(i2);
            C0176c c0176c = (C0176c) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                int measuredWidth;
                int measuredHeight;
                Behavior behavior;
                int a4;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (c0176c.f703l == ((View) this.f721k.get(i3))) {
                        C0176c c0176c2 = (C0176c) view.getLayoutParams();
                        if (c0176c2.f702k != null) {
                            Rect a5 = m465a();
                            Rect a6 = m465a();
                            Rect a7 = m465a();
                            C0261p.m695a((ViewGroup) this, c0176c2.f702k, a5);
                            m470a(view, false, a6);
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            m467a(e, a5, a7, c0176c2, measuredWidth, measuredHeight);
                            Object obj = (a7.left == a6.left && a7.top == a6.top) ? null : 1;
                            m469a(c0176c2, a7, measuredWidth, measuredHeight);
                            measuredWidth = a7.left - a6.left;
                            measuredHeight = a7.top - a6.top;
                            if (measuredWidth != 0) {
                                C0679r.m1929c(view, measuredWidth);
                            }
                            if (measuredHeight != 0) {
                                C0679r.m1924b(view, measuredHeight);
                            }
                            if (obj != null) {
                                behavior = c0176c2.f692a;
                                if (behavior != null) {
                                    behavior.mo107a(this, view, c0176c2.f702k);
                                }
                            }
                            m468a(a5);
                            m468a(a6);
                            m468a(a7);
                        }
                    }
                }
                m470a(view, true, a2);
                if (!(c0176c.f698g == 0 || a2.isEmpty())) {
                    a4 = C0656d.m1743a(c0176c.f698g, e);
                    switch (a4 & 112) {
                        case 48:
                            a.top = Math.max(a.top, a2.bottom);
                            break;
                        case 80:
                            a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                            break;
                    }
                    switch (a4 & 7) {
                        case 3:
                            a.left = Math.max(a.left, a2.right);
                            break;
                        case 5:
                            a.right = Math.max(a.right, getWidth() - a2.left);
                            break;
                    }
                }
                if (c0176c.f699h != 0 && view.getVisibility() == 0 && C0679r.m1952y(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    C0176c c0176c3 = (C0176c) view.getLayoutParams();
                    Behavior behavior2 = c0176c3.f692a;
                    Rect a8 = m465a();
                    Rect a9 = m465a();
                    a9.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (behavior2 == null || !behavior2.mo158a(view, a8)) {
                        a8.set(a9);
                    } else if (!a9.contains(a8)) {
                        throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a8.toShortString() + " | Bounds:" + a9.toShortString());
                    }
                    m468a(a9);
                    if (!a8.isEmpty()) {
                        Object obj2;
                        measuredWidth = C0656d.m1743a(c0176c3.f699h, e);
                        Object obj3 = null;
                        if ((measuredWidth & 48) == 48) {
                            measuredHeight = (a8.top - c0176c3.topMargin) - c0176c3.f701j;
                            if (measuredHeight < a.top) {
                                m480e(view, a.top - measuredHeight);
                                obj3 = 1;
                            }
                        }
                        if ((measuredWidth & 80) == 80) {
                            measuredHeight = ((getHeight() - a8.bottom) - c0176c3.bottomMargin) + c0176c3.f701j;
                            if (measuredHeight < a.bottom) {
                                m480e(view, measuredHeight - a.bottom);
                                obj3 = 1;
                            }
                        }
                        if (obj3 == null) {
                            m480e(view, 0);
                        }
                        obj3 = null;
                        if ((measuredWidth & 3) == 3) {
                            measuredHeight = (a8.left - c0176c3.leftMargin) - c0176c3.f700i;
                            if (measuredHeight < a.left) {
                                m479d(view, a.left - measuredHeight);
                                obj3 = 1;
                            }
                        }
                        if ((measuredWidth & 5) == 5) {
                            a4 = c0176c3.f700i + ((getWidth() - a8.right) - c0176c3.rightMargin);
                            if (a4 < a.right) {
                                m479d(view, a4 - a.right);
                                obj2 = 1;
                                if (obj2 == null) {
                                    m479d(view, 0);
                                }
                            }
                        }
                        obj2 = obj3;
                        if (obj2 == null) {
                            m479d(view, 0);
                        }
                    }
                    m468a(a8);
                }
                if (i != 2) {
                    a3.set(((C0176c) view.getLayoutParams()).f706o);
                    if (!a3.equals(a2)) {
                        ((C0176c) view.getLayoutParams()).f706o.set(a2);
                    }
                }
                for (int i4 = i2 + 1; i4 < size; i4++) {
                    View view2 = (View) this.f721k.get(i4);
                    C0176c c0176c4 = (C0176c) view2.getLayoutParams();
                    behavior = c0176c4.f692a;
                    if (behavior != null && behavior.a_(view)) {
                        if (i == 0 && c0176c4.f705n) {
                            c0176c4.f705n = false;
                        } else {
                            boolean z;
                            switch (i) {
                                case 2:
                                    z = true;
                                    break;
                                default:
                                    z = behavior.mo107a(this, view2, view);
                                    break;
                            }
                            if (i == 1) {
                                c0176c4.f705n = z;
                            }
                        }
                    }
                }
            }
        }
        m468a(a);
        m468a(a2);
        m468a(a3);
    }

    public final void mo145a(int i, int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (i3 < childCount) {
            int i5;
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0176c c0176c = (C0176c) childAt.getLayoutParams();
                if (c0176c.m459a(i2)) {
                    Behavior behavior = c0176c.f692a;
                    if (behavior != null) {
                        behavior.mo101b(this, childAt, i);
                        i5 = 1;
                        i3++;
                        i4 = i5;
                    }
                }
            }
            i5 = i4;
            i3++;
            i4 = i5;
        }
        if (i4 != 0) {
            m482a(1);
        }
    }

    public final void m484a(View view, int i) {
        C0176c c0176c = (C0176c) view.getLayoutParams();
        Object obj = (c0176c.f702k != null || c0176c.f697f == -1) ? null : 1;
        if (obj != null) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (c0176c.f702k != null) {
            View view2 = c0176c.f702k;
            view.getLayoutParams();
            Rect a = m465a();
            Rect a2 = m465a();
            try {
                C0261p.m695a((ViewGroup) this, view2, a);
                C0176c c0176c2 = (C0176c) view.getLayoutParams();
                r4 = view.getMeasuredWidth();
                r5 = view.getMeasuredHeight();
                m467a(i, a, a2, c0176c2, r4, r5);
                m469a(c0176c2, a2, r4, r5);
                view.layout(a2.left, a2.top, a2.right, a2.bottom);
            } finally {
                m468a(a);
                m468a(a2);
            }
        } else if (c0176c.f696e >= 0) {
            int i2;
            int i3 = c0176c.f696e;
            c0176c = (C0176c) view.getLayoutParams();
            r4 = C0656d.m1743a(m477d(c0176c.f694c), i);
            r5 = r4 & 7;
            r4 &= 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (i == 1) {
                i3 = width - i3;
            }
            i3 = m472b(i3) - measuredWidth;
            switch (r5) {
                case 1:
                    i2 = i3 + (measuredWidth / 2);
                    break;
                case 5:
                    i2 = i3 + measuredWidth;
                    break;
                default:
                    i2 = i3;
                    break;
            }
            switch (r4) {
                case 16:
                    i3 = (measuredHeight / 2) + 0;
                    break;
                case 80:
                    i3 = measuredHeight + 0;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            int max = Math.max(getPaddingLeft() + c0176c.leftMargin, Math.min(i2, ((width - getPaddingRight()) - measuredWidth) - c0176c.rightMargin));
            int max2 = Math.max(getPaddingTop() + c0176c.topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight) - c0176c.bottomMargin));
            view.layout(max, max2, max + measuredWidth, max2 + measuredHeight);
        } else {
            c0176c = (C0176c) view.getLayoutParams();
            Rect a3 = m465a();
            a3.set(getPaddingLeft() + c0176c.leftMargin, getPaddingTop() + c0176c.topMargin, (getWidth() - getPaddingRight()) - c0176c.rightMargin, (getHeight() - getPaddingBottom()) - c0176c.bottomMargin);
            if (!(this.f718g == null || !C0679r.m1945r(this) || C0679r.m1945r(view))) {
                a3.left += this.f718g.m1993a();
                a3.top += this.f718g.m1995b();
                a3.right -= this.f718g.m1996c();
                a3.bottom -= this.f718g.m1997d();
            }
            Rect a4 = m465a();
            C0656d.m1744a(m475c(c0176c.f694c), view.getMeasuredWidth(), view.getMeasuredHeight(), a3, a4, i);
            view.layout(a4.left, a4.top, a4.right, a4.bottom);
            m468a(a3);
            m468a(a4);
        }
    }

    public final void m485a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public final void mo146a(View view, int i, int i2, int[] iArr, int i3) {
        int i4 = 0;
        int i5 = 0;
        Object obj = null;
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            int max;
            int max2;
            Object obj2;
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0176c c0176c = (C0176c) childAt.getLayoutParams();
                if (c0176c.m459a(i3)) {
                    Behavior behavior = c0176c.f692a;
                    if (behavior != null) {
                        int[] iArr2 = this.f723m;
                        this.f723m[1] = 0;
                        iArr2[0] = 0;
                        behavior.mo95a(this, childAt, view, i2, this.f723m, i3);
                        max = i > 0 ? Math.max(i4, this.f723m[0]) : Math.min(i4, this.f723m[0]);
                        max2 = i2 > 0 ? Math.max(i5, this.f723m[1]) : Math.min(i5, this.f723m[1]);
                        obj2 = 1;
                        i6++;
                        i5 = max2;
                        i4 = max;
                        obj = obj2;
                    }
                }
            }
            obj2 = obj;
            max = i4;
            max2 = i5;
            i6++;
            i5 = max2;
            i4 = max;
            obj = obj2;
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (obj != null) {
            m482a(1);
        }
    }

    public final boolean m487a(View view, int i, int i2) {
        Rect a = m465a();
        C0261p.m695a((ViewGroup) this, view, a);
        try {
            boolean contains = a.contains(i, i2);
            return contains;
        } finally {
            m468a(a);
        }
    }

    public final void mo147b(View view, int i) {
        this.f733w.f1970a = i;
        this.f728r = view;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).getLayoutParams();
        }
    }

    public final boolean mo148b(View view, int i, int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (i3 < childCount) {
            boolean z2;
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0176c c0176c = (C0176c) childAt.getLayoutParams();
                Behavior behavior = c0176c.f692a;
                if (behavior != null) {
                    boolean a = behavior.mo97a(this, childAt, view, i, i2);
                    z2 = z | a;
                    c0176c.m457a(i2, a);
                    i3++;
                    z = z2;
                } else {
                    c0176c.m457a(i2, false);
                }
            }
            z2 = z;
            i3++;
            z = z2;
        }
        return z;
    }

    public final void mo149c(View view, int i) {
        this.f733w.f1970a = 0;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0176c c0176c = (C0176c) childAt.getLayoutParams();
            if (c0176c.m459a(i)) {
                Behavior behavior = c0176c.f692a;
                if (behavior != null) {
                    behavior.mo94a(this, childAt, view, i);
                }
                c0176c.m457a(i, false);
                c0176c.f705n = false;
            }
        }
        this.f728r = null;
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0176c) && super.checkLayoutParams(layoutParams);
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        int i = 0;
        Drawable drawable = this.f731u;
        if (drawable != null && drawable.isStateful()) {
            i = drawable.setState(drawableState) | 0;
        }
        if (i != 0) {
            invalidate();
        }
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new C0176c();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0176c(getContext(), attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0176c ? new C0176c((C0176c) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0176c((MarginLayoutParams) layoutParams) : new C0176c(layoutParams);
    }

    final List<View> getDependencySortedChildren() {
        m476c();
        return Collections.unmodifiableList(this.f721k);
    }

    final C0696z getLastWindowInsets() {
        return this.f718g;
    }

    public int getNestedScrollAxes() {
        return this.f733w.f1970a;
    }

    public Drawable getStatusBarBackground() {
        return this.f731u;
    }

    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m474b();
        if (this.f730t) {
            if (this.f729s == null) {
                this.f729s = new C0177d(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f729s);
        }
        if (this.f718g == null && C0679r.m1945r(this)) {
            C0679r.m1944q(this);
        }
        this.f725o = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m474b();
        if (this.f730t && this.f729s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f729s);
        }
        if (this.f728r != null) {
            onStopNestedScroll(this.f728r);
        }
        this.f725o = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f719h && this.f731u != null) {
            int b = this.f718g != null ? this.f718g.m1995b() : 0;
            if (b > 0) {
                this.f731u.setBounds(0, 0, getWidth(), b);
                this.f731u.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m474b();
        }
        boolean a = m471a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m474b();
        }
        return a;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int e = C0679r.m1932e(this);
        int size = this.f721k.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f721k.get(i5);
            if (view.getVisibility() != 8) {
                Behavior behavior = ((C0176c) view.getLayoutParams()).f692a;
                if (behavior == null || !behavior.mo86a(this, view, e)) {
                    m484a(view, e);
                }
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        m476c();
        int childCount = getChildCount();
        for (i3 = 0; i3 < childCount; i3++) {
            Object obj;
            View childAt = getChildAt(i3);
            C0239g c0239g = this.f716e;
            int size = c0239g.f1005b.size();
            for (i4 = 0; i4 < size; i4++) {
                ArrayList arrayList = (ArrayList) c0239g.f1005b.m1250c(i4);
                if (arrayList != null && arrayList.contains(childAt)) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
            if (obj != null) {
                z = true;
                break;
            }
        }
        z = false;
        if (z != this.f730t) {
            if (z) {
                if (this.f725o) {
                    if (this.f729s == null) {
                        this.f729s = new C0177d(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f729s);
                }
                this.f730t = true;
            } else {
                if (this.f725o && this.f729s != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f729s);
                }
                this.f730t = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        i4 = getPaddingBottom();
        int e = C0679r.m1932e(this);
        Object obj2 = e == 1 ? 1 : null;
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size3 = MeasureSpec.getSize(i2);
        int i5 = paddingLeft + paddingRight;
        int i6 = paddingTop + i4;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int i7 = 0;
        Object obj3 = (this.f718g == null || !C0679r.m1945r(this)) ? null : 1;
        int size4 = this.f721k.size();
        int i8 = 0;
        while (i8 < size4) {
            int b;
            View view = (View) this.f721k.get(i8);
            if (view.getVisibility() != 8) {
                int i9;
                C0176c c0176c = (C0176c) view.getLayoutParams();
                childCount = 0;
                if (c0176c.f696e >= 0 && mode != 0) {
                    b = m472b(c0176c.f696e);
                    paddingTop = C0656d.m1743a(m477d(c0176c.f694c), e) & 7;
                    if ((paddingTop == 3 && obj2 == null) || (paddingTop == 5 && obj2 != null)) {
                        childCount = Math.max(0, (size2 - paddingRight) - b);
                    } else if ((paddingTop == 5 && obj2 == null) || (paddingTop == 3 && obj2 != null)) {
                        childCount = Math.max(0, b - paddingLeft);
                    }
                }
                if (obj3 == null || C0679r.m1945r(view)) {
                    i9 = i2;
                    i3 = i;
                } else {
                    paddingTop = this.f718g.m1995b() + this.f718g.m1997d();
                    i3 = MeasureSpec.makeMeasureSpec(size2 - (this.f718g.m1993a() + this.f718g.m1996c()), mode);
                    i9 = MeasureSpec.makeMeasureSpec(size3 - paddingTop, mode2);
                }
                Behavior behavior = c0176c.f692a;
                if (behavior == null || !behavior.mo96a(this, view, i3, childCount, i9, 0)) {
                    m485a(view, i3, childCount, i9, 0);
                }
                i3 = Math.max(suggestedMinimumWidth, ((view.getMeasuredWidth() + i5) + c0176c.leftMargin) + c0176c.rightMargin);
                paddingTop = Math.max(suggestedMinimumHeight, ((view.getMeasuredHeight() + i6) + c0176c.topMargin) + c0176c.bottomMargin);
                b = View.combineMeasuredStates(i7, view.getMeasuredState());
                i4 = i3;
            } else {
                b = i7;
                paddingTop = suggestedMinimumHeight;
                i4 = suggestedMinimumWidth;
            }
            i8++;
            i7 = b;
            suggestedMinimumHeight = paddingTop;
            suggestedMinimumWidth = i4;
        }
        setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, -16777216 & i7), View.resolveSizeAndState(suggestedMinimumHeight, i2, i7 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        int i = 0;
        boolean z = false;
        while (i < childCount) {
            boolean a;
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0176c c0176c = (C0176c) childAt.getLayoutParams();
                if (c0176c.m459a(0)) {
                    Behavior behavior = c0176c.f692a;
                    if (behavior != null) {
                        a = behavior.mo123a(this, childAt, view, f, f2) | z;
                        i++;
                        z = a;
                    }
                }
            }
            a = z;
            i++;
            z = a;
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo146a(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo145a(i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo147b(view2, i);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            SparseArray sparseArray = savedState.f690a;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                int id = childAt.getId();
                Behavior behavior = m473b(childAt).f692a;
                if (!(id == -1 || behavior == null)) {
                    Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                    if (parcelable2 != null) {
                        behavior.mo93a(this, childAt, parcelable2);
                    }
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((C0176c) childAt.getLayoutParams()).f692a;
            if (!(id == -1 || behavior == null)) {
                Parcelable b = behavior.mo100b(this, childAt);
                if (b != null) {
                    sparseArray.append(id, b);
                }
            }
        }
        savedState.f690a = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo148b(view, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo149c(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2;
        MotionEvent motionEvent2;
        if (this.f727q == null) {
            boolean a = m471a(motionEvent, 1);
            if (a) {
                z2 = a;
            } else {
                z2 = a;
                z = false;
                if (this.f727q == null) {
                    z |= super.onTouchEvent(motionEvent);
                    motionEvent2 = null;
                } else if (z2) {
                    motionEvent2 = null;
                } else {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    super.onTouchEvent(motionEvent2);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                if (actionMasked == 1 || actionMasked == 3) {
                    m474b();
                }
                return z;
            }
        }
        z2 = false;
        Behavior behavior = ((C0176c) this.f727q.getLayoutParams()).f692a;
        z = behavior != null ? behavior.mo88b(this, this.f727q, motionEvent) : false;
        if (this.f727q == null) {
            z |= super.onTouchEvent(motionEvent);
            motionEvent2 = null;
        } else if (z2) {
            motionEvent2 = null;
        } else {
            long uptimeMillis2 = SystemClock.uptimeMillis();
            motionEvent2 = MotionEvent.obtain(uptimeMillis2, uptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEvent2);
        }
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        m474b();
        return z;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((C0176c) view.getLayoutParams()).f692a;
        return (behavior == null || !behavior.mo106a(this, view, rect, z)) ? super.requestChildRectangleOnScreen(view, rect, z) : true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f724n) {
            m474b();
            this.f724n = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m478d();
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f720i = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = null;
        if (this.f731u != drawable) {
            if (this.f731u != null) {
                this.f731u.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f731u = drawable2;
            if (this.f731u != null) {
                if (this.f731u.isStateful()) {
                    this.f731u.setState(getDrawableState());
                }
                C0366a.m1049b(this.f731u, C0679r.m1932e(this));
                this.f731u.setVisible(getVisibility() == 0, false);
                this.f731u.setCallback(this);
            }
            C0679r.m1928c(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0392a.getDrawable(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f731u != null && this.f731u.isVisible() != z) {
            this.f731u.setVisible(z, false);
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f731u;
    }
}
