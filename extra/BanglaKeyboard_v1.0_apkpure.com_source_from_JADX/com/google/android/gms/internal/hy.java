package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C0236e;
import com.google.android.gms.common.C0240c;
import com.google.android.gms.common.C0241d;
import com.google.android.gms.common.C0250h;
import com.google.android.gms.common.api.C0235b;
import com.google.android.gms.common.api.C0237c;
import java.util.ArrayList;

public abstract class hy implements C0240c, il {
    public static final String[] f1249f = new String[]{"service_esmobile", "service_googleme"};
    private final Looper f1250a;
    final Context f1251b;
    final Handler f1252c;
    IInterface f1253d;
    boolean f1254e;
    private final ArrayList f1255g;
    private C0372if f1256h;
    private volatile int f1257i;
    private final String[] f1258j;
    private final ij f1259k;

    private hy(Context context, Looper looper, C0235b c0235b, C0237c c0237c, String... strArr) {
        this.f1255g = new ArrayList();
        this.f1257i = 1;
        this.f1254e = false;
        this.f1251b = (Context) je.m2473a((Object) context);
        this.f1250a = (Looper) je.m2474a((Object) looper, (Object) "Looper must not be null");
        this.f1259k = new ij(looper, this);
        this.f1252c = new hz(this, looper);
        this.f1258j = strArr;
        Object obj = (C0235b) je.m2473a((Object) c0235b);
        ij ijVar = this.f1259k;
        je.m2473a(obj);
        synchronized (ijVar.f1815b) {
            if (ijVar.f1815b.contains(obj)) {
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + obj + " is already registered");
            } else {
                ijVar.f1815b.add(obj);
            }
        }
        if (ijVar.f1814a.mo882e()) {
            ijVar.f1819f.sendMessage(ijVar.f1819f.obtainMessage(1, obj));
        }
        obj = (C0237c) je.m2473a((Object) c0237c);
        ijVar = this.f1259k;
        je.m2473a(obj);
        synchronized (ijVar.f1818e) {
            if (ijVar.f1818e.contains(obj)) {
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + obj + " is already registered");
            } else {
                ijVar.f1818e.add(obj);
            }
        }
    }

    protected hy(Context context, C0241d c0241d, C0236e c0236e, String... strArr) {
        this(context, context.getMainLooper(), new ib(c0241d), new ig(c0236e), strArr);
    }

    private void m1910a(int i) {
        int i2 = this.f1257i;
        this.f1257i = i;
    }

    protected abstract IInterface mo884a(IBinder iBinder);

    protected abstract String mo885a();

    protected final void m1919a(int i, IBinder iBinder, Bundle bundle) {
        this.f1252c.sendMessage(this.f1252c.obtainMessage(1, new ii(this, i, iBinder, bundle)));
    }

    protected abstract void mo886a(it itVar, id idVar);

    protected abstract String mo887b();

    protected final void m1922b(IBinder iBinder) {
        try {
            mo886a(iu.m2435a(iBinder), new id(this));
        } catch (RemoteException e) {
            Log.w("GmsClient", "service died");
        }
    }

    public final void m1923d() {
        this.f1254e = true;
        m1910a(2);
        int a = C0250h.m1002a(this.f1251b);
        if (a != 0) {
            m1910a(1);
            this.f1252c.sendMessage(this.f1252c.obtainMessage(3, Integer.valueOf(a)));
            return;
        }
        if (this.f1256h != null) {
            this.f1253d = null;
            im.m2397a(this.f1251b).m2400b(mo885a(), this.f1256h);
        }
        this.f1256h = new C0372if(this);
        if (!im.m2397a(this.f1251b).m2399a(mo885a(), this.f1256h)) {
            "unable to connect to service: " + mo885a();
            this.f1252c.sendMessage(this.f1252c.obtainMessage(3, Integer.valueOf(9)));
        }
    }

    public final boolean mo882e() {
        return this.f1257i == 3;
    }

    public final boolean m1925f() {
        return this.f1257i == 2;
    }

    public final void m1926g() {
        this.f1254e = false;
        synchronized (this.f1255g) {
            int size = this.f1255g.size();
            for (int i = 0; i < size; i++) {
                ((ia) this.f1255g.get(i)).m2185c();
            }
            this.f1255g.clear();
        }
        m1910a(1);
        this.f1253d = null;
        if (this.f1256h != null) {
            im.m2397a(this.f1251b).m2400b(mo885a(), this.f1256h);
            this.f1256h = null;
        }
    }

    public final boolean mo883h() {
        return this.f1254e;
    }
}
