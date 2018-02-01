package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.p056a.C1401c;

@aqv
public final class co implements RewardedVideoAd {
    private final cc f5853a;
    private final Context f5854b;
    private final Object f5855c = new Object();
    private RewardedVideoAdListener f5856d;

    public co(Context context, cc ccVar) {
        this.f5853a = ccVar;
        this.f5854b = context;
    }

    private final void m5207a(String str, acd com_google_android_gms_internal_acd) {
        synchronized (this.f5855c) {
            if (this.f5853a == null) {
                return;
            }
            try {
                this.f5853a.mo1722a(new zzadp(zy.m7086a(this.f5854b, com_google_android_gms_internal_acd), str));
            } catch (Throwable e) {
                id.m5371a("Could not forward loadAd to RewardedVideoAd", e);
            }
        }
    }

    public final void destroy() {
        destroy(null);
    }

    public final void destroy(Context context) {
        synchronized (this.f5855c) {
            if (this.f5853a == null) {
                return;
            }
            try {
                this.f5853a.mo1728c(C1401c.m3584a((Object) context));
            } catch (Throwable e) {
                id.m5371a("Could not forward destroy to RewardedVideoAd", e);
            }
        }
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.f5853a != null) {
                return this.f5853a.mo1731f();
            }
        } catch (Throwable e) {
            id.m5371a("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }

    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        RewardedVideoAdListener rewardedVideoAdListener;
        synchronized (this.f5855c) {
            rewardedVideoAdListener = this.f5856d;
        }
        return rewardedVideoAdListener;
    }

    public final String getUserId() {
        id.m5370a("RewardedVideoAd.getUserId() is deprecated. Please do not call this method.");
        return null;
    }

    public final boolean isLoaded() {
        boolean z = false;
        synchronized (this.f5855c) {
            if (this.f5853a == null) {
            } else {
                try {
                    z = this.f5853a.mo1726b();
                } catch (Throwable e) {
                    id.m5371a("Could not forward isLoaded to RewardedVideoAd", e);
                }
            }
        }
        return z;
    }

    public final void loadAd(String str, AdRequest adRequest) {
        m5207a(str, adRequest.zzaz());
    }

    public final void loadAd(String str, PublisherAdRequest publisherAdRequest) {
        m5207a(str, publisherAdRequest.zzaz());
    }

    public final void pause() {
        pause(null);
    }

    public final void pause(Context context) {
        synchronized (this.f5855c) {
            if (this.f5853a == null) {
                return;
            }
            try {
                this.f5853a.mo1720a(C1401c.m3584a((Object) context));
            } catch (Throwable e) {
                id.m5371a("Could not forward pause to RewardedVideoAd", e);
            }
        }
    }

    public final void resume() {
        resume(null);
    }

    public final void resume(Context context) {
        synchronized (this.f5855c) {
            if (this.f5853a == null) {
                return;
            }
            try {
                this.f5853a.mo1725b(C1401c.m3584a((Object) context));
            } catch (Throwable e) {
                id.m5371a("Could not forward resume to RewardedVideoAd", e);
            }
        }
    }

    public final void setImmersiveMode(boolean z) {
        synchronized (this.f5855c) {
            if (this.f5853a != null) {
                try {
                    this.f5853a.mo1724a(z);
                } catch (Throwable e) {
                    id.m5371a("Could not forward setImmersiveMode to RewardedVideoAd", e);
                }
            }
        }
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        synchronized (this.f5855c) {
            this.f5856d = rewardedVideoAdListener;
            if (this.f5853a != null) {
                try {
                    this.f5853a.mo1721a(new cm(rewardedVideoAdListener));
                } catch (Throwable e) {
                    id.m5371a("Could not forward setRewardedVideoAdListener to RewardedVideoAd", e);
                }
            }
        }
    }

    public final void setUserId(String str) {
        id.m5370a("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
    }

    public final void show() {
        synchronized (this.f5855c) {
            if (this.f5853a == null) {
                return;
            }
            try {
                this.f5853a.mo1719a();
            } catch (Throwable e) {
                id.m5371a("Could not forward show to RewardedVideoAd", e);
            }
        }
    }
}
