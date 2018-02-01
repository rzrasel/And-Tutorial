package com.bumptech.glide.load.resource.p052b;

import com.bumptech.glide.load.C1249b;
import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.C1302f;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.load.p049c.C1298o;
import com.bumptech.glide.load.resource.C1312b;
import com.bumptech.glide.p038e.C1107b;
import java.io.File;
import java.io.InputStream;

public final class C1311d implements C1107b<InputStream, File> {
    private static final C1310a f3693a = new C1310a();
    private final C1301e<File, File> f3694b = new C1305a();
    private final C1249b<InputStream> f3695c = new C1298o();

    private static class C1310a implements C1301e<InputStream, File> {
        private C1310a() {
        }

        public final /* synthetic */ C1241l mo1381a(Object obj, int i, int i2) {
            throw new Error("You cannot decode a File from an InputStream by default, try either #diskCacheStratey(DiskCacheStrategy.SOURCE) to avoid this call or #decoder(ResourceDecoder) to replace this Decoder");
        }

        public final String mo1382a() {
            return "";
        }
    }

    public final C1301e<File, File> mo1291a() {
        return this.f3694b;
    }

    public final C1301e<InputStream, File> mo1292b() {
        return f3693a;
    }

    public final C1249b<InputStream> mo1293c() {
        return this.f3695c;
    }

    public final C1302f<File> mo1294d() {
        return C1312b.m3420b();
    }
}
