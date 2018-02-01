package com.orange.studio.banglatype;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.databinding.C0043k;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.Settings.System;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.C0189a;
import android.support.v4.app.FragmentActivity;
import android.support.v4.p006a.p007a.C0366a;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.C0819a;
import android.support.v7.app.C0823c;
import android.support.v7.app.C0823c.C0822a;
import android.support.v7.p012d.C0872b;
import android.support.v7.p012d.C0872b.C0871c;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C1088c;
import com.bumptech.glide.C1089a;
import com.bumptech.glide.C1095b;
import com.bumptech.glide.C1113e;
import com.bumptech.glide.C1148g;
import com.bumptech.glide.load.C1145c;
import com.bumptech.glide.load.C1176a;
import com.bumptech.glide.load.p044b.C1217b;
import com.bumptech.glide.load.p049c.C1298o;
import com.bumptech.glide.load.p049c.p051b.C1276f;
import com.bumptech.glide.load.resource.bitmap.C1320f;
import com.bumptech.glide.load.resource.bitmap.C1335p;
import com.bumptech.glide.load.resource.p040a.C1136b;
import com.bumptech.glide.load.resource.p052b.C1309c;
import com.bumptech.glide.p036f.p037b.C1131b;
import com.bumptech.glide.p036f.p039a.C1119c;
import com.bumptech.glide.p041g.C1144a;
import com.bumptech.glide.p041g.C1146b;
import com.orange.studio.banglatype.ag.C17032;
import java.io.InputStream;

public abstract class AndromoActivity extends AppCompatActivity implements C0189a, am, bf {
    protected boolean f7839a = false;
    protected Toolbar f7840b;
    protected CollapsingToolbarLayout f7841c;
    protected C0872b f7842d;
    protected boolean f7843e;
    protected boolean f7844f;
    private boolean f7845g;
    private int f7846h = -1;
    private boolean f7847i;
    private int f7848j = -536870913;
    private int f7849k = -536870913;
    private int f7850l = -536870913;
    private int f7851m = 0;
    private int f7852n = 0;
    private boolean f7853o = true;
    private boolean f7854p = true;
    private boolean f7855q = true;
    private DrawerLayout f7856r;
    private C0819a f7857s;
    private C1669z f7858t;
    private C1088c<String, InputStream, C0872b, C0872b> f7859u;
    private bh f7860v;
    private boolean f7861w;

    class C16672 implements OnClickListener {
        final /* synthetic */ AndromoActivity f7866a;

        C16672(AndromoActivity andromoActivity) {
            this.f7866a = andromoActivity;
        }

        public final void onClick(View view) {
            if (!this.f7866a.f7857s.f2493d && !C1735p.m7522a(this.f7866a)) {
                this.f7866a.onBackPressed();
            }
        }
    }

    public static class C1672a {
        public final String f7882a;
        public final C1145c f7883b;
        public int f7884c;
        public int f7885d;
        public int f7886e;
        public int f7887f;

        public C1672a(String str, C1145c c1145c, int i) {
            this.f7882a = str;
            if (c1145c == null) {
                c1145c = C1146b.m3124a();
            }
            this.f7883b = c1145c;
            this.f7886e = i;
        }

        public final String toString() {
            return getClass().getName() + "[ url: '" + this.f7882a + "', signature: '" + this.f7883b + "]";
        }
    }

