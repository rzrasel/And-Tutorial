package com.google.android.gms.internal;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.zzbv;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@aqv
final class alc {
    final zzix f5267a;
    final String f5268b;
    final int f5269c;

    alc(akx com_google_android_gms_internal_akx) {
        this(com_google_android_gms_internal_akx.f5245b, com_google_android_gms_internal_akx.f5246c, com_google_android_gms_internal_akx.f5247d);
    }

    private alc(zzix com_google_android_gms_internal_zzix, String str, int i) {
        this.f5267a = com_google_android_gms_internal_zzix;
        this.f5268b = str;
        this.f5269c = i;
    }

    static alc m4673a(String str) {
        Throwable e;
        String[] split = str.split("\u0000");
        if (split.length != 3) {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
        Parcel obtain = Parcel.obtain();
        try {
            String str2 = new String(Base64.decode(split[0], 0), "UTF-8");
            int parseInt = Integer.parseInt(split[1]);
            byte[] decode = Base64.decode(split[2], 0);
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            alc com_google_android_gms_internal_alc = new alc((zzix) zzix.CREATOR.createFromParcel(obtain), str2, parseInt);
            obtain.recycle();
            return com_google_android_gms_internal_alc;
        } catch (IllegalStateException e2) {
            e = e2;
            try {
                zzbv.zzee().m5336a(e, "QueueSeed.decode");
                throw new IOException("Malformed QueueSeed encoding.", e);
            } catch (Throwable th) {
                obtain.recycle();
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            zzbv.zzee().m5336a(e, "QueueSeed.decode");
            throw new IOException("Malformed QueueSeed encoding.", e);
        } catch (lh e4) {
            e = e4;
            zzbv.zzee().m5336a(e, "QueueSeed.decode");
            throw new IOException("Malformed QueueSeed encoding.", e);
        }
    }

    final String m4674a() {
        Parcel obtain = Parcel.obtain();
        String encodeToString;
        try {
            encodeToString = Base64.encodeToString(this.f5268b.getBytes("UTF-8"), 0);
            String num = Integer.toString(this.f5269c);
            this.f5267a.writeToParcel(obtain, 0);
            String encodeToString2 = Base64.encodeToString(obtain.marshall(), 0);
            encodeToString = new StringBuilder(((String.valueOf(encodeToString).length() + 2) + String.valueOf(num).length()) + String.valueOf(encodeToString2).length()).append(encodeToString).append("\u0000").append(num).append("\u0000").append(encodeToString2).toString();
            return encodeToString;
        } catch (UnsupportedEncodingException e) {
            encodeToString = 6;
            id.m5372a(6);
            return "";
        } finally {
            obtain.recycle();
        }
    }
}
