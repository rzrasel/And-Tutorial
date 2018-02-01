package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.internal.aqv;

@aqv
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int ORIENTATION_ANY = 0;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;
    private final boolean f3949a;
    private final int f3950b;
    private final boolean f3951c;
    private final int f3952d;
    private final VideoOptions f3953e;

    public @interface AdChoicesPlacement {
    }

    public static final class Builder {
        private boolean f3944a = false;
        private int f3945b = -1;
        private boolean f3946c = false;
        private VideoOptions f3947d;
        private int f3948e = 1;

        public final NativeAdOptions build() {
            return new NativeAdOptions();
        }

        public final Builder setAdChoicesPlacement(@AdChoicesPlacement int i) {
            this.f3948e = i;
            return this;
        }

        public final Builder setImageOrientation(int i) {
            this.f3945b = i;
            return this;
        }

        public final Builder setRequestMultipleImages(boolean z) {
            this.f3946c = z;
            return this;
        }

        public final Builder setReturnUrlsForImageAssets(boolean z) {
            this.f3944a = z;
            return this;
        }

        public final Builder setVideoOptions(VideoOptions videoOptions) {
            this.f3947d = videoOptions;
            return this;
        }
    }

    private NativeAdOptions(Builder builder) {
        this.f3949a = builder.f3944a;
        this.f3950b = builder.f3945b;
        this.f3951c = builder.f3946c;
        this.f3952d = builder.f3948e;
        this.f3953e = builder.f3947d;
    }

    public final int getAdChoicesPlacement() {
        return this.f3952d;
    }

    public final int getImageOrientation() {
        return this.f3950b;
    }

    public final VideoOptions getVideoOptions() {
        return this.f3953e;
    }

    public final boolean shouldRequestMultipleImages() {
        return this.f3951c;
    }

    public final boolean shouldReturnUrlsForImageAssets() {
        return this.f3949a;
    }
}
