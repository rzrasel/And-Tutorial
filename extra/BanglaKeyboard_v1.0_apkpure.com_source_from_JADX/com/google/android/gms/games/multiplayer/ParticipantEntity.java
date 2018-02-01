package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.jb;
import java.util.Arrays;

public final class ParticipantEntity extends GamesDowngradeableSafeParcel implements Participant {
    public static final Creator CREATOR = new C0343c();
    private final int f789b;
    private final String f790c;
    private final String f791d;
    private final Uri f792e;
    private final Uri f793f;
    private final int f794g;
    private final String f795h;
    private final boolean f796i;
    private final PlayerEntity f797j;
    private final int f798k;
    private final ParticipantResult f799l;
    private final String f800m;
    private final String f801n;

    ParticipantEntity(int i, String str, String str2, Uri uri, Uri uri2, int i2, String str3, boolean z, PlayerEntity playerEntity, int i3, ParticipantResult participantResult, String str4, String str5) {
        this.f789b = i;
        this.f790c = str;
        this.f791d = str2;
        this.f792e = uri;
        this.f793f = uri2;
        this.f794g = i2;
        this.f795h = str3;
        this.f796i = z;
        this.f797j = playerEntity;
        this.f798k = i3;
        this.f799l = participantResult;
        this.f800m = str4;
        this.f801n = str5;
    }

    public ParticipantEntity(Participant participant) {
        this.f789b = 3;
        this.f790c = participant.mo784k();
        this.f791d = participant.mo779f();
        this.f792e = participant.mo780g();
        this.f793f = participant.mo782i();
        this.f794g = participant.mo775b();
        this.f795h = participant.mo776c();
        this.f796i = participant.mo778e();
        Player l = participant.mo785l();
        this.f797j = l == null ? null : new PlayerEntity(l);
        this.f798k = participant.mo777d();
        this.f799l = participant.mo786m();
        this.f800m = participant.mo781h();
        this.f801n = participant.mo783j();
    }

    static int m1421a(Participant participant) {
        return Arrays.hashCode(new Object[]{participant.mo785l(), Integer.valueOf(participant.mo775b()), participant.mo776c(), Boolean.valueOf(participant.mo778e()), participant.mo779f(), participant.mo780g(), participant.mo782i(), Integer.valueOf(participant.mo777d()), participant.mo786m(), participant.mo784k()});
    }

    static boolean m1422a(Participant participant, Object obj) {
        if (!(obj instanceof Participant)) {
            return false;
        }
        if (participant == obj) {
            return true;
        }
        Participant participant2 = (Participant) obj;
        return jb.m2470a(participant2.mo785l(), participant.mo785l()) && jb.m2470a(Integer.valueOf(participant2.mo775b()), Integer.valueOf(participant.mo775b())) && jb.m2470a(participant2.mo776c(), participant.mo776c()) && jb.m2470a(Boolean.valueOf(participant2.mo778e()), Boolean.valueOf(participant.mo778e())) && jb.m2470a(participant2.mo779f(), participant.mo779f()) && jb.m2470a(participant2.mo780g(), participant.mo780g()) && jb.m2470a(participant2.mo782i(), participant.mo782i()) && jb.m2470a(Integer.valueOf(participant2.mo777d()), Integer.valueOf(participant.mo777d())) && jb.m2470a(participant2.mo786m(), participant.mo786m()) && jb.m2470a(participant2.mo784k(), participant.mo784k());
    }

    static String m1425b(Participant participant) {
        return jb.m2469a(participant).m2471a("ParticipantId", participant.mo784k()).m2471a("Player", participant.mo785l()).m2471a("Status", Integer.valueOf(participant.mo775b())).m2471a("ClientAddress", participant.mo776c()).m2471a("ConnectedToRoom", Boolean.valueOf(participant.mo778e())).m2471a("DisplayName", participant.mo779f()).m2471a("IconImage", participant.mo780g()).m2471a("IconImageUrl", participant.mo781h()).m2471a("HiResImage", participant.mo782i()).m2471a("HiResImageUrl", participant.mo783j()).m2471a("Capabilities", Integer.valueOf(participant.mo777d())).m2471a("Result", participant.mo786m()).toString();
    }

    public final /* bridge */ /* synthetic */ Object mo701a() {
        return this;
    }

    public final int mo775b() {
        return this.f794g;
    }

    public final String mo776c() {
        return this.f795h;
    }

    public final int mo777d() {
        return this.f798k;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean mo778e() {
        return this.f796i;
    }

    public final boolean equals(Object obj) {
        return m1422a(this, obj);
    }

    public final String mo779f() {
        return this.f797j == null ? this.f791d : this.f797j.mo727c();
    }

    public final Uri mo780g() {
        return this.f797j == null ? this.f792e : this.f797j.mo728d();
    }

    public final String mo781h() {
        return this.f797j == null ? this.f800m : this.f797j.mo729e();
    }

    public final int hashCode() {
        return m1421a((Participant) this);
    }

    public final Uri mo782i() {
        return this.f797j == null ? this.f793f : this.f797j.mo730f();
    }

    public final String mo783j() {
        return this.f797j == null ? this.f801n : this.f797j.mo731g();
    }

    public final String mo784k() {
        return this.f790c;
    }

    public final Player mo785l() {
        return this.f797j;
    }

    public final ParticipantResult mo786m() {
        return this.f799l;
    }

    public final int m1440n() {
        return this.f789b;
    }

    public final String toString() {
        return m1425b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = null;
        int i2 = 0;
        if (this.f708a) {
            parcel.writeString(this.f790c);
            parcel.writeString(this.f791d);
            parcel.writeString(this.f792e == null ? null : this.f792e.toString());
            if (this.f793f != null) {
                str = this.f793f.toString();
            }
            parcel.writeString(str);
            parcel.writeInt(this.f794g);
            parcel.writeString(this.f795h);
            parcel.writeInt(this.f796i ? 1 : 0);
            if (this.f797j != null) {
                i2 = 1;
            }
            parcel.writeInt(i2);
            if (this.f797j != null) {
                this.f797j.writeToParcel(parcel, i);
                return;
            }
            return;
        }
        C0342d.m1462a(this, parcel, i);
    }
}
