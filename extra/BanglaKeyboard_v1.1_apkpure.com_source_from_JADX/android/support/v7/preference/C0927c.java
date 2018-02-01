package android.support.v7.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.content.C0392a;

public final class C0927c {
    C0921a f2857a;
    boolean f2858b;
    PreferenceScreen f2859c;
    C0926d f2860d;
    C0914c f2861e;
    C0912a f2862f;
    C0913b f2863g;
    private Context f2864h;
    private long f2865i = 0;
    private SharedPreferences f2866j;
    private Editor f2867k;
    private String f2868l;
    private int f2869m;
    private int f2870n = 0;

    public interface C0912a {
        void mo882b(Preference preference);
    }

    public interface C0913b {
        void mo880a();
    }

    public interface C0914c {
        boolean mo881a(Preference preference);
    }

    public static abstract class C0926d {
        public abstract boolean m2710a();

        public abstract boolean m2711b();
    }

    public C0927c(Context context) {
        this.f2864h = context;
        this.f2868l = context.getPackageName() + "_preferences";
        this.f2866j = null;
    }

    public final SharedPreferences m2712a() {
        if (this.f2857a != null) {
            return null;
        }
        if (this.f2866j == null) {
            Context createDeviceProtectedStorageContext;
            switch (this.f2870n) {
                case 1:
                    createDeviceProtectedStorageContext = C0392a.createDeviceProtectedStorageContext(this.f2864h);
                    break;
                default:
                    createDeviceProtectedStorageContext = this.f2864h;
                    break;
            }
            this.f2866j = createDeviceProtectedStorageContext.getSharedPreferences(this.f2868l, this.f2869m);
        }
        return this.f2866j;
    }

    public final Preference m2713a(CharSequence charSequence) {
        return this.f2859c == null ? null : this.f2859c.m2659a(charSequence);
    }

    final Editor m2714b() {
        if (this.f2857a != null) {
            return null;
        }
        if (!this.f2858b) {
            return m2712a().edit();
        }
        if (this.f2867k == null) {
            this.f2867k = m2712a().edit();
        }
        return this.f2867k;
    }
}
