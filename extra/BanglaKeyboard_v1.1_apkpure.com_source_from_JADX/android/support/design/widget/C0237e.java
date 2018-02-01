package android.support.design.widget;

import android.graphics.Outline;

final class C0237e extends C0236d {
    C0237e() {
    }

    public final void getOutline(Outline outline) {
        copyBounds(this.b);
        outline.setOval(this.b);
    }
}
