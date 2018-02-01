package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.internal.hu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class ImageManager {
    private static final Object f526a = new Object();
    private static HashSet f527b = new HashSet();
    private final Context f528c;
    private final Handler f529d;
    private final ExecutorService f530e;
    private final C0252b f531f;
    private final hu f532g;
    private final Map f533h;
    private final Map f534i;

    final class ImageReceiver extends ResultReceiver {
        final /* synthetic */ ImageManager f523a;
        private final Uri f524b;
        private final ArrayList f525c;

        public final void onReceiveResult(int i, Bundle bundle) {
            this.f523a.f530e.execute(new C0253c(this.f523a, this.f524b, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }
}
