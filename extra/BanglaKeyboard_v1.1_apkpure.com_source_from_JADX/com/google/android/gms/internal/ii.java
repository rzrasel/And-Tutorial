package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class ii implements Runnable {
    private final ir f6250a;
    private final ig f6251b;
    private final il f6252c;

    ii(ir irVar, ig igVar, il ilVar) {
        this.f6250a = irVar;
        this.f6251b = igVar;
        this.f6252c = ilVar;
    }

    public final void run() {
        Throwable e;
        ir irVar = this.f6250a;
        try {
            irVar.m3633b(this.f6251b.mo2013a(this.f6252c.get()));
        } catch (CancellationException e2) {
            irVar.cancel(true);
        } catch (ExecutionException e3) {
            e = e3;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            irVar.m3632a(e);
        } catch (Throwable e4) {
            Thread.currentThread().interrupt();
            irVar.m3632a(e4);
        }
    }
}
