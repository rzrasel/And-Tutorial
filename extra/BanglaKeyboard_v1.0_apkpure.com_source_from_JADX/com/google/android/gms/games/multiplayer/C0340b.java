package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

public class C0340b implements Creator {
    static void m1459a(InvitationEntity invitationEntity, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1072a(parcel, 1, invitationEntity.mo757d(), i, false);
        C0261c.m1082b(parcel, 1000, invitationEntity.m1390b());
        C0261c.m1073a(parcel, 2, invitationEntity.mo758e(), false);
        C0261c.m1069a(parcel, 3, invitationEntity.mo760g());
        C0261c.m1082b(parcel, 4, invitationEntity.mo761h());
        C0261c.m1072a(parcel, 5, invitationEntity.mo759f(), i, false);
        C0261c.m1083b(parcel, 6, invitationEntity.mo764k(), false);
        C0261c.m1082b(parcel, 7, invitationEntity.mo762i());
        C0261c.m1082b(parcel, 8, invitationEntity.mo763j());
        C0261c.m1081b(parcel, a);
    }

    public InvitationEntity mo787a(Parcel parcel) {
        ArrayList arrayList = null;
        int i = 0;
        int a = C0259a.m1038a(parcel);
        long j = 0;
        int i2 = 0;
        ParticipantEntity participantEntity = null;
        int i3 = 0;
        String str = null;
        GameEntity gameEntity = null;
        int i4 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    gameEntity = (GameEntity) C0259a.m1040a(parcel, readInt, GameEntity.CREATOR);
                    break;
                case 2:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    j = C0259a.m1049g(parcel, readInt);
                    break;
                case 4:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 5:
                    participantEntity = (ParticipantEntity) C0259a.m1040a(parcel, readInt, ParticipantEntity.CREATOR);
                    break;
                case 6:
                    arrayList = C0259a.m1044c(parcel, readInt, ParticipantEntity.CREATOR);
                    break;
                case 7:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 8:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 1000:
                    i4 = C0259a.m1048f(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new InvitationEntity(i4, gameEntity, str, j, i3, participantEntity, arrayList, i2, i);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo787a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new InvitationEntity[i];
    }
}
