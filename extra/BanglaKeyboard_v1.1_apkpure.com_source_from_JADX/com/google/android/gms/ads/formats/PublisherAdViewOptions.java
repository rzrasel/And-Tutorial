package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abh;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.zzbcc;

@aqv
public final class PublisherAdViewOptions extends zzbcc {
    public static final Creator<PublisherAdViewOptions> CREATOR = new zzc();
    private final boolean f3958a;
    private final abh f3959b;
    private AppEventListener f3960c;

    public static final class Builder {
        private boolean f3956a = false;
        private AppEventListener f3957b;

        public final PublisherAdViewOptions build() {
            return new PublisherAdViewOptions();
        }

        public final Builder setAppEventListener(AppEventListener appEventListener) {
            this.f3957b = appEventListener;
            return this;
        }

        public final Builder setManualImpressionsEnabled(boolean z) {
            this.f3956a = z;
            return this;
        }
    }

    private PublisherAdViewOptions(Builder builder) {
        this.f3958a = builder.f3956a;
        this.f3960c = builder.f3957b;
        this.f3959b = this.f3960c != null ? new aaa(this.f3960c) : null;
    }

    PublisherAdViewOptions(boolean z, IBinder iBinder) {
        this.f3958a = z;
        this.f3959b = iBinder != null ? abi.m3989a(iBinder) : null;
    }

    public final AppEventListener getAppEventListener() {
        return this.f3960c;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.f3958a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5963a(parcel, 1, getManualImpressionsEnabled());
        li.m5959a(parcel, 2, this.f3959b == null ? null : this.f3959b.asBinder());
        li.m5967b(parcel, a);
    }

    public final abh zzbh() {
        return this.f3959b;
    }
}
