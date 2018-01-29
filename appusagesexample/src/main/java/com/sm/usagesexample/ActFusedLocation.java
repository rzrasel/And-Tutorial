package com.sm.usagesexample;

import android.Manifest;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import java.util.ArrayList;
import java.util.List;

public class ActFusedLocation extends AppCompatActivity {
    private Activity activity;
    private Context context;
    private GoogleApiClient googleApiClient;
    private LocationRequest locationRequest;
    private Location location;
    private final static int REQUEST_FINE_LOCATION = 1111;
    private final static int CONNECTION_FAILURE_RESOLUTION_REQUEST = 9000;
    private int PRIORITY = LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY;

    private Double mLatitude, mLongitude;
    private FusedLocationProviderClient providerClient;

    //protected Location location;
    private int GMAIL_ACCOUNT = 0;
    private int ALL_ACCOUNTS = 1;
    private int emailType;
    private LinearLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_fused_location);
        activity = this;
        context = this;
        providerClient = LocationServices.getFusedLocationProviderClient(this);
        /*buildGoogleApiClient();
        locationRequest = LocationRequest.create()
                .setPriority(PRIORITY)
                .setInterval(10 * 1000)        // 10 seconds, in milliseconds
                .setFastestInterval(1 * 1000); // 1 second, in milliseconds
        new FusedLocListener();
        createLocationRequest();
        getLastKnownLocation();
        //Location, Account*/
        //handler.postDelayed(runnable, 1000);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(activity);
        if (acct != null) {
            String personName = acct.getDisplayName();
            String personGivenName = acct.getGivenName();
            String personFamilyName = acct.getFamilyName();
            String personEmail = acct.getEmail();
            String personId = acct.getId();
            Uri personPhoto = acct.getPhotoUrl();
            System.out.println("Email: " + personEmail);
        } else {
            System.out.println("Email NULL");
        }
        emailType = GMAIL_ACCOUNT;
        AccountManager accountManager = AccountManager.get(context);
        Account[] accounts = accountManager.getAccountsByType(GoogleAuthUtil.GOOGLE_ACCOUNT_TYPE);
        for (int i = 0; i < accounts.length; i++) {
            /*if (accounts[i].name.endsWith(CHROMIUM_EMAIL)) {
                chromiumAccount = accounts[i];
            }*/
            System.out.println("Account Type: " + accounts[i].type + "\nEmail: " + accounts[i].name);
        }
        if (accounts.length <= 0) {
            System.out.println("Account Type: NULL");
        }
    }

    private void getEmails() {
        new AsyncTask<Void, Void, List<EmailAccount>>() {
            private ProgressDialog pDialog;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                pDialog = new ProgressDialog(context);
                pDialog.setMessage("Reading email accounts");
                pDialog.show();
            }

            @Override
            protected List<EmailAccount> doInBackground(Void... params) {
                Account[] accounts;
                if (emailType == GMAIL_ACCOUNT) {
                    // Fetch only gmail ids
                    accounts = AccountManager.get(context).getAccountsByType("com.google");
                } else {
                    // Fetch all emails (including gmail)
                    accounts = AccountManager.get(context).getAccounts();
                }
                List<EmailAccount> emails = new ArrayList<EmailAccount>();
                try {
                    for (Account account : accounts) {
                        emails.add(new EmailAccount(account.name, account.type));
                    }
                } catch (Exception e) {
                    Log.i("Exception", "Exception:" + e);
                }
                return emails;
            }

            @Override
            protected void onPostExecute(List<EmailAccount> result) {
                super.onPostExecute(result);
                populateResults(result);
                pDialog.cancel();
            }
        }.execute();
    }

    protected void populateResults(List<EmailAccount> result) {
        // Remove all clid views
        //rootLayout.removeAllViews();
        TextView tv;
        // If no email is registered, display this message
        if (result.size() < 1) {
            /*tv = new TextView(this);
            tv.setLayoutParams(new LinearLayout.LayoutParams(android.view.ViewGroup.LayoutParams.MATCH_PARENT, android.view.ViewGroup.LayoutParams.WRAP_CONTENT));
            tv.setText("No accounts registered");
            tv.setTextColor(Color.BLUE);
            rootLayout.addView(tv);*/
            System.out.println("No accounts registered");
            return;
        }
        // Iterate through results and display
        int i = 0;
        for (EmailAccount account : result) {
            /*tv = new TextView(this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(android.view.ViewGroup.LayoutParams.MATCH_PARENT, android.view.ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(0, 5, 0, 0);
            tv.setLayoutParams(params);
            tv.setTextSize(15);
            if (i++ % 2 == 1) tv.setBackgroundColor(Color.parseColor("#81BEF7"));
            if (emailType == GMAIL_ACCOUNT) tv.setText("Email: " + account.name);
            else tv.setText("Account Type: " + account.type + "\nEmail: " + account.name);
            rootLayout.addView(tv);*/
            System.out.println("Account Type: " + account.type + "\nEmail: " + account.name);
        }
    }

    private class EmailAccount {
        public String name;
        public String type;

        EmailAccount(String name, String type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public String toString() {
            return "[name :" + name + ", type:" + type + "]";
        }
    }

    private Handler handler = new Handler();

    private Runnable runnable = new Runnable() {
        public void run() {
            getLocation();
            handler.postDelayed(this, 1000);
        }
    };

    @Override
    protected void onStart() {
        super.onStart();
        getLocation();
    }

    private void getLocation() {
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        providerClient.getLastLocation()
                .addOnCompleteListener(this, new OnCompleteListener<Location>() {
                    @Override
                    public void onComplete(@NonNull Task<Location> task) {
                        if (task.isSuccessful() && task.getResult() != null) {
                            location = task.getResult();
                            mLatitude = location.getLatitude();
                            mLongitude = location.getLongitude();
                            System.out.println("addOnCompleteListener: " + mLatitude + " - " + mLongitude);
                        } else {
                            System.out.println("addOnCompleteListener: null");
                        }
                    }
                })
                .addOnSuccessListener(this, new OnSuccessListener<Location>() {
                    @Override
                    public void onSuccess(Location location) {
                        if (location != null) {
                            mLatitude = location.getLatitude();
                            mLongitude = location.getLongitude();
                            System.out.println("addOnSuccessListener: " + mLatitude + " - " + mLongitude);
                        } else {
                            System.out.println("addOnSuccessListener: null");
                        }
                    }
                });
    }

    protected void createLocationRequest() {
        locationRequest = new LocationRequest();

        // Sets the desired interval for active location updates. This interval is
        // inexact. You may not receive updates at all if no location sources are available, or
        // you may receive them slower than requested. You may also receive updates faster than
        // requested if other applications are requesting location at a faster interval.
        locationRequest.setInterval(10 * 1000);

        // Sets the fastest rate for active location updates. This interval is exact, and your
        // application will never receive updates faster than this value.
        locationRequest.setFastestInterval(1 * 1000);

        locationRequest.setPriority(PRIORITY);
    }

    public void getLastKnownLocation() {
        chooseNetworkGps();
        buildGoogleApiClient();
        if (canGetLocation())
            googleApiClient.connect();
    }

    protected synchronized void buildGoogleApiClient() {
        logPrint("Building GoogleApiClient");
        googleApiClient = new GoogleApiClient.Builder(context)
                .addApi(Places.GEO_DATA_API)
                .addApi(Places.PLACE_DETECTION_API)
                .addApi(LocationServices.API)
                .addConnectionCallbacks(new GoApiConnectionCallbacks())
                .addOnConnectionFailedListener(new GoApiConnectionFailedListener())
                .build();
        googleApiClient.connect();
        //createLocationRequest();
    }

    private class GoApiConnectionCallbacks implements GoogleApiClient.ConnectionCallbacks {
        @Override
        public void onConnected(@Nullable Bundle argBundle) {
            if (!checkPermissions()) {
                requestPermissions();
                logPrint("PERMISSION NEEDED: Manifest.permission.ACCESS_FINE_LOCATION");
                return;
            } else {
                if (ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                }
                location = LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
            }
            /*if (location == null) {
                LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, mLocationRequest, this);
            } else {
                //handleNewLocation(location);
            }*/
            logPrint("Location services connected.");
            if (location != null) {
                logPrint("Location_ONSERV: " + location.getLatitude() + ", " + location.getLongitude());
            }
        }

        @Override
        public void onConnectionSuspended(int argId) {
            logPrint("Location services suspended. Please reconnect.");
        }
    }

    private class GoApiConnectionFailedListener implements GoogleApiClient.OnConnectionFailedListener {
        @Override
        public void onConnectionFailed(@NonNull ConnectionResult argConnectionResult) {
            if (argConnectionResult.hasResolution()) {
                try {
                    argConnectionResult.startResolutionForResult(activity, CONNECTION_FAILURE_RESOLUTION_REQUEST);
                } catch (IntentSender.SendIntentException e) {
                    //e.printStackTrace();
                    logPrint("Connection faild: " + e.getMessage());
                }
            } else {
                logPrint("Location services connection failed with code " + argConnectionResult.getErrorCode());
            }
        }
    }

    private class FusedLocListener implements LocationListener {
        @Override
        public void onLocationChanged(Location argLocation) {
            logPrint("Location: " + location.getLatitude() + ", " + location.getLongitude());
        }
    }

    public boolean canGetLocation() {
        return isNetworkEnabled() || isGPSEnabled();
    }

    public boolean isNetworkEnabled() {
        return ((LocationManager) context.getSystemService(Context.LOCATION_SERVICE)).isProviderEnabled(LocationManager.NETWORK_PROVIDER);
    }

    public boolean isGPSEnabled() {
        return ((LocationManager) context.getSystemService(Context.LOCATION_SERVICE)).isProviderEnabled(LocationManager.GPS_PROVIDER);
    }

    private void chooseNetworkGps() {
        if (isGPSEnabled()) {
            PRIORITY = LocationRequest.PRIORITY_HIGH_ACCURACY;
        } else if (isNetworkEnabled()) {
            PRIORITY = LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY;
        } else {
            PRIORITY = LocationRequest.PRIORITY_NO_POWER;
        }
    }

    private boolean checkPermissions() {
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            requestPermissions();
            return false;
        }
    }

    private void requestPermissions() {
        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                REQUEST_FINE_LOCATION);
    }

    public void logPrint(String argMessage) {
        System.out.println("DEBUG_LOG_PRINT: " + argMessage);
    }
}