package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzbv;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class nd implements nc {
    protected MotionEvent f6673a;
    protected LinkedList<MotionEvent> f6674b = new LinkedList();
    protected long f6675c = 0;
    protected long f6676d = 0;
    protected long f6677e = 0;
    protected long f6678f = 0;
    protected long f6679g = 0;
    protected long f6680h = 0;
    protected long f6681i = 0;
    protected double f6682j;
    protected float f6683k;
    protected float f6684l;
    protected float f6685m;
    protected float f6686n;
    protected boolean f6687o = false;
    protected DisplayMetrics f6688p;
    private double f6689q;
    private double f6690r;
    private boolean f6691s = false;

    protected nd(Context context) {
        try {
            if (((Boolean) zzbv.zzen().m4217a(ado.bx)).booleanValue()) {
                lr.m5991a();
            } else {
                md.m6013a();
            }
            this.f6688p = context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
        }
    }

    private final String m6036a(Context context, String str, boolean z, View view, byte[] bArr) {
        kw kwVar;
        kz kzVar;
        if (bArr != null && bArr.length > 0) {
            try {
                kwVar = (kw) vb.m5894a(new kw(), bArr, bArr.length);
            } catch (va e) {
            }
            if (z) {
                vb a = mo2206a(context, kwVar);
            } else {
                try {
                    vb a2 = mo2205a(context, view);
                    this.f6691s = true;
                    kzVar = a2;
                } catch (GeneralSecurityException e2) {
                    return Integer.toString(7);
                } catch (UnsupportedEncodingException e3) {
                    return Integer.toString(7);
                } catch (Throwable th) {
                    return Integer.toString(3);
                }
            }
            if (kzVar != null || kzVar.m5901e() == 0) {
                return Integer.toString(5);
            }
            Object obj = (!((Boolean) zzbv.zzen().m4217a(ado.bn)).booleanValue() || z) ? 1 : null;
            return lr.m5988a(kzVar, str, obj == null);
        }
        kwVar = null;
        if (z) {
            vb a3 = mo2206a(context, kwVar);
        } else {
            vb a22 = mo2205a(context, view);
            this.f6691s = true;
            kzVar = a22;
        }
        if (kzVar != null) {
        }
        return Integer.toString(5);
    }

    protected abstract long mo2204a(StackTraceElement[] stackTraceElementArr);

    protected abstract kz mo2205a(Context context, View view);

    protected abstract kz mo2206a(Context context, kw kwVar);

    protected abstract oc mo2207a(MotionEvent motionEvent);

    public final String m6041a(Context context, byte[] bArr) {
        if (pd.m6376b()) {
            if (((Boolean) zzbv.zzen().m4217a(ado.bz)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return m6036a(context, null, false, null, bArr);
    }

    public final String zza(Context context) {
        if (pd.m6376b()) {
            if (((Boolean) zzbv.zzen().m4217a(ado.bz)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return m6036a(context, null, false, null, null);
    }

    public final String zza(Context context, String str, View view) {
        return m6036a(context, str, true, view, null);
    }

    public final void zza(int i, int i2, int i3) {
        if (this.f6673a != null) {
            this.f6673a.recycle();
        }
        if (this.f6688p != null) {
            this.f6673a = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * this.f6688p.density, ((float) i2) * this.f6688p.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.f6673a = null;
        }
        this.f6687o = false;
    }

    public final void zza(MotionEvent motionEvent) {
        if (this.f6691s) {
            this.f6678f = 0;
            this.f6677e = 0;
            this.f6676d = 0;
            this.f6675c = 0;
            this.f6679g = 0;
            this.f6681i = 0;
            this.f6680h = 0;
            Iterator it = this.f6674b.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f6674b.clear();
            this.f6673a = null;
            this.f6691s = false;
        }
        if (((Boolean) zzbv.zzen().m4217a(ado.br)).booleanValue()) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f6682j = 0.0d;
                    this.f6689q = (double) motionEvent.getRawX();
                    this.f6690r = (double) motionEvent.getRawY();
                    break;
                case 1:
                case 2:
                    double rawX = (double) motionEvent.getRawX();
                    double rawY = (double) motionEvent.getRawY();
                    double d = rawX - this.f6689q;
                    double d2 = rawY - this.f6690r;
                    this.f6682j = Math.sqrt((d * d) + (d2 * d2)) + this.f6682j;
                    this.f6689q = rawX;
                    this.f6690r = rawY;
                    break;
            }
        }
        switch (motionEvent.getAction()) {
            case 0:
                if (((Boolean) zzbv.zzen().m4217a(ado.bs)).booleanValue()) {
                    this.f6683k = motionEvent.getX();
                    this.f6684l = motionEvent.getY();
                    this.f6685m = motionEvent.getRawX();
                    this.f6686n = motionEvent.getRawY();
                }
                this.f6675c++;
                break;
            case 1:
                this.f6673a = MotionEvent.obtain(motionEvent);
                this.f6674b.add(this.f6673a);
                if (this.f6674b.size() > 6) {
                    ((MotionEvent) this.f6674b.remove()).recycle();
                }
                this.f6677e++;
                try {
                    this.f6679g = mo2204a(new Throwable().getStackTrace());
                    break;
                } catch (nl e) {
                    break;
                }
            case 2:
                this.f6676d += (long) (motionEvent.getHistorySize() + 1);
                try {
                    oc a = mo2207a(motionEvent);
                    Object obj = (a.f6806d == null || a.f6809g == null) ? null : 1;
                    if (obj != null) {
                        this.f6680h += a.f6806d.longValue() + a.f6809g.longValue();
                    }
                    obj = (this.f6688p == null || a.f6807e == null || a.f6810h == null) ? null : 1;
                    if (obj != null) {
                        this.f6681i = (a.f6810h.longValue() + a.f6807e.longValue()) + this.f6681i;
                        break;
                    }
                } catch (nl e2) {
                    break;
                }
                break;
            case 3:
                this.f6678f++;
                break;
        }
        this.f6687o = true;
    }
}
