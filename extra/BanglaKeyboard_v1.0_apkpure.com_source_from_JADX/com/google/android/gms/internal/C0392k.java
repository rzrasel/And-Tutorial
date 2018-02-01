package com.google.android.gms.internal;

import android.content.Context;
import org.json.JSONObject;

public final class C0392k implements C0369i {
    private final ge f1882a;

    public C0392k(Context context, dx dxVar) {
        this.f1882a = ge.m2081a(context, new ak(), false, false, null, dxVar);
    }

    public final void mo932a(C0357j c0357j) {
        this.f1882a.m2097f().m2119a(new C0393l(this, c0357j));
    }

    public final void mo933a(String str) {
        this.f1882a.loadUrl(str);
    }

    public final void mo934a(String str, ba baVar) {
        this.f1882a.m2097f().m2121a(str, baVar);
    }

    public final void mo935a(String str, JSONObject jSONObject) {
        this.f1882a.m2091a(str, jSONObject);
    }

    public final void mo936b(String str) {
        this.f1882a.m2097f().m2121a(str, null);
    }
}
