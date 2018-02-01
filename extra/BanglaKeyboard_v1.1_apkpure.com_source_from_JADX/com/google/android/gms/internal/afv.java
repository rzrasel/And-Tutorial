package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.C1658y.C1657a;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

public abstract class afv<T> implements Comparable<afv<T>> {
    final int f5068a;
    final String f5069b;
    final int f5070c;
    final ala f5071d;
    Integer f5072e;
    aiy f5073f;
    boolean f5074g;
    boolean f5075h;
    aoc f5076i;
    mf f5077j;
    private final C1657a f5078k;
    private boolean f5079l;
    private boolean f5080m;

    public afv(int i, String str, ala com_google_android_gms_internal_ala) {
        int hashCode;
        this.f5078k = C1657a.f7461a ? new C1657a() : null;
        this.f5074g = true;
        this.f5079l = false;
        this.f5075h = false;
        this.f5080m = false;
        this.f5077j = null;
        this.f5068a = i;
        this.f5069b = str;
        this.f5071d = com_google_android_gms_internal_ala;
        this.f5076i = new wy();
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (host != null) {
                    hashCode = host.hashCode();
                    this.f5070c = hashCode;
                }
            }
        }
        hashCode = 0;
        this.f5070c = hashCode;
    }

    public static String m4464c() {
        String str = "application/x-www-form-urlencoded; charset=";
        String valueOf = String.valueOf("UTF-8");
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    protected abstract ajz<T> mo2118a(adu com_google_android_gms_internal_adu);

    protected abstract void mo2119a(T t);

    public final void m4467a(String str) {
        if (C1657a.f7461a) {
            this.f5078k.m7015a(str, Thread.currentThread().getId());
        }
    }

    public byte[] mo2120a() {
        return null;
    }

    public Map<String, String> mo2121b() {
        return Collections.emptyMap();
    }

    final void m4470b(String str) {
        if (this.f5073f != null) {
            aiy com_google_android_gms_internal_aiy = this.f5073f;
            synchronized (com_google_android_gms_internal_aiy.f5167b) {
                com_google_android_gms_internal_aiy.f5167b.remove(this);
            }
            synchronized (com_google_android_gms_internal_aiy.f5169d) {
                Iterator it = com_google_android_gms_internal_aiy.f5169d.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            if (this.f5074g) {
                synchronized (com_google_android_gms_internal_aiy.f5166a) {
                    Queue queue = (Queue) com_google_android_gms_internal_aiy.f5166a.remove(this.f5069b);
                    if (queue != null) {
                        if (C1658y.f7464a) {
                            C1658y.m7016a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(queue.size()), r3);
                        }
                        com_google_android_gms_internal_aiy.f5168c.addAll(queue);
                    }
                }
            }
        }
        if (C1657a.f7461a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new agw(this, str, id));
                return;
            }
            this.f5078k.m7015a(str, id);
            this.f5078k.m7014a(toString());
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        afv com_google_android_gms_internal_afv = (afv) obj;
        ahx com_google_android_gms_internal_ahx = ahx.NORMAL;
        ahx com_google_android_gms_internal_ahx2 = ahx.NORMAL;
        return com_google_android_gms_internal_ahx == com_google_android_gms_internal_ahx2 ? this.f5072e.intValue() - com_google_android_gms_internal_afv.f5072e.intValue() : com_google_android_gms_internal_ahx2.ordinal() - com_google_android_gms_internal_ahx.ordinal();
    }

    public final int m4471d() {
        return this.f5076i.mo2324a();
    }

    public String toString() {
        String str = "0x";
        String valueOf = String.valueOf(Integer.toHexString(this.f5070c));
        valueOf = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        str = "[ ] ";
        String str2 = this.f5069b;
        String valueOf2 = String.valueOf(ahx.NORMAL);
        String valueOf3 = String.valueOf(this.f5072e);
        return new StringBuilder(((((String.valueOf(str).length() + 3) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(str).append(str2).append(" ").append(valueOf).append(" ").append(valueOf2).append(" ").append(valueOf3).toString();
    }
}
