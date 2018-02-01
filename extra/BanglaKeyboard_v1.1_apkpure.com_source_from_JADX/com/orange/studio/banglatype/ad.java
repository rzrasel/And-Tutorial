package com.orange.studio.banglatype;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.databinding.C0021e;
import android.databinding.C0043k;
import android.databinding.ObservableInt;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.C1113e;
import com.bumptech.glide.load.C1145c;
import com.bumptech.glide.p036f.p037b.C1103i;
import com.bumptech.glide.p041g.C1144a;
import com.bumptech.glide.p041g.C1146b;
import com.orange.studio.banglatype.ac.C1701b;

public final class ad extends Adapter<aq> {
    private static final Object f8095e = new Object();
    private String f8096A;
    private String f8097B;
    private String f8098C;
    private String f8099D;
    protected int f8100a = R.layout.list_square_title_subtitle_01;
    boolean f8101b;
    final ObservableInt f8102c = new ObservableInt();
    az f8103d;
    private RecyclerView f8104f;
    private String[] f8105g;
    private String[] f8106h;
    private String[] f8107i;
    private TypedArray f8108j;
    private int f8109k;
    private int f8110l = R.attr.activity_wide_image_drawable;
    private int f8111m = R.attr.activity_wide_image_url;
    private int f8112n = 0;
    private int f8113o = 0;
    private int f8114p = R.attr.activity_square_image_drawable;
    private int f8115q = R.attr.activity_square_image_url;
    private ao f8116r;
    private final String f8117s;
    private C1743u[] f8118t;
    private int f8119u;
    private int f8120v = 10;
    private int f8121w = 10;
    private C0043k f8122x;
    private int f8123y;
    private int f8124z;

    public ad(Context context, ao aoVar, String str) {
        this.f8116r = aoVar;
        Resources resources = context.getResources();
        if (resources != null) {
            this.f8105g = resources.getStringArray(R.array.activity_000_titles);
            this.f8106h = resources.getStringArray(R.array.activity_000_subtitles);
            this.f8107i = resources.getStringArray(R.array.activity_000_descriptions);
            this.f8109k = R.array.activity_000_classes;
            try {
                this.f8108j = resources.obtainTypedArray(R.array.activity_000_icons_48dp);
            } catch (NotFoundException e) {
                this.f8108j = null;
            }
        }
        this.f8101b = false;
        this.f8117s = str;
    }

    private static C1145c m7274a(Context context, String str) {
        return str != null ? C1144a.m3121a(context) : null;
    }

    private static String m7275a(Context context, int i) {
        if (i == 0) {
            return null;
        }
        String f = bt.m7433f(context, i);
        return "".equals(f) ? null : f;
    }

    public static void m7276a() {
    }

    private static String m7277b(Context context, int i) {
        if (i == 0) {
            return null;
        }
        int d = bt.m7431d(context, i);
        return d != 0 ? bt.m7432e(context, d) : null;
    }

    public final int getItemCount() {
        return this.f8105g.length + this.f8123y;
    }

    public final long getItemId(int i) {
        return -1;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f8104f = recyclerView;
    }

