package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@aqv
public final class zzaaq extends zzbcc {
    public static final Creator<zzaaq> CREATOR = new C1646p();
    public final boolean f7681a;
    public final List<String> f7682b;

    public zzaaq() {
        this(false, Collections.emptyList());
    }

    public zzaaq(boolean z, List<String> list) {
        this.f7681a = z;
        this.f7682b = list;
    }

    public static zzaaq m7087a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new zzaaq();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        List arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (Throwable e) {
                    id.m5371a("Error grabbing url from json.", e);
                }
            }
        }
        return new zzaaq(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5963a(parcel, 2, this.f7681a);
        li.m5962a(parcel, 3, this.f7682b);
        li.m5967b(parcel, a);
    }
}
