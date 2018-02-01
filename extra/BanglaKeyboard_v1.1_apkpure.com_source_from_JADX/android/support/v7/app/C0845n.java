package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0679r;
import android.support.v7.view.C0826i;
import android.support.v7.view.menu.C0121o.C0803a;
import android.support.v7.view.menu.C0131h;
import android.support.v7.view.menu.C0131h.C0155a;
import android.support.v7.widget.DecorToolbar;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.OnMenuItemClickListener;
import android.support.v7.widget.ToolbarWidgetWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window.Callback;
import java.util.ArrayList;

final class C0845n extends ActionBar {
    DecorToolbar f2549a;
    boolean f2550b;
    Callback f2551c;
    private boolean f2552d;
    private boolean f2553e;
    private ArrayList<Object> f2554f = new ArrayList();
    private final Runnable f2555g = new C08401(this);
    private final OnMenuItemClickListener f2556h = new C08412(this);

    class C08401 implements Runnable {
        final /* synthetic */ C0845n f2543a;

        C08401(C0845n c0845n) {
            this.f2543a = c0845n;
        }

        public final void run() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0032 in list [B:12:0x002f]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r5 = this;
            r0 = 0;
            r3 = r5.f2543a;
            r1 = r3.m2452j();
            r2 = r1 instanceof android.support.v7.view.menu.C0131h;
            if (r2 == 0) goto L_0x0033;
        L_0x000b:
            r0 = r1;
            r0 = (android.support.v7.view.menu.C0131h) r0;
            r2 = r0;
        L_0x000f:
            if (r2 == 0) goto L_0x0014;
        L_0x0011:
            r2.m265d();
        L_0x0014:
            r1.clear();	 Catch:{ all -> 0x0035 }
            r0 = r3.f2551c;	 Catch:{ all -> 0x0035 }
            r4 = 0;	 Catch:{ all -> 0x0035 }
            r0 = r0.onCreatePanelMenu(r4, r1);	 Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x002a;	 Catch:{ all -> 0x0035 }
        L_0x0020:
            r0 = r3.f2551c;	 Catch:{ all -> 0x0035 }
            r3 = 0;	 Catch:{ all -> 0x0035 }
            r4 = 0;	 Catch:{ all -> 0x0035 }
            r0 = r0.onPreparePanel(r3, r4, r1);	 Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x002d;	 Catch:{ all -> 0x0035 }
        L_0x002a:
            r1.clear();	 Catch:{ all -> 0x0035 }
        L_0x002d:
            if (r2 == 0) goto L_0x0032;
        L_0x002f:
            r2.m267e();
        L_0x0032:
            return;
        L_0x0033:
            r2 = r0;
            goto L_0x000f;
        L_0x0035:
            r0 = move-exception;
            if (r2 == 0) goto L_0x003b;
        L_0x0038:
            r2.m267e();
        L_0x003b:
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.n.1.run():void");
        }
    }

    class C08412 implements OnMenuItemClickListener {
        final /* synthetic */ C0845n f2544a;

        C08412(C0845n c0845n) {
            this.f2544a = c0845n;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f2544a.f2551c.onMenuItemSelected(0, menuItem);
        }
    }

    private final class C0842a implements C0803a {
        final /* synthetic */ C0845n f2545a;
        private boolean f2546b;

        C0842a(C0845n c0845n) {
            this.f2545a = c0845n;
        }

        public final void onCloseMenu(C0131h c0131h, boolean z) {
            if (!this.f2546b) {
                this.f2546b = true;
                this.f2545a.f2549a.dismissPopupMenus();
                if (this.f2545a.f2551c != null) {
                    this.f2545a.f2551c.onPanelClosed(108, c0131h);
                }
                this.f2546b = false;
            }
        }

        public final boolean onOpenSubMenu(C0131h c0131h) {
            if (this.f2545a.f2551c == null) {
                return false;
            }
            this.f2545a.f2551c.onMenuOpened(108, c0131h);
            return true;
        }
    }

    private final class C0843b implements C0155a {
        final /* synthetic */ C0845n f2547a;

        C0843b(C0845n c0845n) {
            this.f2547a = c0845n;
        }

        public final boolean onMenuItemSelected(C0131h c0131h, MenuItem menuItem) {
            return false;
        }

        public final void onMenuModeChange(C0131h c0131h) {
            if (this.f2547a.f2551c == null) {
                return;
            }
            if (this.f2547a.f2549a.isOverflowMenuShowing()) {
                this.f2547a.f2551c.onPanelClosed(108, c0131h);
            } else if (this.f2547a.f2551c.onPreparePanel(0, null, c0131h)) {
                this.f2547a.f2551c.onMenuOpened(108, c0131h);
            }
        }
    }

    private class C0844c extends C0826i {
        final /* synthetic */ C0845n f2548a;

        public C0844c(C0845n c0845n, Callback callback) {
            this.f2548a = c0845n;
            super(callback);
        }

        public final View onCreatePanelView(int i) {
            return i == 0 ? new View(this.f2548a.f2549a.getContext()) : super.onCreatePanelView(i);
        }

        public final boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !this.f2548a.f2550b) {
                this.f2548a.f2549a.setMenuPrepared();
                this.f2548a.f2550b = true;
            }
            return onPreparePanel;
        }
    }

    C0845n(Toolbar toolbar, CharSequence charSequence, Callback callback) {
        this.f2549a = new ToolbarWidgetWrapper(toolbar, false);
        this.f2551c = new C0844c(this, callback);
        this.f2549a.setWindowCallback(this.f2551c);
        toolbar.setOnMenuItemClickListener(this.f2556h);
        this.f2549a.setWindowTitle(charSequence);
    }

    private void m2428a(int i, int i2) {
        this.f2549a.setDisplayOptions((this.f2549a.getDisplayOptions() & (i2 ^ -1)) | (i & i2));
    }

    public final void mo802a() {
        m2428a(2, 2);
    }

    public final void mo803a(int i) {
        this.f2549a.setTitle(i != 0 ? this.f2549a.getContext().getText(i) : null);
    }

    public final void mo804a(Configuration configuration) {
        super.mo804a(configuration);
    }

    public final void mo805a(Drawable drawable) {
        this.f2549a.setNavigationIcon(drawable);
    }

    public final void mo806a(CharSequence charSequence) {
        this.f2549a.setTitle(charSequence);
    }

    public final void mo807a(boolean z) {
        m2428a(z ? 4 : 0, 4);
    }

    public final boolean mo808a(int i, KeyEvent keyEvent) {
        Menu j = m2452j();
        if (j == null) {
            return false;
        }
        j.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return j.performShortcut(i, keyEvent, 0);
    }

    public final boolean mo809a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo819e();
        }
        return true;
    }

    public final void mo810b() {
        m2428a(0, 16);
    }

    public final void mo811b(int i) {
        this.f2549a.setNavigationContentDescription(i);
    }

    public final void mo812b(CharSequence charSequence) {
        this.f2549a.setWindowTitle(charSequence);
    }

    public final void mo813b(boolean z) {
        m2428a(z ? 8 : 0, 8);
    }

    public final int mo814c() {
        return this.f2549a.getDisplayOptions();
    }

    public final void mo815c(boolean z) {
    }

    public final Context mo816d() {
        return this.f2549a.getContext();
    }

    public final void mo817d(boolean z) {
    }

    public final void mo818e(boolean z) {
    }

    public final boolean mo819e() {
        return this.f2549a.showOverflowMenu();
    }

    public final void mo820f(boolean z) {
        if (z != this.f2553e) {
            this.f2553e = z;
            int size = this.f2554f.size();
            for (int i = 0; i < size; i++) {
                this.f2554f.get(i);
            }
        }
    }

    public final boolean mo821f() {
        return this.f2549a.hideOverflowMenu();
    }

    public final boolean mo822g() {
        this.f2549a.getViewGroup().removeCallbacks(this.f2555g);
        C0679r.m1916a(this.f2549a.getViewGroup(), this.f2555g);
        return true;
    }

    public final boolean mo823h() {
        if (!this.f2549a.hasExpandedActionView()) {
            return false;
        }
        this.f2549a.collapseActionView();
        return true;
    }

    final void mo824i() {
        this.f2549a.getViewGroup().removeCallbacks(this.f2555g);
    }

    final Menu m2452j() {
        if (!this.f2552d) {
            this.f2549a.setMenuCallbacks(new C0842a(this), new C0843b(this));
            this.f2552d = true;
        }
        return this.f2549a.getMenu();
    }
}
