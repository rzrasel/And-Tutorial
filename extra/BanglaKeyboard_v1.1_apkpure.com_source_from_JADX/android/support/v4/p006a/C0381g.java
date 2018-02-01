package android.support.v4.p006a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v4.content.p015a.C0436a.C0433b;
import android.support.v4.content.p015a.C0436a.C0434c;
import android.support.v4.p006a.C0380c.C0379a;
import android.support.v4.p016d.C0452b.C0451b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

class C0381g implements C0379a {

    private interface C0385a<T> {
        boolean mo288a(T t);

        int mo289b(T t);
    }

    class C03861 implements C0385a<C0451b> {
        final /* synthetic */ C0381g f1396a;

        C03861(C0381g c0381g) {
            this.f1396a = c0381g;
        }

        public final /* bridge */ /* synthetic */ boolean mo288a(Object obj) {
            return ((C0451b) obj).f1448d;
        }

        public final /* bridge */ /* synthetic */ int mo289b(Object obj) {
            return ((C0451b) obj).f1447c;
        }
    }

    class C03872 implements C0385a<C0434c> {
        final /* synthetic */ C0381g f1397a;

        C03872(C0381g c0381g) {
            this.f1397a = c0381g;
        }

        public final /* bridge */ /* synthetic */ boolean mo288a(Object obj) {
            return ((C0434c) obj).f1414c;
        }

        public final /* bridge */ /* synthetic */ int mo289b(Object obj) {
            return ((C0434c) obj).f1413b;
        }
    }

    C0381g() {
    }

    protected static Typeface m1103a(Context context, InputStream inputStream) {
        Typeface typeface = null;
        File a = C0388h.m1133a(context);
        if (a != null) {
            try {
                if (C0388h.m1139a(a, inputStream)) {
                    typeface = Typeface.createFromFile(a.getPath());
                    a.delete();
                }
            } catch (RuntimeException e) {
            } finally {
                a.delete();
            }
        }
        return typeface;
    }

    private static <T> T m1104a(T[] tArr, int i, C0385a<T> c0385a) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int length = tArr.length;
        int i4 = 0;
        while (i4 < length) {
            T t2;
            T t3 = tArr[i4];
            int abs = (c0385a.mo288a(t3) == z ? 0 : 1) + (Math.abs(c0385a.mo289b(t3) - i2) * 2);
            if (t == null || r3 > abs) {
                i3 = abs;
                t2 = t3;
            } else {
                t2 = t;
            }
            i4++;
            t = t2;
        }
        return t;
    }

    public Typeface mo285a(Context context, Resources resources, int i, String str, int i2) {
        Typeface typeface = null;
        File a = C0388h.m1133a(context);
        if (a != null) {
            try {
                if (C0388h.m1138a(a, resources, i)) {
                    typeface = Typeface.createFromFile(a.getPath());
                    a.delete();
                }
            } catch (RuntimeException e) {
            } finally {
                a.delete();
            }
        }
        return typeface;
    }

    public Typeface mo286a(Context context, C0433b c0433b, Resources resources, int i) {
        C0434c c0434c = (C0434c) C0381g.m1104a(c0433b.f1411a, i, new C03872(this));
        return c0434c == null ? null : C0380c.m1098a(context, resources, c0434c.f1415d, c0434c.f1412a, i);
    }

    public Typeface mo287a(Context context, C0451b[] c0451bArr, int i) {
        Closeable openInputStream;
        Throwable th;
        Typeface typeface = null;
        if (c0451bArr.length > 0) {
            try {
                openInputStream = context.getContentResolver().openInputStream(m1108a(c0451bArr, i).f1445a);
                try {
                    typeface = C0381g.m1103a(context, (InputStream) openInputStream);
                    C0388h.m1137a(openInputStream);
                } catch (IOException e) {
                    C0388h.m1137a(openInputStream);
                    return typeface;
                } catch (Throwable th2) {
                    th = th2;
                    C0388h.m1137a(openInputStream);
                    throw th;
                }
            } catch (IOException e2) {
                openInputStream = typeface;
                C0388h.m1137a(openInputStream);
                return typeface;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                openInputStream = typeface;
                th = th4;
                C0388h.m1137a(openInputStream);
                throw th;
            }
        }
        return typeface;
    }

    protected final C0451b m1108a(C0451b[] c0451bArr, int i) {
        return (C0451b) C0381g.m1104a((Object[]) c0451bArr, i, new C03861(this));
    }
}
