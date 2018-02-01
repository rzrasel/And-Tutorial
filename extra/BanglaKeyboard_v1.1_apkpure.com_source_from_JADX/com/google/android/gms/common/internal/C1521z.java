package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class C1521z extends Handler {
    private /* synthetic */ C1518v f4612a;

    public C1521z(C1518v c1518v, Looper looper) {
        this.f4612a = c1518v;
        super(looper);
    }

    private static void m3905a(Message message) {
        ((aa) message.obj).m3820c();
    }

    private static boolean m3906b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    public final void handleMessage(Message message) {
        if (this.f4612a.f4590e.get() != message.arg1) {
            if (C1521z.m3906b(message)) {
                C1521z.m3905a(message);
            }
        } else if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !this.f4612a.m3899e()) {
            C1521z.m3905a(message);
        } else if (message.what == 4) {
            this.f4612a.f4610y = new ConnectionResult(message.arg2);
            if (!this.f4612a.m3889l() || this.f4612a.f4611z) {
                r0 = this.f4612a.f4610y != null ? this.f4612a.f4610y : new ConnectionResult(8);
                this.f4612a.f4589d.mo1656a(r0);
                this.f4612a.m3894a(r0);
                return;
            }
            this.f4612a.m3873a(3, null);
        } else if (message.what == 5) {
            r0 = this.f4612a.f4610y != null ? this.f4612a.f4610y : new ConnectionResult(8);
            this.f4612a.f4589d.mo1656a(r0);
            this.f4612a.m3894a(r0);
        } else if (message.what == 3) {
            ConnectionResult connectionResult = new ConnectionResult(message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null);
            this.f4612a.f4589d.mo1656a(connectionResult);
            this.f4612a.m3894a(connectionResult);
        } else if (message.what == 6) {
            this.f4612a.m3873a(5, null);
            if (this.f4612a.f4606u != null) {
                C1519x f = this.f4612a.f4606u;
                int i = message.arg2;
                f.mo2127b();
            }
            C1518v c1518v = this.f4612a;
            c1518v.f4586a = message.arg2;
            c1518v.f4587b = System.currentTimeMillis();
            this.f4612a.m3876a(5, 1, null);
        } else if (message.what == 2 && !this.f4612a.m3898d()) {
            C1521z.m3905a(message);
        } else if (C1521z.m3906b(message)) {
            ((aa) message.obj).m3819b();
        } else {
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
        }
    }
}
