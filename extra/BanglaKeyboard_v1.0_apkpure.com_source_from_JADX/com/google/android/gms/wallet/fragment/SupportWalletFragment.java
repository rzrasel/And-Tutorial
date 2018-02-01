package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.C0250h;
import com.google.android.gms.p007a.C0191b;
import com.google.android.gms.p007a.C0210u;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class SupportWalletFragment extends Fragment {
    private C0550d f2485a;
    private boolean f2486b = false;
    private final C0210u f2487c = C0210u.m867a((Fragment) this);
    private final C0551e f2488d = new C0551e();
    private C0549c f2489e = new C0549c(this);
    private final Fragment f2490f = this;
    private WalletFragmentOptions f2491g;
    private WalletFragmentInitParams f2492h;
    private MaskedWalletRequest f2493i;
    private Boolean f2494j;

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f2485a != null) {
            try {
                this.f2485a.f2510a.mo944a(i, i2, intent);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
            WalletFragmentInitParams walletFragmentInitParams = (WalletFragmentInitParams) bundle.getParcelable("walletFragmentInitParams");
            if (walletFragmentInitParams != null) {
                if (this.f2492h != null) {
                    Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
                }
                this.f2492h = walletFragmentInitParams;
            }
            if (this.f2493i == null) {
                this.f2493i = (MaskedWalletRequest) bundle.getParcelable("maskedWalletRequest");
            }
            if (bundle.containsKey("walletFragmentOptions")) {
                this.f2491g = (WalletFragmentOptions) bundle.getParcelable("walletFragmentOptions");
            }
            if (bundle.containsKey("enabled")) {
                this.f2494j = Boolean.valueOf(bundle.getBoolean("enabled"));
            }
        } else if (this.f2490f.getArguments() != null) {
            WalletFragmentOptions walletFragmentOptions = (WalletFragmentOptions) this.f2490f.getArguments().getParcelable("extraWalletFragmentOptions");
            if (walletFragmentOptions != null) {
                walletFragmentOptions.m3787a(this.f2490f.getActivity());
                this.f2491g = walletFragmentOptions;
            }
        }
        this.f2486b = true;
        this.f2488d.m786a(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f2488d.m782a(layoutInflater, viewGroup, bundle);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f2486b = false;
    }

    public final void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        if (this.f2491g == null) {
            this.f2491g = WalletFragmentOptions.m3785a(activity, attributeSet);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("attrKeyWalletFragmentOptions", this.f2491g);
        this.f2488d.m785a(activity, bundle2, bundle);
    }

    public final void onPause() {
        super.onPause();
        this.f2488d.m791c();
    }

    public final void onResume() {
        super.onResume();
        this.f2488d.m789b();
        FragmentManager supportFragmentManager = this.f2490f.getActivity().getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("GooglePlayServicesErrorDialog");
        if (findFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(findFragmentByTag).commit();
            C0250h.m1005a(C0250h.m1002a(this.f2490f.getActivity()), this.f2490f.getActivity());
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
        this.f2488d.m790b(bundle);
        if (this.f2492h != null) {
            bundle.putParcelable("walletFragmentInitParams", this.f2492h);
            this.f2492h = null;
        }
        if (this.f2493i != null) {
            bundle.putParcelable("maskedWalletRequest", this.f2493i);
            this.f2493i = null;
        }
        if (this.f2491g != null) {
            bundle.putParcelable("walletFragmentOptions", this.f2491g);
            this.f2491g = null;
        }
        if (this.f2494j != null) {
            bundle.putBoolean("enabled", this.f2494j.booleanValue());
            this.f2494j = null;
        }
    }

    public final void onStart() {
        super.onStart();
        this.f2488d.m783a();
    }

    public final void onStop() {
        super.onStop();
        C0191b c0191b = this.f2488d;
        if (c0191b.f387a != null) {
            c0191b.f387a.mo1179d();
        } else {
            c0191b.m784a(4);
        }
    }
}
