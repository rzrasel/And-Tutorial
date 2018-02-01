package com.google.android.gms.internal;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class fy extends fj {
    private final String f1431a;
    private final Context f1432b;
    private final String f1433c;

    public fy(Context context, String str, String str2) {
        this.f1432b = context;
        this.f1431a = str;
        this.f1433c = str2;
    }

    public final void mo874a() {
        HttpURLConnection httpURLConnection;
        try {
            "Pinging URL: " + this.f1433c;
            gb.m2071a(2);
            httpURLConnection = (HttpURLConnection) new URL(this.f1433c).openConnection();
            fo.m1995a(this.f1432b, this.f1431a, true, httpURLConnection);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                gb.m2069a("Received non-success response code " + responseCode + " from pinging URL: " + this.f1433c);
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            gb.m2069a("Error while parsing ping URL: " + this.f1433c + ". " + e.getMessage());
        } catch (IOException e2) {
            gb.m2069a("Error while pinging URL: " + this.f1433c + ". " + e2.getMessage());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }

    public final void b_() {
    }
}
