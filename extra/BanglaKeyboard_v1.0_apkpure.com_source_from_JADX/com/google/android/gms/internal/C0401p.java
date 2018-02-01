package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.search.C0224a;
import com.google.p004a.p005a.p006a.C0175a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class C0401p {
    public static final C0401p f2020a = new C0401p();

    private C0401p() {
    }

    public static ah m2750a(Context context, ae aeVar) {
        Date a = aeVar.m1621a();
        long time = a != null ? a.getTime() : -1;
        String b = aeVar.m1623b();
        int c = aeVar.m1624c();
        Collection d = aeVar.m1625d();
        List unmodifiableList = !d.isEmpty() ? Collections.unmodifiableList(new ArrayList(d)) : null;
        boolean a2 = aeVar.m1622a(context);
        int k = aeVar.m1632k();
        Location e = aeVar.m1626e();
        Bundle a3 = aeVar.m1620a(C0175a.class);
        boolean f = aeVar.m1627f();
        String g = aeVar.m1628g();
        C0224a h = aeVar.m1629h();
        return new ah(3, time, a3, c, unmodifiableList, a2, k, f, g, h != null ? new av(h) : null, e, b);
    }

    public static C0401p m2751a() {
        return f2020a;
    }
}
