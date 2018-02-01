package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public final class hd {
    final List<String> f6194a = new ArrayList();
    final List<Double> f6195b = new ArrayList();
    final List<Double> f6196c = new ArrayList();

    public final hd m5580a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f6194a.size()) {
            double doubleValue = ((Double) this.f6196c.get(i)).doubleValue();
            double doubleValue2 = ((Double) this.f6195b.get(i)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f6194a.add(i, str);
        this.f6196c.add(i, Double.valueOf(d));
        this.f6195b.add(i, Double.valueOf(d2));
        return this;
    }
}
