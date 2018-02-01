package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.C0116a.C0106b;
import android.support.design.C0116a.C0110f;
import android.support.design.C0116a.C0112h;
import android.support.design.C0116a.C0114j;
import android.support.design.widget.BottomSheetBehavior.C01601;
import android.support.design.widget.BottomSheetBehavior.C0164a;
import android.support.v4.view.C0122a;
import android.support.v4.view.C0679r;
import android.support.v4.view.p019a.C0626b;
import android.support.v7.app.C0234k;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;

public final class C0235c extends C0234k {
    boolean f941a;
    boolean f942b;
    boolean f943c;
    private BottomSheetBehavior<FrameLayout> f944d;
    private C0164a f945e;

    class C02291 implements OnClickListener {
        final /* synthetic */ C0235c f936a;

        C02291(C0235c c0235c) {
            this.f936a = c0235c;
        }

        public final void onClick(View view) {
            if (this.f936a.f941a && this.f936a.isShowing()) {
                C0235c c0235c = this.f936a;
                if (!c0235c.f943c) {
                    if (VERSION.SDK_INT < 11) {
                        c0235c.f942b = true;
                    } else {
                        TypedArray obtainStyledAttributes = c0235c.getContext().obtainStyledAttributes(new int[]{16843611});
                        c0235c.f942b = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    }
                    c0235c.f943c = true;
                }
                if (c0235c.f942b) {
                    this.f936a.cancel();
                }
            }
        }
    }

    class C02302 extends C0122a {
        final /* synthetic */ C0235c f937a;

        C02302(C0235c c0235c) {
            this.f937a = c0235c;
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0626b c0626b) {
            super.onInitializeAccessibilityNodeInfo(view, c0626b);
            if (this.f937a.f941a) {
                c0626b.m1684a(1048576);
                c0626b.m1709k(true);
                return;
            }
            c0626b.m1709k(false);
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i != 1048576 || !this.f937a.f941a) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            this.f937a.cancel();
            return true;
        }
    }

    class C02313 implements OnTouchListener {
        final /* synthetic */ C0235c f938a;

        C02313(C0235c c0235c) {
            this.f938a = c0235c;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class C02324 extends C0164a {
        final /* synthetic */ C0235c f939a;

        C02324(C0235c c0235c) {
            this.f939a = c0235c;
        }

        public final void mo179a(int i) {
            if (i == 5) {
                this.f939a.cancel();
            }
        }
    }

    public C0235c(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(C0106b.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : C0114j.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i);
        this.f941a = true;
        this.f942b = true;
        this.f945e = new C02324(this);
        m607a();
    }

    private View m608a(int i, View view, LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C0112h.design_bottom_sheet_dialog, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(C0110f.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        View view2 = (FrameLayout) coordinatorLayout.findViewById(C0110f.design_bottom_sheet);
        this.f944d = BottomSheetBehavior.m430b(view2);
        this.f944d.f644i = this.f945e;
        this.f944d.f638c = this.f941a;
        if (layoutParams == null) {
            view2.addView(view);
        } else {
            view2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C0110f.touch_outside).setOnClickListener(new C02291(this));
        C0679r.m1913a(view2, new C02302(this));
        view2.setOnTouchListener(new C02313(this));
        return frameLayout;
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    protected final void onStart() {
        super.onStart();
        if (this.f944d != null) {
            BottomSheetBehavior bottomSheetBehavior = this.f944d;
            if (4 == bottomSheetBehavior.f639d) {
                return;
            }
            if (bottomSheetBehavior.f642g == null) {
                bottomSheetBehavior.f639d = 4;
                return;
            }
            View view = (View) bottomSheetBehavior.f642g.get();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && C0679r.m1901B(view)) {
                    view.post(new C01601(bottomSheetBehavior, view));
                } else {
                    bottomSheetBehavior.m436a(view, 4);
                }
            }
        }
    }

    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f941a != z) {
            this.f941a = z;
            if (this.f944d != null) {
                this.f944d.f638c = z;
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f941a) {
            this.f941a = true;
        }
        this.f942b = z;
        this.f943c = true;
    }

    public final void setContentView(int i) {
        super.setContentView(m608a(i, null, null));
    }

    public final void setContentView(View view) {
        super.setContentView(m608a(0, view, null));
    }

    public final void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(m608a(0, view, layoutParams));
    }
}
