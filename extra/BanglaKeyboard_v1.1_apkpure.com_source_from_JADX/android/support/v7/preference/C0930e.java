package android.support.v7.preference;

import android.support.v7.preference.C0935f.C0932b;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.SparseArray;
import android.view.View;

public final class C0930e extends ViewHolder {
    boolean f2875a;
    boolean f2876b;
    private final SparseArray<View> f2877c = new SparseArray(4);

    C0930e(View view) {
        super(view);
        this.f2877c.put(16908310, view.findViewById(16908310));
        this.f2877c.put(16908304, view.findViewById(16908304));
        this.f2877c.put(16908294, view.findViewById(16908294));
        this.f2877c.put(C0932b.icon_frame, view.findViewById(C0932b.icon_frame));
        this.f2877c.put(16908350, view.findViewById(16908350));
    }

    public final View m2715a(int i) {
        View view = (View) this.f2877c.get(i);
        if (view == null) {
            view = this.itemView.findViewById(i);
            if (view != null) {
                this.f2877c.put(i, view);
            }
        }
        return view;
    }
}
