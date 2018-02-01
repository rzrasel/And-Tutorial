package com.google.android.gms.internal;

import android.app.Activity;
import android.support.v4.p018f.C0480b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Collections;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public final class anv extends aof {
    private static Set<String> f5461t;
    String f5462a = "top-right";
    boolean f5463b = true;
    int f5464c = 0;
    int f5465d = 0;
    int f5466e = -1;
    int f5467f = 0;
    int f5468g = 0;
    int f5469h = -1;
    final Object f5470i = new Object();
    final jf f5471j;
    final Activity f5472k;
    zzjb f5473l;
    ImageView f5474m;
    LinearLayout f5475n;
    aog f5476o;
    PopupWindow f5477p;
    RelativeLayout f5478q;
    ViewGroup f5479r;

    static {
        String[] strArr = new String[]{"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"};
        Object c0480b = new C0480b((byte) 0);
        Collections.addAll(c0480b, strArr);
        f5461t = Collections.unmodifiableSet(c0480b);
    }

    public anv(jf jfVar, aog com_google_android_gms_internal_aog) {
        super(jfVar, "resize");
        this.f5471j = jfVar;
        this.f5472k = jfVar.mo2157e();
        this.f5476o = com_google_android_gms_internal_aog;
    }

    final void m4986a(int i, int i2) {
        zzbv.zzea();
        int i3 = i2 - gb.m5481c(this.f5472k)[0];
        int i4 = this.f5469h;
        try {
            this.f5451s.zzb("onSizeChanged", new JSONObject().put("x", i).put("y", i3).put("width", i4).put("height", this.f5466e));
        } catch (JSONException e) {
            id.m5372a(6);
        }
    }

    public final void m4987a(boolean z) {
        synchronized (this.f5470i) {
            if (this.f5477p != null) {
                this.f5477p.dismiss();
                RelativeLayout relativeLayout = this.f5478q;
                jf jfVar = this.f5471j;
                if (jfVar == null) {
                    throw null;
                }
                relativeLayout.removeView((View) jfVar);
                if (this.f5479r != null) {
                    this.f5479r.removeView(this.f5474m);
                    ViewGroup viewGroup = this.f5479r;
                    jfVar = this.f5471j;
                    if (jfVar == null) {
                        throw null;
                    }
                    viewGroup.addView((View) jfVar);
                    this.f5471j.mo2143a(this.f5473l);
                }
                if (z) {
                    m4983b("default");
                    if (this.f5476o != null) {
                        this.f5476o.zzcm();
                    }
                }
                this.f5477p = null;
                this.f5478q = null;
                this.f5479r = null;
                this.f5475n = null;
            }
        }
    }

    final int[] m4988a() {
        int i;
        zzbv.zzea();
        int[] b = gb.m5475b(this.f5472k);
        zzbv.zzea();
        int[] c = gb.m5481c(this.f5472k);
        int i2 = b[0];
        int i3 = b[1];
        if (this.f5469h < 50 || this.f5469h > i2) {
            id.m5370a("Width is too small or too large.");
            i3 = 0;
        } else if (this.f5466e < 50 || this.f5466e > i3) {
            id.m5370a("Height is too small or too large.");
            i3 = 0;
        } else if (this.f5466e == i3 && this.f5469h == i2) {
            id.m5370a("Cannot resize to a full-screen ad.");
            i3 = 0;
        } else {
            if (this.f5463b) {
                String str = this.f5462a;
                i3 = -1;
                switch (str.hashCode()) {
                    case -1364013995:
                        if (str.equals("center")) {
                            i3 = 2;
                            break;
                        }
                        break;
                    case -1012429441:
                        if (str.equals("top-left")) {
                            i3 = 0;
                            break;
                        }
                        break;
                    case -655373719:
                        if (str.equals("bottom-left")) {
                            i3 = 3;
                            break;
                        }
                        break;
                    case 1163912186:
                        if (str.equals("bottom-right")) {
                            i3 = 5;
                            break;
                        }
                        break;
                    case 1288627767:
                        if (str.equals("bottom-center")) {
                            i3 = 4;
                            break;
                        }
                        break;
                    case 1755462605:
                        if (str.equals("top-center")) {
                            i3 = 1;
                            break;
                        }
                        break;
                }
                switch (i3) {
                    case 0:
                        i = this.f5467f + this.f5464c;
                        i3 = this.f5465d + this.f5468g;
                        break;
                    case 1:
                        i = ((this.f5464c + this.f5467f) + (this.f5469h / 2)) - 25;
                        i3 = this.f5465d + this.f5468g;
                        break;
                    case 2:
                        i = ((this.f5464c + this.f5467f) + (this.f5469h / 2)) - 25;
                        i3 = ((this.f5465d + this.f5468g) + (this.f5466e / 2)) - 25;
                        break;
                    case 3:
                        i = this.f5467f + this.f5464c;
                        i3 = ((this.f5465d + this.f5468g) + this.f5466e) - 50;
                        break;
                    case 4:
                        i = ((this.f5464c + this.f5467f) + (this.f5469h / 2)) - 25;
                        i3 = ((this.f5465d + this.f5468g) + this.f5466e) - 50;
                        break;
                    case 5:
                        i = ((this.f5464c + this.f5467f) + this.f5469h) - 50;
                        i3 = ((this.f5465d + this.f5468g) + this.f5466e) - 50;
                        break;
                    default:
                        i = ((this.f5464c + this.f5467f) + this.f5469h) - 50;
                        i3 = this.f5465d + this.f5468g;
                        break;
                }
                if (i < 0 || i + 50 > i2 || r0 < c[0] || r0 + 50 > c[1]) {
                    i3 = 0;
                }
            }
            i3 = 1;
        }
        if (i3 == 0) {
            return null;
        }
        if (this.f5463b) {
            return new int[]{this.f5464c + this.f5467f, this.f5465d + this.f5468g};
        }
        zzbv.zzea();
        b = gb.m5475b(this.f5472k);
        zzbv.zzea();
        c = gb.m5481c(this.f5472k);
        i2 = b[0];
        i3 = this.f5464c + this.f5467f;
        i = this.f5465d + this.f5468g;
        if (i3 < 0) {
            i3 = 0;
        } else if (this.f5469h + i3 > i2) {
            i3 = i2 - this.f5469h;
        }
        if (i < c[0]) {
            i = c[0];
        } else if (this.f5466e + i > c[1]) {
            i = c[1] - this.f5466e;
        }
        return new int[]{i3, i};
    }

    public final boolean m4989b() {
        boolean z;
        synchronized (this.f5470i) {
            z = this.f5477p != null;
        }
        return z;
    }
}
