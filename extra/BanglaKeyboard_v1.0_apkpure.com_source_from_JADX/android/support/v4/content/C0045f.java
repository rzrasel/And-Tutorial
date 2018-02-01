package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;

class C0045f implements C0044e {
    C0045f() {
    }

    public Intent mo144a(ComponentName componentName) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(componentName);
        intent.addCategory("android.intent.category.LAUNCHER");
        return intent;
    }
}
