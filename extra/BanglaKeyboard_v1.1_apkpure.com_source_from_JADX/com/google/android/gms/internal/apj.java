package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@aqv
public final class apj extends aoy {
    protected als f5551h;
    final jf f5552i;
    boolean f5553j;
    private amc f5554k;
    private alk f5555l;
    private alm f5556m;
    private final aec f5557n;

    apj(Context context, ef efVar, amc com_google_android_gms_internal_amc, ape com_google_android_gms_internal_ape, aec com_google_android_gms_internal_aec, jf jfVar) {
        super(context, efVar, com_google_android_gms_internal_ape);
        this.f5554k = com_google_android_gms_internal_amc;
        this.f5556m = efVar.f5980c;
        this.f5557n = com_google_android_gms_internal_aec;
        this.f5552i = jfVar;
    }

    private static String m5031a(List<als> list) {
        String str = "";
        if (list == null) {
            return str.toString();
        }
        String str2 = str;
        for (als com_google_android_gms_internal_als : list) {
            if (!(com_google_android_gms_internal_als == null || com_google_android_gms_internal_als.f5342b == null || TextUtils.isEmpty(com_google_android_gms_internal_als.f5342b.f5283d))) {
                int i;
                String valueOf = String.valueOf(str2);
                String str3 = com_google_android_gms_internal_als.f5342b.f5283d;
                switch (com_google_android_gms_internal_als.f5341a) {
                    case -1:
                        i = 4;
                        break;
                    case 0:
                        i = 0;
                        break;
                    case 1:
                        i = 1;
                        break;
                    case 3:
                        i = 2;
                        break;
                    case 4:
                        i = 3;
                        break;
                    case 5:
                        i = 5;
                        break;
                    default:
                        i = 6;
                        break;
                }
                str = new StringBuilder(String.valueOf(str3).length() + 33).append(str3).append(".").append(i).append(".").append(com_google_android_gms_internal_als.f5347g).toString();
                str2 = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(str).append("_").toString();
            }
        }
        return str2.substring(0, Math.max(0, str2.length() - 1));
    }

    protected final ee mo2010a(int i) {
        zzaak com_google_android_gms_internal_zzaak = this.f.f5978a;
        return new ee(com_google_android_gms_internal_zzaak.f7613c, this.f5552i, this.g.f7657c, i, this.g.f7659e, this.g.f7663i, this.g.f7665k, this.g.f7664j, com_google_android_gms_internal_zzaak.f7619i, this.g.f7661g, this.f5551h != null ? this.f5551h.f5342b : null, this.f5551h != null ? this.f5551h.f5343c : null, this.f5551h != null ? this.f5551h.f5344d : AdMobAdapter.class.getName(), this.f5556m, this.f5551h != null ? this.f5551h.f5345e : null, this.g.f7662h, this.f.f5981d, this.g.f7660f, this.f.f5983f, this.g.f7667m, this.g.f7668n, this.f.f5985h, null, this.g.f7637A, this.g.f7638B, this.g.f7639C, this.f5556m != null ? this.f5556m.f5311n : false, this.g.f7641E, this.f5555l != null ? m5031a(this.f5555l.mo1892b()) : null, this.g.f7644H, this.g.f7648L, this.f.f5986i);
    }

    protected final void mo2011a(long j) {
        synchronized (this.d) {
            alk com_google_android_gms_internal_alv;
            if (this.f5556m.f5309l != -1) {
                com_google_android_gms_internal_alv = new alv(this.b, this.f.f5978a, this.f5554k, this.f5556m, this.g.f7673s, this.g.f7680z, this.g.f7646J, j, ((Long) zzbv.zzen().m4217a(ado.bk)).longValue());
            } else {
                long j2 = j;
                com_google_android_gms_internal_alv = new aly(this.b, this.f.f5978a, this.f5554k, this.f5556m, this.g.f7673s, this.g.f7680z, this.g.f7646J, j2, ((Long) zzbv.zzen().m4217a(ado.bk)).longValue(), this.f5557n);
            }
            this.f5555l = com_google_android_gms_internal_alv;
        }
        List arrayList = new ArrayList(this.f5556m.f5298a);
        boolean z = false;
        Bundle bundle = this.f.f5978a.f7613c.f7752m;
        String str = "com.google.ads.mediation.admob.AdMobAdapter";
        if (bundle != null) {
            bundle = bundle.getBundle(str);
            if (bundle != null) {
                z = bundle.getBoolean("_skipMediation");
            }
        }
        if (z) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (!((all) listIterator.next()).f5282c.contains(str)) {
                    listIterator.remove();
                }
            }
        }
        this.f5551h = this.f5555l.mo1890a(arrayList);
        switch (this.f5551h.f5341a) {
            case 0:
                if (this.f5551h.f5342b != null && this.f5551h.f5342b.f5292m != null) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    gb.f6131a.post(new apk(this, countDownLatch));
                    try {
                        countDownLatch.await(10, TimeUnit.SECONDS);
                        synchronized (this.d) {
                            if (!this.f5553j) {
                                throw new apc("View could not be prepared", 0);
                            } else if (this.f5552i.mo2174q()) {
                                throw new apc("Assets not loaded, web view is destroyed", 0);
                            }
                        }
                        return;
                    } catch (InterruptedException e) {
                        String valueOf = String.valueOf(e);
                        throw new apc(new StringBuilder(String.valueOf(valueOf).length() + 38).append("Interrupted while waiting for latch : ").append(valueOf).toString(), 0);
                    }
                }
                return;
            case 1:
                throw new apc("No fill from any mediation ad networks.", 3);
            default:
                throw new apc("Unexpected mediation result: " + this.f5551h.f5341a, 0);
        }
    }

    public final void mo1476b() {
        synchronized (this.d) {
            super.mo1476b();
            if (this.f5555l != null) {
                this.f5555l.mo1891a();
            }
        }
    }
}
