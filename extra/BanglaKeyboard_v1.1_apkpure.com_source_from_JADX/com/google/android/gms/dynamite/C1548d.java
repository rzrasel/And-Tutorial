package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.C1544d;

final class C1548d implements C1544d {
    C1548d() {
    }

    public final C1553j mo1674a(Context context, String str, C1541i c1541i) {
        C1553j c1553j = new C1553j();
        c1553j.f4682a = c1541i.mo1672a(context, str);
        c1553j.f4683b = c1541i.mo1673a(context, str, true);
        if (c1553j.f4682a == 0 && c1553j.f4683b == 0) {
            c1553j.f4684c = 0;
        } else if (c1553j.f4682a >= c1553j.f4683b) {
            c1553j.f4684c = -1;
        } else {
            c1553j.f4684c = 1;
        }
        return c1553j;
    }
}
