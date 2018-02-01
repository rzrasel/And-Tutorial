package android.support.v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.content.C0440c;
import java.util.Calendar;

final class C0848p {
    static C0848p f2567a;
    private final Context f2568b;
    private final LocationManager f2569c;
    private final C0847a f2570d = new C0847a();

    private static class C0847a {
        boolean f2561a;
        long f2562b;
        long f2563c;
        long f2564d;
        long f2565e;
        long f2566f;

        C0847a() {
        }
    }

    C0848p(Context context, LocationManager locationManager) {
        this.f2568b = context;
        this.f2569c = locationManager;
    }

    private Location m2454a(String str) {
        if (this.f2569c != null) {
            try {
                if (this.f2569c.isProviderEnabled(str)) {
                    return this.f2569c.getLastKnownLocation(str);
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    final boolean m2455a() {
        C0847a c0847a = this.f2570d;
        Object obj = (this.f2570d == null || this.f2570d.f2566f <= System.currentTimeMillis()) ? null : 1;
        if (obj != null) {
            return c0847a.f2561a;
        }
        Location location = null;
        Location location2 = null;
        if (C0440c.m1174a(this.f2568b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = m2454a("network");
        }
        if (C0440c.m1174a(this.f2568b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = m2454a("gps");
        }
        Location location3 = (location2 == null || location == null) ? location2 != null ? location2 : location : location2.getTime() > location.getTime() ? location2 : location;
        if (location3 != null) {
            long j;
            C0847a c0847a2 = this.f2570d;
            long currentTimeMillis = System.currentTimeMillis();
            if (C0846o.f2557a == null) {
                C0846o.f2557a = new C0846o();
            }
            C0846o c0846o = C0846o.f2557a;
            c0846o.m2453a(currentTimeMillis - 86400000, location3.getLatitude(), location3.getLongitude());
            long j2 = c0846o.f2558b;
            c0846o.m2453a(currentTimeMillis, location3.getLatitude(), location3.getLongitude());
            boolean z = c0846o.f2560d == 1;
            long j3 = c0846o.f2559c;
            long j4 = c0846o.f2558b;
            c0846o.m2453a(86400000 + currentTimeMillis, location3.getLatitude(), location3.getLongitude());
            long j5 = c0846o.f2559c;
            if (j3 == -1 || j4 == -1) {
                j = 43200000 + currentTimeMillis;
            } else {
                j = currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3;
                j += 60000;
            }
            c0847a2.f2561a = z;
            c0847a2.f2562b = j2;
            c0847a2.f2563c = j3;
            c0847a2.f2564d = j4;
            c0847a2.f2565e = j5;
            c0847a2.f2566f = j;
            return c0847a.f2561a;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
