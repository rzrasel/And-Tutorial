package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C0247f;
import com.google.android.gms.common.C0250h;
import com.google.android.gms.p007a.C0201k;
import com.google.android.gms.p007a.C0207q;
import com.google.android.gms.p007a.C0208s;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public final class mi extends C0208s {
    private static mi f1949a;

    protected mi() {
        super("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl");
    }

    public static lx m2615a(Activity activity, C0201k c0201k, WalletFragmentOptions walletFragmentOptions, mc mcVar) {
        int a = C0250h.m1002a((Context) activity);
        if (a != 0) {
            throw new C0247f(a);
        }
        try {
            if (f1949a == null) {
                f1949a = new mi();
            }
            return ((mf) f1949a.m865a((Context) activity)).mo963a(C0207q.m863a((Object) activity), c0201k, walletFragmentOptions, mcVar);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    protected final /* synthetic */ Object mo868a(IBinder iBinder) {
        return mg.m2613a(iBinder);
    }
}
