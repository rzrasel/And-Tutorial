package com.orange.studio.banglatype;

import android.support.v7.p012d.C0872b;
import android.support.v7.p012d.C0874c;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

final class bg implements Serializable {
    private static final Map<String, C0874c> f8200b;
    C0872b f8201a;

    static {
        Map hashMap = new HashMap();
        f8200b = hashMap;
        hashMap.put(m7376a(C0874c.f2676b), C0874c.f2676b);
        f8200b.put(m7376a(C0874c.f2675a), C0874c.f2675a);
        f8200b.put(m7376a(C0874c.f2677c), C0874c.f2677c);
        f8200b.put(m7376a(C0874c.f2679e), C0874c.f2679e);
        f8200b.put(m7376a(C0874c.f2680f), C0874c.f2680f);
        f8200b.put(m7376a(C0874c.f2678d), C0874c.f2678d);
        f8200b.put(m7376a(bi.f8205a), bi.f8205a);
        f8200b.put(m7376a(bi.f8206b), bi.f8206b);
        f8200b.put(m7376a(bi.f8207c), bi.f8207c);
        f8200b.put(m7376a(bi.f8208d), bi.f8208d);
        f8200b.put(m7376a(bi.f8209e), bi.f8209e);
        f8200b.put(m7376a(bi.f8210f), bi.f8210f);
        f8200b.put(m7376a(bi.f8211g), bi.f8211g);
        f8200b.put(m7376a(bi.f8212h), bi.f8212h);
    }

    public bg(C0872b c0872b) {
        this.f8201a = c0872b;
    }

    private static String m7376a(C0874c c0874c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c0874c.f2684j);
        stringBuilder.append("_").append(c0874c.f2683i[2]);
        stringBuilder.append("_").append(c0874c.f2683i[1]);
        stringBuilder.append("_").append(c0874c.f2682h[0]);
        stringBuilder.append("_").append(c0874c.f2682h[1]);
        stringBuilder.append("_").append(c0874c.f2682h[2]);
        stringBuilder.append("_").append(c0874c.f2683i[0]);
        stringBuilder.append("_").append(c0874c.f2681g[0]);
        stringBuilder.append("_").append(c0874c.f2681g[1]);
        stringBuilder.append("_").append(c0874c.f2681g[2]);
        return stringBuilder.toString();
    }
}
