package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1514r;
import com.google.android.gms.common.internal.C1515s;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.zzbcc;
import java.util.Arrays;

public final class ConnectionResult extends zzbcc {
    public static final Creator<ConnectionResult> CREATOR = new C1491e();
    public static final ConnectionResult f4506a = new ConnectionResult(0);
    public final int f4507b;
    private int f4508c;
    private final PendingIntent f4509d;
    private final String f4510e;

    public ConnectionResult(int i) {
        this(i, null, (byte) 0);
    }

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f4508c = i;
        this.f4507b = i2;
        this.f4509d = pendingIntent;
        this.f4510e = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (byte) 0);
    }

    private ConnectionResult(int i, PendingIntent pendingIntent, byte b) {
        this(1, i, pendingIntent, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f4507b == connectionResult.f4507b && C1514r.m3858a(this.f4509d, connectionResult.f4509d) && C1514r.m3858a(this.f4510e, connectionResult.f4510e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4507b), this.f4509d, this.f4510e});
    }

    public final String toString() {
        Object obj;
        C1515s a = C1514r.m3857a(this);
        String str = "statusCode";
        int i = this.f4507b;
        switch (i) {
            case -1:
                obj = "UNKNOWN";
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
            case 13:
                obj = "CANCELED";
                break;
            case 14:
                obj = "TIMEOUT";
                break;
            case 15:
                obj = "INTERRUPTED";
                break;
            case 16:
                obj = "API_UNAVAILABLE";
                break;
            case 17:
                obj = "SIGN_IN_FAILED";
                break;
            case 18:
                obj = "SERVICE_UPDATING";
                break;
            case 19:
                obj = "SERVICE_MISSING_PERMISSION";
                break;
            case 20:
                obj = "RESTRICTED_PROFILE";
                break;
            case 21:
                obj = "API_VERSION_UPDATE_REQUIRED";
                break;
            case 99:
                obj = "UNFINISHED";
                break;
            case 1500:
                obj = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
                break;
            default:
                obj = "UNKNOWN_ERROR_CODE(" + i + ")";
                break;
        }
        return a.m3859a(str, obj).m3859a("resolution", this.f4509d).m3859a("message", this.f4510e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5956a(parcel, 1, this.f4508c);
        li.m5956a(parcel, 2, this.f4507b);
        li.m5960a(parcel, 3, this.f4509d, i);
        li.m5961a(parcel, 4, this.f4510e);
        li.m5967b(parcel, a);
    }
}
