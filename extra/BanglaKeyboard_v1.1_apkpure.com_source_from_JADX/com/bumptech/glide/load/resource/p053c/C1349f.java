package com.bumptech.glide.load.resource.p053c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C1088c;
import com.bumptech.glide.C1113e;
import com.bumptech.glide.C1164h.C1151a.C1150a;
import com.bumptech.glide.load.C1145c;
import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.p044b.C1217b;
import com.bumptech.glide.load.p049c.C1252l;
import com.bumptech.glide.load.resource.C1304a;
import com.bumptech.glide.p033b.C1091a;
import com.bumptech.glide.p036f.p037b.C1133f;
import com.bumptech.glide.p036f.p039a.C1119c;
import java.security.MessageDigest;
import java.util.UUID;

final class C1349f {
    final C1341b f3787a;
    final Handler f3788b;
    boolean f3789c;
    boolean f3790d;
    C1088c<C1091a, C1091a, Bitmap, Bitmap> f3791e;
    C1346a f3792f;
    boolean f3793g;
    private final C1091a f3794h;

    public interface C1341b {
        void mo1388b(int i);
    }

    static class C1346a extends C1133f<Bitmap> {
        final int f3781a;
        Bitmap f3782b;
        private final Handler f3783c;
        private final long f3784d;

        public C1346a(Handler handler, int i, long j) {
            this.f3783c = handler;
            this.f3781a = i;
            this.f3784d = j;
        }

        public final /* synthetic */ void mo1290a(Object obj, C1119c c1119c) {
            this.f3782b = (Bitmap) obj;
            this.f3783c.sendMessageAtTime(this.f3783c.obtainMessage(1, this), this.f3784d);
        }
    }

    private class C1347c implements Callback {
        final /* synthetic */ C1349f f3785a;

        private C1347c(C1349f c1349f) {
            this.f3785a = c1349f;
        }

        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                C1346a c1346a = (C1346a) message.obj;
                C1349f c1349f = this.f3785a;
                if (c1349f.f3793g) {
                    c1349f.f3788b.obtainMessage(2, c1346a).sendToTarget();
                } else {
                    C1346a c1346a2 = c1349f.f3792f;
                    c1349f.f3792f = c1346a;
                    c1349f.f3787a.mo1388b(c1346a.f3781a);
                    if (c1346a2 != null) {
                        c1349f.f3788b.obtainMessage(2, c1346a2).sendToTarget();
                    }
                    c1349f.f3790d = false;
                    c1349f.m3510b();
                }
                return true;
            }
            if (message.what == 2) {
                C1113e.m3027a((C1346a) message.obj);
            }
            return false;
        }
    }

    static class C1348d implements C1145c {
        private final UUID f3786a;

        public C1348d() {
            this(UUID.randomUUID());
        }

        private C1348d(UUID uuid) {
            this.f3786a = uuid;
        }

        public final void mo1320a(MessageDigest messageDigest) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public final boolean equals(Object obj) {
            return obj instanceof C1348d ? ((C1348d) obj).f3786a.equals(this.f3786a) : false;
        }

        public final int hashCode() {
            return this.f3786a.hashCode();
        }
    }

    public C1349f(Context context, C1341b c1341b, C1091a c1091a, int i, int i2) {
        C1301e c1352h = new C1352h(C1113e.m3022a(context).f3325b);
        C1252l c1351g = new C1351g();
        this(c1341b, c1091a, new C1150a(C1113e.m3029b(context).m3160a(c1351g, C1091a.class), (Object) c1091a).m3127a(Bitmap.class).mo1264a(C1304a.m3403b()).mo1272b(c1352h).mo1267a(true).mo1270b(C1217b.NONE).mo1269b(i, i2));
    }

    private C1349f(C1341b c1341b, C1091a c1091a, C1088c<C1091a, C1091a, Bitmap, Bitmap> c1088c) {
        this.f3789c = false;
        this.f3790d = false;
        Handler handler = new Handler(Looper.getMainLooper(), new C1347c());
        this.f3787a = c1341b;
        this.f3794h = c1091a;
        this.f3788b = handler;
        this.f3791e = c1088c;
    }

    public final void m3509a() {
        this.f3789c = false;
        if (this.f3792f != null) {
            C1113e.m3027a(this.f3792f);
            this.f3792f = null;
        }
        this.f3793g = true;
    }

    final void m3510b() {
        if (this.f3789c && !this.f3790d) {
            this.f3790d = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            C1091a c1091a = this.f3794h;
            int a = (c1091a.f3205f.f3229c <= 0 || c1091a.f3203d < 0) ? -1 : c1091a.m2936a(c1091a.f3203d);
            long j = ((long) a) + uptimeMillis;
            this.f3794h.m2937a();
            this.f3791e.mo1271b(new C1348d()).m2887a(new C1346a(this.f3788b, this.f3794h.f3203d, j));
        }
    }
}
