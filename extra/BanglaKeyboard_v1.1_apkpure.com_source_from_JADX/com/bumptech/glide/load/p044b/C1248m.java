package com.bumptech.glide.load.p044b;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.p042h.C1163h;

final class C1248m {
    private boolean f3637a;
    private final Handler f3638b = new Handler(Looper.getMainLooper(), new C1247a());

    private static class C1247a implements Callback {
        private C1247a() {
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C1241l) message.obj).mo1369c();
            return true;
        }
    }

    C1248m() {
    }

    public final void m3339a(C1241l<?> c1241l) {
        C1163h.m3154a();
        if (this.f3637a) {
            this.f3638b.obtainMessage(1, c1241l).sendToTarget();
            return;
        }
        this.f3637a = true;
        c1241l.mo1369c();
        this.f3637a = false;
    }
}
