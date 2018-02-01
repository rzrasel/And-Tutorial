package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.support.v4.p010b.p011a.C0427b;
import android.util.Log;
import android.view.MenuItem;
import com.orange.studio.banglatype.R;

public final class C0664g {
    static final C0661c f1964a;

    interface C0661c {
        void mo634a(MenuItem menuItem, char c, int i);

        void mo635a(MenuItem menuItem, ColorStateList colorStateList);

        void mo636a(MenuItem menuItem, Mode mode);

        void mo637a(MenuItem menuItem, CharSequence charSequence);

        void mo638b(MenuItem menuItem, char c, int i);

        void mo639b(MenuItem menuItem, CharSequence charSequence);
    }

    static class C0662b implements C0661c {
        C0662b() {
        }

        public void mo634a(MenuItem menuItem, char c, int i) {
        }

        public void mo635a(MenuItem menuItem, ColorStateList colorStateList) {
        }

        public void mo636a(MenuItem menuItem, Mode mode) {
        }

        public void mo637a(MenuItem menuItem, CharSequence charSequence) {
        }

        public void mo638b(MenuItem menuItem, char c, int i) {
        }

        public void mo639b(MenuItem menuItem, CharSequence charSequence) {
        }
    }

    static class C0663a extends C0662b {
        C0663a() {
        }

        public final void mo634a(MenuItem menuItem, char c, int i) {
            menuItem.setAlphabeticShortcut(c, i);
        }

        public final void mo635a(MenuItem menuItem, ColorStateList colorStateList) {
            menuItem.setIconTintList(colorStateList);
        }

        public final void mo636a(MenuItem menuItem, Mode mode) {
            menuItem.setIconTintMode(mode);
        }

        public final void mo637a(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setContentDescription(charSequence);
        }

        public final void mo638b(MenuItem menuItem, char c, int i) {
            menuItem.setNumericShortcut(c, i);
        }

        public final void mo639b(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setTooltipText(charSequence);
        }
    }

    static {
        if (VERSION.SDK_INT >= 26) {
            f1964a = new C0663a();
        } else {
            f1964a = new C0662b();
        }
    }

    @Deprecated
    public static MenuItem m1771a(MenuItem menuItem) {
        return menuItem.setActionView(null);
    }

    public static MenuItem m1772a(MenuItem menuItem, C0650b c0650b) {
        if (menuItem instanceof C0427b) {
            return ((C0427b) menuItem).mo895a(c0650b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void m1773a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0427b) {
            ((C0427b) menuItem).setNumericShortcut(c, i);
        } else {
            f1964a.mo638b(menuItem, c, i);
        }
    }

    public static void m1774a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C0427b) {
            ((C0427b) menuItem).setIconTintList(colorStateList);
        } else {
            f1964a.mo635a(menuItem, colorStateList);
        }
    }

    public static void m1775a(MenuItem menuItem, Mode mode) {
        if (menuItem instanceof C0427b) {
            ((C0427b) menuItem).setIconTintMode(mode);
        } else {
            f1964a.mo636a(menuItem, mode);
        }
    }

    public static void m1776a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0427b) {
            ((C0427b) menuItem).mo896a(charSequence);
        } else {
            f1964a.mo637a(menuItem, charSequence);
        }
    }

    @Deprecated
    public static MenuItem m1777b(MenuItem menuItem) {
        return menuItem.setActionView(R.layout.actionbar_indeterminate_progress);
    }

    public static void m1778b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0427b) {
            ((C0427b) menuItem).setAlphabeticShortcut(c, i);
        } else {
            f1964a.mo634a(menuItem, c, i);
        }
    }

    public static void m1779b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0427b) {
            ((C0427b) menuItem).mo898b(charSequence);
        } else {
            f1964a.mo639b(menuItem, charSequence);
        }
    }
}
