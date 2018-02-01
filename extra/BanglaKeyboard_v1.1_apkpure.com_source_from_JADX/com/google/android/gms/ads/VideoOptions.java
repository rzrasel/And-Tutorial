package com.google.android.gms.ads;

import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.zzmd;

@aqv
public final class VideoOptions {
    private final boolean f3938a;
    private final boolean f3939b;

    public static final class Builder {
        private boolean f3936a = true;
        private boolean f3937b = false;

        public final VideoOptions build() {
            return new VideoOptions();
        }

        public final Builder setCustomControlsRequested(boolean z) {
            this.f3937b = z;
            return this;
        }

        public final Builder setStartMuted(boolean z) {
            this.f3936a = z;
            return this;
        }
    }

    private VideoOptions(Builder builder) {
        this.f3938a = builder.f3936a;
        this.f3939b = builder.f3937b;
    }

    public VideoOptions(zzmd com_google_android_gms_internal_zzmd) {
        this.f3938a = com_google_android_gms_internal_zzmd.f7785a;
        this.f3939b = com_google_android_gms_internal_zzmd.f7786b;
    }

    public final boolean getCustomControlsRequested() {
        return this.f3939b;
    }

    public final boolean getStartMuted() {
        return this.f3938a;
    }
}
