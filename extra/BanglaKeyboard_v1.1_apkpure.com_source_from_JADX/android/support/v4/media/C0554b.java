package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.support.v4.media.C0552a.C0521c;
import android.support.v4.media.C0552a.C0551d;
import java.util.List;

final class C0554b {

    interface C0523a extends C0521c {
        void mo500b(List<?> list);
    }

    static class C0553b<T extends C0523a> extends C0551d<T> {
        public C0553b(T t) {
            super(t);
        }

        public final void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
            ((C0523a) this.a).mo500b(list);
        }

        public final void onError(String str, Bundle bundle) {
        }
    }
}
