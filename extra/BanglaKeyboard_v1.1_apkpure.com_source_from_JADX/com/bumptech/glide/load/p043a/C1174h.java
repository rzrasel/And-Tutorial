package com.bumptech.glide.load.p043a;

import android.content.res.AssetManager;
import java.io.InputStream;

public final class C1174h extends C1166a<InputStream> {
    public C1174h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    protected final /* synthetic */ Object mo1328a(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    protected final /* synthetic */ void mo1329a(Object obj) {
        ((InputStream) obj).close();
    }
}
