package com.google.android.gms.internal;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@aqv
public final class ajq extends ajk {
    private static final Set<String> f5207b = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat f5208c = new DecimalFormat("#,###");
    private File f5209d;
    private boolean f5210e;

    public ajq(jf jfVar) {
        super(jfVar);
        File cacheDir = this.a.getCacheDir();
        if (cacheDir == null) {
            id.m5370a("Context.getCacheDir() returned null");
            return;
        }
        this.f5209d = new File(cacheDir, "admobVideoStreams");
        String str;
        String valueOf;
        if (!this.f5209d.isDirectory() && !this.f5209d.mkdirs()) {
            str = "Could not create preload cache directory at ";
            valueOf = String.valueOf(this.f5209d.getAbsolutePath());
            id.m5370a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.f5209d = null;
        } else if (!this.f5209d.setReadable(true, false) || !this.f5209d.setExecutable(true, false)) {
            str = "Could not set cache file permissions at ";
            valueOf = String.valueOf(this.f5209d.getAbsolutePath());
            id.m5370a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.f5209d = null;
        }
    }

    private final File m4601a(File file) {
        return new File(this.f5209d, String.valueOf(file.getName()).concat(".done"));
    }

    public final void mo1866a() {
        this.f5210e = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1867a(java.lang.String r27) {
        /*
        r26 = this;
        r0 = r26;
        r2 = r0.f5209d;
        if (r2 != 0) goto L_0x0013;
    L_0x0006:
        r2 = 0;
        r3 = "noCacheDir";
        r4 = 0;
        r0 = r26;
        r1 = r27;
        r0.m4598a(r1, r2, r3, r4);
        r2 = 0;
    L_0x0012:
        return r2;
    L_0x0013:
        r0 = r26;
        r2 = r0.f5209d;
        if (r2 != 0) goto L_0x0048;
    L_0x0019:
        r2 = 0;
        r3 = r2;
    L_0x001b:
        r2 = com.google.android.gms.internal.ado.f4896h;
        r4 = com.google.android.gms.ads.internal.zzbv.zzen();
        r2 = r4.m4217a(r2);
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        if (r3 <= r2) goto L_0x00b9;
    L_0x002d:
        r0 = r26;
        r2 = r0.f5209d;
        if (r2 != 0) goto L_0x006f;
    L_0x0033:
        r2 = 0;
    L_0x0034:
        if (r2 != 0) goto L_0x0013;
    L_0x0036:
        r2 = "Unable to expire stream cache";
        com.google.android.gms.internal.id.m5370a(r2);
        r2 = 0;
        r3 = "expireFailed";
        r4 = 0;
        r0 = r26;
        r1 = r27;
        r0.m4598a(r1, r2, r3, r4);
        r2 = 0;
        goto L_0x0012;
    L_0x0048:
        r3 = 0;
        r0 = r26;
        r2 = r0.f5209d;
        r4 = r2.listFiles();
        r5 = r4.length;
        r2 = 0;
        r25 = r2;
        r2 = r3;
        r3 = r25;
    L_0x0058:
        if (r3 >= r5) goto L_0x006d;
    L_0x005a:
        r6 = r4[r3];
        r6 = r6.getName();
        r7 = ".done";
        r6 = r6.endsWith(r7);
        if (r6 != 0) goto L_0x006a;
    L_0x0068:
        r2 = r2 + 1;
    L_0x006a:
        r3 = r3 + 1;
        goto L_0x0058;
    L_0x006d:
        r3 = r2;
        goto L_0x001b;
    L_0x006f:
        r7 = 0;
        r4 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r0 = r26;
        r2 = r0.f5209d;
        r9 = r2.listFiles();
        r10 = r9.length;
        r2 = 0;
        r8 = r2;
    L_0x0080:
        if (r8 >= r10) goto L_0x009f;
    L_0x0082:
        r6 = r9[r8];
        r2 = r6.getName();
        r3 = ".done";
        r2 = r2.endsWith(r3);
        if (r2 != 0) goto L_0x04f4;
    L_0x0090:
        r2 = r6.lastModified();
        r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r11 >= 0) goto L_0x04f4;
    L_0x0098:
        r4 = r6;
    L_0x0099:
        r5 = r8 + 1;
        r8 = r5;
        r7 = r4;
        r4 = r2;
        goto L_0x0080;
    L_0x009f:
        r2 = 0;
        if (r7 == 0) goto L_0x0034;
    L_0x00a2:
        r2 = r7.delete();
        r0 = r26;
        r3 = r0.m4601a(r7);
        r4 = r3.isFile();
        if (r4 == 0) goto L_0x0034;
    L_0x00b2:
        r3 = r3.delete();
        r2 = r2 & r3;
        goto L_0x0034;
    L_0x00b9:
        com.google.android.gms.internal.aak.m4022a();
        r2 = com.google.android.gms.internal.hz.m5615a(r27);
        r12 = new java.io.File;
        r0 = r26;
        r3 = r0.f5209d;
        r12.<init>(r3, r2);
        r0 = r26;
        r13 = r0.m4601a(r12);
        r2 = r12.isFile();
        if (r2 == 0) goto L_0x0107;
    L_0x00d5:
        r2 = r13.isFile();
        if (r2 == 0) goto L_0x0107;
    L_0x00db:
        r2 = r12.length();
        r2 = (int) r2;
        r3 = "Stream cache hit at ";
        r4 = java.lang.String.valueOf(r27);
        r5 = r4.length();
        if (r5 == 0) goto L_0x0101;
    L_0x00ec:
        r3.concat(r4);
    L_0x00ef:
        r3 = 3;
        com.google.android.gms.internal.id.m5372a(r3);
        r3 = r12.getAbsolutePath();
        r0 = r26;
        r1 = r27;
        r0.m4597a(r1, r3, r2);
        r2 = 1;
        goto L_0x0012;
    L_0x0101:
        r4 = new java.lang.String;
        r4.<init>(r3);
        goto L_0x00ef;
    L_0x0107:
        r0 = r26;
        r2 = r0.f5209d;
        r2 = r2.getAbsolutePath();
        r3 = java.lang.String.valueOf(r2);
        r2 = java.lang.String.valueOf(r27);
        r4 = r2.length();
        if (r4 == 0) goto L_0x0155;
    L_0x011d:
        r2 = r3.concat(r2);
        r8 = r2;
    L_0x0122:
        r3 = f5207b;
        monitor-enter(r3);
        r2 = f5207b;	 Catch:{ all -> 0x0152 }
        r2 = r2.contains(r8);	 Catch:{ all -> 0x0152 }
        if (r2 == 0) goto L_0x0162;
    L_0x012d:
        r4 = "Stream cache already in progress at ";
        r2 = java.lang.String.valueOf(r27);	 Catch:{ all -> 0x0152 }
        r5 = r2.length();	 Catch:{ all -> 0x0152 }
        if (r5 == 0) goto L_0x015c;
    L_0x0139:
        r2 = r4.concat(r2);	 Catch:{ all -> 0x0152 }
    L_0x013d:
        com.google.android.gms.internal.id.m5370a(r2);	 Catch:{ all -> 0x0152 }
        r2 = r12.getAbsolutePath();	 Catch:{ all -> 0x0152 }
        r4 = "inProgress";
        r5 = 0;
        r0 = r26;
        r1 = r27;
        r0.m4598a(r1, r2, r4, r5);	 Catch:{ all -> 0x0152 }
        r2 = 0;
        monitor-exit(r3);	 Catch:{ all -> 0x0152 }
        goto L_0x0012;
    L_0x0152:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0152 }
        throw r2;
    L_0x0155:
        r2 = new java.lang.String;
        r2.<init>(r3);
        r8 = r2;
        goto L_0x0122;
    L_0x015c:
        r2 = new java.lang.String;	 Catch:{ all -> 0x0152 }
        r2.<init>(r4);	 Catch:{ all -> 0x0152 }
        goto L_0x013d;
    L_0x0162:
        r2 = f5207b;	 Catch:{ all -> 0x0152 }
        r2.add(r8);	 Catch:{ all -> 0x0152 }
        monitor-exit(r3);	 Catch:{ all -> 0x0152 }
        r5 = 0;
        r10 = "error";
        r9 = 0;
        com.google.android.gms.ads.internal.zzbv.zzeo();	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = com.google.android.gms.internal.ado.f4902n;	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r3 = com.google.android.gms.ads.internal.zzbv.zzen();	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = r3.m4217a(r2);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = (java.lang.Integer) r2;	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = r2.intValue();	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r0 = r27;
        r3 = com.google.android.gms.internal.is.m5644a(r0, r2);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = r3 instanceof java.net.HttpURLConnection;	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        if (r2 == 0) goto L_0x0255;
    L_0x0189:
        r0 = r3;
        r0 = (java.net.HttpURLConnection) r0;	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = r0;
        r2 = r2.getResponseCode();	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r4 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r2 < r4) goto L_0x0255;
    L_0x0195:
        r4 = "badUrl";
        r6 = "HTTP request failed. Code: ";
        r3 = java.lang.Integer.toString(r2);	 Catch:{ IOException -> 0x0252, RuntimeException -> 0x04e7 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x0252, RuntimeException -> 0x04e7 }
        r7 = r3.length();	 Catch:{ IOException -> 0x0252, RuntimeException -> 0x04e7 }
        if (r7 == 0) goto L_0x024b;
    L_0x01a7:
        r3 = r6.concat(r3);	 Catch:{ IOException -> 0x0252, RuntimeException -> 0x04e7 }
    L_0x01ab:
        r6 = new java.io.IOException;	 Catch:{ IOException -> 0x01da, RuntimeException -> 0x04eb }
        r7 = java.lang.String.valueOf(r27);	 Catch:{ IOException -> 0x01da, RuntimeException -> 0x04eb }
        r7 = r7.length();	 Catch:{ IOException -> 0x01da, RuntimeException -> 0x04eb }
        r7 = r7 + 32;
        r9 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01da, RuntimeException -> 0x04eb }
        r9.<init>(r7);	 Catch:{ IOException -> 0x01da, RuntimeException -> 0x04eb }
        r7 = "HTTP status code ";
        r7 = r9.append(r7);	 Catch:{ IOException -> 0x01da, RuntimeException -> 0x04eb }
        r2 = r7.append(r2);	 Catch:{ IOException -> 0x01da, RuntimeException -> 0x04eb }
        r7 = " at ";
        r2 = r2.append(r7);	 Catch:{ IOException -> 0x01da, RuntimeException -> 0x04eb }
        r0 = r27;
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x01da, RuntimeException -> 0x04eb }
        r2 = r2.toString();	 Catch:{ IOException -> 0x01da, RuntimeException -> 0x04eb }
        r6.<init>(r2);	 Catch:{ IOException -> 0x01da, RuntimeException -> 0x04eb }
        throw r6;	 Catch:{ IOException -> 0x01da, RuntimeException -> 0x04eb }
    L_0x01da:
        r2 = move-exception;
    L_0x01db:
        r6 = r2 instanceof java.lang.RuntimeException;
        if (r6 == 0) goto L_0x01e8;
    L_0x01df:
        r6 = com.google.android.gms.ads.internal.zzbv.zzee();
        r7 = "VideoStreamFullFileCache.preload";
        r6.m5336a(r2, r7);
    L_0x01e8:
        r5.close();	 Catch:{ IOException -> 0x04e1, NullPointerException -> 0x04e4 }
    L_0x01eb:
        r0 = r26;
        r5 = r0.f5210e;
        if (r5 == 0) goto L_0x04b0;
    L_0x01f1:
        r2 = java.lang.String.valueOf(r27);
        r2 = r2.length();
        r2 = r2 + 26;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r2);
        r2 = "Preload aborted for URL \"";
        r2 = r5.append(r2);
        r0 = r27;
        r2 = r2.append(r0);
        r5 = "\"";
        r2.append(r5);
        r2 = 4;
        com.google.android.gms.internal.id.m5372a(r2);
    L_0x0215:
        r2 = r12.exists();
        if (r2 == 0) goto L_0x0238;
    L_0x021b:
        r2 = r12.delete();
        if (r2 != 0) goto L_0x0238;
    L_0x0221:
        r5 = "Could not delete partial cache file at ";
        r2 = r12.getAbsolutePath();
        r2 = java.lang.String.valueOf(r2);
        r6 = r2.length();
        if (r6 == 0) goto L_0x04da;
    L_0x0231:
        r2 = r5.concat(r2);
    L_0x0235:
        com.google.android.gms.internal.id.m5370a(r2);
    L_0x0238:
        r2 = r12.getAbsolutePath();
        r0 = r26;
        r1 = r27;
        r0.m4598a(r1, r2, r4, r3);
        r2 = f5207b;
        r2.remove(r8);
        r2 = 0;
        goto L_0x0012;
    L_0x024b:
        r3 = new java.lang.String;	 Catch:{ IOException -> 0x0252, RuntimeException -> 0x04e7 }
        r3.<init>(r6);	 Catch:{ IOException -> 0x0252, RuntimeException -> 0x04e7 }
        goto L_0x01ab;
    L_0x0252:
        r2 = move-exception;
        r3 = r9;
        goto L_0x01db;
    L_0x0255:
        r7 = r3.getContentLength();	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        if (r7 >= 0) goto L_0x028f;
    L_0x025b:
        r3 = "Stream cache aborted, missing content-length header at ";
        r2 = java.lang.String.valueOf(r27);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r4 = r2.length();	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        if (r4 == 0) goto L_0x0284;
    L_0x0267:
        r2 = r3.concat(r2);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
    L_0x026b:
        com.google.android.gms.internal.id.m5370a(r2);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = r12.getAbsolutePath();	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r3 = "contentLengthMissing";
        r4 = 0;
        r0 = r26;
        r1 = r27;
        r0.m4598a(r1, r2, r3, r4);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = f5207b;	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2.remove(r8);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = 0;
        goto L_0x0012;
    L_0x0284:
        r2 = new java.lang.String;	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        goto L_0x026b;
    L_0x028a:
        r2 = move-exception;
        r3 = r9;
        r4 = r10;
        goto L_0x01db;
    L_0x028f:
        r2 = f5208c;	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r14 = (long) r7;	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r4 = r2.format(r14);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = com.google.android.gms.internal.ado.f4897i;	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r6 = com.google.android.gms.ads.internal.zzbv.zzen();	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = r6.m4217a(r2);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = (java.lang.Integer) r2;	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r14 = r2.intValue();	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        if (r7 <= r14) goto L_0x030d;
    L_0x02a8:
        r2 = java.lang.String.valueOf(r4);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = r2.length();	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = r2 + 33;
        r3 = java.lang.String.valueOf(r27);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r3 = r3.length();	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = r2 + r3;
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r3.<init>(r2);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = "Content length ";
        r2 = r3.append(r2);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = r2.append(r4);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r3 = " exceeds limit at ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r0 = r27;
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        com.google.android.gms.internal.id.m5370a(r2);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r3 = "File too big for full file cache. Size: ";
        r2 = java.lang.String.valueOf(r4);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r4 = r2.length();	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        if (r4 == 0) goto L_0x0302;
    L_0x02e9:
        r2 = r3.concat(r2);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
    L_0x02ed:
        r3 = r12.getAbsolutePath();	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r4 = "sizeExceeded";
        r0 = r26;
        r1 = r27;
        r0.m4598a(r1, r3, r4, r2);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = f5207b;	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2.remove(r8);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = 0;
        goto L_0x0012;
    L_0x0302:
        r2 = new java.lang.String;	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        goto L_0x02ed;
    L_0x0308:
        r2 = move-exception;
        r3 = r9;
        r4 = r10;
        goto L_0x01db;
    L_0x030d:
        r2 = java.lang.String.valueOf(r4);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = r2.length();	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = r2 + 20;
        r6 = java.lang.String.valueOf(r27);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r6 = r6.length();	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = r2 + r6;
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r6.<init>(r2);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = "Caching ";
        r2 = r6.append(r2);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = r2.append(r4);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r4 = " bytes from ";
        r2 = r2.append(r4);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r0 = r27;
        r2.append(r0);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = 3;
        com.google.android.gms.internal.id.m5372a(r2);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r2 = r3.getInputStream();	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r15 = java.nio.channels.Channels.newChannel(r2);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r11 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r11.<init>(r12);	 Catch:{ IOException -> 0x028a, RuntimeException -> 0x0308 }
        r16 = r11.getChannel();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r17 = java.nio.ByteBuffer.allocate(r2);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r18 = com.google.android.gms.ads.internal.zzbv.zzeg();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r6 = 0;
        r20 = r18.mo1669a();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2 = com.google.android.gms.internal.ado.f4901m;	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r3 = com.google.android.gms.ads.internal.zzbv.zzen();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2 = r3.m4217a(r2);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2 = (java.lang.Long) r2;	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2 = r2.longValue();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r19 = new com.google.android.gms.internal.hr;	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r0 = r19;
        r0.<init>(r2);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2 = com.google.android.gms.internal.ado.f4900l;	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r3 = com.google.android.gms.ads.internal.zzbv.zzen();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2 = r3.m4217a(r2);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2 = (java.lang.Long) r2;	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r22 = r2.longValue();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
    L_0x0385:
        r0 = r17;
        r2 = r15.read(r0);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        if (r2 < 0) goto L_0x0443;
    L_0x038d:
        r6 = r6 + r2;
        if (r6 <= r14) goto L_0x03bd;
    L_0x0390:
        r4 = "sizeExceeded";
        r2 = "File too big for full file cache. Size: ";
        r3 = java.lang.Integer.toString(r6);	 Catch:{ IOException -> 0x03b8, RuntimeException -> 0x041c }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x03b8, RuntimeException -> 0x041c }
        r5 = r3.length();	 Catch:{ IOException -> 0x03b8, RuntimeException -> 0x041c }
        if (r5 == 0) goto L_0x03b2;
    L_0x03a2:
        r3 = r2.concat(r3);	 Catch:{ IOException -> 0x03b8, RuntimeException -> 0x041c }
    L_0x03a6:
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x03ae, RuntimeException -> 0x0408 }
        r5 = "stream cache file size limit exceeded";
        r2.<init>(r5);	 Catch:{ IOException -> 0x03ae, RuntimeException -> 0x0408 }
        throw r2;	 Catch:{ IOException -> 0x03ae, RuntimeException -> 0x0408 }
    L_0x03ae:
        r2 = move-exception;
        r5 = r11;
        goto L_0x01db;
    L_0x03b2:
        r3 = new java.lang.String;	 Catch:{ IOException -> 0x03b8, RuntimeException -> 0x041c }
        r3.<init>(r2);	 Catch:{ IOException -> 0x03b8, RuntimeException -> 0x041c }
        goto L_0x03a6;
    L_0x03b8:
        r2 = move-exception;
        r3 = r9;
        r5 = r11;
        goto L_0x01db;
    L_0x03bd:
        r17.flip();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
    L_0x03c0:
        r2 = r16.write(r17);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        if (r2 > 0) goto L_0x03c0;
    L_0x03c6:
        r17.clear();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2 = r18.mo1669a();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2 = r2 - r20;
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r22;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x040c;
    L_0x03d7:
        r4 = "downloadTimeout";
        r2 = java.lang.Long.toString(r22);	 Catch:{ IOException -> 0x03b8, RuntimeException -> 0x041c }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x03b8, RuntimeException -> 0x041c }
        r3 = r3.length();	 Catch:{ IOException -> 0x03b8, RuntimeException -> 0x041c }
        r3 = r3 + 29;
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x03b8, RuntimeException -> 0x041c }
        r5.<init>(r3);	 Catch:{ IOException -> 0x03b8, RuntimeException -> 0x041c }
        r3 = "Timeout exceeded. Limit: ";
        r3 = r5.append(r3);	 Catch:{ IOException -> 0x03b8, RuntimeException -> 0x041c }
        r2 = r3.append(r2);	 Catch:{ IOException -> 0x03b8, RuntimeException -> 0x041c }
        r3 = " sec";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x03b8, RuntimeException -> 0x041c }
        r3 = r2.toString();	 Catch:{ IOException -> 0x03b8, RuntimeException -> 0x041c }
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x03ae, RuntimeException -> 0x0408 }
        r5 = "stream cache time limit exceeded";
        r2.<init>(r5);	 Catch:{ IOException -> 0x03ae, RuntimeException -> 0x0408 }
        throw r2;	 Catch:{ IOException -> 0x03ae, RuntimeException -> 0x0408 }
    L_0x0408:
        r2 = move-exception;
        r5 = r11;
        goto L_0x01db;
    L_0x040c:
        r0 = r26;
        r2 = r0.f5210e;	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        if (r2 == 0) goto L_0x0421;
    L_0x0412:
        r4 = "externalAbort";
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x03b8, RuntimeException -> 0x041c }
        r3 = "abort requested";
        r2.<init>(r3);	 Catch:{ IOException -> 0x03b8, RuntimeException -> 0x041c }
        throw r2;	 Catch:{ IOException -> 0x03b8, RuntimeException -> 0x041c }
    L_0x041c:
        r2 = move-exception;
        r3 = r9;
        r5 = r11;
        goto L_0x01db;
    L_0x0421:
        r2 = r19.m5599a();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        if (r2 == 0) goto L_0x0385;
    L_0x0427:
        r5 = r12.getAbsolutePath();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r24 = com.google.android.gms.internal.hz.f6240a;	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2 = new com.google.android.gms.internal.ajl;	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r3 = r26;
        r4 = r27;
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r0 = r24;
        r0.post(r2);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        goto L_0x0385;
    L_0x043d:
        r2 = move-exception;
        r3 = r9;
        r4 = r10;
        r5 = r11;
        goto L_0x01db;
    L_0x0443:
        r11.close();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2 = 3;
        r2 = com.google.android.gms.internal.id.m5372a(r2);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        if (r2 == 0) goto L_0x0485;
    L_0x044d:
        r2 = f5208c;	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r4 = (long) r6;	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2 = r2.format(r4);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r3 = r3.length();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r3 = r3 + 22;
        r4 = java.lang.String.valueOf(r27);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r4 = r4.length();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r3 = r3 + r4;
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r4.<init>(r3);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r3 = "Preloaded ";
        r3 = r4.append(r3);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2 = r3.append(r2);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r3 = " bytes from ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r0 = r27;
        r2.append(r0);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2 = 3;
        com.google.android.gms.internal.id.m5372a(r2);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
    L_0x0485:
        r2 = 1;
        r3 = 0;
        r12.setReadable(r2, r3);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2 = r13.isFile();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        if (r2 == 0) goto L_0x04aa;
    L_0x0490:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r13.setLastModified(r2);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
    L_0x0497:
        r2 = r12.getAbsolutePath();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r0 = r26;
        r1 = r27;
        r0.m4597a(r1, r2, r6);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2 = f5207b;	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2.remove(r8);	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x04ee }
        r2 = 1;
        goto L_0x0012;
    L_0x04aa:
        r13.createNewFile();	 Catch:{ IOException -> 0x04ae, RuntimeException -> 0x04ee }
        goto L_0x0497;
    L_0x04ae:
        r2 = move-exception;
        goto L_0x0497;
    L_0x04b0:
        r5 = java.lang.String.valueOf(r27);
        r5 = r5.length();
        r5 = r5 + 25;
        r6 = new java.lang.StringBuilder;
        r6.<init>(r5);
        r5 = "Preload failed for URL \"";
        r5 = r6.append(r5);
        r0 = r27;
        r5 = r5.append(r0);
        r6 = "\"";
        r5 = r5.append(r6);
        r5 = r5.toString();
        com.google.android.gms.internal.id.m5371a(r5, r2);
        goto L_0x0215;
    L_0x04da:
        r2 = new java.lang.String;
        r2.<init>(r5);
        goto L_0x0235;
    L_0x04e1:
        r5 = move-exception;
        goto L_0x01eb;
    L_0x04e4:
        r5 = move-exception;
        goto L_0x01eb;
    L_0x04e7:
        r2 = move-exception;
        r3 = r9;
        goto L_0x01db;
    L_0x04eb:
        r2 = move-exception;
        goto L_0x01db;
    L_0x04ee:
        r2 = move-exception;
        r3 = r9;
        r4 = r10;
        r5 = r11;
        goto L_0x01db;
    L_0x04f4:
        r2 = r4;
        r4 = r7;
        goto L_0x0099;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ajq.a(java.lang.String):boolean");
    }
}
