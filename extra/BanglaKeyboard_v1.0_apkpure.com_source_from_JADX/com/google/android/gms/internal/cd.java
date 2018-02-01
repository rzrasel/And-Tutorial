package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.C0223f;
import com.google.android.gms.ads.p003b.C0172b;
import com.google.android.gms.ads.p003b.C0173c;
import com.google.android.gms.ads.p003b.C0174e;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0207q;
import com.google.p004a.p005a.p006a.C0175a;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public final class cd extends bw {
    private final C0172b f1105a;
    private final Bundle f1106b;

    public cd(C0172b c0172b, Bundle bundle) {
        this.f1105a = c0172b;
        this.f1106b = bundle;
    }

    private Bundle m1746a(String str, int i, String str2) {
        gb.m2069a("Server parameters: " + str);
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    bundle2.putString(str3, jSONObject.getString(str3));
                }
                bundle = bundle2;
            }
            if (this.f1105a instanceof C0175a) {
                bundle.putString("adJson", str2);
                bundle.putInt("tagForChildDirectedTreatment", i);
            }
            return bundle;
        } catch (Throwable th) {
            gb.m2070a("Could not get Server Parameters Bundle.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final C0204n mo833a() {
        if (this.f1105a instanceof C0173c) {
            try {
                return C0207q.m863a(((C0173c) this.f1105a).mo656d());
            } catch (Throwable th) {
                gb.m2070a("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            gb.m2069a("MediationAdapter is not a MediationBannerAdapter: " + this.f1105a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void mo834a(C0204n c0204n, ah ahVar, String str, by byVar) {
        mo835a(c0204n, ahVar, str, null, byVar);
    }

    public final void mo835a(C0204n c0204n, ah ahVar, String str, String str2, by byVar) {
        if (this.f1105a instanceof C0174e) {
            gb.m2071a(3);
            try {
                C0174e c0174e = (C0174e) this.f1105a;
                c0174e.mo653a((Context) C0207q.m864a(c0204n), new cf(byVar), m1746a(str, ahVar.f920g, str2), new cc(new Date(ahVar.f915b), ahVar.f917d, ahVar.f918e != null ? new HashSet(ahVar.f918e) : null, ahVar.f919f, ahVar.f920g), this.f1106b);
            } catch (Throwable th) {
                gb.m2070a("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            gb.m2069a("MediationAdapter is not a MediationInterstitialAdapter: " + this.f1105a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void mo836a(C0204n c0204n, ak akVar, ah ahVar, String str, by byVar) {
        mo837a(c0204n, akVar, ahVar, str, null, byVar);
    }

    public final void mo837a(C0204n c0204n, ak akVar, ah ahVar, String str, String str2, by byVar) {
        if (this.f1105a instanceof C0173c) {
            gb.m2071a(3);
            try {
                C0173c c0173c = (C0173c) this.f1105a;
                c0173c.mo652a((Context) C0207q.m864a(c0204n), new cf(byVar), m1746a(str, ahVar.f920g, str2), C0223f.m928a(akVar.f939f, akVar.f936c, akVar.f935b), new cc(new Date(ahVar.f915b), ahVar.f917d, ahVar.f918e != null ? new HashSet(ahVar.f918e) : null, ahVar.f919f, ahVar.f920g), this.f1106b);
            } catch (Throwable th) {
                gb.m2070a("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            gb.m2069a("MediationAdapter is not a MediationBannerAdapter: " + this.f1105a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void mo838b() {
        if (this.f1105a instanceof C0174e) {
            gb.m2071a(3);
            try {
                ((C0174e) this.f1105a).mo657e();
            } catch (Throwable th) {
                gb.m2070a("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            gb.m2069a("MediationAdapter is not a MediationInterstitialAdapter: " + this.f1105a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void mo839c() {
        try {
            this.f1105a.mo651a();
        } catch (Throwable th) {
            gb.m2070a("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void mo840d() {
        try {
            this.f1105a.mo654b();
        } catch (Throwable th) {
            gb.m2070a("Could not pause adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void mo841e() {
        try {
            this.f1105a.mo655c();
        } catch (Throwable th) {
            gb.m2070a("Could not resume adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }
}
