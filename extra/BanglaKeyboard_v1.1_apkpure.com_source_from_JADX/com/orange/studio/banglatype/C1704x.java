package com.orange.studio.banglatype;

import android.app.Activity;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.orange.studio.banglatype.C1722e.C1720a;
import com.orange.studio.banglatype.C1722e.C1721b;

public abstract class C1704x {
    C1716d f8130a;
    boolean f8131b = false;
    private boolean f8132c = false;

    static /* synthetic */ class C17451 {
        static final /* synthetic */ int[] f8381a = new int[C1721b.m7458a().length];

        static {
            try {
                f8381a[C1721b.f8297b - 1] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f8381a[C1721b.f8298c - 1] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f8381a[C1721b.f8296a - 1] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    protected void mo2407a(Activity activity) {
    }

    protected abstract boolean mo2388a();

    protected abstract boolean mo2389a(Activity activity, View view);

    public boolean mo2390a(Activity activity, ViewGroup viewGroup, int i) {
        if (activity == null || viewGroup == null) {
            return false;
        }
        View view;
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        int b = mo2391b();
        if (!mo2388a() || layoutInflater == null) {
            view = null;
        } else {
            View inflate = layoutInflater.inflate(b, null);
            if (inflate != null) {
                mo2389a(activity, inflate);
            }
            view = inflate;
        }
        if (view == null) {
            return false;
        }
        viewGroup.addView(view);
        Handler handler;
        Animation translateAnimation;
        switch (C17451.f8381a[i - 1]) {
            case 1:
                if (C1720a.m7457a(activity)) {
                    handler = new Handler();
                    translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                    translateAnimation.setDuration(500);
                    translateAnimation.setInterpolator(new AccelerateInterpolator(1.0f));
                    translateAnimation.setAnimationListener(new bo(view));
                    handler.postDelayed(new C1736q(view, translateAnimation), 20000);
                    return true;
                }
                break;
            case 2:
                if (C1720a.m7457a(activity)) {
                    handler = new Handler();
                    translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                    translateAnimation.setDuration(500);
                    translateAnimation.setInterpolator(new AccelerateInterpolator(1.0f));
                    translateAnimation.setAnimationListener(new bo(view));
                    handler.postDelayed(new C1736q(view, translateAnimation), 20000);
                    break;
                }
                break;
        }
        return true;
    }

    protected abstract int mo2391b();

    protected void mo2408b(Activity activity) {
    }

    protected void mo2409c(Activity activity) {
    }
}
