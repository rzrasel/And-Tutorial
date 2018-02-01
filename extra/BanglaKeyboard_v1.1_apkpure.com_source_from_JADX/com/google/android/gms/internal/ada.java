package com.google.android.gms.internal;

import android.os.Environment;
import java.util.concurrent.Callable;

final class ada implements Callable<Boolean> {
    ada() {
    }

    public final /* synthetic */ Object call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
