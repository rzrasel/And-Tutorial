package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.provider.CalendarContract.Events;
import com.google.android.gms.ads.internal.zzbv;

final class ant implements OnClickListener {
    private /* synthetic */ ans f5459a;

    ant(ans com_google_android_gms_internal_ans) {
        this.f5459a = com_google_android_gms_internal_ans;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ans com_google_android_gms_internal_ans = this.f5459a;
        Intent data = new Intent("android.intent.action.EDIT").setData(Events.CONTENT_URI);
        data.putExtra("title", com_google_android_gms_internal_ans.f5453b);
        data.putExtra("eventLocation", com_google_android_gms_internal_ans.f5457f);
        data.putExtra("description", com_google_android_gms_internal_ans.f5456e);
        if (com_google_android_gms_internal_ans.f5454c > -1) {
            data.putExtra("beginTime", com_google_android_gms_internal_ans.f5454c);
        }
        if (com_google_android_gms_internal_ans.f5455d > -1) {
            data.putExtra("endTime", com_google_android_gms_internal_ans.f5455d);
        }
        data.setFlags(268435456);
        zzbv.zzea();
        gb.m5446a(this.f5459a.f5452a, data);
    }
}
