package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.C0439b;
import android.support.v4.content.C0439b.C0422a;
import android.support.v4.content.C0439b.C0423b;
import android.support.v4.p018f.C0482d;
import android.support.v4.p018f.C0500n;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class LoaderManagerImpl extends LoaderManager {
    static boolean DEBUG = false;
    static final String TAG = "LoaderManager";
    boolean mCreatingLoader;
    FragmentHostCallback mHost;
    final C0500n<LoaderInfo> mInactiveLoaders = new C0500n();
    final C0500n<LoaderInfo> mLoaders = new C0500n();
    boolean mRetaining;
    boolean mRetainingStarted;
    boolean mStarted;
    final String mWho;

    final class LoaderInfo implements C0422a<Object>, C0423b<Object> {
        final Bundle mArgs;
        LoaderCallbacks<Object> mCallbacks;
        Object mData;
        boolean mDeliveredData;
        boolean mDestroyed;
        boolean mHaveData;
        final int mId;
        boolean mListenerRegistered;
        C0439b<Object> mLoader;
        LoaderInfo mPendingLoader;
        boolean mReportNextStart;
        boolean mRetaining;
        boolean mRetainingStarted;
        boolean mStarted;

        public LoaderInfo(int i, Bundle bundle, LoaderCallbacks<Object> loaderCallbacks) {
            this.mId = i;
            this.mArgs = bundle;
            this.mCallbacks = loaderCallbacks;
        }

        final void callOnLoadFinished(C0439b<Object> c0439b, Object obj) {
            String str;
            if (this.mCallbacks != null) {
                if (LoaderManagerImpl.this.mHost != null) {
                    String str2 = LoaderManagerImpl.this.mHost.mFragmentManager.mNoTransactionsBecause;
                    LoaderManagerImpl.this.mHost.mFragmentManager.mNoTransactionsBecause = "onLoadFinished";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    if (LoaderManagerImpl.DEBUG) {
                        StringBuilder append = new StringBuilder("  onLoadFinished in ").append(c0439b).append(": ");
                        StringBuilder stringBuilder = new StringBuilder(64);
                        C0482d.m1274a(obj, stringBuilder);
                        stringBuilder.append("}");
                        append.append(stringBuilder.toString());
                    }
                    this.mCallbacks.onLoadFinished(c0439b, obj);
                    this.mDeliveredData = true;
                } finally {
                    if (LoaderManagerImpl.this.mHost != null) {
                        LoaderManagerImpl.this.mHost.mFragmentManager.mNoTransactionsBecause = str;
                    }
                }
            }
        }

        final boolean cancel() {
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("  Canceling: ").append(this);
            }
            if (this.mStarted && this.mLoader != null && this.mListenerRegistered) {
                onLoadCanceled(this.mLoader);
            }
            return false;
        }

        final void destroy() {
            String str;
            Object obj = 1;
            LoaderCallbacks loaderCallbacks = null;
            Object obj2 = null;
            while (true) {
                C0422a c0422a;
                if (LoaderManagerImpl.DEBUG) {
                    new StringBuilder("  Destroying: ").append(c0422a);
                }
                c0422a.mDestroyed = obj;
                boolean z = c0422a.mDeliveredData;
                c0422a.mDeliveredData = obj2;
                if (c0422a.mCallbacks != null && c0422a.mLoader != null && c0422a.mHaveData && z) {
                    if (LoaderManagerImpl.DEBUG) {
                        new StringBuilder("  Resetting: ").append(c0422a);
                    }
                    if (LoaderManagerImpl.this.mHost != null) {
                        String str2 = LoaderManagerImpl.this.mHost.mFragmentManager.mNoTransactionsBecause;
                        LoaderManagerImpl.this.mHost.mFragmentManager.mNoTransactionsBecause = "onLoaderReset";
                        str = str2;
                    } else {
                        Object obj3 = loaderCallbacks;
                    }
                    try {
                        c0422a.mCallbacks.onLoaderReset(c0422a.mLoader);
                    } finally {
                        loaderCallbacks = LoaderManagerImpl.this.mHost;
                        if (loaderCallbacks != null) {
                            loaderCallbacks = LoaderManagerImpl.this.mHost.mFragmentManager;
                            loaderCallbacks.mNoTransactionsBecause = str;
                        }
                    }
                }
                c0422a.mCallbacks = loaderCallbacks;
                c0422a.mData = loaderCallbacks;
                c0422a.mHaveData = obj2;
                if (c0422a.mLoader != null) {
                    if (c0422a.mListenerRegistered) {
                        c0422a.mListenerRegistered = obj2;
                        c0422a.mLoader.m1173a((C0423b) c0422a);
                        c0422a.mLoader.m1172a(c0422a);
                    }
                    C0439b c0439b = c0422a.mLoader;
                    c0439b.f1424f = obj;
                    c0439b.f1422d = obj2;
                    c0439b.f1423e = obj2;
                    c0439b.f1425g = obj2;
                    c0439b.f1426h = obj2;
                }
                if (c0422a.mPendingLoader != null) {
                    c0422a = c0422a.mPendingLoader;
                } else {
                    return;
                }
            }
        }

        public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            while (true) {
                printWriter.print(str);
                printWriter.print("mId=");
                printWriter.print(this.mId);
                printWriter.print(" mArgs=");
                printWriter.println(this.mArgs);
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.mCallbacks);
                printWriter.print(str);
                printWriter.print("mLoader=");
                printWriter.println(this.mLoader);
                if (this.mLoader != null) {
                    C0439b c0439b = this.mLoader;
                    String str2 = str + "  ";
                    printWriter.print(str2);
                    printWriter.print("mId=");
                    printWriter.print(c0439b.f1419a);
                    printWriter.print(" mListener=");
                    printWriter.println(c0439b.f1420b);
                    if (c0439b.f1422d || c0439b.f1425g || c0439b.f1426h) {
                        printWriter.print(str2);
                        printWriter.print("mStarted=");
                        printWriter.print(c0439b.f1422d);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(c0439b.f1425g);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(c0439b.f1426h);
                    }
                    if (c0439b.f1423e || c0439b.f1424f) {
                        printWriter.print(str2);
                        printWriter.print("mAbandoned=");
                        printWriter.print(c0439b.f1423e);
                        printWriter.print(" mReset=");
                        printWriter.println(c0439b.f1424f);
                    }
                }
                if (this.mHaveData || this.mDeliveredData) {
                    printWriter.print(str);
                    printWriter.print("mHaveData=");
                    printWriter.print(this.mHaveData);
                    printWriter.print("  mDeliveredData=");
                    printWriter.println(this.mDeliveredData);
                    printWriter.print(str);
                    printWriter.print("mData=");
                    printWriter.println(this.mData);
                }
                printWriter.print(str);
                printWriter.print("mStarted=");
                printWriter.print(this.mStarted);
                printWriter.print(" mReportNextStart=");
                printWriter.print(this.mReportNextStart);
                printWriter.print(" mDestroyed=");
                printWriter.println(this.mDestroyed);
                printWriter.print(str);
                printWriter.print("mRetaining=");
                printWriter.print(this.mRetaining);
                printWriter.print(" mRetainingStarted=");
                printWriter.print(this.mRetainingStarted);
                printWriter.print(" mListenerRegistered=");
                printWriter.println(this.mListenerRegistered);
                if (this.mPendingLoader != null) {
                    printWriter.print(str);
                    printWriter.println("Pending Loader ");
                    printWriter.print(this.mPendingLoader);
                    printWriter.println(":");
                    this = this.mPendingLoader;
                    str = str + "  ";
                } else {
                    return;
                }
            }
        }

        final void finishRetain() {
            if (this.mRetaining) {
                if (LoaderManagerImpl.DEBUG) {
                    new StringBuilder("  Finished Retaining: ").append(this);
                }
                this.mRetaining = false;
                if (!(this.mStarted == this.mRetainingStarted || this.mStarted)) {
                    stop();
                }
            }
            if (this.mStarted && this.mHaveData && !this.mReportNextStart) {
                callOnLoadFinished(this.mLoader, this.mData);
            }
        }

        public final void onLoadCanceled(C0439b<Object> c0439b) {
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("onLoadCanceled: ").append(this);
            }
            boolean z;
            if (this.mDestroyed) {
                z = LoaderManagerImpl.DEBUG;
            } else if (LoaderManagerImpl.this.mLoaders.m1299a(this.mId) != this) {
                z = LoaderManagerImpl.DEBUG;
            } else {
                LoaderInfo loaderInfo = this.mPendingLoader;
                if (loaderInfo != null) {
                    if (LoaderManagerImpl.DEBUG) {
                        new StringBuilder("  Switching to pending loader: ").append(loaderInfo);
                    }
                    this.mPendingLoader = null;
                    LoaderManagerImpl.this.mLoaders.m1300a(this.mId, null);
                    destroy();
                    LoaderManagerImpl.this.installLoader(loaderInfo);
                }
            }
        }

        public final void onLoadComplete(C0439b<Object> c0439b, Object obj) {
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("onLoadComplete: ").append(this);
            }
            boolean z;
            if (this.mDestroyed) {
                z = LoaderManagerImpl.DEBUG;
            } else if (LoaderManagerImpl.this.mLoaders.m1299a(this.mId) != this) {
                z = LoaderManagerImpl.DEBUG;
            } else {
                LoaderInfo loaderInfo = this.mPendingLoader;
                if (loaderInfo != null) {
                    if (LoaderManagerImpl.DEBUG) {
                        new StringBuilder("  Switching to pending loader: ").append(loaderInfo);
                    }
                    this.mPendingLoader = null;
                    LoaderManagerImpl.this.mLoaders.m1300a(this.mId, null);
                    destroy();
                    LoaderManagerImpl.this.installLoader(loaderInfo);
                    return;
                }
                if (!(this.mData == obj && this.mHaveData)) {
                    this.mData = obj;
                    this.mHaveData = true;
                    if (this.mStarted) {
                        callOnLoadFinished(c0439b, obj);
                    }
                }
                loaderInfo = (LoaderInfo) LoaderManagerImpl.this.mInactiveLoaders.m1299a(this.mId);
                if (!(loaderInfo == null || loaderInfo == this)) {
                    loaderInfo.mDeliveredData = false;
                    loaderInfo.destroy();
                    LoaderManagerImpl.this.mInactiveLoaders.m1302b(this.mId);
                }
                if (LoaderManagerImpl.this.mHost != null && !LoaderManagerImpl.this.hasRunningLoaders()) {
                    LoaderManagerImpl.this.mHost.mFragmentManager.startPendingDeferredFragments();
                }
            }
        }

        final void reportStart() {
            if (this.mStarted && this.mReportNextStart) {
                this.mReportNextStart = false;
                if (this.mHaveData && !this.mRetaining) {
                    callOnLoadFinished(this.mLoader, this.mData);
                }
            }
        }

        final void retain() {
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("  Retaining: ").append(this);
            }
            this.mRetaining = true;
            this.mRetainingStarted = this.mStarted;
            this.mStarted = false;
            this.mCallbacks = null;
        }

        final void start() {
            if (this.mRetaining && this.mRetainingStarted) {
                this.mStarted = true;
            } else if (!this.mStarted) {
                this.mStarted = true;
                if (LoaderManagerImpl.DEBUG) {
                    new StringBuilder("  Starting: ").append(this);
                }
                if (this.mLoader == null && this.mCallbacks != null) {
                    this.mLoader = this.mCallbacks.onCreateLoader(this.mId, this.mArgs);
                }
                if (this.mLoader == null) {
                    return;
                }
                if (!this.mLoader.getClass().isMemberClass() || Modifier.isStatic(this.mLoader.getClass().getModifiers())) {
                    C0439b c0439b;
                    if (!this.mListenerRegistered) {
                        c0439b = this.mLoader;
                        int i = this.mId;
                        if (c0439b.f1420b != null) {
                            throw new IllegalStateException("There is already a listener registered");
                        }
                        c0439b.f1420b = this;
                        c0439b.f1419a = i;
                        c0439b = this.mLoader;
                        if (c0439b.f1421c != null) {
                            throw new IllegalStateException("There is already a listener registered");
                        }
                        c0439b.f1421c = this;
                        this.mListenerRegistered = true;
                    }
                    c0439b = this.mLoader;
                    c0439b.f1422d = true;
                    c0439b.f1424f = false;
                    c0439b.f1423e = false;
                    return;
                }
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.mLoader);
            }
        }

        final void stop() {
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("  Stopping: ").append(this);
            }
            this.mStarted = false;
            if (!this.mRetaining && this.mLoader != null && this.mListenerRegistered) {
                this.mListenerRegistered = false;
                this.mLoader.m1173a((C0423b) this);
                this.mLoader.m1172a((C0422a) this);
                this.mLoader.f1422d = false;
            }
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("LoaderInfo{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" #");
            stringBuilder.append(this.mId);
            stringBuilder.append(" : ");
            C0482d.m1274a(this.mLoader, stringBuilder);
            stringBuilder.append("}}");
            return stringBuilder.toString();
        }
    }

    LoaderManagerImpl(String str, FragmentHostCallback fragmentHostCallback, boolean z) {
        this.mWho = str;
        this.mHost = fragmentHostCallback;
        this.mStarted = z;
    }

    private LoaderInfo createAndInstallLoader(int i, Bundle bundle, LoaderCallbacks<Object> loaderCallbacks) {
        try {
            this.mCreatingLoader = true;
            LoaderInfo createLoader = createLoader(i, bundle, loaderCallbacks);
            installLoader(createLoader);
            return createLoader;
        } finally {
            this.mCreatingLoader = false;
        }
    }

    private LoaderInfo createLoader(int i, Bundle bundle, LoaderCallbacks<Object> loaderCallbacks) {
        LoaderInfo loaderInfo = new LoaderInfo(i, bundle, loaderCallbacks);
        loaderInfo.mLoader = loaderCallbacks.onCreateLoader(i, bundle);
        return loaderInfo;
    }

    public void destroyLoader(int i) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (DEBUG) {
            new StringBuilder("destroyLoader in ").append(this).append(" of ").append(i);
        }
        int f = this.mLoaders.m1307f(i);
        if (f >= 0) {
            LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m1306e(f);
            this.mLoaders.m1304c(f);
            loaderInfo.destroy();
        }
        f = this.mInactiveLoaders.m1307f(i);
        if (f >= 0) {
            loaderInfo = (LoaderInfo) this.mInactiveLoaders.m1306e(f);
            this.mInactiveLoaders.m1304c(f);
            loaderInfo.destroy();
        }
        if (this.mHost != null && !hasRunningLoaders()) {
            this.mHost.mFragmentManager.startPendingDeferredFragments();
        }
    }

    void doDestroy() {
        int a;
        if (!this.mRetaining) {
            if (DEBUG) {
                new StringBuilder("Destroying Active in ").append(this);
            }
            for (a = this.mLoaders.m1298a() - 1; a >= 0; a--) {
                ((LoaderInfo) this.mLoaders.m1306e(a)).destroy();
            }
            this.mLoaders.m1301b();
        }
        if (DEBUG) {
            new StringBuilder("Destroying Inactive in ").append(this);
        }
        for (a = this.mInactiveLoaders.m1298a() - 1; a >= 0; a--) {
            ((LoaderInfo) this.mInactiveLoaders.m1306e(a)).destroy();
        }
        this.mInactiveLoaders.m1301b();
        this.mHost = null;
    }

    void doReportNextStart() {
        for (int a = this.mLoaders.m1298a() - 1; a >= 0; a--) {
            ((LoaderInfo) this.mLoaders.m1306e(a)).mReportNextStart = true;
        }
    }

    void doReportStart() {
        for (int a = this.mLoaders.m1298a() - 1; a >= 0; a--) {
            ((LoaderInfo) this.mLoaders.m1306e(a)).reportStart();
        }
    }

    void doRetain() {
        if (DEBUG) {
            new StringBuilder("Retaining in ").append(this);
        }
        if (this.mStarted) {
            this.mRetaining = true;
            this.mStarted = false;
            for (int a = this.mLoaders.m1298a() - 1; a >= 0; a--) {
                ((LoaderInfo) this.mLoaders.m1306e(a)).retain();
            }
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w(TAG, "Called doRetain when not started: " + this, runtimeException);
    }

    void doStart() {
        if (DEBUG) {
            new StringBuilder("Starting in ").append(this);
        }
        if (this.mStarted) {
            Throwable runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w(TAG, "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.mStarted = true;
        for (int a = this.mLoaders.m1298a() - 1; a >= 0; a--) {
            ((LoaderInfo) this.mLoaders.m1306e(a)).start();
        }
    }

    void doStop() {
        if (DEBUG) {
            new StringBuilder("Stopping in ").append(this);
        }
        if (this.mStarted) {
            for (int a = this.mLoaders.m1298a() - 1; a >= 0; a--) {
                ((LoaderInfo) this.mLoaders.m1306e(a)).stop();
            }
            this.mStarted = false;
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w(TAG, "Called doStop when not started: " + this, runtimeException);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 0;
        if (this.mLoaders.m1298a() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i2 = 0; i2 < this.mLoaders.m1298a(); i2++) {
                LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m1306e(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.mLoaders.m1305d(i2));
                printWriter.print(": ");
                printWriter.println(loaderInfo.toString());
                loaderInfo.dump(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.mInactiveLoaders.m1298a() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            while (i < this.mInactiveLoaders.m1298a()) {
                loaderInfo = (LoaderInfo) this.mInactiveLoaders.m1306e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.mInactiveLoaders.m1305d(i));
                printWriter.print(": ");
                printWriter.println(loaderInfo.toString());
                loaderInfo.dump(str3, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    void finishRetain() {
        if (this.mRetaining) {
            if (DEBUG) {
                new StringBuilder("Finished Retaining in ").append(this);
            }
            this.mRetaining = false;
            for (int a = this.mLoaders.m1298a() - 1; a >= 0; a--) {
                ((LoaderInfo) this.mLoaders.m1306e(a)).finishRetain();
            }
        }
    }

    public <D> C0439b<D> getLoader(int i) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m1299a(i);
        return loaderInfo != null ? loaderInfo.mPendingLoader != null ? loaderInfo.mPendingLoader.mLoader : loaderInfo.mLoader : null;
    }

    public boolean hasRunningLoaders() {
        int a = this.mLoaders.m1298a();
        boolean z = false;
        for (int i = 0; i < a; i++) {
            LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m1306e(i);
            int i2 = (!loaderInfo.mStarted || loaderInfo.mDeliveredData) ? 0 : 1;
            z |= i2;
        }
        return z;
    }

    public <D> C0439b<D> initLoader(int i, Bundle bundle, LoaderCallbacks<D> loaderCallbacks) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m1299a(i);
        if (DEBUG) {
            new StringBuilder("initLoader in ").append(this).append(": args=").append(bundle);
        }
        if (loaderInfo == null) {
            loaderInfo = createAndInstallLoader(i, bundle, loaderCallbacks);
            if (DEBUG) {
                new StringBuilder("  Created new loader ").append(loaderInfo);
            }
        } else {
            if (DEBUG) {
                new StringBuilder("  Re-using existing loader ").append(loaderInfo);
            }
            loaderInfo.mCallbacks = loaderCallbacks;
        }
        if (loaderInfo.mHaveData && this.mStarted) {
            loaderInfo.callOnLoadFinished(loaderInfo.mLoader, loaderInfo.mData);
        }
        return loaderInfo.mLoader;
    }

    void installLoader(LoaderInfo loaderInfo) {
        this.mLoaders.m1300a(loaderInfo.mId, loaderInfo);
        if (this.mStarted) {
            loaderInfo.start();
        }
    }

    public <D> C0439b<D> restartLoader(int i, Bundle bundle, LoaderCallbacks<D> loaderCallbacks) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m1299a(i);
        if (DEBUG) {
            new StringBuilder("restartLoader in ").append(this).append(": args=").append(bundle);
        }
        if (loaderInfo != null) {
            LoaderInfo loaderInfo2 = (LoaderInfo) this.mInactiveLoaders.m1299a(i);
            if (loaderInfo2 != null) {
                if (loaderInfo.mHaveData) {
                    if (DEBUG) {
                        new StringBuilder("  Removing last inactive loader: ").append(loaderInfo);
                    }
                    loaderInfo2.mDeliveredData = false;
                    loaderInfo2.destroy();
                } else if (loaderInfo.cancel()) {
                    if (loaderInfo.mPendingLoader != null) {
                        if (DEBUG) {
                            new StringBuilder("  Removing pending loader: ").append(loaderInfo.mPendingLoader);
                        }
                        loaderInfo.mPendingLoader.destroy();
                        loaderInfo.mPendingLoader = null;
                    }
                    loaderInfo.mPendingLoader = createLoader(i, bundle, loaderCallbacks);
                    return loaderInfo.mPendingLoader.mLoader;
                } else {
                    this.mLoaders.m1300a(i, null);
                    loaderInfo.destroy();
                }
            } else if (DEBUG) {
                new StringBuilder("  Making last loader inactive: ").append(loaderInfo);
            }
            loaderInfo.mLoader.f1423e = true;
            this.mInactiveLoaders.m1300a(i, loaderInfo);
        }
        return createAndInstallLoader(i, bundle, loaderCallbacks).mLoader;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        C0482d.m1274a(this.mHost, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    void updateHostController(FragmentHostCallback fragmentHostCallback) {
        this.mHost = fragmentHostCallback;
    }
}
