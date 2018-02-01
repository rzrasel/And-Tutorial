package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.C0246e;
import com.google.android.gms.games.Game;
import java.util.ArrayList;

public final class InvitationRef extends C0246e implements Invitation {
    private final Game f786c;
    private final ParticipantRef f787d;
    private final ArrayList f788e;

    private Invitation m1399b() {
        return new InvitationEntity(this);
    }

    public final /* synthetic */ Object mo701a() {
        return m1399b();
    }

    public final Game mo757d() {
        return this.f786c;
    }

    public final int describeContents() {
        return 0;
    }

    public final String mo758e() {
        return m998e("external_invitation_id");
    }

    public final boolean equals(Object obj) {
        return InvitationEntity.m1384a(this, obj);
    }

    public final Participant mo759f() {
        return this.f787d;
    }

    public final long mo760g() {
        return Math.max(m995b("creation_timestamp"), m995b("last_modified_timestamp"));
    }

    public final int mo761h() {
        return m996c("type");
    }

    public final int hashCode() {
        return InvitationEntity.m1383a((Invitation) this);
    }

    public final int mo762i() {
        return m996c("variant");
    }

    public final int mo763j() {
        return !m997d("has_automatch_criteria") ? 0 : m996c("automatch_max_players");
    }

    public final ArrayList mo764k() {
        return this.f788e;
    }

    public final String toString() {
        return InvitationEntity.m1387b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ((InvitationEntity) m1399b()).writeToParcel(parcel, i);
    }
}
