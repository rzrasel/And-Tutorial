package com.sm.usagesexample;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceBuffer;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.sm.usagesexample.gomap.PlaceArrayAdapter;
import com.sm.usagesexample.gomap.GoogleMapReadyCallback;
import com.google.android.gms.common.api.ResultCallback;

public class ActAutoComplete extends AppCompatActivity implements
        GoogleApiClient.OnConnectionFailedListener,
        GoogleApiClient.ConnectionCallbacks, LocationListener {
    private Activity activity;
    private Context context;
    private GoogleMap googleMap;
    private CleanableAutoCompleteTextView sysAutoCompleteTextView;
    private PlaceArrayAdapter placeArrayAdapter;
    //private static final LatLngBounds BOUNDS_MOUNTAIN_VIEW = new LatLngBounds(new LatLng(37.398160, -122.180831), new LatLng(37.430610, -121.972090));
    private static final LatLngBounds BOUNDS_MOUNTAIN_VIEW = new LatLngBounds(new LatLng(20.86382, 88.15638), new LatLng(26.33338, 92.30153));
    private GoogleApiClient googleApiClient;
    private LocationRequest mLocationRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_auto_complete);
        activity = this;
        context = this;
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.sysFragGoogleMap);
        GoogleMapReadyCallback mapReadyCallback = new GoogleMapReadyCallback();
        mapReadyCallback.setMapLatLng(new LatLng(23.6850, 90.3563))
                .isStartToAnimateMap(true)
                .setMapType(GoogleMapReadyCallback.MapType.MAP_TYPE_NORMAL)
                .getMap(new GoogleMapReadyCallback.OnEventListenerHandler() {
                    @Override
                    public void onMapReady(GoogleMap argGoogleMap) {
                        googleMap = argGoogleMap;
                    }
                });
        mapFragment.getMapAsync(mapReadyCallback);
        sysAutoCompleteTextView = (CleanableAutoCompleteTextView) findViewById(R.id.sysAutoCompleteTextView);
        sysAutoCompleteTextView.setThreshold(2);
        sysAutoCompleteTextView.setOnItemClickListener(mAutocompleteClickListener);
        placeArrayAdapter = new PlaceArrayAdapter(this, android.R.layout.simple_list_item_1, BOUNDS_MOUNTAIN_VIEW, null);
        sysAutoCompleteTextView.setAdapter(placeArrayAdapter);
        buildGoogleApiClient();
    }

    @Override
    public void onStart() {
        super.onStart();
        if (googleApiClient != null) {
            this.googleApiClient.connect();
        }
    }

    private AdapterView.OnItemClickListener mAutocompleteClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            final PlaceArrayAdapter.PlaceAutocomplete item = placeArrayAdapter.getItem(position);
            final String placeId = String.valueOf(item.placeId);
            //Log.i(LOG_TAG, "Selected: " + item.description);
            PendingResult<PlaceBuffer> placeResult = Places.GeoDataApi.getPlaceById(googleApiClient, placeId);
            placeResult.setResultCallback(mUpdatePlaceDetailsCallback);
            //Log.i(LOG_TAG, "Fetching details for ID: " + item.placeId);
        }
    };

    private ResultCallback<PlaceBuffer> mUpdatePlaceDetailsCallback
            = new ResultCallback<PlaceBuffer>() {
        @Override
        public void onResult(PlaceBuffer places) {
            if (!places.getStatus().isSuccess()) {
                //Log.e(LOG_TAG, "Place query did not complete. Error: " + places.getStatus().toString());
                return;
            }
            // Selecting the first object buffer.
            final Place place = places.get(0);
            CharSequence attributions = places.getAttributions();

            /*mNameTextView.setText(Html.fromHtml(place.getName() + ""));
            mAddressTextView.setText(Html.fromHtml(place.getAddress() + ""));
            mIdTextView.setText(Html.fromHtml(place.getId() + ""));
            mPhoneTextView.setText(Html.fromHtml(place.getPhoneNumber() + ""));
            mWebTextView.setText(place.getWebsiteUri() + "");
            if (attributions != null) {
                mAttTextView.setText(Html.fromHtml(attributions.toString()));
            }*/
        }
    };

    @Override
    public void onConnected(Bundle bundle) {
        placeArrayAdapter.setGoogleApiClient(googleApiClient);
        Log.i("LOG_TAG", "Google Places API connected.");
    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {
        Log.e("LOG_TAG", "Google Places API connection failed with error code: " + connectionResult.getErrorCode());

        Toast.makeText(context, "Google Places API connection failed with error code:" + connectionResult.getErrorCode(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onConnectionSuspended(int i) {
        mLocationRequest = new LocationRequest();
        mLocationRequest.setInterval(1000);
        mLocationRequest.setFastestInterval(1000);
        mLocationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            System.out.println("ACCESS_FINE_LOCATION");
            //return;
        }
        LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, mLocationRequest, this);
        placeArrayAdapter.setGoogleApiClient(null);
        Log.e("LOG_TAG", "Google Places API connection suspended.");
    }

    public synchronized void buildGoogleApiClient() {
        /*googleApiClient = new GoogleApiClient.Builder(getBaseContext())
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build();*/
        googleApiClient = new GoogleApiClient.Builder(this)
                .addApi(Places.GEO_DATA_API)
                .addApi(Places.PLACE_DETECTION_API)
                .addApi(LocationServices.API)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .build();
        googleApiClient.connect();
    }

    /*@Override
    public void onConnected(@Nullable Bundle bundle) {
        Log.d("TAG", "Connection established. Fetching location ..");
        mLocationRequest = new LocationRequest();
        mLocationRequest.setInterval(1000);
        mLocationRequest.setFastestInterval(1000);
        mLocationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);

        LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, mLocationRequest, this);
    }*/

    @Override
    public void onLocationChanged(Location location) {

        //Log.d("Lat: " + location.getLatitude() + "Lng : " + location.getLongitude());
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
    }

    @Override
    public void onPause() {
        super.onPause();
        //stop location updates when Activity is no longer active
        if (googleApiClient != null) {
            //LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, this);
        }
    }
}
/*
Android AutoCompleteTextView using Adapter with custom filter
http://www.apnatutorials.com/android/autocompletetextview-custom-array-adapter-with-custom-filter.php?categoryId=2
Android AutoCompleteTextView Custom Layout and Adapter
http://www.zoftino.com/android-autocompletetextview-custom-layout-and-adapter
http://wptrafficanalyzer.in/blog/customizing-autocompletetextview-to-display-images-and-text-in-the-suggestion-list-using-simpleadapter-in-android/



*/