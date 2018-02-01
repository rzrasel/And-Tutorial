package com.bumptech.glide.load.p044b;

import android.util.Log;
import com.bumptech.glide.load.C1145c;
import com.bumptech.glide.load.C1249b;
import com.bumptech.glide.load.C1299g;
import com.bumptech.glide.load.p043a.C1165c;
import com.bumptech.glide.load.p044b.p045b.C1200a;
import com.bumptech.glide.load.p044b.p045b.C1200a.C1179b;
import com.bumptech.glide.load.resource.p055e.C1368c;
import com.bumptech.glide.p038e.C1107b;
import com.bumptech.glide.p042h.C1158d;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class C1198a<A, T, Z> {
    private static final C1178b f3517e = new C1178b();
    final C1239f f3518a;
    public final C1165c<A> f3519b;
    final C1217b f3520c;
    public volatile boolean f3521d;
    private final int f3522f;
    private final int f3523g;
    private final C1107b<A, T> f3524h;
    private final C1299g<T> f3525i;
    private final C1368c<T, Z> f3526j;
    private final C1177a f3527k;
    private final int f3528l;
    private final C1178b f3529m;

    interface C1177a {
        C1200a mo1360a();
    }

    static class C1178b {
        C1178b() {
        }
    }

    class C1180c<DataType> implements C1179b {
        final /* synthetic */ C1198a f3479a;
        private final C1249b<DataType> f3480b;
        private final DataType f3481c;

        public C1180c(C1198a c1198a, C1249b<DataType> c1249b, DataType dataType) {
            this.f3479a = c1198a;
            this.f3480b = c1249b;
            this.f3481c = dataType;
        }

        public final boolean mo1333a(File file) {
            OutputStream bufferedOutputStream;
            Throwable th;
            boolean z = false;
            OutputStream outputStream = null;
            try {
                this.f3479a.f3529m;
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    z = this.f3480b.mo1377a(this.f3481c, bufferedOutputStream);
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException e) {
                    }
                } catch (FileNotFoundException e2) {
                    try {
                        Log.isLoggable("DecodeJob", 3);
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e3) {
                            }
                        }
                        return z;
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = bufferedOutputStream;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e4) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (FileNotFoundException e5) {
                bufferedOutputStream = null;
                Log.isLoggable("DecodeJob", 3);
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                return z;
            } catch (Throwable th3) {
                th = th3;
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th;
            }
            return z;
        }
    }

    public C1198a(C1239f c1239f, int i, int i2, C1165c<A> c1165c, C1107b<A, T> c1107b, C1299g<T> c1299g, C1368c<T, Z> c1368c, C1177a c1177a, C1217b c1217b, int i3) {
        this(c1239f, i, i2, c1165c, c1107b, c1299g, c1368c, c1177a, c1217b, i3, f3517e);
    }

    private C1198a(C1239f c1239f, int i, int i2, C1165c<A> c1165c, C1107b<A, T> c1107b, C1299g<T> c1299g, C1368c<T, Z> c1368c, C1177a c1177a, C1217b c1217b, int i3, C1178b c1178b) {
        this.f3518a = c1239f;
        this.f3522f = i;
        this.f3523g = i2;
        this.f3519b = c1165c;
        this.f3524h = c1107b;
        this.f3525i = c1299g;
        this.f3526j = c1368c;
        this.f3527k = c1177a;
        this.f3520c = c1217b;
        this.f3528l = i3;
        this.f3529m = c1178b;
    }

    final C1241l<T> m3261a() {
        try {
            long a = C1158d.m3139a();
            Object a2 = this.f3519b.mo1324a(this.f3528l);
            if (Log.isLoggable("DecodeJob", 2)) {
                m3264a("Fetched data", a);
            }
            if (this.f3521d) {
                return null;
            }
            C1241l<T> a3;
            if (this.f3520c.f3556e) {
                a = C1158d.m3139a();
                this.f3527k.mo1360a().mo1348a(this.f3518a.m3325a(), new C1180c(this, this.f3524h.mo1293c(), a2));
                if (Log.isLoggable("DecodeJob", 2)) {
                    m3264a("Wrote source to cache", a);
                }
                long a4 = C1158d.m3139a();
                a3 = m3263a(this.f3518a.m3325a());
                if (Log.isLoggable("DecodeJob", 2) && a3 != null) {
                    m3264a("Decoded source from cache", a4);
                }
            } else {
                long a5 = C1158d.m3139a();
                a3 = this.f3524h.mo1292b().mo1381a(a2, this.f3522f, this.f3523g);
                if (Log.isLoggable("DecodeJob", 2)) {
                    m3264a("Decoded from source", a5);
                }
            }
            this.f3519b.mo1325a();
            return a3;
        } finally {
            this.f3519b.mo1325a();
        }
    }

    final C1241l<Z> m3262a(C1241l<T> c1241l) {
        C1241l c1241l2;
        long a = C1158d.m3139a();
        if (c1241l == null) {
            c1241l2 = null;
        } else {
            c1241l2 = this.f3525i.mo1379a(c1241l, this.f3522f, this.f3523g);
            if (!c1241l.equals(c1241l2)) {
                c1241l.mo1369c();
            }
        }
        if (Log.isLoggable("DecodeJob", 2)) {
            m3264a("Transformed resource from source", a);
        }
        if (c1241l2 != null && this.f3520c.f3557f) {
            a = C1158d.m3139a();
            this.f3527k.mo1360a().mo1348a(this.f3518a, new C1180c(this, this.f3524h.mo1294d(), c1241l2));
            if (Log.isLoggable("DecodeJob", 2)) {
                m3264a("Wrote transformed from source to cache", a);
            }
        }
        a = C1158d.m3139a();
        C1241l<Z> b = m3265b(c1241l2);
        if (Log.isLoggable("DecodeJob", 2)) {
            m3264a("Transcoded transformed from source", a);
        }
        return b;
    }

    final C1241l<T> m3263a(C1145c c1145c) {
        File a = this.f3527k.mo1360a().mo1347a(c1145c);
        if (a == null) {
            return null;
        }
        try {
            C1241l<T> a2 = this.f3524h.mo1291a().mo1381a(a, this.f3522f, this.f3523g);
            return a2 == null ? a2 : a2;
        } finally {
            this.f3527k.mo1360a().mo1349b(c1145c);
        }
    }

    final void m3264a(String str, long j) {
        new StringBuilder().append(str).append(" in ").append(C1158d.m3138a(j)).append(", key: ").append(this.f3518a);
    }

    final C1241l<Z> m3265b(C1241l<T> c1241l) {
        return c1241l == null ? null : this.f3526j.mo1389a(c1241l);
    }
}
