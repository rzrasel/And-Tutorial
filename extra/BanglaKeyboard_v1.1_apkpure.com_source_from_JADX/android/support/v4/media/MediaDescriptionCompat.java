package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Creator<MediaDescriptionCompat> CREATOR = new C05461();
    final String f1694a;
    private final CharSequence f1695b;
    private final CharSequence f1696c;
    private final CharSequence f1697d;
    private final Bitmap f1698e;
    private final Uri f1699f;
    private final Bundle f1700g;
    private final Uri f1701h;
    private Object f1702i;

    static class C05461 implements Creator<MediaDescriptionCompat> {
        C05461() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m1381a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public static final class C0547a {
        String f1686a;
        CharSequence f1687b;
        CharSequence f1688c;
        CharSequence f1689d;
        Bitmap f1690e;
        Uri f1691f;
        Bundle f1692g;
        Uri f1693h;
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f1694a = parcel.readString();
        this.f1695b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1696c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1697d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1698e = (Bitmap) parcel.readParcelable(null);
        this.f1699f = (Uri) parcel.readParcelable(null);
        this.f1700g = parcel.readBundle();
        this.f1701h = (Uri) parcel.readParcelable(null);
    }

    private MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f1694a = str;
        this.f1695b = charSequence;
        this.f1696c = charSequence2;
        this.f1697d = charSequence3;
        this.f1698e = bitmap;
        this.f1699f = uri;
        this.f1700g = bundle;
        this.f1701h = uri2;
    }

    public static MediaDescriptionCompat m1381a(Object obj) {
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        Bundle bundle;
        MediaDescriptionCompat mediaDescriptionCompat;
        C0547a c0547a = new C0547a();
        c0547a.f1686a = ((MediaDescription) obj).getMediaId();
        c0547a.f1687b = ((MediaDescription) obj).getTitle();
        c0547a.f1688c = ((MediaDescription) obj).getSubtitle();
        c0547a.f1689d = ((MediaDescription) obj).getDescription();
        c0547a.f1690e = ((MediaDescription) obj).getIconBitmap();
        c0547a.f1691f = ((MediaDescription) obj).getIconUri();
        Bundle extras = ((MediaDescription) obj).getExtras();
        Uri uri = extras == null ? null : (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
        if (uri != null) {
            if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                bundle = null;
                c0547a.f1692g = bundle;
                if (uri != null) {
                    c0547a.f1693h = uri;
                } else if (VERSION.SDK_INT >= 23) {
                    c0547a.f1693h = ((MediaDescription) obj).getMediaUri();
                }
                mediaDescriptionCompat = new MediaDescriptionCompat(c0547a.f1686a, c0547a.f1687b, c0547a.f1688c, c0547a.f1689d, c0547a.f1690e, c0547a.f1691f, c0547a.f1692g, c0547a.f1693h);
                mediaDescriptionCompat.f1702i = obj;
                return mediaDescriptionCompat;
            }
            extras.remove("android.support.v4.media.description.MEDIA_URI");
            extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        }
        bundle = extras;
        c0547a.f1692g = bundle;
        if (uri != null) {
            c0547a.f1693h = uri;
        } else if (VERSION.SDK_INT >= 23) {
            c0547a.f1693h = ((MediaDescription) obj).getMediaUri();
        }
        mediaDescriptionCompat = new MediaDescriptionCompat(c0547a.f1686a, c0547a.f1687b, c0547a.f1688c, c0547a.f1689d, c0547a.f1690e, c0547a.f1691f, c0547a.f1692g, c0547a.f1693h);
        mediaDescriptionCompat.f1702i = obj;
        return mediaDescriptionCompat;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f1695b + ", " + this.f1696c + ", " + this.f1697d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (VERSION.SDK_INT < 21) {
            parcel.writeString(this.f1694a);
            TextUtils.writeToParcel(this.f1695b, parcel, i);
            TextUtils.writeToParcel(this.f1696c, parcel, i);
            TextUtils.writeToParcel(this.f1697d, parcel, i);
            parcel.writeParcelable(this.f1698e, i);
            parcel.writeParcelable(this.f1699f, i);
            parcel.writeBundle(this.f1700g);
            parcel.writeParcelable(this.f1701h, i);
            return;
        }
        Object obj;
        if (this.f1702i != null || VERSION.SDK_INT < 21) {
            obj = this.f1702i;
        } else {
            Bundle bundle;
            Builder builder = new Builder();
            builder.setMediaId(this.f1694a);
            builder.setTitle(this.f1695b);
            builder.setSubtitle(this.f1696c);
            builder.setDescription(this.f1697d);
            builder.setIconBitmap(this.f1698e);
            builder.setIconUri(this.f1699f);
            Bundle bundle2 = this.f1700g;
            if (VERSION.SDK_INT >= 23 || this.f1701h == null) {
                bundle = bundle2;
            } else {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                    bundle2.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle2.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f1701h);
                bundle = bundle2;
            }
            builder.setExtras(bundle);
            if (VERSION.SDK_INT >= 23) {
                builder.setMediaUri(this.f1701h);
            }
            this.f1702i = builder.build();
            obj = this.f1702i;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }
}
