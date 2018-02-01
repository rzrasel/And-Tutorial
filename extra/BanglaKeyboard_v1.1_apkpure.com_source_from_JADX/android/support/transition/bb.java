package android.support.transition;

import android.view.View;

public abstract class bb extends af {
    private static final String[] f1249a = new String[]{"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    static int m878a(ah ahVar, int i) {
        if (ahVar == null) {
            return -1;
        }
        int[] iArr = (int[]) ahVar.f1273a.get("android:visibilityPropagation:center");
        return iArr == null ? -1 : iArr[i];
    }

    public static int m879b(ah ahVar) {
        if (ahVar == null) {
            return 8;
        }
        Integer num = (Integer) ahVar.f1273a.get("android:visibilityPropagation:visibility");
        return num == null ? 8 : num.intValue();
    }

    public final void mo232a(ah ahVar) {
        View view = ahVar.f1274b;
        Object obj = (Integer) ahVar.f1273a.get("android:visibility:visibility");
        if (obj == null) {
            obj = Integer.valueOf(view.getVisibility());
        }
        ahVar.f1273a.put("android:visibilityPropagation:visibility", obj);
        obj = new int[2];
        view.getLocationOnScreen(obj);
        obj[0] = obj[0] + Math.round(view.getTranslationX());
        obj[0] = obj[0] + (view.getWidth() / 2);
        obj[1] = obj[1] + Math.round(view.getTranslationY());
        obj[1] = (view.getHeight() / 2) + obj[1];
        ahVar.f1273a.put("android:visibilityPropagation:center", obj);
    }

    public final String[] mo233a() {
        return f1249a;
    }
}
