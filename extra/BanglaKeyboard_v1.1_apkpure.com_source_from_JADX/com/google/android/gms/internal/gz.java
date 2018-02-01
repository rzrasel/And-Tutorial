package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzbv;

final class gz implements OnClickListener {
    private /* synthetic */ gy f6182a;

    gz(gy gyVar) {
        this.f6182a = gyVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbv.zzea();
        gb.m5447a(this.f6182a.f6178a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
