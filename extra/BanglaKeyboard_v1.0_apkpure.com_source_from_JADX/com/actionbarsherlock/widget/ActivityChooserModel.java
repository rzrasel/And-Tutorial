package com.actionbarsherlock.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlSerializer;

class ActivityChooserModel extends DataSetObservable {
    private static final String ATTRIBUTE_ACTIVITY = "activity";
    private static final String ATTRIBUTE_TIME = "time";
    private static final String ATTRIBUTE_WEIGHT = "weight";
    private static final boolean DEBUG = false;
    private static final int DEFAULT_ACTIVITY_INFLATION = 5;
    private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1.0f;
    public static final String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
    public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
    private static final String HISTORY_FILE_EXTENSION = ".xml";
    private static final int INVALID_INDEX = -1;
    private static final String LOG_TAG = ActivityChooserModel.class.getSimpleName();
    private static final Executor SERIAL_EXECUTOR = Executors.newSingleThreadExecutor();
    private static final String TAG_HISTORICAL_RECORD = "historical-record";
    private static final String TAG_HISTORICAL_RECORDS = "historical-records";
    private static final Map sDataModelRegistry = new HashMap();
    private static final Object sRegistryLock = new Object();
    private final List mActivites = new ArrayList();
    private OnChooseActivityListener mActivityChoserModelPolicy;
    private ActivitySorter mActivitySorter = new DefaultSorter();
    private boolean mCanReadHistoricalData = true;
    private final Context mContext;
    private final Handler mHandler = new Handler();
    private final List mHistoricalRecords = new ArrayList();
    private boolean mHistoricalRecordsChanged = true;
    private final String mHistoryFileName;
    private int mHistoryMaxSize = 50;
    private final Object mInstanceLock = new Object();
    private Intent mIntent;
    private boolean mReadShareHistoryCalled = DEBUG;

    public interface ActivityChooserModelClient {
        void setActivityChooserModel(ActivityChooserModel activityChooserModel);
    }

    public final class ActivityResolveInfo implements Comparable {
        public final ResolveInfo resolveInfo;
        public float weight;

        public ActivityResolveInfo(ResolveInfo resolveInfo) {
            this.resolveInfo = resolveInfo;
        }

        public final int compareTo(ActivityResolveInfo activityResolveInfo) {
            return Float.floatToIntBits(activityResolveInfo.weight) - Float.floatToIntBits(this.weight);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return ActivityChooserModel.DEBUG;
            }
            if (getClass() != obj.getClass()) {
                return ActivityChooserModel.DEBUG;
            }
            return Float.floatToIntBits(this.weight) != Float.floatToIntBits(((ActivityResolveInfo) obj).weight) ? ActivityChooserModel.DEBUG : true;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.weight) + 31;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append("resolveInfo:").append(this.resolveInfo.toString());
            stringBuilder.append("; weight:").append(new BigDecimal((double) this.weight));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public interface ActivitySorter {
        void sort(Intent intent, List list, List list2);
    }

    final class DefaultSorter implements ActivitySorter {
        private static final float WEIGHT_DECAY_COEFFICIENT = 0.95f;
        private final Map mPackageNameToActivityMap;

        private DefaultSorter() {
            this.mPackageNameToActivityMap = new HashMap();
        }

