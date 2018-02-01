package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.C1517u;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.aec;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.jf;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@aqv
public final class zzaa extends FrameLayout implements zzx {
    zzy f4148a;
    long f4149b;
    private final jf f4150c;
    private final FrameLayout f4151d;
    private final aec f4152e;
    private final C1453h f4153f;
    private final long f4154g;
    private boolean f4155h;
    private boolean f4156i;
    private boolean f4157j;
    private boolean f4158k;
    private long f4159l;
    private String f4160m;
    private Bitmap f4161n;
    private ImageView f4162o;
    private boolean f4163p;

    public zzaa(Context context, jf jfVar, int i, boolean z, aec com_google_android_gms_internal_aec, zzaq com_google_android_gms_ads_internal_overlay_zzaq) {
        super(context);
        this.f4150c = jfVar;
        this.f4152e = com_google_android_gms_internal_aec;
        this.f4151d = new FrameLayout(context);
        addView(this.f4151d, new LayoutParams(-1, -1));
        C1517u.m3870a(jfVar.mo2159g());
        this.f4148a = jfVar.mo2159g().zzanq.zza(context, jfVar, i, z, com_google_android_gms_internal_aec, com_google_android_gms_ads_internal_overlay_zzaq);
        if (this.f4148a != null) {
            this.f4151d.addView(this.f4148a, new LayoutParams(-1, -1, 17));
            if (((Boolean) zzbv.zzen().m4217a(ado.f4906r)).booleanValue()) {
                zzne();
            }
        }
        this.f4162o = new ImageView(context);
        this.f4154g = ((Long) zzbv.zzen().m4217a(ado.f4910v)).longValue();
        this.f4158k = ((Boolean) zzbv.zzen().m4217a(ado.f4908t)).booleanValue();
        if (this.f4152e != null) {
            this.f4152e.m4235a("spinner_used", this.f4158k ? "1" : "0");
        }
        this.f4153f = new C1453h(this);
        if (this.f4148a != null) {
            this.f4148a.zza(this);
        }
        if (this.f4148a == null) {
            zzj("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    private final boolean m3675a() {
        return this.f4162o.getParent() != null;
    }

    private final void m3676b() {
        if (this.f4150c.mo2157e() != null && this.f4156i && !this.f4157j) {
            this.f4150c.mo2157e().getWindow().clearFlags(128);
            this.f4156i = false;
        }
    }

    public static void zza(jf jfVar, String str) {
        Map hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
        hashMap.put("error", str);
        jfVar.mo2145a("onVideoEvent", hashMap);
    }

    public static void zzc(jf jfVar, Map<String, List<Map<String, Object>>> map) {
        Map hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
        hashMap.put("mimeTypes", map);
        jfVar.mo2145a("onVideoEvent", hashMap);
    }

    public static void zzh(jf jfVar) {
        Map hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
        jfVar.mo2145a("onVideoEvent", hashMap);
    }

    final void m3677a(String str, String... strArr) {
        Map hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, str);
        int length = strArr.length;
        int i = 0;
        Object obj = null;
        while (i < length) {
            Object obj2 = strArr[i];
            if (obj != null) {
                hashMap.put(obj, obj2);
                obj2 = null;
            }
            i++;
            obj = obj2;
        }
        this.f4150c.mo2145a("onVideoEvent", hashMap);
    }

    public final void destroy() {
        this.f4153f.f4128a = true;
        if (this.f4148a != null) {
            this.f4148a.stop();
        }
        m3676b();
    }

    public final void onPaused() {
        m3677a("pause", new String[0]);
        m3676b();
        this.f4155h = false;
    }

    public final void pause() {
        if (this.f4148a != null) {
            this.f4148a.pause();
        }
    }

    public final void play() {
        if (this.f4148a != null) {
            this.f4148a.play();
        }
    }

    public final void seekTo(int i) {
        if (this.f4148a != null) {
            this.f4148a.seekTo(i);
        }
    }

    public final void zza(float f, float f2) {
        if (this.f4148a != null) {
            this.f4148a.zza(f, f2);
        }
    }

    public final void zzb(float f) {
        if (this.f4148a != null) {
            zzy com_google_android_gms_ads_internal_overlay_zzy = this.f4148a;
            com_google_android_gms_ads_internal_overlay_zzy.f4227b.zzb(f);
            com_google_android_gms_ads_internal_overlay_zzy.zzmk();
        }
    }

    public final void zzbq(String str) {
        this.f4160m = str;
    }

    public final void zzd(int i, int i2) {
        if (this.f4158k) {
            int max = Math.max(i / ((Integer) zzbv.zzen().m4217a(ado.f4909u)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) zzbv.zzen().m4217a(ado.f4909u)).intValue(), 1);
            if (this.f4161n == null || this.f4161n.getWidth() != max || this.f4161n.getHeight() != max2) {
                this.f4161n = Bitmap.createBitmap(max, max2, Config.ARGB_8888);
                this.f4163p = false;
            }
        }
    }

