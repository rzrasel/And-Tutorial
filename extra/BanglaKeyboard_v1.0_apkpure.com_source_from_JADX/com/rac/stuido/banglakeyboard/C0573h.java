package com.rac.stuido.banglakeyboard;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class C0573h implements C0572g {
    final /* synthetic */ C0570e f2822a;
    private final Map f2823b;

    private C0573h(C0570e c0570e) {
        this.f2822a = c0570e;
        this.f2823b = new HashMap();
    }

    public final void mo1373a(List list, List list2) {
        Map map = this.f2823b;
        map.clear();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0571f c0571f = (C0571f) list.get(i);
            c0571f.f2820b = 0.0f;
            map.put(c0571f.f2819a.activityInfo.packageName, c0571f);
        }
        float f = 1.0f;
        int size2 = list2.size() - 1;
        while (size2 >= 0) {
            float f2;
            C0574i c0574i = (C0574i) list2.get(size2);
            c0571f = (C0571f) map.get(c0574i.f2824a.getPackageName());
            if (c0571f != null) {
                c0571f.f2820b = (c0574i.f2826c * f) + c0571f.f2820b;
                f2 = 0.95f * f;
            } else {
                f2 = f;
            }
            size2--;
            f = f2;
        }
        Collections.sort(list);
    }
}
