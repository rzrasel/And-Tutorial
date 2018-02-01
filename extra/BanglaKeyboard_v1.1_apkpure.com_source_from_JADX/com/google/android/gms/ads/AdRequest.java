package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.internal.acd;
import com.google.android.gms.internal.ace;
import java.util.Date;
import java.util.Set;

public final class AdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    private final acd f3925a;

    public static final class Builder {
        private final ace f3924a = new ace();

        public Builder() {
            this.f3924a.m4105b("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.f3924a.m4104b(cls, bundle);
            return this;
        }

        public final Builder addKeyword(String str) {
            this.f3924a.m4101a(str);
            return this;
        }

        public final Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.f3924a.m4099a(networkExtras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.f3924a.m4100a((Class) cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f3924a.f4788d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public final Builder addTestDevice(String str) {
            this.f3924a.m4105b(str);
            return this;
        }

        public final AdRequest build() {
            return new AdRequest();
        }

        public final Builder setBirthday(Date date) {
            this.f3924a.f4791g = date;
            return this;
        }

        public final Builder setContentUrl(String str) {
            C1516t.m3861a((Object) str, (Object) "Content URL must be non-null.");
            C1516t.m3863a(str, (Object) "Content URL must be non-empty.");
            C1516t.m3866a(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", Integer.valueOf(512), Integer.valueOf(str.length()));
            this.f3924a.f4792h = str;
            return this;
        }

        public final Builder setGender(int i) {
            this.f3924a.f4793i = i;
            return this;
        }

        public final Builder setIsDesignedForFamilies(boolean z) {
            this.f3924a.f4799o = z;
            return this;
        }

        public final Builder setLocation(Location location) {
            this.f3924a.f4794j = location;
            return this;
        }

        public final Builder setRequestAgent(String str) {
            this.f3924a.f4797m = str;
            return this;
        }

        public final Builder tagForChildDirectedTreatment(boolean z) {
            this.f3924a.m4103a(z);
            return this;
        }
    }

    private AdRequest(Builder builder) {
        this.f3925a = new acd(builder.f3924a);
    }

    public final Date getBirthday() {
        return this.f3925a.f4769a;
    }

    public final String getContentUrl() {
        return this.f3925a.f4770b;
    }

    public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.f3925a.m4098c(cls);
    }

    public final int getGender() {
        return this.f3925a.f4771c;
    }

    public final Set<String> getKeywords() {
        return this.f3925a.f4772d;
    }

    public final Location getLocation() {
        return this.f3925a.f4773e;
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return this.f3925a.m4095a((Class) cls);
    }

    public final <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.f3925a.m4097b(cls);
    }

    public final boolean isTestDevice(Context context) {
        return this.f3925a.m4096a(context);
    }

    public final acd zzaz() {
        return this.f3925a;
    }
}
