package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.jb;
import java.util.ArrayList;
import java.util.Arrays;

public final class TurnBasedMatchEntity implements SafeParcelable, TurnBasedMatch {
    public static final C0348a CREATOR = new C0348a();
    private final int f821b;
    private final GameEntity f822c;
    private final String f823d;
    private final String f824e;
    private final long f825f;
    private final String f826g;
    private final long f827h;
    private final String f828i;
    private final int f829j;
    private final int f830k;
    private final int f831l;
    private final byte[] f832m;
    private final ArrayList f833n;
    private final String f834o;
    private final byte[] f835p;
    private final int f836q;
    private final Bundle f837r;
    private final int f838s;
    private final boolean f839t;
    private final String f840u;
    private final String f841v;

    TurnBasedMatchEntity(int i, GameEntity gameEntity, String str, String str2, long j, String str3, long j2, String str4, int i2, int i3, int i4, byte[] bArr, ArrayList arrayList, String str5, byte[] bArr2, int i5, Bundle bundle, int i6, boolean z, String str6, String str7) {
        this.f821b = i;
        this.f822c = gameEntity;
        this.f823d = str;
        this.f824e = str2;
        this.f825f = j;
        this.f826g = str3;
        this.f827h = j2;
        this.f828i = str4;
        this.f829j = i2;
        this.f838s = i6;
        this.f830k = i3;
        this.f831l = i4;
        this.f832m = bArr;
        this.f833n = arrayList;
        this.f834o = str5;
        this.f835p = bArr2;
        this.f836q = i5;
        this.f837r = bundle;
        this.f839t = z;
        this.f840u = str6;
        this.f841v = str7;
    }

