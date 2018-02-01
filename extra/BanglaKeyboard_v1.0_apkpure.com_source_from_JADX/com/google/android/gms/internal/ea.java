package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.view.View.MeasureSpec;
import android.webkit.WebView;

public final class ea extends AsyncTask {
    final /* synthetic */ dz f1237a;
    private final WebView f1238b;
    private Bitmap f1239c;

    public ea(dz dzVar, WebView webView) {
        this.f1237a = dzVar;
        this.f1238b = webView;
    }

    private synchronized Boolean m1895a() {
        Boolean valueOf;
        int width = this.f1239c.getWidth();
        int height = this.f1239c.getHeight();
        if (width == 0 || height == 0) {
            valueOf = Boolean.valueOf(false);
        } else {
            int i = 0;
            for (int i2 = 0; i2 < width; i2 += 10) {
                for (int i3 = 0; i3 < height; i3 += 10) {
                    if (this.f1239c.getPixel(i2, i3) != 0) {
                        i++;
                    }
                }
            }
            valueOf = Boolean.valueOf(((double) i) / (((double) (width * height)) / 100.0d) > 0.1d);
        }
        return valueOf;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m1895a();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        dz.m1884c(this.f1237a);
        if (bool.booleanValue() || this.f1237a.m1892c() || this.f1237a.f1232f <= 0) {
            this.f1237a.f1229c = bool.booleanValue();
            this.f1237a.f1233g.mo867a(this.f1237a.f1227a);
        } else if (this.f1237a.f1232f > 0) {
            if (gb.m2071a(2)) {
                gb.m2071a(3);
            }
            this.f1237a.f1230d.postDelayed(this.f1237a, this.f1237a.f1231e);
        }
    }

    protected final synchronized void onPreExecute() {
        this.f1239c = Bitmap.createBitmap(this.f1237a.f1235i, this.f1237a.f1234h, Config.ARGB_8888);
        this.f1238b.setVisibility(0);
        this.f1238b.measure(MeasureSpec.makeMeasureSpec(this.f1237a.f1235i, 0), MeasureSpec.makeMeasureSpec(this.f1237a.f1234h, 0));
        this.f1238b.layout(0, 0, this.f1237a.f1235i, this.f1237a.f1234h);
        this.f1238b.draw(new Canvas(this.f1239c));
        this.f1238b.invalidate();
    }
}
