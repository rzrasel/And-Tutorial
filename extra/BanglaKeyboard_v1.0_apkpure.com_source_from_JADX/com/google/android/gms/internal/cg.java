package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0207q;
import com.google.p004a.p005a.C0180b;
import com.google.p004a.p005a.C0181c;
import com.google.p004a.p005a.C0182d;
import com.google.p004a.p005a.C0183e;
import com.google.p004a.p005a.C0186h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class cg extends bw {
    private final C0180b f1124a;
    private final C0186h f1125b;

    public cg(C0180b c0180b, C0186h c0186h) {
        this.f1124a = c0180b;
        this.f1125b = c0186h;
    }

    private C0183e m1775a(String str) {
        Map hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    hashMap.put(str2, jSONObject.getString(str2));
                }
            } catch (Throwable th) {
                gb.m2070a("Could not get MediationServerParameters.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class c = this.f1124a.m760c();
        if (c == null) {
            return null;
        }
        C0183e c0183e = (C0183e) c.newInstance();
        c0183e.m765a(hashMap);
        return c0183e;
    }

    public final C0204n mo833a() {
        if (this.f1124a instanceof C0181c) {
            try {
                return C0207q.m863a(((C0181c) this.f1124a).m762e());
            } catch (Throwable th) {
                gb.m2070a("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            gb.m2069a("MediationAdapter is not a MediationBannerAdapter: " + this.f1124a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void mo834a(C0204n c0204n, ah ahVar, String str, by byVar) {
        mo835a(c0204n, ahVar, str, null, byVar);
    }

    public final void mo835a(C0204n c0204n, ah ahVar, String str, String str2, by byVar) {
        if (this.f1124a instanceof C0182d) {
            gb.m2071a(3);
            try {
                C0182d c0182d = (C0182d) this.f1124a;
                ch chVar = new ch(byVar);
                C0207q.m864a(c0204n);
                int i = ahVar.f920g;
                m1775a(str);
                ci.m1785a(ahVar);
                C0186h c0186h = this.f1125b;
                c0182d.m763d();
            } catch (Throwable th) {
                gb.m2070a("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            gb.m2069a("MediationAdapter is not a MediationInterstitialAdapter: " + this.f1124a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void mo836a(C0204n c0204n, ak akVar, ah ahVar, String str, by byVar) {
        mo837a(c0204n, akVar, ahVar, str, null, byVar);
    }

    public final void mo837a(C0204n c0204n, ak akVar, ah ahVar, String str, String str2, by byVar) {
        if (this.f1124a instanceof C0181c) {
            gb.m2071a(3);
            try {
                C0181c c0181c = (C0181c) this.f1124a;
                ch chVar = new ch(byVar);
                C0207q.m864a(c0204n);
                int i = ahVar.f920g;
                m1775a(str);
                ci.m1786a(akVar);
                ci.m1785a(ahVar);
                C0186h c0186h = this.f1125b;
                c0181c.m761d();
            } catch (Throwable th) {
                gb.m2070a("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            gb.m2069a("MediationAdapter is not a MediationBannerAdapter: " + this.f1124a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void mo838b() {
        if (this.f1124a instanceof C0182d) {
            gb.m2071a(3);
            try {
                ((C0182d) this.f1124a).m764e();
            } catch (Throwable th) {
                gb.m2070a("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            gb.m2069a("MediationAdapter is not a MediationInterstitialAdapter: " + this.f1124a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void mo839c() {
        try {
            this.f1124a.m758a();
        } catch (Throwable th) {
            gb.m2070a("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void mo840d() {
        throw new RemoteException();
    }

    public final void mo841e() {
        throw new RemoteException();
    }
}
