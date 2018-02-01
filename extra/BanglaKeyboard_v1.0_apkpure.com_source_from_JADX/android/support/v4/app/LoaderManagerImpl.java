package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.C0023j;
import android.support.v4.content.C0048i;
import android.support.v4.p001b.C0033d;
import android.support.v4.p001b.C0040m;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class LoaderManagerImpl extends LoaderManager {
    static boolean DEBUG = false;
    static final String TAG = "LoaderManager";
    FragmentActivity mActivity;
    boolean mCreatingLoader;
    final C0040m mInactiveLoaders = new C0040m();
    final C0040m mLoaders = new C0040m();
    boolean mRetaining;
    boolean mRetainingStarted;
    boolean mStarted;
    final String mWho;

    final class LoaderInfo implements C0023j {
        final Bundle mArgs;
        LoaderCallbacks mCallbacks;
        Object mData;
        boolean mDeliveredData;
        boolean mDestroyed;
        boolean mHaveData;
        final int mId;
        boolean mListenerRegistered;
        C0048i mLoader;
        LoaderInfo mPendingLoader;
        boolean mReportNextStart;
        boolean mRetaining;
        boolean mRetainingStarted;
        boolean mStarted;

        public LoaderInfo(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
            this.mId = i;
            this.mArgs = bundle;
            this.mCallbacks = loaderCallbacks;
        }

        final void callOnLoadFinished(C0048i c0048i, Object obj) {
            String str;
            if (this.mCallbacks != null) {
                if (LoaderManagerImpl.this.mActivity != null) {
                    String str2 = LoaderManagerImpl.this.mActivity.mFragments.mNoTransactionsBecause;
                    LoaderManagerImpl.this.mActivity.mFragments.mNoTransactionsBecause = "onLoadFinished";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    if (LoaderManagerImpl.DEBUG) {
                        StringBuilder append = new StringBuilder("  onLoadFinished in ").append(c0048i).append(": ");
                        StringBuilder stringBuilder = new StringBuilder(64);
                        C0033d.m35a(obj, stringBuilder);
                        stringBuilder.append("}");
                        append.append(stringBuilder.toString()).toString();
                    }
                    this.mCallbacks.onLoadFinished(c0048i, obj);
                    this.mDeliveredData = true;
                } finally {
                    if (LoaderManagerImpl.this.mActivity != null) {
                        LoaderManagerImpl.this.mActivity.mFragments.mNoTransactionsBecause = str;
                    }
                }
            }
        }

        final void destroy() {
            String str;
            Object obj = 1;
            LoaderCallbacks loaderCallbacks = null;
            Object obj2 = null;
            while (true) {
                if (LoaderManagerImpl.DEBUG) {
                    "  Destroying: " + this;
                }
                this.mDestroyed = obj;
                boolean z = this.mDeliveredData;
                this.mDeliveredData = obj2;
                if (this.mCallbacks != null && this.mLoader != null && this.mHaveData && z) {
                    if (LoaderManagerImpl.DEBUG) {
                        "  Reseting: " + this;
                    }
                    if (LoaderManagerImpl.this.mActivity != null) {
                        String str2 = LoaderManagerImpl.this.mActivity.mFragments.mNoTransactionsBecause;
                        LoaderManagerImpl.this.mActivity.mFragments.mNoTransactionsBecause = "onLoaderReset";
                        str = str2;
                    } else {
                        Object obj3 = loaderCallbacks;
                    }
                    try {
                        this.mCallbacks.onLoaderReset(this.mLoader);
                    } finally {
                        loaderCallbacks = LoaderManagerImpl.this.mActivity;
                        if (loaderCallbacks != null) {
                            loaderCallbacks = LoaderManagerImpl.this.mActivity.mFragments;
                            loaderCallbacks.mNoTransactionsBecause = str;
                        }
                    }
                }
                this.mCallbacks = loaderCallbacks;
                this.mData = loaderCallbacks;
                this.mHaveData = obj2;
                if (this.mLoader != null) {
                    if (this.mListenerRegistered) {
                        this.mListenerRegistered = obj2;
                        this.mLoader.m56a(this);
                    }
                    C0048i c0048i = this.mLoader;
                    c0048i.f52e = obj;
                    c0048i.f50c = obj2;
                    c0048i.f51d = obj2;
                    c0048i.f53f = obj2;
                    c0048i.f54g = obj2;
                }
                if (this.mPendingLoader != null) {
                    this = this.mPendingLoader;
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
                    C0048i c0048i = this.mLoader;
                    String str2 = str + "  ";
                    printWriter.print(str2);
                    printWriter.print("mId=");
                    printWriter.print(c0048i.f48a);
                    printWriter.print(" mListener=");
                    printWriter.println(c0048i.f49b);
                    if (c0048i.f50c || c0048i.f53f || c0048i.f54g) {
                        printWriter.print(str2);
                        printWriter.print("mStarted=");
                        printWriter.print(c0048i.f50c);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(c0048i.f53f);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(c0048i.f54g);
                    }
                    if (c0048i.f51d || c0048i.f52e) {
                        printWriter.print(str2);
                        printWriter.print("mAbandoned=");
                        printWriter.print(c0048i.f51d);
                        printWriter.print(" mReset=");
                        printWriter.println(c0048i.f52e);
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
                    "  Finished Retaining: " + this;
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

        public final void onLoadComplete(C0048i c0048i, Object obj) {
            if (LoaderManagerImpl.DEBUG) {
                "onLoadComplete: " + this;
            }
            boolean z;
            if (this.mDestroyed) {
                z = LoaderManagerImpl.DEBUG;
            } else if (LoaderManagerImpl.this.mLoaders.m40a(this.mId) != this) {
                z = LoaderManagerImpl.DEBUG;
            } else {
                LoaderInfo loaderInfo = this.mPendingLoader;
                if (loaderInfo != null) {
                    if (LoaderManagerImpl.DEBUG) {
                        "  Switching to pending loader: " + loaderInfo;
                    }
                    this.mPendingLoader = null;
                    LoaderManagerImpl.this.mLoaders.m41a(this.mId, null);
                    destroy();
                    LoaderManagerImpl.this.installLoader(loaderInfo);
                    return;
                }
                if (!(this.mData == obj && this.mHaveData)) {
                    this.mData = obj;
                    this.mHaveData = true;
                    if (this.mStarted) {
                        callOnLoadFinished(c0048i, obj);
                    }
                }
                loaderInfo = (LoaderInfo) LoaderManagerImpl.this.mInactiveLoaders.m40a(this.mId);
                if (!(loaderInfo == null || loaderInfo == this)) {
                    loaderInfo.mDeliveredData = false;
                    loaderInfo.destroy();
                    LoaderManagerImpl.this.mInactiveLoaders.m43b(this.mId);
                }
                if (LoaderManagerImpl.this.mActivity != null && !LoaderManagerImpl.this.hasRunningLoaders()) {
                    LoaderManagerImpl.this.mActivity.mFragments.startPendingDeferredFragments();
                }
            }
        }

        final void reportStart() {
            if (this.mStarted && this.mReportNextStart) {
                this.mReportNextStart = false;
                if (this.mHaveData) {
                    callOnLoadFinished(this.mLoader, this.mData);
                }
            }
        }

        final void retain() {
            if (LoaderManagerImpl.DEBUG) {
                "  Retaining: " + this;
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
                    "  Starting: " + this;
                }
                if (this.mLoader == null && this.mCallbacks != null) {
                    this.mLoader = this.mCallbacks.onCreateLoader(this.mId, this.mArgs);
                }
                if (this.mLoader == null) {
                    return;
                }
                if (!this.mLoader.getClass().isMemberClass() || Modifier.isStatic(this.mLoader.getClass().getModifiers())) {
                    C0048i c0048i;
                    if (!this.mListenerRegistered) {
                        c0048i = this.mLoader;
                        int i = this.mId;
                        if (c0048i.f49b != null) {
                            throw new IllegalStateException("There is already a listener registered");
                        }
                        c0048i.f49b = this;
                        c0048i.f48a = i;
                        this.mListenerRegistered = true;
                    }
                    c0048i = this.mLoader;
                    c0048i.f50c = true;
                    c0048i.f52e = false;
                    c0048i.f51d = false;
                    return;
                }
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.mLoader);
            }
        }

        final void stop() {
            if (LoaderManagerImpl.DEBUG) {
                "  Stopping: " + this;
            }
            this.mStarted = false;
            if (!this.mRetaining && this.mLoader != null && this.mListenerRegistered) {
                this.mListenerRegistered = false;
                this.mLoader.m56a(this);
                this.mLoader.f50c = false;
            }
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("LoaderInfo{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" #");
            stringBuilder.append(this.mId);
            stringBuilder.append(" : ");
            C0033d.m35a(this.mLoader, stringBuilder);
            stringBuilder.append("}}");
            return stringBuilder.toString();
        }
    }

    LoaderManagerImpl(String str, FragmentActivity fragmentActivity, boolean z) {
        this.mWho = str;
        this.mActivity = fragmentActivity;
        this.mStarted = z;
    }

    private LoaderInfo createAndInstallLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        try {
            this.mCreatingLoader = true;
            LoaderInfo createLoader = createLoader(i, bundle, loaderCallbacks);
            installLoader(createLoader);
            return createLoader;
        } finally {
            this.mCreatingLoader = false;
        }
    }

    private LoaderInfo createLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        LoaderInfo loaderInfo = new LoaderInfo(i, bundle, loaderCallbacks);
        loaderInfo.mLoader = loaderCallbacks.onCreateLoader(i, bundle);
        return loaderInfo;
    }

    public void destroyLoader(int i) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (DEBUG) {
            "destroyLoader in " + this + " of " + i;
        }
        int f = this.mLoaders.m47f(i);
        if (f >= 0) {
            LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m46e(f);
            this.mLoaders.m44c(f);
            loaderInfo.destroy();
        }
        f = this.mInactiveLoaders.m47f(i);
        if (f >= 0) {
            loaderInfo = (LoaderInfo) this.mInactiveLoaders.m46e(f);
            this.mInactiveLoaders.m44c(f);
            loaderInfo.destroy();
        }
        if (this.mActivity != null && !hasRunningLoaders()) {
            this.mActivity.mFragments.startPendingDeferredFragments();
        }
    }

    void doDestroy() {
        int a;
        if (!this.mRetaining) {
            if (DEBUG) {
                "Destroying Active in " + this;
            }
            for (a = this.mLoaders.m39a() - 1; a >= 0; a--) {
                ((LoaderInfo) this.mLoaders.m46e(a)).destroy();
            }
            this.mLoaders.m42b();
        }
        if (DEBUG) {
            "Destroying Inactive in " + this;
        }
        for (a = this.mInactiveLoaders.m39a() - 1; a >= 0; a--) {
            ((LoaderInfo) this.mInactiveLoaders.m46e(a)).destroy();
        }
        this.mInactiveLoaders.m42b();
    }

    void doReportNextStart() {
        for (int a = this.mLoaders.m39a() - 1; a >= 0; a--) {
            ((LoaderInfo) this.mLoaders.m46e(a)).mReportNextStart = true;
        }
    }

    void doReportStart() {
        for (int a = this.mLoaders.m39a() - 1; a >= 0; a--) {
            ((LoaderInfo) this.mLoaders.m46e(a)).reportStart();
        }
    }

    void doRetain() {
        if (DEBUG) {
            "Retaining in " + this;
        }
        if (this.mStarted) {
            this.mRetaining = true;
            this.mStarted = false;
            for (int a = this.mLoaders.m39a() - 1; a >= 0; a--) {
                ((LoaderInfo) this.mLoaders.m46e(a)).retain();
            }
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w(TAG, "Called doRetain when not started: " + this, runtimeException);
    }

    void doStart() {
        if (DEBUG) {
            "Starting in " + this;
        }
        if (this.mStarted) {
            Throwable runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w(TAG, "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.mStarted = true;
        for (int a = this.mLoaders.m39a() - 1; a >= 0; a--) {
            ((LoaderInfo) this.mLoaders.m46e(a)).start();
        }
    }

    void doStop() {
        if (DEBUG) {
            "Stopping in " + this;
        }
        if (this.mStarted) {
            for (int a = this.mLoaders.m39a() - 1; a >= 0; a--) {
                ((LoaderInfo) this.mLoaders.m46e(a)).stop();
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
        if (this.mLoaders.m39a() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i2 = 0; i2 < this.mLoaders.m39a(); i2++) {
                LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m46e(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.mLoaders.m45d(i2));
                printWriter.print(": ");
                printWriter.println(loaderInfo.toString());
                loaderInfo.dump(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.mInactiveLoaders.m39a() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            while (i < this.mInactiveLoaders.m39a()) {
                loaderInfo = (LoaderInfo) this.mInactiveLoaders.m46e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.mInactiveLoaders.m45d(i));
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
                "Finished Retaining in " + this;
            }
            this.mRetaining = false;
            for (int a = this.mLoaders.m39a() - 1; a >= 0; a--) {
                ((LoaderInfo) this.mLoaders.m46e(a)).finishRetain();
            }
        }
    }

    public C0048i getLoader(int i) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m40a(i);
        return loaderInfo != null ? loaderInfo.mPendingLoader != null ? loaderInfo.mPendingLoader.mLoader : loaderInfo.mLoader : null;
    }

    public boolean hasRunningLoaders() {
        int a = this.mLoaders.m39a();
        boolean z = false;
        for (int i = 0; i < a; i++) {
            LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m46e(i);
            int i2 = (!loaderInfo.mStarted || loaderInfo.mDeliveredData) ? 0 : 1;
            z |= i2;
        }
        return z;
    }

    public C0048i initLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m40a(i);
        if (DEBUG) {
            "initLoader in " + this + ": args=" + bundle;
        }
        if (loaderInfo == null) {
            loaderInfo = createAndInstallLoader(i, bundle, loaderCallbacks);
            if (DEBUG) {
                "  Created new loader " + loaderInfo;
            }
        } else {
            if (DEBUG) {
                "  Re-using existing loader " + loaderInfo;
            }
            loaderInfo.mCallbacks = loaderCallbacks;
        }
        if (loaderInfo.mHaveData && this.mStarted) {
            loaderInfo.callOnLoadFinished(loaderInfo.mLoader, loaderInfo.mData);
        }
        return loaderInfo.mLoader;
    }

    void installLoader(LoaderInfo loaderInfo) {
        this.mLoaders.m41a(loaderInfo.mId, loaderInfo);
        if (this.mStarted) {
            loaderInfo.start();
        }
    }

    public C0048i restartLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.m40a(i);
        if (DEBUG) {
            "restartLoader in " + this + ": args=" + bundle;
        }
        if (loaderInfo != null) {
            LoaderInfo loaderInfo2 = (LoaderInfo) this.mInactiveLoaders.m40a(i);
            if (loaderInfo2 != null) {
                if (loaderInfo.mHaveData) {
                    if (DEBUG) {
                        "  Removing last inactive loader: " + loaderInfo;
                    }
                    loaderInfo2.mDeliveredData = false;
                    loaderInfo2.destroy();
                } else if (loaderInfo.mStarted) {
                    if (loaderInfo.mPendingLoader != null) {
                        if (DEBUG) {
                            "  Removing pending loader: " + loaderInfo.mPendingLoader;
                        }
                        loaderInfo.mPendingLoader.destroy();
                        loaderInfo.mPendingLoader = null;
                    }
                    r1 = DEBUG;
                    loaderInfo.mPendingLoader = createLoader(i, bundle, loaderCallbacks);
                    return loaderInfo.mPendingLoader.mLoader;
                } else {
                    r1 = DEBUG;
                    this.mLoaders.m41a(i, null);
                    loaderInfo.destroy();
                }
            } else if (DEBUG) {
                "  Making last loader inactive: " + loaderInfo;
            }
            loaderInfo.mLoader.f51d = true;
            this.mInactiveLoaders.m41a(i, loaderInfo);
        }
        return createAndInstallLoader(i, bundle, loaderCallbacks).mLoader;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        C0033d.m35a(this.mActivity, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    void updateActivity(FragmentActivity fragmentActivity) {
        this.mActivity = fragmentActivity;
    }
}
