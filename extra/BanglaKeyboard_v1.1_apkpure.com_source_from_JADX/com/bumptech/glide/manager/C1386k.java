package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.bumptech.glide.C1164h;
import com.bumptech.glide.p042h.C1163h;
import java.util.HashMap;
import java.util.Map;

public final class C1386k implements Callback {
    private static final C1386k f3859c = new C1386k();
    final Map<FragmentManager, C1385j> f3860a = new HashMap();
    final Map<android.support.v4.app.FragmentManager, SupportRequestManagerFragment> f3861b = new HashMap();
    private volatile C1164h f3862d;
    private final Handler f3863e = new Handler(Looper.getMainLooper(), this);

    C1386k() {
    }

    public static C1386k m3572a() {
        return f3859c;
    }

    @TargetApi(17)
    private static void m3573a(Activity activity) {
        if (VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private C1164h m3574b(Context context) {
        if (this.f3862d == null) {
            synchronized (this) {
                if (this.f3862d == null) {
                    this.f3862d = new C1164h(context.getApplicationContext(), new C1377b(), new C1382f());
                }
            }
        }
        return this.f3862d;
    }

    public final C1164h m3575a(Context context) {
        Context context2 = context;
        while (context2 != null) {
            if (C1163h.m3156b() && !(context2 instanceof Application)) {
                if (context2 instanceof FragmentActivity) {
                    return m3576a((FragmentActivity) context2);
                }
                if (context2 instanceof Activity) {
                    Activity activity = (Activity) context2;
                    if (C1163h.m3158c() || VERSION.SDK_INT < 11) {
                        context2 = activity.getApplicationContext();
                    } else {
                        C1386k.m3573a(activity);
                        C1385j a = m3578a(activity.getFragmentManager());
                        C1164h c1164h = a.f3856c;
                        if (c1164h != null) {
                            return c1164h;
                        }
                        c1164h = new C1164h(activity, a.f3854a, a.f3855b);
                        a.f3856c = c1164h;
                        return c1164h;
                    }
                } else if (context2 instanceof ContextWrapper) {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            return m3574b(context2);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final C1164h m3576a(FragmentActivity fragmentActivity) {
        if (C1163h.m3158c()) {
            return m3575a(fragmentActivity.getApplicationContext());
        }
        C1386k.m3573a((Activity) fragmentActivity);
        SupportRequestManagerFragment a = m3577a(fragmentActivity.getSupportFragmentManager());
        C1164h c1164h = a.f3839a;
        if (c1164h != null) {
            return c1164h;
        }
        c1164h = new C1164h(fragmentActivity, a.f3840b, a.f3841c);
        a.f3839a = c1164h;
        return c1164h;
    }

    final SupportRequestManagerFragment m3577a(android.support.v4.app.FragmentManager fragmentManager) {
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (supportRequestManagerFragment != null) {
            return supportRequestManagerFragment;
        }
        supportRequestManagerFragment = (SupportRequestManagerFragment) this.f3861b.get(fragmentManager);
        if (supportRequestManagerFragment != null) {
            return supportRequestManagerFragment;
        }
        Fragment supportRequestManagerFragment2 = new SupportRequestManagerFragment();
        this.f3861b.put(fragmentManager, supportRequestManagerFragment2);
        fragmentManager.beginTransaction().add(supportRequestManagerFragment2, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.f3863e.obtainMessage(2, fragmentManager).sendToTarget();
        return supportRequestManagerFragment2;
    }

    @TargetApi(17)
    final C1385j m3578a(FragmentManager fragmentManager) {
        C1385j c1385j = (C1385j) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (c1385j != null) {
            return c1385j;
        }
        c1385j = (C1385j) this.f3860a.get(fragmentManager);
        if (c1385j != null) {
            return c1385j;
        }
        android.app.Fragment c1385j2 = new C1385j();
        this.f3860a.put(fragmentManager, c1385j2);
        fragmentManager.beginTransaction().add(c1385j2, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.f3863e.obtainMessage(1, fragmentManager).sendToTarget();
        return c1385j2;
    }

    public final boolean handleMessage(Message message) {
        Object obj = null;
        boolean z = true;
        Object remove;
        switch (message.what) {
            case 1:
                FragmentManager fragmentManager = (FragmentManager) message.obj;
                remove = this.f3860a.remove(fragmentManager);
                break;
            case 2:
                android.support.v4.app.FragmentManager fragmentManager2 = (android.support.v4.app.FragmentManager) message.obj;
                remove = this.f3861b.remove(fragmentManager2);
                break;
            default:
                z = false;
                remove = null;
                break;
        }
        if (z && r1 == null && Log.isLoggable("RMRetriever", 5)) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        }
        return z;
    }
}
