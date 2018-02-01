package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C1176a;
import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.load.p044b.p046a.C1187c;

public final class C1325h implements C1301e<ParcelFileDescriptor, Bitmap> {
    private final C1338r f3717a;
    private final C1187c f3718b;
    private C1176a f3719c;

    public C1325h(C1187c c1187c, C1176a c1176a) {
        this(new C1338r(), c1187c, c1176a);
    }

    private C1325h(C1338r c1338r, C1187c c1187c, C1176a c1176a) {
        this.f3717a = c1338r;
        this.f3718b = c1187c;
        this.f3719c = c1176a;
    }

    public final /* synthetic */ C1241l mo1381a(Object obj, int i, int i2) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        C1338r c1338r = this.f3717a;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        Bitmap frameAtTime = c1338r.f3751a >= 0 ? mediaMetadataRetriever.getFrameAtTime((long) c1338r.f3751a) : mediaMetadataRetriever.getFrameAtTime();
        mediaMetadataRetriever.release();
        parcelFileDescriptor.close();
        return C1317c.m3436a(frameAtTime, this.f3718b);
    }

    public final String mo1382a() {
        return "FileDescriptorBitmapDecoder.com.bumptech.glide.load.data.bitmap";
    }
}
