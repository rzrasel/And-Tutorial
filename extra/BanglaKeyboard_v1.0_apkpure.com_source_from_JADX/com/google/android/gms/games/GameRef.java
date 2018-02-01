package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C0246e;
import com.google.android.gms.common.data.DataHolder;

public final class GameRef extends C0246e implements Game {
    public GameRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    private Game m1197x() {
        return new GameEntity(this);
    }

    public final /* synthetic */ Object mo701a() {
        return m1197x();
    }

    public final String mo702b() {
        return m998e("external_game_id");
    }

    public final String mo703c() {
        return m998e("display_name");
    }

    public final String mo704d() {
        return m998e("primary_category");
    }

    public final int describeContents() {
        return 0;
    }

    public final String mo705e() {
        return m998e("secondary_category");
    }

    public final boolean equals(Object obj) {
        return GameEntity.m1168a(this, obj);
    }

    public final String mo706f() {
        return m998e("game_description");
    }

    public final String mo707g() {
        return m998e("developer_name");
    }

    public final Uri mo708h() {
        return m1000g("game_icon_image_uri");
    }

    public final int hashCode() {
        return GameEntity.m1167a((Game) this);
    }

    public final String mo709i() {
        return m998e("game_icon_image_url");
    }

    public final Uri mo710j() {
        return m1000g("game_hi_res_image_uri");
    }

    public final String mo711k() {
        return m998e("game_hi_res_image_url");
    }

    public final Uri mo712l() {
        return m1000g("featured_image_uri");
    }

    public final String mo713m() {
        return m998e("featured_image_url");
    }

    public final boolean mo714n() {
        return m997d("play_enabled_game");
    }

    public final boolean mo715o() {
        return m997d("muted");
    }

    public final boolean mo716p() {
        return m997d("identity_sharing_confirmed");
    }

    public final boolean mo717q() {
        return m996c("installed") > 0;
    }

    public final String mo718r() {
        return m998e("package_name");
    }

    public final int mo719s() {
        return m996c("gameplay_acl_status");
    }

    public final int mo720t() {
        return m996c("achievement_total_count");
    }

    public final String toString() {
        return GameEntity.m1171b(this);
    }

    public final int mo721u() {
        return m996c("leaderboard_count");
    }

    public final boolean mo722v() {
        return m996c("real_time_support") > 0;
    }

    public final boolean mo723w() {
        return m996c("turn_based_support") > 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ((GameEntity) m1197x()).writeToParcel(parcel, i);
    }
}
