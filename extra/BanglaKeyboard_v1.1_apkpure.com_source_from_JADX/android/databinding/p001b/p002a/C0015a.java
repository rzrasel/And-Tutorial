package android.databinding.p001b.p002a;

import android.view.View;
import android.view.View.OnClickListener;

public final class C0015a implements OnClickListener {
    final C0014a f10a;
    final int f11b = 1;

    public interface C0014a {
        void mo2378a(View view);
    }

    public C0015a(C0014a c0014a) {
        this.f10a = c0014a;
    }

    public final void onClick(View view) {
        this.f10a.mo2378a(view);
    }
}
