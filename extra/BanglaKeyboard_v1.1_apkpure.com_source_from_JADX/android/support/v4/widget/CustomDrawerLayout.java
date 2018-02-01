package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class CustomDrawerLayout extends DrawerLayout {
    public CustomDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomDrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setDrawerClosed(int i) {
        View b = m2019b(i);
        if (b == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.m2004c(i));
        }
        m2023d(b);
        m2026f(b);
    }

    public void setDrawerClosed(View view) {
        if (DrawerLayout.m2005e(view)) {
            m2023d(view);
            m2026f(view);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }
}
