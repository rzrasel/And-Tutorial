package com.bumptech.glide.load.p044b.p046a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.p042h.C1163h;

final class C1186a implements C1185g {
    private final C1184b f3487a = new C1184b();
    private final C1190e<C1182a, Bitmap> f3488b = new C1190e();

    static class C1182a implements C1181h {
        int f3482a;
        int f3483b;
        Config f3484c;
        private final C1184b f3485d;

        public C1182a(C1184b c1184b) {
            this.f3485d = c1184b;
        }

        public final void mo1334a() {
            this.f3485d.m3205a(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1182a)) {
                return false;
            }
            C1182a c1182a = (C1182a) obj;
            return this.f3482a == c1182a.f3482a && this.f3483b == c1182a.f3483b && this.f3484c == c1182a.f3484c;
        }

        public final int hashCode() {
            return (this.f3484c != null ? this.f3484c.hashCode() : 0) + (((this.f3482a * 31) + this.f3483b) * 31);
        }

        public final String toString() {
            return C1186a.m3215c(this.f3482a, this.f3483b, this.f3484c);
        }
    }

    static class C1184b extends C1183b<C1182a> {
        C1184b() {
        }

        public final C1182a m3207a(int i, int i2, Config config) {
            C1182a c1182a = (C1182a) m3206b();
            c1182a.f3482a = i;
            c1182a.f3483b = i2;
            c1182a.f3484c = config;
            return c1182a;
        }

        protected final /* synthetic */ C1181h mo1335a() {
            return new C1182a(this);
        }
    }

    C1186a() {
    }

    static String m3215c(int i, int i2, Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    public final Bitmap mo1336a() {
        return (Bitmap) this.f3488b.m3236a();
    }

    public final Bitmap mo1337a(int i, int i2, Config config) {
        return (Bitmap) this.f3488b.m3237a(this.f3487a.m3207a(i, i2, config));
    }

    public final void mo1338a(Bitmap bitmap) {
        this.f3488b.m3238a(this.f3487a.m3207a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    public final String mo1339b(int i, int i2, Config config) {
        return C1186a.m3215c(i, i2, config);
    }

    public final String mo1340b(Bitmap bitmap) {
        return C1186a.m3215c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    public final int mo1341c(Bitmap bitmap) {
        return C1163h.m3150a(bitmap);
    }

    public final String toString() {
        return "AttributeStrategy:\n  " + this.f3488b;
    }
}
