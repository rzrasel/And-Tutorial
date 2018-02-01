package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.p007a.C0207q;
import com.google.android.gms.p007a.C0208s;
import com.google.android.gms.p007a.C0209t;

public final class jf extends C0208s {
    private static final jf f1847a = new jf();

    private jf() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View m2480a(Context context, int i, int i2) {
        return f1847a.m2481b(context, i, i2);
    }

    private View m2481b(Context context, int i, int i2) {
        try {
            return (View) C0207q.m864a(((iy) m865a(context)).mo931a(C0207q.m863a((Object) context), i, i2));
        } catch (Throwable e) {
            throw new C0209t("Could not get button with size " + i + " and color " + i2, e);
        }
    }

    public final /* synthetic */ Object mo868a(IBinder iBinder) {
        return iz.m2467a(iBinder);
    }
}
