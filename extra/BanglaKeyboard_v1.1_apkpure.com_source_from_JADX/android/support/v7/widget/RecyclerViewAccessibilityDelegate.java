package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.C0122a;
import android.support.v4.view.p019a.C0626b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class RecyclerViewAccessibilityDelegate extends C0122a {
    final C0122a mItemDelegate = new ItemDelegate(this);
    final RecyclerView mRecyclerView;

    public static class ItemDelegate extends C0122a {
        final RecyclerViewAccessibilityDelegate mRecyclerViewDelegate;

        public ItemDelegate(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
            this.mRecyclerViewDelegate = recyclerViewAccessibilityDelegate;
        }

        public void onInitializeAccessibilityNodeInfo(View view, C0626b c0626b) {
            super.onInitializeAccessibilityNodeInfo(view, c0626b);
            if (!this.mRecyclerViewDelegate.shouldIgnore() && this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() != null) {
                this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c0626b);
            }
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return super.performAccessibilityAction(view, i, bundle) ? true : (this.mRecyclerViewDelegate.shouldIgnore() || this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() == null) ? false : this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }
    }

    public RecyclerViewAccessibilityDelegate(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
    }

    public C0122a getItemDelegate() {
        return this.mItemDelegate;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !shouldIgnore()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(View view, C0626b c0626b) {
        super.onInitializeAccessibilityNodeInfo(view, c0626b);
        c0626b.m1694b(RecyclerView.class.getName());
        if (!shouldIgnore() && this.mRecyclerView.getLayoutManager() != null) {
            this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(c0626b);
        }
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return super.performAccessibilityAction(view, i, bundle) ? true : (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) ? false : this.mRecyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }
}
