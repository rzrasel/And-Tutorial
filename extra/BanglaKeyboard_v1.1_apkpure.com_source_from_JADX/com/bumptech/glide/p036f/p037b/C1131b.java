package com.bumptech.glide.p036f.p037b;

import android.widget.ImageView;
import com.bumptech.glide.load.resource.p040a.C1136b;
import com.bumptech.glide.p036f.p039a.C1119c;

public class C1131b extends C1130c<C1136b> {
    private int f3389b;
    private C1136b f3390c;

    public C1131b(ImageView imageView) {
        this(imageView, (byte) 0);
    }

    private C1131b(ImageView imageView, byte b) {
        super(imageView);
        this.f3389b = -1;
    }

    public void mo2350a(C1136b c1136b, C1119c<? super C1136b> c1119c) {
        Object c1137h;
        if (!c1136b.mo1315a()) {
            float intrinsicWidth = ((float) c1136b.getIntrinsicWidth()) / ((float) c1136b.getIntrinsicHeight());
            if (Math.abs((((float) ((ImageView) this.a).getWidth()) / ((float) ((ImageView) this.a).getHeight())) - 1.0f) <= 0.05f && Math.abs(intrinsicWidth - 1.0f) <= 0.05f) {
                c1137h = new C1137h(c1136b, ((ImageView) this.a).getWidth());
            }
        }
        super.mo1290a(c1137h, (C1119c) c1119c);
        this.f3390c = c1137h;
        c1137h.mo1314a(this.f3389b);
        c1137h.start();
    }

    protected final /* synthetic */ void mo1313a(Object obj) {
        ((ImageView) this.a).setImageDrawable((C1136b) obj);
    }

    public final void mo1285b() {
        if (this.f3390c != null) {
            this.f3390c.start();
        }
    }

    public final void mo1287c() {
        if (this.f3390c != null) {
            this.f3390c.stop();
        }
    }
}
