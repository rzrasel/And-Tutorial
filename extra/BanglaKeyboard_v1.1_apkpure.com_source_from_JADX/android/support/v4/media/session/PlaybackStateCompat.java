package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Creator<PlaybackStateCompat> CREATOR = new C05741();
    final int f1753a;
    final long f1754b;
    final long f1755c;
    final float f1756d;
    final long f1757e;
    final int f1758f;
    final CharSequence f1759g;
    final long f1760h;
    List<CustomAction> f1761i;
    final long f1762j;
    final Bundle f1763k;
    private Object f1764l;

    static class C05741 implements Creator<PlaybackStateCompat> {
        C05741() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public static final class CustomAction implements Parcelable {
        public static final Creator<CustomAction> CREATOR = new C05751();
        private final String f1748a;
        private final CharSequence f1749b;
        private final int f1750c;
        private final Bundle f1751d;
        private Object f1752e;

        static class C05751 implements Creator<CustomAction> {
            C05751() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(Parcel parcel) {
            this.f1748a = parcel.readString();
            this.f1749b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1750c = parcel.readInt();
            this.f1751d = parcel.readBundle();
        }

        private CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f1748a = str;
            this.f1749b = charSequence;
            this.f1750c = i;
            this.f1751d = bundle;
        }

        public static CustomAction m1443a(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(((android.media.session.PlaybackState.CustomAction) obj).getAction(), ((android.media.session.PlaybackState.CustomAction) obj).getName(), ((android.media.session.PlaybackState.CustomAction) obj).getIcon(), ((android.media.session.PlaybackState.CustomAction) obj).getExtras());
            customAction.f1752e = obj;
            return customAction;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + this.f1749b + ", mIcon=" + this.f1750c + ", mExtras=" + this.f1751d;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1748a);
            TextUtils.writeToParcel(this.f1749b, parcel, i);
            parcel.writeInt(this.f1750c);
            parcel.writeBundle(this.f1751d);
        }
    }

    private PlaybackStateCompat(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f1753a = i;
        this.f1754b = j;
        this.f1755c = j2;
        this.f1756d = f;
        this.f1757e = j3;
        this.f1758f = 0;
        this.f1759g = charSequence;
        this.f1760h = j4;
        this.f1761i = new ArrayList(list);
        this.f1762j = j5;
        this.f1763k = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f1753a = parcel.readInt();
        this.f1754b = parcel.readLong();
        this.f1756d = parcel.readFloat();
        this.f1760h = parcel.readLong();
        this.f1755c = parcel.readLong();
        this.f1757e = parcel.readLong();
        this.f1759g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1761i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f1762j = parcel.readLong();
        this.f1763k = parcel.readBundle();
        this.f1758f = parcel.readInt();
    }

    public static PlaybackStateCompat m1444a(Object obj) {
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> customActions = ((PlaybackState) obj).getCustomActions();
        List list = null;
        if (customActions != null) {
            list = new ArrayList(customActions.size());
            for (Object a : customActions) {
                list.add(CustomAction.m1443a(a));
            }
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(((PlaybackState) obj).getState(), ((PlaybackState) obj).getPosition(), ((PlaybackState) obj).getBufferedPosition(), ((PlaybackState) obj).getPlaybackSpeed(), ((PlaybackState) obj).getActions(), ((PlaybackState) obj).getErrorMessage(), ((PlaybackState) obj).getLastPositionUpdateTime(), list, ((PlaybackState) obj).getActiveQueueItemId(), VERSION.SDK_INT >= 22 ? ((PlaybackState) obj).getExtras() : null);
        playbackStateCompat.f1764l = obj;
        return playbackStateCompat;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlaybackState {");
        stringBuilder.append("state=").append(this.f1753a);
        stringBuilder.append(", position=").append(this.f1754b);
        stringBuilder.append(", buffered position=").append(this.f1755c);
        stringBuilder.append(", speed=").append(this.f1756d);
        stringBuilder.append(", updated=").append(this.f1760h);
        stringBuilder.append(", actions=").append(this.f1757e);
        stringBuilder.append(", error code=").append(this.f1758f);
        stringBuilder.append(", error message=").append(this.f1759g);
        stringBuilder.append(", custom actions=").append(this.f1761i);
        stringBuilder.append(", active item id=").append(this.f1762j);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1753a);
        parcel.writeLong(this.f1754b);
        parcel.writeFloat(this.f1756d);
        parcel.writeLong(this.f1760h);
        parcel.writeLong(this.f1755c);
        parcel.writeLong(this.f1757e);
        TextUtils.writeToParcel(this.f1759g, parcel, i);
        parcel.writeTypedList(this.f1761i);
        parcel.writeLong(this.f1762j);
        parcel.writeBundle(this.f1763k);
        parcel.writeInt(this.f1758f);
    }
}
