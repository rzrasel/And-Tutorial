package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public final class eq extends eo {
    private static final Object f1285a = new Object();
    private static eq f1286b;
    private final Context f1287c;
    private final be f1288d;
    private final al f1289e;

    private eq(Context context, al alVar, be beVar) {
        this.f1287c = context;
        this.f1288d = beVar;
        this.f1289e = alVar;
    }

    public static cz m1943a(Context context, String str, String str2) {
        HttpURLConnection httpURLConnection;
        try {
            int responseCode;
            cz czVar;
            ex exVar = new ex();
            URL url = new URL(str2);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            URL url2 = url;
            int i = 0;
            while (true) {
                httpURLConnection = (HttpURLConnection) url2.openConnection();
                fo.m1995a(context, str, false, httpURLConnection);
                responseCode = httpURLConnection.getResponseCode();
                Map headerFields = httpURLConnection.getHeaderFields();
                if (responseCode < 200 || responseCode >= 300) {
                    m1945a(url2.toString(), headerFields, null, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        break;
                    }
                    Object headerField = httpURLConnection.getHeaderField("Location");
                    if (TextUtils.isEmpty(headerField)) {
                        gb.m2069a("No location header to follow redirect.");
                        czVar = new cz(0);
                        httpURLConnection.disconnect();
                        return czVar;
                    }
                    url2 = new URL(headerField);
                    responseCode = i + 1;
                    if (responseCode > 5) {
                        gb.m2069a("Too many redirects.");
                        czVar = new cz(0);
                        httpURLConnection.disconnect();
                        return czVar;
                    }
                    exVar.m1959a(headerFields);
                    httpURLConnection.disconnect();
                    i = responseCode;
                } else {
                    String url3 = url2.toString();
                    String a = fo.m1987a(new InputStreamReader(httpURLConnection.getInputStream()));
                    m1945a(url3, headerFields, a, responseCode);
                    exVar.f1307b = url3;
                    exVar.f1308c = a;
                    exVar.m1959a(headerFields);
                    czVar = new cz(exVar.f1307b, exVar.f1308c, exVar.f1309d, exVar.f1312g, exVar.f1313h, exVar.f1314i, exVar.f1315j, exVar.f1316k, exVar.f1317l, exVar.f1306a, elapsedRealtime, exVar.f1310e, exVar.f1311f);
                    httpURLConnection.disconnect();
                    return czVar;
                }
            }
            gb.m2069a("Received error HTTP response code: " + responseCode);
            czVar = new cz(0);
            httpURLConnection.disconnect();
            return czVar;
        } catch (IOException e) {
            gb.m2069a("Error while connecting to ad server: " + e.getMessage());
            return new cz(2);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }

    public static eq m1944a(Context context, al alVar, be beVar) {
        eq eqVar;
        synchronized (f1285a) {
            if (f1286b == null) {
                f1286b = new eq(context.getApplicationContext(), alVar, beVar);
            }
            eqVar = f1286b;
        }
        return eqVar;
    }

    private static void m1945a(String str, Map map, String str2, int i) {
        if (gb.m2071a(2)) {
            "Http Response: {\n  URL:\n    " + str + "\n  Headers:";
            gb.m2071a(2);
            if (map != null) {
                for (String str3 : map.keySet()) {
                    "    " + str3 + ":";
                    gb.m2071a(2);
                    for (String str32 : (List) map.get(str32)) {
                        "      " + str32;
                        gb.m2071a(2);
                    }
                }
            }
            gb.m2071a(2);
            if (str2 != null) {
                for (int i2 = 0; i2 < Math.min(str2.length(), 100000); i2 += 1000) {
                    str2.substring(i2, Math.min(str2.length(), i2 + 1000));
                    gb.m2071a(2);
                }
            } else {
                gb.m2071a(2);
            }
            "  Response Code:\n    " + i + "\n}";
            gb.m2071a(2);
        }
    }

    public final cz mo888a(cx cxVar) {
        Context context = this.f1287c;
        al alVar = this.f1289e;
        be beVar = this.f1288d;
        gb.m2071a(3);
        ey eyVar = new ey(context);
        if (eyVar.f1330l == -1) {
            gb.m2071a(3);
            return new cz(2);
        }
        eu euVar = new eu(cxVar.f1162f.packageName);
        if (cxVar.f1159c.f916c != null) {
            String string = cxVar.f1159c.f916c.getString("_ad");
            if (string != null) {
                return et.m1948a(context, cxVar, string);
            }
        }
        String str = alVar.f942a;
        String a = et.m1951a(cxVar, eyVar, alVar.f943b);
        if (a == null) {
            return new cz(0);
        }
        fz.f1434a.post(new er(context, cxVar, euVar, new es(a), str));
        a = euVar.m1953b();
        return TextUtils.isEmpty(a) ? new cz(euVar.m1952a()) : m1943a(context, cxVar.f1167k.f1222b, a);
    }
}
