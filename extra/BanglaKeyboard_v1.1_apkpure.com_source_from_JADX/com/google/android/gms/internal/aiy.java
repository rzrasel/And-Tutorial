package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class aiy {
    final Map<String, Queue<afv<?>>> f5166a;
    final Set<afv<?>> f5167b;
    final PriorityBlockingQueue<afv<?>> f5168c;
    List<Object> f5169d;
    private AtomicInteger f5170e;
    private final PriorityBlockingQueue<afv<?>> f5171f;
    private final lc f5172g;
    private final aaw f5173h;
    private final anc f5174i;
    private abx[] f5175j;
    private nm f5176k;

    private aiy(lc lcVar, aaw com_google_android_gms_internal_aaw) {
        this(lcVar, com_google_android_gms_internal_aaw, new xz(new Handler(Looper.getMainLooper())));
    }

    public aiy(lc lcVar, aaw com_google_android_gms_internal_aaw, byte b) {
        this(lcVar, com_google_android_gms_internal_aaw);
    }

    private aiy(lc lcVar, aaw com_google_android_gms_internal_aaw, anc com_google_android_gms_internal_anc) {
        this.f5170e = new AtomicInteger();
        this.f5166a = new HashMap();
        this.f5167b = new HashSet();
        this.f5168c = new PriorityBlockingQueue();
        this.f5171f = new PriorityBlockingQueue();
        this.f5169d = new ArrayList();
        this.f5172g = lcVar;
        this.f5173h = com_google_android_gms_internal_aaw;
        this.f5175j = new abx[4];
        this.f5174i = com_google_android_gms_internal_anc;
    }

    public final <T> afv<T> m4575a(afv<T> com_google_android_gms_internal_afv_T) {
        com_google_android_gms_internal_afv_T.f5073f = this;
        synchronized (this.f5167b) {
            this.f5167b.add(com_google_android_gms_internal_afv_T);
        }
        com_google_android_gms_internal_afv_T.f5072e = Integer.valueOf(this.f5170e.incrementAndGet());
        com_google_android_gms_internal_afv_T.m4467a("add-to-queue");
        if (com_google_android_gms_internal_afv_T.f5074g) {
            synchronized (this.f5166a) {
                String str = com_google_android_gms_internal_afv_T.f5069b;
                if (this.f5166a.containsKey(str)) {
                    Queue queue = (Queue) this.f5166a.get(str);
                    if (queue == null) {
                        queue = new LinkedList();
                    }
                    queue.add(com_google_android_gms_internal_afv_T);
                    this.f5166a.put(str, queue);
                    if (C1658y.f7464a) {
                        C1658y.m7016a("Request for cacheKey=%s is in flight, putting on hold.", str);
                    }
                } else {
                    this.f5166a.put(str, null);
                    this.f5168c.add(com_google_android_gms_internal_afv_T);
                }
            }
        } else {
            this.f5171f.add(com_google_android_gms_internal_afv_T);
        }
        return com_google_android_gms_internal_afv_T;
    }

    public final void m4576a() {
        int i = 0;
        if (this.f5176k != null) {
            nm nmVar = this.f5176k;
            nmVar.f6714a = true;
            nmVar.interrupt();
        }
        for (int i2 = 0; i2 < this.f5175j.length; i2++) {
            if (this.f5175j[i2] != null) {
                abx com_google_android_gms_internal_abx = this.f5175j[i2];
                com_google_android_gms_internal_abx.f4751a = true;
                com_google_android_gms_internal_abx.interrupt();
            }
        }
        this.f5176k = new nm(this.f5168c, this.f5171f, this.f5172g, this.f5174i);
        this.f5176k.start();
        while (i < this.f5175j.length) {
            abx com_google_android_gms_internal_abx2 = new abx(this.f5171f, this.f5173h, this.f5172g, this.f5174i);
            this.f5175j[i] = com_google_android_gms_internal_abx2;
            com_google_android_gms_internal_abx2.start();
            i++;
        }
    }
}
