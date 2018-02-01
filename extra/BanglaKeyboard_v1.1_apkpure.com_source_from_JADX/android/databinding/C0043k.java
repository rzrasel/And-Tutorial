package android.databinding;

import android.annotation.TargetApi;
import android.databinding.C0001f.C0022a;
import android.databinding.C0018b.C0013a;
import android.databinding.C0024h.C0023a;
import android.databinding.C0026i.C0025a;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import com.p029a.p030a.p031a.C1079a.C1078a;
import java.lang.ref.WeakReference;

public abstract class C0043k extends C0002a {
    static int f34a = VERSION.SDK_INT;
    public static final C0029a f35b = new C00301();
    private static final int f36f = 8;
    private static final boolean f37g = (C0019c.f19a >= 14);
    private static final boolean f38h;
    private static final C0029a f39i = new C00312();
    private static final C0029a f40j = new C00323();
    private static final C0013a<Object, C0043k, Void> f41k = new C00334();
    private static final OnAttachStateChangeListener f42l;
    public C0040e[] f43c;
    public final View f44d;
    protected final C0020d f45e;
    private final Runnable f46m = new C00356(this);
    private boolean f47n = false;
    private boolean f48o = false;
    private C0018b<Object, C0043k, Void> f49p;
    private boolean f50q;
    private Choreographer f51r;
    private final FrameCallback f52s;
    private Handler f53t;

    private interface C0029a {
        C0040e mo4a(C0043k c0043k);
    }

    static class C00301 implements C0029a {
        C00301() {
        }

        public final C0040e mo4a(C0043k c0043k) {
            return new C0042g(c0043k).f33a;
        }
    }

    static class C00312 implements C0029a {
        C00312() {
        }

        public final C0040e mo4a(C0043k c0043k) {
            return new C0039d(c0043k).f28a;
        }
    }

    static class C00323 implements C0029a {
        C00323() {
        }

        public final C0040e mo4a(C0043k c0043k) {
            return new C0041f(c0043k).f32a;
        }
    }

    static class C00334 extends C0013a<Object, C0043k, Void> {
        C00334() {
        }

        public final /* bridge */ /* synthetic */ void mo3a(Object obj, Object obj2, int i) {
        }
    }

    static class C00345 implements OnAttachStateChangeListener {
        C00345() {
        }

