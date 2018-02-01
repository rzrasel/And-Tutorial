package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.content.C0392a;
import android.support.v4.p010b.p011a.C0130a;
import android.support.v4.view.C0650b;
import android.support.v7.p021a.C0780a.C0771b;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class C0131h implements C0130a {
    private static final int[] f488l = new int[]{1, 4, 5, 3, 2, 0};
    public final Context f489a;
    public C0155a f490b;
    ArrayList<C0967j> f491c;
    public ArrayList<C0967j> f492d;
    public int f493e = 0;
    CharSequence f494f;
    Drawable f495g;
    View f496h;
    boolean f497i = false;
    C0967j f498j;
    public boolean f499k;
    private final Resources f500m;
    private boolean f501n;
    private boolean f502o;
    private ArrayList<C0967j> f503p;
    private boolean f504q;
    private ArrayList<C0967j> f505r;
    private boolean f506s;
    private ContextMenuInfo f507t;
    private boolean f508u = false;
    private boolean f509v = false;
    private boolean f510w = false;
    private boolean f511x = false;
    private ArrayList<C0967j> f512y = new ArrayList();
    private CopyOnWriteArrayList<WeakReference<C0121o>> f513z = new CopyOnWriteArrayList();

    public interface C0155a {
        boolean onMenuItemSelected(C0131h c0131h, MenuItem menuItem);

        void onMenuModeChange(C0131h c0131h);
    }

    public interface C0949b {
        boolean invokeItem(C0967j c0967j);
    }

    public C0131h(Context context) {
        boolean z = true;
        this.f489a = context;
        this.f500m = context.getResources();
        this.f491c = new ArrayList();
        this.f503p = new ArrayList();
        this.f504q = true;
        this.f492d = new ArrayList();
        this.f505r = new ArrayList();
        this.f506s = true;
        if (this.f500m.getConfiguration().keyboard == 1 || !this.f500m.getBoolean(C0771b.abc_config_showMenuShortcutsWhenKeyboardPresent)) {
            z = false;
        }
        this.f502o = z;
    }

    private static int m243a(ArrayList<C0967j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0967j) arrayList.get(size)).f3076a <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    private C0967j m244a(int i, KeyEvent keyEvent) {
        List list = this.f512y;
        list.clear();
        m246a(list, i, keyEvent);
        if (list.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = list.size();
        if (size == 1) {
            return (C0967j) list.get(0);
        }
        boolean b = mo76b();
        for (int i2 = 0; i2 < size; i2++) {
            C0967j c0967j = (C0967j) list.get(i2);
            char alphabeticShortcut = b ? c0967j.getAlphabeticShortcut() : c0967j.getNumericShortcut();
            if (alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                return c0967j;
            }
            if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return c0967j;
            }
            if (b && alphabeticShortcut == '\b' && i == 67) {
                return c0967j;
            }
        }
        return null;
    }

    private void m245a(int i, boolean z) {
        if (i >= 0 && i < this.f491c.size()) {
            this.f491c.remove(i);
            if (z) {
                mo81a(true);
            }
        }
    }

    private void m246a(List<C0967j> list, int i, KeyEvent keyEvent) {
        boolean b = mo76b();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f491c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0967j c0967j = (C0967j) this.f491c.get(i2);
                if (c0967j.hasSubMenu()) {
                    ((C0131h) c0967j.getSubMenu()).m246a((List) list, i, keyEvent);
                }
                char alphabeticShortcut = b ? c0967j.getAlphabeticShortcut() : c0967j.getNumericShortcut();
                if (!(((modifiers & 69647) == ((b ? c0967j.getAlphabeticModifiers() : c0967j.getNumericModifiers()) & 69647) ? 1 : 0) == 0 || alphabeticShortcut == '\u0000' || ((alphabeticShortcut != keyData.meta[0] && alphabeticShortcut != keyData.meta[2] && (!b || alphabeticShortcut != '\b' || i != 67)) || !c0967j.isEnabled()))) {
                    list.add(c0967j);
                }
            }
        }
    }

    public MenuItem mo64a(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = (-65536 & i3) >> 16;
        if (i4 < 0 || i4 >= f488l.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i5 = (f488l[i4] << 16) | (65535 & i3);
        MenuItem c0967j = new C0967j(this, i, i2, i3, i5, charSequence, this.f493e);
        if (this.f507t != null) {
            c0967j.f3080e = this.f507t;
        }
        this.f491c.add(C0131h.m243a(this.f491c, i5), c0967j);
        mo81a(true);
        return c0967j;
    }

    protected String mo72a() {
        return "android:menu:actionviewstates";
    }

    final void m249a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f500m;
        if (view != null) {
            this.f496h = view;
            this.f494f = null;
            this.f495g = null;
        } else {
            if (i > 0) {
                this.f494f = resources.getText(i);
            } else if (charSequence != null) {
                this.f494f = charSequence;
            }
            if (i2 > 0) {
                this.f495g = C0392a.getDrawable(this.f489a, i2);
            } else if (drawable != null) {
                this.f495g = drawable;
            }
            this.f496h = null;
        }
        mo81a(false);
    }

    public final void m250a(Bundle bundle) {
        if (!this.f513z.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = this.f513z.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0121o c0121o = (C0121o) weakReference.get();
                if (c0121o == null) {
                    this.f513z.remove(weakReference);
                } else {
                    int id = c0121o.getId();
                    if (id > 0) {
                        Parcelable onSaveInstanceState = c0121o.onSaveInstanceState();
                        if (onSaveInstanceState != null) {
                            sparseArray.put(id, onSaveInstanceState);
                        }
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    public void mo73a(C0155a c0155a) {
        this.f490b = c0155a;
    }

    public final void m252a(C0121o c0121o) {
        m253a(c0121o, this.f489a);
    }

    public final void m253a(C0121o c0121o, Context context) {
        this.f513z.add(new WeakReference(c0121o));
        c0121o.initForMenu(context, this);
        this.f506s = true;
    }

    public void mo81a(boolean z) {
        if (this.f508u) {
            this.f509v = true;
            if (z) {
                this.f510w = true;
                return;
            }
            return;
        }
        if (z) {
            this.f504q = true;
            this.f506s = true;
        }
        if (!this.f513z.isEmpty()) {
            m265d();
            Iterator it = this.f513z.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0121o c0121o = (C0121o) weakReference.get();
                if (c0121o == null) {
                    this.f513z.remove(weakReference);
                } else {
                    c0121o.updateMenuView(z);
                }
            }
            m267e();
        }
    }

    boolean mo74a(C0131h c0131h, MenuItem menuItem) {
        return this.f490b != null && this.f490b.onMenuItemSelected(c0131h, menuItem);
    }

    public boolean mo75a(C0967j c0967j) {
        boolean z = false;
        if (!this.f513z.isEmpty()) {
            m265d();
            Iterator it = this.f513z.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0121o c0121o = (C0121o) weakReference.get();
                if (c0121o == null) {
                    this.f513z.remove(weakReference);
                } else {
                    z = c0121o.expandItemActionView(this, c0967j);
                    if (z) {
                        break;
                    }
                    z2 = z;
                }
            }
            z = z2;
            m267e();
            if (z) {
                this.f498j = c0967j;
            }
        }
        return z;
    }

    public final boolean m257a(MenuItem menuItem, C0121o c0121o, int i) {
        boolean z = false;
        C0967j c0967j = (C0967j) menuItem;
        if (c0967j == null || !c0967j.isEnabled()) {
            return false;
        }
        boolean b = c0967j.m2816b();
        C0650b c0650b = c0967j.f3079d;
        boolean z2 = c0650b != null && c0650b.hasSubMenu();
        boolean expandActionView;
        if (c0967j.m2826i()) {
            expandActionView = c0967j.expandActionView() | b;
            if (!expandActionView) {
                return expandActionView;
            }
            m260b(true);
            return expandActionView;
        } else if (c0967j.hasSubMenu() || z2) {
            if ((i & 4) == 0) {
                m260b(false);
            }
            if (!c0967j.hasSubMenu()) {
                c0967j.m2813a(new C0146u(this.f489a, this, c0967j));
            }
            C0146u c0146u = (C0146u) c0967j.getSubMenu();
            if (z2) {
                c0650b.onPrepareSubMenu(c0146u);
            }
            if (!this.f513z.isEmpty()) {
                if (c0121o != null) {
                    z = c0121o.onSubMenuSelected(c0146u);
                }
                Iterator it = this.f513z.iterator();
                boolean z3 = z;
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C0121o c0121o2 = (C0121o) weakReference.get();
                    if (c0121o2 == null) {
                        this.f513z.remove(weakReference);
                    } else {
                        z3 = !z3 ? c0121o2.onSubMenuSelected(c0146u) : z3;
                    }
                }
                z = z3;
            }
            expandActionView = b | r2;
            if (expandActionView) {
                return expandActionView;
            }
            m260b(true);
            return expandActionView;
        } else {
            if ((i & 1) == 0) {
                m260b(true);
            }
            return b;
        }
    }

    public MenuItem add(int i) {
        return mo64a(0, 0, 0, this.f500m.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo64a(i, i2, i3, this.f500m.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo64a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo64a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f489a.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f500m.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f500m.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0967j c0967j = (C0967j) mo64a(i, i2, i3, charSequence);
        C0146u c0146u = new C0146u(this.f489a, this, c0967j);
        c0967j.m2813a(c0146u);
        return c0146u;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void m258b(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f513z.isEmpty()) {
            Iterator it = this.f513z.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0121o c0121o = (C0121o) weakReference.get();
                if (c0121o == null) {
                    this.f513z.remove(weakReference);
                } else {
                    int id = c0121o.getId();
                    if (id > 0) {
                        Parcelable parcelable = (Parcelable) sparseParcelableArray.get(id);
                        if (parcelable != null) {
                            c0121o.onRestoreInstanceState(parcelable);
                        }
                    }
                }
            }
        }
    }

    public final void m259b(C0121o c0121o) {
        Iterator it = this.f513z.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0121o c0121o2 = (C0121o) weakReference.get();
            if (c0121o2 == null || c0121o2 == c0121o) {
                this.f513z.remove(weakReference);
            }
        }
    }

    public final void m260b(boolean z) {
        if (!this.f511x) {
            this.f511x = true;
            Iterator it = this.f513z.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0121o c0121o = (C0121o) weakReference.get();
                if (c0121o == null) {
                    this.f513z.remove(weakReference);
                } else {
                    c0121o.onCloseMenu(this, z);
                }
            }
            this.f511x = false;
        }
    }

    boolean mo76b() {
        return this.f501n;
    }

    public boolean mo77b(C0967j c0967j) {
        boolean z = false;
        if (!this.f513z.isEmpty() && this.f498j == c0967j) {
            m265d();
            Iterator it = this.f513z.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0121o c0121o = (C0121o) weakReference.get();
                if (c0121o == null) {
                    this.f513z.remove(weakReference);
                } else {
                    z = c0121o.collapseItemActionView(this, c0967j);
                    if (z) {
                        break;
                    }
                    z2 = z;
                }
            }
            z = z2;
            m267e();
            if (z) {
                this.f498j = null;
            }
        }
        return z;
    }

    public final void m263c(Bundle bundle) {
        int size = size();
        int i = 0;
        SparseArray sparseArray = null;
        while (i < size) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            SparseArray sparseArray2 = sparseArray;
            if (item.hasSubMenu()) {
                ((C0146u) item.getSubMenu()).m263c(bundle);
            }
            i++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo72a(), sparseArray);
        }
    }

    public boolean mo78c() {
        return this.f502o;
    }

    public void clear() {
        if (this.f498j != null) {
            mo77b(this.f498j);
        }
        this.f491c.clear();
        mo81a(true);
    }

    public void clearHeader() {
        this.f495g = null;
        this.f494f = null;
        this.f496h = null;
        mo81a(false);
    }

    public void close() {
        m260b(true);
    }

    public final void m265d() {
        if (!this.f508u) {
            this.f508u = true;
            this.f509v = false;
            this.f510w = false;
        }
    }

    public final void m266d(Bundle bundle) {
        if (bundle != null) {
            MenuItem item;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo72a());
            int size = size();
            for (int i = 0; i < size; i++) {
                item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0146u) item.getSubMenu()).m266d(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                item = findItem(i2);
                if (item != null) {
                    item.expandActionView();
                }
            }
        }
    }

    public final void m267e() {
        this.f508u = false;
        if (this.f509v) {
            this.f509v = false;
            mo81a(this.f510w);
        }
    }

    final void m268f() {
        this.f504q = true;
        mo81a(true);
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0967j c0967j = (C0967j) this.f491c.get(i2);
            if (c0967j.getItemId() == i) {
                return c0967j;
            }
            if (c0967j.hasSubMenu()) {
                MenuItem findItem = c0967j.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    final void m269g() {
        this.f506s = true;
        mo81a(true);
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f491c.get(i);
    }

    public final ArrayList<C0967j> m270h() {
        if (!this.f504q) {
            return this.f503p;
        }
        this.f503p.clear();
        int size = this.f491c.size();
        for (int i = 0; i < size; i++) {
            C0967j c0967j = (C0967j) this.f491c.get(i);
            if (c0967j.isVisible()) {
                this.f503p.add(c0967j);
            }
        }
        this.f504q = false;
        this.f506s = true;
        return this.f503p;
    }

    public boolean hasVisibleItems() {
        if (this.f499k) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C0967j) this.f491c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void m271i() {
        ArrayList h = m270h();
        if (this.f506s) {
            Iterator it = this.f513z.iterator();
            int i = 0;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0121o c0121o = (C0121o) weakReference.get();
                if (c0121o == null) {
                    this.f513z.remove(weakReference);
                } else {
                    i = c0121o.flagActionItems() | i;
                }
            }
            if (i != 0) {
                this.f492d.clear();
                this.f505r.clear();
                i = h.size();
                for (int i2 = 0; i2 < i; i2++) {
                    C0967j c0967j = (C0967j) h.get(i2);
                    if (c0967j.m2823f()) {
                        this.f492d.add(c0967j);
                    } else {
                        this.f505r.add(c0967j);
                    }
                }
            } else {
                this.f492d.clear();
                this.f505r.clear();
                this.f505r.addAll(m270h());
            }
            this.f506s = false;
        }
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m244a(i, keyEvent) != null;
    }

    public final ArrayList<C0967j> m272j() {
        m271i();
        return this.f505r;
    }

    public C0131h mo79k() {
        return this;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return m257a(findItem(i), null, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItem a = m244a(i, keyEvent);
        boolean z = false;
        if (a != null) {
            z = m257a(a, null, i2);
        }
        if ((i2 & 2) != 0) {
            m260b(true);
        }
        return z;
    }

    public void removeGroup(int i) {
        int i2;
        int size = size();
        for (i2 = 0; i2 < size; i2++) {
            if (((C0967j) this.f491c.get(i2)).getGroupId() == i) {
                size = i2;
                break;
            }
        }
        size = -1;
        if (size >= 0) {
            int size2 = this.f491c.size() - size;
            int i3 = 0;
            while (true) {
                i2 = i3 + 1;
                if (i3 >= size2 || ((C0967j) this.f491c.get(size)).getGroupId() != i) {
                    mo81a(true);
                } else {
                    m245a(size, false);
                    i3 = i2;
                }
            }
            mo81a(true);
        }
    }

    public void removeItem(int i) {
        int i2;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((C0967j) this.f491c.get(i3)).getItemId() == i) {
                i2 = i3;
                break;
            }
        }
        i2 = -1;
        m245a(i2, true);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f491c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0967j c0967j = (C0967j) this.f491c.get(i2);
            if (c0967j.getGroupId() == i) {
                c0967j.m2814a(z2);
                c0967j.setCheckable(z);
            }
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f491c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0967j c0967j = (C0967j) this.f491c.get(i2);
            if (c0967j.getGroupId() == i) {
                c0967j.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f491c.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            C0967j c0967j = (C0967j) this.f491c.get(i2);
            boolean z3 = (c0967j.getGroupId() == i && c0967j.m2817b(z)) ? true : z2;
            i2++;
            z2 = z3;
        }
        if (z2) {
            mo81a(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f501n = z;
        mo81a(false);
    }

    public int size() {
        return this.f491c.size();
    }
}
