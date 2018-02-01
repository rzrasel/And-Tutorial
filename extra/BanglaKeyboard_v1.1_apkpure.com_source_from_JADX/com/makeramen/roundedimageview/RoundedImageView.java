package com.makeramen.roundedimageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.makeramen.roundedimageview.C1663a.C1662a;
import java.util.HashSet;
import java.util.Set;

public class RoundedImageView extends ImageView {
    public static final TileMode f7801a = TileMode.CLAMP;
    static final /* synthetic */ boolean f7802b = (!RoundedImageView.class.desiredAssertionStatus());
    private static final ScaleType[] f7803c = new ScaleType[]{ScaleType.MATRIX, ScaleType.FIT_XY, ScaleType.FIT_START, ScaleType.FIT_CENTER, ScaleType.FIT_END, ScaleType.CENTER, ScaleType.CENTER_CROP, ScaleType.CENTER_INSIDE};
    private final float[] f7804d;
    private Drawable f7805e;
    private ColorStateList f7806f;
    private float f7807g;
    private ColorFilter f7808h;
    private boolean f7809i;
    private Drawable f7810j;
    private boolean f7811k;
    private boolean f7812l;
    private boolean f7813m;
    private int f7814n;
    private ScaleType f7815o;
    private TileMode f7816p;
    private TileMode f7817q;

