package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

public class hd implements SafeParcelable {
    public static final lb CREATOR = new lb();
    private final int f1556a;
    private final String f1557b;
    private final long f1558c;
    private final short f1559d;
    private final double f1560e;
    private final double f1561f;
    private final float f1562g;
    private final int f1563h;
    private final int f1564i;
    private final int f1565j;

    public hd(int i, String str, int i2, short s, double d, double d2, float f, long j, int i3, int i4) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: " + str);
        } else if (f <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f);
        } else if (d > 90.0d || d < -90.0d) {
            throw new IllegalArgumentException("invalid latitude: " + d);
        } else if (d2 > 180.0d || d2 < -180.0d) {
            throw new IllegalArgumentException("invalid longitude: " + d2);
        } else {
            int i5 = i2 & 7;
            if (i5 == 0) {
                throw new IllegalArgumentException("No supported transition specified: " + i2);
            }
            this.f1556a = i;
            this.f1559d = s;
            this.f1557b = str;
            this.f1560e = d;
            this.f1561f = d2;
            this.f1562g = f;
            this.f1558c = j;
            this.f1563h = i5;
            this.f1564i = i3;
            this.f1565j = i4;
        }
    }

    public final int m2140a() {
        return this.f1556a;
    }

    public final short m2141b() {
        return this.f1559d;
    }

    public final double m2142c() {
        return this.f1560e;
    }

    public final double m2143d() {
        return this.f1561f;
    }

    public int describeContents() {
        lb lbVar = CREATOR;
        return 0;
    }

    public final float m2144e() {
        return this.f1562g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof hd)) {
            return false;
        }
        hd hdVar = (hd) obj;
        return this.f1562g != hdVar.f1562g ? false : this.f1560e != hdVar.f1560e ? false : this.f1561f != hdVar.f1561f ? false : this.f1559d == hdVar.f1559d;
    }

    public final String m2145f() {
        return this.f1557b;
    }

    public final long m2146g() {
        return this.f1558c;
    }

    public final int m2147h() {
        return this.f1563h;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f1560e);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f1561f);
        return (((((((i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f1562g)) * 31) + this.f1559d) * 31) + this.f1563h;
    }

    public final int m2148i() {
        return this.f1564i;
    }

    public final int m2149j() {
        return this.f1565j;
    }

    public String toString() {
        String str;
        Locale locale = Locale.US;
        String str2 = "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]";
        Object[] objArr = new Object[9];
        switch (this.f1559d) {
            case (short) 1:
                str = "CIRCLE";
                break;
            default:
                str = null;
                break;
        }
        objArr[0] = str;
        objArr[1] = this.f1557b;
        objArr[2] = Integer.valueOf(this.f1563h);
        objArr[3] = Double.valueOf(this.f1560e);
        objArr[4] = Double.valueOf(this.f1561f);
        objArr[5] = Float.valueOf(this.f1562g);
        objArr[6] = Integer.valueOf(this.f1564i / 1000);
        objArr[7] = Integer.valueOf(this.f1565j);
        objArr[8] = Long.valueOf(this.f1558c);
        return String.format(locale, str2, objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        lb lbVar = CREATOR;
        lb.m2530a(this, parcel);
    }
}
