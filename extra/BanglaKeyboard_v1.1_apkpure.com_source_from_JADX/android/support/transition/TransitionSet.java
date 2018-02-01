package android.support.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.transition.Transition.C0277c;
import android.support.v4.content.p015a.C0438c;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class TransitionSet extends Transition {
    private ArrayList<Transition> f1118i = new ArrayList();
    private boolean f1119j = true;
    private int f1120k;
    private boolean f1121l = false;

    static class C0315a extends ad {
        TransitionSet f1230a;

        C0315a(TransitionSet transitionSet) {
            this.f1230a = transitionSet;
        }

        public final void mo221a(Transition transition) {
            TransitionSet.m749b(this.f1230a);
            if (this.f1230a.f1120k == 0) {
                this.f1230a.f1121l = false;
                this.f1230a.m324d();
            }
            transition.mo213b((C0277c) this);
        }

        public final void mo223c() {
            if (!this.f1230a.f1121l) {
                this.f1230a.m321c();
                this.f1230a.f1121l = true;
            }
        }
    }

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.f1260i);
        m754a(C0438c.m1161a(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    static /* synthetic */ int m749b(TransitionSet transitionSet) {
        int i = transitionSet.f1120k - 1;
        transitionSet.f1120k = i;
        return i;
    }

    public final /* synthetic */ Transition mo207a(long j) {
        return m764c(j);
    }

    public final /* synthetic */ Transition mo208a(TimeInterpolator timeInterpolator) {
        return m760b(timeInterpolator);
    }

    public final TransitionSet m754a(int i) {
        switch (i) {
            case 0:
                this.f1119j = true;
                break;
            case 1:
                this.f1119j = false;
                break;
            default:
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    final String mo210a(String str) {
        String a = super.mo210a(str);
        int i = 0;
        while (i < this.f1118i.size()) {
            String str2 = a + "\n" + ((Transition) this.f1118i.get(i)).mo210a(str + "  ");
            i++;
            a = str2;
        }
        return a;
    }

    public final void mo83a(ah ahVar) {
        if (m320b(ahVar.f1274b)) {
            Iterator it = this.f1118i.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.m320b(ahVar.f1274b)) {
                    transition.mo83a(ahVar);
                    ahVar.f1275c.add(transition);
                }
            }
        }
    }

    protected final void mo211a(ViewGroup viewGroup, ai aiVar, ai aiVar2, ArrayList<ah> arrayList, ArrayList<ah> arrayList2) {
        long j = this.f554a;
        int size = this.f1118i.size();
        int i = 0;
        while (i < size) {
            Transition transition = (Transition) this.f1118i.get(i);
            if (j > 0 && (this.f1119j || i == 0)) {
                long j2 = transition.f554a;
                if (j2 > 0) {
                    transition.mo212b(j2 + j);
                } else {
                    transition.mo212b(j);
                }
            }
            transition.mo211a(viewGroup, aiVar, aiVar2, arrayList, arrayList2);
            i++;
        }
    }

    public final TransitionSet m760b(TimeInterpolator timeInterpolator) {
        return (TransitionSet) super.mo208a(timeInterpolator);
    }

    public final TransitionSet m761b(Transition transition) {
        this.f1118i.add(transition);
        transition.f558e = this;
        if (this.b >= 0) {
            transition.mo207a(this.b);
        }
        return this;
    }

    protected final void mo214b() {
        if (this.f1118i.isEmpty()) {
            m321c();
            m324d();
            return;
        }
        C0277c c0315a = new C0315a(this);
        Iterator it = this.f1118i.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).mo209a(c0315a);
        }
        this.f1120k = this.f1118i.size();
        if (this.f1119j) {
            Iterator it2 = this.f1118i.iterator();
            while (it2.hasNext()) {
                ((Transition) it2.next()).mo214b();
            }
            return;
        }
        for (int i = 1; i < this.f1118i.size(); i++) {
            final Transition transition = (Transition) this.f1118i.get(i);
            ((Transition) this.f1118i.get(i - 1)).mo209a(new ad(this) {
                final /* synthetic */ TransitionSet f1229b;

                public final void mo221a(Transition transition) {
                    transition.mo214b();
                    transition.mo213b((C0277c) this);
                }
            });
        }
        Transition transition2 = (Transition) this.f1118i.get(0);
        if (transition2 != null) {
            transition2.mo214b();
        }
    }

    public final void mo84b(ah ahVar) {
        if (m320b(ahVar.f1274b)) {
            Iterator it = this.f1118i.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.m320b(ahVar.f1274b)) {
                    transition.mo84b(ahVar);
                    ahVar.f1275c.add(transition);
                }
            }
        }
    }

    public final TransitionSet m764c(long j) {
        super.mo207a(j);
        if (this.b >= 0) {
            int size = this.f1118i.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.f1118i.get(i)).mo207a(j);
            }
        }
        return this;
    }

    final void mo215c(ah ahVar) {
        super.mo215c(ahVar);
        int size = this.f1118i.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f1118i.get(i)).mo215c(ahVar);
        }
    }

    public final void mo216c(View view) {
        super.mo216c(view);
        int size = this.f1118i.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f1118i.get(i)).mo216c(view);
        }
    }

    public /* synthetic */ Object clone() {
        return mo219f();
    }

    public final void mo218d(View view) {
        super.mo218d(view);
        int size = this.f1118i.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f1118i.get(i)).mo218d(view);
        }
    }

    public final Transition mo219f() {
        TransitionSet transitionSet = (TransitionSet) super.mo219f();
        transitionSet.f1118i = new ArrayList();
        int size = this.f1118i.size();
        for (int i = 0; i < size; i++) {
            transitionSet.m761b(((Transition) this.f1118i.get(i)).mo219f());
        }
        return transitionSet;
    }
}
