package com.google.android.gms.internal;

import java.lang.Thread.UncaughtExceptionHandler;

final class aqs implements UncaughtExceptionHandler {
    private /* synthetic */ UncaughtExceptionHandler f5670a;
    private /* synthetic */ aqq f5671b;

    aqs(aqq com_google_android_gms_internal_aqq, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f5671b = com_google_android_gms_internal_aqq;
        this.f5670a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(java.lang.Thread r3, java.lang.Throwable r4) {
        /* JADX: method processing error */
/*
Error: java.util.NoSuchElementException
	at java.util.HashMap$HashIterator.nextNode(HashMap.java:1431)
	at java.util.HashMap$KeyIterator.next(HashMap.java:1453)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.applyRemove(BlockFinallyExtract.java:535)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.extractFinally(BlockFinallyExtract.java:175)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.processExceptionHandler(BlockFinallyExtract.java:79)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.visit(BlockFinallyExtract.java:51)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r2 = this;
        r0 = r2.f5671b;	 Catch:{ Throwable -> 0x000f, all -> 0x001e }
        r0.m5091a(r4);	 Catch:{ Throwable -> 0x000f, all -> 0x001e }
        r0 = r2.f5670a;
        if (r0 == 0) goto L_0x000e;
    L_0x0009:
        r0 = r2.f5670a;
        r0.uncaughtException(r3, r4);
    L_0x000e:
        return;
    L_0x000f:
        r0 = move-exception;
        r0 = 6;
        com.google.android.gms.internal.id.m5372a(r0);	 Catch:{ Throwable -> 0x000f, all -> 0x001e }
        r0 = r2.f5670a;
        if (r0 == 0) goto L_0x000e;
    L_0x0018:
        r0 = r2.f5670a;
        r0.uncaughtException(r3, r4);
        goto L_0x000e;
    L_0x001e:
        r0 = move-exception;
        r1 = r2.f5670a;
        if (r1 == 0) goto L_0x0028;
    L_0x0023:
        r1 = r2.f5670a;
        r1.uncaughtException(r3, r4);
    L_0x0028:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aqs.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
