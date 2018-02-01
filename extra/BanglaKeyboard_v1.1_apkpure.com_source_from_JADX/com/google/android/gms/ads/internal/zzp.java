package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.zzix;
import com.google.android.gms.internal.zzjb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

@aqv
public final class zzp {
    private static String m3775a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            String a = obj == null ? "null" : obj instanceof Bundle ? m3775a((Bundle) obj) : obj.toString();
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }

    public static Object[] zza(String str, zzix com_google_android_gms_internal_zzix, String str2, int i, zzjb com_google_android_gms_internal_zzjb) {
        Set hashSet = new HashSet(Arrays.asList(str.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        if (hashSet.contains("formatString")) {
            arrayList.add(null);
        }
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(com_google_android_gms_internal_zzix.f7741b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(m3775a(com_google_android_gms_internal_zzix.f7742c));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(com_google_android_gms_internal_zzix.f7743d));
        }
        if (hashSet.contains("keywords")) {
            if (com_google_android_gms_internal_zzix.f7744e != null) {
                arrayList.add(com_google_android_gms_internal_zzix.f7744e.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(com_google_android_gms_internal_zzix.f7745f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(com_google_android_gms_internal_zzix.f7746g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(com_google_android_gms_internal_zzix.f7747h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(com_google_android_gms_internal_zzix.f7748i);
        }
        if (hashSet.contains("location")) {
            if (com_google_android_gms_internal_zzix.f7750k != null) {
                arrayList.add(com_google_android_gms_internal_zzix.f7750k.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(com_google_android_gms_internal_zzix.f7751l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(m3775a(com_google_android_gms_internal_zzix.f7752m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(m3775a(com_google_android_gms_internal_zzix.f7753n));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (com_google_android_gms_internal_zzix.f7754o != null) {
                arrayList.add(com_google_android_gms_internal_zzix.f7754o.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(com_google_android_gms_internal_zzix.f7755p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(com_google_android_gms_internal_zzix.f7756q);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(com_google_android_gms_internal_zzix.f7757r));
        }
        return arrayList.toArray();
    }
}
