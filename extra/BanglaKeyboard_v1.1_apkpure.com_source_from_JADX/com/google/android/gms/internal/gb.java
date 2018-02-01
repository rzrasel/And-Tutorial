package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.Process;
import android.support.customtabs.CustomTabsClient;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.js.zzl;
import com.google.android.gms.ads.internal.zzay;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C1537f;
import com.google.android.gms.common.util.C1538g;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public final class gb {
    public static final Handler f6131a = new et(Looper.getMainLooper());
    private static AtomicReference<List<String>> f6132c = new AtomicReference(null);
    private static AtomicReference<List<String>> f6133d = new AtomicReference(null);
    public boolean f6134b = false;
    private final Object f6135e = new Object();
    private boolean f6136f = true;
    private String f6137g;
    private zzl f6138h;

    public static Bitmap m5429a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    public static Uri m5430a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        return indexOf != -1 ? Uri.parse(new StringBuilder(str.substring(0, indexOf + 1)).append(str2).append("=").append(str3).append("&").append(str.substring(indexOf + 1)).toString()) : Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }

    public static Bundle m5431a(yd ydVar) {
        if (ydVar == null) {
            return null;
        }
        if (!((Boolean) zzbv.zzen().m4217a(ado.f4877P)).booleanValue()) {
            if (!((Boolean) zzbv.zzen().m4217a(ado.f4879R)).booleanValue()) {
                return null;
            }
        }
        if (zzbv.zzee().m5338a() && zzbv.zzee().m5342b()) {
            return null;
        }
        String str;
        String str2;
        String str3;
        if (ydVar.f7477a) {
            synchronized (ydVar.f7478b) {
                ydVar.f7477a = false;
                ydVar.f7478b.notifyAll();
                id.m5372a(3);
            }
        }
        xw a = ydVar.f7479c.m7005a();
        if (a != null) {
            str = a.f7443f;
            str2 = a.f7444g;
            String str4 = a.f7445h;
            if (str != null) {
                zzbv.zzee().m5331a(str);
            }
            if (str4 != null) {
                zzbv.zzee().m5340b(str4);
                str3 = str;
                str = str2;
                str2 = str4;
            } else {
                str3 = str;
                str = str2;
                str2 = str4;
            }
        } else {
            str = null;
            str3 = zzbv.zzee().m5350h();
            str2 = zzbv.zzee().m5351i();
        }
        Bundle bundle = new Bundle(1);
        if (str2 != null) {
            if (((Boolean) zzbv.zzen().m4217a(ado.f4879R)).booleanValue() && !zzbv.zzee().m5342b()) {
                bundle.putString("v_fp_vertical", str2);
            }
        }
        if (str3 != null) {
            if (((Boolean) zzbv.zzen().m4217a(ado.f4877P)).booleanValue() && !zzbv.zzee().m5338a()) {
                bundle.putString("fingerprint", str3);
                if (!str3.equals(str)) {
                    bundle.putString("v_fp", str);
                }
            }
        }
        return !bundle.isEmpty() ? bundle : null;
    }

    public static DisplayMetrics m5432a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static PopupWindow m5433a(View view, int i, int i2) {
        return new PopupWindow(view, i, i2, false);
    }

    public static String m5435a() {
        return UUID.randomUUID().toString();
    }

    public static String m5436a(Context context, View view, zzjb com_google_android_gms_internal_zzjb) {
        if (!((Boolean) zzbv.zzen().m4217a(ado.ad)).booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", com_google_android_gms_internal_zzjb.f7762e);
            jSONObject2.put("height", com_google_android_gms_internal_zzjb.f7759b);
            jSONObject.put("size", jSONObject2);
            jSONObject.put("activity", m5500m(context));
            if (!com_google_android_gms_internal_zzjb.f7761d) {
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        int i = -1;
                        if (parent instanceof ViewGroup) {
                            i = ((ViewGroup) parent).indexOfChild(view);
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", parent.getClass().getName());
                        jSONObject3.put("index_of_child", i);
                        jSONArray.put(jSONObject3);
                    }
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("parents", jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (Throwable e) {
            id.m5371a("Fail to get view hierarchy json", e);
            return null;
        }
    }

    private static String m5437a(Context context, nh nhVar, String str, View view) {
        Object obj = null;
        if (nhVar != null) {
            try {
                Uri parse = Uri.parse(str);
                if (nhVar.m6064b(parse)) {
                    for (String endsWith : nh.f6703d) {
                        if (parse.getPath().endsWith(endsWith)) {
                            obj = 1;
                            break;
                        }
                    }
                }
                if (obj != null) {
                    parse = nhVar.m6060a(parse, context, view);
                }
                str = parse.toString();
            } catch (Exception e) {
            }
        }
        return str;
    }

    public static String m5439a(jf jfVar, String str) {
        Context context = jfVar.getContext();
        nh m = jfVar.mo2168m();
        if (jfVar != null) {
            return m5437a(context, m, str, (View) jfVar);
        }
        throw null;
    }

    public static String m5440a(InputStreamReader inputStreamReader) {
        StringBuilder stringBuilder = new StringBuilder(FragmentTransaction.TRANSIT_EXIT_MASK);
        char[] cArr = new char[ItemAnimator.FLAG_MOVED];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return stringBuilder.toString();
            }
            stringBuilder.append(cArr, 0, read);
        }
    }

    public static String m5441a(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    public static Map<String, String> m5442a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : zzbv.zzec().mo2099a(uri)) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    private final JSONArray m5443a(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object a : collection) {
            m5453a(jSONArray, a);
        }
        return jSONArray;
    }

    public static void m5444a(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void m5445a(Activity activity, OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
        }
    }

    public static void m5446a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable th) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    @TargetApi(18)
    public static void m5447a(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            if (((Boolean) zzbv.zzen().m4217a(ado.cq)).booleanValue()) {
                m5471b(context, intent);
            }
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            new StringBuilder(String.valueOf(uri2).length() + 26).append("Opening ").append(uri2).append(" in a new browser.");
            id.m5372a(3);
        } catch (ActivityNotFoundException e) {
            id.m5372a(6);
        }
    }

    public static void m5448a(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            zzbv.zzea();
            bundle.putString("device", m5478c());
            bundle.putString("eids", TextUtils.join(",", ado.m4218a()));
        }
        aak.m4022a();
        hz.m5618a(context, str, str2, bundle, z, new ge(context, str));
    }

    public static void m5449a(Context context, String str, List<String> list) {
        for (String hqVar : list) {
            new hq(context, str, hqVar).mo1474g();
        }
    }

    public static void m5450a(Context context, List<String> list) {
        if (!(context instanceof Activity) || TextUtils.isEmpty(vp.m6848a((Activity) context))) {
            return;
        }
        if (list == null) {
            es.m5373a();
        } else if (aem.m4259a(context)) {
            aem com_google_android_gms_internal_aem = new aem();
            com_google_android_gms_internal_aem.f4961c = new gc(list, com_google_android_gms_internal_aem, context);
            Activity activity = (Activity) context;
            if (com_google_android_gms_internal_aem.f4959a == null) {
                String a = vp.m6848a(activity);
                if (a != null) {
                    com_google_android_gms_internal_aem.f4960b = new vq(com_google_android_gms_internal_aem);
                    CustomTabsClient.bindCustomTabsService(activity, a, com_google_android_gms_internal_aem.f4960b);
                }
            }
        } else {
            es.m5373a();
        }
    }

    public static void m5451a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f6131a.post(runnable);
        }
    }

    public static void m5452a(List<String> list, String str) {
        for (String hqVar : list) {
            new hq(hqVar, str).mo1474g();
        }
    }

    private final void m5453a(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(m5469b((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(m5504a((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(m5443a((Collection) obj));
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            JSONArray jSONArray2 = new JSONArray();
            for (Object a : objArr) {
                m5453a(jSONArray2, a);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    private final void m5454a(JSONObject jSONObject, String str, Object obj) {
        if (obj instanceof Bundle) {
            jSONObject.put(str, m5469b((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, m5504a((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, m5443a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m5443a(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    private static boolean m5455a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @TargetApi(24)
    public static boolean m5456a(Activity activity, Configuration configuration) {
        aak.m4022a();
        int a = hz.m5612a((Context) activity, configuration.screenHeightDp);
        int a2 = hz.m5612a((Context) activity, configuration.screenWidthDp);
        DisplayMetrics a3 = m5432a((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = a3.heightPixels;
        int i2 = a3.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        identifier = ((Integer) zzbv.zzen().m4217a(ado.cA)).intValue() * ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d));
        return m5455a(i, dimensionPixelSize + a, identifier) && m5455a(i2, a2, identifier);
    }

    public static boolean m5457a(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            id.m5370a("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        boolean z;
        String str = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
        if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
            id.m5370a(String.format(str, new Object[]{"keyboard"}));
            z = false;
        } else {
            z = true;
        }
        if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
            id.m5370a(String.format(str, new Object[]{"keyboardHidden"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
            id.m5370a(String.format(str, new Object[]{"orientation"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
            id.m5370a(String.format(str, new Object[]{"screenLayout"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 512) == 0) {
            id.m5370a(String.format(str, new Object[]{"uiMode"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 1024) == 0) {
            id.m5370a(String.format(str, new Object[]{"screenSize"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & ItemAnimator.FLAG_MOVED) != 0) {
            return z;
        }
        id.m5370a(String.format(str, new Object[]{"smallestScreenSize"}));
        return false;
    }

    public static boolean m5458a(Context context, String str, String str2) {
        return lm.m5976a(context).f6571a.getPackageManager().checkPermission(str2, str) == 0;
    }

    public static boolean m5459a(View view, Context context) {
        KeyguardManager keyguardManager = null;
        Context applicationContext = context.getApplicationContext();
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return m5460a(view, powerManager, keyguardManager);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m5460a(android.view.View r5, android.os.PowerManager r6, android.app.KeyguardManager r7) {
        /*
        r3 = 0;
        r2 = 1;
        r1 = 0;
        r0 = com.google.android.gms.ads.internal.zzbv.zzea();
        r0 = r0.f6136f;
        if (r0 != 0) goto L_0x0047;
    L_0x000b:
        if (r7 != 0) goto L_0x008a;
    L_0x000d:
        r0 = r1;
    L_0x000e:
        if (r0 == 0) goto L_0x0047;
    L_0x0010:
        r0 = com.google.android.gms.internal.ado.aX;
        r4 = com.google.android.gms.ads.internal.zzbv.zzen();
        r0 = r4.m4217a(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0098;
    L_0x0022:
        r0 = r5.getRootView();
        if (r0 == 0) goto L_0x008f;
    L_0x0028:
        r0 = r0.getContext();
        r4 = r0 instanceof android.app.Activity;
        if (r4 == 0) goto L_0x008f;
    L_0x0030:
        r0 = (android.app.Activity) r0;
    L_0x0032:
        if (r0 == 0) goto L_0x0096;
    L_0x0034:
        r0 = r0.getWindow();
        if (r0 != 0) goto L_0x0091;
    L_0x003a:
        r0 = r3;
    L_0x003b:
        if (r0 == 0) goto L_0x0096;
    L_0x003d:
        r0 = r0.flags;
        r3 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0 = r0 & r3;
        if (r0 == 0) goto L_0x0096;
    L_0x0044:
        r0 = r2;
    L_0x0045:
        if (r0 == 0) goto L_0x0098;
    L_0x0047:
        r0 = r2;
    L_0x0048:
        r3 = r5.getVisibility();
        if (r3 != 0) goto L_0x009c;
    L_0x004e:
        r3 = r5.isShown();
        if (r3 == 0) goto L_0x009c;
    L_0x0054:
        if (r6 == 0) goto L_0x005c;
    L_0x0056:
        r3 = r6.isScreenOn();
        if (r3 == 0) goto L_0x009a;
    L_0x005c:
        r3 = r2;
    L_0x005d:
        if (r3 == 0) goto L_0x009c;
    L_0x005f:
        if (r0 == 0) goto L_0x009c;
    L_0x0061:
        r0 = com.google.android.gms.internal.ado.aV;
        r3 = com.google.android.gms.ads.internal.zzbv.zzen();
        r0 = r3.m4217a(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0089;
    L_0x0073:
        r0 = new android.graphics.Rect;
        r0.<init>();
        r0 = r5.getLocalVisibleRect(r0);
        if (r0 != 0) goto L_0x0089;
    L_0x007e:
        r0 = new android.graphics.Rect;
        r0.<init>();
        r0 = r5.getGlobalVisibleRect(r0);
        if (r0 == 0) goto L_0x009c;
    L_0x0089:
        return r2;
    L_0x008a:
        r0 = r7.inKeyguardRestrictedInputMode();
        goto L_0x000e;
    L_0x008f:
        r0 = r3;
        goto L_0x0032;
    L_0x0091:
        r0 = r0.getAttributes();
        goto L_0x003b;
    L_0x0096:
        r0 = r1;
        goto L_0x0045;
    L_0x0098:
        r0 = r1;
        goto L_0x0048;
    L_0x009a:
        r3 = r1;
        goto L_0x005d;
    L_0x009c:
        r2 = r1;
        goto L_0x0089;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gb.a(android.view.View, android.os.PowerManager, android.app.KeyguardManager):boolean");
    }

    public static boolean m5462a(ClassLoader classLoader, Class<?> cls, String str) {
        boolean z = false;
        try {
            z = cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable th) {
        }
        return z;
    }

    public static int[] m5463a(Activity activity) {
        Window window = activity.getWindow();
        if (window == null || window.findViewById(16908290) == null) {
            return m5495h();
        }
        return new int[]{window.findViewById(16908290).getWidth(), window.findViewById(16908290).getHeight()};
    }

    public static int m5464b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(e);
            id.m5370a(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Could not parse value:").append(valueOf).toString());
            return 0;
        }
    }

    public static Bitmap m5465b(View view) {
        if (view == null) {
            return null;
        }
        Bitmap e = m5486e(view);
        return e == null ? m5483d(view) : e;
    }

    public static String m5466b() {
        UUID randomUUID = UUID.randomUUID();
        byte[] toByteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] toByteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, toByteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(toByteArray);
                instance.update(toByteArray2);
                Object obj = new byte[8];
                System.arraycopy(instance.digest(), 0, obj, 0, 8);
                bigInteger = new BigInteger(1, obj).toString();
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return bigInteger;
    }

    protected static String m5467b(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Exception e) {
            return m5493g();
        }
    }

    public static String m5468b(Context context, String str) {
        try {
            InputStream openFileInput = context.openFileInput(str);
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C1537f.m3939a(openFileInput, byteArrayOutputStream);
            return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
        } catch (IOException e) {
            id.m5372a(3);
            return "";
        }
    }

    private final JSONObject m5469b(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m5454a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public static void m5470b(Activity activity, OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        }
    }

    @TargetApi(18)
    public static void m5471b(Context context, Intent intent) {
        if (intent != null && C1538g.m3943c()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static void m5472b(Context context, String str, String str2) {
        List arrayList = new ArrayList();
        arrayList.add(str2);
        m5449a(context, str, arrayList);
    }

    public static void m5473b(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) zzbv.zzen().m4217a(ado.ba)).booleanValue()) {
            m5448a(context, str, str2, bundle, z);
        }
    }

    public static void m5474b(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            fv.m5425a(runnable);
        }
    }

    public static int[] m5475b(Activity activity) {
        int[] a = m5463a(activity);
        r1 = new int[2];
        aak.m4022a();
        r1[0] = hz.m5623b((Context) activity, a[0]);
        aak.m4022a();
        r1[1] = hz.m5623b((Context) activity, a[1]);
        return r1;
    }

    public static int m5476c(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        return parent == null ? -1 : ((AdapterView) parent).getPositionForView(view);
    }

    public static Builder m5477c(Context context) {
        return new Builder(context);
    }

    public static String m5478c() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append(" ").append(str2).toString();
    }

    public static void m5479c(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Exception e) {
            id.m5372a(6);
        }
    }

    public static boolean m5480c(String str) {
        return TextUtils.isEmpty(str) ? false : str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public static int[] m5481c(Activity activity) {
        Window window = activity.getWindow();
        int[] h = (window == null || window.findViewById(16908290) == null) ? m5495h() : new int[]{window.findViewById(16908290).getTop(), window.findViewById(16908290).getBottom()};
        r1 = new int[2];
        aak.m4022a();
        r1[0] = hz.m5623b((Context) activity, h[0]);
        aak.m4022a();
        r1[1] = hz.m5623b((Context) activity, h[1]);
        return r1;
    }

    public static float m5482d() {
        zzbv.zzev();
        zzay zzdd = zzay.zzdd();
        return (zzdd == null || !zzdd.zzdf()) ? 1.0f : zzdd.zzde();
    }

    private static Bitmap m5483d(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width == 0 || height == 0) {
                id.m5370a("Width or height of view is zero");
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            view.layout(0, 0, width, height);
            view.draw(canvas);
            return createBitmap;
        } catch (RuntimeException e) {
            id.m5372a(6);
            return null;
        }
    }

    public static acz m5484d(Context context) {
        return new acz(context);
    }

    public static boolean m5485d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (f6132c.get() == null) {
            try {
                JSONArray jSONArray = new JSONArray((String) zzbv.zzen().m4217a(ado.aj));
                List arrayList = new ArrayList(jSONArray.length());
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                f6132c.compareAndSet(null, arrayList);
            } catch (JSONException e) {
                id.m5370a("Could not parse click ping schema");
                return false;
            }
        }
        for (String contains : (List) f6132c.get()) {
            if (str.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    private static Bitmap m5486e(View view) {
        Bitmap bitmap = null;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (RuntimeException e) {
            id.m5372a(6);
        }
        return bitmap;
    }

    public static boolean m5487e() {
        zzbv.zzev();
        zzay zzdd = zzay.zzdd();
        return zzdd != null ? zzdd.zzdg() : false;
    }

    public static boolean m5488e(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null) {
                return false;
            }
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                        PowerManager powerManager = (PowerManager) context.getSystemService("power");
                        if (powerManager == null ? false : powerManager.isScreenOn()) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean m5489e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (f6133d.get() == null) {
            try {
                JSONArray jSONArray = new JSONArray((String) zzbv.zzen().m4217a(ado.ak));
                List arrayList = new ArrayList(jSONArray.length());
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                f6133d.compareAndSet(null, arrayList);
            } catch (JSONException e) {
                id.m5370a("Could not parse impression ping schema");
                return false;
            }
        }
        for (String contains : (List) f6133d.get()) {
            if (str.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    public static Bitmap m5490f(Context context) {
        if (!(context instanceof Activity)) {
            return null;
        }
        Bitmap e;
        try {
            if (((Boolean) zzbv.zzen().m4217a(ado.bE)).booleanValue()) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    e = m5486e(window.getDecorView().getRootView());
                }
                e = null;
            } else {
                e = m5483d(((Activity) context).getWindow().getDecorView());
            }
        } catch (RuntimeException e2) {
            id.m5372a(6);
        }
        return e;
    }

    public static Bundle m5491f() {
        Bundle bundle = new Bundle();
        try {
            if (((Boolean) zzbv.zzen().m4217a(ado.f4912x)).booleanValue()) {
                Parcelable memoryInfo = new MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            if (((Boolean) zzbv.zzen().m4217a(ado.f4913y)).booleanValue()) {
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free_memory", runtime.freeMemory());
                bundle.putLong("runtime_max_memory", runtime.maxMemory());
                bundle.putLong("runtime_total_memory", runtime.totalMemory());
            }
            bundle.putInt("web_view_count", zzbv.zzee().f6022g.get());
        } catch (Throwable e) {
            id.m5371a("Unable to gather memory stats", e);
        }
        return bundle;
    }

    public static AudioManager m5492g(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    private static String m5493g() {
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("Mozilla/5.0 (Linux; U; Android");
        if (VERSION.RELEASE != null) {
            stringBuffer.append(" ").append(VERSION.RELEASE);
        }
        stringBuffer.append("; ").append(Locale.getDefault());
        if (Build.DEVICE != null) {
            stringBuffer.append("; ").append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                stringBuffer.append(" Build/").append(Build.DISPLAY);
            }
        }
        stringBuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuffer.toString();
    }

    public static float m5494h(Context context) {
        AudioManager g = m5492g(context);
        if (g == null) {
            return 0.0f;
        }
        int streamMaxVolume = g.getStreamMaxVolume(3);
        return streamMaxVolume != 0 ? ((float) g.getStreamVolume(3)) / ((float) streamMaxVolume) : 0.0f;
    }

    private static int[] m5495h() {
        return new int[]{0, 0};
    }

    public static int m5496i(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
    }

    public static boolean m5497j(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException e) {
            return true;
        } catch (Throwable th) {
            id.m5372a(6);
            zzbv.zzee().m5336a(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static int m5498k(Context context) {
        return DynamiteModule.m3962b(context, ModuleDescriptor.MODULE_ID);
    }

    public static int m5499l(Context context) {
        return DynamiteModule.m3955a(context, ModuleDescriptor.MODULE_ID);
    }

    private static String m5500m(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            List runningTasks = activityManager.getRunningTasks(1);
            if (!(runningTasks == null || runningTasks.isEmpty())) {
                RunningTaskInfo runningTaskInfo = (RunningTaskInfo) runningTasks.get(0);
                if (!(runningTaskInfo == null || runningTaskInfo.topActivity == null)) {
                    return runningTaskInfo.topActivity.getClassName();
                }
            }
            return null;
        } catch (Exception e) {
        }
    }

    public final zzl m5501a(Context context, zzajk com_google_android_gms_internal_zzajk) {
        zzl com_google_android_gms_ads_internal_js_zzl;
        synchronized (this.f6135e) {
            if (this.f6138h == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f6138h = new zzl(context, com_google_android_gms_internal_zzajk, (String) zzbv.zzen().m4217a(ado.f4888a));
            }
            com_google_android_gms_ads_internal_js_zzl = this.f6138h;
        }
        return com_google_android_gms_ads_internal_js_zzl;
    }

    public final String m5502a(Context context, String str) {
        String str2;
        synchronized (this.f6135e) {
            if (this.f6137g != null) {
                str2 = this.f6137g;
            } else if (str == null) {
                str2 = m5493g();
            } else {
                try {
                    this.f6137g = zzbv.zzec().mo2111a(context);
                } catch (Exception e) {
                }
                if (TextUtils.isEmpty(this.f6137g)) {
                    aak.m4022a();
                    if (hz.m5626b()) {
                        this.f6137g = m5467b(context);
                    } else {
                        this.f6137g = null;
                        f6131a.post(new gd(this, context));
                        while (this.f6137g == null) {
                            try {
                                this.f6135e.wait();
                            } catch (InterruptedException e2) {
                                this.f6137g = m5493g();
                                String str3 = "Interrupted, use default user agent: ";
                                str2 = String.valueOf(this.f6137g);
                                id.m5370a(str2.length() != 0 ? str3.concat(str2) : new String(str3));
                            }
                        }
                    }
                }
                str2 = String.valueOf(this.f6137g);
                this.f6137g = new StringBuilder((String.valueOf(str2).length() + 10) + String.valueOf(str).length()).append(str2).append(" (Mobile; ").append(str).toString();
                try {
                    if (lm.m5976a(context).m5974a()) {
                        this.f6137g = String.valueOf(this.f6137g).concat(";aia");
                    }
                } catch (Throwable e3) {
                    zzbv.zzee().m5336a(e3, "AdUtil.getUserAgent");
                }
                this.f6137g = String.valueOf(this.f6137g).concat(")");
                str2 = this.f6137g;
            }
        }
        return str2;
    }

    public final JSONObject m5503a(Bundle bundle) {
        try {
            return m5469b(bundle);
        } catch (JSONException e) {
            id.m5372a(6);
            return null;
        }
    }

    public final JSONObject m5504a(Map<String, ?> map) {
        String valueOf;
        try {
            JSONObject jSONObject = new JSONObject();
            for (String valueOf2 : map.keySet()) {
                m5454a(jSONObject, valueOf2, map.get(valueOf2));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String str = "Could not convert map to JSON: ";
            valueOf2 = String.valueOf(e.getMessage());
            throw new JSONException(valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
        }
    }

    public final void m5505a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", m5502a(context, str));
        httpURLConnection.setUseCaches(false);
    }
}
