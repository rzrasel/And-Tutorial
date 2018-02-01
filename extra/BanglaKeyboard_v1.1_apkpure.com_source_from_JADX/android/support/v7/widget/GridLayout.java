package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.C0679r;
import android.support.v4.view.C0684t;
import android.support.v4.widget.Space;
import android.support.v7.p025e.C0877a.C0875a;
import android.support.v7.p025e.C0877a.C0876b;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GridLayout extends ViewGroup {
    private static final int ALIGNMENT_MODE = C0876b.GridLayout_alignmentMode;
    public static final int ALIGN_BOUNDS = 0;
    public static final int ALIGN_MARGINS = 1;
    public static final Alignment BASELINE = new C10217();
    public static final Alignment BOTTOM = TRAILING;
    static final int CAN_STRETCH = 2;
    public static final Alignment CENTER = new C10196();
    private static final int COLUMN_COUNT = C0876b.GridLayout_columnCount;
    private static final int COLUMN_ORDER_PRESERVED = C0876b.GridLayout_columnOrderPreserved;
    private static final int DEFAULT_ALIGNMENT_MODE = 1;
    static final int DEFAULT_CONTAINER_MARGIN = 0;
    private static final int DEFAULT_COUNT = Integer.MIN_VALUE;
    static final boolean DEFAULT_ORDER_PRESERVED = true;
    private static final int DEFAULT_ORIENTATION = 0;
    private static final boolean DEFAULT_USE_DEFAULT_MARGINS = false;
    public static final Alignment END = TRAILING;
    public static final Alignment FILL = new C10228();
    public static final int HORIZONTAL = 0;
    static final int INFLEXIBLE = 0;
    private static final Alignment LEADING = new C10163();
    public static final Alignment LEFT = createSwitchingAlignment(START, END);
    static final Printer LOG_PRINTER = new LogPrinter(3, GridLayout.class.getName());
    static final int MAX_SIZE = 100000;
    static final Printer NO_PRINTER = new C10141();
    private static final int ORIENTATION = C0876b.GridLayout_orientation;
    public static final Alignment RIGHT = createSwitchingAlignment(END, START);
    private static final int ROW_COUNT = C0876b.GridLayout_rowCount;
    private static final int ROW_ORDER_PRESERVED = C0876b.GridLayout_rowOrderPreserved;
    public static final Alignment START = LEADING;
    public static final Alignment TOP = LEADING;
    private static final Alignment TRAILING = new C10174();
    public static final int UNDEFINED = Integer.MIN_VALUE;
    static final Alignment UNDEFINED_ALIGNMENT = new C10152();
    static final int UNINITIALIZED_HASH = 0;
    private static final int USE_DEFAULT_MARGINS = C0876b.GridLayout_useDefaultMargins;
    public static final int VERTICAL = 1;
    int mAlignmentMode;
    int mDefaultGap;
    final Axis mHorizontalAxis;
    int mLastLayoutParamsHashCode;
    int mOrientation;
    Printer mPrinter;
    boolean mUseDefaultMargins;
    final Axis mVerticalAxis;

    static class C10141 implements Printer {
        C10141() {
        }

        public final void println(String str) {
        }
    }

    public static abstract class Alignment {
        Alignment() {
        }

        abstract int getAlignmentValue(View view, int i, int i2);

        Bounds getBounds() {
            return new Bounds();
        }

        abstract String getDebugString();

        abstract int getGravityOffset(View view, int i);

        int getSizeInCell(View view, int i, int i2) {
            return i;
        }

        public String toString() {
            return "Alignment:" + getDebugString();
        }
    }

    static class C10152 extends Alignment {
        C10152() {
        }

        public final int getAlignmentValue(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        final String getDebugString() {
            return "UNDEFINED";
        }

        final int getGravityOffset(View view, int i) {
            return Integer.MIN_VALUE;
        }
    }

    static class C10163 extends Alignment {
        C10163() {
        }

        public final int getAlignmentValue(View view, int i, int i2) {
            return 0;
        }

        final String getDebugString() {
            return "LEADING";
        }

        final int getGravityOffset(View view, int i) {
            return 0;
        }
    }

    static class C10174 extends Alignment {
        C10174() {
        }

        public final int getAlignmentValue(View view, int i, int i2) {
            return i;
        }

        final String getDebugString() {
            return "TRAILING";
        }

        final int getGravityOffset(View view, int i) {
            return i;
        }
    }

    static class C10196 extends Alignment {
        C10196() {
        }

        public final int getAlignmentValue(View view, int i, int i2) {
            return i >> 1;
        }

        final String getDebugString() {
            return "CENTER";
        }

        final int getGravityOffset(View view, int i) {
            return i >> 1;
        }
    }

    static class Bounds {
        public int after;
        public int before;
        public int flexibility;

        Bounds() {
            reset();
        }

        protected int getOffset(GridLayout gridLayout, View view, Alignment alignment, int i, boolean z) {
            return this.before - alignment.getAlignmentValue(view, i, C0684t.m1960b(gridLayout));
        }

        protected void include(int i, int i2) {
            this.before = Math.max(this.before, i);
            this.after = Math.max(this.after, i2);
        }

        protected final void include(GridLayout gridLayout, View view, Spec spec, Axis axis, int i) {
            this.flexibility &= spec.getFlexibility();
            int alignmentValue = spec.getAbsoluteAlignment(axis.horizontal).getAlignmentValue(view, i, C0684t.m1960b(gridLayout));
            include(alignmentValue, i - alignmentValue);
        }

        protected void reset() {
            this.before = Integer.MIN_VALUE;
            this.after = Integer.MIN_VALUE;
            this.flexibility = 2;
        }

        protected int size(boolean z) {
            return (z || !GridLayout.canStretch(this.flexibility)) ? this.before + this.after : GridLayout.MAX_SIZE;
        }

        public String toString() {
            return "Bounds{before=" + this.before + ", after=" + this.after + '}';
        }
    }

    static class C10217 extends Alignment {

        class C10201 extends Bounds {
            private int size;

            C10201() {
            }

            protected int getOffset(GridLayout gridLayout, View view, Alignment alignment, int i, boolean z) {
                return Math.max(0, super.getOffset(gridLayout, view, alignment, i, z));
            }

            protected void include(int i, int i2) {
                super.include(i, i2);
                this.size = Math.max(this.size, i + i2);
            }

            protected void reset() {
                super.reset();
                this.size = Integer.MIN_VALUE;
            }

            protected int size(boolean z) {
                return Math.max(super.size(z), this.size);
            }
        }

        C10217() {
        }

        public final int getAlignmentValue(View view, int i, int i2) {
            if (view.getVisibility() == 8) {
                return 0;
            }
            int baseline = view.getBaseline();
            return baseline == -1 ? Integer.MIN_VALUE : baseline;
        }

        public final Bounds getBounds() {
            return new C10201();
        }

        final String getDebugString() {
            return "BASELINE";
        }

        final int getGravityOffset(View view, int i) {
            return 0;
        }
    }

    static class C10228 extends Alignment {
        C10228() {
        }

        public final int getAlignmentValue(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        final String getDebugString() {
            return "FILL";
        }

        final int getGravityOffset(View view, int i) {
            return 0;
        }

        public final int getSizeInCell(View view, int i, int i2) {
            return i2;
        }
    }

    static final class Arc {
        public final Interval span;
        public boolean valid = GridLayout.DEFAULT_ORDER_PRESERVED;
        public final MutableInt value;

        public Arc(Interval interval, MutableInt mutableInt) {
            this.span = interval;
            this.value = mutableInt;
        }

        public final String toString() {
            return this.span + " " + (!this.valid ? "+>" : "->") + " " + this.value;
        }
    }

    static final class Assoc<K, V> extends ArrayList<Pair<K, V>> {
        private final Class<K> keyType;
        private final Class<V> valueType;

        private Assoc(Class<K> cls, Class<V> cls2) {
            this.keyType = cls;
            this.valueType = cls2;
        }

        public static <K, V> Assoc<K, V> of(Class<K> cls, Class<V> cls2) {
            return new Assoc(cls, cls2);
        }

        public final PackedMap<K, V> pack() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance(this.keyType, size);
            Object[] objArr2 = (Object[]) Array.newInstance(this.valueType, size);
            for (int i = 0; i < size; i++) {
                objArr[i] = ((Pair) get(i)).first;
                objArr2[i] = ((Pair) get(i)).second;
            }
            return new PackedMap(objArr, objArr2);
        }

        public final void put(K k, V v) {
            add(Pair.create(k, v));
        }
    }

    final class Axis {
        static final /* synthetic */ boolean $assertionsDisabled = (!GridLayout.class.desiredAssertionStatus() ? GridLayout.DEFAULT_ORDER_PRESERVED : $assertionsDisabled);
        static final int COMPLETE = 2;
        static final int NEW = 0;
        static final int PENDING = 1;
        public Arc[] arcs;
        public boolean arcsValid = $assertionsDisabled;
        PackedMap<Interval, MutableInt> backwardLinks;
        public boolean backwardLinksValid = $assertionsDisabled;
        public int definedCount = Integer.MIN_VALUE;
        public int[] deltas;
        PackedMap<Interval, MutableInt> forwardLinks;
        public boolean forwardLinksValid = $assertionsDisabled;
        PackedMap<Spec, Bounds> groupBounds;
        public boolean groupBoundsValid = $assertionsDisabled;
        public boolean hasWeights;
        public boolean hasWeightsValid = $assertionsDisabled;
        public final boolean horizontal;
        public int[] leadingMargins;
        public boolean leadingMarginsValid = $assertionsDisabled;
        public int[] locations;
        public boolean locationsValid = $assertionsDisabled;
        private int maxIndex = Integer.MIN_VALUE;
        boolean orderPreserved = GridLayout.DEFAULT_ORDER_PRESERVED;
        private MutableInt parentMax = new MutableInt(-100000);
        private MutableInt parentMin = new MutableInt(0);
        public int[] trailingMargins;
        public boolean trailingMarginsValid = $assertionsDisabled;

        Axis(boolean z) {
            this.horizontal = z;
        }

        private void addComponentSizes(List<Arc> list, PackedMap<Interval, MutableInt> packedMap) {
            for (int i = 0; i < ((Interval[]) packedMap.keys).length; i++) {
                include(list, ((Interval[]) packedMap.keys)[i], ((MutableInt[]) packedMap.values)[i], $assertionsDisabled);
            }
        }

        private String arcsToString(List<Arc> list) {
            String str = this.horizontal ? "x" : "y";
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder2 = stringBuilder;
            Object obj = 1;
            for (Arc arc : list) {
                if (obj != null) {
                    obj = null;
                } else {
                    stringBuilder2 = stringBuilder2.append(", ");
                }
                int i = arc.span.min;
                int i2 = arc.span.max;
                int i3 = arc.value.value;
                stringBuilder2.append(i < i2 ? str + i2 + "-" + str + i + ">=" + i3 : str + i + "-" + str + i2 + "<=" + (-i3));
            }
            return stringBuilder2.toString();
        }

        private int calculateMaxIndex() {
            int childCount = GridLayout.this.getChildCount();
            int i = -1;
            for (int i2 = 0; i2 < childCount; i2++) {
                LayoutParams layoutParams = GridLayout.this.getLayoutParams(GridLayout.this.getChildAt(i2));
                Interval interval = (this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).span;
                i = Math.max(Math.max(Math.max(i, interval.min), interval.max), interval.size());
            }
            return i == -1 ? Integer.MIN_VALUE : i;
        }

        private float calculateTotalWeight() {
            float f = 0.0f;
            int childCount = GridLayout.this.getChildCount();
            int i = 0;
            while (i < childCount) {
                float f2;
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                    f2 = (this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).weight + f;
                } else {
                    f2 = f;
                }
                i++;
                f = f2;
            }
            return f;
        }

        private void computeArcs() {
            getForwardLinks();
            getBackwardLinks();
        }

        private void computeGroupBounds() {
            Bounds[] boundsArr = (Bounds[]) this.groupBounds.values;
            for (Bounds reset : boundsArr) {
                reset.reset();
            }
            int childCount = GridLayout.this.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = GridLayout.this.getChildAt(i);
                LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                Spec spec = this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec;
                ((Bounds) this.groupBounds.getValue(i)).include(GridLayout.this, childAt, spec, this, GridLayout.this.getMeasurementIncludingMargin(childAt, this.horizontal) + (spec.weight == 0.0f ? 0 : getDeltas()[i]));
                i++;
            }
        }

        private boolean computeHasWeights() {
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                    if ((this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).weight != 0.0f) {
                        return GridLayout.DEFAULT_ORDER_PRESERVED;
                    }
                }
            }
            return $assertionsDisabled;
        }

        private void computeLinks(PackedMap<Interval, MutableInt> packedMap, boolean z) {
            int i = 0;
            MutableInt[] mutableIntArr = (MutableInt[]) packedMap.values;
            for (MutableInt reset : mutableIntArr) {
                reset.reset();
            }
            Bounds[] boundsArr = (Bounds[]) getGroupBounds().values;
            while (i < boundsArr.length) {
                int size = boundsArr[i].size(z);
                MutableInt mutableInt = (MutableInt) packedMap.getValue(i);
                int i2 = mutableInt.value;
                if (!z) {
                    size = -size;
                }
                mutableInt.value = Math.max(i2, size);
                i++;
            }
        }

        private void computeLocations(int[] iArr) {
            int i = 0;
            if (hasWeights()) {
                solveAndDistributeSpace(iArr);
            } else {
                solve(iArr);
            }
            if (!this.orderPreserved) {
                int i2 = iArr[0];
                int length = iArr.length;
                while (i < length) {
                    iArr[i] = iArr[i] - i2;
                    i++;
                }
            }
        }

        private void computeMargins(boolean z) {
            int[] iArr = z ? this.leadingMargins : this.trailingMargins;
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                    Interval interval = (this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).span;
                    int i2 = z ? interval.min : interval.max;
                    iArr[i2] = Math.max(iArr[i2], GridLayout.this.getMargin1(childAt, this.horizontal, z));
                }
            }
        }

        private Arc[] createArcs() {
            int i;
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            addComponentSizes(arrayList, getForwardLinks());
            addComponentSizes(arrayList2, getBackwardLinks());
            if (this.orderPreserved) {
                for (i = 0; i < getCount(); i++) {
                    include(arrayList, new Interval(i, i + 1), new MutableInt(0));
                }
            }
            i = getCount();
            include(arrayList, new Interval(0, i), this.parentMin, $assertionsDisabled);
            include(arrayList2, new Interval(i, 0), this.parentMax, $assertionsDisabled);
            return (Arc[]) GridLayout.append(topologicalSort(arrayList), topologicalSort(arrayList2));
        }

        private PackedMap<Spec, Bounds> createGroupBounds() {
            Assoc of = Assoc.of(Spec.class, Bounds.class);
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                LayoutParams layoutParams = GridLayout.this.getLayoutParams(GridLayout.this.getChildAt(i));
                Spec spec = this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec;
                of.put(spec, spec.getAbsoluteAlignment(this.horizontal).getBounds());
            }
            return of.pack();
        }

        private PackedMap<Interval, MutableInt> createLinks(boolean z) {
            Assoc of = Assoc.of(Interval.class, MutableInt.class);
            Spec[] specArr = (Spec[]) getGroupBounds().keys;
            int length = specArr.length;
            for (int i = 0; i < length; i++) {
                of.put(z ? specArr[i].span : specArr[i].span.inverse(), new MutableInt());
            }
            return of.pack();
        }

        private PackedMap<Interval, MutableInt> getBackwardLinks() {
            if (this.backwardLinks == null) {
                this.backwardLinks = createLinks($assertionsDisabled);
            }
            if (!this.backwardLinksValid) {
                computeLinks(this.backwardLinks, $assertionsDisabled);
                this.backwardLinksValid = GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            return this.backwardLinks;
        }

        private PackedMap<Interval, MutableInt> getForwardLinks() {
            if (this.forwardLinks == null) {
                this.forwardLinks = createLinks(GridLayout.DEFAULT_ORDER_PRESERVED);
            }
            if (!this.forwardLinksValid) {
                computeLinks(this.forwardLinks, GridLayout.DEFAULT_ORDER_PRESERVED);
                this.forwardLinksValid = GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            return this.forwardLinks;
        }

        private int getMaxIndex() {
            if (this.maxIndex == Integer.MIN_VALUE) {
                this.maxIndex = Math.max(0, calculateMaxIndex());
            }
            return this.maxIndex;
        }

        private int getMeasure(int i, int i2) {
            setParentConstraints(i, i2);
            return size(getLocations());
        }

        private boolean hasWeights() {
            if (!this.hasWeightsValid) {
                this.hasWeights = computeHasWeights();
                this.hasWeightsValid = GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            return this.hasWeights;
        }

        private void include(List<Arc> list, Interval interval, MutableInt mutableInt) {
            include(list, interval, mutableInt, GridLayout.DEFAULT_ORDER_PRESERVED);
        }

        private void include(List<Arc> list, Interval interval, MutableInt mutableInt, boolean z) {
            if (interval.size() != 0) {
                if (z) {
                    for (Arc arc : list) {
                        if (arc.span.equals(interval)) {
                            return;
                        }
                    }
                }
                list.add(new Arc(interval, mutableInt));
            }
        }

        private void init(int[] iArr) {
            Arrays.fill(iArr, 0);
        }

        private void logError(String str, Arc[] arcArr, boolean[] zArr) {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            for (int i = 0; i < arcArr.length; i++) {
                Arc arc = arcArr[i];
                if (zArr[i]) {
                    arrayList.add(arc);
                }
                if (!arc.valid) {
                    arrayList2.add(arc);
                }
            }
            GridLayout.this.mPrinter.println(str + " constraints: " + arcsToString(arrayList) + " are inconsistent; permanently removing: " + arcsToString(arrayList2) + ". ");
        }

        private boolean relax(int[] iArr, Arc arc) {
            if (!arc.valid) {
                return $assertionsDisabled;
            }
            Interval interval = arc.span;
            int i = interval.min;
            int i2 = interval.max;
            i = iArr[i] + arc.value.value;
            if (i <= iArr[i2]) {
                return $assertionsDisabled;
            }
            iArr[i2] = i;
            return GridLayout.DEFAULT_ORDER_PRESERVED;
        }

        private void setParentConstraints(int i, int i2) {
            this.parentMin.value = i;
            this.parentMax.value = -i2;
            this.locationsValid = $assertionsDisabled;
        }

        private void shareOutDelta(int i, float f) {
            Arrays.fill(this.deltas, 0);
            int childCount = GridLayout.this.getChildCount();
            int i2 = 0;
            float f2 = f;
            int i3 = i;
            while (i2 < childCount) {
                float f3;
                int i4;
                View childAt = GridLayout.this.getChildAt(i2);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                    f3 = (this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).weight;
                    if (f3 != 0.0f) {
                        int round = Math.round((((float) i3) * f3) / f2);
                        this.deltas[i2] = round;
                        f3 = f2 - f3;
                        i4 = i3 - round;
                        i2++;
                        i3 = i4;
                        f2 = f3;
                    }
                }
                f3 = f2;
                i4 = i3;
                i2++;
                i3 = i4;
                f2 = f3;
            }
        }

        private int size(int[] iArr) {
            return iArr[getCount()];
        }

        private boolean solve(int[] iArr) {
            return solve(getArcs(), iArr);
        }

        private boolean solve(Arc[] arcArr, int[] iArr) {
            return solve(arcArr, iArr, GridLayout.DEFAULT_ORDER_PRESERVED);
        }

        private boolean solve(Arc[] arcArr, int[] iArr, boolean z) {
            String str = this.horizontal ? "horizontal" : "vertical";
            int count = getCount() + 1;
            boolean[] zArr = null;
            for (int i = 0; i < arcArr.length; i++) {
                int i2;
                init(iArr);
                for (i2 = 0; i2 < count; i2++) {
                    int i3 = 0;
                    for (Arc relax : arcArr) {
                        i3 |= relax(iArr, relax);
                    }
                    if (i3 == 0) {
                        if (zArr != null) {
                            logError(str, arcArr, zArr);
                        }
                        return GridLayout.DEFAULT_ORDER_PRESERVED;
                    }
                }
                if (!z) {
                    return $assertionsDisabled;
                }
                boolean[] zArr2 = new boolean[arcArr.length];
                for (i2 = 0; i2 < count; i2++) {
                    int length = arcArr.length;
                    for (i3 = 0; i3 < length; i3++) {
                        zArr2[i3] = zArr2[i3] | relax(iArr, arcArr[i3]);
                    }
                }
                if (i == 0) {
                    zArr = zArr2;
                }
                for (i3 = 0; i3 < arcArr.length; i3++) {
                    if (zArr2[i3]) {
                        Arc arc = arcArr[i3];
                        if (arc.span.min >= arc.span.max) {
                            arc.valid = $assertionsDisabled;
                            break;
                        }
                    }
                }
            }
            return GridLayout.DEFAULT_ORDER_PRESERVED;
        }

        private void solveAndDistributeSpace(int[] iArr) {
            Arrays.fill(getDeltas(), 0);
            solve(iArr);
            int childCount = (this.parentMin.value * GridLayout.this.getChildCount()) + 1;
            if (childCount >= 2) {
                float calculateTotalWeight = calculateTotalWeight();
                int i = -1;
                boolean z = GridLayout.DEFAULT_ORDER_PRESERVED;
                int i2 = 0;
                int i3 = childCount;
                while (i2 < i3) {
                    childCount = (int) ((((long) i2) + ((long) i3)) / 2);
                    invalidateValues();
                    shareOutDelta(childCount, calculateTotalWeight);
                    z = solve(getArcs(), iArr, $assertionsDisabled);
                    if (z) {
                        i2 = childCount + 1;
                        i = childCount;
                    } else {
                        i3 = childCount;
                    }
                }
                if (i > 0 && !r0) {
                    invalidateValues();
                    shareOutDelta(i, calculateTotalWeight);
                    solve(iArr);
                }
            }
        }

        private Arc[] topologicalSort(List<Arc> list) {
            return topologicalSort((Arc[]) list.toArray(new Arc[list.size()]));
        }

        private Arc[] topologicalSort(final Arc[] arcArr) {
            return new Object() {
                static final /* synthetic */ boolean $assertionsDisabled = (!GridLayout.class.desiredAssertionStatus() ? GridLayout.DEFAULT_ORDER_PRESERVED : Axis.$assertionsDisabled);
                Arc[][] arcsByVertex = Axis.this.groupArcsByFirstVertex(arcArr);
                int cursor = (this.result.length - 1);
                Arc[] result = new Arc[arcArr.length];
                int[] visited = new int[(Axis.this.getCount() + 1)];

                Arc[] sort() {
                    int length = this.arcsByVertex.length;
                    for (int i = 0; i < length; i++) {
                        walk(i);
                    }
                    if ($assertionsDisabled || this.cursor == -1) {
                        return this.result;
                    }
                    throw new AssertionError();
                }

                void walk(int i) {
                    switch (this.visited[i]) {
                        case 0:
                            this.visited[i] = 1;
                            for (Arc arc : this.arcsByVertex[i]) {
                                walk(arc.span.max);
                                Arc[] arcArr = this.result;
                                int i2 = this.cursor;
                                this.cursor = i2 - 1;
                                arcArr[i2] = arc;
                            }
                            this.visited[i] = 2;
                            return;
                        case 1:
                            if (!$assertionsDisabled) {
                                throw new AssertionError();
                            }
                            return;
                        default:
                            return;
                    }
                }
            }.sort();
        }

        public final Arc[] getArcs() {
            if (this.arcs == null) {
                this.arcs = createArcs();
            }
            if (!this.arcsValid) {
                computeArcs();
                this.arcsValid = GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            return this.arcs;
        }

        public final int getCount() {
            return Math.max(this.definedCount, getMaxIndex());
        }

        public final int[] getDeltas() {
            if (this.deltas == null) {
                this.deltas = new int[GridLayout.this.getChildCount()];
            }
            return this.deltas;
        }

        public final PackedMap<Spec, Bounds> getGroupBounds() {
            if (this.groupBounds == null) {
                this.groupBounds = createGroupBounds();
            }
            if (!this.groupBoundsValid) {
                computeGroupBounds();
                this.groupBoundsValid = GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            return this.groupBounds;
        }

        public final int[] getLeadingMargins() {
            if (this.leadingMargins == null) {
                this.leadingMargins = new int[(getCount() + 1)];
            }
            if (!this.leadingMarginsValid) {
                computeMargins(GridLayout.DEFAULT_ORDER_PRESERVED);
                this.leadingMarginsValid = GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            return this.leadingMargins;
        }

        public final int[] getLocations() {
            if (this.locations == null) {
                this.locations = new int[(getCount() + 1)];
            }
            if (!this.locationsValid) {
                computeLocations(this.locations);
                this.locationsValid = GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            return this.locations;
        }

        public final int getMeasure(int i) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            switch (mode) {
                case Integer.MIN_VALUE:
                    return getMeasure(0, size);
                case 0:
                    return getMeasure(0, GridLayout.MAX_SIZE);
                case 1073741824:
                    return getMeasure(size, size);
                default:
                    if ($assertionsDisabled) {
                        return 0;
                    }
                    throw new AssertionError();
            }
        }

        public final int[] getTrailingMargins() {
            if (this.trailingMargins == null) {
                this.trailingMargins = new int[(getCount() + 1)];
            }
            if (!this.trailingMarginsValid) {
                computeMargins($assertionsDisabled);
                this.trailingMarginsValid = GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            return this.trailingMargins;
        }

        final Arc[][] groupArcsByFirstVertex(Arc[] arcArr) {
            int i;
            int i2;
            int i3 = 0;
            int count = getCount() + 1;
            Arc[][] arcArr2 = new Arc[count][];
            int[] iArr = new int[count];
            for (Arc arc : arcArr) {
                int i4 = arc.span.min;
                iArr[i4] = iArr[i4] + 1;
            }
            for (i = 0; i < count; i++) {
                arcArr2[i] = new Arc[iArr[i]];
            }
            Arrays.fill(iArr, 0);
            i = arcArr.length;
            while (i3 < i) {
                Arc arc2 = arcArr[i3];
                i2 = arc2.span.min;
                Arc[] arcArr3 = arcArr2[i2];
                int i5 = iArr[i2];
                iArr[i2] = i5 + 1;
                arcArr3[i5] = arc2;
                i3++;
            }
            return arcArr2;
        }

        public final void invalidateStructure() {
            this.maxIndex = Integer.MIN_VALUE;
            this.groupBounds = null;
            this.forwardLinks = null;
            this.backwardLinks = null;
            this.leadingMargins = null;
            this.trailingMargins = null;
            this.arcs = null;
            this.locations = null;
            this.deltas = null;
            this.hasWeightsValid = $assertionsDisabled;
            invalidateValues();
        }

        public final void invalidateValues() {
            this.groupBoundsValid = $assertionsDisabled;
            this.forwardLinksValid = $assertionsDisabled;
            this.backwardLinksValid = $assertionsDisabled;
            this.leadingMarginsValid = $assertionsDisabled;
            this.trailingMarginsValid = $assertionsDisabled;
            this.arcsValid = $assertionsDisabled;
            this.locationsValid = $assertionsDisabled;
        }

        public final boolean isOrderPreserved() {
            return this.orderPreserved;
        }

        public final void layout(int i) {
            setParentConstraints(i, i);
            getLocations();
        }

        public final void setCount(int i) {
            if (i != Integer.MIN_VALUE && i < getMaxIndex()) {
                GridLayout.handleInvalidParams((this.horizontal ? "column" : "row") + "Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child");
            }
            this.definedCount = i;
        }

        public final void setOrderPreserved(boolean z) {
            this.orderPreserved = z;
            invalidateStructure();
        }
    }

    static final class Interval {
        public final int max;
        public final int min;

        public Interval(int i, int i2) {
            this.min = i;
            this.max = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return GridLayout.DEFAULT_USE_DEFAULT_MARGINS;
            }
            Interval interval = (Interval) obj;
            return this.max != interval.max ? GridLayout.DEFAULT_USE_DEFAULT_MARGINS : this.min != interval.min ? GridLayout.DEFAULT_USE_DEFAULT_MARGINS : GridLayout.DEFAULT_ORDER_PRESERVED;
        }

        public final int hashCode() {
            return (this.min * 31) + this.max;
        }

        final Interval inverse() {
            return new Interval(this.max, this.min);
        }

        final int size() {
            return this.max - this.min;
        }

        public final String toString() {
            return "[" + this.min + ", " + this.max + "]";
        }
    }

    public static class LayoutParams extends MarginLayoutParams {
        private static final int BOTTOM_MARGIN = C0876b.GridLayout_Layout_android_layout_marginBottom;
        private static final int COLUMN = C0876b.GridLayout_Layout_layout_column;
        private static final int COLUMN_SPAN = C0876b.GridLayout_Layout_layout_columnSpan;
        private static final int COLUMN_WEIGHT = C0876b.GridLayout_Layout_layout_columnWeight;
        private static final int DEFAULT_COLUMN = Integer.MIN_VALUE;
        private static final int DEFAULT_HEIGHT = -2;
        private static final int DEFAULT_MARGIN = Integer.MIN_VALUE;
        private static final int DEFAULT_ROW = Integer.MIN_VALUE;
        private static final Interval DEFAULT_SPAN;
        private static final int DEFAULT_SPAN_SIZE;
        private static final int DEFAULT_WIDTH = -2;
        private static final int GRAVITY = C0876b.GridLayout_Layout_layout_gravity;
        private static final int LEFT_MARGIN = C0876b.GridLayout_Layout_android_layout_marginLeft;
        private static final int MARGIN = C0876b.GridLayout_Layout_android_layout_margin;
        private static final int RIGHT_MARGIN = C0876b.GridLayout_Layout_android_layout_marginRight;
        private static final int ROW = C0876b.GridLayout_Layout_layout_row;
        private static final int ROW_SPAN = C0876b.GridLayout_Layout_layout_rowSpan;
        private static final int ROW_WEIGHT = C0876b.GridLayout_Layout_layout_rowWeight;
        private static final int TOP_MARGIN = C0876b.GridLayout_Layout_android_layout_marginTop;
        public Spec columnSpec;
        public Spec rowSpec;

        static {
            Interval interval = new Interval(Integer.MIN_VALUE, -2147483647);
            DEFAULT_SPAN = interval;
            DEFAULT_SPAN_SIZE = interval.size();
        }

        public LayoutParams() {
            this(Spec.UNDEFINED, Spec.UNDEFINED);
        }

        private LayoutParams(int i, int i2, int i3, int i4, int i5, int i6, Spec spec, Spec spec2) {
            super(i, i2);
            this.rowSpec = Spec.UNDEFINED;
            this.columnSpec = Spec.UNDEFINED;
            setMargins(i3, i4, i5, i6);
            this.rowSpec = spec;
            this.columnSpec = spec2;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.rowSpec = Spec.UNDEFINED;
            this.columnSpec = Spec.UNDEFINED;
            reInitSuper(context, attributeSet);
            init(context, attributeSet);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.rowSpec = Spec.UNDEFINED;
            this.columnSpec = Spec.UNDEFINED;
            this.rowSpec = layoutParams.rowSpec;
            this.columnSpec = layoutParams.columnSpec;
        }

        public LayoutParams(Spec spec, Spec spec2) {
            this(-2, -2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, spec, spec2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.rowSpec = Spec.UNDEFINED;
            this.columnSpec = Spec.UNDEFINED;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.rowSpec = Spec.UNDEFINED;
            this.columnSpec = Spec.UNDEFINED;
        }

        private void init(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0876b.GridLayout_Layout);
            try {
                int i = obtainStyledAttributes.getInt(GRAVITY, 0);
                this.columnSpec = GridLayout.spec(obtainStyledAttributes.getInt(COLUMN, Integer.MIN_VALUE), obtainStyledAttributes.getInt(COLUMN_SPAN, DEFAULT_SPAN_SIZE), GridLayout.getAlignment(i, GridLayout.DEFAULT_ORDER_PRESERVED), obtainStyledAttributes.getFloat(COLUMN_WEIGHT, 0.0f));
                this.rowSpec = GridLayout.spec(obtainStyledAttributes.getInt(ROW, Integer.MIN_VALUE), obtainStyledAttributes.getInt(ROW_SPAN, DEFAULT_SPAN_SIZE), GridLayout.getAlignment(i, GridLayout.DEFAULT_USE_DEFAULT_MARGINS), obtainStyledAttributes.getFloat(ROW_WEIGHT, 0.0f));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        private void reInitSuper(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0876b.GridLayout_Layout);
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(MARGIN, Integer.MIN_VALUE);
                this.leftMargin = obtainStyledAttributes.getDimensionPixelSize(LEFT_MARGIN, dimensionPixelSize);
                this.topMargin = obtainStyledAttributes.getDimensionPixelSize(TOP_MARGIN, dimensionPixelSize);
                this.rightMargin = obtainStyledAttributes.getDimensionPixelSize(RIGHT_MARGIN, dimensionPixelSize);
                this.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(BOTTOM_MARGIN, dimensionPixelSize);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return GridLayout.DEFAULT_USE_DEFAULT_MARGINS;
            }
            LayoutParams layoutParams = (LayoutParams) obj;
            return !this.columnSpec.equals(layoutParams.columnSpec) ? GridLayout.DEFAULT_USE_DEFAULT_MARGINS : !this.rowSpec.equals(layoutParams.rowSpec) ? GridLayout.DEFAULT_USE_DEFAULT_MARGINS : GridLayout.DEFAULT_ORDER_PRESERVED;
        }

        public int hashCode() {
            return (this.rowSpec.hashCode() * 31) + this.columnSpec.hashCode();
        }

        protected void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            this.width = typedArray.getLayoutDimension(i, -2);
            this.height = typedArray.getLayoutDimension(i2, -2);
        }

        final void setColumnSpecSpan(Interval interval) {
            this.columnSpec = this.columnSpec.copyWriteSpan(interval);
        }

        public void setGravity(int i) {
            this.rowSpec = this.rowSpec.copyWriteAlignment(GridLayout.getAlignment(i, GridLayout.DEFAULT_USE_DEFAULT_MARGINS));
            this.columnSpec = this.columnSpec.copyWriteAlignment(GridLayout.getAlignment(i, GridLayout.DEFAULT_ORDER_PRESERVED));
        }

        final void setRowSpecSpan(Interval interval) {
            this.rowSpec = this.rowSpec.copyWriteSpan(interval);
        }
    }

    static final class MutableInt {
        public int value;

        public MutableInt() {
            reset();
        }

        public MutableInt(int i) {
            this.value = i;
        }

        public final void reset() {
            this.value = Integer.MIN_VALUE;
        }

        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    static final class PackedMap<K, V> {
        public final int[] index;
        public final K[] keys;
        public final V[] values;

        PackedMap(K[] kArr, V[] vArr) {
            this.index = createIndex(kArr);
            this.keys = compact(kArr, this.index);
            this.values = compact(vArr, this.index);
        }

        private static <K> K[] compact(K[] kArr, int[] iArr) {
            int length = kArr.length;
            Object[] objArr = (Object[]) Array.newInstance(kArr.getClass().getComponentType(), GridLayout.max2(iArr, -1) + 1);
            for (int i = 0; i < length; i++) {
                objArr[iArr[i]] = kArr[i];
            }
            return objArr;
        }

        private static <K> int[] createIndex(K[] kArr) {
            int length = kArr.length;
            int[] iArr = new int[length];
            Map hashMap = new HashMap();
            for (int i = 0; i < length; i++) {
                Object obj = kArr[i];
                Integer num = (Integer) hashMap.get(obj);
                if (num == null) {
                    num = Integer.valueOf(hashMap.size());
                    hashMap.put(obj, num);
                }
                iArr[i] = num.intValue();
            }
            return iArr;
        }

        public final V getValue(int i) {
            return this.values[this.index[i]];
        }
    }

    public static class Spec {
        static final float DEFAULT_WEIGHT = 0.0f;
        static final Spec UNDEFINED = GridLayout.spec(Integer.MIN_VALUE);
        final Alignment alignment;
        final Interval span;
        final boolean startDefined;
        final float weight;

        Spec(boolean z, int i, int i2, Alignment alignment, float f) {
            this(z, new Interval(i, i + i2), alignment, f);
        }

        private Spec(boolean z, Interval interval, Alignment alignment, float f) {
            this.startDefined = z;
            this.span = interval;
            this.alignment = alignment;
            this.weight = f;
        }

        final Spec copyWriteAlignment(Alignment alignment) {
            return new Spec(this.startDefined, this.span, alignment, this.weight);
        }

        final Spec copyWriteSpan(Interval interval) {
            return new Spec(this.startDefined, interval, this.alignment, this.weight);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return GridLayout.DEFAULT_ORDER_PRESERVED;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return GridLayout.DEFAULT_USE_DEFAULT_MARGINS;
            }
            Spec spec = (Spec) obj;
            return !this.alignment.equals(spec.alignment) ? GridLayout.DEFAULT_USE_DEFAULT_MARGINS : !this.span.equals(spec.span) ? GridLayout.DEFAULT_USE_DEFAULT_MARGINS : GridLayout.DEFAULT_ORDER_PRESERVED;
        }

        public Alignment getAbsoluteAlignment(boolean z) {
            return this.alignment != GridLayout.UNDEFINED_ALIGNMENT ? this.alignment : this.weight == 0.0f ? z ? GridLayout.START : GridLayout.BASELINE : GridLayout.FILL;
        }

        final int getFlexibility() {
            return (this.alignment == GridLayout.UNDEFINED_ALIGNMENT && this.weight == 0.0f) ? 0 : 2;
        }

        public int hashCode() {
            return (this.span.hashCode() * 31) + this.alignment.hashCode();
        }
    }

    public GridLayout(Context context) {
        this(context, null);
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHorizontalAxis = new Axis(DEFAULT_ORDER_PRESERVED);
        this.mVerticalAxis = new Axis(DEFAULT_USE_DEFAULT_MARGINS);
        this.mOrientation = 0;
        this.mUseDefaultMargins = DEFAULT_USE_DEFAULT_MARGINS;
        this.mAlignmentMode = 1;
        this.mLastLayoutParamsHashCode = 0;
        this.mPrinter = LOG_PRINTER;
        this.mDefaultGap = context.getResources().getDimensionPixelOffset(C0875a.default_gap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0876b.GridLayout);
        try {
            setRowCount(obtainStyledAttributes.getInt(ROW_COUNT, Integer.MIN_VALUE));
            setColumnCount(obtainStyledAttributes.getInt(COLUMN_COUNT, Integer.MIN_VALUE));
            setOrientation(obtainStyledAttributes.getInt(ORIENTATION, 0));
            setUseDefaultMargins(obtainStyledAttributes.getBoolean(USE_DEFAULT_MARGINS, DEFAULT_USE_DEFAULT_MARGINS));
            setAlignmentMode(obtainStyledAttributes.getInt(ALIGNMENT_MODE, 1));
            setRowOrderPreserved(obtainStyledAttributes.getBoolean(ROW_ORDER_PRESERVED, DEFAULT_ORDER_PRESERVED));
            setColumnOrderPreserved(obtainStyledAttributes.getBoolean(COLUMN_ORDER_PRESERVED, DEFAULT_ORDER_PRESERVED));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    static int adjust(int i, int i2) {
        return MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i + i2), MeasureSpec.getMode(i));
    }

    static <T> T[] append(T[] tArr, T[] tArr2) {
        Object[] objArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, objArr, 0, tArr.length);
        System.arraycopy(tArr2, 0, objArr, tArr.length, tArr2.length);
        return objArr;
    }

    static boolean canStretch(int i) {
        return (i & 2) != 0 ? DEFAULT_ORDER_PRESERVED : DEFAULT_USE_DEFAULT_MARGINS;
    }

    private void checkLayoutParams(LayoutParams layoutParams, boolean z) {
        String str = z ? "column" : "row";
        Interval interval = (z ? layoutParams.columnSpec : layoutParams.rowSpec).span;
        if (interval.min != Integer.MIN_VALUE && interval.min < 0) {
            handleInvalidParams(str + " indices must be positive");
        }
        int i = (z ? this.mHorizontalAxis : this.mVerticalAxis).definedCount;
        if (i != Integer.MIN_VALUE) {
            if (interval.max > i) {
                handleInvalidParams(str + " indices (start + span) mustn't exceed the " + str + " count");
            }
            if (interval.size() > i) {
                handleInvalidParams(str + " span mustn't exceed the " + str + " count");
            }
        }
    }

    private static int clip(Interval interval, boolean z, int i) {
        int size = interval.size();
        if (i == 0) {
            return size;
        }
        return Math.min(size, i - (z ? Math.min(interval.min, i) : 0));
    }

    private int computeLayoutParamsHashCode() {
        int i = 1;
        int childCount = getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            int hashCode;
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                hashCode = ((LayoutParams) childAt.getLayoutParams()).hashCode() + (i * 31);
            } else {
                hashCode = i;
            }
            i2++;
            i = hashCode;
        }
        return i;
    }

    private void consistencyCheck() {
        while (this.mLastLayoutParamsHashCode != 0) {
            if (this.mLastLayoutParamsHashCode != computeLayoutParamsHashCode()) {
                this.mPrinter.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
                invalidateStructure();
            } else {
                return;
            }
        }
        validateLayoutParams();
        this.mLastLayoutParamsHashCode = computeLayoutParamsHashCode();
    }

    private static Alignment createSwitchingAlignment(final Alignment alignment, final Alignment alignment2) {
        return new Alignment() {
            public final int getAlignmentValue(View view, int i, int i2) {
                Object obj = 1;
                if (C0679r.m1932e(view) != 1) {
                    obj = null;
                }
                return (obj == null ? alignment : alignment2).getAlignmentValue(view, i, i2);
            }

            final String getDebugString() {
                return "SWITCHING[L:" + alignment.getDebugString() + ", R:" + alignment2.getDebugString() + "]";
            }

            final int getGravityOffset(View view, int i) {
                Object obj = 1;
                if (C0679r.m1932e(view) != 1) {
                    obj = null;
                }
                return (obj == null ? alignment : alignment2).getGravityOffset(view, i);
            }
        };
    }

    private void drawLine(Canvas canvas, int i, int i2, int i3, int i4, Paint paint) {
        if (isLayoutRtlCompat()) {
            int width = getWidth();
            canvas.drawLine((float) (width - i), (float) i2, (float) (width - i3), (float) i4, paint);
            return;
        }
        canvas.drawLine((float) i, (float) i2, (float) i3, (float) i4, paint);
    }

    private static boolean fits(int[] iArr, int i, int i2, int i3) {
        if (i3 > iArr.length) {
            return DEFAULT_USE_DEFAULT_MARGINS;
        }
        while (i2 < i3) {
            if (iArr[i2] > i) {
                return DEFAULT_USE_DEFAULT_MARGINS;
            }
            i2++;
        }
        return DEFAULT_ORDER_PRESERVED;
    }

    static Alignment getAlignment(int i, boolean z) {
        switch (((z ? 7 : 112) & i) >> (z ? 0 : 4)) {
            case 1:
                return CENTER;
            case 3:
                return z ? LEFT : TOP;
            case 5:
                return z ? RIGHT : BOTTOM;
            case 7:
                return FILL;
            case 8388611:
                return START;
            case 8388613:
                return END;
            default:
                return UNDEFINED_ALIGNMENT;
        }
    }

    private int getDefaultMargin(View view, LayoutParams layoutParams, boolean z, boolean z2) {
        if (!this.mUseDefaultMargins) {
            return 0;
        }
        int i;
        Spec spec = z ? layoutParams.columnSpec : layoutParams.rowSpec;
        Axis axis = z ? this.mHorizontalAxis : this.mVerticalAxis;
        Interval interval = spec.span;
        if (z && isLayoutRtlCompat()) {
            i = !z2 ? 1 : 0;
        } else {
            boolean z3 = z2;
        }
        boolean z4 = i != 0 ? interval.min == 0 ? DEFAULT_ORDER_PRESERVED : DEFAULT_USE_DEFAULT_MARGINS : interval.max == axis.getCount() ? DEFAULT_ORDER_PRESERVED : DEFAULT_USE_DEFAULT_MARGINS;
        return getDefaultMargin(view, z4, z, z2);
    }

    private int getDefaultMargin(View view, boolean z, boolean z2) {
        return view.getClass() == Space.class ? 0 : this.mDefaultGap / 2;
    }

    private int getDefaultMargin(View view, boolean z, boolean z2, boolean z3) {
        return getDefaultMargin(view, z2, z3);
    }

    private int getMargin(View view, boolean z, boolean z2) {
        if (this.mAlignmentMode == 1) {
            return getMargin1(view, z, z2);
        }
        Axis axis = z ? this.mHorizontalAxis : this.mVerticalAxis;
        int[] leadingMargins = z2 ? axis.getLeadingMargins() : axis.getTrailingMargins();
        LayoutParams layoutParams = getLayoutParams(view);
        Spec spec = z ? layoutParams.columnSpec : layoutParams.rowSpec;
        return leadingMargins[z2 ? spec.span.min : spec.span.max];
    }

    private int getMeasurement(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private int getTotalMargin(View view, boolean z) {
        return getMargin(view, z, DEFAULT_ORDER_PRESERVED) + getMargin(view, z, DEFAULT_USE_DEFAULT_MARGINS);
    }

    static void handleInvalidParams(String str) {
        throw new IllegalArgumentException(str + ". ");
    }

    private void invalidateStructure() {
        this.mLastLayoutParamsHashCode = 0;
        if (this.mHorizontalAxis != null) {
            this.mHorizontalAxis.invalidateStructure();
        }
        if (this.mVerticalAxis != null) {
            this.mVerticalAxis.invalidateStructure();
        }
        invalidateValues();
    }

    private void invalidateValues() {
        if (this.mHorizontalAxis != null && this.mVerticalAxis != null) {
            this.mHorizontalAxis.invalidateValues();
            this.mVerticalAxis.invalidateValues();
        }
    }

    private boolean isLayoutRtlCompat() {
        return C0679r.m1932e(this) == 1 ? DEFAULT_ORDER_PRESERVED : DEFAULT_USE_DEFAULT_MARGINS;
    }

    static int max2(int[] iArr, int i) {
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    private void measureChildWithMargins2(View view, int i, int i2, int i3, int i4) {
        view.measure(getChildMeasureSpec(i, getTotalMargin(view, DEFAULT_ORDER_PRESERVED), i3), getChildMeasureSpec(i2, getTotalMargin(view, DEFAULT_USE_DEFAULT_MARGINS), i4));
    }

    private void measureChildrenWithMargins(int i, int i2, boolean z) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = getLayoutParams(childAt);
                if (z) {
                    measureChildWithMargins2(childAt, i, i2, layoutParams.width, layoutParams.height);
                } else {
                    boolean z2 = this.mOrientation == 0 ? DEFAULT_ORDER_PRESERVED : DEFAULT_USE_DEFAULT_MARGINS;
                    Spec spec = z2 ? layoutParams.columnSpec : layoutParams.rowSpec;
                    if (spec.getAbsoluteAlignment(z2) == FILL) {
                        Interval interval = spec.span;
                        int[] locations = (z2 ? this.mHorizontalAxis : this.mVerticalAxis).getLocations();
                        int totalMargin = (locations[interval.max] - locations[interval.min]) - getTotalMargin(childAt, z2);
                        if (z2) {
                            measureChildWithMargins2(childAt, i, i2, totalMargin, layoutParams.height);
                        } else {
                            measureChildWithMargins2(childAt, i, i2, layoutParams.width, totalMargin);
                        }
                    }
                }
            }
        }
    }

    private static void procrusteanFill(int[] iArr, int i, int i2, int i3) {
        int length = iArr.length;
        Arrays.fill(iArr, Math.min(i, length), Math.min(i2, length), i3);
    }

    private static void setCellGroup(LayoutParams layoutParams, int i, int i2, int i3, int i4) {
        layoutParams.setRowSpecSpan(new Interval(i, i + i2));
        layoutParams.setColumnSpecSpan(new Interval(i3, i3 + i4));
    }

    public static Spec spec(int i) {
        return spec(i, 1);
    }

    public static Spec spec(int i, float f) {
        return spec(i, 1, f);
    }

    public static Spec spec(int i, int i2) {
        return spec(i, i2, UNDEFINED_ALIGNMENT);
    }

    public static Spec spec(int i, int i2, float f) {
        return spec(i, i2, UNDEFINED_ALIGNMENT, f);
    }

    public static Spec spec(int i, int i2, Alignment alignment) {
        return spec(i, i2, alignment, 0.0f);
    }

    public static Spec spec(int i, int i2, Alignment alignment, float f) {
        return new Spec(i != Integer.MIN_VALUE ? DEFAULT_ORDER_PRESERVED : DEFAULT_USE_DEFAULT_MARGINS, i, i2, alignment, f);
    }

    public static Spec spec(int i, Alignment alignment) {
        return spec(i, 1, alignment);
    }

    public static Spec spec(int i, Alignment alignment, float f) {
        return spec(i, 1, alignment, f);
    }

    private void validateLayoutParams() {
        Object obj = this.mOrientation == 0 ? 1 : null;
        Axis axis = obj != null ? this.mHorizontalAxis : this.mVerticalAxis;
        int i = axis.definedCount != Integer.MIN_VALUE ? axis.definedCount : 0;
        int[] iArr = new int[i];
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
            Spec spec = obj != null ? layoutParams.rowSpec : layoutParams.columnSpec;
            Interval interval = spec.span;
            boolean z = spec.startDefined;
            int size = interval.size();
            if (z) {
                i3 = interval.min;
            }
            spec = obj != null ? layoutParams.columnSpec : layoutParams.rowSpec;
            interval = spec.span;
            boolean z2 = spec.startDefined;
            int clip = clip(interval, z2, i);
            int i5 = z2 ? interval.min : i2;
            if (i != 0) {
                if (!(z && z2)) {
                    while (!fits(iArr, i3, i5, i5 + clip)) {
                        if (z2) {
                            i3++;
                        } else if (i5 + clip <= i) {
                            i5++;
                        } else {
                            i3++;
                            i5 = 0;
                        }
                    }
                }
                procrusteanFill(iArr, i5, i5 + clip, i3 + size);
            }
            if (obj != null) {
                setCellGroup(layoutParams, i3, size, i5, clip);
            } else {
                setCellGroup(layoutParams, i5, clip, i3, size);
            }
            i2 = i5 + clip;
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams)) {
            return DEFAULT_USE_DEFAULT_MARGINS;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        checkLayoutParams(layoutParams2, DEFAULT_ORDER_PRESERVED);
        checkLayoutParams(layoutParams2, DEFAULT_USE_DEFAULT_MARGINS);
        return DEFAULT_ORDER_PRESERVED;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getAlignmentMode() {
        return this.mAlignmentMode;
    }

    public int getColumnCount() {
        return this.mHorizontalAxis.getCount();
    }

    final LayoutParams getLayoutParams(View view) {
        return (LayoutParams) view.getLayoutParams();
    }

    int getMargin1(View view, boolean z, boolean z2) {
        LayoutParams layoutParams = getLayoutParams(view);
        int i = z ? z2 ? layoutParams.leftMargin : layoutParams.rightMargin : z2 ? layoutParams.topMargin : layoutParams.bottomMargin;
        return i == Integer.MIN_VALUE ? getDefaultMargin(view, layoutParams, z, z2) : i;
    }

    final int getMeasurementIncludingMargin(View view, boolean z) {
        return view.getVisibility() == 8 ? 0 : getMeasurement(view, z) + getTotalMargin(view, z);
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public Printer getPrinter() {
        return this.mPrinter;
    }

    public int getRowCount() {
        return this.mVerticalAxis.getCount();
    }

    public boolean getUseDefaultMargins() {
        return this.mUseDefaultMargins;
    }

    public boolean isColumnOrderPreserved() {
        return this.mHorizontalAxis.isOrderPreserved();
    }

    public boolean isRowOrderPreserved() {
        return this.mVerticalAxis.isOrderPreserved();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        consistencyCheck();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        this.mHorizontalAxis.layout((i5 - paddingLeft) - paddingRight);
        this.mVerticalAxis.layout((i6 - paddingTop) - paddingBottom);
        int[] locations = this.mHorizontalAxis.getLocations();
        int[] locations2 = this.mVerticalAxis.getLocations();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = getLayoutParams(childAt);
                Spec spec = layoutParams.columnSpec;
                Spec spec2 = layoutParams.rowSpec;
                Interval interval = spec.span;
                Interval interval2 = spec2.span;
                int i8 = locations[interval.min];
                int i9 = locations2[interval2.min];
                int i10 = locations[interval.max] - i8;
                int i11 = locations2[interval2.max] - i9;
                int measurement = getMeasurement(childAt, DEFAULT_ORDER_PRESERVED);
                int measurement2 = getMeasurement(childAt, DEFAULT_USE_DEFAULT_MARGINS);
                Alignment absoluteAlignment = spec.getAbsoluteAlignment(DEFAULT_ORDER_PRESERVED);
                Alignment absoluteAlignment2 = spec2.getAbsoluteAlignment(DEFAULT_USE_DEFAULT_MARGINS);
                Bounds bounds = (Bounds) this.mHorizontalAxis.getGroupBounds().getValue(i7);
                Bounds bounds2 = (Bounds) this.mVerticalAxis.getGroupBounds().getValue(i7);
                int gravityOffset = absoluteAlignment.getGravityOffset(childAt, i10 - bounds.size(DEFAULT_ORDER_PRESERVED));
                int gravityOffset2 = absoluteAlignment2.getGravityOffset(childAt, i11 - bounds2.size(DEFAULT_ORDER_PRESERVED));
                int margin = getMargin(childAt, DEFAULT_ORDER_PRESERVED, DEFAULT_ORDER_PRESERVED);
                int margin2 = getMargin(childAt, DEFAULT_USE_DEFAULT_MARGINS, DEFAULT_ORDER_PRESERVED);
                int margin3 = getMargin(childAt, DEFAULT_ORDER_PRESERVED, DEFAULT_USE_DEFAULT_MARGINS);
                int i12 = margin + margin3;
                int margin4 = margin2 + getMargin(childAt, DEFAULT_USE_DEFAULT_MARGINS, DEFAULT_USE_DEFAULT_MARGINS);
                i6 = bounds.getOffset(this, childAt, absoluteAlignment, measurement + i12, DEFAULT_ORDER_PRESERVED);
                paddingBottom = bounds2.getOffset(this, childAt, absoluteAlignment2, measurement2 + margin4, DEFAULT_USE_DEFAULT_MARGINS);
                int sizeInCell = absoluteAlignment.getSizeInCell(childAt, measurement, i10 - i12);
                int sizeInCell2 = absoluteAlignment2.getSizeInCell(childAt, measurement2, i11 - margin4);
                i6 += i8 + gravityOffset;
                i6 = !isLayoutRtlCompat() ? i6 + (paddingLeft + margin) : (((i5 - sizeInCell) - paddingRight) - margin3) - i6;
                paddingBottom = (paddingBottom + ((paddingTop + i9) + gravityOffset2)) + margin2;
                if (!(sizeInCell == childAt.getMeasuredWidth() && sizeInCell2 == childAt.getMeasuredHeight())) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(sizeInCell, 1073741824), MeasureSpec.makeMeasureSpec(sizeInCell2, 1073741824));
                }
                childAt.layout(i6, paddingBottom, sizeInCell + i6, sizeInCell2 + paddingBottom);
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        int measure;
        int measure2;
        consistencyCheck();
        invalidateValues();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int adjust = adjust(i, -paddingLeft);
        int adjust2 = adjust(i2, -paddingTop);
        measureChildrenWithMargins(adjust, adjust2, DEFAULT_ORDER_PRESERVED);
        if (this.mOrientation == 0) {
            measure = this.mHorizontalAxis.getMeasure(adjust);
            measureChildrenWithMargins(adjust, adjust2, DEFAULT_USE_DEFAULT_MARGINS);
            measure2 = this.mVerticalAxis.getMeasure(adjust2);
        } else {
            measure2 = this.mVerticalAxis.getMeasure(adjust2);
            measureChildrenWithMargins(adjust, adjust2, DEFAULT_USE_DEFAULT_MARGINS);
            measure = this.mHorizontalAxis.getMeasure(adjust);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(measure + paddingLeft, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(measure2 + paddingTop, getSuggestedMinimumHeight()), i2, 0));
    }

    public void requestLayout() {
        super.requestLayout();
        invalidateStructure();
    }

    public void setAlignmentMode(int i) {
        this.mAlignmentMode = i;
        requestLayout();
    }

    public void setColumnCount(int i) {
        this.mHorizontalAxis.setCount(i);
        invalidateStructure();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        this.mHorizontalAxis.setOrderPreserved(z);
        invalidateStructure();
        requestLayout();
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            invalidateStructure();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = NO_PRINTER;
        }
        this.mPrinter = printer;
    }

    public void setRowCount(int i) {
        this.mVerticalAxis.setCount(i);
        invalidateStructure();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        this.mVerticalAxis.setOrderPreserved(z);
        invalidateStructure();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z) {
        this.mUseDefaultMargins = z;
        requestLayout();
    }
}
