package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.ads.internal.zzbv;
import org.json.JSONObject;

@aqv
public abstract class ade<T> {
    final int f4850a;
    final String f4851b;
    public final T f4852c;

    private ade(int i, String str, T t) {
        this.f4850a = i;
        this.f4851b = str;
        this.f4852c = t;
        zzbv.zzem().f4853a.add(this);
    }

    public static ade<Float> m4190a(int i, String str) {
        return new adi(i, str, Float.valueOf(0.0f));
    }

    public static ade<Integer> m4191a(int i, String str, int i2) {
        return new adg(i, str, Integer.valueOf(i2));
    }

    public static ade<Long> m4192a(int i, String str, long j) {
        return new adh(i, str, Long.valueOf(j));
    }

    public static ade<Boolean> m4193a(int i, String str, Boolean bool) {
        return new adf(i, str, bool);
    }

    public static ade<String> m4194a(int i, String str, String str2) {
        return new adj(i, str, str2);
    }

    public static ade<String> m4195b(int i, String str) {
        ade<String> a = m4194a(i, str, null);
        zzbv.zzem().f4854b.add(a);
        return a;
    }

    public static ade<String> m4196c(int i, String str) {
        ade<String> a = m4194a(i, str, null);
        zzbv.zzem().f4855c.add(a);
        return a;
    }

    protected abstract T mo1733a(SharedPreferences sharedPreferences);

    protected abstract T mo1734a(JSONObject jSONObject);

    public abstract void mo1735a(Editor editor, T t);
}
