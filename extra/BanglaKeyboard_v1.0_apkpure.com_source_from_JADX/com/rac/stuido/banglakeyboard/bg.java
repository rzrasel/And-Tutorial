package com.rac.stuido.banglakeyboard;

import android.app.Activity;
import android.content.SharedPreferences.Editor;
import java.util.Random;

public abstract class bg {
    boolean f2567b = true;

    protected abstract boolean mo1356a();

    protected abstract boolean mo1357a(Activity activity);

    protected abstract void mo1358b();

    public final boolean m3862b(Activity activity) {
        "initializeInterstitial: " + activity;
        if (activity == null || !mo1356a()) {
            return false;
        }
        boolean z = System.currentTimeMillis() > activity.getSharedPreferences("com.rac.stuido.banglakeyboard.interstitial", 0).getLong("interstitialAdExpiration", -1);
        "hasEnoughTimePassed enoughTime: " + z;
        if (!z) {
            return false;
        }
        Editor edit = activity.getSharedPreferences("com.rac.stuido.banglakeyboard.interstitial", 0).edit();
        long currentTimeMillis = System.currentTimeMillis() + 600000;
        edit.putLong("interstitialAdExpiration", currentTimeMillis);
        edit.commit();
        "updateTimestamp expirationTime: " + currentTimeMillis;
        int nextInt = new Random().nextInt(3) + 2;
        "resetEventCount eventCount: " + nextInt;
        Editor edit2 = activity.getSharedPreferences("com.rac.stuido.banglakeyboard.interstitial", 0).edit();
        edit2.putInt("interstitialAdEventCount", nextInt);
        edit2.commit();
        mo1357a(activity);
        return true;
    }
}
