package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.internal.C1585l;
import com.google.android.gms.internal.ac;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.aec;
import com.google.android.gms.internal.agp;
import com.google.android.gms.internal.aha;
import com.google.android.gms.internal.akz;
import com.google.android.gms.internal.aln;
import com.google.android.gms.internal.alu;
import com.google.android.gms.internal.amc;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.aqy;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.eh;
import com.google.android.gms.internal.ei;
import com.google.android.gms.internal.ej;
import com.google.android.gms.internal.ek;
import com.google.android.gms.internal.el;
import com.google.android.gms.internal.em;
import com.google.android.gms.internal.en;
import com.google.android.gms.internal.eo;
import com.google.android.gms.internal.eq;
import com.google.android.gms.internal.fv;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.gf;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.lm;
import com.google.android.gms.internal.yd;
import com.google.android.gms.internal.zn;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzix;
import com.google.android.gms.internal.zzjb;
import com.google.android.gms.internal.zzle;
import com.google.android.gms.internal.zzot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public abstract class zzd extends zza implements zzw, zzbo, aln {
    private transient boolean f4342h;
    public final amc zzana;

    public zzd(Context context, zzjb com_google_android_gms_internal_zzjb, String str, amc com_google_android_gms_internal_amc, zzajk com_google_android_gms_internal_zzajk, zzv com_google_android_gms_ads_internal_zzv) {
        this(new zzbw(context, com_google_android_gms_internal_zzjb, str, com_google_android_gms_internal_zzajk), com_google_android_gms_internal_amc, com_google_android_gms_ads_internal_zzv);
    }

    private zzd(zzbw com_google_android_gms_ads_internal_zzbw, amc com_google_android_gms_internal_amc, zzv com_google_android_gms_ads_internal_zzv) {
        super(com_google_android_gms_ads_internal_zzbw, com_google_android_gms_ads_internal_zzv);
        this.zzana = com_google_android_gms_internal_amc;
        this.f4342h = false;
    }

    private final C1585l m3724a(zzix com_google_android_gms_internal_zzix, Bundle bundle, ei eiVar, int i) {
        PackageInfo b;
        int i2;
        ApplicationInfo applicationInfo = this.zzams.zzaie.getApplicationInfo();
        try {
            b = lm.m5976a(this.zzams.zzaie).m5975b(applicationInfo.packageName, 0);
        } catch (NameNotFoundException e) {
            b = null;
        }
        DisplayMetrics displayMetrics = this.zzams.zzaie.getResources().getDisplayMetrics();
        Bundle bundle2 = null;
        if (!(this.zzams.f4422c == null || this.zzams.f4422c.getParent() == null)) {
            int[] iArr = new int[2];
            this.zzams.f4422c.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            int width = this.zzams.f4422c.getWidth();
            int height = this.zzams.f4422c.getHeight();
            i2 = 0;
            if (this.zzams.f4422c.isShown() && i3 + width > 0 && i4 + height > 0 && i3 <= displayMetrics.widthPixels && i4 <= displayMetrics.heightPixels) {
                i2 = 1;
            }
            bundle2 = new Bundle(5);
            bundle2.putInt("x", i3);
            bundle2.putInt("y", i4);
            bundle2.putInt("width", width);
            bundle2.putInt("height", height);
            bundle2.putInt("visible", i2);
        }
        String c = zzbv.zzee().m5343c();
        this.zzams.zzatq = new eg(c, this.zzams.zzath);
        eg egVar = this.zzams.zzatq;
        synchronized (egVar.f5989c) {
            egVar.f5995i = SystemClock.elapsedRealtime();
            em d = egVar.f5987a.m5345d();
            long j = egVar.f5995i;
            synchronized (d.f6054f) {
                long l = zzbv.zzee().m5354l();
                long a = zzbv.zzeg().mo1669a();
                if (d.f6050b == -1) {
                    if (a - l > ((Long) zzbv.zzen().m4217a(ado.aw)).longValue()) {
                        d.f6052d = -1;
                    } else {
                        d.f6052d = zzbv.zzee().m5357o();
                    }
                    d.f6050b = j;
                    d.f6049a = d.f6050b;
                } else {
                    d.f6049a = j;
                }
                if (com_google_android_gms_internal_zzix == null || com_google_android_gms_internal_zzix.f7742c == null || com_google_android_gms_internal_zzix.f7742c.getInt("gw", 2) != 1) {
                    d.f6051c++;
                    d.f6052d++;
                    if (d.f6052d == 0) {
                        d.f6053e = 0;
                        zzbv.zzee().m5328a(a);
                    } else {
                        d.f6053e = a - zzbv.zzee().m5355m();
                    }
                }
            }
        }
        zzbv.zzea();
        String a2 = gb.m5436a(this.zzams.zzaie, this.zzams.f4422c, this.zzams.zzatn);
        long j2 = 0;
        if (this.zzams.f4426g != null) {
            try {
                j2 = this.zzams.f4426g.mo1686b();
            } catch (RemoteException e2) {
                id.m5370a("Cannot get correlation id, default to 0.");
            }
        }
        String uuid = UUID.randomUUID().toString();
        Bundle a3 = zzbv.zzee().m5325a(this.zzams.zzaie, (en) this, c);
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (i3 = 0; i3 < this.zzams.f4430k.size(); i3++) {
            String str = (String) this.zzams.f4430k.m1249b(i3);
            arrayList.add(str);
            if (this.zzams.f4429j.containsKey(str) && this.zzams.f4429j.get(str) != null) {
                arrayList2.add(str);
            }
        }
        Future a4 = fv.m5426a(fv.f6119a, new ag(this));
        Future a5 = fv.m5426a(fv.f6119a, new ah(this));
        String str2 = null;
        if (eiVar != null) {
            str2 = eiVar.f6004d;
        }
        String str3 = null;
        if (this.zzams.f4438s != null && this.zzams.f4438s.size() > 0) {
            i2 = 0;
            if (b != null) {
                i2 = b.versionCode;
            }
            if (i2 > zzbv.zzee().m5356n()) {
                zzbv.zzee().m5360r();
                zzbv.zzee().m5327a(i2);
            } else {
                JSONObject q = zzbv.zzee().m5359q();
                if (q != null) {
                    JSONArray optJSONArray = q.optJSONArray(this.zzams.zzath);
                    if (optJSONArray != null) {
                        str3 = optJSONArray.toString();
                    }
                }
            }
        }
        zzjb com_google_android_gms_internal_zzjb = this.zzams.zzatn;
        String str4 = this.zzams.zzath;
        String str5 = zzbv.zzee().f6017b;
        zzajk com_google_android_gms_internal_zzajk = this.zzams.zzatj;
        List list = this.zzams.f4438s;
        boolean f = zzbv.zzee().m5348f();
        int i5 = displayMetrics.widthPixels;
        int i6 = displayMetrics.heightPixels;
        float f2 = displayMetrics.density;
        List a6 = ado.m4218a();
        String str6 = this.zzams.f4420a;
        zzot com_google_android_gms_internal_zzot = this.zzams.f4431l;
        String zzff = this.zzams.zzff();
        zzbv.zzea();
        float d2 = gb.m5482d();
        zzbv.zzea();
        boolean e3 = gb.m5487e();
        zzbv.zzea();
        int i7 = gb.m5496i(this.zzams.zzaie);
        zzbv.zzea();
        int c2 = gb.m5476c(this.zzams.f4422c);
        boolean z = this.zzams.zzaie instanceof Activity;
        boolean k = zzbv.zzee().m5353k();
        ek ekVar = zzbv.zzee().f6023h;
        ekVar.m5363a();
        boolean z2 = ekVar.f6042a == el.f6046b;
        int size = zzbv.zzex().f5188a.size();
        zzbv.zzea();
        Bundle f3 = gb.m5491f();
        String a7 = zzbv.zzej().m5572a();
        zzle com_google_android_gms_internal_zzle = this.zzams.f4433n;
        boolean b2 = zzbv.zzej().m5574b();
        akz a8 = akz.m4669a();
        Bundle bundle3 = new Bundle();
        bundle3.putInt("ipl", a8.f5257a);
        bundle3.putInt("ipds", a8.f5258b);
        bundle3.putInt("ipde", a8.f5259c);
        bundle3.putInt("iph", a8.f5260d);
        bundle3.putInt("ipm", a8.f5261e);
        zzbv.zzee();
        boolean contains = this.zzams.zzaie.getSharedPreferences("admob", 0).getStringSet("never_pool_slots", Collections.emptySet()).contains(this.zzams.zzath);
        List list2 = this.zzams.f4435p;
        boolean a9 = lm.m5976a(this.zzams.zzaie).m5974a();
        ekVar = zzbv.zzee().f6023h;
        ekVar.m5363a();
        return new C1585l(bundle2, com_google_android_gms_internal_zzix, com_google_android_gms_internal_zzjb, str4, applicationInfo, b, c, str5, com_google_android_gms_internal_zzajk, a3, list, arrayList, bundle, f, i5, i6, f2, a2, j2, uuid, a6, str6, com_google_android_gms_internal_zzot, zzff, d2, e3, i7, c2, z, k, a4, str2, z2, size, f3, a7, com_google_android_gms_internal_zzle, b2, bundle3, contains, a5, list2, str3, arrayList2, i, a9, ekVar.f6042a == el.f6047c);
    }

    final boolean mo1588a(ee eeVar) {
        zzix com_google_android_gms_internal_zzix;
        boolean z = false;
        if (this.e != null) {
            com_google_android_gms_internal_zzix = this.e;
            this.e = null;
        } else {
            com_google_android_gms_internal_zzix = eeVar.f5952a;
            if (com_google_android_gms_internal_zzix.f7742c != null) {
                z = com_google_android_gms_internal_zzix.f7742c.getBoolean("_noRefresh", false);
            }
        }
        return zza(com_google_android_gms_internal_zzix, eeVar, z);
    }

    protected final boolean mo1589b(zzix com_google_android_gms_internal_zzix) {
        return super.mo1589b(com_google_android_gms_internal_zzix) && !this.f4342h;
    }

    protected boolean mo1637c() {
        zzbv.zzea();
        if (gb.m5458a(this.zzams.zzaie, this.zzams.zzaie.getPackageName(), "android.permission.INTERNET")) {
            zzbv.zzea();
            if (gb.m5457a(this.zzams.zzaie)) {
                return true;
            }
        }
        return false;
    }

    public final String getMediationAdapterClassName() {
        return this.zzams.zzato == null ? null : this.zzams.zzato.f5967p;
    }

    public void onAdClicked() {
        if (this.zzams.zzato == null) {
            id.m5370a("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (!(this.zzams.zzato.f5968q == null || this.zzams.zzato.f5968q.f5300c == null)) {
            zzbv.zzeu();
            alu.m4727a(this.zzams.zzaie, this.zzams.zzatj.f7706a, this.zzams.zzato, this.zzams.zzath, false, m3704a(this.zzams.zzato.f5968q.f5300c));
        }
        if (!(this.zzams.zzato.f5965n == null || this.zzams.zzato.f5965n.f5285f == null)) {
            zzbv.zzeu();
            alu.m4727a(this.zzams.zzaie, this.zzams.zzatj.f7706a, this.zzams.zzato, this.zzams.zzath, false, this.zzams.zzato.f5965n.f5285f);
        }
        super.onAdClicked();
    }

    public final void onPause() {
        this.f.m6920b(this.zzams.zzato);
    }

    public final void onResume() {
        this.f.m6921c(this.zzams.zzato);
    }

    public void pause() {
        C1516t.m3867b("pause must be called on the main UI thread.");
        if (!(this.zzams.zzato == null || this.zzams.zzato.f5953b == null || !this.zzams.zzfd())) {
            zzbv.zzec();
            gf.m5508a(this.zzams.zzato.f5953b);
        }
        if (!(this.zzams.zzato == null || this.zzams.zzato.f5966o == null)) {
            try {
                this.zzams.zzato.f5966o.mo1909d();
            } catch (RemoteException e) {
                id.m5370a("Could not pause mediation adapter.");
            }
        }
        this.f.m6920b(this.zzams.zzato);
        this.d.pause();
    }

    public final void recordImpression() {
        zza(this.zzams.zzato, false);
    }

    public void resume() {
        C1516t.m3867b("resume must be called on the main UI thread.");
        jf jfVar = null;
        if (!(this.zzams.zzato == null || this.zzams.zzato.f5953b == null)) {
            jfVar = this.zzams.zzato.f5953b;
        }
        if (jfVar != null && this.zzams.zzfd()) {
            zzbv.zzec();
            gf.m5509b(this.zzams.zzato.f5953b);
        }
        if (!(this.zzams.zzato == null || this.zzams.zzato.f5966o == null)) {
            try {
                this.zzams.zzato.f5966o.mo1910e();
            } catch (RemoteException e) {
                id.m5370a("Could not resume mediation adapter.");
            }
        }
        if (jfVar == null || !jfVar.mo2182t()) {
            this.d.resume();
        }
        this.f.m6921c(this.zzams.zzato);
    }

    public void showInterstitial() {
        throw new IllegalStateException("showInterstitial is not supported for current ad type");
    }

    public final void zza(agp com_google_android_gms_internal_agp, String str) {
        aha com_google_android_gms_internal_aha = null;
        if (com_google_android_gms_internal_agp != null) {
            try {
                Object l = com_google_android_gms_internal_agp.mo1768l();
            } catch (Throwable e) {
                id.m5371a("Unable to call onCustomClick.", e);
                return;
            }
        }
        l = null;
        if (!(this.zzams.f4429j == null || l == null)) {
            com_google_android_gms_internal_aha = (aha) this.zzams.f4429j.get(l);
        }
        if (com_google_android_gms_internal_aha == null) {
            id.m5370a("Mediation adapter invoked onCustomClick but no listeners were set.");
        } else {
            com_google_android_gms_internal_aha.mo1862a(com_google_android_gms_internal_agp, str);
        }
    }

    public void zza(ee eeVar, boolean z) {
        if (eeVar == null) {
            id.m5370a("Ad state was null when trying to ping impression URLs.");
            return;
        }
        if (eeVar == null) {
            id.m5370a("Ad state was null when trying to ping impression URLs.");
        } else {
            id.m5372a(3);
            if (this.zzams.zzatq != null) {
                eg egVar = this.zzams.zzatq;
                synchronized (egVar.f5989c) {
                    if (egVar.f5996j != -1 && egVar.f5991e == -1) {
                        egVar.f5991e = SystemClock.elapsedRealtime();
                        egVar.f5987a.m5335a(egVar);
                    }
                    em d = egVar.f5987a.m5345d();
                    synchronized (d.f6054f) {
                        d.f6056h++;
                    }
                }
            }
            if (!(eeVar.f5956e == null || eeVar.f5944C)) {
                zzbv.zzea();
                gb.m5449a(this.zzams.zzaie, this.zzams.zzatj.f7706a, m3704a(eeVar.f5956e));
                eeVar.f5944C = true;
            }
        }
        if (!(eeVar.f5968q == null || eeVar.f5968q.f5301d == null)) {
            zzbv.zzeu();
            alu.m4727a(this.zzams.zzaie, this.zzams.zzatj.f7706a, eeVar, this.zzams.zzath, z, m3704a(eeVar.f5968q.f5301d));
        }
        if (eeVar.f5965n != null && eeVar.f5965n.f5286g != null) {
            zzbv.zzeu();
            alu.m4727a(this.zzams.zzaie, this.zzams.zzatj.f7706a, eeVar, this.zzams.zzath, z, eeVar.f5965n.f5286g);
        }
    }

    public boolean zza(ee eeVar, ee eeVar2) {
        int i;
        int i2 = 0;
        if (!(eeVar == null || eeVar.f5969r == null)) {
            eeVar.f5969r.m4699a(null);
        }
        if (eeVar2.f5969r != null) {
            eeVar2.f5969r.m4699a((aln) this);
        }
        if (eeVar2.f5968q != null) {
            i = eeVar2.f5968q.f5313p;
            i2 = eeVar2.f5968q.f5314q;
        } else {
            i = 0;
        }
        eo eoVar = this.zzams.zzauh;
        synchronized (eoVar.f6058a) {
            eoVar.f6059b = i;
            eoVar.f6060c = i2;
            ej ejVar = eoVar.f6061d;
            String str = eoVar.f6062e;
            synchronized (ejVar.f6016a) {
                ejVar.f6020e.put(str, eoVar);
            }
        }
        return true;
    }

    public final boolean zza(C1585l c1585l, aec com_google_android_gms_internal_aec) {
        this.a = com_google_android_gms_internal_aec;
        com_google_android_gms_internal_aec.m4235a("seq_num", c1585l.f6508g);
        com_google_android_gms_internal_aec.m4235a("request_id", c1585l.f6523v);
        com_google_android_gms_internal_aec.m4235a("session_id", c1585l.f6509h);
        if (c1585l.f6507f != null) {
            com_google_android_gms_internal_aec.m4235a("app_version", String.valueOf(c1585l.f6507f.versionCode));
        }
        zzbw com_google_android_gms_ads_internal_zzbw = this.zzams;
        zzbv.zzdw();
        Context context = this.zzams.zzaie;
        zn znVar = this.g.zzans;
        eq acVar = c1585l.f6503b.f7742c.getBundle("sdk_less_server_data") != null ? new ac(context, c1585l, this, znVar) : new aqy(context, c1585l, this, znVar);
        acVar.m3624h();
        com_google_android_gms_ads_internal_zzbw.zzatl = acVar;
        return true;
    }

    public boolean zza(zzix com_google_android_gms_internal_zzix, aec com_google_android_gms_internal_aec) {
        return zza(com_google_android_gms_internal_zzix, com_google_android_gms_internal_aec, 1);
    }

    public final boolean zza(zzix com_google_android_gms_internal_zzix, aec com_google_android_gms_internal_aec, int i) {
        if (!mo1637c()) {
            return false;
        }
        ei p;
        zzbv.zzea();
        yd a = zzbv.zzee().m5326a(this.zzams.zzaie);
        Bundle a2 = a == null ? null : gb.m5431a(a);
        this.d.cancel();
        this.zzams.zzauj = 0;
        if (((Boolean) zzbv.zzen().m4217a(ado.cb)).booleanValue()) {
            p = zzbv.zzee().m5358p();
            zzbv.zzeh().m3713a(this.zzams.zzaie, this.zzams.zzatj, false, p, p.f6003c, this.zzams.zzath, null);
        } else {
            p = null;
        }
        return zza(m3724a(com_google_android_gms_internal_zzix, a2, p, i), com_google_android_gms_internal_aec);
    }

    public boolean zza(zzix com_google_android_gms_internal_zzix, ee eeVar, boolean z) {
        if (!z && this.zzams.zzfd()) {
            if (eeVar.f5959h > 0) {
                this.d.zza(com_google_android_gms_internal_zzix, eeVar.f5959h);
            } else if (eeVar.f5968q != null && eeVar.f5968q.f5306i > 0) {
                this.d.zza(com_google_android_gms_internal_zzix, eeVar.f5968q.f5306i);
            } else if (!eeVar.f5964m && eeVar.f5955d == 2) {
                this.d.zzg(com_google_android_gms_internal_zzix);
            }
        }
        return this.d.zzdp();
    }

    public final void zzb(ee eeVar) {
        super.zzb(eeVar);
        if (eeVar.f5965n != null) {
            id.m5372a(3);
            if (this.zzams.f4422c != null) {
                this.zzams.f4422c.zzfj();
            }
            id.m5372a(3);
            zzbv.zzeu();
            alu.m4727a(this.zzams.zzaie, this.zzams.zzatj.f7706a, eeVar, this.zzams.zzath, false, eeVar.f5965n.f5288i);
            if (!(eeVar.f5968q == null || eeVar.f5968q.f5303f == null || eeVar.f5968q.f5303f.size() <= 0)) {
                id.m5372a(3);
                zzbv.zzea();
                gb.m5450a(this.zzams.zzaie, eeVar.f5968q.f5303f);
            }
        } else {
            id.m5372a(3);
            if (this.zzams.f4422c != null) {
                this.zzams.f4422c.zzfi();
            }
        }
        if (eeVar.f5955d == 3 && eeVar.f5968q != null && eeVar.f5968q.f5302e != null) {
            id.m5372a(3);
            zzbv.zzeu();
            alu.m4727a(this.zzams.zzaie, this.zzams.zzatj.f7706a, eeVar, this.zzams.zzath, false, eeVar.f5968q.f5302e);
        }
    }

    public void zzbz() {
        this.f4342h = false;
        zzbo();
        eg egVar = this.zzams.zzatq;
        synchronized (egVar.f5989c) {
            if (!(egVar.f5996j == -1 || egVar.f5988b.isEmpty())) {
                eh ehVar = (eh) egVar.f5988b.getLast();
                if (ehVar.f6000b == -1) {
                    ehVar.f6000b = SystemClock.elapsedRealtime();
                    egVar.f5987a.m5335a(egVar);
                }
            }
        }
    }

    public void zzca() {
        this.f4342h = true;
        zzbq();
    }

    public void zzcb() {
        onAdClicked();
    }

    public final void zzcc() {
        zzbz();
    }

    public final void zzcd() {
        zzbp();
    }

    public final void zzce() {
        zzca();
    }

    public final void zzcf() {
        if (this.zzams.zzato != null) {
            String str = this.zzams.zzato.f5967p;
            id.m5370a(new StringBuilder(String.valueOf(str).length() + 74).append("Mediation adapter ").append(str).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        zza(this.zzams.zzato, true);
        mo1609a();
    }

    public void zzcg() {
        recordImpression();
    }

    public final String zzch() {
        if (this.zzams.zzato == null) {
            return null;
        }
        String str = this.zzams.zzato.f5967p;
        Object obj = ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) ? 1 : null;
        if (obj == null || this.zzams.zzato.f5965n == null) {
            return str;
        }
        try {
            return new JSONObject(this.zzams.zzato.f5965n.f5289j).getString("class_name");
        } catch (JSONException e) {
            return str;
        } catch (NullPointerException e2) {
            return str;
        }
    }

    public final void zzci() {
        zzbv.zzea();
        gb.m5451a(new ai(this));
    }

    public final void zzcj() {
        zzbv.zzea();
        gb.m5451a(new aj(this));
    }

    public final void zze(String str, String str2) {
        onAppEvent(str, str2);
    }
}
