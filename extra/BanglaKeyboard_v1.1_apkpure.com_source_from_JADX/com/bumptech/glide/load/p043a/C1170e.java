package com.bumptech.glide.load.p043a;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

public final class C1170e extends C1169g<ParcelFileDescriptor> {
    public C1170e(Context context, Uri uri) {
        super(context, uri);
    }

    protected final /* synthetic */ Object mo1330a(Uri uri, ContentResolver contentResolver) {
        return contentResolver.openAssetFileDescriptor(uri, "r").getParcelFileDescriptor();
    }

    protected final /* synthetic */ void mo1331a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }
}
