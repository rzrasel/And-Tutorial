package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C1493g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class C1518v<T extends IInterface> {
    private static String[] f4585A = new String[]{"service_esmobile", "service_googleme"};
    int f4586a;
    long f4587b;
    final Handler f4588c;
    protected ab f4589d;
    protected AtomicInteger f4590e;
    private long f4591f;
    private int f4592g;
    private long f4593h;
    private C1508f f4594i;
    private final Context f4595j;
    private final Looper f4596k;
    private final C1504b f4597l;
    private final C1493g f4598m;
    private final Object f4599n;
    private final Object f4600o;
    private C1511o f4601p;
    private T f4602q;
    private final ArrayList<aa<?>> f4603r;
    private ad f4604s;
    private int f4605t;
    private final C1519x f4606u;
    private final C1520y f4607v;
    private final int f4608w;
    private final String f4609x;
    private ConnectionResult f4610y;
    private boolean f4611z;

    public C1518v(Context context, Looper looper, int i, C1519x c1519x, C1520y c1520y) {
        this(context, looper, C1504b.m3835a(context), C1493g.m3805a(), i, (C1519x) C1516t.m3860a((Object) c1519x), (C1520y) C1516t.m3860a((Object) c1520y));
    }

    private C1518v(Context context, Looper looper, C1504b c1504b, C1493g c1493g, int i, C1519x c1519x, C1520y c1520y) {
        this.f4599n = new Object();
        this.f4600o = new Object();
        this.f4603r = new ArrayList();
        this.f4605t = 1;
        this.f4610y = null;
        this.f4611z = false;
        this.f4590e = new AtomicInteger(0);
        this.f4595j = (Context) C1516t.m3861a((Object) context, (Object) "Context must not be null");
        this.f4596k = (Looper) C1516t.m3861a((Object) looper, (Object) "Looper must not be null");
        this.f4597l = (C1504b) C1516t.m3861a((Object) c1504b, (Object) "Supervisor must not be null");
        this.f4598m = (C1493g) C1516t.m3861a((Object) c1493g, (Object) "API availability must not be null");
        this.f4588c = new C1521z(this, looper);
        this.f4608w = i;
        this.f4606u = c1519x;
        this.f4607v = c1520y;
        this.f4609x = null;
    }

    private final void m3873a(int i, T t) {
        Object obj = 1;
        if ((i == 4 ? 1 : null) != (t != null ? 1 : null)) {
            obj = null;
        }
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f4599n) {
            this.f4605t = i;
            this.f4602q = t;
            ServiceConnection serviceConnection;
            switch (i) {
                case 1:
                    if (this.f4604s != null) {
                        serviceConnection = this.f4604s;
                        mo2192j();
                        this.f4597l.m3836a(mo2190a(), "com.google.android.gms", 129, serviceConnection);
                        this.f4604s = null;
                        break;
                    }
                    break;
                case 2:
                case 3:
                    String str;
                    String str2;
                    C1504b c1504b;
                    String str3;
                    int i2;
                    if (!(this.f4604s == null || this.f4594i == null)) {
                        str = this.f4594i.f4574a;
                        str2 = this.f4594i.f4575b;
                        new StringBuilder((String.valueOf(str).length() + 70) + String.valueOf(str2).length()).append("Calling connect() while still connected, missing disconnect() for ").append(str).append(" on ").append(str2);
                        c1504b = this.f4597l;
                        str2 = this.f4594i.f4574a;
                        str3 = this.f4594i.f4575b;
                        i2 = this.f4594i.f4576c;
                        serviceConnection = this.f4604s;
                        mo2192j();
                        c1504b.m3836a(str2, str3, i2, serviceConnection);
                        this.f4590e.incrementAndGet();
                    }
                    this.f4604s = new ad(this, this.f4590e.get());
                    this.f4594i = new C1508f("com.google.android.gms", mo2190a());
                    c1504b = this.f4597l;
                    str2 = this.f4594i.f4574a;
                    str3 = this.f4594i.f4575b;
                    i2 = this.f4594i.f4576c;
                    serviceConnection = this.f4604s;
                    mo2192j();
                    if (!c1504b.mo1660a(new C1505c(str2, str3, i2), serviceConnection)) {
                        str = this.f4594i.f4574a;
                        str2 = this.f4594i.f4575b;
                        new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length()).append("unable to connect to service: ").append(str).append(" on ").append(str2);
                        m3892a(16, this.f4590e.get());
                        break;
                    }
                    break;
                case 4:
                    this.f4591f = System.currentTimeMillis();
                    break;
            }
        }
    }

    static /* synthetic */ void m3874a(C1518v c1518v) {
        int i;
        if (c1518v.m3888k()) {
            i = 5;
            c1518v.f4611z = true;
        } else {
            i = 4;
        }
        c1518v.f4588c.sendMessage(c1518v.f4588c.obtainMessage(i, c1518v.f4590e.get(), 16));
    }

    private final boolean m3876a(int i, int i2, T t) {
        boolean z;
        synchronized (this.f4599n) {
            if (this.f4605t != i) {
                z = false;
            } else {
                m3873a(i2, (IInterface) t);
                z = true;
            }
        }
        return z;
    }

    public static Bundle m3883g() {
        return null;
    }

    protected static Set<Scope> m3886i() {
        return Collections.EMPTY_SET;
    }

    private final String mo2192j() {
        return this.f4609x == null ? this.f4595j.getClass().getName() : this.f4609x;
    }

    private final boolean m3888k() {
        boolean z;
        synchronized (this.f4599n) {
            z = this.f4605t == 3;
        }
        return z;
    }

    private final boolean m3889l() {
        if (this.f4611z || TextUtils.isEmpty(mo2191b()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(mo2191b());
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public abstract T mo2189a(IBinder iBinder);

    public abstract String mo2190a();

    protected final void m3892a(int i, int i2) {
        this.f4588c.sendMessage(this.f4588c.obtainMessage(7, i2, -1, new ag(this, i)));
    }

    protected final void m3893a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.f4588c.sendMessage(this.f4588c.obtainMessage(1, i2, -1, new af(this, i, iBinder, bundle)));
    }

    protected final void m3894a(ConnectionResult connectionResult) {
        this.f4592g = connectionResult.f4507b;
        this.f4593h = System.currentTimeMillis();
    }

    public final void m3895a(Set<Scope> set) {
        Throwable e;
        Bundle bundle = new Bundle();
        zzy com_google_android_gms_common_internal_zzy = new zzy(this.f4608w);
        com_google_android_gms_common_internal_zzy.f4613a = this.f4595j.getPackageName();
        com_google_android_gms_common_internal_zzy.f4616d = bundle;
        if (set != null) {
            com_google_android_gms_common_internal_zzy.f4615c = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        com_google_android_gms_common_internal_zzy.f4618f = new zzc[0];
        try {
            synchronized (this.f4600o) {
                if (this.f4601p != null) {
                    this.f4601p.mo1662a(new ac(this, this.f4590e.get()), com_google_android_gms_common_internal_zzy);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (Throwable e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            this.f4588c.sendMessage(this.f4588c.obtainMessage(6, this.f4590e.get(), 1));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException e4) {
            e2 = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            m3893a(8, null, null, this.f4590e.get());
        } catch (RuntimeException e5) {
            e2 = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            m3893a(8, null, null, this.f4590e.get());
        }
    }

    public abstract String mo2191b();

    public final void m3897c() {
        int a = C1493g.m3804a(this.f4595j);
        if (a != 0) {
            m3873a(1, null);
            this.f4589d = (ab) C1516t.m3861a(new ae(this), (Object) "Connection progress callbacks cannot be null.");
            this.f4588c.sendMessage(this.f4588c.obtainMessage(3, this.f4590e.get(), a, null));
            return;
        }
        this.f4589d = (ab) C1516t.m3861a(new ae(this), (Object) "Connection progress callbacks cannot be null.");
        m3873a(2, null);
    }

    public final boolean m3898d() {
        boolean z;
        synchronized (this.f4599n) {
            z = this.f4605t == 4;
        }
        return z;
    }

    public final boolean m3899e() {
        boolean z;
        synchronized (this.f4599n) {
            z = this.f4605t == 2 || this.f4605t == 3;
        }
        return z;
    }

    public final void m3900f() {
        this.f4590e.incrementAndGet();
        synchronized (this.f4603r) {
            int size = this.f4603r.size();
            for (int i = 0; i < size; i++) {
                ((aa) this.f4603r.get(i)).m3821d();
            }
            this.f4603r.clear();
        }
        synchronized (this.f4600o) {
            this.f4601p = null;
        }
        m3873a(1, null);
    }

    public final T m3901h() {
        T t;
        synchronized (this.f4599n) {
            if (this.f4605t == 5) {
                throw new DeadObjectException();
            } else if (m3898d()) {
                C1516t.m3865a(this.f4602q != null, (Object) "Client is connected but service is null");
                t = this.f4602q;
            } else {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        return t;
    }
}
