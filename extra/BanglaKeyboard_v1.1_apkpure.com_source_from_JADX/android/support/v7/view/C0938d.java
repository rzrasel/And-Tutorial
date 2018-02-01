package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.support.v7.p021a.C0780a.C0778i;
import android.view.LayoutInflater;

public final class C0938d extends ContextWrapper {
    public int f2879a;
    private Theme f2880b;
    private LayoutInflater f2881c;
    private Configuration f2882d;
    private Resources f2883e;

    public C0938d() {
        super(null);
    }

    public C0938d(Context context, int i) {
        super(context);
        this.f2879a = i;
    }

    public C0938d(Context context, Theme theme) {
        super(context);
        this.f2880b = theme;
    }

    private void m2724a() {
        if (this.f2880b == null) {
            this.f2880b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2880b.setTo(theme);
            }
        }
        this.f2880b.applyStyle(this.f2879a, true);
    }

    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources getResources() {
        if (this.f2883e == null) {
            if (this.f2882d == null) {
                this.f2883e = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                this.f2883e = createConfigurationContext(this.f2882d).getResources();
            }
        }
        return this.f2883e;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2881c == null) {
            this.f2881c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2881c;
    }

    public final Theme getTheme() {
        if (this.f2880b != null) {
            return this.f2880b;
        }
        if (this.f2879a == 0) {
            this.f2879a = C0778i.Theme_AppCompat_Light;
        }
        m2724a();
        return this.f2880b;
    }

    public final void setTheme(int i) {
        if (this.f2879a != i) {
            this.f2879a = i;
            m2724a();
        }
    }
}
