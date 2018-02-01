package com.google.android.gms.maps.p013a;

import android.os.Bundle;
import android.os.Parcelable;

public final class ch {
    private ch() {
    }

    public static void m2946a(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(ch.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(ch.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
