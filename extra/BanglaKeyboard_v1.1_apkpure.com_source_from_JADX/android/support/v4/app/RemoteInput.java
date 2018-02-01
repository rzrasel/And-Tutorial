package android.support.v4.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.RemoteInputCompatBase.RemoteInput.Factory;
import android.util.Log;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class RemoteInput extends android.support.v4.app.RemoteInputCompatBase.RemoteInput {
    private static final String EXTRA_DATA_TYPE_RESULTS_DATA = "android.remoteinput.dataTypeResultsData";
    public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    public static final Factory FACTORY = new C04261();
    private static final Impl IMPL;
    public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    private static final String TAG = "RemoteInput";
    private final boolean mAllowFreeFormTextInput;
    private final Set<String> mAllowedDataTypes;
    private final CharSequence[] mChoices;
    private final Bundle mExtras;
    private final CharSequence mLabel;
    private final String mResultKey;

    static class C04261 implements Factory {
        C04261() {
        }

        public final RemoteInput build(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle, Set<String> set) {
            return new RemoteInput(str, charSequence, charSequenceArr, z, bundle, set);
        }

        public final RemoteInput[] newArray(int i) {
            return new RemoteInput[i];
        }
    }

    public static final class Builder {
        private boolean mAllowFreeFormTextInput = true;
        private final Set<String> mAllowedDataTypes = new HashSet();
        private CharSequence[] mChoices;
        private Bundle mExtras = new Bundle();
        private CharSequence mLabel;
        private final String mResultKey;

        public Builder(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.mResultKey = str;
        }

        public final Builder addExtras(Bundle bundle) {
            if (bundle != null) {
                this.mExtras.putAll(bundle);
            }
            return this;
        }

        public final RemoteInput build() {
            return new RemoteInput(this.mResultKey, this.mLabel, this.mChoices, this.mAllowFreeFormTextInput, this.mExtras, this.mAllowedDataTypes);
        }

        public final Bundle getExtras() {
            return this.mExtras;
        }

        public final Builder setAllowDataType(String str, boolean z) {
            if (z) {
                this.mAllowedDataTypes.add(str);
            } else {
                this.mAllowedDataTypes.remove(str);
            }
            return this;
        }

        public final Builder setAllowFreeFormInput(boolean z) {
            this.mAllowFreeFormTextInput = z;
            return this;
        }

        public final Builder setChoices(CharSequence[] charSequenceArr) {
            this.mChoices = charSequenceArr;
            return this;
        }

        public final Builder setLabel(CharSequence charSequence) {
            this.mLabel = charSequence;
            return this;
        }
    }

    interface Impl {
        void addDataResultToIntent(RemoteInput remoteInput, Intent intent, Map<String, Uri> map);

        void addResultsToIntent(RemoteInput[] remoteInputArr, Intent intent, Bundle bundle);

        Map<String, Uri> getDataResultsFromIntent(Intent intent, String str);

        Bundle getResultsFromIntent(Intent intent);
    }

    static class ImplApi20 implements Impl {
        ImplApi20() {
        }

        public void addDataResultToIntent(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
            RemoteInputCompatApi20.addDataResultToIntent(remoteInput, intent, map);
        }

        public void addResultsToIntent(RemoteInput[] remoteInputArr, Intent intent, Bundle bundle) {
            RemoteInputCompatApi20.addResultsToIntent(remoteInputArr, intent, bundle);
        }

        public Map<String, Uri> getDataResultsFromIntent(Intent intent, String str) {
            return RemoteInputCompatApi20.getDataResultsFromIntent(intent, str);
        }

        public Bundle getResultsFromIntent(Intent intent) {
            return RemoteInputCompatApi20.getResultsFromIntent(intent);
        }
    }

    static class ImplBase implements Impl {
        ImplBase() {
        }

        public void addDataResultToIntent(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
            Log.w(RemoteInput.TAG, "RemoteInput is only supported from API Level 16");
        }

        public void addResultsToIntent(RemoteInput[] remoteInputArr, Intent intent, Bundle bundle) {
            Log.w(RemoteInput.TAG, "RemoteInput is only supported from API Level 16");
        }

        public Map<String, Uri> getDataResultsFromIntent(Intent intent, String str) {
            Log.w(RemoteInput.TAG, "RemoteInput is only supported from API Level 16");
            return null;
        }

        public Bundle getResultsFromIntent(Intent intent) {
            Log.w(RemoteInput.TAG, "RemoteInput is only supported from API Level 16");
            return null;
        }
    }

    static class ImplJellybean implements Impl {
        ImplJellybean() {
        }

        public void addDataResultToIntent(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
            RemoteInputCompatJellybean.addDataResultToIntent(remoteInput, intent, map);
        }

        public void addResultsToIntent(RemoteInput[] remoteInputArr, Intent intent, Bundle bundle) {
            RemoteInputCompatJellybean.addResultsToIntent(remoteInputArr, intent, bundle);
        }

        public Map<String, Uri> getDataResultsFromIntent(Intent intent, String str) {
            return RemoteInputCompatJellybean.getDataResultsFromIntent(intent, str);
        }

        public Bundle getResultsFromIntent(Intent intent) {
            return RemoteInputCompatJellybean.getResultsFromIntent(intent);
        }
    }

    static {
        if (VERSION.SDK_INT >= 20) {
            IMPL = new ImplApi20();
        } else if (VERSION.SDK_INT >= 16) {
            IMPL = new ImplJellybean();
        } else {
            IMPL = new ImplBase();
        }
    }

    RemoteInput(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle, Set<String> set) {
        this.mResultKey = str;
        this.mLabel = charSequence;
        this.mChoices = charSequenceArr;
        this.mAllowFreeFormTextInput = z;
        this.mExtras = bundle;
        this.mAllowedDataTypes = set;
    }

    public static void addDataResultToIntent(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
        IMPL.addDataResultToIntent(remoteInput, intent, map);
    }

    public static void addResultsToIntent(RemoteInput[] remoteInputArr, Intent intent, Bundle bundle) {
        IMPL.addResultsToIntent(remoteInputArr, intent, bundle);
    }

    public static Map<String, Uri> getDataResultsFromIntent(Intent intent, String str) {
        return IMPL.getDataResultsFromIntent(intent, str);
    }

    public static Bundle getResultsFromIntent(Intent intent) {
        return IMPL.getResultsFromIntent(intent);
    }

    public final boolean getAllowFreeFormInput() {
        return this.mAllowFreeFormTextInput;
    }

    public final Set<String> getAllowedDataTypes() {
        return this.mAllowedDataTypes;
    }

    public final CharSequence[] getChoices() {
        return this.mChoices;
    }

    public final Bundle getExtras() {
        return this.mExtras;
    }

    public final CharSequence getLabel() {
        return this.mLabel;
    }

    public final String getResultKey() {
        return this.mResultKey;
    }

    public final boolean isDataOnly() {
        return (getAllowFreeFormInput() || ((getChoices() != null && getChoices().length != 0) || getAllowedDataTypes() == null || getAllowedDataTypes().isEmpty())) ? false : true;
    }
}
