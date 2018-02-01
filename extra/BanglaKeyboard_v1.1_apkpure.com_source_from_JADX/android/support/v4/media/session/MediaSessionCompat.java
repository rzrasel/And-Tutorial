package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;

public class MediaSessionCompat {

    public static final class QueueItem implements Parcelable {
        public static final Creator<QueueItem> CREATOR = new C05701();
        private final MediaDescriptionCompat f1737a;
        private final long f1738b;
        private Object f1739c;

        static class C05701 implements Creator<QueueItem> {
            C05701() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        QueueItem(Parcel parcel) {
            this.f1737a = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f1738b = parcel.readLong();
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            } else {
                this.f1737a = mediaDescriptionCompat;
                this.f1738b = j;
                this.f1739c = obj;
            }
        }

        public static List<QueueItem> m1440a(List<?> list) {
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            List<QueueItem> arrayList = new ArrayList();
            for (Object next : list) {
                Object queueItem = (next == null || VERSION.SDK_INT < 21) ? null : new QueueItem(next, MediaDescriptionCompat.m1381a(((android.media.session.MediaSession.QueueItem) next).getDescription()), ((android.media.session.MediaSession.QueueItem) next).getQueueId());
                arrayList.add(queueItem);
            }
            return arrayList;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaSession.QueueItem {Description=" + this.f1737a + ", Id=" + this.f1738b + " }";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.f1737a.writeToParcel(parcel, i);
            parcel.writeLong(this.f1738b);
        }
    }

    static final class ResultReceiverWrapper implements Parcelable {
        public static final Creator<ResultReceiverWrapper> CREATOR = new C05711();
        private ResultReceiver f1740a;

        static class C05711 implements Creator<ResultReceiverWrapper> {
            C05711() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f1740a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.f1740a.writeToParcel(parcel, i);
        }
    }

    public static final class Token implements Parcelable {
        public static final Creator<Token> CREATOR = new C05721();
        final Object f1741a;
        final C0577b f1742b;

        static class C05721 implements Creator<Token> {
            C05721() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Token(VERSION.SDK_INT >= 21 ? parcel.readParcelable(null) : parcel.readStrongBinder());
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, null);
        }

        private Token(Object obj, C0577b c0577b) {
            this.f1741a = obj;
            this.f1742b = c0577b;
        }

        public static Token m1441a(Object obj) {
            return m1442a(obj, null);
        }

        public static Token m1442a(Object obj, C0577b c0577b) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            if (obj instanceof android.media.session.MediaSession.Token) {
                return new Token(obj, c0577b);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            return this.f1741a == null ? token.f1741a == null : token.f1741a == null ? false : this.f1741a.equals(token.f1741a);
        }

        public final int hashCode() {
            return this.f1741a == null ? 0 : this.f1741a.hashCode();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            if (VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f1741a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f1741a);
            }
        }
    }
}
