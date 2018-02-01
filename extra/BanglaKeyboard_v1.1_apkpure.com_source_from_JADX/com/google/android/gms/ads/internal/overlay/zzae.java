package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.google.android.gms.internal.aak;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.hz;

@aqv
public final class zzae extends FrameLayout implements OnClickListener {
    private final ImageButton f4164a;
    private final zzaj f4165b;

    public zzae(Context context, C1448c c1448c, zzaj com_google_android_gms_ads_internal_overlay_zzaj) {
        super(context);
        this.f4165b = com_google_android_gms_ads_internal_overlay_zzaj;
        setOnClickListener(this);
        this.f4164a = new ImageButton(context);
        this.f4164a.setImageResource(17301527);
        this.f4164a.setBackgroundColor(0);
        this.f4164a.setOnClickListener(this);
        ImageButton imageButton = this.f4164a;
        aak.m4022a();
        int a = hz.m5612a(context, c1448c.f4114a);
        aak.m4022a();
        int a2 = hz.m5612a(context, 0);
        aak.m4022a();
        int a3 = hz.m5612a(context, c1448c.f4115b);
        aak.m4022a();
        imageButton.setPadding(a, a2, a3, hz.m5612a(context, c1448c.f4117d));
        this.f4164a.setContentDescription("Interstitial close button");
        aak.m4022a();
        hz.m5612a(context, c1448c.f4118e);
        View view = this.f4164a;
        aak.m4022a();
        a2 = hz.m5612a(context, (c1448c.f4118e + c1448c.f4114a) + c1448c.f4115b);
        aak.m4022a();
        addView(view, new LayoutParams(a2, hz.m5612a(context, c1448c.f4118e + c1448c.f4117d), 17));
    }

    public final void onClick(View view) {
        if (this.f4165b != null) {
            this.f4165b.zzmm();
        }
    }

    public final void zza(boolean z, boolean z2) {
        if (!z2) {
            this.f4164a.setVisibility(0);
        } else if (z) {
            this.f4164a.setVisibility(4);
        } else {
            this.f4164a.setVisibility(8);
        }
    }
}
