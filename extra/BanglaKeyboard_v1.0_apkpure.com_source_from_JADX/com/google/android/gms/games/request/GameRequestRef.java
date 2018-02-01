package com.google.android.gms.games.request;

import android.os.Parcel;
import com.google.android.gms.common.data.C0246e;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
import java.util.ArrayList;
import java.util.List;

public final class GameRequestRef extends C0246e implements GameRequest {
    private final int f855c;

    private GameRequest m1592b() {
        return new GameRequestEntity(this);
    }

    public final int mo765a(String str) {
        for (int i = this.b; i < this.b + this.f855c; i++) {
            int a = this.a.m977a(i);
            if (this.a.m983c("recipient_external_player_id", i, a).equals(str)) {
                return this.a.m982b("recipient_status", i, a);
            }
        }
        return -1;
    }

    public final /* synthetic */ Object mo701a() {
        return m1592b();
    }

    public final String mo766d() {
        return m998e("external_request_id");
    }

    public final int describeContents() {
        return 0;
    }

    public final Game mo767e() {
        return new GameRef(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        return GameRequestEntity.m1576a(this, obj);
    }

    public final Player mo768f() {
        return new PlayerRef(this.a, this.b, "sender_");
    }

    public final byte[] mo769g() {
        return m999f("data");
    }

    public final int mo770h() {
        return m996c("type");
    }

    public final int hashCode() {
        return GameRequestEntity.m1575a((GameRequest) this);
    }

    public final long mo771i() {
        return m995b("creation_timestamp");
    }

    public final long mo772j() {
        return m995b("expiration_timestamp");
    }

    public final int mo773k() {
        return m996c("status");
    }

    public final List mo774l() {
        List arrayList = new ArrayList(this.f855c);
        for (int i = 0; i < this.f855c; i++) {
            arrayList.add(new PlayerRef(this.a, this.b + i, "recipient_"));
        }
        return arrayList;
    }

    public final String toString() {
        return GameRequestEntity.m1577b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ((GameRequestEntity) m1592b()).writeToParcel(parcel, i);
    }
}
