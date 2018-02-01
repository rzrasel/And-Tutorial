package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.jb;
import java.util.Arrays;

public final class GameEntity extends GamesDowngradeableSafeParcel implements Game {
    public static final Creator CREATOR = new C0328a();
    private final int f709b;
    private final String f710c;
    private final String f711d;
    private final String f712e;
    private final String f713f;
    private final String f714g;
    private final String f715h;
    private final Uri f716i;
    private final Uri f717j;
    private final Uri f718k;
    private final boolean f719l;
    private final boolean f720m;
    private final String f721n;
    private final int f722o;
    private final int f723p;
    private final int f724q;
    private final boolean f725r;
    private final boolean f726s;
    private final String f727t;
    private final String f728u;
    private final String f729v;
    private final boolean f730w;
    private final boolean f731x;

    GameEntity(int i, String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z, boolean z2, String str7, int i2, int i3, int i4, boolean z3, boolean z4, String str8, String str9, String str10, boolean z5, boolean z6) {
        this.f709b = i;
        this.f710c = str;
        this.f711d = str2;
        this.f712e = str3;
        this.f713f = str4;
        this.f714g = str5;
        this.f715h = str6;
        this.f716i = uri;
        this.f727t = str8;
        this.f717j = uri2;
        this.f728u = str9;
        this.f718k = uri3;
        this.f729v = str10;
        this.f719l = z;
        this.f720m = z2;
        this.f721n = str7;
        this.f722o = i2;
        this.f723p = i3;
        this.f724q = i4;
        this.f725r = z3;
        this.f726s = z4;
        this.f730w = z5;
        this.f731x = z6;
    }

    public GameEntity(Game game) {
        this.f709b = 3;
        this.f710c = game.mo702b();
        this.f712e = game.mo704d();
        this.f713f = game.mo705e();
        this.f714g = game.mo706f();
        this.f715h = game.mo707g();
        this.f711d = game.mo703c();
        this.f716i = game.mo708h();
        this.f727t = game.mo709i();
        this.f717j = game.mo710j();
        this.f728u = game.mo711k();
        this.f718k = game.mo712l();
        this.f729v = game.mo713m();
        this.f719l = game.mo714n();
        this.f720m = game.mo717q();
        this.f721n = game.mo718r();
        this.f722o = game.mo719s();
        this.f723p = game.mo720t();
        this.f724q = game.mo721u();
        this.f725r = game.mo722v();
        this.f726s = game.mo723w();
        this.f730w = game.mo715o();
        this.f731x = game.mo716p();
    }

    static int m1167a(Game game) {
        return Arrays.hashCode(new Object[]{game.mo702b(), game.mo703c(), game.mo704d(), game.mo705e(), game.mo706f(), game.mo707g(), game.mo708h(), game.mo710j(), game.mo712l(), Boolean.valueOf(game.mo714n()), Boolean.valueOf(game.mo717q()), game.mo718r(), Integer.valueOf(game.mo719s()), Integer.valueOf(game.mo720t()), Integer.valueOf(game.mo721u()), Boolean.valueOf(game.mo722v()), Boolean.valueOf(game.mo723w()), Boolean.valueOf(game.mo715o()), Boolean.valueOf(game.mo716p())});
    }

    static boolean m1168a(Game game, Object obj) {
        if (!(obj instanceof Game)) {
            return false;
        }
        if (game == obj) {
            return true;
        }
        Game game2 = (Game) obj;
        if (!jb.m2470a(game2.mo702b(), game.mo702b()) || !jb.m2470a(game2.mo703c(), game.mo703c()) || !jb.m2470a(game2.mo704d(), game.mo704d()) || !jb.m2470a(game2.mo705e(), game.mo705e()) || !jb.m2470a(game2.mo706f(), game.mo706f()) || !jb.m2470a(game2.mo707g(), game.mo707g()) || !jb.m2470a(game2.mo708h(), game.mo708h()) || !jb.m2470a(game2.mo710j(), game.mo710j()) || !jb.m2470a(game2.mo712l(), game.mo712l()) || !jb.m2470a(Boolean.valueOf(game2.mo714n()), Boolean.valueOf(game.mo714n())) || !jb.m2470a(Boolean.valueOf(game2.mo717q()), Boolean.valueOf(game.mo717q())) || !jb.m2470a(game2.mo718r(), game.mo718r()) || !jb.m2470a(Integer.valueOf(game2.mo719s()), Integer.valueOf(game.mo719s())) || !jb.m2470a(Integer.valueOf(game2.mo720t()), Integer.valueOf(game.mo720t())) || !jb.m2470a(Integer.valueOf(game2.mo721u()), Integer.valueOf(game.mo721u())) || !jb.m2470a(Boolean.valueOf(game2.mo722v()), Boolean.valueOf(game.mo722v()))) {
            return false;
        }
        Boolean valueOf = Boolean.valueOf(game2.mo723w());
        boolean z = game.mo723w() && jb.m2470a(Boolean.valueOf(game2.mo715o()), Boolean.valueOf(game.mo715o())) && jb.m2470a(Boolean.valueOf(game2.mo716p()), Boolean.valueOf(game.mo716p()));
        return jb.m2470a(valueOf, Boolean.valueOf(z));
    }

