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

public class Website336212 extends AndromoActivity {
    private static C1673b f7957q = new C1673b();
    int f7958g = -1;
    WebView f7959h;
    MenuItem f7960i;
    private int f7961j = -1;
    private boolean f7962k = false;
    private boolean f7963l = false;
    private boolean f7964m = false;
    private boolean f7965n = true;
    private Callback f7966o = null;
    private String f7967p = null;

    class C16841 implements DownloadListener {
        final /* synthetic */ Website336212 f7951a;

        C16841(Website336212 website336212) {
            this.f7951a = website336212;
        }

        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            try {
                this.f7951a.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                ak.m7297a(this.f7951a.f7959h.getContext(), str);
            }
        }
    }

    private class C1685a extends WebViewClient {
        String f7952a;
        final /* synthetic */ Website336212 f7953b;

        private C1685a(Website336212 website336212) {
            this.f7953b = website336212;
            this.f7952a = "";
        }

        public final void onLoadResource(WebView webView, String str) {
        }

        public final void onPageFinished(WebView webView, String str) {
            this.f7953b.f7963l = false;
            Website336212 website336212 = this.f7953b;
            if (website336212.f7960i != null) {
                C0664g.m1771a(website336212.f7960i);
            }
            CookieSyncManager.getInstance().sync();
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f7953b.f7963l = true;
            this.f7953b.m7175a();
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
                if (ak.m7299a(str) && ak.m7300b(this.f7953b, str)) {
                    return true;
                }
                if (str2 != null) {
                    if (str2.equals("tel")) {
                        try {
                            this.f7953b.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
                            this.f7952a = str;
                            return true;
                        } catch (Exception e) {
                            Toast.makeText(this.f7953b.getApplicationContext(), R.string.dialer_not_available, 0).show();
                            return true;
                        }
                    } else if (str2.equals("mailto") || str2.equals("geo") || str2.equals("market")) {
                        try {
                            this.f7953b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            this.f7952a = str;
                            return true;
                        } catch (Exception e2) {
                            webView.loadUrl(str);
                            this.f7952a = str;
                            return true;
                        }
                    } else if (str2.equals("vnd.youtube")) {
                        try {
                            this.f7953b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            this.f7952a = str;
                            return true;
                        } catch (Exception e3) {
                            webView.loadUrl(str);
                            this.f7952a = str;
                            return true;
                        }
                    }
                }
            }
            if (this.f7953b.f7962k) {
                try {
                    if (URLUtil.isAssetUrl(str)) {
                        webView.loadUrl(str);
                        this.f7952a = str;
                        return true;
                    }
                    try {
                        ak.m7297a(webView.getContext(), str);
                        this.f7952a = str;
                        return true;
                    } catch (ActivityNotFoundException e4) {
                        webView.loadUrl(str);
                        this.f7952a = str;
                        return true;
                    }
                } catch (Exception e5) {
                    webView.loadUrl(str);
                    this.f7952a = str;
                    return true;
                }
            } else if (str.equals("file:///android_asset/webkit/")) {
                return false;
            } else {
                if (str.equals("about:blank")) {
                    webView.loadUrl(this.f7952a);
                } else {
                    webView.loadUrl(str);
                    this.f7952a = str;
                }
                return true;
            }
        }
    }

    private class C1688b extends WebChromeClient {
        final /* synthetic */ Website336212 f7956a;

        class C16861 implements OnClickListener {
            final /* synthetic */ C1688b f7954a;

            C16861(C1688b c1688b) {
                this.f7954a = c1688b;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                switch (i) {
                    case -2:
                        this.f7954a.f7956a.f7966o.invoke(this.f7954a.f7956a.f7967p, false, false);
                        return;
                    case -1:
                        ActivityCompat.requestPermissions(this.f7954a.f7956a, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 1);
                        return;
                    default:
                        return;
                }
            }
        }

        class C16872 implements OnCancelListener {
            final /* synthetic */ C1688b f7955a;

            C16872(C1688b c1688b) {
                this.f7955a = c1688b;
            }

            public final void onCancel(DialogInterface dialogInterface) {
                this.f7955a.f7956a.f7966o.invoke(this.f7955a.f7956a.f7967p, false, false);
            }
        }

        private C1688b(Website336212 website336212) {
            this.f7956a = website336212;
        }

        public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
            quotaUpdater.updateQuota(2 * j2);
        }

        public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
            if (!this.f7956a.f7964m) {
                callback.invoke(str, false, false);
            } else if (C0392a.checkSelfPermission(this.f7956a, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                this.f7956a.f7966o = callback;
                this.f7956a.f7967p = str;
                if (ActivityCompat.shouldShowRequestPermissionRationale(this.f7956a, "android.permission.ACCESS_FINE_LOCATION")) {
                    CharSequence string = this.f7956a.getString(R.string.location_permission_request);
                    OnClickListener c16861 = new C16861(this);
                    new C0822a(this.f7956a).m2396b(string).m2390a(c16861).m2395b(c16861).m2389a(new C16872(this)).m2394a().show();
                    return;
                }
                ActivityCompat.requestPermissions(this.f7956a, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 1);
            } else {
                callback.invoke(str, true, false);
            }
        }
    }

    private void m7169a(String str) {
        if (this.f7959h != null) {
            try {
                WebView.class.getMethod(str, new Class[0]).invoke(this.f7959h, new Object[0]);
            } catch (NoSuchMethodException e) {
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
            }
        }
    }

    protected final void m7175a() {
        if (this.f7960i != null) {
            C0664g.m1777b(this.f7960i);
        }
    }

    protected String getActivityTitleForAnalytics() {
        return getString(R.string.Website336212_activity_title);
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
        return f7957q.m7146a(this, "material");
    }

    protected boolean isToolbarEnabled() {
        return true;
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f7958g == -1) {
            this.f7958g = C1709b.m7361a(this);
        }
        setToolbarTitle((int) R.string.Website336212_activity_title);
        CookieSyncManager.createInstance(this);
        this.f7959h = (WebView) findViewById(R.id.webView1);
        this.f7959h.setWebChromeClient(new C1688b());
        if (this.f7964m) {
            this.f7959h.getSettings().setGeolocationEnabled(true);
        }
        this.f7959h.setWebViewClient(new C1685a());
        this.f7959h.getSettings().setJavaScriptEnabled(true);
        this.f7959h.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f7959h.getSettings().setLightTouchEnabled(true);
        this.f7959h.getSettings().setDatabaseEnabled(true);
        this.f7959h.getSettings().setDatabasePath("/data/data/" + getPackageName() + "/databases/");
        this.f7959h.getSettings().setDomStorageEnabled(true);
        if (VERSION.SDK_INT >= 21) {
            this.f7959h.getSettings().setMixedContentMode(2);
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f7959h, true);
        }
        if (VERSION.SDK_INT > 7) {
            this.f7959h.getSettings().setPluginState(PluginState.ON);
        }
        this.f7959h.getSettings().setBuiltInZoomControls(this.f7965n);
        this.f7959h.getSettings().setDisplayZoomControls(false);
        this.f7959h.getSettings().setSupportZoom(this.f7965n);
        this.f7959h.getSettings().setLoadWithOverviewMode(this.f7965n);
        this.f7959h.getSettings().setUseWideViewPort(this.f7965n);
        this.f7959h.setDownloadListener(new C16841(this));
        String str = "";
        Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra("com.orange.studio.banglatype.NAVIGATION_PAGE");
        }
        if (str != null && !str.equals("")) {
            this.f7959h.loadUrl("file:///android_asset/Website336212" + str);
        } else if (bundle != null) {
            this.f7959h.restoreState(bundle);
        } else {
            this.f7959h.loadUrl(getString(R.string.Website336212_webview_content));
        }
        C1723f.m7463a(this, (LinearLayout) findViewById(R.id.contentAdLayout), C1721b.f8296a);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.webview_options_menu, menu);
        this.f7960i = menu.findItem(R.id.refresh);
        if (this.f7963l) {
            m7175a();
        }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f7959h.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f7959h.goBack();
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.refresh:
                if (this.f7959h != null) {
                    this.f7959h.reload();
                }
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    protected void onPause() {
        super.onPause();
        m7169a("onPause");
        CookieSyncManager.getInstance().stopSync();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        switch (i) {
            case 1:
                if (!(this.f7966o == null || this.f7967p == null)) {
                    boolean z = iArr.length > 0 && iArr[0] == 0;
                    this.f7966o.invoke(this.f7967p, z, false);
                    this.f7966o = null;
                    this.f7967p = null;
                    return;
                }
                break;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    protected void onResume() {
        super.onResume();
        m7169a("onResume");
        CookieSyncManager.getInstance().startSync();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f7959h.saveState(bundle);
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
