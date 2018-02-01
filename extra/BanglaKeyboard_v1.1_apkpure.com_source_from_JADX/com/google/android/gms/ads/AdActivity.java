package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.internal.aab;
import com.google.android.gms.internal.aaj;
import com.google.android.gms.internal.aak;
import com.google.android.gms.internal.aoi;
import com.google.android.gms.internal.id;
import com.google.android.gms.p056a.C1401c;

public class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private aoi f3918a;

    private final void m3588a() {
        if (this.f3918a != null) {
            try {
                this.f3918a.zzay();
            } catch (Throwable e) {
                id.m5371a("Could not forward setContentViewSet to ad overlay:", e);
            }
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.f3918a.onActivityResult(i, i2, intent);
        } catch (Throwable e) {
            id.m5371a("Could not forward onActivityResult to ad overlay:", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.f3918a != null) {
                z = this.f3918a.zzmn();
            }
        } catch (Throwable e) {
            id.m5371a("Could not forward onBackPressed to ad overlay:", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f3918a.zzo(C1401c.m3584a((Object) configuration));
        } catch (Throwable e) {
            id.m5371a("Failed to wrap configuration.", e);
        }
    }

    protected void onCreate(Bundle bundle) {
        boolean z = false;
        super.onCreate(bundle);
        aab b = aak.m4023b();
        String str = "com.google.android.gms.ads.internal.overlay.useClientJar";
        Intent intent = getIntent();
        if (intent.hasExtra(str)) {
            z = intent.getBooleanExtra(str, false);
        } else {
            id.m5372a(6);
        }
        this.f3918a = (aoi) aab.m3997a(this, z, new aaj(b, this));
        if (this.f3918a == null) {
            id.m5370a("Could not create ad overlay.");
            finish();
            return;
        }
        try {
            this.f3918a.onCreate(bundle);
        } catch (Throwable e) {
            id.m5371a("Could not forward onCreate to ad overlay:", e);
            finish();
        }
    }

    protected void onDestroy() {
        try {
            if (this.f3918a != null) {
                this.f3918a.onDestroy();
            }
        } catch (Throwable e) {
            id.m5371a("Could not forward onDestroy to ad overlay:", e);
        }
        super.onDestroy();
    }

    protected void onPause() {
        try {
            if (this.f3918a != null) {
                this.f3918a.onPause();
            }
        } catch (Throwable e) {
            id.m5371a("Could not forward onPause to ad overlay:", e);
            finish();
        }
        super.onPause();
    }

    protected void onRestart() {
        super.onRestart();
        try {
            if (this.f3918a != null) {
                this.f3918a.onRestart();
            }
        } catch (Throwable e) {
            id.m5371a("Could not forward onRestart to ad overlay:", e);
            finish();
        }
    }

    protected void onResume() {
        super.onResume();
        try {
            if (this.f3918a != null) {
                this.f3918a.onResume();
            }
        } catch (Throwable e) {
            id.m5371a("Could not forward onResume to ad overlay:", e);
            finish();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f3918a != null) {
                this.f3918a.onSaveInstanceState(bundle);
            }
        } catch (Throwable e) {
            id.m5371a("Could not forward onSaveInstanceState to ad overlay:", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStart() {
        super.onStart();
        try {
            if (this.f3918a != null) {
                this.f3918a.onStart();
            }
        } catch (Throwable e) {
            id.m5371a("Could not forward onStart to ad overlay:", e);
            finish();
        }
    }

    protected void onStop() {
        try {
            if (this.f3918a != null) {
                this.f3918a.onStop();
            }
        } catch (Throwable e) {
            id.m5371a("Could not forward onStop to ad overlay:", e);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        m3588a();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        m3588a();
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m3588a();
    }
}
