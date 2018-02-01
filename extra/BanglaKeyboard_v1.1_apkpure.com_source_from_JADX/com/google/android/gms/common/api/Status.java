package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1514r;
import com.google.android.gms.common.internal.C1515s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.zzbcc;
import java.util.Arrays;

public final class Status extends zzbcc implements ReflectedParcelable {
    public static final Creator<Status> CREATOR = new C1485b();
    public static final Status f4514a = new Status(0);
    public static final Status f4515b = new Status(14);
    public static final Status f4516c = new Status(8);
    public static final Status f4517d = new Status(15);
    public static final Status f4518e = new Status(16);
    private static Status f4519f = new Status(17);
    private static Status f4520g = new Status(18);
    private int f4521h;
    private final int f4522i;
    private final String f4523j;
    private final PendingIntent f4524k;

    private Status(int i) {
        this(i, (byte) 0);
    }

    private Status(int i, byte b) {
        this(1, i, null, null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f4521h = i;
        this.f4522i = i2;
        this.f4523j = str;
        this.f4524k = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f4521h == status.f4521h && this.f4522i == status.f4522i && C1514r.m3858a(this.f4523j, status.f4523j) && C1514r.m3858a(this.f4524k, status.f4524k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4521h), Integer.valueOf(this.f4522i), this.f4523j, this.f4524k});
    }

    public final String toString() {
        Object obj;
        C1515s a = C1514r.m3857a(this);
        String str = "statusCode";
        if (this.f4523j == null) {
            int i = this.f4522i;
            switch (i) {
                case -1:
                    obj = "SUCCESS_CACHE";
                    break;
                case 0:
                    obj = "SUCCESS";
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
                case 10:
                    obj = "DEVELOPER_ERROR";
                    break;
                case 13:
                    obj = "ERROR";
                    break;
                case 14:
                    obj = "INTERRUPTED";
                    break;
                case 15:
                    obj = "TIMEOUT";
                    break;
                case 16:
                    obj = "CANCELED";
                    break;
                case 17:
                    obj = "API_NOT_CONNECTED";
                    break;
                case 18:
                    obj = "DEAD_CLIENT";
                    break;
                default:
                    obj = "unknown status code: " + i;
                    break;
            }
        }
        obj = this.f4523j;
        return a.m3859a(str, obj).m3859a("resolution", this.f4524k).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5956a(parcel, 1, this.f4522i);
        li.m5961a(parcel, 2, this.f4523j);
        li.m5960a(parcel, 3, this.f4524k, i);
        li.m5956a(parcel, 1000, this.f4521h);
        li.m5967b(parcel, a);
    }
}
