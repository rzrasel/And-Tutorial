package com.google.android.gms.internal;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.MediaController;
import android.widget.VideoView;
import java.util.HashMap;
import java.util.Map;

public final class cs extends FrameLayout implements OnCompletionListener, OnErrorListener, OnPreparedListener {
    private final ge f1144a;
    private final MediaController f1145b;
    private final ct f1146c = new ct(this);
    private final VideoView f1147d;
    private long f1148e;
    private String f1149f;

    public cs(Context context, ge geVar) {
        super(context);
        this.f1144a = geVar;
        this.f1147d = new VideoView(context);
        addView(this.f1147d, new LayoutParams(-1, -1, 17));
        this.f1145b = new MediaController(context);
        this.f1146c.m1839a();
        this.f1147d.setOnCompletionListener(this);
        this.f1147d.setOnPreparedListener(this);
        this.f1147d.setOnErrorListener(this);
    }

    public static void m1827a(ge geVar, String str, String str2) {
        Object obj = str2 == null ? 1 : null;
        Map hashMap = new HashMap(obj != null ? 2 : 3);
        hashMap.put("what", str);
        if (obj == null) {
            hashMap.put("extra", str2);
        }
        m1829a(geVar, "error", hashMap);
    }

    private static void m1828a(ge geVar, String str, String str2, String str3) {
        Map hashMap = new HashMap(2);
        hashMap.put(str2, str3);
        m1829a(geVar, str, hashMap);
    }

    private static void m1829a(ge geVar, String str, Map map) {
        map.put("event", str);
        geVar.m2090a("onVideoEvent", map);
    }

    public final void m1830a() {
        ct ctVar = this.f1146c;
        ctVar.f1151b = true;
        fz.f1434a.removeCallbacks(ctVar.f1150a);
        this.f1147d.stopPlayback();
    }

    public final void m1831a(int i) {
        this.f1147d.seekTo(i);
    }

    public final void m1832a(MotionEvent motionEvent) {
        this.f1147d.dispatchTouchEvent(motionEvent);
    }

    public final void m1833a(String str) {
        this.f1149f = str;
    }

    public final void m1834a(boolean z) {
        if (z) {
            this.f1147d.setMediaController(this.f1145b);
            return;
        }
        this.f1145b.hide();
        this.f1147d.setMediaController(null);
    }

    public final void m1835b() {
        if (TextUtils.isEmpty(this.f1149f)) {
            m1827a(this.f1144a, "no_src", null);
        } else {
            this.f1147d.setVideoPath(this.f1149f);
        }
    }

    public final void m1836c() {
        this.f1147d.pause();
    }

    public final void m1837d() {
        this.f1147d.start();
    }

    public final void m1838e() {
        long currentPosition = (long) this.f1147d.getCurrentPosition();
        if (this.f1148e != currentPosition) {
            m1828a(this.f1144a, "timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
            this.f1148e = currentPosition;
        }
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        m1829a(this.f1144a, "ended", new HashMap(1));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        m1827a(this.f1144a, String.valueOf(i), String.valueOf(i2));
        return true;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        m1828a(this.f1144a, "canplaythrough", "duration", String.valueOf(((float) this.f1147d.getDuration()) / 1000.0f));
    }
}
