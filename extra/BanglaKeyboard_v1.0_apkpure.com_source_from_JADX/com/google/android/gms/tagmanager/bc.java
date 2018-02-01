package com.google.android.gms.tagmanager;

final class bc {
    bd f2343a;
    boolean f2344b;
    private C0515a f2345c;

    public final synchronized void m3676a() {
        if (this.f2344b) {
            C0535t.m3730a();
        } else {
            bd bdVar = this.f2343a;
        }
    }

    public final synchronized void m3677a(String str) {
        if (!this.f2344b) {
            this.f2345c.m3607a().m3645a(str);
        }
    }

    final String m3678b() {
        if (!this.f2344b) {
            return this.f2345c.f2270a;
        }
        C0535t.m3730a();
        return "";
    }

    final void m3679c() {
        if (this.f2344b) {
            C0535t.m3730a();
        } else {
            bd bdVar = this.f2343a;
        }
    }
}