    static /* synthetic */ class C16611 {
        static final /* synthetic */ int[] f7800a = new int[ScaleType.values().length];

        static {
            try {
                f7800a[ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f7800a[ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f7800a[ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f7800a[ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f7800a[ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f7800a[ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f7800a[ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        this.f7804d = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f7806f = ColorStateList.valueOf(-16777216);
        this.f7807g = 0.0f;
        this.f7808h = null;
        this.f7809i = false;
        this.f7811k = false;
        this.f7812l = false;
        this.f7813m = false;
        this.f7815o = ScaleType.FIT_CENTER;
        this.f7816p = f7801a;
        this.f7817q = f7801a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1662a.RoundedImageView, i, 0);
        int i3 = obtainStyledAttributes.getInt(C1662a.RoundedImageView_android_scaleType, -1);
        if (i3 >= 0) {
            setScaleType(f7803c[i3]);
        } else {
            setScaleType(ScaleType.FIT_CENTER);
        }
        float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(C1662a.RoundedImageView_riv_corner_radius, -1);
        this.f7804d[0] = (float) obtainStyledAttributes.getDimensionPixelSize(C1662a.RoundedImageView_riv_corner_radius_top_left, -1);
        this.f7804d[1] = (float) obtainStyledAttributes.getDimensionPixelSize(C1662a.RoundedImageView_riv_corner_radius_top_right, -1);
        this.f7804d[2] = (float) obtainStyledAttributes.getDimensionPixelSize(C1662a.RoundedImageView_riv_corner_radius_bottom_right, -1);
        this.f7804d[3] = (float) obtainStyledAttributes.getDimensionPixelSize(C1662a.RoundedImageView_riv_corner_radius_bottom_left, -1);
        int length = this.f7804d.length;
        boolean z = false;
        for (i2 = 0; i2 < length; i2++) {
            if (this.f7804d[i2] < 0.0f) {
                this.f7804d[i2] = 0.0f;
            } else {
                z = true;
            }
        }
        if (!z) {
            float f = dimensionPixelSize < 0.0f ? 0.0f : dimensionPixelSize;
            i2 = this.f7804d.length;
            for (int i4 = 0; i4 < i2; i4++) {
                this.f7804d[i4] = f;
            }
        }
        this.f7807g = (float) obtainStyledAttributes.getDimensionPixelSize(C1662a.RoundedImageView_riv_border_width, -1);
        if (this.f7807g < 0.0f) {
            this.f7807g = 0.0f;
        }
        this.f7806f = obtainStyledAttributes.getColorStateList(C1662a.RoundedImageView_riv_border_color);
        if (this.f7806f == null) {
            this.f7806f = ColorStateList.valueOf(-16777216);
        }
        this.f7813m = obtainStyledAttributes.getBoolean(C1662a.RoundedImageView_riv_mutate_background, false);
        this.f7812l = obtainStyledAttributes.getBoolean(C1662a.RoundedImageView_riv_oval, false);
        i3 = obtainStyledAttributes.getInt(C1662a.RoundedImageView_riv_tile_mode, -2);
        if (i3 != -2) {
            setTileModeX(m7114a(i3));
            setTileModeY(m7114a(i3));
        }
        i3 = obtainStyledAttributes.getInt(C1662a.RoundedImageView_riv_tile_mode_x, -2);
        if (i3 != -2) {
            setTileModeX(m7114a(i3));
        }
        i3 = obtainStyledAttributes.getInt(C1662a.RoundedImageView_riv_tile_mode_y, -2);
        if (i3 != -2) {
            setTileModeY(m7114a(i3));
        }
        m7119b();
        m7118a(true);
        obtainStyledAttributes.recycle();
    }

    private static TileMode m7114a(int i) {
        switch (i) {
            case 0:
                return TileMode.CLAMP;
            case 1:
                return TileMode.REPEAT;
            case 2:
                return TileMode.MIRROR;
            default:
                return null;
        }
    }

    private Drawable m7115a() {
        Drawable drawable = null;
        Resources resources = getResources();
        if (resources == null) {
            return drawable;
        }
        if (this.f7814n != 0) {
            try {
                drawable = resources.getDrawable(this.f7814n);
            } catch (Throwable e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.f7814n, e);
                this.f7814n = 0;
            }
        }
        return C1665b.m7121a(drawable);
    }

    private void m7116a(float f, float f2, float f3, float f4) {
        if (this.f7804d[0] != f || this.f7804d[1] != f2 || this.f7804d[2] != f4 || this.f7804d[3] != f3) {
            this.f7804d[0] = f;
            this.f7804d[1] = f2;
            this.f7804d[3] = f3;
            this.f7804d[2] = f4;
            m7119b();
            m7118a(false);
            invalidate();
        }
    }

    private void m7117a(Drawable drawable) {
        int i = 0;
        boolean z = true;
        if (drawable != null) {
            if (drawable instanceof C1665b) {
                C1665b c1665b = (C1665b) drawable;
                ScaleType scaleType = this.f7815o;
                if (scaleType == null) {
                    scaleType = ScaleType.FIT_CENTER;
                }
                if (c1665b.f7828j != scaleType) {
                    c1665b.f7828j = scaleType;
                    c1665b.m7127a();
                }
                c1665b.f7826h = this.f7807g;
                c1665b.f7819a.setStrokeWidth(c1665b.f7826h);
                ColorStateList colorStateList = this.f7806f;
                if (colorStateList == null) {
                    colorStateList = ColorStateList.valueOf(0);
                }
                c1665b.f7827i = colorStateList;
                c1665b.f7819a.setColor(c1665b.f7827i.getColorForState(c1665b.getState(), -16777216));
                c1665b.f7825g = this.f7812l;
                TileMode tileMode = this.f7816p;
                if (c1665b.f7820b != tileMode) {
                    c1665b.f7820b = tileMode;
                    c1665b.f7822d = true;
                    c1665b.invalidateSelf();
                }
                tileMode = this.f7817q;
                if (c1665b.f7821c != tileMode) {
                    c1665b.f7821c = tileMode;
                    c1665b.f7822d = true;
                    c1665b.invalidateSelf();
                }
                if (this.f7804d != null) {
                    C1665b c1665b2 = (C1665b) drawable;
                    float f = this.f7804d[0];
                    float f2 = this.f7804d[1];
                    float f3 = this.f7804d[2];
                    float f4 = this.f7804d[3];
                    Set hashSet = new HashSet(4);
                    hashSet.add(Float.valueOf(f));
                    hashSet.add(Float.valueOf(f2));
                    hashSet.add(Float.valueOf(f3));
                    hashSet.add(Float.valueOf(f4));
                    hashSet.remove(Float.valueOf(0.0f));
                    if (hashSet.size() > 1) {
                        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
                    }
                    if (hashSet.isEmpty()) {
                        c1665b2.f7823e = 0.0f;
                    } else {
                        float floatValue = ((Float) hashSet.iterator().next()).floatValue();
                        if (Float.isInfinite(floatValue) || Float.isNaN(floatValue) || floatValue < 0.0f) {
                            throw new IllegalArgumentException("Invalid radius value: " + floatValue);
                        }
                        c1665b2.f7823e = floatValue;
                    }
                    c1665b2.f7824f[0] = f > 0.0f;
                    c1665b2.f7824f[1] = f2 > 0.0f;
                    c1665b2.f7824f[2] = f3 > 0.0f;
                    boolean[] zArr = c1665b2.f7824f;
                    if (f4 <= 0.0f) {
                        z = false;
                    }
                    zArr[3] = z;
                }
                m7120c();
            } else if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                while (i < numberOfLayers) {
                    m7117a(layerDrawable.getDrawable(i));
                    i++;
                }
            }
        }
    }

    private void m7118a(boolean z) {
        if (this.f7813m) {
            if (z) {
                this.f7805e = C1665b.m7121a(this.f7805e);
            }
            m7117a(this.f7805e);
        }
    }

    private void m7119b() {
        m7117a(this.f7810j);
    }

    private void m7120c() {
        if (this.f7810j != null && this.f7809i) {
            this.f7810j = this.f7810j.mutate();
            if (this.f7811k) {
                this.f7810j.setColorFilter(this.f7808h);
            }
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.f7806f.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f7806f;
    }

    public float getBorderWidth() {
        return this.f7807g;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float f = 0.0f;
        for (float max : this.f7804d) {
            f = Math.max(max, f);
        }
        return f;
    }

    public ScaleType getScaleType() {
        return this.f7815o;
    }

    public TileMode getTileModeX() {
        return this.f7816p;
    }

    public TileMode getTileModeY() {
        return this.f7817q;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f7805e = drawable;
        m7118a(true);
        super.setBackgroundDrawable(this.f7805e);
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (!this.f7806f.equals(colorStateList)) {
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(-16777216);
            }
            this.f7806f = colorStateList;
            m7119b();
            m7118a(false);
            if (this.f7807g > 0.0f) {
                invalidate();
            }
        }
    }

    public void setBorderWidth(float f) {
        if (this.f7807g != f) {
            this.f7807g = f;
            m7119b();
            m7118a(false);
            invalidate();
        }
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f7808h != colorFilter) {
            this.f7808h = colorFilter;
            this.f7811k = true;
            this.f7809i = true;
            m7120c();
            invalidate();
        }
    }

    public void setCornerRadius(float f) {
        m7116a(f, f, f, f);
    }

    public void setCornerRadiusDimen(int i) {
        float dimension = getResources().getDimension(i);
        m7116a(dimension, dimension, dimension, dimension);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f7814n = 0;
        this.f7810j = C1665b.m7122a(bitmap);
        m7119b();
        super.setImageDrawable(this.f7810j);
    }

    public void setImageDrawable(Drawable drawable) {
        this.f7814n = 0;
        this.f7810j = C1665b.m7121a(drawable);
        m7119b();
        super.setImageDrawable(this.f7810j);
    }

    public void setImageResource(int i) {
        if (this.f7814n != i) {
            this.f7814n = i;
            this.f7810j = m7115a();
            m7119b();
            super.setImageDrawable(this.f7810j);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z) {
        this.f7812l = z;
        m7119b();
        m7118a(false);
        invalidate();
    }

    public void setScaleType(ScaleType scaleType) {
        if (!f7802b && scaleType == null) {
            throw new AssertionError();
        } else if (this.f7815o != scaleType) {
            this.f7815o = scaleType;
            switch (C16611.f7800a[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            m7119b();
            m7118a(false);
            invalidate();
        }
    }

    public void setTileModeX(TileMode tileMode) {
        if (this.f7816p != tileMode) {
            this.f7816p = tileMode;
            m7119b();
            m7118a(false);
            invalidate();
        }
    }

    public void setTileModeY(TileMode tileMode) {
        if (this.f7817q != tileMode) {
            this.f7817q = tileMode;
            m7119b();
            m7118a(false);
            invalidate();
        }
    }
}
