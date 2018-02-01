package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.C1493g;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.common.util.C1538g;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;

@aqv
public final class di implements dq {
    final vf f5909a;
    boolean f5910b;
    final Object f5911c = new Object();
    private final LinkedHashMap<String, vn> f5912d;
    private final Context f5913e;
    private final ds f5914f;
    private final zzaes f5915g;
    private HashSet<String> f5916h = new HashSet();
    private boolean f5917i = false;
    private boolean f5918j = false;
    private boolean f5919k = false;

    public di(Context context, zzajk com_google_android_gms_internal_zzajk, zzaao com_google_android_gms_internal_zzaao, ds dsVar) {
        C1516t.m3861a(com_google_android_gms_internal_zzaao.f7647K, (Object) "SafeBrowsing config is not present.");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f5913e = context;
        this.f5912d = new LinkedHashMap();
        this.f5914f = dsVar;
        this.f5915g = com_google_android_gms_internal_zzaao.f7647K;
        for (String toLowerCase : this.f5915g.f7702e) {
            this.f5916h.add(toLowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.f5916h.remove("cookie".toLowerCase(Locale.ENGLISH));
        vf vfVar = new vf();
        vfVar.f7263a = Integer.valueOf(8);
        vfVar.f7264b = com_google_android_gms_internal_zzaao.f7655a;
        vfVar.f7265c = com_google_android_gms_internal_zzaao.f7655a;
        vfVar.f7266d = new vg();
        vfVar.f7266d.f7279a = this.f5915g.f7698a;
        vo voVar = new vo();
        voVar.f7313a = com_google_android_gms_internal_zzajk.f7706a;
        voVar.f7315c = Boolean.valueOf(lm.m5976a(this.f5913e).m5974a());
        C1493g.m3805a();
        long b = (long) C1493g.m3806b(this.f5913e);
        if (b > 0) {
            voVar.f7314b = Long.valueOf(b);
        }
        vfVar.f7270h = voVar;
        this.f5909a = vfVar;
    }

    public final zzaes mo2076a() {
        return this.f5915g;
    }

    public final void mo2077a(View view) {
        if (this.f5915g.f7700c && !this.f5918j) {
            zzbv.zzea();
            Bitmap b = gb.m5465b(view);
            if (b == null) {
                dp.m5282a();
                return;
            }
            this.f5918j = true;
            gb.m5474b(new dj(this, b));
        }
    }

    public final void mo2078a(String str) {
        synchronized (this.f5911c) {
            this.f5909a.f7268f = str;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2079a(java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, int r11) {
        /*
        r8 = this;
        r1 = 3;
        r2 = r8.f5911c;
        monitor-enter(r2);
        if (r11 != r1) goto L_0x0009;
    L_0x0006:
        r0 = 1;
        r8.f5919k = r0;	 Catch:{ all -> 0x00aa }
    L_0x0009:
        r0 = r8.f5912d;	 Catch:{ all -> 0x00aa }
        r0 = r0.containsKey(r9);	 Catch:{ all -> 0x00aa }
        if (r0 == 0) goto L_0x0023;
    L_0x0011:
        if (r11 != r1) goto L_0x0021;
    L_0x0013:
        r0 = r8.f5912d;	 Catch:{ all -> 0x00aa }
        r0 = r0.get(r9);	 Catch:{ all -> 0x00aa }
        r0 = (com.google.android.gms.internal.vn) r0;	 Catch:{ all -> 0x00aa }
        r1 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x00aa }
        r0.f7307d = r1;	 Catch:{ all -> 0x00aa }
    L_0x0021:
        monitor-exit(r2);	 Catch:{ all -> 0x00aa }
    L_0x0022:
        return;
    L_0x0023:
        r3 = new com.google.android.gms.internal.vn;	 Catch:{ all -> 0x00aa }
        r3.<init>();	 Catch:{ all -> 0x00aa }
        r0 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x00aa }
        r3.f7307d = r0;	 Catch:{ all -> 0x00aa }
        r0 = r8.f5912d;	 Catch:{ all -> 0x00aa }
        r0 = r0.size();	 Catch:{ all -> 0x00aa }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x00aa }
        r3.f7304a = r0;	 Catch:{ all -> 0x00aa }
        r3.f7305b = r9;	 Catch:{ all -> 0x00aa }
        r0 = new com.google.android.gms.internal.vi;	 Catch:{ all -> 0x00aa }
        r0.<init>();	 Catch:{ all -> 0x00aa }
        r3.f7306c = r0;	 Catch:{ all -> 0x00aa }
        r0 = r8.f5916h;	 Catch:{ all -> 0x00aa }
        r0 = r0.size();	 Catch:{ all -> 0x00aa }
        if (r0 <= 0) goto L_0x00c0;
    L_0x004b:
        if (r10 == 0) goto L_0x00c0;
    L_0x004d:
        r4 = new java.util.LinkedList;	 Catch:{ all -> 0x00aa }
        r4.<init>();	 Catch:{ all -> 0x00aa }
        r0 = r10.entrySet();	 Catch:{ all -> 0x00aa }
        r5 = r0.iterator();	 Catch:{ all -> 0x00aa }
    L_0x005a:
        r0 = r5.hasNext();	 Catch:{ all -> 0x00aa }
        if (r0 == 0) goto L_0x00b3;
    L_0x0060:
        r0 = r5.next();	 Catch:{ all -> 0x00aa }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x00aa }
        r1 = r0.getKey();	 Catch:{ UnsupportedEncodingException -> 0x00a5 }
        if (r1 == 0) goto L_0x00ad;
    L_0x006c:
        r1 = r0.getKey();	 Catch:{ UnsupportedEncodingException -> 0x00a5 }
        r1 = (java.lang.String) r1;	 Catch:{ UnsupportedEncodingException -> 0x00a5 }
    L_0x0072:
        r6 = r0.getValue();	 Catch:{ UnsupportedEncodingException -> 0x00a5 }
        if (r6 == 0) goto L_0x00b0;
    L_0x0078:
        r0 = r0.getValue();	 Catch:{ UnsupportedEncodingException -> 0x00a5 }
        r0 = (java.lang.String) r0;	 Catch:{ UnsupportedEncodingException -> 0x00a5 }
    L_0x007e:
        r6 = java.util.Locale.ENGLISH;	 Catch:{ UnsupportedEncodingException -> 0x00a5 }
        r6 = r1.toLowerCase(r6);	 Catch:{ UnsupportedEncodingException -> 0x00a5 }
        r7 = r8.f5916h;	 Catch:{ UnsupportedEncodingException -> 0x00a5 }
        r6 = r7.contains(r6);	 Catch:{ UnsupportedEncodingException -> 0x00a5 }
        if (r6 == 0) goto L_0x005a;
    L_0x008c:
        r6 = new com.google.android.gms.internal.vh;	 Catch:{ UnsupportedEncodingException -> 0x00a5 }
        r6.<init>();	 Catch:{ UnsupportedEncodingException -> 0x00a5 }
        r7 = "UTF-8";
        r1 = r1.getBytes(r7);	 Catch:{ UnsupportedEncodingException -> 0x00a5 }
        r6.f7281a = r1;	 Catch:{ UnsupportedEncodingException -> 0x00a5 }
        r1 = "UTF-8";
        r0 = r0.getBytes(r1);	 Catch:{ UnsupportedEncodingException -> 0x00a5 }
        r6.f7282b = r0;	 Catch:{ UnsupportedEncodingException -> 0x00a5 }
        r4.add(r6);	 Catch:{ UnsupportedEncodingException -> 0x00a5 }
        goto L_0x005a;
    L_0x00a5:
        r0 = move-exception;
        com.google.android.gms.internal.dp.m5282a();	 Catch:{ all -> 0x00aa }
        goto L_0x005a;
    L_0x00aa:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00aa }
        throw r0;
    L_0x00ad:
        r1 = "";
        goto L_0x0072;
    L_0x00b0:
        r0 = "";
        goto L_0x007e;
    L_0x00b3:
        r0 = r4.size();	 Catch:{ all -> 0x00aa }
        r0 = new com.google.android.gms.internal.vh[r0];	 Catch:{ all -> 0x00aa }
        r4.toArray(r0);	 Catch:{ all -> 0x00aa }
        r1 = r3.f7306c;	 Catch:{ all -> 0x00aa }
        r1.f7283a = r0;	 Catch:{ all -> 0x00aa }
    L_0x00c0:
        r0 = r8.f5912d;	 Catch:{ all -> 0x00aa }
        r0.put(r9, r3);	 Catch:{ all -> 0x00aa }
        monitor-exit(r2);	 Catch:{ all -> 0x00aa }
        goto L_0x0022;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.di.a(java.lang.String, java.util.Map, int):void");
    }

    final vn m5273b(String str) {
        vn vnVar;
        synchronized (this.f5911c) {
            vnVar = (vn) this.f5912d.get(str);
        }
        return vnVar;
    }

    public final boolean mo2080b() {
        return C1538g.m3944d() && this.f5915g.f7700c && !this.f5918j;
    }

    public final void mo2081c() {
        this.f5917i = true;
    }

    public final void mo2082d() {
        synchronized (this.f5911c) {
            ds dsVar = this.f5914f;
            this.f5912d.keySet();
            il a = dsVar.mo2084a();
            a.mo1478a(new dk(this, a), fv.f6119a);
        }
    }

    final void m5277e() {
        int i = 1;
        int i2 = 0;
        if (!(this.f5910b && this.f5915g.f7704g) && (!(this.f5919k && this.f5915g.f7703f) && (this.f5910b || !this.f5915g.f7701d))) {
            i = 0;
        }
        if (i != 0) {
            synchronized (this.f5911c) {
                this.f5909a.f7267e = new vn[this.f5912d.size()];
                this.f5912d.values().toArray(this.f5909a.f7267e);
                if (dp.m5283b()) {
                    String str = this.f5909a.f7264b;
                    String str2 = this.f5909a.f7268f;
                    StringBuilder stringBuilder = new StringBuilder(new StringBuilder((String.valueOf(str).length() + 53) + String.valueOf(str2).length()).append("Sending SB report\n  url: ").append(str).append("\n  clickUrl: ").append(str2).append("\n  resources: \n").toString());
                    vn[] vnVarArr = this.f5909a.f7267e;
                    int length = vnVarArr.length;
                    while (i2 < length) {
                        vn vnVar = vnVarArr[i2];
                        stringBuilder.append("    [");
                        stringBuilder.append(vnVar.f7308e.length);
                        stringBuilder.append("] ");
                        stringBuilder.append(vnVar.f7305b);
                        i2++;
                    }
                    dp.m5282a();
                }
                byte[] a = vb.m5895a(this.f5909a);
                String str3 = this.f5915g.f7699b;
                he heVar = new he(this.f5913e);
                il a2 = he.m5582a(1, str3, null, a);
                if (dp.m5283b()) {
                    a2.mo1478a(new dl(), fv.f6119a);
                }
            }
        }
    }
}
