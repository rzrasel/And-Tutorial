package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.hw;
import com.google.android.gms.internal.jb;
import java.util.Arrays;

public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {
    public static final Creator CREATOR = new C0330c();
    private final int f732b;
    private final String f733c;
    private final String f734d;
    private final Uri f735e;
    private final Uri f736f;
    private final long f737g;
    private final int f738h;
    private final long f739i;
    private final String f740j;
    private final String f741k;

    PlayerEntity(int i, String str, String str2, Uri uri, Uri uri2, long j, int i2, long j2, String str3, String str4) {
        this.f732b = i;
        this.f733c = str;
        this.f734d = str2;
        this.f735e = uri;
        this.f740j = str3;
        this.f736f = uri2;
        this.f741k = str4;
        this.f737g = j;
        this.f738h = i2;
        this.f739i = j2;
    }

    public PlayerEntity(Player player) {
        this.f732b = 4;
        this.f733c = player.mo726b();
        this.f734d = player.mo727c();
        this.f735e = player.mo728d();
        this.f740j = player.mo729e();
        this.f736f = player.mo730f();
        this.f741k = player.mo731g();
        this.f737g = player.mo732h();
        this.f738h = player.mo734j();
        this.f739i = player.mo733i();
        hw.m2174a(this.f733c);
        hw.m2174a(this.f734d);
        hw.m2175a(this.f737g > 0);
    }

    static int m1230a(Player player) {
        return Arrays.hashCode(new Object[]{player.mo726b(), player.mo727c(), player.mo728d(), player.mo730f(), Long.valueOf(player.mo732h())});
    }

    static boolean m1231a(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return jb.m2470a(player2.mo726b(), player.mo726b()) && jb.m2470a(player2.mo727c(), player.mo727c()) && jb.m2470a(player2.mo728d(), player.mo728d()) && jb.m2470a(player2.mo730f(), player.mo730f()) && jb.m2470a(Long.valueOf(player2.mo732h()), Long.valueOf(player.mo732h()));
    }

    static String m1234b(Player player) {
        return jb.m2469a(player).m2471a("PlayerId", player.mo726b()).m2471a("DisplayName", player.mo727c()).m2471a("IconImageUri", player.mo728d()).m2471a("IconImageUrl", player.mo729e()).m2471a("HiResImageUri", player.mo730f()).m2471a("HiResImageUrl", player.mo731g()).m2471a("RetrievedTimestamp", Long.valueOf(player.mo732h())).toString();
    }

    public final /* bridge */ /* synthetic */ Object mo701a() {
        return this;
    }

    public final String mo726b() {
        return this.f733c;
    }

    public final String mo727c() {
        return this.f734d;
    }

    public final Uri mo728d() {
        return this.f735e;
    }

    public final int describeContents() {
        return 0;
    }

    public final String mo729e() {
        return this.f740j;
    }

    public final boolean equals(Object obj) {
        return m1231a(this, obj);
    }

    public final Uri mo730f() {
        return this.f736f;
    }

    public final String mo731g() {
        return this.f741k;
    }

    public final long mo732h() {
        return this.f737g;
    }

    public final int hashCode() {
        return m1230a((Player) this);
    }

    public final long mo733i() {
        return this.f739i;
    }

    public final int mo734j() {
        return this.f738h;
    }

    public final int m1246k() {
        return this.f732b;
    }

    public final String toString() {
        return m1234b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = null;
        if (this.f708a) {
            parcel.writeString(this.f733c);
            parcel.writeString(this.f734d);
            parcel.writeString(this.f735e == null ? null : this.f735e.toString());
            if (this.f736f != null) {
                str = this.f736f.toString();
            }
            parcel.writeString(str);
            parcel.writeLong(this.f737g);
            return;
        }
        C0329d.m1261a(this, parcel, i);
    }
}
