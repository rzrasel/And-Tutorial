package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.C1404a.C1396a;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.C1534c;
import java.util.Collections;
import java.util.Map;

@aqv
public final class aix implements ail {
    private static Map<String, Integer> f5163c;
    private final zzw f5164a;
    private final anv f5165b;

    static {
        Integer valueOf = Integer.valueOf(1);
        Integer valueOf2 = Integer.valueOf(2);
        Integer valueOf3 = Integer.valueOf(3);
        Integer valueOf4 = Integer.valueOf(4);
        Integer valueOf5 = Integer.valueOf(5);
        Integer valueOf6 = Integer.valueOf(6);
        Map a = C1534c.m3933a(6);
        a.put("resize", valueOf);
        a.put("playVideo", valueOf2);
        a.put("storePicture", valueOf3);
        a.put("createCalendarEvent", valueOf4);
        a.put("setOrientationProperties", valueOf5);
        a.put("closeResizedAd", valueOf6);
        f5163c = Collections.unmodifiableMap(a);
    }

    public aix(zzw com_google_android_gms_ads_internal_zzw, anv com_google_android_gms_internal_anv) {
        this.f5164a = com_google_android_gms_ads_internal_zzw;
        this.f5165b = com_google_android_gms_internal_anv;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        boolean z = true;
        int intValue = ((Integer) f5163c.get((String) map.get("a"))).intValue();
        if (intValue == 5 || this.f5164a == null || this.f5164a.zzcq()) {
            String str;
            String str2;
            switch (intValue) {
                case 1:
                    aof com_google_android_gms_internal_aof = this.f5165b;
                    synchronized (com_google_android_gms_internal_aof.f5470i) {
                        if (com_google_android_gms_internal_aof.f5472k == null) {
                            com_google_android_gms_internal_aof.m4982a("Not an activity context. Cannot resize.");
                            return;
                        } else if (com_google_android_gms_internal_aof.f5471j.mo2162j() == null) {
                            com_google_android_gms_internal_aof.m4982a("Webview is not yet available, size is not set.");
                            return;
                        } else if (com_google_android_gms_internal_aof.f5471j.mo2162j().f7761d) {
                            com_google_android_gms_internal_aof.m4982a("Is interstitial. Cannot resize an interstitial.");
                            return;
                        } else if (com_google_android_gms_internal_aof.f5471j.mo2170o()) {
                            com_google_android_gms_internal_aof.m4982a("Cannot resize an expanded banner.");
                            return;
                        } else {
                            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                                zzbv.zzea();
                                com_google_android_gms_internal_aof.f5469h = gb.m5464b((String) map.get("width"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                                zzbv.zzea();
                                com_google_android_gms_internal_aof.f5466e = gb.m5464b((String) map.get("height"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                                zzbv.zzea();
                                com_google_android_gms_internal_aof.f5467f = gb.m5464b((String) map.get("offsetX"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                                zzbv.zzea();
                                com_google_android_gms_internal_aof.f5468g = gb.m5464b((String) map.get("offsetY"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                                com_google_android_gms_internal_aof.f5463b = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                            }
                            str = (String) map.get("customClosePosition");
                            if (!TextUtils.isEmpty(str)) {
                                com_google_android_gms_internal_aof.f5462a = str;
                            }
                            boolean z2 = com_google_android_gms_internal_aof.f5469h >= 0 && com_google_android_gms_internal_aof.f5466e >= 0;
                            if (z2) {
                                Window window = com_google_android_gms_internal_aof.f5472k.getWindow();
                                if (window == null || window.getDecorView() == null) {
                                    com_google_android_gms_internal_aof.m4982a("Activity context is not ready, cannot get window or decor view.");
                                    return;
                                }
                                int[] a = com_google_android_gms_internal_aof.m4988a();
                                if (a == null) {
                                    com_google_android_gms_internal_aof.m4982a("Resize location out of screen or close button is not visible.");
                                    return;
                                }
                                aak.m4022a();
                                int a2 = hz.m5612a(com_google_android_gms_internal_aof.f5472k, com_google_android_gms_internal_aof.f5469h);
                                aak.m4022a();
                                int a3 = hz.m5612a(com_google_android_gms_internal_aof.f5472k, com_google_android_gms_internal_aof.f5466e);
                                jf jfVar2 = com_google_android_gms_internal_aof.f5471j;
                                if (jfVar2 == null) {
                                    throw null;
                                }
                                ViewParent parent = ((View) jfVar2).getParent();
                                if (parent == null || !(parent instanceof ViewGroup)) {
                                    com_google_android_gms_internal_aof.m4982a("Webview is detached, probably in the middle of a resize or expand.");
                                    return;
                                }
                                ViewGroup viewGroup = (ViewGroup) parent;
                                jf jfVar3 = com_google_android_gms_internal_aof.f5471j;
                                if (jfVar3 == null) {
                                    throw null;
                                }
                                viewGroup.removeView((View) jfVar3);
                                if (com_google_android_gms_internal_aof.f5477p == null) {
                                    com_google_android_gms_internal_aof.f5479r = (ViewGroup) parent;
                                    zzbv.zzea();
                                    jfVar2 = com_google_android_gms_internal_aof.f5471j;
                                    if (jfVar2 == null) {
                                        throw null;
                                    }
                                    Bitmap a4 = gb.m5429a((View) jfVar2);
                                    com_google_android_gms_internal_aof.f5474m = new ImageView(com_google_android_gms_internal_aof.f5472k);
                                    com_google_android_gms_internal_aof.f5474m.setImageBitmap(a4);
                                    com_google_android_gms_internal_aof.f5473l = com_google_android_gms_internal_aof.f5471j.mo2162j();
                                    com_google_android_gms_internal_aof.f5479r.addView(com_google_android_gms_internal_aof.f5474m);
                                } else {
                                    com_google_android_gms_internal_aof.f5477p.dismiss();
                                }
                                com_google_android_gms_internal_aof.f5478q = new RelativeLayout(com_google_android_gms_internal_aof.f5472k);
                                com_google_android_gms_internal_aof.f5478q.setBackgroundColor(0);
                                com_google_android_gms_internal_aof.f5478q.setLayoutParams(new LayoutParams(a2, a3));
                                zzbv.zzea();
                                com_google_android_gms_internal_aof.f5477p = gb.m5433a(com_google_android_gms_internal_aof.f5478q, a2, a3);
                                com_google_android_gms_internal_aof.f5477p.setOutsideTouchable(true);
                                com_google_android_gms_internal_aof.f5477p.setTouchable(true);
                                com_google_android_gms_internal_aof.f5477p.setClippingEnabled(!com_google_android_gms_internal_aof.f5463b);
                                RelativeLayout relativeLayout = com_google_android_gms_internal_aof.f5478q;
                                jfVar2 = com_google_android_gms_internal_aof.f5471j;
                                if (jfVar2 == null) {
                                    throw null;
                                }
                                relativeLayout.addView((View) jfVar2, -1, -1);
                                com_google_android_gms_internal_aof.f5475n = new LinearLayout(com_google_android_gms_internal_aof.f5472k);
                                aak.m4022a();
                                int a5 = hz.m5612a(com_google_android_gms_internal_aof.f5472k, 50);
                                aak.m4022a();
                                LayoutParams layoutParams = new RelativeLayout.LayoutParams(a5, hz.m5612a(com_google_android_gms_internal_aof.f5472k, 50));
                                str2 = com_google_android_gms_internal_aof.f5462a;
                                switch (str2.hashCode()) {
                                    case -1364013995:
                                        if (str2.equals("center")) {
                                            z = true;
                                            break;
                                        }
                                        break;
                                    case -1012429441:
                                        if (str2.equals("top-left")) {
                                            z = false;
                                            break;
                                        }
                                        break;
                                    case -655373719:
                                        if (str2.equals("bottom-left")) {
                                            z = true;
                                            break;
                                        }
                                        break;
                                    case 1163912186:
                                        if (str2.equals("bottom-right")) {
                                            z = true;
                                            break;
                                        }
                                        break;
                                    case 1288627767:
                                        if (str2.equals("bottom-center")) {
                                            z = true;
                                            break;
                                        }
                                        break;
                                    case 1755462605:
                                        if (str2.equals("top-center")) {
                                            z = true;
                                            break;
                                        }
                                        break;
                                }
                                switch (z) {
                                    case false:
                                        layoutParams.addRule(10);
                                        layoutParams.addRule(9);
                                        break;
                                    case true:
                                        layoutParams.addRule(10);
                                        layoutParams.addRule(14);
                                        break;
                                    case true:
                                        layoutParams.addRule(13);
                                        break;
                                    case true:
                                        layoutParams.addRule(12);
                                        layoutParams.addRule(9);
                                        break;
                                    case true:
                                        layoutParams.addRule(12);
                                        layoutParams.addRule(14);
                                        break;
                                    case true:
                                        layoutParams.addRule(12);
                                        layoutParams.addRule(11);
                                        break;
                                    default:
                                        layoutParams.addRule(10);
                                        layoutParams.addRule(11);
                                        break;
                                }
                                com_google_android_gms_internal_aof.f5475n.setOnClickListener(new anw(com_google_android_gms_internal_aof));
                                com_google_android_gms_internal_aof.f5475n.setContentDescription("Close button");
                                com_google_android_gms_internal_aof.f5478q.addView(com_google_android_gms_internal_aof.f5475n, layoutParams);
                                try {
                                    PopupWindow popupWindow = com_google_android_gms_internal_aof.f5477p;
                                    View decorView = window.getDecorView();
                                    aak.m4022a();
                                    int a6 = hz.m5612a(com_google_android_gms_internal_aof.f5472k, a[0]);
                                    aak.m4022a();
                                    popupWindow.showAtLocation(decorView, 0, a6, hz.m5612a(com_google_android_gms_internal_aof.f5472k, a[1]));
                                    intValue = a[0];
                                    a5 = a[1];
                                    if (com_google_android_gms_internal_aof.f5476o != null) {
                                        com_google_android_gms_internal_aof.f5476o.zza(intValue, a5, com_google_android_gms_internal_aof.f5469h, com_google_android_gms_internal_aof.f5466e);
                                    }
                                    com_google_android_gms_internal_aof.f5471j.mo2143a(new zzjb(com_google_android_gms_internal_aof.f5472k, new AdSize(com_google_android_gms_internal_aof.f5469h, com_google_android_gms_internal_aof.f5466e)));
                                    com_google_android_gms_internal_aof.m4986a(a[0], a[1]);
                                    com_google_android_gms_internal_aof.m4983b("resized");
                                    return;
                                } catch (RuntimeException e) {
                                    str2 = "Cannot show popup window: ";
                                    str = String.valueOf(e.getMessage());
                                    com_google_android_gms_internal_aof.m4982a(str.length() != 0 ? str2.concat(str) : new String(str2));
                                    relativeLayout = com_google_android_gms_internal_aof.f5478q;
                                    jfVar2 = com_google_android_gms_internal_aof.f5471j;
                                    if (jfVar2 == null) {
                                        throw null;
                                    }
                                    relativeLayout.removeView((View) jfVar2);
                                    if (com_google_android_gms_internal_aof.f5479r != null) {
                                        com_google_android_gms_internal_aof.f5479r.removeView(com_google_android_gms_internal_aof.f5474m);
                                        ViewGroup viewGroup2 = com_google_android_gms_internal_aof.f5479r;
                                        jfVar2 = com_google_android_gms_internal_aof.f5471j;
                                        if (jfVar2 == null) {
                                            throw null;
                                        }
                                        viewGroup2.addView((View) jfVar2);
                                        com_google_android_gms_internal_aof.f5471j.mo2143a(com_google_android_gms_internal_aof.f5473l);
                                    }
                                    return;
                                }
                            }
                            com_google_android_gms_internal_aof.m4982a("Invalid width and height options. Cannot resize.");
                            return;
                        }
                    }
                case 3:
                    aof com_google_android_gms_internal_any = new any(jfVar, map);
                    if (com_google_android_gms_internal_any.f5485b == null) {
                        com_google_android_gms_internal_any.m4982a("Activity context is not available");
                        return;
                    }
                    zzbv.zzea();
                    if (gb.m5484d(com_google_android_gms_internal_any.f5485b).m4185a()) {
                        str = (String) com_google_android_gms_internal_any.f5484a.get("iurl");
                        if (TextUtils.isEmpty(str)) {
                            com_google_android_gms_internal_any.m4982a("Image url cannot be empty.");
                            return;
                        } else if (URLUtil.isValidUrl(str)) {
                            String lastPathSegment = Uri.parse(str).getLastPathSegment();
                            zzbv.zzea();
                            if (gb.m5480c(lastPathSegment)) {
                                Resources s = zzbv.zzee().m5361s();
                                zzbv.zzea();
                                Builder c = gb.m5477c(com_google_android_gms_internal_any.f5485b);
                                c.setTitle(s != null ? s.getString(C1396a.s1) : "Save image");
                                c.setMessage(s != null ? s.getString(C1396a.s2) : "Allow Ad to store image in Picture gallery?");
                                c.setPositiveButton(s != null ? s.getString(C1396a.s3) : "Accept", new anz(com_google_android_gms_internal_any, str, lastPathSegment));
                                c.setNegativeButton(s != null ? s.getString(C1396a.s4) : "Decline", new aoa(com_google_android_gms_internal_any));
                                c.create().show();
                                return;
                            }
                            str2 = "Image type not recognized: ";
                            str = String.valueOf(lastPathSegment);
                            com_google_android_gms_internal_any.m4982a(str.length() != 0 ? str2.concat(str) : new String(str2));
                            return;
                        } else {
                            str2 = "Invalid image url: ";
                            str = String.valueOf(str);
                            com_google_android_gms_internal_any.m4982a(str.length() != 0 ? str2.concat(str) : new String(str2));
                            return;
                        }
                    }
                    com_google_android_gms_internal_any.m4982a("Feature is not supported by the device.");
                    return;
                case 4:
                    aof com_google_android_gms_internal_ans = new ans(jfVar, map);
                    if (com_google_android_gms_internal_ans.f5452a == null) {
                        com_google_android_gms_internal_ans.m4982a("Activity context is not available.");
                        return;
                    }
                    zzbv.zzea();
                    if (gb.m5484d(com_google_android_gms_internal_ans.f5452a).m4187b()) {
                        zzbv.zzea();
                        Builder c2 = gb.m5477c(com_google_android_gms_internal_ans.f5452a);
                        Resources s2 = zzbv.zzee().m5361s();
                        c2.setTitle(s2 != null ? s2.getString(C1396a.s5) : "Create calendar event");
                        c2.setMessage(s2 != null ? s2.getString(C1396a.s6) : "Allow Ad to create a calendar event?");
                        c2.setPositiveButton(s2 != null ? s2.getString(C1396a.s3) : "Accept", new ant(com_google_android_gms_internal_ans));
                        c2.setNegativeButton(s2 != null ? s2.getString(C1396a.s4) : "Decline", new anu(com_google_android_gms_internal_ans));
                        c2.create().show();
                        return;
                    }
                    com_google_android_gms_internal_ans.m4982a("This feature is not available on the device.");
                    return;
                case 5:
                    anx com_google_android_gms_internal_anx = new anx(jfVar, map);
                    if (com_google_android_gms_internal_anx.f5481a == null) {
                        id.m5370a("AdWebView is null");
                        return;
                    }
                    intValue = "portrait".equalsIgnoreCase(com_google_android_gms_internal_anx.f5483c) ? zzbv.zzec().mo2097b() : "landscape".equalsIgnoreCase(com_google_android_gms_internal_anx.f5483c) ? zzbv.zzec().mo2095a() : com_google_android_gms_internal_anx.f5482b ? -1 : zzbv.zzec().mo2114c();
                    com_google_android_gms_internal_anx.f5481a.mo2148b(intValue);
                    return;
                case 6:
                    this.f5165b.m4987a(true);
                    return;
                default:
                    id.m5372a(4);
                    return;
            }
        }
        this.f5164a.zzs(null);
    }
}
