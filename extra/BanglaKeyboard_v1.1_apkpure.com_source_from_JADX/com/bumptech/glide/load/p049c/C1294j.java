package com.bumptech.glide.load.p049c;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class C1294j implements C1285e {
    private final Map<String, List<C1291i>> f3677c;
    private volatile Map<String, String> f3678d;

    public static final class C1292a {
        private static final String f3670c = System.getProperty("http.agent");
        private static final Map<String, List<C1291i>> f3671d;
        boolean f3672a = true;
        Map<String, List<C1291i>> f3673b = f3671d;
        private boolean f3674e = true;
        private boolean f3675f = true;

        static {
            Map hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(f3670c)) {
                hashMap.put("User-Agent", Collections.singletonList(new C1293b(f3670c)));
            }
            hashMap.put("Accept-Encoding", Collections.singletonList(new C1293b("identity")));
            f3671d = Collections.unmodifiableMap(hashMap);
        }
    }

    static final class C1293b implements C1291i {
        private final String f3676a;

        C1293b(String str) {
            this.f3676a = str;
        }

        public final String mo1378a() {
            return this.f3676a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1293b)) {
                return false;
            }
            return this.f3676a.equals(((C1293b) obj).f3676a);
        }

        public final int hashCode() {
            return this.f3676a.hashCode();
        }

        public final String toString() {
            return "StringHeaderFactory{value='" + this.f3676a + '\'' + '}';
        }
    }

    C1294j(Map<String, List<C1291i>> map) {
        this.f3677c = Collections.unmodifiableMap(map);
    }

    public final Map<String, String> mo1375a() {
        if (this.f3678d == null) {
            synchronized (this) {
                if (this.f3678d == null) {
                    Map hashMap = new HashMap();
                    for (Entry entry : this.f3677c.entrySet()) {
                        StringBuilder stringBuilder = new StringBuilder();
                        List list = (List) entry.getValue();
                        for (int i = 0; i < list.size(); i++) {
                            stringBuilder.append(((C1291i) list.get(i)).mo1378a());
                            if (i != list.size() - 1) {
                                stringBuilder.append(',');
                            }
                        }
                        hashMap.put(entry.getKey(), stringBuilder.toString());
                    }
                    this.f3678d = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return this.f3678d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1294j)) {
            return false;
        }
        return this.f3677c.equals(((C1294j) obj).f3677c);
    }

    public final int hashCode() {
        return this.f3677c.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f3677c + '}';
    }
}