        @TargetApi(19)
        public final void onViewAttachedToWindow(View view) {
            C0043k.m44b(view).f46m.run();
            view.removeOnAttachStateChangeListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    class C00356 implements Runnable {
        final /* synthetic */ C0043k f23a;

        C00356(C0043k c0043k) {
            this.f23a = c0043k;
        }

        public final void run() {
            synchronized (this) {
                this.f23a.f47n = false;
            }
            if (VERSION.SDK_INT < 19 || this.f23a.f44d.isAttachedToWindow()) {
                this.f23a.m51b();
                return;
            }
            this.f23a.f44d.removeOnAttachStateChangeListener(C0043k.f42l);
            this.f23a.f44d.addOnAttachStateChangeListener(C0043k.f42l);
        }
    }

    class C00367 implements FrameCallback {
        final /* synthetic */ C0043k f24a;

        C00367(C0043k c0043k) {
            this.f24a = c0043k;
        }

        public final void doFrame(long j) {
            this.f24a.f46m.run();
        }
    }

    protected static class C0037b {
        public final String[][] f25a;
        public final int[][] f26b;
        public final int[][] f27c;
    }

    private interface C0038c<T> {
        void mo5a(T t);

        void mo6b(T t);
    }

    private static class C0039d extends C0023a implements C0038c<C0024h> {
        final C0040e<C0024h> f28a;

        public C0039d(C0043k c0043k) {
            this.f28a = new C0040e(c0043k, 0, this);
        }

        public final /* bridge */ /* synthetic */ void mo5a(Object obj) {
        }

        public final /* bridge */ /* synthetic */ void mo6b(Object obj) {
        }
    }

    private static class C0040e<T> extends WeakReference<C0043k> {
        final C0038c<T> f29a;
        protected final int f30b = 0;
        public T f31c;

        public C0040e(C0043k c0043k, int i, C0038c<T> c0038c) {
            super(c0043k);
            this.f29a = c0038c;
        }

        public final boolean m32a() {
            boolean z = false;
            if (this.f31c != null) {
                this.f29a.mo6b(this.f31c);
                z = true;
            }
            this.f31c = null;
            return z;
        }
    }

    private static class C0041f extends C0025a implements C0038c<C0026i> {
        final C0040e<C0026i> f32a;

        public C0041f(C0043k c0043k) {
            this.f32a = new C0040e(c0043k, 0, this);
        }

        public final /* bridge */ /* synthetic */ void mo5a(Object obj) {
        }

        public final /* bridge */ /* synthetic */ void mo6b(Object obj) {
        }
    }

    private static class C0042g extends C0022a implements C0038c<C0001f> {
        final C0040e<C0001f> f33a;

        public C0042g(C0043k c0043k) {
            this.f33a = new C0040e(c0043k, 0, this);
        }

        public final void mo7a(C0001f c0001f, int i) {
            C0040e c0040e = this.f33a;
            C0043k c0043k = (C0043k) c0040e.get();
            if (c0043k == null) {
                c0040e.m32a();
            }
            if (c0043k != null && ((C0001f) this.f33a.f31c) == c0001f) {
                C0043k.m40a(c0043k, this.f33a.f30b, i);
            }
        }

        public final /* bridge */ /* synthetic */ void mo5a(Object obj) {
            ((C0001f) obj).mo1a(this);
        }

        public final /* bridge */ /* synthetic */ void mo6b(Object obj) {
            ((C0001f) obj).mo2b(this);
        }
    }

    static {
        boolean z = true;
        if (f34a < 16) {
            z = false;
        }
        f38h = z;
        if (VERSION.SDK_INT < 19) {
            f42l = null;
        } else {
            f42l = new C00345();
        }
    }

    public C0043k(C0020d c0020d, View view, int i) {
        this.f45e = c0020d;
        this.f43c = new C0040e[i];
        this.f44d = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (f38h) {
            this.f51r = Choreographer.getInstance();
            this.f52s = new C00367(this);
        } else {
            this.f52s = null;
            this.f53t = new Handler(Looper.myLooper());
        }
    }

    private static void m39a(C0020d c0020d, View view, Object[] objArr, C0037b c0037b, SparseIntArray sparseIntArray, boolean z) {
        if (C0043k.m44b(view) == null) {
            int lastIndexOf;
            int i;
            int b;
            Object tag = view.getTag();
            String str = tag instanceof String ? (String) tag : null;
            tag = null;
            if (z && str != null && str.startsWith("layout")) {
                lastIndexOf = str.lastIndexOf(95);
                if (lastIndexOf <= 0 || !C0043k.m41a(str, lastIndexOf + 1)) {
                    i = -1;
                } else {
                    b = C0043k.m43b(str, lastIndexOf + 1);
                    if (objArr[b] == null) {
                        objArr[b] = view;
                    }
                    if (c0037b == null) {
                        b = -1;
                    }
                    i = b;
                    tag = 1;
                }
            } else if (str == null || !str.startsWith("binding_")) {
                i = -1;
            } else {
                b = C0043k.m43b(str, f36f);
                if (objArr[b] == null) {
                    objArr[b] = view;
                }
                if (c0037b == null) {
                    b = -1;
                }
                i = b;
                b = 1;
            }
            if (tag == null) {
                b = view.getId();
                if (b > 0 && sparseIntArray != null) {
                    b = sparseIntArray.get(b, -1);
                    if (b >= 0 && objArr[b] == null) {
                        objArr[b] = view;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                int i3 = 0;
                while (i3 < childCount) {
                    int length;
                    View childAt = viewGroup.getChildAt(i3);
                    if (i >= 0 && (childAt.getTag() instanceof String)) {
                        String str2 = (String) childAt.getTag();
                        if (str2.endsWith("_0") && str2.startsWith("layout") && str2.indexOf(47) > 0) {
                            CharSequence subSequence = str2.subSequence(str2.indexOf(47) + 1, str2.length() - 2);
                            String[] strArr = c0037b.f25a[i];
                            length = strArr.length;
                            b = i2;
                            while (b < length) {
                                if (TextUtils.equals(subSequence, strArr[b])) {
                                    break;
                                }
                                b++;
                            }
                            b = -1;
                            if (b >= 0) {
                                length = b + 1;
                                int i4 = c0037b.f26b[i][b];
                                int i5 = c0037b.f27c[i][b];
                                str2 = (String) viewGroup.getChildAt(i3).getTag();
                                String substring = str2.substring(0, str2.length() - 1);
                                int length2 = substring.length();
                                int childCount2 = viewGroup.getChildCount();
                                i2 = i3 + 1;
                                int i6 = i3;
                                while (i2 < childCount2) {
                                    View childAt2 = viewGroup.getChildAt(i2);
                                    String str3 = childAt2.getTag() instanceof String ? (String) childAt2.getTag() : null;
                                    if (str3 != null && str3.startsWith(substring)) {
                                        if (str3.length() == str2.length() && str3.charAt(str3.length() - 1) == '0') {
                                            break;
                                        } else if (C0043k.m41a(str3, length2)) {
                                            lastIndexOf = i2;
                                            i2++;
                                            i6 = lastIndexOf;
                                        }
                                    }
                                    lastIndexOf = i6;
                                    i2++;
                                    i6 = lastIndexOf;
                                }
                                if (i6 == i3) {
                                    objArr[i4] = C0021e.m19a(c0020d, childAt, i5);
                                    tag = 1;
                                } else {
                                    lastIndexOf = (i6 - i3) + 1;
                                    View[] viewArr = new View[lastIndexOf];
                                    for (b = 0; b < lastIndexOf; b++) {
                                        viewArr[b] = viewGroup.getChildAt(i3 + b);
                                    }
                                    objArr[i4] = C0021e.m18a();
                                    i3 = (lastIndexOf - 1) + i3;
                                    b = 1;
                                }
                                if (tag == null) {
                                    C0043k.m39a(c0020d, childAt, objArr, c0037b, sparseIntArray, false);
                                }
                                i3++;
                                i2 = length;
                            }
                        }
                    }
                    tag = null;
                    length = i2;
                    if (tag == null) {
                        C0043k.m39a(c0020d, childAt, objArr, c0037b, sparseIntArray, false);
                    }
                    i3++;
                    i2 = length;
                }
            }
        }
    }

    static /* synthetic */ void m40a(C0043k c0043k, int i, int i2) {
        if (c0043k.mo2373a(i, i2)) {
            c0043k.m56g();
        }
    }

    private static boolean m41a(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static Object[] m42a(C0020d c0020d, View view, int i, C0037b c0037b, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        C0043k.m39a(c0020d, view, objArr, c0037b, sparseIntArray, true);
        return objArr;
    }

    private static int m43b(String str, int i) {
        int i2 = 0;
        while (i < str.length()) {
            i2 = (i2 * 10) + (str.charAt(i) - 48);
            i++;
        }
        return i2;
    }

    static C0043k m44b(View view) {
        if (view != null) {
            if (f37g) {
                return (C0043k) view.getTag(C1078a.dataBinding);
            }
            Object tag = view.getTag();
            if (tag instanceof C0043k) {
                return (C0043k) tag;
            }
        }
        return null;
    }

    public final void m48a(Object obj, C0029a c0029a) {
        if (obj != null) {
            C0040e c0040e = this.f43c[0];
            if (c0040e == null) {
                c0040e = c0029a.mo4a(this);
                this.f43c[0] = c0040e;
            }
            c0040e.m32a();
            c0040e.f31c = obj;
            if (c0040e.f31c != null) {
                c0040e.f29a.mo5a(c0040e.f31c);
            }
        }
    }

    public abstract boolean mo2373a(int i, int i2);

    public abstract boolean mo2374a(int i, Object obj);

    public final void m51b() {
        if (this.f50q) {
            m56g();
        } else if (mo2377e()) {
            this.f50q = true;
            this.f48o = false;
            if (this.f49p != null) {
                this.f49p.m15a((Object) this, 1);
                if (this.f48o) {
                    this.f49p.m15a((Object) this, 2);
                }
            }
            if (!this.f48o) {
                mo2375c();
                if (this.f49p != null) {
                    this.f49p.m15a((Object) this, 3);
                }
            }
            this.f50q = false;
        }
    }

    public final void b_(View view) {
        if (f37g) {
            view.setTag(C1078a.dataBinding, this);
        } else {
            view.setTag(this);
        }
    }

    public abstract void mo2375c();

    public abstract void mo2376d();

    public abstract boolean mo2377e();

    public final boolean m55f() {
        C0040e c0040e = this.f43c[0];
        return c0040e != null ? c0040e.m32a() : false;
    }

    protected void finalize() {
        for (C0040e c0040e : this.f43c) {
            if (c0040e != null) {
                c0040e.m32a();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m56g() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f47n;	 Catch:{ all -> 0x0017 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r2);	 Catch:{ all -> 0x0017 }
    L_0x0006:
        return;
    L_0x0007:
        r0 = 1;
        r2.f47n = r0;	 Catch:{ all -> 0x0017 }
        monitor-exit(r2);	 Catch:{ all -> 0x0017 }
        r0 = f38h;
        if (r0 == 0) goto L_0x001a;
    L_0x000f:
        r0 = r2.f51r;
        r1 = r2.f52s;
        r0.postFrameCallback(r1);
        goto L_0x0006;
    L_0x0017:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0017 }
        throw r0;
    L_0x001a:
        r0 = r2.f53t;
        r1 = r2.f46m;
        r0.post(r1);
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.databinding.k.g():void");
    }
}
