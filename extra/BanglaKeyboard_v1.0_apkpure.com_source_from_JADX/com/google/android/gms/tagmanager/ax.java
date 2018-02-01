package com.google.android.gms.tagmanager;

final class ax extends Number implements Comparable {
    private double f2322a;
    private long f2323b = 0;
    private boolean f2324c = true;

    private ax() {
    }

    private int m3652a(ax axVar) {
        return (this.f2324c && axVar.f2324c) ? new Long(this.f2323b).compareTo(Long.valueOf(axVar.f2323b)) : Double.compare(doubleValue(), axVar.doubleValue());
    }

    public static ax m3653a() {
        return new ax();
    }

    public final boolean m3654b() {
        return !this.f2324c;
    }

    public final byte byteValue() {
        return (byte) ((int) longValue());
    }

    public final boolean m3655c() {
        return this.f2324c;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return m3652a((ax) obj);
    }

    public final double doubleValue() {
        return this.f2324c ? (double) this.f2323b : this.f2322a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ax) && m3652a((ax) obj) == 0;
    }

    public final float floatValue() {
        return (float) doubleValue();
    }

    public final int hashCode() {
        return new Long(longValue()).hashCode();
    }

    public final int intValue() {
        return (int) longValue();
    }

    public final long longValue() {
        return this.f2324c ? this.f2323b : (long) this.f2322a;
    }

    public final short shortValue() {
        return (short) ((int) longValue());
    }

    public final String toString() {
        return this.f2324c ? Long.toString(this.f2323b) : Double.toString(this.f2322a);
    }
}
