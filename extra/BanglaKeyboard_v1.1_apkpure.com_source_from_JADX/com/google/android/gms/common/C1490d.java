package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class C1490d implements ServiceConnection {
    public boolean f4529a = false;
    public final BlockingQueue<IBinder> f4530b = new LinkedBlockingQueue();

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f4530b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
