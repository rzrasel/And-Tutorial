package com.google.android.gms.internal;

import android.webkit.ConsoleMessage.MessageLevel;

final /* synthetic */ class kj {
    static final /* synthetic */ int[] f6406a = new int[MessageLevel.values().length];

    static {
        try {
            f6406a[MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f6406a[MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f6406a[MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f6406a[MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f6406a[MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
