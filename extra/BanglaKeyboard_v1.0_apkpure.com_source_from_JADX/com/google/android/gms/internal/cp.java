package com.google.android.gms.internal;

import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;

final class cp {
    public final int f1141a;
    public final LayoutParams f1142b;
    public final ViewGroup f1143c;

    public cp(ge geVar) {
        this.f1142b = geVar.getLayoutParams();
        ViewParent parent = geVar.getParent();
        if (parent instanceof ViewGroup) {
            this.f1143c = (ViewGroup) parent;
            this.f1141a = this.f1143c.indexOfChild(geVar);
            this.f1143c.removeView(geVar);
            geVar.m2092a(true);
            return;
        }
        throw new cn("Could not get the parent of the WebView for an overlay.");
    }
}
