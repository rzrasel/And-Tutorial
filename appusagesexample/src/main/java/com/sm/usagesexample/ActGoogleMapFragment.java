package com.sm.usagesexample;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.location.Geocoder;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Formatter;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.sm.usagesexample.gomap.GoogleMapReadyCallback;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

public class ActGoogleMapFragment extends AppCompatActivity {
    private Activity activity;
    private Context context;
    private GoogleMap googleMap;
    private Circle mapCircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_google_map_fragment);
        activity = this;
        context = this;
        //FusedLocation
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.sysFragGoogleMap);
        GoogleMapReadyCallback mapReadyCallback = new GoogleMapReadyCallback();
        mapReadyCallback.setMapLatLng(new LatLng(23.6850, 90.3563))
                .isStartToAnimateMap(true)
                .setMapType(GoogleMapReadyCallback.MapType.MAP_TYPE_NORMAL)
                .getMap(new GoogleMapReadyCallback.OnEventListenerHandler() {
                    @Override
                    public void onMapReady(GoogleMap argGoogleMap) {
                        googleMap = argGoogleMap;
                        argGoogleMap.setOnMarkerClickListener(new MapMarkerClickListener());
                        onAddMarker(argGoogleMap, new LatLng(23.6850, 90.3563));
                        onAddMarker(argGoogleMap, new LatLng(23.7776, 90.4054));
                        onAddMarker(argGoogleMap, new LatLng(23.7925, 90.4078));
                        argGoogleMap.setOnMapClickListener(new MapClickListener());
                    }
                });
        mapFragment.getMapAsync(mapReadyCallback);
    }

    private class MapClickListener implements GoogleMap.OnMapClickListener {
        @Override
        public void onMapClick(LatLng argLatLng) {
            googleMap.clear();
            onAddMarker(googleMap, argLatLng);
        }
    }

    private class MapMarkerClickListener implements GoogleMap.OnMarkerClickListener {
        @Override
        public boolean onMarkerClick(Marker argMarker) {
            LatLng latLng = new LatLng(argMarker.getPosition().latitude, argMarker.getPosition().longitude);
            //onDrawCircle(googleMap, latLng);
            argMarker.showInfoWindow();
            return true;
        }
    }

    private void onAddMarker(GoogleMap argGoogleMap, LatLng argLatLng) {
        MarkerOptions markerOptions = new MarkerOptions().position(argLatLng);
        markerOptions.title(getAddressFromLatLng(argLatLng));
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker());
        argGoogleMap.addMarker(markerOptions);
        //.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
    }

    private void onDrawCircle(GoogleMap argGoogleMap, LatLng argLocation) {
        //mapCircle = mapView.addCircle(circleOption);
        if (mapCircle != null) {
            mapCircle.remove();
        }
        CircleOptions options = new CircleOptions();
        options.center(argLocation);
        //Radius in meters
        options.radius(1000 * 1);
        options.fillColor(Color.parseColor("#1Aff0000"));
        options.strokeColor(Color.parseColor("#4D0000ff"));
        options.strokeWidth(4);
        mapCircle = argGoogleMap.addCircle(options);
    }

    private String getAddressFromLatLng(LatLng argLatLng) {
        Geocoder geocoder = new Geocoder(activity);
        String address = "";
        try {
            address = geocoder
                    .getFromLocation(argLatLng.latitude, argLatLng.longitude, 1)
                    .get(0).getAddressLine(0);
        } catch (IOException e) {
        }
        return address;
    }
}
//https://stackoverflow.com/questions/27609442/how-to-get-the-sha-1-fingerprint-certificate-in-android-studio-for-debug-mode
/*
CREATE TABLE user_profile
(
    uspro_id BIGINT(20) NOT NULL,
);
CREATE TABLE regi_temp
(

);
column_prefix
column_name
data_type
data_length
column_comment
*/