        public final void sort(Intent intent, List list, List list2) {
            Map map = this.mPackageNameToActivityMap;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ActivityResolveInfo activityResolveInfo = (ActivityResolveInfo) list.get(i);
                activityResolveInfo.weight = 0.0f;
                map.put(activityResolveInfo.resolveInfo.activityInfo.packageName, activityResolveInfo);
            }
            int size2 = list2.size() - 1;
            float f = ActivityChooserModel.DEFAULT_HISTORICAL_RECORD_WEIGHT;
            int i2 = size2;
            while (i2 >= 0) {
                float f2;
                HistoricalRecord historicalRecord = (HistoricalRecord) list2.get(i2);
                activityResolveInfo = (ActivityResolveInfo) map.get(historicalRecord.activity.getPackageName());
                if (activityResolveInfo != null) {
                    activityResolveInfo.weight = (historicalRecord.weight * f) + activityResolveInfo.weight;
                    f2 = WEIGHT_DECAY_COEFFICIENT * f;
                } else {
                    f2 = f;
                }
                i2--;
                f = f2;
            }
            Collections.sort(list);
        }
    }

    public final class HistoricalRecord {
        public final ComponentName activity;
        public final long time;
        public final float weight;

        public HistoricalRecord(ComponentName componentName, long j, float f) {
            this.activity = componentName;
            this.time = j;
            this.weight = f;
        }

        public HistoricalRecord(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return ActivityChooserModel.DEBUG;
            }
            if (getClass() != obj.getClass()) {
                return ActivityChooserModel.DEBUG;
            }
            HistoricalRecord historicalRecord = (HistoricalRecord) obj;
            if (this.activity == null) {
                if (historicalRecord.activity != null) {
                    return ActivityChooserModel.DEBUG;
                }
            } else if (!this.activity.equals(historicalRecord.activity)) {
                return ActivityChooserModel.DEBUG;
            }
            return this.time != historicalRecord.time ? ActivityChooserModel.DEBUG : Float.floatToIntBits(this.weight) != Float.floatToIntBits(historicalRecord.weight) ? ActivityChooserModel.DEBUG : true;
        }

        public final int hashCode() {
            return (((((this.activity == null ? 0 : this.activity.hashCode()) + 31) * 31) + ((int) (this.time ^ (this.time >>> 32)))) * 31) + Float.floatToIntBits(this.weight);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append("; activity:").append(this.activity);
            stringBuilder.append("; time:").append(this.time);
            stringBuilder.append("; weight:").append(new BigDecimal((double) this.weight));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    final class HistoryLoader implements Runnable {

        class C01561 implements Runnable {
            C01561() {
            }

            public void run() {
                ActivityChooserModel.this.pruneExcessiveHistoricalRecordsLocked();
                ActivityChooserModel.this.sortActivities();
            }
        }

        private HistoryLoader() {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            r9 = this;
            r8 = 1;
            r0 = com.actionbarsherlock.widget.ActivityChooserModel.this;	 Catch:{ FileNotFoundException -> 0x0132 }
            r0 = r0.mContext;	 Catch:{ FileNotFoundException -> 0x0132 }
            r1 = com.actionbarsherlock.widget.ActivityChooserModel.this;	 Catch:{ FileNotFoundException -> 0x0132 }
            r1 = r1.mHistoryFileName;	 Catch:{ FileNotFoundException -> 0x0132 }
            r2 = r0.openFileInput(r1);	 Catch:{ FileNotFoundException -> 0x0132 }
            r1 = android.util.Xml.newPullParser();	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            r0 = 0;
            r1.setInput(r2, r0);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            r0 = 0;
        L_0x001a:
            if (r0 == r8) goto L_0x0024;
        L_0x001c:
            r3 = 2;
            if (r0 == r3) goto L_0x0024;
        L_0x001f:
            r0 = r1.next();	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            goto L_0x001a;
        L_0x0024:
            r0 = "historical-records";
            r3 = r1.getName();	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            r0 = r0.equals(r3);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            if (r0 != 0) goto L_0x0056;
        L_0x0030:
            r0 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            r1 = "Share records file does not start with historical-records tag.";
            r0.<init>(r1);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            throw r0;	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        L_0x0038:
            r0 = move-exception;
            com.actionbarsherlock.widget.ActivityChooserModel.LOG_TAG;	 Catch:{ all -> 0x00c1 }
            r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c1 }
            r1 = "Error reading historical recrod file: ";
            r0.<init>(r1);	 Catch:{ all -> 0x00c1 }
            r1 = com.actionbarsherlock.widget.ActivityChooserModel.this;	 Catch:{ all -> 0x00c1 }
            r1 = r1.mHistoryFileName;	 Catch:{ all -> 0x00c1 }
            r0 = r0.append(r1);	 Catch:{ all -> 0x00c1 }
            r0.toString();	 Catch:{ all -> 0x00c1 }
            if (r2 == 0) goto L_0x0055;
        L_0x0052:
            r2.close();	 Catch:{ IOException -> 0x012d }
        L_0x0055:
            return;
        L_0x0056:
            r0 = new java.util.ArrayList;	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            r0.<init>();	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        L_0x005b:
            r3 = r1.next();	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            if (r3 == r8) goto L_0x00c8;
        L_0x0061:
            r4 = 3;
            if (r3 == r4) goto L_0x005b;
        L_0x0064:
            r4 = 4;
            if (r3 == r4) goto L_0x005b;
        L_0x0067:
            r3 = r1.getName();	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            r4 = "historical-record";
            r3 = r4.equals(r3);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            if (r3 != 0) goto L_0x009b;
        L_0x0073:
            r0 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            r1 = "Share records file not well-formed.";
            r0.<init>(r1);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            throw r0;	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        L_0x007b:
            r0 = move-exception;
            com.actionbarsherlock.widget.ActivityChooserModel.LOG_TAG;	 Catch:{ all -> 0x00c1 }
            r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c1 }
            r1 = "Error reading historical recrod file: ";
            r0.<init>(r1);	 Catch:{ all -> 0x00c1 }
            r1 = com.actionbarsherlock.widget.ActivityChooserModel.this;	 Catch:{ all -> 0x00c1 }
            r1 = r1.mHistoryFileName;	 Catch:{ all -> 0x00c1 }
            r0 = r0.append(r1);	 Catch:{ all -> 0x00c1 }
            r0.toString();	 Catch:{ all -> 0x00c1 }
            if (r2 == 0) goto L_0x0055;
        L_0x0095:
            r2.close();	 Catch:{ IOException -> 0x0099 }
            goto L_0x0055;
        L_0x0099:
            r0 = move-exception;
            goto L_0x0055;
        L_0x009b:
            r3 = 0;
            r4 = "activity";
            r3 = r1.getAttributeValue(r3, r4);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            r4 = 0;
            r5 = "time";
            r4 = r1.getAttributeValue(r4, r5);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            r4 = java.lang.Long.parseLong(r4);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            r6 = 0;
            r7 = "weight";
            r6 = r1.getAttributeValue(r6, r7);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            r6 = java.lang.Float.parseFloat(r6);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            r7 = new com.actionbarsherlock.widget.ActivityChooserModel$HistoricalRecord;	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            r7.<init>(r3, r4, r6);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            r0.add(r7);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            goto L_0x005b;
        L_0x00c1:
            r0 = move-exception;
            if (r2 == 0) goto L_0x00c7;
        L_0x00c4:
            r2.close();	 Catch:{ IOException -> 0x0130 }
        L_0x00c7:
            throw r0;
        L_0x00c8:
            r1 = com.actionbarsherlock.widget.ActivityChooserModel.this;	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            r3 = r1.mInstanceLock;	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            monitor-enter(r3);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            r4 = new java.util.LinkedHashSet;	 Catch:{ all -> 0x012a }
            r4.<init>(r0);	 Catch:{ all -> 0x012a }
            r0 = com.actionbarsherlock.widget.ActivityChooserModel.this;	 Catch:{ all -> 0x012a }
            r5 = r0.mHistoricalRecords;	 Catch:{ all -> 0x012a }
            r0 = r5.size();	 Catch:{ all -> 0x012a }
            r0 = r0 + -1;
            r1 = r0;
        L_0x00e1:
            if (r1 < 0) goto L_0x00f0;
        L_0x00e3:
            r0 = r5.get(r1);	 Catch:{ all -> 0x012a }
            r0 = (com.actionbarsherlock.widget.ActivityChooserModel.HistoricalRecord) r0;	 Catch:{ all -> 0x012a }
            r4.add(r0);	 Catch:{ all -> 0x012a }
            r0 = r1 + -1;
            r1 = r0;
            goto L_0x00e1;
        L_0x00f0:
            r0 = r5.size();	 Catch:{ all -> 0x012a }
            r1 = r4.size();	 Catch:{ all -> 0x012a }
            if (r0 != r1) goto L_0x0105;
        L_0x00fa:
            monitor-exit(r3);	 Catch:{ all -> 0x012a }
            if (r2 == 0) goto L_0x0055;
        L_0x00fd:
            r2.close();	 Catch:{ IOException -> 0x0102 }
            goto L_0x0055;
        L_0x0102:
            r0 = move-exception;
            goto L_0x0055;
        L_0x0105:
            r5.clear();	 Catch:{ all -> 0x012a }
            r5.addAll(r4);	 Catch:{ all -> 0x012a }
            r0 = com.actionbarsherlock.widget.ActivityChooserModel.this;	 Catch:{ all -> 0x012a }
            r1 = 1;
            r0.mHistoricalRecordsChanged = r1;	 Catch:{ all -> 0x012a }
            r0 = com.actionbarsherlock.widget.ActivityChooserModel.this;	 Catch:{ all -> 0x012a }
            r0 = r0.mHandler;	 Catch:{ all -> 0x012a }
            r1 = new com.actionbarsherlock.widget.ActivityChooserModel$HistoryLoader$1;	 Catch:{ all -> 0x012a }
            r1.<init>();	 Catch:{ all -> 0x012a }
            r0.post(r1);	 Catch:{ all -> 0x012a }
            monitor-exit(r3);	 Catch:{ all -> 0x012a }
            if (r2 == 0) goto L_0x0055;
        L_0x0122:
            r2.close();	 Catch:{ IOException -> 0x0127 }
            goto L_0x0055;
        L_0x0127:
            r0 = move-exception;
            goto L_0x0055;
        L_0x012a:
            r0 = move-exception;
            monitor-exit(r3);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
            throw r0;	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        L_0x012d:
            r0 = move-exception;
            goto L_0x0055;
        L_0x0130:
            r1 = move-exception;
            goto L_0x00c7;
        L_0x0132:
            r0 = move-exception;
            goto L_0x0055;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.ActivityChooserModel.HistoryLoader.run():void");
        }
    }

    final class HistoryPersister implements Runnable {
        private HistoryPersister() {
        }

        public final void run() {
            synchronized (ActivityChooserModel.this.mInstanceLock) {
                List arrayList = new ArrayList(ActivityChooserModel.this.mHistoricalRecords);
            }
            try {
                OutputStream openFileOutput = ActivityChooserModel.this.mContext.openFileOutput(ActivityChooserModel.this.mHistoryFileName, 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.valueOf(true));
                    newSerializer.startTag(null, ActivityChooserModel.TAG_HISTORICAL_RECORDS);
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        HistoricalRecord historicalRecord = (HistoricalRecord) arrayList.remove(0);
                        newSerializer.startTag(null, ActivityChooserModel.TAG_HISTORICAL_RECORD);
                        newSerializer.attribute(null, ActivityChooserModel.ATTRIBUTE_ACTIVITY, historicalRecord.activity.flattenToString());
                        newSerializer.attribute(null, ActivityChooserModel.ATTRIBUTE_TIME, String.valueOf(historicalRecord.time));
                        newSerializer.attribute(null, ActivityChooserModel.ATTRIBUTE_WEIGHT, String.valueOf(historicalRecord.weight));
                        newSerializer.endTag(null, ActivityChooserModel.TAG_HISTORICAL_RECORD);
                    }
                    newSerializer.endTag(null, ActivityChooserModel.TAG_HISTORICAL_RECORDS);
                    newSerializer.endDocument();
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e) {
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    ActivityChooserModel.LOG_TAG;
                    "Error writing historical recrod file: " + ActivityChooserModel.this.mHistoryFileName;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e3) {
                        }
                    }
                } catch (IllegalStateException e4) {
                    ActivityChooserModel.LOG_TAG;
                    "Error writing historical recrod file: " + ActivityChooserModel.this.mHistoryFileName;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e5) {
                        }
                    }
                } catch (IOException e6) {
                    ActivityChooserModel.LOG_TAG;
                    "Error writing historical recrod file: " + ActivityChooserModel.this.mHistoryFileName;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e7) {
                        }
                    }
                } catch (Throwable th) {
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e8) {
                        }
                    }
                }
            } catch (FileNotFoundException e9) {
                ActivityChooserModel.LOG_TAG;
                "Error writing historical recrod file: " + ActivityChooserModel.this.mHistoryFileName;
            }
        }
    }

    public interface OnChooseActivityListener {
        boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent);
    }

    private ActivityChooserModel(Context context, String str) {
        this.mContext = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(HISTORY_FILE_EXTENSION)) {
            this.mHistoryFileName = str;
        } else {
            this.mHistoryFileName = str + HISTORY_FILE_EXTENSION;
        }
    }

    private boolean addHisoricalRecord(HistoricalRecord historicalRecord) {
        boolean add;
        synchronized (this.mInstanceLock) {
            add = this.mHistoricalRecords.add(historicalRecord);
            if (add) {
                this.mHistoricalRecordsChanged = true;
                pruneExcessiveHistoricalRecordsLocked();
                persistHistoricalData();
                sortActivities();
            }
        }
        return add;
    }

    public static ActivityChooserModel get(Context context, String str) {
        ActivityChooserModel activityChooserModel;
        synchronized (sRegistryLock) {
            activityChooserModel = (ActivityChooserModel) sDataModelRegistry.get(str);
            if (activityChooserModel == null) {
                activityChooserModel = new ActivityChooserModel(context, str);
                sDataModelRegistry.put(str, activityChooserModel);
            }
            activityChooserModel.readHistoricalData();
        }
        return activityChooserModel;
    }

    private void loadActivitiesLocked() {
        this.mActivites.clear();
        if (this.mIntent != null) {
            List queryIntentActivities = this.mContext.getPackageManager().queryIntentActivities(this.mIntent, 0);
            int size = queryIntentActivities.size();
            for (int i = 0; i < size; i++) {
                this.mActivites.add(new ActivityResolveInfo((ResolveInfo) queryIntentActivities.get(i)));
            }
            sortActivities();
            return;
        }
        notifyChanged();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void persistHistoricalData() {
        /*
        r4 = this;
        r1 = r4.mInstanceLock;
        monitor-enter(r1);
        r0 = r4.mReadShareHistoryCalled;	 Catch:{ all -> 0x000f }
        if (r0 != 0) goto L_0x0012;
    L_0x0007:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x000f }
        r2 = "No preceding call to #readHistoricalData";
        r0.<init>(r2);	 Catch:{ all -> 0x000f }
        throw r0;	 Catch:{ all -> 0x000f }
    L_0x000f:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
    L_0x0012:
        r0 = r4.mHistoricalRecordsChanged;	 Catch:{ all -> 0x000f }
        if (r0 != 0) goto L_0x0018;
    L_0x0016:
        monitor-exit(r1);	 Catch:{ all -> 0x000f }
    L_0x0017:
        return;
    L_0x0018:
        r0 = 0;
        r4.mHistoricalRecordsChanged = r0;	 Catch:{ all -> 0x000f }
        r0 = 1;
        r4.mCanReadHistoricalData = r0;	 Catch:{ all -> 0x000f }
        r0 = r4.mHistoryFileName;	 Catch:{ all -> 0x000f }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x000f }
        if (r0 != 0) goto L_0x0031;
    L_0x0026:
        r0 = SERIAL_EXECUTOR;	 Catch:{ all -> 0x000f }
        r2 = new com.actionbarsherlock.widget.ActivityChooserModel$HistoryPersister;	 Catch:{ all -> 0x000f }
        r3 = 0;
        r2.<init>();	 Catch:{ all -> 0x000f }
        r0.execute(r2);	 Catch:{ all -> 0x000f }
    L_0x0031:
        monitor-exit(r1);	 Catch:{ all -> 0x000f }
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.ActivityChooserModel.persistHistoricalData():void");
    }

    private void pruneExcessiveHistoricalRecordsLocked() {
        List list = this.mHistoricalRecords;
        int size = list.size() - this.mHistoryMaxSize;
        if (size > 0) {
            this.mHistoricalRecordsChanged = true;
            for (int i = 0; i < size; i++) {
                list.remove(0);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readHistoricalData() {
        /*
        r4 = this;
        r1 = r4.mInstanceLock;
        monitor-enter(r1);
        r0 = r4.mCanReadHistoricalData;	 Catch:{ all -> 0x0028 }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r4.mHistoricalRecordsChanged;	 Catch:{ all -> 0x0028 }
        if (r0 != 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0028 }
    L_0x000c:
        return;
    L_0x000d:
        r0 = 0;
        r4.mCanReadHistoricalData = r0;	 Catch:{ all -> 0x0028 }
        r0 = 1;
        r4.mReadShareHistoryCalled = r0;	 Catch:{ all -> 0x0028 }
        r0 = r4.mHistoryFileName;	 Catch:{ all -> 0x0028 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x0028 }
        if (r0 != 0) goto L_0x0026;
    L_0x001b:
        r0 = SERIAL_EXECUTOR;	 Catch:{ all -> 0x0028 }
        r2 = new com.actionbarsherlock.widget.ActivityChooserModel$HistoryLoader;	 Catch:{ all -> 0x0028 }
        r3 = 0;
        r2.<init>();	 Catch:{ all -> 0x0028 }
        r0.execute(r2);	 Catch:{ all -> 0x0028 }
    L_0x0026:
        monitor-exit(r1);	 Catch:{ all -> 0x0028 }
        goto L_0x000c;
    L_0x0028:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.ActivityChooserModel.readHistoricalData():void");
    }

    private void sortActivities() {
        synchronized (this.mInstanceLock) {
            if (!(this.mActivitySorter == null || this.mActivites.isEmpty())) {
                this.mActivitySorter.sort(this.mIntent, this.mActivites, Collections.unmodifiableList(this.mHistoricalRecords));
                notifyChanged();
            }
        }
    }

    public Intent chooseActivity(int i) {
        ActivityResolveInfo activityResolveInfo = (ActivityResolveInfo) this.mActivites.get(i);
        ComponentName componentName = new ComponentName(activityResolveInfo.resolveInfo.activityInfo.packageName, activityResolveInfo.resolveInfo.activityInfo.name);
        Intent intent = new Intent(this.mIntent);
        intent.setComponent(componentName);
        if (this.mActivityChoserModelPolicy != null) {
            if (this.mActivityChoserModelPolicy.onChooseActivity(this, new Intent(intent))) {
                return null;
            }
        }
        addHisoricalRecord(new HistoricalRecord(componentName, System.currentTimeMillis(), (float) DEFAULT_HISTORICAL_RECORD_WEIGHT));
        return intent;
    }

    public ResolveInfo getActivity(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.mInstanceLock) {
            resolveInfo = ((ActivityResolveInfo) this.mActivites.get(i)).resolveInfo;
        }
        return resolveInfo;
    }

    public int getActivityCount() {
        int size;
        synchronized (this.mInstanceLock) {
            size = this.mActivites.size();
        }
        return size;
    }

    public int getActivityIndex(ResolveInfo resolveInfo) {
        List list = this.mActivites;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((ActivityResolveInfo) list.get(i)).resolveInfo == resolveInfo) {
                return i;
            }
        }
        return -1;
    }

    public ResolveInfo getDefaultActivity() {
        synchronized (this.mInstanceLock) {
            if (this.mActivites.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((ActivityResolveInfo) this.mActivites.get(0)).resolveInfo;
            return resolveInfo;
        }
    }

    public int getHistoryMaxSize() {
        int i;
        synchronized (this.mInstanceLock) {
            i = this.mHistoryMaxSize;
        }
        return i;
    }

    public int getHistorySize() {
        int size;
        synchronized (this.mInstanceLock) {
            size = this.mHistoricalRecords.size();
        }
        return size;
    }

    public Intent getIntent() {
        Intent intent;
        synchronized (this.mInstanceLock) {
            intent = this.mIntent;
        }
        return intent;
    }

    public void setActivitySorter(ActivitySorter activitySorter) {
        synchronized (this.mInstanceLock) {
            if (this.mActivitySorter == activitySorter) {
                return;
            }
            this.mActivitySorter = activitySorter;
            sortActivities();
        }
    }

    public void setDefaultActivity(int i) {
        ActivityResolveInfo activityResolveInfo = (ActivityResolveInfo) this.mActivites.get(i);
        ActivityResolveInfo activityResolveInfo2 = (ActivityResolveInfo) this.mActivites.get(0);
        addHisoricalRecord(new HistoricalRecord(new ComponentName(activityResolveInfo.resolveInfo.activityInfo.packageName, activityResolveInfo.resolveInfo.activityInfo.name), System.currentTimeMillis(), activityResolveInfo2 != null ? (activityResolveInfo2.weight - activityResolveInfo.weight) + 5.0f : DEFAULT_HISTORICAL_RECORD_WEIGHT));
    }

    public void setHistoryMaxSize(int i) {
        synchronized (this.mInstanceLock) {
            if (this.mHistoryMaxSize == i) {
                return;
            }
            this.mHistoryMaxSize = i;
            pruneExcessiveHistoricalRecordsLocked();
            sortActivities();
        }
    }

    public void setIntent(Intent intent) {
        synchronized (this.mInstanceLock) {
            if (this.mIntent == intent) {
                return;
            }
            this.mIntent = intent;
            loadActivitiesLocked();
        }
    }

    public void setOnChooseActivityListener(OnChooseActivityListener onChooseActivityListener) {
        this.mActivityChoserModelPolicy = onChooseActivityListener;
    }
}
