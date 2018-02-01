package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.C1543c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.p056a.C1401c;

@aqv
public final class zn {
    wc f7554a;
    boolean f7555b;

    public zn(Context context) {
        ado.m4219a(context);
        if (((Boolean) zzbv.zzen().m4217a(ado.cE)).booleanValue()) {
            try {
                this.f7554a = wd.m6899a(DynamiteModule.m3958a(context, DynamiteModule.f4669a, ModuleDescriptor.MODULE_ID).m3968a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
                C1401c.m3584a((Object) context);
                this.f7554a.mo2310a(C1401c.m3584a((Object) context), "GMA_SDK");
                this.f7555b = true;
                return;
            } catch (C1543c e) {
            } catch (RemoteException e2) {
            } catch (NullPointerException e3) {
            }
        } else {
            return;
        }
        es.m5373a();
    }

    public zn(Context context, String str) {
        ado.m4219a(context);
        try {
            this.f7554a = wd.m6899a(DynamiteModule.m3958a(context, DynamiteModule.f4669a, ModuleDescriptor.MODULE_ID).m3968a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
            C1401c.m3584a((Object) context);
            this.f7554a.mo2314b(C1401c.m3584a((Object) context), str);
            this.f7555b = true;
            return;
        } catch (C1543c e) {
        } catch (RemoteException e2) {
        } catch (NullPointerException e3) {
        }
        es.m5373a();
    }

    public final zo m7069a(byte[] bArr) {
        return new zo(this, bArr);
    }
}
