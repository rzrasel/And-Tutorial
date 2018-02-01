package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.v4.os.C0583a.C0584a;

public class ResultReceiver implements Parcelable {
    public static final Creator<ResultReceiver> CREATOR = new C05821();
    final boolean f1568a = false;
    final Handler f1569b = null;
    C0583a f1570c;

    static class C05821 implements Creator<ResultReceiver> {
        C05821() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    class C0585a extends C0584a {
        final /* synthetic */ ResultReceiver f1768a;

        C0585a(ResultReceiver resultReceiver) {
            this.f1768a = resultReceiver;
        }

        public final void mo580a(int i, Bundle bundle) {
            if (this.f1768a.f1569b != null) {
                this.f1768a.f1569b.post(new C0586b(this.f1768a, i, bundle));
            } else {
                this.f1768a.mo487a(i, bundle);
            }
        }
    }

    class C0586b implements Runnable {
        final int f1769a;
        final Bundle f1770b;
        final /* synthetic */ ResultReceiver f1771c;

        C0586b(ResultReceiver resultReceiver, int i, Bundle bundle) {
            this.f1771c = resultReceiver;
            this.f1769a = i;
            this.f1770b = bundle;
        }

        public final void run() {
            this.f1771c.mo487a(this.f1769a, this.f1770b);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f1570c = C0584a.m1557a(parcel.readStrongBinder());
    }

    public void mo487a(int i, Bundle bundle) {
    }

    public final void m1309b(int i, Bundle bundle) {
        if (this.f1568a) {
            if (this.f1569b != null) {
                this.f1569b.post(new C0586b(this, i, bundle));
            } else {
                mo487a(i, bundle);
            }
        } else if (this.f1570c != null) {
            try {
                this.f1570c.mo580a(i, bundle);
            } catch (RemoteException e) {
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f1570c == null) {
                this.f1570c = new C0585a(this);
            }
            parcel.writeStrongBinder(this.f1570c.asBinder());
        }
    }
}
