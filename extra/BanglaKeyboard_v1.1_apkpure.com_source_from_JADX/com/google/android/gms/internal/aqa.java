package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.C1538g;
import java.io.InputStream;

final class aqa implements hi<aeq> {
    private /* synthetic */ boolean f5623a;
    private /* synthetic */ double f5624b;
    private /* synthetic */ boolean f5625c;
    private /* synthetic */ String f5626d;
    private /* synthetic */ apt f5627e;

    aqa(apt com_google_android_gms_internal_apt, boolean z, double d, boolean z2, String str) {
        this.f5627e = com_google_android_gms_internal_apt;
        this.f5623a = z;
        this.f5624b = d;
        this.f5625c = z2;
        this.f5626d = str;
    }

    @TargetApi(19)
    private final aeq m5073b(InputStream inputStream) {
        Bitmap decodeStream;
        Options options = new Options();
        options.inDensity = (int) (160.0d * this.f5624b);
        if (!this.f5625c) {
            options.inPreferredConfig = Config.RGB_565;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
        } catch (Exception e) {
            id.m5372a(6);
            decodeStream = null;
        }
        if (decodeStream == null) {
            this.f5627e.m5060a(2, this.f5623a);
            return null;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (C1538g.m3944d() && es.m5373a()) {
            int width = decodeStream.getWidth();
            int height = decodeStream.getHeight();
            new StringBuilder(108).append("Decoded image w: ").append(width).append(" h:").append(height).append(" bytes: ").append(decodeStream.getAllocationByteCount()).append(" time: ").append(uptimeMillis2 - uptimeMillis).append(" on ui thread: ").append(Looper.getMainLooper().getThread() == Thread.currentThread());
            es.m5373a();
        }
        return new aeq(new BitmapDrawable(Resources.getSystem(), decodeStream), Uri.parse(this.f5626d), this.f5624b);
    }

    public final /* synthetic */ Object mo2014a() {
        this.f5627e.m5060a(2, this.f5623a);
        return null;
    }

    @TargetApi(19)
    public final /* synthetic */ Object mo2015a(InputStream inputStream) {
        return m5073b(inputStream);
    }
}
