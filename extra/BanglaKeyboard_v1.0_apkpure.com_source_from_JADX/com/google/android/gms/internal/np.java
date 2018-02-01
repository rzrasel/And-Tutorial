package com.google.android.gms.internal;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0207q;
import java.util.ArrayList;
import java.util.HashSet;

public final class np extends C0399w implements ao, bb, bk, cr, cw, dr, fg, no {
    private final bs f1983a;
    private final ns f1984b;
    private final nu f1985c;
    private final C0354a f1986d;
    private boolean f1987e;
    private final ComponentCallbacks f1988f = new nq(this);

    public np(Context context, ak akVar, String str, bs bsVar, dx dxVar) {
        this.f1984b = new ns(context, akVar, str, dxVar);
        this.f1983a = bsVar;
        this.f1985c = new nu(this);
        this.f1986d = new C0354a();
        "Use AdRequest.Builder.addTestDevice(\"" + fz.m2030a(context) + "\") to get test ads on this device.";
        gb.m2071a(4);
        fo.m2006b(context);
        if (VERSION.SDK_INT >= 14 && this.f1984b != null && this.f1984b.f1993c != null) {
            this.f1984b.f1993c.registerComponentCallbacks(this.f1988f);
        }
    }

    private void m2706a(int i) {
        gb.m2069a("Failed to load ad: " + i);
        if (this.f1984b.f1996f != null) {
            try {
                this.f1984b.f1996f.mo956a(i);
            } catch (Throwable e) {
                gb.m2070a("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
    }

    private void m2707a(View view) {
        this.f1984b.f1991a.addView(view, new LayoutParams(-2, -2));
    }

    private void m2708a(boolean z) {
        if (this.f1984b.f1999i == null) {
            gb.m2069a("Ad state was null when trying to ping impression URLs.");
            return;
        }
        gb.m2071a(3);
        fa faVar = this.f1984b.f2000j;
        synchronized (faVar.f1363c) {
            if (faVar.f1370j != -1 && faVar.f1365e == -1) {
                faVar.f1365e = SystemClock.elapsedRealtime();
                faVar.f1361a.m1978a(faVar);
            }
            fd fdVar = faVar.f1361a;
            ff c = fd.m1974c();
            synchronized (c.f1388a) {
                c.f1392e++;
            }
        }
        if (this.f1984b.f1999i.f1342e != null) {
            fo.m1994a(this.f1984b.f1993c, this.f1984b.f1995e.f1222b, this.f1984b.f1999i.f1342e);
        }
        if (!(this.f1984b.f1999i.f1352o == null || this.f1984b.f1999i.f1352o.f1059d == null)) {
            bq.m1708a(this.f1984b.f1993c, this.f1984b.f1995e.f1222b, this.f1984b.f1999i, this.f1984b.f1992b, z, this.f1984b.f1999i.f1352o.f1059d);
        }
        if (this.f1984b.f1999i.f1349l != null && this.f1984b.f1999i.f1349l.f1054e != null) {
            bq.m1708a(this.f1984b.f1993c, this.f1984b.f1995e.f1222b, this.f1984b.f1999i, this.f1984b.f1992b, z, this.f1984b.f1999i.f1349l.f1054e);
        }
    }

    private boolean m2709b(ez ezVar) {
        View view;
        if (ezVar.f1348k) {
            try {
                view = (View) C0207q.m864a(ezVar.f1350m.mo833a());
                View nextView = this.f1984b.f1991a.getNextView();
                if (nextView != null) {
                    this.f1984b.f1991a.removeView(nextView);
                }
                try {
                    m2707a(view);
                } catch (Throwable th) {
                    gb.m2070a("Could not add mediation view to view hierarchy.", th);
                    return false;
                }
            } catch (Throwable th2) {
                gb.m2070a("Could not get View from mediation adapter.", th2);
                return false;
            }
        } else if (ezVar.f1355r != null) {
            ezVar.f1339b.m2088a(ezVar.f1355r);
            this.f1984b.f1991a.removeAllViews();
            this.f1984b.f1991a.setMinimumWidth(ezVar.f1355r.f940g);
            this.f1984b.f1991a.setMinimumHeight(ezVar.f1355r.f937d);
            m2707a(ezVar.f1339b);
        }
        if (this.f1984b.f1991a.getChildCount() > 1) {
            this.f1984b.f1991a.showNext();
        }
        if (this.f1984b.f1999i != null) {
            view = this.f1984b.f1991a.getNextView();
            if (view instanceof ge) {
                ((ge) view).m2087a(this.f1984b.f1993c, this.f1984b.f1998h);
            } else if (view != null) {
                this.f1984b.f1991a.removeView(view);
            }
            if (this.f1984b.f1999i.f1350m != null) {
                try {
                    this.f1984b.f1999i.f1350m.mo839c();
                } catch (RemoteException e) {
                    gb.m2069a("Could not destroy previous mediation adapter.");
                }
            }
        }
        this.f1984b.f1991a.setVisibility(0);
        return true;
    }

    private ei m2710c(ah ahVar) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo = this.f1984b.f1993c.getApplicationInfo();
        try {
            packageInfo = this.f1984b.f1993c.getPackageManager().getPackageInfo(applicationInfo.packageName, 0);
        } catch (NameNotFoundException e) {
            packageInfo = null;
        }
        Bundle bundle = null;
        if (!(this.f1984b.f1998h.f938e || this.f1984b.f1991a.getParent() == null)) {
            int[] iArr = new int[2];
            this.f1984b.f1991a.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            DisplayMetrics displayMetrics = this.f1984b.f1993c.getResources().getDisplayMetrics();
            int width = this.f1984b.f1991a.getWidth();
            int height = this.f1984b.f1991a.getHeight();
            int i3 = 0;
            if (this.f1984b.f1991a.isShown() && i + width > 0 && i2 + height > 0 && i <= displayMetrics.widthPixels && i2 <= displayMetrics.heightPixels) {
                i3 = 1;
            }
            bundle = new Bundle(5);
            bundle.putInt("x", i);
            bundle.putInt("y", i2);
            bundle.putInt("width", width);
            bundle.putInt("height", height);
            bundle.putInt("visible", i3);
        }
        String b = fd.m1973b();
        this.f1984b.f2000j = new fa(b, this.f1984b.f1992b);
        fa faVar = this.f1984b.f2000j;
        synchronized (faVar.f1363c) {
            faVar.f1369i = SystemClock.elapsedRealtime();
            fd fdVar = faVar.f1361a;
            ff c = fd.m1974c();
            long j = faVar.f1369i;
            synchronized (c.f1388a) {
                if (c.f1391d == -1) {
                    c.f1391d = j;
                    c.f1390c = c.f1391d;
                } else {
                    c.f1390c = j;
                }
                if (ahVar.f916c == null || ahVar.f916c.getInt("gw", 2) != 1) {
                    c.f1393f++;
                }
            }
        }
        Bundle a = fd.m1969a((fg) this, b);
        return new ei(bundle, ahVar, this.f1984b.f1998h, this.f1984b.f1992b, applicationInfo, packageInfo, b, fd.f1380a, this.f1984b.f1995e, a);
    }

    private void m2711s() {
        gb.m2071a(4);
        if (this.f1984b.f1996f != null) {
            try {
                this.f1984b.f1996f.mo958c();
            } catch (Throwable e) {
                gb.m2070a("Could not call AdListener.onAdLoaded().", e);
            }
        }
    }

    private void m2712t() {
        if (this.f1984b.f1999i != null) {
            this.f1984b.f1999i.f1339b.destroy();
            this.f1984b.f1999i = null;
        }
    }

    public final C0204n mo972a() {
        je.m2475a("getAdFrame must be called on the main UI thread.");
        return C0207q.m863a(this.f1984b.f1991a);
    }

    public final void mo973a(ab abVar) {
        je.m2475a("setAppEventListener must be called on the main UI thread.");
        this.f1984b.f2001k = abVar;
    }

    public final void mo974a(ak akVar) {
        je.m2475a("setAdSize must be called on the main UI thread.");
        this.f1984b.f1998h = akVar;
        if (this.f1984b.f1999i != null) {
            this.f1984b.f1999i.f1339b.m2088a(akVar);
        }
        if (this.f1984b.f1991a.getChildCount() > 1) {
            this.f1984b.f1991a.removeView(this.f1984b.f1991a.getNextView());
        }
        this.f1984b.f1991a.setMinimumWidth(akVar.f940g);
        this.f1984b.f1991a.setMinimumHeight(akVar.f937d);
        this.f1984b.f1991a.requestLayout();
    }

    public final void mo975a(dl dlVar) {
        je.m2475a("setInAppPurchaseListener must be called on the main UI thread.");
        this.f1984b.f2002l = dlVar;
    }

    public final void mo976a(ez ezVar) {
        int i = 0;
        this.f1984b.f1997g = null;
        if (!(ezVar.f1341d == -2 || ezVar.f1341d == 3)) {
            fd.m1971a(this.f1984b.f2004n);
        }
        if (ezVar.f1341d != -1) {
            boolean z = ezVar.f1338a.f916c != null ? ezVar.f1338a.f916c.getBoolean("_noRefresh", false) : false;
            if (this.f1984b.f1998h.f938e) {
                fo.m1996a(ezVar.f1339b);
            } else if (!z) {
                if (ezVar.f1345h > 0) {
                    this.f1985c.m2746a(ezVar.f1338a, ezVar.f1345h);
                } else if (ezVar.f1352o != null && ezVar.f1352o.f1062g > 0) {
                    this.f1985c.m2746a(ezVar.f1338a, ezVar.f1352o.f1062g);
                } else if (!ezVar.f1348k && ezVar.f1341d == 2) {
                    this.f1985c.m2745a(ezVar.f1338a);
                }
            }
            if (!(ezVar.f1341d != 3 || ezVar.f1352o == null || ezVar.f1352o.f1060e == null)) {
                gb.m2071a(3);
                bq.m1708a(this.f1984b.f1993c, this.f1984b.f1995e.f1222b, ezVar, this.f1984b.f1992b, false, ezVar.f1352o.f1060e);
            }
            if (ezVar.f1341d != -2) {
                m2706a(ezVar.f1341d);
                return;
            }
            int i2;
            if (!this.f1984b.f1998h.f938e) {
                if (!m2709b(ezVar)) {
                    m2706a(0);
                    return;
                } else if (this.f1984b.f1991a != null) {
                    this.f1984b.f1991a.f1990a.f1413b = ezVar.f1359v;
                }
            }
            if (!(this.f1984b.f1999i == null || this.f1984b.f1999i.f1353p == null)) {
                this.f1984b.f1999i.f1353p.m1697a(null);
            }
            if (ezVar.f1353p != null) {
                ezVar.f1353p.m1697a((bk) this);
            }
            this.f1986d.m1615a(this.f1984b.f1999i);
            this.f1984b.f1999i = ezVar;
            if (ezVar.f1355r != null) {
                this.f1984b.f1998h = ezVar.f1355r;
            }
            fa faVar = this.f1984b.f2000j;
            long j = ezVar.f1357t;
            synchronized (faVar.f1363c) {
                faVar.f1370j = j;
                if (faVar.f1370j != -1) {
                    faVar.f1361a.m1978a(faVar);
                }
            }
            faVar = this.f1984b.f2000j;
            j = ezVar.f1358u;
            synchronized (faVar.f1363c) {
                if (faVar.f1370j != -1) {
                    faVar.f1364d = j;
                    faVar.f1361a.m1978a(faVar);
                }
            }
            faVar = this.f1984b.f2000j;
            boolean z2 = this.f1984b.f1998h.f938e;
            synchronized (faVar.f1363c) {
                if (faVar.f1370j != -1) {
                    faVar.f1367g = SystemClock.elapsedRealtime();
                    if (!z2) {
                        faVar.f1365e = faVar.f1367g;
                        faVar.f1361a.m1978a(faVar);
                    }
                }
            }
            faVar = this.f1984b.f2000j;
            z2 = ezVar.f1348k;
            synchronized (faVar.f1363c) {
                if (faVar.f1370j != -1) {
                    faVar.f1366f = z2;
                    faVar.f1361a.m1978a(faVar);
                }
            }
            if (!this.f1984b.f1998h.f938e) {
                m2708a(false);
            }
            if (this.f1984b.f2003m == null) {
                this.f1984b.f2003m = new fh(this.f1984b.f1992b);
            }
            if (ezVar.f1352o != null) {
                i2 = ezVar.f1352o.f1063h;
                i = ezVar.f1352o.f1064i;
            } else {
                i2 = 0;
            }
            fh fhVar = this.f1984b.f2003m;
            synchronized (fhVar.f1395a) {
                fhVar.f1396b = i2;
                fhVar.f1397c = i;
                fhVar.f1398d.m1979a(fhVar.f1399e, fhVar);
            }
            if (!(this.f1984b.f1998h.f938e || ezVar.f1339b == null || (!ezVar.f1339b.m2097f().m2125a() && ezVar.f1347j == null))) {
                C0356b a = this.f1986d.m1613a(this.f1984b.f1998h, this.f1984b.f1999i);
                if (ezVar.f1339b.m2097f().m2125a() && a != null) {
                    a.m1669a(new nt(ezVar.f1339b));
                }
            }
            this.f1984b.f1999i.f1339b.m2086a();
            m2711s();
        }
    }

    public final void mo977a(C0394s c0394s) {
        je.m2475a("setAdListener must be called on the main UI thread.");
        this.f1984b.f1996f = c0394s;
    }

    public final void mo978a(String str, String str2) {
        if (this.f1984b.f2001k != null) {
            try {
                this.f1984b.f2001k.mo823a(str, str2);
            } catch (Throwable e) {
                gb.m2070a("Could not call the AppEventListener.", e);
            }
        }
    }

    public final void mo979a(String str, ArrayList arrayList) {
        if (this.f1984b.f2002l == null) {
            gb.m2069a("InAppPurchaseListener is not set");
            return;
        }
        try {
            this.f1984b.f2002l.mo873a(new dh(str, arrayList, this.f1984b.f1993c, this.f1984b.f1995e.f1222b));
        } catch (RemoteException e) {
            gb.m2069a("Could not start In-App purchase.");
        }
    }

    public final void mo980a(HashSet hashSet) {
        this.f1984b.f2004n = hashSet;
    }

    public final boolean mo981a(ah ahVar) {
        je.m2475a("loadAd must be called on the main UI thread.");
        if (this.f1984b.f1997g != null) {
            gb.m2069a("An ad request is already in progress. Aborting.");
            return false;
        } else if (!this.f1984b.f1998h.f938e || this.f1984b.f1999i == null) {
            boolean z;
            if (fo.m2001a(this.f1984b.f1993c.getPackageManager(), this.f1984b.f1993c.getPackageName(), "android.permission.INTERNET")) {
                z = true;
            } else {
                if (!this.f1984b.f1998h.f938e) {
                    fz.m2034a(this.f1984b.f1991a, this.f1984b.f1998h, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
                }
                z = false;
            }
            if (!fo.m2000a(this.f1984b.f1993c)) {
                if (!this.f1984b.f1998h.f938e) {
                    fz.m2034a(this.f1984b.f1991a, this.f1984b.f1998h, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
                }
                z = false;
            }
            if (!(z || this.f1984b.f1998h.f938e)) {
                this.f1984b.f1991a.setVisibility(0);
            }
            if (!z) {
                return false;
            }
            ge geVar;
            gb.m2071a(4);
            this.f1985c.m2744a();
            ei c = m2710c(ahVar);
            if (this.f1984b.f1998h.f938e) {
                ge a = ge.m2081a(this.f1984b.f1993c, this.f1984b.f1998h, false, false, this.f1984b.f1994d, this.f1984b.f1995e);
                a.m2097f().m2120a(this, null, this, this, true, this);
                geVar = a;
            } else {
                ge geVar2;
                View nextView = this.f1984b.f1991a.getNextView();
                if (nextView instanceof ge) {
                    geVar2 = (ge) nextView;
                    geVar2.m2087a(this.f1984b.f1993c, this.f1984b.f1998h);
                } else {
                    if (nextView != null) {
                        this.f1984b.f1991a.removeView(nextView);
                    }
                    nextView = ge.m2081a(this.f1984b.f1993c, this.f1984b.f1998h, false, false, this.f1984b.f1994d, this.f1984b.f1995e);
                    if (this.f1984b.f1998h.f941h == null) {
                        m2707a(nextView);
                    }
                }
                geVar2.m2097f().m2120a(this, this, this, this, false, this);
                geVar = geVar2;
            }
            ns nsVar = this.f1984b;
            fj dsVar = new ds(this.f1984b.f1993c, c, this.f1984b.f1994d, geVar, this.f1983a, this);
            fl.m1985a(dsVar.f1199e);
            nsVar.f1997g = dsVar;
            return true;
        } else {
            gb.m2069a("An interstitial is already loading. Aborting.");
            return false;
        }
    }

    public final void mo982b() {
        je.m2475a("destroy must be called on the main UI thread.");
        if (!(VERSION.SDK_INT < 14 || this.f1984b == null || this.f1984b.f1993c == null)) {
            this.f1984b.f1993c.unregisterComponentCallbacks(this.f1988f);
        }
        this.f1984b.f1996f = null;
        this.f1984b.f2001k = null;
        this.f1985c.m2744a();
        mo987g();
        if (this.f1984b.f1991a != null) {
            this.f1984b.f1991a.removeAllViews();
        }
        if (!(this.f1984b.f1999i == null || this.f1984b.f1999i.f1339b == null)) {
            this.f1984b.f1999i.f1339b.destroy();
        }
        if (this.f1984b.f1999i != null && this.f1984b.f1999i.f1350m != null) {
            try {
                this.f1984b.f1999i.f1350m.mo839c();
            } catch (RemoteException e) {
                gb.m2069a("Could not destroy mediation adapter.");
            }
        }
    }

    public final void m2724b(ah ahVar) {
        ViewParent parent = this.f1984b.f1991a.getParent();
        if ((parent instanceof View) && ((View) parent).isShown() && fo.m1999a() && !this.f1987e) {
            mo981a(ahVar);
            return;
        }
        gb.m2071a(4);
        this.f1985c.m2745a(ahVar);
    }

    public final boolean mo983c() {
        je.m2475a("isLoaded must be called on the main UI thread.");
        return this.f1984b.f1997g == null && this.f1984b.f1999i != null;
    }

    public final void mo984d() {
        je.m2475a("pause must be called on the main UI thread.");
        if (this.f1984b.f1999i != null) {
            fo.m1996a(this.f1984b.f1999i.f1339b);
        }
        if (!(this.f1984b.f1999i == null || this.f1984b.f1999i.f1350m == null)) {
            try {
                this.f1984b.f1999i.f1350m.mo840d();
            } catch (RemoteException e) {
                gb.m2069a("Could not pause mediation adapter.");
            }
        }
        nu nuVar = this.f1985c;
        nuVar.f2010e = true;
        if (nuVar.f2009d) {
            nuVar.f2006a.m2747a(nuVar.f2007b);
        }
    }

    public final void mo985e() {
        je.m2475a("resume must be called on the main UI thread.");
        if (this.f1984b.f1999i != null) {
            fo.m2007b(this.f1984b.f1999i.f1339b);
        }
        if (!(this.f1984b.f1999i == null || this.f1984b.f1999i.f1350m == null)) {
            try {
                this.f1984b.f1999i.f1350m.mo841e();
            } catch (RemoteException e) {
                gb.m2069a("Could not resume mediation adapter.");
            }
        }
        nu nuVar = this.f1985c;
        nuVar.f2010e = false;
        if (nuVar.f2009d) {
            nuVar.f2009d = false;
            nuVar.m2746a(nuVar.f2008c, nuVar.f2011f);
        }
    }

    public final void mo986f() {
        je.m2475a("showInterstitial must be called on the main UI thread.");
        if (!this.f1984b.f1998h.f938e) {
            gb.m2069a("Cannot call showInterstitial on a banner ad.");
        } else if (this.f1984b.f1999i == null) {
            gb.m2069a("The interstitial has not loaded.");
        } else if (this.f1984b.f1999i.f1339b.m2100i()) {
            gb.m2069a("The interstitial is already showing.");
        } else {
            this.f1984b.f1999i.f1339b.m2092a(true);
            if (this.f1984b.f1999i.f1339b.m2097f().m2125a() || this.f1984b.f1999i.f1347j != null) {
                C0356b a = this.f1986d.m1613a(this.f1984b.f1998h, this.f1984b.f1999i);
                if (this.f1984b.f1999i.f1339b.m2097f().m2125a() && a != null) {
                    a.m1669a(new nt(this.f1984b.f1999i.f1339b));
                }
            }
            if (this.f1984b.f1999i.f1348k) {
                try {
                    this.f1984b.f1999i.f1350m.mo838b();
                    return;
                } catch (Throwable e) {
                    gb.m2070a("Could not show interstitial.", e);
                    m2712t();
                    return;
                }
            }
            cl.m1799a(this.f1984b.f1993c, new ce((no) this, (cr) this, (cw) this, this.f1984b.f1999i.f1339b, this.f1984b.f1999i.f1344g, this.f1984b.f1995e, this.f1984b.f1999i.f1359v));
        }
    }

    public final void mo987g() {
        je.m2475a("stopLoading must be called on the main UI thread.");
        if (this.f1984b.f1999i != null) {
            this.f1984b.f1999i.f1339b.stopLoading();
            this.f1984b.f1999i = null;
        }
        if (this.f1984b.f1997g != null) {
            this.f1984b.f1997g.m1873e();
        }
    }

    public final void mo988h() {
        je.m2475a("recordManualImpression must be called on the main UI thread.");
        if (this.f1984b.f1999i == null) {
            gb.m2069a("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        gb.m2071a(3);
        if (this.f1984b.f1999i.f1343f != null) {
            fo.m1994a(this.f1984b.f1993c, this.f1984b.f1995e.f1222b, this.f1984b.f1999i.f1343f);
        }
    }

    public final ak mo989i() {
        je.m2475a("getAdSize must be called on the main UI thread.");
        return this.f1984b.f1998h;
    }

    public final void mo990j() {
        mo998r();
    }

    public final void mo991k() {
        mo995o();
    }

    public final void mo992l() {
        mo997q();
    }

    public final void mo993m() {
        mo996p();
    }

    public final void mo994n() {
        if (this.f1984b.f1999i != null) {
            gb.m2069a("Mediation adapter " + this.f1984b.f1999i.f1351n + " refreshed, but mediation adapters should never refresh.");
        }
        m2708a(true);
        m2711s();
    }

    public final void mo995o() {
        this.f1986d.m1615a(this.f1984b.f1999i);
        if (this.f1984b.f1998h.f938e) {
            m2712t();
        }
        this.f1987e = false;
        gb.m2071a(4);
        if (this.f1984b.f1996f != null) {
            try {
                this.f1984b.f1996f.mo955a();
            } catch (Throwable e) {
                gb.m2070a("Could not call AdListener.onAdClosed().", e);
            }
        }
        fa faVar = this.f1984b.f2000j;
        synchronized (faVar.f1363c) {
            if (!(faVar.f1370j == -1 || faVar.f1362b.isEmpty())) {
                fb fbVar = (fb) faVar.f1362b.getLast();
                if (fbVar.f1374b == -1) {
                    fbVar.f1374b = SystemClock.elapsedRealtime();
                    faVar.f1361a.m1978a(faVar);
                }
            }
        }
    }

    public final void mo996p() {
        if (this.f1984b.f1998h.f938e) {
            m2708a(false);
        }
        this.f1987e = true;
        gb.m2071a(4);
        if (this.f1984b.f1996f != null) {
            try {
                this.f1984b.f1996f.mo959d();
            } catch (Throwable e) {
                gb.m2070a("Could not call AdListener.onAdOpened().", e);
            }
        }
    }

    public final void mo997q() {
        gb.m2071a(4);
        if (this.f1984b.f1996f != null) {
            try {
                this.f1984b.f1996f.mo957b();
            } catch (Throwable e) {
                gb.m2070a("Could not call AdListener.onAdLeftApplication().", e);
            }
        }
    }

    public final void mo998r() {
        if (this.f1984b.f1999i == null) {
            gb.m2069a("Ad state was null when trying to ping click URLs.");
            return;
        }
        gb.m2071a(3);
        fa faVar = this.f1984b.f2000j;
        synchronized (faVar.f1363c) {
            if (faVar.f1370j != -1) {
                fb fbVar = new fb();
                fbVar.f1373a = SystemClock.elapsedRealtime();
                faVar.f1362b.add(fbVar);
                faVar.f1368h++;
                fd fdVar = faVar.f1361a;
                ff c = fd.m1974c();
                synchronized (c.f1388a) {
                    c.f1389b++;
                }
                faVar.f1361a.m1978a(faVar);
            }
        }
        if (this.f1984b.f1999i.f1340c != null) {
            fo.m1994a(this.f1984b.f1993c, this.f1984b.f1995e.f1222b, this.f1984b.f1999i.f1340c);
        }
        if (this.f1984b.f1999i.f1352o != null && this.f1984b.f1999i.f1352o.f1058c != null) {
            bq.m1708a(this.f1984b.f1993c, this.f1984b.f1995e.f1222b, this.f1984b.f1999i, this.f1984b.f1992b, false, this.f1984b.f1999i.f1352o.f1058c);
        }
    }
}
