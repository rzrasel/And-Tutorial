package android.support.multidex;

import android.app.Application;
import android.content.Context;

public class MultiDexApplication extends Application {
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C0266a.m707a((Context) this);
    }
}
