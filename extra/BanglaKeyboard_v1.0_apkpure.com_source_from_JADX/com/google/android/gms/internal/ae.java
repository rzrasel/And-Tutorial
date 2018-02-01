package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.search.C0224a;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public final class ae {
    public static final String f881a = fz.m2031a("emulator");
    private final Date f882b;
    private final String f883c;
    private final int f884d;
    private final Set f885e;
    private final Location f886f;
    private final boolean f887g;
    private final Map f888h;
    private final Map f889i;
    private final String f890j;
    private final C0224a f891k;
    private final int f892l;
    private final Set f893m;

    public ae(af afVar) {
        this(afVar, (byte) 0);
    }

    private ae(af afVar, byte b) {
        this.f882b = afVar.f898e;
        this.f883c = afVar.f899f;
        this.f884d = afVar.f900g;
        this.f885e = Collections.unmodifiableSet(afVar.f894a);
        this.f886f = afVar.f901h;
        this.f887g = afVar.f902i;
        this.f888h = Collections.unmodifiableMap(afVar.f895b);
        this.f889i = Collections.unmodifiableMap(afVar.f896c);
        this.f890j = afVar.f903j;
        this.f891k = null;
        this.f892l = afVar.f904k;
        this.f893m = Collections.unmodifiableSet(afVar.f897d);
    }

    public final Bundle m1620a(Class cls) {
        return (Bundle) this.f888h.get(cls);
    }

    public final Date m1621a() {
        return this.f882b;
    }

    public final boolean m1622a(Context context) {
        return this.f893m.contains(fz.m2030a(context));
    }

    public final String m1623b() {
        return this.f883c;
    }

    public final int m1624c() {
        return this.f884d;
    }

    public final Set m1625d() {
        return this.f885e;
    }

    public final Location m1626e() {
        return this.f886f;
    }

    public final boolean m1627f() {
        return this.f887g;
    }

    public final String m1628g() {
        return this.f890j;
    }

    public final C0224a m1629h() {
        return this.f891k;
    }

    public final Map m1630i() {
        return this.f889i;
    }

    public final Map m1631j() {
        return this.f888h;
    }

    public final int m1632k() {
        return this.f892l;
    }
}
