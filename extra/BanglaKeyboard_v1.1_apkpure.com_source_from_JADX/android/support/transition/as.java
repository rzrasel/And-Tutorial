package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

final class as implements at {
    private final ViewOverlay f1305a;

    as(View view) {
        this.f1305a = view.getOverlay();
    }

    public final void mo235a(Drawable drawable) {
        this.f1305a.add(drawable);
    }

    public final void mo236b(Drawable drawable) {
        this.f1305a.remove(drawable);
    }
}
