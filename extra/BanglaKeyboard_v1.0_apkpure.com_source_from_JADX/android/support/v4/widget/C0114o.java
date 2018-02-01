package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

public final class C0114o {
    private static final C0115r f344b;
    private Object f345a;

    static {
        if (VERSION.SDK_INT >= 14) {
            f344b = new C0117q();
        } else {
            f344b = new C0116p();
        }
    }

    public C0114o(Context context) {
        this.f345a = f344b.mo288a(context);
    }

    public final void m664a(int i, int i2) {
        f344b.mo289a(this.f345a, i, i2);
    }

    public final boolean m665a() {
        return f344b.mo290a(this.f345a);
    }

    public final boolean m666a(float f) {
        return f344b.mo291a(this.f345a, f);
    }

    public final boolean m667a(Canvas canvas) {
        return f344b.mo292a(this.f345a, canvas);
    }

    public final void m668b() {
        f344b.mo293b(this.f345a);
    }

    public final boolean m669c() {
        return f344b.mo294c(this.f345a);
    }
}
