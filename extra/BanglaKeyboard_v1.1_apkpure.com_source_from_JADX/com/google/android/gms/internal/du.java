package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@aqv
public final class du {
    public final AtomicReference<Object> f5929a = new AtomicReference(null);
    private final AtomicReference<ThreadPoolExecutor> f5930b = new AtomicReference(null);
    private final Object f5931c = new Object();
    private String f5932d = null;
    private AtomicBoolean f5933e = new AtomicBoolean(false);
    private final AtomicInteger f5934f = new AtomicInteger(-1);
    private final AtomicReference<Object> f5935g = new AtomicReference(null);
    private ConcurrentMap<String, Method> f5936h = new ConcurrentHashMap(9);

    static Bundle m5287a(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("_aeid", Long.parseLong(str));
        return bundle;
    }

    private final Method m5288e(Context context, String str) {
        Method method = (Method) this.f5936h.get(str);
        if (method != null) {
            return method;
        }
        try {
            method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.f5936h.put(str, method);
            return method;
        } catch (Exception e) {
            m5295a(e, str, false);
            return null;
        }
    }

    private final Method m5289f(Context context, String str) {
        Method method = (Method) this.f5936h.get(str);
        if (method != null) {
            return method;
        }
        try {
            method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f5936h.put(str, method);
            return method;
        } catch (Exception e) {
            m5295a(e, str, false);
            return null;
        }
    }

    private final Method m5290j(Context context) {
        Method method = (Method) this.f5936h.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
            this.f5936h.put("logEventInternal", method);
            return method;
        } catch (Exception e) {
            m5295a(e, "logEventInternal", true);
            return null;
        }
    }

    final Object m5291a(String str, Context context) {
        Object obj = null;
        if (m5297a(context, "com.google.android.gms.measurement.AppMeasurement", this.f5935g, true)) {
            try {
                obj = m5289f(context, str).invoke(this.f5935g.get(), new Object[0]);
            } catch (Exception e) {
                m5295a(e, str, true);
            }
        }
        return obj;
    }

    public final void m5292a(Context context, String str) {
        if (m5296a(context)) {
            Bundle a = m5287a(str);
            a.putInt("_r", 1);
            m5293a(context, "_ac", a);
        }
    }

    final void m5293a(Context context, String str, Bundle bundle) {
        if (m5297a(context, "com.google.android.gms.measurement.AppMeasurement", this.f5935g, true)) {
            Method j = m5290j(context);
            try {
                j.invoke(this.f5935g.get(), new Object[]{"am", str, bundle});
            } catch (Exception e) {
                m5295a(e, "logEventInternal", true);
            }
        }
    }

    final void m5294a(Context context, String str, String str2) {
        if (m5297a(context, "com.google.android.gms.measurement.AppMeasurement", this.f5935g, true)) {
            Method e = m5288e(context, str2);
            try {
                e.invoke(this.f5935g.get(), new Object[]{str});
                new StringBuilder((String.valueOf(str2).length() + 37) + String.valueOf(str).length()).append("Invoke Firebase method ").append(str2).append(", Ad Unit Id: ").append(str);
                es.m5373a();
            } catch (Exception e2) {
                m5295a(e2, str2, false);
            }
        }
    }

    public final void m5295a(Exception exception, String str, boolean z) {
        if (!this.f5933e.get()) {
            id.m5371a(new StringBuilder(String.valueOf(str).length() + 30).append("Invoke Firebase method ").append(str).append(" error.").toString(), exception);
            if (z) {
                id.m5370a("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firbase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f5933e.set(true);
            }
        }
    }

    public final boolean m5296a(Context context) {
        if (!((Boolean) zzbv.zzen().m4217a(ado.ae)).booleanValue() || this.f5933e.get()) {
            return false;
        }
        if (this.f5934f.get() == -1) {
            aak.m4022a();
            if (!hz.m5627c(context)) {
                aak.m4022a();
                if (hz.m5630f(context)) {
                    id.m5370a("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                    this.f5934f.set(0);
                }
            }
            this.f5934f.set(1);
        }
        return this.f5934f.get() == 1;
    }

    public final boolean m5297a(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{context}));
            } catch (Exception e) {
                m5295a(e, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    public final void m5298b(Context context, String str) {
        if (m5296a(context)) {
            m5293a(context, "_ai", m5287a(str));
        }
    }

    public final boolean m5299b(Context context) {
        return ((Boolean) zzbv.zzen().m4217a(ado.af)).booleanValue() && m5296a(context);
    }

    public final void m5300c(Context context, String str) {
        if (m5296a(context)) {
            m5293a(context, "_aq", m5287a(str));
        }
    }

    public final boolean m5301c(Context context) {
        return ((Boolean) zzbv.zzen().m4217a(ado.ag)).booleanValue() && m5296a(context);
    }

    public final Method m5302d(Context context, String str) {
        Method method = (Method) this.f5936h.get(str);
        if (method != null) {
            return method;
        }
        try {
            method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, String.class, String.class});
            this.f5936h.put(str, method);
            return method;
        } catch (Exception e) {
            m5295a(e, str, false);
            return null;
        }
    }

    public final boolean m5303d(Context context) {
        return ((Boolean) zzbv.zzen().m4217a(ado.ah)).booleanValue() && m5296a(context);
    }

    public final boolean m5304e(Context context) {
        return ((Boolean) zzbv.zzen().m4217a(ado.ai)).booleanValue() && m5296a(context);
    }

    public final String m5305f(Context context) {
        if (!m5296a(context)) {
            return "";
        }
        if (!m5297a(context, "com.google.android.gms.measurement.AppMeasurement", this.f5935g, true)) {
            return "";
        }
        try {
            String str = (String) m5289f(context, "getCurrentScreenName").invoke(this.f5935g.get(), new Object[0]);
            if (str == null) {
                str = (String) m5289f(context, "getCurrentScreenClass").invoke(this.f5935g.get(), new Object[0]);
            }
            return str == null ? "" : str;
        } catch (Exception e) {
            m5295a(e, "getCurrentScreenName", false);
            return "";
        }
    }

    public final String m5306g(Context context) {
        if (!m5296a(context)) {
            return null;
        }
        synchronized (this.f5931c) {
            if (this.f5932d != null) {
                String str = this.f5932d;
                return str;
            }
            this.f5932d = (String) m5291a("getGmpAppId", context);
            str = this.f5932d;
            return str;
        }
    }

    public final String m5307h(Context context) {
        if (!m5296a(context)) {
            return null;
        }
        long longValue = ((Long) zzbv.zzen().m4217a(ado.ao)).longValue();
        if (longValue < 0) {
            return (String) m5291a("getAppInstanceId", context);
        }
        if (this.f5930b.get() == null) {
            this.f5930b.compareAndSet(null, new ThreadPoolExecutor(((Integer) zzbv.zzen().m4217a(ado.ap)).intValue(), ((Integer) zzbv.zzen().m4217a(ado.ap)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new dx()));
        }
        Future submit = ((ThreadPoolExecutor) this.f5930b.get()).submit(new dw(this, context));
        try {
            return (String) submit.get(longValue, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            submit.cancel(true);
            return e instanceof TimeoutException ? "TIME_OUT" : null;
        }
    }

    public final String m5308i(Context context) {
        if (!m5296a(context)) {
            return null;
        }
        Object a = m5291a("generateEventId", context);
        return a != null ? a.toString() : null;
    }
}
