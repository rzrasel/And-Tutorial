package android.support.v7.preference;

import android.os.Bundle;
import android.support.v4.view.C0122a;
import android.support.v4.view.p019a.C0626b;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerViewAccessibilityDelegate;
import android.view.View;

public final class C0929d extends RecyclerViewAccessibilityDelegate {
    final RecyclerView f2872a;
    final C0122a f2873b = super.getItemDelegate();
    final C0122a f2874c = new C09281(this);

    class C09281 extends C0122a {
        final /* synthetic */ C0929d f2871a;

        C09281(C0929d c0929d) {
            this.f2871a = c0929d;
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0626b c0626b) {
            this.f2871a.f2873b.onInitializeAccessibilityNodeInfo(view, c0626b);
            int childAdapterPosition = this.f2871a.f2872a.getChildAdapterPosition(view);
            Adapter adapter = this.f2871a.f2872a.getAdapter();
            if (adapter instanceof C0925b) {
                Preference a = ((C0925b) adapter).m2708a(childAdapterPosition);
                if (a != null) {
                    a.mo875a(c0626b);
                }
            }
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f2871a.f2873b.performAccessibilityAction(view, i, bundle);
        }
    }

    public C0929d(RecyclerView recyclerView) {
        super(recyclerView);
        this.f2872a = recyclerView;
    }

    public final C0122a getItemDelegate() {
        return this.f2874c;
    }
}
