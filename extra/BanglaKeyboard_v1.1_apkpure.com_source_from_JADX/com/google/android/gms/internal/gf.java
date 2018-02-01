package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@TargetApi(8)
@aqv
public class gf {
    private gf() {
    }

    public static boolean m5508a(jf jfVar) {
        if (jfVar == null) {
            return false;
        }
        jfVar.onPause();
        return true;
    }

    public static boolean m5509b(jf jfVar) {
        if (jfVar == null) {
            return false;
        }
        jfVar.onResume();
        return true;
    }

    public int mo2095a() {
        return 0;
    }

    public Drawable mo2110a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public jg mo2098a(jf jfVar, boolean z) {
        return new jg(jfVar, z);
    }

    public String mo2111a(Context context) {
        return "";
    }

    public String mo2105a(SslError sslError) {
        return "";
    }

    public Set<String> mo2099a(Uri uri) {
        if (uri.isOpaque()) {
            return Collections.emptySet();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        Set linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public void mo2107a(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            mo2109a(window.getDecorView().getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public void mo2108a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    public void mo2109a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    public boolean mo2096a(Request request) {
        return false;
    }

    public boolean mo2100a(Context context, WebSettings webSettings) {
        return false;
    }

    public boolean mo2113a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public boolean mo2101a(Window window) {
        return false;
    }

    public int mo2097b() {
        return 1;
    }

    public void mo2112b(Context context) {
        zzbv.zzee().m5362t();
    }

    public boolean mo2102b(View view) {
        return false;
    }

    public int mo2114c() {
        return 5;
    }

    public CookieManager mo2116c(Context context) {
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable e) {
            id.m5372a(6);
            zzbv.zzee().m5336a(e, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public WebChromeClient mo2103c(jf jfVar) {
        return null;
    }

    public boolean mo2104c(View view) {
        return false;
    }

    public LayoutParams mo2115d() {
        return new LayoutParams(-2, -2);
    }

    public int mo2106e() {
        return 0;
    }
}
