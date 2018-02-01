package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.p010b.p011a.C0427b;
import android.support.v4.view.C0650b.C0645b;
import android.support.v7.view.menu.C0972k.C0968a;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

final class C0974l extends C0972k {

    class C0973a extends C0968a implements VisibilityListener {
        C0645b f3104c;
        final /* synthetic */ C0974l f3105d;

        public C0973a(C0974l c0974l, Context context, ActionProvider actionProvider) {
            this.f3105d = c0974l;
            super(c0974l, context, actionProvider);
        }

        public final boolean isVisible() {
            return this.a.isVisible();
        }

        public final void onActionProviderVisibilityChanged(boolean z) {
            if (this.f3104c != null) {
                this.f3104c.mo933a();
            }
        }

        public final View onCreateActionView(MenuItem menuItem) {
            return this.a.onCreateActionView(menuItem);
        }

        public final boolean overridesItemVisibility() {
            return this.a.overridesItemVisibility();
        }

        public final void refreshVisibility() {
            this.a.refreshVisibility();
        }

        public final void setVisibilityListener(C0645b c0645b) {
            VisibilityListener visibilityListener;
            this.f3104c = c0645b;
            ActionProvider actionProvider = this.a;
            if (c0645b == null) {
                visibilityListener = null;
            }
            actionProvider.setVisibilityListener(visibilityListener);
        }
    }

    C0974l(Context context, C0427b c0427b) {
        super(context, c0427b);
    }

    final C0968a mo945a(ActionProvider actionProvider) {
        return new C0973a(this, this.a, actionProvider);
    }
}
