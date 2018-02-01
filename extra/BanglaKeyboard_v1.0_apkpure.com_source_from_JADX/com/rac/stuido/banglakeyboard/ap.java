package com.rac.stuido.banglakeyboard;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.SoftReference;

public final class ap implements as {
    private final SoftReference f2650a;
    private final int f2651b;

    public ap(ImageView imageView, int i) {
        this.f2650a = new SoftReference(imageView);
        this.f2651b = i;
    }

    public final void mo1366a(Drawable drawable) {
        ImageView imageView = (ImageView) this.f2650a.get();
        if (imageView != null) {
            Object tag = imageView.getTag();
            if (tag != null && (tag instanceof Integer) && ((Integer) tag).intValue() == this.f2651b) {
                imageView.setTag(null);
                imageView.setImageDrawable(drawable);
            }
        }
    }
}
