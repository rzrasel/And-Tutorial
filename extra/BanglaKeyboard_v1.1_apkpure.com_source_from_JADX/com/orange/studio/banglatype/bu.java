package com.orange.studio.banglatype;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.p040a.C1136b;
import com.bumptech.glide.p036f.p037b.C1130c;
import com.bumptech.glide.p036f.p037b.C1137h;
import com.bumptech.glide.p036f.p039a.C1119c;

public class bu extends C1130c<C1136b> {
    private int f8141b;
    private C1136b f8142c;
    private final ColorStateList f8143d;
    private final ColorStateList f8144e;
    private final ColorStateList f8145f;
    private final int f8146g;

    public bu(ImageView imageView, ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i) {
        this(imageView, colorStateList, colorStateList2, colorStateList3, i, (byte) 0);
    }

    private bu(ImageView imageView, ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, byte b) {
        super(imageView);
        this.f8141b = -1;
        this.f8144e = colorStateList;
        this.f8143d = colorStateList2;
        this.f8145f = colorStateList3;
        this.f8146g = i;
    }

    private boolean m7302a(int i) {
        return (this.f8146g & i) != 0;
    }

    public final void mo1281a(Drawable drawable) {
        if (drawable != null) {
            if (this.a instanceof TintableImageView) {
                if (this.f8143d != null || m7302a(128)) {
                    ((TintableImageView) this.a).m7166a(this.f8143d, Mode.SRC_IN);
                }
            } else if (this.f8143d != null) {
                drawable.mutate();
                drawable.setColorFilter(this.f8143d.getDefaultColor(), Mode.SRC_IN);
            } else {
                drawable.clearColorFilter();
            }
        }
        super.mo1281a(drawable);
    }

    public void mo2392a(C1136b c1136b, C1119c<? super C1136b> c1119c) {
        Object c1137h;
        if (!c1136b.mo1315a()) {
            float intrinsicWidth = ((float) c1136b.getIntrinsicWidth()) / ((float) c1136b.getIntrinsicHeight());
            if (Math.abs((((float) ((ImageView) this.a).getWidth()) / ((float) ((ImageView) this.a).getHeight())) - 1.0f) <= 0.05f && Math.abs(intrinsicWidth - 1.0f) <= 0.05f) {
                c1137h = new C1137h(c1136b, ((ImageView) this.a).getWidth());
            }
        }
        if (c1137h != null) {
            if (this.a instanceof TintableImageView) {
                if (this.f8144e != null || m7302a(4)) {
                    ((TintableImageView) this.a).m7166a(this.f8144e, Mode.SRC_IN);
                }
            } else if (this.f8144e != null) {
                c1137h.mutate();
                c1137h.setColorFilter(this.f8144e.getDefaultColor(), Mode.SRC_IN);
            } else {
                c1137h.clearColorFilter();
            }
        }
        super.mo1290a(c1137h, (C1119c) c1119c);
        this.f8142c = c1137h;
        c1137h.mo1314a(this.f8141b);
        c1137h.start();
    }

    public void mo1283a(Exception exception, Drawable drawable) {
        if (drawable != null) {
            if (this.a instanceof TintableImageView) {
                if (this.f8143d != null || m7302a(131072)) {
                    ((TintableImageView) this.a).m7166a(this.f8145f, Mode.SRC_IN);
                }
            } else if (this.f8145f != null) {
                drawable.mutate();
                drawable.setColorFilter(this.f8145f.getDefaultColor(), Mode.SRC_IN);
            } else {
                drawable.clearColorFilter();
            }
        }
        super.mo1283a(exception, drawable);
    }

    protected final /* synthetic */ void mo1313a(Object obj) {
        ((ImageView) this.a).setImageDrawable((C1136b) obj);
    }

    public final void mo1285b() {
        if (this.f8142c != null) {
            this.f8142c.start();
        }
    }

    public final void mo1286b(Drawable drawable) {
        if (drawable != null) {
            if (this.a instanceof TintableImageView) {
                if (this.f8143d != null || m7302a(128)) {
                    ((TintableImageView) this.a).m7166a(this.f8143d, Mode.SRC_IN);
                }
            } else if (this.f8143d != null) {
                drawable.mutate();
                drawable.setColorFilter(this.f8143d.getDefaultColor(), Mode.SRC_IN);
            } else {
                drawable.clearColorFilter();
            }
        }
        super.mo1286b(drawable);
    }

    public final void mo1287c() {
        if (this.f8142c != null) {
            this.f8142c.stop();
        }
    }
}
