package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.je;
import java.util.ArrayList;
import java.util.Arrays;

public final class InvitationEntity extends GamesDowngradeableSafeParcel implements Invitation {
    public static final Creator CREATOR = new C0341a();
    private final int f777b;
    private final GameEntity f778c;
    private final String f779d;
    private final long f780e;
    private final int f781f;
    private final ParticipantEntity f782g;
    private final ArrayList f783h;
    private final int f784i;
    private final int f785j;

    InvitationEntity(int i, GameEntity gameEntity, String str, long j, int i2, ParticipantEntity participantEntity, ArrayList arrayList, int i3, int i4) {
        this.f777b = i;
        this.f778c = gameEntity;
        this.f779d = str;
        this.f780e = j;
        this.f781f = i2;
        this.f782g = participantEntity;
        this.f783h = arrayList;
        this.f784i = i3;
        this.f785j = i4;
    }

    InvitationEntity(Invitation invitation) {
        this.f777b = 2;
        this.f778c = new GameEntity(invitation.mo757d());
        this.f779d = invitation.mo758e();
        this.f780e = invitation.mo760g();
        this.f781f = invitation.mo761h();
        this.f784i = invitation.mo762i();
        this.f785j = invitation.mo763j();
        String k = invitation.mo759f().mo784k();
        Object obj = null;
        ArrayList k2 = invitation.mo764k();
        int size = k2.size();
        this.f783h = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Participant participant = (Participant) k2.get(i);
            if (participant.mo784k().equals(k)) {
                obj = participant;
            }
            this.f783h.add((ParticipantEntity) participant.mo701a());
        }
        je.m2474a(obj, (Object) "Must have a valid inviter!");
        this.f782g = (ParticipantEntity) obj.mo701a();
    }

    static int m1383a(Invitation invitation) {
        return Arrays.hashCode(new Object[]{invitation.mo757d(), invitation.mo758e(), Long.valueOf(invitation.mo760g()), Integer.valueOf(invitation.mo761h()), invitation.mo759f(), invitation.mo764k(), Integer.valueOf(invitation.mo762i()), Integer.valueOf(invitation.mo763j())});
    }

    static boolean m1384a(Invitation invitation, Object obj) {
        if (!(obj instanceof Invitation)) {
            return false;
        }
        if (invitation == obj) {
            return true;
        }
        Invitation invitation2 = (Invitation) obj;
        return jb.m2470a(invitation2.mo757d(), invitation.mo757d()) && jb.m2470a(invitation2.mo758e(), invitation.mo758e()) && jb.m2470a(Long.valueOf(invitation2.mo760g()), Long.valueOf(invitation.mo760g())) && jb.m2470a(Integer.valueOf(invitation2.mo761h()), Integer.valueOf(invitation.mo761h())) && jb.m2470a(invitation2.mo759f(), invitation.mo759f()) && jb.m2470a(invitation2.mo764k(), invitation.mo764k()) && jb.m2470a(Integer.valueOf(invitation2.mo762i()), Integer.valueOf(invitation.mo762i())) && jb.m2470a(Integer.valueOf(invitation2.mo763j()), Integer.valueOf(invitation.mo763j()));
    }

    static String m1387b(Invitation invitation) {
        return jb.m2469a(invitation).m2471a("Game", invitation.mo757d()).m2471a("InvitationId", invitation.mo758e()).m2471a("CreationTimestamp", Long.valueOf(invitation.mo760g())).m2471a("InvitationType", Integer.valueOf(invitation.mo761h())).m2471a("Inviter", invitation.mo759f()).m2471a("Participants", invitation.mo764k()).m2471a("Variant", Integer.valueOf(invitation.mo762i())).m2471a("AvailableAutoMatchSlots", Integer.valueOf(invitation.mo763j())).toString();
    }

    public final /* bridge */ /* synthetic */ Object mo701a() {
        return this;
    }

    public final int m1390b() {
        return this.f777b;
    }

    public final Game mo757d() {
        return this.f778c;
    }

    public final int describeContents() {
        return 0;
    }

    public final String mo758e() {
        return this.f779d;
    }

    public final boolean equals(Object obj) {
        return m1384a(this, obj);
    }

    public final Participant mo759f() {
        return this.f782g;
    }

    public final long mo760g() {
        return this.f780e;
    }

    public final int mo761h() {
        return this.f781f;
    }

    public final int hashCode() {
        return m1383a((Invitation) this);
    }

    public final int mo762i() {
        return this.f784i;
    }

    public final int mo763j() {
        return this.f785j;
    }

    public final ArrayList mo764k() {
        return new ArrayList(this.f783h);
    }

    public final String toString() {
        return m1387b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f708a) {
            this.f778c.writeToParcel(parcel, i);
            parcel.writeString(this.f779d);
            parcel.writeLong(this.f780e);
            parcel.writeInt(this.f781f);
            this.f782g.writeToParcel(parcel, i);
            int size = this.f783h.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                ((ParticipantEntity) this.f783h.get(i2)).writeToParcel(parcel, i);
            }
            return;
        }
        C0340b.m1459a(this, parcel, i);
    }
}
