package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C1493g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.zzbcc;

public final class zzy extends zzbcc {
    public static final Creator<zzy> CREATOR = new ai();
    String f4613a;
    IBinder f4614b;
    Scope[] f4615c;
    Bundle f4616d;
    Account f4617e;
    zzc[] f4618f;
    private int f4619g;
    private int f4620h;
    private int f4621i;

    public zzy(int i) {
        this.f4619g = 3;
        this.f4621i = C1493g.f4531a;
        this.f4620h = i;
    }

    zzy(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, zzc[] com_google_android_gms_common_zzcArr) {
        Account account2 = null;
        this.f4619g = i;
        this.f4620h = i2;
        this.f4621i = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f4613a = "com.google.android.gms";
        } else {
            this.f4613a = str;
        }
        if (i < 2) {
            if (iBinder != null) {
                C1498g c1509i;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                    c1509i = queryLocalInterface instanceof C1498g ? (C1498g) queryLocalInterface : new C1509i(iBinder);
                }
                account2 = C1500a.m3816a(c1509i);
            }
            this.f4617e = account2;
        } else {
            this.f4614b = iBinder;
            this.f4617e = account;
        }
        this.f4615c = scopeArr;
        this.f4616d = bundle;
        this.f4618f = com_google_android_gms_common_zzcArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5956a(parcel, 1, this.f4619g);
        li.m5956a(parcel, 2, this.f4620h);
        li.m5956a(parcel, 3, this.f4621i);
        li.m5961a(parcel, 4, this.f4613a);
        li.m5959a(parcel, 5, this.f4614b);
        li.m5965a(parcel, 6, this.f4615c, i);
        li.m5958a(parcel, 7, this.f4616d);
        li.m5960a(parcel, 8, this.f4617e, i);
        li.m5965a(parcel, 10, this.f4618f, i);
        li.m5967b(parcel, a);
    }
}
