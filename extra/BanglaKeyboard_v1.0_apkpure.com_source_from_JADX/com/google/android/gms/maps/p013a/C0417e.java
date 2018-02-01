package com.google.android.gms.maps.p013a;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.C0481e;
import com.google.android.gms.maps.model.C0482f;
import com.google.android.gms.maps.model.C0485i;
import com.google.android.gms.maps.model.C0487k;
import com.google.android.gms.maps.model.C0497t;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.p014a.C0451a;
import com.google.android.gms.maps.model.p014a.C0458g;
import com.google.android.gms.maps.model.p014a.C0461j;
import com.google.android.gms.maps.model.p014a.C0464m;
import com.google.android.gms.maps.model.p014a.C0467p;
import com.google.android.gms.maps.model.p014a.C0470s;
import com.google.android.gms.maps.model.p014a.C0473v;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0205o;

public abstract class C0417e extends Binder implements C0416d {
    public static C0416d m2997a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0416d)) ? new C0418f(iBinder) : (C0416d) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        ar arVar = null;
        float b;
        IBinder asBinder;
        int f;
        boolean g;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                CameraPosition a = mo1073a();
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                b = mo1099b();
                parcel2.writeNoException();
                parcel2.writeFloat(b);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                b = mo1102c();
                parcel2.writeNoException();
                parcel2.writeFloat(b);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo1082a(C0205o.m862a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo1100b(C0205o.m862a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo1084a(C0205o.m862a(parcel.readStrongBinder()), ag.m2872a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo1083a(C0205o.m862a(parcel.readStrongBinder()), parcel.readInt(), ag.m2872a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo1104d();
                parcel2.writeNoException();
                return true;
            case 9:
                PolylineOptions a2;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0) {
                    C0487k c0487k = PolylineOptions.CREATOR;
                    a2 = C0487k.m3554a(parcel);
                } else {
                    a2 = null;
                }
                C0451a a3 = mo1074a(a2);
                parcel2.writeNoException();
                if (a3 != null) {
                    asBinder = a3.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                C0470s a4 = mo1078a(parcel.readInt() != 0 ? PolygonOptions.CREATOR.m3553a(parcel) : null);
                parcel2.writeNoException();
                if (a4 != null) {
                    asBinder = a4.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 11:
                MarkerOptions a5;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0) {
                    C0485i c0485i = MarkerOptions.CREATOR;
                    a5 = C0485i.m3550a(parcel);
                } else {
                    a5 = null;
                }
                C0467p a6 = mo1077a(a5);
                parcel2.writeNoException();
                if (a6 != null) {
                    asBinder = a6.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 12:
                GroundOverlayOptions a7;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0) {
                    C0482f c0482f = GroundOverlayOptions.CREATOR;
                    a7 = C0482f.m3544a(parcel);
                } else {
                    a7 = null;
                }
                C0461j a8 = mo1076a(a7);
                parcel2.writeNoException();
                if (a8 != null) {
                    asBinder = a8.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 13:
                TileOverlayOptions a9;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0) {
                    C0497t c0497t = TileOverlayOptions.CREATOR;
                    a9 = C0497t.m3565a(parcel);
                } else {
                    a9 = null;
                }
                C0473v a10 = mo1079a(a9);
                parcel2.writeNoException();
                if (a10 != null) {
                    asBinder = a10.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo1106e();
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                f = mo1108f();
                parcel2.writeNoException();
                parcel2.writeInt(f);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo1080a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                g = mo1109g();
                parcel2.writeNoException();
                if (g) {
                    f = 1;
                }
                parcel2.writeInt(f);
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo1098a(z);
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                g = mo1110h();
                parcel2.writeNoException();
                if (g) {
                    f = 1;
                }
                parcel2.writeInt(f);
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                g = mo1101b(parcel.readInt() != 0);
                parcel2.writeNoException();
                if (g) {
                    f = 1;
                }
                parcel2.writeInt(f);
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                g = mo1111i();
                parcel2.writeNoException();
                if (g) {
                    f = 1;
                }
                parcel2.writeInt(f);
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo1103c(z);
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                Location j = mo1112j();
                parcel2.writeNoException();
                if (j != null) {
                    parcel2.writeInt(1);
                    j.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 24:
                C0419g c0421i;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                    c0421i = (queryLocalInterface == null || !(queryLocalInterface instanceof C0419g)) ? new C0421i(readStrongBinder) : (C0419g) queryLocalInterface;
                }
                mo1097a(c0421i);
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                ab k = mo1113k();
                parcel2.writeNoException();
                if (k != null) {
                    asBinder = k.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 26:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                C0428p l = mo1114l();
                parcel2.writeNoException();
                if (l != null) {
                    asBinder = l.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 27:
                ao aqVar;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
                    aqVar = (queryLocalInterface == null || !(queryLocalInterface instanceof ao)) ? new aq(readStrongBinder) : (ao) queryLocalInterface;
                }
                mo1086a(aqVar);
                parcel2.writeNoException();
                return true;
            case 28:
                ba bcVar;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
                    bcVar = (queryLocalInterface == null || !(queryLocalInterface instanceof ba)) ? new bc(readStrongBinder) : (ba) queryLocalInterface;
                }
                mo1089a(bcVar);
                parcel2.writeNoException();
                return true;
            case 29:
                bg biVar;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                    biVar = (queryLocalInterface == null || !(queryLocalInterface instanceof bg)) ? new bi(readStrongBinder) : (bg) queryLocalInterface;
                }
                mo1091a(biVar);
                parcel2.writeNoException();
                return true;
            case 30:
                bj blVar;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                    blVar = (queryLocalInterface == null || !(queryLocalInterface instanceof bj)) ? new bl(readStrongBinder) : (bj) queryLocalInterface;
                }
                mo1092a(blVar);
                parcel2.writeNoException();
                return true;
            case 31:
                bm boVar;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    boVar = (queryLocalInterface == null || !(queryLocalInterface instanceof bm)) ? new bo(readStrongBinder) : (bm) queryLocalInterface;
                }
                mo1093a(boVar);
                parcel2.writeNoException();
                return true;
            case 32:
                au awVar;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                    awVar = (queryLocalInterface == null || !(queryLocalInterface instanceof au)) ? new aw(readStrongBinder) : (au) queryLocalInterface;
                }
                mo1088a(awVar);
                parcel2.writeNoException();
                return true;
            case 33:
                al anVar;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    anVar = (queryLocalInterface == null || !(queryLocalInterface instanceof al)) ? new an(readStrongBinder) : (al) queryLocalInterface;
                }
                mo1085a(anVar);
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                C0204n m = mo1115m();
                parcel2.writeNoException();
                if (m != null) {
                    asBinder = m.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 35:
                CircleOptions a11;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0) {
                    C0481e c0481e = CircleOptions.CREATOR;
                    a11 = C0481e.m3542a(parcel);
                } else {
                    a11 = null;
                }
                C0458g a12 = mo1075a(a11);
                parcel2.writeNoException();
                if (a12 != null) {
                    asBinder = a12.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 36:
                bs buVar;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                    buVar = (queryLocalInterface == null || !(queryLocalInterface instanceof bs)) ? new bu(readStrongBinder) : (bs) queryLocalInterface;
                }
                mo1095a(buVar);
                parcel2.writeNoException();
                return true;
            case 37:
                bp brVar;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                    brVar = (queryLocalInterface == null || !(queryLocalInterface instanceof bp)) ? new br(readStrongBinder) : (bp) queryLocalInterface;
                }
                mo1094a(brVar);
                parcel2.writeNoException();
                return true;
            case 38:
                ce cgVar;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    cgVar = (queryLocalInterface == null || !(queryLocalInterface instanceof ce)) ? new cg(readStrongBinder) : (ce) queryLocalInterface;
                }
                mo1096a(cgVar, C0205o.m862a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 39:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo1081a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                g = mo1116n();
                parcel2.writeNoException();
                if (g) {
                    f = 1;
                }
                parcel2.writeInt(f);
                return true;
            case 41:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo1105d(z);
                parcel2.writeNoException();
                return true;
            case 42:
                bd bfVar;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
                    bfVar = (queryLocalInterface == null || !(queryLocalInterface instanceof bd)) ? new bf(readStrongBinder) : (bd) queryLocalInterface;
                }
                mo1090a(bfVar);
                parcel2.writeNoException();
                return true;
            case 44:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                C0464m o = mo1117o();
                parcel2.writeNoException();
                if (o != null) {
                    asBinder = o.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 45:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
                    arVar = (queryLocalInterface == null || !(queryLocalInterface instanceof ar)) ? new at(readStrongBinder) : (ar) queryLocalInterface;
                }
                mo1087a(arVar);
                parcel2.writeNoException();
                return true;
            case 51:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo1107e(z);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
