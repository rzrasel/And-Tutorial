package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.support.v7.app.C0823c;
import android.support.v7.view.menu.C0121o.C0803a;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;

final class C0965i implements OnClickListener, OnDismissListener, OnKeyListener, C0803a {
    C0131h f3058a;
    C0823c f3059b;
    C0963f f3060c;
    private C0803a f3061d;

    public C0965i(C0131h c0131h) {
        this.f3058a = c0131h;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3058a.m257a((C0967j) this.f3060c.m2802a().getItem(i), null, 0);
    }

    public final void onCloseMenu(C0131h c0131h, boolean z) {
        if ((z || c0131h == this.f3058a) && this.f3059b != null) {
            this.f3059b.dismiss();
        }
        if (this.f3061d != null) {
            this.f3061d.onCloseMenu(c0131h, z);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f3060c.onCloseMenu(this.f3058a, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            Window window;
            View decorView;
            DispatcherState keyDispatcherState;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                window = this.f3059b.getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                    if (decorView != null) {
                        keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                window = this.f3059b.getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                    if (decorView != null) {
                        keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null && keyDispatcherState.isTracking(keyEvent)) {
                            this.f3058a.m260b(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f3058a.performShortcut(i, keyEvent, 0);
    }

    public final boolean onOpenSubMenu(C0131h c0131h) {
        return this.f3061d != null ? this.f3061d.onOpenSubMenu(c0131h) : false;
    }
}
