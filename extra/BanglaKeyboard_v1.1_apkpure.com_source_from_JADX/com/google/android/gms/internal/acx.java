package com.google.android.gms.internal;

import com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks;

public final class acx extends aca {
    private final VideoLifecycleCallbacks f4845a;

    public acx(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.f4845a = videoLifecycleCallbacks;
    }

    public final void mo1708a() {
        this.f4845a.onVideoStart();
    }

    public final void mo1709a(boolean z) {
        this.f4845a.onVideoMute(z);
    }

    public final void mo1710b() {
        this.f4845a.onVideoPlay();
    }

    public final void mo1711c() {
        this.f4845a.onVideoPause();
    }

    public final void mo1712d() {
        this.f4845a.onVideoEnd();
    }
}
