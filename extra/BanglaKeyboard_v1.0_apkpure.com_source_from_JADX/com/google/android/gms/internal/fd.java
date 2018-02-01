package com.google.android.gms.internal;

import android.os.Bundle;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;

public final class fd {
    public static final String f1380a;
    private static final fd f1381c;
    public final String f1382b = m1975d();
    private final Object f1383d = new Object();
    private final ff f1384e = new ff(this.f1382b);
    private BigInteger f1385f = BigInteger.ONE;
    private final HashSet f1386g = new HashSet();
    private final HashMap f1387h = new HashMap();

    static {
        fd fdVar = new fd();
        f1381c = fdVar;
        f1380a = fdVar.f1382b;
    }

    private fd() {
    }

    public static Bundle m1969a(fg fgVar, String str) {
        return f1381c.m1972b(fgVar, str);
    }

    public static fd m1970a() {
        return f1381c;
    }

    public static void m1971a(HashSet hashSet) {
        fd fdVar = f1381c;
        synchronized (fdVar.f1383d) {
            fdVar.f1386g.addAll(hashSet);
        }
    }

    private Bundle m1972b(fg fgVar, String str) {
        Bundle bundle;
        synchronized (this.f1383d) {
            bundle = new Bundle();
            bundle.putBundle("app", this.f1384e.m1980a(str));
            Bundle bundle2 = new Bundle();
            for (String str2 : this.f1387h.keySet()) {
                bundle2.putBundle(str2, ((fh) this.f1387h.get(str2)).m1982a());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f1386g.iterator();
            while (it.hasNext()) {
                arrayList.add(((fa) it.next()).m1963a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            fgVar.mo980a(this.f1386g);
            this.f1386g.clear();
        }
        return bundle;
    }

    public static String m1973b() {
        return f1381c.m1976e();
    }

    public static ff m1974c() {
        return f1381c.m1977f();
    }

    private static String m1975d() {
        UUID randomUUID = UUID.randomUUID();
        byte[] toByteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] toByteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, toByteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(toByteArray);
                instance.update(toByteArray2);
                Object obj = new byte[8];
                System.arraycopy(instance.digest(), 0, obj, 0, 8);
                bigInteger = new BigInteger(1, obj).toString();
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return bigInteger;
    }

    private String m1976e() {
        String bigInteger;
        synchronized (this.f1383d) {
            bigInteger = this.f1385f.toString();
            this.f1385f = this.f1385f.add(BigInteger.ONE);
        }
        return bigInteger;
    }

    private ff m1977f() {
        ff ffVar;
        synchronized (this.f1383d) {
            ffVar = this.f1384e;
        }
        return ffVar;
    }

    public final void m1978a(fa faVar) {
        synchronized (this.f1383d) {
            this.f1386g.add(faVar);
        }
    }

    public final void m1979a(String str, fh fhVar) {
        synchronized (this.f1383d) {
            this.f1387h.put(str, fhVar);
        }
    }
}
