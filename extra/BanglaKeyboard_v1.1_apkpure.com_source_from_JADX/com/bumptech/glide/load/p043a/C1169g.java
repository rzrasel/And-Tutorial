package com.bumptech.glide.load.p043a;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;

public abstract class C1169g<T> implements C1165c<T> {
    private final Uri f3464a;
    private final Context f3465b;
    private T f3466c;

    public C1169g(Context context, Uri uri) {
        this.f3465b = context.getApplicationContext();
        this.f3464a = uri;
    }

    public final T mo1324a(int i) {
        this.f3466c = mo1330a(this.f3464a, this.f3465b.getContentResolver());
        return this.f3466c;
    }

    protected abstract T mo1330a(Uri uri, ContentResolver contentResolver);

    public final void mo1325a() {
        if (this.f3466c != null) {
            try {
                mo1331a(this.f3466c);
            } catch (IOException e) {
                Log.isLoggable("LocalUriFetcher", 2);
            }
        }
    }

    protected abstract void mo1331a(T t);

    public final String mo1326b() {
        return this.f3464a.toString();
    }

    public final void mo1327c() {
    }
}
