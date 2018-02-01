package com.rac.stuido.banglakeyboard;

import android.app.Activity;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

public abstract class ay {
    C0565t f2574a;
    boolean f2575b = false;

    public View mo1359a(LayoutInflater layoutInflater) {
        View view = null;
        int b = mo1363b();
        if (mo1360a() && layoutInflater != null) {
            view = layoutInflater.inflate(b, null);
            if (view != null) {
                mo1362a(view);
            }
        }
        return view;
    }

    protected void mo1374a(Activity activity) {
    }

    protected abstract boolean mo1360a();

    public boolean mo1361a(Activity activity, ViewGroup viewGroup, C0586w c0586w) {
        if (activity == null || viewGroup == null) {
            return false;
        }
        View a = mo1359a(activity.getLayoutInflater());
        if (a == null) {
            return false;
        }
        viewGroup.addView(a);
        Handler handler;
        Animation translateAnimation;
        switch (az.f2671a[c0586w.ordinal()]) {
            case 1:
                if (C0585v.m4050a(activity)) {
                    handler = new Handler();
                    translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                    translateAnimation.setDuration(500);
                    translateAnimation.setInterpolator(new AccelerateInterpolator(1.0f));
                    translateAnimation.setAnimationListener(new bu(a));
                    handler.postDelayed(new al(a, translateAnimation), 20000);
                    return true;
                }
                break;
            case 2:
                if (C0585v.m4050a(activity)) {
                    handler = new Handler();
                    translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                    translateAnimation.setDuration(500);
                    translateAnimation.setInterpolator(new AccelerateInterpolator(1.0f));
                    translateAnimation.setAnimationListener(new bu(a));
                    handler.postDelayed(new al(a, translateAnimation), 20000);
                    break;
                }
                break;
        }
        return true;
    }

    protected abstract boolean mo1362a(View view);

    protected abstract int mo1363b();

    protected void mo1375b(Activity activity) {
    }

    protected void mo1376c(Activity activity) {
    }
}
