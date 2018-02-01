package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.C1514r;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;

@aqv
public final class zzaek extends zzbcc {
    public static final Creator<zzaek> CREATOR = new dh();
    public final String f7696a;
    public final int f7697b;

    public zzaek(RewardItem rewardItem) {
        this(rewardItem.getType(), rewardItem.getAmount());
    }

    public zzaek(String str, int i) {
        this.f7696a = str;
        this.f7697b = i;
    }

    public static zzaek m7090a(String str) {
        zzaek com_google_android_gms_internal_zzaek = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                com_google_android_gms_internal_zzaek = m7091a(new JSONArray(str));
            } catch (JSONException e) {
            }
        }
        return com_google_android_gms_internal_zzaek;
    }

    public static zzaek m7091a(JSONArray jSONArray) {
        return (jSONArray == null || jSONArray.length() == 0) ? null : new zzaek(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zzaek)) {
            return false;
        }
        zzaek com_google_android_gms_internal_zzaek = (zzaek) obj;
        return C1514r.m3858a(this.f7696a, com_google_android_gms_internal_zzaek.f7696a) && C1514r.m3858a(Integer.valueOf(this.f7697b), Integer.valueOf(com_google_android_gms_internal_zzaek.f7697b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7696a, Integer.valueOf(this.f7697b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5961a(parcel, 2, this.f7696a);
        li.m5956a(parcel, 3, this.f7697b);
        li.m5967b(parcel, a);
    }
}
