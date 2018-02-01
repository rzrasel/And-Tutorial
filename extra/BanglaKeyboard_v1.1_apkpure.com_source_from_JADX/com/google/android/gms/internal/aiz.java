package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import java.util.Map;

@aqv
public final class aiz implements ail {
    private final zzw f5177a;
    private final anv f5178b;

    public aiz(zzw com_google_android_gms_ads_internal_zzw, anv com_google_android_gms_internal_anv) {
        this.f5177a = com_google_android_gms_ads_internal_zzw;
        this.f5178b = com_google_android_gms_internal_anv;
    }

    private final void m4577a(boolean z) {
        if (this.f5178b != null) {
            this.f5178b.m4987a(z);
        }
    }

    private static boolean m4578a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int m4579b(Map<String, String> map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return zzbv.zzec().mo2097b();
            }
            if ("l".equalsIgnoreCase(str)) {
                return zzbv.zzec().mo2095a();
            }
            if ("c".equalsIgnoreCase(str)) {
                return zzbv.zzec().mo2114c();
            }
        }
        return -1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1470a(com.google.android.gms.internal.jf r14, java.util.Map<java.lang.String, java.lang.String> r15) {
        /*
        r13 = this;
        r6 = 6;
        r3 = 0;
        r2 = 1;
        r4 = 0;
        r0 = "u";
        r0 = r15.get(r0);
        r0 = (java.lang.String) r0;
        r1 = r14.getContext();
        r1 = com.google.android.gms.internal.dy.m5309a(r0, r1);
        r0 = "a";
        r0 = r15.get(r0);
        r0 = (java.lang.String) r0;
        if (r0 != 0) goto L_0x0024;
    L_0x001e:
        r0 = "Action missing from an open GMSG.";
        com.google.android.gms.internal.id.m5370a(r0);
    L_0x0023:
        return;
    L_0x0024:
        r5 = r13.f5177a;
        if (r5 == 0) goto L_0x0036;
    L_0x0028:
        r5 = r13.f5177a;
        r5 = r5.zzcq();
        if (r5 != 0) goto L_0x0036;
    L_0x0030:
        r0 = r13.f5177a;
        r0.zzs(r1);
        goto L_0x0023;
    L_0x0036:
        r8 = r14.mo2163k();
        r5 = "expand";
        r5 = r5.equalsIgnoreCase(r0);
        if (r5 == 0) goto L_0x005d;
    L_0x0042:
        r0 = r14.mo2170o();
        if (r0 == 0) goto L_0x004e;
    L_0x0048:
        r0 = "Cannot expand WebView that is already expanded.";
        com.google.android.gms.internal.id.m5370a(r0);
        goto L_0x0023;
    L_0x004e:
        r13.m4577a(r4);
        r0 = m4578a(r15);
        r1 = m4579b(r15);
        r8.m5729a(r0, r1);
        goto L_0x0023;
    L_0x005d:
        r5 = "webapp";
        r5 = r5.equalsIgnoreCase(r0);
        if (r5 == 0) goto L_0x0092;
    L_0x0065:
        r13.m4577a(r4);
        if (r1 == 0) goto L_0x0076;
    L_0x006a:
        r0 = m4578a(r15);
        r2 = m4579b(r15);
        r8.m5730a(r0, r2, r1);
        goto L_0x0023;
    L_0x0076:
        r2 = m4578a(r15);
        r3 = m4579b(r15);
        r0 = "html";
        r0 = r15.get(r0);
        r0 = (java.lang.String) r0;
        r1 = "baseurl";
        r1 = r15.get(r1);
        r1 = (java.lang.String) r1;
        r8.m5731a(r2, r3, r0, r1);
        goto L_0x0023;
    L_0x0092:
        r5 = "in_app_purchase";
        r5 = r5.equalsIgnoreCase(r0);
        if (r5 != 0) goto L_0x0023;
    L_0x009a:
        r5 = "app";
        r0 = r5.equalsIgnoreCase(r0);
        if (r0 == 0) goto L_0x020b;
    L_0x00a2:
        r5 = "true";
        r0 = "system_browser";
        r0 = r15.get(r0);
        r0 = (java.lang.String) r0;
        r0 = r5.equalsIgnoreCase(r0);
        if (r0 == 0) goto L_0x020b;
    L_0x00b2:
        r13.m4577a(r2);
        r6 = r14.getContext();
        r0 = android.text.TextUtils.isEmpty(r1);
        if (r0 == 0) goto L_0x00c6;
    L_0x00bf:
        r0 = "Destination url cannot be empty.";
        com.google.android.gms.internal.id.m5370a(r0);
        goto L_0x0023;
    L_0x00c6:
        r7 = r14.mo2163k();
        r5 = new com.google.android.gms.internal.aja;
        r5.<init>(r14);
        r0 = "activity";
        r0 = r6.getSystemService(r0);
        r0 = (android.app.ActivityManager) r0;
        r1 = "u";
        r1 = r15.get(r1);
        r1 = (java.lang.String) r1;
        r8 = android.text.TextUtils.isEmpty(r1);
        if (r8 == 0) goto L_0x00f9;
    L_0x00e5:
        r0 = new com.google.android.gms.ads.internal.overlay.zzc;	 Catch:{ ActivityNotFoundException -> 0x00ef }
        r0.<init>(r3);	 Catch:{ ActivityNotFoundException -> 0x00ef }
        r7.m5726a(r0);	 Catch:{ ActivityNotFoundException -> 0x00ef }
        goto L_0x0023;
    L_0x00ef:
        r0 = move-exception;
        r0 = r0.getMessage();
        com.google.android.gms.internal.id.m5370a(r0);
        goto L_0x0023;
    L_0x00f9:
        r8 = r5.f5179a;
        if (r8 == 0) goto L_0x0106;
    L_0x00fd:
        com.google.android.gms.ads.internal.zzbv.zzea();
        r5 = r5.f5179a;
        r1 = com.google.android.gms.internal.gb.m5439a(r5, r1);
    L_0x0106:
        r5 = android.net.Uri.parse(r1);
        r1 = "use_first_package";
        r1 = r15.get(r1);
        r1 = (java.lang.String) r1;
        r8 = java.lang.Boolean.parseBoolean(r1);
        r1 = "use_running_process";
        r1 = r15.get(r1);
        r1 = (java.lang.String) r1;
        r9 = java.lang.Boolean.parseBoolean(r1);
        r1 = "use_custom_tabs";
        r1 = r15.get(r1);
        r1 = (java.lang.String) r1;
        r1 = java.lang.Boolean.parseBoolean(r1);
        if (r1 != 0) goto L_0x0142;
    L_0x0130:
        r1 = com.google.android.gms.internal.ado.cr;
        r10 = com.google.android.gms.ads.internal.zzbv.zzen();
        r1 = r10.m4217a(r1);
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x0184;
    L_0x0142:
        r1 = "http";
        r10 = r5.getScheme();
        r1 = r1.equalsIgnoreCase(r10);
        if (r1 == 0) goto L_0x0186;
    L_0x014e:
        r1 = r5.buildUpon();
        r3 = "https";
        r1 = r1.scheme(r3);
        r1 = r1.build();
        r3 = r1;
    L_0x015d:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r5 = com.google.android.gms.internal.aja.m4582a(r5);
        r3 = com.google.android.gms.internal.aja.m4582a(r3);
        if (r2 == 0) goto L_0x0178;
    L_0x016c:
        com.google.android.gms.ads.internal.zzbv.zzea();
        com.google.android.gms.internal.gb.m5471b(r6, r5);
        com.google.android.gms.ads.internal.zzbv.zzea();
        com.google.android.gms.internal.gb.m5471b(r6, r3);
    L_0x0178:
        r2 = com.google.android.gms.internal.aja.m4584a(r6, r5, r1);
        if (r2 == 0) goto L_0x01a2;
    L_0x017e:
        r3 = com.google.android.gms.internal.aja.m4581a(r5, r2);
        goto L_0x00e5;
    L_0x0184:
        r2 = r4;
        goto L_0x0142;
    L_0x0186:
        r1 = "https";
        r10 = r5.getScheme();
        r1 = r1.equalsIgnoreCase(r10);
        if (r1 == 0) goto L_0x015d;
    L_0x0192:
        r1 = r5.buildUpon();
        r3 = "http";
        r1 = r1.scheme(r3);
        r1 = r1.build();
        r3 = r1;
        goto L_0x015d;
    L_0x01a2:
        if (r3 == 0) goto L_0x01b4;
    L_0x01a4:
        r2 = com.google.android.gms.internal.aja.m4583a(r6, r3);
        if (r2 == 0) goto L_0x01b4;
    L_0x01aa:
        r3 = com.google.android.gms.internal.aja.m4581a(r5, r2);
        r2 = com.google.android.gms.internal.aja.m4583a(r6, r3);
        if (r2 != 0) goto L_0x00e5;
    L_0x01b4:
        r2 = r1.size();
        if (r2 == 0) goto L_0x0208;
    L_0x01ba:
        if (r9 == 0) goto L_0x01fa;
    L_0x01bc:
        if (r0 == 0) goto L_0x01fa;
    L_0x01be:
        r9 = r0.getRunningAppProcesses();
        if (r9 == 0) goto L_0x01fa;
    L_0x01c4:
        r0 = r1;
        r0 = (java.util.ArrayList) r0;
        r10 = r0.size();
        r3 = r4;
    L_0x01cc:
        if (r3 >= r10) goto L_0x01fa;
    L_0x01ce:
        r2 = r0.get(r3);
        r6 = r3 + 1;
        r2 = (android.content.pm.ResolveInfo) r2;
        r11 = r9.iterator();
    L_0x01da:
        r3 = r11.hasNext();
        if (r3 == 0) goto L_0x01f8;
    L_0x01e0:
        r3 = r11.next();
        r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3;
        r3 = r3.processName;
        r12 = r2.activityInfo;
        r12 = r12.packageName;
        r3 = r3.equals(r12);
        if (r3 == 0) goto L_0x01da;
    L_0x01f2:
        r3 = com.google.android.gms.internal.aja.m4581a(r5, r2);
        goto L_0x00e5;
    L_0x01f8:
        r3 = r6;
        goto L_0x01cc;
    L_0x01fa:
        if (r8 == 0) goto L_0x0208;
    L_0x01fc:
        r0 = r1.get(r4);
        r0 = (android.content.pm.ResolveInfo) r0;
        r3 = com.google.android.gms.internal.aja.m4581a(r5, r0);
        goto L_0x00e5;
    L_0x0208:
        r3 = r5;
        goto L_0x00e5;
    L_0x020b:
        r13.m4577a(r2);
        r0 = "intent_url";
        r0 = r15.get(r0);
        r0 = (java.lang.String) r0;
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 != 0) goto L_0x0221;
    L_0x021c:
        r2 = 0;
        r3 = android.content.Intent.parseUri(r0, r2);	 Catch:{ URISyntaxException -> 0x0251 }
    L_0x0221:
        if (r3 == 0) goto L_0x0245;
    L_0x0223:
        r0 = r3.getData();
        if (r0 == 0) goto L_0x0245;
    L_0x0229:
        r0 = r3.getData();
        r2 = r0.toString();
        r4 = android.text.TextUtils.isEmpty(r2);
        if (r4 != 0) goto L_0x0242;
    L_0x0237:
        com.google.android.gms.ads.internal.zzbv.zzea();
        r2 = com.google.android.gms.internal.gb.m5439a(r14, r2);
        r0 = android.net.Uri.parse(r2);	 Catch:{ Exception -> 0x026b }
    L_0x0242:
        r3.setData(r0);
    L_0x0245:
        if (r3 == 0) goto L_0x0285;
    L_0x0247:
        r0 = new com.google.android.gms.ads.internal.overlay.zzc;
        r0.<init>(r3);
        r8.m5726a(r0);
        goto L_0x0023;
    L_0x0251:
        r2 = move-exception;
        r2 = "Error parsing the url: ";
        r0 = java.lang.String.valueOf(r0);
        r4 = r0.length();
        if (r4 == 0) goto L_0x0265;
    L_0x025e:
        r2.concat(r0);
    L_0x0261:
        com.google.android.gms.internal.id.m5372a(r6);
        goto L_0x0221;
    L_0x0265:
        r0 = new java.lang.String;
        r0.<init>(r2);
        goto L_0x0261;
    L_0x026b:
        r4 = move-exception;
        r4 = "Error parsing the uri: ";
        r2 = java.lang.String.valueOf(r2);
        r5 = r2.length();
        if (r5 == 0) goto L_0x027f;
    L_0x0278:
        r4.concat(r2);
    L_0x027b:
        com.google.android.gms.internal.id.m5372a(r6);
        goto L_0x0242;
    L_0x027f:
        r2 = new java.lang.String;
        r2.<init>(r4);
        goto L_0x027b;
    L_0x0285:
        r0 = android.text.TextUtils.isEmpty(r1);
        if (r0 != 0) goto L_0x02cc;
    L_0x028b:
        com.google.android.gms.ads.internal.zzbv.zzea();
        r2 = com.google.android.gms.internal.gb.m5439a(r14, r1);
    L_0x0292:
        r0 = new com.google.android.gms.ads.internal.overlay.zzc;
        r1 = "i";
        r1 = r15.get(r1);
        r1 = (java.lang.String) r1;
        r3 = "m";
        r3 = r15.get(r3);
        r3 = (java.lang.String) r3;
        r4 = "p";
        r4 = r15.get(r4);
        r4 = (java.lang.String) r4;
        r5 = "c";
        r5 = r15.get(r5);
        r5 = (java.lang.String) r5;
        r6 = "f";
        r6 = r15.get(r6);
        r6 = (java.lang.String) r6;
        r7 = "e";
        r7 = r15.get(r7);
        r7 = (java.lang.String) r7;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        r8.m5726a(r0);
        goto L_0x0023;
    L_0x02cc:
        r2 = r1;
        goto L_0x0292;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aiz.a(com.google.android.gms.internal.jf, java.util.Map):void");
    }
}
