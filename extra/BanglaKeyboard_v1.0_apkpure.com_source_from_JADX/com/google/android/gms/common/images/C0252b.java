package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import com.google.android.gms.internal.jh;

final class C0252b extends jh {
    protected final /* synthetic */ int mo695a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        return bitmap.getHeight() * bitmap.getRowBytes();
    }
}