    public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        Object a;
        aq aqVar = (aq) viewHolder;
        this.f8119u++;
        if (this.f8103d != null) {
            this.f8103d.m7217a(this.f8119u, getItemCount());
        }
        C0043k c0043k = aqVar.f8189a;
        c0043k.mo2374a(46, Integer.valueOf(8388611));
        c0043k.mo2374a(37, Integer.valueOf(aqVar.getAdapterPosition()));
        Context context = c0043k.f44d.getContext();
        if (bt.m7423a()) {
            c0043k.mo2374a(18, C0021e.m20a(LayoutInflater.from(context), this.f8100a, null));
        }
        if (i < this.f8105g.length) {
            bt.m7420a(context, C1735p.m7517a(context, this.f8109k, i));
        }
        if (this.f8101b && this.f8118t != null && i < this.f8118t.length && this.f8118t[i] == null) {
            this.f8118t[i] = new C1743u(this.f8120v);
        }
        if (this.f8103d != null) {
            this.f8103d.m7220b(i);
        }
        if (this.f8123y <= 0 || i < this.f8105g.length) {
            C1145c a2;
            int d;
            String str;
            C1145c a3;
            int d2;
            String str2;
            C1145c a4;
            int d3;
            String str3;
            Context context2 = c0043k.f44d.getContext();
            boolean z = this.f8101b;
            Context contextThemeWrapper = new ContextThemeWrapper(context2, bt.m7420a(context2, C1735p.m7517a(context2, this.f8109k, i)));
            int a5 = bt.m7419a(contextThemeWrapper, (int) R.attr.colorPrimary);
            String a6 = m7275a(contextThemeWrapper, this.f8111m);
            if (a6 != null) {
                a2 = C1146b.m3124a();
                d = bt.m7431d(contextThemeWrapper, this.f8110l);
                str = a6;
            } else {
                a6 = m7277b(contextThemeWrapper, this.f8110l);
                a2 = m7274a(contextThemeWrapper, a6);
                d = 0;
                str = a6;
            }
            a6 = m7275a(contextThemeWrapper, this.f8115q);
            if (a6 != null) {
                a3 = C1146b.m3124a();
                d2 = bt.m7431d(contextThemeWrapper, this.f8114p);
                str2 = a6;
            } else {
                a6 = m7277b(contextThemeWrapper, this.f8114p);
                a3 = m7274a(contextThemeWrapper, a6);
                d2 = 0;
                str2 = a6;
            }
            a6 = m7275a(contextThemeWrapper, this.f8113o);
            if (a6 != null) {
                a4 = C1146b.m3124a();
                d3 = bt.m7431d(contextThemeWrapper, this.f8112n);
                str3 = a6;
            } else {
                a6 = m7277b(contextThemeWrapper, this.f8112n);
                a4 = m7274a(contextThemeWrapper, a6);
                d3 = 0;
                str3 = a6;
            }
            int resourceId = this.f8108j != null ? this.f8108j.getResourceId(i, 0) : 0;
            C1701b c1701b = new C1701b();
            ((C1701b) ((C1701b) ((C1701b) ((C1701b) ((C1701b) ((C1701b) ((C1701b) ((C1701b) ((C1701b) ((C1701b) ((C1701b) c1701b.m7249a(this.f8105g[i])).m7252b(this.f8106h[i])).m7255c(this.f8107i[i])).m7251a(str, a2, d)).m7254b(str3, a4, d3)).m7256c(str2, a3, d2)).m7248a(resourceId)).m7233b(this.f8100a)).m7234c(a5)).m7231a(z)).m7230a(this.f8116r)).m7229a(context2);
            a = c1701b.m7257a();
            c0043k.mo2374a(25, a);
        } else {
            a = ((C1701b) ((C1701b) ((C1701b) ((C1701b) ((C1701b) ((C1701b) ((C1701b) ((C1701b) new C1701b().m7231a(this.f8101b)).m7249a(String.format(this.f8096A, new Object[]{Integer.valueOf(i)}))).m7252b(String.format(this.f8097B, new Object[]{Integer.valueOf(i)}))).m7255c(this.f8098C)).m7250a(String.format(this.f8099D, new Object[]{Integer.valueOf(this.f8124z + i)}), C1146b.m3124a())).m7253b(String.format(this.f8099D, new Object[]{Integer.valueOf(this.f8124z + i)}), C1146b.m3124a())).m7233b(this.f8100a)).m7230a(this.f8116r)).m7257a();
        }
        if (this.f8118t == null || i >= this.f8118t.length) {
            a.f = null;
        } else {
            a.f = this.f8118t[i];
        }
        a.e = null;
        a.j = aqVar.f8190b;
        c0043k.mo2374a(25, a);
        c0043k.m51b();
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        C0043k a = C0021e.m20a(LayoutInflater.from(context), this.f8100a, viewGroup);
        if (this.f8122x == null && !bt.m7423a()) {
            this.f8122x = C0021e.m20a(LayoutInflater.from(context), this.f8100a, viewGroup);
        }
        a.mo2374a(18, this.f8122x);
        a.mo2374a(47, this.f8102c);
        a.mo2374a(49, this.f8117s);
        return new aq(a);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f8104f = null;
    }

    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(ViewHolder viewHolder) {
        return super.onFailedToRecycleView((aq) viewHolder);
    }

    public final /* synthetic */ void onViewRecycled(ViewHolder viewHolder) {
        aq aqVar = (aq) viewHolder;
        this.f8119u--;
        C1113e.m3027a(new C1746y(aqVar));
        for (C1103i a : aqVar.f8190b) {
            C1113e.m3027a(a);
        }
        aqVar.f8190b.clear();
        if (aqVar.f8189a != null) {
            Context context = aqVar.itemView.getContext();
            View view;
            if (context instanceof am) {
                view = (ImageView) ((am) context).getItemImageViewFromBinding(aqVar.f8189a);
                if (view != null) {
                    C1113e.m3026a(view);
                }
            } else {
                view = (ImageView) aqVar.itemView.findViewById(R.id.itemImage);
                if (view != null) {
                    C1113e.m3026a(view);
                }
            }
        }
        super.onViewRecycled(aqVar);
    }
}
