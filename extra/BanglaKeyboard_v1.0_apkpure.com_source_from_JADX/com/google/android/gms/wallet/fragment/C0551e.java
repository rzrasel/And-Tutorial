package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.C0263d;
import com.google.android.gms.common.C0247f;
import com.google.android.gms.common.C0250h;
import com.google.android.gms.internal.mi;
import com.google.android.gms.p007a.C0191b;
import com.google.android.gms.p007a.C0192r;

final class C0551e extends C0191b implements OnClickListener {
    final /* synthetic */ SupportWalletFragment f2511d;

    private C0551e(SupportWalletFragment supportWalletFragment) {
        this.f2511d = supportWalletFragment;
    }

    protected final void mo1342a(FrameLayout frameLayout) {
        int i = -1;
        int i2 = -2;
        View button = new Button(this.f2511d.f2490f.getActivity());
        button.setText(C0263d.wallet_buy_button_place_holder);
        if (this.f2511d.f2491g != null) {
            WalletFragmentStyle c = this.f2511d.f2491g.m3789c();
            if (c != null) {
                DisplayMetrics displayMetrics = this.f2511d.f2490f.getResources().getDisplayMetrics();
                i = c.m3794a("buyButtonWidth", displayMetrics, -1);
                i2 = c.m3794a("buyButtonHeight", displayMetrics, -2);
            }
        }
        button.setLayoutParams(new LayoutParams(i, i2));
        button.setOnClickListener(this);
        frameLayout.addView(button);
    }

    protected final void mo1183a(C0192r c0192r) {
        Activity activity = this.f2511d.f2490f.getActivity();
        if (this.f2511d.f2485a == null && this.f2511d.f2486b && activity != null) {
            try {
                C0550d b;
                this.f2511d.f2485a = new C0550d(mi.m2615a(activity, this.f2511d.f2487c, this.f2511d.f2491g, this.f2511d.f2489e));
                this.f2511d.f2491g = null;
                c0192r.mo663a(this.f2511d.f2485a);
                if (this.f2511d.f2492h != null) {
                    b = this.f2511d.f2485a;
                    try {
                        b.f2510a.mo948a(this.f2511d.f2492h);
                        this.f2511d.f2492h = null;
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                }
                if (this.f2511d.f2493i != null) {
                    b = this.f2511d.f2485a;
                    try {
                        b.f2510a.mo947a(this.f2511d.f2493i);
                        this.f2511d.f2493i = null;
                    } catch (Throwable e2) {
                        throw new RuntimeException(e2);
                    }
                }
                if (this.f2511d.f2494j != null) {
                    b = this.f2511d.f2485a;
                    try {
                        b.f2510a.mo949a(this.f2511d.f2494j.booleanValue());
                        this.f2511d.f2494j = null;
                    } catch (Throwable e22) {
                        throw new RuntimeException(e22);
                    }
                }
            } catch (C0247f e3) {
            }
        }
    }

    public final void onClick(View view) {
        Activity activity = this.f2511d.f2490f.getActivity();
        C0250h.m1005a(C0250h.m1002a((Context) activity), activity);
    }
}
