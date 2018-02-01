package android.support.v7.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class C0852b {
    Object f2574c;
    boolean f2575d;

    public interface C0806a {
        void mo747a(C0852b c0852b);

        boolean mo748a(C0852b c0852b, Menu menu);

        boolean mo749a(C0852b c0852b, MenuItem menuItem);

        boolean mo750b(C0852b c0852b, Menu menu);
    }

    public abstract MenuInflater mo826a();

    public abstract void mo827a(int i);

    public abstract void mo828a(View view);

    public abstract void mo829a(CharSequence charSequence);

    public void mo830a(boolean z) {
        this.f2575d = z;
    }

    public abstract Menu mo831b();

    public abstract void mo832b(int i);

    public abstract void mo833b(CharSequence charSequence);

    public abstract void mo834c();

    public abstract void mo835d();

    public abstract CharSequence mo836f();

    public abstract CharSequence mo837g();

    public boolean mo838h() {
        return false;
    }

    public abstract View mo839i();
}
