package android.support.v4.view.p019a;

import android.os.Build.VERSION;
import android.support.v4.view.p019a.C0637d.C0628a;
import android.support.v4.view.p019a.C0637d.C06361;
import android.support.v4.view.p019a.C0639e.C0632a;
import android.support.v4.view.p019a.C0639e.C06381;
import java.util.List;

public final class C0635c {
    private static final C0627a f1923b;
    public final Object f1924a;

    interface C0627a {
        Object mo624a(C0635c c0635c);
    }

    static class C0630d implements C0627a {
        C0630d() {
        }

        public Object mo624a(C0635c c0635c) {
            return null;
        }
    }

    private static class C0631b extends C0630d {
        C0631b() {
        }

        public final Object mo624a(final C0635c c0635c) {
            return new C06361(new C0628a(this) {
                final /* synthetic */ C0631b f1920b;

                public final boolean mo621a() {
                    return C0635c.m1729b();
                }

                public final List<Object> mo622b() {
                    C0635c.m1730c();
                    return null;
                }

                public final Object mo623c() {
                    C0635c.m1728a();
                    return null;
                }
            });
        }
    }

    private static class C0634c extends C0630d {
        C0634c() {
        }

        public final Object mo624a(final C0635c c0635c) {
            return new C06381(new C0632a(this) {
                final /* synthetic */ C0634c f1922b;

                public final boolean mo625a() {
                    return C0635c.m1729b();
                }

                public final List<Object> mo626b() {
                    C0635c.m1730c();
                    return null;
                }

                public final Object mo627c() {
                    C0635c.m1728a();
                    return null;
                }

                public final Object mo628d() {
                    C0635c.m1731d();
                    return null;
                }
            });
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f1923b = new C0634c();
        } else if (VERSION.SDK_INT >= 16) {
            f1923b = new C0631b();
        } else {
            f1923b = new C0630d();
        }
    }

    public C0635c() {
        this.f1924a = f1923b.mo624a(this);
    }

    public C0635c(Object obj) {
        this.f1924a = obj;
    }

    public static C0626b m1728a() {
        return null;
    }

    public static boolean m1729b() {
        return false;
    }

    public static List<C0626b> m1730c() {
        return null;
    }

    public static C0626b m1731d() {
        return null;
    }
}
