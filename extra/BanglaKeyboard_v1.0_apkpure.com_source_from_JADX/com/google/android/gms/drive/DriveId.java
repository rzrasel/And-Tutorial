package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.C0292y;
import com.google.android.gms.internal.je;
import com.google.android.gms.internal.mw;
import com.google.android.gms.internal.na;

public class DriveId implements SafeParcelable {
    public static final Creator CREATOR = new C0265b();
    final int f570a;
    final String f571b;
    final long f572c;
    final long f573d;
    private volatile String f574e = null;

    DriveId(int i, String str, long j, long j2) {
        boolean z = false;
        this.f570a = i;
        this.f571b = str;
        je.m2478b(!"".equals(str));
        if (!(str == null && j == -1)) {
            z = true;
        }
        je.m2478b(z);
        this.f572c = j;
        this.f573d = j2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DriveId)) {
            return false;
        }
        DriveId driveId = (DriveId) obj;
        if (driveId.f573d == this.f573d) {
            return (driveId.f572c == -1 && this.f572c == -1) ? driveId.f571b.equals(this.f571b) : driveId.f572c == this.f572c;
        } else {
            Log.w("DriveId", "Attempt to compare invalid DriveId detected. Has local storage been cleared?");
            return false;
        }
    }

    public int hashCode() {
        return this.f572c == -1 ? this.f571b.hashCode() : (String.valueOf(this.f573d) + String.valueOf(this.f572c)).hashCode();
    }

    public String toString() {
        if (this.f574e == null) {
            na c0292y = new C0292y();
            c0292y.f651a = this.f570a;
            c0292y.f652b = this.f571b == null ? "" : this.f571b;
            c0292y.f653c = this.f572c;
            c0292y.f654d = this.f573d;
            byte[] bArr = new byte[c0292y.mo699a()];
            try {
                mw a = mw.m2634a(bArr, bArr.length);
                c0292y.mo697a(a);
                if (a.m2645a() != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                this.f574e = "DriveId:" + Base64.encodeToString(bArr, 10);
            } catch (Throwable e) {
                throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
            }
        }
        return this.f574e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0265b.m1086a(this, parcel);
    }
}
