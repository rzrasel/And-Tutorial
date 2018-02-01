package com.google.android.gms.internal;

import java.util.LinkedHashMap;

public class jh {
    private final LinkedHashMap f539a;
    private int f540b;
    private int f541c;
    private int f542d;
    private int f543e;
    private int f544f;
    private int f545g;

    private int m1026b(Object obj, Object obj2) {
        int a = mo695a(obj2);
        if (a >= 0) {
            return a;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    protected int mo695a(Object obj) {
        return 1;
    }

    public final Object m1028a(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        Object put;
        synchronized (this) {
            this.f542d++;
            this.f540b += m1026b(obj, obj2);
            put = this.f539a.put(obj, obj2);
            if (put != null) {
                this.f540b -= m1026b(obj, put);
            }
        }
        m1029a(this.f541c);
        return put;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1029a(int r4) {
        /*
        r3 = this;
    L_0x0000:
        monitor-enter(r3);
        r0 = r3.f540b;	 Catch:{ all -> 0x0032 }
        if (r0 < 0) goto L_0x0011;
    L_0x0005:
        r0 = r3.f539a;	 Catch:{ all -> 0x0032 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0032 }
        if (r0 == 0) goto L_0x0035;
    L_0x000d:
        r0 = r3.f540b;	 Catch:{ all -> 0x0032 }
        if (r0 == 0) goto L_0x0035;
    L_0x0011:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0032 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0032 }
        r1.<init>();	 Catch:{ all -> 0x0032 }
        r2 = r3.getClass();	 Catch:{ all -> 0x0032 }
        r2 = r2.getName();	 Catch:{ all -> 0x0032 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x0032 }
        r2 = ".sizeOf() is reporting inconsistent results!";
        r1 = r1.append(r2);	 Catch:{ all -> 0x0032 }
        r1 = r1.toString();	 Catch:{ all -> 0x0032 }
        r0.<init>(r1);	 Catch:{ all -> 0x0032 }
        throw r0;	 Catch:{ all -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
    L_0x0035:
        r0 = r3.f540b;	 Catch:{ all -> 0x0032 }
        if (r0 <= r4) goto L_0x0041;
    L_0x0039:
        r0 = r3.f539a;	 Catch:{ all -> 0x0032 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0032 }
        if (r0 == 0) goto L_0x0043;
    L_0x0041:
        monitor-exit(r3);	 Catch:{ all -> 0x0032 }
        return;
    L_0x0043:
        r0 = r3.f539a;	 Catch:{ all -> 0x0032 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0032 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0032 }
        r0 = r0.next();	 Catch:{ all -> 0x0032 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0032 }
        r1 = r0.getKey();	 Catch:{ all -> 0x0032 }
        r0 = r0.getValue();	 Catch:{ all -> 0x0032 }
        r2 = r3.f539a;	 Catch:{ all -> 0x0032 }
        r2.remove(r1);	 Catch:{ all -> 0x0032 }
        r2 = r3.f540b;	 Catch:{ all -> 0x0032 }
        r0 = r3.m1026b(r1, r0);	 Catch:{ all -> 0x0032 }
        r0 = r2 - r0;
        r3.f540b = r0;	 Catch:{ all -> 0x0032 }
        r0 = r3.f543e;	 Catch:{ all -> 0x0032 }
        r0 = r0 + 1;
        r3.f543e = r0;	 Catch:{ all -> 0x0032 }
        monitor-exit(r3);	 Catch:{ all -> 0x0032 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jh.a(int):void");
    }

    public final Object m1030b(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Object obj2 = this.f539a.get(obj);
            if (obj2 != null) {
                this.f544f++;
                return obj2;
            }
            this.f545g++;
            return null;
        }
    }

    public final synchronized String toString() {
        String format;
        int i = 0;
        synchronized (this) {
            int i2 = this.f544f + this.f545g;
            if (i2 != 0) {
                i = (this.f544f * 100) / i2;
            }
            format = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f541c), Integer.valueOf(this.f544f), Integer.valueOf(this.f545g), Integer.valueOf(i)});
        }
        return format;
    }
}
