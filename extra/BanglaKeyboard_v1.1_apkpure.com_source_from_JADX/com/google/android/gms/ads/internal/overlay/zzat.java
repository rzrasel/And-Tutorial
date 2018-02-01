package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.google.android.gms.internal.aqv;

@TargetApi(14)
@aqv
public final class zzat implements OnAudioFocusChangeListener {
    private final AudioManager f4218a;
    private final C1454i f4219b;
    private boolean f4220c;
    private boolean f4221d;
    private boolean f4222e;
    private float f4223f = 1.0f;

    public zzat(Context context, C1454i c1454i) {
        this.f4218a = (AudioManager) context.getSystemService("audio");
        this.f4219b = c1454i;
    }

    private final void m3688a() {
        boolean z = true;
        boolean z2 = this.f4221d && !this.f4222e && this.f4223f > 0.0f;
        if (z2 && !this.f4220c) {
            if (!(this.f4218a == null || this.f4220c)) {
                if (this.f4218a.requestAudioFocus(this, 3, 2) != 1) {
                    z = false;
                }
                this.f4220c = z;
            }
            this.f4219b.zzmk();
        } else if (!z2 && this.f4220c) {
            if (this.f4218a != null && this.f4220c) {
                if (this.f4218a.abandonAudioFocus(this) != 0) {
                    z = false;
                }
                this.f4220c = z;
            }
            this.f4219b.zzmk();
        }
    }

    public final void onAudioFocusChange(int i) {
        this.f4220c = i > 0;
        this.f4219b.zzmk();
    }

    public final void setMuted(boolean z) {
        this.f4222e = z;
        m3688a();
    }

    public final void zzb(float f) {
        this.f4223f = f;
        m3688a();
    }

    public final void zznm() {
        this.f4221d = true;
        m3688a();
    }

    public final void zznn() {
        this.f4221d = false;
        m3688a();
    }

    public final float zznp() {
        return this.f4220c ? this.f4222e ? 0.0f : this.f4223f : 0.0f;
    }
}
