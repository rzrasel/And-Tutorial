package android.support.transition;

import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.support.transition.C0337i.C0335a;
import android.support.transition.C0338g.C0336a;
import android.support.transition.C0340h.C0339a;
import android.view.View;
import android.view.ViewGroup;

final class C0341j {
    private static final C0335a f1345a;

    static {
        if (VERSION.SDK_INT >= 21) {
            f1345a = new C0339a();
        } else {
            f1345a = new C0336a();
        }
    }

    static C0337i m979a(View view, ViewGroup viewGroup, Matrix matrix) {
        return f1345a.mo254a(view, viewGroup, matrix);
    }

    static void m980a(View view) {
        f1345a.mo255a(view);
    }
}
