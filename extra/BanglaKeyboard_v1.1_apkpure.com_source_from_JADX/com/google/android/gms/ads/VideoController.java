package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acx;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.id;

@aqv
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object f3933a = new Object();
    private abv f3934b;
    private VideoLifecycleCallbacks f3935c;

    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public final float getAspectRatio() {
        float f = 0.0f;
        synchronized (this.f3933a) {
            if (this.f3934b == null) {
            } else {
                try {
                    f = this.f3934b.mo1704e();
                } catch (RemoteException e) {
                    id.m5372a(6);
                }
            }
        }
        return f;
    }

    public final int getPlaybackState() {
        int i = 0;
        synchronized (this.f3933a) {
            if (this.f3934b == null) {
            } else {
                try {
                    i = this.f3934b.mo1703d();
                } catch (RemoteException e) {
                    id.m5372a(6);
                }
            }
        }
        return i;
    }

    public final VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.f3933a) {
            videoLifecycleCallbacks = this.f3935c;
        }
        return videoLifecycleCallbacks;
    }

    public final boolean hasVideoContent() {
        boolean z;
        synchronized (this.f3933a) {
            z = this.f3934b != null;
        }
        return z;
    }

    public final boolean isCustomControlsEnabled() {
        boolean z = false;
        synchronized (this.f3933a) {
            if (this.f3934b == null) {
            } else {
                try {
                    z = this.f3934b.mo1707h();
                } catch (RemoteException e) {
                    id.m5372a(6);
                }
            }
        }
        return z;
    }

    public final boolean isMuted() {
        boolean z = true;
        synchronized (this.f3933a) {
            if (this.f3934b == null) {
            } else {
                try {
                    z = this.f3934b.mo1702c();
                } catch (RemoteException e) {
                    id.m5372a(6);
                }
            }
        }
        return z;
    }

    public final void mute(boolean z) {
        synchronized (this.f3933a) {
            if (this.f3934b == null) {
                return;
            }
            try {
                this.f3934b.mo1700a(z);
            } catch (RemoteException e) {
                id.m5372a(6);
            }
        }
    }

    public final void pause() {
        synchronized (this.f3933a) {
            if (this.f3934b == null) {
                return;
            }
            try {
                this.f3934b.mo1701b();
            } catch (RemoteException e) {
                id.m5372a(6);
            }
        }
    }

    public final void play() {
        synchronized (this.f3933a) {
            if (this.f3934b == null) {
                return;
            }
            try {
                this.f3934b.mo1698a();
            } catch (RemoteException e) {
                id.m5372a(6);
            }
        }
    }

    public final void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        C1516t.m3861a((Object) videoLifecycleCallbacks, (Object) "VideoLifecycleCallbacks may not be null.");
        synchronized (this.f3933a) {
            this.f3935c = videoLifecycleCallbacks;
            if (this.f3934b == null) {
                return;
            }
            try {
                this.f3934b.mo1699a(new acx(videoLifecycleCallbacks));
            } catch (RemoteException e) {
                id.m5372a(6);
            }
        }
    }

    public final void zza(abv com_google_android_gms_internal_abv) {
        synchronized (this.f3933a) {
            this.f3934b = com_google_android_gms_internal_abv;
            if (this.f3935c != null) {
                setVideoLifecycleCallbacks(this.f3935c);
            }
        }
    }

    public final abv zzbc() {
        abv com_google_android_gms_internal_abv;
        synchronized (this.f3933a) {
            com_google_android_gms_internal_abv = this.f3934b;
        }
        return com_google_android_gms_internal_abv;
    }
}
