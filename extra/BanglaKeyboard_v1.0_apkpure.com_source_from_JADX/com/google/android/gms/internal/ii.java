package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.C0233a;
import com.google.android.gms.common.api.C0235b;
import java.util.ArrayList;
import java.util.Iterator;

public final class ii extends ia {
    public final int f1810b;
    public final Bundle f1811c;
    public final IBinder f1812d;
    final /* synthetic */ hy f1813e;

    public ii(hy hyVar, int i, IBinder iBinder, Bundle bundle) {
        this.f1813e = hyVar;
        super(hyVar, Boolean.valueOf(true));
        this.f1810b = i;
        this.f1812d = iBinder;
        this.f1811c = bundle;
    }

    protected final /* synthetic */ void mo902a(Object obj) {
        boolean z = false;
        if (((Boolean) obj) == null) {
            this.f1813e.m1910a(1);
            return;
        }
        switch (this.f1810b) {
            case 0:
                try {
                    if (this.f1813e.mo887b().equals(this.f1812d.getInterfaceDescriptor())) {
                        this.f1813e.f1253d = this.f1813e.mo884a(this.f1812d);
                        if (this.f1813e.f1253d != null) {
                            this.f1813e.m1910a(3);
                            ij a = this.f1813e.f1259k;
                            synchronized (a.f1815b) {
                                il ilVar = a.f1814a;
                                synchronized (a.f1815b) {
                                    je.m2476a(!a.f1817d);
                                    a.f1819f.removeMessages(1);
                                    a.f1817d = true;
                                    if (a.f1816c.size() == 0) {
                                        z = true;
                                    }
                                    je.m2476a(z);
                                    Iterator it = new ArrayList(a.f1815b).iterator();
                                    while (it.hasNext()) {
                                        C0235b c0235b = (C0235b) it.next();
                                        if (a.f1814a.mo883h() && a.f1814a.mo882e()) {
                                            if (!a.f1816c.contains(c0235b)) {
                                                c0235b.mo897a();
                                            }
                                        }
                                    }
                                    a.f1816c.clear();
                                    a.f1817d = false;
                                }
                            }
                            return;
                        }
                    }
                } catch (RemoteException e) {
                }
                im.m2397a(this.f1813e.f1251b).m2400b(this.f1813e.mo885a(), this.f1813e.f1256h);
                this.f1813e.f1256h = null;
                this.f1813e.m1910a(1);
                this.f1813e.f1253d = null;
                this.f1813e.f1259k.m2396a(new C0233a(8, null));
                return;
            case 10:
                this.f1813e.m1910a(1);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            default:
                PendingIntent pendingIntent = this.f1811c != null ? (PendingIntent) this.f1811c.getParcelable("pendingIntent") : null;
                if (this.f1813e.f1256h != null) {
                    im.m2397a(this.f1813e.f1251b).m2400b(this.f1813e.mo885a(), this.f1813e.f1256h);
                    this.f1813e.f1256h = null;
                }
                this.f1813e.m1910a(1);
                this.f1813e.f1253d = null;
                this.f1813e.f1259k.m2396a(new C0233a(this.f1810b, pendingIntent));
                return;
        }
    }
}
