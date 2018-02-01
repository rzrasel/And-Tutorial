package android.support.v4.p006a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v4.content.p015a.C0436a.C0432a;
import android.support.v4.content.p015a.C0436a.C0433b;
import android.support.v4.content.p015a.C0436a.C0435d;
import android.support.v4.p016d.C0452b;
import android.support.v4.p016d.C0452b.C0451b;
import android.support.v4.p018f.C0485g;
import android.widget.TextView;

public final class C0380c {
    private static final C0379a f1383a;
    private static final C0485g<String, Typeface> f1384b = new C0485g(16);

    interface C0379a {
        Typeface mo285a(Context context, Resources resources, int i, String str, int i2);

        Typeface mo286a(Context context, C0433b c0433b, Resources resources, int i);

        Typeface mo287a(Context context, C0451b[] c0451bArr, int i);
    }

    static {
        if (VERSION.SDK_INT >= 26) {
            f1383a = new C0384f();
        } else if (VERSION.SDK_INT >= 24 && C0383e.m1112a()) {
            f1383a = new C0383e();
        } else if (VERSION.SDK_INT >= 21) {
            f1383a = new C0382d();
        } else {
            f1383a = new C0381g();
        }
    }

    public static Typeface m1098a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f1383a.mo285a(context, resources, i, str, i2);
        if (a != null) {
            f1384b.put(C0380c.m1102b(resources, i, i2), a);
        }
        return a;
    }

    public static Typeface m1099a(Context context, C0432a c0432a, Resources resources, int i, int i2, TextView textView) {
        Typeface a;
        if (c0432a instanceof C0435d) {
            C0435d c0435d = (C0435d) c0432a;
            a = C0452b.m1181a(context, c0435d.f1416a, textView, c0435d.f1418c, c0435d.f1417b, i2);
        } else {
            a = f1383a.mo286a(context, (C0433b) c0432a, resources, i2);
        }
        if (a != null) {
            f1384b.put(C0380c.m1102b(resources, i, i2), a);
        }
        return a;
    }

    public static Typeface m1100a(Context context, C0451b[] c0451bArr, int i) {
        return f1383a.mo287a(context, c0451bArr, i);
    }

    public static Typeface m1101a(Resources resources, int i, int i2) {
        return (Typeface) f1384b.get(C0380c.m1102b(resources, i, i2));
    }

    private static String m1102b(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
