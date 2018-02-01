package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.p007a.C0207q;
import com.google.android.gms.p007a.C0208s;

public final class cy extends C0208s {
    private static final cy f1169a = new cy();

    private cy() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static db m1842a(Activity activity) {
        try {
            Intent intent = activity.getIntent();
            if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
                throw new da("Ad overlay requires the useClientJar flag in intent extras.");
            } else if (!intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false)) {
                return f1169a.m1843b(activity);
            } else {
                gb.m2071a(3);
                return new cl(activity);
            }
        } catch (da e) {
            gb.m2069a(e.getMessage());
            return null;
        }
    }

    private db m1843b(Activity activity) {
        try {
            return dc.m1798a(((de) m865a((Context) activity)).mo869a(C0207q.m863a((Object) activity)));
        } catch (Throwable e) {
            gb.m2070a("Could not create remote AdOverlay.", e);
            return null;
        } catch (Throwable e2) {
            gb.m2070a("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    protected final /* synthetic */ Object mo868a(IBinder iBinder) {
        return df.m1855a(iBinder);
    }
}
