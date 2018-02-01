package com.orange.studio.banglatype;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.State;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.AttributeSet;
import android.view.View;

public class SelectiveDividerItemDecoration extends ItemDecoration {
    private Drawable f7937a;
    private int f7938b;
    private boolean f7939c;
    private boolean f7940d;
    private int f7941e;
    private int f7942f;

    public interface C1681a {
        boolean m7162a();
    }

    public SelectiveDividerItemDecoration(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843284});
        this.f7937a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        if (i == 0 || i == 1) {
            this.f7938b = i;
            this.f7940d = true;
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.material_padding);
            this.f7942f = dimensionPixelOffset;
            this.f7941e = dimensionPixelOffset;
            return;
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private boolean m7163a(View view, RecyclerView recyclerView) {
        ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        return childViewHolder instanceof C1681a ? ((C1681a) childViewHolder).m7162a() : this.f7939c;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        int i;
        int i2;
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        recyclerView.getAdapter().getItemCount();
        if (childLayoutPosition == (this.f7940d ? 1 : 0)) {
            i = this.f7941e;
            i2 = 0;
        } else if (childLayoutPosition == recyclerView.getAdapter().getItemCount() - 1) {
            i2 = this.f7941e;
            i = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        if (childLayoutPosition > 0 && m7163a(view, recyclerView)) {
            i += this.f7942f;
            if (this.f7938b == 1) {
                rect.set(0, this.f7937a.getIntrinsicHeight(), 0, 0);
                rect.set(0, i + this.f7937a.getIntrinsicHeight(), 0, i2);
                return;
            }
            rect.set(this.f7937a.getIntrinsicWidth(), 0, 0, 0);
            rect.set(i + this.f7937a.getIntrinsicWidth(), 0, i2, 0);
        } else if (this.f7938b == 1) {
            rect.set(0, i, 0, i2);
        } else {
            rect.set(i, 0, i2, 0);
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, State state) {
        int paddingLeft;
        int width;
        int childCount;
        int intrinsicHeight;
        int i;
        View childAt;
        if (this.f7938b == 1) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            childCount = recyclerView.getChildCount();
            intrinsicHeight = this.f7937a.getIntrinsicHeight();
            for (i = 1; i < childCount; i++) {
                childAt = recyclerView.getChildAt(i);
                if (m7163a(childAt, recyclerView)) {
                    int translationY = (int) (childAt.getTranslationY() + 0.5f);
                    int top = (childAt.getTop() - ((LayoutParams) childAt.getLayoutParams()).topMargin) + translationY;
                    this.f7937a.setBounds(paddingLeft, top, width, top + intrinsicHeight);
                    this.f7937a.draw(canvas);
                }
            }
            return;
        }
        paddingLeft = recyclerView.getPaddingTop();
        width = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        childCount = recyclerView.getChildCount();
        intrinsicHeight = this.f7937a.getIntrinsicHeight();
        for (i = 1; i < childCount; i++) {
            childAt = recyclerView.getChildAt(i);
            if (m7163a(childAt, recyclerView)) {
                translationY = (int) (childAt.getTranslationX() + 0.5f);
                top = (childAt.getLeft() - ((LayoutParams) childAt.getLayoutParams()).leftMargin) + translationY;
                this.f7937a.setBounds(top, paddingLeft, top + intrinsicHeight, width);
                this.f7937a.draw(canvas);
            }
        }
    }
}
