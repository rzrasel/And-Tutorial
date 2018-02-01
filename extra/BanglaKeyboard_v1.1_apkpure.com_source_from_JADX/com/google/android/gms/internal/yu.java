package com.google.android.gms.internal;

import java.util.Comparator;

public final class yu implements Comparator<yi> {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        yi yiVar = (yi) obj;
        yi yiVar2 = (yi) obj2;
        if (yiVar.f7504b < yiVar2.f7504b) {
            return -1;
        }
        if (yiVar.f7504b > yiVar2.f7504b) {
            return 1;
        }
        if (yiVar.f7503a < yiVar2.f7503a) {
            return -1;
        }
        if (yiVar.f7503a > yiVar2.f7503a) {
            return 1;
        }
        float f = (yiVar.f7506d - yiVar.f7504b) * (yiVar.f7505c - yiVar.f7503a);
        float f2 = (yiVar2.f7506d - yiVar2.f7504b) * (yiVar2.f7505c - yiVar2.f7503a);
        return f <= f2 ? f < f2 ? 1 : 0 : -1;
    }
}