    static String m1171b(Game game) {
        return jb.m2469a(game).m2471a("ApplicationId", game.mo702b()).m2471a("DisplayName", game.mo703c()).m2471a("PrimaryCategory", game.mo704d()).m2471a("SecondaryCategory", game.mo705e()).m2471a("Description", game.mo706f()).m2471a("DeveloperName", game.mo707g()).m2471a("IconImageUri", game.mo708h()).m2471a("IconImageUrl", game.mo709i()).m2471a("HiResImageUri", game.mo710j()).m2471a("HiResImageUrl", game.mo711k()).m2471a("FeaturedImageUri", game.mo712l()).m2471a("FeaturedImageUrl", game.mo713m()).m2471a("PlayEnabledGame", Boolean.valueOf(game.mo714n())).m2471a("InstanceInstalled", Boolean.valueOf(game.mo717q())).m2471a("InstancePackageName", game.mo718r()).m2471a("AchievementTotalCount", Integer.valueOf(game.mo720t())).m2471a("LeaderboardCount", Integer.valueOf(game.mo721u())).m2471a("RealTimeMultiplayerEnabled", Boolean.valueOf(game.mo722v())).m2471a("TurnBasedMultiplayerEnabled", Boolean.valueOf(game.mo723w())).toString();
    }

    public final /* bridge */ /* synthetic */ Object mo701a() {
        return this;
    }

    public final String mo702b() {
        return this.f710c;
    }

    public final String mo703c() {
        return this.f711d;
    }

    public final String mo704d() {
        return this.f712e;
    }

    public final int describeContents() {
        return 0;
    }

    public final String mo705e() {
        return this.f713f;
    }

    public final boolean equals(Object obj) {
        return m1168a(this, obj);
    }

    public final String mo706f() {
        return this.f714g;
    }

    public final String mo707g() {
        return this.f715h;
    }

    public final Uri mo708h() {
        return this.f716i;
    }

    public final int hashCode() {
        return m1167a((Game) this);
    }

    public final String mo709i() {
        return this.f727t;
    }

    public final Uri mo710j() {
        return this.f717j;
    }

    public final String mo711k() {
        return this.f728u;
    }

    public final Uri mo712l() {
        return this.f718k;
    }

    public final String mo713m() {
        return this.f729v;
    }

    public final boolean mo714n() {
        return this.f719l;
    }

    public final boolean mo715o() {
        return this.f730w;
    }

    public final boolean mo716p() {
        return this.f731x;
    }

    public final boolean mo717q() {
        return this.f720m;
    }

    public final String mo718r() {
        return this.f721n;
    }

    public final int mo719s() {
        return this.f722o;
    }

    public final int mo720t() {
        return this.f723p;
    }

    public final String toString() {
        return m1171b(this);
    }

    public final int mo721u() {
        return this.f724q;
    }

    public final boolean mo722v() {
        return this.f725r;
    }

    public final boolean mo723w() {
        return this.f726s;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        String str = null;
        if (this.f708a) {
            parcel.writeString(this.f710c);
            parcel.writeString(this.f711d);
            parcel.writeString(this.f712e);
            parcel.writeString(this.f713f);
            parcel.writeString(this.f714g);
            parcel.writeString(this.f715h);
            parcel.writeString(this.f716i == null ? null : this.f716i.toString());
            parcel.writeString(this.f717j == null ? null : this.f717j.toString());
            if (this.f718k != null) {
                str = this.f718k.toString();
            }
            parcel.writeString(str);
            parcel.writeInt(this.f719l ? 1 : 0);
            if (!this.f720m) {
                i2 = 0;
            }
            parcel.writeInt(i2);
            parcel.writeString(this.f721n);
            parcel.writeInt(this.f722o);
            parcel.writeInt(this.f723p);
            parcel.writeInt(this.f724q);
            return;
        }
        C0327b.m1258a(this, parcel, i);
    }

    public final int m1196x() {
        return this.f709b;
    }
}
