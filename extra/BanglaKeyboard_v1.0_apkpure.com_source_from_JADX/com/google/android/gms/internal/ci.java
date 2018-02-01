package com.google.android.gms.internal;

import com.google.android.gms.ads.C0223f;
import com.google.p004a.C0188b;
import com.google.p004a.C0189c;
import com.google.p004a.p005a.C0179a;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public final class ci {
    public static C0179a m1785a(ah ahVar) {
        C0188b c0188b;
        Set hashSet = ahVar.f918e != null ? new HashSet(ahVar.f918e) : null;
        Date date = new Date(ahVar.f915b);
        switch (ahVar.f917d) {
            case 1:
                c0188b = C0188b.MALE;
                break;
            case 2:
                c0188b = C0188b.FEMALE;
                break;
            default:
                c0188b = C0188b.UNKNOWN;
                break;
        }
        return new C0179a(date, c0188b, hashSet, ahVar.f919f, ahVar.f924k);
    }

    public static C0189c m1786a(ak akVar) {
        int i = 0;
        C0189c[] c0189cArr = new C0189c[]{C0189c.f380a, C0189c.f381b, C0189c.f382c, C0189c.f383d, C0189c.f384e, C0189c.f385f};
        while (i < c0189cArr.length) {
            if (c0189cArr[i].m768a() == akVar.f939f && c0189cArr[i].m769b() == akVar.f936c) {
                return c0189cArr[i];
            }
            i++;
        }
        return new C0189c(C0223f.m928a(akVar.f939f, akVar.f936c, akVar.f935b));
    }
}
