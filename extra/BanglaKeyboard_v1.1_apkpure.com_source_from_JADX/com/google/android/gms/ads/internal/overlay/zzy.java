package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;
import com.google.android.gms.internal.aqv;

@TargetApi(14)
@aqv
public abstract class zzy extends TextureView implements C1454i {
    protected final zzak f4226a = new zzak();
    protected final zzat f4227b;

    public zzy(Context context) {
        super(context);
        this.f4227b = new zzat(context, this);
    }

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void pause();

    public abstract void play();

    public abstract void seekTo(int i);

    public abstract void setVideoPath(String str);

    public abstract void stop();

    public abstract void zza(float f, float f2);

    public abstract void zza(zzx com_google_android_gms_ads_internal_overlay_zzx);

    public abstract String zzmg();

    public abstract void zzmk();
}
