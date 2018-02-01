package com.google.android.gms.internal;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@aqv
public final class ie implements ic {
    private final String f6249a;

    public ie() {
        this(null);
    }

    public ie(String str) {
        this.f6249a = str;
    }

    public final void mo2094a(String str) {
        String str2;
        HttpURLConnection httpURLConnection;
        try {
            str2 = "Pinging URL: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            id.m5372a(3);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            aak.m4022a();
            hz.m5621a(httpURLConnection, this.f6249a);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < Callback.DEFAULT_DRAG_ANIMATION_DURATION || responseCode >= 300) {
                id.m5370a(new StringBuilder(String.valueOf(str).length() + 65).append("Received non-success response code ").append(responseCode).append(" from pinging URL: ").append(str).toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            str2 = e.getMessage();
            id.m5370a(new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(str2).length()).append("Error while parsing ping URL: ").append(str).append(". ").append(str2).toString());
        } catch (IOException e2) {
            str2 = e2.getMessage();
            id.m5370a(new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(str2).length()).append("Error while pinging URL: ").append(str).append(". ").append(str2).toString());
        } catch (RuntimeException e3) {
            str2 = e3.getMessage();
            id.m5370a(new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(str2).length()).append("Error while pinging URL: ").append(str).append(". ").append(str2).toString());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }
}
