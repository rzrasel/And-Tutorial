package android.support.v7.view;

import android.content.Context;
import android.support.v4.p010b.p011a.C0130a;
import android.support.v4.p010b.p011a.C0427b;
import android.support.v4.p018f.C0477m;
import android.support.v7.view.C0852b.C0806a;
import android.support.v7.view.menu.C0977q;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

public final class C0941f extends ActionMode {
    final Context f2895a;
    final C0852b f2896b;

    public static class C0940a implements C0806a {
        final Callback f2891a;
        final Context f2892b;
        final ArrayList<C0941f> f2893c = new ArrayList();
        final C0477m<Menu, Menu> f2894d = new C0477m();

        public C0940a(Context context, Callback callback) {
            this.f2892b = context;
            this.f2891a = callback;
        }

        private Menu m2739a(Menu menu) {
            Menu menu2 = (Menu) this.f2894d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            menu2 = C0977q.m2829a(this.f2892b, (C0130a) menu);
            this.f2894d.put(menu, menu2);
            return menu2;
        }

        public final void mo747a(C0852b c0852b) {
            this.f2891a.onDestroyActionMode(m2743b(c0852b));
        }

        public final boolean mo748a(C0852b c0852b, Menu menu) {
            return this.f2891a.onCreateActionMode(m2743b(c0852b), m2739a(menu));
        }

        public final boolean mo749a(C0852b c0852b, MenuItem menuItem) {
            return this.f2891a.onActionItemClicked(m2743b(c0852b), C0977q.m2830a(this.f2892b, (C0427b) menuItem));
        }

        public final ActionMode m2743b(C0852b c0852b) {
            int size = this.f2893c.size();
            for (int i = 0; i < size; i++) {
                C0941f c0941f = (C0941f) this.f2893c.get(i);
                if (c0941f != null && c0941f.f2896b == c0852b) {
                    return c0941f;
                }
            }
            ActionMode c0941f2 = new C0941f(this.f2892b, c0852b);
            this.f2893c.add(c0941f2);
            return c0941f2;
        }

        public final boolean mo750b(C0852b c0852b, Menu menu) {
            return this.f2891a.onPrepareActionMode(m2743b(c0852b), m2739a(menu));
        }
    }

    public C0941f(Context context, C0852b c0852b) {
        this.f2895a = context;
        this.f2896b = c0852b;
    }

    public final void finish() {
        this.f2896b.mo834c();
    }

    public final View getCustomView() {
        return this.f2896b.mo839i();
    }

    public final Menu getMenu() {
        return C0977q.m2829a(this.f2895a, (C0130a) this.f2896b.mo831b());
    }

    public final MenuInflater getMenuInflater() {
        return this.f2896b.mo826a();
    }

    public final CharSequence getSubtitle() {
        return this.f2896b.mo837g();
    }

    public final Object getTag() {
        return this.f2896b.f2574c;
    }

    public final CharSequence getTitle() {
        return this.f2896b.mo836f();
    }

    public final boolean getTitleOptionalHint() {
        return this.f2896b.f2575d;
    }

    public final void invalidate() {
        this.f2896b.mo835d();
    }

    public final boolean isTitleOptional() {
        return this.f2896b.mo838h();
    }

    public final void setCustomView(View view) {
        this.f2896b.mo828a(view);
    }

    public final void setSubtitle(int i) {
        this.f2896b.mo832b(i);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f2896b.mo829a(charSequence);
    }

    public final void setTag(Object obj) {
        this.f2896b.f2574c = obj;
    }

    public final void setTitle(int i) {
        this.f2896b.mo827a(i);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f2896b.mo833b(charSequence);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.f2896b.mo830a(z);
    }
}
