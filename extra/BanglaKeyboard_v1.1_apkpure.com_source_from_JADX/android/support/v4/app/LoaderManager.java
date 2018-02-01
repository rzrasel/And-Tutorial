package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.C0439b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class LoaderManager {

    public interface LoaderCallbacks<D> {
        C0439b<D> onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(C0439b<D> c0439b, D d);

        void onLoaderReset(C0439b<D> c0439b);
    }

    public static void enableDebugLogging(boolean z) {
        LoaderManagerImpl.DEBUG = z;
    }

    public abstract void destroyLoader(int i);

    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> C0439b<D> getLoader(int i);

    public boolean hasRunningLoaders() {
        return false;
    }

    public abstract <D> C0439b<D> initLoader(int i, Bundle bundle, LoaderCallbacks<D> loaderCallbacks);

    public abstract <D> C0439b<D> restartLoader(int i, Bundle bundle, LoaderCallbacks<D> loaderCallbacks);
}
