package android.support.v4.content;

import android.content.SharedPreferences.Editor;

public final class C0443d {

    public static final class C0442a {
        private static C0442a f1427a;
        private final C0441a f1428b = new C0441a();

        private static class C0441a {
            C0441a() {
            }
        }

        private C0442a() {
        }

        public static C0442a m1175a() {
            if (f1427a == null) {
                f1427a = new C0442a();
            }
            return f1427a;
        }

        public static void m1176a(Editor editor) {
            try {
                editor.apply();
            } catch (AbstractMethodError e) {
                editor.commit();
            }
        }
    }
}
