package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.jb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class GameRequestEntity implements SafeParcelable, GameRequest {
    public static final C0349a CREATOR = new C0349a();
    private final int f844a;
    private final GameEntity f845b;
    private final PlayerEntity f846c;
    private final byte[] f847d;
    private final String f848e;
    private final ArrayList f849f;
    private final int f850g;
    private final long f851h;
    private final long f852i;
    private final Bundle f853j;
    private final int f854k;

    GameRequestEntity(int i, GameEntity gameEntity, PlayerEntity playerEntity, byte[] bArr, String str, ArrayList arrayList, int i2, long j, long j2, Bundle bundle, int i3) {
        this.f844a = i;
        this.f845b = gameEntity;
        this.f846c = playerEntity;
        this.f847d = bArr;
        this.f848e = str;
        this.f849f = arrayList;
        this.f850g = i2;
        this.f851h = j;
        this.f852i = j2;
        this.f853j = bundle;
        this.f854k = i3;
    }

    public GameRequestEntity(GameRequest gameRequest) {
        this.f844a = 2;
        this.f845b = new GameEntity(gameRequest.mo767e());
        this.f846c = new PlayerEntity(gameRequest.mo768f());
        this.f848e = gameRequest.mo766d();
        this.f850g = gameRequest.mo770h();
        this.f851h = gameRequest.mo771i();
        this.f852i = gameRequest.mo772j();
        this.f854k = gameRequest.mo773k();
        Object g = gameRequest.mo769g();
        if (g == null) {
            this.f847d = null;
        } else {
            this.f847d = new byte[g.length];
            System.arraycopy(g, 0, this.f847d, 0, g.length);
        }
        List l = gameRequest.mo774l();
        int size = l.size();
        this.f849f = new ArrayList(size);
        this.f853j = new Bundle();
        for (int i = 0; i < size; i++) {
            Player player = (Player) ((Player) l.get(i)).mo701a();
            String b = player.mo726b();
            this.f849f.add((PlayerEntity) player);
            this.f853j.putInt(b, gameRequest.mo765a(b));
        }
    }

    static int m1575a(GameRequest gameRequest) {
        return Arrays.hashCode(new Object[]{gameRequest.mo767e(), gameRequest.mo774l(), gameRequest.mo766d(), gameRequest.mo768f(), m1578c(gameRequest), Integer.valueOf(gameRequest.mo770h()), Long.valueOf(gameRequest.mo771i()), Long.valueOf(gameRequest.mo772j())});
    }

    static boolean m1576a(GameRequest gameRequest, Object obj) {
        if (!(obj instanceof GameRequest)) {
            return false;
        }
        if (gameRequest == obj) {
            return true;
        }
        GameRequest gameRequest2 = (GameRequest) obj;
        return jb.m2470a(gameRequest2.mo767e(), gameRequest.mo767e()) && jb.m2470a(gameRequest2.mo774l(), gameRequest.mo774l()) && jb.m2470a(gameRequest2.mo766d(), gameRequest.mo766d()) && jb.m2470a(gameRequest2.mo768f(), gameRequest.mo768f()) && Arrays.equals(m1578c(gameRequest2), m1578c(gameRequest)) && jb.m2470a(Integer.valueOf(gameRequest2.mo770h()), Integer.valueOf(gameRequest.mo770h())) && jb.m2470a(Long.valueOf(gameRequest2.mo771i()), Long.valueOf(gameRequest.mo771i())) && jb.m2470a(Long.valueOf(gameRequest2.mo772j()), Long.valueOf(gameRequest.mo772j()));
    }

    static String m1577b(GameRequest gameRequest) {
        return jb.m2469a(gameRequest).m2471a("Game", gameRequest.mo767e()).m2471a("Sender", gameRequest.mo768f()).m2471a("Recipients", gameRequest.mo774l()).m2471a("Data", gameRequest.mo769g()).m2471a("RequestId", gameRequest.mo766d()).m2471a("Type", Integer.valueOf(gameRequest.mo770h())).m2471a("CreationTimestamp", Long.valueOf(gameRequest.mo771i())).m2471a("ExpirationTimestamp", Long.valueOf(gameRequest.mo772j())).toString();
    }

    private static int[] m1578c(GameRequest gameRequest) {
        List l = gameRequest.mo774l();
        int size = l.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = gameRequest.mo765a(((Player) l.get(i)).mo726b());
        }
        return iArr;
    }

    public final int mo765a(String str) {
        return this.f853j.getInt(str, 0);
    }

    public final /* bridge */ /* synthetic */ Object mo701a() {
        return this;
    }

    public final int m1581b() {
        return this.f844a;
    }

    public final Bundle m1582c() {
        return this.f853j;
    }

    public final String mo766d() {
        return this.f848e;
    }

    public final int describeContents() {
        return 0;
    }

    public final Game mo767e() {
        return this.f845b;
    }

    public final boolean equals(Object obj) {
        return m1576a(this, obj);
    }

    public final Player mo768f() {
        return this.f846c;
    }

    public final byte[] mo769g() {
        return this.f847d;
    }

    public final int mo770h() {
        return this.f850g;
    }

    public final int hashCode() {
        return m1575a((GameRequest) this);
    }

    public final long mo771i() {
        return this.f851h;
    }

    public final long mo772j() {
        return this.f852i;
    }

    public final int mo773k() {
        return this.f854k;
    }

    public final List mo774l() {
        return new ArrayList(this.f849f);
    }

    public final String toString() {
        return m1577b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0349a.m1604a(this, parcel, i);
    }
}
