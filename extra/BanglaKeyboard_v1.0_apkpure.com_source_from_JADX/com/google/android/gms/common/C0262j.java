package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class C0262j implements ServiceConnection {
    boolean f559a = false;
    private final BlockingQueue f560b = new LinkedBlockingQueue();

    public final IBinder m1084a() {
        if (this.f559a) {
            throw new IllegalStateException();
        }
        this.f559a = true;
        return (IBinder) this.f560b.take();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f560b.put(iBinder);
        } catch (InterruptedException e) {
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
