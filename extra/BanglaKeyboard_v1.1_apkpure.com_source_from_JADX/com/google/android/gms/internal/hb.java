package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

@aqv
public final class hb {
    public final double[] f6184a;
    public final double[] f6185b;
    public final int[] f6186c;
    public int f6187d;
    private final String[] f6188e;

    private hb(hd hdVar) {
        int size = hdVar.f6195b.size();
        this.f6188e = (String[]) hdVar.f6194a.toArray(new String[size]);
        this.f6184a = m5578a(hdVar.f6195b);
        this.f6185b = m5578a(hdVar.f6196c);
        this.f6186c = new int[size];
        this.f6187d = 0;
    }

    private static double[] m5578a(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    public final List<hc> m5579a() {
        List<hc> arrayList = new ArrayList(this.f6188e.length);
        for (int i = 0; i < this.f6188e.length; i++) {
            arrayList.add(new hc(this.f6188e[i], this.f6185b[i], this.f6184a[i], ((double) this.f6186c[i]) / ((double) this.f6187d), this.f6186c[i]));
        }
        return arrayList;
    }
}
