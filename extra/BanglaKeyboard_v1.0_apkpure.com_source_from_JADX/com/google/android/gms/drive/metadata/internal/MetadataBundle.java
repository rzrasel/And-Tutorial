package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.je;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class MetadataBundle implements SafeParcelable {
    public static final Creator CREATOR = new C0307f();
    final int f658a;
    final Bundle f659b;

    MetadataBundle(int i, Bundle bundle) {
        this.f658a = i;
        this.f659b = (Bundle) je.m2473a((Object) bundle);
        this.f659b.setClassLoader(getClass().getClassLoader());
        List<String> arrayList = new ArrayList();
        for (String str : this.f659b.keySet()) {
            if (C0304c.m1125a(str) == null) {
                arrayList.add(str);
                Log.w("MetadataBundle", "Ignored unknown metadata field in bundle: " + str);
            }
        }
        for (String str2 : arrayList) {
            this.f659b.remove(str2);
        }
    }

    public final Set m1124a() {
        Set hashSet = new HashSet();
        for (String a : this.f659b.keySet()) {
            hashSet.add(C0304c.m1125a(a));
        }
        return hashSet;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetadataBundle)) {
            return false;
        }
        MetadataBundle metadataBundle = (MetadataBundle) obj;
        Set<String> keySet = this.f659b.keySet();
        if (!keySet.equals(metadataBundle.f659b.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!jb.m2470a(this.f659b.get(str), metadataBundle.f659b.get(str))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (String str : this.f659b.keySet()) {
            i *= 31;
            i = this.f659b.get(str).hashCode() + i;
        }
        return i;
    }

    public final String toString() {
        return "MetadataBundle [values=" + this.f659b + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0307f.m1127a(this, parcel);
    }
}
