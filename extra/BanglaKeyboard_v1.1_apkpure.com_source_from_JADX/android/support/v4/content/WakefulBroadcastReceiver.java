package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;

@Deprecated
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {
    private static final SparseArray<WakeLock> f1409a = new SparseArray();
    private static int f1410b = 1;
}
