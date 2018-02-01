package android.databinding.p001b.p002a;

import android.view.View;
import android.view.View.OnLongClickListener;

public final class C0017b implements OnLongClickListener {
    final C0016a f12a;
    final int f13b = 2;

    public interface C0016a {
        boolean mo2379a();
    }

    public C0017b(C0016a c0016a) {
        this.f12a = c0016a;
    }

    public final boolean onLongClick(View view) {
        return this.f12a.mo2379a();
    }
}
