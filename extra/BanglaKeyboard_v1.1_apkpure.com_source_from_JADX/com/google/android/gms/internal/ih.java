package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@aqv
public final class ih {
    public static <T> ik<T> m5638a(T t) {
        return new ik(t);
    }

    public static <T> T m5639a(Future<T> future, T t) {
        try {
            t = future.get(((Long) zzbv.zzen().m4217a(ado.bi)).longValue(), TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            future.cancel(true);
            id.m5371a("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            zzbv.zzee().m5336a(e, "Futures.resolveFuture");
        } catch (Throwable e2) {
            future.cancel(true);
            id.m5372a(6);
            zzbv.zzee().m5336a(e2, "Futures.resolveFuture");
        }
        return t;
    }

    public static <T> T m5640a(Future<T> future, T t, long j, TimeUnit timeUnit) {
        try {
            t = future.get(j, timeUnit);
        } catch (Throwable e) {
            future.cancel(true);
            id.m5371a("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            zzbv.zzee().m5336a(e, "Futures.resolveFuture");
        } catch (Throwable e2) {
            future.cancel(true);
            id.m5372a(6);
            zzbv.zzee().m5336a(e2, "Futures.resolveFuture");
        }
        return t;
    }
}
