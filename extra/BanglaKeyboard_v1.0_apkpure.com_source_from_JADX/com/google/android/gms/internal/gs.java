package com.google.android.gms.internal;

import android.webkit.ConsoleMessage.MessageLevel;

final /* synthetic */ class gs {
    static final /* synthetic */ int[] f1497a = new int[MessageLevel.values().length];

    static {
        try {
            f1497a[MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f1497a[MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f1497a[MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f1497a[MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f1497a[MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
