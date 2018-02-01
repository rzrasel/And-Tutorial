package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C1538g;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

@aqv
public final class afq extends agd implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener {
    private static String[] f5053b = new String[]{NativeAppInstallAd.ASSET_MEDIA_VIDEO, "1009"};
    FrameLayout f5054a;
    private final Object f5055c = new Object();
    private final FrameLayout f5056d;
    private Map<String, WeakReference<View>> f5057e = new HashMap();
    private View f5058f;
    private afa f5059g;
    private boolean f5060h = false;
    private Point f5061i = new Point();
    private Point f5062j = new Point();
    private WeakReference<xh> f5063k = new WeakReference(null);

    @TargetApi(21)
    public afq(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f5056d = frameLayout;
        this.f5054a = frameLayout2;
        zzbv.zzey();
        ja.m5655a(this.f5056d, (OnGlobalLayoutListener) this);
        zzbv.zzey();
        ja.m5656a(this.f5056d, (OnScrollChangedListener) this);
        this.f5056d.setOnTouchListener(this);
        this.f5056d.setOnClickListener(this);
        if (frameLayout2 != null && C1538g.m3945e()) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        ado.m4219a(this.f5056d.getContext());
    }

    private final int m4453a(int i) {
        aak.m4022a();
        return hz.m5623b(this.f5059g.mo1815h(), i);
    }

    private final void m4454a(View view) {
        if (this.f5059g != null) {
            afa c = this.f5059g instanceof aez ? ((aez) this.f5059g).m4437c() : this.f5059g;
            if (c != null) {
                c.mo1801a(view);
            }
        }
    }

    static /* synthetic */ void m4455a(afq com_google_android_gms_internal_afq, afe com_google_android_gms_internal_afe) {
        synchronized (com_google_android_gms_internal_afq.f5055c) {
            View view;
            Map map = com_google_android_gms_internal_afq.f5057e;
            if (com_google_android_gms_internal_afe.f5019c.mo1771o() != null) {
                if ("2".equals(com_google_android_gms_internal_afe.f5019c.mo1767k())) {
                    zzbv.zzee().m5332a(com_google_android_gms_internal_afe.f5017a.getAdUnitId(), com_google_android_gms_internal_afe.f5019c.mo1767k(), map.containsKey(NativeAppInstallAd.ASSET_MEDIA_VIDEO));
                } else if ("1".equals(com_google_android_gms_internal_afe.f5019c.mo1767k())) {
                    zzbv.zzee().m5332a(com_google_android_gms_internal_afe.f5017a.getAdUnitId(), com_google_android_gms_internal_afe.f5019c.mo1767k(), map.containsKey("1009"));
                }
            }
            if (com_google_android_gms_internal_afq.f5057e != null) {
                for (Object obj : f5053b) {
                    WeakReference weakReference = (WeakReference) com_google_android_gms_internal_afq.f5057e.get(obj);
                    if (weakReference != null) {
                        view = (View) weakReference.get();
                        break;
                    }
                }
            }
            view = null;
            if (view instanceof FrameLayout) {
                com_google_android_gms_internal_afe.mo1802a(view, new afs(com_google_android_gms_internal_afq, view));
                return;
            }
            com_google_android_gms_internal_afe.mo1814g();
        }
    }

    public final C1398a mo1714a(String str) {
        Object obj = null;
        synchronized (this.f5055c) {
            if (this.f5057e == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) this.f5057e.get(str);
            if (weakReference != null) {
                View view = (View) weakReference.get();
            }
            C1398a a = C1401c.m3584a(obj);
            return a;
        }
    }

