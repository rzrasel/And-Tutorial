package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@aqv
public abstract class yj {
    private static MessageDigest f7508b = null;
    protected Object f7509a = new Object();

    protected final MessageDigest m7031a() {
        MessageDigest messageDigest;
        synchronized (this.f7509a) {
            if (f7508b != null) {
                messageDigest = f7508b;
            } else {
                for (int i = 0; i < 2; i++) {
                    try {
                        f7508b = MessageDigest.getInstance("MD5");
                    } catch (NoSuchAlgorithmException e) {
                    }
                }
                messageDigest = f7508b;
            }
        }
        return messageDigest;
    }

    abstract byte[] mo2331a(String str);
}
