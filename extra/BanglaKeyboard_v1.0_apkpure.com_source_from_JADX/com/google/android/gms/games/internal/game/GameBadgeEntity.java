package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.jb;
import java.util.Arrays;

public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements GameBadge {
    public static final C0335d CREATOR = new C0336c();
    private final int f768b;
    private int f769c;
    private String f770d;
    private String f771e;
    private Uri f772f;

    GameBadgeEntity(int i, int i2, String str, String str2, Uri uri) {
        this.f768b = i;
        this.f769c = i2;
        this.f770d = str;
        this.f771e = str2;
        this.f772f = uri;
    }

    public GameBadgeEntity(GameBadge gameBadge) {
        this.f768b = 1;
        this.f769c = gameBadge.mo749b();
        this.f770d = gameBadge.mo750c();
        this.f771e = gameBadge.mo751d();
        this.f772f = gameBadge.mo752e();
    }

    static int m1313a(GameBadge gameBadge) {
        return Arrays.hashCode(new Object[]{Integer.valueOf(gameBadge.mo749b()), gameBadge.mo750c(), gameBadge.mo751d(), gameBadge.mo752e()});
    }

    static boolean m1314a(GameBadge gameBadge, Object obj) {
        if (!(obj instanceof GameBadge)) {
            return false;
        }
        if (gameBadge == obj) {
            return true;
        }
        GameBadge gameBadge2 = (GameBadge) obj;
        return jb.m2470a(Integer.valueOf(gameBadge2.mo749b()), gameBadge.mo750c()) && jb.m2470a(gameBadge2.mo751d(), gameBadge.mo752e());
    }

    static String m1317b(GameBadge gameBadge) {
        return jb.m2469a(gameBadge).m2471a("Type", Integer.valueOf(gameBadge.mo749b())).m2471a("Title", gameBadge.mo750c()).m2471a("Description", gameBadge.mo751d()).m2471a("IconImageUri", gameBadge.mo752e()).toString();
    }

    public final /* synthetic */ Object mo701a() {
        return this;
    }

    public final int mo749b() {
        return this.f769c;
    }

    public final String mo750c() {
        return this.f770d;
    }

    public final String mo751d() {
        return this.f771e;
    }

    public final int describeContents() {
        return 0;
    }

    public final Uri mo752e() {
        return this.f772f;
    }

    public final boolean equals(Object obj) {
        return m1314a(this, obj);
    }

    public final int m1324f() {
        return this.f768b;
    }

    public final int hashCode() {
        return m1313a((GameBadge) this);
    }

    public final String toString() {
        return m1317b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f708a) {
            parcel.writeInt(this.f769c);
            parcel.writeString(this.f770d);
            parcel.writeString(this.f771e);
            parcel.writeString(this.f772f == null ? null : this.f772f.toString());
            return;
        }
        C0335d.m1334a(this, parcel, i);
    }
}
