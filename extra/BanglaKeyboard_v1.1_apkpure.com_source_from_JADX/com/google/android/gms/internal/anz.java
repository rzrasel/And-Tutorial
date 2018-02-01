package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzbv;

final class anz implements OnClickListener {
    private /* synthetic */ String f5486a;
    private /* synthetic */ String f5487b;
    private /* synthetic */ any f5488c;

    anz(any com_google_android_gms_internal_any, String str, String str2) {
        this.f5488c = com_google_android_gms_internal_any;
        this.f5486a = str;
        this.f5487b = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f5488c.f5485b.getSystemService("download");
        try {
            String str = this.f5486a;
            String str2 = this.f5487b;
            Request request = new Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzbv.zzec().mo2096a(request);
            downloadManager.enqueue(request);
        } catch (IllegalStateException e) {
            this.f5488c.m4982a("Could not store picture.");
        }
    }
}
