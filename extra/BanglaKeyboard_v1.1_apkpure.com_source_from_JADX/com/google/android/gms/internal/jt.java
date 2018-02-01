package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.C1538g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
final class jt extends WebView implements OnGlobalLayoutListener, DownloadListener, jf {
    private aea f6333A;
    private aeb f6334B;
    private WeakReference<OnClickListener> f6335C;
    private zzm f6336D;
    private boolean f6337E;
    private hy f6338F;
    private int f6339G = -1;
    private int f6340H = -1;
    private int f6341I = -1;
    private int f6342J = -1;
    private Map<String, ajk> f6343K;
    private final WindowManager f6344L;
    private final zk f6345M;
    private final jx f6346a;
    private final Object f6347b = new Object();
    private final nh f6348c;
    private final zzajk f6349d;
    private final zzbo f6350e;
    private final zzv f6351f;
    private jg f6352g;
    private zzm f6353h;
    private zzjb f6354i;
    private boolean f6355j;
    private boolean f6356k;
    private boolean f6357l;
    private boolean f6358m;
    private Boolean f6359n;
    private int f6360o;
    private boolean f6361p = true;
    private boolean f6362q = false;
    private String f6363r = "";
    private jy f6364s;
    private boolean f6365t;
    private boolean f6366u;
    private aey f6367v;
    private int f6368w;
    private int f6369x;
    private aea f6370y;
    private aea f6371z;

