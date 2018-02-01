package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gx;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CastDevice implements SafeParcelable {
    public static final Creator CREATOR = new C0232b();
    String f458a;
    private final int f459b;
    private String f460c;
    private Inet4Address f461d;
    private String f462e;
    private String f463f;
    private String f464g;
    private int f465h;
    private List f466i;

    private CastDevice() {
        this(1, null, null, null, null, null, -1, new ArrayList());
    }

    CastDevice(int i, String str, String str2, String str3, String str4, String str5, int i2, List list) {
        this.f459b = i;
        this.f460c = str;
        this.f458a = str2;
        if (this.f458a != null) {
            try {
                InetAddress byName = InetAddress.getByName(this.f458a);
                if (byName instanceof Inet4Address) {
                    this.f461d = (Inet4Address) byName;
                }
            } catch (UnknownHostException e) {
                this.f461d = null;
            }
        }
        this.f462e = str3;
        this.f463f = str4;
        this.f464g = str5;
        this.f465h = i2;
        this.f466i = list;
    }

    final int m953a() {
        return this.f459b;
    }

    public final String m954b() {
        return this.f460c;
    }

    public final String m955c() {
        return this.f462e;
    }

    public final String m956d() {
        return this.f463f;
    }

    public int describeContents() {
        return 0;
    }

    public final String m957e() {
        return this.f464g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        return this.f460c == null ? castDevice.f460c == null : gx.m2134a(this.f460c, castDevice.f460c) && gx.m2134a(this.f461d, castDevice.f461d) && gx.m2134a(this.f463f, castDevice.f463f) && gx.m2134a(this.f462e, castDevice.f462e) && gx.m2134a(this.f464g, castDevice.f464g) && this.f465h == castDevice.f465h && gx.m2134a(this.f466i, castDevice.f466i);
    }

    public final int m958f() {
        return this.f465h;
    }

    public final List m959g() {
        return Collections.unmodifiableList(this.f466i);
    }

    public int hashCode() {
        return this.f460c == null ? 0 : this.f460c.hashCode();
    }

    public String toString() {
        return String.format("\"%s\" (%s)", new Object[]{this.f462e, this.f460c});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0232b.m961a(this, parcel);
    }
}
