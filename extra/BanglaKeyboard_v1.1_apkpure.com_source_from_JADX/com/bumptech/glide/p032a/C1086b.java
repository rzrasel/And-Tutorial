package com.bumptech.glide.p032a;

import android.support.v4.app.FragmentTransaction;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

final class C1086b implements Closeable {
    final Charset f3162a;
    int f3163b;
    private final InputStream f3164c;
    private byte[] f3165d;
    private int f3166e;

    public C1086b(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private C1086b(InputStream inputStream, Charset charset, byte b) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (charset.equals(C1087c.f3167a)) {
            this.f3164c = inputStream;
            this.f3162a = charset;
            this.f3165d = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    private void m2873b() {
        int read = this.f3164c.read(this.f3165d, 0, this.f3165d.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f3166e = 0;
        this.f3163b = read;
    }

    public final String m2874a() {
        String str;
        synchronized (this.f3164c) {
            if (this.f3165d == null) {
                throw new IOException("LineReader is closed");
            }
            int i;
            if (this.f3166e >= this.f3163b) {
                m2873b();
            }
            int i2 = this.f3166e;
            while (i2 != this.f3163b) {
                if (this.f3165d[i2] == (byte) 10) {
                    int i3 = (i2 == this.f3166e || this.f3165d[i2 - 1] != (byte) 13) ? i2 : i2 - 1;
                    str = new String(this.f3165d, this.f3166e, i3 - this.f3166e, this.f3162a.name());
                    this.f3166e = i2 + 1;
                } else {
                    i2++;
                }
            }
            ByteArrayOutputStream c10851 = new ByteArrayOutputStream(this, (this.f3163b - this.f3166e) + 80) {
                final /* synthetic */ C1086b f3161a;

                public final String toString() {
                    int i = (this.count <= 0 || this.buf[this.count - 1] != (byte) 13) ? this.count : this.count - 1;
                    try {
                        return new String(this.buf, 0, i, this.f3161a.f3162a.name());
                    } catch (UnsupportedEncodingException e) {
                        throw new AssertionError(e);
                    }
                }
            };
            loop1:
            while (true) {
                c10851.write(this.f3165d, this.f3166e, this.f3163b - this.f3166e);
                this.f3163b = -1;
                m2873b();
                i = this.f3166e;
                while (i != this.f3163b) {
                    if (this.f3165d[i] == (byte) 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            if (i != this.f3166e) {
                c10851.write(this.f3165d, this.f3166e, i - this.f3166e);
            }
            this.f3166e = i + 1;
            str = c10851.toString();
        }
        return str;
    }

    public final void close() {
        synchronized (this.f3164c) {
            if (this.f3165d != null) {
                this.f3165d = null;
                this.f3164c.close();
            }
        }
    }
}
