package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p056a.C1398a;

public final class aok extends sd implements aoi {
    aok(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Parcel b_ = b_();
        b_.writeInt(i);
        b_.writeInt(i2);
        uc.m6695a(b_, (Parcelable) intent);
        m3583b(12, b_);
    }

    public final void onBackPressed() {
        m3583b(10, b_());
    }

    public final void onCreate(Bundle bundle) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) bundle);
        m3583b(1, b_);
    }

    public final void onDestroy() {
        m3583b(8, b_());
    }

    public final void onPause() {
        m3583b(5, b_());
    }

    public final void onRestart() {
        m3583b(2, b_());
    }

    public final void onResume() {
        m3583b(4, b_());
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) bundle);
        b_ = m3582a(6, b_);
        if (b_.readInt() != 0) {
            bundle.readFromParcel(b_);
        }
        b_.recycle();
    }

    public final void onStart() {
        m3583b(3, b_());
    }

    public final void onStop() {
        m3583b(7, b_());
    }

    public final void zzay() {
        m3583b(9, b_());
    }

    public final boolean zzmn() {
        Parcel a = m3582a(11, b_());
        boolean a2 = uc.m6697a(a);
        a.recycle();
        return a2;
    }

    public final void zzo(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(13, b_);
    }
}
