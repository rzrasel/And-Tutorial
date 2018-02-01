package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.C0048i;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class LoaderManager {

    public interface LoaderCallbacks {
        C0048i onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(C0048i c0048i, Object obj);

        void onLoaderReset(C0048i c0048i);
    }

    public static void enableDebugLogging(boolean z) {
        LoaderManagerImpl.DEBUG = z;
    }

    public abstract void destroyLoader(int i);

    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract C0048i getLoader(int i);

    public boolean hasRunningLoaders() {
        return false;
    }

    public abstract C0048i initLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks);

    public abstract C0048i restartLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks);
}
