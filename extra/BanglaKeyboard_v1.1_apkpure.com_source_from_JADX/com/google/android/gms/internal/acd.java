package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@aqv
public final class acd {
    public final Date f4769a;
    public final String f4770b;
    public final int f4771c;
    public final Set<String> f4772d;
    public final Location f4773e;
    public final boolean f4774f;
    final Bundle f4775g;
    final Map<Class<? extends NetworkExtras>, NetworkExtras> f4776h;
    public final String f4777i;
    final String f4778j;
    final SearchAdRequest f4779k;
    final int f4780l;
    public final Bundle f4781m;
    final Set<String> f4782n;
    final boolean f4783o;
    private final Set<String> f4784p;

    public acd(ace com_google_android_gms_internal_ace) {
        this(com_google_android_gms_internal_ace, null);
    }

    public acd(ace com_google_android_gms_internal_ace, SearchAdRequest searchAdRequest) {
        this.f4769a = com_google_android_gms_internal_ace.f4791g;
        this.f4770b = com_google_android_gms_internal_ace.f4792h;
        this.f4771c = com_google_android_gms_internal_ace.f4793i;
        this.f4772d = Collections.unmodifiableSet(com_google_android_gms_internal_ace.f4785a);
        this.f4773e = com_google_android_gms_internal_ace.f4794j;
        this.f4774f = com_google_android_gms_internal_ace.f4795k;
        this.f4775g = com_google_android_gms_internal_ace.f4786b;
        this.f4776h = Collections.unmodifiableMap(com_google_android_gms_internal_ace.f4787c);
        this.f4777i = com_google_android_gms_internal_ace.f4796l;
        this.f4778j = com_google_android_gms_internal_ace.f4797m;
        this.f4779k = searchAdRequest;
        this.f4780l = com_google_android_gms_internal_ace.f4798n;
        this.f4784p = Collections.unmodifiableSet(com_google_android_gms_internal_ace.f4788d);
        this.f4781m = com_google_android_gms_internal_ace.f4789e;
        this.f4782n = Collections.unmodifiableSet(com_google_android_gms_internal_ace.f4790f);
        this.f4783o = com_google_android_gms_internal_ace.f4799o;
    }

    @Deprecated
    public final <T extends NetworkExtras> T m4095a(Class<T> cls) {
        return (NetworkExtras) this.f4776h.get(cls);
    }

    public final boolean m4096a(Context context) {
        Set set = this.f4784p;
        aak.m4022a();
        return set.contains(hz.m5614a(context));
    }

    public final Bundle m4097b(Class<? extends MediationAdapter> cls) {
        return this.f4775g.getBundle(cls.getName());
    }

    public final Bundle m4098c(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.f4775g.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        return bundle != null ? bundle.getBundle(cls.getName()) : null;
    }
}
