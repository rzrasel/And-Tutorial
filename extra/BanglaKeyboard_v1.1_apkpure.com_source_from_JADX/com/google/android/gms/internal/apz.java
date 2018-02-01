package com.google.android.gms.internal;

import java.util.List;

final class apz implements ig<List<aeq>, aeo> {
    private /* synthetic */ String f5613a;
    private /* synthetic */ Integer f5614b;
    private /* synthetic */ Integer f5615c;
    private /* synthetic */ int f5616d;
    private /* synthetic */ int f5617e;
    private /* synthetic */ int f5618f;
    private /* synthetic */ int f5619g;
    private /* synthetic */ boolean f5620h;

    apz(String str, Integer num, Integer num2, int i, int i2, int i3, int i4, boolean z) {
        this.f5613a = str;
        this.f5614b = num;
        this.f5615c = num2;
        this.f5616d = i;
        this.f5617e = i2;
        this.f5618f = i3;
        this.f5619g = i4;
        this.f5620h = z;
    }

    public final /* synthetic */ Object mo2013a(Object obj) {
        Integer num = null;
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String str = this.f5613a;
        Integer num2 = this.f5614b;
        Integer num3 = this.f5615c;
        if (this.f5616d > 0) {
            num = Integer.valueOf(this.f5616d);
        }
        return new aeo(str, list, num2, num3, num, this.f5617e + this.f5618f, this.f5619g, this.f5620h);
    }
}
