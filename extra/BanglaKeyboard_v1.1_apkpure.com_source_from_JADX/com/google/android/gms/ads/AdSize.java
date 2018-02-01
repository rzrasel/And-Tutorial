package com.google.android.gms.ads;

import android.content.Context;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.google.android.gms.internal.aak;
import com.google.android.gms.internal.hz;
import com.google.android.gms.internal.zzjb;

public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final int FULL_WIDTH = -1;
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "300x250_as");
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
    public static final AdSize zzaku = new AdSize(50, 50, "50x50_mb");
    private final int f3926a;
    private final int f3927b;
    private final String f3928c;

    public AdSize(int i, int i2) {
        String valueOf = i == -1 ? "FULL" : String.valueOf(i);
        String valueOf2 = i2 == -2 ? "AUTO" : String.valueOf(i2);
        String str = "_as";
        this(i, i2, new StringBuilder(((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()).append(valueOf).append("x").append(valueOf2).append(str).toString());
    }

    AdSize(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i);
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.f3926a = i;
            this.f3927b = i2;
            this.f3928c = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f3926a == adSize.f3926a && this.f3927b == adSize.f3927b && this.f3928c.equals(adSize.f3928c);
    }

    public final int getHeight() {
        return this.f3927b;
    }

    public final int getHeightInPixels(Context context) {
        switch (this.f3927b) {
            case -4:
            case -3:
                return -1;
            case -2:
                return zzjb.m7107b(context.getResources().getDisplayMetrics());
            default:
                aak.m4022a();
                return hz.m5612a(context, this.f3927b);
        }
    }

    public final int getWidth() {
        return this.f3926a;
    }

    public final int getWidthInPixels(Context context) {
        switch (this.f3926a) {
            case -4:
            case -3:
                return -1;
            case -1:
                return zzjb.m7105a(context.getResources().getDisplayMetrics());
            default:
                aak.m4022a();
                return hz.m5612a(context, this.f3926a);
        }
    }

    public final int hashCode() {
        return this.f3928c.hashCode();
    }

    public final boolean isAutoHeight() {
        return this.f3927b == -2;
    }

    public final boolean isFluid() {
        return this.f3926a == -3 && this.f3927b == -4;
    }

    public final boolean isFullWidth() {
        return this.f3926a == -1;
    }

    public final String toString() {
        return this.f3928c;
    }
}
