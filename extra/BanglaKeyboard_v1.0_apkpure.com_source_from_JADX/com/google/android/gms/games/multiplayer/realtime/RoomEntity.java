package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.jb;
import java.util.ArrayList;
import java.util.Arrays;

public final class RoomEntity extends GamesDowngradeableSafeParcel implements Room {
    public static final Creator CREATOR = new C0347b();
    private final int f810b;
    private final String f811c;
    private final String f812d;
    private final long f813e;
    private final int f814f;
    private final String f815g;
    private final int f816h;
    private final Bundle f817i;
    private final ArrayList f818j;
    private final int f819k;

    RoomEntity(int i, String str, String str2, long j, int i2, String str3, int i3, Bundle bundle, ArrayList arrayList, int i4) {
        this.f810b = i;
        this.f811c = str;
        this.f812d = str2;
        this.f813e = j;
        this.f814f = i2;
        this.f815g = str3;
        this.f816h = i3;
        this.f817i = bundle;
        this.f818j = arrayList;
        this.f819k = i4;
    }

    public RoomEntity(Room room) {
        this.f810b = 2;
        this.f811c = room.mo791b();
        this.f812d = room.mo792c();
        this.f813e = room.mo793d();
        this.f814f = room.mo794e();
        this.f815g = room.mo795f();
        this.f816h = room.mo796g();
        this.f817i = room.mo797h();
        ArrayList k = room.mo764k();
        int size = k.size();
        this.f818j = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.f818j.add((ParticipantEntity) ((Participant) k.get(i)).mo701a());
        }
        this.f819k = room.mo798i();
    }

    static int m1474a(Room room) {
        return Arrays.hashCode(new Object[]{room.mo791b(), room.mo792c(), Long.valueOf(room.mo793d()), Integer.valueOf(room.mo794e()), room.mo795f(), Integer.valueOf(room.mo796g()), room.mo797h(), room.mo764k(), Integer.valueOf(room.mo798i())});
    }

    static boolean m1475a(Room room, Object obj) {
        if (!(obj instanceof Room)) {
            return false;
        }
        if (room == obj) {
            return true;
        }
        Room room2 = (Room) obj;
        return jb.m2470a(room2.mo791b(), room.mo791b()) && jb.m2470a(room2.mo792c(), room.mo792c()) && jb.m2470a(Long.valueOf(room2.mo793d()), Long.valueOf(room.mo793d())) && jb.m2470a(Integer.valueOf(room2.mo794e()), Integer.valueOf(room.mo794e())) && jb.m2470a(room2.mo795f(), room.mo795f()) && jb.m2470a(Integer.valueOf(room2.mo796g()), Integer.valueOf(room.mo796g())) && jb.m2470a(room2.mo797h(), room.mo797h()) && jb.m2470a(room2.mo764k(), room.mo764k()) && jb.m2470a(Integer.valueOf(room2.mo798i()), Integer.valueOf(room.mo798i()));
    }

    static String m1478b(Room room) {
        return jb.m2469a(room).m2471a("RoomId", room.mo791b()).m2471a("CreatorId", room.mo792c()).m2471a("CreationTimestamp", Long.valueOf(room.mo793d())).m2471a("RoomStatus", Integer.valueOf(room.mo794e())).m2471a("Description", room.mo795f()).m2471a("Variant", Integer.valueOf(room.mo796g())).m2471a("AutoMatchCriteria", room.mo797h()).m2471a("Participants", room.mo764k()).m2471a("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.mo798i())).toString();
    }

    public final /* bridge */ /* synthetic */ Object mo701a() {
        return this;
    }

    public final String mo791b() {
        return this.f811c;
    }

    public final String mo792c() {
        return this.f812d;
    }

    public final long mo793d() {
        return this.f813e;
    }

    public final int describeContents() {
        return 0;
    }

    public final int mo794e() {
        return this.f814f;
    }

    public final boolean equals(Object obj) {
        return m1475a(this, obj);
    }

    public final String mo795f() {
        return this.f815g;
    }

    public final int mo796g() {
        return this.f816h;
    }

    public final Bundle mo797h() {
        return this.f817i;
    }

    public final int hashCode() {
        return m1474a((Room) this);
    }

    public final int mo798i() {
        return this.f819k;
    }

    public final int m1489j() {
        return this.f810b;
    }

    public final ArrayList mo764k() {
        return new ArrayList(this.f818j);
    }

    public final String toString() {
        return m1478b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f708a) {
            parcel.writeString(this.f811c);
            parcel.writeString(this.f812d);
            parcel.writeLong(this.f813e);
            parcel.writeInt(this.f814f);
            parcel.writeString(this.f815g);
            parcel.writeInt(this.f816h);
            parcel.writeBundle(this.f817i);
            int size = this.f818j.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                ((ParticipantEntity) this.f818j.get(i2)).writeToParcel(parcel, i);
            }
            return;
        }
        C0346c.m1502a(this, parcel);
    }
}
