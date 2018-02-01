package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.content.Context;

final class gy implements Runnable {
    final /* synthetic */ Context f6178a;
    private /* synthetic */ String f6179b;
    private /* synthetic */ boolean f6180c;
    private /* synthetic */ boolean f6181d;

    gy(Context context, String str, boolean z, boolean z2) {
        this.f6178a = context;
        this.f6179b = str;
        this.f6180c = z;
        this.f6181d = z2;
    }

    public final void run() {
        Builder builder = new Builder(this.f6178a);
        builder.setMessage(this.f6179b);
        if (this.f6180c) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.f6181d) {
            builder.setNeutralButton("Dismiss", null);
        } else {
            builder.setPositiveButton("Learn More", new gz(this));
            builder.setNegativeButton("Dismiss", null);
        }
        builder.create().show();
    }
}
