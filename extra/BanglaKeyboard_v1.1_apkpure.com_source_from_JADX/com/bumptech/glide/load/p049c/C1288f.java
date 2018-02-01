package com.bumptech.glide.load.p049c;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.p043a.C1165c;
import java.io.InputStream;

public final class C1288f<A> implements C1252l<A, C1289g> {
    private final C1252l<A, InputStream> f3663a;
    private final C1252l<A, ParcelFileDescriptor> f3664b;

    static class C1287a implements C1165c<C1289g> {
        private final C1165c<InputStream> f3661a;
        private final C1165c<ParcelFileDescriptor> f3662b;

        public C1287a(C1165c<InputStream> c1165c, C1165c<ParcelFileDescriptor> c1165c2) {
            this.f3661a = c1165c;
            this.f3662b = c1165c2;
        }

        private C1289g m3379b(int i) {
            InputStream inputStream;
            ParcelFileDescriptor parcelFileDescriptor = null;
            if (this.f3661a != null) {
                try {
                    inputStream = (InputStream) this.f3661a.mo1324a(i);
                } catch (Exception e) {
                    Log.isLoggable("IVML", 2);
                    if (this.f3662b == null) {
                        throw e;
                    }
                }
                if (this.f3662b != null) {
                    try {
                        parcelFileDescriptor = (ParcelFileDescriptor) this.f3662b.mo1324a(i);
                    } catch (Exception e2) {
                        Log.isLoggable("IVML", 2);
                        if (inputStream == null) {
                            throw e2;
                        }
                    }
                }
                return new C1289g(inputStream, parcelFileDescriptor);
            }
            inputStream = null;
            if (this.f3662b != null) {
                parcelFileDescriptor = (ParcelFileDescriptor) this.f3662b.mo1324a(i);
            }
            return new C1289g(inputStream, parcelFileDescriptor);
        }

        public final /* synthetic */ Object mo1324a(int i) {
            return m3379b(i);
        }

        public final void mo1325a() {
            if (this.f3661a != null) {
                this.f3661a.mo1325a();
            }
            if (this.f3662b != null) {
                this.f3662b.mo1325a();
            }
        }

        public final String mo1326b() {
            return this.f3661a != null ? this.f3661a.mo1326b() : this.f3662b.mo1326b();
        }

        public final void mo1327c() {
            if (this.f3661a != null) {
                this.f3661a.mo1327c();
            }
            if (this.f3662b != null) {
                this.f3662b.mo1327c();
            }
        }
    }

    public C1288f(C1252l<A, InputStream> c1252l, C1252l<A, ParcelFileDescriptor> c1252l2) {
        if (c1252l == null && c1252l2 == null) {
            throw new NullPointerException("At least one of streamLoader and fileDescriptorLoader must be non null");
        }
        this.f3663a = c1252l;
        this.f3664b = c1252l2;
    }

    public final C1165c<C1289g> mo1372a(A a, int i, int i2) {
        C1165c a2 = this.f3663a != null ? this.f3663a.mo1372a(a, i, i2) : null;
        C1165c a3 = this.f3664b != null ? this.f3664b.mo1372a(a, i, i2) : null;
        return (a2 == null && a3 == null) ? null : new C1287a(a2, a3);
    }
}
