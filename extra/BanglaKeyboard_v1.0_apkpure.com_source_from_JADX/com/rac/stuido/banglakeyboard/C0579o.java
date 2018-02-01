package com.rac.stuido.banglakeyboard;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class C0579o implements OnGlobalLayoutListener {
    final /* synthetic */ ActivityChooserView f2831a;

    C0579o(ActivityChooserView activityChooserView) {
        this.f2831a = activityChooserView;
    }

    public final void onGlobalLayout() {
        if (!this.f2831a.m3844c()) {
            return;
        }
        if (this.f2831a.isShown()) {
            this.f2831a.m3834f().show();
            if (this.f2831a.f2514a != null) {
                this.f2831a.f2514a.subUiVisibilityChanged(true);
                return;
            }
            return;
        }
        this.f2831a.m3834f().dismiss();
    }
}
