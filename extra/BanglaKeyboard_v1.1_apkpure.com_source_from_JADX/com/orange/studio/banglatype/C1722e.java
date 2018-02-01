package com.orange.studio.banglatype;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class C1722e {

    public static class C1720a {
        public static boolean m7457a(Context context) {
            DisplayMetrics displayMetrics;
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            if (context == null) {
                displayMetrics = displayMetrics2;
            } else if (context instanceof Activity) {
                ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
                displayMetrics = displayMetrics2;
            } else {
                Resources resources = context.getResources();
                displayMetrics = new DisplayMetrics();
                if (resources != null) {
                    displayMetrics = resources.getDisplayMetrics();
                }
            }
            boolean z = (context == null || displayMetrics == null) ? true : displayMetrics.heightPixels > 500;
            return !z;
        }
    }

    public enum C1721b {
        ;

        static {
            f8296a = 1;
            f8297b = 2;
            f8298c = 3;
            f8299d = new int[]{f8296a, f8297b, f8298c};
        }

        public static int[] m7458a() {
            return (int[]) f8299d.clone();
        }
    }

    public static View m7459a(View view, int i) {
        if (view != null) {
            LayoutInflater layoutInflater = (LayoutInflater) view.getContext().getSystemService("layout_inflater");
            if (layoutInflater != null) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    int indexOfChild = viewGroup.indexOfChild(view);
                    viewGroup.removeView(view);
                    View inflate = layoutInflater.inflate(i, viewGroup, false);
                    viewGroup.addView(inflate, indexOfChild);
                    return inflate;
                }
            }
        }
        return null;
    }
}
