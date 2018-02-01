package android.support.v4.media.session;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.C0506b;
import android.view.KeyEvent;
import java.util.List;

public class MediaButtonReceiver extends BroadcastReceiver {

    private static class C0556a extends C0506b {
        MediaBrowserCompat f1713c;
        private final Context f1714d;
        private final Intent f1715e;
        private final PendingResult f1716f;

        C0556a(Context context, Intent intent, PendingResult pendingResult) {
            this.f1714d = context;
            this.f1715e = intent;
            this.f1716f = pendingResult;
        }

        private void m1384d() {
            this.f1713c.f1619b.mo497d();
            this.f1716f.finish();
        }

        public final void mo507a() {
            try {
                MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(this.f1714d, this.f1713c.f1619b.mo498e());
                KeyEvent keyEvent = (KeyEvent) this.f1715e.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent == null) {
                    throw new IllegalArgumentException("KeyEvent may not be null");
                }
                mediaControllerCompat.f1734a.mo522a(keyEvent);
                m1384d();
            } catch (RemoteException e) {
            }
        }

        public final void mo508b() {
            m1384d();
        }

        public final void mo509c() {
            m1384d();
        }
    }

    private static ComponentName m1388a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
            return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            ComponentName a = m1388a(context, "android.intent.action.MEDIA_BUTTON");
            if (a != null) {
                intent.setComponent(a);
                if (VERSION.SDK_INT >= 26) {
                    context.startForegroundService(intent);
                    return;
                } else {
                    context.startService(intent);
                    return;
                }
            }
            a = m1388a(context, "android.media.browse.MediaBrowserService");
            if (a != null) {
                PendingResult goAsync = goAsync();
                Context applicationContext = context.getApplicationContext();
                C0506b c0556a = new C0556a(applicationContext, intent, goAsync);
                MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, a, c0556a);
                c0556a.f1713c = mediaBrowserCompat;
                mediaBrowserCompat.f1619b.mo496c();
                return;
            }
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        new StringBuilder("Ignore unsupported intent: ").append(intent);
    }
}
