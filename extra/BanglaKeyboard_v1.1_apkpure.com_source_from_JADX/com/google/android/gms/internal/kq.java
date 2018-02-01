package com.google.android.gms.internal;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public final class kq implements kp {
    private final kr f6407a;
    private final SSLSocketFactory f6408b;

    public kq() {
        this((byte) 0);
    }

    private kq(byte b) {
        this('\u0000');
    }

    private kq(char c) {
        this.f6407a = null;
        this.f6408b = null;
    }

    private static HttpEntity m5888a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        HttpEntity basicHttpEntity = new BasicHttpEntity();
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (IOException e) {
            inputStream = httpURLConnection.getErrorStream();
        }
        basicHttpEntity.setContent(inputStream);
        basicHttpEntity.setContentLength((long) httpURLConnection.getContentLength());
        basicHttpEntity.setContentEncoding(httpURLConnection.getContentEncoding());
        basicHttpEntity.setContentType(httpURLConnection.getContentType());
        return basicHttpEntity;
    }

    private static void m5889a(HttpURLConnection httpURLConnection, afv<?> com_google_android_gms_internal_afv_) {
        byte[] a = com_google_android_gms_internal_afv_.mo2120a();
        if (a != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", afv.m4464c());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(a);
            dataOutputStream.close();
        }
    }

    public final HttpResponse mo2125a(afv<?> com_google_android_gms_internal_afv_, Map<String, String> map) {
        String a;
        String str = com_google_android_gms_internal_afv_.f5069b;
        HashMap hashMap = new HashMap();
        hashMap.putAll(com_google_android_gms_internal_afv_.mo2121b());
        hashMap.putAll(map);
        if (this.f6407a != null) {
            a = this.f6407a.m5891a();
            if (a == null) {
                String str2 = "URL blocked by rewriter: ";
                a = String.valueOf(str);
                throw new IOException(a.length() != 0 ? str2.concat(a) : new String(str2));
            }
        }
        a = str;
        URL url = new URL(a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int d = com_google_android_gms_internal_afv_.m4471d();
        httpURLConnection.setConnectTimeout(d);
        httpURLConnection.setReadTimeout(d);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        for (String str3 : hashMap.keySet()) {
            httpURLConnection.addRequestProperty(str3, (String) hashMap.get(str3));
        }
        switch (com_google_android_gms_internal_afv_.f5068a) {
            case -1:
                break;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                break;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m5889a(httpURLConnection, (afv) com_google_android_gms_internal_afv_);
                break;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                m5889a(httpURLConnection, (afv) com_google_android_gms_internal_afv_);
                break;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                break;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                break;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                break;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                break;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                m5889a(httpURLConnection, (afv) com_google_android_gms_internal_afv_);
                break;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
        ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        if (httpURLConnection.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        StatusLine basicStatusLine = new BasicStatusLine(protocolVersion, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage());
        HttpResponse basicHttpResponse = new BasicHttpResponse(basicStatusLine);
        int i = com_google_android_gms_internal_afv_.f5068a;
        d = basicStatusLine.getStatusCode();
        boolean z = (i == 4 || ((100 <= d && d < Callback.DEFAULT_DRAG_ANIMATION_DURATION) || d == 204 || d == 304)) ? false : true;
        if (z) {
            basicHttpResponse.setEntity(m5888a(httpURLConnection));
        }
        for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                basicHttpResponse.addHeader(new BasicHeader((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return basicHttpResponse;
    }
}
