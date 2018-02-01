package com.bumptech.glide.load.p044b.p045b;

import com.bumptech.glide.load.C1145c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class C1204c {
    final Map<C1145c, C1202a> f3533a = new HashMap();
    final C1203b f3534b = new C1203b();

    private static class C1202a {
        final Lock f3530a;
        int f3531b;

        private C1202a() {
            this.f3530a = new ReentrantLock();
        }
    }

    private static class C1203b {
        final Queue<C1202a> f3532a;

        private C1203b() {
            this.f3532a = new ArrayDeque();
        }

        final C1202a m3273a() {
            C1202a c1202a;
            synchronized (this.f3532a) {
                c1202a = (C1202a) this.f3532a.poll();
            }
            return c1202a == null ? new C1202a() : c1202a;
        }
    }

    C1204c() {
    }

    final void m3274a(C1145c c1145c) {
        C1202a c1202a;
        synchronized (this) {
            c1202a = (C1202a) this.f3533a.get(c1145c);
            if (c1202a == null || c1202a.f3531b <= 0) {
                throw new IllegalArgumentException("Cannot release a lock that is not held, key: " + c1145c + ", interestedThreads: " + (c1202a == null ? 0 : c1202a.f3531b));
            }
            int i = c1202a.f3531b - 1;
            c1202a.f3531b = i;
            if (i == 0) {
                C1202a c1202a2 = (C1202a) this.f3533a.remove(c1145c);
                if (c1202a2.equals(c1202a)) {
                    C1203b c1203b = this.f3534b;
                    synchronized (c1203b.f3532a) {
                        if (c1203b.f3532a.size() < 10) {
                            c1203b.f3532a.offer(c1202a2);
                        }
                    }
                } else {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c1202a + ", but actually removed: " + c1202a2 + ", key: " + c1145c);
                }
            }
        }
        c1202a.f3530a.unlock();
    }
}
