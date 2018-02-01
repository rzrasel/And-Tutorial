package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.C0246e;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import java.util.ArrayList;

public final class TurnBasedMatchRef extends C0246e implements TurnBasedMatch {
    private final Game f842c;
    private final int f843d;

    private TurnBasedMatch m1551w() {
        return new TurnBasedMatchEntity(this);
    }

    public final /* synthetic */ Object mo701a() {
        return m1551w();
    }

    public final Game mo801b() {
        return this.f842c;
    }

    public final String mo802c() {
        return m998e("external_match_id");
    }

    public final String mo803d() {
        return m998e("creator_external");
    }

    public final int describeContents() {
        return 0;
    }

    public final long mo804e() {
        return m995b("creation_timestamp");
    }

    public final boolean equals(Object obj) {
        return TurnBasedMatchEntity.m1526a(this, obj);
    }

    public final int mo805f() {
        return m996c("status");
    }

    public final int mo806g() {
        return m996c("user_match_status");
    }

    public final String mo807h() {
        return m998e("description");
    }

    public final int hashCode() {
        return TurnBasedMatchEntity.m1525a(this);
    }

    public final int mo808i() {
        return m996c("variant");
    }

    public final String mo809j() {
        return m998e("last_updater_external");
    }

    public final ArrayList mo764k() {
        ArrayList arrayList = new ArrayList(this.f843d);
        for (int i = 0; i < this.f843d; i++) {
            arrayList.add(new ParticipantRef(this.a, this.b + i));
        }
        return arrayList;
    }

    public final long mo810l() {
        return m995b("last_updated_timestamp");
    }

    public final String mo811m() {
        return m998e("pending_participant_external");
    }

    public final byte[] mo812n() {
        return m999f("data");
    }

    public final int mo813o() {
        return m996c("version");
    }

    public final String mo814p() {
        return m998e("rematch_id");
    }

    public final byte[] mo815q() {
        return m999f("previous_match_data");
    }

    public final int mo816r() {
        return m996c("match_number");
    }

    public final Bundle mo817s() {
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

    public final int mo818t() {
        return !m997d("has_automatch_criteria") ? 0 : m996c("automatch_max_players");
    }

    public final String toString() {
        return TurnBasedMatchEntity.m1527b(this);
    }

    public final boolean mo819u() {
        return m997d("upsync_required");
    }

    public final String mo820v() {
        return m998e("description_participant_id");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ((TurnBasedMatchEntity) m1551w()).writeToParcel(parcel, i);
    }
}
