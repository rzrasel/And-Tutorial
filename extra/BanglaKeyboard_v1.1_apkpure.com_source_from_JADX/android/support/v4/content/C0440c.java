package android.support.v4.content;

import android.content.Context;
import android.os.Process;
import android.support.v4.app.AppOpsManagerCompat;

public final class C0440c {
    public static int m1174a(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManagerCompat.permissionToOp(str);
        if (permissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (AppOpsManagerCompat.noteProxyOp(context, permissionToOp, packageName) != 0) {
                return -2;
            }
        }
        return 0;
    }
}
