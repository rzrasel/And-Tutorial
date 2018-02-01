package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.common.data.C0246e;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;

public class ExtendedGameRef extends C0246e implements ExtendedGame {
    private final GameRef f766c;
    private final int f767d;

    private ExtendedGame m1297l() {
        return new ExtendedGameEntity(this);
    }

    public final /* synthetic */ Object mo701a() {
        return m1297l();
    }

    public final Game mo739b() {
        return this.f766c;
    }

    public final ArrayList mo740c() {
        int i = 0;
        if (this.a.m983c("badge_title", this.b, this.a.m977a(this.b)) == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(this.f767d);
        while (i < this.f767d) {
            arrayList.add(new GameBadgeRef(this.a, this.b + i));
            i++;
        }
        return arrayList;
    }

    public final int mo741d() {
        return m996c("availability");
    }

    public int describeContents() {
        return 0;
    }

    public final boolean mo742e() {
        return m997d("owned");
    }

    public boolean equals(Object obj) {
        return ExtendedGameEntity.m1279a(this, obj);
    }

    public final int mo743f() {
        return m996c("achievement_unlocked_count");
    }

    public final long mo744g() {
        return m995b("last_played_server_time");
    }

    public final long mo745h() {
        return m995b("price_micros");
    }

    public int hashCode() {
        return ExtendedGameEntity.m1278a((ExtendedGame) this);
    }

    public final String mo746i() {
        return m998e("formatted_price");
    }

    public final long mo747j() {
        return m995b("full_price_micros");
    }

    public final String mo748k() {
        return m998e("formatted_full_price");
    }

    public String toString() {
        return ExtendedGameEntity.m1282b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((ExtendedGameEntity) m1297l()).writeToParcel(parcel, i);
    }
}
