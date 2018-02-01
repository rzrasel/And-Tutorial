package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.C0131h.C0949b;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements C0949b, C0119p, OnItemClickListener {
    private static final int[] f2959a = new int[]{16842964, 16843049};
    private C0131h f2960b;
    private int f2961c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, f2959a, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setDivider(obtainStyledAttributes.getDrawable(1));
        }
        obtainStyledAttributes.recycle();
    }

    public final int getWindowAnimations() {
        return this.f2961c;
    }

    public final void initialize(C0131h c0131h) {
        this.f2960b = c0131h;
    }

    public final boolean invokeItem(C0967j c0967j) {
        return this.f2960b.m257a((MenuItem) c0967j, null, 0);
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        invokeItem((C0967j) getAdapter().getItem(i));
    }
}
