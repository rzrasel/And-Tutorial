package com.google.android.gms.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class fa {
    final fd f1361a;
    final LinkedList f1362b;
    final Object f1363c;
    long f1364d;
    long f1365e;
    boolean f1366f;
    long f1367g;
    long f1368h;
    long f1369i;
    long f1370j;
    private final String f1371k;
    private final String f1372l;

    private fa(fd fdVar, String str, String str2) {
        this.f1363c = new Object();
        this.f1364d = -1;
        this.f1365e = -1;
        this.f1366f = false;
        this.f1367g = -1;
        this.f1368h = 0;
        this.f1369i = -1;
        this.f1370j = -1;
        this.f1361a = fdVar;
        this.f1371k = str;
        this.f1372l = str2;
        this.f1362b = new LinkedList();
    }

    public fa(String str, String str2) {
        this(fd.m1970a(), str, str2);
    }

    public final Bundle m1963a() {
        Bundle bundle;
        synchronized (this.f1363c) {
            bundle = new Bundle();
            bundle.putString("seqnum", this.f1371k);
            bundle.putString("slotid", this.f1372l);
            bundle.putBoolean("ismediation", this.f1366f);
            bundle.putLong("treq", this.f1369i);
            bundle.putLong("tresponse", this.f1370j);
            bundle.putLong("timp", this.f1365e);
            bundle.putLong("tload", this.f1367g);
            bundle.putLong("pcc", this.f1368h);
            bundle.putLong("tfetch", this.f1364d);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f1362b.iterator();
            while (it.hasNext()) {
                fb fbVar = (fb) it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("topen", fbVar.f1373a);
                bundle2.putLong("tclose", fbVar.f1374b);
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }
}
