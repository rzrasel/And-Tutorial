package android.support.v7.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.content.C0392a;
import android.support.v4.view.C0679r;
import android.support.v7.p028h.C0892b;
import android.support.v7.p028h.C0892b.C0886a;
import android.support.v7.p028h.C0892b.C0888b;
import android.support.v7.p028h.C0892b.C0888b.C08871;
import android.support.v7.preference.C0927c.C0926d;
import android.support.v7.preference.C0935f.C0934d;
import android.support.v7.preference.Preference.C0904a;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class C0925b extends Adapter<C0930e> implements C0904a {
    private PreferenceGroup f2850a;
    private List<Preference> f2851b;
    private List<Preference> f2852c;
    private List<C0924a> f2853d;
    private C0924a f2854e = new C0924a();
    private Handler f2855f = new Handler();
    private Runnable f2856g = new C09221(this);

    class C09221 implements Runnable {
        final /* synthetic */ C0925b f2842a;

        C09221(C0925b c0925b) {
            this.f2842a = c0925b;
        }

        public final void run() {
            this.f2842a.m2705a();
        }
    }

    private static class C0924a {
        int f2847a;
        int f2848b;
        String f2849c;

        public C0924a(C0924a c0924a) {
            this.f2847a = c0924a.f2847a;
            this.f2848b = c0924a.f2848b;
            this.f2849c = c0924a.f2849c;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C0924a)) {
                return false;
            }
            C0924a c0924a = (C0924a) obj;
            return this.f2847a == c0924a.f2847a && this.f2848b == c0924a.f2848b && TextUtils.equals(this.f2849c, c0924a.f2849c);
        }

        public final int hashCode() {
            return ((((this.f2847a + 527) * 31) + this.f2848b) * 31) + this.f2849c.hashCode();
        }
    }

    public C0925b(PreferenceGroup preferenceGroup) {
        this.f2850a = preferenceGroup;
        this.f2850a.f2746v = this;
        this.f2851b = new ArrayList();
        this.f2852c = new ArrayList();
        this.f2853d = new ArrayList();
        if (this.f2850a instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) this.f2850a).f2820b);
        } else {
            setHasStableIds(true);
        }
        m2705a();
    }

    private static C0924a m2704a(Preference preference, C0924a c0924a) {
        if (c0924a == null) {
            c0924a = new C0924a();
        }
        c0924a.f2849c = preference.getClass().getName();
        c0924a.f2847a = preference.f2744t;
        c0924a.f2848b = preference.f2745u;
        return c0924a;
    }

    private void m2705a() {
        for (Preference preference : this.f2852c) {
            preference.f2746v = null;
        }
        List<Preference> arrayList = new ArrayList(this.f2852c.size());
        m2707a((List) arrayList, this.f2850a);
        final List arrayList2 = new ArrayList(arrayList.size());
        for (Preference preference2 : arrayList) {
            if (preference2.f2743s) {
                arrayList2.add(preference2);
            }
        }
        final List list = this.f2851b;
        this.f2851b = arrayList2;
        this.f2852c = arrayList;
        C0927c c0927c = this.f2850a.f2735k;
        if (c0927c == null || c0927c.f2860d == null) {
            notifyDataSetChanged();
        } else {
            final C0926d c0926d = c0927c.f2860d;
            C0888b a = C0892b.m2575a(new C0886a(this) {
                final /* synthetic */ C0925b f2846d;

                public final int mo883a() {
                    return list.size();
                }

                public final boolean mo884a(int i, int i2) {
                    C0926d c0926d = c0926d;
                    list.get(i);
                    arrayList2.get(i2);
                    return c0926d.m2710a();
                }

                public final int mo885b() {
                    return arrayList2.size();
                }

                public final boolean mo886b(int i, int i2) {
                    C0926d c0926d = c0926d;
                    list.get(i);
                    arrayList2.get(i2);
                    return c0926d.m2711b();
                }
            });
            a.m2574a(new C08871(a, this));
        }
        for (Preference preference22 : arrayList) {
            preference22.f2747w = false;
        }
    }

    private void m2707a(List<Preference> list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f2796a);
        }
        int i = preferenceGroup.mo873i();
        for (int i2 = 0; i2 < i; i2++) {
            Preference b = preferenceGroup.m2662b(i2);
            list.add(b);
            C0924a a = C0925b.m2704a(b, null);
            if (!this.f2853d.contains(a)) {
                this.f2853d.add(a);
            }
            if (b instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) b;
                if (preferenceGroup2.mo874j()) {
                    m2707a((List) list, preferenceGroup2);
                }
            }
            b.f2746v = this;
        }
    }

    public final Preference m2708a(int i) {
        return (i < 0 || i >= getItemCount()) ? null : (Preference) this.f2851b.get(i);
    }

    public final void mo887a(Preference preference) {
        int indexOf = this.f2851b.indexOf(preference);
        if (indexOf != -1) {
            notifyItemChanged(indexOf, preference);
        }
    }

    public final int getItemCount() {
        return this.f2851b.size();
    }

    public final long getItemId(int i) {
        return !hasStableIds() ? -1 : m2708a(i).f2736l;
    }

    public final int getItemViewType(int i) {
        this.f2854e = C0925b.m2704a(m2708a(i), this.f2854e);
        int indexOf = this.f2853d.indexOf(this.f2854e);
        if (indexOf != -1) {
            return indexOf;
        }
        indexOf = this.f2853d.size();
        this.f2853d.add(new C0924a(this.f2854e));
        return indexOf;
    }

    public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m2708a(i).mo858a((C0930e) viewHolder);
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0924a c0924a = (C0924a) this.f2853d.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(null, C0934d.BackgroundStyle);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0934d.BackgroundStyle_android_selectableItemBackground);
        if (drawable == null) {
            drawable = C0392a.getDrawable(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(c0924a.f2847a, viewGroup, false);
        if (inflate.getBackground() == null) {
            C0679r.m1912a(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            if (c0924a.f2848b != 0) {
                from.inflate(c0924a.f2848b, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C0930e(inflate);
    }
}
