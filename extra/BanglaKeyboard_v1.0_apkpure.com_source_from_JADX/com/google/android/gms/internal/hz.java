package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C0233a;
import com.google.android.gms.common.api.C0235b;
import java.util.ArrayList;
import java.util.Iterator;

final class hz extends Handler {
    final /* synthetic */ hy f1656a;

    public hz(hy hyVar, Looper looper) {
        this.f1656a = hyVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (message.what == 1 && !this.f1656a.m1925f()) {
            ((ia) message.obj).m2184b();
        } else if (message.what == 3) {
            this.f1656a.f1259k.m2396a(new C0233a(((Integer) message.obj).intValue(), null));
        } else if (message.what == 4) {
            this.f1656a.m1910a(1);
            this.f1656a.f1253d = null;
            ij a = this.f1656a.f1259k;
            ((Integer) message.obj).intValue();
            a.f1819f.removeMessages(1);
            synchronized (a.f1815b) {
                a.f1817d = true;
                Iterator it = new ArrayList(a.f1815b).iterator();
                while (it.hasNext()) {
                    C0235b c0235b = (C0235b) it.next();
                    if (!a.f1814a.mo883h()) {
                        break;
                    } else if (a.f1815b.contains(c0235b)) {
                        c0235b.mo898b();
                    }
                }
                a.f1817d = false;
            }
        } else if (message.what == 2 && !this.f1656a.mo882e()) {
            ((ia) message.obj).m2184b();
        } else if (message.what == 2 || message.what == 1) {
            ((ia) message.obj).m2182a();
        } else {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
        }
    }
}
