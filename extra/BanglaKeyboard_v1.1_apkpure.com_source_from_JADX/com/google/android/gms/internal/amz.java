package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@aqv
public final class amz implements NativeMediationAdRequest {
    private final Date f5408a;
    private final int f5409b;
    private final Set<String> f5410c;
    private final boolean f5411d;
    private final Location f5412e;
    private final int f5413f;
    private final zzot f5414g;
    private final List<String> f5415h = new ArrayList();
    private final boolean f5416i;
    private final Map<String, Boolean> f5417j = new HashMap();

    public amz(Date date, int i, Set<String> set, Location location, boolean z, int i2, zzot com_google_android_gms_internal_zzot, List<String> list, boolean z2) {
        this.f5408a = date;
        this.f5409b = i;
        this.f5410c = set;
        this.f5412e = location;
        this.f5411d = z;
        this.f5413f = i2;
        this.f5414g = com_google_android_gms_internal_zzot;
        this.f5416i = z2;
        String str = "custom:";
        if (list != null) {
            for (String str2 : list) {
                if (str2.startsWith(str)) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.f5417j.put(split[1], Boolean.valueOf(true));
                        } else if ("false".equals(split[2])) {
                            this.f5417j.put(split[1], Boolean.valueOf(false));
                        }
                    }
                } else {
                    this.f5415h.add(str2);
                }
            }
        }
    }

    public final Date getBirthday() {
        return this.f5408a;
    }

    public final int getGender() {
        return this.f5409b;
    }

    public final Set<String> getKeywords() {
        return this.f5410c;
    }

    public final Location getLocation() {
        return this.f5412e;
    }

    public final NativeAdOptions getNativeAdOptions() {
        if (this.f5414g == null) {
            return null;
        }
        Builder requestMultipleImages = new Builder().setReturnUrlsForImageAssets(this.f5414g.f7788b).setImageOrientation(this.f5414g.f7789c).setRequestMultipleImages(this.f5414g.f7790d);
        if (this.f5414g.f7787a >= 2) {
            requestMultipleImages.setAdChoicesPlacement(this.f5414g.f7791e);
        }
        if (this.f5414g.f7787a >= 3 && this.f5414g.f7792f != null) {
            requestMultipleImages.setVideoOptions(new VideoOptions(this.f5414g.f7792f));
        }
        return requestMultipleImages.build();
    }

    public final boolean isAppInstallAdRequested() {
        return this.f5415h != null && this.f5415h.contains("2");
    }

    public final boolean isContentAdRequested() {
        return this.f5415h != null && this.f5415h.contains("1");
    }

    public final boolean isDesignedForFamilies() {
        return this.f5416i;
    }

    public final boolean isTesting() {
        return this.f5411d;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.f5413f;
    }

    public final boolean zzmc() {
        return this.f5415h != null && this.f5415h.contains("3");
    }

    public final Map<String, Boolean> zzmd() {
        return this.f5417j;
    }
}
