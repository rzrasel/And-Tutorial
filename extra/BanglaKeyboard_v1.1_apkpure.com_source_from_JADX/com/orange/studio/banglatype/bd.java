package com.orange.studio.banglatype;

import android.support.v7.p012d.C0872b;
import com.bumptech.glide.load.C1302f;
import com.bumptech.glide.load.p044b.C1241l;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class bd implements C1302f<C0872b> {
    private static boolean m7373a(C1241l<C0872b> c1241l, OutputStream outputStream) {
        bg bgVar = new bg((C0872b) c1241l.mo1367a());
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(bgVar);
            objectOutputStream.flush();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public final String mo1376a() {
        return bd.class.getSimpleName();
    }
}
