package com.bumptech.glide.load.p043a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.p049c.C1284d;
import com.bumptech.glide.p042h.C1156b;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

public final class C1173f implements C1165c<InputStream> {
    private static final C1171b f3467a = new C1172a();
    private final C1284d f3468b;
    private final C1171b f3469c;
    private HttpURLConnection f3470d;
    private InputStream f3471e;
    private volatile boolean f3472f;

    interface C1171b {
        HttpURLConnection mo1332a(URL url);
    }

    private static class C1172a implements C1171b {
        private C1172a() {
        }

        public final HttpURLConnection mo1332a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    public C1173f(C1284d c1284d) {
        this(c1284d, f3467a);
    }

    private C1173f(C1284d c1284d, C1171b c1171b) {
        this.f3468b = c1284d;
        this.f3469c = c1171b;
    }

    private InputStream m3190a(URL url, int i, URL url2, Map<String, String> map) {
        URL url3 = url;
        while (i < 5) {
            if (url2 != null) {
                try {
                    if (url3.toURI().equals(url2.toURI())) {
                        throw new IOException("In re-direct loop");
                    }
                } catch (URISyntaxException e) {
                }
            }
            this.f3470d = this.f3469c.mo1332a(url3);
            for (Entry entry : map.entrySet()) {
                this.f3470d.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            this.f3470d.setConnectTimeout(2500);
            this.f3470d.setReadTimeout(2500);
            this.f3470d.setUseCaches(false);
            this.f3470d.setDoInput(true);
            this.f3470d.connect();
            if (this.f3472f) {
                return null;
            }
            int responseCode = this.f3470d.getResponseCode();
            if (responseCode / 100 == 2) {
                HttpURLConnection httpURLConnection = this.f3470d;
                if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                    this.f3471e = C1156b.m3135a(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
                } else {
                    if (Log.isLoggable("HttpUrlFetcher", 3)) {
                        new StringBuilder("Got non empty content encoding: ").append(httpURLConnection.getContentEncoding());
                    }
                    this.f3471e = httpURLConnection.getInputStream();
                }
                return this.f3471e;
            } else if (responseCode / 100 == 3) {
                Object headerField = this.f3470d.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new IOException("Received empty or null redirect url");
                }
                i++;
                url2 = url3;
                url3 = new URL(url3, headerField);
            } else if (responseCode == -1) {
                throw new IOException("Unable to retrieve response code from HttpUrlConnection.");
            } else {
                throw new IOException("Request failed " + responseCode + ": " + this.f3470d.getResponseMessage());
            }
        }
        throw new IOException("Too many (> 5) redirects!");
    }

    public final /* synthetic */ Object mo1324a(int i) {
        C1284d c1284d = this.f3468b;
        if (c1284d.f3658e == null) {
            if (TextUtils.isEmpty(c1284d.f3657d)) {
                String str = c1284d.f3656c;
                if (TextUtils.isEmpty(str)) {
                    str = c1284d.f3654a.toString();
                }
                c1284d.f3657d = Uri.encode(str, "@#&=*+-_.,:!?()/~'%");
            }
            c1284d.f3658e = new URL(c1284d.f3657d);
        }
        return m3190a(c1284d.f3658e, 0, null, this.f3468b.f3655b.mo1375a());
    }

    public final void mo1325a() {
        if (this.f3471e != null) {
            try {
                this.f3471e.close();
            } catch (IOException e) {
            }
        }
        if (this.f3470d != null) {
            this.f3470d.disconnect();
        }
    }

    public final String mo1326b() {
        return this.f3468b.m3376a();
    }

    public final void mo1327c() {
        this.f3472f = true;
    }
}