    public static class C1673b {
        private boolean f7888a;
        private boolean f7889b;

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean m7146a(android.support.v7.app.AppCompatActivity r4, java.lang.String r5) {
            /*
            r3 = this;
            r0 = 0;
            r1 = 1;
            r2 = r3.f7889b;
            if (r2 != 0) goto L_0x001c;
        L_0x0006:
            r2 = "none";
            r2 = r2.equals(r5);
            if (r2 == 0) goto L_0x0017;
        L_0x000e:
            r2 = com.orange.studio.banglatype.C1735p.m7514a(r4);
            if (r2 == 0) goto L_0x001f;
        L_0x0014:
            r2 = r1;
        L_0x0015:
            if (r2 == 0) goto L_0x0018;
        L_0x0017:
            r0 = r1;
        L_0x0018:
            r3.f7888a = r0;
            r3.f7889b = r1;
        L_0x001c:
            r0 = r3.f7888a;
            return r0;
        L_0x001f:
            r2 = r0;
            goto L_0x0015;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.orange.studio.banglatype.AndromoActivity.b.a(android.support.v7.app.AppCompatActivity, java.lang.String):boolean");
        }
    }

    private void applyToolbarColors() {
        if (this.f7840b != null) {
            if (this.f7841c != null) {
                this.f7841c.setCollapsedTitleTextColor(this.f7850l);
                this.f7841c.setExpandedTitleColor(this.f7850l);
                if (bt.m7419a((Context) this, (int) R.attr.collapsing_toolbar_content_scrim) != 0) {
                    this.f7841c.setContentScrimColor(this.f7848j);
                }
            }
            if (bt.m7419a((Context) this, (int) R.attr.toolbar_background) != 0 || isDetailActivity() || this.f7843e) {
                this.f7840b.setBackgroundColor(this.f7848j);
            }
            this.f7840b.setTitleTextColor(this.f7850l);
            if (VERSION.SDK_INT >= 21) {
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(aa.m7226b(this.f7848j));
            }
            bv.m7436a(this.f7840b, this.f7849k);
            Toolbar toolbar = this.f7840b;
            int i = this.f7849k;
            Drawable navigationIcon = toolbar.getNavigationIcon();
            if (navigationIcon != null) {
                navigationIcon = C0366a.m1054g(navigationIcon);
                C0366a.m1041a(navigationIcon.mutate(), i);
                toolbar.setNavigationIcon(navigationIcon);
            }
            toolbar = this.f7840b;
            i = this.f7849k;
            navigationIcon = toolbar.getOverflowIcon();
            if (navigationIcon != null) {
                navigationIcon = C0366a.m1054g(navigationIcon);
                C0366a.m1041a(navigationIcon.mutate(), i);
                toolbar.setOverflowIcon(navigationIcon);
            }
            if (this.f7857s != null) {
                this.f7857s.f2491b.m2525a(this.f7849k);
            }
        }
    }

    private C1089a<String> getActivityImageRequestBuilder(Context context) {
        int widthForFeatureImage = getWidthForFeatureImage();
        int heightForFeatureImage = getHeightForFeatureImage(context, widthForFeatureImage);
        C1089a a = C1113e.m3029b(context).m3159a(String.class).m2903a(C1217b.ALL);
        return this.f7839a ? a.m2924e() : a.m2922d().mo1261a().m2920c().m2902a(widthForFeatureImage, heightForFeatureImage);
    }

    private C1089a<String> getBackgroundImageRequestBuilder(Context context) {
        C1089a b = C1113e.m3029b(context).m3159a(String.class).m2903a(C1217b.ALL).m2913b();
        return this.f7839a ? b.m2924e() : b.mo1261a();
    }

    private static float getDarkness(C0872b c0872b, int i) {
        return i == 2 ? 1.0f : i == 3 ? 0.0f : bi.m7388b(c0872b);
    }

    private int getHeightForFeatureImage(Context context, int i) {
        return (int) (((float) i) / bt.m7418a(context));
    }

    private void getPaletteForActivityImage(String str, C1145c c1145c) {
        if (this.f7860v != null) {
            C1113e.m3027a(this.f7860v);
        }
        this.f7860v = (bh) getPaletteRequestBuilder().mo1271b(c1145c).mo1273b((Object) str).m2887a(new bh(this));
    }

    private void getPaletteForBackgroundImage(String str, C1145c c1145c) {
        getPaletteForActivityImage(str, c1145c);
    }

    private C1088c<String, InputStream, C0872b, C0872b> getPaletteRequestBuilder() {
        if (this.f7859u != null) {
            return this.f7859u.mo1277f();
        }
        this.f7859u = C1113e.m3023a((FragmentActivity) this).m3160a(new C1276f((Context) this), InputStream.class).m3128a(String.class).m3127a(C0872b.class).mo1270b(C1217b.ALL).mo1266a(new bb(new bd())).mo1264a(new C1298o()).mo1265a(new C1309c(new ba(new bc(), new C1335p(C1320f.f3709b, C1113e.m3022a((Context) this).f3325b, C1176a.f3477d)))).mo1269b(256, 256).mo1280h().mo1279g();
        return this.f7859u;
    }

    private C1145c getSignatureForImageLoadFromResource() {
        return C1144a.m3121a(this);
    }

    private C1145c getSignatureForImageLoadFromUrl() {
        return C1146b.m3124a();
    }

    private static String getSwatchRules(int i) {
        return i == 0 ? "neutral, vibrant, dark vibrant, dark, muted, dark muted, light, light muted, light vibrant, if(0.7-1.0:dark dominant), if(0.0-0.2:light dominant), dominant" : i == 4 ? "if(0.7-1.0:dark dominant),if(0.0-0.1:light dominant),dominant" : "if(0.7-1.0,dark:dark, dark vibrant, neutral, dark dominant, dark muted),if(0.0-0.1,light:neutral, light, light muted, light vibrant, light dominant),neutral, vibrant, dark vibrant, dark, muted, dominant";
    }

    private int getWidthForFeatureImage() {
        int i;
        if (this.f7843e) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.heightPixels;
        } else {
            i = Resources.getSystem().getDisplayMetrics().widthPixels;
        }
        return i > 1440 ? 1440 : i;
    }

    private void handleImageFallback(ImageView imageView, C1672a c1672a) {
        if (imageView != null) {
            if (c1672a == null) {
                imageView.setImageDrawable(null);
            } else if (c1672a.f7886e != 0) {
                r0 = new C1672a(bt.m7432e(imageView.getContext(), c1672a.f7886e), getSignatureForImageLoadFromResource(), 0);
                r0.f7884c = c1672a.f7884c;
                r0.f7887f = c1672a.f7887f;
                r0.f7885d = c1672a.f7885d;
                loadActivityImage(imageView, r0);
            } else if (c1672a.f7884c != 0) {
                imageView.setImageDrawable(new ColorDrawable(c1672a.f7884c));
            } else {
                if (c1672a.f7887f != 0) {
                    int i = (c1672a.f7882a == null || c1672a.f7882a.isEmpty()) ? 0 : 1;
                    if (i != 0) {
                        r0 = new C1672a(bt.m7432e(imageView.getContext(), c1672a.f7887f), getSignatureForImageLoadFromResource(), 0);
                        r0.f7885d = c1672a.f7885d;
                        loadActivityImage(imageView, r0);
                        return;
                    }
                }
                imageView.setImageDrawable(null);
            }
        }
    }

    private void inflateToolbar() {
        if (isToolbarEnabled()) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.app_bar);
            if (viewStub != null) {
                viewStub.setInflatedId(-1);
                viewStub.inflate();
            }
            this.f7840b = (Toolbar) findViewById(R.id.toolbar);
            this.f7841c = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
            return;
        }
        this.f7840b = null;
    }

    public static boolean isAutomaticBackgroundColorEnabled(Context context) {
        return bt.m7425b(context, (int) R.attr.toolbar_background_color_mode) != 0;
    }

    private boolean isDrawerFirstTime() {
        if (this.f7853o && this.f7854p) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            if (defaultSharedPreferences != null) {
                boolean z = defaultSharedPreferences.getBoolean("drawer_first_time", true);
                if (!z) {
                    return z;
                }
                Editor edit = defaultSharedPreferences.edit();
                edit.putBoolean("drawer_first_time", false);
                edit.commit();
                return z;
            }
        }
        return false;
    }

    private boolean isFeatureImageEnabled() {
        String f = bt.m7433f(this, R.attr.activity_image_url);
        return ((f == null || "".equals(f)) && bt.m7431d(this, R.attr.activity_image_drawable) == 0) ? false : true;
    }

    private boolean isLauncher() {
        Intent intent = getIntent();
        return intent != null && (intent.hasCategory("android.intent.category.LAUNCHER") || "android.intent.action.MAIN".equals(intent.getAction()));
    }

    private void loadActivityImage(final ImageView imageView, final C1672a c1672a) {
        if (c1672a != null) {
            Object obj = c1672a.f7882a;
            C1145c c1145c = c1672a.f7883b;
            if (obj != null) {
                Context context = imageView.getContext();
                if (isAutomaticBackgroundColorEnabled(context)) {
                    getPaletteForActivityImage(c1672a.f7882a, c1672a.f7883b);
                } else {
                    onToolbarColorsFromTheme();
                }
                getActivityImageRequestBuilder(context).m2904a(c1145c).m2905a(obj).m2887a(new C1131b(this, imageView) {
                    final /* synthetic */ AndromoActivity f7869d;

                    public final void mo2350a(C1136b c1136b, C1119c<? super C1136b> c1119c) {
                        super.mo2350a(c1136b, (C1119c) c1119c);
                        this.f7869d.onActivityImageReady(c1136b);
                    }

                    public final void mo1283a(Exception exception, Drawable drawable) {
                        super.mo1283a(exception, drawable);
                        this.f7869d.onActivityImageLoadFailed(imageView, c1672a);
                    }
                });
            }
        }
    }

    private void loadActivityImageFromResource(ImageView imageView, int i) {
        loadActivityImage(imageView, new C1672a(resourceIdToUrlString(this, i), getSignatureForImageLoadFromResource(), 0));
    }

    private void loadActivityImageFromUrl(ImageView imageView, String str, int i) {
        loadActivityImage(imageView, new C1672a(str, getSignatureForImageLoadFromUrl(), i));
    }

    private void loadBackgroundImage(ImageView imageView, C1672a c1672a) {
        if (c1672a != null) {
            Object obj = c1672a.f7882a;
            C1145c c1145c = c1672a.f7883b;
            if (obj != null) {
                Context context = imageView.getContext();
                if (!isFeatureImageEnabled()) {
                    if (isAutomaticBackgroundColorEnabled(context)) {
                        getPaletteForBackgroundImage(c1672a.f7882a, c1672a.f7883b);
                    } else {
                        onToolbarColorsFromTheme();
                    }
                }
                final C1089a b = this.f7844f ? ((C1095b) C1113e.m3029b(context.getApplicationContext()).m3159a(String.class).m2905a(obj)).m2903a(C1217b.ALL).m2904a(c1145c).m2901a(C1148g.f3420d).m2913b() : null;
                Point c = bt.m7429c(context);
                final int i = c.x / 2;
                final int i2 = c.y / 2;
                final int i3 = i;
                final ImageView imageView2 = imageView;
                final C1672a c1672a2 = c1672a;
                this.f7858t = new C1669z(this, imageView, getBackgroundEffect()) {
                    final /* synthetic */ AndromoActivity f7879h;

                    public final void mo2351a(C1136b c1136b, C1119c<? super C1136b> c1119c) {
                        super.mo2351a(c1136b, (C1119c) c1119c);
                        this.f7879h.onBackgroundImageReady(c1136b);
                        if (b != null && c1136b.getIntrinsicWidth() == i) {
                            b.m2893c(i2, i3);
                        }
                    }

                    public final void mo1283a(Exception exception, Drawable drawable) {
                        super.mo1283a(exception, drawable);
                        this.f7879h.f7858t.m7132a(null);
                        this.f7879h.f7858t = null;
                        this.f7879h.onBackgroundImageLoadFailed(imageView2, c1672a2);
                    }

                    public final void mo1286b(Drawable drawable) {
                        super.mo1286b(drawable);
                        this.f7879h.f7858t.m7132a(null);
                        this.f7879h.f7858t = null;
                    }
                };
                getBackgroundImageRequestBuilder(context).m2904a(c1145c).m2902a(i, i2).m2905a(obj).m2901a(C1148g.f3418b).m2887a(this.f7858t);
            }
        }
    }

    private void loadBackgroundImageFromResource(ImageView imageView, int i) {
        loadBackgroundImage(imageView, new C1672a(resourceIdToUrlString(this, i), getSignatureForImageLoadFromResource(), 0));
    }

    private void loadBackgroundImageFromUrl(ImageView imageView, String str, int i) {
        loadBackgroundImage(imageView, new C1672a(str, getSignatureForImageLoadFromUrl(), i));
    }

    private void onActivityImageLoadFailed(ImageView imageView, C1672a c1672a) {
        handleImageFallback(imageView, c1672a);
        bv.m7436a(this.f7840b, this.f7849k);
    }

    private void onActivityImageReady(C1136b c1136b) {
        if (this.f7839a) {
            supportStartPostponedEnterTransition();
        }
    }

    private void onBackgroundImageLoadFailed(ImageView imageView, C1672a c1672a) {
        handleImageFallback(imageView, c1672a);
    }

    private void onBackgroundImageReady(C1136b c1136b) {
    }

    private static String resourceIdToUrlString(Context context, int i) {
        Resources resources = context.getResources();
        String str = null;
        try {
            str = "android.resource://" + resources.getResourcePackageName(i) + '/' + resources.getResourceTypeName(i) + '/' + resources.getResourceEntryName(i);
        } catch (NotFoundException e) {
            Log.isLoggable("AndromoActivity", 5);
        }
        return str;
    }

    private void setDrawerItemChecked(int i) {
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        if (navigationView != null) {
            navigationView.setCheckedItem(i);
        }
    }

    private void setupActivityImage() {
        ImageView imageView = (ImageView) findViewById(R.id.feature_image);
        if (this.f7839a) {
            supportPostponeEnterTransition();
        }
        String f = bt.m7433f(this, R.attr.activity_image_url);
        int d = bt.m7431d(this, R.attr.activity_image_drawable);
        if (imageView == null) {
            C1672a c1672a = null;
            if (f != null && !"".equals(f)) {
                c1672a = new C1672a(f, getSignatureForImageLoadFromUrl(), d);
            } else if (d != 0) {
                c1672a = new C1672a(resourceIdToUrlString(this, d), getSignatureForImageLoadFromResource(), 0);
            }
            if (c1672a == null) {
                onToolbarColorsFromTheme();
            } else if (c1672a.f7882a == null) {
                onToolbarColorsFromTheme();
            } else if (isAutomaticBackgroundColorEnabled(this)) {
                getPaletteForActivityImage(c1672a.f7882a, c1672a.f7883b);
            } else {
                onToolbarColorsFromTheme();
            }
            if (this.f7839a) {
                startPostponedEnterTransitionOnDecorView();
            }
        } else if (f != null && !"".equals(f)) {
            loadActivityImageFromUrl(imageView, f, d);
        } else if (d != 0) {
            loadActivityImageFromResource(imageView, d);
        } else {
            onToolbarColorsFromTheme();
            if (this.f7839a) {
                startPostponedEnterTransitionOnDecorView();
            }
        }
    }

    private void setupBackgroundImage() {
        String f = bt.m7433f(this, R.attr.activity_background_image_url);
        int d = bt.m7431d(this, R.attr.activity_background_image_drawable);
        Object obj = ((f == null || f.isEmpty()) && d == 0) ? null : 1;
        if (obj != null) {
            ImageView imageView = (ImageView) findViewById(R.id.background_image);
            if (imageView == null) {
                return;
            }
            if (f != null && !"".equals(f)) {
                loadBackgroundImageFromUrl(imageView, f, d);
            } else if (d != 0) {
                loadBackgroundImageFromResource(imageView, d);
            }
        }
    }

    private void setupNavigationDrawer() {
        boolean z = true;
        this.f7856r = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (this.f7856r != null) {
            int i;
            MenuItem add;
            int itemId;
            Drawable drawable;
            NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
            navigationView.setNavigationItemSelectedListener(this);
            String[] stringArray = getResources().getStringArray(R.array.activity_000_titles);
            String[] stringArray2 = getResources().getStringArray(R.array.activity_000_classes);
            TypedArray obtainTypedArray = getResources().obtainTypedArray(R.array.activity_000_icons_24dp);
            int i2 = 0;
            for (i = 0; i < stringArray.length; i++) {
                if (obtainTypedArray.getResourceId(i, 0) != 0) {
                    i2 = 1;
                }
            }
            Menu menu = navigationView.getMenu();
            if (this.f7855q) {
                add = menu.add(R.id.nav_drawer_main_items, 1, 0, getString(R.string.drawer_root_item_title));
                add.setCheckable(true);
                if (getClass().getSimpleName().equals("Dashboard_000")) {
                    itemId = add.getItemId();
                    this.f7846h = itemId;
                    setDrawerItemChecked(itemId);
                }
                drawable = getResources().getDrawable(R.drawable.ic_home_black_24dp);
                if (drawable != null) {
                    add.setIcon(drawable);
                }
            }
            for (i = 0; i < stringArray.length; i++) {
                itemId = i + 2;
                MenuItem add2 = menu.add(R.id.nav_drawer_main_items, itemId, 0, stringArray[i]);
                add2.setCheckable(true);
                if (getClass().getSimpleName().equals(stringArray2[i])) {
                    this.f7846h = itemId;
                    setDrawerItemChecked(itemId);
                }
                itemId = obtainTypedArray.getResourceId(i, 0);
                if (itemId != 0) {
                    drawable = getResources().getDrawable(itemId);
                    if (drawable != null) {
                        add2.setIcon(drawable);
                    }
                }
            }
            add = menu.findItem(R.id.nav_drawer_menu_settings);
            if (add != null) {
                add.setVisible(false);
            }
            String trim = getString(R.string.drawer_header_title).trim();
            String trim2 = getString(R.string.drawer_header_subtitle).trim();
            if (trim.isEmpty() && trim2.isEmpty()) {
                View childAt = navigationView.f760c.f524b.getChildAt(0);
                if (childAt != null) {
                    childAt = childAt.findViewById(R.id.backgroundScrim);
                    if (childAt != null) {
                        childAt.setVisibility(8);
                    }
                }
            }
            MenuItem findItem = menu.findItem(R.id.nav_drawer_menu_about);
            if (findItem != null) {
                findItem.setTitle(getString(R.string.about_dialog_title, new Object[]{getString(R.string.app_name)}));
                if (i2 != 0) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.ic_help_black_24dp);
                    if (drawable2 != null) {
                        findItem.setIcon(drawable2);
                    }
                }
            }
            if (this.f7853o) {
                this.f7856r.m2015a(0, 8388611);
                if (isDrawerFirstTime() && this.f7854p) {
                    this.f7856r.m2014a();
                    this.f7845g = false;
                }
            } else {
                this.f7856r.m2015a(1, 8388611);
            }
            this.f7857s = new C0819a(this, this, this.f7856r, this.f7840b) {
                final /* synthetic */ AndromoActivity f7865i;

                public final void onDrawerClosed(View view) {
                    super.onDrawerClosed(view);
                    this.f7865i.invalidateOptionsMenu();
                }

                public final void onDrawerOpened(View view) {
                    super.onDrawerOpened(view);
                    this.f7865i.invalidateOptionsMenu();
                }

                public final void onDrawerStateChanged(int i) {
                    super.onDrawerStateChanged(i);
                }
            };
            this.f7856r.setDrawerListener(this.f7857s);
            this.f7857s.f2497h = new C16672(this);
            C0819a c0819a = this.f7857s;
            if (!(isHamburgerEnabled() && this.f7853o)) {
                z = false;
            }
            if (z != c0819a.f2493d) {
                if (z) {
                    c0819a.m2383a(c0819a.f2491b, c0819a.f2490a.m2022c() ? c0819a.f2496g : c0819a.f2495f);
                } else {
                    c0819a.m2383a(c0819a.f2492c, 0);
                }
                c0819a.f2493d = z;
            }
            this.f7857s.f2491b.m2525a(bt.m7421a(this.f7840b));
        }
    }

    private void startPostponedEnterTransitionOnDecorView() {
        final View decorView = getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener(this) {
            final /* synthetic */ AndromoActivity f7881b;

            public final boolean onPreDraw() {
                decorView.getViewTreeObserver().removeOnPreDrawListener(this);
                this.f7881b.supportStartPostponedEnterTransition();
                return true;
            }
        });
    }

    private void updateBackgroundEffect(int i) {
        if (!C1744w.m7532a(bt.m7425b((Context) this, (int) R.attr.activity_background_image_effect)) || this.f7852n != 0 || this.f7851m == i) {
            return;
        }
        if (this.f7858t != null) {
            this.f7858t.m7132a(getBackgroundEffect());
            return;
        }
        ImageView imageView = (ImageView) findViewById(R.id.background_image);
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                ColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(getBackgroundEffect());
                drawable.mutate();
                drawable.setColorFilter(colorMatrixColorFilter);
                imageView.setImageDrawable(drawable);
                imageView.invalidateDrawable(drawable);
                imageView.invalidate();
            }
        }
    }

    protected abstract String getActivityTitleForAnalytics();

    protected abstract String getActivityTypeForAnalytics();

    protected ColorMatrix getBackgroundEffect() {
        int a;
        int b = bt.m7425b((Context) this, (int) R.attr.activity_background_image_effect);
        if (C1744w.m7532a(b)) {
            this.f7852n = bt.m7419a((Context) this, (int) R.attr.activity_background_image_tint_color);
            a = this.f7852n == 0 ? (!isAutomaticBackgroundColorEnabled(this) || usingToolbarColorsFromTheme()) ? bt.m7419a((Context) this, (int) R.attr.colorPrimary) : getToolbarBackgroundColor() : this.f7852n;
        } else {
            a = 0;
        }
        this.f7851m = a;
        int i = (b & 1) != 0 ? 1 : 0;
        int i2 = (b & 2) != 0 ? 1 : 0;
        int i3 = (b & 4) != 0 ? 1 : 0;
        b = (b & 8) != 0 ? 1 : 0;
        ColorMatrix colorMatrix = new ColorMatrix();
        if (i3 != 0) {
            colorMatrix.setSaturation(0.0f);
        }
        if (i != 0) {
            ColorMatrix colorMatrix2 = new ColorMatrix();
            colorMatrix2.setScale(0.6f, 0.6f, 0.6f, 1.0f);
            colorMatrix.postConcat(colorMatrix2);
        } else if (i2 != 0) {
            colorMatrix.postConcat(new ColorMatrix(new float[]{0.4f, 0.0f, 0.0f, 0.0f, 153.0f, 0.0f, 0.4f, 0.0f, 0.0f, 153.0f, 0.0f, 0.0f, 0.4f, 0.0f, 153.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        }
        if (!(b == 0 || a == 0)) {
            float red = (float) Color.red(a);
            float green = (float) Color.green(a);
            float blue = (float) Color.blue(a);
            Color.alpha(a);
            float f = 1.0f - (0.5f * (1.0f - ((((red / 255.0f) * 0.2126f) + ((green / 255.0f) * 0.7152f)) + (0.0722f * (blue / 255.0f)))));
            colorMatrix.postConcat(new ColorMatrix(new float[]{r0, 0.0f, 0.0f, 0.0f, red * f, 0.0f, r0, 0.0f, 0.0f, green * f, 0.0f, 0.0f, 1.0f - ((((red / 255.0f) * 0.2126f) + ((green / 255.0f) * 0.7152f)) + (0.0722f * (blue / 255.0f))), 0.0f, blue * f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        }
        return colorMatrix;
    }

    protected boolean getHandleCustomWindowColor() {
        return false;
    }

    public an getItemBindingUtils() {
        return null;
    }

    public View getItemDateViewFromBinding(C0043k c0043k) {
        return getItemBindingUtils() != null ? null : null;
    }

    public View getItemDescriptionViewFromBinding(C0043k c0043k) {
        return getItemBindingUtils() != null ? null : null;
    }

    public View getItemImageViewFromBinding(C0043k c0043k) {
        an itemBindingUtils = getItemBindingUtils();
        return itemBindingUtils != null ? itemBindingUtils.mo2396b(c0043k) : null;
    }

    public View getItemRootViewFromBinding(C0043k c0043k) {
        an itemBindingUtils = getItemBindingUtils();
        return itemBindingUtils != null ? itemBindingUtils.mo2395a(c0043k) : null;
    }

    public View getItemScrimViewFromBinding(C0043k c0043k) {
        getItemBindingUtils();
        return null;
    }

    public View getItemSubtitleViewFromBinding(C0043k c0043k) {
        an itemBindingUtils = getItemBindingUtils();
        return itemBindingUtils != null ? itemBindingUtils.mo2398d(c0043k) : null;
    }

    public View getItemTitleViewFromBinding(C0043k c0043k) {
        an itemBindingUtils = getItemBindingUtils();
        return itemBindingUtils != null ? itemBindingUtils.mo2397c(c0043k) : null;
    }

    public abstract String[] getParentClassNamesArray();

    int getThemeColor(int i) {
        return bt.m7419a((Context) this, i);
    }

    protected int getTitleMode() {
        return 2;
    }

    int getToolbarBackgroundColor() {
        return this.f7848j;
    }

    int getToolbarItemsColor() {
        return this.f7849k;
    }

    int getToolbarTextColor() {
        return this.f7850l;
    }

    int getToolbarThemeColor(int i) {
        return bt.m7422a(this.f7840b, i);
    }

    public View getViewFromBinding(C0043k c0043k, int i) {
        an itemBindingUtils = getItemBindingUtils();
        if (itemBindingUtils == null) {
            return null;
        }
        switch (i) {
            case R.id.itemImage:
                return itemBindingUtils.mo2396b(c0043k);
            case R.id.itemRoot:
                return itemBindingUtils.mo2395a(c0043k);
            case R.id.itemSubtitle:
                return itemBindingUtils.mo2398d(c0043k);
            case R.id.itemTitle:
                return itemBindingUtils.mo2397c(c0043k);
            default:
                return null;
        }
    }

    protected abstract boolean isDetailActivity();

    protected boolean isHamburgerEnabled() {
        return !isParentReachable();
    }

    protected abstract boolean isParentReachable();

    protected abstract boolean isToolbarEnabled();

    public void onBackPressed() {
        if (this.f7856r == null || !this.f7856r.m2022c()) {
            C1723f.m7465b();
            super.onBackPressed();
            return;
        }
        this.f7856r.m2020b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f7857s != null) {
            C0819a c0819a = this.f7857s;
            if (!c0819a.f2494e) {
                c0819a.f2492c = c0819a.m2385c();
            }
            c0819a.m2382a();
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            i = extras.getInt("ThemeResourceId", 0);
            if (i != 0) {
                setTheme(i);
            }
        }
        i = bt.m7428c(this, R.attr.toolbar_settings);
        if (i != 0) {
            getTheme().applyStyle(i, true);
        }
        this.f7843e = getResources().getBoolean(R.bool.is_landscape);
        this.f7844f = System.getInt(getContentResolver(), "accelerometer_rotation", 0) == 1;
        if (isDetailActivity() || this.f7843e) {
            i = bt.m7428c(this, R.attr.detail_theme_override);
            if (i != 0) {
                getTheme().applyStyle(i, true);
            }
        }
        super.onCreate(bundle);
        setContentView();
        setupToolbar();
        setupBackgroundImage();
        this.f7849k = bt.m7421a(this.f7840b);
        this.f7850l = bt.m7421a(this.f7840b);
        if (getHandleCustomWindowColor()) {
            if (bt.m7425b((Context) this, (int) R.attr.body_style) == 2) {
                i = bt.m7419a((Context) this, (int) R.attr.custom_window_color);
                if (i != 0) {
                    getWindow().getDecorView().setBackgroundColor(i);
                }
            }
        } else if (VERSION.SDK_INT <= 19 && bt.m7425b((Context) this, (int) R.attr.body_style) == 2) {
            i = bt.m7419a((Context) this, 16842801);
            if (i != 0) {
                getWindow().getDecorView().setBackgroundColor(i);
            }
        }
        if (bundle != null) {
            this.f7845g = bundle.getBoolean("CLOSE_NAV_DRAWER");
        }
        setupNavigationDrawer();
        if (this.f7856r == null && VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(bt.m7419a((Context) this, (int) R.attr.colorPrimaryDark));
        }
        if (isLauncher() && !PreferenceManager.getDefaultSharedPreferences(this).getBoolean("launch_notice_shown", false)) {
            C0822a c0822a = new C0822a(this);
            c0822a.f2505a.f2335f = c0822a.f2505a.f2330a.getText(R.string.launch_notice_title);
            c0822a = c0822a.m2396b(Html.fromHtml(getString(R.string.launch_notice_text)));
            c0822a.f2505a.f2344o = false;
            c0822a.f2505a.f2332c = R.drawable.ic_launcher_icon;
            c0822a.m2390a(new C17032(this));
            C0823c b = c0822a.m2397b();
            if (b != null) {
                TextView textView = (TextView) b.findViewById(16908299);
                if (textView != null) {
                    String string = getString(R.string.failed_to_open_url);
                    af.m7279a();
                    textView.setMovementMethod(af.m7280a(string));
                }
            }
        }
        C1723f.m7461a(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C1735p.m7520a(getMenuInflater(), menu, false);
        bv.m7436a(this.f7840b, this.f7849k);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onCreateOptionsMenu(MenuInflater menuInflater, Menu menu, boolean z) {
        C1735p.m7520a(menuInflater, menu, z);
        bv.m7436a(this.f7840b, this.f7849k);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        C1723f.m7474f(this);
        super.onDestroy();
        if (this.f7860v != null) {
            this.f7860v.f8202a = null;
        }
        if (this.f7858t != null) {
            this.f7858t.m7132a(null);
            this.f7858t = null;
        }
    }

    public boolean onNavigationItemSelected(MenuItem menuItem) {
        setDrawerItemChecked(menuItem.getItemId());
        switch (menuItem.getItemId()) {
            case 1:
                menuItem.getTitle().toString();
                C1735p.m7519a((Activity) this, "Dashboard_000");
                this.f7845g = true;
                break;
            case R.id.nav_drawer_menu_settings:
                this.f7845g = true;
                break;
            case R.id.nav_drawer_menu_about:
                C1735p.m7525b(this);
                this.f7845g = true;
                break;
            default:
                int itemId = menuItem.getItemId() - 2;
                String[] stringArray = getResources().getStringArray(R.array.activity_000_classes);
                if (itemId >= 0 && itemId < stringArray.length) {
                    String str = stringArray[itemId];
                    menuItem.getTitle().toString();
                    C1735p.m7519a((Activity) this, str);
                    this.f7845g = true;
                    break;
                }
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int a = this.f7856r.m2012a(8388611);
        if (this.f7857s != null && a == 0) {
            boolean z;
            C0819a c0819a = this.f7857s;
            if (menuItem != null && menuItem.getItemId() == 16908332 && c0819a.f2493d) {
                c0819a.m2384b();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        menuItem.getItemId();
        return C1709b.m7363a((AppCompatActivity) this, menuItem) || super.onOptionsItemSelected(menuItem);
    }

    public void onPaletteReady(C0872b c0872b) {
        if (c0872b != null) {
            this.f7842d = c0872b;
            if (this.f7860v != null) {
                C1113e.m3027a(this.f7860v);
                this.f7860v.f8202a = null;
                this.f7860v = null;
            }
            bi.m7385a(c0872b);
            int b = bt.m7425b((Context) this, (int) R.attr.toolbar_background_color_mode);
            if (b != 0) {
                C0871c a;
                int b2 = bt.m7425b((Context) this, (int) R.attr.toolbar_background_color_preference);
                float darkness = getDarkness(c0872b, b2);
                String swatchRules = getSwatchRules(b2);
                switch (b) {
                    case 1:
                        a = bi.m7384a(c0872b, swatchRules, darkness);
                        break;
                    case 2:
                        a = bi.m7383a(bi.m7384a(c0872b, swatchRules, darkness), false);
                        break;
                    case 3:
                        a = bi.m7383a(bi.m7384a(c0872b, swatchRules, darkness), true);
                        break;
                    default:
                        throw new RuntimeException("unexpected toolbarBackgroundColorMode: " + b);
                }
                setToolbarColorsFromSwatch(a);
                return;
            }
            onToolbarColorsFromTheme();
        }
    }

    public void onPaletteReady(C0872b c0872b, View view, int i) {
        onPaletteReady(c0872b);
    }

    protected void onPause() {
        C1723f.m7470d(this);
        super.onPause();
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (this.f7857s != null) {
            this.f7857s.m2382a();
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    protected void onResume() {
        super.onResume();
        setDrawerItemChecked(this.f7846h);
        if (this.f7845g && this.f7856r != null && this.f7856r.m2022c()) {
            this.f7856r.m2020b();
            this.f7845g = false;
        }
        getActivityTitleForAnalytics();
        getActivityTypeForAnalytics();
        C1723f.m7471e(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("CLOSE_NAV_DRAWER", this.f7845g);
        super.onSaveInstanceState(bundle);
    }

    protected void onStart() {
        super.onStart();
        C1723f.m7466b(this);
        getActivityTypeForAnalytics();
    }

    protected void onStop() {
        super.onStop();
        C1723f.m7468c(this);
    }

    protected final void onToolbarColorsFromTheme() {
        int a = bt.m7422a(this.f7840b, 16842806);
        int a2 = bt.m7419a((Context) this, (int) R.attr.colorPrimary);
        this.f7861w = true;
        onToolbarColorsReady(a2, a);
    }

    protected void onToolbarColorsReady(int i, int i2) {
    }

    protected void onToolbarSwatchReady(int i, int i2) {
        if (!C1744w.m7532a(bt.m7425b((Context) this, (int) R.attr.activity_background_image_effect))) {
            return;
        }
        if (this.f7858t != null) {
            this.f7858t.m7132a(getBackgroundEffect());
            return;
        }
        ImageView imageView = (ImageView) findViewById(R.id.background_image);
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                ColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(getBackgroundEffect());
                drawable.mutate();
                drawable.setColorFilter(colorMatrixColorFilter);
                imageView.setImageDrawable(drawable);
            }
        }
    }

    void setColorizeToolbarEnabled(boolean z) {
        this.f7847i = z;
    }

    protected abstract void setContentView();

    void setToolbarBackgroundColor(int i) {
        this.f7848j = i;
    }

    void setToolbarColorsFromSwatch(C0871c c0871c) {
        if (c0871c != null) {
            this.f7861w = false;
            aa.m7228c(this.f7848j);
            this.f7848j = c0871c.f2659a;
            aa.m7228c(this.f7848j);
            int b = c0871c.m2545b();
            this.f7850l = b;
            this.f7849k = b;
            applyToolbarColors();
            updateBackgroundEffect(this.f7848j);
            onToolbarSwatchReady(this.f7848j, this.f7850l);
            onToolbarColorsReady(this.f7848j, this.f7850l);
        }
    }

    void setToolbarItemsColor(int i) {
        this.f7849k = i;
    }

    void setToolbarTextColor(int i) {
        this.f7850l = i;
    }

    void setToolbarTitle(int i) {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            switch (getTitleMode()) {
                case 0:
                    supportActionBar.mo813b(false);
                    return;
                case 1:
                    supportActionBar.mo813b(true);
                    supportActionBar.mo803a((int) R.string.app_name);
                    return;
                default:
                    supportActionBar.mo813b(true);
                    supportActionBar.mo803a(i);
                    return;
            }
        }
    }

    void setToolbarTitle(CharSequence charSequence) {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            switch (getTitleMode()) {
                case 0:
                    supportActionBar.mo813b(false);
                    return;
                case 1:
                    supportActionBar.mo813b(true);
                    supportActionBar.mo803a((int) R.string.app_name);
                    return;
                default:
                    supportActionBar.mo813b(true);
                    supportActionBar.mo806a(charSequence);
                    return;
            }
        }
    }

    void setupToolbar() {
        inflateToolbar();
        if (this.f7840b != null) {
            setSupportActionBar(this.f7840b);
            setupActivityImage();
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo802a();
            supportActionBar.mo815c(true);
            supportActionBar.mo810b();
            supportActionBar.mo807a(true);
            supportActionBar.mo807a(false);
            supportActionBar.mo807a(isParentReachable());
        }
    }

    void tintMenuItem(int i, int i2) {
        Menu menu = this.f7840b.getMenu();
        if (menu != null) {
            av.m7349a(menu.findItem(i), i2);
        }
    }

    protected boolean usingToolbarColorsFromTheme() {
        return this.f7861w;
    }
}
