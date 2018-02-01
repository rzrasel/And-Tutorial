package com.google.android.gms.ads.identifier;

import android.net.Uri;
import android.net.Uri.Builder;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public final class zze {
    public final void zzb(Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        String message;
        Throwable e;
        Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < Callback.DEFAULT_DRAG_ANIMATION_DURATION || responseCode >= 300) {
                Log.w("HttpUrlPinger", new StringBuilder(String.valueOf(uri).length() + 65).append("Received non-success response code ").append(responseCode).append(" from pinging URL: ").append(uri).toString());
            }
            httpURLConnection.disconnect();
        } catch (Throwable e2) {
            message = e2.getMessage();
            Log.w("HttpUrlPinger", new StringBuilder((String.valueOf(uri).length() + 32) + String.valueOf(message).length()).append("Error while parsing ping URL: ").append(uri).append(". ").append(message).toString(), e2);
        } catch (IOException e3) {
            e2 = e3;
            message = e2.getMessage();
            Log.w("HttpUrlPinger", new StringBuilder((String.valueOf(uri).length() + 27) + String.valueOf(message).length()).append("Error while pinging URL: ").append(uri).append(". ").append(message).toString(), e2);
        } catch (RuntimeException e4) {
            e2 = e4;
            message = e2.getMessage();
            Log.w("HttpUrlPinger", new StringBuilder((String.valueOf(uri).length() + 27) + String.valueOf(message).length()).append("Error while pinging URL: ").append(uri).append(". ").append(message).toString(), e2);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }
}
