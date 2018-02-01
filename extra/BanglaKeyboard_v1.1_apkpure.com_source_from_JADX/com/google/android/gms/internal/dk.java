package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class dk implements Runnable {
    private /* synthetic */ il f5922a;
    private /* synthetic */ di f5923b;

    dk(di diVar, il ilVar) {
        this.f5923b = diVar;
        this.f5922a = ilVar;
    }

    public final void run() {
        try {
            Map map = (Map) this.f5922a.get();
            di diVar = this.f5923b;
            if (map != null) {
                for (String str : map.keySet()) {
                    String str2;
                    JSONArray optJSONArray = new JSONObject((String) map.get(str2)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (diVar.f5911c) {
                            int length = optJSONArray.length();
                            vn b = diVar.m5273b(str2);
                            if (b == null) {
                                String str3 = "Cannot find the corresponding resource object for ";
                                str2 = String.valueOf(str2);
                                if (str2.length() != 0) {
                                    str3.concat(str2);
                                } else {
                                    str2 = new String(str3);
                                }
                                dp.m5282a();
                            } else {
                                b.f7308e = new String[length];
                                for (int i = 0; i < length; i++) {
                                    b.f7308e[i] = optJSONArray.getJSONObject(i).getString("threat_type");
                                }
                                diVar.f5910b = (length > 0 ? 1 : 0) | diVar.f5910b;
                            }
                        }
                    }
                }
            }
            if (this.f5923b.f5910b) {
                synchronized (this.f5923b.f5911c) {
                    this.f5923b.f5909a.f7263a = Integer.valueOf(9);
                }
            }
            this.f5923b.m5277e();
            return;
        } catch (InterruptedException e) {
        } catch (ExecutionException e2) {
        } catch (JSONException e3) {
        }
        if (((Boolean) zzbv.zzen().m4217a(ado.ck)).booleanValue()) {
            id.m5372a(3);
        }
    }
}
