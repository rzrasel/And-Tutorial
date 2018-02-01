package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.gms.internal.je;

public final class C0239b extends DialogFragment {
    private Dialog f485a = null;
    private OnCancelListener f486b = null;

    public static C0239b m972a(Dialog dialog) {
        C0239b c0239b = new C0239b();
        Dialog dialog2 = (Dialog) je.m2474a((Object) dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c0239b.f485a = dialog2;
        return c0239b;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.f486b != null) {
            this.f486b.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return this.f485a;
    }

    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
