package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.support.v4.p010b.p011a.C0130a;
import android.support.v4.p010b.p011a.C0427b;
import android.support.v4.view.C0650b;
import android.support.v4.view.C0664g;
import android.support.v7.view.menu.C0967j;
import android.support.v7.view.menu.C0972k;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class C0944g extends MenuInflater {
    static final Class<?>[] f2932a;
    static final Class<?>[] f2933b;
    final Object[] f2934c;
    final Object[] f2935d = this.f2934c;
    Context f2936e;
    Object f2937f;

    private static class C0942a implements OnMenuItemClickListener {
        private static final Class<?>[] f2897a = new Class[]{MenuItem.class};
        private Object f2898b;
        private Method f2899c;

        public C0942a(Object obj, String str) {
            this.f2898b = obj;
            Class cls = obj.getClass();
            try {
                this.f2899c = cls.getMethod(str, f2897a);
            } catch (Throwable e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f2899c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f2899c.invoke(this.f2898b, new Object[]{menuItem})).booleanValue();
                }
                this.f2899c.invoke(this.f2898b, new Object[]{menuItem});
                return true;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    private class C0943b {
        C0650b f2900A;
        CharSequence f2901B;
        CharSequence f2902C;
        ColorStateList f2903D = null;
        Mode f2904E = null;
        final /* synthetic */ C0944g f2905F;
        Menu f2906a;
        int f2907b;
        int f2908c;
        int f2909d;
        int f2910e;
        boolean f2911f;
        boolean f2912g;
        boolean f2913h;
        int f2914i;
        int f2915j;
        CharSequence f2916k;
        CharSequence f2917l;
        int f2918m;
        char f2919n;
        int f2920o;
        char f2921p;
        int f2922q;
        int f2923r;
        boolean f2924s;
        boolean f2925t;
        boolean f2926u;
        int f2927v;
        int f2928w;
        String f2929x;
        String f2930y;
        String f2931z;

        public C0943b(C0944g c0944g, Menu menu) {
            this.f2905F = c0944g;
            this.f2906a = menu;
            m2747a();
        }

        static char m2745a(String str) {
            return str == null ? '\u0000' : str.charAt(0);
        }

        final <T> T m2746a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = this.f2905F.f2936e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Throwable e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        public final void m2747a() {
            this.f2907b = 0;
            this.f2908c = 0;
            this.f2909d = 0;
            this.f2910e = 0;
            this.f2911f = true;
            this.f2912g = true;
        }

        final void m2748a(MenuItem menuItem) {
            boolean z = true;
            menuItem.setChecked(this.f2924s).setVisible(this.f2925t).setEnabled(this.f2926u).setCheckable(this.f2923r > 0).setTitleCondensed(this.f2917l).setIcon(this.f2918m);
            if (this.f2927v >= 0) {
                menuItem.setShowAsAction(this.f2927v);
            }
            if (this.f2931z != null) {
                if (this.f2905F.f2936e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                C0944g c0944g = this.f2905F;
                if (c0944g.f2937f == null) {
                    c0944g.f2937f = C0944g.m2750a(c0944g.f2936e);
                }
                menuItem.setOnMenuItemClickListener(new C0942a(c0944g.f2937f, this.f2931z));
            }
            if (this.f2923r >= 2) {
                if (menuItem instanceof C0967j) {
                    ((C0967j) menuItem).m2814a(true);
                } else if (menuItem instanceof C0972k) {
                    C0972k c0972k = (C0972k) menuItem;
                    try {
                        if (c0972k.f3103e == null) {
                            c0972k.f3103e = ((C0427b) c0972k.d).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        c0972k.f3103e.invoke(c0972k.d, new Object[]{Boolean.valueOf(true)});
                    } catch (Throwable e) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                    }
                }
            }
            if (this.f2929x != null) {
                menuItem.setActionView((View) m2746a(this.f2929x, C0944g.f2932a, this.f2905F.f2934c));
            } else {
                z = false;
            }
            if (this.f2928w > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(this.f2928w);
                }
            }
            if (this.f2900A != null) {
                C0664g.m1772a(menuItem, this.f2900A);
            }
            C0664g.m1776a(menuItem, this.f2901B);
            C0664g.m1779b(menuItem, this.f2902C);
            C0664g.m1778b(menuItem, this.f2919n, this.f2920o);
            C0664g.m1773a(menuItem, this.f2921p, this.f2922q);
            if (this.f2904E != null) {
                C0664g.m1775a(menuItem, this.f2904E);
            }
            if (this.f2903D != null) {
                C0664g.m1774a(menuItem, this.f2903D);
            }
        }

        public final SubMenu m2749b() {
            this.f2913h = true;
            SubMenu addSubMenu = this.f2906a.addSubMenu(this.f2907b, this.f2914i, this.f2915j, this.f2916k);
            m2748a(addSubMenu.getItem());
            return addSubMenu;
        }
    }

    static {
        Class[] clsArr = new Class[]{Context.class};
        f2932a = clsArr;
        f2933b = clsArr;
    }

    public C0944g(Context context) {
        super(context);
        this.f2936e = context;
        this.f2934c = new Object[]{context};
    }

    static Object m2750a(Object obj) {
        Object obj2 = obj;
        while (!(obj2 instanceof Activity) && (obj2 instanceof ContextWrapper)) {
            obj2 = ((ContextWrapper) obj2).getBaseContext();
        }
        return obj2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2751a(org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.view.Menu r13) {
        /*
        r10 = this;
        r4 = new android.support.v7.view.g$b;
        r4.<init>(r10, r13);
        r0 = r11.getEventType();
        r3 = 0;
        r2 = 0;
    L_0x000b:
        r1 = 2;
        if (r0 != r1) goto L_0x0046;
    L_0x000e:
        r0 = r11.getName();
        r1 = "menu";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0031;
    L_0x001a:
        r0 = r11.next();
    L_0x001e:
        r1 = 0;
    L_0x001f:
        if (r1 != 0) goto L_0x0284;
    L_0x0021:
        switch(r0) {
            case 1: goto L_0x027c;
            case 2: goto L_0x004e;
            case 3: goto L_0x0213;
            default: goto L_0x0024;
        };
    L_0x0024:
        r0 = r1;
        r1 = r2;
        r2 = r3;
    L_0x0027:
        r3 = r11.next();
        r9 = r0;
        r0 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r9;
        goto L_0x001f;
    L_0x0031:
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r3 = "Expecting menu, got ";
        r2.<init>(r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x0046:
        r0 = r11.next();
        r1 = 1;
        if (r0 != r1) goto L_0x000b;
    L_0x004d:
        goto L_0x001e;
    L_0x004e:
        if (r3 != 0) goto L_0x0024;
    L_0x0050:
        r0 = r11.getName();
        r5 = "group";
        r5 = r0.equals(r5);
        if (r5 == 0) goto L_0x00a3;
    L_0x005c:
        r0 = r4.f2905F;
        r0 = r0.f2936e;
        r5 = android.support.v7.p021a.C0780a.C0779j.MenuGroup;
        r0 = r0.obtainStyledAttributes(r12, r5);
        r5 = android.support.v7.p021a.C0780a.C0779j.MenuGroup_android_id;
        r6 = 0;
        r5 = r0.getResourceId(r5, r6);
        r4.f2907b = r5;
        r5 = android.support.v7.p021a.C0780a.C0779j.MenuGroup_android_menuCategory;
        r6 = 0;
        r5 = r0.getInt(r5, r6);
        r4.f2908c = r5;
        r5 = android.support.v7.p021a.C0780a.C0779j.MenuGroup_android_orderInCategory;
        r6 = 0;
        r5 = r0.getInt(r5, r6);
        r4.f2909d = r5;
        r5 = android.support.v7.p021a.C0780a.C0779j.MenuGroup_android_checkableBehavior;
        r6 = 0;
        r5 = r0.getInt(r5, r6);
        r4.f2910e = r5;
        r5 = android.support.v7.p021a.C0780a.C0779j.MenuGroup_android_visible;
        r6 = 1;
        r5 = r0.getBoolean(r5, r6);
        r4.f2911f = r5;
        r5 = android.support.v7.p021a.C0780a.C0779j.MenuGroup_android_enabled;
        r6 = 1;
        r5 = r0.getBoolean(r5, r6);
        r4.f2912g = r5;
        r0.recycle();
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x00a3:
        r5 = "item";
        r5 = r0.equals(r5);
        if (r5 == 0) goto L_0x01f9;
    L_0x00ab:
        r0 = r4.f2905F;
        r0 = r0.f2936e;
        r5 = android.support.v7.p021a.C0780a.C0779j.MenuItem;
        r5 = r0.obtainStyledAttributes(r12, r5);
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_android_id;
        r6 = 0;
        r0 = r5.getResourceId(r0, r6);
        r4.f2914i = r0;
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_android_menuCategory;
        r6 = r4.f2908c;
        r0 = r5.getInt(r0, r6);
        r6 = android.support.v7.p021a.C0780a.C0779j.MenuItem_android_orderInCategory;
        r7 = r4.f2909d;
        r6 = r5.getInt(r6, r7);
        r7 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
        r0 = r0 & r7;
        r7 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r6 = r6 & r7;
        r0 = r0 | r6;
        r4.f2915j = r0;
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_android_title;
        r0 = r5.getText(r0);
        r4.f2916k = r0;
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_android_titleCondensed;
        r0 = r5.getText(r0);
        r4.f2917l = r0;
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_android_icon;
        r6 = 0;
        r0 = r5.getResourceId(r0, r6);
        r4.f2918m = r0;
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_android_alphabeticShortcut;
        r0 = r5.getString(r0);
        r0 = android.support.v7.view.C0944g.C0943b.m2745a(r0);
        r4.f2919n = r0;
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_alphabeticModifiers;
        r6 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r0 = r5.getInt(r0, r6);
        r4.f2920o = r0;
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_android_numericShortcut;
        r0 = r5.getString(r0);
        r0 = android.support.v7.view.C0944g.C0943b.m2745a(r0);
        r4.f2921p = r0;
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_numericModifiers;
        r6 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r0 = r5.getInt(r0, r6);
        r4.f2922q = r0;
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_android_checkable;
        r0 = r5.hasValue(r0);
        if (r0 == 0) goto L_0x01dc;
    L_0x0125:
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_android_checkable;
        r6 = 0;
        r0 = r5.getBoolean(r0, r6);
        if (r0 == 0) goto L_0x01d9;
    L_0x012e:
        r0 = 1;
    L_0x012f:
        r4.f2923r = r0;
    L_0x0131:
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_android_checked;
        r6 = 0;
        r0 = r5.getBoolean(r0, r6);
        r4.f2924s = r0;
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_android_visible;
        r6 = r4.f2911f;
        r0 = r5.getBoolean(r0, r6);
        r4.f2925t = r0;
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_android_enabled;
        r6 = r4.f2912g;
        r0 = r5.getBoolean(r0, r6);
        r4.f2926u = r0;
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_showAsAction;
        r6 = -1;
        r0 = r5.getInt(r0, r6);
        r4.f2927v = r0;
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_android_onClick;
        r0 = r5.getString(r0);
        r4.f2931z = r0;
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_actionLayout;
        r6 = 0;
        r0 = r5.getResourceId(r0, r6);
        r4.f2928w = r0;
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_actionViewClass;
        r0 = r5.getString(r0);
        r4.f2929x = r0;
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_actionProviderClass;
        r0 = r5.getString(r0);
        r4.f2930y = r0;
        r0 = r4.f2930y;
        if (r0 == 0) goto L_0x01e2;
    L_0x017c:
        r0 = 1;
    L_0x017d:
        if (r0 == 0) goto L_0x01e4;
    L_0x017f:
        r6 = r4.f2928w;
        if (r6 != 0) goto L_0x01e4;
    L_0x0183:
        r6 = r4.f2929x;
        if (r6 != 0) goto L_0x01e4;
    L_0x0187:
        r0 = r4.f2930y;
        r6 = f2933b;
        r7 = r4.f2905F;
        r7 = r7.f2935d;
        r0 = r4.m2746a(r0, r6, r7);
        r0 = (android.support.v4.view.C0650b) r0;
        r4.f2900A = r0;
    L_0x0197:
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_contentDescription;
        r0 = r5.getText(r0);
        r4.f2901B = r0;
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_tooltipText;
        r0 = r5.getText(r0);
        r4.f2902C = r0;
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_iconTintMode;
        r0 = r5.hasValue(r0);
        if (r0 == 0) goto L_0x01f1;
    L_0x01af:
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_iconTintMode;
        r6 = -1;
        r0 = r5.getInt(r0, r6);
        r6 = r4.f2904E;
        r0 = android.support.v7.widget.DrawableUtils.parseTintMode(r0, r6);
        r4.f2904E = r0;
    L_0x01be:
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_iconTint;
        r0 = r5.hasValue(r0);
        if (r0 == 0) goto L_0x01f5;
    L_0x01c6:
        r0 = android.support.v7.p021a.C0780a.C0779j.MenuItem_iconTint;
        r0 = r5.getColorStateList(r0);
        r4.f2903D = r0;
    L_0x01ce:
        r5.recycle();
        r0 = 0;
        r4.f2913h = r0;
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x01d9:
        r0 = 0;
        goto L_0x012f;
    L_0x01dc:
        r0 = r4.f2910e;
        r4.f2923r = r0;
        goto L_0x0131;
    L_0x01e2:
        r0 = 0;
        goto L_0x017d;
    L_0x01e4:
        if (r0 == 0) goto L_0x01ed;
    L_0x01e6:
        r0 = "SupportMenuInflater";
        r6 = "Ignoring attribute 'actionProviderClass'. Action view already specified.";
        android.util.Log.w(r0, r6);
    L_0x01ed:
        r0 = 0;
        r4.f2900A = r0;
        goto L_0x0197;
    L_0x01f1:
        r0 = 0;
        r4.f2904E = r0;
        goto L_0x01be;
    L_0x01f5:
        r0 = 0;
        r4.f2903D = r0;
        goto L_0x01ce;
    L_0x01f9:
        r5 = "menu";
        r5 = r0.equals(r5);
        if (r5 == 0) goto L_0x020d;
    L_0x0201:
        r0 = r4.m2749b();
        r10.m2751a(r11, r12, r0);
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x020d:
        r2 = 1;
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0027;
    L_0x0213:
        r0 = r11.getName();
        if (r3 == 0) goto L_0x0226;
    L_0x0219:
        r5 = r0.equals(r2);
        if (r5 == 0) goto L_0x0226;
    L_0x021f:
        r2 = 0;
        r0 = 0;
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0027;
    L_0x0226:
        r5 = "group";
        r5 = r0.equals(r5);
        if (r5 == 0) goto L_0x0236;
    L_0x022e:
        r4.m2747a();
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x0236:
        r5 = "item";
        r5 = r0.equals(r5);
        if (r5 == 0) goto L_0x026f;
    L_0x023e:
        r0 = r4.f2913h;
        if (r0 != 0) goto L_0x0024;
    L_0x0242:
        r0 = r4.f2900A;
        if (r0 == 0) goto L_0x0256;
    L_0x0246:
        r0 = r4.f2900A;
        r0 = r0.hasSubMenu();
        if (r0 == 0) goto L_0x0256;
    L_0x024e:
        r4.m2749b();
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x0256:
        r0 = 1;
        r4.f2913h = r0;
        r0 = r4.f2906a;
        r5 = r4.f2907b;
        r6 = r4.f2914i;
        r7 = r4.f2915j;
        r8 = r4.f2916k;
        r0 = r0.add(r5, r6, r7, r8);
        r4.m2748a(r0);
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x026f:
        r5 = "menu";
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x0024;
    L_0x0277:
        r0 = 1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x027c:
        r0 = new java.lang.RuntimeException;
        r1 = "Unexpected end of document";
        r0.<init>(r1);
        throw r0;
    L_0x0284:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.g.a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    public final void inflate(int i, Menu menu) {
        if (menu instanceof C0130a) {
            XmlResourceParser xmlResourceParser = null;
            try {
                xmlResourceParser = this.f2936e.getResources().getLayout(i);
                m2751a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            } catch (Throwable e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (Throwable e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (Throwable th) {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            }
        } else {
            super.inflate(i, menu);
        }
    }
}
