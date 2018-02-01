package com.bumptech.glide.load.p044b.p046a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class C1193f implements C1187c {
    private static final Config f3495a = Config.ARGB_8888;
    private final C1185g f3496b;
    private final Set<Config> f3497c;
    private final int f3498d;
    private final C1191a f3499e;
    private int f3500f;
    private int f3501g;
    private int f3502h;
    private int f3503i;
    private int f3504j;
    private int f3505k;

    private interface C1191a {
    }

    private static class C1192b implements C1191a {
        private C1192b() {
        }
    }

    public C1193f(int i) {
        C1185g c1197i = VERSION.SDK_INT >= 19 ? new C1197i() : new C1186a();
        Set hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Config.values()));
        if (VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        this(i, c1197i, Collections.unmodifiableSet(hashSet));
    }

    private C1193f(int i, C1185g c1185g, Set<Config> set) {
        this.f3498d = i;
        this.f3500f = i;
        this.f3496b = c1185g;
        this.f3497c = set;
        this.f3499e = new C1192b();
    }

    private void m3239b() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m3241c();
        }
    }

    private synchronized void m3240b(int i) {
        while (this.f3501g > i) {
            Bitmap a = this.f3496b.mo1336a();
            if (a == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m3241c();
                }
                this.f3501g = 0;
            } else {
                this.f3501g -= this.f3496b.mo1341c(a);
                a.recycle();
                this.f3505k++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    new StringBuilder("Evicting bitmap=").append(this.f3496b.mo1340b(a));
                }
                m3239b();
            }
        }
    }

    private void m3241c() {
        new StringBuilder("Hits=").append(this.f3502h).append(", misses=").append(this.f3503i).append(", puts=").append(this.f3504j).append(", evictions=").append(this.f3505k).append(", currentSize=").append(this.f3501g).append(", maxSize=").append(this.f3500f).append("\nStrategy=").append(this.f3496b);
    }

    public final synchronized Bitmap mo1342a(int i, int i2, Config config) {
        Bitmap b;
        b = mo1346b(i, i2, config);
        if (b != null) {
            b.eraseColor(0);
        }
        return b;
    }

    public final void mo1343a() {
        Log.isLoggable("LruBitmapPool", 3);
        m3240b(0);
    }

    @SuppressLint({"InlinedApi"})
    public final void mo1344a(int i) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i >= 60) {
            mo1343a();
        } else if (i >= 40) {
            m3240b(this.f3500f / 2);
        }
    }

    public final synchronized boolean mo1345a(Bitmap bitmap) {
        boolean z;
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (bitmap.isMutable() && this.f3496b.mo1341c(bitmap) <= this.f3500f && this.f3497c.contains(bitmap.getConfig())) {
            int c = this.f3496b.mo1341c(bitmap);
            this.f3496b.mo1338a(bitmap);
            this.f3504j++;
            this.f3501g = c + this.f3501g;
            if (Log.isLoggable("LruBitmapPool", 2)) {
                new StringBuilder("Put bitmap in pool=").append(this.f3496b.mo1340b(bitmap));
            }
            m3239b();
            m3240b(this.f3500f);
            z = true;
        } else {
            if (Log.isLoggable("LruBitmapPool", 2)) {
                new StringBuilder("Reject bitmap from pool, bitmap: ").append(this.f3496b.mo1340b(bitmap)).append(", is mutable: ").append(bitmap.isMutable()).append(", is allowed config: ").append(this.f3497c.contains(bitmap.getConfig()));
            }
            z = false;
        }
        return z;
    }

    @TargetApi(12)
    public final synchronized Bitmap mo1346b(int i, int i2, Config config) {
        Bitmap a;
        a = this.f3496b.mo1337a(i, i2, config != null ? config : f3495a);
        if (a == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                new StringBuilder("Missing bitmap=").append(this.f3496b.mo1339b(i, i2, config));
            }
            this.f3503i++;
        } else {
            this.f3502h++;
            this.f3501g -= this.f3496b.mo1341c(a);
            if (VERSION.SDK_INT >= 12) {
                a.setHasAlpha(true);
            }
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            new StringBuilder("Get bitmap=").append(this.f3496b.mo1339b(i, i2, config));
        }
        m3239b();
        return a;
    }
}
