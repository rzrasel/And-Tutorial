package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;

@aqv
public final class aeq extends afz {
    final Drawable f4977a;
    private final Uri f4978b;
    private final double f4979c;

    public aeq(Drawable drawable, Uri uri, double d) {
        this.f4977a = drawable;
        this.f4978b = uri;
        this.f4979c = d;
    }

    public final C1398a mo1750a() {
        return C1401c.m3584a(this.f4977a);
    }

    public final Uri mo1751b() {
        return this.f4978b;
    }

    public final double mo1752c() {
        return this.f4979c;
    }
}
