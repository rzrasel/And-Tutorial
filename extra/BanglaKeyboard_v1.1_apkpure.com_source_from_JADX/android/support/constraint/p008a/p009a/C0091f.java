package android.support.constraint.p008a.p009a;

import java.util.ArrayList;

public final class C0091f {
    int f365a;
    int f366b;
    int f367c;
    int f368d;
    ArrayList<C0090a> f369e = new ArrayList();

    static class C0090a {
        C0081a f360a;
        C0081a f361b;
        int f362c;
        int f363d;
        int f364e;

        public C0090a(C0081a c0081a) {
            this.f360a = c0081a;
            this.f361b = c0081a.f293c;
            this.f362c = c0081a.m101b();
            this.f363d = c0081a.f296f;
            this.f364e = c0081a.f298h;
        }
    }

    public C0091f(C0084b c0084b) {
        this.f365a = c0084b.m119d();
        this.f366b = c0084b.m122e();
        this.f367c = c0084b.m124f();
        this.f368d = c0084b.m130i();
        ArrayList s = c0084b.mo37s();
        int size = s.size();
        for (int i = 0; i < size; i++) {
            this.f369e.add(new C0090a((C0081a) s.get(i)));
        }
    }
}
