package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class ImageHeaderParser {
    static final byte[] f3700a;
    private static final int[] f3701c = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    final C1314b f3702b;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        PNG_A(true),
        PNG(false),
        UNKNOWN(false);
        
        private final boolean f3697a;

        private ImageType(boolean z) {
            this.f3697a = z;
        }

        public final boolean hasAlpha() {
            return this.f3697a;
        }
    }

    private static class C1313a {
        final ByteBuffer f3698a;

        public C1313a(byte[] bArr) {
            this.f3698a = ByteBuffer.wrap(bArr);
            this.f3698a.order(ByteOrder.BIG_ENDIAN);
        }

        public final int m3423a() {
            return this.f3698a.array().length;
        }

        public final int m3424a(int i) {
            return this.f3698a.getInt(i);
        }

        public final short m3425b(int i) {
            return this.f3698a.getShort(i);
        }
    }

    private static class C1314b {
        final InputStream f3699a;

        public C1314b(InputStream inputStream) {
            this.f3699a = inputStream;
        }

        public final int m3426a() {
            return ((this.f3699a.read() << 8) & 65280) | (this.f3699a.read() & 255);
        }

        public final int m3427a(byte[] bArr) {
            int length = bArr.length;
            while (length > 0) {
                int read = this.f3699a.read(bArr, bArr.length - length, length);
                if (read == -1) {
                    break;
                }
                length -= read;
            }
            return bArr.length - length;
        }

        public final long m3428a(long j) {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f3699a.skip(j2);
                if (skip <= 0) {
                    if (this.f3699a.read() == -1) {
                        break;
                    }
                    j2--;
                } else {
                    j2 -= skip;
                }
            }
            return j - j2;
        }

        public final short m3429b() {
            return (short) (this.f3699a.read() & 255);
        }
    }

    static {
        byte[] bArr = new byte[0];
        try {
            bArr = "Exif\u0000\u0000".getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
        }
        f3700a = bArr;
    }

    public ImageHeaderParser(InputStream inputStream) {
        this.f3702b = new C1314b(inputStream);
    }

    static int m3430a(C1313a c1313a) {
        ByteOrder byteOrder;
        int a;
        short b;
        int i;
        short b2;
        short b3;
        short b4 = c1313a.m3425b(6);
        if (b4 != (short) 19789) {
            if (b4 == (short) 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
                c1313a.f3698a.order(byteOrder);
                a = c1313a.m3424a(10) + 6;
                b = c1313a.m3425b(a);
                for (b4 = (short) 0; b4 < b; b4++) {
                    i = (a + 2) + (b4 * 12);
                    b2 = c1313a.m3425b(i);
                    if (b2 == (short) 274) {
                        b3 = c1313a.m3425b(i + 2);
                        if (b3 <= (short) 0 && b3 <= (short) 12) {
                            int a2 = c1313a.m3424a(i + 4);
                            if (a2 >= 0) {
                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    new StringBuilder("Got tagIndex=").append(b4).append(" tagType=").append(b2).append(" formatCode=").append(b3).append(" componentCount=").append(a2);
                                }
                                int i2 = f3701c[b3] + a2;
                                if (i2 <= 4) {
                                    i += 8;
                                    if (i < 0 || i > c1313a.m3423a()) {
                                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                                            new StringBuilder("Illegal tagValueOffset=").append(i).append(" tagType=").append(b2);
                                        }
                                    } else if (i2 >= 0 && i + i2 <= c1313a.m3423a()) {
                                        return c1313a.m3425b(i);
                                    } else {
                                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                                        }
                                    }
                                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                }
                            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                            }
                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                        }
                    }
                }
                return -1;
            }
            Log.isLoggable("ImageHeaderParser", 3);
        }
        byteOrder = ByteOrder.BIG_ENDIAN;
        c1313a.f3698a.order(byteOrder);
        a = c1313a.m3424a(10) + 6;
        b = c1313a.m3425b(a);
        while (b4 < b) {
            i = (a + 2) + (b4 * 12);
            b2 = c1313a.m3425b(i);
            if (b2 == (short) 274) {
                b3 = c1313a.m3425b(i + 2);
                if (b3 <= (short) 0) {
                }
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                }
            }
        }
        return -1;
    }

    static boolean m3431a(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    public final ImageType m3432a() {
        int a = this.f3702b.m3426a();
        if (a == 65496) {
            return ImageType.JPEG;
        }
        a = ((a << 16) & -65536) | (this.f3702b.m3426a() & 65535);
        if (a != -1991225785) {
            return (a >> 8) == 4671814 ? ImageType.GIF : ImageType.UNKNOWN;
        } else {
            this.f3702b.m3428a(21);
            return this.f3702b.f3699a.read() >= 3 ? ImageType.PNG_A : ImageType.PNG;
        }
    }
}
