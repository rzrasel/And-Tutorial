package com.bumptech.glide.load.resource.p052b;

import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.p044b.C1241l;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class C1309c<T> implements C1301e<File, T> {
    private static final C1308a f3690a = new C1308a();
    private C1301e<InputStream, T> f3691b;
    private final C1308a f3692c;

    static class C1308a {
        C1308a() {
        }
    }

    public C1309c(C1301e<InputStream, T> c1301e) {
        this(c1301e, f3690a);
    }

    private C1309c(C1301e<InputStream, T> c1301e, C1308a c1308a) {
        this.f3691b = c1301e;
        this.f3692c = c1308a;
    }

    private C1241l<T> m3411a(File file, int i, int i2) {
        Throwable th;
        InputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                C1241l<T> a = this.f3691b.mo1381a(fileInputStream, i, i2);
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                }
                return a;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public final String mo1382a() {
        return "";
    }
}
