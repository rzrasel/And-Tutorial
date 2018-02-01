package com.bumptech.glide.p036f;

public final class C1142f implements C1126b, C1140c {
    private C1126b f3403a;
    private C1126b f3404b;
    private C1140c f3405c;

    public C1142f() {
        this(null);
    }

    public C1142f(C1140c c1140c) {
        this.f3405c = c1140c;
    }

    public final void mo1300a() {
        this.f3403a.mo1300a();
        this.f3404b.mo1300a();
    }

    public final void m3109a(C1126b c1126b, C1126b c1126b2) {
        this.f3403a = c1126b;
        this.f3404b = c1126b2;
    }

    public final boolean mo1316a(C1126b c1126b) {
        boolean z = this.f3405c == null || this.f3405c.mo1316a(this);
        return z && (c1126b.equals(this.f3403a) || !this.f3403a.mo1309g());
    }

    public final void mo1304b() {
        if (!this.f3404b.mo1307e()) {
            this.f3404b.mo1304b();
        }
        if (!this.f3403a.mo1307e()) {
            this.f3403a.mo1304b();
        }
    }

    public final boolean mo1317b(C1126b c1126b) {
        boolean z = this.f3405c == null || this.f3405c.mo1317b(this);
        return z && c1126b.equals(this.f3403a) && !mo1319i();
    }

    public final void mo1305c() {
        this.f3404b.mo1305c();
        this.f3403a.mo1305c();
    }

    public final void mo1318c(C1126b c1126b) {
        if (!c1126b.equals(this.f3404b)) {
            if (this.f3405c != null) {
                this.f3405c.mo1318c(this);
            }
            if (!this.f3404b.mo1308f()) {
                this.f3404b.mo1305c();
            }
        }
    }

    public final void mo1306d() {
        this.f3403a.mo1306d();
        this.f3404b.mo1306d();
    }

    public final boolean mo1307e() {
        return this.f3403a.mo1307e();
    }

    public final boolean mo1308f() {
        return this.f3403a.mo1308f() || this.f3404b.mo1308f();
    }

    public final boolean mo1309g() {
        return this.f3403a.mo1309g() || this.f3404b.mo1309g();
    }

    public final boolean mo1310h() {
        return this.f3403a.mo1310h();
    }

    public final boolean mo1319i() {
        boolean z = this.f3405c != null && this.f3405c.mo1319i();
        return z || mo1309g();
    }
}
