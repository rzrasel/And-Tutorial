package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.C0679r;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@aqv
public class jg extends WebViewClient {
    private static final String[] f6281l = new String[]{"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    private static final String[] f6282m = new String[]{"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};
    private boolean f6283A;
    private boolean f6284B;
    private int f6285C;
    private OnAttachStateChangeListener f6286D;
    protected jf f6287a;
    final Object f6288b;
    public jk f6289c;
    jl f6290d;
    public jm f6291e;
    boolean f6292f;
    boolean f6293g;
    public zzw f6294h;
    anv f6295i;
    public jo f6296j;
    protected dq f6297k;
    private final HashMap<String, List<ail>> f6298n;
    private zq f6299o;
    private com.google.android.gms.ads.internal.overlay.zzw f6300p;
    private ahr f6301q;
    private aiu f6302r;
    private boolean f6303s;
    private OnGlobalLayoutListener f6304t;
    private OnScrollChangedListener f6305u;
    private boolean f6306v;
    private zzag f6307w;
    private final aoe f6308x;
    private aog f6309y;
    private boolean f6310z;

    public jg(jf jfVar, boolean z) {
        this(jfVar, z, new aoe(jfVar, jfVar.mo2158f(), new acz(jfVar.getContext())));
    }

    private jg(jf jfVar, boolean z, aoe com_google_android_gms_internal_aoe) {
        this.f6298n = new HashMap();
        this.f6288b = new Object();
        this.f6292f = false;
        this.f6287a = jfVar;
        this.f6293g = z;
        this.f6308x = com_google_android_gms_internal_aoe;
        this.f6295i = null;
    }

