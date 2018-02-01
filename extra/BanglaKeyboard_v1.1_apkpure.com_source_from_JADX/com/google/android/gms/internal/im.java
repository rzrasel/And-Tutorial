package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@aqv
final class im {
    private final Object f6257a = new Object();
    private final List<Runnable> f6258b = new ArrayList();
    private boolean f6259c = false;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m5642a() {
        /*
        r4 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r4.f6257a;
        monitor-enter(r1);
        r2 = r4.f6259c;	 Catch:{ all -> 0x0032 }
        if (r2 == 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r1);	 Catch:{ all -> 0x0032 }
    L_0x000d:
        return;
    L_0x000e:
        r2 = r4.f6258b;	 Catch:{ all -> 0x0032 }
        r0.addAll(r2);	 Catch:{ all -> 0x0032 }
        r2 = r4.f6258b;	 Catch:{ all -> 0x0032 }
        r2.clear();	 Catch:{ all -> 0x0032 }
        r2 = 1;
        r4.f6259c = r2;	 Catch:{ all -> 0x0032 }
        monitor-exit(r1);	 Catch:{ all -> 0x0032 }
        r0 = (java.util.ArrayList) r0;
        r3 = r0.size();
        r1 = 0;
        r2 = r1;
    L_0x0024:
        if (r2 >= r3) goto L_0x000d;
    L_0x0026:
        r1 = r0.get(r2);
        r2 = r2 + 1;
        r1 = (java.lang.Runnable) r1;
        r1.run();
        goto L_0x0024;
    L_0x0032:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0032 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.im.a():void");
    }

    public final void m5643a(Runnable runnable, Executor executor) {
        synchronized (this.f6257a) {
            if (this.f6259c) {
                executor.execute(runnable);
            } else {
                this.f6258b.add(new in(executor, runnable));
            }
        }
    }
}
