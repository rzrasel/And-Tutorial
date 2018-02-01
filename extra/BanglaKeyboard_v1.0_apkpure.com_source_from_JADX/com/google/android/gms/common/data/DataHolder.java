package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.je;

public final class DataHolder implements SafeParcelable {
    public static final C0244c CREATOR = new C0244c();
    private static final C0242b f487l = new C0243a(new String[0]);
    Bundle f488a;
    int[] f489b;
    int f490c;
    boolean f491d = false;
    private final int f492e;
    private final String[] f493f;
    private final CursorWindow[] f494g;
    private final int f495h;
    private final Bundle f496i;
    private Object f497j;
    private boolean f498k = true;

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f492e = i;
        this.f493f = strArr;
        this.f494g = cursorWindowArr;
        this.f495h = i2;
        this.f496i = bundle;
    }

    private void m974a(String str, int i) {
        if (this.f488a == null || !this.f488a.containsKey(str)) {
            throw new IllegalArgumentException("No such column: " + str);
        } else if (m975h()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.f490c) {
            throw new CursorIndexOutOfBoundsException(i, this.f490c);
        }
    }

    private boolean m975h() {
        boolean z;
        synchronized (this) {
            z = this.f491d;
        }
        return z;
    }

    private void m976i() {
        synchronized (this) {
            if (!this.f491d) {
                this.f491d = true;
                for (CursorWindow close : this.f494g) {
                    close.close();
                }
            }
        }
    }

    public final int m977a(int i) {
        int i2 = 0;
        boolean z = i >= 0 && i < this.f490c;
        je.m2476a(z);
        while (i2 < this.f489b.length) {
            if (i < this.f489b[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == this.f489b.length ? i2 - 1 : i2;
    }

    public final long m978a(String str, int i, int i2) {
        m974a(str, i);
        return this.f494g[i2].getLong(i, this.f488a.getInt(str));
    }

    public final void m979a() {
        int i;
        int i2 = 0;
        this.f488a = new Bundle();
        for (i = 0; i < this.f493f.length; i++) {
            this.f488a.putInt(this.f493f[i], i);
        }
        this.f489b = new int[this.f494g.length];
        i = 0;
        while (i2 < this.f494g.length) {
            this.f489b[i2] = i;
            i += this.f494g[i2].getNumRows() - (i - this.f494g[i2].getStartPosition());
            i2++;
        }
        this.f490c = i;
    }

    public final boolean m980a(String str) {
        return this.f488a.containsKey(str);
    }

    final int m981b() {
        return this.f492e;
    }

    public final int m982b(String str, int i, int i2) {
        m974a(str, i);
        return this.f494g[i2].getInt(i, this.f488a.getInt(str));
    }

    public final String m983c(String str, int i, int i2) {
        m974a(str, i);
        return this.f494g[i2].getString(i, this.f488a.getInt(str));
    }

    final String[] m984c() {
        return this.f493f;
    }

    public final boolean m985d(String str, int i, int i2) {
        m974a(str, i);
        return Long.valueOf(this.f494g[i2].getLong(i, this.f488a.getInt(str))).longValue() == 1;
    }

    final CursorWindow[] m986d() {
        return this.f494g;
    }

    public final int describeContents() {
        return 0;
    }

    public final int m987e() {
        return this.f495h;
    }

    public final byte[] m988e(String str, int i, int i2) {
        m974a(str, i);
        return this.f494g[i2].getBlob(i, this.f488a.getInt(str));
    }

    public final Uri m989f(String str, int i, int i2) {
        String c = m983c(str, i, i2);
        return c == null ? null : Uri.parse(c);
    }

    public final Bundle m990f() {
        return this.f496i;
    }

    protected final void finalize() {
        try {
            if (this.f498k && this.f494g.length > 0 && !m975h()) {
                "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call close() on all DataBuffer extending objects when you are done with them. (" + (this.f497j == null ? "internal object: " + toString() : this.f497j.toString()) + ")";
                m976i();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final int m991g() {
        return this.f490c;
    }

    public final boolean m992g(String str, int i, int i2) {
        m974a(str, i);
        return this.f494g[i2].isNull(i, this.f488a.getInt(str));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0244c.m993a(this, parcel, i);
    }
}
