package com.bumptech.glide.load.p049c;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.bumptech.glide.p042h.C1159e;
import com.bumptech.glide.p042h.C1163h;
import java.util.Queue;

public final class C1297k<A, B> {
    public final C1159e<C1296a<A>, B> f3684a;

    static final class C1296a<A> {
        private static final Queue<C1296a<?>> f3680a = C1163h.m3153a(0);
        private int f3681b;
        private int f3682c;
        private A f3683d;

        private C1296a() {
        }

        public static <A> C1296a<A> m3391a(A a) {
            C1296a<A> c1296a = (C1296a) f3680a.poll();
            if (c1296a == null) {
                c1296a = new C1296a();
            }
            c1296a.f3683d = a;
            c1296a.f3682c = 0;
            c1296a.f3681b = 0;
            return c1296a;
        }

        public final void m3392a() {
            f3680a.offer(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1296a)) {
                return false;
            }
            C1296a c1296a = (C1296a) obj;
            return this.f3682c == c1296a.f3682c && this.f3681b == c1296a.f3681b && this.f3683d.equals(c1296a.f3683d);
        }

        public final int hashCode() {
            return (((this.f3681b * 31) + this.f3682c) * 31) + this.f3683d.hashCode();
        }
    }

    public C1297k() {
        this(Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    }

    public C1297k(int i) {
        this.f3684a = new C1159e<C1296a<A>, B>(this, i) {
            final /* synthetic */ C1297k f3679a;

            protected final /* bridge */ /* synthetic */ void mo1357a(Object obj, Object obj2) {
                ((C1296a) obj).m3392a();
            }
        };
    }
}
