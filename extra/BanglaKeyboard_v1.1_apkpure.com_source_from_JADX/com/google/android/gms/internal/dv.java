package com.google.android.gms.internal;

import java.util.Comparator;

final class dv implements Comparator<byte[]> {
    dv() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((byte[]) obj).length - ((byte[]) obj2).length;
    }
}
