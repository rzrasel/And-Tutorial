package com.google.android.gms.maps.p013a;

import android.location.Location;
import android.os.IInterface;
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

public interface C0416d extends IInterface {
    CameraPosition mo1073a();

    C0451a mo1074a(PolylineOptions polylineOptions);

    C0458g mo1075a(CircleOptions circleOptions);

    C0461j mo1076a(GroundOverlayOptions groundOverlayOptions);

    C0467p mo1077a(MarkerOptions markerOptions);

    C0470s mo1078a(PolygonOptions polygonOptions);

    C0473v mo1079a(TileOverlayOptions tileOverlayOptions);

    void mo1080a(int i);

    void mo1081a(int i, int i2, int i3, int i4);

    void mo1082a(C0204n c0204n);

    void mo1083a(C0204n c0204n, int i, af afVar);

    void mo1084a(C0204n c0204n, af afVar);

    void mo1085a(al alVar);

    void mo1086a(ao aoVar);

    void mo1087a(ar arVar);

    void mo1088a(au auVar);

    void mo1089a(ba baVar);

    void mo1090a(bd bdVar);

    void mo1091a(bg bgVar);

    void mo1092a(bj bjVar);

    void mo1093a(bm bmVar);

    void mo1094a(bp bpVar);

    void mo1095a(bs bsVar);

    void mo1096a(ce ceVar, C0204n c0204n);

    void mo1097a(C0419g c0419g);

    void mo1098a(boolean z);

    float mo1099b();

    void mo1100b(C0204n c0204n);

    boolean mo1101b(boolean z);

    float mo1102c();

    void mo1103c(boolean z);

    void mo1104d();

    void mo1105d(boolean z);

    void mo1106e();

    void mo1107e(boolean z);

    int mo1108f();

    boolean mo1109g();

    boolean mo1110h();

    boolean mo1111i();

    Location mo1112j();

    ab mo1113k();

    C0428p mo1114l();

    C0204n mo1115m();

    boolean mo1116n();

    C0464m mo1117o();
}
