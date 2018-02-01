package android.support.v7.widget;

import android.graphics.PointF;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import android.view.View;

public class LinearSnapHelper extends SnapHelper {
    private static final float INVALID_DISTANCE = 1.0f;
    private OrientationHelper mHorizontalHelper;
    private OrientationHelper mVerticalHelper;

    private float computeDistancePerChild(LayoutManager layoutManager, OrientationHelper orientationHelper) {
        View view = null;
        int i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i2 = Integer.MIN_VALUE;
        int childCount = layoutManager.getChildCount();
        if (childCount == 0) {
            return INVALID_DISTANCE;
        }
        int i3 = 0;
        View view2 = null;
        while (i3 < childCount) {
            View view3;
            View childAt = layoutManager.getChildAt(i3);
            int position = layoutManager.getPosition(childAt);
            if (position != -1) {
                if (position < i) {
                    i = position;
                    view2 = childAt;
                }
                if (position > i2) {
                    i2 = i;
                    view3 = childAt;
                    childAt = view2;
                    i3++;
                    view2 = childAt;
                    view = view3;
                    i = i2;
                    i2 = position;
                }
            }
            position = i2;
            childAt = view2;
            i2 = i;
            view3 = view;
            i3++;
            view2 = childAt;
            view = view3;
            i = i2;
            i2 = position;
        }
        if (view2 == null || view == null) {
            return INVALID_DISTANCE;
        }
        position = Math.max(orientationHelper.getDecoratedEnd(view2), orientationHelper.getDecoratedEnd(view)) - Math.min(orientationHelper.getDecoratedStart(view2), orientationHelper.getDecoratedStart(view));
        return position == 0 ? INVALID_DISTANCE : (((float) position) * INVALID_DISTANCE) / ((float) ((i2 - i) + 1));
    }

    private int distanceToCenter(LayoutManager layoutManager, View view, OrientationHelper orientationHelper) {
        return ((orientationHelper.getDecoratedMeasurement(view) / 2) + orientationHelper.getDecoratedStart(view)) - (layoutManager.getClipToPadding() ? orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2) : orientationHelper.getEnd() / 2);
    }

    private int estimateNextPositionDiffForFling(LayoutManager layoutManager, OrientationHelper orientationHelper, int i, int i2) {
        int[] calculateScrollDistance = calculateScrollDistance(i, i2);
        float computeDistancePerChild = computeDistancePerChild(layoutManager, orientationHelper);
        if (computeDistancePerChild <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(calculateScrollDistance[0]) > Math.abs(calculateScrollDistance[1]) ? calculateScrollDistance[0] : calculateScrollDistance[1])) / computeDistancePerChild);
    }

    private View findCenterView(LayoutManager layoutManager, OrientationHelper orientationHelper) {
        View view = null;
        int childCount = layoutManager.getChildCount();
        if (childCount != 0) {
            int startAfterPadding = layoutManager.getClipToPadding() ? orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2) : orientationHelper.getEnd() / 2;
            int i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int i2 = 0;
            while (i2 < childCount) {
                View view2;
                View childAt = layoutManager.getChildAt(i2);
                int abs = Math.abs((orientationHelper.getDecoratedStart(childAt) + (orientationHelper.getDecoratedMeasurement(childAt) / 2)) - startAfterPadding);
                if (abs < i) {
                    view2 = childAt;
                } else {
                    abs = i;
                    view2 = view;
                }
                i2++;
                view = view2;
                i = abs;
            }
        }
        return view;
    }

    private OrientationHelper getHorizontalHelper(LayoutManager layoutManager) {
        if (this.mHorizontalHelper == null || this.mHorizontalHelper.mLayoutManager != layoutManager) {
            this.mHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.mHorizontalHelper;
    }

    private OrientationHelper getVerticalHelper(LayoutManager layoutManager) {
        if (this.mVerticalHelper == null || this.mVerticalHelper.mLayoutManager != layoutManager) {
            this.mVerticalHelper = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.mVerticalHelper;
    }

    public int[] calculateDistanceToFinalSnap(LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(layoutManager, view, getHorizontalHelper(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = distanceToCenter(layoutManager, view, getVerticalHelper(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View findSnapView(LayoutManager layoutManager) {
        return layoutManager.canScrollVertically() ? findCenterView(layoutManager, getVerticalHelper(layoutManager)) : layoutManager.canScrollHorizontally() ? findCenterView(layoutManager, getHorizontalHelper(layoutManager)) : null;
    }

    public int findTargetSnapPosition(LayoutManager layoutManager, int i, int i2) {
        if (!(layoutManager instanceof ScrollVectorProvider)) {
            return -1;
        }
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        View findSnapView = findSnapView(layoutManager);
        if (findSnapView == null) {
            return -1;
        }
        int position = layoutManager.getPosition(findSnapView);
        if (position == -1) {
            return -1;
        }
        PointF computeScrollVectorForPosition = ((ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1);
        if (computeScrollVectorForPosition == null) {
            return -1;
        }
        int estimateNextPositionDiffForFling;
        int estimateNextPositionDiffForFling2;
        if (layoutManager.canScrollHorizontally()) {
            estimateNextPositionDiffForFling = estimateNextPositionDiffForFling(layoutManager, getHorizontalHelper(layoutManager), i, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                estimateNextPositionDiffForFling = -estimateNextPositionDiffForFling;
            }
        } else {
            estimateNextPositionDiffForFling = 0;
        }
        if (layoutManager.canScrollVertically()) {
            estimateNextPositionDiffForFling2 = estimateNextPositionDiffForFling(layoutManager, getVerticalHelper(layoutManager), 0, i2);
            if (computeScrollVectorForPosition.y < 0.0f) {
                estimateNextPositionDiffForFling2 = -estimateNextPositionDiffForFling2;
            }
        } else {
            estimateNextPositionDiffForFling2 = 0;
        }
        if (!layoutManager.canScrollVertically()) {
            estimateNextPositionDiffForFling2 = estimateNextPositionDiffForFling;
        }
        if (estimateNextPositionDiffForFling2 == 0) {
            return -1;
        }
        estimateNextPositionDiffForFling = position + estimateNextPositionDiffForFling2;
        if (estimateNextPositionDiffForFling < 0) {
            estimateNextPositionDiffForFling = 0;
        }
        return estimateNextPositionDiffForFling >= itemCount ? itemCount - 1 : estimateNextPositionDiffForFling;
    }
}
