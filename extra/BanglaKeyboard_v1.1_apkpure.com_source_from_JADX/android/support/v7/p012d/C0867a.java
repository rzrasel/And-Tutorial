package android.support.v7.p012d;

import android.graphics.Color;
import android.support.v4.p006a.C0375a;
import android.support.v7.p012d.C0872b.C0868b;
import android.support.v7.p012d.C0872b.C0871c;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

final class C0867a {
    private static final Comparator<C0865a> f2644g = new C08641();
    final int[] f2645a;
    final int[] f2646b;
    final List<C0871c> f2647c;
    final TimingLogger f2648d = null;
    final C0868b[] f2649e;
    private final float[] f2650f = new float[3];

    static class C08641 implements Comparator<C0865a> {
        C08641() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C0865a) obj2).m2520a() - ((C0865a) obj).m2520a();
        }
    }

    private class C0865a {
        int f2621a;
        final /* synthetic */ C0867a f2622b;
        private int f2623c;
        private int f2624d;
        private int f2625e;
        private int f2626f;
        private int f2627g;
        private int f2628h;
        private int f2629i;
        private int f2630j;

        C0865a(C0867a c0867a, int i, int i2) {
            this.f2622b = c0867a;
            this.f2623c = i;
            this.f2621a = i2;
            m2522c();
        }

        final int m2520a() {
            return (((this.f2626f - this.f2625e) + 1) * ((this.f2628h - this.f2627g) + 1)) * ((this.f2630j - this.f2629i) + 1);
        }

        final boolean m2521b() {
            return (this.f2621a + 1) - this.f2623c > 1;
        }

        final void m2522c() {
            int[] iArr = this.f2622b.f2645a;
            int[] iArr2 = this.f2622b.f2646b;
            int i = Integer.MIN_VALUE;
            int i2 = 0;
            int i3 = Integer.MIN_VALUE;
            int i4 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int i5 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int i6 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int i7 = Integer.MIN_VALUE;
            for (int i8 = this.f2623c; i8 <= this.f2621a; i8++) {
                int i9 = iArr[i8];
                i2 += iArr2[i9];
                int a = C0867a.m2527a(i9);
                int b = C0867a.m2533b(i9);
                i9 = C0867a.m2535c(i9);
                if (a > i3) {
                    i3 = a;
                }
                if (a < i6) {
                    i6 = a;
                }
                if (b > i7) {
                    i7 = b;
                }
                if (b < i5) {
                    i5 = b;
                }
                if (i9 > i) {
                    i = i9;
                }
                if (i9 < i4) {
                    i4 = i9;
                }
            }
            this.f2625e = i6;
            this.f2626f = i3;
            this.f2627g = i5;
            this.f2628h = i7;
            this.f2629i = i4;
            this.f2630j = i;
            this.f2624d = i2;
        }

        final int m2523d() {
            int i = this.f2626f - this.f2625e;
            int i2 = this.f2628h - this.f2627g;
            int i3 = this.f2630j - this.f2629i;
            i = (i < i2 || i < i3) ? (i2 < i || i2 < i3) ? -1 : -2 : -3;
            int[] iArr = this.f2622b.f2645a;
            int[] iArr2 = this.f2622b.f2646b;
            C0867a.m2531a(iArr, i, this.f2623c, this.f2621a);
            Arrays.sort(iArr, this.f2623c, this.f2621a + 1);
            C0867a.m2531a(iArr, i, this.f2623c, this.f2621a);
            int i4 = this.f2624d / 2;
            i = 0;
            for (i2 = this.f2623c; i2 <= this.f2621a; i2++) {
                i += iArr2[iArr[i2]];
                if (i >= i4) {
                    return Math.min(this.f2621a - 1, i2);
                }
            }
            return this.f2623c;
        }

        final C0871c m2524e() {
            int i = 0;
            int[] iArr = this.f2622b.f2645a;
            int[] iArr2 = this.f2622b.f2646b;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.f2623c; i5 <= this.f2621a; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i += i7;
                i4 += C0867a.m2527a(i6) * i7;
                i3 += C0867a.m2533b(i6) * i7;
                i2 += C0867a.m2535c(i6) * i7;
            }
            return new C0871c(C0867a.m2528a(Math.round(((float) i4) / ((float) i)), Math.round(((float) i3) / ((float) i)), Math.round(((float) i2) / ((float) i))), i);
        }
    }

    C0867a(int[] iArr, int i, C0868b[] c0868bArr) {
        int i2;
        int i3 = 0;
        this.f2649e = c0868bArr;
        int[] iArr2 = new int[32768];
        this.f2646b = iArr2;
        for (i2 = 0; i2 < iArr.length; i2++) {
            int i4 = iArr[i2];
            i4 = C0867a.m2534b(Color.blue(i4), 8, 5) | ((C0867a.m2534b(Color.red(i4), 8, 5) << 10) | (C0867a.m2534b(Color.green(i4), 8, 5) << 5));
            iArr[i2] = i4;
            iArr2[i4] = iArr2[i4] + 1;
        }
        i2 = 0;
        for (i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0) {
                C0375a.m1078a(C0867a.m2536d(i4), this.f2650f);
                if (m2532a(this.f2650f)) {
                    iArr2[i4] = 0;
                }
            }
            if (iArr2[i4] > 0) {
                i2++;
            }
        }
        int[] iArr3 = new int[i2];
        this.f2645a = iArr3;
        int i5 = 0;
        int i6 = 0;
        while (i5 < 32768) {
            if (iArr2[i5] > 0) {
                i4 = i6 + 1;
                iArr3[i6] = i5;
            } else {
                i4 = i6;
            }
            i5++;
            i6 = i4;
        }
        if (i2 <= i) {
            this.f2647c = new ArrayList();
            i2 = iArr3.length;
            while (i3 < i2) {
                i4 = iArr3[i3];
                this.f2647c.add(new C0871c(C0867a.m2536d(i4), iArr2[i4]));
                i3++;
            }
            return;
        }
        Collection priorityQueue = new PriorityQueue(i, f2644g);
        priorityQueue.offer(new C0865a(this, 0, this.f2645a.length - 1));
        C0867a.m2530a(priorityQueue, i);
        this.f2647c = m2529a(priorityQueue);
    }

    static int m2527a(int i) {
        return (i >> 10) & 31;
    }

    static int m2528a(int i, int i2, int i3) {
        return Color.rgb(C0867a.m2534b(i, 5, 8), C0867a.m2534b(i2, 5, 8), C0867a.m2534b(i3, 5, 8));
    }

    private List<C0871c> m2529a(Collection<C0865a> collection) {
        List arrayList = new ArrayList(collection.size());
        for (C0865a e : collection) {
            C0871c e2 = e.m2524e();
            if (!m2532a(e2.m2544a())) {
                arrayList.add(e2);
            }
        }
        return arrayList;
    }

    private static void m2530a(PriorityQueue<C0865a> priorityQueue, int i) {
        while (priorityQueue.size() < i) {
            C0865a c0865a = (C0865a) priorityQueue.poll();
            if (c0865a != null && c0865a.m2521b()) {
                if (c0865a.m2521b()) {
                    int d = c0865a.m2523d();
                    C0865a c0865a2 = new C0865a(c0865a.f2622b, d + 1, c0865a.f2621a);
                    c0865a.f2621a = d;
                    c0865a.m2522c();
                    priorityQueue.offer(c0865a2);
                    priorityQueue.offer(c0865a);
                } else {
                    throw new IllegalStateException("Can not split a box with only 1 color");
                }
            }
            return;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m2531a(int[] r3, int r4, int r5, int r6) {
        /*
        switch(r4) {
            case -3: goto L_0x0003;
            case -2: goto L_0x0004;
            case -1: goto L_0x001d;
            default: goto L_0x0003;
        };
    L_0x0003:
        return;
    L_0x0004:
        if (r5 > r6) goto L_0x0003;
    L_0x0006:
        r0 = r3[r5];
        r1 = r0 >> 5;
        r1 = r1 & 31;
        r1 = r1 << 10;
        r2 = r0 >> 10;
        r2 = r2 & 31;
        r2 = r2 << 5;
        r1 = r1 | r2;
        r0 = r0 & 31;
        r0 = r0 | r1;
        r3[r5] = r0;
        r5 = r5 + 1;
        goto L_0x0004;
    L_0x001d:
        if (r5 > r6) goto L_0x0003;
    L_0x001f:
        r0 = r3[r5];
        r1 = r0 & 31;
        r1 = r1 << 10;
        r2 = r0 >> 5;
        r2 = r2 & 31;
        r2 = r2 << 5;
        r1 = r1 | r2;
        r0 = r0 >> 10;
        r0 = r0 & 31;
        r0 = r0 | r1;
        r3[r5] = r0;
        r5 = r5 + 1;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.d.a.a(int[], int, int, int):void");
    }

    private boolean m2532a(float[] fArr) {
        if (this.f2649e == null || this.f2649e.length <= 0) {
            return false;
        }
        for (C0868b a : this.f2649e) {
            if (!a.mo847a(fArr)) {
                return true;
            }
        }
        return false;
    }

    static int m2533b(int i) {
        return (i >> 5) & 31;
    }

    private static int m2534b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    static int m2535c(int i) {
        return i & 31;
    }

    private static int m2536d(int i) {
        return C0867a.m2528a((i >> 10) & 31, (i >> 5) & 31, i & 31);
    }
}
