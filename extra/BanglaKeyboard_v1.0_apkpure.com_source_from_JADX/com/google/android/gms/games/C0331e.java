package com.google.android.gms.games;

import android.text.TextUtils;

final class C0331e {
    public final String f743a;
    public final String f744b;
    public final String f745c;
    public final String f746d;
    public final String f747e;
    public final String f748f;
    public final String f749g;
    public final String f750h;
    public final String f751i;

    public C0331e(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f743a = "external_player_id";
            this.f744b = "profile_name";
            this.f745c = "profile_icon_image_uri";
            this.f746d = "profile_icon_image_url";
            this.f747e = "profile_hi_res_image_uri";
            this.f748f = "profile_hi_res_image_url";
            this.f749g = "last_updated";
            this.f750h = "is_in_circles";
            this.f751i = "played_with_timestamp";
            return;
        }
        this.f743a = str + "external_player_id";
        this.f744b = str + "profile_name";
        this.f745c = str + "profile_icon_image_uri";
        this.f746d = str + "profile_icon_image_url";
        this.f747e = str + "profile_hi_res_image_uri";
        this.f748f = str + "profile_hi_res_image_url";
        this.f749g = str + "last_updated";
        this.f750h = str + "is_in_circles";
        this.f751i = str + "played_with_timestamp";
    }
}
