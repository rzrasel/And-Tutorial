package android.support.design.widget;

import android.support.v4.p018f.C0477m;
import android.support.v4.p018f.C0498k.C0495a;
import android.support.v4.p018f.C0498k.C0496b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

final class C0239g<T> {
    final C0495a<ArrayList<T>> f1004a = new C0496b(10);
    final C0477m<T, ArrayList<T>> f1005b = new C0477m();
    private final ArrayList<T> f1006c = new ArrayList();
    private final HashSet<T> f1007d = new HashSet();

    C0239g() {
    }

    private void m639a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (hashSet.contains(t)) {
                throw new RuntimeException("This graph contains cyclic dependencies");
            }
            hashSet.add(t);
            ArrayList arrayList2 = (ArrayList) this.f1005b.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    m639a(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
        }
    }

    final ArrayList<T> m640a() {
        this.f1006c.clear();
        this.f1007d.clear();
        int size = this.f1005b.size();
        for (int i = 0; i < size; i++) {
            m639a(this.f1005b.m1249b(i), this.f1006c, this.f1007d);
        }
        return this.f1006c;
    }

    final void m641a(T t) {
        if (!this.f1005b.containsKey(t)) {
            this.f1005b.put(t, null);
        }
    }

    final List m642b(T t) {
        return (List) this.f1005b.get(t);
    }
}
