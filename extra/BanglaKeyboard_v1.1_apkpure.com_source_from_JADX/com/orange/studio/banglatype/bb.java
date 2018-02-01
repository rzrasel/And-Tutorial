package com.orange.studio.banglatype;

import android.support.v7.p012d.C0872b;
import com.bumptech.glide.load.C1302f;
import com.bumptech.glide.load.p044b.C1241l;
import java.io.IOException;
import java.io.OutputStream;

public class bb implements C1302f<C0872b> {
    private final C1302f<C0872b> f8199a;

    public bb(C1302f<C0872b> c1302f) {
        this.f8199a = c1302f;
    }

    private boolean m7367a(C1241l<C0872b> c1241l, OutputStream outputStream) {
        boolean z = false;
        try {
            outputStream.write(0);
            z = this.f8199a.mo1377a(c1241l, outputStream);
        } catch (IOException e) {
        }
        return z;
    }

    public final String mo1376a() {
        return bb.class.getSimpleName();
    }
}
