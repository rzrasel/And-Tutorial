package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

final class al implements am {
    private final ViewGroupOverlay f1290a;

    al(ViewGroup viewGroup) {
        this.f1290a = viewGroup.getOverlay();
    }

    public final void mo235a(Drawable drawable) {
        this.f1290a.add(drawable);
    }

    public final void mo237a(View view) {
        this.f1290a.add(view);
    }

    public final void mo236b(Drawable drawable) {
        this.f1290a.remove(drawable);
    }

    public final void mo238b(View view) {
        this.f1290a.remove(view);
    }
}
