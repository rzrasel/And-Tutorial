package com.google.android.gms.ads.mediation;

import android.os.Bundle;

public interface MediationAdapter {

    public static class zza {
        private int f4458a;

        public final zza zzaf(int i) {
            this.f4458a = 1;
            return this;
        }

        public final Bundle zztm() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.f4458a);
            return bundle;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
