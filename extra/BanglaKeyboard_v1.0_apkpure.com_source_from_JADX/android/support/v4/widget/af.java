package android.support.v4.widget;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class af extends ae {
    private Method f285a;
    private Field f286b;

    af() {
        try {
            this.f285a = View.class.getDeclaredMethod("getDisplayList", null);
        } catch (NoSuchMethodException e) {
        }
        try {
            this.f286b = View.class.getDeclaredField("mRecreateDisplayList");
            this.f286b.setAccessible(true);
        } catch (NoSuchFieldException e2) {
        }
    }

    public final void mo279a(SlidingPaneLayout slidingPaneLayout, View view) {
        if (this.f285a == null || this.f286b == null) {
            view.invalidate();
            return;
        }
        try {
            this.f286b.setBoolean(view, true);
            this.f285a.invoke(view, null);
        } catch (Exception e) {
        }
        super.mo279a(slidingPaneLayout, view);
    }
}
