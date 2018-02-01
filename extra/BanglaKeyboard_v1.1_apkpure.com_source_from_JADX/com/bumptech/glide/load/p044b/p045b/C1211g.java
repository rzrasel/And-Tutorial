package com.bumptech.glide.load.p044b.p045b;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.C1145c;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.load.p044b.p045b.C1210h.C1212a;
import com.bumptech.glide.p042h.C1159e;

public final class C1211g extends C1159e<C1145c, C1241l<?>> implements C1210h {
    private C1212a f3545a;

    public C1211g(int i) {
        super(i);
    }

    protected final /* synthetic */ int mo1352a(Object obj) {
        return ((C1241l) obj).mo1368b();
    }

    public final /* synthetic */ C1241l mo1353a(C1145c c1145c) {
        Object remove = this.f3443b.remove(c1145c);
        if (remove != null) {
            this.f3444c -= mo1352a(remove);
        }
        return (C1241l) remove;
    }

    public final /* synthetic */ C1241l mo1354a(C1145c c1145c, C1241l c1241l) {
        return (C1241l) super.m3144b(c1145c, c1241l);
    }

    @SuppressLint({"InlinedApi"})
    public final void mo1355a(int i) {
        if (i >= 60) {
            m3145b(0);
        } else if (i >= 40) {
            m3145b(this.f3444c / 2);
        }
    }

    public final void mo1356a(C1212a c1212a) {
        this.f3545a = c1212a;
    }
}
