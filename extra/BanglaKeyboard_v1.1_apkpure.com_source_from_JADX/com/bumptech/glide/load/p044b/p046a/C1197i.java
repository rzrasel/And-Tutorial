package com.bumptech.glide.load.p044b.p046a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.p042h.C1163h;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

@TargetApi(19)
public final class C1197i implements C1185g {
    private static final Config[] f3510a = new Config[]{Config.ARGB_8888, null};
    private static final Config[] f3511b = new Config[]{Config.RGB_565};
    private static final Config[] f3512c = new Config[]{Config.ARGB_4444};
    private static final Config[] f3513d = new Config[]{Config.ALPHA_8};
    private final C1196b f3514e = new C1196b();
    private final C1190e<C1195a, Bitmap> f3515f = new C1190e();
    private final Map<Config, NavigableMap<Integer, Integer>> f3516g = new HashMap();

    static /* synthetic */ class C11941 {
        static final /* synthetic */ int[] f3506a = new int[Config.values().length];

        static {
            try {
                f3506a[Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f3506a[Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f3506a[Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f3506a[Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    static final class C1195a implements C1181h {
        int f3507a;
        Config f3508b;
        private final C1196b f3509c;

        public C1195a(C1196b c1196b) {
            this.f3509c = c1196b;
        }

        public final void mo1334a() {
            this.f3509c.m3205a(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1195a)) {
                return false;
            }
            C1195a c1195a = (C1195a) obj;
            if (this.f3507a != c1195a.f3507a) {
                return false;
            }
            if (this.f3508b == null) {
                if (c1195a.f3508b != null) {
                    return false;
                }
            } else if (!this.f3508b.equals(c1195a.f3508b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (this.f3508b != null ? this.f3508b.hashCode() : 0) + (this.f3507a * 31);
        }

        public final String toString() {
            return C1197i.m3253b(this.f3507a, this.f3508b);
        }
    }

    static class C1196b extends C1183b<C1195a> {
        C1196b() {
        }

        protected final /* synthetic */ C1181h mo1335a() {
            return new C1195a(this);
        }

        public final C1195a m3249a(int i, Config config) {
            C1195a c1195a = (C1195a) m3206b();
            c1195a.f3507a = i;
            c1195a.f3508b = config;
            return c1195a;
        }
    }

    private NavigableMap<Integer, Integer> m3251a(Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f3516g.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        NavigableMap treeMap = new TreeMap();
        this.f3516g.put(config, treeMap);
        return treeMap;
    }

    private void m3252a(Integer num, Config config) {
        NavigableMap a = m3251a(config);
        Integer num2 = (Integer) a.get(num);
        if (num2.intValue() == 1) {
            a.remove(num);
        } else {
            a.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private static String m3253b(int i, Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final Bitmap mo1336a() {
        Bitmap bitmap = (Bitmap) this.f3515f.m3236a();
        if (bitmap != null) {
            m3252a(Integer.valueOf(C1163h.m3150a(bitmap)), bitmap.getConfig());
        }
        return bitmap;
    }

    public final Bitmap mo1337a(int i, int i2, Config config) {
        Config[] configArr;
        C1181h a;
        Bitmap bitmap;
        int i3 = 0;
        int a2 = C1163h.m3149a(i, i2, config);
        C1181h a3 = this.f3514e.m3249a(a2, config);
        switch (C11941.f3506a[config.ordinal()]) {
            case 1:
                configArr = f3510a;
                break;
            case 2:
                configArr = f3511b;
                break;
            case 3:
                configArr = f3512c;
                break;
            case 4:
                configArr = f3513d;
                break;
            default:
                configArr = new Config[]{config};
                break;
        }
        int length = configArr.length;
        while (i3 < length) {
            Config config2 = configArr[i3];
            Integer num = (Integer) m3251a(config2).ceilingKey(Integer.valueOf(a2));
            if (num == null || num.intValue() > a2 * 8) {
                i3++;
            } else {
                if (num.intValue() != a2 || (config2 != null ? !config2.equals(config) : config != null)) {
                    this.f3514e.m3205a(a3);
                    a = this.f3514e.m3249a(num.intValue(), config2);
                    bitmap = (Bitmap) this.f3515f.m3237a(a);
                    if (bitmap != null) {
                        m3252a(Integer.valueOf(C1163h.m3150a(bitmap)), bitmap.getConfig());
                        bitmap.reconfigure(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888);
                    }
                    return bitmap;
                }
                a = a3;
                bitmap = (Bitmap) this.f3515f.m3237a(a);
                if (bitmap != null) {
                    m3252a(Integer.valueOf(C1163h.m3150a(bitmap)), bitmap.getConfig());
                    if (bitmap.getConfig() != null) {
                    }
                    bitmap.reconfigure(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888);
                }
                return bitmap;
            }
        }
        a = a3;
        bitmap = (Bitmap) this.f3515f.m3237a(a);
        if (bitmap != null) {
            m3252a(Integer.valueOf(C1163h.m3150a(bitmap)), bitmap.getConfig());
            if (bitmap.getConfig() != null) {
            }
            bitmap.reconfigure(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888);
        }
        return bitmap;
    }

    public final void mo1338a(Bitmap bitmap) {
        C1195a a = this.f3514e.m3249a(C1163h.m3150a(bitmap), bitmap.getConfig());
        this.f3515f.m3238a(a, bitmap);
        NavigableMap a2 = m3251a(bitmap.getConfig());
        Integer num = (Integer) a2.get(Integer.valueOf(a.f3507a));
        a2.put(Integer.valueOf(a.f3507a), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
    }

    public final String mo1339b(int i, int i2, Config config) {
        return C1197i.m3253b(C1163h.m3149a(i, i2, config), config);
    }

    public final String mo1340b(Bitmap bitmap) {
        return C1197i.m3253b(C1163h.m3150a(bitmap), bitmap.getConfig());
    }

    public final int mo1341c(Bitmap bitmap) {
        return C1163h.m3150a(bitmap);
    }

    public final String toString() {
        StringBuilder append = new StringBuilder("SizeConfigStrategy{groupedMap=").append(this.f3515f).append(", sortedSizes=(");
        for (Entry entry : this.f3516g.entrySet()) {
            append.append(entry.getKey()).append('[').append(entry.getValue()).append("], ");
        }
        if (!this.f3516g.isEmpty()) {
            append.replace(append.length() - 2, append.length(), "");
        }
        return append.append(")}").toString();
    }
}
