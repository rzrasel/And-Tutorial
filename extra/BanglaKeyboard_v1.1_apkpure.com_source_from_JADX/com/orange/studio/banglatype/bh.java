package com.orange.studio.banglatype;

import android.graphics.drawable.Drawable;
import android.support.v7.p012d.C0872b;
import com.bumptech.glide.p036f.p037b.C1104a;
import com.bumptech.glide.p036f.p037b.C1127g;
import com.bumptech.glide.p036f.p039a.C1119c;
import com.bumptech.glide.p042h.C1163h;

public final class bh extends C1104a<C0872b> {
    bf f8202a;
    private final int f8203b;
    private final int f8204c;

    public bh(bf bfVar) {
        this(bfVar, (byte) 0);
    }

    private bh(bf bfVar, byte b) {
        this.f8202a = bfVar;
        this.f8203b = Integer.MIN_VALUE;
        this.f8204c = Integer.MIN_VALUE;
    }

    public final void mo1289a(C1127g c1127g) {
        if (C1163h.m3155a(this.f8203b, this.f8204c)) {
            c1127g.mo1301a(this.f8203b, this.f8204c);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f8203b + " and height: " + this.f8204c + ", either provide dimensions in the constructor or call override()");
    }

    public final void mo1283a(Exception exception, Drawable drawable) {
        super.mo1283a(exception, drawable);
    }

    public final /* synthetic */ void mo1290a(Object obj, C1119c c1119c) {
        C0872b c0872b = (C0872b) obj;
        if (this.f8202a != null) {
            this.f8202a.onPaletteReady(c0872b);
        }
    }

    public final void mo1286b(Drawable drawable) {
        super.mo1286b(drawable);
    }
}
