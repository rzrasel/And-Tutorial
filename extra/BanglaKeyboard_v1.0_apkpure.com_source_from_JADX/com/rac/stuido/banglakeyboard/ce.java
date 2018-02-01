package com.rac.stuido.banglakeyboard;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;

final class ce implements DownloadListener {
    final /* synthetic */ Website239800 f2796a;

    ce(Website239800 website239800) {
        this.f2796a = website239800;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse(str), str4);
        try {
            this.f2796a.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            be.m3944a(this.f2796a.f2560b.getContext(), str);
        }
    }
}
