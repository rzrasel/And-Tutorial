package net.hasnath.android.habijabi;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.Toast;
import java.util.List;
import net.hasnath.android.keyboard.AboutActivity;
import net.hasnath.android.keyboard.LatinIME;
import net.hasnath.android.keyboard.LatinIMESettings;
import ridmik.keyboard.C0053R;

public class MainActivity extends Activity {
    private final String ADDON_PACKAGE_NAME = "net.hasnath.android.typebangla";

    class C00231 implements OnClickListener {
        C00231() {
        }

        public void onClick(DialogInterface dialog, int which) {
            MainActivity.this.openLanguageSettings();
        }
    }

    class C00242 implements OnClickListener {
        C00242() {
        }

        public void onClick(DialogInterface dialog, int which) {
            MainActivity.this.finish();
        }
    }

    class C00253 implements OnClickListener {
        C00253() {
        }

        public void onClick(DialogInterface dialog, int which) {
            MainActivity.this.showInputMethodPicker();
            MainActivity.this.finish();
        }
    }

    class C00264 implements OnClickListener {
        C00264() {
        }

        public void onClick(DialogInterface dialog, int which) {
            MainActivity.this.finish();
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isInputMethodDefault() && isInputMethodEnabled() && isAddonInstalled()) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("net.hasnath.android.typebangla", "air.net.hasnath.android.typebangla.AppEntry"));
            startActivity(intent);
            finish();
            return;
        }
        setContentView(C0053R.layout.main);
        ((WebView) findViewById(C0053R.id.mainpagewebview)).loadUrl("file:///android_asset/www/keymapviewformain.html");
    }

    public void addonDownloadClick(View v) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=net.hasnath.android.typebangla")));
    }

    public void onResume() {
        super.onResume();
        if (!isInputMethodEnabled()) {
            enableDialog().show();
        } else if (!isInputMethodDefault()) {
            makeDefaultDialog().show();
        }
    }

    public void openLanguageSettings() {
        startActivity(new Intent("android.settings.INPUT_METHOD_SETTINGS"));
    }

    public void showInputMethodPicker() {
        InputMethodManager imeManager = (InputMethodManager) getSystemService("input_method");
        if (imeManager != null) {
            imeManager.showInputMethodPicker();
        } else {
            Toast.makeText(getApplicationContext(), "Error!", 1).show();
        }
    }

    private boolean isInputMethodEnabled() {
        List<InputMethodInfo> mInputMethodProperties = ((InputMethodManager) getSystemService("input_method")).getEnabledInputMethodList();
        ComponentName myInputMethod = new ComponentName(getBaseContext(), LatinIME.class);
        for (InputMethodInfo ifo : mInputMethodProperties) {
            if (ifo.getComponent().equals(myInputMethod)) {
                return true;
            }
        }
        return false;
    }

    private boolean isInputMethodDefault() {
        return new ComponentName(getBaseContext(), LatinIME.class).equals(ComponentName.unflattenFromString(Secure.getString(getBaseContext().getContentResolver(), "default_input_method")));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0053R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case C0053R.id.tutorialmain:
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), WebViewActivity.class);
                intent.setFlags(268435456);
                intent.putExtra("filename", "phonetictyping.html");
                intent.putExtra("title", "Phonetic Tutorila");
                startActivity(intent);
                break;
            case C0053R.id.findonfacebook:
                Intent fa = new Intent("android.intent.action.VIEW");
                fa.setData(Uri.parse("http://facebook.com/RidmikLab"));
                startActivity(fa);
                break;
            case C0053R.id.ratemain:
                Intent marketIntent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=net.hasnath.android.keyboard"));
                marketIntent.addFlags(1074266112);
                startActivity(marketIntent);
                break;
            case C0053R.id.settingsmain:
                Intent ino = new Intent();
                ino.setClass(getApplicationContext(), LatinIMESettings.class);
                ino.setFlags(268435456);
                startActivity(ino);
                break;
            case C0053R.id.aboutmain:
                Intent in = new Intent(getApplicationContext(), AboutActivity.class);
                in.setFlags(268435456);
                startActivity(in);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private Dialog enableDialog() {
        return new Builder(this).setIcon(C0053R.drawable.ridmikand).setMessage("\nYou need to Enable Ridmik Keyboard first. Please click OK to go to your phone's keyboard settings then tick the box right beside Ridmik Keyboard\n").setTitle("Enable Ridmik Keyboard").setPositiveButton("OK", new C00231()).setNegativeButton("Cancel", new C00242()).create();
    }

    private Dialog makeDefaultDialog() {
        return new Builder(this).setIcon(C0053R.drawable.ridmik_logo).setMessage("\nYou need to set Ridmik Keyboard as the default keyboard of your device. Please click OK and then select Ridmik Keyboard from the list\n").setTitle("Set as Default").setPositiveButton("OK", new C00253()).setNegativeButton("Cancel", new C00264()).create();
    }

    private boolean isAddonInstalled() {
        boolean app_installed;
        try {
            getPackageManager().getPackageInfo("net.hasnath.android.typebangla", 1);
            app_installed = true;
        } catch (NameNotFoundException e) {
            app_installed = false;
        }
        if (!app_installed) {
            return app_installed;
        }
        try {
            if (getPackageManager().getPackageInfo("net.hasnath.android.typebangla", 0).versionCode <= 2) {
                return false;
            }
            return app_installed;
        } catch (NameNotFoundException e2) {
            return false;
        }
    }
}
