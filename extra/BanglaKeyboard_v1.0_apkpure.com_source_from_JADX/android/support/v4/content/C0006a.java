package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import java.io.File;

public class C0006a {
    private static final String DIR_ANDROID = "Android";
    private static final String DIR_CACHE = "cache";
    private static final String DIR_DATA = "data";
    private static final String DIR_FILES = "files";
    private static final String DIR_OBB = "obb";

    private static File buildPath(File file, String... strArr) {
        int length = strArr.length;
        int i = 0;
        File file2 = file;
        while (i < length) {
            String str = strArr[i];
            File file3 = file2 == null ? new File(str) : str != null ? new File(file2, str) : file2;
            i++;
            file2 = file3;
        }
        return file2;
    }

    public static File[] getExternalCacheDirs(Context context) {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            return context.getExternalCacheDirs();
        }
        File externalCacheDir;
        if (i >= 8) {
            externalCacheDir = context.getExternalCacheDir();
        } else {
            externalCacheDir = C0006a.buildPath(Environment.getExternalStorageDirectory(), DIR_ANDROID, DIR_DATA, context.getPackageName(), DIR_CACHE);
        }
        return new File[]{externalCacheDir};
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            return context.getExternalFilesDirs(str);
        }
        File externalFilesDir;
        if (i >= 8) {
            externalFilesDir = context.getExternalFilesDir(str);
        } else {
            externalFilesDir = C0006a.buildPath(Environment.getExternalStorageDirectory(), DIR_ANDROID, DIR_DATA, context.getPackageName(), DIR_FILES, str);
        }
        return new File[]{externalFilesDir};
    }

    public static File[] getObbDirs(Context context) {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            return context.getObbDirs();
        }
        File obbDir;
        if (i >= 11) {
            obbDir = context.getObbDir();
        } else {
            obbDir = C0006a.buildPath(Environment.getExternalStorageDirectory(), DIR_ANDROID, DIR_OBB, context.getPackageName());
        }
        return new File[]{obbDir};
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return C0006a.startActivities(context, intentArr, null);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        int i = VERSION.SDK_INT;
        if (i >= 16) {
            context.startActivities(intentArr, bundle);
            return true;
        } else if (i < 11) {
            return false;
        } else {
            context.startActivities(intentArr);
            return true;
        }
    }
}
