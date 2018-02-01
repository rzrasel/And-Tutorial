package com.google.android.gms.internal;

import android.content.Context;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzbv;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@aqv
public final class adr {
    BlockingQueue<aec> f4921a;
    public LinkedHashMap<String, String> f4922b = new LinkedHashMap();
    String f4923c;
    Context f4924d;
    String f4925e;
    AtomicBoolean f4926f;
    File f4927g;
    private ExecutorService f4928h;
    private Map<String, adw> f4929i = new HashMap();

    public adr(Context context, String str, String str2, Map<String, String> map) {
        this.f4924d = context;
        this.f4925e = str;
        this.f4923c = str2;
        this.f4926f = new AtomicBoolean(false);
        this.f4926f.set(((Boolean) zzbv.zzen().m4217a(ado.f4870I)).booleanValue());
        if (this.f4926f.get()) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                this.f4927g = new File(externalStorageDirectory, "sdk_csi_data.txt");
            }
        }
        for (Entry entry : map.entrySet()) {
            this.f4922b.put((String) entry.getKey(), (String) entry.getValue());
        }
        this.f4921a = new ArrayBlockingQueue(30);
        this.f4928h = Executors.newSingleThreadExecutor();
        this.f4928h.execute(new ads(this));
        this.f4929i.put("action", adw.f4937b);
        this.f4929i.put("ad_format", adw.f4937b);
        this.f4929i.put("e", adw.f4938c);
    }

    public final adw m4222a(String str) {
        adw com_google_android_gms_internal_adw = (adw) this.f4929i.get(str);
        return com_google_android_gms_internal_adw != null ? com_google_android_gms_internal_adw : adw.f4936a;
    }

    final Map<String, String> m4223a(Map<String, String> map, Map<String, String> map2) {
        Map<String, String> linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, m4222a(str).mo1736a(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    public final boolean m4224a(aec com_google_android_gms_internal_aec) {
        return this.f4921a.offer(com_google_android_gms_internal_aec);
    }
}
