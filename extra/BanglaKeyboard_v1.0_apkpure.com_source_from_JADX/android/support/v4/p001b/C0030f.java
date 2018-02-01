package android.support.v4.p001b;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

abstract class C0030f {
    C0036h f13b;
    C0037i f14c;
    C0039k f15d;

    C0030f() {
    }

    public static boolean m11a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    protected abstract int mo134a();

    protected abstract int mo135a(Object obj);

    protected abstract Object mo136a(int i, int i2);

    protected abstract Object mo137a(int i, Object obj);

    protected abstract void mo138a(int i);

    protected abstract void mo139a(Object obj, Object obj2);

    public final Object[] m18a(Object[] objArr, int i) {
        int a = mo134a();
        Object[] objArr2 = objArr.length < a ? (Object[]) Array.newInstance(objArr.getClass().getComponentType(), a) : objArr;
        for (int i2 = 0; i2 < a; i2++) {
            objArr2[i2] = mo136a(i2, i);
        }
        if (objArr2.length > a) {
            objArr2[a] = null;
        }
        return objArr2;
    }

    protected abstract int mo140b(Object obj);

    protected abstract Map mo141b();

    public final Object[] m21b(int i) {
        int a = mo134a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo136a(i2, i);
        }
        return objArr;
    }

    protected abstract void mo142c();
}
