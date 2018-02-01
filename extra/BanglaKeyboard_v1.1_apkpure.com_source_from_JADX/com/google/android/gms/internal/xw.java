package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;

@aqv
public final class xw {
    final Object f7438a = new Object();
    int f7439b = 0;
    int f7440c = 0;
    int f7441d = 0;
    int f7442e;
    String f7443f = "";
    String f7444g = "";
    String f7445h = "";
    private final int f7446i;
    private final int f7447j;
    private final int f7448k;
    private final yk f7449l;
    private final yt f7450m;
    private ArrayList<String> f7451n = new ArrayList();
    private ArrayList<String> f7452o = new ArrayList();
    private ArrayList<yi> f7453p = new ArrayList();

    public xw(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f7446i = i;
        this.f7447j = i2;
        this.f7448k = i3;
        this.f7449l = new yk(i4);
        this.f7450m = new yt(i5, i6, i7);
    }

    private static String m6999a(ArrayList<String> arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            stringBuffer.append((String) obj);
            stringBuffer.append(' ');
            if (stringBuffer.length() > 100) {
                break;
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        String stringBuffer2 = stringBuffer.toString();
        return stringBuffer2.length() >= 100 ? stringBuffer2.substring(0, 100) : stringBuffer2;
    }

    public final void m7000a(String str, boolean z, float f, float f2, float f3, float f4) {
        m7003b(str, z, f, f2, f3, f4);
        synchronized (this.f7438a) {
            if (this.f7441d < 0) {
                id.m5372a(3);
            }
            m7004c();
        }
    }

    public final boolean m7001a() {
        boolean z;
        synchronized (this.f7438a) {
            z = this.f7441d == 0;
        }
        return z;
    }

    public final void m7002b() {
        synchronized (this.f7438a) {
            this.f7441d++;
        }
    }

    final void m7003b(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.f7448k) {
            synchronized (this.f7438a) {
                this.f7451n.add(str);
                this.f7439b += str.length();
                if (z) {
                    this.f7452o.add(str);
                    this.f7453p.add(new yi(f, f2, f3, f4, this.f7452o.size() - 1));
                }
            }
        }
    }

    public final void m7004c() {
        synchronized (this.f7438a) {
            int i = (this.f7439b * this.f7446i) + (this.f7440c * this.f7447j);
            if (i > this.f7442e) {
                this.f7442e = i;
                if (((Boolean) zzbv.zzen().m4217a(ado.f4877P)).booleanValue() && !zzbv.zzee().m5338a()) {
                    this.f7443f = this.f7449l.m7034a(this.f7451n);
                    this.f7444g = this.f7449l.m7034a(this.f7452o);
                }
                if (((Boolean) zzbv.zzen().m4217a(ado.f4879R)).booleanValue() && !zzbv.zzee().m5342b()) {
                    this.f7445h = this.f7450m.m7047a(this.f7452o, this.f7453p);
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xw)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        xw xwVar = (xw) obj;
        return xwVar.f7443f != null && xwVar.f7443f.equals(this.f7443f);
    }

    public final int hashCode() {
        return this.f7443f.hashCode();
    }

    public final String toString() {
        int i = this.f7440c;
        int i2 = this.f7442e;
        int i3 = this.f7439b;
        String a = m6999a(this.f7451n);
        String a2 = m6999a(this.f7452o);
        String str = this.f7443f;
        String str2 = this.f7444g;
        String str3 = this.f7445h;
        return new StringBuilder(((((String.valueOf(a).length() + 165) + String.valueOf(a2).length()) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("ActivityContent fetchId: ").append(i).append(" score:").append(i2).append(" total_length:").append(i3).append("\n text: ").append(a).append("\n viewableText").append(a2).append("\n signture: ").append(str).append("\n viewableSignture: ").append(str2).append("\n viewableSignatureForVertical: ").append(str3).toString();
    }
}