    public final void mo1715a() {
        synchronized (this.f5055c) {
            if (this.f5054a != null) {
                this.f5054a.removeAllViews();
            }
            this.f5054a = null;
            this.f5057e = null;
            this.f5058f = null;
            this.f5059g = null;
            this.f5061i = null;
            this.f5062j = null;
            this.f5063k = null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1716a(com.google.android.gms.p056a.C1398a r11) {
        /*
        r10 = this;
        r3 = 1;
        r5 = 0;
        r4 = 0;
        r6 = r10.f5055c;
        monitor-enter(r6);
        r1 = 0;
        r10.m4454a(r1);	 Catch:{ all -> 0x016d }
        r1 = com.google.android.gms.p056a.C1401c.m3585a(r11);	 Catch:{ all -> 0x016d }
        r2 = r1 instanceof com.google.android.gms.internal.afe;	 Catch:{ all -> 0x016d }
        if (r2 != 0) goto L_0x0019;
    L_0x0012:
        r1 = "Not an instance of native engine. This is most likely a transient error";
        com.google.android.gms.internal.id.m5370a(r1);	 Catch:{ all -> 0x016d }
        monitor-exit(r6);	 Catch:{ all -> 0x016d }
    L_0x0018:
        return;
    L_0x0019:
        r2 = r10.f5054a;	 Catch:{ all -> 0x016d }
        if (r2 == 0) goto L_0x002e;
    L_0x001d:
        r2 = r10.f5054a;	 Catch:{ all -> 0x016d }
        r7 = new android.widget.FrameLayout$LayoutParams;	 Catch:{ all -> 0x016d }
        r8 = 0;
        r9 = 0;
        r7.<init>(r8, r9);	 Catch:{ all -> 0x016d }
        r2.setLayoutParams(r7);	 Catch:{ all -> 0x016d }
        r2 = r10.f5056d;	 Catch:{ all -> 0x016d }
        r2.requestLayout();	 Catch:{ all -> 0x016d }
    L_0x002e:
        r2 = 1;
        r10.f5060h = r2;	 Catch:{ all -> 0x016d }
        r1 = (com.google.android.gms.internal.afe) r1;	 Catch:{ all -> 0x016d }
        r2 = r10.f5059g;	 Catch:{ all -> 0x016d }
        if (r2 == 0) goto L_0x0052;
    L_0x0037:
        r2 = com.google.android.gms.internal.ado.bN;	 Catch:{ all -> 0x016d }
        r7 = com.google.android.gms.ads.internal.zzbv.zzen();	 Catch:{ all -> 0x016d }
        r2 = r7.m4217a(r2);	 Catch:{ all -> 0x016d }
        r2 = (java.lang.Boolean) r2;	 Catch:{ all -> 0x016d }
        r2 = r2.booleanValue();	 Catch:{ all -> 0x016d }
        if (r2 == 0) goto L_0x0052;
    L_0x0049:
        r2 = r10.f5059g;	 Catch:{ all -> 0x016d }
        r7 = r10.f5056d;	 Catch:{ all -> 0x016d }
        r8 = r10.f5057e;	 Catch:{ all -> 0x016d }
        r2.mo1809b(r7, r8);	 Catch:{ all -> 0x016d }
    L_0x0052:
        r2 = r10.f5059g;	 Catch:{ all -> 0x016d }
        r2 = r2 instanceof com.google.android.gms.internal.afe;	 Catch:{ all -> 0x016d }
        if (r2 == 0) goto L_0x008d;
    L_0x0058:
        r2 = r10.f5059g;	 Catch:{ all -> 0x016d }
        r2 = (com.google.android.gms.internal.afe) r2;	 Catch:{ all -> 0x016d }
        if (r2 == 0) goto L_0x008d;
    L_0x005e:
        r7 = r2.f5018b;	 Catch:{ all -> 0x016d }
        if (r7 == 0) goto L_0x008d;
    L_0x0062:
        r7 = com.google.android.gms.ads.internal.zzbv.zzez();	 Catch:{ all -> 0x016d }
        r8 = r10.f5056d;	 Catch:{ all -> 0x016d }
        r8 = r8.getContext();	 Catch:{ all -> 0x016d }
        r7 = r7.m5301c(r8);	 Catch:{ all -> 0x016d }
        if (r7 == 0) goto L_0x008d;
    L_0x0072:
        r7 = r2.m4428i();	 Catch:{ all -> 0x016d }
        if (r7 == 0) goto L_0x007c;
    L_0x0078:
        r2 = 0;
        r7.m5286a(r2);	 Catch:{ all -> 0x016d }
    L_0x007c:
        r2 = r10.f5063k;	 Catch:{ all -> 0x016d }
        r2 = r2.get();	 Catch:{ all -> 0x016d }
        r2 = (com.google.android.gms.internal.xh) r2;	 Catch:{ all -> 0x016d }
        if (r2 == 0) goto L_0x008d;
    L_0x0086:
        if (r7 == 0) goto L_0x008d;
    L_0x0088:
        r2 = r2.f7397a;	 Catch:{ all -> 0x016d }
        r2.remove(r7);	 Catch:{ all -> 0x016d }
    L_0x008d:
        r2 = r10.f5059g;	 Catch:{ all -> 0x016d }
        r2 = r2 instanceof com.google.android.gms.internal.aez;	 Catch:{ all -> 0x016d }
        if (r2 == 0) goto L_0x0170;
    L_0x0093:
        r2 = r10.f5059g;	 Catch:{ all -> 0x016d }
        r2 = (com.google.android.gms.internal.aez) r2;	 Catch:{ all -> 0x016d }
        r2 = r2.m4436b();	 Catch:{ all -> 0x016d }
        if (r2 == 0) goto L_0x0170;
    L_0x009d:
        r2 = r10.f5059g;	 Catch:{ all -> 0x016d }
        r2 = (com.google.android.gms.internal.aez) r2;	 Catch:{ all -> 0x016d }
        r2.m4433a(r1);	 Catch:{ all -> 0x016d }
    L_0x00a4:
        r2 = com.google.android.gms.internal.ado.bN;	 Catch:{ all -> 0x016d }
        r7 = com.google.android.gms.ads.internal.zzbv.zzen();	 Catch:{ all -> 0x016d }
        r2 = r7.m4217a(r2);	 Catch:{ all -> 0x016d }
        r2 = (java.lang.Boolean) r2;	 Catch:{ all -> 0x016d }
        r2 = r2.booleanValue();	 Catch:{ all -> 0x016d }
        if (r2 == 0) goto L_0x00bc;
    L_0x00b6:
        r2 = r10.f5054a;	 Catch:{ all -> 0x016d }
        r7 = 0;
        r2.setClickable(r7);	 Catch:{ all -> 0x016d }
    L_0x00bc:
        r2 = r10.f5054a;	 Catch:{ all -> 0x016d }
        r2.removeAllViews();	 Catch:{ all -> 0x016d }
        r7 = r1.mo1806a();	 Catch:{ all -> 0x016d }
        if (r7 == 0) goto L_0x00e4;
    L_0x00c7:
        r2 = r10.f5057e;	 Catch:{ all -> 0x016d }
        if (r2 == 0) goto L_0x00e4;
    L_0x00cb:
        r2 = r10.f5057e;	 Catch:{ all -> 0x016d }
        r8 = "1098";
        r2 = r2.get(r8);	 Catch:{ all -> 0x016d }
        r2 = (java.lang.ref.WeakReference) r2;	 Catch:{ all -> 0x016d }
        if (r2 == 0) goto L_0x0180;
    L_0x00d7:
        r2 = r2.get();	 Catch:{ all -> 0x016d }
        r2 = (android.view.View) r2;	 Catch:{ all -> 0x016d }
    L_0x00dd:
        r8 = r2 instanceof android.view.ViewGroup;	 Catch:{ all -> 0x016d }
        if (r8 == 0) goto L_0x00e4;
    L_0x00e1:
        r2 = (android.view.ViewGroup) r2;	 Catch:{ all -> 0x016d }
        r5 = r2;
    L_0x00e4:
        if (r7 == 0) goto L_0x0183;
    L_0x00e6:
        if (r5 == 0) goto L_0x0183;
    L_0x00e8:
        r2 = r3;
    L_0x00e9:
        r3 = r1.mo1799a(r10, r2);	 Catch:{ all -> 0x016d }
        r10.f5058f = r3;	 Catch:{ all -> 0x016d }
        r3 = r10.f5058f;	 Catch:{ all -> 0x016d }
        if (r3 == 0) goto L_0x010f;
    L_0x00f3:
        r3 = r10.f5057e;	 Catch:{ all -> 0x016d }
        if (r3 == 0) goto L_0x0105;
    L_0x00f7:
        r3 = r10.f5057e;	 Catch:{ all -> 0x016d }
        r4 = "1007";
        r7 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x016d }
        r8 = r10.f5058f;	 Catch:{ all -> 0x016d }
        r7.<init>(r8);	 Catch:{ all -> 0x016d }
        r3.put(r4, r7);	 Catch:{ all -> 0x016d }
    L_0x0105:
        if (r2 == 0) goto L_0x0186;
    L_0x0107:
        r5.removeAllViews();	 Catch:{ all -> 0x016d }
        r2 = r10.f5058f;	 Catch:{ all -> 0x016d }
        r5.addView(r2);	 Catch:{ all -> 0x016d }
    L_0x010f:
        r2 = r10.f5056d;	 Catch:{ all -> 0x016d }
        r3 = r10.f5057e;	 Catch:{ all -> 0x016d }
        r1.mo1816a(r2, r3, r10, r10);	 Catch:{ all -> 0x016d }
        r2 = com.google.android.gms.internal.gb.f6131a;	 Catch:{ all -> 0x016d }
        r3 = new com.google.android.gms.internal.afr;	 Catch:{ all -> 0x016d }
        r3.<init>(r10, r1);	 Catch:{ all -> 0x016d }
        r2.post(r3);	 Catch:{ all -> 0x016d }
        r1 = r10.f5056d;	 Catch:{ all -> 0x016d }
        r10.m4454a(r1);	 Catch:{ all -> 0x016d }
        r1 = r10.f5059g;	 Catch:{ all -> 0x016d }
        r1 = r1 instanceof com.google.android.gms.internal.afe;	 Catch:{ all -> 0x016d }
        if (r1 == 0) goto L_0x016a;
    L_0x012b:
        r1 = r10.f5059g;	 Catch:{ all -> 0x016d }
        r1 = (com.google.android.gms.internal.afe) r1;	 Catch:{ all -> 0x016d }
        if (r1 == 0) goto L_0x016a;
    L_0x0131:
        r2 = r1.f5018b;	 Catch:{ all -> 0x016d }
        if (r2 == 0) goto L_0x016a;
    L_0x0135:
        r2 = com.google.android.gms.ads.internal.zzbv.zzez();	 Catch:{ all -> 0x016d }
        r3 = r10.f5056d;	 Catch:{ all -> 0x016d }
        r3 = r3.getContext();	 Catch:{ all -> 0x016d }
        r2 = r2.m5301c(r3);	 Catch:{ all -> 0x016d }
        if (r2 == 0) goto L_0x016a;
    L_0x0145:
        r2 = r10.f5063k;	 Catch:{ all -> 0x016d }
        r2 = r2.get();	 Catch:{ all -> 0x016d }
        r2 = (com.google.android.gms.internal.xh) r2;	 Catch:{ all -> 0x016d }
        if (r2 != 0) goto L_0x0163;
    L_0x014f:
        r2 = new com.google.android.gms.internal.xh;	 Catch:{ all -> 0x016d }
        r3 = r10.f5056d;	 Catch:{ all -> 0x016d }
        r3 = r3.getContext();	 Catch:{ all -> 0x016d }
        r4 = r10.f5056d;	 Catch:{ all -> 0x016d }
        r2.<init>(r3, r4);	 Catch:{ all -> 0x016d }
        r3 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x016d }
        r3.<init>(r2);	 Catch:{ all -> 0x016d }
        r10.f5063k = r3;	 Catch:{ all -> 0x016d }
    L_0x0163:
        r1 = r1.m4428i();	 Catch:{ all -> 0x016d }
        r2.m6989a(r1);	 Catch:{ all -> 0x016d }
    L_0x016a:
        monitor-exit(r6);	 Catch:{ all -> 0x016d }
        goto L_0x0018;
    L_0x016d:
        r1 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x016d }
        throw r1;
    L_0x0170:
        r10.f5059g = r1;	 Catch:{ all -> 0x016d }
        r2 = r1 instanceof com.google.android.gms.internal.aez;	 Catch:{ all -> 0x016d }
        if (r2 == 0) goto L_0x00a4;
    L_0x0176:
        r0 = r1;
        r0 = (com.google.android.gms.internal.aez) r0;	 Catch:{ all -> 0x016d }
        r2 = r0;
        r7 = 0;
        r2.m4433a(r7);	 Catch:{ all -> 0x016d }
        goto L_0x00a4;
    L_0x0180:
        r2 = r5;
        goto L_0x00dd;
    L_0x0183:
        r2 = r4;
        goto L_0x00e9;
    L_0x0186:
        r2 = r1.f5018b;	 Catch:{ all -> 0x016d }
        r3 = new com.google.android.gms.ads.formats.AdChoicesView;	 Catch:{ all -> 0x016d }
        r3.<init>(r2);	 Catch:{ all -> 0x016d }
        r2 = new android.widget.FrameLayout$LayoutParams;	 Catch:{ all -> 0x016d }
        r4 = -1;
        r5 = -1;
        r2.<init>(r4, r5);	 Catch:{ all -> 0x016d }
        r3.setLayoutParams(r2);	 Catch:{ all -> 0x016d }
        r2 = r10.f5058f;	 Catch:{ all -> 0x016d }
        r3.addView(r2);	 Catch:{ all -> 0x016d }
        r2 = r10.f5054a;	 Catch:{ all -> 0x016d }
        if (r2 == 0) goto L_0x010f;
    L_0x01a0:
        r2 = r10.f5054a;	 Catch:{ all -> 0x016d }
        r2.addView(r3);	 Catch:{ all -> 0x016d }
        goto L_0x010f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.afq.a(com.google.android.gms.a.a):void");
    }

    public final void mo1717a(C1398a c1398a, int i) {
        if (zzbv.zzez().m5301c(this.f5056d.getContext()) && this.f5063k != null) {
            xh xhVar = (xh) this.f5063k.get();
            if (xhVar != null) {
                xhVar.m6988a(4);
            }
        }
        int measuredWidth = this.f5056d.getMeasuredWidth();
        int measuredHeight = this.f5056d.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0 && this.f5054a != null) {
            this.f5054a.setLayoutParams(new LayoutParams(measuredWidth, measuredHeight));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1718a(java.lang.String r5, com.google.android.gms.p056a.C1398a r6) {
        /*
        r4 = this;
        r0 = com.google.android.gms.p056a.C1401c.m3585a(r6);
        r0 = (android.view.View) r0;
        r1 = r4.f5055c;
        monitor-enter(r1);
        r2 = r4.f5057e;	 Catch:{ all -> 0x0018 }
        if (r2 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
    L_0x000e:
        return;
    L_0x000f:
        if (r0 != 0) goto L_0x001b;
    L_0x0011:
        r0 = r4.f5057e;	 Catch:{ all -> 0x0018 }
        r0.remove(r5);	 Catch:{ all -> 0x0018 }
    L_0x0016:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        goto L_0x000e;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        throw r0;
    L_0x001b:
        r2 = r4.f5057e;	 Catch:{ all -> 0x0018 }
        r3 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x0018 }
        r3.<init>(r0);	 Catch:{ all -> 0x0018 }
        r2.put(r5, r3);	 Catch:{ all -> 0x0018 }
        r2 = "1098";
        r2 = r2.equals(r5);	 Catch:{ all -> 0x0018 }
        if (r2 == 0) goto L_0x002f;
    L_0x002d:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        goto L_0x000e;
    L_0x002f:
        r0.setOnTouchListener(r4);	 Catch:{ all -> 0x0018 }
        r2 = 1;
        r0.setClickable(r2);	 Catch:{ all -> 0x0018 }
        r0.setOnClickListener(r4);	 Catch:{ all -> 0x0018 }
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.afq.a(java.lang.String, com.google.android.gms.a.a):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r8) {
        /*
        r7 = this;
        r6 = r7.f5055c;
        monitor-enter(r6);
        r0 = r7.f5059g;	 Catch:{ all -> 0x0076 }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r6);	 Catch:{ all -> 0x0076 }
    L_0x0008:
        return;
    L_0x0009:
        r3 = new android.os.Bundle;	 Catch:{ all -> 0x0076 }
        r3.<init>();	 Catch:{ all -> 0x0076 }
        r0 = "x";
        r1 = r7.f5061i;	 Catch:{ all -> 0x0076 }
        r1 = r1.x;	 Catch:{ all -> 0x0076 }
        r1 = r7.m4453a(r1);	 Catch:{ all -> 0x0076 }
        r1 = (float) r1;	 Catch:{ all -> 0x0076 }
        r3.putFloat(r0, r1);	 Catch:{ all -> 0x0076 }
        r0 = "y";
        r1 = r7.f5061i;	 Catch:{ all -> 0x0076 }
        r1 = r1.y;	 Catch:{ all -> 0x0076 }
        r1 = r7.m4453a(r1);	 Catch:{ all -> 0x0076 }
        r1 = (float) r1;	 Catch:{ all -> 0x0076 }
        r3.putFloat(r0, r1);	 Catch:{ all -> 0x0076 }
        r0 = "start_x";
        r1 = r7.f5062j;	 Catch:{ all -> 0x0076 }
        r1 = r1.x;	 Catch:{ all -> 0x0076 }
        r1 = r7.m4453a(r1);	 Catch:{ all -> 0x0076 }
        r1 = (float) r1;	 Catch:{ all -> 0x0076 }
        r3.putFloat(r0, r1);	 Catch:{ all -> 0x0076 }
        r0 = "start_y";
        r1 = r7.f5062j;	 Catch:{ all -> 0x0076 }
        r1 = r1.y;	 Catch:{ all -> 0x0076 }
        r1 = r7.m4453a(r1);	 Catch:{ all -> 0x0076 }
        r1 = (float) r1;	 Catch:{ all -> 0x0076 }
        r3.putFloat(r0, r1);	 Catch:{ all -> 0x0076 }
        r0 = r7.f5058f;	 Catch:{ all -> 0x0076 }
        if (r0 == 0) goto L_0x0086;
    L_0x004a:
        r0 = r7.f5058f;	 Catch:{ all -> 0x0076 }
        r0 = r0.equals(r8);	 Catch:{ all -> 0x0076 }
        if (r0 == 0) goto L_0x0086;
    L_0x0052:
        r0 = r7.f5059g;	 Catch:{ all -> 0x0076 }
        r0 = r0 instanceof com.google.android.gms.internal.aez;	 Catch:{ all -> 0x0076 }
        if (r0 == 0) goto L_0x0079;
    L_0x0058:
        r0 = r7.f5059g;	 Catch:{ all -> 0x0076 }
        r0 = (com.google.android.gms.internal.aez) r0;	 Catch:{ all -> 0x0076 }
        r0 = r0.m4437c();	 Catch:{ all -> 0x0076 }
        if (r0 == 0) goto L_0x0074;
    L_0x0062:
        r0 = r7.f5059g;	 Catch:{ all -> 0x0076 }
        r0 = (com.google.android.gms.internal.aez) r0;	 Catch:{ all -> 0x0076 }
        r0 = r0.m4437c();	 Catch:{ all -> 0x0076 }
        r2 = "1007";
        r4 = r7.f5057e;	 Catch:{ all -> 0x0076 }
        r5 = r7.f5056d;	 Catch:{ all -> 0x0076 }
        r1 = r8;
        r0.mo1803a(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0076 }
    L_0x0074:
        monitor-exit(r6);	 Catch:{ all -> 0x0076 }
        goto L_0x0008;
    L_0x0076:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0076 }
        throw r0;
    L_0x0079:
        r0 = r7.f5059g;	 Catch:{ all -> 0x0076 }
        r2 = "1007";
        r4 = r7.f5057e;	 Catch:{ all -> 0x0076 }
        r5 = r7.f5056d;	 Catch:{ all -> 0x0076 }
        r1 = r8;
        r0.mo1803a(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0076 }
        goto L_0x0074;
    L_0x0086:
        r0 = r7.f5059g;	 Catch:{ all -> 0x0076 }
        r1 = r7.f5057e;	 Catch:{ all -> 0x0076 }
        r2 = r7.f5056d;	 Catch:{ all -> 0x0076 }
        r0.mo1805a(r8, r1, r3, r2);	 Catch:{ all -> 0x0076 }
        goto L_0x0074;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.afq.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        synchronized (this.f5055c) {
            if (this.f5060h) {
                int measuredWidth = this.f5056d.getMeasuredWidth();
                int measuredHeight = this.f5056d.getMeasuredHeight();
                if (!(measuredWidth == 0 || measuredHeight == 0 || this.f5054a == null)) {
                    this.f5054a.setLayoutParams(new LayoutParams(measuredWidth, measuredHeight));
                    this.f5060h = false;
                }
            }
            if (this.f5059g != null) {
                this.f5059g.mo1811c(this.f5056d, this.f5057e);
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.f5055c) {
            if (this.f5059g != null) {
                this.f5059g.mo1811c(this.f5056d, this.f5057e);
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f5055c) {
            if (this.f5059g == null) {
            } else {
                int[] iArr = new int[2];
                this.f5056d.getLocationOnScreen(iArr);
                Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
                this.f5061i = point;
                if (motionEvent.getAction() == 0) {
                    this.f5062j = point;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation((float) point.x, (float) point.y);
                this.f5059g.mo1800a(obtain);
                obtain.recycle();
            }
        }
        return false;
    }
}
