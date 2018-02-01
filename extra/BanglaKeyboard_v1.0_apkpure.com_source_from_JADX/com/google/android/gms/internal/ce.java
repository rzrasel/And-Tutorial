package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p007a.C0205o;
import com.google.android.gms.p007a.C0207q;

public final class ce implements SafeParcelable {
    public static final cq CREATOR = new cq();
    public final int f1107a;
    public final cb f1108b;
    public final no f1109c;
    public final cr f1110d;
    public final ge f1111e;
    public final ao f1112f;
    public final String f1113g;
    public final boolean f1114h;
    public final String f1115i;
    public final cw f1116j;
    public final int f1117k;
    public final int f1118l;
    public final String f1119m;
    public final dx f1120n;
    public final bb f1121o;
    public final String f1122p;

    ce(int i, cb cbVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, dx dxVar, IBinder iBinder6, String str4) {
        this.f1107a = i;
        this.f1108b = cbVar;
        this.f1109c = (no) C0207q.m864a(C0205o.m862a(iBinder));
        this.f1110d = (cr) C0207q.m864a(C0205o.m862a(iBinder2));
        this.f1111e = (ge) C0207q.m864a(C0205o.m862a(iBinder3));
        this.f1112f = (ao) C0207q.m864a(C0205o.m862a(iBinder4));
        this.f1113g = str;
        this.f1114h = z;
        this.f1115i = str2;
        this.f1116j = (cw) C0207q.m864a(C0205o.m862a(iBinder5));
        this.f1117k = i2;
        this.f1118l = i3;
        this.f1119m = str3;
        this.f1120n = dxVar;
        this.f1121o = (bb) C0207q.m864a(C0205o.m862a(iBinder6));
        this.f1122p = str4;
    }

    public ce(cb cbVar, no noVar, cr crVar, cw cwVar, dx dxVar) {
        this.f1107a = 3;
        this.f1108b = cbVar;
        this.f1109c = noVar;
        this.f1110d = crVar;
        this.f1111e = null;
        this.f1112f = null;
        this.f1113g = null;
        this.f1114h = false;
        this.f1115i = null;
        this.f1116j = cwVar;
        this.f1117k = -1;
        this.f1118l = 4;
        this.f1119m = null;
        this.f1120n = dxVar;
        this.f1121o = null;
        this.f1122p = null;
    }

    public ce(no noVar, cr crVar, ao aoVar, cw cwVar, ge geVar, boolean z, int i, String str, dx dxVar, bb bbVar) {
        this.f1107a = 3;
        this.f1108b = null;
        this.f1109c = noVar;
        this.f1110d = crVar;
        this.f1111e = geVar;
        this.f1112f = aoVar;
        this.f1113g = null;
        this.f1114h = z;
        this.f1115i = null;
        this.f1116j = cwVar;
        this.f1117k = i;
        this.f1118l = 3;
        this.f1119m = str;
        this.f1120n = dxVar;
        this.f1121o = bbVar;
        this.f1122p = null;
    }

    public ce(no noVar, cr crVar, ao aoVar, cw cwVar, ge geVar, boolean z, int i, String str, String str2, dx dxVar, bb bbVar) {
        this.f1107a = 3;
        this.f1108b = null;
        this.f1109c = noVar;
        this.f1110d = crVar;
        this.f1111e = geVar;
        this.f1112f = aoVar;
        this.f1113g = str2;
        this.f1114h = z;
        this.f1115i = str;
        this.f1116j = cwVar;
        this.f1117k = i;
        this.f1118l = 3;
        this.f1119m = null;
        this.f1120n = dxVar;
        this.f1121o = bbVar;
        this.f1122p = null;
    }

    public ce(no noVar, cr crVar, cw cwVar, ge geVar, int i, dx dxVar, String str) {
        this.f1107a = 3;
        this.f1108b = null;
        this.f1109c = noVar;
        this.f1110d = crVar;
        this.f1111e = geVar;
        this.f1112f = null;
        this.f1113g = null;
        this.f1114h = false;
        this.f1115i = null;
        this.f1116j = cwVar;
        this.f1117k = i;
        this.f1118l = 1;
        this.f1119m = null;
        this.f1120n = dxVar;
        this.f1121o = null;
        this.f1122p = str;
    }

    public ce(no noVar, cr crVar, cw cwVar, ge geVar, boolean z, int i, dx dxVar) {
        this.f1107a = 3;
        this.f1108b = null;
        this.f1109c = noVar;
        this.f1110d = crVar;
        this.f1111e = geVar;
        this.f1112f = null;
        this.f1113g = null;
        this.f1114h = z;
        this.f1115i = null;
        this.f1116j = cwVar;
        this.f1117k = i;
        this.f1118l = 2;
        this.f1119m = null;
        this.f1120n = dxVar;
        this.f1121o = null;
        this.f1122p = null;
    }

    public static ce m1756a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(ce.class.getClassLoader());
            return (ce) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            return null;
        }
    }

    public static void m1757a(Intent intent, ce ceVar) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", ceVar);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    final IBinder m1758a() {
        return C0207q.m863a(this.f1109c).asBinder();
    }

    final IBinder m1759b() {
        return C0207q.m863a(this.f1110d).asBinder();
    }

    final IBinder m1760c() {
        return C0207q.m863a(this.f1111e).asBinder();
    }

    final IBinder m1761d() {
        return C0207q.m863a(this.f1112f).asBinder();
    }

    public final int describeContents() {
        return 0;
    }

    final IBinder m1762e() {
        return C0207q.m863a(this.f1121o).asBinder();
    }

    final IBinder m1763f() {
        return C0207q.m863a(this.f1116j).asBinder();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        cq.m1824a(this, parcel, i);
    }
}
