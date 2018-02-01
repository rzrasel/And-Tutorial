package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bumptech.glide.manager.C1378c.C1153a;

public final class C1381e implements C1378c {
    final C1153a f3848a;
    boolean f3849b;
    private final Context f3850c;
    private boolean f3851d;
    private final BroadcastReceiver f3852e = new C13801(this);

    class C13801 extends BroadcastReceiver {
        final /* synthetic */ C1381e f3847a;

        C13801(C1381e c1381e) {
            this.f3847a = c1381e;
        }

        public final void onReceive(Context context, Intent intent) {
            boolean z = this.f3847a.f3849b;
            this.f3847a.f3849b = C1381e.m3567a(context);
            if (z != this.f3847a.f3849b) {
                this.f3847a.f3848a.mo1323a(this.f3847a.f3849b);
            }
        }
    }

    public C1381e(Context context, C1153a c1153a) {
        this.f3850c = context.getApplicationContext();
        this.f3848a = c1153a;
    }

    static boolean m3567a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void a_() {
    }

    public final void mo1285b() {
        if (!this.f3851d) {
            this.f3849b = C1381e.m3567a(this.f3850c);
            this.f3850c.registerReceiver(this.f3852e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f3851d = true;
        }
    }

    public final void mo1287c() {
        if (this.f3851d) {
            this.f3850c.unregisterReceiver(this.f3852e);
            this.f3851d = false;
        }
    }
}
