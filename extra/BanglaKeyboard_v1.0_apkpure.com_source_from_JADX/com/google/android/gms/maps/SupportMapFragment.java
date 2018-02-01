package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SupportMapFragment extends Fragment {
    private final C0449l f2068a = new C0449l(this);

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        C0449l.m3199a(this.f2068a, activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2068a.m786a(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f2068a.m782a(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.f2068a.m793e();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f2068a.m792d();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        C0449l.m3199a(this.f2068a, activity);
        Parcelable a = GoogleMapOptions.m2784a(activity, attributeSet);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MapOptions", a);
        this.f2068a.m785a(activity, bundle2, bundle);
    }

    public void onLowMemory() {
        this.f2068a.m794f();
        super.onLowMemory();
    }

    public void onPause() {
        this.f2068a.m791c();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f2068a.m789b();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f2068a.m790b(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
