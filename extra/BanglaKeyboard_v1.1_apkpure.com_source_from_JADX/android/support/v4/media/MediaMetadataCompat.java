package android.support.v4.media;

import android.media.MediaMetadata;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p018f.C0478a;

public final class MediaMetadataCompat implements Parcelable {
    public static final Creator<MediaMetadataCompat> CREATOR = new C05481();
    static final C0478a<String, Integer> f1703a;
    private static final String[] f1704c = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
    private static final String[] f1705d = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
    private static final String[] f1706e = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
    final Bundle f1707b;
    private Object f1708f;

    static class C05481 implements Creator<MediaMetadataCompat> {
        C05481() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        C0478a c0478a = new C0478a();
        f1703a = c0478a;
        c0478a.put("android.media.metadata.TITLE", Integer.valueOf(1));
        f1703a.put("android.media.metadata.ARTIST", Integer.valueOf(1));
        f1703a.put("android.media.metadata.DURATION", Integer.valueOf(0));
        f1703a.put("android.media.metadata.ALBUM", Integer.valueOf(1));
        f1703a.put("android.media.metadata.AUTHOR", Integer.valueOf(1));
        f1703a.put("android.media.metadata.WRITER", Integer.valueOf(1));
        f1703a.put("android.media.metadata.COMPOSER", Integer.valueOf(1));
        f1703a.put("android.media.metadata.COMPILATION", Integer.valueOf(1));
        f1703a.put("android.media.metadata.DATE", Integer.valueOf(1));
        f1703a.put("android.media.metadata.YEAR", Integer.valueOf(0));
        f1703a.put("android.media.metadata.GENRE", Integer.valueOf(1));
        f1703a.put("android.media.metadata.TRACK_NUMBER", Integer.valueOf(0));
        f1703a.put("android.media.metadata.NUM_TRACKS", Integer.valueOf(0));
        f1703a.put("android.media.metadata.DISC_NUMBER", Integer.valueOf(0));
        f1703a.put("android.media.metadata.ALBUM_ARTIST", Integer.valueOf(1));
        f1703a.put("android.media.metadata.ART", Integer.valueOf(2));
        f1703a.put("android.media.metadata.ART_URI", Integer.valueOf(1));
        f1703a.put("android.media.metadata.ALBUM_ART", Integer.valueOf(2));
        f1703a.put("android.media.metadata.ALBUM_ART_URI", Integer.valueOf(1));
        f1703a.put("android.media.metadata.USER_RATING", Integer.valueOf(3));
        f1703a.put("android.media.metadata.RATING", Integer.valueOf(3));
        f1703a.put("android.media.metadata.DISPLAY_TITLE", Integer.valueOf(1));
        f1703a.put("android.media.metadata.DISPLAY_SUBTITLE", Integer.valueOf(1));
        f1703a.put("android.media.metadata.DISPLAY_DESCRIPTION", Integer.valueOf(1));
        f1703a.put("android.media.metadata.DISPLAY_ICON", Integer.valueOf(2));
        f1703a.put("android.media.metadata.DISPLAY_ICON_URI", Integer.valueOf(1));
        f1703a.put("android.media.metadata.MEDIA_ID", Integer.valueOf(1));
        f1703a.put("android.media.metadata.BT_FOLDER_TYPE", Integer.valueOf(0));
        f1703a.put("android.media.metadata.MEDIA_URI", Integer.valueOf(1));
        f1703a.put("android.media.metadata.ADVERTISEMENT", Integer.valueOf(0));
        f1703a.put("android.media.metadata.DOWNLOAD_STATUS", Integer.valueOf(0));
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f1707b = parcel.readBundle();
    }

    public static MediaMetadataCompat m1382a(Object obj) {
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        ((MediaMetadata) obj).writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        mediaMetadataCompat.f1708f = obj;
        return mediaMetadataCompat;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f1707b);
    }
}
