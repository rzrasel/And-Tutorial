package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.v4.content.p015a.C0438c;
import android.support.v4.p018f.C0478a;
import android.support.v4.p018f.C0481c;
import android.support.v4.p018f.C0484f;
import android.support.v4.view.C0679r;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import org.xmlpull.v1.XmlPullParser;

public abstract class Transition implements Cloneable {
    private static ThreadLocal<C0478a<Animator, C0312a>> f542A = new ThreadLocal();
    private static final int[] f543i = new int[]{2, 1, 3, 4};
    private static final PathMotion f544j = new C03091();
    private ViewGroup f545B = null;
    private ArrayList<Animator> f546C = new ArrayList();
    private int f547D = 0;
    private boolean f548E = false;
    private boolean f549F = false;
    private ArrayList<C0277c> f550G = null;
    private ArrayList<Animator> f551H = new ArrayList();
    private C0313b f552I;
    private C0478a<String, String> f553J;
    long f554a = -1;
    long f555b = -1;
    ArrayList<Integer> f556c = new ArrayList();
    ArrayList<View> f557d = new ArrayList();
    TransitionSet f558e = null;
    boolean f559f = false;
    af f560g;
    PathMotion f561h = f544j;
    private String f562k = getClass().getName();
    private TimeInterpolator f563l = null;
    private ArrayList<String> f564m = null;
    private ArrayList<Class> f565n = null;
    private ArrayList<Integer> f566o = null;
    private ArrayList<View> f567p = null;
    private ArrayList<Class> f568q = null;
    private ArrayList<String> f569r = null;
    private ArrayList<Integer> f570s = null;
    private ArrayList<View> f571t = null;
    private ArrayList<Class> f572u = null;
    private ai f573v = new ai();
    private ai f574w = new ai();
    private int[] f575x = f543i;
    private ArrayList<ah> f576y;
    private ArrayList<ah> f577z;

    public interface C0277c {
        void mo220a();

        void mo221a(Transition transition);

        void mo222b();

        void mo223c();
    }

    static class C03091 extends PathMotion {
        C03091() {
        }

        public final Path mo206a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    class C03113 extends AnimatorListenerAdapter {
        final /* synthetic */ Transition f1222a;

        C03113(Transition transition) {
            this.f1222a = transition;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f1222a.m324d();
            animator.removeListener(this);
        }
    }

    private static class C0312a {
        View f1223a;
        String f1224b;
        ah f1225c;
        be f1226d;
        Transition f1227e;

        C0312a(View view, String str, Transition transition, be beVar, ah ahVar) {
            this.f1223a = view;
            this.f1224b = str;
            this.f1225c = ahVar;
            this.f1226d = beVar;
            this.f1227e = transition;
        }
    }

