package com.bumptech.glide.load.p049c;

import android.text.TextUtils;
import java.net.URL;

public class C1284d {
    public final URL f3654a;
    public final C1285e f3655b;
    public final String f3656c;
    public String f3657d;
    public URL f3658e;

    public C1284d(String str) {
        this(str, C1285e.f3660b);
    }

    private C1284d(String str, C1285e c1285e) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("String url must not be empty or null: " + str);
        } else if (c1285e == null) {
            throw new IllegalArgumentException("Headers must not be null");
        } else {
            this.f3656c = str;
            this.f3654a = null;
            this.f3655b = c1285e;
        }
    }

    public C1284d(URL url) {
        this(url, C1285e.f3660b);
    }

    private C1284d(URL url, C1285e c1285e) {
        if (url == null) {
            throw new IllegalArgumentException("URL must not be null!");
        } else if (c1285e == null) {
            throw new IllegalArgumentException("Headers must not be null");
        } else {
            this.f3654a = url;
            this.f3656c = null;
            this.f3655b = c1285e;
        }
    }

    public final String m3376a() {
        return this.f3656c != null ? this.f3656c : this.f3654a.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1284d)) {
            return false;
        }
        C1284d c1284d = (C1284d) obj;
        return m3376a().equals(c1284d.m3376a()) && this.f3655b.equals(c1284d.f3655b);
    }

    public int hashCode() {
        return (m3376a().hashCode() * 31) + this.f3655b.hashCode();
    }

    public String toString() {
        return m3376a() + '\n' + this.f3655b.toString();
    }
}