    public final void zzd(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0) {
            ViewGroup.LayoutParams layoutParams = new LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.f4151d.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    @TargetApi(14)
    public final void zze(MotionEvent motionEvent) {
        if (this.f4148a != null) {
            this.f4148a.dispatchTouchEvent(motionEvent);
        }
    }

    public final void zzj(String str, String str2) {
        m3677a("error", "what", str, "extra", str2);
    }

    public final void zzmv() {
        C1453h c1453h = this.f4153f;
        c1453h.f4128a = false;
        c1453h.m3669a();
        gb.f6131a.post(new C1446a(this));
    }

    public final void zzmw() {
        if (this.f4148a != null && this.f4159l == 0) {
            float duration = ((float) this.f4148a.getDuration()) / 1000.0f;
            int videoWidth = this.f4148a.getVideoWidth();
            int videoHeight = this.f4148a.getVideoHeight();
            m3677a("canplaythrough", "duration", String.valueOf(duration), "videoWidth", String.valueOf(videoWidth), "videoHeight", String.valueOf(videoHeight));
        }
    }

    public final void zzmx() {
        if (!(this.f4150c.mo2157e() == null || this.f4156i)) {
            this.f4157j = (this.f4150c.mo2157e().getWindow().getAttributes().flags & 128) != 0;
            if (!this.f4157j) {
                this.f4150c.mo2157e().getWindow().addFlags(128);
                this.f4156i = true;
            }
        }
        this.f4155h = true;
    }

    public final void zzmy() {
        m3677a("ended", new String[0]);
        m3676b();
    }

    public final void zzmz() {
        if (!(!this.f4163p || this.f4161n == null || m3675a())) {
            this.f4162o.setImageBitmap(this.f4161n);
            this.f4162o.invalidate();
            this.f4151d.addView(this.f4162o, new LayoutParams(-1, -1));
            this.f4151d.bringChildToFront(this.f4162o);
        }
        this.f4153f.f4128a = true;
        this.f4159l = this.f4149b;
        gb.f6131a.post(new C1447b(this));
    }

    public final void zzna() {
        if (this.f4155h && m3675a()) {
            this.f4151d.removeView(this.f4162o);
        }
        if (this.f4161n != null) {
            long b = zzbv.zzeg().mo1670b();
            if (this.f4148a.getBitmap(this.f4161n) != null) {
                this.f4163p = true;
            }
            b = zzbv.zzeg().mo1670b() - b;
            if (es.m5373a()) {
                new StringBuilder(46).append("Spinner frame grab took ").append(b).append("ms");
                es.m5373a();
            }
            if (b > this.f4154g) {
                id.m5370a("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f4158k = false;
                this.f4161n = null;
                if (this.f4152e != null) {
                    this.f4152e.m4235a("spinner_jank", Long.toString(b));
                }
            }
        }
    }

    public final void zznb() {
        if (this.f4148a != null) {
            if (TextUtils.isEmpty(this.f4160m)) {
                m3677a("no_src", new String[0]);
            } else {
                this.f4148a.setVideoPath(this.f4160m);
            }
        }
    }

    public final void zznc() {
        if (this.f4148a != null) {
            zzy com_google_android_gms_ads_internal_overlay_zzy = this.f4148a;
            com_google_android_gms_ads_internal_overlay_zzy.f4227b.setMuted(true);
            com_google_android_gms_ads_internal_overlay_zzy.zzmk();
        }
    }

    public final void zznd() {
        if (this.f4148a != null) {
            zzy com_google_android_gms_ads_internal_overlay_zzy = this.f4148a;
            com_google_android_gms_ads_internal_overlay_zzy.f4227b.setMuted(false);
            com_google_android_gms_ads_internal_overlay_zzy.zzmk();
        }
    }

    @TargetApi(14)
    public final void zzne() {
        if (this.f4148a != null) {
            View textView = new TextView(this.f4148a.getContext());
            String str = "AdMob - ";
            String valueOf = String.valueOf(this.f4148a.zzmg());
            textView.setText(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f4151d.addView(textView, new LayoutParams(-2, -2, 17));
            this.f4151d.bringChildToFront(textView);
        }
    }
}
