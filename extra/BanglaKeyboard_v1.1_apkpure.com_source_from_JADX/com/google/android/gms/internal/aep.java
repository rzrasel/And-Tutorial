package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.p056a.C1401c;
import java.util.List;

@aqv
public final class aep extends RelativeLayout {
    private static final float[] f4975a = new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable f4976b;

    public aep(Context context, aeo com_google_android_gms_internal_aeo, LayoutParams layoutParams) {
        super(context);
        C1516t.m3860a((Object) com_google_android_gms_internal_aeo);
        Drawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f4975a, null, null));
        shapeDrawable.getPaint().setColor(com_google_android_gms_internal_aeo.f4968c);
        setLayoutParams(layoutParams);
        zzbv.zzec().mo2108a((View) this, shapeDrawable);
        ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(com_google_android_gms_internal_aeo.f4966a)) {
            ViewGroup.LayoutParams layoutParams3 = new LayoutParams(-2, -2);
            View textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(com_google_android_gms_internal_aeo.f4966a);
            textView.setTextColor(com_google_android_gms_internal_aeo.f4969d);
            textView.setTextSize((float) com_google_android_gms_internal_aeo.f4970e);
            aak.m4022a();
            int a = hz.m5612a(context, 4);
            aak.m4022a();
            textView.setPadding(a, 0, hz.m5612a(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        View imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<aeq> list = com_google_android_gms_internal_aeo.f4967b;
        if (list != null && list.size() > 1) {
            this.f4976b = new AnimationDrawable();
            for (aeq com_google_android_gms_internal_aeq : list) {
                try {
                    this.f4976b.addFrame((Drawable) C1401c.m3585a(C1401c.m3584a(com_google_android_gms_internal_aeq.f4977a)), com_google_android_gms_internal_aeo.f4971f);
                } catch (Exception e) {
                    id.m5372a(6);
                }
            }
            zzbv.zzec().mo2108a(imageView, this.f4976b);
        } else if (list.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) C1401c.m3585a(C1401c.m3584a(((aeq) list.get(0)).f4977a)));
            } catch (Exception e2) {
                id.m5372a(6);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        if (this.f4976b != null) {
            this.f4976b.start();
        }
        super.onAttachedToWindow();
    }
}
