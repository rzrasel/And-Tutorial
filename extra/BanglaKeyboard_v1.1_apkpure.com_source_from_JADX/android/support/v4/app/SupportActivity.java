package android.support.v4.app;

import android.app.Activity;
import android.support.v4.p018f.C0477m;

public class SupportActivity extends Activity {
    private C0477m<Class<? extends ExtraData>, ExtraData> mExtraDataMap = new C0477m();

    public static class ExtraData {
    }

    public <T extends ExtraData> T getExtraData(Class<T> cls) {
        return (ExtraData) this.mExtraDataMap.get(cls);
    }

    public void putExtraData(ExtraData extraData) {
        this.mExtraDataMap.put(extraData.getClass(), extraData);
    }
}
