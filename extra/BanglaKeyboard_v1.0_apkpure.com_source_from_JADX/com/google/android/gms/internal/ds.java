package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.C0250h;
import org.json.JSONException;
import org.json.JSONObject;

public final class ds extends fj implements ec, gk {
    final dr f1201a;
    final ge f1202b;
    final Object f1203c = new Object();
    cz f1204d;
    private final bs f1205g;
    private final Object f1206h = new Object();
    private final Context f1207i;
    private final ei f1208j;
    private final ne f1209k;
    private fj f1210l;
    private boolean f1211m = false;
    private bg f1212n;
    private bj f1213o;
    private bo f1214p;

    public ds(Context context, ei eiVar, ne neVar, ge geVar, bs bsVar, dr drVar) {
        this.f1205g = bsVar;
        this.f1201a = drVar;
        this.f1202b = geVar;
        this.f1207i = context;
        this.f1208j = eiVar;
        this.f1209k = neVar;
    }

    private ak m1875a(cx cxVar) {
        if (this.f1204d.f1182m == null) {
            throw new dy("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] split = this.f1204d.f1182m.split("x");
        if (split.length != 2) {
            throw new dy("Could not parse the ad size from the ad response: " + this.f1204d.f1182m, 0);
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            for (ak akVar : cxVar.f1160d.f941h) {
                float f = this.f1207i.getResources().getDisplayMetrics().density;
                int i = akVar.f939f == -1 ? (int) (((float) akVar.f940g) / f) : akVar.f939f;
                int i2 = akVar.f936c == -2 ? (int) (((float) akVar.f937d) / f) : akVar.f936c;
                if (parseInt == i && parseInt2 == i2) {
                    return new ak(akVar, cxVar.f1160d.f941h);
                }
            }
            throw new dy("The ad size from the ad response was not one of the requested sizes: " + this.f1204d.f1182m, 0);
        } catch (NumberFormatException e) {
            throw new dy("Could not parse the ad size from the ad response: " + this.f1204d.f1182m, 0);
        }
    }

    private void m1876a(long j) {
        while (m1877b(j)) {
            if (this.f1211m) {
                return;
            }
        }
        throw new dy("Timed out waiting for WebView to finish loading.", 2);
    }

    private boolean m1877b(long j) {
        long elapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            return false;
        }
        try {
            this.f1203c.wait(elapsedRealtime);
            return true;
        } catch (InterruptedException e) {
            throw new dy("Ad request cancelled.", -1);
        }
    }

    public final void mo874a() {
        int i;
        dy e;
        synchronized (this.f1203c) {
            gb.m2071a(3);
            cx cxVar = new cx(this.f1208j, this.f1209k.f1971a.mo938a(this.f1207i));
            ak akVar = null;
            long j = -1;
            try {
                fj eeVar;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Context context = this.f1207i;
                if (cxVar.f1167k.f1225e) {
                    gb.m2071a(3);
                    eeVar = new ee(context, cxVar, this);
                    fl.m1985a(eeVar.f1199e);
                } else {
                    gb.m2071a(3);
                    if (C0250h.m1002a(context) != 0) {
                        gb.m2069a("Failed to connect to remote ad request service.");
                        eeVar = null;
                    } else {
                        eeVar = new eg(context, cxVar, this);
                    }
                }
                synchronized (this.f1206h) {
                    this.f1210l = eeVar;
                    if (this.f1210l == null) {
                        throw new dy("Could not start the ad request service.", 0);
                    }
                }
                do {
                    if (!m1877b(elapsedRealtime)) {
                        throw new dy("Timed out waiting for ad response.", 2);
                    }
                } while (this.f1204d == null);
                synchronized (this.f1206h) {
                    this.f1210l = null;
                }
                if (this.f1204d.f1174e == -2 || this.f1204d.f1174e == -3) {
                    long j2;
                    ak akVar2;
                    JSONObject jSONObject;
                    JSONObject jSONObject2;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    try {
                        if (this.f1204d.f1174e != -3) {
                            if (TextUtils.isEmpty(this.f1204d.f1172c)) {
                                throw new dy("No fill from ad server.", 3);
                            } else if (this.f1204d.f1177h) {
                                this.f1213o = new bj(this.f1204d.f1172c);
                            }
                        }
                        ak a = cxVar.f1160d.f941h != null ? m1875a(cxVar) : null;
                        try {
                            if (this.f1204d.f1177h) {
                                synchronized (this.f1206h) {
                                    this.f1212n = new bg(this.f1207i, cxVar, this.f1205g, this.f1213o);
                                }
                                this.f1214p = this.f1212n.m1681a(elapsedRealtime);
                                switch (this.f1214p.f1081a) {
                                    case 0:
                                        j2 = elapsedRealtime2;
                                        i = -2;
                                        akVar2 = a;
                                        break;
                                    case 1:
                                        throw new dy("No fill from any mediation ad networks.", 3);
                                    default:
                                        throw new dy("Unexpected mediation result: " + this.f1214p.f1081a, 0);
                                }
                            } else if (this.f1204d.f1185p) {
                                int i2;
                                ak e2 = this.f1202b.m2096e();
                                if (e2.f938e) {
                                    i2 = this.f1207i.getResources().getDisplayMetrics().widthPixels;
                                    i = this.f1207i.getResources().getDisplayMetrics().heightPixels;
                                } else {
                                    i2 = e2.f940g;
                                    i = e2.f937d;
                                }
                                dz dzVar = new dz(this, this.f1202b, i2, i, (byte) 0);
                                fz.f1434a.post(new dw(this, dzVar));
                                m1876a(elapsedRealtime);
                                if (dzVar.m1892c()) {
                                    gb.m2071a(3);
                                    throw new dy("AdNetwork sent passback url", 3);
                                } else if (dzVar.m1893d()) {
                                    j2 = elapsedRealtime2;
                                    i = -2;
                                    akVar2 = a;
                                } else {
                                    throw new dy("AdNetwork timed out", 2);
                                }
                            } else {
                                fz.f1434a.post(new dv(this));
                                m1876a(elapsedRealtime);
                                j2 = elapsedRealtime2;
                                i = -2;
                                akVar2 = a;
                            }
                        } catch (dy e3) {
                            e = e3;
                            j = elapsedRealtime2;
                            akVar = a;
                            i = e.m1881a();
                            if (i != 3 || i == -1) {
                                e.getMessage();
                                gb.m2071a(4);
                            } else {
                                gb.m2069a(e.getMessage());
                            }
                            if (this.f1204d != null) {
                                this.f1204d = new cz(i);
                            } else {
                                this.f1204d = new cz(i, this.f1204d.f1180k);
                            }
                            fz.f1434a.post(new dt(this));
                            j2 = j;
                            akVar2 = akVar;
                            if (!TextUtils.isEmpty(this.f1204d.f1187r)) {
                                try {
                                    jSONObject = new JSONObject(this.f1204d.f1187r);
                                } catch (Exception e4) {
                                    gb.m2071a(6);
                                }
                                fz.f1434a.post(new du(this, new ez(cxVar.f1159c, this.f1202b, this.f1204d.f1173d, i, this.f1204d.f1175f, this.f1204d.f1179j, this.f1204d.f1181l, this.f1204d.f1180k, cxVar.f1165i, this.f1204d.f1177h, this.f1214p == null ? this.f1214p.f1082b : null, this.f1214p == null ? this.f1214p.f1083c : null, this.f1214p == null ? this.f1214p.f1084d : null, this.f1213o, this.f1214p == null ? this.f1214p.f1085e : null, this.f1204d.f1178i, akVar2, this.f1204d.f1176g, j2, this.f1204d.f1183n, this.f1204d.f1184o, jSONObject2)));
                            }
                            jSONObject2 = null;
                            if (this.f1214p == null) {
                            }
                            if (this.f1214p == null) {
                            }
                            if (this.f1214p == null) {
                            }
                            if (this.f1214p == null) {
                            }
                            fz.f1434a.post(new du(this, new ez(cxVar.f1159c, this.f1202b, this.f1204d.f1173d, i, this.f1204d.f1175f, this.f1204d.f1179j, this.f1204d.f1181l, this.f1204d.f1180k, cxVar.f1165i, this.f1204d.f1177h, this.f1214p == null ? this.f1214p.f1082b : null, this.f1214p == null ? this.f1214p.f1083c : null, this.f1214p == null ? this.f1214p.f1084d : null, this.f1213o, this.f1214p == null ? this.f1214p.f1085e : null, this.f1204d.f1178i, akVar2, this.f1204d.f1176g, j2, this.f1204d.f1183n, this.f1204d.f1184o, jSONObject2)));
                        }
                    } catch (JSONException e5) {
                        throw new dy("Could not parse mediation config: " + this.f1204d.f1172c, 0);
                    } catch (dy e6) {
                        e = e6;
                        j = elapsedRealtime2;
                        i = e.m1881a();
                        if (i != 3) {
                        }
                        e.getMessage();
                        gb.m2071a(4);
                        if (this.f1204d != null) {
                            this.f1204d = new cz(i, this.f1204d.f1180k);
                        } else {
                            this.f1204d = new cz(i);
                        }
                        fz.f1434a.post(new dt(this));
                        j2 = j;
                        akVar2 = akVar;
                        if (TextUtils.isEmpty(this.f1204d.f1187r)) {
                            jSONObject = new JSONObject(this.f1204d.f1187r);
                            if (this.f1214p == null) {
                            }
                            if (this.f1214p == null) {
                            }
                            if (this.f1214p == null) {
                            }
                            if (this.f1214p == null) {
                            }
                            fz.f1434a.post(new du(this, new ez(cxVar.f1159c, this.f1202b, this.f1204d.f1173d, i, this.f1204d.f1175f, this.f1204d.f1179j, this.f1204d.f1181l, this.f1204d.f1180k, cxVar.f1165i, this.f1204d.f1177h, this.f1214p == null ? this.f1214p.f1082b : null, this.f1214p == null ? this.f1214p.f1083c : null, this.f1214p == null ? this.f1214p.f1084d : null, this.f1213o, this.f1214p == null ? this.f1214p.f1085e : null, this.f1204d.f1178i, akVar2, this.f1204d.f1176g, j2, this.f1204d.f1183n, this.f1204d.f1184o, jSONObject2)));
                        }
                        jSONObject2 = null;
                        if (this.f1214p == null) {
                        }
                        if (this.f1214p == null) {
                        }
                        if (this.f1214p == null) {
                        }
                        if (this.f1214p == null) {
                        }
                        fz.f1434a.post(new du(this, new ez(cxVar.f1159c, this.f1202b, this.f1204d.f1173d, i, this.f1204d.f1175f, this.f1204d.f1179j, this.f1204d.f1181l, this.f1204d.f1180k, cxVar.f1165i, this.f1204d.f1177h, this.f1214p == null ? this.f1214p.f1082b : null, this.f1214p == null ? this.f1214p.f1083c : null, this.f1214p == null ? this.f1214p.f1084d : null, this.f1213o, this.f1214p == null ? this.f1214p.f1085e : null, this.f1204d.f1178i, akVar2, this.f1204d.f1176g, j2, this.f1204d.f1183n, this.f1204d.f1184o, jSONObject2)));
                    }
                    if (TextUtils.isEmpty(this.f1204d.f1187r)) {
                        jSONObject = new JSONObject(this.f1204d.f1187r);
                        if (this.f1214p == null) {
                        }
                        if (this.f1214p == null) {
                        }
                        if (this.f1214p == null) {
                        }
                        if (this.f1214p == null) {
                        }
                        fz.f1434a.post(new du(this, new ez(cxVar.f1159c, this.f1202b, this.f1204d.f1173d, i, this.f1204d.f1175f, this.f1204d.f1179j, this.f1204d.f1181l, this.f1204d.f1180k, cxVar.f1165i, this.f1204d.f1177h, this.f1214p == null ? this.f1214p.f1082b : null, this.f1214p == null ? this.f1214p.f1083c : null, this.f1214p == null ? this.f1214p.f1084d : null, this.f1213o, this.f1214p == null ? this.f1214p.f1085e : null, this.f1204d.f1178i, akVar2, this.f1204d.f1176g, j2, this.f1204d.f1183n, this.f1204d.f1184o, jSONObject2)));
                    }
                    jSONObject2 = null;
                    if (this.f1214p == null) {
                    }
                    if (this.f1214p == null) {
                    }
                    if (this.f1214p == null) {
                    }
                    if (this.f1214p == null) {
                    }
                    fz.f1434a.post(new du(this, new ez(cxVar.f1159c, this.f1202b, this.f1204d.f1173d, i, this.f1204d.f1175f, this.f1204d.f1179j, this.f1204d.f1181l, this.f1204d.f1180k, cxVar.f1165i, this.f1204d.f1177h, this.f1214p == null ? this.f1214p.f1082b : null, this.f1214p == null ? this.f1214p.f1083c : null, this.f1214p == null ? this.f1214p.f1084d : null, this.f1213o, this.f1214p == null ? this.f1214p.f1085e : null, this.f1204d.f1178i, akVar2, this.f1204d.f1176g, j2, this.f1204d.f1183n, this.f1204d.f1184o, jSONObject2)));
                } else {
                    throw new dy("There was a problem getting an ad response. ErrorCode: " + this.f1204d.f1174e, this.f1204d.f1174e);
                }
            } catch (dy e7) {
                e = e7;
            }
        }
    }

    public final void mo875a(cz czVar) {
        synchronized (this.f1203c) {
            gb.m2071a(3);
            this.f1204d = czVar;
            this.f1203c.notify();
        }
    }

    public final void mo867a(ge geVar) {
        synchronized (this.f1203c) {
            gb.m2071a(3);
            this.f1211m = true;
            this.f1203c.notify();
        }
    }

    public final void b_() {
        synchronized (this.f1206h) {
            if (this.f1210l != null) {
                this.f1210l.m1873e();
            }
            this.f1202b.stopLoading();
            fo.m1996a(this.f1202b);
            if (this.f1212n != null) {
                bg bgVar = this.f1212n;
                synchronized (bgVar.f1041a) {
                    bgVar.f1042b = true;
                    if (bgVar.f1043c != null) {
                        bm bmVar = bgVar.f1043c;
                        synchronized (bmVar.f1072e) {
                            try {
                                if (bmVar.f1074g != null) {
                                    bmVar.f1074g.mo839c();
                                }
                            } catch (Throwable e) {
                                gb.m2070a("Could not destroy mediation adapter.", e);
                            }
                            bmVar.f1075h = -1;
                            bmVar.f1072e.notify();
                        }
                    }
                }
            }
        }
    }
}
