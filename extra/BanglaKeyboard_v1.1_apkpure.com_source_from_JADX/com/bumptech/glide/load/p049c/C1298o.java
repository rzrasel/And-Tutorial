package com.bumptech.glide.load.p049c;

import android.util.Log;
import com.bumptech.glide.load.C1249b;
import com.bumptech.glide.p042h.C1155a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class C1298o implements C1249b<InputStream> {
    private static boolean m3393a(InputStream inputStream, OutputStream outputStream) {
        byte[] b = C1155a.m3131a().m3133b();
        while (true) {
            try {
                int read = inputStream.read(b);
                if (read == -1) {
                    break;
                }
                outputStream.write(b, 0, read);
            } catch (IOException e) {
                Log.isLoggable("StreamEncoder", 3);
                return false;
            } finally {
                C1155a.m3131a().m3132a(b);
            }
        }
        return true;
    }

    public final String mo1376a() {
        return "";
    }
}
