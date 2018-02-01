package com.bumptech.glide.load.resource.p053c;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.p044b.p046a.C1187c;
import com.bumptech.glide.load.resource.C1367d;
import com.bumptech.glide.p033b.C1091a;
import com.bumptech.glide.p033b.C1091a.C1090a;
import com.bumptech.glide.p033b.C1093c;
import com.bumptech.glide.p033b.C1094d;
import com.bumptech.glide.p042h.C1163h;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Queue;

public final class C1355i implements C1301e<InputStream, C1342b> {
    private static final C1354b f3799a = new C1354b();
    private static final C1353a f3800b = new C1353a();
    private final Context f3801c;
    private final C1354b f3802d;
    private final C1187c f3803e;
    private final C1353a f3804f;
    private final C1339a f3805g;

    static class C1353a {
        private final Queue<C1091a> f3797a = C1163h.m3153a(0);

        C1353a() {
        }

        public final synchronized C1091a m3518a(C1090a c1090a) {
            C1091a c1091a;
            c1091a = (C1091a) this.f3797a.poll();
            if (c1091a == null) {
                c1091a = new C1091a(c1090a);
            }
            return c1091a;
        }

        public final synchronized void m3519a(C1091a c1091a) {
            c1091a.f3205f = null;
            c1091a.f3204e = null;
            c1091a.f3201b = null;
            c1091a.f3202c = null;
            if (c1091a.f3207h != null) {
                c1091a.f3206g.mo1387a(c1091a.f3207h);
            }
            c1091a.f3207h = null;
            c1091a.f3200a = null;
            this.f3797a.offer(c1091a);
        }
    }

    static class C1354b {
        private final Queue<C1094d> f3798a = C1163h.m3153a(0);

        C1354b() {
        }

        public final synchronized C1094d m3520a(byte[] bArr) {
            C1094d c1094d;
            c1094d = (C1094d) this.f3798a.poll();
            if (c1094d == null) {
                c1094d = new C1094d();
            }
            return c1094d.m2949a(bArr);
        }

        public final synchronized void m3521a(C1094d c1094d) {
            c1094d.f3240a = null;
            c1094d.f3241b = null;
            this.f3798a.offer(c1094d);
        }
    }

    public C1355i(Context context, C1187c c1187c) {
        this(context, c1187c, f3799a, f3800b);
    }

    private C1355i(Context context, C1187c c1187c, C1354b c1354b, C1353a c1353a) {
        this.f3801c = context.getApplicationContext();
        this.f3803e = c1187c;
        this.f3804f = c1353a;
        this.f3805g = new C1339a(c1187c);
        this.f3802d = c1354b;
    }

    private C1344d m3522a(InputStream inputStream, int i, int i2) {
        C1344d c1344d = null;
        byte[] a = C1355i.m3523a(inputStream);
        C1094d a2 = this.f3802d.m3520a(a);
        C1091a a3 = this.f3804f.m3518a(this.f3805g);
        try {
            C1093c a4 = a2.m2948a();
            if (a4.f3229c > 0 && a4.f3228b == 0) {
                a3.m2938a(a4, a);
                a3.m2937a();
                Bitmap b = a3.m2939b();
                if (b != null) {
                    c1344d = new C1344d(new C1342b(this.f3801c, this.f3805g, this.f3803e, C1367d.m3547b(), i, i2, a4, a, b));
                }
            }
            this.f3802d.m3521a(a2);
            this.f3804f.m3519a(a3);
            return c1344d;
        } catch (Throwable th) {
            this.f3802d.m3521a(a2);
            this.f3804f.m3519a(a3);
        }
    }

    private static byte[] m3523a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.flush();
        } catch (Throwable e) {
            Log.w("GifResourceDecoder", "Error reading data from stream", e);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final String mo1382a() {
        return "";
    }
}
