package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestEntity;
import com.google.android.gms.internal.hw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class GameRequestCluster implements SafeParcelable, GameRequest {
    public static final C0339a CREATOR = new C0339a();
    private final int f775a;
    private final ArrayList f776b;

    GameRequestCluster(int i, ArrayList arrayList) {
        this.f775a = i;
        this.f776b = arrayList;
        m1368m();
    }

    private void m1368m() {
        hw.m2175a(!this.f776b.isEmpty());
        GameRequest gameRequest = (GameRequest) this.f776b.get(0);
        int size = this.f776b.size();
        for (int i = 1; i < size; i++) {
            GameRequest gameRequest2 = (GameRequest) this.f776b.get(i);
            hw.m2176a(gameRequest.mo770h() == gameRequest2.mo770h(), "All the requests must be of the same type");
            hw.m2176a(gameRequest.mo768f().equals(gameRequest2.mo768f()), "All the requests must be from the same sender");
        }
    }

    public final int mo765a(String str) {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final /* bridge */ /* synthetic */ Object mo701a() {
        return this;
    }

    public final int m1371b() {
        return this.f775a;
    }

    public final ArrayList m1372c() {
        return new ArrayList(this.f776b);
    }

    public final String mo766d() {
        return ((GameRequestEntity) this.f776b.get(0)).mo766d();
    }

    public final int describeContents() {
        return 0;
    }

    public final Game mo767e() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GameRequestCluster)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        GameRequestCluster gameRequestCluster = (GameRequestCluster) obj;
        if (gameRequestCluster.f776b.size() != this.f776b.size()) {
            return false;
        }
        int size = this.f776b.size();
        for (int i = 0; i < size; i++) {
            if (!((GameRequest) this.f776b.get(i)).equals((GameRequest) gameRequestCluster.f776b.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final Player mo768f() {
        return ((GameRequestEntity) this.f776b.get(0)).mo768f();
    }

    public final byte[] mo769g() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final int mo770h() {
        return ((GameRequestEntity) this.f776b.get(0)).mo770h();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f776b.toArray());
    }

    public final long mo771i() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final long mo772j() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final int mo773k() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final /* synthetic */ List mo774l() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0339a.m1382a(this, parcel);
    }
}
