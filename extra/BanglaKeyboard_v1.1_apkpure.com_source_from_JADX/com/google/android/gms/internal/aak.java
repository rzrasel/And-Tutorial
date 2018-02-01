package com.google.android.gms.internal;

@aqv
public final class aak {
    private static final Object f4742a = new Object();
    private static aak f4743b;
    private final hz f4744c = new hz();
    private final aab f4745d = new aab(new zu(), new zt(), new acl(), new ahj(), new cl(), new aoh());

    static {
        aak com_google_android_gms_internal_aak = new aak();
        synchronized (f4742a) {
            f4743b = com_google_android_gms_internal_aak;
        }
    }

    protected aak() {
    }

    public static hz m4022a() {
        return m4024c().f4744c;
    }

    public static aab m4023b() {
        return m4024c().f4745d;
    }

    private static aak m4024c() {
        aak com_google_android_gms_internal_aak;
        synchronized (f4742a) {
            com_google_android_gms_internal_aak = f4743b;
        }
        return com_google_android_gms_internal_aak;
    }
}
