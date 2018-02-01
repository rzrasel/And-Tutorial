package com.rac.stuido.banglakeyboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class C0584u {
    public static View m4049a(View view, int i) {
        if (view != null) {
            LayoutInflater layoutInflater = (LayoutInflater) view.getContext().getSystemService("layout_inflater");
            if (layoutInflater != null) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeView(view);
                View inflate = layoutInflater.inflate(i, viewGroup, false);
                viewGroup.addView(inflate, indexOfChild);
                return inflate;
            }
        }
        return null;
    }
}
