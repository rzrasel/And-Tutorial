package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public final class aoe extends aof implements ail {
    private final jf f5506a;
    private final Context f5507b;
    private final WindowManager f5508c;
    private final acz f5509d;
    private DisplayMetrics f5510e;
    private float f5511f;
    private int f5512g = -1;
    private int f5513h = -1;
    private int f5514i;
    private int f5515j = -1;
    private int f5516k = -1;
    private int f5517l = -1;
    private int f5518m = -1;

    public aoe(jf jfVar, Context context, acz com_google_android_gms_internal_acz) {
        super(jfVar);
        this.f5506a = jfVar;
        this.f5507b = context;
        this.f5509d = com_google_android_gms_internal_acz;
        this.f5508c = (WindowManager) context.getSystemService("window");
    }

    public final void m5004a(int i, int i2) {
        int i3;
        if (this.f5507b instanceof Activity) {
            zzbv.zzea();
            i3 = gb.m5481c((Activity) this.f5507b)[0];
        } else {
            i3 = 0;
        }
        if (this.f5506a.mo2162j() == null || !this.f5506a.mo2162j().f7761d) {
            aak.m4022a();
            this.f5517l = hz.m5623b(this.f5507b, this.f5506a.getWidth());
            aak.m4022a();
            this.f5518m = hz.m5623b(this.f5507b, this.f5506a.getHeight());
        }
        i3 = i2 - i3;
        int i4 = this.f5517l;
        try {
            this.f5451s.zzb("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i3).put("width", i4).put("height", this.f5518m));
        } catch (JSONException e) {
            id.m5372a(6);
        }
        jg k = this.f5506a.mo2163k();
        if (k.f6295i != null) {
            anv com_google_android_gms_internal_anv = k.f6295i;
            com_google_android_gms_internal_anv.f5464c = i;
            com_google_android_gms_internal_anv.f5465d = i2;
        }
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        int[] a;
        this.f5510e = new DisplayMetrics();
        Display defaultDisplay = this.f5508c.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f5510e);
        this.f5511f = this.f5510e.density;
        this.f5514i = defaultDisplay.getRotation();
        aak.m4022a();
        this.f5512g = hz.m5624b(this.f5510e, this.f5510e.widthPixels);
        aak.m4022a();
        this.f5513h = hz.m5624b(this.f5510e, this.f5510e.heightPixels);
        Activity e = this.f5506a.mo2157e();
        if (e == null || e.getWindow() == null) {
            this.f5515j = this.f5512g;
            this.f5516k = this.f5513h;
        } else {
            zzbv.zzea();
            a = gb.m5463a(e);
            aak.m4022a();
            this.f5515j = hz.m5624b(this.f5510e, a[0]);
            aak.m4022a();
            this.f5516k = hz.m5624b(this.f5510e, a[1]);
        }
        if (this.f5506a.mo2162j().f7761d) {
            this.f5517l = this.f5512g;
            this.f5518m = this.f5513h;
        } else {
            this.f5506a.measure(0, 0);
        }
        m4981a(this.f5512g, this.f5513h, this.f5515j, this.f5516k, this.f5511f, this.f5514i);
        aod com_google_android_gms_internal_aod = new aod();
        acz com_google_android_gms_internal_acz = this.f5509d;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        com_google_android_gms_internal_aod.f5502b = com_google_android_gms_internal_acz.m4186a(intent);
        com_google_android_gms_internal_acz = this.f5509d;
        intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        com_google_android_gms_internal_aod.f5501a = com_google_android_gms_internal_acz.m4186a(intent);
        com_google_android_gms_internal_aod.f5503c = this.f5509d.m4187b();
        com_google_android_gms_internal_aod.f5504d = this.f5509d.m4185a();
        com_google_android_gms_internal_aod.f5505e = true;
        this.f5506a.zzb("onDeviceFeaturesReceived", new aob(com_google_android_gms_internal_aod).m5000a());
        a = new int[2];
        this.f5506a.getLocationOnScreen(a);
        aak.m4022a();
        int b = hz.m5623b(this.f5507b, a[0]);
        aak.m4022a();
        m5004a(b, hz.m5623b(this.f5507b, a[1]));
        if (id.m5372a(2)) {
            id.m5372a(4);
        }
        try {
            this.f5451s.zzb("onReadyEventReceived", new JSONObject().put("js", this.f5506a.mo2169n().f7706a));
        } catch (JSONException e2) {
            id.m5372a(6);
        }
    }
}
