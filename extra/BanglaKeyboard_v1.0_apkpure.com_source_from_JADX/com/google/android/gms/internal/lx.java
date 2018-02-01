package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.fragment.WalletFragmentInitParams;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public interface lx extends IInterface {
    C0204n mo942a(C0204n c0204n, C0204n c0204n2, Bundle bundle);

    void mo943a();

    void mo944a(int i, int i2, Intent intent);

    void mo945a(Bundle bundle);

    void mo946a(C0204n c0204n, WalletFragmentOptions walletFragmentOptions, Bundle bundle);

    void mo947a(MaskedWalletRequest maskedWalletRequest);

    void mo948a(WalletFragmentInitParams walletFragmentInitParams);

    void mo949a(boolean z);

    void mo950b();

    void mo951b(Bundle bundle);

    void mo952c();

    void mo953d();

    int mo954e();
}
