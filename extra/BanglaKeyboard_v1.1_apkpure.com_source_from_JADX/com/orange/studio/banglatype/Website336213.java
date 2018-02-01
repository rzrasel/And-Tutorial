package com.orange.studio.banglatype;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.C0392a;
import android.support.v4.view.C0664g;
import android.support.v7.app.C0823c.C0822a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.orange.studio.banglatype.AndromoActivity.C1673b;
import com.orange.studio.banglatype.C1722e.C1721b;
import java.lang.reflect.InvocationTargetException;

public class Website336213 extends AndromoActivity {
    private static C1673b f7974q = new C1673b();
    int f7975g = -1;
    WebView f7976h;
    MenuItem f7977i;
    private int f7978j = -1;
    private boolean f7979k = false;
    private boolean f7980l = false;
    private boolean f7981m = false;
    private boolean f7982n = true;
    private Callback f7983o = null;
    private String f7984p = null;

    class C16891 implements DownloadListener {
        final /* synthetic */ Website336213 f7968a;

        C16891(Website336213 website336213) {
            this.f7968a = website336213;
        }

        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            try {
                this.f7968a.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                ak.m7297a(this.f7968a.f7976h.getContext(), str);
            }
        }
    }

    private class C1690a extends WebViewClient {
        String f7969a;
        final /* synthetic */ Website336213 f7970b;

        private C1690a(Website336213 website336213) {
            this.f7970b = website336213;
            this.f7969a = "";
        }

        public final void onLoadResource(WebView webView, String str) {
        }

        public final void onPageFinished(WebView webView, String str) {
            this.f7970b.f7980l = false;
            Website336213 website336213 = this.f7970b;
            if (website336213.f7977i != null) {
                C0664g.m1771a(website336213.f7977i);
            }
            CookieSyncManager.getInstance().sync();
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f7970b.f7980l = true;
            this.f7970b.m7184a();
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return super.shouldInterceptRequest(webView, str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!(str == null || str.equals(""))) {
                Uri parse = Uri.parse(str);
                String str2 = null;
                if (parse != null) {
                    str2 = parse.getScheme();
                }
                if (ak.m7299a(str) && ak.m7300b(this.f7970b, str)) {
                    return true;
                }
                if (str2 != null) {
                    if (str2.equals("tel")) {
                        try {
                            this.f7970b.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
                            this.f7969a = str;
                            return true;
                        } catch (Exception e) {
                            Toast.makeText(this.f7970b.getApplicationContext(), R.string.dialer_not_available, 0).show();
                            return true;
                        }
                    } else if (str2.equals("mailto") || str2.equals("geo") || str2.equals("market")) {
                        try {
                            this.f7970b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            this.f7969a = str;
                            return true;
                        } catch (Exception e2) {
                            webView.loadUrl(str);
                            this.f7969a = str;
                            return true;
                        }
                    } else if (str2.equals("vnd.youtube")) {
                        try {
                            this.f7970b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            this.f7969a = str;
                            return true;
                        } catch (Exception e3) {
                            webView.loadUrl(str);
                            this.f7969a = str;
                            return true;
                        }
                    }
                }
            }
            if (this.f7970b.f7979k) {
                try {
                    if (URLUtil.isAssetUrl(str)) {
                        webView.loadUrl(str);
                        this.f7969a = str;
                        return true;
                    }
                    try {
                        ak.m7297a(webView.getContext(), str);
                        this.f7969a = str;
                        return true;
                    } catch (ActivityNotFoundException e4) {
                        webView.loadUrl(str);
                        this.f7969a = str;
                        return true;
                    }
                } catch (Exception e5) {
                    webView.loadUrl(str);
                    this.f7969a = str;
                    return true;
                }
            } else if (str.equals("file:///android_asset/webkit/")) {
                return false;
            } else {
                if (str.equals("about:blank")) {
                    webView.loadUrl(this.f7969a);
                } else {
                    webView.loadUrl(str);
                    this.f7969a = str;
                }
                return true;
            }
        }
    }

    private class C1693b extends WebChromeClient {
        final /* synthetic */ Website336213 f7973a;

        class C16911 implements OnClickListener {
            final /* synthetic */ C1693b f7971a;

            C16911(C1693b c1693b) {
                this.f7971a = c1693b;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                switch (i) {
                    case -2:
                        this.f7971a.f7973a.f7983o.invoke(this.f7971a.f7973a.f7984p, false, false);
                        return;
                    case -1:
                        ActivityCompat.requestPermissions(this.f7971a.f7973a, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 1);
                        return;
                    default:
                        return;
                }
            }
        }

        class C16922 implements OnCancelListener {
            final /* synthetic */ C1693b f7972a;

            C16922(C1693b c1693b) {
                this.f7972a = c1693b;
            }

            public final void onCancel(DialogInterface dialogInterface) {
                this.f7972a.f7973a.f7983o.invoke(this.f7972a.f7973a.f7984p, false, false);
            }
        }

        private C1693b(Website336213 website336213) {
            this.f7973a = website336213;
        }

        public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(2 * j2);
        }

        public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
            if (!this.f7973a.f7981m) {
                callback.invoke(str, false, false);
            } else if (C0392a.checkSelfPermission(this.f7973a, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                this.f7973a.f7983o = callback;
                this.f7973a.f7984p = str;
                if (ActivityCompat.shouldShowRequestPermissionRationale(this.f7973a, "android.permission.ACCESS_FINE_LOCATION")) {
                    CharSequence string = this.f7973a.getString(R.string.location_permission_request);
                    OnClickListener c16911 = new C16911(this);
                    new C0822a(this.f7973a).m2396b(string).m2390a(c16911).m2395b(c16911).m2389a(new C16922(this)).m2394a().show();
                    return;
                }
                ActivityCompat.requestPermissions(this.f7973a, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 1);
            } else {
                callback.invoke(str, true, false);
            }
        }
    }

    private void m7178a(String str) {
        if (this.f7976h != null) {
            try {
                WebView.class.getMethod(str, new Class[0]).invoke(this.f7976h, new Object[0]);
            } catch (NoSuchMethodException e) {
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
            }
        }
    }

    protected final void m7184a() {
        if (this.f7977i != null) {
            C0664g.m1777b(this.f7977i);
        }
    }

    protected String getActivityTitleForAnalytics() {
        return getString(R.string.Website336213_activity_title);
    }

    protected String getActivityTypeForAnalytics() {
        return "Website";
    }

    protected boolean getHandleCustomWindowColor() {
        return false;
    }

    public String[] getParentClassNamesArray() {
        return getResources().getStringArray(R.array.activity_000_classes);
    }

    protected boolean isDetailActivity() {
        return false;
    }

    protected boolean isParentReachable() {
        return f7974q.m7146a(this, "material");
    }

    protected boolean isToolbarEnabled() {
        return true;
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f7975g == -1) {
            this.f7975g = C1709b.m7361a(this);
        }
        setToolbarTitle((int) R.string.Website336213_activity_title);
        CookieSyncManager.createInstance(this);
        this.f7976h = (WebView) findViewById(R.id.webView1);
        this.f7976h.setWebChromeClient(new C1693b());
        if (this.f7981m) {
            this.f7976h.getSettings().setGeolocationEnabled(true);
        }
        this.f7976h.setWebViewClient(new C1690a());
        this.f7976h.getSettings().setJavaScriptEnabled(true);
        this.f7976h.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f7976h.getSettings().setLightTouchEnabled(true);
        this.f7976h.getSettings().setDatabaseEnabled(true);
        this.f7976h.getSettings().setDatabasePath("/data/data/" + getPackageName() + "/databases/");
        this.f7976h.getSettings().setDomStorageEnabled(true);
        if (VERSION.SDK_INT >= 21) {
            this.f7976h.getSettings().setMixedContentMode(2);
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f7976h, true);
        }
        if (VERSION.SDK_INT > 7) {
            this.f7976h.getSettings().setPluginState(PluginState.ON);
        }
        this.f7976h.getSettings().setBuiltInZoomControls(this.f7982n);
        this.f7976h.getSettings().setDisplayZoomControls(false);
        this.f7976h.getSettings().setSupportZoom(this.f7982n);
        this.f7976h.getSettings().setLoadWithOverviewMode(this.f7982n);
        this.f7976h.getSettings().setUseWideViewPort(this.f7982n);
        this.f7976h.setDownloadListener(new C16891(this));
        String str = "";
        Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra("com.orange.studio.banglatype.NAVIGATION_PAGE");
        }
        if (str != null && !str.equals("")) {
            this.f7976h.loadUrl("file:///android_asset/Website336213" + str);
        } else if (bundle != null) {
            this.f7976h.restoreState(bundle);
        } else {
            this.f7976h.loadUrl(getString(R.string.Website336213_webview_content));
        }
        C1723f.m7463a(this, (LinearLayout) findViewById(R.id.contentAdLayout), C1721b.f8296a);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.webview_options_menu, menu);
        this.f7977i = menu.findItem(R.id.refresh);
        if (this.f7980l) {
            m7184a();
        }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f7976h.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f7976h.goBack();
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.refresh:
                if (this.f7976h != null) {
                    this.f7976h.reload();
                }
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    protected void onPause() {
        super.onPause();
        m7178a("onPause");
        CookieSyncManager.getInstance().stopSync();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        switch (i) {
            case 1:
                if (!(this.f7983o == null || this.f7984p == null)) {
                    boolean z = iArr.length > 0 && iArr[0] == 0;
                    this.f7983o.invoke(this.f7984p, z, false);
                    this.f7983o = null;
                    this.f7984p = null;
                    return;
                }
                break;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    protected void onResume() {
        super.onResume();
        m7178a("onResume");
        CookieSyncManager.getInstance().startSync();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f7976h.saveState(bundle);
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
    }

    protected void setContentView() {
        setContentView((int) R.layout.webview_main);
    }
}
