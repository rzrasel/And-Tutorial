package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.C0246e;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import java.util.ArrayList;

public final class RoomRef extends C0246e implements Room {
    private final int f820c;

    private Room m1491j() {
        return new RoomEntity(this);
    }

    public final /* synthetic */ Object mo701a() {
        return m1491j();
    }

    public final String mo791b() {
        return m998e("external_match_id");
    }

    public final String mo792c() {
        return m998e("creator_external");
    }

    public final long mo793d() {
        return m995b("creation_timestamp");
    }

    public final int describeContents() {
        return 0;
    }

    public final int mo794e() {
        return m996c("status");
    }

    public final boolean equals(Object obj) {
        return RoomEntity.m1475a(this, obj);
    }

    public final String mo795f() {
        return m998e("description");
    }

    public final int mo796g() {
        return m996c("variant");
    }

    public final Bundle mo797h() {
        if (!m997d("has_automatch_criteria")) {
            return null;
        }
        int c = m996c("automatch_min_players");
        int c2 = m996c("automatch_max_players");
        long b = m995b("automatch_bit_mask");
        Bundle bundle = new Bundle();
        bundle.putInt("min_automatch_players", c);
        bundle.putInt("max_automatch_players", c2);
        bundle.putLong("exclusive_bit_mask", b);
        return bundle;
    }

    public final int hashCode() {
        return RoomEntity.m1474a((Room) this);
    }

    public final int mo798i() {
        return m996c("automatch_wait_estimate_sec");
    }

    public final ArrayList mo764k() {
        ArrayList arrayList = new ArrayList(this.f820c);
        for (int i = 0; i < this.f820c; i++) {
            arrayList.add(new ParticipantRef(this.a, this.b + i));
        }
        return arrayList;
    }

    public final String toString() {
        return RoomEntity.m1478b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ((RoomEntity) m1491j()).writeToParcel(parcel, i);
    }
}
