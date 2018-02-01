package com.google.android.gms.internal;

import java.io.InputStream;
import java.util.concurrent.Callable;

final class hl implements Callable<T> {
    private /* synthetic */ InputStream f6209a;
    private /* synthetic */ hj f6210b;

    hl(hj hjVar, InputStream inputStream) {
        this.f6210b = hjVar;
        this.f6209a = inputStream;
    }

    public final T call() {
        return this.f6210b.f6205k.mo2015a(this.f6209a);
    }
}
