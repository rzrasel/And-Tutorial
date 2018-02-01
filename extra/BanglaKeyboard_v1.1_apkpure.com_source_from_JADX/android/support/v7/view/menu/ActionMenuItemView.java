package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.p021a.C0780a.C0779j;
import android.support.v7.view.menu.C0119p.C0117a;
import android.support.v7.view.menu.C0131h.C0949b;
import android.support.v7.widget.ActionMenuView.ActionMenuChildView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.ForwardingListener;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;

public class ActionMenuItemView extends AppCompatTextView implements C0117a, ActionMenuChildView, OnClickListener {
    C0967j f2948a;
    C0949b f2949b;
    C0948b f2950c;
    private CharSequence f2951d;
    private Drawable f2952e;
    private ForwardingListener f2953f;
    private boolean f2954g;
    private boolean f2955h;
    private int f2956i;
    private int f2957j;
    private int f2958k;

    private class C0947a extends ForwardingListener {
        final /* synthetic */ ActionMenuItemView f2947a;

        public C0947a(ActionMenuItemView actionMenuItemView) {
            this.f2947a = actionMenuItemView;
            super(actionMenuItemView);
        }

        public final C0959s getPopup() {
            return this.f2947a.f2950c != null ? this.f2947a.f2950c.getPopup() : null;
        }

        protected final boolean onForwardingStarted() {
            if (this.f2947a.f2949b == null || !this.f2947a.f2949b.invokeItem(this.f2947a.f2948a)) {
                return false;
            }
            C0959s popup = getPopup();
            return popup != null && popup.isShowing();
        }
    }

    public static abstract class C0948b {
        public abstract C0959s getPopup();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f2954g = m2758c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0779j.ActionMenuItemView, i, 0);
        this.f2956i = obtainStyledAttributes.getDimensionPixelSize(C0779j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f2958k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2957j = -1;
        setSaveEnabled(false);
    }

    private boolean m2758c() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || ((i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2759d() {
        /*
        r6 = this;
        r3 = 0;
        r1 = 1;
        r2 = 0;
        r0 = r6.f2951d;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0052;
    L_0x000b:
        r0 = r1;
    L_0x000c:
        r4 = r6.f2952e;
        if (r4 == 0) goto L_0x0024;
    L_0x0010:
        r4 = r6.f2948a;
        r4 = r4.f3078c;
        r4 = r4 & 4;
        r5 = 4;
        if (r4 != r5) goto L_0x0054;
    L_0x0019:
        r4 = r1;
    L_0x001a:
        if (r4 == 0) goto L_0x0025;
    L_0x001c:
        r4 = r6.f2954g;
        if (r4 != 0) goto L_0x0024;
    L_0x0020:
        r4 = r6.f2955h;
        if (r4 == 0) goto L_0x0025;
    L_0x0024:
        r2 = r1;
    L_0x0025:
        r1 = r0 & r2;
        if (r1 == 0) goto L_0x0056;
    L_0x0029:
        r0 = r6.f2951d;
    L_0x002b:
        r6.setText(r0);
        r0 = r6.f2948a;
        r0 = r0.getContentDescription();
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 == 0) goto L_0x005f;
    L_0x003a:
        if (r1 == 0) goto L_0x0058;
    L_0x003c:
        r0 = r3;
    L_0x003d:
        r6.setContentDescription(r0);
    L_0x0040:
        r0 = r6.f2948a;
        r0 = r0.getTooltipText();
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 == 0) goto L_0x006a;
    L_0x004c:
        if (r1 == 0) goto L_0x0063;
    L_0x004e:
        android.support.v7.widget.TooltipCompat.setTooltipText(r6, r3);
    L_0x0051:
        return;
    L_0x0052:
        r0 = r2;
        goto L_0x000c;
    L_0x0054:
        r4 = r2;
        goto L_0x001a;
    L_0x0056:
        r0 = r3;
        goto L_0x002b;
    L_0x0058:
        r0 = r6.f2948a;
        r0 = r0.getTitle();
        goto L_0x003d;
    L_0x005f:
        r6.setContentDescription(r0);
        goto L_0x0040;
    L_0x0063:
        r0 = r6.f2948a;
        r3 = r0.getTitle();
        goto L_0x004e;
    L_0x006a:
        android.support.v7.widget.TooltipCompat.setTooltipText(r6, r0);
        goto L_0x0051;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.ActionMenuItemView.d():void");
    }

    public final void mo42a(C0967j c0967j) {
        this.f2948a = c0967j;
        setIcon(c0967j.getIcon());
        setTitle(c0967j.m2812a((C0117a) this));
        setId(c0967j.getItemId());
        setVisibility(c0967j.isVisible() ? 0 : 8);
        setEnabled(c0967j.isEnabled());
        if (c0967j.hasSubMenu() && this.f2953f == null) {
            this.f2953f = new C0947a(this);
        }
    }

    public final boolean mo43a() {
        return true;
    }

    public final boolean m2762b() {
        return !TextUtils.isEmpty(getText());
    }

    public C0967j getItemData() {
        return this.f2948a;
    }

    public boolean needsDividerAfter() {
        return m2762b();
    }

    public boolean needsDividerBefore() {
        return m2762b() && this.f2948a.getIcon() == null;
    }

    public void onClick(View view) {
        if (this.f2949b != null) {
            this.f2949b.invokeItem(this.f2948a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2954g = m2758c();
        m2759d();
    }

    protected void onMeasure(int i, int i2) {
        boolean b = m2762b();
        if (b && this.f2957j >= 0) {
            super.setPadding(this.f2957j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        size = mode == Integer.MIN_VALUE ? Math.min(size, this.f2956i) : this.f2956i;
        if (mode != 1073741824 && this.f2956i > 0 && measuredWidth < size) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }
        if (!b && this.f2952e != null) {
            super.setPadding((getMeasuredWidth() - this.f2952e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.f2948a.hasSubMenu() && this.f2953f != null && this.f2953f.onTouch(this, motionEvent)) ? true : super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f2955h != z) {
            this.f2955h = z;
            if (this.f2948a != null) {
                this.f2948a.f3077b.m269g();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2952e = drawable;
        if (drawable != null) {
            float f;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.f2958k) {
                f = ((float) this.f2958k) / ((float) intrinsicWidth);
                intrinsicWidth = this.f2958k;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.f2958k) {
                f = ((float) this.f2958k) / ((float) intrinsicHeight);
                intrinsicHeight = this.f2958k;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m2759d();
    }

    public void setItemInvoker(C0949b c0949b) {
        this.f2949b = c0949b;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f2957j = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0948b c0948b) {
        this.f2950c = c0948b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2951d = charSequence;
        m2759d();
    }
}
