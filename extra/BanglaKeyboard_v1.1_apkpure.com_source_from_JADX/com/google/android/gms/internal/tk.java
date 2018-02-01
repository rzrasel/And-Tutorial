package com.google.android.gms.internal;

public class tk {
    private static final sm f7131d = sm.m6623a();
    ry f7132a;
    volatile tl f7133b;
    volatile ry f7134c;

    private final ry m6661a() {
        if (this.f7134c != null) {
            return this.f7134c;
        }
        synchronized (this) {
            if (this.f7134c != null) {
                ry ryVar = this.f7134c;
                return ryVar;
            }
            if (this.f7133b == null) {
                this.f7134c = ry.f7068a;
            } else {
                this.f7134c = this.f7133b.mo2216g();
            }
            ryVar = this.f7134c;
            return ryVar;
        }
    }

    private tl m6662a(tl tlVar) {
        if (this.f7133b == null) {
            synchronized (this) {
                if (this.f7133b != null) {
                } else {
                    try {
                        this.f7133b = tlVar;
                        this.f7134c = ry.f7068a;
                    } catch (tf e) {
                        this.f7133b = tlVar;
                        this.f7134c = ry.f7068a;
                    }
                }
            }
        }
        return this.f7133b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk)) {
            return false;
        }
        tk tkVar = (tk) obj;
        tl tlVar = this.f7133b;
        tl tlVar2 = tkVar.f7133b;
        return (tlVar == null && tlVar2 == null) ? m6661a().equals(tkVar.m6661a()) : (tlVar == null || tlVar2 == null) ? tlVar != null ? tlVar.equals(tkVar.m6662a(tlVar.mo2215j())) : m6662a(tlVar2.mo2215j()).equals(tlVar2) : tlVar.equals(tlVar2);
    }

    public int hashCode() {
        return 1;
    }
}
