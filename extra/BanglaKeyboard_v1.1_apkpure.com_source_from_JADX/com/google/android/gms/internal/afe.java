package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public class afe implements afa {
    final afb f5017a;
    final Context f5018b;
    final afc f5019c;
    boolean f5020d;
    private final Object f5021e = new Object();
    private final JSONObject f5022f;
    private apn f5023g;
    private final nh f5024h;
    private final zzajk f5025i;
    private String f5026j;
    private dt f5027k;
    private WeakReference<View> f5028l = null;

    public afe(Context context, afb com_google_android_gms_internal_afb, apn com_google_android_gms_internal_apn, nh nhVar, JSONObject jSONObject, afc com_google_android_gms_internal_afc, zzajk com_google_android_gms_internal_zzajk, String str) {
        this.f5018b = context;
        this.f5017a = com_google_android_gms_internal_afb;
        this.f5023g = com_google_android_gms_internal_apn;
        this.f5024h = nhVar;
        this.f5022f = jSONObject;
        this.f5019c = com_google_android_gms_internal_afc;
        this.f5025i = com_google_android_gms_internal_zzajk;
        this.f5026j = str;
    }

    private final int m4400a(int i) {
        aak.m4022a();
        return hz.m5623b(this.f5018b, i);
    }

    private final JSONObject m4401a(Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", m4400a(rect.right - rect.left));
        jSONObject.put("height", m4400a(rect.bottom - rect.top));
        jSONObject.put("x", m4400a(rect.left));
        jSONObject.put("y", m4400a(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private final JSONObject m4402a(Map<String, WeakReference<View>> map, View view) {
        JSONObject jSONObject = new JSONObject();
        if (map == null || view == null) {
            return jSONObject;
        }
        int[] b = m4406b(view);
        for (Entry entry : map.entrySet()) {
            View view2 = (View) ((WeakReference) entry.getValue()).get();
            if (view2 != null) {
                int[] b2 = m4406b(view2);
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    Object a;
                    jSONObject3.put("width", m4400a(view2.getMeasuredWidth()));
                    jSONObject3.put("height", m4400a(view2.getMeasuredHeight()));
                    jSONObject3.put("x", m4400a(b2[0] - b[0]));
                    jSONObject3.put("y", m4400a(b2[1] - b[1]));
                    jSONObject3.put("relative_to", "ad_view");
                    jSONObject2.put("frame", jSONObject3);
                    Rect rect = new Rect();
                    if (view2.getLocalVisibleRect(rect)) {
                        a = m4401a(rect);
                    } else {
                        a = new JSONObject();
                        a.put("width", 0);
                        a.put("height", 0);
                        a.put("x", m4400a(b2[0] - b[0]));
                        a.put("y", m4400a(b2[1] - b[1]));
                        a.put("relative_to", "ad_view");
                    }
                    jSONObject2.put("visible_bounds", a);
                    if (view2 instanceof TextView) {
                        TextView textView = (TextView) view2;
                        jSONObject2.put("text_color", textView.getCurrentTextColor());
                        jSONObject2.put("font_size", (double) textView.getTextSize());
                        jSONObject2.put("text", textView.getText());
                    }
                    jSONObject.put((String) entry.getKey(), jSONObject2);
                } catch (JSONException e) {
                    id.m5370a("Unable to get asset views information");
                }
            }
        }
        return jSONObject;
    }

    private final void m4403a(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, String str, JSONObject jSONObject4, JSONObject jSONObject5) {
        boolean z = true;
        C1516t.m3867b("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f5022f);
            if (jSONObject2 != null) {
                jSONObject6.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject6.put("ad_view_signal", jSONObject);
            }
            if (jSONObject4 != null) {
                jSONObject6.put("click_signal", jSONObject4);
            }
            if (jSONObject3 != null) {
                jSONObject6.put("scroll_view_signal", jSONObject3);
            }
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("asset_id", str);
            jSONObject7.put("template", this.f5019c.mo1767k());
            jSONObject7.put("has_custom_click_handler", this.f5017a.zzr(this.f5019c.mo1768l()) != null);
            String str2 = "has_custom_click_handler";
            if (this.f5017a.zzr(this.f5019c.mo1768l()) == null) {
                z = false;
            }
            jSONObject6.put(str2, z);
            try {
                JSONObject optJSONObject = this.f5022f.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                jSONObject7.put("click_signals", this.f5024h.f6707e.zza(this.f5018b, optJSONObject.optString("click_string"), view));
            } catch (Exception e) {
                id.m5372a(6);
            }
            jSONObject6.put("click", jSONObject7);
            if (jSONObject5 != null) {
                jSONObject6.put("provided_signals", jSONObject5);
            }
            jSONObject6.put("ads_id", this.f5026j);
            this.f5023g.m5040a(new aff(jSONObject6));
        } catch (JSONException e2) {
            id.m5372a(6);
        }
    }

    private final boolean m4404a(String str) {
        JSONObject optJSONObject = this.f5022f.optJSONObject("allow_pub_event_reporting");
        return optJSONObject == null ? false : optJSONObject.optBoolean(str, false);
    }

    private final boolean m4405a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        C1516t.m3867b("recordImpression must be called on the main UI thread.");
        this.f5020d = true;
        try {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("ad", this.f5022f);
            jSONObject5.put("ads_id", this.f5026j);
            if (jSONObject2 != null) {
                jSONObject5.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject5.put("ad_view_signal", jSONObject);
            }
            if (jSONObject3 != null) {
                jSONObject5.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject5.put("provided_signals", jSONObject4);
            }
            this.f5023g.m5040a(new afg(jSONObject5));
            this.f5023g.m5040a(new afh(this.f5017a, this.f5026j));
            this.f5017a.zza((afa) this);
            this.f5017a.zzbv();
            return true;
        } catch (JSONException e) {
            id.m5372a(6);
            return false;
        }
    }

    private static int[] m4406b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    private final JSONObject m4407c(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                Object a;
                int[] b = m4406b(view);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", m4400a(view.getMeasuredWidth()));
                jSONObject2.put("height", m4400a(view.getMeasuredHeight()));
                jSONObject2.put("x", m4400a(b[0]));
                jSONObject2.put("y", m4400a(b[1]));
                jSONObject2.put("relative_to", "window");
                jSONObject.put("frame", jSONObject2);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    a = m4401a(rect);
                } else {
                    a = new JSONObject();
                    a.put("width", 0);
                    a.put("height", 0);
                    a.put("x", m4400a(b[0]));
                    a.put("y", m4400a(b[1]));
                    a.put("relative_to", "window");
                }
                jSONObject.put("visible_bounds", a);
            } catch (Exception e) {
                id.m5370a("Unable to get native ad view bounding box");
            }
        }
        return jSONObject;
    }

    private static JSONObject m4408d(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                zzbv.zzea();
                jSONObject.put("contained_in_scroll_view", gb.m5476c(view) != -1);
            } catch (Exception e) {
            }
        }
        return jSONObject;
    }

    public View mo1799a(OnClickListener onClickListener, boolean z) {
        aeo m = this.f5019c.mo1769m();
        if (m == null) {
            return null;
        }
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        if (!z) {
            switch (m.f4972g) {
                case 0:
                    layoutParams.addRule(10);
                    layoutParams.addRule(9);
                    break;
                case 2:
                    layoutParams.addRule(12);
                    layoutParams.addRule(11);
                    break;
                case 3:
                    layoutParams.addRule(12);
                    layoutParams.addRule(9);
                    break;
                default:
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                    break;
            }
        }
        View com_google_android_gms_internal_aep = new aep(this.f5018b, m, layoutParams);
        com_google_android_gms_internal_aep.setOnClickListener(onClickListener);
        com_google_android_gms_internal_aep.setContentDescription((CharSequence) zzbv.zzen().m4217a(ado.bR));
        return com_google_android_gms_internal_aep;
    }

    public final void mo1800a(MotionEvent motionEvent) {
        this.f5024h.m6062a(motionEvent);
    }

    public final void mo1801a(View view) {
        this.f5028l = new WeakReference(view);
    }

    public final void mo1802a(View view, aey com_google_android_gms_internal_aey) {
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        View o = this.f5019c.mo1771o();
        if (o != null) {
            ViewParent parent = o.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(o);
            }
            ((FrameLayout) view).addView(o, layoutParams);
            this.f5017a.zza(com_google_android_gms_internal_aey);
        } else if (this.f5019c instanceof afd) {
            afd com_google_android_gms_internal_afd = (afd) this.f5019c;
            if (com_google_android_gms_internal_afd.mo1756b() != null && com_google_android_gms_internal_afd.mo1756b().size() > 0) {
                Object obj = com_google_android_gms_internal_afd.mo1756b().get(0);
                afy a = obj instanceof IBinder ? afz.m4268a((IBinder) obj) : null;
                if (a != null) {
                    try {
                        C1398a a2 = a.mo1750a();
                        if (a2 != null) {
                            Drawable drawable = (Drawable) C1401c.m3585a(a2);
                            o = new ImageView(this.f5018b);
                            o.setImageDrawable(drawable);
                            o.setScaleType(ScaleType.CENTER_INSIDE);
                            ((FrameLayout) view).addView(o, layoutParams);
                        }
                    } catch (RemoteException e) {
                        id.m5370a("Could not get drawable from image");
                    }
                }
            }
        }
    }

    public final void mo1803a(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2) {
        JSONObject jSONObject;
        JSONObject a = m4402a((Map) map, view2);
        JSONObject c = m4407c(view2);
        JSONObject d = m4408d(view2);
        try {
            JSONObject a2 = zzbv.zzea().m5503a(bundle);
            jSONObject = new JSONObject();
            try {
                jSONObject.put("click_point", a2);
                jSONObject.put("asset_id", str);
            } catch (Exception e) {
                id.m5372a(6);
                m4403a(view, c, a, d, str, jSONObject, null);
            }
        } catch (Exception e2) {
            jSONObject = null;
            id.m5372a(6);
            m4403a(view, c, a, d, str, jSONObject, null);
        }
        m4403a(view, c, a, d, str, jSONObject, null);
    }

    public void mo1804a(View view, Map<String, WeakReference<View>> map) {
        m4405a(m4407c(view), m4402a((Map) map, view), m4408d(view), null);
    }

    public void mo1805a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        C1516t.m3867b("performClick must be called on the main UI thread.");
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    mo1803a(view, (String) entry.getKey(), bundle, map, view2);
                    return;
                }
            }
        }
        if ("2".equals(this.f5019c.mo1767k())) {
            mo1803a(view, "2099", bundle, map, view2);
        } else if ("1".equals(this.f5019c.mo1767k())) {
            mo1803a(view, "1099", bundle, map, view2);
        }
    }

    public void mo1816a(View view, Map<String, WeakReference<View>> map, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        if (((Boolean) zzbv.zzen().m4217a(ado.bP)).booleanValue()) {
            view.setOnTouchListener(onTouchListener);
            view.setClickable(true);
            view.setOnClickListener(onClickListener);
            if (map != null) {
                for (Entry value : map.entrySet()) {
                    View view2 = (View) ((WeakReference) value.getValue()).get();
                    if (view2 != null) {
                        view2.setOnTouchListener(onTouchListener);
                        view2.setClickable(true);
                        view2.setOnClickListener(onClickListener);
                    }
                }
            }
        }
    }

    public boolean mo1806a() {
        aeo m = this.f5019c.mo1769m();
        return m != null && m.f4973h;
    }

    public final boolean mo1807a(Bundle bundle) {
        if (m4404a("impression_reporting")) {
            return m4405a(null, null, null, zzbv.zzea().m5503a(bundle));
        }
        id.m5372a(6);
        return false;
    }

    public final void mo1808b(Bundle bundle) {
        if (bundle == null) {
            id.m5372a(3);
        } else if (m4404a("click_reporting")) {
            m4403a(null, null, null, null, bundle.getBundle("click_signal").getString("asset_id"), null, zzbv.zzea().m5503a(bundle));
        } else {
            id.m5372a(6);
        }
    }

    public void mo1809b(View view, Map<String, WeakReference<View>> map) {
        if (!((Boolean) zzbv.zzen().m4217a(ado.bO)).booleanValue()) {
            view.setOnTouchListener(null);
            view.setClickable(false);
            view.setOnClickListener(null);
            if (map != null) {
                for (Entry value : map.entrySet()) {
                    View view2 = (View) ((WeakReference) value.getValue()).get();
                    if (view2 != null) {
                        view2.setOnTouchListener(null);
                        view2.setClickable(false);
                        view2.setOnClickListener(null);
                    }
                }
            }
        }
    }

    public final void mo1810c(Bundle bundle) {
        if (bundle == null) {
            id.m5372a(3);
        } else if (m4404a("touch_reporting")) {
            this.f5024h.f6707e.zza((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
        } else {
            id.m5372a(6);
        }
    }

    public final void mo1811c(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.f5021e) {
            if (this.f5020d) {
            } else if (!view.isShown()) {
            } else if (view.getGlobalVisibleRect(new Rect(), null)) {
                mo1804a(view, (Map) map);
            }
        }
    }

    public jf mo1817d() {
        if (this.f5022f == null || this.f5022f.optJSONObject("overlay") == null) {
            return null;
        }
        zzbv.zzeb();
        jf a = jp.m5744a(this.f5018b, zzjb.m7106a(), false, false, this.f5024h, this.f5025i, null, null, null, new zk());
        if (a == null) {
            throw null;
        }
        ((View) a).setVisibility(8);
        this.f5023g.m5040a(new afo(new afi(a)));
        return a;
    }

    public void mo1812e() {
        this.f5023g.m5042c();
    }

    public final View mo1813f() {
        return this.f5028l != null ? (View) this.f5028l.get() : null;
    }

    public final void mo1814g() {
        this.f5017a.zzcn();
    }

    public final Context mo1815h() {
        return this.f5018b;
    }

    public final dt m4428i() {
        if (!zzbv.zzez().m5301c(this.f5018b)) {
            return null;
        }
        if (this.f5027k == null) {
            this.f5027k = new dt(this.f5018b, this.f5017a.getAdUnitId());
        }
        return this.f5027k;
    }
}
