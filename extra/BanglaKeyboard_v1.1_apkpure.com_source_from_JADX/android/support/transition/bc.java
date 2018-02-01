package android.support.transition;

import android.os.IBinder;

final class bc implements be {
    private final IBinder f1324a;

    bc(IBinder iBinder) {
        this.f1324a = iBinder;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bc) && ((bc) obj).f1324a.equals(this.f1324a);
    }

    public final int hashCode() {
        return this.f1324a.hashCode();
    }
}
