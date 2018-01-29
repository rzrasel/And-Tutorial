package com.sm.usagesexample;

import android.Manifest;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

public class ActPhoneNumber extends AppCompatActivity {
    private Activity activity;
    private Context context;
    String TAG = "PhoneActivityTAG";
    String wantPermission = Manifest.permission.READ_PHONE_STATE;
    private static final int PERMISSION_REQUEST_CODE = 1;
    public static final int RequestPermissionCode = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_phone_number);
        activity = this;
        context = this;
        new FetchContacts(context).execute();
        /*if (!checkPermission(wantPermission)) {
            requestPermission(wantPermission);
        } else {
            Log.d(TAG, "Phone number: " + getPhone());
        }*/
        if (!checkPermission(Manifest.permission.GET_ACCOUNTS)) {
            //requestPermission(Manifest.permission.GET_ACCOUNTS);
            ActivityCompat.requestPermissions(activity, new String[]
                    {
                            android.Manifest.permission.GET_ACCOUNTS,
                            android.Manifest.permission.READ_PHONE_STATE
                    }, RequestPermissionCode);
        } else {
            new FetchContacts(context).execute();
            Log.d(TAG, "Phone number: " + getPhone());
            GetAccountsName();
        }
    }

    public void GetAccountsName() {
        Account[] account;
        try {
            account = AccountManager.get(context).getAccounts();
            for (Account TempAccount : account) {
                /*if (pattern.matcher(TempAccount.name).matches()) {
                    SampleArrayList.add(TempAccount.name);
                }*/
                System.out.println("TempAccountNAME: " + TempAccount.name);
            }
        } catch (SecurityException e) {
            System.out.println("Exception: " + e);
        }
    }

    private String getPhone() {
        TelephonyManager phoneMgr = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        if (ActivityCompat.checkSelfPermission(activity, wantPermission) != PackageManager.PERMISSION_GRANTED) {
            System.out.println("PackageManager.PERMISSION_GRANTED");
            return "";
        }
        System.out.println("LINENUMBER: " + phoneMgr.getLine1Number());
        return phoneMgr.getLine1Number();
    }

    private void requestPermission(String permission) {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, permission)) {
            Toast.makeText(activity, "Phone state permission allows us to get phone number. Please allow it for additional functionality.", Toast.LENGTH_LONG).show();
        }
        ActivityCompat.requestPermissions(activity, new String[]{permission}, PERMISSION_REQUEST_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_REQUEST_CODE:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Log.d("TAG", "Phone number: " + getPhone());
                } else {
                    Toast.makeText(activity, "Permission Denied. We can't get phone number.", Toast.LENGTH_LONG).show();
                }
                break;
            case RequestPermissionCode:
                if (grantResults.length > 0) {
                    boolean GetAccountPermission = grantResults[0] == PackageManager.PERMISSION_GRANTED;
                    boolean ReadPhoneStatePermission = grantResults[1] == PackageManager.PERMISSION_GRANTED;

                    if (GetAccountPermission && ReadPhoneStatePermission) {
                        Toast.makeText(context, "Permission Granted", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(context, "Permission Denied", Toast.LENGTH_LONG).show();

                    }
                }

                break;
        }
    }

    private boolean checkPermission(String permission) {
        if (Build.VERSION.SDK_INT >= 23) {
            int result = ContextCompat.checkSelfPermission(activity, permission);
            if (result == PackageManager.PERMISSION_GRANTED) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}
//https://www.android-examples.com/get-android-device-primary-registered-email-address-programmatically/
//https://demonuts.com/2017/03/20/get-contact-list-details-android-studio-programmatically/
//http://stackandroid.com/tutorial/how-to-get-all-registered-email-accounts-in-android/
//https://www.pinterest.com/explore/bangla-quotes/