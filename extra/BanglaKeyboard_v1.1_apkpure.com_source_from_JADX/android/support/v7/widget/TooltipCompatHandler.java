package android.support.v7.widget;

import android.support.v4.view.C0679r;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

class TooltipCompatHandler implements OnAttachStateChangeListener, OnHoverListener, OnLongClickListener {
    private static final long HOVER_HIDE_TIMEOUT_MS = 15000;
    private static final long HOVER_HIDE_TIMEOUT_SHORT_MS = 3000;
    private static final long LONG_CLICK_HIDE_TIMEOUT_MS = 2500;
    private static final String TAG = "TooltipCompatHandler";
    private static TooltipCompatHandler sActiveHandler;
    private final View mAnchor;
    private int mAnchorX;
    private int mAnchorY;
    private boolean mFromTouch;
    private final Runnable mHideRunnable = new C10692();
    private TooltipPopup mPopup;
    private final Runnable mShowRunnable = new C10681();
    private final CharSequence mTooltipText;

    class C10681 implements Runnable {
        C10681() {
        }

        public void run() {
            TooltipCompatHandler.this.show(false);
        }
    }

    class C10692 implements Runnable {
        C10692() {
        }

        public void run() {
            TooltipCompatHandler.this.hide();
        }
    }

    private TooltipCompatHandler(View view, CharSequence charSequence) {
        this.mAnchor = view;
        this.mTooltipText = charSequence;
        this.mAnchor.setOnLongClickListener(this);
        this.mAnchor.setOnHoverListener(this);
    }

    private void hide() {
        if (sActiveHandler == this) {
            sActiveHandler = null;
            if (this.mPopup != null) {
                this.mPopup.hide();
                this.mPopup = null;
                this.mAnchor.removeOnAttachStateChangeListener(this);
            }
        }
        this.mAnchor.removeCallbacks(this.mShowRunnable);
        this.mAnchor.removeCallbacks(this.mHideRunnable);
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (sActiveHandler != null && sActiveHandler.mAnchor == view) {
                sActiveHandler.hide();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        TooltipCompatHandler tooltipCompatHandler = new TooltipCompatHandler(view, charSequence);
    }

    private void show(boolean z) {
        if (C0679r.m1901B(this.mAnchor)) {
            if (sActiveHandler != null) {
                sActiveHandler.hide();
            }
            sActiveHandler = this;
            this.mFromTouch = z;
            this.mPopup = new TooltipPopup(this.mAnchor.getContext());
            this.mPopup.show(this.mAnchor, this.mAnchorX, this.mAnchorY, this.mFromTouch, this.mTooltipText);
            this.mAnchor.addOnAttachStateChangeListener(this);
            long longPressTimeout = this.mFromTouch ? LONG_CLICK_HIDE_TIMEOUT_MS : (C0679r.m1943p(this.mAnchor) & 1) == 1 ? HOVER_HIDE_TIMEOUT_SHORT_MS - ((long) ViewConfiguration.getLongPressTimeout()) : HOVER_HIDE_TIMEOUT_MS - ((long) ViewConfiguration.getLongPressTimeout());
            this.mAnchor.removeCallbacks(this.mHideRunnable);
            this.mAnchor.postDelayed(this.mHideRunnable, longPressTimeout);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.mPopup == null || !this.mFromTouch) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.mAnchor.getContext().getSystemService("accessibility");
            if (!(accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())) {
                switch (motionEvent.getAction()) {
                    case 7:
                        if (this.mAnchor.isEnabled() && this.mPopup == null) {
                            this.mAnchorX = (int) motionEvent.getX();
                            this.mAnchorY = (int) motionEvent.getY();
                            this.mAnchor.removeCallbacks(this.mShowRunnable);
                            this.mAnchor.postDelayed(this.mShowRunnable, (long) ViewConfiguration.getLongPressTimeout());
                            break;
                        }
                    case 10:
                        hide();
                        break;
                    default:
                        break;
                }
            }
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.mAnchorX = view.getWidth() / 2;
        this.mAnchorY = view.getHeight() / 2;
        show(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        hide();
    }
}
