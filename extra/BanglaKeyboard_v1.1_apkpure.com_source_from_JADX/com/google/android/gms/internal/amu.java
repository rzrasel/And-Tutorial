package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

@aqv
public final class amu implements MediationAdRequest {
    private final Date f5394a;
    private final int f5395b;
    private final Set<String> f5396c;
    private final boolean f5397d;
    private final Location f5398e;
    private final int f5399f;
    private final boolean f5400g;

    public amu(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2) {
        this.f5394a = date;
        this.f5395b = i;
        this.f5396c = set;
        this.f5398e = location;
        this.f5397d = z;
        this.f5399f = i2;
        this.f5400g = z2;
    }

    public final Date getBirthday() {
        return this.f5394a;
    }

    public final int getGender() {
        return this.f5395b;
    }

    public final Set<String> getKeywords() {
        return this.f5396c;
    }

    public final Location getLocation() {
        return this.f5398e;
    }

    public final boolean isDesignedForFamilies() {
        return this.f5400g;
    }

    public final boolean isTesting() {
        return this.f5397d;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.f5399f;
    }
}
