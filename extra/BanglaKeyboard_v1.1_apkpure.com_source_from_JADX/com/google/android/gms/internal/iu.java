package com.google.android.gms.internal;

import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public final class iu implements kp {
    private HttpClient f6265a;

    public iu(HttpClient httpClient) {
        this.f6265a = httpClient;
    }

    private static void m5646a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, afv<?> com_google_android_gms_internal_afv_) {
        byte[] a = com_google_android_gms_internal_afv_.mo2120a();
        if (a != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(a));
        }
    }

    private static void m5647a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, (String) map.get(str));
        }
    }

    public final HttpResponse mo2125a(afv<?> com_google_android_gms_internal_afv_, Map<String, String> map) {
        HttpUriRequest httpGet;
        HttpEntityEnclosingRequestBase httpPost;
        switch (com_google_android_gms_internal_afv_.f5068a) {
            case -1:
                httpGet = new HttpGet(com_google_android_gms_internal_afv_.f5069b);
                break;
            case 0:
                httpGet = new HttpGet(com_google_android_gms_internal_afv_.f5069b);
                break;
            case 1:
                httpPost = new HttpPost(com_google_android_gms_internal_afv_.f5069b);
                httpPost.addHeader("Content-Type", afv.m4464c());
                m5646a(httpPost, (afv) com_google_android_gms_internal_afv_);
                break;
            case 2:
                httpPost = new HttpPut(com_google_android_gms_internal_afv_.f5069b);
                httpPost.addHeader("Content-Type", afv.m4464c());
                m5646a(httpPost, (afv) com_google_android_gms_internal_afv_);
                break;
            case 3:
                httpGet = new HttpDelete(com_google_android_gms_internal_afv_.f5069b);
                break;
            case 4:
                httpGet = new HttpHead(com_google_android_gms_internal_afv_.f5069b);
                break;
            case 5:
                httpGet = new HttpOptions(com_google_android_gms_internal_afv_.f5069b);
                break;
            case 6:
                httpGet = new HttpTrace(com_google_android_gms_internal_afv_.f5069b);
                break;
            case 7:
                httpPost = new jv(com_google_android_gms_internal_afv_.f5069b);
                httpPost.addHeader("Content-Type", afv.m4464c());
                m5646a(httpPost, (afv) com_google_android_gms_internal_afv_);
                break;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
        m5647a(httpGet, (Map) map);
        m5647a(httpGet, com_google_android_gms_internal_afv_.mo2121b());
        HttpParams params = httpGet.getParams();
        int d = com_google_android_gms_internal_afv_.m4471d();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, d);
        return this.f6265a.execute(httpGet);
    }
}
