package com.bumptech.glide.load.resource.p053c;

import android.util.Log;
import com.bumptech.glide.load.C1302f;
import com.bumptech.glide.load.p044b.p046a.C1187c;
import com.bumptech.glide.p033b.C1091a.C1090a;
import java.io.IOException;
import java.io.OutputStream;

public final class C1357j implements C1302f<C1342b> {
    private static final C1356a f3806a = new C1356a();
    private final C1090a f3807b;
    private final C1187c f3808c;
    private final C1356a f3809d;

    static class C1356a {
        C1356a() {
        }
    }

    public C1357j(C1187c c1187c) {
        this(c1187c, f3806a);
    }

    private C1357j(C1187c c1187c, C1356a c1356a) {
        this.f3808c = c1187c;
        this.f3807b = new C1339a(c1187c);
        this.f3809d = c1356a;
    }

    private boolean m3526a(com.bumptech.glide.load.p044b.C1241l<com.bumptech.glide.load.resource.p053c.C1342b> r12, java.io.OutputStream r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.ssa.SSATransform.placePhi(SSATransform.java:82)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:50)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r11 = this;
        r3 = 0;
        r4 = com.bumptech.glide.p042h.C1158d.m3139a();
        r0 = r12.mo1367a();
        r0 = (com.bumptech.glide.load.resource.p053c.C1342b) r0;
        r1 = r0.f3763a;
        r6 = r1.f3757d;
        r1 = r6 instanceof com.bumptech.glide.load.resource.C1367d;
        if (r1 == 0) goto L_0x001c;
    L_0x0013:
        r0 = r0.f3763a;
        r0 = r0.f3755b;
        r3 = com.bumptech.glide.load.resource.p053c.C1357j.m3527a(r0, r13);
    L_0x001b:
        return r3;
    L_0x001c:
        r1 = r0.f3763a;
        r1 = r1.f3755b;
        r2 = new com.bumptech.glide.b.d;
        r2.<init>();
        r2.m2949a(r1);
        r2 = r2.m2948a();
        r7 = r11.f3807b;
        r8 = new com.bumptech.glide.b.a;
        r8.<init>(r7);
        r8.m2938a(r2, r1);
        r8.m2937a();
        r7 = new com.bumptech.glide.c.a;
        r7.<init>();
        r1 = r7.m2957a(r13);
        if (r1 == 0) goto L_0x001b;
    L_0x0044:
        r2 = r3;
    L_0x0045:
        r1 = r8.f3205f;
        r1 = r1.f3229c;
        if (r2 >= r1) goto L_0x009a;
    L_0x004b:
        r1 = r8.m2939b();
        r9 = r11.f3808c;
        r10 = new com.bumptech.glide.load.resource.bitmap.c;
        r10.<init>(r1, r9);
        r1 = r0.getIntrinsicWidth();
        r9 = r0.getIntrinsicHeight();
        r9 = r6.mo1379a(r10, r1, r9);
        r1 = r10.equals(r9);
        if (r1 != 0) goto L_0x006b;
    L_0x0068:
        r10.mo1369c();
    L_0x006b:
        r1 = r9.mo1367a();	 Catch:{ all -> 0x0095 }
        r1 = (android.graphics.Bitmap) r1;	 Catch:{ all -> 0x0095 }
        r1 = r7.m2956a(r1);	 Catch:{ all -> 0x0095 }
        if (r1 != 0) goto L_0x007b;
    L_0x0077:
        r9.mo1369c();
        goto L_0x001b;
    L_0x007b:
        r1 = r8.f3203d;	 Catch:{ all -> 0x0095 }
        r1 = r8.m2936a(r1);	 Catch:{ all -> 0x0095 }
        r1 = (float) r1;	 Catch:{ all -> 0x0095 }
        r10 = 1092616192; // 0x41200000 float:10.0 double:5.398241246E-315;	 Catch:{ all -> 0x0095 }
        r1 = r1 / r10;	 Catch:{ all -> 0x0095 }
        r1 = java.lang.Math.round(r1);	 Catch:{ all -> 0x0095 }
        r7.f3247a = r1;	 Catch:{ all -> 0x0095 }
        r8.m2937a();	 Catch:{ all -> 0x0095 }
        r9.mo1369c();
        r1 = r2 + 1;
        r2 = r1;
        goto L_0x0045;
    L_0x0095:
        r0 = move-exception;
        r9.mo1369c();
        throw r0;
    L_0x009a:
        r3 = r7.m2955a();
        r1 = "GifEncoder";
        r2 = 2;
        r1 = android.util.Log.isLoggable(r1, r2);
        if (r1 == 0) goto L_0x001b;
    L_0x00a7:
        r1 = new java.lang.StringBuilder;
        r2 = "Encoded gif with ";
        r1.<init>(r2);
        r2 = r8.f3205f;
        r2 = r2.f3229c;
        r1 = r1.append(r2);
        r2 = " frames and ";
        r1 = r1.append(r2);
        r0 = r0.f3763a;
        r0 = r0.f3755b;
        r0 = r0.length;
        r0 = r1.append(r0);
        r1 = " bytes in ";
        r0 = r0.append(r1);
        r4 = com.bumptech.glide.p042h.C1158d.m3138a(r4);
        r0 = r0.append(r4);
        r1 = " ms";
        r0.append(r1);
        goto L_0x001b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.c.j.a(com.bumptech.glide.load.b.l, java.io.OutputStream):boolean");
    }

    private static boolean m3527a(byte[] bArr, OutputStream outputStream) {
        try {
            outputStream.write(bArr);
            return true;
        } catch (IOException e) {
            Log.isLoggable("GifEncoder", 3);
            return false;
        }
    }

    public final String mo1376a() {
        return "";
    }
}
