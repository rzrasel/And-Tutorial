package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.List;

@aqv
public final class gq {
    final Context f6148a;
    public String f6149b;
    public String f6150c;
    public String f6151d;
    private final float f6152e;
    private float f6153f;
    private float f6154g;
    private float f6155h;
    private int f6156i;

    public gq(Context context) {
        this.f6156i = 0;
        this.f6148a = context;
        this.f6152e = context.getResources().getDisplayMetrics().density;
    }

    public gq(Context context, String str) {
        this(context);
        this.f6149b = str;
    }

    private static int m5561a(List<String> list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    private final void m5562a(int i, float f, float f2) {
        if (i == 0) {
            this.f6156i = 0;
            this.f6153f = f;
            this.f6154g = f2;
            this.f6155h = f2;
        } else if (this.f6156i == -1) {
        } else {
            if (i == 2) {
                if (f2 > this.f6154g) {
                    this.f6154g = f2;
                } else if (f2 < this.f6155h) {
                    this.f6155h = f2;
                }
                if (this.f6154g - this.f6155h > 30.0f * this.f6152e) {
                    this.f6156i = -1;
                    return;
                }
                if (this.f6156i == 0 || this.f6156i == 2) {
                    if (f - this.f6153f >= 50.0f * this.f6152e) {
                        this.f6153f = f;
                        this.f6156i++;
                    }
                } else if ((this.f6156i == 1 || this.f6156i == 3) && f - this.f6153f <= -50.0f * this.f6152e) {
                    this.f6153f = f;
                    this.f6156i++;
                }
                if (this.f6156i == 1 || this.f6156i == 3) {
                    if (f > this.f6153f) {
                        this.f6153f = f;
                    }
                } else if (this.f6156i == 2 && f < this.f6153f) {
                    this.f6153f = f;
                }
            } else if (i == 1 && this.f6156i == 4) {
                m5563a();
            }
        }
    }

    public final void m5563a() {
        if (!((Boolean) zzbv.zzen().m4217a(ado.cu)).booleanValue()) {
            if (!((Boolean) zzbv.zzen().m4217a(ado.ct)).booleanValue()) {
                m5565b();
                return;
            }
        }
        if (this.f6148a instanceof Activity) {
            List arrayList = new ArrayList();
            int a = m5561a(arrayList, "Ad Information", true);
            int a2 = m5561a(arrayList, "Creative Preview", ((Boolean) zzbv.zzen().m4217a(ado.ct)).booleanValue());
            int a3 = m5561a(arrayList, "Troubleshooting", ((Boolean) zzbv.zzen().m4217a(ado.cu)).booleanValue());
            Builder builder = new Builder(this.f6148a, zzbv.zzec().mo2106e());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new gr(this, a, a2, a3));
            builder.create().show();
            return;
        }
        id.m5372a(4);
    }

    public final void m5564a(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i = 0; i < historySize; i++) {
            m5562a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i));
        }
        m5562a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m5565b() {
        /*
        r6 = this;
        r0 = r6.f6148a;
        r0 = r0 instanceof android.app.Activity;
        if (r0 != 0) goto L_0x000b;
    L_0x0006:
        r0 = 4;
        com.google.android.gms.internal.id.m5372a(r0);
    L_0x000a:
        return;
    L_0x000b:
        r0 = r6.f6149b;
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x009c;
    L_0x0013:
        r1 = "\\+";
        r2 = "%20";
        r0 = r0.replaceAll(r1, r2);
        r1 = new android.net.Uri$Builder;
        r1.<init>();
        r0 = r1.encodedQuery(r0);
        r0 = r0.build();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        com.google.android.gms.ads.internal.zzbv.zzea();
        r2 = com.google.android.gms.internal.gb.m5442a(r0);
        r0 = r2.keySet();
        r3 = r0.iterator();
    L_0x003c:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0062;
    L_0x0042:
        r0 = r3.next();
        r0 = (java.lang.String) r0;
        r4 = r1.append(r0);
        r5 = " = ";
        r4 = r4.append(r5);
        r0 = r2.get(r0);
        r0 = (java.lang.String) r0;
        r0 = r4.append(r0);
        r4 = "\n\n";
        r0.append(r4);
        goto L_0x003c;
    L_0x0062:
        r0 = r1.toString();
        r0 = r0.trim();
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x009c;
    L_0x0070:
        r1 = new android.app.AlertDialog$Builder;
        r2 = r6.f6148a;
        r1.<init>(r2);
        r1.setMessage(r0);
        r2 = "Ad Information";
        r1.setTitle(r2);
        r2 = "Share";
        r3 = new com.google.android.gms.internal.gs;
        r3.<init>(r6, r0);
        r1.setPositiveButton(r2, r3);
        r0 = "Close";
        r2 = new com.google.android.gms.internal.gt;
        r2.<init>();
        r1.setNegativeButton(r0, r2);
        r0 = r1.create();
        r0.show();
        goto L_0x000a;
    L_0x009c:
        r0 = "No debug information";
        goto L_0x0070;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gq.b():void");
    }
}
