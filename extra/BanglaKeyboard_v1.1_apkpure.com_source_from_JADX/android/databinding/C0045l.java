package android.databinding;

import android.view.View;
import android.view.ViewStub;
import android.view.ViewStub.OnInflateListener;

public final class C0045l {
    ViewStub f55a;
    public C0043k f56b;
    View f57c;
    OnInflateListener f58d;
    public C0043k f59e;
    private OnInflateListener f60f = new C00441(this);

    class C00441 implements OnInflateListener {
        final /* synthetic */ C0045l f54a;

        C00441(C0045l c0045l) {
            this.f54a = c0045l;
        }

        public final void onInflate(ViewStub viewStub, View view) {
            this.f54a.f57c = view;
            this.f54a.f56b = C0021e.m19a(this.f54a.f59e.f45e, view, viewStub.getLayoutResource());
            this.f54a.f55a = null;
            if (this.f54a.f58d != null) {
                this.f54a.f58d.onInflate(viewStub, view);
                this.f54a.f58d = null;
            }
            this.f54a.f59e.mo2376d();
            this.f54a.f59e.mo2375c();
        }
    }

    public C0045l(ViewStub viewStub) {
        this.f55a = viewStub;
        this.f55a.setOnInflateListener(this.f60f);
    }
}
