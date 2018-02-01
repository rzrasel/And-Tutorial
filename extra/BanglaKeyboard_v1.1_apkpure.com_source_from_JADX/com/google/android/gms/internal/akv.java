package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.zzbv;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@aqv
public final class akv {
    final Map<akw, akx> f5240a = new HashMap();
    final LinkedList<akw> f5241b = new LinkedList();
    ajr f5242c;

    static Set<String> m4657a(zzix com_google_android_gms_internal_zzix) {
        Set<String> hashSet = new HashSet();
        hashSet.addAll(com_google_android_gms_internal_zzix.f7742c.keySet());
        Bundle bundle = com_google_android_gms_internal_zzix.f7752m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            hashSet.addAll(bundle.keySet());
        }
        return hashSet;
    }

    private static void m4658a(Bundle bundle, String str) {
        while (true) {
            String[] split = str.split("/", 2);
            if (split.length != 0) {
                String str2 = split[0];
                if (split.length == 1) {
                    bundle.remove(str2);
                    return;
                }
                bundle = bundle.getBundle(str2);
                if (bundle != null) {
                    str = split[1];
                } else {
                    return;
                }
            }
            return;
        }
    }

    static void m4659a(String str, akw com_google_android_gms_internal_akw) {
        if (id.m5372a(2)) {
            String.format(str, new Object[]{com_google_android_gms_internal_akw});
            es.m5373a();
        }
    }

    static String[] m4660a(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i = 0; i < split.length; i++) {
                split[i] = new String(Base64.decode(split[i], 0), "UTF-8");
            }
            return split;
        } catch (UnsupportedEncodingException e) {
            return new String[0];
        }
    }

    static zzix m4661b(zzix com_google_android_gms_internal_zzix) {
        zzix c = m4664c(com_google_android_gms_internal_zzix);
        for (String str : ((String) zzbv.zzen().m4217a(ado.aH)).split(",")) {
            m4658a(c.f7752m, str);
            String str2 = "com.google.ads.mediation.admob.AdMobAdapter/";
            if (str.startsWith(str2)) {
                m4658a(c.f7742c, str.replaceFirst(str2, ""));
            }
        }
        return c;
    }

    private final String m4662b() {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            Iterator it = this.f5241b.iterator();
            while (it.hasNext()) {
                stringBuilder.append(Base64.encodeToString(((akw) it.next()).toString().getBytes("UTF-8"), 0));
                if (it.hasNext()) {
                    stringBuilder.append("\u0000");
                }
            }
            return stringBuilder.toString();
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    static boolean m4663b(String str) {
        try {
            return Pattern.matches((String) zzbv.zzen().m4217a(ado.aL), str);
        } catch (Throwable e) {
            zzbv.zzee().m5336a(e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    static zzix m4664c(zzix com_google_android_gms_internal_zzix) {
        Parcel obtain = Parcel.obtain();
        com_google_android_gms_internal_zzix.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        zzix com_google_android_gms_internal_zzix2 = (zzix) zzix.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        if (((Boolean) zzbv.zzen().m4217a(ado.aB)).booleanValue()) {
            zzix.m7104a(com_google_android_gms_internal_zzix2);
        }
        return com_google_android_gms_internal_zzix2;
    }

    static String m4665c(String str) {
        try {
            Matcher matcher = Pattern.compile("([^/]+/[0-9]+).*").matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
            }
        } catch (RuntimeException e) {
        }
        return str;
    }

    final void m4666a() {
        if (this.f5242c != null) {
            akw com_google_android_gms_internal_akw;
            akx com_google_android_gms_internal_akx;
            for (Entry entry : this.f5240a.entrySet()) {
                int i;
                com_google_android_gms_internal_akw = (akw) entry.getKey();
                com_google_android_gms_internal_akx = (akx) entry.getValue();
                if (id.m5372a(2)) {
                    int size = com_google_android_gms_internal_akx.f5244a.size();
                    Iterator it = com_google_android_gms_internal_akx.f5244a.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        i = ((aky) it.next()).f5253e ? i + 1 : i;
                    }
                    if (i < size) {
                        String.format("Loading %s/%s pooled interstitials for %s.", new Object[]{Integer.valueOf(size - i), Integer.valueOf(size), com_google_android_gms_internal_akw});
                        es.m5373a();
                    }
                }
                Iterator it2 = com_google_android_gms_internal_akx.f5244a.iterator();
                i = 0;
                while (it2.hasNext()) {
                    i = ((aky) it2.next()).m4668a() ? i + 1 : i;
                }
                i += 0;
                while (true) {
                    if (com_google_android_gms_internal_akx.f5244a.size() >= ((Integer) zzbv.zzen().m4217a(ado.aJ)).intValue()) {
                        break;
                    }
                    m4659a("Pooling and loading one new interstitial for %s.", com_google_android_gms_internal_akw);
                    aky com_google_android_gms_internal_aky = new aky(com_google_android_gms_internal_akx, this.f5242c);
                    com_google_android_gms_internal_akx.f5244a.add(com_google_android_gms_internal_aky);
                    if (com_google_android_gms_internal_aky.m4668a()) {
                        i++;
                    }
                }
                akz a = akz.m4669a();
                a.f5257a += i;
            }
            if (this.f5242c != null) {
                Editor edit = this.f5242c.f5211a.getApplicationContext().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
                edit.clear();
                for (Entry entry2 : this.f5240a.entrySet()) {
                    com_google_android_gms_internal_akw = (akw) entry2.getKey();
                    com_google_android_gms_internal_akx = (akx) entry2.getValue();
                    if (com_google_android_gms_internal_akx.f5248e) {
                        edit.putString(com_google_android_gms_internal_akw.toString(), new alc(com_google_android_gms_internal_akx).m4674a());
                        m4659a("Saved interstitial queue for %s.", com_google_android_gms_internal_akw);
                    }
                }
                edit.putString("PoolKeys", m4662b());
                edit.apply();
            }
        }
    }
}
