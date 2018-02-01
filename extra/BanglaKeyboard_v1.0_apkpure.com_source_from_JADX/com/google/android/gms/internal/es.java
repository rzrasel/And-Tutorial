package com.google.android.gms.internal;

final class es implements gk {
    final /* synthetic */ String f1295a;

    es(String str) {
        this.f1295a = str;
    }

    public final void mo867a(ge geVar) {
        String format = String.format("javascript:%s(%s);", new Object[]{"AFMA_buildAdURL", this.f1295a});
        "About to execute: " + format;
        gb.m2071a(2);
        geVar.loadUrl(format);
    }
}
