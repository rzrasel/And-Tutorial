package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.PointerIcon;

public final class C0667p {
    Object f1972a;

    private C0667p(Object obj) {
        this.f1972a = obj;
    }

    public static C0667p m1792a(Context context) {
        return VERSION.SDK_INT >= 24 ? new C0667p(PointerIcon.getSystemIcon(context, 1002)) : new C0667p(null);
    }
}