    public TurnBasedMatchEntity(TurnBasedMatch turnBasedMatch) {
        this.f821b = 2;
        this.f822c = new GameEntity(turnBasedMatch.mo801b());
        this.f823d = turnBasedMatch.mo802c();
        this.f824e = turnBasedMatch.mo803d();
        this.f825f = turnBasedMatch.mo804e();
        this.f826g = turnBasedMatch.mo809j();
        this.f827h = turnBasedMatch.mo810l();
        this.f828i = turnBasedMatch.mo811m();
        this.f829j = turnBasedMatch.mo805f();
        this.f838s = turnBasedMatch.mo806g();
        this.f830k = turnBasedMatch.mo808i();
        this.f831l = turnBasedMatch.mo813o();
        this.f834o = turnBasedMatch.mo814p();
        this.f836q = turnBasedMatch.mo816r();
        this.f837r = turnBasedMatch.mo817s();
        this.f839t = turnBasedMatch.mo819u();
        this.f840u = turnBasedMatch.mo807h();
        this.f841v = turnBasedMatch.mo820v();
        Object n = turnBasedMatch.mo812n();
        if (n == null) {
            this.f832m = null;
        } else {
            this.f832m = new byte[n.length];
            System.arraycopy(n, 0, this.f832m, 0, n.length);
        }
        n = turnBasedMatch.mo815q();
        if (n == null) {
            this.f835p = null;
        } else {
            this.f835p = new byte[n.length];
            System.arraycopy(n, 0, this.f835p, 0, n.length);
        }
        ArrayList k = turnBasedMatch.mo764k();
        int size = k.size();
        this.f833n = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.f833n.add((ParticipantEntity) ((Participant) k.get(i)).mo701a());
        }
    }

    static int m1525a(TurnBasedMatch turnBasedMatch) {
        return Arrays.hashCode(new Object[]{turnBasedMatch.mo801b(), turnBasedMatch.mo802c(), turnBasedMatch.mo803d(), Long.valueOf(turnBasedMatch.mo804e()), turnBasedMatch.mo809j(), Long.valueOf(turnBasedMatch.mo810l()), turnBasedMatch.mo811m(), Integer.valueOf(turnBasedMatch.mo805f()), Integer.valueOf(turnBasedMatch.mo806g()), turnBasedMatch.mo807h(), Integer.valueOf(turnBasedMatch.mo808i()), Integer.valueOf(turnBasedMatch.mo813o()), turnBasedMatch.mo764k(), turnBasedMatch.mo814p(), Integer.valueOf(turnBasedMatch.mo816r()), turnBasedMatch.mo817s(), Integer.valueOf(turnBasedMatch.mo818t()), Boolean.valueOf(turnBasedMatch.mo819u())});
    }

    static boolean m1526a(TurnBasedMatch turnBasedMatch, Object obj) {
        if (!(obj instanceof TurnBasedMatch)) {
            return false;
        }
        if (turnBasedMatch == obj) {
            return true;
        }
        TurnBasedMatch turnBasedMatch2 = (TurnBasedMatch) obj;
        return jb.m2470a(turnBasedMatch2.mo801b(), turnBasedMatch.mo801b()) && jb.m2470a(turnBasedMatch2.mo802c(), turnBasedMatch.mo802c()) && jb.m2470a(turnBasedMatch2.mo803d(), turnBasedMatch.mo803d()) && jb.m2470a(Long.valueOf(turnBasedMatch2.mo804e()), Long.valueOf(turnBasedMatch.mo804e())) && jb.m2470a(turnBasedMatch2.mo809j(), turnBasedMatch.mo809j()) && jb.m2470a(Long.valueOf(turnBasedMatch2.mo810l()), Long.valueOf(turnBasedMatch.mo810l())) && jb.m2470a(turnBasedMatch2.mo811m(), turnBasedMatch.mo811m()) && jb.m2470a(Integer.valueOf(turnBasedMatch2.mo805f()), Integer.valueOf(turnBasedMatch.mo805f())) && jb.m2470a(Integer.valueOf(turnBasedMatch2.mo806g()), Integer.valueOf(turnBasedMatch.mo806g())) && jb.m2470a(turnBasedMatch2.mo807h(), turnBasedMatch.mo807h()) && jb.m2470a(Integer.valueOf(turnBasedMatch2.mo808i()), Integer.valueOf(turnBasedMatch.mo808i())) && jb.m2470a(Integer.valueOf(turnBasedMatch2.mo813o()), Integer.valueOf(turnBasedMatch.mo813o())) && jb.m2470a(turnBasedMatch2.mo764k(), turnBasedMatch.mo764k()) && jb.m2470a(turnBasedMatch2.mo814p(), turnBasedMatch.mo814p()) && jb.m2470a(Integer.valueOf(turnBasedMatch2.mo816r()), Integer.valueOf(turnBasedMatch.mo816r())) && jb.m2470a(turnBasedMatch2.mo817s(), turnBasedMatch.mo817s()) && jb.m2470a(Integer.valueOf(turnBasedMatch2.mo818t()), Integer.valueOf(turnBasedMatch.mo818t())) && jb.m2470a(Boolean.valueOf(turnBasedMatch2.mo819u()), Boolean.valueOf(turnBasedMatch.mo819u()));
    }

    static String m1527b(TurnBasedMatch turnBasedMatch) {
        return jb.m2469a(turnBasedMatch).m2471a("Game", turnBasedMatch.mo801b()).m2471a("MatchId", turnBasedMatch.mo802c()).m2471a("CreatorId", turnBasedMatch.mo803d()).m2471a("CreationTimestamp", Long.valueOf(turnBasedMatch.mo804e())).m2471a("LastUpdaterId", turnBasedMatch.mo809j()).m2471a("LastUpdatedTimestamp", Long.valueOf(turnBasedMatch.mo810l())).m2471a("PendingParticipantId", turnBasedMatch.mo811m()).m2471a("MatchStatus", Integer.valueOf(turnBasedMatch.mo805f())).m2471a("TurnStatus", Integer.valueOf(turnBasedMatch.mo806g())).m2471a("Description", turnBasedMatch.mo807h()).m2471a("Variant", Integer.valueOf(turnBasedMatch.mo808i())).m2471a("Data", turnBasedMatch.mo812n()).m2471a("Version", Integer.valueOf(turnBasedMatch.mo813o())).m2471a("Participants", turnBasedMatch.mo764k()).m2471a("RematchId", turnBasedMatch.mo814p()).m2471a("PreviousData", turnBasedMatch.mo815q()).m2471a("MatchNumber", Integer.valueOf(turnBasedMatch.mo816r())).m2471a("AutoMatchCriteria", turnBasedMatch.mo817s()).m2471a("AvailableAutoMatchSlots", Integer.valueOf(turnBasedMatch.mo818t())).m2471a("LocallyModified", Boolean.valueOf(turnBasedMatch.mo819u())).m2471a("DescriptionParticipantId", turnBasedMatch.mo820v()).toString();
    }

    public final /* bridge */ /* synthetic */ Object mo701a() {
        return this;
    }

    public final Game mo801b() {
        return this.f822c;
    }

    public final String mo802c() {
        return this.f823d;
    }

    public final String mo803d() {
        return this.f824e;
    }

    public final int describeContents() {
        return 0;
    }

    public final long mo804e() {
        return this.f825f;
    }

    public final boolean equals(Object obj) {
        return m1526a(this, obj);
    }

    public final int mo805f() {
        return this.f829j;
    }

    public final int mo806g() {
        return this.f838s;
    }

    public final String mo807h() {
        return this.f840u;
    }

    public final int hashCode() {
        return m1525a(this);
    }

    public final int mo808i() {
        return this.f830k;
    }

    public final String mo809j() {
        return this.f826g;
    }

    public final ArrayList mo764k() {
        return new ArrayList(this.f833n);
    }

    public final long mo810l() {
        return this.f827h;
    }

    public final String mo811m() {
        return this.f828i;
    }

    public final byte[] mo812n() {
        return this.f832m;
    }

    public final int mo813o() {
        return this.f831l;
    }

    public final String mo814p() {
        return this.f834o;
    }

    public final byte[] mo815q() {
        return this.f835p;
    }

    public final int mo816r() {
        return this.f836q;
    }

    public final Bundle mo817s() {
        return this.f837r;
    }

    public final int mo818t() {
        return this.f837r == null ? 0 : this.f837r.getInt("max_automatch_players");
    }

    public final String toString() {
        return m1527b(this);
    }

    public final boolean mo819u() {
        return this.f839t;
    }

    public final String mo820v() {
        return this.f841v;
    }

    public final int m1550w() {
        return this.f821b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0348a.m1574a(this, parcel, i);
    }
}
