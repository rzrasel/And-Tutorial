package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class ge extends WebView implements DownloadListener {
    private final gi f1457a;
    private final gf f1458b;
    private final Object f1459c = new Object();
    private final ne f1460d;
    private final dx f1461e;
    private cl f1462f;
    private ak f1463g;
    private boolean f1464h;
    private boolean f1465i;
    private final WindowManager f1466j;

    private ge(gf gfVar, ak akVar, boolean z, boolean z2, ne neVar, dx dxVar) {
        super(gfVar);
        this.f1458b = gfVar;
        this.f1463g = akVar;
        this.f1464h = z;
        this.f1460d = neVar;
        this.f1461e = dxVar;
        this.f1466j = (WindowManager) getContext().getSystemService("window");
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        fo.m1993a((Context) gfVar, dxVar.f1222b, settings);
        if (VERSION.SDK_INT >= 17) {
            fw.m2020a(getContext(), settings);
            settings.setMediaPlaybackRequiresUserGesture(false);
        } else if (VERSION.SDK_INT >= 11) {
            fw.m2020a(getContext(), settings);
        }
        setDownloadListener(this);
        if (VERSION.SDK_INT >= 11) {
            this.f1457a = new gt(this, z2);
        } else {
            this.f1457a = new gi(this, z2);
        }
        setWebViewClient(this.f1457a);
        if (VERSION.SDK_INT >= 14) {
            setWebChromeClient(new gu(this));
        } else if (VERSION.SDK_INT >= 11) {
            setWebChromeClient(new gl(this));
        }
        m2083j();
    }

    public static ge m2081a(Context context, ak akVar, boolean z, boolean z2, ne neVar, dx dxVar) {
        return new ge(new gf(context), akVar, z, z2, neVar, dxVar);
    }

    private void m2082b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("javascript:AFMA_ReceiveMessage('");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(",");
        stringBuilder.append(jSONObject2);
        stringBuilder.append(");");
        "Dispatching AFMA event: " + stringBuilder;
        gb.m2071a(2);
        loadUrl(stringBuilder.toString());
    }

    private void m2083j() {
        synchronized (this.f1459c) {
            if (this.f1464h || this.f1463g.f938e) {
                if (VERSION.SDK_INT < 14) {
                    gb.m2071a(3);
                    m2084k();
                } else {
                    gb.m2071a(3);
                    m2085l();
                }
            } else if (VERSION.SDK_INT < 18) {
                gb.m2071a(3);
                m2084k();
            } else {
                gb.m2071a(3);
                m2085l();
            }
        }
    }

    private void m2084k() {
        synchronized (this.f1459c) {
            if (!this.f1465i && VERSION.SDK_INT >= 11) {
                setLayerType(1, null);
            }
            this.f1465i = true;
        }
    }

    private void m2085l() {
        synchronized (this.f1459c) {
            if (this.f1465i && VERSION.SDK_INT >= 11) {
                setLayerType(0, null);
            }
            this.f1465i = false;
        }
    }

    public final void m2086a() {
        if (this.f1457a.m2125a()) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = this.f1466j.getDefaultDisplay();
            defaultDisplay.getMetrics(displayMetrics);
            try {
                m2082b("onScreenInfoChanged", new JSONObject().put("width", displayMetrics.widthPixels).put("height", displayMetrics.heightPixels).put("density", (double) displayMetrics.density).put("rotation", defaultDisplay.getRotation()));
            } catch (JSONException e) {
                gb.m2071a(6);
            }
        }
    }

    public final void m2087a(Context context, ak akVar) {
        synchronized (this.f1459c) {
            this.f1458b.setBaseContext(context);
            this.f1462f = null;
            this.f1463g = akVar;
            this.f1464h = false;
            fo.m2007b((WebView) this);
            loadUrl("about:blank");
            this.f1457a.m2126b();
        }
    }

    public final void m2088a(ak akVar) {
        synchronized (this.f1459c) {
            this.f1463g = akVar;
            requestLayout();
        }
    }

    public final void m2089a(cl clVar) {
        synchronized (this.f1459c) {
            this.f1462f = clVar;
        }
    }

    public final void m2090a(String str, Map map) {
        try {
            m2082b(str, fo.m1992a(map));
        } catch (JSONException e) {
            gb.m2069a("Could not convert parameters to JSON.");
        }
    }

    public final void m2091a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("javascript:" + str + "(");
        stringBuilder.append(jSONObject2);
        stringBuilder.append(");");
        loadUrl(stringBuilder.toString());
    }

    public final void m2092a(boolean z) {
        synchronized (this.f1459c) {
            this.f1464h = z;
            m2083j();
        }
    }

    public final void m2093b() {
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.f1461e.f1222b);
        m2090a("onhide", hashMap);
    }

    public final void m2094c() {
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.f1461e.f1222b);
        m2090a("onshow", hashMap);
    }

    public final cl m2095d() {
        cl clVar;
        synchronized (this.f1459c) {
            clVar = this.f1462f;
        }
        return clVar;
    }

    public final ak m2096e() {
        ak akVar;
        synchronized (this.f1459c) {
            akVar = this.f1463g;
        }
        return akVar;
    }

    public final gi m2097f() {
        return this.f1457a;
    }

    public final ne m2098g() {
        return this.f1460d;
    }

    public final dx m2099h() {
        return this.f1461e;
    }

    public final boolean m2100i() {
        boolean z;
        synchronized (this.f1459c) {
            z = this.f1464h;
        }
        return z;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            getContext().startActivity(intent);
        } catch (ActivityNotFoundException e) {
            "Couldn't find an Activity to view url/mimetype: " + str + " / " + str4;
            gb.m2071a(3);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void onMeasure(int r10, int r11) {
        /*
        r9 = this;
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = 8;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r4 = r9.f1459c;
        monitor-enter(r4);
        r1 = r9.isInEditMode();	 Catch:{ all -> 0x0090 }
        if (r1 != 0) goto L_0x0016;
    L_0x0012:
        r1 = r9.f1464h;	 Catch:{ all -> 0x0090 }
        if (r1 == 0) goto L_0x001b;
    L_0x0016:
        super.onMeasure(r10, r11);	 Catch:{ all -> 0x0090 }
        monitor-exit(r4);	 Catch:{ all -> 0x0090 }
    L_0x001a:
        return;
    L_0x001b:
        r2 = android.view.View.MeasureSpec.getMode(r10);	 Catch:{ all -> 0x0090 }
        r3 = android.view.View.MeasureSpec.getSize(r10);	 Catch:{ all -> 0x0090 }
        r5 = android.view.View.MeasureSpec.getMode(r11);	 Catch:{ all -> 0x0090 }
        r1 = android.view.View.MeasureSpec.getSize(r11);	 Catch:{ all -> 0x0090 }
        if (r2 == r6) goto L_0x002f;
    L_0x002d:
        if (r2 != r8) goto L_0x00a9;
    L_0x002f:
        r2 = r3;
    L_0x0030:
        if (r5 == r6) goto L_0x0034;
    L_0x0032:
        if (r5 != r8) goto L_0x0035;
    L_0x0034:
        r0 = r1;
    L_0x0035:
        r5 = r9.f1463g;	 Catch:{ all -> 0x0090 }
        r5 = r5.f940g;	 Catch:{ all -> 0x0090 }
        if (r5 > r2) goto L_0x0041;
    L_0x003b:
        r2 = r9.f1463g;	 Catch:{ all -> 0x0090 }
        r2 = r2.f937d;	 Catch:{ all -> 0x0090 }
        if (r2 <= r0) goto L_0x0093;
    L_0x0041:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0090 }
        r2 = "Not enough space to show ad. Needs ";
        r0.<init>(r2);	 Catch:{ all -> 0x0090 }
        r2 = r9.f1463g;	 Catch:{ all -> 0x0090 }
        r2 = r2.f940g;	 Catch:{ all -> 0x0090 }
        r0 = r0.append(r2);	 Catch:{ all -> 0x0090 }
        r2 = "x";
        r0 = r0.append(r2);	 Catch:{ all -> 0x0090 }
        r2 = r9.f1463g;	 Catch:{ all -> 0x0090 }
        r2 = r2.f937d;	 Catch:{ all -> 0x0090 }
        r0 = r0.append(r2);	 Catch:{ all -> 0x0090 }
        r2 = " pixels, but only has ";
        r0 = r0.append(r2);	 Catch:{ all -> 0x0090 }
        r0 = r0.append(r3);	 Catch:{ all -> 0x0090 }
        r2 = "x";
        r0 = r0.append(r2);	 Catch:{ all -> 0x0090 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x0090 }
        r1 = " pixels.";
        r0 = r0.append(r1);	 Catch:{ all -> 0x0090 }
        r0 = r0.toString();	 Catch:{ all -> 0x0090 }
        com.google.android.gms.internal.gb.m2069a(r0);	 Catch:{ all -> 0x0090 }
        r0 = r9.getVisibility();	 Catch:{ all -> 0x0090 }
        if (r0 == r7) goto L_0x0089;
    L_0x0085:
        r0 = 4;
        r9.setVisibility(r0);	 Catch:{ all -> 0x0090 }
    L_0x0089:
        r0 = 0;
        r1 = 0;
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x0090 }
    L_0x008e:
        monitor-exit(r4);	 Catch:{ all -> 0x0090 }
        goto L_0x001a;
    L_0x0090:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x0093:
        r0 = r9.getVisibility();	 Catch:{ all -> 0x0090 }
        if (r0 == r7) goto L_0x009d;
    L_0x0099:
        r0 = 0;
        r9.setVisibility(r0);	 Catch:{ all -> 0x0090 }
    L_0x009d:
        r0 = r9.f1463g;	 Catch:{ all -> 0x0090 }
        r0 = r0.f940g;	 Catch:{ all -> 0x0090 }
        r1 = r9.f1463g;	 Catch:{ all -> 0x0090 }
        r1 = r1.f937d;	 Catch:{ all -> 0x0090 }
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x0090 }
        goto L_0x008e;
    L_0x00a9:
        r2 = r0;
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ge.onMeasure(int, int):void");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1460d != null) {
            this.f1460d.f1971a.mo941a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setContext(Context context) {
        this.f1458b.setBaseContext(context);
    }
}
