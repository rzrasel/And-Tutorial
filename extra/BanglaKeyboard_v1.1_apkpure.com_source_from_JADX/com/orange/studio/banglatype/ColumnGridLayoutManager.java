package com.orange.studio.banglatype;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Recycler;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

public class ColumnGridLayoutManager extends GridLayoutManager {
    protected int f7900a;
    protected WeakReference<RecyclerView> f7901b = new WeakReference(null);

    protected class C1675a implements OnGlobalLayoutListener {
        final /* synthetic */ ColumnGridLayoutManager f7898a;
        private RecyclerView f7899b;

        public C1675a(ColumnGridLayoutManager columnGridLayoutManager, RecyclerView recyclerView) {
            this.f7898a = columnGridLayoutManager;
            this.f7899b = recyclerView;
        }

        public final void onGlobalLayout() {
            View view = this.f7899b;
            if (VERSION.SDK_INT < 16) {
                view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            ((GridLayoutManager) this.f7899b.getLayoutManager()).setSpanCount(this.f7898a.m7147a(this.f7898a.f7900a));
        }
    }

    public ColumnGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    protected final int m7147a(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f7901b.get();
        if (recyclerView == null) {
            return i;
        }
        if (recyclerView.getWidth() == 0) {
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new C1675a(this, recyclerView));
            return i;
        }
        Context context = recyclerView.getContext();
        if (bt.m7427b(context)) {
            int width = recyclerView.getWidth();
            int d = bt.m7430d(context) / i;
            int i2 = 0;
            int i3 = Integer.MAX_VALUE;
            int i4 = i;
            int i5 = Integer.MAX_VALUE;
            while (i2 < 9) {
                int abs = Math.abs((width / (i + i2)) - d);
                if (abs < i5) {
                    i4 = i + i2;
                    i5 = abs;
                } else if (abs > i3) {
                    break;
                }
                i2++;
                i3 = abs;
            }
            return i4;
        }
        recyclerView.getWidth();
        return i;
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f7901b = new WeakReference(recyclerView);
        setSpanCount(m7147a(this.f7900a));
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        this.f7901b = new WeakReference(null);
    }

    public void setSpanCount(int i) {
        super.setSpanCount(i);
        this.f7900a = i;
    }
}
