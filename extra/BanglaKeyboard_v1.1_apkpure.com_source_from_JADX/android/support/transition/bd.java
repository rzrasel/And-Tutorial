package android.support.transition;

import android.view.View;
import android.view.WindowId;

final class bd implements be {
    private final WindowId f1325a;

    bd(View view) {
        this.f1325a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bd) && ((bd) obj).f1325a.equals(this.f1325a);
    }

    public final int hashCode() {
        return this.f1325a.hashCode();
    }
}
