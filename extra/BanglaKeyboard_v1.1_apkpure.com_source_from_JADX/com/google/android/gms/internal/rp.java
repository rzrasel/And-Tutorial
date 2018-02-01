package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class rp {
    private static String f7054a = rp.class.getSimpleName();
    private final np f7055b;
    private final String f7056c;
    private final String f7057d;
    private final int f7058e = 2;
    private volatile Method f7059f = null;
    private final Class<?>[] f7060g;
    private CountDownLatch f7061h = new CountDownLatch(1);

    public rp(np npVar, String str, String str2, Class<?>... clsArr) {
        this.f7055b = npVar;
        this.f7056c = str;
        this.f7057d = str2;
        this.f7060g = clsArr;
        this.f7055b.f6729c.submit(new rq(this));
    }

    private final String m6504a(byte[] bArr, String str) {
        nj njVar = this.f7055b.f6731e;
        return new String(nj.m6068a(bArr, str), "UTF-8");
    }

    static /* synthetic */ void m6505a(rp rpVar) {
        try {
            Class loadClass = rpVar.f7055b.f6730d.loadClass(rpVar.m6504a(rpVar.f7055b.f6732f, rpVar.f7056c));
            if (loadClass != null) {
                rpVar.f7059f = loadClass.getMethod(rpVar.m6504a(rpVar.f7055b.f6732f, rpVar.f7057d), rpVar.f7060g);
                if (rpVar.f7059f == null) {
                    rpVar.f7061h.countDown();
                } else {
                    rpVar.f7061h.countDown();
                }
            }
        } catch (nk e) {
        } catch (UnsupportedEncodingException e2) {
        } catch (ClassNotFoundException e3) {
        } catch (NoSuchMethodException e4) {
        } catch (NullPointerException e5) {
        } finally {
            rpVar.f7061h.countDown();
        }
    }

    public final Method m6506a() {
        if (this.f7059f != null) {
            return this.f7059f;
        }
        try {
            return this.f7061h.await(2, TimeUnit.SECONDS) ? this.f7059f : null;
        } catch (InterruptedException e) {
            return null;
        }
    }
}
