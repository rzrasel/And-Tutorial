package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class ace {
    final HashSet<String> f4785a = new HashSet();
    final Bundle f4786b = new Bundle();
    final HashMap<Class<? extends NetworkExtras>, NetworkExtras> f4787c = new HashMap();
    public final HashSet<String> f4788d = new HashSet();
    final Bundle f4789e = new Bundle();
    public final HashSet<String> f4790f = new HashSet();
    public Date f4791g;
    public String f4792h;
    public int f4793i = -1;
    public Location f4794j;
    public boolean f4795k = false;
    public String f4796l;
    public String f4797m;
    int f4798n = -1;
    public boolean f4799o;

    @Deprecated
    public final void m4099a(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            m4100a(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.f4787c.put(networkExtras.getClass(), networkExtras);
        }
    }

    public final void m4100a(Class<? extends MediationAdapter> cls, Bundle bundle) {
        this.f4786b.putBundle(cls.getName(), bundle);
    }

    public final void m4101a(String str) {
        this.f4785a.add(str);
    }

    public final void m4102a(String str, String str2) {
        this.f4789e.putString(str, str2);
    }

    public final void m4103a(boolean z) {
        this.f4798n = z ? 1 : 0;
    }

    public final void m4104b(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.f4786b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.f4786b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        this.f4786b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
    }

    public final void m4105b(String str) {
        this.f4788d.add(str);
    }
}
