package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.C0116a.C0110f;
import android.support.design.C0116a.C0112h;
import android.support.design.C0116a.C0113i;
import android.support.design.C0116a.C0114j;
import android.support.design.C0116a.C0115k;
import android.support.v4.content.C0392a;
import android.support.v4.p006a.p007a.C0366a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0122a;
import android.support.v4.view.C0679r;
import android.support.v4.view.p019a.C0626b;
import android.support.v4.widget.C0765l;
import android.support.v4.widget.Space;
import android.support.v7.p021a.C0780a.C0772c;
import android.support.v7.p021a.C0780a.C0778i;
import android.support.v7.p023c.p024a.C0862b;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.DrawableUtils;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.TintTypedArray;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class TextInputLayout extends LinearLayout {
    private boolean f874A;
    private Drawable f875B;
    private Drawable f876C;
    private ColorStateList f877D;
    private boolean f878E;
    private Mode f879F;
    private boolean f880G;
    private ColorStateList f881H;
    private ColorStateList f882I;
    private boolean f883J;
    private boolean f884K;
    private ValueAnimator f885L;
    private boolean f886M;
    private boolean f887N;
    private boolean f888O;
    EditText f889a;
    TextView f890b;
    boolean f891c;
    final C0238f f892d;
    private final FrameLayout f893e;
    private CharSequence f894f;
    private boolean f895g;
    private CharSequence f896h;
    private Paint f897i;
    private final Rect f898j;
    private LinearLayout f899k;
    private int f900l;
    private Typeface f901m;
    private boolean f902n;
    private int f903o;
    private boolean f904p;
    private CharSequence f905q;
    private TextView f906r;
    private int f907s;
    private int f908t;
    private int f909u;
    private boolean f910v;
    private boolean f911w;
    private Drawable f912x;
    private CharSequence f913y;
    private CheckableImageButton f914z;

    class C02081 implements TextWatcher {
        final /* synthetic */ TextInputLayout f865a;

        C02081(TextInputLayout textInputLayout) {
            this.f865a = textInputLayout;
        }

        public final void afterTextChanged(Editable editable) {
            this.f865a.m593a(!this.f865a.f888O, false);
            if (this.f865a.f891c) {
                this.f865a.m592a(editable.length());
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class C02092 extends AnimatorListenerAdapter {
        final /* synthetic */ TextInputLayout f866a;

        C02092(TextInputLayout textInputLayout) {
            this.f866a = textInputLayout;
        }

        public final void onAnimationStart(Animator animator) {
            this.f866a.f890b.setVisibility(0);
        }
    }

    class C02114 implements OnClickListener {
        final /* synthetic */ TextInputLayout f869a;

        C02114(TextInputLayout textInputLayout) {
            this.f869a = textInputLayout;
        }

        public final void onClick(View view) {
            this.f869a.m584a(false);
        }
    }

    class C02125 implements AnimatorUpdateListener {
        final /* synthetic */ TextInputLayout f870a;

        C02125(TextInputLayout textInputLayout) {
            this.f870a = textInputLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f870a.f892d.m624a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C02131();
        CharSequence f871a;
        boolean f872b;

        static class C02131 implements ClassLoaderCreator<SavedState> {
            C02131() {
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

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f871a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f872b = parcel.readInt() == 1;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f871a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f871a, parcel, i);
            parcel.writeInt(this.f872b ? 1 : 0);
        }
    }

    private class C0214a extends C0122a {
        final /* synthetic */ TextInputLayout f873a;

        C0214a(TextInputLayout textInputLayout) {
            this.f873a = textInputLayout;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(TextInputLayout.class.getSimpleName());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0626b c0626b) {
            super.onInitializeAccessibilityNodeInfo(view, c0626b);
            c0626b.m1694b(TextInputLayout.class.getSimpleName());
            CharSequence charSequence = this.f873a.f892d.f988i;
            if (!TextUtils.isEmpty(charSequence)) {
                c0626b.f1917b.setText(charSequence);
            }
            if (this.f873a.f889a != null) {
                C0626b.f1916a.mo595a(c0626b.f1917b, this.f873a.f889a);
            }
            charSequence = this.f873a.f890b != null ? this.f873a.f890b.getText() : null;
            if (!TextUtils.isEmpty(charSequence)) {
                C0626b.f1916a.mo607f(c0626b.f1917b);
                C0626b.f1916a.mo610a(c0626b.f1917b, charSequence);
            }
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            CharSequence charSequence = this.f873a.f892d.f988i;
            if (!TextUtils.isEmpty(charSequence)) {
                accessibilityEvent.getText().add(charSequence);
            }
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f898j = new Rect();
        this.f892d = new C0238f(this);
        C0260o.m694a(context);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        this.f893e = new FrameLayout(context);
        this.f893e.setAddStatesFromChildren(true);
        addView(this.f893e);
        this.f892d.m630a(C0215a.f916b);
        C0238f c0238f = this.f892d;
        c0238f.f989j = new AccelerateInterpolator();
        c0238f.m633b();
        this.f892d.m634b(8388659);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0115k.TextInputLayout, i, C0114j.Widget_Design_TextInputLayout);
        this.f895g = obtainStyledAttributes.getBoolean(C0115k.TextInputLayout_hintEnabled, true);
        setHint(obtainStyledAttributes.getText(C0115k.TextInputLayout_android_hint));
        this.f884K = obtainStyledAttributes.getBoolean(C0115k.TextInputLayout_hintAnimationEnabled, true);
        if (obtainStyledAttributes.hasValue(C0115k.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(C0115k.TextInputLayout_android_textColorHint);
            this.f882I = colorStateList;
            this.f881H = colorStateList;
        }
        if (obtainStyledAttributes.getResourceId(C0115k.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(C0115k.TextInputLayout_hintTextAppearance, 0));
        }
        this.f903o = obtainStyledAttributes.getResourceId(C0115k.TextInputLayout_errorTextAppearance, 0);
        boolean z = obtainStyledAttributes.getBoolean(C0115k.TextInputLayout_errorEnabled, false);
        boolean z2 = obtainStyledAttributes.getBoolean(C0115k.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(C0115k.TextInputLayout_counterMaxLength, -1));
        this.f908t = obtainStyledAttributes.getResourceId(C0115k.TextInputLayout_counterTextAppearance, 0);
        this.f909u = obtainStyledAttributes.getResourceId(C0115k.TextInputLayout_counterOverflowTextAppearance, 0);
        this.f911w = obtainStyledAttributes.getBoolean(C0115k.TextInputLayout_passwordToggleEnabled, false);
        this.f912x = obtainStyledAttributes.getDrawable(C0115k.TextInputLayout_passwordToggleDrawable);
        this.f913y = obtainStyledAttributes.getText(C0115k.TextInputLayout_passwordToggleContentDescription);
        if (obtainStyledAttributes.hasValue(C0115k.TextInputLayout_passwordToggleTint)) {
            this.f878E = true;
            this.f877D = obtainStyledAttributes.getColorStateList(C0115k.TextInputLayout_passwordToggleTint);
        }
        if (obtainStyledAttributes.hasValue(C0115k.TextInputLayout_passwordToggleTintMode)) {
            this.f880G = true;
            this.f879F = C0263r.m700a(obtainStyledAttributes.getInt(C0115k.TextInputLayout_passwordToggleTintMode, -1));
        }
        obtainStyledAttributes.recycle();
        setErrorEnabled(z);
        setCounterEnabled(z2);
        m591f();
        if (C0679r.m1930d(this) == 0) {
            C0679r.m1906a((View) this, 1);
        }
        C0679r.m1913a((View) this, new C0214a(this));
    }

    private void m579a() {
        int i;
        LayoutParams layoutParams = (LayoutParams) this.f893e.getLayoutParams();
        if (this.f895g) {
            if (this.f897i == null) {
                this.f897i = new Paint();
            }
            this.f897i.setTypeface(this.f892d.m623a());
            this.f897i.setTextSize(this.f892d.f984e);
            i = (int) (-this.f897i.ascent());
        } else {
            i = 0;
        }
        if (i != layoutParams.topMargin) {
            layoutParams.topMargin = i;
            this.f893e.requestLayout();
        }
    }

    private void m580a(float f) {
        if (this.f892d.f980a != f) {
            if (this.f885L == null) {
                this.f885L = new ValueAnimator();
                this.f885L.setInterpolator(C0215a.f915a);
                this.f885L.setDuration(200);
                this.f885L.addUpdateListener(new C02125(this));
            }
            this.f885L.setFloatValues(new float[]{this.f892d.f980a, f});
            this.f885L.start();
        }
    }

    private static void m581a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m581a((ViewGroup) childAt, z);
            }
        }
    }

    private void m582a(TextView textView) {
        if (this.f899k != null) {
            this.f899k.removeView(textView);
            int i = this.f900l - 1;
            this.f900l = i;
            if (i == 0) {
                this.f899k.setVisibility(8);
            }
        }
    }

    private void m583a(TextView textView, int i) {
        if (this.f899k == null) {
            this.f899k = new LinearLayout(getContext());
            this.f899k.setOrientation(0);
            addView(this.f899k, -1, -2);
            this.f899k.addView(new Space(getContext()), new LayoutParams(0, 0, 1.0f));
            if (this.f889a != null) {
                m586b();
            }
        }
        this.f899k.setVisibility(0);
        this.f899k.addView(textView, i);
        this.f900l++;
    }

    private void m584a(boolean z) {
        if (this.f911w) {
            int selectionEnd = this.f889a.getSelectionEnd();
            if (m590e()) {
                this.f889a.setTransformationMethod(null);
                this.f874A = true;
            } else {
                this.f889a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f874A = false;
            }
            this.f914z.setChecked(this.f874A);
            if (z) {
                this.f914z.jumpDrawablesToCurrentState();
            }
            this.f889a.setSelection(selectionEnd);
        }
    }

    private void m586b() {
        C0679r.m1925b(this.f899k, C0679r.m1935h(this.f889a), 0, C0679r.m1936i(this.f889a), this.f889a.getPaddingBottom());
    }

    private void m588c() {
        if (this.f889a != null) {
            Drawable background = this.f889a.getBackground();
            if (background != null) {
                Drawable background2;
                int i = VERSION.SDK_INT;
                if (i == 21 || i == 22) {
                    background2 = this.f889a.getBackground();
                    if (!(background2 == null || this.f886M)) {
                        Drawable newDrawable = background2.getConstantState().newDrawable();
                        if (background2 instanceof DrawableContainer) {
                            this.f886M = C0240h.m643a((DrawableContainer) background2, newDrawable.getConstantState());
                        }
                        if (!this.f886M) {
                            C0679r.m1912a(this.f889a, newDrawable);
                            this.f886M = true;
                        }
                    }
                }
                background2 = DrawableUtils.canSafelyMutateDrawable(background) ? background.mutate() : background;
                if (this.f904p && this.f890b != null) {
                    background2.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(this.f890b.getCurrentTextColor(), Mode.SRC_IN));
                } else if (!this.f910v || this.f906r == null) {
                    C0366a.m1053f(background2);
                    this.f889a.refreshDrawableState();
                } else {
                    background2.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(this.f906r.getCurrentTextColor(), Mode.SRC_IN));
                }
            }
        }
    }

    private void m589d() {
        if (this.f889a != null) {
            int i;
            if (this.f911w && (m590e() || this.f874A)) {
                i = 1;
            } else {
                boolean z = false;
            }
            Drawable[] b;
            if (i != 0) {
                if (this.f914z == null) {
                    this.f914z = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C0112h.design_text_input_password_icon, this.f893e, false);
                    this.f914z.setImageDrawable(this.f912x);
                    this.f914z.setContentDescription(this.f913y);
                    this.f893e.addView(this.f914z);
                    this.f914z.setOnClickListener(new C02114(this));
                }
                if (this.f889a != null && C0679r.m1938k(this.f889a) <= 0) {
                    this.f889a.setMinimumHeight(C0679r.m1938k(this.f914z));
                }
                this.f914z.setVisibility(0);
                this.f914z.setChecked(this.f874A);
                if (this.f875B == null) {
                    this.f875B = new ColorDrawable();
                }
                this.f875B.setBounds(0, 0, this.f914z.getMeasuredWidth(), 1);
                b = C0765l.m2192b(this.f889a);
                if (b[2] != this.f875B) {
                    this.f876C = b[2];
                }
                C0765l.m2191a(this.f889a, b[0], b[1], this.f875B, b[3]);
                this.f914z.setPadding(this.f889a.getPaddingLeft(), this.f889a.getPaddingTop(), this.f889a.getPaddingRight(), this.f889a.getPaddingBottom());
                return;
            }
            if (this.f914z != null && this.f914z.getVisibility() == 0) {
                this.f914z.setVisibility(8);
            }
            if (this.f875B != null) {
                b = C0765l.m2192b(this.f889a);
                if (b[2] == this.f875B) {
                    C0765l.m2191a(this.f889a, b[0], b[1], this.f876C, b[3]);
                    this.f875B = null;
                }
            }
        }
    }

    private boolean m590e() {
        return this.f889a != null && (this.f889a.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private void m591f() {
        if (this.f912x == null) {
            return;
        }
        if (this.f878E || this.f880G) {
            this.f912x = C0366a.m1054g(this.f912x).mutate();
            if (this.f878E) {
                C0366a.m1043a(this.f912x, this.f877D);
            }
            if (this.f880G) {
                C0366a.m1046a(this.f912x, this.f879F);
            }
            if (this.f914z != null && this.f914z.getDrawable() != this.f912x) {
                this.f914z.setImageDrawable(this.f912x);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f889a != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        this.f889a = editText;
        if (!m590e()) {
            this.f892d.m629a(this.f889a.getTypeface());
        }
        C0238f c0238f = this.f892d;
        float textSize = this.f889a.getTextSize();
        if (c0238f.f983d != textSize) {
            c0238f.f983d = textSize;
            c0238f.m633b();
        }
        int gravity = this.f889a.getGravity();
        this.f892d.m634b((gravity & -113) | 48);
        this.f892d.m625a(gravity);
        this.f889a.addTextChangedListener(new C02081(this));
        if (this.f881H == null) {
            this.f881H = this.f889a.getHintTextColors();
        }
        if (this.f895g && TextUtils.isEmpty(this.f896h)) {
            this.f894f = this.f889a.getHint();
            setHint(this.f894f);
            this.f889a.setHint(null);
        }
        if (this.f906r != null) {
            m592a(this.f889a.getText().length());
        }
        if (this.f899k != null) {
            m586b();
        }
        m589d();
        m593a(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        this.f896h = charSequence;
        this.f892d.m631a(charSequence);
    }

    final void m592a(int i) {
        boolean z = this.f910v;
        if (this.f907s == -1) {
            this.f906r.setText(String.valueOf(i));
            this.f910v = false;
        } else {
            this.f910v = i > this.f907s;
            if (z != this.f910v) {
                C0765l.m2190a(this.f906r, this.f910v ? this.f909u : this.f908t);
            }
            this.f906r.setText(getContext().getString(C0113i.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f907s)}));
        }
        if (this.f889a != null && z != this.f910v) {
            m593a(false, false);
            m588c();
        }
    }

    final void m593a(boolean z, boolean z2) {
        boolean z3;
        boolean isEnabled = isEnabled();
        boolean z4 = (this.f889a == null || TextUtils.isEmpty(this.f889a.getText())) ? false : true;
        for (int i : getDrawableState()) {
            if (i == 16842908) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z5 = !TextUtils.isEmpty(getError());
        if (this.f881H != null) {
            this.f892d.m636b(this.f881H);
        }
        if (isEnabled && this.f910v && this.f906r != null) {
            this.f892d.m627a(this.f906r.getTextColors());
        } else if (isEnabled && r3 && this.f882I != null) {
            this.f892d.m627a(this.f882I);
        } else if (this.f881H != null) {
            this.f892d.m627a(this.f881H);
        }
        if (z4 || (isEnabled() && (r3 || z5))) {
            if (z2 || this.f883J) {
                if (this.f885L != null && this.f885L.isRunning()) {
                    this.f885L.cancel();
                }
                if (z && this.f884K) {
                    m580a(1.0f);
                } else {
                    this.f892d.m624a(1.0f);
                }
                this.f883J = false;
            }
        } else if (z2 || !this.f883J) {
            if (this.f885L != null && this.f885L.isRunning()) {
                this.f885L.cancel();
            }
            if (z && this.f884K) {
                m580a(0.0f);
            } else {
                this.f892d.m624a(0.0f);
            }
            this.f883J = true;
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f893e.addView(view, layoutParams2);
            this.f893e.setLayoutParams(layoutParams);
            m579a();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (this.f894f == null || this.f889a == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        CharSequence hint = this.f889a.getHint();
        this.f889a.setHint(this.f894f);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f889a.setHint(hint);
        }
    }

    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f888O = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f888O = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f895g) {
            this.f892d.m628a(canvas);
        }
    }

    protected void drawableStateChanged() {
        boolean z = true;
        if (!this.f887N) {
            this.f887N = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (!(C0679r.m1952y(this) && isEnabled())) {
                z = false;
            }
            m593a(z, false);
            m588c();
            if ((this.f892d != null ? this.f892d.m632a(drawableState) | 0 : 0) != 0) {
                invalidate();
            }
            this.f887N = false;
        }
    }

    public int getCounterMaxLength() {
        return this.f907s;
    }

    public EditText getEditText() {
        return this.f889a;
    }

    public CharSequence getError() {
        return this.f902n ? this.f905q : null;
    }

    public CharSequence getHint() {
        return this.f895g ? this.f896h : null;
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f913y;
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f912x;
    }

    public Typeface getTypeface() {
        return this.f901m;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f895g && this.f889a != null) {
            Rect rect = this.f898j;
            C0261p.m695a((ViewGroup) this, this.f889a, rect);
            int compoundPaddingLeft = rect.left + this.f889a.getCompoundPaddingLeft();
            int compoundPaddingRight = rect.right - this.f889a.getCompoundPaddingRight();
            this.f892d.m626a(compoundPaddingLeft, rect.top + this.f889a.getCompoundPaddingTop(), compoundPaddingRight, rect.bottom - this.f889a.getCompoundPaddingBottom());
            this.f892d.m635b(compoundPaddingLeft, getPaddingTop(), compoundPaddingRight, (i4 - i2) - getPaddingBottom());
            this.f892d.m633b();
        }
    }

    protected void onMeasure(int i, int i2) {
        m589d();
        super.onMeasure(i, i2);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            setError(savedState.f871a);
            if (savedState.f872b) {
                m584a(true);
            }
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        if (this.f904p) {
            savedState.f871a = getError();
        }
        savedState.f872b = this.f874A;
        return savedState;
    }

    public void setCounterEnabled(boolean z) {
        if (this.f891c != z) {
            if (z) {
                this.f906r = new AppCompatTextView(getContext());
                this.f906r.setId(C0110f.textinput_counter);
                if (this.f901m != null) {
                    this.f906r.setTypeface(this.f901m);
                }
                this.f906r.setMaxLines(1);
                try {
                    C0765l.m2190a(this.f906r, this.f908t);
                } catch (Exception e) {
                    C0765l.m2190a(this.f906r, C0778i.TextAppearance_AppCompat_Caption);
                    this.f906r.setTextColor(C0392a.getColor(getContext(), C0772c.error_color_material));
                }
                m583a(this.f906r, -1);
                if (this.f889a == null) {
                    m592a(0);
                } else {
                    m592a(this.f889a.getText().length());
                }
            } else {
                m582a(this.f906r);
                this.f906r = null;
            }
            this.f891c = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f907s != i) {
            if (i > 0) {
                this.f907s = i;
            } else {
                this.f907s = -1;
            }
            if (this.f891c) {
                m592a(this.f889a == null ? 0 : this.f889a.getText().length());
            }
        }
    }

    public void setEnabled(boolean z) {
        m581a((ViewGroup) this, z);
        super.setEnabled(z);
    }

    public void setError(final CharSequence charSequence) {
        boolean z = true;
        boolean z2 = C0679r.m1952y(this) && isEnabled() && (this.f890b == null || !TextUtils.equals(this.f890b.getText(), charSequence));
        this.f905q = charSequence;
        if (!this.f902n) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            z = false;
        }
        this.f904p = z;
        this.f890b.animate().cancel();
        if (this.f904p) {
            this.f890b.setText(charSequence);
            this.f890b.setVisibility(0);
            if (z2) {
                if (this.f890b.getAlpha() == 1.0f) {
                    this.f890b.setAlpha(0.0f);
                }
                this.f890b.animate().alpha(1.0f).setDuration(200).setInterpolator(C0215a.f918d).setListener(new C02092(this)).start();
            } else {
                this.f890b.setAlpha(1.0f);
            }
        } else if (this.f890b.getVisibility() == 0) {
            if (z2) {
                this.f890b.animate().alpha(0.0f).setDuration(200).setInterpolator(C0215a.f917c).setListener(new AnimatorListenerAdapter(this) {
                    final /* synthetic */ TextInputLayout f868b;

                    public final void onAnimationEnd(Animator animator) {
                        this.f868b.f890b.setText(charSequence);
                        this.f868b.f890b.setVisibility(4);
                    }
                }).start();
            } else {
                this.f890b.setText(charSequence);
                this.f890b.setVisibility(4);
            }
        }
        m588c();
        m593a(z2, false);
    }

    public void setErrorEnabled(boolean z) {
        boolean z2 = true;
        if (this.f902n != z) {
            if (this.f890b != null) {
                this.f890b.animate().cancel();
            }
            if (z) {
                this.f890b = new AppCompatTextView(getContext());
                this.f890b.setId(C0110f.textinput_error);
                if (this.f901m != null) {
                    this.f890b.setTypeface(this.f901m);
                }
                try {
                    C0765l.m2190a(this.f890b, this.f903o);
                    if (VERSION.SDK_INT < 23 || this.f890b.getTextColors().getDefaultColor() != -65281) {
                        z2 = false;
                    }
                } catch (Exception e) {
                }
                if (z2) {
                    C0765l.m2190a(this.f890b, C0778i.TextAppearance_AppCompat_Caption);
                    this.f890b.setTextColor(C0392a.getColor(getContext(), C0772c.error_color_material));
                }
                this.f890b.setVisibility(4);
                C0679r.m1934g(this.f890b);
                m583a(this.f890b, 0);
            } else {
                this.f904p = false;
                m588c();
                m582a(this.f890b);
                this.f890b = null;
            }
            this.f902n = z;
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f903o = i;
        if (this.f890b != null) {
            C0765l.m2190a(this.f890b, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f895g) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(ItemAnimator.FLAG_MOVED);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f884K = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f895g) {
            this.f895g = z;
            CharSequence hint = this.f889a.getHint();
            if (!this.f895g) {
                if (!TextUtils.isEmpty(this.f896h) && TextUtils.isEmpty(hint)) {
                    this.f889a.setHint(this.f896h);
                }
                setHintInternal(null);
            } else if (!TextUtils.isEmpty(hint)) {
                if (TextUtils.isEmpty(this.f896h)) {
                    setHint(hint);
                }
                this.f889a.setHint(null);
            }
            if (this.f889a != null) {
                m579a();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f892d.m637c(i);
        this.f882I = this.f892d.f985f;
        if (this.f889a != null) {
            m593a(false, false);
            m579a();
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f913y = charSequence;
        if (this.f914z != null) {
            this.f914z.setContentDescription(charSequence);
        }
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C0862b.m2514b(getContext(), i) : null);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f912x = drawable;
        if (this.f914z != null) {
            this.f914z.setImageDrawable(drawable);
        }
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (this.f911w != z) {
            this.f911w = z;
            if (!(z || !this.f874A || this.f889a == null)) {
                this.f889a.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f874A = false;
            m589d();
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f877D = colorStateList;
        this.f878E = true;
        m591f();
    }

    public void setPasswordVisibilityToggleTintMode(Mode mode) {
        this.f879F = mode;
        this.f880G = true;
        m591f();
    }

    public void setTypeface(Typeface typeface) {
        if ((this.f901m != null && !this.f901m.equals(typeface)) || (this.f901m == null && typeface != null)) {
            this.f901m = typeface;
            this.f892d.m629a(typeface);
            if (this.f906r != null) {
                this.f906r.setTypeface(typeface);
            }
            if (this.f890b != null) {
                this.f890b.setTypeface(typeface);
            }
        }
    }
}
