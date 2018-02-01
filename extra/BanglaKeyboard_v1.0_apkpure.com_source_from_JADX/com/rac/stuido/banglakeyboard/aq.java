package com.rac.stuido.banglakeyboard;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import com.actionbarsherlock.C0126R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class aq {
    final ar f2652a;
    final ArrayList f2653b;
    final Handler f2654c = new Handler();
    Thread f2655d = new Thread(this.f2656e);
    final av f2656e = new av();
    WeakReference f2657f = null;
    WeakReference f2658g = null;
    private int f2659h = 0;

    aq(ar arVar, Context context) {
        this.f2652a = arVar;
        this.f2653b = new ArrayList();
        this.f2659h = C0126R.array.activity_000_icons;
        this.f2657f = new WeakReference(context);
        Resources resources = context.getResources();
        if (resources != null) {
            this.f2658g = new WeakReference(resources.obtainTypedArray(C0126R.array.activity_000_icons));
        }
    }

    public final void m3922a() {
        if (this.f2658g != null) {
            TypedArray typedArray = (TypedArray) this.f2658g.get();
            if (typedArray != null) {
                typedArray.recycle();
            }
        }
    }

    public final void m3923a(Resources resources) {
        m3922a();
        if (resources != null) {
            this.f2658g = new WeakReference(resources.obtainTypedArray(this.f2659h));
        }
    }
}
