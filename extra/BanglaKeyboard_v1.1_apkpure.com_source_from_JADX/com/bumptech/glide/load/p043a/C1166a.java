package com.bumptech.glide.load.p043a;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

public abstract class C1166a<T> implements C1165c<T> {
    private final String f3459a;
    private final AssetManager f3460b;
    private T f3461c;

    public C1166a(AssetManager assetManager, String str) {
        this.f3460b = assetManager;
        this.f3459a = str;
    }

    public final T mo1324a(int i) {
        this.f3461c = mo1328a(this.f3460b, this.f3459a);
        return this.f3461c;
    }

    protected abstract T mo1328a(AssetManager assetManager, String str);

    public final void mo1325a() {
        if (this.f3461c != null) {
            try {
                mo1329a(this.f3461c);
            } catch (IOException e) {
                Log.isLoggable("AssetUriFetcher", 2);
            }
        }
    }

    protected abstract void mo1329a(T t);

    public final String mo1326b() {
        return this.f3459a;
    }

    public final void mo1327c() {
    }
}
