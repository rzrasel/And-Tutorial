package com.orange.studio.banglatype;

import android.graphics.drawable.Drawable;
import android.support.v7.p012d.C0872b;
import android.view.View;
import com.bumptech.glide.p036f.C1126b;
import com.bumptech.glide.p036f.p037b.C1104a;
import com.bumptech.glide.p036f.p037b.C1127g;
import com.bumptech.glide.p036f.p039a.C1119c;
import com.bumptech.glide.p042h.C1163h;

public final class bj extends C1104a<C0872b> {
    private bf f8218a;
    private final View f8219b;
    private int f8220c;
    private final int f8221d;
    private final int f8222e;

    public bj(View view, bf bfVar, int i) {
        this(view, bfVar, i, (byte) 0);
    }

    private bj(View view, bf bfVar, int i, byte b) {
        this.f8219b = view;
        this.f8218a = bfVar;
        this.f8220c = i;
        this.f8221d = Integer.MIN_VALUE;
        this.f8222e = Integer.MIN_VALUE;
    }

    public static C1126b m7391a(View view) {
        Object tag = view.getTag(R.id.glide_palette_request);
        if (tag == null) {
            return null;
        }
        if (tag instanceof C1126b) {
            return (C1126b) tag;
        }
        throw new IllegalArgumentException("Unable to get glide request from view tag.");
    }

    public final void mo1289a(C1127g c1127g) {
        if (C1163h.m3155a(this.f8221d, this.f8222e)) {
            c1127g.mo1301a(this.f8221d, this.f8222e);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f8221d + " and height: " + this.f8222e + ", either provide dimensions in the constructor or call override()");
    }

    public final void mo1282a(C1126b c1126b) {
        this.f8219b.setTag(R.id.glide_palette_request, c1126b);
    }

    public final void mo1283a(Exception exception, Drawable drawable) {
        super.mo1283a(exception, drawable);
    }

    public final /* synthetic */ void mo1290a(Object obj, C1119c c1119c) {
        C0872b c0872b = (C0872b) obj;
        if (this.f8218a != null) {
            this.f8218a.onPaletteReady(c0872b, this.f8219b, this.f8220c);
        }
    }

    public final void mo1286b(Drawable drawable) {
        super.mo1286b(drawable);
    }

    public final C1126b mo1288e() {
        Object tag = this.f8219b.getTag(R.id.glide_palette_request);
        if (tag == null) {
            return null;
        }
        if (tag instanceof C1126b) {
            return (C1126b) tag;
        }
        throw new IllegalArgumentException("Unable to get glide request from view tag.");
    }
}
