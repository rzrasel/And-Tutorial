package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class PreviewActivity extends Activity {
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            C0535t.m3733c();
            Uri data = getIntent().getData();
            if (!C0525j.m3717a((Context) this).m3719a(data)) {
                CharSequence charSequence = "Cannot preview the app with the uri: " + data + ". Launching current version instead.";
                C0535t.m3731a(charSequence);
                AlertDialog create = new Builder(this).create();
                create.setTitle("Preview failure");
                create.setMessage(charSequence);
                create.setButton(-1, "Continue", new C0524i(this));
                create.show();
            }
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            if (launchIntentForPackage != null) {
                "Invoke the launch activity for package name: " + getPackageName();
                C0535t.m3733c();
                startActivity(launchIntentForPackage);
                return;
            }
            "No launch activity found for package name: " + getPackageName();
            C0535t.m3733c();
        } catch (Exception e) {
            "Calling preview threw an exception: " + e.getMessage();
            C0535t.m3730a();
        }
    }
}
