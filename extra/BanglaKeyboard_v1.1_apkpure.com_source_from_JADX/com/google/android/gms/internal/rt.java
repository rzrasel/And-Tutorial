package com.google.android.gms.internal;

public abstract class rt<MessageType extends rt<MessageType, BuilderType>, BuilderType extends ru<MessageType, BuilderType>> implements tl {
    private static boolean f6751a = false;
    protected int f6752d = 0;

    public final ry mo2216g() {
        try {
            se c = ry.m6520c(mo2221c());
            mo2220a(c.f7077a);
            c.f7077a.m6602b();
            return new sg(c.f7078b);
        } catch (Throwable e) {
            String str = "ByteString";
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder((String.valueOf(name).length() + 62) + String.valueOf(str).length()).append("Serializing ").append(name).append(" to a ").append(str).append(" threw an IOException (should never happen).").toString(), e);
        }
    }

    public final byte[] mo2217h() {
        try {
            byte[] bArr = new byte[mo2221c()];
            sk a = sk.m6584a(bArr);
            mo2220a(a);
            a.m6602b();
            return bArr;
        } catch (Throwable e) {
            String str = "byte array";
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder((String.valueOf(name).length() + 62) + String.valueOf(str).length()).append("Serializing ").append(name).append(" to a ").append(str).append(" threw an IOException (should never happen).").toString(), e);
        }
    }
}
