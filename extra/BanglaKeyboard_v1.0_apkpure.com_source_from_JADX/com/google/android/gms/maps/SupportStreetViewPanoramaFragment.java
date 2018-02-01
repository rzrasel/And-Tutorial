package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SupportStreetViewPanoramaFragment extends Fragment {
    private final C0499n f2069a = new C0499n(this);

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        C0499n.m3569a(this.f2069a, activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2069a.m786a(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f2069a.m782a(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.f2069a.m793e();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f2069a.m792d();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        C0499n.m3569a(this.f2069a, activity);
        this.f2069a.m785a(activity, new Bundle(), bundle);
    }

    public void onLowMemory() {
        this.f2069a.m794f();
        super.onLowMemory();
    }

    public void onPause() {
        this.f2069a.m791c();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f2069a.m789b();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f2069a.m790b(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
