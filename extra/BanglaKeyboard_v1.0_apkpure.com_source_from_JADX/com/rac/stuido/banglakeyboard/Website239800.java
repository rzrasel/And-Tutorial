package com.rac.stuido.banglakeyboard;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.actionbarsherlock.C0126R;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import java.lang.reflect.InvocationTargetException;

public class Website239800 extends SherlockActivity {
    private static C0569d f2558i = new C0569d();
    int f2559a = -1;
    WebView f2560b;
    private int f2561c = -1;
    private boolean f2562d = false;
    private MenuItem f2563e;
    private boolean f2564f = false;
    private boolean f2565g = false;
    private boolean f2566h = true;

    private void m3851a(String str) {
        if (this.f2560b != null) {
            try {
                WebView.class.getMethod(str, new Class[0]).invoke(this.f2560b, new Object[0]);
            } catch (NoSuchMethodException e) {
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
            }
        }
    }

    protected final void m3855a() {
        if (this.f2563e != null) {
            this.f2563e.setActionView((int) C0126R.layout.actionbar_indeterminate_progress);
        }
    }

    protected final void m3856b() {
        if (this.f2563e != null) {
            this.f2563e.setActionView(null);
        }
    }

    public void onBackPressed() {
        C0588y.m4065d(this);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.layout.website239800);
        if (this.f2559a == -1) {
            this.f2559a = C0566b.m3930a((Context) this);
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C0566b.m3935a(supportActionBar, false, f2558i.m4014a(this, "list"));
            C0566b.m3939b(supportActionBar, this.f2559a);
        }
        CookieSyncManager.createInstance(this);
        this.f2560b = (WebView) findViewById(C0126R.id.webView1);
        this.f2560b.setWebChromeClient(new cg());
        if (this.f2565g) {
            this.f2560b.getSettings().setGeolocationEnabled(true);
        }
        this.f2560b.setWebViewClient(new cf());
        this.f2560b.getSettings().setJavaScriptEnabled(true);
        this.f2560b.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f2560b.getSettings().setLightTouchEnabled(true);
        this.f2560b.getSettings().setDatabaseEnabled(true);
        this.f2560b.getSettings().setDatabasePath("/data/data/" + getPackageName() + "/databases/");
        this.f2560b.getSettings().setDomStorageEnabled(true);
        if (VERSION.SDK_INT > 7) {
            this.f2560b.getSettings().setPluginState(PluginState.ON);
        }
        this.f2560b.getSettings().setBuiltInZoomControls(this.f2566h);
        this.f2560b.getSettings().setSupportZoom(this.f2566h);
        this.f2560b.getSettings().setLoadWithOverviewMode(this.f2566h);
        this.f2560b.getSettings().setUseWideViewPort(this.f2566h);
        this.f2560b.setDownloadListener(new ce(this));
        String str = "";
        Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra("com.rac.stuido.banglakeyboard.NAVIGATION_PAGE");
        }
        if (str != null && !str.equals("")) {
            this.f2560b.loadUrl("file:///android_asset/Website239800" + str);
        } else if (bundle != null) {
            this.f2560b.restoreState(bundle);
        } else {
            this.f2560b.loadUrl(getString(C0126R.string.Website239800_webview_content));
        }
        C0588y.m4059a(this, (LinearLayout) findViewById(C0126R.id.contentLayout), C0586w.NONE);
        C0583s.m4048a(this);
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case 0:
                return C0564a.m3857a(this);
            default:
                return super.onCreateDialog(i);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater supportMenuInflater = getSupportMenuInflater();
        supportMenuInflater.inflate(C0126R.menu.webview_options_menu, menu);
        supportMenuInflater.inflate(C0126R.menu.default_options_menu, menu);
        this.f2563e = menu.findItem(C0126R.id.refresh);
        if (this.f2564f) {
            m3855a();
        }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        C0588y.m4063c(this);
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f2560b.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f2560b.goBack();
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0126R.id.refresh:
                if (this.f2560b == null) {
                    return true;
                }
                this.f2560b.reload();
                return true;
            default:
                return C0566b.m3937a((Activity) this, menuItem) || super.onOptionsItemSelected(menuItem);
        }
    }

    protected void onPause() {
        C0588y.m4064d();
        C0588y.m4057a(this);
        super.onPause();
        m3851a("onPause");
        CookieSyncManager.getInstance().stopSync();
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        super.onPrepareDialog(i, dialog);
    }

    protected void onResume() {
        super.onResume();
        m3851a("onResume");
        CookieSyncManager.getInstance().startSync();
        C0588y.m4061b(this);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        this.f2560b.saveState(bundle);
    }

    protected void onStart() {
        super.onStart();
        C0588y.m4067e(this);
        C0566b.m3934a(getSupportActionBar(), this.f2559a);
    }

    protected void onStop() {
        super.onStop();
        C0588y.m4062c();
    }
}
