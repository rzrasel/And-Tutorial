package android.support.v4.media;

import android.media.browse.MediaBrowser.ConnectionCallback;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.browse.MediaBrowser.SubscriptionCallback;
import java.util.List;

final class C0552a {

    interface C0504a {
        void mo488a();

        void mo489b();

        void mo490c();
    }

    interface C0521c {
        void mo499a(List<?> list);
    }

    static class C0550b<T extends C0504a> extends ConnectionCallback {
        protected final T f1711a;

        public C0550b(T t) {
            this.f1711a = t;
        }

        public final void onConnected() {
            this.f1711a.mo488a();
        }

        public final void onConnectionFailed() {
            this.f1711a.mo490c();
        }

        public final void onConnectionSuspended() {
            this.f1711a.mo489b();
        }
    }

    static class C0551d<T extends C0521c> extends SubscriptionCallback {
        protected final T f1712a;

        public C0551d(T t) {
            this.f1712a = t;
        }

        public void onChildrenLoaded(String str, List<MediaItem> list) {
            this.f1712a.mo499a(list);
        }

        public void onError(String str) {
        }
    }
}
