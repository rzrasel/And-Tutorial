package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C0246e;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class ParticipantRef extends C0246e implements Participant {
    private final PlayerRef f802c;

    public ParticipantRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.f802c = new PlayerRef(dataHolder, i);
    }

    private Participant m1441n() {
        return new ParticipantEntity(this);
    }

    public final /* synthetic */ Object mo701a() {
        return m1441n();
    }

    public final int mo775b() {
        return m996c("player_status");
    }

    public final String mo776c() {
        return m998e("client_address");
    }

    public final int mo777d() {
        return m996c("capabilities");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean mo778e() {
        return m996c("connected") > 0;
    }

    public final boolean equals(Object obj) {
        return ParticipantEntity.m1422a(this, obj);
    }

    public final String mo779f() {
        return m1001h("external_player_id") ? m998e("default_display_name") : this.f802c.mo727c();
    }

    public final Uri mo780g() {
        return m1001h("external_player_id") ? m1000g("default_display_image_uri") : this.f802c.mo728d();
    }

    public final String mo781h() {
        return m1001h("external_player_id") ? m998e("default_display_image_url") : this.f802c.mo729e();
    }

    public final int hashCode() {
        return ParticipantEntity.m1421a((Participant) this);
    }

    public final Uri mo782i() {
        return m1001h("external_player_id") ? m1000g("default_display_hi_res_image_uri") : this.f802c.mo730f();
    }

    public final String mo783j() {
        return m1001h("external_player_id") ? m998e("default_display_hi_res_image_url") : this.f802c.mo731g();
    }

    public final String mo784k() {
        return m998e("external_participant_id");
    }

    public final Player mo785l() {
        return m1001h("external_player_id") ? null : this.f802c;
    }

    public final ParticipantResult mo786m() {
        if (m1001h("result_type")) {
            return null;
        }
        return new ParticipantResult(m998e("external_participant_id"), m996c("result_type"), m996c("placing"));
    }

    public final String toString() {
        return ParticipantEntity.m1425b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ((ParticipantEntity) m1441n()).writeToParcel(parcel, i);
    }
}
