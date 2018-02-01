package com.google.android.gms.internal;

import com.google.android.gms.ads.reward.RewardItem;

@aqv
public final class ck implements RewardItem {
    private final bz f5851a;

    public ck(bz bzVar) {
        this.f5851a = bzVar;
    }

    public final int getAmount() {
        int i = 0;
        if (this.f5851a != null) {
            try {
                i = this.f5851a.mo2023b();
            } catch (Throwable e) {
                id.m5371a("Could not forward getAmount to RewardItem", e);
            }
        }
        return i;
    }

    public final String getType() {
        String str = null;
        if (this.f5851a != null) {
            try {
                str = this.f5851a.mo2022a();
            } catch (Throwable e) {
                id.m5371a("Could not forward getType to RewardItem", e);
            }
        }
        return str;
    }
}
