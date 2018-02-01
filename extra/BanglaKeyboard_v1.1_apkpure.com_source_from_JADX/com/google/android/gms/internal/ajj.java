package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@aqv
public final class ajj implements Iterable<ajh> {
    public final List<ajh> f5188a = new LinkedList();

    public static boolean m4592a(jf jfVar) {
        ajh c = m4594c(jfVar);
        if (c == null) {
            return false;
        }
        c.f5185b.mo1866a();
        return true;
    }

    public static boolean m4593b(jf jfVar) {
        return m4594c(jfVar) != null;
    }

    private static ajh m4594c(jf jfVar) {
        Iterator it = zzbv.zzex().iterator();
        while (it.hasNext()) {
            ajh com_google_android_gms_internal_ajh = (ajh) it.next();
            if (com_google_android_gms_internal_ajh.f5184a == jfVar) {
                return com_google_android_gms_internal_ajh;
            }
        }
        return null;
    }

    public final Iterator<ajh> iterator() {
        return this.f5188a.iterator();
    }
}
