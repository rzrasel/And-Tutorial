package com.google.android.gms.internal;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class ut {
    final ByteBuffer f7233a;

    private ut(ByteBuffer byteBuffer) {
        this.f7233a = byteBuffer;
        this.f7233a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private ut(byte[] bArr, int i) {
        this(ByteBuffer.wrap(bArr, 0, i));
    }

    public static int m6769a(int i) {
        return i >= 0 ? m6783c(i) : 10;
    }

    private static int m6770a(CharSequence charSequence) {
        int i = 0;
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < '') {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 'ࠀ') {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 'ࠀ') {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if ('?' <= charAt2 && charAt2 <= '?') {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new IllegalArgumentException("Unpaired surrogate at index " + i2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i2 = i3 + i;
                if (i2 < length) {
                    return i2;
                }
                throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i2) + 4294967296L));
            }
        }
        i2 = i3;
        if (i2 < length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i2) + 4294967296L));
    }

    private static int m6771a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        int i4 = i + i2;
        while (i3 < length && i3 + i < i4) {
            char charAt = charSequence.charAt(i3);
            if (charAt >= '') {
                break;
            }
            bArr[i + i3] = (byte) charAt;
            i3++;
        }
        if (i3 == length) {
            return i + length;
        }
        int i5 = i + i3;
        while (i3 < length) {
            int i6;
            char charAt2 = charSequence.charAt(i3);
            if (charAt2 < '' && i5 < i4) {
                i6 = i5 + 1;
                bArr[i5] = (byte) charAt2;
            } else if (charAt2 < 'ࠀ' && i5 <= i4 - 2) {
                r6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 >>> 6) | 960);
                i6 = r6 + 1;
                bArr[r6] = (byte) ((charAt2 & 63) | 128);
            } else if ((charAt2 < '?' || '?' < charAt2) && i5 <= i4 - 3) {
                i6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 >>> 12) | 480);
                i5 = i6 + 1;
                bArr[i6] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 & 63) | 128);
            } else if (i5 <= i4 - 4) {
                if (i3 + 1 != charSequence.length()) {
                    i3++;
                    charAt = charSequence.charAt(i3);
                    if (Character.isSurrogatePair(charAt2, charAt)) {
                        int toCodePoint = Character.toCodePoint(charAt2, charAt);
                        i6 = i5 + 1;
                        bArr[i5] = (byte) ((toCodePoint >>> 18) | 240);
                        i5 = i6 + 1;
                        bArr[i6] = (byte) (((toCodePoint >>> 12) & 63) | 128);
                        r6 = i5 + 1;
                        bArr[i5] = (byte) (((toCodePoint >>> 6) & 63) | 128);
                        i6 = r6 + 1;
                        bArr[r6] = (byte) ((toCodePoint & 63) | 128);
                    }
                }
                throw new IllegalArgumentException("Unpaired surrogate at index " + (i3 - 1));
            } else {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i5);
            }
            i3++;
            i5 = i6;
        }
        return i5;
    }

    public static int m6772a(String str) {
        int a = m6770a((CharSequence) str);
        return a + m6783c(a);
    }

    public static int m6773a(byte[] bArr) {
        return m6783c(bArr.length) + bArr.length;
    }

    public static ut m6774a(byte[] bArr, int i) {
        return new ut(bArr, i);
    }

    private static void m6775a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(m6771a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            m6782b(charSequence, byteBuffer);
        }
    }

    public static int m6776b(int i, int i2) {
        return m6783c(i << 3) + m6769a(i2);
    }

    public static int m6777b(int i, long j) {
        return m6783c(i << 3) + m6781b(j);
    }

    public static int m6778b(int i, vb vbVar) {
        int c = m6783c(i << 3);
        int e = vbVar.m5901e();
        return c + (e + m6783c(e));
    }

    public static int m6779b(int i, String str) {
        return m6783c(i << 3) + m6772a(str);
    }

    public static int m6780b(int i, byte[] bArr) {
        return m6783c(i << 3) + m6773a(bArr);
    }

    public static int m6781b(long j) {
        return (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    private static void m6782b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < '') {
                byteBuffer.put((byte) charAt);
            } else if (charAt < 'ࠀ') {
                byteBuffer.put((byte) ((charAt >>> 6) | 960));
                byteBuffer.put((byte) ((charAt & 63) | 128));
            } else if (charAt < '?' || '?' < charAt) {
                byteBuffer.put((byte) ((charAt >>> 12) | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt & 63) | 128));
            } else {
                if (i + 1 != charSequence.length()) {
                    i++;
                    char charAt2 = charSequence.charAt(i);
                    if (Character.isSurrogatePair(charAt, charAt2)) {
                        int toCodePoint = Character.toCodePoint(charAt, charAt2);
                        byteBuffer.put((byte) ((toCodePoint >>> 18) | 240));
                        byteBuffer.put((byte) (((toCodePoint >>> 12) & 63) | 128));
                        byteBuffer.put((byte) (((toCodePoint >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((toCodePoint & 63) | 128));
                    }
                }
                throw new IllegalArgumentException("Unpaired surrogate at index " + (i - 1));
            }
            i++;
        }
    }

    public static int m6783c(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (-268435456 & i) == 0 ? 4 : 5;
    }

    private final void m6784d(int i) {
        byte b = (byte) i;
        if (this.f7233a.hasRemaining()) {
            this.f7233a.put(b);
            return;
        }
        throw new uu(this.f7233a.position(), this.f7233a.limit());
    }

    public final void m6785a(int i, int i2) {
        m6795c(i, 0);
        if (i2 >= 0) {
            m6793b(i2);
        } else {
            m6791a((long) i2);
        }
    }

    public final void m6786a(int i, long j) {
        m6795c(i, 0);
        m6791a(j);
    }

    public final void m6787a(int i, vb vbVar) {
        m6795c(i, 2);
        m6792a(vbVar);
    }

    public final void m6788a(int i, String str) {
        m6795c(i, 2);
        try {
            int c = m6783c(str.length());
            if (c == m6783c(str.length() * 3)) {
                int position = this.f7233a.position();
                if (this.f7233a.remaining() < c) {
                    throw new uu(c + position, this.f7233a.limit());
                }
                this.f7233a.position(position + c);
                m6775a((CharSequence) str, this.f7233a);
                int position2 = this.f7233a.position();
                this.f7233a.position(position);
                m6793b((position2 - position) - c);
                this.f7233a.position(position2);
                return;
            }
            m6793b(m6770a((CharSequence) str));
            m6775a((CharSequence) str, this.f7233a);
        } catch (Throwable e) {
            uu uuVar = new uu(this.f7233a.position(), this.f7233a.limit());
            uuVar.initCause(e);
            throw uuVar;
        }
    }

    public final void m6789a(int i, boolean z) {
        int i2 = 0;
        m6795c(i, 0);
        if (z) {
            i2 = 1;
        }
        byte b = (byte) i2;
        if (this.f7233a.hasRemaining()) {
            this.f7233a.put(b);
            return;
        }
        throw new uu(this.f7233a.position(), this.f7233a.limit());
    }

    public final void m6790a(int i, byte[] bArr) {
        m6795c(i, 2);
        m6793b(bArr.length);
        m6794b(bArr);
    }

    final void m6791a(long j) {
        while ((-128 & j) != 0) {
            m6784d((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m6784d((int) j);
    }

    public final void m6792a(vb vbVar) {
        m6793b(vbVar.m5900d());
        vbVar.mo2195a(this);
    }

    public final void m6793b(int i) {
        while ((i & -128) != 0) {
            m6784d((i & 127) | 128);
            i >>>= 7;
        }
        m6784d(i);
    }

    public final void m6794b(byte[] bArr) {
        int length = bArr.length;
        if (this.f7233a.remaining() >= length) {
            this.f7233a.put(bArr, 0, length);
            return;
        }
        throw new uu(this.f7233a.position(), this.f7233a.limit());
    }

    public final void m6795c(int i, int i2) {
        m6793b((i << 3) | i2);
    }
}
