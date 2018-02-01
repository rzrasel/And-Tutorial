package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1398a.C1399a;
import java.util.List;

public final class agr extends sd implements agp {
    agr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public final String mo1787a(String str) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_ = m3582a(1, b_);
        String readString = b_.readString();
        b_.recycle();
        return readString;
    }

    public final List<String> mo1788a() {
        Parcel a = m3582a(3, b_());
        List createStringArrayList = a.createStringArrayList();
        a.recycle();
        return createStringArrayList;
    }

    public final boolean mo1789a(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_ = m3582a(10, b_);
        boolean a = uc.m6697a(b_);
        b_.recycle();
        return a;
    }

    public final C1398a mo1790b() {
        Parcel a = m3582a(11, b_());
        C1398a a2 = C1399a.m3581a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final afy mo1791b(String str) {
        afy com_google_android_gms_internal_afy;
        Parcel b_ = b_();
        b_.writeString(str);
        Parcel a = m3582a(2, b_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_afy = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            com_google_android_gms_internal_afy = queryLocalInterface instanceof afy ? (afy) queryLocalInterface : new aga(readStrongBinder);
        }
        a.recycle();
        return com_google_android_gms_internal_afy;
    }

    public final abv mo1792c() {
        Parcel a = m3582a(7, b_());
        abv a2 = abw.m4063a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void mo1793c(String str) {
        Parcel b_ = b_();
        b_.writeString(str);
        m3583b(5, b_);
    }

    public final void mo1794d() {
        m3583b(6, b_());
    }

    public final C1398a mo1795e() {
        Parcel a = m3582a(9, b_());
        C1398a a2 = C1399a.m3581a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void mo1796f() {
        m3583b(8, b_());
    }

    public final String mo1768l() {
        Parcel a = m3582a(4, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
