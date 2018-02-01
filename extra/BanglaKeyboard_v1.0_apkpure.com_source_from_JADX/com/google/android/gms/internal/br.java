package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.p003b.C0172b;
import com.google.p004a.p005a.C0180b;
import com.google.p004a.p005a.C0186h;
import java.util.Map;

public final class br extends bt {
    private Map f1086a;
    private Map f1087b;

    private bv m1710b(String str) {
        try {
            Class cls = Class.forName(str, false, br.class.getClassLoader());
            if (C0180b.class.isAssignableFrom(cls)) {
                C0180b c0180b = (C0180b) cls.newInstance();
                return new cg(c0180b, (C0186h) this.f1086a.get(c0180b.m759b()));
            } else if (C0172b.class.isAssignableFrom(cls)) {
                return new cd((C0172b) cls.newInstance(), (Bundle) this.f1087b.get(cls));
            } else {
                gb.m2069a("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            }
        } catch (Throwable th) {
            gb.m2069a("Could not instantiate mediation adapter: " + str + ". " + th.getMessage());
            RemoteException remoteException = new RemoteException();
        }
    }

    public final bv mo832a(String str) {
        return m1710b(str);
    }

    public final void m1712a(Map map) {
        this.f1086a = map;
    }

    public final void m1713b(Map map) {
        this.f1087b = map;
    }
}
