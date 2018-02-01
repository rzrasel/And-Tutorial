package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.internal.aer;
import com.google.android.gms.internal.aet;
import com.google.android.gms.internal.afy;
import com.google.android.gms.internal.afz;
import com.google.android.gms.internal.ail;
import com.google.android.gms.internal.als;
import com.google.android.gms.internal.amo;
import com.google.android.gms.internal.amr;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.jf;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

@aqv
public final class zzas {
    static /* synthetic */ afy m3740a(Object obj) {
        return obj instanceof IBinder ? afz.m4268a((IBinder) obj) : null;
    }

    static ail m3741a(amo com_google_android_gms_internal_amo, amr com_google_android_gms_internal_amr, zzab com_google_android_gms_ads_internal_zzab) {
        return new C1444n(com_google_android_gms_internal_amo, com_google_android_gms_ads_internal_zzab, com_google_android_gms_internal_amr);
    }

    private static String m3742a(Bitmap bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            id.m5370a("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        String valueOf = String.valueOf("data:image/png;base64,");
        encodeToString = String.valueOf(encodeToString);
        return encodeToString.length() != 0 ? valueOf.concat(encodeToString) : new String(valueOf);
    }

    static String m3743a(afy com_google_android_gms_internal_afy) {
        if (com_google_android_gms_internal_afy == null) {
            id.m5370a("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri b = com_google_android_gms_internal_afy.mo1751b();
            if (b != null) {
                return b.toString();
            }
        } catch (RemoteException e) {
            id.m5370a("Unable to get image uri. Trying data uri next");
        }
        return m3746b(com_google_android_gms_internal_afy);
    }

    static /* synthetic */ JSONObject m3744a(Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        if (bundle == null || TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            if (bundle.containsKey(str2)) {
                if ("image".equals(jSONObject2.getString(str2))) {
                    Object obj = bundle.get(str2);
                    if (obj instanceof Bitmap) {
                        jSONObject.put(str2, m3742a((Bitmap) obj));
                    } else {
                        id.m5370a("Invalid type. An image type extra should return a bitmap");
                    }
                } else if (bundle.get(str2) instanceof Bitmap) {
                    id.m5370a("Invalid asset type. Bitmap should be returned only for image type");
                } else {
                    jSONObject.put(str2, String.valueOf(bundle.get(str2)));
                }
            }
        }
        return jSONObject;
    }

    static /* synthetic */ void m3745a(jf jfVar) {
        OnClickListener C = jfVar.mo2133C();
        if (C == null) {
            return;
        }
        if (jfVar == null) {
            throw null;
        }
        C.onClick((View) jfVar);
    }

    private static String m3746b(afy com_google_android_gms_internal_afy) {
        try {
            C1398a a = com_google_android_gms_internal_afy.mo1750a();
            if (a == null) {
                id.m5370a("Drawable is null. Returning empty string");
                return "";
            }
            Drawable drawable = (Drawable) C1401c.m3585a(a);
            if (drawable instanceof BitmapDrawable) {
                return m3742a(((BitmapDrawable) drawable).getBitmap());
            }
            id.m5370a("Drawable is not an instance of BitmapDrawable. Returning empty string");
            return "";
        } catch (RemoteException e) {
            id.m5370a("Unable to get drawable. Returning empty string");
            return "";
        }
    }

    public static boolean zza(jf jfVar, als com_google_android_gms_internal_als, CountDownLatch countDownLatch) {
        if (jfVar == null) {
            try {
                throw null;
            } catch (Throwable e) {
                id.m5371a("Unable to invoke load assets", e);
                r2 = false;
            } catch (RuntimeException e2) {
                countDownLatch.countDown();
                throw e2;
            }
        }
        boolean z;
        View view = (View) jfVar;
        if (view == null) {
            id.m5370a("AdWebView is null");
            z = false;
        } else {
            view.setVisibility(4);
            List list = com_google_android_gms_internal_als.f5342b.f5295p;
            if (list == null || list.isEmpty()) {
                id.m5370a("No template ids present in mediation response");
                z = false;
            } else {
                jfVar.mo2163k().m5728a("/nativeExpressAssetsLoaded", new C1442l(countDownLatch));
                jfVar.mo2163k().m5728a("/nativeExpressAssetsLoadingFailed", new C1443m(countDownLatch));
                amo h = com_google_android_gms_internal_als.f5343c.mo1913h();
                amr i = com_google_android_gms_internal_als.f5343c.mo1914i();
                if (list.contains("2") && h != null) {
                    jfVar.mo2163k().f6289c = new C1414j(new aer(h.mo1921a(), h.mo1923b(), h.mo1925c(), h.mo1927d(), h.mo1928e(), h.mo1929f(), h.mo1930g(), h.mo1931h(), null, h.mo1935l(), null, h.mo1939p() != null ? (View) C1401c.m3585a(h.mo1939p()) : null), com_google_android_gms_internal_als.f5342b.f5294o, jfVar);
                } else if (!list.contains("1") || i == null) {
                    id.m5370a("No matching template id and mapper");
                    z = false;
                } else {
                    jfVar.mo2163k().f6289c = new C1441k(new aet(i.mo1940a(), i.mo1942b(), i.mo1944c(), i.mo1946d(), i.mo1947e(), i.mo1948f(), null, i.mo1952j(), null, i.mo1956n() != null ? (View) C1401c.m3585a(i.mo1956n()) : null), com_google_android_gms_internal_als.f5342b.f5294o, jfVar);
                }
                String str = com_google_android_gms_internal_als.f5342b.f5292m;
                String str2 = com_google_android_gms_internal_als.f5342b.f5293n;
                if (str2 != null) {
                    jfVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                } else {
                    jfVar.loadData(str, "text/html", "UTF-8");
                }
                z = true;
            }
        }
        if (!z) {
            countDownLatch.countDown();
        }
        return z;
    }

    public static View zzd(ee eeVar) {
        if (eeVar == null) {
            id.m5372a(6);
            return null;
        } else if (!zze(eeVar) || eeVar.f5953b == null) {
            try {
                C1398a a = eeVar.f5966o != null ? eeVar.f5966o.mo1895a() : null;
                if (a != null) {
                    return (View) C1401c.m3585a(a);
                }
                id.m5370a("View in mediation adapter is null.");
                return null;
            } catch (Throwable e) {
                id.m5371a("Could not get View from mediation adapter.", e);
                return null;
            }
        } else {
            jf jfVar = eeVar.f5953b;
            if (jfVar != null) {
                return (View) jfVar;
            }
            throw null;
        }
    }

    public static boolean zze(ee eeVar) {
        return (eeVar == null || !eeVar.f5964m || eeVar.f5965n == null || eeVar.f5965n.f5292m == null) ? false : true;
    }
}
