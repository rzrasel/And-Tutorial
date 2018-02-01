package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType;
import com.bumptech.glide.p042h.C1160f;
import com.bumptech.glide.p042h.C1163h;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;

public abstract class C1320f implements C1315a<InputStream> {
    public static final C1320f f3708a = new C13211();
    public static final C1320f f3709b = new C13222();
    public static final C1320f f3710c = new C13233();
    private static final Set<ImageType> f3711d = EnumSet.of(ImageType.JPEG, ImageType.PNG_A, ImageType.PNG);
    private static final Queue<Options> f3712e = C1163h.m3153a(0);

    static class C13211 extends C1320f {
        C13211() {
        }

        protected final int mo1384a(int i, int i2, int i3, int i4) {
            return Math.min(i2 / i4, i / i3);
        }

        public final String mo1385a() {
            return "AT_LEAST.com.bumptech.glide.load.data.bitmap";
        }
    }

    static class C13222 extends C1320f {
        C13222() {
        }

        protected final int mo1384a(int i, int i2, int i3, int i4) {
            int i5 = 1;
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return max << i5;
        }

        public final String mo1385a() {
            return "AT_MOST.com.bumptech.glide.load.data.bitmap";
        }
    }

    static class C13233 extends C1320f {
        C13233() {
        }

        protected final int mo1384a(int i, int i2, int i3, int i4) {
            return 0;
        }

        public final String mo1385a() {
            return "NONE.com.bumptech.glide.load.data.bitmap";
        }
    }

