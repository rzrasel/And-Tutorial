package com.sm.usagesexample.gomap;

import android.content.res.Resources;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.sm.usagesexample.ActGoogleMapFragment;

/**
 * Created by Rz Rasel on 2018-01-24.
 */

public class GoogleMapReadyCallback implements OnMapReadyCallback {
    private GoogleMap googleMap;
    private MapType mapType = MapType.MAP_TYPE_NONE;
    private LatLng mapLatLng;
    private OnEventListenerHandler onEventListenerHandler;
    private boolean isStartToAnimateMap = false;

    public GoogleMapReadyCallback setMapLatLng(LatLng argLatLng) {
        mapLatLng = argLatLng;
        return this;
    }

    public GoogleMapReadyCallback isStartToAnimateMap(boolean argIsStartToAnimateMap) {
        isStartToAnimateMap = argIsStartToAnimateMap;
        return this;
    }

    public GoogleMapReadyCallback setMapType(MapType argMapType) {
        mapType = argMapType;
        return this;
    }

    public GoogleMapReadyCallback getMap(OnEventListenerHandler argOnEventListenerHandler) {
        onEventListenerHandler = argOnEventListenerHandler;
        return this;
    }

    @Override
    public void onMapReady(GoogleMap argGoogleMap) {
        try {
            // Customise the styling of the base map using a JSON object defined
            // in a raw resource file.
            boolean success = false;
            //success = argGoogleMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(context, R.raw.google_map_style_json));

            if (!success) {
                System.out.println("DEBUG_TAG_STYLE: Style parsing failed.");
            }
        } catch (Resources.NotFoundException e) {
            System.out.println("DEBUG_TAG_ERROR: Can't find style. Error: " + e);
        }
            /* // Position the map's camera near Sydney, Australia.
            argGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(23.6850, 90.3563)));*/
        //argGoogleMap.addMarker(new MarkerOptions().position(latLngDhaka).title("Marker in Dhaka"));
        //argGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(latLngDhaka));
        CameraPosition cameraPosition = null;
        if (mapLatLng != null) {
            cameraPosition = CameraPosition.builder()
                    .target(mapLatLng)
                    .zoom(13f)
                    .bearing(0.0f)
                    .tilt(0.0f)
                    .build();
        }
        if (cameraPosition != null) {
            if (isStartToAnimateMap) {
                argGoogleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), null);
            } else {
                argGoogleMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
            }
        }


        argGoogleMap.setMapType(mapType.getValue());
        argGoogleMap.setTrafficEnabled(true);
        //argGoogleMap.setMyLocationEnabled(true);
        argGoogleMap.getUiSettings().setZoomControlsEnabled(true);
        //onDrawCircle(argGoogleMap, latLngDhaka);
        //argGoogleMap.getUiSettings().setZoomControlsEnabled(true);
        argGoogleMap.getUiSettings().setCompassEnabled(true);
        argGoogleMap.getUiSettings().setMyLocationButtonEnabled(true);
        argGoogleMap.getUiSettings().setMapToolbarEnabled(true);
        argGoogleMap.getUiSettings().setZoomGesturesEnabled(true);
        argGoogleMap.getUiSettings().setScrollGesturesEnabled(true);
        argGoogleMap.getUiSettings().setTiltGesturesEnabled(true);
        argGoogleMap.getUiSettings().setRotateGesturesEnabled(true);
        googleMap = argGoogleMap;
        if (onEventListenerHandler != null) {
            onEventListenerHandler.onMapReady(argGoogleMap);
        }

    }

    public interface OnEventListenerHandler {
        public void onMapReady(GoogleMap argGoogleMap);
    }

    public enum MapType {
        MAP_TYPE_NONE(0),
        MAP_TYPE_NORMAL(1),
        MAP_TYPE_SATELLITE(2),
        MAP_TYPE_TERRAIN(3),
        MAP_TYPE_HYBRID(4);
        private final int mapType;

        MapType(int argMapType) {
            this.mapType = argMapType;
        }

        public int getValue() {
            return this.mapType;
        }
    }
}
