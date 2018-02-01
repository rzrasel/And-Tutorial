package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings.System;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public final class wk implements OnGlobalLayoutListener, OnScrollChangedListener {
    Object f7336a = new Object();
    protected final wi f7337b;
    wr f7338c;
    private final WeakReference<ee> f7339d;
    private WeakReference<ViewTreeObserver> f7340e;
    private final xv f7341f;
    private final Context f7342g;
    private final WindowManager f7343h;
    private final PowerManager f7344i;
    private final KeyguardManager f7345j;
    private final DisplayMetrics f7346k;
    private boolean f7347l;
    private boolean f7348m = false;
    private boolean f7349n = false;
    private boolean f7350o;
    private boolean f7351p;
    private boolean f7352q;
    private BroadcastReceiver f7353r;
    private final HashSet<Object> f7354s = new HashSet();
    private hr f7355t;
    private final HashSet<xg> f7356u = new HashSet();
    private final Rect f7357v = new Rect();
    private final wn f7358w;
    private float f7359x;

    public wk(Context context, zzjb com_google_android_gms_internal_zzjb, ee eeVar, zzajk com_google_android_gms_internal_zzajk, xv xvVar) {
        this.f7339d = new WeakReference(eeVar);
        this.f7341f = xvVar;
        this.f7340e = new WeakReference(null);
        this.f7350o = true;
        this.f7352q = false;
        this.f7355t = new hr(200);
        this.f7337b = new wi(UUID.randomUUID().toString(), com_google_android_gms_internal_zzajk, com_google_android_gms_internal_zzjb.f7758a, eeVar.f5961j, eeVar.m5317a(), com_google_android_gms_internal_zzjb.f7765h);
        this.f7343h = (WindowManager) context.getSystemService("window");
        this.f7344i = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.f7345j = (KeyguardManager) context.getSystemService("keyguard");
        this.f7342g = context;
        this.f7358w = new wn(this, new Handler());
        this.f7342g.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this.f7358w);
        this.f7346k = context.getResources().getDisplayMetrics();
        Display defaultDisplay = this.f7343h.getDefaultDisplay();
        this.f7357v.right = defaultDisplay.getWidth();
        this.f7357v.bottom = defaultDisplay.getHeight();
        m6930a();
    }

    private static int m6922a(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    private final JSONObject m6923a(View view, Boolean bool) {
        if (view == null) {
            return m6928i().put("isAttachedToWindow", false).put("isScreenOn", m6929j()).put("isVisible", false);
        }
        boolean a = zzbv.zzec().mo2113a(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Exception e) {
            id.m5372a(6);
        }
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view.getHitRect(rect4);
        JSONObject i = m6928i();
        i.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", a).put("viewBox", new JSONObject().put("top", m6922a(this.f7357v.top, this.f7346k)).put("bottom", m6922a(this.f7357v.bottom, this.f7346k)).put("left", m6922a(this.f7357v.left, this.f7346k)).put("right", m6922a(this.f7357v.right, this.f7346k))).put("adBox", new JSONObject().put("top", m6922a(rect.top, this.f7346k)).put("bottom", m6922a(rect.bottom, this.f7346k)).put("left", m6922a(rect.left, this.f7346k)).put("right", m6922a(rect.right, this.f7346k))).put("globalVisibleBox", new JSONObject().put("top", m6922a(rect2.top, this.f7346k)).put("bottom", m6922a(rect2.bottom, this.f7346k)).put("left", m6922a(rect2.left, this.f7346k)).put("right", m6922a(rect2.right, this.f7346k))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", m6922a(rect3.top, this.f7346k)).put("bottom", m6922a(rect3.bottom, this.f7346k)).put("left", m6922a(rect3.left, this.f7346k)).put("right", m6922a(rect3.right, this.f7346k))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", m6922a(rect4.top, this.f7346k)).put("bottom", m6922a(rect4.bottom, this.f7346k)).put("left", m6922a(rect4.left, this.f7346k)).put("right", m6922a(rect4.right, this.f7346k))).put("screenDensity", (double) this.f7346k.density);
        if (bool == null) {
            zzbv.zzea();
            bool = Boolean.valueOf(gb.m5460a(view, this.f7344i, this.f7345j));
        }
        i.put("isVisible", bool.booleanValue());
        return i;
    }

    private static JSONObject m6924a(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    private final void m6925a(JSONObject jSONObject, boolean z) {
        try {
            JSONObject a = m6924a(jSONObject);
            ArrayList arrayList = new ArrayList(this.f7356u);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((xg) obj).mo2321a(a, z);
            }
        } catch (Throwable th) {
            id.m5372a(6);
        }
    }

    private final void m6926g() {
        if (this.f7338c != null) {
            this.f7338c.mo2317a(this);
        }
    }

    private final void m6927h() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f7340e.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    private final JSONObject m6928i() {
        JSONObject jSONObject = new JSONObject();
        zzbv.zzea();
        zzbv.zzea();
        jSONObject.put("afmaVersion", this.f7337b.f7327d).put("activeViewJSON", this.f7337b.f7325b).put("timestamp", zzbv.zzeg().mo1670b()).put("adFormat", this.f7337b.f7324a).put("hashCode", this.f7337b.f7326c).put("isMraid", this.f7337b.f7328e).put("isStopped", this.f7349n).put("isPaused", this.f7348m).put("isNative", this.f7337b.f7329f).put("isScreenOn", m6929j()).put("appMuted", gb.m5487e()).put("appVolume", (double) gb.m5482d()).put("deviceVolume", (double) this.f7359x);
        return jSONObject;
    }

    private final boolean m6929j() {
        return VERSION.SDK_INT >= 20 ? this.f7344i.isInteractive() : this.f7344i.isScreenOn();
    }

    public final void m6930a() {
        zzbv.zzea();
        this.f7359x = gb.m5494h(this.f7342g);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void m6931a(int r8) {
        /*
        r7 = this;
        r2 = 0;
        r1 = 1;
        r4 = r7.f7336a;
        monitor-enter(r4);
        r0 = r7.f7356u;	 Catch:{ all -> 0x005c }
        r3 = r0.iterator();	 Catch:{ all -> 0x005c }
    L_0x000b:
        r0 = r3.hasNext();	 Catch:{ all -> 0x005c }
        if (r0 == 0) goto L_0x0026;
    L_0x0011:
        r0 = r3.next();	 Catch:{ all -> 0x005c }
        r0 = (com.google.android.gms.internal.xg) r0;	 Catch:{ all -> 0x005c }
        r0 = r0.mo2322a();	 Catch:{ all -> 0x005c }
        if (r0 == 0) goto L_0x000b;
    L_0x001d:
        r0 = r1;
    L_0x001e:
        if (r0 == 0) goto L_0x0024;
    L_0x0020:
        r0 = r7.f7350o;	 Catch:{ all -> 0x005c }
        if (r0 != 0) goto L_0x0028;
    L_0x0024:
        monitor-exit(r4);	 Catch:{ all -> 0x005c }
    L_0x0025:
        return;
    L_0x0026:
        r0 = r2;
        goto L_0x001e;
    L_0x0028:
        r0 = r7.f7341f;	 Catch:{ all -> 0x005c }
        r5 = r0.mo2318a();	 Catch:{ all -> 0x005c }
        if (r5 == 0) goto L_0x005f;
    L_0x0030:
        com.google.android.gms.ads.internal.zzbv.zzea();	 Catch:{ all -> 0x005c }
        r0 = r7.f7344i;	 Catch:{ all -> 0x005c }
        r3 = r7.f7345j;	 Catch:{ all -> 0x005c }
        r0 = com.google.android.gms.internal.gb.m5460a(r5, r0, r3);	 Catch:{ all -> 0x005c }
        if (r0 == 0) goto L_0x005f;
    L_0x003d:
        r3 = r1;
    L_0x003e:
        if (r5 == 0) goto L_0x0061;
    L_0x0040:
        if (r3 == 0) goto L_0x0061;
    L_0x0042:
        r0 = new android.graphics.Rect;	 Catch:{ all -> 0x005c }
        r0.<init>();	 Catch:{ all -> 0x005c }
        r6 = 0;
        r0 = r5.getGlobalVisibleRect(r0, r6);	 Catch:{ all -> 0x005c }
        if (r0 == 0) goto L_0x0061;
    L_0x004e:
        r0 = r1;
    L_0x004f:
        r2 = r7.f7341f;	 Catch:{ all -> 0x005c }
        r2 = r2.mo2319b();	 Catch:{ all -> 0x005c }
        if (r2 == 0) goto L_0x0063;
    L_0x0057:
        r7.m6935b();	 Catch:{ all -> 0x005c }
        monitor-exit(r4);	 Catch:{ all -> 0x005c }
        goto L_0x0025;
    L_0x005c:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x005c }
        throw r0;
    L_0x005f:
        r3 = r2;
        goto L_0x003e;
    L_0x0061:
        r0 = r2;
        goto L_0x004f;
    L_0x0063:
        if (r8 != r1) goto L_0x0073;
    L_0x0065:
        r2 = r7.f7355t;	 Catch:{ all -> 0x005c }
        r2 = r2.m5599a();	 Catch:{ all -> 0x005c }
        if (r2 != 0) goto L_0x0073;
    L_0x006d:
        r2 = r7.f7352q;	 Catch:{ all -> 0x005c }
        if (r0 != r2) goto L_0x0073;
    L_0x0071:
        monitor-exit(r4);	 Catch:{ all -> 0x005c }
        goto L_0x0025;
    L_0x0073:
        if (r0 != 0) goto L_0x007d;
    L_0x0075:
        r2 = r7.f7352q;	 Catch:{ all -> 0x005c }
        if (r2 != 0) goto L_0x007d;
    L_0x0079:
        if (r8 != r1) goto L_0x007d;
    L_0x007b:
        monitor-exit(r4);	 Catch:{ all -> 0x005c }
        goto L_0x0025;
    L_0x007d:
        r1 = java.lang.Boolean.valueOf(r3);	 Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00ca }
        r1 = r7.m6923a(r5, r1);	 Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00ca }
        r2 = 0;
        r7.m6925a(r1, r2);	 Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00ca }
        r7.f7352q = r0;	 Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00ca }
    L_0x008b:
        r0 = r7.f7341f;	 Catch:{ all -> 0x005c }
        r0 = r0.mo2320c();	 Catch:{ all -> 0x005c }
        r1 = r0.mo2318a();	 Catch:{ all -> 0x005c }
        if (r1 == 0) goto L_0x00c4;
    L_0x0097:
        r0 = r7.f7340e;	 Catch:{ all -> 0x005c }
        r0 = r0.get();	 Catch:{ all -> 0x005c }
        r0 = (android.view.ViewTreeObserver) r0;	 Catch:{ all -> 0x005c }
        r1 = r1.getViewTreeObserver();	 Catch:{ all -> 0x005c }
        if (r1 == r0) goto L_0x00c4;
    L_0x00a5:
        r7.m6927h();	 Catch:{ all -> 0x005c }
        r2 = r7.f7347l;	 Catch:{ all -> 0x005c }
        if (r2 == 0) goto L_0x00b4;
    L_0x00ac:
        if (r0 == 0) goto L_0x00bd;
    L_0x00ae:
        r0 = r0.isAlive();	 Catch:{ all -> 0x005c }
        if (r0 == 0) goto L_0x00bd;
    L_0x00b4:
        r0 = 1;
        r7.f7347l = r0;	 Catch:{ all -> 0x005c }
        r1.addOnScrollChangedListener(r7);	 Catch:{ all -> 0x005c }
        r1.addOnGlobalLayoutListener(r7);	 Catch:{ all -> 0x005c }
    L_0x00bd:
        r0 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x005c }
        r0.<init>(r1);	 Catch:{ all -> 0x005c }
        r7.f7340e = r0;	 Catch:{ all -> 0x005c }
    L_0x00c4:
        r7.m6926g();	 Catch:{ all -> 0x005c }
        monitor-exit(r4);	 Catch:{ all -> 0x005c }
        goto L_0x0025;
    L_0x00ca:
        r0 = move-exception;
    L_0x00cb:
        r0 = 3;
        com.google.android.gms.internal.id.m5372a(r0);	 Catch:{ all -> 0x005c }
        goto L_0x008b;
    L_0x00d0:
        r0 = move-exception;
        goto L_0x00cb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wk.a(int):void");
    }

    final void m6932a(jf jfVar) {
        if (jfVar == null) {
            throw null;
        }
        m6931a(3);
    }

    final void m6933a(xg xgVar) {
        String str = "Received request to untrack: ";
        String valueOf = String.valueOf(this.f7337b.f7326c);
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        id.m5372a(3);
        m6938c(xgVar);
    }

    final boolean m6934a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.f7337b.f7326c);
    }

    public final void m6935b() {
        synchronized (this.f7336a) {
            if (this.f7350o) {
                this.f7351p = true;
                try {
                    JSONObject i = m6928i();
                    i.put("doneReasonCode", "u");
                    m6925a(i, true);
                } catch (JSONException e) {
                    id.m5372a(6);
                } catch (RuntimeException e2) {
                    id.m5372a(6);
                }
                String str = "Untracking ad unit: ";
                String valueOf = String.valueOf(this.f7337b.f7326c);
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                id.m5372a(3);
            }
        }
    }

    public final void m6936b(xg xgVar) {
        if (this.f7356u.isEmpty()) {
            synchronized (this.f7336a) {
                if (this.f7353r != null) {
                } else {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    this.f7353r = new wl(this);
                    this.f7342g.registerReceiver(this.f7353r, intentFilter);
                }
            }
            m6931a(3);
        }
        this.f7356u.add(xgVar);
        try {
            xgVar.mo2321a(m6924a(m6923a(this.f7341f.mo2318a(), null)), false);
        } catch (JSONException e) {
            id.m5372a(6);
        }
    }

    final void m6937b(Map<String, String> map) {
        if (map.containsKey("isVisible")) {
            if (!"1".equals(map.get("isVisible"))) {
                "true".equals(map.get("isVisible"));
            }
            Iterator it = this.f7354s.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void m6938c(xg xgVar) {
        this.f7356u.remove(xgVar);
        xgVar.mo2323b();
        if (this.f7356u.isEmpty()) {
            synchronized (this.f7336a) {
                m6927h();
                synchronized (this.f7336a) {
                    if (this.f7353r != null) {
                        try {
                            this.f7342g.unregisterReceiver(this.f7353r);
                        } catch (IllegalStateException e) {
                            id.m5372a(6);
                        } catch (Throwable e2) {
                            zzbv.zzee().m5336a(e2, "ActiveViewUnit.stopScreenStatusMonitoring");
                        }
                        this.f7353r = null;
                    }
                }
                this.f7342g.getContentResolver().unregisterContentObserver(this.f7358w);
                this.f7350o = false;
                m6926g();
                ArrayList arrayList = new ArrayList(this.f7356u);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    m6938c((xg) obj);
                }
            }
        }
    }

    public final boolean m6939c() {
        boolean z;
        synchronized (this.f7336a) {
            z = this.f7350o;
        }
        return z;
    }

    public final void m6940d() {
        synchronized (this.f7336a) {
            this.f7349n = true;
            m6931a(3);
        }
    }

    public final void m6941e() {
        synchronized (this.f7336a) {
            this.f7348m = true;
            m6931a(3);
        }
    }

    public final void m6942f() {
        synchronized (this.f7336a) {
            this.f7348m = false;
            m6931a(3);
        }
    }

    public final void onGlobalLayout() {
        m6931a(2);
    }

    public final void onScrollChanged() {
        m6931a(1);
    }
}
