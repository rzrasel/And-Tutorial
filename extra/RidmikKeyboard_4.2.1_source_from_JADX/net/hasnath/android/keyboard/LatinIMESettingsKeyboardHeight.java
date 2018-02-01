package net.hasnath.android.keyboard;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import ridmik.keyboard.C0053R;

public class LatinIMESettingsKeyboardHeight extends PreferenceActivity implements OnSharedPreferenceChangeListener, OnDismissListener {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        addPreferencesFromResource(C0053R.xml.prefs_key_height);
    }

    public void onDismiss(DialogInterface dialog) {
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
    }
}
