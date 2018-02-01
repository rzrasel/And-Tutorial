package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.Map;

public final class fr {
    final Context f1412a;
    String f1413b;
    private final float f1414c;
    private float f1415d;
    private float f1416e;
    private float f1417f;
    private int f1418g;

    public fr(Context context) {
        this.f1418g = 0;
        this.f1412a = context;
        this.f1414c = context.getResources().getDisplayMetrics().density;
    }

    public fr(Context context, String str) {
        this(context);
        this.f1413b = str;
    }

    private void m2012a(int i, float f, float f2) {
        if (i == 0) {
            this.f1418g = 0;
            this.f1415d = f;
            this.f1416e = f2;
            this.f1417f = f2;
        } else if (this.f1418g == -1) {
        } else {
            if (i == 2) {
                if (f2 > this.f1416e) {
                    this.f1416e = f2;
                } else if (f2 < this.f1417f) {
                    this.f1417f = f2;
                }
                if (this.f1416e - this.f1417f > 30.0f * this.f1414c) {
                    this.f1418g = -1;
                    return;
                }
                if (this.f1418g == 0 || this.f1418g == 2) {
                    if (f - this.f1415d >= 50.0f * this.f1414c) {
                        this.f1415d = f;
                        this.f1418g++;
                    }
                } else if ((this.f1418g == 1 || this.f1418g == 3) && f - this.f1415d <= -50.0f * this.f1414c) {
                    this.f1415d = f;
                    this.f1418g++;
                }
                if (this.f1418g == 1 || this.f1418g == 3) {
                    if (f > this.f1415d) {
                        this.f1415d = f;
                    }
                } else if (this.f1418g == 2 && f < this.f1415d) {
                    this.f1415d = f;
                }
            } else if (i == 1 && this.f1418g == 4) {
                Object obj;
                if (TextUtils.isEmpty(this.f1413b)) {
                    obj = "No debug information";
                } else {
                    Uri build = new Builder().encodedQuery(this.f1413b).build();
                    StringBuilder stringBuilder = new StringBuilder();
                    Map a = fo.m1989a(build);
                    for (String str : a.keySet()) {
                        stringBuilder.append(str).append(" = ").append((String) a.get(str)).append("\n\n");
                    }
                    obj = stringBuilder.toString().trim();
                    if (TextUtils.isEmpty(obj)) {
                        obj = "No debug information";
                    }
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(this.f1412a);
                builder.setMessage(obj);
                builder.setTitle("Ad Information");
                builder.setPositiveButton("Share", new ft(this, obj));
                builder.setNegativeButton("Close", new fu(this));
                builder.create().show();
            }
        }
    }

    public final void m2013a(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i = 0; i < historySize; i++) {
            m2012a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i));
        }
        m2012a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }
}
