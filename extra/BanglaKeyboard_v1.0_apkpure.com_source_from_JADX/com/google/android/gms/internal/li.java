package com.google.android.gms.internal;

import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public abstract class li implements la {
    protected MotionEvent f1931a;
    protected DisplayMetrics f1932b;
    protected ng f1933c;
    private nh f1934d;

    protected li(Context context, ng ngVar, nh nhVar) {
        this.f1933c = ngVar;
        this.f1934d = nhVar;
        try {
            this.f1932b = context.getResources().getDisplayMetrics();
        } catch (UnsupportedOperationException e) {
            this.f1932b = new DisplayMetrics();
            this.f1932b.density = 1.0f;
        }
    }

    private String m2537a(Context context, String str, boolean z) {
        try {
            byte[] b;
            synchronized (this) {
                m2538a();
                if (z) {
                    mo961c(context);
                } else {
                    mo960b(context);
                }
                b = m2539b();
            }
            if (b.length == 0) {
                return Integer.toString(5);
            }
            byte[] bArr;
            if (b.length > 239) {
                m2538a();
                m2543a(20, 1);
                b = m2539b();
            }
            if (b.length < 239) {
                bArr = new byte[(239 - b.length)];
                new SecureRandom().nextBytes(bArr);
                b = ByteBuffer.allocate(240).put((byte) b.length).put(b).put(bArr).array();
            } else {
                b = ByteBuffer.allocate(240).put((byte) b.length).put(b).array();
            }
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(b);
            b = ByteBuffer.allocate(NotificationCompat.FLAG_LOCAL_ONLY).put(instance.digest()).put(b).array();
            bArr = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
            new gz().m2136a(b, bArr);
            if (str != null && str.length() > 0) {
                if (str.length() > 32) {
                    str = str.substring(0, 32);
                }
                new mv(str.getBytes("UTF-8")).m2630a(bArr);
            }
            return this.f1933c.mo894a(bArr);
        } catch (NoSuchAlgorithmException e) {
            return Integer.toString(7);
        } catch (UnsupportedEncodingException e2) {
            return Integer.toString(7);
        } catch (IOException e3) {
            return Integer.toString(3);
        }
    }

    private void m2538a() {
        this.f1934d.mo964a();
    }

    private byte[] m2539b() {
        return this.f1934d.mo967b();
    }

    public final String mo938a(Context context) {
        return m2537a(context, null, false);
    }

    public final String mo939a(Context context, String str) {
        return m2537a(context, str, true);
    }

    public final void mo940a(int i, int i2, int i3) {
        if (this.f1931a != null) {
            this.f1931a.recycle();
        }
        this.f1931a = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * this.f1932b.density, ((float) i2) * this.f1932b.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
    }

    protected final void m2543a(int i, long j) {
        this.f1934d.mo965a(i, j);
    }

    protected final void m2544a(int i, String str) {
        this.f1934d.mo966a(i, str);
    }

    public final void mo941a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f1931a != null) {
                this.f1931a.recycle();
            }
            this.f1931a = MotionEvent.obtain(motionEvent);
        }
    }

    protected abstract void mo960b(Context context);

    protected abstract void mo961c(Context context);
}
