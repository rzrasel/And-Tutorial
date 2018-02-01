package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.zzbcc;

public abstract class StatsEvent extends zzbcc implements ReflectedParcelable {
    public abstract long mo1665a();

    public abstract int mo1666b();

    public abstract long mo1667c();

    public abstract String mo1668d();

    public String toString() {
        long a = mo1665a();
        String str = "\t";
        int b = mo1666b();
        String str2 = "\t";
        long c = mo1667c();
        String d = mo1668d();
        return new StringBuilder(((String.valueOf(str).length() + 51) + String.valueOf(str2).length()) + String.valueOf(d).length()).append(a).append(str).append(b).append(str2).append(c).append(d).toString();
    }
}
