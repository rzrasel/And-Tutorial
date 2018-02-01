package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.actionbarsherlock.C0126R;
import com.actionbarsherlock.internal.nineoldandroids.widget.NineFrameLayout;
import com.actionbarsherlock.view.Menu;

public class ActionBarContainer extends NineFrameLayout {
    private ActionBarView mActionBarView;
    private Drawable mBackground;
    private boolean mIsSplit;
    private boolean mIsStacked;
    private boolean mIsTransitioning;
    private Drawable mSplitBackground;
    private Drawable mStackedBackground;
    private View mTabContainer;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        boolean z = true;
        super(context, attributeSet);
        setBackgroundDrawable(null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0126R.styleable.SherlockActionBar);
        this.mBackground = obtainStyledAttributes.getDrawable(2);
        this.mStackedBackground = obtainStyledAttributes.getDrawable(12);
        if ((this.mStackedBackground instanceof ColorDrawable) && VERSION.SDK_INT < 11) {
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Config.ARGB_8888);
            this.mStackedBackground.draw(new Canvas(createBitmap));
            int pixel = createBitmap.getPixel(0, 0);
            createBitmap.recycle();
            this.mStackedBackground = new IcsColorDrawable(pixel);
        }
        if (getId() == C0126R.id.abs__split_action_bar) {
            this.mIsSplit = true;
            this.mSplitBackground = obtainStyledAttributes.getDrawable(3);
        }
        obtainStyledAttributes.recycle();
        if (this.mIsSplit) {
            if (this.mSplitBackground != null) {
                z = false;
            }
        } else if (!(this.mBackground == null && this.mStackedBackground == null)) {
            z = false;
        }
        setWillNotDraw(z);
    }

    public View getTabContainer() {
        return this.mTabContainer;
    }

    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && getHeight() != 0) {
            if (!this.mIsSplit) {
                if (this.mBackground != null) {
                    this.mBackground.draw(canvas);
                }
                if (this.mStackedBackground != null && this.mIsStacked) {
                    this.mStackedBackground.draw(canvas);
                }
            } else if (this.mSplitBackground != null) {
                this.mSplitBackground.draw(canvas);
            }
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.mActionBarView = (ActionBarView) findViewById(C0126R.id.abs__action_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mIsTransitioning || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = true;
        boolean z3 = false;
        super.onLayout(z, i, i2, i3, i4);
        boolean z4 = (this.mTabContainer == null || this.mTabContainer.getVisibility() == 8) ? false : true;
        if (!(this.mTabContainer == null || this.mTabContainer.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int measuredHeight2 = this.mTabContainer.getMeasuredHeight();
            if ((this.mActionBarView.getDisplayOptions() & 2) == 0) {
                int childCount = getChildCount();
                for (measuredHeight = 0; measuredHeight < childCount; measuredHeight++) {
                    View childAt = getChildAt(measuredHeight);
                    if (!(childAt == this.mTabContainer || this.mActionBarView.isCollapsed())) {
                        childAt.offsetTopAndBottom(measuredHeight2);
                    }
                }
                this.mTabContainer.layout(i, 0, i3, measuredHeight2);
            } else {
                this.mTabContainer.layout(i, measuredHeight - measuredHeight2, i3, measuredHeight);
            }
        }
        if (!this.mIsSplit) {
            boolean z5;
            if (this.mBackground != null) {
                this.mBackground.setBounds(this.mActionBarView.getLeft(), this.mActionBarView.getTop(), this.mActionBarView.getRight(), this.mActionBarView.getBottom());
                z5 = true;
            } else {
                z5 = false;
            }
            if (z4 && this.mStackedBackground != null) {
                z3 = true;
            }
            this.mIsStacked = z3;
            if (z3) {
                this.mStackedBackground.setBounds(this.mTabContainer.getLeft(), this.mTabContainer.getTop(), this.mTabContainer.getRight(), this.mTabContainer.getBottom());
            } else {
                z2 = z5;
            }
        } else if (this.mSplitBackground != null) {
            this.mSplitBackground.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            z2 = false;
        }
        if (z2) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mActionBarView != null) {
            int i3;
            LayoutParams layoutParams = (LayoutParams) this.mActionBarView.getLayoutParams();
            if (this.mActionBarView.isCollapsed()) {
                i3 = 0;
            } else {
                i3 = layoutParams.bottomMargin + (this.mActionBarView.getMeasuredHeight() + layoutParams.topMargin);
            }
            if (this.mTabContainer != null && this.mTabContainer.getVisibility() != 8 && MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + this.mTabContainer.getMeasuredHeight(), MeasureSpec.getSize(i2)));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        this.mBackground = drawable;
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        this.mSplitBackground = drawable;
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        this.mStackedBackground = drawable;
        invalidate();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        if (this.mTabContainer != null) {
            removeView(this.mTabContainer);
        }
        this.mTabContainer = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.mIsTransitioning = z;
        setDescendantFocusability(z ? 393216 : Menu.CATEGORY_ALTERNATIVE);
    }
}
