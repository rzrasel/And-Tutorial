package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.internal.aqv;

@aqv
public class NativeAdMapper {
    protected boolean f3871a;
    protected boolean f3872b;
    protected Bundle f3873c = new Bundle();
    protected View f3874d;

    public View getAdChoicesContent() {
        return this.f3874d;
    }

    public final Bundle getExtras() {
        return this.f3873c;
    }

    public final boolean getOverrideClickHandling() {
        return this.f3872b;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f3871a;
    }

    public void handleClick(View view) {
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(View view) {
        this.f3874d = view;
    }

    public final void setExtras(Bundle bundle) {
        this.f3873c = bundle;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.f3872b = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.f3871a = z;
    }

    public void trackView(View view) {
    }

    public void untrackView(View view) {
    }
}
