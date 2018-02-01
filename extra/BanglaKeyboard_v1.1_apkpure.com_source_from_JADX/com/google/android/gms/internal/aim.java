package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public final class aim implements ail {
    private final Context f5141a;
    private final zzajk f5142b;

    public aim(Context context, zzajk com_google_android_gms_internal_zzajk) {
        this.f5141a = context;
        this.f5142b = com_google_android_gms_internal_zzajk;
    }

    private static aiq m4565a(JSONObject jSONObject) {
        URL url;
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString("url");
        String optString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(optString2);
        } catch (MalformedURLException e) {
            id.m5372a(6);
            url = null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new aip(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new aiq(optString, url, arrayList, optString3);
    }

    private final air m4566a(aiq com_google_android_gms_internal_aiq) {
        Exception e;
        HttpURLConnection httpURLConnection;
        air com_google_android_gms_internal_air;
        Throwable th;
        HttpURLConnection httpURLConnection2 = null;
        try {
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) com_google_android_gms_internal_aiq.f5151b.openConnection();
            try {
                zzbv.zzea().m5505a(this.f5141a, this.f5142b.f7706a, false, httpURLConnection3);
                ArrayList arrayList = com_google_android_gms_internal_aiq.f5152c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    aip com_google_android_gms_internal_aip = (aip) obj;
                    httpURLConnection3.addRequestProperty(com_google_android_gms_internal_aip.f5148a, com_google_android_gms_internal_aip.f5149b);
                }
                if (!TextUtils.isEmpty(com_google_android_gms_internal_aiq.f5153d)) {
                    httpURLConnection3.setDoOutput(true);
                    byte[] bytes = com_google_android_gms_internal_aiq.f5153d.getBytes();
                    httpURLConnection3.setFixedLengthStreamingMode(bytes.length);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection3.getOutputStream());
                    bufferedOutputStream.write(bytes);
                    bufferedOutputStream.close();
                }
                List arrayList2 = new ArrayList();
                if (httpURLConnection3.getHeaderFields() != null) {
                    for (Entry entry : httpURLConnection3.getHeaderFields().entrySet()) {
                        for (String com_google_android_gms_internal_aip2 : (List) entry.getValue()) {
                            arrayList2.add(new aip((String) entry.getKey(), com_google_android_gms_internal_aip2));
                        }
                    }
                }
                String str = com_google_android_gms_internal_aiq.f5150a;
                i = httpURLConnection3.getResponseCode();
                zzbv.zzea();
                air com_google_android_gms_internal_air2 = new air(true, new ais(str, i, arrayList2, gb.m5440a(new InputStreamReader(httpURLConnection3.getInputStream()))), null);
                if (httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                }
                return com_google_android_gms_internal_air2;
            } catch (Exception e2) {
                e = e2;
                httpURLConnection = httpURLConnection3;
                try {
                    com_google_android_gms_internal_air = new air(false, null, e.toString());
                    if (httpURLConnection != null) {
                        return com_google_android_gms_internal_air;
                    }
                    httpURLConnection.disconnect();
                    return com_google_android_gms_internal_air;
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                httpURLConnection2 = httpURLConnection3;
                th = th4;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (Exception e3) {
            httpURLConnection = null;
            e = e3;
            com_google_android_gms_internal_air = new air(false, null, e.toString());
            if (httpURLConnection != null) {
                return com_google_android_gms_internal_air;
            }
            httpURLConnection.disconnect();
            return com_google_android_gms_internal_air;
        } catch (Throwable th5) {
            th = th5;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    private static JSONObject m4567a(ais com_google_android_gms_internal_ais) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", com_google_android_gms_internal_ais.f5157a);
            if (com_google_android_gms_internal_ais.f5160d != null) {
                jSONObject.put("body", com_google_android_gms_internal_ais.f5160d);
            }
            JSONArray jSONArray = new JSONArray();
            for (aip com_google_android_gms_internal_aip : com_google_android_gms_internal_ais.f5159c) {
                jSONArray.put(new JSONObject().put("key", com_google_android_gms_internal_aip.f5148a).put("value", com_google_android_gms_internal_aip.f5149b));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", com_google_android_gms_internal_ais.f5158b);
        } catch (JSONException e) {
            id.m5372a(6);
        }
        return jSONObject;
    }

    public final JSONObject m4568a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            Object obj = "";
            try {
                obj = jSONObject.optString("http_request_id");
                air a = m4566a(m4565a(jSONObject));
                if (a.f5155b) {
                    jSONObject2.put("response", m4567a(a.f5154a));
                    jSONObject2.put("success", true);
                    return jSONObject2;
                }
                jSONObject2.put("response", new JSONObject().put("http_request_id", obj));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", a.f5156c);
                return jSONObject2;
            } catch (Exception e) {
                try {
                    jSONObject2.put("response", new JSONObject().put("http_request_id", obj));
                    jSONObject2.put("success", false);
                    jSONObject2.put("reason", e.toString());
                    return jSONObject2;
                } catch (JSONException e2) {
                    return jSONObject2;
                }
            }
        } catch (JSONException e3) {
            id.m5372a(6);
            try {
                return new JSONObject().put("success", false);
            } catch (JSONException e4) {
                return new JSONObject();
            }
        }
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        fv.m5425a(new ain(this, map, jfVar));
    }
}
