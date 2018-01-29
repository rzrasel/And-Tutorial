package com.sm.usagesexample;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActSplash extends AppCompatActivity {
    private Activity activity;
    private Context context;
    private final int PERMISSIONS_REQUEST_CODE = 1001;
    private ManifestPermission manifestPermission;

    //AIzaSyC-KV1pjG1EsAonFoxglIb4H0sqos4BIbk
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_splash);
        activity = this;
        context = this;
        startActivity(new Intent(context, ActPhoneNumber.class));
        finish();
        //turnGPSOn();
        manifestPermission = new ManifestPermission(activity, context, PERMISSIONS_REQUEST_CODE);
        /*manifestPermission.onPermission.onAddPermission(ManifestPermission.PERMISSION.FINE_LOCATION)
                .onAddPermission(ManifestPermission.PERMISSION.READ_CONTACTS);*/
        manifestPermission.onPermission.onAddPermission(ManifestPermission.PERMISSION.RECEIVE_SMS)
                .onAddPermission(ManifestPermission.PERMISSION.READ_EXTERNAL_STORAGE);
        if (!manifestPermission.onCheckPermission()) {
            manifestPermission.onRequestPermission();
        }
        //manifestPermission.onCheckPermission(Manifest.permission.READ_EXTERNAL_STORAGE);
        if (!CheckLocationEnabled.isGPSEnabled(this)) {
            /*int REQUEST_CODE = 1001;
            Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            startActivityForResult(intent, REQUEST_CODE);*/
        }
        //Intent intent = new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS);
        /*Intent intent = new Intent(android.provider.Settings.ACTION_WIFI_SETTINGS);
        startActivity(intent);*/
        int PERMISSIONS_REQUEST = 1001;

        /*if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.READ_EXTERNAL_STORAGE)) {

        } else {
            try {
                ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, PERMISSIONS_REQUEST);
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }*/
        /*try {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, PERMISSIONS_REQUEST);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }*/

    }

    private void turnGPSOn() {

        String provider = android.provider.Settings.Secure.getString(getContentResolver(), android.provider.Settings.Secure.LOCATION_PROVIDERS_ALLOWED);
        if (!provider.contains("gps")) {
            final Intent poke = new Intent();
            poke.setClassName("com.android.settings", "com.android.settings.widget.SettingsAppWidgetProvider");
            poke.addCategory(Intent.CATEGORY_ALTERNATIVE);
            poke.setData(Uri.parse("3"));
            sendBroadcast(poke);
        }
    }

    @Override
    public void onRequestPermissionsResult(int argRequestCode, String argPermissions[], int[] argGrantResults) {
        switch (argRequestCode) {
            case PERMISSIONS_REQUEST_CODE:
                if (!manifestPermission.onCheckPermission()) {
                    //manifestPermission.onRequestPermission();
                    finish();
                }
                break;
            default:
                super.onRequestPermissionsResult(argRequestCode, argPermissions, argGrantResults);
        }
    }
}
