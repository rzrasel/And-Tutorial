package com.rac.stuido.banglakeyboard;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.C0126R;

final class C0581q extends BaseAdapter {
    final /* synthetic */ ActivityChooserView f2833a;
    private C0570e f2834b;
    private int f2835c;
    private boolean f2836d;
    private boolean f2837e;
    private boolean f2838f;

    private C0581q(ActivityChooserView activityChooserView) {
        this.f2833a = activityChooserView;
        this.f2835c = 4;
        this.f2836d = true;
    }

    public final int m4038a() {
        int i = 0;
        int i2 = this.f2835c;
        this.f2835c = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = getCount();
        View view = null;
        int i3 = 0;
        while (i < count) {
            view = getView(i, view, null);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
            i++;
        }
        this.f2835c = i2;
        return i3;
    }

    public final void m4039a(int i) {
        if (this.f2835c != i) {
            this.f2835c = i;
            notifyDataSetChanged();
        }
    }

    public final void m4040a(C0570e c0570e) {
        C0570e c0570e2 = this.f2833a.f2515b.f2834b;
        if (c0570e2 != null && this.f2833a.isShown()) {
            try {
                c0570e2.unregisterObserver(this.f2833a.f2524k);
            } catch (IllegalStateException e) {
            }
        }
        this.f2834b = c0570e;
        if (c0570e != null && this.f2833a.isShown()) {
            c0570e.registerObserver(this.f2833a.f2524k);
        }
        notifyDataSetChanged();
    }

    public final void m4041a(boolean z) {
        if (this.f2838f != z) {
            this.f2838f = z;
            notifyDataSetChanged();
        }
    }

    public final void m4042a(boolean z, boolean z2) {
        if (this.f2836d != z || this.f2837e != z2) {
            this.f2836d = z;
            this.f2837e = z2;
            notifyDataSetChanged();
        }
    }

    public final ResolveInfo m4043b() {
        return this.f2834b.m4034b();
    }

    public final int m4044c() {
        return this.f2834b.m4028a();
    }

    public final int m4045d() {
        return this.f2835c;
    }

    public final C0570e m4046e() {
        return this.f2834b;
    }

    public final boolean m4047f() {
        return this.f2836d;
    }

    public final int getCount() {
        int a = this.f2834b.m4028a();
        if (!(this.f2836d || this.f2834b.m4034b() == null)) {
            a--;
        }
        a = Math.min(a, this.f2835c);
        return this.f2838f ? a + 1 : a;
    }

    public final Object getItem(int i) {
        switch (getItemViewType(i)) {
            case 0:
                if (!(this.f2836d || this.f2834b.m4034b() == null)) {
                    i++;
                }
                return this.f2834b.m4030a(i);
            case 1:
                return null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return (this.f2838f && i == getCount() - 1) ? 1 : 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        switch (getItemViewType(i)) {
            case 0:
                if (view == null || view.getId() != C0126R.id.abs__list_item) {
                    view = LayoutInflater.from(this.f2833a.getContext()).inflate(C0126R.layout.abs__activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = this.f2833a.f2532s.getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(C0126R.id.abs__icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(C0126R.id.abs__title)).setText(resolveInfo.loadLabel(packageManager));
                if (!ActivityChooserView.f2513t) {
                    return view;
                }
                if (this.f2836d && i == 0 && this.f2837e) {
                    view.setActivated(true);
                    return view;
                }
                view.setActivated(false);
                return view;
            case 1:
                if (view != null && view.getId() == 1) {
                    return view;
                }
                view = LayoutInflater.from(this.f2833a.getContext()).inflate(C0126R.layout.abs__activity_chooser_view_list_item, viewGroup, false);
                view.setId(1);
                ((TextView) view.findViewById(C0126R.id.abs__title)).setText(this.f2833a.f2532s.getString(C0126R.string.activity_chooser_view_see_all));
                return view;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final int getViewTypeCount() {
        return 3;
    }
}
