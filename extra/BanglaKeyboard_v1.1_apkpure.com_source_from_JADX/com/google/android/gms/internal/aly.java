package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

@aqv
public final class aly implements alk {
    private final zzaak f5366a;
    private final amc f5367b;
    private final Context f5368c;
    private final Object f5369d = new Object();
    private final alm f5370e;
    private final boolean f5371f;
    private final long f5372g;
    private final long f5373h;
    private final aec f5374i;
    private final boolean f5375j;
    private final String f5376k;
    private boolean f5377l = false;
    private alp f5378m;
    private List<als> f5379n = new ArrayList();

    public aly(Context context, zzaak com_google_android_gms_internal_zzaak, amc com_google_android_gms_internal_amc, alm com_google_android_gms_internal_alm, boolean z, boolean z2, String str, long j, long j2, aec com_google_android_gms_internal_aec) {
        this.f5368c = context;
        this.f5366a = com_google_android_gms_internal_zzaak;
        this.f5367b = com_google_android_gms_internal_amc;
        this.f5370e = com_google_android_gms_internal_alm;
        this.f5371f = z;
        this.f5375j = z2;
        this.f5376k = str;
        this.f5372g = j;
        this.f5373h = j2;
        this.f5374i = com_google_android_gms_internal_aec;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.als mo1890a(java.util.List<com.google.android.gms.internal.all> r24) {
        /*
        r23 = this;
        r2 = 3;
        com.google.android.gms.internal.id.m5372a(r2);
        r17 = new java.util.ArrayList;
        r17.<init>();
        r0 = r23;
        r2 = r0.f5374i;
        r18 = r2.m4233a();
        r0 = r23;
        r2 = r0.f5366a;
        r2 = r2.f7614d;
        r3 = 2;
        r3 = new int[r3];
        r4 = r2.f7764g;
        if (r4 == 0) goto L_0x0191;
    L_0x001e:
        com.google.android.gms.ads.internal.zzbv.zzeu();
        r0 = r23;
        r4 = r0.f5376k;
        r4 = com.google.android.gms.internal.alu.m4728a(r4, r3);
        if (r4 == 0) goto L_0x0191;
    L_0x002b:
        r4 = 0;
        r4 = r3[r4];
        r5 = 1;
        r5 = r3[r5];
        r6 = r2.f7764g;
        r7 = r6.length;
        r3 = 0;
    L_0x0035:
        if (r3 >= r7) goto L_0x0191;
    L_0x0037:
        r9 = r6[r3];
        r8 = r9.f7762e;
        if (r4 != r8) goto L_0x0095;
    L_0x003d:
        r8 = r9.f7759b;
        if (r5 != r8) goto L_0x0095;
    L_0x0041:
        r19 = r24.iterator();
    L_0x0045:
        r2 = r19.hasNext();
        if (r2 == 0) goto L_0x0172;
    L_0x004b:
        r7 = r19.next();
        r7 = (com.google.android.gms.internal.all) r7;
        r2 = "Trying mediation network: ";
        r3 = r7.f5281b;
        r3 = java.lang.String.valueOf(r3);
        r4 = r3.length();
        if (r4 == 0) goto L_0x0098;
    L_0x005f:
        r2.concat(r3);
    L_0x0062:
        r2 = 4;
        com.google.android.gms.internal.id.m5372a(r2);
        r2 = r7.f5282c;
        r20 = r2.iterator();
    L_0x006c:
        r2 = r20.hasNext();
        if (r2 == 0) goto L_0x0045;
    L_0x0072:
        r4 = r20.next();
        r4 = (java.lang.String) r4;
        r0 = r23;
        r2 = r0.f5374i;
        r21 = r2.m4233a();
        r0 = r23;
        r0 = r0.f5369d;
        r22 = r0;
        monitor-enter(r22);
        r0 = r23;
        r2 = r0.f5377l;	 Catch:{ all -> 0x0149 }
        if (r2 == 0) goto L_0x009e;
    L_0x008d:
        r2 = new com.google.android.gms.internal.als;	 Catch:{ all -> 0x0149 }
        r3 = -1;
        r2.<init>(r3);	 Catch:{ all -> 0x0149 }
        monitor-exit(r22);	 Catch:{ all -> 0x0149 }
    L_0x0094:
        return r2;
    L_0x0095:
        r3 = r3 + 1;
        goto L_0x0035;
    L_0x0098:
        r3 = new java.lang.String;
        r3.<init>(r2);
        goto L_0x0062;
    L_0x009e:
        r2 = new com.google.android.gms.internal.alp;	 Catch:{ all -> 0x0149 }
        r0 = r23;
        r3 = r0.f5368c;	 Catch:{ all -> 0x0149 }
        r0 = r23;
        r5 = r0.f5367b;	 Catch:{ all -> 0x0149 }
        r0 = r23;
        r6 = r0.f5370e;	 Catch:{ all -> 0x0149 }
        r0 = r23;
        r8 = r0.f5366a;	 Catch:{ all -> 0x0149 }
        r8 = r8.f7613c;	 Catch:{ all -> 0x0149 }
        r0 = r23;
        r10 = r0.f5366a;	 Catch:{ all -> 0x0149 }
        r10 = r10.f7621k;	 Catch:{ all -> 0x0149 }
        r0 = r23;
        r11 = r0.f5371f;	 Catch:{ all -> 0x0149 }
        r0 = r23;
        r12 = r0.f5375j;	 Catch:{ all -> 0x0149 }
        r0 = r23;
        r13 = r0.f5366a;	 Catch:{ all -> 0x0149 }
        r13 = r13.f7635y;	 Catch:{ all -> 0x0149 }
        r0 = r23;
        r14 = r0.f5366a;	 Catch:{ all -> 0x0149 }
        r14 = r14.f7624n;	 Catch:{ all -> 0x0149 }
        r0 = r23;
        r15 = r0.f5366a;	 Catch:{ all -> 0x0149 }
        r15 = r15.f7636z;	 Catch:{ all -> 0x0149 }
        r0 = r23;
        r0 = r0.f5366a;	 Catch:{ all -> 0x0149 }
        r16 = r0;
        r0 = r16;
        r0 = r0.f7608X;	 Catch:{ all -> 0x0149 }
        r16 = r0;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);	 Catch:{ all -> 0x0149 }
        r0 = r23;
        r0.f5378m = r2;	 Catch:{ all -> 0x0149 }
        monitor-exit(r22);	 Catch:{ all -> 0x0149 }
        r0 = r23;
        r2 = r0.f5378m;
        r0 = r23;
        r10 = r0.f5372g;
        r0 = r23;
        r12 = r0.f5373h;
        r2 = r2.m4716a(r10, r12);
        r0 = r23;
        r3 = r0.f5379n;
        r3.add(r2);
        r3 = r2.f5341a;
        if (r3 != 0) goto L_0x014c;
    L_0x0101:
        r3 = 3;
        com.google.android.gms.internal.id.m5372a(r3);
        r0 = r23;
        r3 = r0.f5374i;
        r5 = "mediation_network_succeed";
        r3.m4235a(r5, r4);
        r3 = r17.isEmpty();
        if (r3 != 0) goto L_0x0125;
    L_0x0114:
        r0 = r23;
        r3 = r0.f5374i;
        r4 = "mediation_networks_fail";
        r5 = ",";
        r0 = r17;
        r5 = android.text.TextUtils.join(r5, r0);
        r3.m4235a(r4, r5);
    L_0x0125:
        r0 = r23;
        r3 = r0.f5374i;
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = "mls";
        r4[r5] = r6;
        r0 = r21;
        r3.m4237a(r0, r4);
        r0 = r23;
        r3 = r0.f5374i;
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = "ttm";
        r4[r5] = r6;
        r0 = r18;
        r3.m4237a(r0, r4);
        goto L_0x0094;
    L_0x0149:
        r2 = move-exception;
        monitor-exit(r22);	 Catch:{ all -> 0x0149 }
        throw r2;
    L_0x014c:
        r0 = r17;
        r0.add(r4);
        r0 = r23;
        r3 = r0.f5374i;
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = "mlf";
        r4[r5] = r6;
        r0 = r21;
        r3.m4237a(r0, r4);
        r3 = r2.f5343c;
        if (r3 == 0) goto L_0x006c;
    L_0x0166:
        r3 = com.google.android.gms.internal.gb.f6131a;
        r4 = new com.google.android.gms.internal.alz;
        r4.<init>(r2);
        r3.post(r4);
        goto L_0x006c;
    L_0x0172:
        r2 = r17.isEmpty();
        if (r2 != 0) goto L_0x0189;
    L_0x0178:
        r0 = r23;
        r2 = r0.f5374i;
        r3 = "mediation_networks_fail";
        r4 = ",";
        r0 = r17;
        r4 = android.text.TextUtils.join(r4, r0);
        r2.m4235a(r3, r4);
    L_0x0189:
        r2 = new com.google.android.gms.internal.als;
        r3 = 1;
        r2.<init>(r3);
        goto L_0x0094;
    L_0x0191:
        r9 = r2;
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aly.a(java.util.List):com.google.android.gms.internal.als");
    }

    public final void mo1891a() {
        synchronized (this.f5369d) {
            this.f5377l = true;
            if (this.f5378m != null) {
                this.f5378m.m4717a();
            }
        }
    }

    public final List<als> mo1892b() {
        return this.f5379n;
    }
}
