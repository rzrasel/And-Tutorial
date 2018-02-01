package com.google.android.gms.games.internal.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.internal.hw;
import java.util.ArrayList;
import java.util.Arrays;

public final class ZInvitationCluster implements SafeParcelable, Invitation {
    public static final C0338a CREATOR = new C0338a();
    private final int f773a;
    private final ArrayList f774b;

    ZInvitationCluster(int i, ArrayList arrayList) {
        this.f773a = i;
        this.f774b = arrayList;
        m1345l();
    }

    private void m1345l() {
        hw.m2175a(!this.f774b.isEmpty());
        Invitation invitation = (Invitation) this.f774b.get(0);
        int size = this.f774b.size();
        for (int i = 1; i < size; i++) {
            hw.m2176a(invitation.mo759f().equals(((Invitation) this.f774b.get(i)).mo759f()), "All the invitations must be from the same inviter");
        }
    }

    public final /* bridge */ /* synthetic */ Object mo701a() {
        return this;
    }

    public final int m1347b() {
        return this.f773a;
    }

    public final ArrayList m1348c() {
        return new ArrayList(this.f774b);
    }

    public final Game mo757d() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final int describeContents() {
        return 0;
    }

    public final String mo758e() {
        return ((InvitationEntity) this.f774b.get(0)).mo758e();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ZInvitationCluster)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ZInvitationCluster zInvitationCluster = (ZInvitationCluster) obj;
        if (zInvitationCluster.f774b.size() != this.f774b.size()) {
            return false;
        }
        int size = this.f774b.size();
        for (int i = 0; i < size; i++) {
            if (!((Invitation) this.f774b.get(i)).equals((Invitation) zInvitationCluster.f774b.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final Participant mo759f() {
        return ((InvitationEntity) this.f774b.get(0)).mo759f();
    }

    public final long mo760g() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final int mo761h() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f774b.toArray());
    }

    public final int mo762i() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final int mo763j() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final ArrayList mo764k() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0338a.m1357a(this, parcel);
    }
}
