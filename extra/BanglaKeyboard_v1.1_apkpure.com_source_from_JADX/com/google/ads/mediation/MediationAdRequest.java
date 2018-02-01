package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.AdRequest.Gender;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

@Deprecated
public class MediationAdRequest {
    private final Date f3899a;
    private final Gender f3900b;
    private final Set<String> f3901c;
    private final boolean f3902d;
    private final Location f3903e;

    public MediationAdRequest(Date date, Gender gender, Set<String> set, boolean z, Location location) {
        this.f3899a = date;
        this.f3900b = gender;
        this.f3901c = set;
        this.f3902d = z;
        this.f3903e = location;
    }

    public Integer getAgeInYears() {
        if (this.f3899a == null) {
            return null;
        }
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTime(this.f3899a);
        Integer valueOf = Integer.valueOf(instance2.get(1) - instance.get(1));
        return (instance2.get(2) < instance.get(2) || (instance2.get(2) == instance.get(2) && instance2.get(5) < instance.get(5))) ? Integer.valueOf(valueOf.intValue() - 1) : valueOf;
    }

    public Date getBirthday() {
        return this.f3899a;
    }

    public Gender getGender() {
        return this.f3900b;
    }

    public Set<String> getKeywords() {
        return this.f3901c;
    }

    public Location getLocation() {
        return this.f3903e;
    }

    public boolean isTesting() {
        return this.f3902d;
    }
}
