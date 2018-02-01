package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.design.C0116a.C0105a;
import android.support.design.C0116a.C0115k;
import android.support.design.widget.C0256m.C0254a;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0176c;
import android.support.design.widget.SwipeDismissBehavior.C0193a;
import android.support.v4.view.C0679r;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.util.List;

public abstract class C0191b<B extends C0191b<B>> {
    static final Handler f767a = new Handler(Looper.getMainLooper(), new C02161());
    private static final boolean f768e;
    final ViewGroup f769b;
    final C0190e f770c;
    final C0254a f771d;
    private final C0129b f772f;
    private List<Object<B>> f773g;
    private final AccessibilityManager f774h;

    public interface C0129b {
        void mo62a();

        void mo63b();
    }

    static class C0190e extends FrameLayout {
        private C0224d f765a;
        private C0222c f766b;

        C0190e(Context context) {
            this(context, null);
        }

        C0190e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0115k.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(C0115k.SnackbarLayout_elevation)) {
                C0679r.m1905a((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(C0115k.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
        }

        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            C0679r.m1944q(this);
        }

        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f766b != null) {
                this.f766b.mo175a();
            }
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f765a != null) {
                this.f765a.mo176a();
            }
        }

        void setOnAttachStateChangeListener(C0222c c0222c) {
            this.f766b = c0222c;
        }

        void setOnLayoutChangeListener(C0224d c0224d) {
            this.f765a = c0224d;
        }
    }

    static class C02161 implements Callback {
        C02161() {
        }

        public final boolean handleMessage(Message message) {
            C0191b c0191b;
            switch (message.what) {
                case 0:
                    c0191b = (C0191b) message.obj;
                    if (c0191b.f770c.getParent() == null) {
                        LayoutParams layoutParams = c0191b.f770c.getLayoutParams();
                        if (layoutParams instanceof C0176c) {
                            C0176c c0176c = (C0176c) layoutParams;
                            Behavior c0228a = new C0228a(c0191b);
                            c0228a.f786f = SwipeDismissBehavior.m532a(0.1f);
                            c0228a.f787g = SwipeDismissBehavior.m532a(0.6f);
                            c0228a.f784d = 0;
                            c0228a.f783c = new C02205(c0191b);
                            c0176c.m458a(c0228a);
                            c0176c.f698g = 80;
                        }
                        c0191b.f769b.addView(c0191b.f770c);
                    }
                    c0191b.f770c.setOnAttachStateChangeListener(new C02236(c0191b));
                    if (!C0679r.m1952y(c0191b.f770c)) {
                        c0191b.f770c.setOnLayoutChangeListener(new C02257(c0191b));
                    } else if (c0191b.m521d()) {
                        c0191b.m518a();
                    } else {
                        c0191b.m519b();
                    }
                    return true;
                case 1:
                    c0191b = (C0191b) message.obj;
                    int i = message.arg1;
                    if (!c0191b.m521d() || c0191b.f770c.getVisibility() != 0) {
                        c0191b.m520c();
                    } else if (VERSION.SDK_INT >= 12) {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(new int[]{0, c0191b.f770c.getHeight()});
                        valueAnimator.setInterpolator(C0215a.f916b);
                        valueAnimator.setDuration(250);
                        valueAnimator.addListener(new C02172(c0191b, i));
                        valueAnimator.addUpdateListener(new C02183(c0191b));
                        valueAnimator.start();
                    } else {
                        Animation loadAnimation = AnimationUtils.loadAnimation(c0191b.f770c.getContext(), C0105a.design_snackbar_out);
                        loadAnimation.setInterpolator(C0215a.f916b);
                        loadAnimation.setDuration(250);
                        loadAnimation.setAnimationListener(new C02194(c0191b, i));
                        c0191b.f770c.startAnimation(loadAnimation);
                    }
                    return true;
                default:
                    return false;
            }
        }
    }

    class C02172 extends AnimatorListenerAdapter {
        final /* synthetic */ int f921a;
        final /* synthetic */ C0191b f922b;

        C02172(C0191b c0191b, int i) {
            this.f922b = c0191b;
            this.f921a = i;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f922b.m520c();
        }

        public final void onAnimationStart(Animator animator) {
            this.f922b.f772f.mo63b();
        }
    }

    class C02183 implements AnimatorUpdateListener {
        final /* synthetic */ C0191b f923a;
        private int f924b = 0;

        C02183(C0191b c0191b) {
            this.f923a = c0191b;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (C0191b.f768e) {
                C0679r.m1924b(this.f923a.f770c, intValue - this.f924b);
            } else {
                this.f923a.f770c.setTranslationY((float) intValue);
            }
            this.f924b = intValue;
        }
    }

    class C02194 implements AnimationListener {
        final /* synthetic */ int f925a;
        final /* synthetic */ C0191b f926b;

        C02194(C0191b c0191b, int i) {
            this.f926b = c0191b;
            this.f925a = i;
        }

        public final void onAnimationEnd(Animation animation) {
            this.f926b.m520c();
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    }

    class C02205 implements C0193a {
        final /* synthetic */ C0191b f927a;

        C02205(C0191b c0191b) {
            this.f927a = c0191b;
        }

        public final void mo173a(int i) {
            switch (i) {
                case 0:
                    C0256m.m685a().m688b(this.f927a.f771d);
                    return;
                case 1:
                case 2:
                    C0256m.m685a().m686a(this.f927a.f771d);
                    return;
                default:
                    return;
            }
        }

        public final void mo174a(View view) {
            view.setVisibility(8);
            C0191b c0191b = this.f927a;
            C0256m a = C0256m.m685a();
            C0254a c0254a = c0191b.f771d;
            synchronized (a.f1067a) {
                if (a.m691d(c0254a)) {
                    a.m687a(a.f1068b);
                } else if (a.m692e(c0254a)) {
                    a.m687a(a.f1069c);
                }
            }
        }
    }

    interface C0222c {
        void mo175a();
    }

    class C02236 implements C0222c {
        final /* synthetic */ C0191b f929a;

        class C02211 implements Runnable {
            final /* synthetic */ C02236 f928a;

            C02211(C02236 c02236) {
                this.f928a = c02236;
            }

            public final void run() {
                this.f928a.f929a.m520c();
            }
        }

        C02236(C0191b c0191b) {
            this.f929a = c0191b;
        }

        public final void mo175a() {
            if (C0256m.m685a().m690c(this.f929a.f771d)) {
                C0191b.f767a.post(new C02211(this));
            }
        }
    }

    interface C0224d {
        void mo176a();
    }

    class C02257 implements C0224d {
        final /* synthetic */ C0191b f930a;

        C02257(C0191b c0191b) {
            this.f930a = c0191b;
        }

        public final void mo176a() {
            this.f930a.f770c.setOnLayoutChangeListener(null);
            if (this.f930a.m521d()) {
                this.f930a.m518a();
            } else {
                this.f930a.m519b();
            }
        }
    }

    class C02268 extends AnimatorListenerAdapter {
        final /* synthetic */ C0191b f931a;

        C02268(C0191b c0191b) {
            this.f931a = c0191b;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f931a.m519b();
        }

        public final void onAnimationStart(Animator animator) {
            this.f931a.f772f.mo62a();
        }
    }

    final class C0228a extends SwipeDismissBehavior<C0190e> {
        final /* synthetic */ C0191b f935a;

        C0228a(C0191b c0191b) {
            this.f935a = c0191b;
        }

        private boolean m602a(CoordinatorLayout coordinatorLayout, C0190e c0190e, MotionEvent motionEvent) {
            switch (motionEvent.getActionMasked()) {
                case 0:
                    if (coordinatorLayout.m487a((View) c0190e, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                        C0256m.m685a().m686a(this.f935a.f771d);
                        break;
                    }
                    break;
                case 1:
                case 3:
                    C0256m.m685a().m688b(this.f935a.f771d);
                    break;
            }
            return super.mo87a(coordinatorLayout, (View) c0190e, motionEvent);
        }

        public final boolean mo177b(View view) {
            return view instanceof C0190e;
        }
    }

    static {
        boolean z = VERSION.SDK_INT >= 16 && VERSION.SDK_INT <= 19;
        f768e = z;
    }

    final void m518a() {
        if (VERSION.SDK_INT >= 12) {
            final int height = this.f770c.getHeight();
            if (f768e) {
                C0679r.m1924b(this.f770c, height);
            } else {
                this.f770c.setTranslationY((float) height);
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{height, 0});
            valueAnimator.setInterpolator(C0215a.f916b);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new C02268(this));
            valueAnimator.addUpdateListener(new AnimatorUpdateListener(this) {
                final /* synthetic */ C0191b f933b;
                private int f934c = height;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (C0191b.f768e) {
                        C0679r.m1924b(this.f933b.f770c, intValue - this.f934c);
                    } else {
                        this.f933b.f770c.setTranslationY((float) intValue);
                    }
                    this.f934c = intValue;
                }
            });
            valueAnimator.start();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f770c.getContext(), C0105a.design_snackbar_in);
        loadAnimation.setInterpolator(C0215a.f916b);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new AnimationListener(this) {
            final /* synthetic */ C0191b f920a;

            {
                this.f920a = r1;
            }

            public final void onAnimationEnd(Animation animation) {
                this.f920a.m519b();
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        this.f770c.startAnimation(loadAnimation);
    }

    final void m519b() {
        C0256m a = C0256m.m685a();
        C0254a c0254a = this.f771d;
        synchronized (a.f1067a) {
            if (a.m691d(c0254a)) {
                a.m689b(a.f1068b);
            }
        }
        if (this.f773g != null) {
            for (int size = this.f773g.size() - 1; size >= 0; size--) {
                this.f773g.get(size);
            }
        }
    }

    final void m520c() {
        C0256m a = C0256m.m685a();
        C0254a c0254a = this.f771d;
        synchronized (a.f1067a) {
            if (a.m691d(c0254a)) {
                a.f1068b = null;
                if (!(a.f1069c == null || a.f1069c == null)) {
                    a.f1068b = a.f1069c;
                    a.f1069c = null;
                    if (((C0254a) a.f1068b.f1063a.get()) == null) {
                        a.f1068b = null;
                    }
                }
            }
        }
        if (this.f773g != null) {
            for (int size = this.f773g.size() - 1; size >= 0; size--) {
                this.f773g.get(size);
            }
        }
        if (VERSION.SDK_INT < 11) {
            this.f770c.setVisibility(8);
        }
        ViewParent parent = this.f770c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f770c);
        }
    }

    final boolean m521d() {
        return !this.f774h.isEnabled();
    }
}
