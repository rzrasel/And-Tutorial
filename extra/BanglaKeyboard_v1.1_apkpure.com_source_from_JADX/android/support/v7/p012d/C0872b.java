package android.support.v7.p012d;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.support.v4.p006a.C0375a;
import android.support.v4.p018f.C0478a;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class C0872b {
    static final C0868b f2668f = new C08691();
    public final List<C0871c> f2669a;
    final List<C0874c> f2670b;
    final Map<C0874c, C0871c> f2671c = new C0478a();
    final SparseBooleanArray f2672d = new SparseBooleanArray();
    final C0871c f2673e = m2546a();

    public interface C0868b {
        boolean mo847a(float[] fArr);
    }

    static class C08691 implements C0868b {
        C08691() {
        }

        public final boolean mo847a(float[] fArr) {
            if (!(fArr[2] >= 0.95f)) {
                if (!(fArr[2] <= 0.05f)) {
                    boolean z = fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
                    if (!z) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static final class C0870a {
        public final List<C0868b> f2651a = new ArrayList();
        private final List<C0871c> f2652b;
        private final Bitmap f2653c;
        private final List<C0874c> f2654d = new ArrayList();
        private int f2655e = 16;
        private int f2656f = 12544;
        private int f2657g = -1;
        private Rect f2658h;

        public C0870a(Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            this.f2651a.add(C0872b.f2668f);
            this.f2653c = bitmap;
            this.f2652b = null;
            this.f2654d.add(C0874c.f2675a);
            this.f2654d.add(C0874c.f2676b);
            this.f2654d.add(C0874c.f2677c);
            this.f2654d.add(C0874c.f2678d);
            this.f2654d.add(C0874c.f2679e);
            this.f2654d.add(C0874c.f2680f);
        }

        private int[] m2539a(Bitmap bitmap) {
            int i = 0;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Object obj = new int[(width * height)];
            bitmap.getPixels(obj, 0, width, 0, 0, width, height);
            if (this.f2658h == null) {
                return obj;
            }
            int width2 = this.f2658h.width();
            int height2 = this.f2658h.height();
            Object obj2 = new int[(width2 * height2)];
            while (i < height2) {
                System.arraycopy(obj, ((this.f2658h.top + i) * width) + this.f2658h.left, obj2, i * width2, width2);
                i++;
            }
            return obj2;
        }

        public final C0870a m2540a() {
            this.f2656f = -1;
            this.f2657g = -1;
            return this;
        }

        public final C0870a m2541a(C0874c c0874c) {
            if (!this.f2654d.contains(c0874c)) {
                this.f2654d.add(c0874c);
            }
            return this;
        }

        public final C0872b m2542b() {
            int width;
            List list;
            if (this.f2653c != null) {
                Bitmap bitmap = this.f2653c;
                double d = -1.0d;
                if (this.f2656f > 0) {
                    width = bitmap.getWidth() * bitmap.getHeight();
                    if (width > this.f2656f) {
                        d = Math.sqrt(((double) this.f2656f) / ((double) width));
                    }
                } else if (this.f2657g > 0) {
                    width = Math.max(bitmap.getWidth(), bitmap.getHeight());
                    if (width > this.f2657g) {
                        d = ((double) this.f2657g) / ((double) width);
                    }
                }
                Bitmap createScaledBitmap = d <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * d), (int) Math.ceil(d * ((double) bitmap.getHeight())), false);
                Rect rect = this.f2658h;
                if (!(createScaledBitmap == this.f2653c || rect == null)) {
                    double width2 = ((double) createScaledBitmap.getWidth()) / ((double) this.f2653c.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width2);
                    rect.top = (int) Math.floor(((double) rect.top) * width2);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width2), createScaledBitmap.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(width2 * ((double) rect.bottom)), createScaledBitmap.getHeight());
                }
                C0867a c0867a = new C0867a(m2539a(createScaledBitmap), this.f2655e, this.f2651a.isEmpty() ? null : (C0868b[]) this.f2651a.toArray(new C0868b[this.f2651a.size()]));
                if (createScaledBitmap != this.f2653c) {
                    createScaledBitmap.recycle();
                }
                list = c0867a.f2647c;
            } else {
                list = this.f2652b;
            }
            C0872b c0872b = new C0872b(list, this.f2654d);
            int size = c0872b.f2670b.size();
            for (int i = 0; i < size; i++) {
                int i2;
                C0874c c0874c = (C0874c) c0872b.f2670b.get(i);
                float f = 0.0f;
                for (float f2 : c0874c.f2683i) {
                    float f22;
                    if (f22 > 0.0f) {
                        f += f22;
                    }
                }
                if (f != 0.0f) {
                    width = c0874c.f2683i.length;
                    for (i2 = 0; i2 < width; i2++) {
                        if (c0874c.f2683i[i2] > 0.0f) {
                            float[] fArr = c0874c.f2683i;
                            fArr[i2] = fArr[i2] / f;
                        }
                    }
                }
                Map map = c0872b.f2671c;
                float f3 = 0.0f;
                C0871c c0871c = null;
                int size2 = c0872b.f2669a.size();
                int i3 = 0;
                while (i3 < size2) {
                    float f4;
                    C0871c c0871c2 = (C0871c) c0872b.f2669a.get(i3);
                    fArr = c0871c2.m2544a();
                    Object obj = (fArr[1] < c0874c.f2681g[0] || fArr[1] > c0874c.f2681g[2] || fArr[2] < c0874c.f2682h[0] || fArr[2] > c0874c.f2682h[2] || c0872b.f2672d.get(c0871c2.f2659a)) ? null : 1;
                    if (obj != null) {
                        float[] a = c0871c2.m2544a();
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        int i4 = c0872b.f2673e != null ? c0872b.f2673e.f2660b : 1;
                        if (c0874c.f2683i[0] > 0.0f) {
                            f5 = c0874c.f2683i[0] * (1.0f - Math.abs(a[1] - c0874c.f2681g[1]));
                        }
                        if (c0874c.f2683i[1] > 0.0f) {
                            f6 = c0874c.f2683i[1] * (1.0f - Math.abs(a[2] - c0874c.f2682h[1]));
                        }
                        f22 = (c0874c.f2683i[2] > 0.0f ? (((float) c0871c2.f2660b) / ((float) i4)) * c0874c.f2683i[2] : 0.0f) + (f5 + f6);
                        if (c0871c == null || f22 > f3) {
                            f4 = f22;
                            i3++;
                            f3 = f4;
                            c0871c = c0871c2;
                        }
                    }
                    c0871c2 = c0871c;
                    f4 = f3;
                    i3++;
                    f3 = f4;
                    c0871c = c0871c2;
                }
                if (c0871c != null && c0874c.f2684j) {
                    c0872b.f2672d.append(c0871c.f2659a, true);
                }
                map.put(c0874c, c0871c);
            }
            c0872b.f2672d.clear();
            return c0872b;
        }
    }

    public static final class C0871c {
        public final int f2659a;
        public final int f2660b;
        private final int f2661c;
        private final int f2662d;
        private final int f2663e;
        private boolean f2664f;
        private int f2665g;
        private int f2666h;
        private float[] f2667i;

        public C0871c(int i, int i2) {
            this.f2661c = Color.red(i);
            this.f2662d = Color.green(i);
            this.f2663e = Color.blue(i);
            this.f2659a = i;
            this.f2660b = i2;
        }

        private void m2543c() {
            if (!this.f2664f) {
                int a = C0375a.m1073a(-1, this.f2659a, 4.5f);
                int a2 = C0375a.m1073a(-1, this.f2659a, 3.0f);
                if (a == -1 || a2 == -1) {
                    int a3 = C0375a.m1073a(-16777216, this.f2659a, 4.5f);
                    int a4 = C0375a.m1073a(-16777216, this.f2659a, 3.0f);
                    if (a3 == -1 || a4 == -1) {
                        this.f2666h = a != -1 ? C0375a.m1081b(-1, a) : C0375a.m1081b(-16777216, a3);
                        this.f2665g = a2 != -1 ? C0375a.m1081b(-1, a2) : C0375a.m1081b(-16777216, a4);
                        this.f2664f = true;
                        return;
                    }
                    this.f2666h = C0375a.m1081b(-16777216, a3);
                    this.f2665g = C0375a.m1081b(-16777216, a4);
                    this.f2664f = true;
                    return;
                }
                this.f2666h = C0375a.m1081b(-1, a);
                this.f2665g = C0375a.m1081b(-1, a2);
                this.f2664f = true;
            }
        }

        public final float[] m2544a() {
            if (this.f2667i == null) {
                this.f2667i = new float[3];
            }
            C0375a.m1076a(this.f2661c, this.f2662d, this.f2663e, this.f2667i);
            return this.f2667i;
        }

        public final int m2545b() {
            m2543c();
            return this.f2666h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0871c c0871c = (C0871c) obj;
            return this.f2660b == c0871c.f2660b && this.f2659a == c0871c.f2659a;
        }

        public final int hashCode() {
            return (this.f2659a * 31) + this.f2660b;
        }

        public final String toString() {
            StringBuilder append = new StringBuilder(getClass().getSimpleName()).append(" [RGB: #").append(Integer.toHexString(this.f2659a)).append(']').append(" [HSL: ").append(Arrays.toString(m2544a())).append(']').append(" [Population: ").append(this.f2660b).append(']').append(" [Title Text: #");
            m2543c();
            return append.append(Integer.toHexString(this.f2665g)).append(']').append(" [Body Text: #").append(Integer.toHexString(m2545b())).append(']').toString();
        }
    }

    C0872b(List<C0871c> list, List<C0874c> list2) {
        this.f2669a = list;
        this.f2670b = list2;
    }

    private C0871c m2546a() {
        int i = Integer.MIN_VALUE;
        C0871c c0871c = null;
        int size = this.f2669a.size();
        int i2 = 0;
        while (i2 < size) {
            int i3;
            C0871c c0871c2 = (C0871c) this.f2669a.get(i2);
            if (c0871c2.f2660b > i) {
                i3 = c0871c2.f2660b;
            } else {
                c0871c2 = c0871c;
                i3 = i;
            }
            i2++;
            i = i3;
            c0871c = c0871c2;
        }
        return c0871c;
    }

    public final C0871c m2547a(C0874c c0874c) {
        return (C0871c) this.f2671c.get(c0874c);
    }
}
