package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

@aqv
public final class zzaes extends zzbcc {
    public static final Creator<zzaes> CREATOR = new C1577do();
    public final String f7698a;
    public final String f7699b;
    public final boolean f7700c;
    public final boolean f7701d;
    public final List<String> f7702e;
    public final boolean f7703f;
    public final boolean f7704g;

    public zzaes(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4) {
        this.f7698a = str;
        this.f7699b = str2;
        this.f7700c = z;
        this.f7701d = z2;
        this.f7702e = list;
        this.f7703f = z3;
        this.f7704g = z4;
    }

    public static zzaes m7092a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("click_string", "");
        String optString2 = jSONObject.optString("report_url", "");
        boolean optBoolean = jSONObject.optBoolean("rendered_ad_enabled", false);
        boolean optBoolean2 = jSONObject.optBoolean("non_malicious_reporting_enabled", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("allowed_headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        List arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            Object optString3 = optJSONArray.optString(i);
            if (!TextUtils.isEmpty(optString3)) {
                arrayList.add(optString3.toLowerCase(Locale.ENGLISH));
            }
        }
        return new zzaes(optString, optString2, optBoolean, optBoolean2, arrayList, jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5961a(parcel, 2, this.f7698a);
        li.m5961a(parcel, 3, this.f7699b);
        li.m5963a(parcel, 4, this.f7700c);
        li.m5963a(parcel, 5, this.f7701d);
        li.m5962a(parcel, 6, this.f7702e);
        li.m5963a(parcel, 7, this.f7703f);
        li.m5963a(parcel, 8, this.f7704g);
        li.m5967b(parcel, a);
    }
}
