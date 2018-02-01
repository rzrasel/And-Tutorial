package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.C1113e;
import com.bumptech.glide.C1164h;
import com.bumptech.glide.p042h.C1163h;
import java.util.HashSet;

@TargetApi(11)
public final class C1385j extends Fragment {
    final C1376a f3854a;
    final C1373l f3855b;
    C1164h f3856c;
    private final HashSet<C1385j> f3857d;
    private C1385j f3858e;

    private class C1384a implements C1373l {
        final /* synthetic */ C1385j f3853a;

        private C1384a(C1385j c1385j) {
            this.f3853a = c1385j;
        }
    }

    public C1385j() {
        this(new C1376a());
    }

    @SuppressLint({"ValidFragment"})
    private C1385j(C1376a c1376a) {
        this.f3855b = new C1384a();
        this.f3857d = new HashSet();
        this.f3854a = c1376a;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f3858e = C1386k.m3572a().m3578a(getActivity().getFragmentManager());
            if (this.f3858e != this) {
                this.f3858e.f3857d.add(this);
            }
        } catch (Throwable e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f3854a.m3565c();
    }

    public final void onDetach() {
        super.onDetach();
        if (this.f3858e != null) {
            this.f3858e.f3857d.remove(this);
            this.f3858e = null;
        }
    }

    public final void onLowMemory() {
        if (this.f3856c != null) {
            this.f3856c.m3161a();
        }
    }

    public final void onStart() {
        super.onStart();
        this.f3854a.m3562a();
    }

    public final void onStop() {
        super.onStop();
        this.f3854a.m3564b();
    }

    public final void onTrimMemory(int i) {
        if (this.f3856c != null) {
            C1113e c1113e = this.f3856c.f3456d;
            C1163h.m3154a();
            c1113e.f3326c.mo1355a(i);
            c1113e.f3325b.mo1344a(i);
        }
    }
}
