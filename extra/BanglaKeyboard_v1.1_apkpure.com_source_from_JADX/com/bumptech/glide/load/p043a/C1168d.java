package com.bumptech.glide.load.p043a;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

public final class C1168d extends C1166a<ParcelFileDescriptor> {
    public C1168d(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    protected final /* synthetic */ Object mo1328a(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    protected final /* synthetic */ void mo1329a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }
}
