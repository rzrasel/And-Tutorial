package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.games.PlayerEntity;

public class C0342d implements Creator {
    static void m1462a(ParticipantEntity participantEntity, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1073a(parcel, 1, participantEntity.mo784k(), false);
        C0261c.m1073a(parcel, 2, participantEntity.mo779f(), false);
        C0261c.m1072a(parcel, 3, participantEntity.mo780g(), i, false);
        C0261c.m1072a(parcel, 4, participantEntity.mo782i(), i, false);
        C0261c.m1082b(parcel, 5, participantEntity.mo775b());
        C0261c.m1073a(parcel, 6, participantEntity.mo776c(), false);
        C0261c.m1075a(parcel, 7, participantEntity.mo778e());
        C0261c.m1072a(parcel, 8, participantEntity.mo785l(), i, false);
        C0261c.m1082b(parcel, 9, participantEntity.mo777d());
        C0261c.m1072a(parcel, 10, participantEntity.mo786m(), i, false);
        C0261c.m1073a(parcel, 11, participantEntity.mo781h(), false);
        C0261c.m1073a(parcel, 12, participantEntity.mo783j(), false);
        C0261c.m1082b(parcel, 1000, participantEntity.m1440n());
        C0261c.m1081b(parcel, a);
    }

    public ParticipantEntity mo789a(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        int i2 = 0;
        String str3 = null;
        boolean z = false;
        PlayerEntity playerEntity = null;
        int i3 = 0;
        ParticipantResult participantResult = null;
        String str4 = null;
        String str5 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 2:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    uri = (Uri) C0259a.m1040a(parcel, readInt, Uri.CREATOR);
                    break;
                case 4:
                    uri2 = (Uri) C0259a.m1040a(parcel, readInt, Uri.CREATOR);
                    break;
                case 5:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 6:
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                case 7:
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                case 8:
                    playerEntity = (PlayerEntity) C0259a.m1040a(parcel, readInt, PlayerEntity.CREATOR);
                    break;
                case 9:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 10:
                    participantResult = (ParticipantResult) C0259a.m1040a(parcel, readInt, ParticipantResult.CREATOR);
                    break;
                case 11:
                    str4 = C0259a.m1054l(parcel, readInt);
                    break;
                case 12:
                    str5 = C0259a.m1054l(parcel, readInt);
                    break;
                case 1000:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new ParticipantEntity(i, str, str2, uri, uri2, i2, str3, z, playerEntity, i3, participantResult, str4, str5);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo789a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new ParticipantEntity[i];
    }
}
