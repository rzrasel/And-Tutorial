package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.bumptech.glide.C1164h;
import java.util.HashSet;

public class SupportRequestManagerFragment extends Fragment {
    C1164h f3839a;
    final C1376a f3840b;
    final C1373l f3841c;
    private final HashSet<SupportRequestManagerFragment> f3842d;
    private SupportRequestManagerFragment f3843e;

    private class C1374a implements C1373l {
        final /* synthetic */ SupportRequestManagerFragment f3838a;

        private C1374a(SupportRequestManagerFragment supportRequestManagerFragment) {
            this.f3838a = supportRequestManagerFragment;
        }
    }

    public SupportRequestManagerFragment() {
        this(new C1376a());
    }

    @SuppressLint({"ValidFragment"})
    private SupportRequestManagerFragment(C1376a c1376a) {
        this.f3841c = new C1374a();
        this.f3842d = new HashSet();
        this.f3840b = c1376a;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f3843e = C1386k.m3572a().m3577a(getActivity().getSupportFragmentManager());
            if (this.f3843e != this) {
                this.f3843e.f3842d.add(this);
            }
        } catch (Throwable e) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f3840b.m3565c();
    }

    public void onDetach() {
        super.onDetach();
        if (this.f3843e != null) {
            this.f3843e.f3842d.remove(this);
            this.f3843e = null;
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        if (this.f3839a != null) {
            this.f3839a.m3161a();
        }
    }

    public void onStart() {
        super.onStart();
        this.f3840b.m3562a();
    }

    public void onStop() {
        super.onStop();
        this.f3840b.m3564b();
    }
}
