package android.support.v7.p028h;

import android.support.v7.widget.RecyclerView.Adapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class C0892b {
    private static final Comparator<C0891e> f2712a = new C08851();

    static class C08851 implements Comparator<C0891e> {
        C08851() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            C0891e c0891e = (C0891e) obj;
            C0891e c0891e2 = (C0891e) obj2;
            int i = c0891e.f2707a - c0891e2.f2707a;
            return i == 0 ? c0891e.f2708b - c0891e2.f2708b : i;
        }
    }

    public static abstract class C0886a {
        public abstract int mo883a();

        public abstract boolean mo884a(int i, int i2);

        public abstract int mo885b();

        public abstract boolean mo886b(int i, int i2);
    }

    public static class C0888b {
        private final List<C0891e> f2693a;
        private final int[] f2694b;
        private final int[] f2695c;
        private final C0886a f2696d;
        private final int f2697e;
        private final int f2698f;
        private final boolean f2699g = true;

        class C08871 implements C0883c {
            final /* synthetic */ Adapter f2691a;
            final /* synthetic */ C0888b f2692b;

            public C08871(C0888b c0888b, Adapter adapter) {
                this.f2692b = c0888b;
                this.f2691a = adapter;
            }

            public final void onChanged(int i, int i2, Object obj) {
                this.f2691a.notifyItemRangeChanged(i, i2, obj);
            }

            public final void onInserted(int i, int i2) {
                this.f2691a.notifyItemRangeInserted(i, i2);
            }

            public final void onMoved(int i, int i2) {
                this.f2691a.notifyItemMoved(i, i2);
            }

            public final void onRemoved(int i, int i2) {
                this.f2691a.notifyItemRangeRemoved(i, i2);
            }
        }

        C0888b(C0886a c0886a, List<C0891e> list, int[] iArr, int[] iArr2) {
            this.f2693a = list;
            this.f2694b = iArr;
            this.f2695c = iArr2;
            Arrays.fill(this.f2694b, 0);
            Arrays.fill(this.f2695c, 0);
            this.f2696d = c0886a;
            this.f2697e = c0886a.mo883a();
            this.f2698f = c0886a.mo885b();
            C0891e c0891e = this.f2693a.isEmpty() ? null : (C0891e) this.f2693a.get(0);
            if (!(c0891e != null && c0891e.f2707a == 0 && c0891e.f2708b == 0)) {
                c0891e = new C0891e();
                c0891e.f2707a = 0;
                c0891e.f2708b = 0;
                c0891e.f2710d = false;
                c0891e.f2709c = 0;
                c0891e.f2711e = false;
                this.f2693a.add(0, c0891e);
            }
            m2570a();
        }

        private static C0889c m2569a(List<C0889c> list, int i, boolean z) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0889c c0889c = (C0889c) list.get(size);
                if (c0889c.f2700a == i && c0889c.f2702c == z) {
                    list.remove(size);
                    for (int i2 = size; i2 < list.size(); i2++) {
                        C0889c c0889c2 = (C0889c) list.get(i2);
                        c0889c2.f2701b = (z ? 1 : -1) + c0889c2.f2701b;
                    }
                    return c0889c;
                }
            }
            return null;
        }

        private void m2570a() {
            int i = this.f2697e;
            int i2 = this.f2698f;
            for (int size = this.f2693a.size() - 1; size >= 0; size--) {
                C0891e c0891e = (C0891e) this.f2693a.get(size);
                int i3 = c0891e.f2707a + c0891e.f2709c;
                int i4 = c0891e.f2708b + c0891e.f2709c;
                if (this.f2699g) {
                    while (i > i3) {
                        if (this.f2694b[i - 1] == 0) {
                            m2572a(i, i2, size, false);
                        }
                        i--;
                    }
                    while (i2 > i4) {
                        if (this.f2695c[i2 - 1] == 0) {
                            m2572a(i, i2, size, true);
                        }
                        i2--;
                    }
                }
                for (i2 = 0; i2 < c0891e.f2709c; i2++) {
                    i3 = c0891e.f2707a + i2;
                    i4 = c0891e.f2708b + i2;
                    i = this.f2696d.mo886b(i3, i4) ? 1 : 2;
                    this.f2694b[i3] = (i4 << 5) | i;
                    this.f2695c[i4] = i | (i3 << 5);
                }
                i = c0891e.f2707a;
                i2 = c0891e.f2708b;
            }
        }

        private void m2571a(List<C0889c> list, C0883c c0883c, int i, int i2, int i3) {
            if (this.f2699g) {
                for (int i4 = i2 - 1; i4 >= 0; i4--) {
                    int i5 = this.f2695c[i3 + i4] & 31;
                    switch (i5) {
                        case 0:
                            c0883c.onInserted(i, 1);
                            for (C0889c c0889c : list) {
                                c0889c.f2701b++;
                            }
                            break;
                        case 4:
                        case 8:
                            c0883c.onMoved(C0888b.m2569a(list, this.f2695c[i3 + i4] >> 5, true).f2701b, i);
                            if (i5 != 4) {
                                break;
                            }
                            c0883c.onChanged(i, 1, null);
                            break;
                        case 16:
                            list.add(new C0889c(i3 + i4, i, false));
                            break;
                        default:
                            throw new IllegalStateException("unknown flag for pos " + (i4 + i3) + " " + Long.toBinaryString((long) i5));
                    }
                }
                return;
            }
            c0883c.onInserted(i, i2);
        }

        private boolean m2572a(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            int i6 = 8;
            if (z) {
                i4 = i2 - 1;
                i2--;
                i5 = i4;
                i4 = i;
            } else {
                i5 = i - 1;
                i4 = i - 1;
            }
            int i7 = i4;
            while (i3 >= 0) {
                C0891e c0891e = (C0891e) this.f2693a.get(i3);
                int i8 = c0891e.f2707a + c0891e.f2709c;
                int i9 = c0891e.f2708b + c0891e.f2709c;
                if (z) {
                    for (i7--; i7 >= i8; i7--) {
                        if (this.f2696d.mo884a(i7, i5)) {
                            i4 = this.f2696d.mo886b(i7, i5) ? 8 : 4;
                            this.f2695c[i5] = (i7 << 5) | 16;
                            this.f2694b[i7] = i4 | (i5 << 5);
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (i7 = i2 - 1; i7 >= i9; i7--) {
                        if (this.f2696d.mo884a(i5, i7)) {
                            if (!this.f2696d.mo886b(i5, i7)) {
                                i6 = 4;
                            }
                            this.f2694b[i - 1] = (i7 << 5) | 16;
                            this.f2695c[i7] = ((i - 1) << 5) | i6;
                            return true;
                        }
                    }
                    continue;
                }
                i7 = c0891e.f2707a;
                i2 = c0891e.f2708b;
                i3--;
            }
            return false;
        }

        private void m2573b(List<C0889c> list, C0883c c0883c, int i, int i2, int i3) {
            if (this.f2699g) {
                for (int i4 = i2 - 1; i4 >= 0; i4--) {
                    int i5 = this.f2694b[i3 + i4] & 31;
                    switch (i5) {
                        case 0:
                            c0883c.onRemoved(i + i4, 1);
                            for (C0889c c0889c : list) {
                                c0889c.f2701b--;
                            }
                            break;
                        case 4:
                        case 8:
                            C0889c a = C0888b.m2569a(list, this.f2694b[i3 + i4] >> 5, false);
                            c0883c.onMoved(i + i4, a.f2701b - 1);
                            if (i5 != 4) {
                                break;
                            }
                            c0883c.onChanged(a.f2701b - 1, 1, null);
                            break;
                        case 16:
                            list.add(new C0889c(i3 + i4, i + i4, true));
                            break;
                        default:
                            throw new IllegalStateException("unknown flag for pos " + (i4 + i3) + " " + Long.toBinaryString((long) i5));
                    }
                }
                return;
            }
            c0883c.onRemoved(i, i2);
        }

        public final void m2574a(C0883c c0883c) {
            C0884a c0884a = c0883c instanceof C0884a ? (C0884a) c0883c : new C0884a(c0883c);
            List arrayList = new ArrayList();
            int i = this.f2697e;
            int size = this.f2693a.size() - 1;
            int i2 = this.f2698f;
            while (size >= 0) {
                C0891e c0891e = (C0891e) this.f2693a.get(size);
                int i3 = c0891e.f2709c;
                int i4 = c0891e.f2707a + i3;
                int i5 = c0891e.f2708b + i3;
                if (i4 < i) {
                    m2573b(arrayList, c0884a, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    m2571a(arrayList, c0884a, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    if ((this.f2694b[c0891e.f2707a + i6] & 31) == 2) {
                        c0884a.onChanged(c0891e.f2707a + i6, 1, null);
                    }
                }
                i = c0891e.f2707a;
                size--;
                i2 = c0891e.f2708b;
            }
            c0884a.m2564a();
        }
    }

    private static class C0889c {
        int f2700a;
        int f2701b;
        boolean f2702c;

        public C0889c(int i, int i2, boolean z) {
            this.f2700a = i;
            this.f2701b = i2;
            this.f2702c = z;
        }
    }

    static class C0890d {
        int f2703a;
        int f2704b;
        int f2705c;
        int f2706d;

        public C0890d(int i, int i2) {
            this.f2703a = 0;
            this.f2704b = i;
            this.f2705c = 0;
            this.f2706d = i2;
        }
    }

    static class C0891e {
        int f2707a;
        int f2708b;
        int f2709c;
        boolean f2710d;
        boolean f2711e;

        C0891e() {
        }
    }

    public static C0888b m2575a(C0886a c0886a) {
        int a = c0886a.mo883a();
        int b = c0886a.mo885b();
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        arrayList2.add(new C0890d(a, b));
        int abs = (a + b) + Math.abs(a - b);
        int[] iArr = new int[(abs * 2)];
        int[] iArr2 = new int[(abs * 2)];
        List arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0890d c0890d = (C0890d) arrayList2.remove(arrayList2.size() - 1);
            C0891e a2 = C0892b.m2576a(c0886a, c0890d.f2703a, c0890d.f2704b, c0890d.f2705c, c0890d.f2706d, iArr, iArr2, abs);
            if (a2 != null) {
                if (a2.f2709c > 0) {
                    arrayList.add(a2);
                }
                a2.f2707a += c0890d.f2703a;
                a2.f2708b += c0890d.f2705c;
                C0890d c0890d2 = arrayList3.isEmpty() ? new C0890d() : (C0890d) arrayList3.remove(arrayList3.size() - 1);
                c0890d2.f2703a = c0890d.f2703a;
                c0890d2.f2705c = c0890d.f2705c;
                if (a2.f2711e) {
                    c0890d2.f2704b = a2.f2707a;
                    c0890d2.f2706d = a2.f2708b;
                } else if (a2.f2710d) {
                    c0890d2.f2704b = a2.f2707a - 1;
                    c0890d2.f2706d = a2.f2708b;
                } else {
                    c0890d2.f2704b = a2.f2707a;
                    c0890d2.f2706d = a2.f2708b - 1;
                }
                arrayList2.add(c0890d2);
                if (!a2.f2711e) {
                    c0890d.f2703a = a2.f2707a + a2.f2709c;
                    c0890d.f2705c = a2.f2708b + a2.f2709c;
                } else if (a2.f2710d) {
                    c0890d.f2703a = (a2.f2707a + a2.f2709c) + 1;
                    c0890d.f2705c = a2.f2708b + a2.f2709c;
                } else {
                    c0890d.f2703a = a2.f2707a + a2.f2709c;
                    c0890d.f2705c = (a2.f2708b + a2.f2709c) + 1;
                }
                arrayList2.add(c0890d);
            } else {
                arrayList3.add(c0890d);
            }
        }
        Collections.sort(arrayList, f2712a);
        return new C0888b(c0886a, arrayList, iArr, iArr2);
    }

    private static C0891e m2576a(C0886a c0886a, int i, int i2, int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i2 - i <= 0 || i4 - i3 <= 0) {
            return null;
        }
        int i8 = i6 - i7;
        int i9 = ((i6 + i7) + 1) / 2;
        Arrays.fill(iArr, (i5 - i9) - 1, (i5 + i9) + 1, 0);
        Arrays.fill(iArr2, ((i5 - i9) - 1) + i8, ((i5 + i9) + 1) + i8, i6);
        Object obj = i8 % 2 != 0 ? 1 : null;
        int i10 = 0;
        while (i10 <= i9) {
            int i11;
            boolean z;
            int i12 = -i10;
            while (i12 <= i10) {
                if (i12 == (-i10) || (i12 != i10 && iArr[(i5 + i12) - 1] < iArr[(i5 + i12) + 1])) {
                    i11 = iArr[(i5 + i12) + 1];
                    z = false;
                } else {
                    i11 = iArr[(i5 + i12) - 1] + 1;
                    z = true;
                }
                int i13 = i11;
                i11 -= i12;
                while (i13 < i6 && i11 < i7 && c0886a.mo884a(i + i13, i3 + i11)) {
                    i13++;
                    i11++;
                }
                iArr[i5 + i12] = i13;
                if (obj == null || i12 < (i8 - i10) + 1 || i12 > (i8 + i10) - 1 || iArr[i5 + i12] < iArr2[i5 + i12]) {
                    i12 += 2;
                } else {
                    C0891e c0891e = new C0891e();
                    c0891e.f2707a = iArr2[i5 + i12];
                    c0891e.f2708b = c0891e.f2707a - i12;
                    c0891e.f2709c = iArr[i5 + i12] - iArr2[i5 + i12];
                    c0891e.f2710d = z;
                    c0891e.f2711e = false;
                    return c0891e;
                }
            }
            i12 = -i10;
            while (i12 <= i10) {
                int i14 = i12 + i8;
                if (i14 == i10 + i8 || (i14 != (-i10) + i8 && iArr2[(i5 + i14) - 1] < iArr2[(i5 + i14) + 1])) {
                    i11 = iArr2[(i5 + i14) - 1];
                    z = false;
                } else {
                    i11 = iArr2[(i5 + i14) + 1] - 1;
                    z = true;
                }
                i13 = i11;
                i11 -= i14;
                while (i13 > 0 && i11 > 0 && c0886a.mo884a((i + i13) - 1, (i3 + i11) - 1)) {
                    i13--;
                    i11--;
                }
                iArr2[i5 + i14] = i13;
                if (obj != null || i12 + i8 < (-i10) || i12 + i8 > i10 || iArr[i5 + i14] < iArr2[i5 + i14]) {
                    i12 += 2;
                } else {
                    c0891e = new C0891e();
                    c0891e.f2707a = iArr2[i5 + i14];
                    c0891e.f2708b = c0891e.f2707a - i14;
                    c0891e.f2709c = iArr[i5 + i14] - iArr2[i5 + i14];
                    c0891e.f2710d = z;
                    c0891e.f2711e = true;
                    return c0891e;
                }
            }
            i10++;
        }
        throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
    }
}
