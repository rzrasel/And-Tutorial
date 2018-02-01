package com.google.android.gms.maps.p013a;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.C0480d;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.p014a.C0451a;
import com.google.android.gms.maps.model.p014a.C0453b;
import com.google.android.gms.maps.model.p014a.C0458g;
import com.google.android.gms.maps.model.p014a.C0459h;
import com.google.android.gms.maps.model.p014a.C0461j;
import com.google.android.gms.maps.model.p014a.C0462k;
import com.google.android.gms.maps.model.p014a.C0464m;
import com.google.android.gms.maps.model.p014a.C0465n;
import com.google.android.gms.maps.model.p014a.C0467p;
import com.google.android.gms.maps.model.p014a.C0468q;
import com.google.android.gms.maps.model.p014a.C0470s;
import com.google.android.gms.maps.model.p014a.C0471t;
import com.google.android.gms.maps.model.p014a.C0473v;
import com.google.android.gms.maps.model.p014a.C0474w;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0205o;

final class C0418f implements C0416d {
    private IBinder f2094a;

    C0418f(IBinder iBinder) {
        this.f2094a = iBinder;
    }

    public final CameraPosition mo1073a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            CameraPosition a;
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f2094a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                C0480d c0480d = CameraPosition.CREATOR;
                a = C0480d.m3540a(obtain2);
            } else {
                a = null;
            }
            obtain2.recycle();
            obtain.recycle();
            return a;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0451a mo1074a(PolylineOptions polylineOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (polylineOptions != null) {
                obtain.writeInt(1);
                polylineOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2094a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            C0451a a = C0453b.m3297a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0458g mo1075a(CircleOptions circleOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (circleOptions != null) {
                obtain.writeInt(1);
                circleOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2094a.transact(35, obtain, obtain2, 0);
            obtain2.readException();
            C0458g a = C0459h.m3347a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0461j mo1076a(GroundOverlayOptions groundOverlayOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (groundOverlayOptions != null) {
                obtain.writeInt(1);
                groundOverlayOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2094a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            C0461j a = C0462k.m3387a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0467p mo1077a(MarkerOptions markerOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (markerOptions != null) {
                obtain.writeInt(1);
                markerOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2094a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            C0467p a = C0468q.m3448a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0470s mo1078a(PolygonOptions polygonOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (polygonOptions != null) {
                obtain.writeInt(1);
                polygonOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2094a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            C0470s a = C0471t.m3495a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0473v mo1079a(TileOverlayOptions tileOverlayOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (tileOverlayOptions != null) {
                obtain.writeInt(1);
                tileOverlayOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2094a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
            C0473v a = C0474w.m3527a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1080a(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeInt(i);
            this.f2094a.transact(16, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1081a(int i, int i2, int i3, int i4) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeInt(i4);
            this.f2094a.transact(39, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1082a(C0204n c0204n) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            this.f2094a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1083a(C0204n c0204n, int i, af afVar) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            obtain.writeInt(i);
            if (afVar != null) {
                iBinder = afVar.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f2094a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1084a(C0204n c0204n, af afVar) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            if (afVar != null) {
                iBinder = afVar.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f2094a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1085a(al alVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(alVar != null ? alVar.asBinder() : null);
            this.f2094a.transact(33, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1086a(ao aoVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(aoVar != null ? aoVar.asBinder() : null);
            this.f2094a.transact(27, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1087a(ar arVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(arVar != null ? arVar.asBinder() : null);
            this.f2094a.transact(45, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1088a(au auVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(auVar != null ? auVar.asBinder() : null);
            this.f2094a.transact(32, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1089a(ba baVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(baVar != null ? baVar.asBinder() : null);
            this.f2094a.transact(28, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1090a(bd bdVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(bdVar != null ? bdVar.asBinder() : null);
            this.f2094a.transact(42, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1091a(bg bgVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(bgVar != null ? bgVar.asBinder() : null);
            this.f2094a.transact(29, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1092a(bj bjVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(bjVar != null ? bjVar.asBinder() : null);
            this.f2094a.transact(30, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1093a(bm bmVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(bmVar != null ? bmVar.asBinder() : null);
            this.f2094a.transact(31, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1094a(bp bpVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(bpVar != null ? bpVar.asBinder() : null);
            this.f2094a.transact(37, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1095a(bs bsVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(bsVar != null ? bsVar.asBinder() : null);
            this.f2094a.transact(36, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1096a(ce ceVar, C0204n c0204n) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(ceVar != null ? ceVar.asBinder() : null);
            if (c0204n != null) {
                iBinder = c0204n.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f2094a.transact(38, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1097a(C0419g c0419g) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(c0419g != null ? c0419g.asBinder() : null);
            this.f2094a.transact(24, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1098a(boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f2094a.transact(18, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2094a;
    }

    public final float mo1099b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f2094a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            float readFloat = obtain2.readFloat();
            return readFloat;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1100b(C0204n c0204n) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            this.f2094a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean mo1101b(boolean z) {
        boolean z2 = true;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            obtain.writeInt(z ? 1 : 0);
            this.f2094a.transact(20, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z2 = false;
            }
            obtain2.recycle();
            obtain.recycle();
            return z2;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final float mo1102c() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f2094a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            float readFloat = obtain2.readFloat();
            return readFloat;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1103c(boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f2094a.transact(22, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1104d() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f2094a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1105d(boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f2094a.transact(41, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1106e() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f2094a.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1107e(boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f2094a.transact(51, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int mo1108f() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f2094a.transact(15, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean mo1109g() {
        boolean z = false;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f2094a.transact(17, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean mo1110h() {
        boolean z = false;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f2094a.transact(19, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean mo1111i() {
        boolean z = false;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f2094a.transact(21, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final Location mo1112j() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f2094a.transact(23, obtain, obtain2, 0);
            obtain2.readException();
            Location location = obtain2.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return location;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final ab mo1113k() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f2094a.transact(25, obtain, obtain2, 0);
            obtain2.readException();
            ab a = ac.m2850a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0428p mo1114l() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f2094a.transact(26, obtain, obtain2, 0);
            obtain2.readException();
            C0428p a = C0429q.m3090a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0204n mo1115m() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f2094a.transact(34, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean mo1116n() {
        boolean z = false;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f2094a.transact(40, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0464m mo1117o() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            this.f2094a.transact(44, obtain, obtain2, 0);
            obtain2.readException();
            C0464m a = C0465n.m3415a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
