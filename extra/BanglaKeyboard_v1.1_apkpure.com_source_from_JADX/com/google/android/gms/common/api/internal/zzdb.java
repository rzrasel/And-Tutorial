package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.p018f.C0478a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public final class zzdb extends Fragment implements C1487b {
    private static WeakHashMap<FragmentActivity, WeakReference<zzdb>> f4525a = new WeakHashMap();
    private Map<String, LifecycleCallback> f4526b = new C0478a();
    private int f4527c = 0;
    private Bundle f4528d;

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f4526b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.f4526b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4527c = 1;
        this.f4528d = bundle;
        for (Entry entry : this.f4526b.entrySet()) {
            entry.getValue();
            if (bundle != null) {
                bundle.getBundle((String) entry.getKey());
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f4527c = 5;
        Iterator it = this.f4526b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f4527c = 3;
        Iterator it = this.f4526b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.f4526b.entrySet()) {
                Bundle bundle2 = new Bundle();
                entry.getValue();
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f4527c = 2;
        Iterator it = this.f4526b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f4527c = 4;
        Iterator it = this.f4526b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
