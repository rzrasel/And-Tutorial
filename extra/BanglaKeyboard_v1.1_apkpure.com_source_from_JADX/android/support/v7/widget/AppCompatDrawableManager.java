package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.p004b.p005a.C0062c;
import android.support.p004b.p005a.C0075i;
import android.support.v4.content.C0392a;
import android.support.v4.p006a.C0375a;
import android.support.v4.p006a.p007a.C0366a;
import android.support.v4.p018f.C0478a;
import android.support.v4.p018f.C0484f;
import android.support.v4.p018f.C0485g;
import android.support.v4.p018f.C0500n;
import android.support.v7.p021a.C0780a.C0770a;
import android.support.v7.p021a.C0780a.C0772c;
import android.support.v7.p021a.C0780a.C0774e;
import android.support.v7.p023c.p024a.C0862b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class AppCompatDrawableManager {
    private static final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = new int[]{C0774e.abc_popup_background_mtrl_mult, C0774e.abc_cab_background_internal_bg, C0774e.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = new int[]{C0774e.abc_textfield_activated_mtrl_alpha, C0774e.abc_textfield_search_activated_mtrl_alpha, C0774e.abc_cab_background_top_mtrl_alpha, C0774e.abc_text_cursor_material, C0774e.abc_text_select_handle_left_mtrl_dark, C0774e.abc_text_select_handle_middle_mtrl_dark, C0774e.abc_text_select_handle_right_mtrl_dark, C0774e.abc_text_select_handle_left_mtrl_light, C0774e.abc_text_select_handle_middle_mtrl_light, C0774e.abc_text_select_handle_right_mtrl_light};
    private static final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = new int[]{C0774e.abc_textfield_search_default_mtrl_alpha, C0774e.abc_textfield_default_mtrl_alpha, C0774e.abc_ab_share_pack_mtrl_alpha};
    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);
    private static final boolean DEBUG = false;
    private static final Mode DEFAULT_MODE = Mode.SRC_IN;
    private static AppCompatDrawableManager INSTANCE = null;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "AppCompatDrawableManager";
    private static final int[] TINT_CHECKABLE_BUTTON_LIST = new int[]{C0774e.abc_btn_check_material, C0774e.abc_btn_radio_material};
    private static final int[] TINT_COLOR_CONTROL_NORMAL = new int[]{C0774e.abc_ic_commit_search_api_mtrl_alpha, C0774e.abc_seekbar_tick_mark_material, C0774e.abc_ic_menu_share_mtrl_alpha, C0774e.abc_ic_menu_copy_mtrl_am_alpha, C0774e.abc_ic_menu_cut_mtrl_alpha, C0774e.abc_ic_menu_selectall_mtrl_alpha, C0774e.abc_ic_menu_paste_mtrl_am_alpha};
    private static final int[] TINT_COLOR_CONTROL_STATE_LIST = new int[]{C0774e.abc_tab_indicator_material, C0774e.abc_textfield_search_material};
    private C0478a<String, InflateDelegate> mDelegates;
    private final Object mDrawableCacheLock = new Object();
    private final WeakHashMap<Context, C0484f<WeakReference<ConstantState>>> mDrawableCaches = new WeakHashMap(0);
    private boolean mHasCheckedVectorDrawableSetup;
    private C0500n<String> mKnownDrawableIdTags;
    private WeakHashMap<Context, C0500n<ColorStateList>> mTintLists;
    private TypedValue mTypedValue;

    private interface InflateDelegate {
        Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    private static class AvdcInflateDelegate implements InflateDelegate {
        AvdcInflateDelegate() {
        }

        public Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0062c.m59a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                return null;
            }
        }
    }

    private static class ColorFilterLruCache extends C0485g<Integer, PorterDuffColorFilter> {
        public ColorFilterLruCache(int i) {
            super(i);
        }

        private static int generateCacheKey(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter get(int i, Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(generateCacheKey(i, mode)));
        }

        PorterDuffColorFilter put(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(generateCacheKey(i, mode)), porterDuffColorFilter);
        }
    }

    private static class VdcInflateDelegate implements InflateDelegate {
        VdcInflateDelegate() {
        }

        public Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0075i.m90a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                return null;
            }
        }
    }

    private void addDelegate(String str, InflateDelegate inflateDelegate) {
        if (this.mDelegates == null) {
            this.mDelegates = new C0478a();
        }
        this.mDelegates.put(str, inflateDelegate);
    }

    private boolean addDrawableToCache(Context context, long j, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return DEBUG;
        }
        synchronized (this.mDrawableCacheLock) {
            C0484f c0484f = (C0484f) this.mDrawableCaches.get(context);
            if (c0484f == null) {
                c0484f = new C0484f();
                this.mDrawableCaches.put(context, c0484f);
            }
            c0484f.m1280a(j, new WeakReference(constantState));
        }
        return true;
    }

    private void addTintListToCache(Context context, int i, ColorStateList colorStateList) {
        if (this.mTintLists == null) {
            this.mTintLists = new WeakHashMap();
        }
        C0500n c0500n = (C0500n) this.mTintLists.get(context);
        if (c0500n == null) {
            c0500n = new C0500n();
            this.mTintLists.put(context, c0500n);
        }
        c0500n.m1303b(i, colorStateList);
    }

    private static boolean arrayContains(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return DEBUG;
    }

    private void checkVectorDrawableSetup(Context context) {
        if (!this.mHasCheckedVectorDrawableSetup) {
            this.mHasCheckedVectorDrawableSetup = true;
            Drawable drawable = getDrawable(context, C0774e.abc_vector_test);
            if (drawable == null || !isVectorDrawable(drawable)) {
                this.mHasCheckedVectorDrawableSetup = DEBUG;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private ColorStateList createBorderlessButtonColorStateList(Context context) {
        return createButtonColorStateList(context, 0);
    }

    private ColorStateList createButtonColorStateList(Context context, int i) {
        r0 = new int[4][];
        r1 = new int[4];
        int themeAttrColor = ThemeUtils.getThemeAttrColor(context, C0770a.colorControlHighlight);
        int disabledThemeAttrColor = ThemeUtils.getDisabledThemeAttrColor(context, C0770a.colorButtonNormal);
        r0[0] = ThemeUtils.DISABLED_STATE_SET;
        r1[0] = disabledThemeAttrColor;
        r0[1] = ThemeUtils.PRESSED_STATE_SET;
        r1[1] = C0375a.m1072a(themeAttrColor, i);
        r0[2] = ThemeUtils.FOCUSED_STATE_SET;
        r1[2] = C0375a.m1072a(themeAttrColor, i);
        r0[3] = ThemeUtils.EMPTY_STATE_SET;
        r1[3] = i;
        return new ColorStateList(r0, r1);
    }

    private static long createCacheKey(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private ColorStateList createColoredButtonColorStateList(Context context) {
        return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, C0770a.colorAccent));
    }

    private ColorStateList createDefaultButtonColorStateList(Context context) {
        return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, C0770a.colorButtonNormal));
    }

    private Drawable createDrawableIfNeeded(Context context, int i) {
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        context.getResources().getValue(i, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable == null) {
            if (i == C0774e.abc_cab_background_top_material) {
                cachedDrawable = new LayerDrawable(new Drawable[]{getDrawable(context, C0774e.abc_cab_background_internal_bg), getDrawable(context, C0774e.abc_cab_background_top_mtrl_alpha)});
            }
            if (cachedDrawable != null) {
                cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
                addDrawableToCache(context, createCacheKey, cachedDrawable);
            }
        }
        return cachedDrawable;
    }

    private ColorStateList createSwitchThumbColorStateList(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, C0770a.colorSwitchThumbNormal);
        if (themeAttrColorStateList == null || !themeAttrColorStateList.isStateful()) {
            iArr[0] = ThemeUtils.DISABLED_STATE_SET;
            iArr2[0] = ThemeUtils.getDisabledThemeAttrColor(context, C0770a.colorSwitchThumbNormal);
            iArr[1] = ThemeUtils.CHECKED_STATE_SET;
            iArr2[1] = ThemeUtils.getThemeAttrColor(context, C0770a.colorControlActivated);
            iArr[2] = ThemeUtils.EMPTY_STATE_SET;
            iArr2[2] = ThemeUtils.getThemeAttrColor(context, C0770a.colorSwitchThumbNormal);
        } else {
            iArr[0] = ThemeUtils.DISABLED_STATE_SET;
            iArr2[0] = themeAttrColorStateList.getColorForState(iArr[0], 0);
            iArr[1] = ThemeUtils.CHECKED_STATE_SET;
            iArr2[1] = ThemeUtils.getThemeAttrColor(context, C0770a.colorControlActivated);
            iArr[2] = ThemeUtils.EMPTY_STATE_SET;
            iArr2[2] = themeAttrColorStateList.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, Mode mode, int[] iArr) {
        return (colorStateList == null || mode == null) ? null : getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static AppCompatDrawableManager get() {
        if (INSTANCE == null) {
            AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
            INSTANCE = appCompatDrawableManager;
            installDefaultInflateDelegates(appCompatDrawableManager);
        }
        return INSTANCE;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable getCachedDrawable(android.content.Context r7, long r8) {
        /*
        r6 = this;
        r2 = 0;
        r3 = r6.mDrawableCacheLock;
        monitor-enter(r3);
        r0 = r6.mDrawableCaches;	 Catch:{ all -> 0x002b }
        r0 = r0.get(r7);	 Catch:{ all -> 0x002b }
        r0 = (android.support.v4.p018f.C0484f) r0;	 Catch:{ all -> 0x002b }
        if (r0 != 0) goto L_0x0011;
    L_0x000e:
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        r0 = r2;
    L_0x0010:
        return r0;
    L_0x0011:
        r1 = r0.m1278a(r8);	 Catch:{ all -> 0x002b }
        r1 = (java.lang.ref.WeakReference) r1;	 Catch:{ all -> 0x002b }
        if (r1 == 0) goto L_0x0049;
    L_0x0019:
        r1 = r1.get();	 Catch:{ all -> 0x002b }
        r1 = (android.graphics.drawable.Drawable.ConstantState) r1;	 Catch:{ all -> 0x002b }
        if (r1 == 0) goto L_0x002e;
    L_0x0021:
        r0 = r7.getResources();	 Catch:{ all -> 0x002b }
        r0 = r1.newDrawable(r0);	 Catch:{ all -> 0x002b }
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        goto L_0x0010;
    L_0x002b:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        throw r0;
    L_0x002e:
        r1 = r0.f1542c;	 Catch:{ all -> 0x002b }
        r4 = r0.f1544e;	 Catch:{ all -> 0x002b }
        r1 = android.support.v4.p018f.C0481c.m1270a(r1, r4, r8);	 Catch:{ all -> 0x002b }
        if (r1 < 0) goto L_0x0049;
    L_0x0038:
        r4 = r0.f1543d;	 Catch:{ all -> 0x002b }
        r4 = r4[r1];	 Catch:{ all -> 0x002b }
        r5 = android.support.v4.p018f.C0484f.f1540a;	 Catch:{ all -> 0x002b }
        if (r4 == r5) goto L_0x0049;
    L_0x0040:
        r4 = r0.f1543d;	 Catch:{ all -> 0x002b }
        r5 = android.support.v4.p018f.C0484f.f1540a;	 Catch:{ all -> 0x002b }
        r4[r1] = r5;	 Catch:{ all -> 0x002b }
        r1 = 1;
        r0.f1541b = r1;	 Catch:{ all -> 0x002b }
    L_0x0049:
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        r0 = r2;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatDrawableManager.getCachedDrawable(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public static PorterDuffColorFilter getPorterDuffColorFilter(int i, Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter = COLOR_FILTER_CACHE.get(i, mode);
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        COLOR_FILTER_CACHE.put(i, mode, porterDuffColorFilter);
        return porterDuffColorFilter;
    }

    private ColorStateList getTintListFromCache(Context context, int i) {
        if (this.mTintLists == null) {
            return null;
        }
        C0500n c0500n = (C0500n) this.mTintLists.get(context);
        return c0500n != null ? (ColorStateList) c0500n.m1299a(i) : null;
    }

    static Mode getTintMode(int i) {
        return i == C0774e.abc_switch_thumb_material ? Mode.MULTIPLY : null;
    }

    private static void installDefaultInflateDelegates(AppCompatDrawableManager appCompatDrawableManager) {
        if (VERSION.SDK_INT < 24) {
            appCompatDrawableManager.addDelegate("vector", new VdcInflateDelegate());
            if (VERSION.SDK_INT >= 11) {
                appCompatDrawableManager.addDelegate("animated-vector", new AvdcInflateDelegate());
            }
        }
    }

    private static boolean isVectorDrawable(Drawable drawable) {
        return ((drawable instanceof C0075i) || PLATFORM_VD_CLAZZ.equals(drawable.getClass().getName())) ? true : DEBUG;
    }

    private Drawable loadDrawableFromDelegates(Context context, int i) {
        if (this.mDelegates == null || this.mDelegates.isEmpty()) {
            return null;
        }
        String str;
        if (this.mKnownDrawableIdTags != null) {
            str = (String) this.mKnownDrawableIdTags.m1299a(i);
            if (SKIP_DRAWABLE_TAG.equals(str) || (str != null && this.mDelegates.get(str) == null)) {
                return null;
            }
        }
        this.mKnownDrawableIdTags = new C0500n();
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        Drawable drawable;
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                int next;
                XmlPullParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                str = xml.getName();
                this.mKnownDrawableIdTags.m1303b(i, str);
                InflateDelegate inflateDelegate = (InflateDelegate) this.mDelegates.get(str);
                if (inflateDelegate != null) {
                    cachedDrawable = inflateDelegate.createFromXmlInner(context, xml, asAttributeSet, context.getTheme());
                }
                if (cachedDrawable != null) {
                    cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
                    addDrawableToCache(context, createCacheKey, cachedDrawable);
                }
                drawable = cachedDrawable;
                if (drawable == null) {
                    return drawable;
                }
                this.mKnownDrawableIdTags.m1303b(i, SKIP_DRAWABLE_TAG);
                return drawable;
            } catch (Exception e) {
            }
        }
        drawable = cachedDrawable;
        if (drawable == null) {
            return drawable;
        }
        this.mKnownDrawableIdTags.m1303b(i, SKIP_DRAWABLE_TAG);
        return drawable;
    }

    private void removeDelegate(String str, InflateDelegate inflateDelegate) {
        if (this.mDelegates != null && this.mDelegates.get(str) == inflateDelegate) {
            this.mDelegates.remove(str);
        }
    }

    private static void setPorterDuffColorFilter(Drawable drawable, int i, Mode mode) {
        if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = DEFAULT_MODE;
        }
        drawable.setColorFilter(getPorterDuffColorFilter(i, mode));
    }

    private Drawable tintDrawable(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList tintList = getTintList(context, i);
        if (tintList != null) {
            if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = C0366a.m1054g(drawable);
            C0366a.m1043a(drawable, tintList);
            Mode tintMode = getTintMode(i);
            if (tintMode == null) {
                return drawable;
            }
            C0366a.m1046a(drawable, tintMode);
            return drawable;
        } else if (i == C0774e.abc_seekbar_track_material) {
            r0 = (LayerDrawable) drawable;
            setPorterDuffColorFilter(r0.findDrawableByLayerId(16908288), ThemeUtils.getThemeAttrColor(context, C0770a.colorControlNormal), DEFAULT_MODE);
            setPorterDuffColorFilter(r0.findDrawableByLayerId(16908303), ThemeUtils.getThemeAttrColor(context, C0770a.colorControlNormal), DEFAULT_MODE);
            setPorterDuffColorFilter(r0.findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(context, C0770a.colorControlActivated), DEFAULT_MODE);
            return drawable;
        } else if (i != C0774e.abc_ratingbar_material && i != C0774e.abc_ratingbar_indicator_material && i != C0774e.abc_ratingbar_small_material) {
            return (tintDrawableUsingColorFilter(context, i, drawable) || !z) ? drawable : null;
        } else {
            r0 = (LayerDrawable) drawable;
            setPorterDuffColorFilter(r0.findDrawableByLayerId(16908288), ThemeUtils.getDisabledThemeAttrColor(context, C0770a.colorControlNormal), DEFAULT_MODE);
            setPorterDuffColorFilter(r0.findDrawableByLayerId(16908303), ThemeUtils.getThemeAttrColor(context, C0770a.colorControlActivated), DEFAULT_MODE);
            setPorterDuffColorFilter(r0.findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(context, C0770a.colorControlActivated), DEFAULT_MODE);
            return drawable;
        }
    }

    static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        if (!DrawableUtils.canSafelyMutateDrawable(drawable) || drawable.mutate() == drawable) {
            if (tintInfo.mHasTintList || tintInfo.mHasTintMode) {
                drawable.setColorFilter(createTintFilter(tintInfo.mHasTintList ? tintInfo.mTintList : null, tintInfo.mHasTintMode ? tintInfo.mTintMode : DEFAULT_MODE, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    static boolean tintDrawableUsingColorFilter(Context context, int i, Drawable drawable) {
        int i2;
        Mode mode;
        boolean z;
        int i3;
        Mode mode2 = DEFAULT_MODE;
        if (arrayContains(COLORFILTER_TINT_COLOR_CONTROL_NORMAL, i)) {
            i2 = C0770a.colorControlNormal;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (arrayContains(COLORFILTER_COLOR_CONTROL_ACTIVATED, i)) {
            i2 = C0770a.colorControlActivated;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (arrayContains(COLORFILTER_COLOR_BACKGROUND_MULTIPLY, i)) {
            z = true;
            mode = Mode.MULTIPLY;
            i2 = 16842801;
            i3 = -1;
        } else if (i == C0774e.abc_list_divider_mtrl_alpha) {
            i2 = 16842800;
            i3 = Math.round(40.8f);
            mode = mode2;
            z = true;
        } else if (i == C0774e.abc_dialog_material_background) {
            i2 = 16842801;
            mode = mode2;
            z = true;
            i3 = -1;
        } else {
            i3 = -1;
            i2 = 0;
            mode = mode2;
            z = false;
        }
        if (!z) {
            return DEBUG;
        }
        if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, i2), mode));
        if (i3 == -1) {
            return true;
        }
        drawable.setAlpha(i3);
        return true;
    }

    public final Drawable getDrawable(Context context, int i) {
        return getDrawable(context, i, DEBUG);
    }

    final Drawable getDrawable(Context context, int i, boolean z) {
        checkVectorDrawableSetup(context);
        Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = createDrawableIfNeeded(context, i);
        }
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = C0392a.getDrawable(context, i);
        }
        if (loadDrawableFromDelegates != null) {
            loadDrawableFromDelegates = tintDrawable(context, i, z, loadDrawableFromDelegates);
        }
        if (loadDrawableFromDelegates != null) {
            DrawableUtils.fixDrawable(loadDrawableFromDelegates);
        }
        return loadDrawableFromDelegates;
    }

    final ColorStateList getTintList(Context context, int i) {
        ColorStateList tintListFromCache = getTintListFromCache(context, i);
        if (tintListFromCache == null) {
            if (i == C0774e.abc_edit_text_material) {
                tintListFromCache = C0862b.m2513a(context, C0772c.abc_tint_edittext);
            } else if (i == C0774e.abc_switch_track_mtrl_alpha) {
                tintListFromCache = C0862b.m2513a(context, C0772c.abc_tint_switch_track);
            } else if (i == C0774e.abc_switch_thumb_material) {
                tintListFromCache = createSwitchThumbColorStateList(context);
            } else if (i == C0774e.abc_btn_default_mtrl_shape) {
                tintListFromCache = createDefaultButtonColorStateList(context);
            } else if (i == C0774e.abc_btn_borderless_material) {
                tintListFromCache = createBorderlessButtonColorStateList(context);
            } else if (i == C0774e.abc_btn_colored_material) {
                tintListFromCache = createColoredButtonColorStateList(context);
            } else if (i == C0774e.abc_spinner_mtrl_am_alpha || i == C0774e.abc_spinner_textfield_background_material) {
                tintListFromCache = C0862b.m2513a(context, C0772c.abc_tint_spinner);
            } else if (arrayContains(TINT_COLOR_CONTROL_NORMAL, i)) {
                tintListFromCache = ThemeUtils.getThemeAttrColorStateList(context, C0770a.colorControlNormal);
            } else if (arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i)) {
                tintListFromCache = C0862b.m2513a(context, C0772c.abc_tint_default);
            } else if (arrayContains(TINT_CHECKABLE_BUTTON_LIST, i)) {
                tintListFromCache = C0862b.m2513a(context, C0772c.abc_tint_btn_checkable);
            } else if (i == C0774e.abc_seekbar_thumb_material) {
                tintListFromCache = C0862b.m2513a(context, C0772c.abc_tint_seek_thumb);
            }
            if (tintListFromCache != null) {
                addTintListToCache(context, i, tintListFromCache);
            }
        }
        return tintListFromCache;
    }

    public final void onConfigurationChanged(Context context) {
        synchronized (this.mDrawableCacheLock) {
            C0484f c0484f = (C0484f) this.mDrawableCaches.get(context);
            if (c0484f != null) {
                c0484f.m1283c();
            }
        }
    }

    final Drawable onDrawableLoadedFromResources(Context context, VectorEnabledTintResources vectorEnabledTintResources, int i) {
        Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = vectorEnabledTintResources.superGetDrawable(i);
        }
        return loadDrawableFromDelegates != null ? tintDrawable(context, i, DEBUG, loadDrawableFromDelegates) : null;
    }
}
