package android.support.v4.p006a.p007a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.p006a.p007a.C0370c.C0368a;

class C0372d extends C0370c {

    private static class C0371a extends C0368a {
        C0371a(C0368a c0368a) {
            super(c0368a);
        }

        public final Drawable newDrawable(Resources resources) {
            return new C0372d(this, resources);
        }
    }

    C0372d(Drawable drawable) {
        super(drawable);
    }

    C0372d(C0368a c0368a, Resources resources) {
        super(c0368a, resources);
    }

    C0368a mo282b() {
        return new C0371a(this.b);
    }

    public boolean isAutoMirrored() {
        return this.c.isAutoMirrored();
    }

    public void setAutoMirrored(boolean z) {
        this.c.setAutoMirrored(z);
    }
}
