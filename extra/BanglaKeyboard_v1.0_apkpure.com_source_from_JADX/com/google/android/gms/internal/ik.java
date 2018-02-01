package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C0235b;

final class ik extends Handler {
    final /* synthetic */ ij f1820a;

    public ik(ij ijVar, Looper looper) {
        this.f1820a = ijVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            synchronized (this.f1820a.f1815b) {
                if (this.f1820a.f1814a.mo883h() && this.f1820a.f1814a.mo882e() && this.f1820a.f1815b.contains(message.obj)) {
                    il ilVar = this.f1820a.f1814a;
                    ((C0235b) message.obj).mo897a();
                }
            }
            return;
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
    }
}
