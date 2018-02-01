package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.C0819a.C0813a;
import android.support.v7.view.C0852b;
import android.support.v7.view.C0852b.C0806a;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public abstract class C0810e {
    static int f2436a = -1;
    private static boolean f2437b = false;

    C0810e() {
    }

    public static C0810e m2268a(Activity activity, C0233d c0233d) {
        return C0810e.m2270a(activity, activity.getWindow(), c0233d);
    }

    public static C0810e m2269a(Dialog dialog, C0233d c0233d) {
        return C0810e.m2270a(dialog.getContext(), dialog.getWindow(), c0233d);
    }

    private static C0810e m2270a(Context context, Window window, C0233d c0233d) {
        return VERSION.SDK_INT >= 24 ? new C0834g(context, window, c0233d) : VERSION.SDK_INT >= 23 ? new C0833j(context, window, c0233d) : VERSION.SDK_INT >= 14 ? new C0832i(context, window, c0233d) : VERSION.SDK_INT >= 11 ? new C0831h(context, window, c0233d) : new AppCompatDelegateImplV9(context, window, c0233d);
    }

    public static boolean m2271l() {
        return f2437b;
    }

    public abstract ActionBar mo751a();

    public abstract C0852b mo760a(C0806a c0806a);

    public abstract <T extends View> T mo761a(int i);

    public abstract void mo762a(Configuration configuration);

    public abstract void mo763a(Bundle bundle);

    public abstract void mo764a(Toolbar toolbar);

    public abstract void mo765a(View view);

    public abstract void mo766a(View view, LayoutParams layoutParams);

    public abstract void mo752a(CharSequence charSequence);

    public abstract MenuInflater mo753b();

    public abstract void mo770b(int i);

    public abstract void mo754b(Bundle bundle);

    public abstract void mo771b(View view, LayoutParams layoutParams);

    public abstract void mo773c();

    public abstract boolean mo774c(int i);

    public abstract void mo755d();

    public abstract void mo756e();

    public abstract void mo777f();

    public abstract void mo778g();

    public abstract void mo757h();

    public abstract C0813a mo758i();

    public abstract void mo779j();

    public abstract boolean mo759k();
}
