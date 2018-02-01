package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@aqv
public final class zy {
    public static final zy f7584a = new zy();

    protected zy() {
    }

    public static zzix m7086a(Context context, acd com_google_android_gms_internal_acd) {
        Date date = com_google_android_gms_internal_acd.f4769a;
        long time = date != null ? date.getTime() : -1;
        String str = com_google_android_gms_internal_acd.f4770b;
        int i = com_google_android_gms_internal_acd.f4771c;
        Collection collection = com_google_android_gms_internal_acd.f4772d;
        List unmodifiableList = !collection.isEmpty() ? Collections.unmodifiableList(new ArrayList(collection)) : null;
        boolean a = com_google_android_gms_internal_acd.m4096a(context);
        int i2 = com_google_android_gms_internal_acd.f4780l;
        Location location = com_google_android_gms_internal_acd.f4773e;
        Bundle b = com_google_android_gms_internal_acd.m4097b(AdMobAdapter.class);
        boolean z = com_google_android_gms_internal_acd.f4774f;
        String str2 = com_google_android_gms_internal_acd.f4777i;
        SearchAdRequest searchAdRequest = com_google_android_gms_internal_acd.f4779k;
        zzlz com_google_android_gms_internal_zzlz = searchAdRequest != null ? new zzlz(searchAdRequest) : null;
        String str3 = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            aak.m4022a();
            str3 = hz.m5616a(Thread.currentThread().getStackTrace(), packageName);
        }
        return new zzix(7, time, b, i, unmodifiableList, a, i2, z, str2, com_google_android_gms_internal_zzlz, location, str, com_google_android_gms_internal_acd.f4775g, com_google_android_gms_internal_acd.f4781m, Collections.unmodifiableList(new ArrayList(com_google_android_gms_internal_acd.f4782n)), com_google_android_gms_internal_acd.f4778j, str3, com_google_android_gms_internal_acd.f4783o);
    }
}
