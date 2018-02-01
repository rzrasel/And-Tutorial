package android.support.transition;

import android.support.transition.C0359y.C0358a;
import android.support.v4.p018f.C0478a;
import android.support.v4.view.C0679r;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public final class ae {
    private static Transition f1267a = new AutoTransition();
    private static ThreadLocal<WeakReference<C0478a<ViewGroup, ArrayList<Transition>>>> f1268b = new ThreadLocal();
    private static ArrayList<ViewGroup> f1269c = new ArrayList();

    private static class C0322a implements OnAttachStateChangeListener, OnPreDrawListener {
        Transition f1265a;
        ViewGroup f1266b;

        C0322a(Transition transition, ViewGroup viewGroup) {
            this.f1265a = transition;
            this.f1266b = viewGroup;
        }

        private void m884a() {
            this.f1266b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f1266b.removeOnAttachStateChangeListener(this);
        }

        public final boolean onPreDraw() {
            m884a();
            if (ae.f1269c.remove(this.f1266b)) {
                ArrayList arrayList;
                final C0478a a = ae.m885a();
                ArrayList arrayList2 = (ArrayList) a.get(this.f1266b);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    a.put(this.f1266b, arrayList2);
                    arrayList = arrayList2;
                    arrayList2 = null;
                } else if (arrayList2.size() > 0) {
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    arrayList = arrayList2;
                    arrayList2 = arrayList3;
                } else {
                    arrayList = arrayList2;
                    arrayList2 = null;
                }
                arrayList.add(this.f1265a);
                this.f1265a.mo209a(new ad(this) {
                    final /* synthetic */ C0322a f1264b;

                    public final void mo221a(Transition transition) {
                        ((ArrayList) a.get(this.f1264b.f1266b)).remove(transition);
                    }
                });
                this.f1265a.m311a(this.f1266b, false);
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((Transition) it.next()).mo218d(this.f1266b);
                    }
                }
                this.f1265a.m309a(this.f1266b);
            }
            return true;
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            m884a();
            ae.f1269c.remove(this.f1266b);
            ArrayList arrayList = (ArrayList) ae.m885a().get(this.f1266b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo218d(this.f1266b);
                }
            }
            this.f1265a.m312a(true);
        }
    }

    static C0478a<ViewGroup, ArrayList<Transition>> m885a() {
        WeakReference weakReference = (WeakReference) f1268b.get();
        if (weakReference == null || weakReference.get() == null) {
            weakReference = new WeakReference(new C0478a());
            f1268b.set(weakReference);
        }
        return (C0478a) weakReference.get();
    }

    public static void m886a(ViewGroup viewGroup, Transition transition) {
        if (!f1269c.contains(viewGroup) && C0679r.m1952y(viewGroup)) {
            f1269c.add(viewGroup);
            if (transition == null) {
                transition = f1267a;
            }
            Transition f = transition.mo219f();
            ArrayList arrayList = (ArrayList) m885a().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo216c((View) viewGroup);
                }
            }
            if (f != null) {
                f.m311a(viewGroup, true);
            }
            aa a = aa.m874a(viewGroup);
            if (!(a == null || aa.m874a(a.f1247a) != a || a.f1248b == null)) {
                a.f1248b.run();
            }
            viewGroup.setTag(C0358a.transition_current_scene, null);
            if (f != null && viewGroup != null) {
                Object c0322a = new C0322a(f, viewGroup);
                viewGroup.addOnAttachStateChangeListener(c0322a);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(c0322a);
            }
        }
    }
}
