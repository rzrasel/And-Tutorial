package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.jc;
import java.util.Arrays;

public final class Status implements SafeParcelable {
    public static final C0238d CREATOR = new C0238d();
    public static final Status f476a = new Status(0);
    public static final Status f477b = new Status(14);
    public static final Status f478c = new Status(8);
    public static final Status f479d = new Status(15);
    public static final Status f480e = new Status(16);
    private final int f481f;
    private final int f482g;
    private final String f483h;
    private final PendingIntent f484i;

    private Status(int i) {
        this(1, i, null, null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f481f = i;
        this.f482g = i2;
        this.f483h = str;
        this.f484i = pendingIntent;
    }

    final PendingIntent m964a() {
        return this.f484i;
    }

    final String m965b() {
        return this.f483h;
    }

    final int m966c() {
        return this.f481f;
    }

    public final int m967d() {
        return this.f482g;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f481f == status.f481f && this.f482g == status.f482g && jb.m2470a(this.f483h, status.f483h) && jb.m2470a(this.f484i, status.f484i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f481f), Integer.valueOf(this.f482g), this.f483h, this.f484i});
    }

    public final String toString() {
        Object obj;
        jc a = jb.m2469a(this);
        String str = "statusCode";
        if (this.f483h == null) {
            int i = this.f482g;
            switch (i) {
                case -1:
                    obj = "SUCCESS_CACHE";
                    break;
                case 0:
                    obj = "SUCCESS";
                    break;
                case 1:
                    obj = "SERVICE_MISSING";
                    break;
                case 2:
                    obj = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    obj = "SERVICE_DISABLED";
                    break;
                case 4:
                    obj = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    obj = "INVALID_ACCOUNT";
                    break;
                case 6:
                    obj = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    obj = "NETWORK_ERROR";
                    break;
                case 8:
                    obj = "INTERNAL_ERROR";
                    break;
                case 9:
                    obj = "SERVICE_INVALID";
                    break;
                case 10:
                    obj = "DEVELOPER_ERROR";
                    break;
                case 11:
                    obj = "LICENSE_CHECK_FAILED";
                    break;
                case 3000:
                    obj = "AUTH_API_INVALID_CREDENTIALS";
                    break;
                case 3001:
                    obj = "AUTH_API_ACCESS_FORBIDDEN";
                    break;
                case 3002:
                    obj = "AUTH_API_CLIENT_ERROR";
                    break;
                case 3003:
                    obj = "AUTH_API_SERVER_ERROR";
                    break;
                case 3004:
                    obj = "AUTH_TOKEN_ERROR";
                    break;
                case 3005:
                    obj = "AUTH_URL_RESOLUTION";
                    break;
                default:
                    obj = "unknown status code: " + i;
                    break;
            }
        }
        obj = this.f483h;
        return a.m2471a(str, obj).m2471a("resolution", this.f484i).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0238d.m971a(this, parcel, i);
    }
}
