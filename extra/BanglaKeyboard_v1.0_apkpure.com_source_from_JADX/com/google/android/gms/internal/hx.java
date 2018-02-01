package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

public final class hx implements OnClickListener {
    private final Activity f1653a;
    private final Intent f1654b;
    private final int f1655c = -1;

    public hx(Activity activity, Intent intent) {
        this.f1653a = activity;
        this.f1654b = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            if (this.f1654b != null) {
                this.f1653a.startActivityForResult(this.f1654b, this.f1655c);
            }
            dialogInterface.dismiss();
        } catch (ActivityNotFoundException e) {
        }
    }
}
