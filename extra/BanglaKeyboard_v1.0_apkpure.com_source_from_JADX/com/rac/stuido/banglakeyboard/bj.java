package com.rac.stuido.banglakeyboard;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.actionbarsherlock.C0126R;

public final class bj extends bb {
    private boolean f2699f;
    private int f2700g = 0;
    private int f2701h = 1;
    private int f2702i = C0126R.drawable.dash_list_selector_holo_light_000;
    private int f2703j = C0126R.drawable.selector_panel_list_top_when_stretched_000;
    private int f2704k = C0126R.drawable.selector_panel_list_middle_when_stretched_000;
    private int f2705l = C0126R.drawable.selector_panel_list_single_000;
    private int f2706m = C0126R.drawable.selector_panel_list_top_000;
    private int f2707n = C0126R.drawable.selector_panel_list_middle_000;
    private int f2708o = C0126R.drawable.selector_panel_list_bottom_000;

    public bj(Context context) {
        super(context);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 != null) {
            if (this.f2700g == 0 || this.f2701h == 0) {
                view2.setBackgroundResource(this.f2702i);
            } else if (this.f2699f) {
                if (i == 0) {
                    view2.setBackgroundResource(this.f2703j);
                } else {
                    view2.setBackgroundResource(this.f2704k);
                }
            } else if (i == 0) {
                if (super.getCount() == 1) {
                    view2.setBackgroundResource(this.f2705l);
                } else {
                    view2.setBackgroundResource(this.f2706m);
                }
            } else if (i == super.getCount() - 1) {
                view2.setBackgroundResource(this.f2708o);
            } else {
                view2.setBackgroundResource(this.f2707n);
            }
        }
        return view2;
    }
}
