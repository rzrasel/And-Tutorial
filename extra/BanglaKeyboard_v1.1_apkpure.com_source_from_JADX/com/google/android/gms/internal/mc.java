package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class mc implements Runnable {
    private mc() {
    }

    public final void run() {
        try {
            lr.f6586c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
        } finally {
            lr.f6584a.countDown();
        }
    }
}
