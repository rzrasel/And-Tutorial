package android.support.v4.widget;

import android.support.v4.widget.DrawerLayout.LayoutParams;
import android.view.View;

final class C0112m extends at {
    final int f339a;
    aq f340b;
    final /* synthetic */ DrawerLayout f341c;
    private final Runnable f342d = new C0113n(this);

    public C0112m(DrawerLayout drawerLayout, int i) {
        this.f341c = drawerLayout;
        this.f339a = i;
    }

    public final void m652a() {
        this.f341c.removeCallbacks(this.f342d);
    }

    public final void mo270a(int i) {
        DrawerLayout drawerLayout = this.f341c;
        int i2 = this.f339a;
        drawerLayout.m532a(i, this.f340b.m641c());
    }

    public final void mo271a(int i, int i2) {
        View b = (i & 1) == 1 ? this.f341c.m535b(3) : this.f341c.m535b(5);
        if (b != null && this.f341c.m529a(b) == 0) {
            this.f340b.m633a(b, i2);
        }
    }

    public final void mo272a(View view, float f) {
        int i;
        DrawerLayout drawerLayout = this.f341c;
        float b = DrawerLayout.m520b(view);
        int width = view.getWidth();
        if (this.f341c.m534a(view, 3)) {
            i = (f > 0.0f || (f == 0.0f && b > 0.5f)) ? 0 : -width;
        } else {
            i = this.f341c.getWidth();
            if (f < 0.0f || (f == 0.0f && b > 0.5f)) {
                i -= width;
            }
        }
        this.f340b.m634a(i, view.getTop());
        this.f341c.invalidate();
    }

    public final void mo273a(View view, int i) {
        int width = view.getWidth();
        float width2 = this.f341c.m534a(view, 3) ? ((float) (width + i)) / ((float) width) : ((float) (this.f341c.getWidth() - i)) / ((float) width);
        this.f341c.m533a(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        this.f341c.invalidate();
    }

    public final boolean mo274a(View view) {
        DrawerLayout drawerLayout = this.f341c;
        return DrawerLayout.m522d(view) && this.f341c.m534a(view, this.f339a) && this.f341c.m529a(view) == 0;
    }

    public final int mo275b(View view, int i) {
        if (this.f341c.m534a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.f341c.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    final void m659b() {
        int i = 3;
        if (this.f339a == 3) {
            i = 5;
        }
        View b = this.f341c.m535b(i);
        if (b != null) {
            this.f341c.m541e(b);
        }
    }

    public final void mo276b(View view) {
        ((LayoutParams) view.getLayoutParams()).f197c = false;
        m659b();
    }

    public final int mo277c(View view) {
        return view.getWidth();
    }

    public final void mo287c() {
        this.f341c.postDelayed(this.f342d, 160);
    }

    public final int mo278d(View view) {
        return view.getTop();
    }
}