    private static android.graphics.Bitmap.Config m3444a(java.io.InputStream r6, com.bumptech.glide.load.C1176a r7) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0071 in list []
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r5 = 5;
        r0 = com.bumptech.glide.load.C1176a.ALWAYS_ARGB_8888;
        if (r7 == r0) goto L_0x000f;
    L_0x0005:
        r0 = com.bumptech.glide.load.C1176a.PREFER_ARGB_8888;
        if (r7 == r0) goto L_0x000f;
    L_0x0009:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 16;
        if (r0 != r1) goto L_0x0012;
    L_0x000f:
        r0 = android.graphics.Bitmap.Config.ARGB_8888;
    L_0x0011:
        return r0;
    L_0x0012:
        r1 = 0;
        r0 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r6.mark(r0);
        r0 = new com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;	 Catch:{ IOException -> 0x003e, all -> 0x0073 }
        r0.<init>(r6);	 Catch:{ IOException -> 0x003e, all -> 0x0073 }
        r0 = r0.m3432a();	 Catch:{ IOException -> 0x003e, all -> 0x0073 }
        r0 = r0.hasAlpha();	 Catch:{ IOException -> 0x003e, all -> 0x0073 }
        r6.reset();	 Catch:{ IOException -> 0x002d }
    L_0x0028:
        if (r0 == 0) goto L_0x0089;
    L_0x002a:
        r0 = android.graphics.Bitmap.Config.ARGB_8888;
        goto L_0x0011;
    L_0x002d:
        r1 = move-exception;
        r2 = "Downsampler";
        r2 = android.util.Log.isLoggable(r2, r5);
        if (r2 == 0) goto L_0x0028;
    L_0x0036:
        r2 = "Downsampler";
        r3 = "Cannot reset the input stream";
        android.util.Log.w(r2, r3, r1);
        goto L_0x0028;
    L_0x003e:
        r0 = move-exception;
        r2 = "Downsampler";	 Catch:{ IOException -> 0x003e, all -> 0x0073 }
        r3 = 5;	 Catch:{ IOException -> 0x003e, all -> 0x0073 }
        r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ IOException -> 0x003e, all -> 0x0073 }
        if (r2 == 0) goto L_0x005c;	 Catch:{ IOException -> 0x003e, all -> 0x0073 }
    L_0x0048:
        r2 = "Downsampler";	 Catch:{ IOException -> 0x003e, all -> 0x0073 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x003e, all -> 0x0073 }
        r4 = "Cannot determine whether the image has alpha or not from header for format ";	 Catch:{ IOException -> 0x003e, all -> 0x0073 }
        r3.<init>(r4);	 Catch:{ IOException -> 0x003e, all -> 0x0073 }
        r3 = r3.append(r7);	 Catch:{ IOException -> 0x003e, all -> 0x0073 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x003e, all -> 0x0073 }
        android.util.Log.w(r2, r3, r0);	 Catch:{ IOException -> 0x003e, all -> 0x0073 }
    L_0x005c:
        r6.reset();
        r0 = r1;
        goto L_0x0028;
    L_0x0061:
        r0 = move-exception;
        r2 = "Downsampler";
        r2 = android.util.Log.isLoggable(r2, r5);
        if (r2 == 0) goto L_0x0071;
    L_0x006a:
        r2 = "Downsampler";
        r3 = "Cannot reset the input stream";
        android.util.Log.w(r2, r3, r0);
    L_0x0071:
        r0 = r1;
        goto L_0x0028;
    L_0x0073:
        r0 = move-exception;
        r6.reset();	 Catch:{ IOException -> 0x0078 }
    L_0x0077:
        throw r0;
    L_0x0078:
        r1 = move-exception;
        r2 = "Downsampler";
        r2 = android.util.Log.isLoggable(r2, r5);
        if (r2 == 0) goto L_0x0077;
    L_0x0081:
        r2 = "Downsampler";
        r3 = "Cannot reset the input stream";
        android.util.Log.w(r2, r3, r1);
        goto L_0x0077;
    L_0x0089:
        r0 = android.graphics.Bitmap.Config.RGB_565;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.f.a(java.io.InputStream, com.bumptech.glide.load.a):android.graphics.Bitmap$Config");
    }

    private static Bitmap m3445a(C1160f c1160f, C1333n c1333n, Options options) {
        if (options.inJustDecodeBounds) {
            c1160f.mark(5242880);
        } else {
            c1333n.m3480a();
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(c1160f, null, options);
        try {
            if (options.inJustDecodeBounds) {
                c1160f.reset();
            }
        } catch (IOException e) {
            if (Log.isLoggable("Downsampler", 6)) {
                new StringBuilder("Exception loading inDecodeBounds=").append(options.inJustDecodeBounds).append(" sample=").append(options.inSampleSize);
            }
        }
        return decodeStream;
    }

    private static void m3446a(Options options) {
        C1320f.m3449b(options);
        synchronized (f3712e) {
            f3712e.offer(options);
        }
    }

    private static boolean m3447a(java.io.InputStream r4) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0046 in list []
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r3 = 5;
        r0 = 19;
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r0 > r1) goto L_0x0009;
    L_0x0007:
        r0 = 1;
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r4.mark(r0);
        r0 = new com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;	 Catch:{ IOException -> 0x0032, all -> 0x0059 }
        r0.<init>(r4);	 Catch:{ IOException -> 0x0032, all -> 0x0059 }
        r0 = r0.m3432a();	 Catch:{ IOException -> 0x0032, all -> 0x0059 }
        r1 = f3711d;	 Catch:{ IOException -> 0x0032, all -> 0x0059 }
        r0 = r1.contains(r0);	 Catch:{ IOException -> 0x0032, all -> 0x0059 }
        r4.reset();	 Catch:{ IOException -> 0x0021 }
        goto L_0x0008;
    L_0x0021:
        r1 = move-exception;
        r2 = "Downsampler";
        r2 = android.util.Log.isLoggable(r2, r3);
        if (r2 == 0) goto L_0x0008;
    L_0x002a:
        r2 = "Downsampler";
        r3 = "Cannot reset the input stream";
        android.util.Log.w(r2, r3, r1);
        goto L_0x0008;
    L_0x0032:
        r0 = move-exception;
        r1 = "Downsampler";	 Catch:{ IOException -> 0x0032, all -> 0x0059 }
        r2 = 5;	 Catch:{ IOException -> 0x0032, all -> 0x0059 }
        r1 = android.util.Log.isLoggable(r1, r2);	 Catch:{ IOException -> 0x0032, all -> 0x0059 }
        if (r1 == 0) goto L_0x0043;	 Catch:{ IOException -> 0x0032, all -> 0x0059 }
    L_0x003c:
        r1 = "Downsampler";	 Catch:{ IOException -> 0x0032, all -> 0x0059 }
        r2 = "Cannot determine the image type from header";	 Catch:{ IOException -> 0x0032, all -> 0x0059 }
        android.util.Log.w(r1, r2, r0);	 Catch:{ IOException -> 0x0032, all -> 0x0059 }
    L_0x0043:
        r4.reset();
    L_0x0046:
        r0 = 0;
        goto L_0x0008;
    L_0x0048:
        r0 = move-exception;
        r1 = "Downsampler";
        r1 = android.util.Log.isLoggable(r1, r3);
        if (r1 == 0) goto L_0x0046;
    L_0x0051:
        r1 = "Downsampler";
        r2 = "Cannot reset the input stream";
        android.util.Log.w(r1, r2, r0);
        goto L_0x0046;
    L_0x0059:
        r0 = move-exception;
        r4.reset();	 Catch:{ IOException -> 0x005e }
    L_0x005d:
        throw r0;
    L_0x005e:
        r1 = move-exception;
        r2 = "Downsampler";
        r2 = android.util.Log.isLoggable(r2, r3);
        if (r2 == 0) goto L_0x005d;
    L_0x0067:
        r2 = "Downsampler";
        r3 = "Cannot reset the input stream";
        android.util.Log.w(r2, r3, r1);
        goto L_0x005d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.f.a(java.io.InputStream):boolean");
    }

    @TargetApi(11)
    private static synchronized Options m3448b() {
        Options options;
        synchronized (C1320f.class) {
            synchronized (f3712e) {
                options = (Options) f3712e.poll();
            }
            if (options == null) {
                options = new Options();
                C1320f.m3449b(options);
            }
        }
        return options;
    }

    @TargetApi(11)
    private static void m3449b(Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        if (11 <= VERSION.SDK_INT) {
            options.inBitmap = null;
            options.inMutable = true;
        }
    }

    protected abstract int mo1384a(int i, int i2, int i3, int i4);

    public final android.graphics.Bitmap m3451a(java.io.InputStream r21, com.bumptech.glide.load.p044b.p046a.C1187c r22, int r23, int r24, com.bumptech.glide.load.C1176a r25) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0218 in list []
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r20 = this;
        r8 = com.bumptech.glide.p042h.C1155a.m3131a();
        r9 = r8.m3133b();
        r10 = r8.m3133b();
        r11 = com.bumptech.glide.load.resource.bitmap.C1320f.m3448b();
        r12 = new com.bumptech.glide.load.resource.bitmap.n;
        r0 = r21;
        r12.<init>(r0, r10);
        r13 = com.bumptech.glide.p042h.C1157c.m3136a(r12);
        r14 = new com.bumptech.glide.h.f;
        r14.<init>(r13);
        r4 = 5242880; // 0x500000 float:7.34684E-39 double:2.590327E-317;
        r13.mark(r4);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r5 = 0;
        r6 = new com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r6.<init>(r13);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = r6.f3702b;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = r4.m3426a();	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.m3431a(r4);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        if (r4 == 0) goto L_0x01d9;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0037:
        r4 = r6.f3702b;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = r4.m3429b();	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        if (r4 == r7) goto L_0x012e;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0041:
        r4 = "ImageHeaderParser";	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r6 = 3;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        android.util.Log.isLoggable(r4, r6);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = 0;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r7 = r4;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0049:
        if (r7 == 0) goto L_0x01d2;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x004b:
        r4 = r7.length;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r6 = com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.f3700a;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r6 = r6.length;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        if (r4 <= r6) goto L_0x01d2;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0051:
        r4 = 1;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0052:
        if (r4 == 0) goto L_0x0065;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0054:
        r6 = 0;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0055:
        r15 = com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.f3700a;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r15 = r15.length;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        if (r6 >= r15) goto L_0x0065;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x005a:
        r15 = r7[r6];	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r16 = com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.f3700a;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r16 = r16[r6];	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r0 = r16;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        if (r15 == r0) goto L_0x01d5;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0064:
        r4 = 0;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0065:
        if (r4 == 0) goto L_0x01d9;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0067:
        r4 = new com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$a;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4.<init>(r7);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.m3430a(r4);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0070:
        r13.reset();	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r7 = r4;
    L_0x0074:
        r11.inTempStorage = r9;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4 = 1;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r11.inJustDecodeBounds = r4;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        com.bumptech.glide.load.resource.bitmap.C1320f.m3445a(r14, r12, r11);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4 = 0;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r11.inJustDecodeBounds = r4;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4 = 2;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4 = new int[r4];	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r5 = 0;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6 = r11.outWidth;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4[r5] = r6;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r5 = 1;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6 = r11.outHeight;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4[r5] = r6;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r5 = 0;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r5 = r4[r5];	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6 = 1;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6 = r4[r6];	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        switch(r7) {
            case 3: goto L_0x0236;
            case 4: goto L_0x0236;
            case 5: goto L_0x0232;
            case 6: goto L_0x0232;
            case 7: goto L_0x023a;
            case 8: goto L_0x023a;
            default: goto L_0x0095;
        };	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x0095:
        r4 = 0;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x0096:
        r15 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r0 = r24;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        if (r0 != r15) goto L_0x009e;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x009c:
        r24 = r6;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x009e:
        r15 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r0 = r23;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        if (r0 != r15) goto L_0x00a6;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x00a4:
        r23 = r5;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x00a6:
        r15 = 90;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        if (r4 == r15) goto L_0x00ae;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x00aa:
        r15 = 270; // 0x10e float:3.78E-43 double:1.334E-321;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        if (r4 != r15) goto L_0x023e;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x00ae:
        r0 = r20;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r1 = r23;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r2 = r24;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4 = r0.mo1384a(r6, r5, r1, r2);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x00b8:
        if (r4 != 0) goto L_0x024a;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x00ba:
        r4 = 0;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x00bb:
        r15 = 1;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4 = java.lang.Math.max(r15, r4);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r0 = r25;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r15 = com.bumptech.glide.load.resource.bitmap.C1320f.m3444a(r14, r0);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r11.inSampleSize = r4;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r11.inPreferredConfig = r15;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r0 = r11.inSampleSize;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r16 = r0;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r17 = 1;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r0 = r16;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r1 = r17;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        if (r0 == r1) goto L_0x00e0;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x00d6:
        r16 = 19;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r17 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r0 = r16;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r1 = r17;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        if (r0 > r1) goto L_0x0112;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x00e0:
        r16 = com.bumptech.glide.load.resource.bitmap.C1320f.m3447a(r14);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        if (r16 == 0) goto L_0x0112;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x00e6:
        r0 = (double) r5;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r16 = r0;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r0 = (double) r4;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r18 = r0;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r16 = r16 / r18;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r16 = java.lang.Math.ceil(r16);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r0 = r16;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r5 = (int) r0;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r0 = (double) r6;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r16 = r0;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r0 = (double) r4;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r18 = r0;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r16 = r16 / r18;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r16 = java.lang.Math.ceil(r16);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r0 = r16;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4 = (int) r0;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r0 = r22;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4 = r0.mo1346b(r5, r4, r15);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r5 = 11;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        if (r5 > r6) goto L_0x0112;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x0110:
        r11.inBitmap = r4;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x0112:
        r5 = com.bumptech.glide.load.resource.bitmap.C1320f.m3445a(r14, r12, r11);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4 = r13.f3439a;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        if (r4 == 0) goto L_0x0250;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x011a:
        r5 = new java.lang.RuntimeException;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r5.<init>(r4);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        throw r5;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x0120:
        r4 = move-exception;
        r8.m3132a(r9);
        r8.m3132a(r10);
        r13.m3137a();
        com.bumptech.glide.load.resource.bitmap.C1320f.m3446a(r11);
        throw r4;
    L_0x012e:
        r4 = r6.f3702b;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r7 = r4.m3429b();	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = 218; // 0xda float:3.05E-43 double:1.077E-321;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        if (r7 != r4) goto L_0x013c;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0138:
        r4 = 0;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r7 = r4;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        goto L_0x0049;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x013c:
        r4 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        if (r7 != r4) goto L_0x014a;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0140:
        r4 = "ImageHeaderParser";	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r6 = 3;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        android.util.Log.isLoggable(r4, r6);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = 0;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r7 = r4;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        goto L_0x0049;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x014a:
        r4 = r6.f3702b;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = r4.m3426a();	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r15 = r4 + -2;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        if (r7 == r4) goto L_0x0195;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0156:
        r4 = r6.f3702b;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r0 = (long) r15;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r16 = r0;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r0 = r16;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r16 = r4.m3428a(r0);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r0 = (long) r15;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r18 = r0;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1));	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        if (r4 == 0) goto L_0x0037;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0168:
        r4 = "ImageHeaderParser";	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r6 = 3;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = android.util.Log.isLoggable(r4, r6);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        if (r4 == 0) goto L_0x0191;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0171:
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r6 = "Unable to skip enough data, type: ";	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4.<init>(r6);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = r4.append(r7);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r6 = ", wanted to skip: ";	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = r4.append(r6);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = r4.append(r15);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r6 = ", but actually skipped: ";	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = r4.append(r6);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r0 = r16;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4.append(r0);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0191:
        r4 = 0;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r7 = r4;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        goto L_0x0049;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0195:
        r4 = new byte[r15];	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r6 = r6.f3702b;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r6 = r6.m3427a(r4);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        if (r6 == r15) goto L_0x01cf;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x019f:
        r4 = "ImageHeaderParser";	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r16 = 3;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r0 = r16;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = android.util.Log.isLoggable(r4, r0);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        if (r4 == 0) goto L_0x01cb;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x01ab:
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r16 = "Unable to read segment data, type: ";	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r0 = r16;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4.<init>(r0);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = r4.append(r7);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r7 = ", length: ";	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = r4.append(r7);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = r4.append(r15);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r7 = ", actually read: ";	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4 = r4.append(r7);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r4.append(r6);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x01cb:
        r4 = 0;
        r7 = r4;
        goto L_0x0049;
    L_0x01cf:
        r7 = r4;
        goto L_0x0049;
    L_0x01d2:
        r4 = 0;
        goto L_0x0052;
    L_0x01d5:
        r6 = r6 + 1;
        goto L_0x0055;
    L_0x01d9:
        r4 = -1;
        goto L_0x0070;
    L_0x01dc:
        r5 = move-exception;
        r6 = "Downsampler";	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r7 = 5;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6 = android.util.Log.isLoggable(r6, r7);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        if (r6 == 0) goto L_0x01ed;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x01e6:
        r6 = "Downsampler";	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r7 = "Cannot reset the input stream";	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        android.util.Log.w(r6, r7, r5);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x01ed:
        r7 = r4;
        goto L_0x0074;
    L_0x01f0:
        r4 = move-exception;
        r6 = "Downsampler";	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r7 = 5;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r6 = android.util.Log.isLoggable(r6, r7);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        if (r6 == 0) goto L_0x0201;	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x01fa:
        r6 = "Downsampler";	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        r7 = "Cannot determine the image orientation from header";	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
        android.util.Log.w(r6, r7, r4);	 Catch:{ IOException -> 0x01f0, all -> 0x021b }
    L_0x0201:
        r13.reset();
        r7 = r5;
        goto L_0x0074;
    L_0x0207:
        r4 = move-exception;
        r6 = "Downsampler";
        r7 = 5;
        r6 = android.util.Log.isLoggable(r6, r7);
        if (r6 == 0) goto L_0x0218;
    L_0x0211:
        r6 = "Downsampler";
        r7 = "Cannot reset the input stream";
        android.util.Log.w(r6, r7, r4);
    L_0x0218:
        r7 = r5;
        goto L_0x0074;
    L_0x021b:
        r4 = move-exception;
        r13.reset();	 Catch:{ IOException -> 0x0220 }
    L_0x021f:
        throw r4;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x0220:
        r5 = move-exception;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6 = "Downsampler";	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r7 = 5;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6 = android.util.Log.isLoggable(r6, r7);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        if (r6 == 0) goto L_0x021f;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x022a:
        r6 = "Downsampler";	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r7 = "Cannot reset the input stream";	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        android.util.Log.w(r6, r7, r5);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        goto L_0x021f;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x0232:
        r4 = 90;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        goto L_0x0096;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x0236:
        r4 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        goto L_0x0096;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x023a:
        r4 = 270; // 0x10e float:3.78E-43 double:1.334E-321;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        goto L_0x0096;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x023e:
        r0 = r20;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r1 = r23;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r2 = r24;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4 = r0.mo1384a(r5, r6, r1, r2);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        goto L_0x00b8;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x024a:
        r4 = java.lang.Integer.highestOneBit(r4);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        goto L_0x00bb;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x0250:
        r4 = 0;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        if (r5 == 0) goto L_0x0273;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x0253:
        r6 = new android.graphics.Matrix;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6.<init>();	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        switch(r7) {
            case 2: goto L_0x0280;
            case 3: goto L_0x0288;
            case 4: goto L_0x028e;
            case 5: goto L_0x029b;
            case 6: goto L_0x02a8;
            case 7: goto L_0x02ae;
            case 8: goto L_0x02bb;
            default: goto L_0x025b;
        };	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x025b:
        r4 = r6.isIdentity();	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        if (r4 == 0) goto L_0x02c1;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x0261:
        r4 = r5;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x0262:
        r6 = r5.equals(r4);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        if (r6 != 0) goto L_0x0273;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x0268:
        r0 = r22;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6 = r0.mo1345a(r5);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        if (r6 != 0) goto L_0x0273;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x0270:
        r5.recycle();	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x0273:
        r8.m3132a(r9);
        r8.m3132a(r10);
        r13.m3137a();
        com.bumptech.glide.load.resource.bitmap.C1320f.m3446a(r11);
        return r4;
    L_0x0280:
        r4 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6.setScale(r4, r7);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        goto L_0x025b;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x0288:
        r4 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6.setRotate(r4);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        goto L_0x025b;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x028e:
        r4 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6.setRotate(r4);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6.postScale(r4, r7);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        goto L_0x025b;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x029b:
        r4 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6.setRotate(r4);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6.postScale(r4, r7);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        goto L_0x025b;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x02a8:
        r4 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6.setRotate(r4);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        goto L_0x025b;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x02ae:
        r4 = -1028390912; // 0xffffffffc2b40000 float:-90.0 double:NaN;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6.setRotate(r4);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6.postScale(r4, r7);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        goto L_0x025b;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x02bb:
        r4 = -1028390912; // 0xffffffffc2b40000 float:-90.0 double:NaN;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6.setRotate(r4);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        goto L_0x025b;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x02c1:
        r7 = new android.graphics.RectF;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4 = 0;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r12 = 0;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r14 = r5.getWidth();	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r14 = (float) r14;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r15 = r5.getHeight();	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r15 = (float) r15;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r7.<init>(r4, r12, r14, r15);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6.mapRect(r7);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4 = r7.width();	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r12 = java.lang.Math.round(r4);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4 = r7.height();	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r14 = java.lang.Math.round(r4);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r15 = com.bumptech.glide.load.resource.bitmap.C1336q.m3487a(r5);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r0 = r22;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r4 = r0.mo1342a(r12, r14, r15);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        if (r4 != 0) goto L_0x02f5;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x02f1:
        r4 = android.graphics.Bitmap.createBitmap(r12, r14, r15);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
    L_0x02f5:
        r12 = r7.left;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r12 = -r12;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r7 = r7.top;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r7 = -r7;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r6.postTranslate(r12, r7);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r7 = new android.graphics.Canvas;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r7.<init>(r4);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r12 = new android.graphics.Paint;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r14 = 6;	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r12.<init>(r14);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        r7.drawBitmap(r5, r6, r12);	 Catch:{ IOException -> 0x01dc, all -> 0x0120 }
        goto L_0x0262;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.f.a(java.io.InputStream, com.bumptech.glide.load.b.a.c, int, int, com.bumptech.glide.load.a):android.graphics.Bitmap");
    }
}
