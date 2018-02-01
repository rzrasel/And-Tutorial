package com.bumptech.glide.load.p044b.p045b;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public final class C1215i {
    public final int f3547a;
    public final int f3548b;
    private final Context f3549c;

    interface C1213b {
        int mo1358a();

        int mo1359b();
    }

    private static class C1214a implements C1213b {
        private final DisplayMetrics f3546a;

        public C1214a(DisplayMetrics displayMetrics) {
            this.f3546a = displayMetrics;
        }

        public final int mo1358a() {
            return this.f3546a.widthPixels;
        }

        public final int mo1359b() {
            return this.f3546a.heightPixels;
        }
    }

    public C1215i(Context context) {
        this(context, (ActivityManager) context.getSystemService("activity"), new C1214a(context.getResources().getDisplayMetrics()));
    }

    private C1215i(Context context, ActivityManager activityManager, C1213b c1213b) {
        this.f3549c = context;
        int round = Math.round((C1215i.m3300a(activityManager) ? 0.33f : 0.4f) * ((float) ((activityManager.getMemoryClass() * 1024) * 1024)));
        int a = (c1213b.mo1358a() * c1213b.mo1359b()) * 4;
        int i = a * 4;
        a *= 2;
        if (a + i <= round) {
            this.f3548b = a;
            this.f3547a = i;
        } else {
            int round2 = Math.round(((float) round) / 6.0f);
            this.f3548b = round2 * 2;
            this.f3547a = round2 * 4;
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            new StringBuilder("Calculated memory cache size: ").append(m3299a(this.f3548b)).append(" pool size: ").append(m3299a(this.f3547a)).append(" memory class limited? ").append(a + i > round).append(" max size: ").append(m3299a(round)).append(" memoryClass: ").append(activityManager.getMemoryClass()).append(" isLowMemoryDevice: ").append(C1215i.m3300a(activityManager));
        }
    }

    private String m3299a(int i) {
        return Formatter.formatFileSize(this.f3549c, (long) i);
    }

    @TargetApi(19)
    private static boolean m3300a(ActivityManager activityManager) {
        return VERSION.SDK_INT >= 19 ? activityManager.isLowRamDevice() : VERSION.SDK_INT < 11;
    }
}
