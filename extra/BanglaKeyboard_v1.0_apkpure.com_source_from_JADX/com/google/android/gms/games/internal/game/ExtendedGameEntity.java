package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.jb;
import java.util.ArrayList;
import java.util.Arrays;

public final class ExtendedGameEntity extends GamesDowngradeableSafeParcel implements ExtendedGame {
    public static final C0333b CREATOR = new C0334a();
    private final int f755b;
    private final GameEntity f756c;
    private final int f757d;
    private final boolean f758e;
    private final int f759f;
    private final long f760g;
    private final long f761h;
    private final String f762i;
    private final long f763j;
    private final String f764k;
    private final ArrayList f765l;

    ExtendedGameEntity(int i, GameEntity gameEntity, int i2, boolean z, int i3, long j, long j2, String str, long j3, String str2, ArrayList arrayList) {
        this.f755b = i;
        this.f756c = gameEntity;
        this.f757d = i2;
        this.f758e = z;
        this.f759f = i3;
        this.f760g = j;
        this.f761h = j2;
        this.f762i = str;
        this.f763j = j3;
        this.f764k = str2;
        this.f765l = arrayList;
    }

    public ExtendedGameEntity(ExtendedGame extendedGame) {
        this.f755b = 1;
        Game b = extendedGame.mo739b();
        this.f756c = b == null ? null : new GameEntity(b);
        this.f757d = extendedGame.mo741d();
        this.f758e = extendedGame.mo742e();
        this.f759f = extendedGame.mo743f();
        this.f760g = extendedGame.mo744g();
        this.f761h = extendedGame.mo745h();
        this.f762i = extendedGame.mo746i();
        this.f763j = extendedGame.mo747j();
        this.f764k = extendedGame.mo748k();
        ArrayList c = extendedGame.mo740c();
        int size = c.size();
        this.f765l = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.f765l.add((GameBadgeEntity) ((GameBadge) c.get(i)).mo701a());
        }
    }

    static int m1278a(ExtendedGame extendedGame) {
        return Arrays.hashCode(new Object[]{extendedGame.mo739b(), Integer.valueOf(extendedGame.mo741d()), Boolean.valueOf(extendedGame.mo742e()), Integer.valueOf(extendedGame.mo743f()), Long.valueOf(extendedGame.mo744g()), Long.valueOf(extendedGame.mo745h()), extendedGame.mo746i(), Long.valueOf(extendedGame.mo747j()), extendedGame.mo748k()});
    }

    static boolean m1279a(ExtendedGame extendedGame, Object obj) {
        if (!(obj instanceof ExtendedGame)) {
            return false;
        }
        if (extendedGame == obj) {
            return true;
        }
        ExtendedGame extendedGame2 = (ExtendedGame) obj;
        return jb.m2470a(extendedGame2.mo739b(), extendedGame.mo739b()) && jb.m2470a(Integer.valueOf(extendedGame2.mo741d()), Integer.valueOf(extendedGame.mo741d())) && jb.m2470a(Boolean.valueOf(extendedGame2.mo742e()), Boolean.valueOf(extendedGame.mo742e())) && jb.m2470a(Integer.valueOf(extendedGame2.mo743f()), Integer.valueOf(extendedGame.mo743f())) && jb.m2470a(Long.valueOf(extendedGame2.mo744g()), Long.valueOf(extendedGame.mo744g())) && jb.m2470a(Long.valueOf(extendedGame2.mo745h()), Long.valueOf(extendedGame.mo745h())) && jb.m2470a(extendedGame2.mo746i(), extendedGame.mo746i()) && jb.m2470a(Long.valueOf(extendedGame2.mo747j()), Long.valueOf(extendedGame.mo747j())) && jb.m2470a(extendedGame2.mo748k(), extendedGame.mo748k());
    }

    static String m1282b(ExtendedGame extendedGame) {
        return jb.m2469a(extendedGame).m2471a("Game", extendedGame.mo739b()).m2471a("Availability", Integer.valueOf(extendedGame.mo741d())).m2471a("Owned", Boolean.valueOf(extendedGame.mo742e())).m2471a("AchievementUnlockedCount", Integer.valueOf(extendedGame.mo743f())).m2471a("LastPlayedServerTimestamp", Long.valueOf(extendedGame.mo744g())).m2471a("PriceMicros", Long.valueOf(extendedGame.mo745h())).m2471a("FormattedPrice", extendedGame.mo746i()).m2471a("FullPriceMicros", Long.valueOf(extendedGame.mo747j())).m2471a("FormattedFullPrice", extendedGame.mo748k()).toString();
    }

    public final /* synthetic */ Object mo701a() {
        return this;
    }

    public final /* synthetic */ Game mo739b() {
        return this.f756c;
    }

    public final ArrayList mo740c() {
        return new ArrayList(this.f765l);
    }

    public final int mo741d() {
        return this.f757d;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean mo742e() {
        return this.f758e;
    }

    public final boolean equals(Object obj) {
        return m1279a(this, obj);
    }

    public final int mo743f() {
        return this.f759f;
    }

    public final long mo744g() {
        return this.f760g;
    }

    public final long mo745h() {
        return this.f761h;
    }

    public final int hashCode() {
        return m1278a((ExtendedGame) this);
    }

    public final String mo746i() {
        return this.f762i;
    }

    public final long mo747j() {
        return this.f763j;
    }

    public final String mo748k() {
        return this.f764k;
    }

    public final int m1295l() {
        return this.f755b;
    }

    public final GameEntity m1296m() {
        return this.f756c;
    }

    public final String toString() {
        return m1282b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        if (this.f708a) {
            this.f756c.writeToParcel(parcel, i);
            parcel.writeInt(this.f757d);
            parcel.writeInt(this.f758e ? 1 : 0);
            parcel.writeInt(this.f759f);
            parcel.writeLong(this.f760g);
            parcel.writeLong(this.f761h);
            parcel.writeString(this.f762i);
            parcel.writeLong(this.f763j);
            parcel.writeString(this.f764k);
            int size = this.f765l.size();
            parcel.writeInt(size);
            while (i2 < size) {
                ((GameBadgeEntity) this.f765l.get(i2)).writeToParcel(parcel, i);
                i2++;
            }
            return;
        }
        C0333b.m1331a(this, parcel, i);
    }
}