    private final void m5716a(Context context, String str, String str2, String str3) {
        if (((Boolean) zzbv.zzen().m4217a(ado.bb)).booleanValue()) {
            String host;
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_ERROR, str);
            bundle.putString("code", str2);
            String str4 = "host";
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    host = parse.getHost();
                    bundle.putString(str4, host);
                    zzbv.zzea();
                    gb.m5448a(context, this.f6287a.mo2169n().f7706a, "gmob-apps", bundle, true);
                }
            }
            host = "";
            bundle.putString(str4, host);
            zzbv.zzea();
            gb.m5448a(context, this.f6287a.mo2169n().f7706a, "gmob-apps", bundle, true);
        }
    }

    private final void m5717a(Uri uri) {
        String path = uri.getPath();
        List<ail> list = (List) this.f6298n.get(path);
        if (list != null) {
            zzbv.zzea();
            Map a = gb.m5442a(uri);
            if (id.m5372a(2)) {
                String str = "Received GMSG: ";
                path = String.valueOf(path);
                if (path.length() != 0) {
                    str.concat(path);
                } else {
                    path = new String(str);
                }
                es.m5373a();
                for (String path2 : a.keySet()) {
                    str = (String) a.get(path2);
                    new StringBuilder((String.valueOf(path2).length() + 4) + String.valueOf(str).length()).append("  ").append(path2).append(": ").append(str);
                    es.m5373a();
                }
            }
            for (ail a2 : list) {
                a2.mo1470a(this.f6287a, a);
            }
            return;
        }
        String valueOf = String.valueOf(uri);
        new StringBuilder(String.valueOf(valueOf).length() + 32).append("No GMSG handler found for GMSG: ").append(valueOf);
        es.m5373a();
    }

    private final void m5718a(View view, dq dqVar, int i) {
        if (dqVar.mo2080b() && i > 0) {
            dqVar.mo2077a(view);
            if (dqVar.mo2080b()) {
                gb.f6131a.postDelayed(new jh(this, view, dqVar, i), 100);
            }
        }
    }

    private final void m5719a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean b = this.f6295i != null ? this.f6295i.m4989b() : false;
        zzbv.zzdy();
        Context context = this.f6287a.getContext();
        if (!b) {
            z = true;
        }
        zzu.zza(context, adOverlayInfoParcel, z);
        if (this.f6297k != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzcgw != null) {
                str = adOverlayInfoParcel.zzcgw.url;
            }
            this.f6297k.mo2078a(str);
        }
    }

    private final void m5722l() {
        if (this.f6286D != null) {
            jf jfVar = this.f6287a;
            if (jfVar == null) {
                throw null;
            }
            ((View) jfVar).removeOnAttachStateChangeListener(this.f6286D);
        }
    }

    private final void m5723m() {
        if (this.f6289c != null && ((this.f6283A && this.f6285C <= 0) || this.f6284B)) {
            this.f6289c.mo1477a(this.f6287a, !this.f6284B);
            this.f6289c = null;
        }
        this.f6287a.mo2132B();
    }

    public final void m5724a(int i, int i2, boolean z) {
        this.f6308x.m5004a(i, i2);
        if (this.f6295i != null) {
            anv com_google_android_gms_internal_anv = this.f6295i;
            synchronized (com_google_android_gms_internal_anv.f5470i) {
                com_google_android_gms_internal_anv.f5464c = i;
                com_google_android_gms_internal_anv.f5465d = i2;
                if (com_google_android_gms_internal_anv.f5477p != null && z) {
                    int[] a = com_google_android_gms_internal_anv.m4988a();
                    if (a != null) {
                        PopupWindow popupWindow = com_google_android_gms_internal_anv.f5477p;
                        aak.m4022a();
                        int a2 = hz.m5612a(com_google_android_gms_internal_anv.f5472k, a[0]);
                        aak.m4022a();
                        popupWindow.update(a2, hz.m5612a(com_google_android_gms_internal_anv.f5472k, a[1]), com_google_android_gms_internal_anv.f5477p.getWidth(), com_google_android_gms_internal_anv.f5477p.getHeight());
                        com_google_android_gms_internal_anv.m4986a(a[0], a[1]);
                    } else {
                        com_google_android_gms_internal_anv.m4987a(true);
                    }
                }
            }
        }
    }

    public final void m5725a(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f6288b) {
            this.f6303s = true;
            this.f6287a.mo2131A();
            this.f6304t = onGlobalLayoutListener;
            this.f6305u = onScrollChangedListener;
        }
    }

    public final void m5726a(zzc com_google_android_gms_ads_internal_overlay_zzc) {
        com.google.android.gms.ads.internal.overlay.zzw com_google_android_gms_ads_internal_overlay_zzw = null;
        boolean o = this.f6287a.mo2170o();
        zq zqVar = (!o || this.f6287a.mo2162j().f7761d) ? this.f6299o : null;
        if (!o) {
            com_google_android_gms_ads_internal_overlay_zzw = this.f6300p;
        }
        m5719a(new AdOverlayInfoParcel(com_google_android_gms_ads_internal_overlay_zzc, zqVar, com_google_android_gms_ads_internal_overlay_zzw, this.f6307w, this.f6287a.mo2169n()));
    }

    public final void m5727a(zq zqVar, com.google.android.gms.ads.internal.overlay.zzw com_google_android_gms_ads_internal_overlay_zzw, ahr com_google_android_gms_internal_ahr, zzag com_google_android_gms_ads_internal_overlay_zzag, boolean z, aiu com_google_android_gms_internal_aiu, zzw com_google_android_gms_ads_internal_zzw, aog com_google_android_gms_internal_aog, dq dqVar) {
        if (com_google_android_gms_ads_internal_zzw == null) {
            com_google_android_gms_ads_internal_zzw = new zzw(this.f6287a.getContext(), dqVar, null);
        }
        this.f6295i = new anv(this.f6287a, com_google_android_gms_internal_aog);
        this.f6297k = dqVar;
        m5728a("/appEvent", new ahq(com_google_android_gms_internal_ahr));
        m5728a("/backButton", ahu.f5124j);
        m5728a("/refresh", ahu.f5125k);
        m5728a("/canOpenURLs", ahu.f5115a);
        m5728a("/canOpenIntents", ahu.f5116b);
        m5728a("/click", ahu.f5117c);
        m5728a("/close", ahu.f5118d);
        m5728a("/customClose", ahu.f5119e);
        m5728a("/instrument", ahu.f5130p);
        m5728a("/delayPageLoaded", ahu.f5132r);
        m5728a("/delayPageClosed", ahu.f5133s);
        m5728a("/getLocationInfo", ahu.f5134t);
        m5728a("/httpTrack", ahu.f5120f);
        m5728a("/log", ahu.f5121g);
        m5728a("/mraid", new aix(com_google_android_gms_ads_internal_zzw, this.f6295i));
        m5728a("/mraidLoaded", this.f6308x);
        m5728a("/open", new aiz(com_google_android_gms_ads_internal_zzw, this.f6295i));
        m5728a("/precache", ahu.f5129o);
        m5728a("/touch", ahu.f5123i);
        m5728a("/video", ahu.f5126l);
        m5728a("/videoMeta", ahu.f5127m);
        if (zzbv.zzez().m5296a(this.f6287a.getContext())) {
            m5728a("/logScionEvent", ahu.f5128n);
        }
        if (com_google_android_gms_internal_aiu != null) {
            m5728a("/setInterstitialProperties", new ait(com_google_android_gms_internal_aiu));
        }
        this.f6299o = zqVar;
        this.f6300p = com_google_android_gms_ads_internal_overlay_zzw;
        this.f6301q = com_google_android_gms_internal_ahr;
        this.f6307w = com_google_android_gms_ads_internal_overlay_zzag;
        this.f6294h = com_google_android_gms_ads_internal_zzw;
        this.f6309y = com_google_android_gms_internal_aog;
        this.f6302r = com_google_android_gms_internal_aiu;
        this.f6292f = z;
    }

    public final void m5728a(String str, ail com_google_android_gms_internal_ail) {
        synchronized (this.f6288b) {
            List list = (List) this.f6298n.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f6298n.put(str, list);
            }
            list.add(com_google_android_gms_internal_ail);
        }
    }

    public final void m5729a(boolean z, int i) {
        zq zqVar = (!this.f6287a.mo2170o() || this.f6287a.mo2162j().f7761d) ? this.f6299o : null;
        m5719a(new AdOverlayInfoParcel(zqVar, this.f6300p, this.f6307w, this.f6287a, z, i, this.f6287a.mo2169n()));
    }

    public final void m5730a(boolean z, int i, String str) {
        com.google.android.gms.ads.internal.overlay.zzw com_google_android_gms_ads_internal_overlay_zzw = null;
        boolean o = this.f6287a.mo2170o();
        zq zqVar = (!o || this.f6287a.mo2162j().f7761d) ? this.f6299o : null;
        if (!o) {
            com_google_android_gms_ads_internal_overlay_zzw = new jn(this.f6287a, this.f6300p);
        }
        m5719a(new AdOverlayInfoParcel(zqVar, com_google_android_gms_ads_internal_overlay_zzw, this.f6301q, this.f6307w, this.f6287a, z, i, str, this.f6287a.mo2169n()));
    }

    public final void m5731a(boolean z, int i, String str, String str2) {
        com.google.android.gms.ads.internal.overlay.zzw com_google_android_gms_ads_internal_overlay_zzw = null;
        boolean o = this.f6287a.mo2170o();
        zq zqVar = (!o || this.f6287a.mo2162j().f7761d) ? this.f6299o : null;
        if (!o) {
            com_google_android_gms_ads_internal_overlay_zzw = new jn(this.f6287a, this.f6300p);
        }
        m5719a(new AdOverlayInfoParcel(zqVar, com_google_android_gms_ads_internal_overlay_zzw, this.f6301q, this.f6307w, this.f6287a, z, i, str, str2, this.f6287a.mo2169n()));
    }

    public final boolean m5732a() {
        boolean z;
        synchronized (this.f6288b) {
            z = this.f6293g;
        }
        return z;
    }

    public final void m5733b(String str, ail com_google_android_gms_internal_ail) {
        synchronized (this.f6288b) {
            List list = (List) this.f6298n.get(str);
            if (list == null) {
                return;
            }
            list.remove(com_google_android_gms_internal_ail);
        }
    }

    public final boolean m5734b() {
        boolean z;
        synchronized (this.f6288b) {
            z = this.f6303s;
        }
        return z;
    }

    public final OnGlobalLayoutListener m5735c() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f6288b) {
            onGlobalLayoutListener = this.f6304t;
        }
        return onGlobalLayoutListener;
    }

    public final OnScrollChangedListener m5736d() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f6288b) {
            onScrollChangedListener = this.f6305u;
        }
        return onScrollChangedListener;
    }

    public final boolean m5737e() {
        boolean z;
        synchronized (this.f6288b) {
            z = this.f6306v;
        }
        return z;
    }

    public final void m5738f() {
        synchronized (this.f6288b) {
            es.m5373a();
            this.f6310z = true;
            this.f6287a.mo2144a("about:blank");
        }
    }

    public final void m5739g() {
        dq dqVar = this.f6297k;
        if (dqVar != null) {
            View a = this.f6287a.mo2136a();
            if (C0679r.m1901B(a)) {
                m5718a(a, dqVar, 10);
                return;
            }
            m5722l();
            this.f6286D = new ji(this, dqVar);
            jf jfVar = this.f6287a;
            if (jfVar == null) {
                throw null;
            }
            ((View) jfVar).addOnAttachStateChangeListener(this.f6286D);
        }
    }

    public final void m5740h() {
        synchronized (this.f6288b) {
            this.f6306v = true;
        }
        this.f6285C++;
        m5723m();
    }

    public final void m5741i() {
        this.f6285C--;
        m5723m();
    }

    public final void m5742j() {
        this.f6284B = true;
        m5723m();
    }

    public final void m5743k() {
        if (this.f6297k != null) {
            this.f6297k.mo2082d();
            this.f6297k = null;
        }
        m5722l();
        synchronized (this.f6288b) {
            this.f6298n.clear();
            this.f6299o = null;
            this.f6300p = null;
            this.f6289c = null;
            this.f6290d = null;
            this.f6301q = null;
            this.f6292f = false;
            this.f6293g = false;
            this.f6303s = false;
            this.f6306v = false;
            this.f6307w = null;
            this.f6291e = null;
            if (this.f6295i != null) {
                this.f6295i.m4987a(true);
                this.f6295i = null;
            }
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        String str2 = "Loading resource: ";
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        es.m5373a();
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m5717a(parse);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r3, java.lang.String r4) {
        /*
        r2 = this;
        r1 = r2.f6288b;
        monitor-enter(r1);
        r0 = r2.f6310z;	 Catch:{ all -> 0x0025 }
        if (r0 == 0) goto L_0x0011;
    L_0x0007:
        com.google.android.gms.internal.es.m5373a();	 Catch:{ all -> 0x0025 }
        r0 = r2.f6287a;	 Catch:{ all -> 0x0025 }
        r0.mo2175r();	 Catch:{ all -> 0x0025 }
        monitor-exit(r1);	 Catch:{ all -> 0x0025 }
    L_0x0010:
        return;
    L_0x0011:
        monitor-exit(r1);	 Catch:{ all -> 0x0025 }
        r0 = 1;
        r2.f6283A = r0;
        r0 = r2.f6290d;
        if (r0 == 0) goto L_0x0021;
    L_0x0019:
        r0 = r2.f6290d;
        r0.mo2016a();
        r0 = 0;
        r2.f6290d = r0;
    L_0x0021:
        r2.m5723m();
        goto L_0x0010;
    L_0x0025:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0025 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jg.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String valueOf = (i >= 0 || (-i) - 1 >= f6281l.length) ? String.valueOf(i) : f6281l[(-i) - 1];
        m5716a(this.f6287a.getContext(), "http_err", valueOf, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            String valueOf = (primaryError < 0 || primaryError >= f6282m.length) ? String.valueOf(primaryError) : f6282m[primaryError];
            m5716a(this.f6287a.getContext(), "ssl_err", valueOf, zzbv.zzec().mo2105a(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Throwable e;
        try {
            String a = dy.m5309a(str, this.f6287a.getContext());
            if (a.equals(str)) {
                zzie a2 = zzie.m7103a(str);
                if (a2 == null) {
                    return null;
                }
                zzib a3 = zzbv.zzef().m7049a(a2);
                return (a3 == null || !a3.m7100a()) ? null : new WebResourceResponse("", "", a3.m7101b());
            } else {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(a).openConnection();
                zzbv.zzea().m5505a(this.f6287a.getContext(), this.f6287a.mo2169n().f7706a, true, httpURLConnection);
                return new WebResourceResponse(httpURLConnection.getContentType(), httpURLConnection.getHeaderField("encoding"), httpURLConnection.getInputStream());
            }
        } catch (Exception e2) {
            e = e2;
            zzbv.zzee().m5336a(e, "AdWebViewClient.shouldInterceptRequest");
            return null;
        } catch (NoClassDefFoundError e3) {
            e = e3;
            zzbv.zzee().m5336a(e, "AdWebViewClient.shouldInterceptRequest");
            return null;
        }
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case 79:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 222:
                return true;
            default:
                return false;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = "AdWebView shouldOverrideUrlLoading: ";
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        es.m5373a();
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m5717a(parse);
        } else {
            if (this.f6292f && webView == this.f6287a.mo2136a()) {
                str2 = parse.getScheme();
                Object obj = ("http".equalsIgnoreCase(str2) || "https".equalsIgnoreCase(str2)) ? 1 : null;
                if (obj != null) {
                    if (this.f6299o != null) {
                        if (((Boolean) zzbv.zzen().m4217a(ado.ac)).booleanValue()) {
                            this.f6299o.onAdClicked();
                            if (this.f6297k != null) {
                                this.f6297k.mo2078a(str);
                            }
                            this.f6299o = null;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.f6287a.mo2136a().willNotDraw()) {
                valueOf = "AdWebView unable to handle URL: ";
                str2 = String.valueOf(str);
                id.m5370a(str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf));
            } else {
                Uri uri;
                try {
                    Uri uri2;
                    nh m = this.f6287a.mo2168m();
                    if (m == null || !m.m6064b(parse)) {
                        uri2 = parse;
                    } else {
                        Context context = this.f6287a.getContext();
                        jf jfVar = this.f6287a;
                        if (jfVar == null) {
                            throw null;
                        }
                        uri2 = m.m6060a(parse, context, (View) jfVar);
                    }
                    uri = uri2;
                } catch (ni e) {
                    String str3 = "Unable to append parameter to URL: ";
                    str2 = String.valueOf(str);
                    id.m5370a(str2.length() != 0 ? str3.concat(str2) : new String(str3));
                    uri = parse;
                }
                if (this.f6294h == null || this.f6294h.zzcq()) {
                    m5726a(new zzc("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
                } else {
                    this.f6294h.zzs(str);
                }
            }
        }
        return true;
    }
}
