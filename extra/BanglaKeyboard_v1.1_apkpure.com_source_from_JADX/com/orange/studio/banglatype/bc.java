package com.orange.studio.banglatype;

import android.support.v7.p012d.C0872b;
import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.load.resource.C1306c;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class bc implements C1301e<InputStream, C0872b> {
    private static C1241l<C0872b> m7370a(InputStream inputStream) {
        try {
            return new C1306c(((bg) new ObjectInputStream(inputStream).readObject()).f8201a);
        } catch (Throwable e) {
            throw new IOException("Cannot read palette", e);
        }
    }

    public final /* bridge */ /* synthetic */ C1241l mo1381a(Object obj, int i, int i2) {
        return m7370a((InputStream) obj);
    }

    public final String mo1382a() {
        return bc.class.getSimpleName();
    }
}
