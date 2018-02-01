package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class aoa implements OnClickListener {
    private /* synthetic */ any f5495a;

    aoa(any com_google_android_gms_internal_any) {
        this.f5495a = com_google_android_gms_internal_any;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5495a.m4982a("User canceled the download.");
    }
}
