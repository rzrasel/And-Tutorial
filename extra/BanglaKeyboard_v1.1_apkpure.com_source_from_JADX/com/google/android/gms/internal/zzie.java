package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzbv;
import java.util.List;

@aqv
public final class zzie extends zzbcc {
    public static final Creator<zzie> CREATOR = new ze();
    public final String f7732a;
    private long f7733b;
    private String f7734c;
    private String f7735d;
    private String f7736e;
    private Bundle f7737f;
    private boolean f7738g;
    private long f7739h;

    zzie(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.f7732a = str;
        this.f7733b = j;
        if (str2 == null) {
            str2 = "";
        }
        this.f7734c = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.f7735d = str3;
        if (str4 == null) {
            str4 = "";
        }
        this.f7736e = str4;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f7737f = bundle;
        this.f7738g = z;
        this.f7739h = j2;
    }

    public static zzie m7102a(Uri uri) {
        Throwable e;
        long j = 0;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                id.m5370a("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = (String) pathSegments.get(0);
            String str2 = (String) pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            if (queryParameter2 != null) {
                j = Long.parseLong(queryParameter2);
            }
            Bundle bundle = new Bundle();
            for (String queryParameter22 : zzbv.zzec().mo2099a(uri)) {
                if (queryParameter22.startsWith("tag.")) {
                    bundle.putString(queryParameter22.substring(4), uri.getQueryParameter(queryParameter22));
                }
            }
            return new zzie(queryParameter, j, host, str, str2, bundle, equals, 0);
        } catch (NullPointerException e2) {
            e = e2;
            id.m5371a("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e3) {
            e = e3;
            id.m5371a("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    public static zzie m7103a(String str) {
        return m7102a(Uri.parse(str));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5961a(parcel, 2, this.f7732a);
        li.m5957a(parcel, 3, this.f7733b);
        li.m5961a(parcel, 4, this.f7734c);
        li.m5961a(parcel, 5, this.f7735d);
        li.m5961a(parcel, 6, this.f7736e);
        li.m5958a(parcel, 7, this.f7737f);
        li.m5963a(parcel, 8, this.f7738g);
        li.m5957a(parcel, 9, this.f7739h);
        li.m5967b(parcel, a);
    }
}
