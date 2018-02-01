package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;

@aqv
public final class aqq implements aqt {
    private static final Object f5661a = new Object();
    private static aqt f5662b = null;
    private final Object f5663c = new Object();
    private final Context f5664d;
    private final String f5665e;
    private final zzajk f5666f;
    private final WeakHashMap<Thread, Boolean> f5667g = new WeakHashMap();

    private aqq(Context context, String str, zzajk com_google_android_gms_internal_zzajk) {
        this.f5664d = context;
        this.f5665e = str;
        this.f5666f = com_google_android_gms_internal_zzajk;
        Thread thread = Looper.getMainLooper().getThread();
        if (thread != null) {
            synchronized (this.f5663c) {
                this.f5667g.put(thread, Boolean.valueOf(true));
            }
            thread.setUncaughtExceptionHandler(new aqs(this, thread.getUncaughtExceptionHandler()));
        }
        Thread.setDefaultUncaughtExceptionHandler(new aqr(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    public static aqt m5088a(Context context, zzajk com_google_android_gms_internal_zzajk) {
        synchronized (f5661a) {
            if (f5662b == null) {
                if (((Boolean) zzbv.zzen().m4217a(ado.f4889b)).booleanValue()) {
                    String str = "unknown";
                    try {
                        str = context.getApplicationContext().getPackageName();
                    } catch (Throwable th) {
                        id.m5370a("Cannot obtain package name, proceeding.");
                    }
                    f5662b = new aqq(context.getApplicationContext(), str, com_google_android_gms_internal_zzajk);
                } else {
                    f5662b = new aqu();
                }
            }
        }
        return f5662b;
    }

    private final String m5089a(Class cls, Throwable th, String str) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        boolean z = false;
        try {
            z = lm.m5976a(this.f5664d).m5974a();
        } catch (Throwable th2) {
            id.m5372a(6);
        }
        zzbv.zzea();
        return new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", VERSION.RELEASE).appendQueryParameter("api", String.valueOf(VERSION.SDK_INT)).appendQueryParameter("device", gb.m5478c()).appendQueryParameter("js", this.f5666f.f7706a).appendQueryParameter("appid", this.f5665e).appendQueryParameter("exceptiontype", cls.getName()).appendQueryParameter("stacktrace", stringWriter.toString()).appendQueryParameter("eids", TextUtils.join(",", ado.m4218a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "166993180").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", zzbv.zzee().f6017b).toString();
    }

    private static boolean m5090a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith((String) zzbv.zzen().m4217a(ado.f4891d))) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(aqv.class);
        } catch (Exception e) {
            String str2 = "Fail to check class type for class ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            id.m5372a(3);
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void m5091a(java.lang.Throwable r11) {
        /*
        r10 = this;
        r1 = 1;
        r3 = 0;
        if (r11 == 0) goto L_0x0046;
    L_0x0004:
        r2 = r3;
        r0 = r3;
        r5 = r11;
    L_0x0007:
        if (r5 == 0) goto L_0x003a;
    L_0x0009:
        r6 = r5.getStackTrace();
        r7 = r6.length;
        r4 = r3;
    L_0x000f:
        if (r4 >= r7) goto L_0x0034;
    L_0x0011:
        r8 = r6[r4];
        r9 = r8.getClassName();
        r9 = m5090a(r9);
        if (r9 == 0) goto L_0x001e;
    L_0x001d:
        r0 = r1;
    L_0x001e:
        r9 = r10.getClass();
        r9 = r9.getName();
        r8 = r8.getClassName();
        r8 = r9.equals(r8);
        if (r8 == 0) goto L_0x0031;
    L_0x0030:
        r2 = r1;
    L_0x0031:
        r4 = r4 + 1;
        goto L_0x000f;
    L_0x0034:
        r4 = r5.getCause();
        r5 = r4;
        goto L_0x0007;
    L_0x003a:
        if (r0 == 0) goto L_0x0046;
    L_0x003c:
        if (r2 != 0) goto L_0x0046;
    L_0x003e:
        if (r1 == 0) goto L_0x0045;
    L_0x0040:
        r0 = "";
        r10.mo2018a(r11, r0);
    L_0x0045:
        return;
    L_0x0046:
        r1 = r3;
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aqq.a(java.lang.Throwable):void");
    }

    public final void mo2018a(Throwable th, String str) {
        Throwable th2;
        if (((Boolean) zzbv.zzen().m4217a(ado.f4890c)).booleanValue()) {
            th2 = th;
        } else {
            Throwable th3;
            LinkedList linkedList = new LinkedList();
            for (th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4;
                th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                Object obj = null;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (m5090a(stackTraceElement.getClassName())) {
                        obj = 1;
                        arrayList.add(stackTraceElement);
                    } else {
                        String className = stackTraceElement.getClassName();
                        Object obj2 = (TextUtils.isEmpty(className) || !(className.startsWith("android.") || className.startsWith("java."))) ? null : 1;
                        if (obj2 != null) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (obj != null) {
                    th4 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th4.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                } else {
                    th4 = th2;
                }
                th2 = th4;
            }
        }
        if (th2 != null) {
            Class cls = th.getClass();
            List arrayList2 = new ArrayList();
            arrayList2.add(m5089a(cls, th2, str));
            zzbv.zzea();
            gb.m5452a(arrayList2, zzbv.zzee().m5349g());
        }
    }
}
