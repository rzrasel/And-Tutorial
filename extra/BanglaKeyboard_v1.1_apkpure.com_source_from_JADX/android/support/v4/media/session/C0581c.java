package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

final class C0581c {

    public interface C0563a {
        void mo523a();

        void mo524a(int i, int i2, int i3, int i4, int i5);

        void mo525a(Object obj);

        void mo526a(List<?> list);

        void mo527b();

        void mo528b(Object obj);

        void mo529c();

        void mo530d();
    }

    static class C0580b<T extends C0563a> extends Callback {
        protected final T f1767a;

        public C0580b(T t) {
            this.f1767a = t;
        }

        public final void onAudioInfoChanged(PlaybackInfo playbackInfo) {
            int i;
            C0563a c0563a = this.f1767a;
            int playbackType = playbackInfo.getPlaybackType();
            AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
            if ((audioAttributes.getFlags() & 1) != 1) {
                if ((audioAttributes.getFlags() & 4) != 4) {
                    switch (audioAttributes.getUsage()) {
                        case 1:
                        case 11:
                        case 12:
                        case 14:
                            i = 3;
                            break;
                        case 2:
                            i = 0;
                            break;
                        case 3:
                            i = 8;
                            break;
                        case 4:
                            i = 4;
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i = 5;
                            break;
                        case 6:
                            i = 2;
                            break;
                        case 13:
                            i = 1;
                            break;
                        default:
                            i = 3;
                            break;
                    }
                }
                i = 6;
            } else {
                i = 7;
            }
            c0563a.mo524a(playbackType, i, playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public final void onExtrasChanged(Bundle bundle) {
            this.f1767a.mo530d();
        }

        public final void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f1767a.mo528b(mediaMetadata);
        }

        public final void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f1767a.mo525a((Object) playbackState);
        }

        public final void onQueueChanged(List<QueueItem> list) {
            this.f1767a.mo526a((List) list);
        }

        public final void onQueueTitleChanged(CharSequence charSequence) {
            this.f1767a.mo529c();
        }

        public final void onSessionDestroyed() {
            this.f1767a.mo523a();
        }

        public final void onSessionEvent(String str, Bundle bundle) {
            this.f1767a.mo527b();
        }
    }
}
