package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.js.zzl;
import com.google.android.gms.ads.internal.zzbv;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public final class ao extends C1573r {
    private static final Object f5489a = new Object();
    private static ao f5490b;
    private final Context f5491c;
    private final an f5492d;
    private final adb f5493e;
    private final zzl f5494f;

    private ao(Context context, adb com_google_android_gms_internal_adb, an anVar) {
        this(context, com_google_android_gms_internal_adb, anVar, zzbv.zzeq().m4677a(context, new zzajk(11220208, 11220208, true)).f5279a);
    }

    private ao(Context context, adb com_google_android_gms_internal_adb, an anVar, zzl com_google_android_gms_ads_internal_js_zzl) {
        this.f5491c = context;
        this.f5492d = anVar;
        this.f5493e = com_google_android_gms_internal_adb;
        this.f5494f = com_google_android_gms_ads_internal_js_zzl;
    }

    public static ao m4993a(Context context, adb com_google_android_gms_internal_adb, an anVar) {
        ao aoVar;
        synchronized (f5489a) {
            if (f5490b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                ado.m4219a(context);
                f5490b = new ao(context, com_google_android_gms_internal_adb, anVar);
            }
            aoVar = f5490b;
        }
        return aoVar;
    }

    private static zzaao m4994a(Context context, zzl com_google_android_gms_ads_internal_js_zzl, an anVar, zzaak com_google_android_gms_internal_zzaak) {
        Future a;
        Future a2;
        id.m5372a(3);
        aec com_google_android_gms_internal_aec = new aec(((Boolean) zzbv.zzen().m4217a(ado.f4868G)).booleanValue(), "load_ad", com_google_android_gms_internal_zzaak.f7614d.f7758a);
        if (com_google_android_gms_internal_zzaak.f7611a > 10 && com_google_android_gms_internal_zzaak.f7585A != -1) {
            com_google_android_gms_internal_aec.m4237a(com_google_android_gms_internal_aec.m4234a(com_google_android_gms_internal_zzaak.f7585A), "cts");
        }
        aea a3 = com_google_android_gms_internal_aec.m4233a();
        Future a4 = anVar.f5425h.mo2006a();
        Future a5 = anVar.f5424g.mo2021a();
        dz dzVar = anVar.f5420c;
        String str = com_google_android_gms_internal_zzaak.f7617g.packageName;
        Future a6 = dzVar.mo2086a();
        ed edVar = anVar.f5426i;
        str = com_google_android_gms_internal_zzaak.f7618h;
        PackageInfo packageInfo = com_google_android_gms_internal_zzaak.f7617g;
        Future a7 = edVar.mo2088a(str);
        Future a8 = zzbv.zzek().m5125a(context);
        ik a9 = ih.m5638a(null);
        Bundle bundle = com_google_android_gms_internal_zzaak.f7613c.f7742c;
        Object obj = (bundle == null || bundle.getString("_ad") == null) ? null : 1;
        if (com_google_android_gms_internal_zzaak.f7591G && obj == null) {
            ali com_google_android_gms_internal_ali = anVar.f5423f;
            ApplicationInfo applicationInfo = com_google_android_gms_internal_zzaak.f7616f;
            a = com_google_android_gms_internal_ali.mo1876a();
        } else {
            Object obj2 = a9;
        }
        a9 = ih.m5638a(null);
        if (((Boolean) zzbv.zzen().m4217a(ado.ax)).booleanValue()) {
            a2 = anVar.f5426i.mo2087a(context);
        } else {
            Object obj3 = a9;
        }
        Bundle bundle2 = (com_google_android_gms_internal_zzaak.f7611a < 4 || com_google_android_gms_internal_zzaak.f7625o == null) ? null : com_google_android_gms_internal_zzaak.f7625o;
        ((Boolean) zzbv.zzen().m4217a(ado.f4884W)).booleanValue();
        zzbv.zzea();
        if (gb.m5458a(context, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
            if (((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() == null) {
                id.m5372a(3);
            }
        }
        String uuid = com_google_android_gms_internal_zzaak.f7611a >= 7 ? com_google_android_gms_internal_zzaak.f7632v : UUID.randomUUID().toString();
        ax axVar = new ax(uuid, com_google_android_gms_internal_zzaak.f7616f.packageName);
        if (com_google_android_gms_internal_zzaak.f7613c.f7742c != null) {
            String string = com_google_android_gms_internal_zzaak.f7613c.f7742c.getString("_ad");
            if (string != null) {
                return av.m5101a(context, com_google_android_gms_internal_zzaak, string);
            }
        }
        List a10 = anVar.f5421d.mo1732a(com_google_android_gms_internal_zzaak.f7633w);
        bundle = (Bundle) ih.m5640a(a4, null, ((Long) zzbv.zzen().m4217a(ado.cj)).longValue(), TimeUnit.MILLISECONDS);
        bq bqVar = (bq) ih.m5640a(a5, null, ((Long) zzbv.zzen().m4217a(ado.be)).longValue(), TimeUnit.MILLISECONDS);
        Location location = (Location) ih.m5640a(a, null, ((Long) zzbv.zzen().m4217a(ado.ca)).longValue(), TimeUnit.MILLISECONDS);
        Info info = (Info) ih.m5640a(a2, null, ((Long) zzbv.zzen().m4217a(ado.ay)).longValue(), TimeUnit.MILLISECONDS);
        String str2 = (String) ih.m5639a(a7, null);
        String str3 = (String) ih.m5639a(a6, null);
        be beVar = (be) ih.m5639a(a8, null);
        if (beVar == null) {
            id.m5370a("Error fetching device info. This is not recoverable.");
            return new zzaao(0);
        }
        am amVar = new am();
        amVar.f5389i = com_google_android_gms_internal_zzaak;
        amVar.f5390j = beVar;
        amVar.f5385e = bqVar;
        amVar.f5384d = location;
        amVar.f5382b = bundle;
        amVar.f5387g = str2;
        amVar.f5388h = info;
        if (a10 == null) {
            amVar.f5383c.clear();
        }
        amVar.f5383c = a10;
        amVar.f5381a = bundle2;
        amVar.f5386f = str3;
        amVar.f5391k = anVar.f5419b.mo2333a();
        amVar.f5392l = anVar.f5427j;
        JSONObject a11 = av.m5105a(context, amVar);
        if (a11 == null) {
            return new zzaao(0);
        }
        if (com_google_android_gms_internal_zzaak.f7611a < 7) {
            try {
                a11.put("request_id", uuid);
            } catch (JSONException e) {
            }
        }
        String jSONObject = a11.toString();
        com_google_android_gms_internal_aec.m4237a(a3, "arc");
        gb.f6131a.post(new ap(com_google_android_gms_ads_internal_js_zzl, axVar, com_google_android_gms_internal_aec, com_google_android_gms_internal_aec.m4233a(), jSONObject));
        zzaao com_google_android_gms_internal_zzaao;
        try {
            bd bdVar = (bd) axVar.f5702d.get(10, TimeUnit.SECONDS);
            if (bdVar == null) {
                com_google_android_gms_internal_zzaao = new zzaao(0);
                return com_google_android_gms_internal_zzaao;
            } else if (bdVar.f5753i != -2) {
                com_google_android_gms_internal_zzaao = new zzaao(bdVar.f5753i);
                gb.f6131a.post(new as(anVar, context, com_google_android_gms_internal_zzaak, axVar));
                return com_google_android_gms_internal_zzaao;
            } else {
                if (com_google_android_gms_internal_aec.m4240d() != null) {
                    com_google_android_gms_internal_aec.m4237a(com_google_android_gms_internal_aec.m4240d(), "rur");
                }
                com_google_android_gms_internal_zzaao = null;
                if (!TextUtils.isEmpty(bdVar.f5751g)) {
                    com_google_android_gms_internal_zzaao = av.m5101a(context, com_google_android_gms_internal_zzaak, bdVar.f5751g);
                }
                if (com_google_android_gms_internal_zzaao == null && !TextUtils.isEmpty(bdVar.f5752h)) {
                    com_google_android_gms_internal_zzaao = m4995a(com_google_android_gms_internal_zzaak, context, com_google_android_gms_internal_zzaak.f7621k.f7706a, bdVar.f5752h, str3, bdVar, com_google_android_gms_internal_aec, anVar);
                }
                if (com_google_android_gms_internal_zzaao == null) {
                    com_google_android_gms_internal_zzaao = new zzaao(0);
                }
                com_google_android_gms_internal_aec.m4237a(a3, "tts");
                com_google_android_gms_internal_zzaao.f7677w = com_google_android_gms_internal_aec.m4238b();
                gb.f6131a.post(new as(anVar, context, com_google_android_gms_internal_zzaak, axVar));
                return com_google_android_gms_internal_zzaao;
            }
        } catch (Exception e2) {
            com_google_android_gms_internal_zzaao = new zzaao(0);
            return com_google_android_gms_internal_zzaao;
        } finally {
            gb.f6131a.post(new as(anVar, context, com_google_android_gms_internal_zzaak, axVar));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.zzaao m4995a(com.google.android.gms.internal.zzaak r44, android.content.Context r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, com.google.android.gms.internal.bd r49, com.google.android.gms.internal.aec r50, com.google.android.gms.internal.an r51) {
        /*
        if (r50 == 0) goto L_0x01b0;
    L_0x0002:
        r4 = r50.m4233a();
        r5 = r4;
    L_0x0007:
        r42 = new com.google.android.gms.internal.bb;	 Catch:{ IOException -> 0x01bb }
        r0 = r49;
        r4 = r0.f5746b;	 Catch:{ IOException -> 0x01bb }
        r0 = r42;
        r1 = r44;
        r0.<init>(r1, r4);	 Catch:{ IOException -> 0x01bb }
        r4 = "AdRequestServiceImpl: Sending request: ";
        r6 = java.lang.String.valueOf(r47);	 Catch:{ IOException -> 0x01bb }
        r7 = r6.length();	 Catch:{ IOException -> 0x01bb }
        if (r7 == 0) goto L_0x01b4;
    L_0x0020:
        r4.concat(r6);	 Catch:{ IOException -> 0x01bb }
    L_0x0023:
        r4 = 3;
        com.google.android.gms.internal.id.m5372a(r4);	 Catch:{ IOException -> 0x01bb }
        r6 = new java.net.URL;	 Catch:{ IOException -> 0x01bb }
        r0 = r47;
        r6.<init>(r0);	 Catch:{ IOException -> 0x01bb }
        r4 = 0;
        r7 = com.google.android.gms.ads.internal.zzbv.zzeg();	 Catch:{ IOException -> 0x01bb }
        r18 = r7.mo1670b();	 Catch:{ IOException -> 0x01bb }
        r8 = r4;
        r9 = r6;
    L_0x0039:
        r4 = r9.openConnection();	 Catch:{ IOException -> 0x01bb }
        r0 = r4;
        r0 = (java.net.HttpURLConnection) r0;	 Catch:{ IOException -> 0x01bb }
        r43 = r0;
        r4 = com.google.android.gms.ads.internal.zzbv.zzea();	 Catch:{ all -> 0x01e0 }
        r6 = 0;
        r0 = r45;
        r1 = r46;
        r2 = r43;
        r4.m5505a(r0, r1, r6, r2);	 Catch:{ all -> 0x01e0 }
        r4 = android.text.TextUtils.isEmpty(r48);	 Catch:{ all -> 0x01e0 }
        if (r4 != 0) goto L_0x0065;
    L_0x0056:
        r0 = r49;
        r4 = r0.f5749e;	 Catch:{ all -> 0x01e0 }
        if (r4 == 0) goto L_0x0065;
    L_0x005c:
        r4 = "x-afma-drt-cookie";
        r0 = r43;
        r1 = r48;
        r0.addRequestProperty(r4, r1);	 Catch:{ all -> 0x01e0 }
    L_0x0065:
        r0 = r44;
        r4 = r0.f7592H;	 Catch:{ all -> 0x01e0 }
        r6 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x01e0 }
        if (r6 != 0) goto L_0x007a;
    L_0x006f:
        r6 = 3;
        com.google.android.gms.internal.id.m5372a(r6);	 Catch:{ all -> 0x01e0 }
        r6 = "Cookie";
        r0 = r43;
        r0.addRequestProperty(r6, r4);	 Catch:{ all -> 0x01e0 }
    L_0x007a:
        if (r49 == 0) goto L_0x00aa;
    L_0x007c:
        r0 = r49;
        r4 = r0.f5747c;	 Catch:{ all -> 0x01e0 }
        r4 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x01e0 }
        if (r4 != 0) goto L_0x00aa;
    L_0x0086:
        r4 = 1;
        r0 = r43;
        r0.setDoOutput(r4);	 Catch:{ all -> 0x01e0 }
        r0 = r49;
        r4 = r0.f5747c;	 Catch:{ all -> 0x01e0 }
        r4 = r4.getBytes();	 Catch:{ all -> 0x01e0 }
        r6 = r4.length;	 Catch:{ all -> 0x01e0 }
        r0 = r43;
        r0.setFixedLengthStreamingMode(r6);	 Catch:{ all -> 0x01e0 }
        r7 = 0;
        r6 = new java.io.BufferedOutputStream;	 Catch:{ all -> 0x01da }
        r10 = r43.getOutputStream();	 Catch:{ all -> 0x01da }
        r6.<init>(r10);	 Catch:{ all -> 0x01da }
        r6.write(r4);	 Catch:{ all -> 0x0281 }
        com.google.android.gms.common.util.C1537f.m3940a(r6);	 Catch:{ all -> 0x01e0 }
    L_0x00aa:
        r4 = r43.getResponseCode();	 Catch:{ all -> 0x01e0 }
        r10 = r43.getHeaderFields();	 Catch:{ all -> 0x01e0 }
        r6 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r4 < r6) goto L_0x01eb;
    L_0x00b6:
        r6 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r4 >= r6) goto L_0x01eb;
    L_0x00ba:
        r8 = r9.toString();	 Catch:{ all -> 0x01e0 }
        r7 = 0;
        r6 = new java.io.InputStreamReader;	 Catch:{ all -> 0x01e5 }
        r9 = r43.getInputStream();	 Catch:{ all -> 0x01e5 }
        r6.<init>(r9);	 Catch:{ all -> 0x01e5 }
        com.google.android.gms.ads.internal.zzbv.zzea();	 Catch:{ all -> 0x027d }
        r7 = com.google.android.gms.internal.gb.m5440a(r6);	 Catch:{ all -> 0x027d }
        com.google.android.gms.common.util.C1537f.m3940a(r6);	 Catch:{ all -> 0x01e0 }
        m4996a(r8, r10, r7, r4);	 Catch:{ all -> 0x01e0 }
        r0 = r42;
        r0.f5721c = r7;	 Catch:{ all -> 0x01e0 }
        r0 = r42;
        r0.m5115a(r10);	 Catch:{ all -> 0x01e0 }
        if (r50 == 0) goto L_0x00ed;
    L_0x00e0:
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x01e0 }
        r6 = 0;
        r7 = "ufe";
        r4[r6] = r7;	 Catch:{ all -> 0x01e0 }
        r0 = r50;
        r0.m4237a(r5, r4);	 Catch:{ all -> 0x01e0 }
    L_0x00ed:
        r4 = new com.google.android.gms.internal.zzaao;	 Catch:{ all -> 0x01e0 }
        r0 = r42;
        r5 = r0.f5717H;	 Catch:{ all -> 0x01e0 }
        r0 = r42;
        r6 = r0.f5720b;	 Catch:{ all -> 0x01e0 }
        r0 = r42;
        r7 = r0.f5721c;	 Catch:{ all -> 0x01e0 }
        r0 = r42;
        r8 = r0.f5722d;	 Catch:{ all -> 0x01e0 }
        r0 = r42;
        r9 = r0.f5726h;	 Catch:{ all -> 0x01e0 }
        r0 = r42;
        r10 = r0.f5727i;	 Catch:{ all -> 0x01e0 }
        r0 = r42;
        r12 = r0.f5728j;	 Catch:{ all -> 0x01e0 }
        r0 = r42;
        r13 = r0.f5729k;	 Catch:{ all -> 0x01e0 }
        r0 = r42;
        r14 = r0.f5730l;	 Catch:{ all -> 0x01e0 }
        r0 = r42;
        r0 = r0.f5731m;	 Catch:{ all -> 0x01e0 }
        r16 = r0;
        r0 = r42;
        r0 = r0.f5719a;	 Catch:{ all -> 0x01e0 }
        r17 = r0;
        r0 = r42;
        r0 = r0.f5724f;	 Catch:{ all -> 0x01e0 }
        r20 = r0;
        r0 = r42;
        r0 = r0.f5725g;	 Catch:{ all -> 0x01e0 }
        r21 = r0;
        r0 = r42;
        r0 = r0.f5732n;	 Catch:{ all -> 0x01e0 }
        r22 = r0;
        r0 = r42;
        r0 = r0.f5733o;	 Catch:{ all -> 0x01e0 }
        r23 = r0;
        r0 = r42;
        r0 = r0.f5734p;	 Catch:{ all -> 0x01e0 }
        r24 = r0;
        r0 = r42;
        r0 = r0.f5735q;	 Catch:{ all -> 0x01e0 }
        r25 = r0;
        r0 = r42;
        r0 = r0.f5737s;	 Catch:{ all -> 0x01e0 }
        r26 = r0;
        r0 = r42;
        r0 = r0.f5738t;	 Catch:{ all -> 0x01e0 }
        r27 = r0;
        r0 = r42;
        r0 = r0.f5739u;	 Catch:{ all -> 0x01e0 }
        r28 = r0;
        r0 = r42;
        r0 = r0.f5740v;	 Catch:{ all -> 0x01e0 }
        r29 = r0;
        r0 = r42;
        r0 = r0.f5741w;	 Catch:{ all -> 0x01e0 }
        r30 = r0;
        r0 = r42;
        r0 = r0.f5742x;	 Catch:{ all -> 0x01e0 }
        r31 = r0;
        r0 = r42;
        r0 = r0.f5743y;	 Catch:{ all -> 0x01e0 }
        r32 = r0;
        r0 = r42;
        r0 = r0.f5744z;	 Catch:{ all -> 0x01e0 }
        r33 = r0;
        r0 = r42;
        r0 = r0.f5710A;	 Catch:{ all -> 0x01e0 }
        r34 = r0;
        r0 = r42;
        r0 = r0.f5711B;	 Catch:{ all -> 0x01e0 }
        r35 = r0;
        r0 = r42;
        r0 = r0.f5712C;	 Catch:{ all -> 0x01e0 }
        r36 = r0;
        r0 = r42;
        r0 = r0.f5713D;	 Catch:{ all -> 0x01e0 }
        r37 = r0;
        r0 = r42;
        r0 = r0.f5714E;	 Catch:{ all -> 0x01e0 }
        r38 = r0;
        r0 = r42;
        r0 = r0.f5715F;	 Catch:{ all -> 0x01e0 }
        r39 = r0;
        r0 = r42;
        r0 = r0.f5723e;	 Catch:{ all -> 0x01e0 }
        r40 = r0;
        r0 = r42;
        r0 = r0.f5736r;	 Catch:{ all -> 0x01e0 }
        r41 = r0;
        r0 = r42;
        r0 = r0.f5716G;	 Catch:{ all -> 0x01e0 }
        r42 = r0;
        r4.<init>(r5, r6, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42);	 Catch:{ all -> 0x01e0 }
        r43.disconnect();	 Catch:{ IOException -> 0x01bb }
    L_0x01af:
        return r4;
    L_0x01b0:
        r4 = 0;
        r5 = r4;
        goto L_0x0007;
    L_0x01b4:
        r6 = new java.lang.String;	 Catch:{ IOException -> 0x01bb }
        r6.<init>(r4);	 Catch:{ IOException -> 0x01bb }
        goto L_0x0023;
    L_0x01bb:
        r4 = move-exception;
        r5 = "Error while connecting to ad server: ";
        r4 = r4.getMessage();
        r4 = java.lang.String.valueOf(r4);
        r6 = r4.length();
        if (r6 == 0) goto L_0x0276;
    L_0x01cc:
        r4 = r5.concat(r4);
    L_0x01d0:
        com.google.android.gms.internal.id.m5370a(r4);
        r4 = new com.google.android.gms.internal.zzaao;
        r5 = 2;
        r4.<init>(r5);
        goto L_0x01af;
    L_0x01da:
        r4 = move-exception;
        r5 = r7;
    L_0x01dc:
        com.google.android.gms.common.util.C1537f.m3940a(r5);	 Catch:{ all -> 0x01e0 }
        throw r4;	 Catch:{ all -> 0x01e0 }
    L_0x01e0:
        r4 = move-exception;
        r43.disconnect();	 Catch:{ IOException -> 0x01bb }
        throw r4;	 Catch:{ IOException -> 0x01bb }
    L_0x01e5:
        r4 = move-exception;
        r5 = r7;
    L_0x01e7:
        com.google.android.gms.common.util.C1537f.m3940a(r5);	 Catch:{ all -> 0x01e0 }
        throw r4;	 Catch:{ all -> 0x01e0 }
    L_0x01eb:
        r6 = r9.toString();	 Catch:{ all -> 0x01e0 }
        r7 = 0;
        m4996a(r6, r10, r7, r4);	 Catch:{ all -> 0x01e0 }
        r6 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r4 < r6) goto L_0x0241;
    L_0x01f7:
        r6 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r4 >= r6) goto L_0x0241;
    L_0x01fb:
        r4 = "Location";
        r0 = r43;
        r4 = r0.getHeaderField(r4);	 Catch:{ all -> 0x01e0 }
        r6 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x01e0 }
        if (r6 == 0) goto L_0x0218;
    L_0x0209:
        r4 = "No location header to follow redirect.";
        com.google.android.gms.internal.id.m5370a(r4);	 Catch:{ all -> 0x01e0 }
        r4 = new com.google.android.gms.internal.zzaao;	 Catch:{ all -> 0x01e0 }
        r5 = 0;
        r4.<init>(r5);	 Catch:{ all -> 0x01e0 }
        r43.disconnect();	 Catch:{ IOException -> 0x01bb }
        goto L_0x01af;
    L_0x0218:
        r7 = new java.net.URL;	 Catch:{ all -> 0x01e0 }
        r7.<init>(r4);	 Catch:{ all -> 0x01e0 }
        r6 = r8 + 1;
        r4 = com.google.android.gms.internal.ado.cH;	 Catch:{ all -> 0x01e0 }
        r8 = com.google.android.gms.ads.internal.zzbv.zzen();	 Catch:{ all -> 0x01e0 }
        r4 = r8.m4217a(r4);	 Catch:{ all -> 0x01e0 }
        r4 = (java.lang.Integer) r4;	 Catch:{ all -> 0x01e0 }
        r4 = r4.intValue();	 Catch:{ all -> 0x01e0 }
        if (r6 <= r4) goto L_0x0264;
    L_0x0231:
        r4 = "Too many redirects.";
        com.google.android.gms.internal.id.m5370a(r4);	 Catch:{ all -> 0x01e0 }
        r4 = new com.google.android.gms.internal.zzaao;	 Catch:{ all -> 0x01e0 }
        r5 = 0;
        r4.<init>(r5);	 Catch:{ all -> 0x01e0 }
        r43.disconnect();	 Catch:{ IOException -> 0x01bb }
        goto L_0x01af;
    L_0x0241:
        r5 = 46;
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01e0 }
        r6.<init>(r5);	 Catch:{ all -> 0x01e0 }
        r5 = "Received error HTTP response code: ";
        r5 = r6.append(r5);	 Catch:{ all -> 0x01e0 }
        r4 = r5.append(r4);	 Catch:{ all -> 0x01e0 }
        r4 = r4.toString();	 Catch:{ all -> 0x01e0 }
        com.google.android.gms.internal.id.m5370a(r4);	 Catch:{ all -> 0x01e0 }
        r4 = new com.google.android.gms.internal.zzaao;	 Catch:{ all -> 0x01e0 }
        r5 = 0;
        r4.<init>(r5);	 Catch:{ all -> 0x01e0 }
        r43.disconnect();	 Catch:{ IOException -> 0x01bb }
        goto L_0x01af;
    L_0x0264:
        r0 = r42;
        r0.m5115a(r10);	 Catch:{ all -> 0x01e0 }
        r43.disconnect();	 Catch:{ IOException -> 0x01bb }
        if (r51 == 0) goto L_0x0272;
    L_0x026e:
        r8 = r6;
        r9 = r7;
        goto L_0x0039;
    L_0x0272:
        r8 = r6;
        r9 = r7;
        goto L_0x0039;
    L_0x0276:
        r4 = new java.lang.String;
        r4.<init>(r5);
        goto L_0x01d0;
    L_0x027d:
        r4 = move-exception;
        r5 = r6;
        goto L_0x01e7;
    L_0x0281:
        r4 = move-exception;
        r5 = r6;
        goto L_0x01dc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ao.a(com.google.android.gms.internal.zzaak, android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.bd, com.google.android.gms.internal.aec, com.google.android.gms.internal.an):com.google.android.gms.internal.zzaao");
    }

    private static void m4996a(String str, Map<String, List<String>> map, String str2, int i) {
        if (id.m5372a(2)) {
            new StringBuilder(String.valueOf(str).length() + 39).append("Http Response: {\n  URL:\n    ").append(str).append("\n  Headers:");
            es.m5373a();
            if (map != null) {
                for (String str3 : map.keySet()) {
                    String str32;
                    new StringBuilder(String.valueOf(str32).length() + 5).append("    ").append(str32).append(":");
                    es.m5373a();
                    for (String str322 : (List) map.get(str322)) {
                        String str4 = "      ";
                        str322 = String.valueOf(str322);
                        if (str322.length() != 0) {
                            str4.concat(str322);
                        } else {
                            str322 = new String(str4);
                        }
                        es.m5373a();
                    }
                }
            }
            es.m5373a();
            if (str2 != null) {
                for (int i2 = 0; i2 < Math.min(str2.length(), 100000); i2 += 1000) {
                    str2.substring(i2, Math.min(str2.length(), i2 + 1000));
                    es.m5373a();
                }
            } else {
                es.m5373a();
            }
            new StringBuilder(34).append("  Response Code:\n    ").append(i).append("\n}");
            es.m5373a();
        }
    }

    public final zzaao mo2002a(zzaak com_google_android_gms_internal_zzaak) {
        return m4994a(this.f5491c, this.f5494f, this.f5492d, com_google_android_gms_internal_zzaak);
    }

    public final void mo2003a(zzaak com_google_android_gms_internal_zzaak, C1587t c1587t) {
        zzbv.zzee().m5333a(this.f5491c, com_google_android_gms_internal_zzaak.f7621k);
        Future a = fv.m5425a(new at(this, com_google_android_gms_internal_zzaak, c1587t));
        zzbv.zzer().m5596a();
        zzbv.zzer().f6213a.postDelayed(new au(a), 60000);
    }

    public final void mo2004a(zzabd com_google_android_gms_internal_zzabd, C1655w c1655w) {
        es.m5373a();
        throw new IllegalArgumentException();
    }
}
