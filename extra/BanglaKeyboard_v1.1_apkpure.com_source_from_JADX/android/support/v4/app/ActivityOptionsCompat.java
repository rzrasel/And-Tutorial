package android.support.v4.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.p018f.C0494j;
import android.util.Pair;
import android.view.View;

public class ActivityOptionsCompat {
    public static final String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    private static class ActivityOptionsCompatApi16Impl extends ActivityOptionsCompat {
        protected final ActivityOptions mActivityOptions;

        ActivityOptionsCompatApi16Impl(ActivityOptions activityOptions) {
            this.mActivityOptions = activityOptions;
        }

        public Bundle toBundle() {
            return this.mActivityOptions.toBundle();
        }

        public void update(ActivityOptionsCompat activityOptionsCompat) {
            if (activityOptionsCompat instanceof ActivityOptionsCompatApi16Impl) {
                this.mActivityOptions.update(((ActivityOptionsCompatApi16Impl) activityOptionsCompat).mActivityOptions);
            }
        }
    }

    private static class ActivityOptionsCompatApi23Impl extends ActivityOptionsCompatApi16Impl {
        ActivityOptionsCompatApi23Impl(ActivityOptions activityOptions) {
            super(activityOptions);
        }

        public void requestUsageTimeReport(PendingIntent pendingIntent) {
            this.mActivityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    private static class ActivityOptionsCompatApi24Impl extends ActivityOptionsCompatApi23Impl {
        ActivityOptionsCompatApi24Impl(ActivityOptions activityOptions) {
            super(activityOptions);
        }

        public Rect getLaunchBounds() {
            return this.mActivityOptions.getLaunchBounds();
        }

        public ActivityOptionsCompat setLaunchBounds(Rect rect) {
            return new ActivityOptionsCompatApi24Impl(this.mActivityOptions.setLaunchBounds(rect));
        }
    }

    protected ActivityOptionsCompat() {
    }

    private static ActivityOptionsCompat createImpl(ActivityOptions activityOptions) {
        return VERSION.SDK_INT >= 24 ? new ActivityOptionsCompatApi24Impl(activityOptions) : VERSION.SDK_INT >= 23 ? new ActivityOptionsCompatApi23Impl(activityOptions) : new ActivityOptionsCompatApi16Impl(activityOptions);
    }

    public static ActivityOptionsCompat makeBasic() {
        return VERSION.SDK_INT >= 23 ? createImpl(ActivityOptions.makeBasic()) : new ActivityOptionsCompat();
    }

    public static ActivityOptionsCompat makeClipRevealAnimation(View view, int i, int i2, int i3, int i4) {
        return VERSION.SDK_INT >= 23 ? createImpl(ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4)) : new ActivityOptionsCompat();
    }

    public static ActivityOptionsCompat makeCustomAnimation(Context context, int i, int i2) {
        return VERSION.SDK_INT >= 16 ? createImpl(ActivityOptions.makeCustomAnimation(context, i, i2)) : new ActivityOptionsCompat();
    }

    public static ActivityOptionsCompat makeScaleUpAnimation(View view, int i, int i2, int i3, int i4) {
        return VERSION.SDK_INT >= 16 ? createImpl(ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4)) : new ActivityOptionsCompat();
    }

    public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, View view, String str) {
        return VERSION.SDK_INT >= 21 ? createImpl(ActivityOptions.makeSceneTransitionAnimation(activity, view, str)) : new ActivityOptionsCompat();
    }

    public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, C0494j<View, String>... c0494jArr) {
        if (VERSION.SDK_INT < 21) {
            return new ActivityOptionsCompat();
        }
        Pair[] pairArr = null;
        if (c0494jArr != null) {
            Pair[] pairArr2 = new Pair[c0494jArr.length];
            for (int i = 0; i < c0494jArr.length; i++) {
                pairArr2[i] = Pair.create(c0494jArr[i].f1558a, c0494jArr[i].f1559b);
            }
            pairArr = pairArr2;
        }
        return createImpl(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    public static ActivityOptionsCompat makeTaskLaunchBehind() {
        return VERSION.SDK_INT >= 21 ? createImpl(ActivityOptions.makeTaskLaunchBehind()) : new ActivityOptionsCompat();
    }

    public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int i2) {
        return VERSION.SDK_INT >= 16 ? createImpl(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2)) : new ActivityOptionsCompat();
    }

    public Rect getLaunchBounds() {
        return null;
    }

    public void requestUsageTimeReport(PendingIntent pendingIntent) {
    }

    public ActivityOptionsCompat setLaunchBounds(Rect rect) {
        return null;
    }

    public Bundle toBundle() {
        return null;
    }

    public void update(ActivityOptionsCompat activityOptionsCompat) {
    }
}
