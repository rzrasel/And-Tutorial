package android.support.v4.widget;

import android.database.ContentObserver;
import android.os.Handler;

final class C0106e extends ContentObserver {
    final /* synthetic */ C0105d f333a;

    public C0106e(C0105d c0105d) {
        this.f333a = c0105d;
        super(new Handler());
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean z) {
        this.f333a.onContentChanged();
    }
}
