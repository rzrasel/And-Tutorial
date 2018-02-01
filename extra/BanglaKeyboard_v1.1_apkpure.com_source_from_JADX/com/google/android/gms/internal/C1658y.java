package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class C1658y {
    public static boolean f7464a;
    private static String f7465b;

    static class C1657a {
        public static final boolean f7461a = C1658y.f7464a;
        private final List<aw> f7462b = new ArrayList();
        private boolean f7463c = false;

        C1657a() {
        }

        public final synchronized void m7014a(String str) {
            long j;
            this.f7463c = true;
            if (this.f7462b.size() == 0) {
                j = 0;
            } else {
                j = ((aw) this.f7462b.get(this.f7462b.size() - 1)).f5698c - ((aw) this.f7462b.get(0)).f5698c;
            }
            if (j > 0) {
                long j2 = ((aw) this.f7462b.get(0)).f5698c;
                C1658y.m7017b("(%-4d ms) %s", Long.valueOf(j), str);
                j = j2;
                for (aw awVar : this.f7462b) {
                    C1658y.m7017b("(+%-4d) [%2d] %s", Long.valueOf(awVar.f5698c - j), Long.valueOf(awVar.f5697b), awVar.f5696a);
                    j = awVar.f5698c;
                }
            }
        }

        public final synchronized void m7015a(String str, long j) {
            if (this.f7463c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f7462b.add(new aw(str, j, SystemClock.elapsedRealtime()));
        }

        protected final void finalize() {
            if (!this.f7463c) {
                m7014a("Request on the loose");
                C1658y.m7018c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    static {
        String str = "Volley";
        f7465b = str;
        f7464a = Log.isLoggable(str, 2);
    }

    public static void m7016a(String str, Object... objArr) {
        if (f7464a) {
            C1658y.m7020e(str, objArr);
        }
    }

    public static void m7017b(String str, Object... objArr) {
        C1658y.m7020e(str, objArr);
    }

    public static void m7018c(String str, Object... objArr) {
        C1658y.m7020e(str, objArr);
    }

    public static void m7019d(String str, Object... objArr) {
        C1658y.m7020e(str, objArr);
    }

    private static String m7020e(String str, Object... objArr) {
        String methodName;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        String str2 = "<unknown>";
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClass().equals(C1658y.class)) {
                str2 = stackTrace[i].getClassName();
                str2 = str2.substring(str2.lastIndexOf(46) + 1);
                str2 = str2.substring(str2.lastIndexOf(36) + 1);
                methodName = stackTrace[i].getMethodName();
                methodName = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(methodName).length()).append(str2).append(".").append(methodName).toString();
                break;
            }
        }
        methodName = str2;
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), methodName, str});
    }
}
