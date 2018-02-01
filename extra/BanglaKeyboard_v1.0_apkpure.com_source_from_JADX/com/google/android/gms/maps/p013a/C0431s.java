package com.google.android.gms.maps.p013a;

import android.os.IInterface;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.p007a.C0204n;

public interface C0431s extends IInterface {
    C0204n mo1142a(StreetViewPanoramaOrientation streetViewPanoramaOrientation);

    StreetViewPanoramaOrientation mo1143a(C0204n c0204n);

    void mo1144a(bv bvVar);

    void mo1145a(by byVar);

    void mo1146a(cb cbVar);

    void mo1147a(LatLng latLng);

    void mo1148a(LatLng latLng, int i);

    void mo1149a(StreetViewPanoramaCamera streetViewPanoramaCamera, long j);

    void mo1150a(String str);

    void mo1151a(boolean z);

    boolean mo1152a();

    void mo1153b(boolean z);

    boolean mo1154b();

    void mo1155c(boolean z);

    boolean mo1156c();

    void mo1157d(boolean z);

    boolean mo1158d();

    StreetViewPanoramaCamera mo1159e();

    StreetViewPanoramaLocation mo1160f();
}
