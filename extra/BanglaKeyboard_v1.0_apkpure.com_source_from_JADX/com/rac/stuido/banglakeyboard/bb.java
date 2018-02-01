package com.rac.stuido.banglakeyboard;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.C0126R;
import java.lang.Thread.State;

public class bb extends BaseAdapter {
    protected final LayoutInflater f2674a;
    protected int f2675b;
    protected int f2676c;
    protected int f2677d;
    protected int f2678e;
    private final boolean f2679f;
    private int f2680g;
    private TypedArray f2681h;
    private String[] f2682i;
    private String[] f2683j;
    private aq f2684k = null;
    private final Context f2685l;
    private Bitmap f2686m = null;

    public bb(Context context) {
        this.f2685l = context;
        this.f2674a = LayoutInflater.from(context);
        this.f2675b = C0126R.layout.andromo_dashboard_list_row;
        this.f2676c = C0126R.id.dashboard_thumbnail;
        this.f2677d = C0126R.id.dashboard_title;
        this.f2678e = C0126R.id.dashboard_subtitle;
        this.f2679f = false;
        Resources resources = context.getResources();
        if (resources != null) {
            this.f2682i = resources.getStringArray(C0126R.array.activity_000_titles);
            this.f2683j = resources.getStringArray(C0126R.array.activity_000_subtitles);
            this.f2684k = new aq(new at(context), context);
            try {
                this.f2680g = resources.getColor(C0126R.color.secondary_color);
                return;
            } catch (NotFoundException e) {
            }
        }
        this.f2680g = -16743231;
    }

    public final void m3941a() {
        if (this.f2681h != null) {
            this.f2681h.recycle();
        }
        if (this.f2684k != null) {
            this.f2684k.m3922a();
        }
    }

    public final void m3942a(Context context) {
        if (context != null && this.f2684k != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                this.f2684k.m3923a(resources);
            }
        }
    }

    public int getCount() {
        return this.f2682i.length;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2674a.inflate(this.f2675b, viewGroup, false);
            if (view != null) {
                bc bcVar = new bc();
                bcVar.f2687a = (TextView) view.findViewById(this.f2677d);
                bcVar.f2688b = (TextView) view.findViewById(this.f2678e);
                bcVar.f2689c = (ImageView) view.findViewById(this.f2676c);
                view.setTag(bcVar);
            }
        }
        if (view != null) {
            bc bcVar2 = (bc) view.getTag();
            if (bcVar2 != null) {
                if (bcVar2.f2689c != null) {
                    Drawable a;
                    as apVar = new ap(bcVar2.f2689c, i);
                    bcVar2.f2689c.setTag(Integer.valueOf(i));
                    aq aqVar = this.f2684k;
                    if (aqVar.f2652a.mo1369b(i)) {
                        a = aqVar.f2652a.mo1367a(i);
                        if (a == null) {
                            ar arVar = aqVar.f2652a;
                        }
                        if (a == null) {
                            bcVar2.f2689c.setImageDrawable(a);
                            bcVar2.f2689c.setTag(null);
                        } else {
                            bcVar2.f2689c.setImageBitmap(null);
                        }
                    }
                    au auVar = new au(aqVar);
                    auVar.f2662a = i;
                    auVar.f2663b = apVar;
                    aqVar.f2653b.add(auVar);
                    if (aqVar.f2655d.getState() == State.NEW) {
                        aqVar.f2655d.start();
                    } else if (aqVar.f2655d.getState() == State.TERMINATED) {
                        aqVar.f2655d = new Thread(aqVar.f2656e);
                        aqVar.f2655d.start();
                    }
                    a = null;
                    if (a == null) {
                        bcVar2.f2689c.setImageBitmap(null);
                    } else {
                        bcVar2.f2689c.setImageDrawable(a);
                        bcVar2.f2689c.setTag(null);
                    }
                }
                if (bcVar2.f2688b != null) {
                    Object obj = this.f2683j[i];
                    bcVar2.f2688b.setText(obj);
                    if (!this.f2679f || obj.equals("")) {
                        bcVar2.f2688b.setVisibility(8);
                    } else {
                        bcVar2.f2688b.setVisibility(0);
                    }
                }
                if (bcVar2.f2687a != null) {
                    bcVar2.f2687a.setText(this.f2682i[i]);
                }
            }
        }
        return view;
    }

    public boolean hasStableIds() {
        return true;
    }
}
