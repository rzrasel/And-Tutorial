package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.MeasureSpec;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.zzie;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
@aqv
public final class zzd extends zzy implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnVideoSizeChangedListener, SurfaceTextureListener {
    private static final Map<Integer, String> f4228c = new HashMap();
    private final zzar f4229d;
    private final boolean f4230e;
    private int f4231f = 0;
    private int f4232g = 0;
    private MediaPlayer f4233h;
    private Uri f4234i;
    private int f4235j;
    private int f4236k;
    private int f4237l;
    private int f4238m;
    private int f4239n;
    private zzap f4240o;
    private boolean f4241p;
    private int f4242q;
    private zzx f4243r;

    static {
        if (VERSION.SDK_INT >= 17) {
            f4228c.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
            f4228c.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
            f4228c.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
            f4228c.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
            f4228c.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        f4228c.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
        f4228c.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
        f4228c.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
        f4228c.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        f4228c.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
        f4228c.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
        f4228c.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
        f4228c.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
        f4228c.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
        if (VERSION.SDK_INT >= 19) {
            f4228c.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            f4228c.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public zzd(Context context, boolean z, boolean z2, zzaq com_google_android_gms_ads_internal_overlay_zzaq, zzar com_google_android_gms_ads_internal_overlay_zzar) {
        super(context);
        setSurfaceTextureListener(this);
        this.f4229d = com_google_android_gms_ads_internal_overlay_zzar;
        this.f4241p = z;
        this.f4230e = z2;
        this.f4229d.zza(this);
    }

    private final void m3690a() {
        Throwable e;
        String valueOf;
        es.m5373a();
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f4234i != null && surfaceTexture != null) {
            m3693a(false);
            try {
                SurfaceTexture zznj;
                zzbv.zzes();
                this.f4233h = new MediaPlayer();
                this.f4233h.setOnBufferingUpdateListener(this);
                this.f4233h.setOnCompletionListener(this);
                this.f4233h.setOnErrorListener(this);
                this.f4233h.setOnInfoListener(this);
                this.f4233h.setOnPreparedListener(this);
                this.f4233h.setOnVideoSizeChangedListener(this);
                this.f4237l = 0;
                if (this.f4241p) {
                    this.f4240o = new zzap(getContext());
                    this.f4240o.zza(surfaceTexture, getWidth(), getHeight());
                    this.f4240o.start();
                    zznj = this.f4240o.zznj();
                    if (zznj == null) {
                        this.f4240o.zzni();
                        this.f4240o = null;
                    }
                    this.f4233h.setDataSource(getContext(), this.f4234i);
                    zzbv.zzet();
                    this.f4233h.setSurface(new Surface(zznj));
                    this.f4233h.setAudioStreamType(3);
                    this.f4233h.setScreenOnWhilePlaying(true);
                    this.f4233h.prepareAsync();
                    m3692a(1);
                }
                zznj = surfaceTexture;
                this.f4233h.setDataSource(getContext(), this.f4234i);
                zzbv.zzet();
                this.f4233h.setSurface(new Surface(zznj));
                this.f4233h.setAudioStreamType(3);
                this.f4233h.setScreenOnWhilePlaying(true);
                this.f4233h.prepareAsync();
                m3692a(1);
            } catch (IOException e2) {
                e = e2;
                valueOf = String.valueOf(this.f4234i);
                id.m5371a(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed to initialize MediaPlayer at ").append(valueOf).toString(), e);
                onError(this.f4233h, 1, 0);
            } catch (IllegalArgumentException e3) {
                e = e3;
                valueOf = String.valueOf(this.f4234i);
                id.m5371a(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed to initialize MediaPlayer at ").append(valueOf).toString(), e);
                onError(this.f4233h, 1, 0);
            } catch (IllegalStateException e4) {
                e = e4;
                valueOf = String.valueOf(this.f4234i);
                id.m5371a(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed to initialize MediaPlayer at ").append(valueOf).toString(), e);
                onError(this.f4233h, 1, 0);
            }
        }
    }

    private final void m3691a(float f) {
        if (this.f4233h != null) {
            try {
                this.f4233h.setVolume(f, f);
                return;
            } catch (IllegalStateException e) {
                return;
            }
        }
        id.m5370a("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
    }

    private final void m3692a(int i) {
        if (i == 3) {
            this.f4229d.zznm();
            this.b.zznm();
        } else if (this.f4231f == 3) {
            this.f4229d.zznn();
            this.b.zznn();
        }
        this.f4231f = i;
    }

    private final void m3693a(boolean z) {
        es.m5373a();
        if (this.f4240o != null) {
            this.f4240o.zzni();
            this.f4240o = null;
        }
        if (this.f4233h != null) {
            this.f4233h.reset();
            this.f4233h.release();
            this.f4233h = null;
            m3692a(0);
            if (z) {
                this.f4232g = 0;
                this.f4232g = 0;
            }
        }
    }

    private final void m3694b() {
        if (this.f4230e && m3695c() && this.f4233h.getCurrentPosition() > 0 && this.f4232g != 3) {
            es.m5373a();
            m3691a(0.0f);
            this.f4233h.start();
            int currentPosition = this.f4233h.getCurrentPosition();
            long a = zzbv.zzeg().mo1669a();
            while (m3695c() && this.f4233h.getCurrentPosition() == currentPosition) {
                if (zzbv.zzeg().mo1669a() - a > 250) {
                    break;
                }
            }
            this.f4233h.pause();
            zzmk();
        }
    }

    private final boolean m3695c() {
        return (this.f4233h == null || this.f4231f == -1 || this.f4231f == 0 || this.f4231f == 1) ? false : true;
    }

    public final int getCurrentPosition() {
        return m3695c() ? this.f4233h.getCurrentPosition() : 0;
    }

    public final int getDuration() {
        return m3695c() ? this.f4233h.getDuration() : -1;
    }

    public final int getVideoHeight() {
        return this.f4233h != null ? this.f4233h.getVideoHeight() : 0;
    }

    public final int getVideoWidth() {
        return this.f4233h != null ? this.f4233h.getVideoWidth() : 0;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f4237l = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        es.m5373a();
        m3692a(5);
        this.f4232g = 5;
        gb.f6131a.post(new C1456k(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) f4228c.get(Integer.valueOf(i));
        String str2 = (String) f4228c.get(Integer.valueOf(i2));
        id.m5370a(new StringBuilder((String.valueOf(str).length() + 38) + String.valueOf(str2).length()).append("AdMediaPlayerView MediaPlayer error: ").append(str).append(":").append(str2).toString());
        m3692a(-1);
        this.f4232g = -1;
        gb.f6131a.post(new C1457l(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) f4228c.get(Integer.valueOf(i));
        String str2 = (String) f4228c.get(Integer.valueOf(i2));
        new StringBuilder((String.valueOf(str).length() + 37) + String.valueOf(str2).length()).append("AdMediaPlayerView MediaPlayer info: ").append(str).append(":").append(str2);
        es.m5373a();
        return true;
    }

    protected final void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(this.f4235j, i);
        int defaultSize2 = getDefaultSize(this.f4236k, i2);
        if (this.f4235j > 0 && this.f4236k > 0 && this.f4240o == null) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            int mode2 = MeasureSpec.getMode(i2);
            defaultSize2 = MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                if (this.f4235j * defaultSize2 < this.f4236k * size) {
                    defaultSize = (this.f4235j * defaultSize2) / this.f4236k;
                } else if (this.f4235j * defaultSize2 > this.f4236k * size) {
                    defaultSize2 = (this.f4236k * size) / this.f4235j;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode == 1073741824) {
                defaultSize = (this.f4236k * size) / this.f4235j;
                if (mode2 != Integer.MIN_VALUE || defaultSize <= defaultSize2) {
                    defaultSize2 = defaultSize;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode2 == 1073741824) {
                defaultSize = (this.f4235j * defaultSize2) / this.f4236k;
                if (mode == Integer.MIN_VALUE && defaultSize > size) {
                    defaultSize = size;
                }
            } else {
                int i3 = this.f4235j;
                defaultSize = this.f4236k;
                if (mode2 != Integer.MIN_VALUE || defaultSize <= defaultSize2) {
                    defaultSize2 = defaultSize;
                    defaultSize = i3;
                } else {
                    defaultSize = (this.f4235j * defaultSize2) / this.f4236k;
                }
                if (mode == Integer.MIN_VALUE && r1 > size) {
                    defaultSize2 = (this.f4236k * size) / this.f4235j;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        if (this.f4240o != null) {
            this.f4240o.zzf(defaultSize, defaultSize2);
        }
        if (VERSION.SDK_INT == 16) {
            if ((this.f4238m > 0 && this.f4238m != defaultSize) || (this.f4239n > 0 && this.f4239n != defaultSize2)) {
                m3694b();
            }
            this.f4238m = defaultSize;
            this.f4239n = defaultSize2;
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        es.m5373a();
        m3692a(2);
        this.f4229d.zzmw();
        gb.f6131a.post(new C1455j(this));
        this.f4235j = mediaPlayer.getVideoWidth();
        this.f4236k = mediaPlayer.getVideoHeight();
        if (this.f4242q != 0) {
            seekTo(this.f4242q);
        }
        m3694b();
        int i = this.f4235j;
        new StringBuilder(62).append("AdMediaPlayerView stream dimensions: ").append(i).append(" x ").append(this.f4236k);
        id.m5372a(4);
        if (this.f4232g == 3) {
            play();
        }
        zzmk();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        es.m5373a();
        m3690a();
        gb.f6131a.post(new C1458m(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        es.m5373a();
        if (this.f4233h != null && this.f4242q == 0) {
            this.f4242q = this.f4233h.getCurrentPosition();
        }
        if (this.f4240o != null) {
            this.f4240o.zzni();
        }
        gb.f6131a.post(new C1460o(this));
        m3693a(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Object obj = 1;
        es.m5373a();
        Object obj2 = this.f4232g == 3 ? 1 : null;
        if (!(this.f4235j == i && this.f4236k == i2)) {
            obj = null;
        }
        if (!(this.f4233h == null || obj2 == null || r1 == null)) {
            if (this.f4242q != 0) {
                seekTo(this.f4242q);
            }
            play();
        }
        if (this.f4240o != null) {
            this.f4240o.zzf(i, i2);
        }
        gb.f6131a.post(new C1459n(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f4229d.zzb(this);
        this.a.zza(surfaceTexture, this.f4243r);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        new StringBuilder(57).append("AdMediaPlayerView size changed: ").append(i).append(" x ").append(i2);
        es.m5373a();
        this.f4235j = mediaPlayer.getVideoWidth();
        this.f4236k = mediaPlayer.getVideoHeight();
        if (this.f4235j != 0 && this.f4236k != 0) {
            requestLayout();
        }
    }

    public final void pause() {
        es.m5373a();
        if (m3695c() && this.f4233h.isPlaying()) {
            this.f4233h.pause();
            m3692a(4);
            gb.f6131a.post(new C1462q(this));
        }
        this.f4232g = 4;
    }

    public final void play() {
        es.m5373a();
        if (m3695c()) {
            this.f4233h.start();
            m3692a(3);
            this.a.zzmx();
            gb.f6131a.post(new C1461p(this));
        }
        this.f4232g = 3;
    }

    public final void seekTo(int i) {
        new StringBuilder(34).append("AdMediaPlayerView seek ").append(i);
        es.m5373a();
        if (m3695c()) {
            this.f4233h.seekTo(i);
            this.f4242q = 0;
            return;
        }
        this.f4242q = i;
    }

    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzie a = zzie.m7102a(parse);
        if (a != null) {
            parse = Uri.parse(a.f7732a);
        }
        this.f4234i = parse;
        this.f4242q = 0;
        m3690a();
        requestLayout();
        invalidate();
    }

    public final void stop() {
        es.m5373a();
        if (this.f4233h != null) {
            this.f4233h.stop();
            this.f4233h.release();
            this.f4233h = null;
            m3692a(0);
            this.f4232g = 0;
        }
        this.f4229d.onStop();
    }

    public final String toString() {
        String name = getClass().getName();
        String toHexString = Integer.toHexString(hashCode());
        return new StringBuilder((String.valueOf(name).length() + 1) + String.valueOf(toHexString).length()).append(name).append("@").append(toHexString).toString();
    }

    public final void zza(float f, float f2) {
        if (this.f4240o != null) {
            this.f4240o.zzb(f, f2);
        }
    }

    public final void zza(zzx com_google_android_gms_ads_internal_overlay_zzx) {
        this.f4243r = com_google_android_gms_ads_internal_overlay_zzx;
    }

    public final String zzmg() {
        String str = "MediaPlayer";
        String valueOf = String.valueOf(this.f4241p ? " spherical" : "");
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public final void zzmk() {
        m3691a(this.b.zznp());
    }
}
