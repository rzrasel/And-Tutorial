package com.orange.studio.banglatype;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.AsyncTask;
import android.preference.PreferenceManager;

public final class ag {

    static class C17021 extends AsyncTask<Void, Void, Void> {
        final /* synthetic */ Context f8127a;
        final /* synthetic */ boolean f8128b = true;

        C17021(Context context) {
            this.f8127a = context;
        }

        protected final /* synthetic */ Object doInBackground(Object[] objArr) {
            PreferenceManager.getDefaultSharedPreferences(this.f8127a).edit().putBoolean("launch_notice_shown", this.f8128b).commit();
            return null;
        }
    }

    static class C17032 implements OnClickListener {
        final /* synthetic */ Context f8129a;

        C17032(Context context) {
            this.f8129a = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            new C17021(this.f8129a).execute(new Void[0]);
            dialogInterface.dismiss();
        }
    }
}