    public static abstract class C0313b {
        public abstract Rect m861a();
    }

    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.f1254c);
        XmlPullParser xmlPullParser = (XmlResourceParser) attributeSet;
        long a = (long) C0438c.m1161a(obtainStyledAttributes, xmlPullParser, "duration", 1, -1);
        if (a >= 0) {
            mo207a(a);
        }
        a = (long) C0438c.m1161a(obtainStyledAttributes, xmlPullParser, "startDelay", 2, -1);
        if (a > 0) {
            mo212b(a);
        }
        int a2 = C0438c.m1160a(obtainStyledAttributes, xmlPullParser, "interpolator", 0);
        if (a2 > 0) {
            mo208a(AnimationUtils.loadInterpolator(context, a2));
        }
        String b = C0438c.m1170b(obtainStyledAttributes, xmlPullParser, "matchOrder", 3);
        if (b != null) {
            m296a(m299b(b));
        }
        obtainStyledAttributes.recycle();
    }

    private void m294a(ai aiVar, ai aiVar2) {
        ah ahVar;
        int i;
        C0478a c0478a = new C0478a(aiVar.f1276a);
        C0478a c0478a2 = new C0478a(aiVar2.f1276a);
        for (int i2 : this.f575x) {
            View view;
            int size;
            int i3;
            View view2;
            ah ahVar2;
            ah ahVar3;
            switch (i2) {
                case 1:
                    for (int size2 = c0478a.size() - 1; size2 >= 0; size2--) {
                        view = (View) c0478a.m1249b(size2);
                        if (view != null && m320b(view)) {
                            ahVar = (ah) c0478a2.remove(view);
                            if (!(ahVar == null || ahVar.f1274b == null || !m320b(ahVar.f1274b))) {
                                this.f576y.add((ah) c0478a.m1251d(size2));
                                this.f577z.add(ahVar);
                            }
                        }
                    }
                    break;
                case 2:
                    C0478a c0478a3 = aiVar.f1279d;
                    C0478a c0478a4 = aiVar2.f1279d;
                    size = c0478a3.size();
                    for (i3 = 0; i3 < size; i3++) {
                        view = (View) c0478a3.m1250c(i3);
                        if (view != null && m320b(view)) {
                            view2 = (View) c0478a4.get(c0478a3.m1249b(i3));
                            if (view2 != null && m320b(view2)) {
                                ahVar2 = (ah) c0478a.get(view);
                                ahVar3 = (ah) c0478a2.get(view2);
                                if (!(ahVar2 == null || ahVar3 == null)) {
                                    this.f576y.add(ahVar2);
                                    this.f577z.add(ahVar3);
                                    c0478a.remove(view);
                                    c0478a2.remove(view2);
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    SparseArray sparseArray = aiVar.f1277b;
                    SparseArray sparseArray2 = aiVar2.f1277b;
                    size = sparseArray.size();
                    for (i3 = 0; i3 < size; i3++) {
                        view = (View) sparseArray.valueAt(i3);
                        if (view != null && m320b(view)) {
                            view2 = (View) sparseArray2.get(sparseArray.keyAt(i3));
                            if (view2 != null && m320b(view2)) {
                                ahVar2 = (ah) c0478a.get(view);
                                ahVar3 = (ah) c0478a2.get(view2);
                                if (!(ahVar2 == null || ahVar3 == null)) {
                                    this.f576y.add(ahVar2);
                                    this.f577z.add(ahVar3);
                                    c0478a.remove(view);
                                    c0478a2.remove(view2);
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    C0484f c0484f = aiVar.f1278c;
                    C0484f c0484f2 = aiVar2.f1278c;
                    size = c0484f.m1281b();
                    for (i3 = 0; i3 < size; i3++) {
                        view = (View) c0484f.m1282b(i3);
                        if (view != null && m320b(view)) {
                            view2 = (View) c0484f2.m1278a(c0484f.m1277a(i3));
                            if (view2 != null && m320b(view2)) {
                                ahVar2 = (ah) c0478a.get(view);
                                ahVar3 = (ah) c0478a2.get(view2);
                                if (!(ahVar2 == null || ahVar3 == null)) {
                                    this.f576y.add(ahVar2);
                                    this.f577z.add(ahVar3);
                                    c0478a.remove(view);
                                    c0478a2.remove(view2);
                                }
                            }
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        for (i = 0; i < c0478a.size(); i++) {
            ahVar = (ah) c0478a.m1250c(i);
            if (m320b(ahVar.f1274b)) {
                this.f576y.add(ahVar);
                this.f577z.add(null);
            }
        }
        for (i = 0; i < c0478a2.size(); i++) {
            ahVar = (ah) c0478a2.m1250c(i);
            if (m320b(ahVar.f1274b)) {
                this.f577z.add(ahVar);
                this.f576y.add(null);
            }
        }
    }

    private static void m295a(ai aiVar, View view, ah ahVar) {
        aiVar.f1276a.put(view, ahVar);
        int id = view.getId();
        if (id >= 0) {
            if (aiVar.f1277b.indexOfKey(id) >= 0) {
                aiVar.f1277b.put(id, null);
            } else {
                aiVar.f1277b.put(id, view);
            }
        }
        String o = C0679r.m1942o(view);
        if (o != null) {
            if (aiVar.f1279d.containsKey(o)) {
                aiVar.f1279d.put(o, null);
            } else {
                aiVar.f1279d.put(o, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0484f c0484f = aiVar.f1278c;
                if (c0484f.f1541b) {
                    c0484f.m1279a();
                }
                if (C0481c.m1270a(c0484f.f1542c, c0484f.f1544e, itemIdAtPosition) >= 0) {
                    View view2 = (View) aiVar.f1278c.m1278a(itemIdAtPosition);
                    if (view2 != null) {
                        C0679r.m1919a(view2, false);
                        aiVar.f1278c.m1280a(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C0679r.m1919a(view, true);
                aiVar.f1278c.m1280a(itemIdAtPosition, view);
            }
        }
    }

    private void m296a(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f575x = f543i;
            return;
        }
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            Object obj = (i2 <= 0 || i2 > 4) ? null : 1;
            if (obj == null) {
                throw new IllegalArgumentException("matches contains invalid value");
            } else if (m298a(iArr, i)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            } else {
                i++;
            }
        }
        this.f575x = (int[]) iArr.clone();
    }

    private static boolean m297a(ah ahVar, ah ahVar2, String str) {
        Object obj = ahVar.f1273a.get(str);
        Object obj2 = ahVar2.f1273a.get(str);
        return !(obj == null && obj2 == null) && (obj == null || obj2 == null || !obj.equals(obj2));
    }

    private static boolean m298a(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    private static int[] m299b(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        Object obj = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                obj[i] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                obj[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                obj[i] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                obj[i] = 4;
            } else if (trim.isEmpty()) {
                Object obj2 = new int[(obj.length - 1)];
                System.arraycopy(obj, 0, obj2, 0, i);
                i--;
                obj = obj2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            }
            i++;
        }
        return obj;
    }

    private void m300c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            if (this.f566o != null && this.f566o.contains(Integer.valueOf(id))) {
                return;
            }
            if (this.f567p == null || !this.f567p.contains(view)) {
                int i;
                if (this.f568q != null) {
                    int size = this.f568q.size();
                    i = 0;
                    while (i < size) {
                        if (!((Class) this.f568q.get(i)).isInstance(view)) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    ah ahVar = new ah();
                    ahVar.f1274b = view;
                    if (z) {
                        mo83a(ahVar);
                    } else {
                        mo84b(ahVar);
                    }
                    ahVar.f1275c.add(this);
                    mo215c(ahVar);
                    if (z) {
                        m295a(this.f573v, view, ahVar);
                    } else {
                        m295a(this.f574w, view, ahVar);
                    }
                }
                if (!(view instanceof ViewGroup)) {
                    return;
                }
                if (this.f570s != null && this.f570s.contains(Integer.valueOf(id))) {
                    return;
                }
                if (this.f571t == null || !this.f571t.contains(view)) {
                    if (this.f572u != null) {
                        id = this.f572u.size();
                        i = 0;
                        while (i < id) {
                            if (!((Class) this.f572u.get(i)).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        m300c(viewGroup.getChildAt(i2), z);
                    }
                }
            }
        }
    }

    private static C0478a<Animator, C0312a> m301g() {
        C0478a<Animator, C0312a> c0478a = (C0478a) f542A.get();
        if (c0478a != null) {
            return c0478a;
        }
        c0478a = new C0478a();
        f542A.set(c0478a);
        return c0478a;
    }

    public Animator mo82a(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        return null;
    }

    public Transition mo207a(long j) {
        this.f555b = j;
        return this;
    }

    public Transition mo208a(TimeInterpolator timeInterpolator) {
        this.f563l = timeInterpolator;
        return this;
    }

    public Transition mo209a(C0277c c0277c) {
        if (this.f550G == null) {
            this.f550G = new ArrayList();
        }
        this.f550G.add(c0277c);
        return this;
    }

    public final ah m306a(View view, boolean z) {
        while (this.f558e != null) {
            this = this.f558e;
        }
        return (ah) (z ? this.f573v : this.f574w).f1276a.get(view);
    }

    String mo210a(String str) {
        int i = 0;
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f555b != -1) {
            str2 = str2 + "dur(" + this.f555b + ") ";
        }
        if (this.f554a != -1) {
            str2 = str2 + "dly(" + this.f554a + ") ";
        }
        if (this.f563l != null) {
            str2 = str2 + "interp(" + this.f563l + ") ";
        }
        if (this.f556c.size() <= 0 && this.f557d.size() <= 0) {
            return str2;
        }
        String str3;
        str2 = str2 + "tgts(";
        if (this.f556c.size() > 0) {
            str3 = str2;
            for (int i2 = 0; i2 < this.f556c.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f556c.get(i2);
            }
        } else {
            str3 = str2;
        }
        if (this.f557d.size() > 0) {
            while (i < this.f557d.size()) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f557d.get(i);
                i++;
            }
        }
        return str3 + ")";
    }

    public abstract void mo83a(ah ahVar);

    final void m309a(ViewGroup viewGroup) {
        this.f576y = new ArrayList();
        this.f577z = new ArrayList();
        m294a(this.f573v, this.f574w);
        C0478a g = m301g();
        int size = g.size();
        be b = au.m920b(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) g.m1249b(i);
            if (animator != null) {
                C0312a c0312a = (C0312a) g.get(animator);
                if (!(c0312a == null || c0312a.f1223a == null || !b.equals(c0312a.f1226d))) {
                    ah ahVar = c0312a.f1225c;
                    View view = c0312a.f1223a;
                    ah a = m306a(view, true);
                    ah b2 = m317b(view, true);
                    boolean z = !(a == null && b2 == null) && c0312a.f1227e.mo225a(ahVar, b2);
                    if (z) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            g.remove(animator);
                        }
                    }
                }
            }
        }
        mo211a(viewGroup, this.f573v, this.f574w, this.f576y, this.f577z);
        mo214b();
    }

    protected void mo211a(ViewGroup viewGroup, ai aiVar, ai aiVar2, ArrayList<ah> arrayList, ArrayList<ah> arrayList2) {
        int i;
        C0478a g = m301g();
        long j = Long.MAX_VALUE;
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ah ahVar = (ah) arrayList.get(i2);
            ah ahVar2 = (ah) arrayList2.get(i2);
            ah ahVar3 = (ahVar == null || ahVar.f1275c.contains(this)) ? ahVar : null;
            ah ahVar4 = (ahVar2 == null || ahVar2.f1275c.contains(this)) ? ahVar2 : null;
            if (ahVar3 != null || ahVar4 != null) {
                Object obj = (ahVar3 == null || ahVar4 == null || mo225a(ahVar3, ahVar4)) ? 1 : null;
                if (obj != null) {
                    Animator a = mo82a(viewGroup, ahVar3, ahVar4);
                    if (a != null) {
                        ah ahVar5;
                        View view;
                        Object obj2;
                        ahVar = null;
                        Animator animator;
                        if (ahVar4 != null) {
                            View view2 = ahVar4.f1274b;
                            String[] a2 = mo224a();
                            if (!(view2 == null || a2 == null || a2.length <= 0)) {
                                ah ahVar6 = new ah();
                                ahVar6.f1274b = view2;
                                ahVar = (ah) aiVar2.f1276a.get(view2);
                                if (ahVar != null) {
                                    for (i = 0; i < a2.length; i++) {
                                        ahVar6.f1273a.put(a2[i], ahVar.f1273a.get(a2[i]));
                                    }
                                }
                                int size2 = g.size();
                                for (i = 0; i < size2; i++) {
                                    C0312a c0312a = (C0312a) g.get((Animator) g.m1249b(i));
                                    if (c0312a.f1225c != null && c0312a.f1223a == view2 && c0312a.f1224b.equals(this.f562k) && c0312a.f1225c.equals(ahVar6)) {
                                        ahVar5 = ahVar6;
                                        view = view2;
                                        obj2 = null;
                                        break;
                                    }
                                }
                                ahVar = ahVar6;
                            }
                            ahVar5 = ahVar;
                            view = view2;
                            animator = a;
                        } else {
                            view = ahVar3.f1274b;
                            ahVar5 = null;
                            animator = a;
                        }
                        if (obj2 != null) {
                            if (this.f560g != null) {
                                long a3 = this.f560g.mo234a(viewGroup, this, ahVar3, ahVar4);
                                sparseIntArray.put(this.f551H.size(), (int) a3);
                                j = Math.min(a3, j);
                            }
                            g.put(obj2, new C0312a(view, this.f562k, this, au.m920b(viewGroup), ahVar5));
                            this.f551H.add(obj2);
                        }
                    }
                }
            }
        }
        if (j != 0) {
            for (i = 0; i < sparseIntArray.size(); i++) {
                Animator animator2 = (Animator) this.f551H.get(sparseIntArray.keyAt(i));
                animator2.setStartDelay((((long) sparseIntArray.valueAt(i)) - j) + animator2.getStartDelay());
            }
        }
    }

    final void m311a(ViewGroup viewGroup, boolean z) {
        int i;
        View findViewById;
        int i2 = 0;
        m312a(z);
        if ((this.f556c.size() > 0 || this.f557d.size() > 0) && ((this.f564m == null || this.f564m.isEmpty()) && (this.f565n == null || this.f565n.isEmpty()))) {
            ah ahVar;
            for (i = 0; i < this.f556c.size(); i++) {
                findViewById = viewGroup.findViewById(((Integer) this.f556c.get(i)).intValue());
                if (findViewById != null) {
                    ahVar = new ah();
                    ahVar.f1274b = findViewById;
                    if (z) {
                        mo83a(ahVar);
                    } else {
                        mo84b(ahVar);
                    }
                    ahVar.f1275c.add(this);
                    mo215c(ahVar);
                    if (z) {
                        m295a(this.f573v, findViewById, ahVar);
                    } else {
                        m295a(this.f574w, findViewById, ahVar);
                    }
                }
            }
            for (i = 0; i < this.f557d.size(); i++) {
                findViewById = (View) this.f557d.get(i);
                ahVar = new ah();
                ahVar.f1274b = findViewById;
                if (z) {
                    mo83a(ahVar);
                } else {
                    mo84b(ahVar);
                }
                ahVar.f1275c.add(this);
                mo215c(ahVar);
                if (z) {
                    m295a(this.f573v, findViewById, ahVar);
                } else {
                    m295a(this.f574w, findViewById, ahVar);
                }
            }
        } else {
            m300c(viewGroup, z);
        }
        if (!z && this.f553J != null) {
            int size = this.f553J.size();
            ArrayList arrayList = new ArrayList(size);
            for (i = 0; i < size; i++) {
                arrayList.add(this.f573v.f1279d.remove((String) this.f553J.m1249b(i)));
            }
            while (i2 < size) {
                findViewById = (View) arrayList.get(i2);
                if (findViewById != null) {
                    this.f573v.f1279d.put((String) this.f553J.m1250c(i2), findViewById);
                }
                i2++;
            }
        }
    }

    final void m312a(boolean z) {
        if (z) {
            this.f573v.f1276a.clear();
            this.f573v.f1277b.clear();
            this.f573v.f1278c.m1283c();
            return;
        }
        this.f574w.f1276a.clear();
        this.f574w.f1277b.clear();
        this.f574w.f1278c.m1283c();
    }

    public boolean mo225a(ah ahVar, ah ahVar2) {
        if (!(ahVar == null || ahVar2 == null)) {
            String[] a = mo224a();
            if (a != null) {
                for (String a2 : a) {
                    if (m297a(ahVar, ahVar2, a2)) {
                        return true;
                    }
                }
                return false;
            }
            for (String a3 : ahVar.f1273a.keySet()) {
                if (m297a(ahVar, ahVar2, a3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String[] mo224a() {
        return null;
    }

    public Transition mo212b(long j) {
        this.f554a = j;
        return this;
    }

    public Transition mo213b(C0277c c0277c) {
        if (this.f550G != null) {
            this.f550G.remove(c0277c);
            if (this.f550G.size() == 0) {
                this.f550G = null;
            }
        }
        return this;
    }

    final ah m317b(View view, boolean z) {
        while (this.f558e != null) {
            this = this.f558e;
        }
        ArrayList arrayList = z ? this.f576y : this.f577z;
        if (arrayList == null) {
            return null;
        }
        ah ahVar;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            ahVar = (ah) arrayList.get(i);
            if (ahVar == null) {
                return null;
            }
            if (ahVar.f1274b == view) {
                break;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            ahVar = (ah) (z ? this.f577z : this.f576y).get(i);
        } else {
            ahVar = null;
        }
        return ahVar;
    }

    protected void mo214b() {
        m321c();
        final C0478a g = m301g();
        Iterator it = this.f551H.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (g.containsKey(animator)) {
                m321c();
                if (animator != null) {
                    animator.addListener(new AnimatorListenerAdapter(this) {
                        final /* synthetic */ Transition f1221b;

                        public final void onAnimationEnd(Animator animator) {
                            g.remove(animator);
                            this.f1221b.f546C.remove(animator);
                        }

                        public final void onAnimationStart(Animator animator) {
                            this.f1221b.f546C.add(animator);
                        }
                    });
                    if (animator == null) {
                        m324d();
                    } else {
                        if (this.f555b >= 0) {
                            animator.setDuration(this.f555b);
                        }
                        if (this.f554a >= 0) {
                            animator.setStartDelay(this.f554a);
                        }
                        if (this.f563l != null) {
                            animator.setInterpolator(this.f563l);
                        }
                        animator.addListener(new C03113(this));
                        animator.start();
                    }
                }
            }
        }
        this.f551H.clear();
        m324d();
    }

    public abstract void mo84b(ah ahVar);

    final boolean m320b(View view) {
        int id = view.getId();
        if (this.f566o != null && this.f566o.contains(Integer.valueOf(id))) {
            return false;
        }
        if (this.f567p != null && this.f567p.contains(view)) {
            return false;
        }
        int i;
        if (this.f568q != null) {
            int size = this.f568q.size();
            for (i = 0; i < size; i++) {
                if (((Class) this.f568q.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f569r != null && C0679r.m1942o(view) != null && this.f569r.contains(C0679r.m1942o(view))) {
            return false;
        }
        if (this.f556c.size() == 0 && this.f557d.size() == 0 && ((this.f565n == null || this.f565n.isEmpty()) && (this.f564m == null || this.f564m.isEmpty()))) {
            return true;
        }
        if (this.f556c.contains(Integer.valueOf(id)) || this.f557d.contains(view)) {
            return true;
        }
        if (this.f564m != null && this.f564m.contains(C0679r.m1942o(view))) {
            return true;
        }
        if (this.f565n == null) {
            return false;
        }
        for (i = 0; i < this.f565n.size(); i++) {
            if (((Class) this.f565n.get(i)).isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    protected final void m321c() {
        if (this.f547D == 0) {
            if (this.f550G != null && this.f550G.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f550G.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C0277c) arrayList.get(i)).mo223c();
                }
            }
            this.f549F = false;
        }
        this.f547D++;
    }

    void mo215c(ah ahVar) {
        Object obj = null;
        if (this.f560g != null && !ahVar.f1273a.isEmpty()) {
            String[] a = this.f560g.mo233a();
            if (a != null) {
                for (Object containsKey : a) {
                    if (!ahVar.f1273a.containsKey(containsKey)) {
                        break;
                    }
                }
                int i = 1;
                if (obj == null) {
                    this.f560g.mo232a(ahVar);
                }
            }
        }
    }

    public void mo216c(View view) {
        if (!this.f549F) {
            C0478a g = m301g();
            int size = g.size();
            be b = au.m920b(view);
            for (int i = size - 1; i >= 0; i--) {
                C0312a c0312a = (C0312a) g.m1250c(i);
                if (c0312a.f1223a != null && b.equals(c0312a.f1226d)) {
                    C0320a.m871a((Animator) g.m1249b(i));
                }
            }
            if (this.f550G != null && this.f550G.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f550G.clone();
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C0277c) arrayList.get(i2)).mo220a();
                }
            }
            this.f548E = true;
        }
    }

    public /* synthetic */ Object clone() {
        return mo219f();
    }

    protected final void m324d() {
        this.f547D--;
        if (this.f547D == 0) {
            int i;
            View view;
            if (this.f550G != null && this.f550G.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f550G.clone();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C0277c) arrayList.get(i2)).mo221a(this);
                }
            }
            for (i = 0; i < this.f573v.f1278c.m1281b(); i++) {
                view = (View) this.f573v.f1278c.m1282b(i);
                if (view != null) {
                    C0679r.m1919a(view, false);
                }
            }
            for (i = 0; i < this.f574w.f1278c.m1281b(); i++) {
                view = (View) this.f574w.f1278c.m1282b(i);
                if (view != null) {
                    C0679r.m1919a(view, false);
                }
            }
            this.f549F = true;
        }
    }

    public void mo218d(View view) {
        if (this.f548E) {
            if (!this.f549F) {
                C0478a g = m301g();
                int size = g.size();
                be b = au.m920b(view);
                for (int i = size - 1; i >= 0; i--) {
                    C0312a c0312a = (C0312a) g.m1250c(i);
                    if (c0312a.f1223a != null && b.equals(c0312a.f1226d)) {
                        C0320a.m873b((Animator) g.m1249b(i));
                    }
                }
                if (this.f550G != null && this.f550G.size() > 0) {
                    ArrayList arrayList = (ArrayList) this.f550G.clone();
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C0277c) arrayList.get(i2)).mo222b();
                    }
                }
            }
            this.f548E = false;
        }
    }

    public final Rect m326e() {
        return this.f552I == null ? null : this.f552I.m861a();
    }

    public Transition mo219f() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f551H = new ArrayList();
            transition.f573v = new ai();
            transition.f574w = new ai();
            transition.f576y = null;
            transition.f577z = null;
            return transition;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String toString() {
        return mo210a("");
    }
}
