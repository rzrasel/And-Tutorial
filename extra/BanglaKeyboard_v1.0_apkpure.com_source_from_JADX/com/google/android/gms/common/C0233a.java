package com.google.android.gms.common;

import android.app.PendingIntent;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.jc;

public final class C0233a {
    public static final C0233a f473a = new C0233a(0, null);
    private final PendingIntent f474b;
    private final int f475c;

    public C0233a(int i, PendingIntent pendingIntent) {
        this.f475c = i;
        this.f474b = pendingIntent;
    }

    public final String toString() {
        Object obj;
        jc a = jb.m2469a(this);
        String str = "statusCode";
        switch (this.f475c) {
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
            default:
                obj = "unknown status code " + this.f475c;
                break;
        }
        return a.m2471a(str, obj).m2471a("resolution", this.f474b).toString();
    }
}
