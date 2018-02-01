package com.bumptech.glide.p034c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;

public final class C1096a {
    public int f3247a = 0;
    private int f3248b;
    private int f3249c;
    private Integer f3250d = null;
    private int f3251e;
    private int f3252f = -1;
    private boolean f3253g = false;
    private OutputStream f3254h;
    private Bitmap f3255i;
    private byte[] f3256j;
    private byte[] f3257k;
    private int f3258l;
    private byte[] f3259m;
    private boolean[] f3260n = new boolean[256];
    private int f3261o = 7;
    private int f3262p = -1;
    private boolean f3263q = false;
    private boolean f3264r = true;
    private boolean f3265s = false;
    private int f3266t = 10;
    private boolean f3267u;

    private int m2950a(int i) {
        int i2 = 0;
        if (this.f3259m == null) {
            return -1;
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int i3 = 16777216;
        int length = this.f3259m.length;
        int i4 = 0;
        while (i2 < length) {
            int i5 = i2 + 1;
            i2 = red - (this.f3259m[i2] & 255);
            int i6 = i5 + 1;
            int i7 = green - (this.f3259m[i5] & 255);
            i5 = blue - (this.f3259m[i6] & 255);
            i2 = ((i2 * i2) + (i7 * i7)) + (i5 * i5);
            i7 = i6 / 3;
            if (!this.f3260n[i7] || i2 >= i3) {
                i2 = i3;
                i3 = i4;
            } else {
                i3 = i7;
            }
            i4 = i3;
            i3 = i2;
            i2 = i6 + 1;
        }
        return i4;
    }

    private void m2951a(String str) {
        for (int i = 0; i < str.length(); i++) {
            this.f3254h.write((byte) str.charAt(i));
        }
    }

    private void m2952b() {
        int length = this.f3256j.length;
        int i = length / 3;
        this.f3257k = new byte[i];
        C1098c c1098c = new C1098c(this.f3256j, length, this.f3266t);
        c1098c.m2967c();
        c1098c.m2968d();
        c1098c.m2966b();
        this.f3259m = c1098c.m2965a();
        for (length = 0; length < this.f3259m.length; length += 3) {
            byte b = this.f3259m[length];
            this.f3259m[length] = this.f3259m[length + 2];
            this.f3259m[length + 2] = b;
            this.f3260n[length / 3] = false;
        }
        int i2 = 0;
        for (length = 0; length < i; length++) {
            int i3 = i2 + 1;
            int i4 = i3 + 1;
            i2 = i4 + 1;
            int a = c1098c.m2964a(this.f3256j[i2] & 255, this.f3256j[i3] & 255, this.f3256j[i4] & 255);
            this.f3260n[a] = true;
            this.f3257k[length] = (byte) a;
        }
        this.f3256j = null;
        this.f3258l = 8;
        this.f3261o = 7;
        if (this.f3250d != null) {
            this.f3251e = m2950a(this.f3250d.intValue());
        } else if (this.f3267u) {
            this.f3251e = m2950a(0);
        }
    }

    private void m2953b(int i) {
        this.f3254h.write(i & 255);
        this.f3254h.write((i >> 8) & 255);
    }

    private void m2954c() {
        this.f3254h.write(this.f3259m, 0, this.f3259m.length);
        int length = 768 - this.f3259m.length;
        for (int i = 0; i < length; i++) {
            this.f3254h.write(0);
        }
    }

    public final boolean m2955a() {
        if (!this.f3253g) {
            return false;
        }
        boolean z;
        this.f3253g = false;
        try {
            this.f3254h.write(59);
            this.f3254h.flush();
            if (this.f3263q) {
                this.f3254h.close();
            }
            z = true;
        } catch (IOException e) {
            z = false;
        }
        this.f3251e = 0;
        this.f3254h = null;
        this.f3255i = null;
        this.f3256j = null;
        this.f3257k = null;
        this.f3259m = null;
        this.f3263q = false;
        this.f3264r = true;
        return z;
    }

    public final boolean m2956a(Bitmap bitmap) {
        if (bitmap == null || !this.f3253g) {
            return false;
        }
        try {
            int width;
            int height;
            if (!this.f3265s) {
                width = bitmap.getWidth();
                height = bitmap.getHeight();
                if (!this.f3253g || this.f3264r) {
                    this.f3248b = width;
                    this.f3249c = height;
                    if (this.f3248b <= 0) {
                        this.f3248b = 320;
                    }
                    if (this.f3249c <= 0) {
                        this.f3249c = 240;
                    }
                    this.f3265s = true;
                }
            }
            this.f3255i = bitmap;
            int width2 = this.f3255i.getWidth();
            int height2 = this.f3255i.getHeight();
            if (!(width2 == this.f3248b && height2 == this.f3249c)) {
                Bitmap createBitmap = Bitmap.createBitmap(this.f3248b, this.f3249c, Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(createBitmap, 0.0f, 0.0f, null);
                this.f3255i = createBitmap;
            }
            int[] iArr = new int[(width2 * height2)];
            this.f3255i.getPixels(iArr, 0, width2, 0, 0, width2, height2);
            this.f3256j = new byte[(iArr.length * 3)];
            this.f3267u = false;
            width = 0;
            width2 = 0;
            for (int i : iArr) {
                if (i == 0) {
                    width++;
                }
                height2 = width2 + 1;
                this.f3256j[width2] = (byte) (i & 255);
                int i2 = height2 + 1;
                this.f3256j[height2] = (byte) ((i >> 8) & 255);
                width2 = i2 + 1;
                this.f3256j[i2] = (byte) ((i >> 16) & 255);
            }
            double d = ((double) (width * 100)) / ((double) r4);
            this.f3267u = d > 4.0d;
            if (Log.isLoggable("AnimatedGifEncoder", 3)) {
                new StringBuilder("got pixels for frame with ").append(d).append("% transparent pixels");
            }
            m2952b();
            if (this.f3264r) {
                m2953b(this.f3248b);
                m2953b(this.f3249c);
                this.f3254h.write(this.f3261o | 240);
                this.f3254h.write(0);
                this.f3254h.write(0);
                m2954c();
                if (this.f3252f >= 0) {
                    this.f3254h.write(33);
                    this.f3254h.write(255);
                    this.f3254h.write(11);
                    m2951a("NETSCAPE2.0");
                    this.f3254h.write(3);
                    this.f3254h.write(1);
                    m2953b(this.f3252f);
                    this.f3254h.write(0);
                }
            }
            this.f3254h.write(33);
            this.f3254h.write(249);
            this.f3254h.write(4);
            if (this.f3250d != null || this.f3267u) {
                width = 2;
                height = 1;
            } else {
                width = 0;
                height = 0;
            }
            if (this.f3262p >= 0) {
                width = this.f3262p & 7;
            }
            this.f3254h.write((((width << 2) | 0) | 0) | height);
            m2953b(this.f3247a);
            this.f3254h.write(this.f3251e);
            this.f3254h.write(0);
            this.f3254h.write(44);
            m2953b(0);
            m2953b(0);
            m2953b(this.f3248b);
            m2953b(this.f3249c);
            if (this.f3264r) {
                this.f3254h.write(0);
            } else {
                this.f3254h.write(this.f3261o | 128);
            }
            if (!this.f3264r) {
                m2954c();
            }
            C1097b c1097b = new C1097b(this.f3248b, this.f3249c, this.f3257k, this.f3258l);
            OutputStream outputStream = this.f3254h;
            outputStream.write(c1097b.f3270c);
            c1097b.f3271d = c1097b.f3268a * c1097b.f3269b;
            c1097b.f3272e = 0;
            c1097b.m2963a(c1097b.f3270c + 1, outputStream);
            outputStream.write(0);
            this.f3264r = false;
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public final boolean m2957a(OutputStream outputStream) {
        if (outputStream == null) {
            return false;
        }
        boolean z = true;
        this.f3263q = false;
        this.f3254h = outputStream;
        try {
            m2951a("GIF89a");
        } catch (IOException e) {
            z = false;
        }
        this.f3253g = z;
        return z;
    }
}
