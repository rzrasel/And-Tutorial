package android.support.v4.content;

import android.support.v4.p001b.C0033d;

public final class C0048i {
    public int f48a;
    public C0023j f49b;
    public boolean f50c;
    public boolean f51d;
    public boolean f52e;
    public boolean f53f;
    public boolean f54g;

    public final void m56a(C0023j c0023j) {
        if (this.f49b == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f49b != c0023j) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f49b = null;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0033d.m35a(this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.f48a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
