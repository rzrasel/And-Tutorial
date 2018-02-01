package com.google.android.gms.internal;

final class hg implements ala {
    private /* synthetic */ String f6200a;
    private /* synthetic */ hn f6201b;

    hg(String str, hn hnVar) {
        this.f6200a = str;
        this.f6201b = hnVar;
    }

    public final void mo2117a(C1569b c1569b) {
        String str = this.f6200a;
        String c1569b2 = c1569b.toString();
        id.m5370a(new StringBuilder((String.valueOf(str).length() + 21) + String.valueOf(c1569b2).length()).append("Failed to load URL: ").append(str).append("\n").append(c1569b2).toString());
        this.f6201b.mo2122a(null);
    }
}
