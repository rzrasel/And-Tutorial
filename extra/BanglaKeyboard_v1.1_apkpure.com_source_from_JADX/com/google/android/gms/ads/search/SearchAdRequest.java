package com.google.android.gms.ads.search;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.acd;
import com.google.android.gms.internal.ace;

public final class SearchAdRequest {
    public static final int BORDER_TYPE_DASHED = 1;
    public static final int BORDER_TYPE_DOTTED = 2;
    public static final int BORDER_TYPE_NONE = 0;
    public static final int BORDER_TYPE_SOLID = 3;
    public static final int CALL_BUTTON_COLOR_DARK = 2;
    public static final int CALL_BUTTON_COLOR_LIGHT = 0;
    public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    final acd f4490a;
    private final int f4491b;
    private final int f4492c;
    private final int f4493d;
    private final int f4494e;
    private final int f4495f;
    private final int f4496g;
    private final int f4497h;
    private final int f4498i;
    private final String f4499j;
    private final int f4500k;
    private final String f4501l;
    private final int f4502m;
    private final int f4503n;
    private final String f4504o;

    public static final class Builder {
        private final ace f4475a = new ace();
        private int f4476b;
        private int f4477c;
        private int f4478d;
        private int f4479e;
        private int f4480f;
        private int f4481g;
        private int f4482h = 0;
        private int f4483i;
        private String f4484j;
        private int f4485k;
        private String f4486l;
        private int f4487m;
        private int f4488n;
        private String f4489o;

        public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.f4475a.m4104b(cls, bundle);
            return this;
        }

        public final Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.f4475a.m4099a(networkExtras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.f4475a.m4100a((Class) cls, bundle);
            return this;
        }

        public final Builder addTestDevice(String str) {
            this.f4475a.m4105b(str);
            return this;
        }

        public final SearchAdRequest build() {
            return new SearchAdRequest();
        }

        public final Builder setAnchorTextColor(int i) {
            this.f4476b = i;
            return this;
        }

        public final Builder setBackgroundColor(int i) {
            this.f4477c = i;
            this.f4478d = Color.argb(0, 0, 0, 0);
            this.f4479e = Color.argb(0, 0, 0, 0);
            return this;
        }

        public final Builder setBackgroundGradient(int i, int i2) {
            this.f4477c = Color.argb(0, 0, 0, 0);
            this.f4478d = i2;
            this.f4479e = i;
            return this;
        }

        public final Builder setBorderColor(int i) {
            this.f4480f = i;
            return this;
        }

        public final Builder setBorderThickness(int i) {
            this.f4481g = i;
            return this;
        }

        public final Builder setBorderType(int i) {
            this.f4482h = i;
            return this;
        }

        public final Builder setCallButtonColor(int i) {
            this.f4483i = i;
            return this;
        }

        public final Builder setCustomChannels(String str) {
            this.f4484j = str;
            return this;
        }

        public final Builder setDescriptionTextColor(int i) {
            this.f4485k = i;
            return this;
        }

        public final Builder setFontFace(String str) {
            this.f4486l = str;
            return this;
        }

        public final Builder setHeaderTextColor(int i) {
            this.f4487m = i;
            return this;
        }

        public final Builder setHeaderTextSize(int i) {
            this.f4488n = i;
            return this;
        }

        public final Builder setLocation(Location location) {
            this.f4475a.f4794j = location;
            return this;
        }

        public final Builder setQuery(String str) {
            this.f4489o = str;
            return this;
        }

        public final Builder setRequestAgent(String str) {
            this.f4475a.f4797m = str;
            return this;
        }

        public final Builder tagForChildDirectedTreatment(boolean z) {
            this.f4475a.m4103a(z);
            return this;
        }
    }

    private SearchAdRequest(Builder builder) {
        this.f4491b = builder.f4476b;
        this.f4492c = builder.f4477c;
        this.f4493d = builder.f4478d;
        this.f4494e = builder.f4479e;
        this.f4495f = builder.f4480f;
        this.f4496g = builder.f4481g;
        this.f4497h = builder.f4482h;
        this.f4498i = builder.f4483i;
        this.f4499j = builder.f4484j;
        this.f4500k = builder.f4485k;
        this.f4501l = builder.f4486l;
        this.f4502m = builder.f4487m;
        this.f4503n = builder.f4488n;
        this.f4504o = builder.f4489o;
        this.f4490a = new acd(builder.f4475a, this);
    }

    public final int getAnchorTextColor() {
        return this.f4491b;
    }

    public final int getBackgroundColor() {
        return this.f4492c;
    }

    public final int getBackgroundGradientBottom() {
        return this.f4493d;
    }

    public final int getBackgroundGradientTop() {
        return this.f4494e;
    }

    public final int getBorderColor() {
        return this.f4495f;
    }

    public final int getBorderThickness() {
        return this.f4496g;
    }

    public final int getBorderType() {
        return this.f4497h;
    }

    public final int getCallButtonColor() {
        return this.f4498i;
    }

    public final String getCustomChannels() {
        return this.f4499j;
    }

    public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.f4490a.m4098c(cls);
    }

    public final int getDescriptionTextColor() {
        return this.f4500k;
    }

    public final String getFontFace() {
        return this.f4501l;
    }

    public final int getHeaderTextColor() {
        return this.f4502m;
    }

    public final int getHeaderTextSize() {
        return this.f4503n;
    }

    public final Location getLocation() {
        return this.f4490a.f4773e;
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return this.f4490a.m4095a((Class) cls);
    }

    public final <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.f4490a.m4097b(cls);
    }

    public final String getQuery() {
        return this.f4504o;
    }

    public final boolean isTestDevice(Context context) {
        return this.f4490a.m4096a(context);
    }
}
