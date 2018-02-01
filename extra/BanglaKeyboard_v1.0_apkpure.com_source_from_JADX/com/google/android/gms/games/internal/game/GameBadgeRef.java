package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C0246e;
import com.google.android.gms.common.data.DataHolder;

public final class GameBadgeRef extends C0246e implements GameBadge {
    GameBadgeRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    private GameBadge m1325f() {
        return new GameBadgeEntity(this);
    }

    public final /* synthetic */ Object mo701a() {
        return m1325f();
    }

    public final int mo749b() {
        return m996c("badge_type");
    }

    public final String mo750c() {
        return m998e("badge_title");
    }

    public final String mo751d() {
        return m998e("badge_description");
    }

    public final int describeContents() {
        return 0;
    }

    public final Uri mo752e() {
        return m1000g("badge_icon_image_uri");
    }

    public final boolean equals(Object obj) {
        return GameBadgeEntity.m1314a(this, obj);
    }

    public final int hashCode() {
        return GameBadgeEntity.m1313a((GameBadge) this);
    }

    public final String toString() {
        return GameBadgeEntity.m1317b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ((GameBadgeEntity) m1325f()).writeToParcel(parcel, i);
    }
}
