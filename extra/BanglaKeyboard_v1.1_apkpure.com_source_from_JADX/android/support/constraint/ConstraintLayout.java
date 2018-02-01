package android.support.constraint;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.constraint.C0102a.C0076a;
import android.support.constraint.C0104b.C0103a;
import android.support.constraint.p008a.p009a.C0081a.C0079b;
import android.support.constraint.p008a.p009a.C0081a.C0080c;
import android.support.constraint.p008a.p009a.C0084b;
import android.support.constraint.p008a.p009a.C0084b.C0083a;
import android.support.constraint.p008a.p009a.C0086c;
import android.support.constraint.p008a.p009a.C0088d;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintLayout extends ViewGroup {
    SparseArray<View> f211a = new SparseArray();
    C0086c f212b = new C0086c();
    private final ArrayList<C0084b> f213c = new ArrayList(100);
    private int f214d = 0;
    private int f215e = 0;
    private int f216f = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    private int f217g = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    private boolean f218h = true;
    private int f219i = 2;
    private C0102a f220j = null;

    public static class LayoutParams extends MarginLayoutParams {
        int f159A = 1;
        public float f160B = 0.0f;
        public float f161C = 0.0f;
        public int f162D = 0;
        public int f163E = 0;
        public int f164F = 0;
        public int f165G = 0;
        public int f166H = 0;
        public int f167I = 0;
        public int f168J = 0;
        public int f169K = 0;
        public int f170L = -1;
        public int f171M = -1;
        public int f172N = -1;
        boolean f173O = true;
        boolean f174P = true;
        boolean f175Q = false;
        boolean f176R = false;
        int f177S = -1;
        int f178T = -1;
        int f179U = -1;
        int f180V = -1;
        int f181W = -1;
        int f182X = -1;
        float f183Y = 0.5f;
        C0084b f184Z = new C0084b();
        public int f185a = -1;
        public int f186b = -1;
        public float f187c = -1.0f;
        public int f188d = -1;
        public int f189e = -1;
        public int f190f = -1;
        public int f191g = -1;
        public int f192h = -1;
        public int f193i = -1;
        public int f194j = -1;
        public int f195k = -1;
        public int f196l = -1;
        public int f197m = -1;
        public int f198n = -1;
        public int f199o = -1;
        public int f200p = -1;
        public int f201q = -1;
        public int f202r = -1;
        public int f203s = -1;
        public int f204t = -1;
        public int f205u = -1;
        public int f206v = -1;
        public float f207w = 0.5f;
        public float f208x = 0.5f;
        public String f209y = null;
        float f210z = 0.0f;

        public LayoutParams() {
            super(-2, -2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0103a.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0103a.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf) {
                    this.f188d = obtainStyledAttributes.getResourceId(index, this.f188d);
                    if (this.f188d == -1) {
                        this.f188d = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintLeft_toRightOf) {
                    this.f189e = obtainStyledAttributes.getResourceId(index, this.f189e);
                    if (this.f189e == -1) {
                        this.f189e = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintRight_toLeftOf) {
                    this.f190f = obtainStyledAttributes.getResourceId(index, this.f190f);
                    if (this.f190f == -1) {
                        this.f190f = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintRight_toRightOf) {
                    this.f191g = obtainStyledAttributes.getResourceId(index, this.f191g);
                    if (this.f191g == -1) {
                        this.f191g = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintTop_toTopOf) {
                    this.f192h = obtainStyledAttributes.getResourceId(index, this.f192h);
                    if (this.f192h == -1) {
                        this.f192h = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintTop_toBottomOf) {
                    this.f193i = obtainStyledAttributes.getResourceId(index, this.f193i);
                    if (this.f193i == -1) {
                        this.f193i = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintBottom_toTopOf) {
                    this.f194j = obtainStyledAttributes.getResourceId(index, this.f194j);
                    if (this.f194j == -1) {
                        this.f194j = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf) {
                    this.f195k = obtainStyledAttributes.getResourceId(index, this.f195k);
                    if (this.f195k == -1) {
                        this.f195k = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf) {
                    this.f196l = obtainStyledAttributes.getResourceId(index, this.f196l);
                    if (this.f196l == -1) {
                        this.f196l = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0103a.ConstraintLayout_Layout_layout_editor_absoluteX) {
                    this.f170L = obtainStyledAttributes.getDimensionPixelOffset(index, this.f170L);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_editor_absoluteY) {
                    this.f171M = obtainStyledAttributes.getDimensionPixelOffset(index, this.f171M);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintGuide_begin) {
                    this.f185a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f185a);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintGuide_end) {
                    this.f186b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f186b);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintGuide_percent) {
                    this.f187c = obtainStyledAttributes.getFloat(index, this.f187c);
                } else if (index == C0103a.ConstraintLayout_Layout_android_orientation) {
                    this.f172N = obtainStyledAttributes.getInt(index, this.f172N);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintStart_toEndOf) {
                    this.f197m = obtainStyledAttributes.getResourceId(index, this.f197m);
                    if (this.f197m == -1) {
                        this.f197m = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintStart_toStartOf) {
                    this.f198n = obtainStyledAttributes.getResourceId(index, this.f198n);
                    if (this.f198n == -1) {
                        this.f198n = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintEnd_toStartOf) {
                    this.f199o = obtainStyledAttributes.getResourceId(index, this.f199o);
                    if (this.f199o == -1) {
                        this.f199o = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintEnd_toEndOf) {
                    this.f200p = obtainStyledAttributes.getResourceId(index, this.f200p);
                    if (this.f200p == -1) {
                        this.f200p = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0103a.ConstraintLayout_Layout_layout_goneMarginLeft) {
                    this.f201q = obtainStyledAttributes.getDimensionPixelSize(index, this.f201q);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_goneMarginTop) {
                    this.f202r = obtainStyledAttributes.getDimensionPixelSize(index, this.f202r);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_goneMarginRight) {
                    this.f203s = obtainStyledAttributes.getDimensionPixelSize(index, this.f203s);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_goneMarginBottom) {
                    this.f204t = obtainStyledAttributes.getDimensionPixelSize(index, this.f204t);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_goneMarginStart) {
                    this.f205u = obtainStyledAttributes.getDimensionPixelSize(index, this.f205u);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_goneMarginEnd) {
                    this.f206v = obtainStyledAttributes.getDimensionPixelSize(index, this.f206v);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintHorizontal_bias) {
                    this.f207w = obtainStyledAttributes.getFloat(index, this.f207w);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintVertical_bias) {
                    this.f208x = obtainStyledAttributes.getFloat(index, this.f208x);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintDimensionRatio) {
                    this.f209y = obtainStyledAttributes.getString(index);
                    this.f210z = Float.NaN;
                    this.f159A = -1;
                    if (this.f209y != null) {
                        int length = this.f209y.length();
                        index = this.f209y.indexOf(44);
                        if (index <= 0 || index >= length - 1) {
                            index = 0;
                        } else {
                            String substring = this.f209y.substring(0, index);
                            if (substring.equalsIgnoreCase("W")) {
                                this.f159A = 0;
                            } else if (substring.equalsIgnoreCase("H")) {
                                this.f159A = 1;
                            }
                            index++;
                        }
                        int indexOf = this.f209y.indexOf(58);
                        String substring2;
                        if (indexOf < 0 || indexOf >= length - 1) {
                            substring2 = this.f209y.substring(index);
                            if (substring2.length() > 0) {
                                try {
                                    this.f210z = Float.parseFloat(substring2);
                                } catch (NumberFormatException e) {
                                }
                            }
                        } else {
                            substring2 = this.f209y.substring(index, indexOf);
                            String substring3 = this.f209y.substring(indexOf + 1);
                            if (substring2.length() > 0 && substring3.length() > 0) {
                                try {
                                    float parseFloat = Float.parseFloat(substring2);
                                    float parseFloat2 = Float.parseFloat(substring3);
                                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                        if (this.f159A == 1) {
                                            this.f210z = Math.abs(parseFloat2 / parseFloat);
                                        } else {
                                            this.f210z = Math.abs(parseFloat / parseFloat2);
                                        }
                                    }
                                } catch (NumberFormatException e2) {
                                }
                            }
                        }
                    }
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintHorizontal_weight) {
                    this.f160B = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintVertical_weight) {
                    this.f161C = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle) {
                    this.f162D = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintVertical_chainStyle) {
                    this.f163E = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintWidth_default) {
                    this.f164F = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintHeight_default) {
                    this.f165G = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintWidth_min) {
                    this.f166H = obtainStyledAttributes.getDimensionPixelSize(index, this.f166H);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintWidth_max) {
                    this.f168J = obtainStyledAttributes.getDimensionPixelSize(index, this.f168J);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintHeight_min) {
                    this.f167I = obtainStyledAttributes.getDimensionPixelSize(index, this.f167I);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_constraintHeight_max) {
                    this.f169K = obtainStyledAttributes.getDimensionPixelSize(index, this.f169K);
                } else if (!(index == C0103a.ConstraintLayout_Layout_layout_constraintLeft_creator || index == C0103a.ConstraintLayout_Layout_layout_constraintTop_creator || index == C0103a.ConstraintLayout_Layout_layout_constraintRight_creator || index == C0103a.ConstraintLayout_Layout_layout_constraintBottom_creator)) {
                    index = C0103a.ConstraintLayout_Layout_layout_constraintBaseline_creator;
                }
            }
            obtainStyledAttributes.recycle();
            m92a();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public final void m92a() {
            this.f176R = false;
            this.f173O = true;
            this.f174P = true;
            if (this.width == 0 || this.width == -1) {
                this.f173O = false;
            }
            if (this.height == 0 || this.height == -1) {
                this.f174P = false;
            }
            if (this.f187c != -1.0f || this.f185a != -1 || this.f186b != -1) {
                this.f176R = true;
                this.f173O = true;
                this.f174P = true;
                if (!(this.f184Z instanceof C0088d)) {
                    this.f184Z = new C0088d();
                }
                ((C0088d) this.f184Z).m163i(this.f172N);
            }
        }

        @TargetApi(17)
        public void resolveLayoutDirection(int i) {
            Object obj = 1;
            super.resolveLayoutDirection(i);
            this.f179U = -1;
            this.f180V = -1;
            this.f177S = -1;
            this.f178T = -1;
            this.f181W = -1;
            this.f182X = -1;
            this.f181W = this.f201q;
            this.f182X = this.f203s;
            this.f183Y = this.f207w;
            if (1 != getLayoutDirection()) {
                obj = null;
            }
            if (obj != null) {
                if (this.f197m != -1) {
                    this.f179U = this.f197m;
                } else if (this.f198n != -1) {
                    this.f180V = this.f198n;
                }
                if (this.f199o != -1) {
                    this.f178T = this.f199o;
                }
                if (this.f200p != -1) {
                    this.f177S = this.f200p;
                }
                if (this.f205u != -1) {
                    this.f182X = this.f205u;
                }
                if (this.f206v != -1) {
                    this.f181W = this.f206v;
                }
                this.f183Y = 1.0f - this.f207w;
            } else {
                if (this.f197m != -1) {
                    this.f178T = this.f197m;
                }
                if (this.f198n != -1) {
                    this.f177S = this.f198n;
                }
                if (this.f199o != -1) {
                    this.f179U = this.f199o;
                }
                if (this.f200p != -1) {
                    this.f180V = this.f200p;
                }
                if (this.f205u != -1) {
                    this.f181W = this.f205u;
                }
                if (this.f206v != -1) {
                    this.f182X = this.f206v;
                }
            }
            if (this.f199o == -1 && this.f200p == -1) {
                if (this.f190f != -1) {
                    this.f179U = this.f190f;
                } else if (this.f191g != -1) {
                    this.f180V = this.f191g;
                }
            }
            if (this.f198n != -1 || this.f197m != -1) {
                return;
            }
            if (this.f188d != -1) {
                this.f177S = this.f188d;
            } else if (this.f189e != -1) {
                this.f178T = this.f189e;
            }
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        m96a(null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m96a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m96a(attributeSet);
    }

    protected static LayoutParams m93a() {
        return new LayoutParams();
    }

    private final C0084b m94a(int i) {
        if (i == 0) {
            return this.f212b;
        }
        View view = (View) this.f211a.get(i);
        return view == this ? this.f212b : view == null ? null : ((LayoutParams) view.getLayoutParams()).f184Z;
    }

    private final C0084b m95a(View view) {
        return view == this ? this.f212b : view == null ? null : ((LayoutParams) view.getLayoutParams()).f184Z;
    }

    private void m96a(AttributeSet attributeSet) {
        this.f212b.f317K = this;
        this.f211a.put(getId(), this);
        this.f220j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0103a.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0103a.ConstraintLayout_Layout_android_minWidth) {
                    this.f214d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f214d);
                } else if (index == C0103a.ConstraintLayout_Layout_android_minHeight) {
                    this.f215e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f215e);
                } else if (index == C0103a.ConstraintLayout_Layout_android_maxWidth) {
                    this.f216f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f216f);
                } else if (index == C0103a.ConstraintLayout_Layout_android_maxHeight) {
                    this.f217g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f217g);
                } else if (index == C0103a.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f219i = obtainStyledAttributes.getInt(index, this.f219i);
                } else if (index == C0103a.ConstraintLayout_Layout_constraintSet) {
                    index = obtainStyledAttributes.getResourceId(index, 0);
                    this.f220j = new C0102a();
                    C0102a c0102a = this.f220j;
                    Context context = getContext();
                    XmlPullParser xml = context.getResources().getXml(index);
                    try {
                        for (index = xml.getEventType(); index != 1; index = xml.next()) {
                            switch (index) {
                                case 0:
                                    xml.getName();
                                    break;
                                case 2:
                                    String name = xml.getName();
                                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                    C0076a c0076a = new C0076a();
                                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(asAttributeSet, C0103a.ConstraintSet);
                                    C0102a.m224a(c0076a, obtainStyledAttributes2);
                                    obtainStyledAttributes2.recycle();
                                    if (name.equalsIgnoreCase("Guideline")) {
                                        c0076a.f247a = true;
                                    }
                                    c0102a.f425a.put(Integer.valueOf(c0076a.f250d), c0076a);
                                    break;
                                default:
                                    break;
                            }
                        }
                    } catch (XmlPullParserException e) {
                        e.printStackTrace();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f212b.ao = this.f219i;
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getMaxHeight() {
        return this.f217g;
    }

    public int getMaxWidth() {
        return this.f216f;
    }

    public int getMinHeight() {
        return this.f215e;
    }

    public int getMinWidth() {
        return this.f214d;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || layoutParams.f176R || isInEditMode) {
                C0084b c0084b = layoutParams.f184Z;
                int j = c0084b.m131j();
                int k = c0084b.m132k();
                childAt.layout(j, k, c0084b.m124f() + j, c0084b.m130i() + k);
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        C0084b a;
        int i5;
        View view;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f212b.m107a(paddingLeft);
        this.f212b.m113b(paddingTop);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        int paddingTop2 = getPaddingTop() + getPaddingBottom();
        int paddingLeft2 = getPaddingLeft() + getPaddingRight();
        int i6 = C0083a.f302a;
        int i7 = C0083a.f302a;
        getLayoutParams();
        switch (mode) {
            case Integer.MIN_VALUE:
                i3 = C0083a.f303b;
                break;
            case 0:
                i3 = C0083a.f303b;
                size = 0;
                break;
            case 1073741824:
                size = Math.min(this.f216f, size) - paddingLeft2;
                i3 = i6;
                break;
            default:
                size = 0;
                i3 = i6;
                break;
        }
        switch (mode2) {
            case Integer.MIN_VALUE:
                i4 = C0083a.f303b;
                break;
            case 0:
                i4 = C0083a.f303b;
                size2 = 0;
                break;
            case 1073741824:
                size2 = Math.min(this.f217g, size2) - paddingTop2;
                i4 = i7;
                break;
            default:
                size2 = 0;
                i4 = i7;
                break;
        }
        this.f212b.m123e(0);
        this.f212b.m125f(0);
        this.f212b.m127g(i3);
        this.f212b.m117c(size);
        this.f212b.m129h(i4);
        this.f212b.m120d(size2);
        this.f212b.m123e((this.f214d - getPaddingLeft()) - getPaddingRight());
        this.f212b.m125f((this.f215e - getPaddingTop()) - getPaddingBottom());
        if (this.f218h) {
            int childCount;
            View childAt;
            LayoutParams layoutParams;
            C0088d c0088d;
            float f;
            float f2;
            C0084b a2;
            LayoutParams layoutParams2;
            this.f218h = false;
            i7 = getChildCount();
            Object obj = null;
            i4 = 0;
            while (i4 < i7) {
                if (getChildAt(i4).isLayoutRequested()) {
                    obj = 1;
                    if (obj != null) {
                        this.f213c.clear();
                        if (this.f220j != null) {
                            this.f220j.m225a(this);
                        }
                        childCount = getChildCount();
                        this.f212b.m151x();
                        for (paddingLeft2 = 0; paddingLeft2 < childCount; paddingLeft2++) {
                            childAt = getChildAt(paddingLeft2);
                            a = m95a(childAt);
                            if (a != null) {
                                layoutParams = (LayoutParams) childAt.getLayoutParams();
                                a.mo30a();
                                a.f318L = childAt.getVisibility();
                                a.f317K = childAt;
                                this.f212b.m145a(a);
                                if (!(layoutParams.f174P && layoutParams.f173O)) {
                                    this.f213c.add(a);
                                }
                                if (layoutParams.f176R) {
                                    c0088d = (C0088d) a;
                                    if (layoutParams.f185a != -1) {
                                        c0088d.m164j(layoutParams.f185a);
                                    }
                                    if (layoutParams.f186b != -1) {
                                        c0088d.m165k(layoutParams.f186b);
                                    }
                                    if (layoutParams.f187c != -1.0f) {
                                        c0088d.m161a(layoutParams.f187c);
                                    }
                                } else if (layoutParams.f177S == -1 || layoutParams.f178T != -1 || layoutParams.f179U != -1 || layoutParams.f180V != -1 || layoutParams.f192h != -1 || layoutParams.f193i != -1 || layoutParams.f194j != -1 || layoutParams.f195k != -1 || layoutParams.f196l != -1 || layoutParams.f170L != -1 || layoutParams.f171M != -1 || layoutParams.width == -1 || layoutParams.height == -1) {
                                    mode2 = layoutParams.f177S;
                                    mode = layoutParams.f178T;
                                    i3 = layoutParams.f179U;
                                    size = layoutParams.f180V;
                                    i6 = layoutParams.f181W;
                                    i7 = layoutParams.f182X;
                                    f = layoutParams.f183Y;
                                    if (VERSION.SDK_INT < 17) {
                                        mode2 = layoutParams.f188d;
                                        mode = layoutParams.f189e;
                                        i3 = layoutParams.f190f;
                                        size = layoutParams.f191g;
                                        i6 = layoutParams.f201q;
                                        i7 = layoutParams.f203s;
                                        f = layoutParams.f207w;
                                        if (mode2 == -1 && mode == -1) {
                                            if (layoutParams.f198n != -1) {
                                                mode2 = layoutParams.f198n;
                                            } else if (layoutParams.f197m != -1) {
                                                mode = layoutParams.f197m;
                                            }
                                        }
                                        if (i3 == -1 && size == -1) {
                                            if (layoutParams.f199o != -1) {
                                                f2 = f;
                                                i5 = layoutParams.f199o;
                                                i4 = mode;
                                                mode = i7;
                                                i7 = mode2;
                                                mode2 = size;
                                            } else if (layoutParams.f200p != -1) {
                                                f2 = f;
                                                i5 = i3;
                                                i4 = mode;
                                                mode = i7;
                                                i7 = mode2;
                                                mode2 = layoutParams.f200p;
                                            }
                                            if (i7 == -1) {
                                                a2 = m94a(i7);
                                                if (a2 != null) {
                                                    a.m109a(C0080c.LEFT, a2, C0080c.LEFT, layoutParams.leftMargin, i6);
                                                }
                                            } else if (i4 != -1) {
                                                a2 = m94a(i4);
                                                if (a2 != null) {
                                                    a.m109a(C0080c.LEFT, a2, C0080c.RIGHT, layoutParams.leftMargin, i6);
                                                }
                                            }
                                            if (i5 == -1) {
                                                a2 = m94a(i5);
                                                if (a2 != null) {
                                                    a.m109a(C0080c.RIGHT, a2, C0080c.LEFT, layoutParams.rightMargin, mode);
                                                }
                                            } else if (mode2 != -1) {
                                                a2 = m94a(mode2);
                                                if (a2 != null) {
                                                    a.m109a(C0080c.RIGHT, a2, C0080c.RIGHT, layoutParams.rightMargin, mode);
                                                }
                                            }
                                            if (layoutParams.f192h == -1) {
                                                a2 = m94a(layoutParams.f192h);
                                                if (a2 != null) {
                                                    a.m109a(C0080c.TOP, a2, C0080c.TOP, layoutParams.topMargin, layoutParams.f202r);
                                                }
                                            } else if (layoutParams.f193i != -1) {
                                                a2 = m94a(layoutParams.f193i);
                                                if (a2 != null) {
                                                    a.m109a(C0080c.TOP, a2, C0080c.BOTTOM, layoutParams.topMargin, layoutParams.f202r);
                                                }
                                            }
                                            if (layoutParams.f194j == -1) {
                                                a2 = m94a(layoutParams.f194j);
                                                if (a2 != null) {
                                                    a.m109a(C0080c.BOTTOM, a2, C0080c.TOP, layoutParams.bottomMargin, layoutParams.f204t);
                                                }
                                            } else if (layoutParams.f195k != -1) {
                                                a2 = m94a(layoutParams.f195k);
                                                if (a2 != null) {
                                                    a.m109a(C0080c.BOTTOM, a2, C0080c.BOTTOM, layoutParams.bottomMargin, layoutParams.f204t);
                                                }
                                            }
                                            if (layoutParams.f196l != -1) {
                                                view = (View) this.f211a.get(layoutParams.f196l);
                                                a2 = m94a(layoutParams.f196l);
                                                if (!(a2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams))) {
                                                    layoutParams2 = (LayoutParams) view.getLayoutParams();
                                                    layoutParams.f175Q = true;
                                                    layoutParams2.f175Q = true;
                                                    a.mo35a(C0080c.BASELINE).m100a(a2.mo35a(C0080c.BASELINE), 0, -1, C0079b.f278b, 0, true);
                                                    a.mo35a(C0080c.TOP).m102c();
                                                    a.mo35a(C0080c.BOTTOM).m102c();
                                                }
                                            }
                                            if (f2 >= 0.0f && f2 != 0.5f) {
                                                a.f313G = f2;
                                            }
                                            if (layoutParams.f208x >= 0.0f && layoutParams.f208x != 0.5f) {
                                                a.f314H = layoutParams.f208x;
                                            }
                                            if (isInEditMode() && !(layoutParams.f170L == -1 && layoutParams.f171M == -1)) {
                                                a.m108a(layoutParams.f170L, layoutParams.f171M);
                                            }
                                            if (layoutParams.f173O) {
                                                a.m127g(C0083a.f302a);
                                                a.m117c(layoutParams.width);
                                            } else if (layoutParams.width != -1) {
                                                a.m127g(C0083a.f305d);
                                                a.mo35a(C0080c.LEFT).f294d = layoutParams.leftMargin;
                                                a.mo35a(C0080c.RIGHT).f294d = layoutParams.rightMargin;
                                            } else {
                                                a.m127g(C0083a.f304c);
                                                a.m117c(0);
                                            }
                                            if (layoutParams.f174P) {
                                                a.m129h(C0083a.f302a);
                                                a.m120d(layoutParams.height);
                                            } else if (layoutParams.height != -1) {
                                                a.m129h(C0083a.f305d);
                                                a.mo35a(C0080c.TOP).f294d = layoutParams.topMargin;
                                                a.mo35a(C0080c.BOTTOM).f294d = layoutParams.bottomMargin;
                                            } else {
                                                a.m129h(C0083a.f304c);
                                                a.m120d(0);
                                            }
                                            if (layoutParams.f209y != null) {
                                                a.m112a(layoutParams.f209y);
                                            }
                                            a.ab = layoutParams.f160B;
                                            a.ac = layoutParams.f161C;
                                            a.f330X = layoutParams.f162D;
                                            a.f331Y = layoutParams.f163E;
                                            i4 = layoutParams.f164F;
                                            i7 = layoutParams.f166H;
                                            size = layoutParams.f168J;
                                            a.f335c = i4;
                                            a.f337e = i7;
                                            a.f338f = size;
                                            i4 = layoutParams.f165G;
                                            i7 = layoutParams.f167I;
                                            size = layoutParams.f169K;
                                            a.f336d = i4;
                                            a.f339g = i7;
                                            a.f340h = size;
                                        }
                                    }
                                    f2 = f;
                                    i5 = i3;
                                    i4 = mode;
                                    mode = i7;
                                    i7 = mode2;
                                    mode2 = size;
                                    if (i7 == -1) {
                                        a2 = m94a(i7);
                                        if (a2 != null) {
                                            a.m109a(C0080c.LEFT, a2, C0080c.LEFT, layoutParams.leftMargin, i6);
                                        }
                                    } else if (i4 != -1) {
                                        a2 = m94a(i4);
                                        if (a2 != null) {
                                            a.m109a(C0080c.LEFT, a2, C0080c.RIGHT, layoutParams.leftMargin, i6);
                                        }
                                    }
                                    if (i5 == -1) {
                                        a2 = m94a(i5);
                                        if (a2 != null) {
                                            a.m109a(C0080c.RIGHT, a2, C0080c.LEFT, layoutParams.rightMargin, mode);
                                        }
                                    } else if (mode2 != -1) {
                                        a2 = m94a(mode2);
                                        if (a2 != null) {
                                            a.m109a(C0080c.RIGHT, a2, C0080c.RIGHT, layoutParams.rightMargin, mode);
                                        }
                                    }
                                    if (layoutParams.f192h == -1) {
                                        a2 = m94a(layoutParams.f192h);
                                        if (a2 != null) {
                                            a.m109a(C0080c.TOP, a2, C0080c.TOP, layoutParams.topMargin, layoutParams.f202r);
                                        }
                                    } else if (layoutParams.f193i != -1) {
                                        a2 = m94a(layoutParams.f193i);
                                        if (a2 != null) {
                                            a.m109a(C0080c.TOP, a2, C0080c.BOTTOM, layoutParams.topMargin, layoutParams.f202r);
                                        }
                                    }
                                    if (layoutParams.f194j == -1) {
                                        a2 = m94a(layoutParams.f194j);
                                        if (a2 != null) {
                                            a.m109a(C0080c.BOTTOM, a2, C0080c.TOP, layoutParams.bottomMargin, layoutParams.f204t);
                                        }
                                    } else if (layoutParams.f195k != -1) {
                                        a2 = m94a(layoutParams.f195k);
                                        if (a2 != null) {
                                            a.m109a(C0080c.BOTTOM, a2, C0080c.BOTTOM, layoutParams.bottomMargin, layoutParams.f204t);
                                        }
                                    }
                                    if (layoutParams.f196l != -1) {
                                        view = (View) this.f211a.get(layoutParams.f196l);
                                        a2 = m94a(layoutParams.f196l);
                                        layoutParams2 = (LayoutParams) view.getLayoutParams();
                                        layoutParams.f175Q = true;
                                        layoutParams2.f175Q = true;
                                        a.mo35a(C0080c.BASELINE).m100a(a2.mo35a(C0080c.BASELINE), 0, -1, C0079b.f278b, 0, true);
                                        a.mo35a(C0080c.TOP).m102c();
                                        a.mo35a(C0080c.BOTTOM).m102c();
                                    }
                                    a.f313G = f2;
                                    a.f314H = layoutParams.f208x;
                                    a.m108a(layoutParams.f170L, layoutParams.f171M);
                                    if (layoutParams.f173O) {
                                        a.m127g(C0083a.f302a);
                                        a.m117c(layoutParams.width);
                                    } else if (layoutParams.width != -1) {
                                        a.m127g(C0083a.f304c);
                                        a.m117c(0);
                                    } else {
                                        a.m127g(C0083a.f305d);
                                        a.mo35a(C0080c.LEFT).f294d = layoutParams.leftMargin;
                                        a.mo35a(C0080c.RIGHT).f294d = layoutParams.rightMargin;
                                    }
                                    if (layoutParams.f174P) {
                                        a.m129h(C0083a.f302a);
                                        a.m120d(layoutParams.height);
                                    } else if (layoutParams.height != -1) {
                                        a.m129h(C0083a.f304c);
                                        a.m120d(0);
                                    } else {
                                        a.m129h(C0083a.f305d);
                                        a.mo35a(C0080c.TOP).f294d = layoutParams.topMargin;
                                        a.mo35a(C0080c.BOTTOM).f294d = layoutParams.bottomMargin;
                                    }
                                    if (layoutParams.f209y != null) {
                                        a.m112a(layoutParams.f209y);
                                    }
                                    a.ab = layoutParams.f160B;
                                    a.ac = layoutParams.f161C;
                                    a.f330X = layoutParams.f162D;
                                    a.f331Y = layoutParams.f163E;
                                    i4 = layoutParams.f164F;
                                    i7 = layoutParams.f166H;
                                    size = layoutParams.f168J;
                                    a.f335c = i4;
                                    a.f337e = i7;
                                    a.f338f = size;
                                    i4 = layoutParams.f165G;
                                    i7 = layoutParams.f167I;
                                    size = layoutParams.f169K;
                                    a.f336d = i4;
                                    a.f339g = i7;
                                    a.f340h = size;
                                }
                            }
                        }
                    }
                } else {
                    i4++;
                }
            }
            if (obj != null) {
                this.f213c.clear();
                if (this.f220j != null) {
                    this.f220j.m225a(this);
                }
                childCount = getChildCount();
                this.f212b.m151x();
                for (paddingLeft2 = 0; paddingLeft2 < childCount; paddingLeft2++) {
                    childAt = getChildAt(paddingLeft2);
                    a = m95a(childAt);
                    if (a != null) {
                        layoutParams = (LayoutParams) childAt.getLayoutParams();
                        a.mo30a();
                        a.f318L = childAt.getVisibility();
                        a.f317K = childAt;
                        this.f212b.m145a(a);
                        this.f213c.add(a);
                        if (layoutParams.f176R) {
                            c0088d = (C0088d) a;
                            if (layoutParams.f185a != -1) {
                                c0088d.m164j(layoutParams.f185a);
                            }
                            if (layoutParams.f186b != -1) {
                                c0088d.m165k(layoutParams.f186b);
                            }
                            if (layoutParams.f187c != -1.0f) {
                                c0088d.m161a(layoutParams.f187c);
                            }
                        } else {
                            if (layoutParams.f177S == -1) {
                            }
                            mode2 = layoutParams.f177S;
                            mode = layoutParams.f178T;
                            i3 = layoutParams.f179U;
                            size = layoutParams.f180V;
                            i6 = layoutParams.f181W;
                            i7 = layoutParams.f182X;
                            f = layoutParams.f183Y;
                            if (VERSION.SDK_INT < 17) {
                                mode2 = layoutParams.f188d;
                                mode = layoutParams.f189e;
                                i3 = layoutParams.f190f;
                                size = layoutParams.f191g;
                                i6 = layoutParams.f201q;
                                i7 = layoutParams.f203s;
                                f = layoutParams.f207w;
                                if (layoutParams.f198n != -1) {
                                    mode2 = layoutParams.f198n;
                                } else if (layoutParams.f197m != -1) {
                                    mode = layoutParams.f197m;
                                }
                                if (layoutParams.f199o != -1) {
                                    f2 = f;
                                    i5 = layoutParams.f199o;
                                    i4 = mode;
                                    mode = i7;
                                    i7 = mode2;
                                    mode2 = size;
                                } else if (layoutParams.f200p != -1) {
                                    f2 = f;
                                    i5 = i3;
                                    i4 = mode;
                                    mode = i7;
                                    i7 = mode2;
                                    mode2 = layoutParams.f200p;
                                }
                                if (i7 == -1) {
                                    a2 = m94a(i7);
                                    if (a2 != null) {
                                        a.m109a(C0080c.LEFT, a2, C0080c.LEFT, layoutParams.leftMargin, i6);
                                    }
                                } else if (i4 != -1) {
                                    a2 = m94a(i4);
                                    if (a2 != null) {
                                        a.m109a(C0080c.LEFT, a2, C0080c.RIGHT, layoutParams.leftMargin, i6);
                                    }
                                }
                                if (i5 == -1) {
                                    a2 = m94a(i5);
                                    if (a2 != null) {
                                        a.m109a(C0080c.RIGHT, a2, C0080c.LEFT, layoutParams.rightMargin, mode);
                                    }
                                } else if (mode2 != -1) {
                                    a2 = m94a(mode2);
                                    if (a2 != null) {
                                        a.m109a(C0080c.RIGHT, a2, C0080c.RIGHT, layoutParams.rightMargin, mode);
                                    }
                                }
                                if (layoutParams.f192h == -1) {
                                    a2 = m94a(layoutParams.f192h);
                                    if (a2 != null) {
                                        a.m109a(C0080c.TOP, a2, C0080c.TOP, layoutParams.topMargin, layoutParams.f202r);
                                    }
                                } else if (layoutParams.f193i != -1) {
                                    a2 = m94a(layoutParams.f193i);
                                    if (a2 != null) {
                                        a.m109a(C0080c.TOP, a2, C0080c.BOTTOM, layoutParams.topMargin, layoutParams.f202r);
                                    }
                                }
                                if (layoutParams.f194j == -1) {
                                    a2 = m94a(layoutParams.f194j);
                                    if (a2 != null) {
                                        a.m109a(C0080c.BOTTOM, a2, C0080c.TOP, layoutParams.bottomMargin, layoutParams.f204t);
                                    }
                                } else if (layoutParams.f195k != -1) {
                                    a2 = m94a(layoutParams.f195k);
                                    if (a2 != null) {
                                        a.m109a(C0080c.BOTTOM, a2, C0080c.BOTTOM, layoutParams.bottomMargin, layoutParams.f204t);
                                    }
                                }
                                if (layoutParams.f196l != -1) {
                                    view = (View) this.f211a.get(layoutParams.f196l);
                                    a2 = m94a(layoutParams.f196l);
                                    layoutParams2 = (LayoutParams) view.getLayoutParams();
                                    layoutParams.f175Q = true;
                                    layoutParams2.f175Q = true;
                                    a.mo35a(C0080c.BASELINE).m100a(a2.mo35a(C0080c.BASELINE), 0, -1, C0079b.f278b, 0, true);
                                    a.mo35a(C0080c.TOP).m102c();
                                    a.mo35a(C0080c.BOTTOM).m102c();
                                }
                                a.f313G = f2;
                                a.f314H = layoutParams.f208x;
                                a.m108a(layoutParams.f170L, layoutParams.f171M);
                                if (layoutParams.f173O) {
                                    a.m127g(C0083a.f302a);
                                    a.m117c(layoutParams.width);
                                } else if (layoutParams.width != -1) {
                                    a.m127g(C0083a.f305d);
                                    a.mo35a(C0080c.LEFT).f294d = layoutParams.leftMargin;
                                    a.mo35a(C0080c.RIGHT).f294d = layoutParams.rightMargin;
                                } else {
                                    a.m127g(C0083a.f304c);
                                    a.m117c(0);
                                }
                                if (layoutParams.f174P) {
                                    a.m129h(C0083a.f302a);
                                    a.m120d(layoutParams.height);
                                } else if (layoutParams.height != -1) {
                                    a.m129h(C0083a.f305d);
                                    a.mo35a(C0080c.TOP).f294d = layoutParams.topMargin;
                                    a.mo35a(C0080c.BOTTOM).f294d = layoutParams.bottomMargin;
                                } else {
                                    a.m129h(C0083a.f304c);
                                    a.m120d(0);
                                }
                                if (layoutParams.f209y != null) {
                                    a.m112a(layoutParams.f209y);
                                }
                                a.ab = layoutParams.f160B;
                                a.ac = layoutParams.f161C;
                                a.f330X = layoutParams.f162D;
                                a.f331Y = layoutParams.f163E;
                                i4 = layoutParams.f164F;
                                i7 = layoutParams.f166H;
                                size = layoutParams.f168J;
                                a.f335c = i4;
                                a.f337e = i7;
                                a.f338f = size;
                                i4 = layoutParams.f165G;
                                i7 = layoutParams.f167I;
                                size = layoutParams.f169K;
                                a.f336d = i4;
                                a.f339g = i7;
                                a.f340h = size;
                            }
                            f2 = f;
                            i5 = i3;
                            i4 = mode;
                            mode = i7;
                            i7 = mode2;
                            mode2 = size;
                            if (i7 == -1) {
                                a2 = m94a(i7);
                                if (a2 != null) {
                                    a.m109a(C0080c.LEFT, a2, C0080c.LEFT, layoutParams.leftMargin, i6);
                                }
                            } else if (i4 != -1) {
                                a2 = m94a(i4);
                                if (a2 != null) {
                                    a.m109a(C0080c.LEFT, a2, C0080c.RIGHT, layoutParams.leftMargin, i6);
                                }
                            }
                            if (i5 == -1) {
                                a2 = m94a(i5);
                                if (a2 != null) {
                                    a.m109a(C0080c.RIGHT, a2, C0080c.LEFT, layoutParams.rightMargin, mode);
                                }
                            } else if (mode2 != -1) {
                                a2 = m94a(mode2);
                                if (a2 != null) {
                                    a.m109a(C0080c.RIGHT, a2, C0080c.RIGHT, layoutParams.rightMargin, mode);
                                }
                            }
                            if (layoutParams.f192h == -1) {
                                a2 = m94a(layoutParams.f192h);
                                if (a2 != null) {
                                    a.m109a(C0080c.TOP, a2, C0080c.TOP, layoutParams.topMargin, layoutParams.f202r);
                                }
                            } else if (layoutParams.f193i != -1) {
                                a2 = m94a(layoutParams.f193i);
                                if (a2 != null) {
                                    a.m109a(C0080c.TOP, a2, C0080c.BOTTOM, layoutParams.topMargin, layoutParams.f202r);
                                }
                            }
                            if (layoutParams.f194j == -1) {
                                a2 = m94a(layoutParams.f194j);
                                if (a2 != null) {
                                    a.m109a(C0080c.BOTTOM, a2, C0080c.TOP, layoutParams.bottomMargin, layoutParams.f204t);
                                }
                            } else if (layoutParams.f195k != -1) {
                                a2 = m94a(layoutParams.f195k);
                                if (a2 != null) {
                                    a.m109a(C0080c.BOTTOM, a2, C0080c.BOTTOM, layoutParams.bottomMargin, layoutParams.f204t);
                                }
                            }
                            if (layoutParams.f196l != -1) {
                                view = (View) this.f211a.get(layoutParams.f196l);
                                a2 = m94a(layoutParams.f196l);
                                layoutParams2 = (LayoutParams) view.getLayoutParams();
                                layoutParams.f175Q = true;
                                layoutParams2.f175Q = true;
                                a.mo35a(C0080c.BASELINE).m100a(a2.mo35a(C0080c.BASELINE), 0, -1, C0079b.f278b, 0, true);
                                a.mo35a(C0080c.TOP).m102c();
                                a.mo35a(C0080c.BOTTOM).m102c();
                            }
                            a.f313G = f2;
                            a.f314H = layoutParams.f208x;
                            a.m108a(layoutParams.f170L, layoutParams.f171M);
                            if (layoutParams.f173O) {
                                a.m127g(C0083a.f302a);
                                a.m117c(layoutParams.width);
                            } else if (layoutParams.width != -1) {
                                a.m127g(C0083a.f304c);
                                a.m117c(0);
                            } else {
                                a.m127g(C0083a.f305d);
                                a.mo35a(C0080c.LEFT).f294d = layoutParams.leftMargin;
                                a.mo35a(C0080c.RIGHT).f294d = layoutParams.rightMargin;
                            }
                            if (layoutParams.f174P) {
                                a.m129h(C0083a.f302a);
                                a.m120d(layoutParams.height);
                            } else if (layoutParams.height != -1) {
                                a.m129h(C0083a.f304c);
                                a.m120d(0);
                            } else {
                                a.m129h(C0083a.f305d);
                                a.mo35a(C0080c.TOP).f294d = layoutParams.topMargin;
                                a.mo35a(C0080c.BOTTOM).f294d = layoutParams.bottomMargin;
                            }
                            if (layoutParams.f209y != null) {
                                a.m112a(layoutParams.f209y);
                            }
                            a.ab = layoutParams.f160B;
                            a.ac = layoutParams.f161C;
                            a.f330X = layoutParams.f162D;
                            a.f331Y = layoutParams.f163E;
                            i4 = layoutParams.f164F;
                            i7 = layoutParams.f166H;
                            size = layoutParams.f168J;
                            a.f335c = i4;
                            a.f337e = i7;
                            a.f338f = size;
                            i4 = layoutParams.f165G;
                            i7 = layoutParams.f167I;
                            size = layoutParams.f169K;
                            a.f336d = i4;
                            a.f339g = i7;
                            a.f340h = size;
                        }
                    }
                }
            }
        }
        mode2 = getPaddingTop() + getPaddingBottom();
        paddingTop2 = getPaddingLeft() + getPaddingRight();
        paddingLeft2 = getChildCount();
        for (i6 = 0; i6 < paddingLeft2; i6++) {
            Object obj2;
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                C0084b c0084b = layoutParams3.f184Z;
                if (!layoutParams3.f176R) {
                    size = layoutParams3.width;
                    i3 = layoutParams3.height;
                    Object obj3 = (layoutParams3.f173O || layoutParams3.f174P || ((!layoutParams3.f173O && layoutParams3.f164F == 1) || layoutParams3.width == -1 || (!layoutParams3.f174P && (layoutParams3.f165G == 1 || layoutParams3.height == -1)))) ? 1 : null;
                    Object obj4 = null;
                    Object obj5 = null;
                    if (obj3 != null) {
                        if (size == 0 || size == -1) {
                            obj2 = 1;
                            mode = getChildMeasureSpec(i, paddingTop2, -2);
                        } else {
                            mode = getChildMeasureSpec(i, paddingTop2, size);
                            obj2 = null;
                        }
                        if (i3 == 0 || i3 == -1) {
                            i4 = getChildMeasureSpec(i2, mode2, -2);
                            obj5 = 1;
                        } else {
                            i4 = getChildMeasureSpec(i2, mode2, i3);
                        }
                        childAt2.measure(mode, i4);
                        i3 = childAt2.getMeasuredWidth();
                        Object obj6 = obj2;
                        size = childAt2.getMeasuredHeight();
                        obj4 = obj6;
                    } else {
                        int i8 = i3;
                        i3 = size;
                        size = i8;
                    }
                    c0084b.m117c(i3);
                    c0084b.m120d(size);
                    if (obj4 != null) {
                        c0084b.f311D = i3;
                    }
                    if (obj5 != null) {
                        c0084b.f312E = size;
                    }
                    if (layoutParams3.f175Q) {
                        size2 = childAt2.getBaseline();
                        if (size2 != -1) {
                            c0084b.f308A = size2;
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            this.f212b.mo34w();
        }
        paddingTop2 = 0;
        int size3 = this.f213c.size();
        i5 = paddingTop + getPaddingBottom();
        paddingLeft += getPaddingRight();
        if (size3 > 0) {
            Object obj7 = null;
            obj2 = this.f212b.f315I == C0083a.f303b ? 1 : null;
            Object obj8 = this.f212b.f316J == C0083a.f303b ? 1 : null;
            paddingLeft2 = 0;
            while (paddingLeft2 < size3) {
                a = (C0084b) this.f213c.get(paddingLeft2);
                if (!(a instanceof C0088d)) {
                    view = (View) a.f317K;
                    if (!(view == null || view.getVisibility() == 8)) {
                        Object obj9;
                        LayoutParams layoutParams4 = (LayoutParams) view.getLayoutParams();
                        view.measure(layoutParams4.width == -2 ? getChildMeasureSpec(i, paddingLeft, layoutParams4.width) : MeasureSpec.makeMeasureSpec(a.m124f(), 1073741824), layoutParams4.height == -2 ? getChildMeasureSpec(i2, i5, layoutParams4.height) : MeasureSpec.makeMeasureSpec(a.m130i(), 1073741824));
                        i6 = view.getMeasuredWidth();
                        mode = view.getMeasuredHeight();
                        if (i6 != a.m124f()) {
                            a.m117c(i6);
                            if (obj2 != null && a.m137p() > this.f212b.m124f()) {
                                this.f212b.m117c(Math.max(this.f214d, a.m137p() + a.mo35a(C0080c.RIGHT).m101b()));
                            }
                            obj9 = 1;
                        } else {
                            obj9 = obj7;
                        }
                        if (mode != a.m130i()) {
                            a.m120d(mode);
                            if (obj8 != null && a.m138q() > this.f212b.m130i()) {
                                this.f212b.m120d(Math.max(this.f215e, a.m138q() + a.mo35a(C0080c.BOTTOM).m101b()));
                            }
                            obj9 = 1;
                        }
                        if (layoutParams4.f175Q) {
                            i7 = view.getBaseline();
                            if (!(i7 == -1 || i7 == a.f308A)) {
                                a.f308A = i7;
                                obj9 = 1;
                            }
                        }
                        if (VERSION.SDK_INT >= 11) {
                            size2 = combineMeasuredStates(paddingTop2, view.getMeasuredState());
                            obj7 = obj9;
                        } else {
                            obj7 = obj9;
                            size2 = paddingTop2;
                        }
                        paddingLeft2++;
                        paddingTop2 = size2;
                    }
                }
                size2 = paddingTop2;
                paddingLeft2++;
                paddingTop2 = size2;
            }
            if (obj7 != null) {
                this.f212b.mo34w();
            }
        }
        size2 = this.f212b.m124f() + paddingLeft;
        i4 = this.f212b.m130i() + i5;
        if (VERSION.SDK_INT >= 11) {
            size2 = Math.min(this.f216f, resolveSizeAndState(size2, i, paddingTop2)) & 16777215;
            i4 = Math.min(this.f217g, resolveSizeAndState(i4, i2, paddingTop2 << 16)) & 16777215;
            if (this.f212b.ap) {
                size2 |= 16777216;
            }
            if (this.f212b.aq) {
                i4 |= 16777216;
            }
            setMeasuredDimension(size2, i4);
            return;
        }
        setMeasuredDimension(size2, i4);
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0084b a = m95a(view);
        if ((view instanceof Guideline) && !(a instanceof C0088d)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f184Z = new C0088d();
            layoutParams.f176R = true;
            ((C0088d) layoutParams.f184Z).m163i(layoutParams.f172N);
        }
        this.f211a.put(view.getId(), view);
        this.f218h = true;
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f211a.remove(view.getId());
        this.f212b.m148b(m95a(view));
        this.f218h = true;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f218h = true;
    }

    public void setConstraintSet(C0102a c0102a) {
        this.f220j = c0102a;
    }

    public void setId(int i) {
        this.f211a.remove(getId());
        super.setId(i);
        this.f211a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f217g) {
            this.f217g = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f216f) {
            this.f216f = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f215e) {
            this.f215e = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f214d) {
            this.f214d = i;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f212b.ao = i;
    }
}
