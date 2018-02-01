package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@aqv
public final class eg {
    public final ej f5987a;
    public final LinkedList<eh> f5988b;
    public final Object f5989c;
    public long f5990d;
    public long f5991e;
    public boolean f5992f;
    public long f5993g;
    public long f5994h;
    public long f5995i;
    public long f5996j;
    private final String f5997k;
    private final String f5998l;

    private eg(ej ejVar, String str, String str2) {
        this.f5989c = new Object();
        this.f5990d = -1;
        this.f5991e = -1;
        this.f5992f = false;
        this.f5993g = -1;
        this.f5994h = 0;
        this.f5995i = -1;
        this.f5996j = -1;
        this.f5987a = ejVar;
        this.f5997k = str;
        this.f5998l = str2;
        this.f5988b = new LinkedList();
    }

    public eg(String str, String str2) {
        this(zzbv.zzee(), str, str2);
    }

    public final Bundle m5318a() {
        Bundle bundle;
        synchronized (this.f5989c) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f5997k);
            bundle.putString("slotid", this.f5998l);
            bundle.putBoolean("ismediation", this.f5992f);
            bundle.putLong("treq", this.f5995i);
            bundle.putLong("tresponse", this.f5996j);
            bundle.putLong("timp", this.f5991e);
            bundle.putLong("tload", this.f5993g);
            bundle.putLong("pcc", this.f5994h);
            bundle.putLong("tfetch", this.f5990d);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f5988b.iterator();
            while (it.hasNext()) {
                eh ehVar = (eh) it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("topen", ehVar.f5999a);
                bundle2.putLong("tclose", ehVar.f6000b);
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }
}