    private jt(jx jxVar, zzjb com_google_android_gms_internal_zzjb, boolean z, nh nhVar, zzajk com_google_android_gms_internal_zzajk, aec com_google_android_gms_internal_aec, zzbo com_google_android_gms_ads_internal_zzbo, zzv com_google_android_gms_ads_internal_zzv, zk zkVar) {
        super(jxVar);
        this.f6346a = jxVar;
        this.f6354i = com_google_android_gms_internal_zzjb;
        this.f6357l = z;
        this.f6360o = -1;
        this.f6348c = nhVar;
        this.f6349d = com_google_android_gms_internal_zzajk;
        this.f6350e = com_google_android_gms_ads_internal_zzbo;
        this.f6351f = com_google_android_gms_ads_internal_zzv;
        this.f6344L = (WindowManager) getContext().getSystemService("window");
        this.f6345M = zkVar;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            id.m5372a(6);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(zzbv.zzea().m5502a((Context) jxVar, com_google_android_gms_internal_zzajk.f7706a));
        zzbv.zzec().mo2100a(getContext(), settings);
        setDownloadListener(this);
        m5796I();
        if (C1538g.m3942b()) {
            addJavascriptInterface(new kb(this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.f6338F = new hy(this.f6346a.f6374a, this, this, null);
        m5804a(com_google_android_gms_internal_aec);
        zzbv.zzec().mo2112b((Context) jxVar);
    }

    private final boolean m5793F() {
        if (!this.f6352g.m5732a() && !this.f6352g.m5734b()) {
            return false;
        }
        int i;
        int i2;
        zzbv.zzea();
        DisplayMetrics a = gb.m5432a(this.f6344L);
        aak.m4022a();
        int b = hz.m5624b(a, a.widthPixels);
        aak.m4022a();
        int b2 = hz.m5624b(a, a.heightPixels);
        Activity activity = this.f6346a.f6374a;
        if (activity == null || activity.getWindow() == null) {
            i = b2;
            i2 = b;
        } else {
            zzbv.zzea();
            int[] a2 = gb.m5463a(activity);
            aak.m4022a();
            i2 = hz.m5624b(a, a2[0]);
            aak.m4022a();
            i = hz.m5624b(a, a2[1]);
        }
        if (this.f6340H == b && this.f6339G == b2 && this.f6341I == i2 && this.f6342J == i) {
            return false;
        }
        boolean z = (this.f6340H == b && this.f6339G == b2) ? false : true;
        this.f6340H = b;
        this.f6339G = b2;
        this.f6341I = i2;
        this.f6342J = i;
        new aof(this).m4981a(b, b2, i2, i, a.density, this.f6344L.getDefaultDisplay().getRotation());
        return z;
    }

    private final Boolean m5794G() {
        Boolean bool;
        synchronized (this.f6347b) {
            bool = this.f6359n;
        }
        return bool;
    }

    private final void m5795H() {
        adv.m4226a(this.f6334B.f4946b, this.f6371z, "aeh2");
    }

    private final void m5796I() {
        synchronized (this.f6347b) {
            if (this.f6357l || this.f6354i.f7761d) {
                id.m5372a(3);
                m5797J();
            } else if (VERSION.SDK_INT < 18) {
                id.m5372a(3);
                synchronized (this.f6347b) {
                    if (!this.f6358m) {
                        zzbv.zzec().mo2104c((View) this);
                    }
                    this.f6358m = true;
                }
            } else {
                id.m5372a(3);
                m5797J();
            }
        }
    }

    private final void m5797J() {
        synchronized (this.f6347b) {
            if (this.f6358m) {
                zzbv.zzec().mo2102b((View) this);
            }
            this.f6358m = false;
        }
    }

    private final void m5798K() {
        synchronized (this.f6347b) {
            if (!this.f6337E) {
                this.f6337E = true;
                zzbv.zzee().f6022g.decrementAndGet();
            }
        }
    }

    private final void m5799L() {
        synchronized (this.f6347b) {
            this.f6343K = null;
        }
    }

    private final void m5800M() {
        if (this.f6334B != null) {
            aec com_google_android_gms_internal_aec = this.f6334B.f4946b;
            if (com_google_android_gms_internal_aec != null && zzbv.zzee().m5347e() != null) {
                zzbv.zzee().m5347e().m4224a(com_google_android_gms_internal_aec);
            }
        }
    }

    static jt m5802a(Context context, zzjb com_google_android_gms_internal_zzjb, boolean z, nh nhVar, zzajk com_google_android_gms_internal_zzajk, aec com_google_android_gms_internal_aec, zzbo com_google_android_gms_ads_internal_zzbo, zzv com_google_android_gms_ads_internal_zzv, zk zkVar) {
        return new jt(new jx(context), com_google_android_gms_internal_zzjb, z, nhVar, com_google_android_gms_internal_zzajk, com_google_android_gms_internal_aec, com_google_android_gms_ads_internal_zzbo, com_google_android_gms_ads_internal_zzv, zkVar);
    }

    private final void m5804a(aec com_google_android_gms_internal_aec) {
        m5800M();
        this.f6334B = new aeb(new aec(true, "make_wv", this.f6354i.f7758a));
        aec com_google_android_gms_internal_aec2 = this.f6334B.f4946b;
        synchronized (com_google_android_gms_internal_aec2.f4948b) {
            com_google_android_gms_internal_aec2.f4951e = com_google_android_gms_internal_aec;
        }
        this.f6371z = adv.m4225a(this.f6334B.f4946b);
        this.f6334B.m4232a("native:view_create", this.f6371z);
        this.f6333A = null;
        this.f6370y = null;
    }

    private final void m5805a(Boolean bool) {
        synchronized (this.f6347b) {
            this.f6359n = bool;
        }
        ej zzee = zzbv.zzee();
        synchronized (zzee.f6016a) {
            zzee.f6021f = bool;
        }
    }

    private final void m5808c(String str) {
        synchronized (this.f6347b) {
            if (mo2174q()) {
                id.m5370a("The webview is destroyed. Ignoring action.");
            } else {
                loadUrl(str);
            }
        }
    }

    private final void m5809d(String str) {
        if (C1538g.m3944d()) {
            if (m5794G() == null) {
                synchronized (this.f6347b) {
                    this.f6359n = zzbv.zzee().m5352j();
                    if (this.f6359n == null) {
                        try {
                            evaluateJavascript("(function(){})()", null);
                            m5805a(Boolean.valueOf(true));
                        } catch (IllegalStateException e) {
                            m5805a(Boolean.valueOf(false));
                        }
                    }
                }
            }
            if (m5794G().booleanValue()) {
                synchronized (this.f6347b) {
                    if (mo2174q()) {
                        id.m5370a("The webview is destroyed. Ignoring action.");
                    } else {
                        evaluateJavascript(str, null);
                    }
                }
                return;
            }
            String str2 = "javascript:";
            String valueOf = String.valueOf(str);
            m5808c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return;
        }
        str2 = "javascript:";
        valueOf = String.valueOf(str);
        m5808c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    private final void m5810e(boolean z) {
        Map hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        mo2145a("onAdVisibilityChanged", hashMap);
    }

    public final void mo2131A() {
        this.f6338F.m5608a();
    }

    public final void mo2132B() {
        if (this.f6333A == null) {
            this.f6333A = adv.m4225a(this.f6334B.f4946b);
            this.f6334B.m4232a("native:view_load", this.f6333A);
        }
    }

    public final OnClickListener mo2133C() {
        return (OnClickListener) this.f6335C.get();
    }

    public final aey mo2134D() {
        aey com_google_android_gms_internal_aey;
        synchronized (this.f6347b) {
            com_google_android_gms_internal_aey = this.f6367v;
        }
        return com_google_android_gms_internal_aey;
    }

    public final void mo2135E() {
        setBackgroundColor(0);
    }

    public final WebView mo2136a() {
        return this;
    }

    public final void mo2137a(int i) {
        if (i == 0) {
            adv.m4226a(this.f6334B.f4946b, this.f6371z, "aebb2");
        }
        m5795H();
        if (this.f6334B.f4946b != null) {
            this.f6334B.f4946b.m4235a("close_type", String.valueOf(i));
        }
        Map hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f6349d.f7706a);
        mo2145a("onhide", hashMap);
    }

    public final void mo2138a(Context context) {
        this.f6346a.setBaseContext(context);
        this.f6338F.f6233a = this.f6346a.f6374a;
    }

    public final void mo2139a(Context context, zzjb com_google_android_gms_internal_zzjb, aec com_google_android_gms_internal_aec) {
        synchronized (this.f6347b) {
            this.f6338F.m5609b();
            mo2138a(context);
            this.f6353h = null;
            this.f6354i = com_google_android_gms_internal_zzjb;
            this.f6357l = false;
            this.f6355j = false;
            this.f6363r = "";
            this.f6360o = -1;
            zzbv.zzec();
            gf.m5509b((jf) this);
            loadUrl("about:blank");
            this.f6352g.m5743k();
            setOnTouchListener(null);
            setOnClickListener(null);
            this.f6361p = true;
            this.f6362q = false;
            this.f6364s = null;
            m5804a(com_google_android_gms_internal_aec);
            this.f6365t = false;
            this.f6368w = 0;
            zzbv.zzex();
            ajj.m4592a(this);
            m5799L();
        }
    }

    public final void mo2140a(zzm com_google_android_gms_ads_internal_overlay_zzm) {
        synchronized (this.f6347b) {
            this.f6353h = com_google_android_gms_ads_internal_overlay_zzm;
        }
    }

    public final void mo2141a(aey com_google_android_gms_internal_aey) {
        synchronized (this.f6347b) {
            this.f6367v = com_google_android_gms_internal_aey;
        }
    }

    public final void mo2142a(jy jyVar) {
        synchronized (this.f6347b) {
            if (this.f6364s != null) {
                id.m5372a(6);
                return;
            }
            this.f6364s = jyVar;
        }
    }

    public final void mo2085a(xk xkVar) {
        synchronized (this.f6347b) {
            this.f6365t = xkVar.f7413a;
        }
        m5810e(xkVar.f7413a);
    }

    public final void mo2143a(zzjb com_google_android_gms_internal_zzjb) {
        synchronized (this.f6347b) {
            this.f6354i = com_google_android_gms_internal_zzjb;
            requestLayout();
        }
    }

    public final void mo2144a(String str) {
        synchronized (this.f6347b) {
            try {
                super.loadUrl(str);
            } catch (Exception e) {
                Throwable e2 = e;
                zzbv.zzee().m5336a(e2, "AdWebViewImpl.loadUrlUnsafe");
                id.m5371a("Could not call loadUrl. ", e2);
            } catch (NoClassDefFoundError e3) {
                e2 = e3;
                zzbv.zzee().m5336a(e2, "AdWebViewImpl.loadUrlUnsafe");
                id.m5371a("Could not call loadUrl. ", e2);
            } catch (IncompatibleClassChangeError e4) {
                e2 = e4;
                zzbv.zzee().m5336a(e2, "AdWebViewImpl.loadUrlUnsafe");
                id.m5371a("Could not call loadUrl. ", e2);
            } catch (UnsatisfiedLinkError e5) {
                e2 = e5;
                zzbv.zzee().m5336a(e2, "AdWebViewImpl.loadUrlUnsafe");
                id.m5371a("Could not call loadUrl. ", e2);
            }
        }
    }

    public final void mo2145a(String str, Map<String, ?> map) {
        try {
            zzb(str, zzbv.zzea().m5504a((Map) map));
        } catch (JSONException e) {
            id.m5370a("Could not convert parameters to JSON.");
        }
    }

    public final void mo2146a(boolean z) {
        synchronized (this.f6347b) {
            Object obj = z != this.f6357l ? 1 : null;
            this.f6357l = z;
            m5796I();
            if (obj != null) {
                new aof(this).m4983b(z ? "expanded" : "default");
            }
        }
    }

    public final void mo2147b() {
        m5795H();
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.f6349d.f7706a);
        mo2145a("onhide", hashMap);
    }

    public final void mo2148b(int i) {
        synchronized (this.f6347b) {
            this.f6360o = i;
            if (this.f6353h != null) {
                this.f6353h.setRequestedOrientation(this.f6360o);
            }
        }
    }

    public final void mo2149b(zzm com_google_android_gms_ads_internal_overlay_zzm) {
        synchronized (this.f6347b) {
            this.f6336D = com_google_android_gms_ads_internal_overlay_zzm;
        }
    }

    public final void mo2150b(String str) {
        synchronized (this.f6347b) {
            if (str == null) {
                str = "";
            }
            this.f6363r = str;
        }
    }

    public final void mo2151b(boolean z) {
        synchronized (this.f6347b) {
            if (this.f6353h != null) {
                this.f6353h.zza(this.f6352g.m5732a(), z);
            } else {
                this.f6355j = z;
            }
        }
    }

    public final void mo2152c() {
        if (this.f6370y == null) {
            adv.m4226a(this.f6334B.f4946b, this.f6371z, "aes2");
            this.f6370y = adv.m4225a(this.f6334B.f4946b);
            this.f6334B.m4232a("native:view_show", this.f6370y);
        }
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.f6349d.f7706a);
        mo2145a("onshow", hashMap);
    }

    public final void mo2153c(boolean z) {
        synchronized (this.f6347b) {
            this.f6361p = z;
        }
    }

    public final void mo2154d() {
        Map hashMap = new HashMap(3);
        zzbv.zzea();
        hashMap.put("app_muted", String.valueOf(gb.m5487e()));
        zzbv.zzea();
        hashMap.put("app_volume", String.valueOf(gb.m5482d()));
        zzbv.zzea();
        hashMap.put("device_volume", String.valueOf(gb.m5494h(getContext())));
        mo2145a("volume", hashMap);
    }

    public final void mo2155d(boolean z) {
        synchronized (this.f6347b) {
            this.f6368w = (z ? 1 : -1) + this.f6368w;
            if (this.f6368w <= 0 && this.f6353h != null) {
                this.f6353h.zzmu();
            }
        }
    }

    public final void destroy() {
        synchronized (this.f6347b) {
            m5800M();
            this.f6338F.m5609b();
            if (this.f6353h != null) {
                this.f6353h.close();
                this.f6353h.onDestroy();
                this.f6353h = null;
            }
            this.f6352g.m5743k();
            if (this.f6356k) {
                return;
            }
            zzbv.zzex();
            ajj.m4592a(this);
            m5799L();
            this.f6356k = true;
            es.m5373a();
            this.f6352g.m5738f();
        }
    }

    public final Activity mo2157e() {
        return this.f6346a.f6374a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(19)
    public final void evaluateJavascript(java.lang.String r3, android.webkit.ValueCallback<java.lang.String> r4) {
        /*
        r2 = this;
        r1 = r2.f6347b;
        monitor-enter(r1);
        r0 = r2.mo2174q();	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0016;
    L_0x0009:
        r0 = "The webview is destroyed. Ignoring action.";
        com.google.android.gms.internal.id.m5370a(r0);	 Catch:{ all -> 0x001b }
        if (r4 == 0) goto L_0x0014;
    L_0x0010:
        r0 = 0;
        r4.onReceiveValue(r0);	 Catch:{ all -> 0x001b }
    L_0x0014:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
    L_0x0015:
        return;
    L_0x0016:
        super.evaluateJavascript(r3, r4);	 Catch:{ all -> 0x001b }
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        goto L_0x0015;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jt.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    public final Context mo2158f() {
        return this.f6346a.f6375b;
    }

    protected final void finalize() {
        try {
            if (this.f6347b != null) {
                synchronized (this.f6347b) {
                    if (!this.f6356k) {
                        this.f6352g.m5743k();
                        zzbv.zzex();
                        ajj.m4592a(this);
                        m5799L();
                        m5798K();
                    }
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final zzv mo2159g() {
        return this.f6351f;
    }

    public final zzm mo2160h() {
        zzm com_google_android_gms_ads_internal_overlay_zzm;
        synchronized (this.f6347b) {
            com_google_android_gms_ads_internal_overlay_zzm = this.f6353h;
        }
        return com_google_android_gms_ads_internal_overlay_zzm;
    }

    public final zzm mo2161i() {
        zzm com_google_android_gms_ads_internal_overlay_zzm;
        synchronized (this.f6347b) {
            com_google_android_gms_ads_internal_overlay_zzm = this.f6336D;
        }
        return com_google_android_gms_ads_internal_overlay_zzm;
    }

    public final zzjb mo2162j() {
        zzjb com_google_android_gms_internal_zzjb;
        synchronized (this.f6347b) {
            com_google_android_gms_internal_zzjb = this.f6354i;
        }
        return com_google_android_gms_internal_zzjb;
    }

    public final jg mo2163k() {
        return this.f6352g;
    }

    public final boolean mo2164l() {
        boolean z;
        synchronized (this.f6347b) {
            z = this.f6355j;
        }
        return z;
    }

    public final void loadData(String str, String str2, String str3) {
        synchronized (this.f6347b) {
            if (mo2174q()) {
                id.m5370a("The webview is destroyed. Ignoring action.");
            } else {
                super.loadData(str, str2, str3);
            }
        }
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        synchronized (this.f6347b) {
            if (mo2174q()) {
                id.m5370a("The webview is destroyed. Ignoring action.");
            } else {
                super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            }
        }
    }

    public final void loadUrl(String str) {
        synchronized (this.f6347b) {
            if (mo2174q()) {
                id.m5370a("The webview is destroyed. Ignoring action.");
            } else {
                try {
                    super.loadUrl(str);
                } catch (Exception e) {
                    Throwable e2 = e;
                    zzbv.zzee().m5336a(e2, "AdWebViewImpl.loadUrl");
                    id.m5371a("Could not call loadUrl. ", e2);
                } catch (NoClassDefFoundError e3) {
                    e2 = e3;
                    zzbv.zzee().m5336a(e2, "AdWebViewImpl.loadUrl");
                    id.m5371a("Could not call loadUrl. ", e2);
                } catch (IncompatibleClassChangeError e4) {
                    e2 = e4;
                    zzbv.zzee().m5336a(e2, "AdWebViewImpl.loadUrl");
                    id.m5371a("Could not call loadUrl. ", e2);
                }
            }
        }
    }

    public final nh mo2168m() {
        return this.f6348c;
    }

    public final zzajk mo2169n() {
        return this.f6349d;
    }

    public final boolean mo2170o() {
        boolean z;
        synchronized (this.f6347b) {
            z = this.f6357l;
        }
        return z;
    }

    protected final void onAttachedToWindow() {
        boolean z = true;
        synchronized (this.f6347b) {
            super.onAttachedToWindow();
            if (!mo2174q()) {
                this.f6338F.m5610c();
            }
            boolean z2 = this.f6365t;
            if (this.f6352g == null || !this.f6352g.m5734b()) {
                z = z2;
            } else {
                if (!this.f6366u) {
                    OnGlobalLayoutListener c = this.f6352g.m5735c();
                    if (c != null) {
                        zzbv.zzey();
                        if (this == null) {
                            throw null;
                        }
                        ja.m5655a((View) this, c);
                    }
                    OnScrollChangedListener d = this.f6352g.m5736d();
                    if (d != null) {
                        zzbv.zzey();
                        if (this == null) {
                            throw null;
                        }
                        ja.m5656a((View) this, d);
                    }
                    this.f6366u = true;
                }
                m5793F();
            }
            m5810e(z);
        }
    }

    protected final void onDetachedFromWindow() {
        synchronized (this.f6347b) {
            if (!mo2174q()) {
                this.f6338F.m5611d();
            }
            super.onDetachedFromWindow();
            if (this.f6366u && this.f6352g != null && this.f6352g.m5734b() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener c = this.f6352g.m5735c();
                if (c != null) {
                    zzbv.zzec().mo2109a(getViewTreeObserver(), c);
                }
                OnScrollChangedListener d = this.f6352g.m5736d();
                if (d != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(d);
                }
                this.f6366u = false;
            }
        }
        m5810e(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzbv.zzea();
            gb.m5446a(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            new StringBuilder((String.valueOf(str).length() + 51) + String.valueOf(str4).length()).append("Couldn't find an Activity to view url/mimetype: ").append(str).append(" / ").append(str4);
            id.m5372a(3);
        }
    }

    @TargetApi(21)
    protected final void onDraw(Canvas canvas) {
        if (!mo2174q()) {
            if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                if (this.f6352g != null && this.f6352g.f6296j != null) {
                    this.f6352g.f6296j.mo1471a();
                }
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (((Boolean) zzbv.zzen().m4217a(ado.ar)).booleanValue()) {
            float axisValue = motionEvent.getAxisValue(9);
            float axisValue2 = motionEvent.getAxisValue(10);
            if (motionEvent.getActionMasked() == 8 && ((axisValue > 0.0f && !canScrollVertically(-1)) || ((axisValue < 0.0f && !canScrollVertically(1)) || ((axisValue2 > 0.0f && !canScrollHorizontally(-1)) || (axisValue2 < 0.0f && !canScrollHorizontally(1)))))) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean F = m5793F();
        zzm h = mo2160h();
        if (h != null && F) {
            h.zzmr();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.SuppressLint({"DrawAllocation"})
    protected final void onMeasure(int r10, int r11) {
        /*
        r9 = this;
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = 8;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r4 = r9.f6347b;
        monitor-enter(r4);
        r1 = r9.mo2174q();	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0019;
    L_0x0012:
        r0 = 0;
        r1 = 0;
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
    L_0x0018:
        return;
    L_0x0019:
        r1 = r9.isInEditMode();	 Catch:{ all -> 0x002e }
        if (r1 != 0) goto L_0x0029;
    L_0x001f:
        r1 = r9.f6357l;	 Catch:{ all -> 0x002e }
        if (r1 != 0) goto L_0x0029;
    L_0x0023:
        r1 = r9.f6354i;	 Catch:{ all -> 0x002e }
        r1 = r1.f7765h;	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0031;
    L_0x0029:
        super.onMeasure(r10, r11);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x002e:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        throw r0;
    L_0x0031:
        r1 = r9.f6354i;	 Catch:{ all -> 0x002e }
        r1 = r1.f7766i;	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0087;
    L_0x0037:
        r0 = com.google.android.gms.internal.ado.bV;	 Catch:{ all -> 0x002e }
        r1 = com.google.android.gms.ads.internal.zzbv.zzen();	 Catch:{ all -> 0x002e }
        r0 = r1.m4217a(r0);	 Catch:{ all -> 0x002e }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x002e }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x002e }
        if (r0 != 0) goto L_0x004f;
    L_0x0049:
        r0 = com.google.android.gms.common.util.C1538g.m3942b();	 Catch:{ all -> 0x002e }
        if (r0 != 0) goto L_0x0054;
    L_0x004f:
        super.onMeasure(r10, r11);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x0054:
        r0 = "/contentHeight";
        r1 = new com.google.android.gms.internal.ju;	 Catch:{ all -> 0x002e }
        r1.<init>(r9);	 Catch:{ all -> 0x002e }
        r9.zza(r0, r1);	 Catch:{ all -> 0x002e }
        r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();";
        r9.m5809d(r0);	 Catch:{ all -> 0x002e }
        r0 = r9.f6346a;	 Catch:{ all -> 0x002e }
        r0 = r0.getResources();	 Catch:{ all -> 0x002e }
        r0 = r0.getDisplayMetrics();	 Catch:{ all -> 0x002e }
        r0 = r0.density;	 Catch:{ all -> 0x002e }
        r1 = android.view.View.MeasureSpec.getSize(r10);	 Catch:{ all -> 0x002e }
        r2 = r9.f6369x;	 Catch:{ all -> 0x002e }
        switch(r2) {
            case -1: goto L_0x0082;
            default: goto L_0x0078;
        };	 Catch:{ all -> 0x002e }
    L_0x0078:
        r2 = r9.f6369x;	 Catch:{ all -> 0x002e }
        r2 = (float) r2;	 Catch:{ all -> 0x002e }
        r0 = r0 * r2;
        r0 = (int) r0;	 Catch:{ all -> 0x002e }
    L_0x007d:
        r9.setMeasuredDimension(r1, r0);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x0082:
        r0 = android.view.View.MeasureSpec.getSize(r11);	 Catch:{ all -> 0x002e }
        goto L_0x007d;
    L_0x0087:
        r1 = r9.f6354i;	 Catch:{ all -> 0x002e }
        r1 = r1.f7761d;	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x00a5;
    L_0x008d:
        r0 = new android.util.DisplayMetrics;	 Catch:{ all -> 0x002e }
        r0.<init>();	 Catch:{ all -> 0x002e }
        r1 = r9.f6344L;	 Catch:{ all -> 0x002e }
        r1 = r1.getDefaultDisplay();	 Catch:{ all -> 0x002e }
        r1.getMetrics(r0);	 Catch:{ all -> 0x002e }
        r1 = r0.widthPixels;	 Catch:{ all -> 0x002e }
        r0 = r0.heightPixels;	 Catch:{ all -> 0x002e }
        r9.setMeasuredDimension(r1, r0);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x00a5:
        r2 = android.view.View.MeasureSpec.getMode(r10);	 Catch:{ all -> 0x002e }
        r3 = android.view.View.MeasureSpec.getSize(r10);	 Catch:{ all -> 0x002e }
        r5 = android.view.View.MeasureSpec.getMode(r11);	 Catch:{ all -> 0x002e }
        r1 = android.view.View.MeasureSpec.getSize(r11);	 Catch:{ all -> 0x002e }
        if (r2 == r6) goto L_0x00b9;
    L_0x00b7:
        if (r2 != r8) goto L_0x0150;
    L_0x00b9:
        r2 = r3;
    L_0x00ba:
        if (r5 == r6) goto L_0x00be;
    L_0x00bc:
        if (r5 != r8) goto L_0x00bf;
    L_0x00be:
        r0 = r1;
    L_0x00bf:
        r5 = r9.f6354i;	 Catch:{ all -> 0x002e }
        r5 = r5.f7763f;	 Catch:{ all -> 0x002e }
        if (r5 > r2) goto L_0x00cb;
    L_0x00c5:
        r2 = r9.f6354i;	 Catch:{ all -> 0x002e }
        r2 = r2.f7760c;	 Catch:{ all -> 0x002e }
        if (r2 <= r0) goto L_0x013a;
    L_0x00cb:
        r0 = r9.f6346a;	 Catch:{ all -> 0x002e }
        r0 = r0.getResources();	 Catch:{ all -> 0x002e }
        r0 = r0.getDisplayMetrics();	 Catch:{ all -> 0x002e }
        r0 = r0.density;	 Catch:{ all -> 0x002e }
        r2 = r9.f6354i;	 Catch:{ all -> 0x002e }
        r2 = r2.f7763f;	 Catch:{ all -> 0x002e }
        r2 = (float) r2;	 Catch:{ all -> 0x002e }
        r2 = r2 / r0;
        r2 = (int) r2;	 Catch:{ all -> 0x002e }
        r5 = r9.f6354i;	 Catch:{ all -> 0x002e }
        r5 = r5.f7760c;	 Catch:{ all -> 0x002e }
        r5 = (float) r5;	 Catch:{ all -> 0x002e }
        r5 = r5 / r0;
        r5 = (int) r5;	 Catch:{ all -> 0x002e }
        r3 = (float) r3;	 Catch:{ all -> 0x002e }
        r3 = r3 / r0;
        r3 = (int) r3;	 Catch:{ all -> 0x002e }
        r1 = (float) r1;	 Catch:{ all -> 0x002e }
        r0 = r1 / r0;
        r0 = (int) r0;	 Catch:{ all -> 0x002e }
        r1 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002e }
        r6.<init>(r1);	 Catch:{ all -> 0x002e }
        r1 = "Not enough space to show ad. Needs ";
        r1 = r6.append(r1);	 Catch:{ all -> 0x002e }
        r1 = r1.append(r2);	 Catch:{ all -> 0x002e }
        r2 = "x";
        r1 = r1.append(r2);	 Catch:{ all -> 0x002e }
        r1 = r1.append(r5);	 Catch:{ all -> 0x002e }
        r2 = " dp, but only has ";
        r1 = r1.append(r2);	 Catch:{ all -> 0x002e }
        r1 = r1.append(r3);	 Catch:{ all -> 0x002e }
        r2 = "x";
        r1 = r1.append(r2);	 Catch:{ all -> 0x002e }
        r0 = r1.append(r0);	 Catch:{ all -> 0x002e }
        r1 = " dp.";
        r0 = r0.append(r1);	 Catch:{ all -> 0x002e }
        r0 = r0.toString();	 Catch:{ all -> 0x002e }
        com.google.android.gms.internal.id.m5370a(r0);	 Catch:{ all -> 0x002e }
        r0 = r9.getVisibility();	 Catch:{ all -> 0x002e }
        if (r0 == r7) goto L_0x0132;
    L_0x012e:
        r0 = 4;
        r9.setVisibility(r0);	 Catch:{ all -> 0x002e }
    L_0x0132:
        r0 = 0;
        r1 = 0;
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x002e }
    L_0x0137:
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x013a:
        r0 = r9.getVisibility();	 Catch:{ all -> 0x002e }
        if (r0 == r7) goto L_0x0144;
    L_0x0140:
        r0 = 0;
        r9.setVisibility(r0);	 Catch:{ all -> 0x002e }
    L_0x0144:
        r0 = r9.f6354i;	 Catch:{ all -> 0x002e }
        r0 = r0.f7763f;	 Catch:{ all -> 0x002e }
        r1 = r9.f6354i;	 Catch:{ all -> 0x002e }
        r1 = r1.f7760c;	 Catch:{ all -> 0x002e }
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x002e }
        goto L_0x0137;
    L_0x0150:
        r2 = r0;
        goto L_0x00ba;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jt.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!mo2174q()) {
            try {
                super.onPause();
            } catch (Exception e) {
                id.m5372a(6);
            }
        }
    }

    public final void onResume() {
        if (!mo2174q()) {
            try {
                super.onResume();
            } catch (Exception e) {
                id.m5372a(6);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f6352g.m5734b()) {
            synchronized (this.f6347b) {
                if (this.f6367v != null) {
                    this.f6367v.mo1798a(motionEvent);
                }
            }
        } else if (this.f6348c != null) {
            this.f6348c.m6062a(motionEvent);
        }
        return mo2174q() ? false : super.onTouchEvent(motionEvent);
    }

    public final int mo2173p() {
        int i;
        synchronized (this.f6347b) {
            i = this.f6360o;
        }
        return i;
    }

    public final boolean mo2174q() {
        boolean z;
        synchronized (this.f6347b) {
            z = this.f6356k;
        }
        return z;
    }

    public final void mo2175r() {
        synchronized (this.f6347b) {
            es.m5373a();
            m5798K();
            gb.f6131a.post(new jw(this));
        }
    }

    public final boolean mo2176s() {
        boolean z;
        synchronized (this.f6347b) {
            z = this.f6361p;
        }
        return z;
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f6335C = new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof jg) {
            this.f6352g = (jg) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!mo2174q()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                id.m5372a(6);
            }
        }
    }

    public final boolean mo2182t() {
        boolean z;
        synchronized (this.f6347b) {
            z = this.f6362q;
        }
        return z;
    }

    public final String mo2183u() {
        String str;
        synchronized (this.f6347b) {
            str = this.f6363r;
        }
        return str;
    }

    public final je mo2184v() {
        return null;
    }

    public final aea mo2185w() {
        return this.f6371z;
    }

    public final aeb mo2186x() {
        return this.f6334B;
    }

    public final jy mo2187y() {
        jy jyVar;
        synchronized (this.f6347b) {
            jyVar = this.f6364s;
        }
        return jyVar;
    }

    public final boolean mo2188z() {
        boolean z;
        synchronized (this.f6347b) {
            z = this.f6368w > 0;
        }
        return z;
    }

    public final void zza(String str, ail com_google_android_gms_internal_ail) {
        if (this.f6352g != null) {
            this.f6352g.m5728a(str, com_google_android_gms_internal_ail);
        }
    }

    public final void zza(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        zzi(str, jSONObject.toString());
    }

    public final void zzb(String str, ail com_google_android_gms_internal_ail) {
        if (this.f6352g != null) {
            this.f6352g.m5733b(str, com_google_android_gms_internal_ail);
        }
    }

    public final void zzb(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(window.AFMA_ReceiveMessage || function() {})('");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(",");
        stringBuilder.append(jSONObject2);
        stringBuilder.append(");");
        jSONObject2 = "Dispatching AFMA event: ";
        String valueOf = String.valueOf(stringBuilder.toString());
        if (valueOf.length() != 0) {
            jSONObject2.concat(valueOf);
        } else {
            valueOf = new String(jSONObject2);
        }
        id.m5372a(3);
        m5809d(stringBuilder.toString());
    }

    public final void zzci() {
        synchronized (this.f6347b) {
            this.f6362q = true;
            if (this.f6350e != null) {
                this.f6350e.zzci();
            }
        }
    }

    public final void zzcj() {
        synchronized (this.f6347b) {
            this.f6362q = false;
            if (this.f6350e != null) {
                this.f6350e.zzcj();
            }
        }
    }

    public final void zzi(String str, String str2) {
        m5809d(new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length()).append(str).append("(").append(str2).append(");").toString());
    }
}
