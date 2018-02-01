package com.rac.stuido.banglakeyboard;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import com.actionbarsherlock.C0126R;
import com.actionbarsherlock.internal.widget.IcsLinearLayout;
import com.actionbarsherlock.internal.widget.IcsListPopupWindow;
import com.actionbarsherlock.view.ActionProvider;

class ActivityChooserView extends ViewGroup {
    private static final boolean f2513t = (VERSION.SDK_INT >= 11);
    ActionProvider f2514a;
    private final C0581q f2515b;
    private final C0582r f2516c;
    private final IcsLinearLayout f2517d;
    private final Drawable f2518e;
    private final FrameLayout f2519f;
    private final ImageView f2520g;
    private final FrameLayout f2521h;
    private final ImageView f2522i;
    private final int f2523j;
    private final DataSetObserver f2524k;
    private final OnGlobalLayoutListener f2525l;
    private IcsListPopupWindow f2526m;
    private OnDismissListener f2527n;
    private boolean f2528o;
    private int f2529p;
    private boolean f2530q;
    private int f2531r;
    private final Context f2532s;

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2524k = new C0578n(this);
        this.f2525l = new C0579o(this);
        this.f2529p = 4;
        this.f2532s = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0126R.styleable.SherlockActivityChooserView, i, 0);
        this.f2529p = obtainStyledAttributes.getInt(1, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(this.f2532s).inflate(C0126R.layout.abs__activity_chooser_view, this, true);
        this.f2516c = new C0582r();
        this.f2517d = (IcsLinearLayout) findViewById(C0126R.id.abs__activity_chooser_view_content);
        this.f2518e = this.f2517d.getBackground();
        this.f2521h = (FrameLayout) findViewById(C0126R.id.abs__default_activity_button);
        this.f2521h.setOnClickListener(this.f2516c);
        this.f2521h.setOnLongClickListener(this.f2516c);
        this.f2522i = (ImageView) this.f2521h.findViewById(C0126R.id.abs__image);
        this.f2519f = (FrameLayout) findViewById(C0126R.id.abs__expand_activities_button);
        this.f2519f.setOnClickListener(this.f2516c);
        this.f2520g = (ImageView) this.f2519f.findViewById(C0126R.id.abs__image);
        this.f2520g.setImageDrawable(drawable);
        this.f2515b = new C0581q();
        this.f2515b.registerDataSetObserver(new C0580p(this));
        Resources resources = context.getResources();
        this.f2523j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0126R.dimen.abs__config_prefDialogWidth));
    }

    private void m3825a(int i) {
        if (this.f2515b.m4046e() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f2525l);
        boolean z = this.f2521h.getVisibility() == 0;
        int c = this.f2515b.m4044c();
        int i2 = z ? 1 : 0;
        if (i == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED || c <= i2 + i) {
            this.f2515b.m4041a(false);
            this.f2515b.m4039a(i);
        } else {
            this.f2515b.m4041a(true);
            this.f2515b.m4039a(i - 1);
        }
        IcsListPopupWindow f = m3834f();
        if (!f.isShowing()) {
            if (this.f2528o || !z) {
                this.f2515b.m4042a(true, z);
            } else {
                this.f2515b.m4042a(false, false);
            }
            f.setContentWidth(Math.min(this.f2515b.m4038a(), this.f2523j));
            f.show();
            if (this.f2514a != null) {
                this.f2514a.subUiVisibilityChanged(true);
            }
            f.getListView().setContentDescription(this.f2532s.getString(C0126R.string.abs__activitychooserview_choose_application));
        }
    }

    static /* synthetic */ void m3829c(ActivityChooserView activityChooserView) {
        if (activityChooserView.f2515b.getCount() > 0) {
            activityChooserView.f2519f.setEnabled(true);
        } else {
            activityChooserView.f2519f.setEnabled(false);
        }
        activityChooserView.f2521h.setVisibility(8);
        if (activityChooserView.f2521h.getVisibility() == 0) {
            activityChooserView.f2517d.setBackgroundDrawable(activityChooserView.f2518e);
            return;
        }
        activityChooserView.f2517d.setBackgroundDrawable(null);
        activityChooserView.f2517d.setPadding(0, 0, 0, 0);
    }

    private IcsListPopupWindow m3834f() {
        if (this.f2526m == null) {
            this.f2526m = new IcsListPopupWindow(getContext());
            this.f2526m.setAdapter(this.f2515b);
            this.f2526m.setAnchorView(this);
            this.f2526m.setModal(true);
            this.f2526m.setOnItemClickListener(this.f2516c);
            this.f2526m.setOnDismissListener(this.f2516c);
        }
        return this.f2526m;
    }

    public final void m3839a() {
        this.f2520g.setContentDescription(this.f2532s.getString(C0126R.string.abs__shareactionprovider_share_with));
    }

    public final void m3840a(Drawable drawable) {
        this.f2520g.setImageDrawable(drawable);
    }

    public final void m3841a(ActionProvider actionProvider) {
        this.f2514a = actionProvider;
    }

    public final void m3842a(C0570e c0570e) {
        this.f2515b.m4040a(c0570e);
        if (m3834f().isShowing()) {
            m3843b();
            if (!m3834f().isShowing() && this.f2530q) {
                this.f2528o = false;
                m3825a(this.f2529p);
            }
        }
    }

    public final boolean m3843b() {
        if (m3834f().isShowing()) {
            m3834f().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f2525l);
            }
        }
        return true;
    }

    public final boolean m3844c() {
        return m3834f().isShowing();
    }

    public final void m3845d() {
        this.f2531r = C0126R.string.abs__shareactionprovider_share_with_application;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0570e e = this.f2515b.m4046e();
        if (e != null) {
            e.registerObserver(this.f2524k);
        }
        this.f2530q = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0570e e = this.f2515b.m4046e();
        if (e != null) {
            try {
                e.unregisterObserver(this.f2524k);
            } catch (IllegalStateException e2) {
            }
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2525l);
        }
        this.f2530q = false;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2517d.layout(0, 0, i3 - i, i4 - i2);
        if (m3834f().isShowing()) {
            m3825a(this.f2515b.m4045d());
        } else {
            m3843b();
        }
    }

    protected void onMeasure(int i, int i2) {
        View view = this.f2517d;
        if (this.f2521h.getVisibility() != 0) {
            i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
