package android.support.p004b.p005a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.support.v4.content.p015a.C0437b;
import android.support.v4.content.p015a.C0438c;
import android.support.v4.p006a.C0378b;
import android.support.v4.p006a.C0378b.C0377b;
import android.support.v4.p006a.p007a.C0366a;
import android.support.v4.p018f.C0478a;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class C0075i extends C0061h {
    static final Mode f149a = Mode.SRC_IN;
    C0073f f150c;
    boolean f151d;
    private PorterDuffColorFilter f152e;
    private ColorFilter f153f;
    private boolean f154g;
    private ConstantState f155h;
    private final float[] f156i;
    private final Matrix f157j;
    private final Rect f158k;

    private static class C0068d {
        protected C0377b[] f91m = null;
        String f92n;
        int f93o;

        public C0068d(C0068d c0068d) {
            this.f92n = c0068d.f92n;
            this.f93o = c0068d.f93o;
            this.f91m = C0378b.m1092a(c0068d.f91m);
        }

        public final void m74a(Path path) {
            path.reset();
            if (this.f91m != null) {
                C0377b.m1085a(this.f91m, path);
            }
        }

        public boolean mo29a() {
            return false;
        }

        public C0377b[] getPathData() {
            return this.f91m;
        }

        public String getPathName() {
            return this.f92n;
        }

        public void setPathData(C0377b[] c0377bArr) {
            if (C0378b.m1090a(this.f91m, c0377bArr)) {
                C0377b[] c0377bArr2 = this.f91m;
                for (int i = 0; i < c0377bArr.length; i++) {
                    c0377bArr2[i].f1381a = c0377bArr[i].f1381a;
                    for (int i2 = 0; i2 < c0377bArr[i].f1382b.length; i2++) {
                        c0377bArr2[i].f1382b[i2] = c0377bArr[i].f1382b[i2];
                    }
                }
                return;
            }
            this.f91m = C0378b.m1092a(c0377bArr);
        }
    }

    private static class C0069a extends C0068d {
        public C0069a(C0069a c0069a) {
            super(c0069a);
        }

        final void m76a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.n = string;
            }
            string = typedArray.getString(1);
            if (string != null) {
                this.m = C0378b.m1093b(string);
            }
        }

        public final boolean mo29a() {
            return true;
        }
    }

    private static class C0070b extends C0068d {
        int f94a = 0;
        float f95b = 0.0f;
        int f96c = 0;
        float f97d = 1.0f;
        int f98e = 0;
        float f99f = 1.0f;
        float f100g = 0.0f;
        float f101h = 1.0f;
        float f102i = 0.0f;
        Cap f103j = Cap.BUTT;
        Join f104k = Join.MITER;
        float f105l = 4.0f;
        private int[] f106p;

        public C0070b(C0070b c0070b) {
            super(c0070b);
            this.f106p = c0070b.f106p;
            this.f94a = c0070b.f94a;
            this.f95b = c0070b.f95b;
            this.f97d = c0070b.f97d;
            this.f96c = c0070b.f96c;
            this.f98e = c0070b.f98e;
            this.f99f = c0070b.f99f;
            this.f100g = c0070b.f100g;
            this.f101h = c0070b.f101h;
            this.f102i = c0070b.f102i;
            this.f103j = c0070b.f103j;
            this.f104k = c0070b.f104k;
            this.f105l = c0070b.f105l;
        }

        final void m78a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f106p = null;
            if (C0438c.m1167a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.n = string;
                }
                string = typedArray.getString(2);
                if (string != null) {
                    this.m = C0378b.m1093b(string);
                }
                this.f96c = C0438c.m1168b(typedArray, xmlPullParser, "fillColor", 1, this.f96c);
                this.f99f = C0438c.m1157a(typedArray, xmlPullParser, "fillAlpha", 12, this.f99f);
                int a = C0438c.m1161a(typedArray, xmlPullParser, "strokeLineCap", 8, -1);
                Cap cap = this.f103j;
                switch (a) {
                    case 0:
                        cap = Cap.BUTT;
                        break;
                    case 1:
                        cap = Cap.ROUND;
                        break;
                    case 2:
                        cap = Cap.SQUARE;
                        break;
                }
                this.f103j = cap;
                a = C0438c.m1161a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1);
                Join join = this.f104k;
                switch (a) {
                    case 0:
                        join = Join.MITER;
                        break;
                    case 1:
                        join = Join.ROUND;
                        break;
                    case 2:
                        join = Join.BEVEL;
                        break;
                }
                this.f104k = join;
                this.f105l = C0438c.m1157a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f105l);
                this.f94a = C0438c.m1168b(typedArray, xmlPullParser, "strokeColor", 3, this.f94a);
                this.f97d = C0438c.m1157a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f97d);
                this.f95b = C0438c.m1157a(typedArray, xmlPullParser, "strokeWidth", 4, this.f95b);
                this.f101h = C0438c.m1157a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f101h);
                this.f102i = C0438c.m1157a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f102i);
                this.f100g = C0438c.m1157a(typedArray, xmlPullParser, "trimPathStart", 5, this.f100g);
                this.f98e = C0438c.m1161a(typedArray, xmlPullParser, "fillType", 13, this.f98e);
            }
        }

        final float getFillAlpha() {
            return this.f99f;
        }

        final int getFillColor() {
            return this.f96c;
        }

        final float getStrokeAlpha() {
            return this.f97d;
        }

        final int getStrokeColor() {
            return this.f94a;
        }

        final float getStrokeWidth() {
            return this.f95b;
        }

        final float getTrimPathEnd() {
            return this.f101h;
        }

        final float getTrimPathOffset() {
            return this.f102i;
        }

        final float getTrimPathStart() {
            return this.f100g;
        }

        final void setFillAlpha(float f) {
            this.f99f = f;
        }

        final void setFillColor(int i) {
            this.f96c = i;
        }

        final void setStrokeAlpha(float f) {
            this.f97d = f;
        }

        final void setStrokeColor(int i) {
            this.f94a = i;
        }

        final void setStrokeWidth(float f) {
            this.f95b = f;
        }

        final void setTrimPathEnd(float f) {
            this.f101h = f;
        }

        final void setTrimPathOffset(float f) {
            this.f102i = f;
        }

        final void setTrimPathStart(float f) {
            this.f100g = f;
        }
    }

    private static class C0071c {
        final Matrix f107a = new Matrix();
        final ArrayList<Object> f108b = new ArrayList();
        float f109c = 0.0f;
        float f110d = 0.0f;
        float f111e = 0.0f;
        float f112f = 1.0f;
        float f113g = 1.0f;
        float f114h = 0.0f;
        float f115i = 0.0f;
        final Matrix f116j = new Matrix();
        int f117k;
        int[] f118l;
        String f119m = null;

        public C0071c(C0071c c0071c, C0478a<String, Object> c0478a) {
            this.f109c = c0071c.f109c;
            this.f110d = c0071c.f110d;
            this.f111e = c0071c.f111e;
            this.f112f = c0071c.f112f;
            this.f113g = c0071c.f113g;
            this.f114h = c0071c.f114h;
            this.f115i = c0071c.f115i;
            this.f118l = c0071c.f118l;
            this.f119m = c0071c.f119m;
            this.f117k = c0071c.f117k;
            if (this.f119m != null) {
                c0478a.put(this.f119m, this);
            }
            this.f116j.set(c0071c.f116j);
            ArrayList arrayList = c0071c.f108b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C0071c) {
                    this.f108b.add(new C0071c((C0071c) obj, c0478a));
                } else {
                    C0068d c0070b;
                    if (obj instanceof C0070b) {
                        c0070b = new C0070b((C0070b) obj);
                    } else if (obj instanceof C0069a) {
                        c0070b = new C0069a((C0069a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f108b.add(c0070b);
                    if (c0070b.f92n != null) {
                        c0478a.put(c0070b.f92n, c0070b);
                    }
                }
            }
        }

        final void m79a() {
            this.f116j.reset();
            this.f116j.postTranslate(-this.f110d, -this.f111e);
            this.f116j.postScale(this.f112f, this.f113g);
            this.f116j.postRotate(this.f109c, 0.0f, 0.0f);
            this.f116j.postTranslate(this.f114h + this.f110d, this.f115i + this.f111e);
        }

        public final String getGroupName() {
            return this.f119m;
        }

        public final Matrix getLocalMatrix() {
            return this.f116j;
        }

        public final float getPivotX() {
            return this.f110d;
        }

        public final float getPivotY() {
            return this.f111e;
        }

        public final float getRotation() {
            return this.f109c;
        }

        public final float getScaleX() {
            return this.f112f;
        }

        public final float getScaleY() {
            return this.f113g;
        }

        public final float getTranslateX() {
            return this.f114h;
        }

        public final float getTranslateY() {
            return this.f115i;
        }

        public final void setPivotX(float f) {
            if (f != this.f110d) {
                this.f110d = f;
                m79a();
            }
        }

        public final void setPivotY(float f) {
            if (f != this.f111e) {
                this.f111e = f;
                m79a();
            }
        }

        public final void setRotation(float f) {
            if (f != this.f109c) {
                this.f109c = f;
                m79a();
            }
        }

        public final void setScaleX(float f) {
            if (f != this.f112f) {
                this.f112f = f;
                m79a();
            }
        }

        public final void setScaleY(float f) {
            if (f != this.f113g) {
                this.f113g = f;
                m79a();
            }
        }

        public final void setTranslateX(float f) {
            if (f != this.f114h) {
                this.f114h = f;
                m79a();
            }
        }

        public final void setTranslateY(float f) {
            if (f != this.f115i) {
                this.f115i = f;
                m79a();
            }
        }
    }

    private static class C0072e {
        private static final Matrix f120k = new Matrix();
        final C0071c f121a;
        float f122b;
        float f123c;
        float f124d;
        float f125e;
        int f126f;
        String f127g;
        final C0478a<String, Object> f128h;
        private final Path f129i;
        private final Path f130j;
        private final Matrix f131l;
        private Paint f132m;
        private Paint f133n;
        private PathMeasure f134o;
        private int f135p;

        public C0072e() {
            this.f131l = new Matrix();
            this.f122b = 0.0f;
            this.f123c = 0.0f;
            this.f124d = 0.0f;
            this.f125e = 0.0f;
            this.f126f = 255;
            this.f127g = null;
            this.f128h = new C0478a();
            this.f121a = new C0071c();
            this.f129i = new Path();
            this.f130j = new Path();
        }

        public C0072e(C0072e c0072e) {
            this.f131l = new Matrix();
            this.f122b = 0.0f;
            this.f123c = 0.0f;
            this.f124d = 0.0f;
            this.f125e = 0.0f;
            this.f126f = 255;
            this.f127g = null;
            this.f128h = new C0478a();
            this.f121a = new C0071c(c0072e.f121a, this.f128h);
            this.f129i = new Path(c0072e.f129i);
            this.f130j = new Path(c0072e.f130j);
            this.f122b = c0072e.f122b;
            this.f123c = c0072e.f123c;
            this.f124d = c0072e.f124d;
            this.f125e = c0072e.f125e;
            this.f135p = c0072e.f135p;
            this.f126f = c0072e.f126f;
            this.f127g = c0072e.f127g;
            if (c0072e.f127g != null) {
                this.f128h.put(c0072e.f127g, this);
            }
        }

        private void m82a(C0071c c0071c, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c0071c.f107a.set(matrix);
            c0071c.f107a.preConcat(c0071c.f116j);
            canvas.save();
            for (int i3 = 0; i3 < c0071c.f108b.size(); i3++) {
                Object obj = c0071c.f108b.get(i3);
                if (obj instanceof C0071c) {
                    m82a((C0071c) obj, c0071c.f107a, canvas, i, i2, colorFilter);
                } else if (obj instanceof C0068d) {
                    C0068d c0068d = (C0068d) obj;
                    float f = ((float) i) / this.f124d;
                    float f2 = ((float) i2) / this.f125e;
                    float min = Math.min(f, f2);
                    Matrix matrix2 = c0071c.f107a;
                    this.f131l.set(matrix2);
                    this.f131l.postScale(f, f2);
                    float[] fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f3 = (fArr[3] * fArr[0]) - (fArr[1] * fArr[2]);
                    f2 = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                    f2 = f2 > 0.0f ? Math.abs(f3) / f2 : 0.0f;
                    if (f2 != 0.0f) {
                        c0068d.m74a(this.f129i);
                        Path path = this.f129i;
                        this.f130j.reset();
                        if (c0068d.mo29a()) {
                            this.f130j.addPath(path, this.f131l);
                            canvas.clipPath(this.f130j);
                        } else {
                            C0070b c0070b = (C0070b) c0068d;
                            if (!(c0070b.f100g == 0.0f && c0070b.f101h == 1.0f)) {
                                float f4 = (c0070b.f100g + c0070b.f102i) % 1.0f;
                                f3 = (c0070b.f101h + c0070b.f102i) % 1.0f;
                                if (this.f134o == null) {
                                    this.f134o = new PathMeasure();
                                }
                                this.f134o.setPath(this.f129i, false);
                                float length = this.f134o.getLength();
                                f4 *= length;
                                f3 *= length;
                                path.reset();
                                if (f4 > f3) {
                                    this.f134o.getSegment(f4, length, path, true);
                                    this.f134o.getSegment(0.0f, f3, path, true);
                                } else {
                                    this.f134o.getSegment(f4, f3, path, true);
                                }
                                path.rLineTo(0.0f, 0.0f);
                            }
                            this.f130j.addPath(path, this.f131l);
                            if (c0070b.f96c != 0) {
                                if (this.f133n == null) {
                                    this.f133n = new Paint();
                                    this.f133n.setStyle(Style.FILL);
                                    this.f133n.setAntiAlias(true);
                                }
                                Paint paint = this.f133n;
                                paint.setColor(C0075i.m87a(c0070b.f96c, c0070b.f99f));
                                paint.setColorFilter(colorFilter);
                                this.f130j.setFillType(c0070b.f98e == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                                canvas.drawPath(this.f130j, paint);
                            }
                            if (c0070b.f94a != 0) {
                                if (this.f132m == null) {
                                    this.f132m = new Paint();
                                    this.f132m.setStyle(Style.STROKE);
                                    this.f132m.setAntiAlias(true);
                                }
                                Paint paint2 = this.f132m;
                                if (c0070b.f104k != null) {
                                    paint2.setStrokeJoin(c0070b.f104k);
                                }
                                if (c0070b.f103j != null) {
                                    paint2.setStrokeCap(c0070b.f103j);
                                }
                                paint2.setStrokeMiter(c0070b.f105l);
                                paint2.setColor(C0075i.m87a(c0070b.f94a, c0070b.f97d));
                                paint2.setColorFilter(colorFilter);
                                paint2.setStrokeWidth(c0070b.f95b * (f2 * min));
                                canvas.drawPath(this.f130j, paint2);
                            }
                        }
                    }
                }
            }
            canvas.restore();
        }

        public final void m85a(Canvas canvas, int i, int i2) {
            m82a(this.f121a, f120k, canvas, i, i2, null);
        }

        public final float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public final int getRootAlpha() {
            return this.f126f;
        }

        public final void setAlpha(float f) {
            setRootAlpha((int) (255.0f * f));
        }

        public final void setRootAlpha(int i) {
            this.f126f = i;
        }
    }

    private static class C0073f extends ConstantState {
        int f136a;
        C0072e f137b;
        ColorStateList f138c;
        Mode f139d;
        boolean f140e;
        Bitmap f141f;
        ColorStateList f142g;
        Mode f143h;
        int f144i;
        boolean f145j;
        boolean f146k;
        Paint f147l;

        public C0073f() {
            this.f138c = null;
            this.f139d = C0075i.f149a;
            this.f137b = new C0072e();
        }

        public C0073f(C0073f c0073f) {
            this.f138c = null;
            this.f139d = C0075i.f149a;
            if (c0073f != null) {
                this.f136a = c0073f.f136a;
                this.f137b = new C0072e(c0073f.f137b);
                if (c0073f.f137b.f133n != null) {
                    this.f137b.f133n = new Paint(c0073f.f137b.f133n);
                }
                if (c0073f.f137b.f132m != null) {
                    this.f137b.f132m = new Paint(c0073f.f137b.f132m);
                }
                this.f138c = c0073f.f138c;
                this.f139d = c0073f.f139d;
                this.f140e = c0073f.f140e;
            }
        }

        public final void m86a(int i, int i2) {
            this.f141f.eraseColor(0);
            this.f137b.m85a(new Canvas(this.f141f), i, i2);
        }

        public final int getChangingConfigurations() {
            return this.f136a;
        }

        public final Drawable newDrawable() {
            return new C0075i(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new C0075i(this);
        }
    }

    private static class C0074g extends ConstantState {
        private final ConstantState f148a;

        public C0074g(ConstantState constantState) {
            this.f148a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.f148a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f148a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            Drawable c0075i = new C0075i();
            c0075i.b = (VectorDrawable) this.f148a.newDrawable();
            return c0075i;
        }

        public final Drawable newDrawable(Resources resources) {
            Drawable c0075i = new C0075i();
            c0075i.b = (VectorDrawable) this.f148a.newDrawable(resources);
            return c0075i;
        }

        public final Drawable newDrawable(Resources resources, Theme theme) {
            Drawable c0075i = new C0075i();
            c0075i.b = (VectorDrawable) this.f148a.newDrawable(resources, theme);
            return c0075i;
        }
    }

    C0075i() {
        this.f151d = true;
        this.f156i = new float[9];
        this.f157j = new Matrix();
        this.f158k = new Rect();
        this.f150c = new C0073f();
    }

    C0075i(C0073f c0073f) {
        this.f151d = true;
        this.f156i = new float[9];
        this.f157j = new Matrix();
        this.f158k = new Rect();
        this.f150c = c0073f;
        this.f152e = m88a(c0073f.f138c, c0073f.f139d);
    }

    static int m87a(int i, float f) {
        return (((int) (((float) Color.alpha(i)) * f)) << 24) | (16777215 & i);
    }

    private PorterDuffColorFilter m88a(ColorStateList colorStateList, Mode mode) {
        return (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public static C0075i m89a(Resources resources, int i, Theme theme) {
        if (VERSION.SDK_INT >= 24) {
            C0075i c0075i = new C0075i();
            c0075i.b = C0437b.m1156a(resources, i, theme);
            c0075i.f155h = new C0074g(c0075i.b.getConstantState());
            return c0075i;
        }
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
            if (next == 2) {
                return C0075i.m90a(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (XmlPullParserException e) {
            return null;
        } catch (IOException e2) {
            return null;
        }
    }

    public static C0075i m90a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C0075i c0075i = new C0075i();
        c0075i.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0075i;
    }

    private void m91b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C0073f c0073f = this.f150c;
        C0072e c0072e = c0073f.f137b;
        Object obj = 1;
        Stack stack = new Stack();
        stack.push(c0072e.f121a);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            Object obj2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0071c c0071c = (C0071c) stack.peek();
                if ("path".equals(name)) {
                    C0070b c0070b = new C0070b();
                    TypedArray a = C0438c.m1162a(resources, theme, attributeSet, C0055a.f63c);
                    c0070b.m78a(a, xmlPullParser);
                    a.recycle();
                    c0071c.f108b.add(c0070b);
                    if (c0070b.getPathName() != null) {
                        c0072e.f128h.put(c0070b.getPathName(), c0070b);
                    }
                    obj2 = null;
                    c0073f.f136a = c0070b.o | c0073f.f136a;
                } else if ("clip-path".equals(name)) {
                    C0069a c0069a = new C0069a();
                    if (C0438c.m1167a(xmlPullParser, "pathData")) {
                        r9 = C0438c.m1162a(resources, theme, attributeSet, C0055a.f64d);
                        c0069a.m76a(r9);
                        r9.recycle();
                    }
                    c0071c.f108b.add(c0069a);
                    if (c0069a.getPathName() != null) {
                        c0072e.f128h.put(c0069a.getPathName(), c0069a);
                    }
                    c0073f.f136a |= c0069a.o;
                    obj2 = obj;
                } else {
                    if ("group".equals(name)) {
                        C0071c c0071c2 = new C0071c();
                        r9 = C0438c.m1162a(resources, theme, attributeSet, C0055a.f62b);
                        c0071c2.f118l = null;
                        c0071c2.f109c = C0438c.m1157a(r9, xmlPullParser, "rotation", 5, c0071c2.f109c);
                        c0071c2.f110d = r9.getFloat(1, c0071c2.f110d);
                        c0071c2.f111e = r9.getFloat(2, c0071c2.f111e);
                        c0071c2.f112f = C0438c.m1157a(r9, xmlPullParser, "scaleX", 3, c0071c2.f112f);
                        c0071c2.f113g = C0438c.m1157a(r9, xmlPullParser, "scaleY", 4, c0071c2.f113g);
                        c0071c2.f114h = C0438c.m1157a(r9, xmlPullParser, "translateX", 6, c0071c2.f114h);
                        c0071c2.f115i = C0438c.m1157a(r9, xmlPullParser, "translateY", 7, c0071c2.f115i);
                        String string = r9.getString(0);
                        if (string != null) {
                            c0071c2.f119m = string;
                        }
                        c0071c2.m79a();
                        r9.recycle();
                        c0071c.f108b.add(c0071c2);
                        stack.push(c0071c2);
                        if (c0071c2.getGroupName() != null) {
                            c0072e.f128h.put(c0071c2.getGroupName(), c0071c2);
                        }
                        c0073f.f136a |= c0071c2.f117k;
                    }
                    obj2 = obj;
                }
            } else {
                if (eventType == 3) {
                    if ("group".equals(xmlPullParser.getName())) {
                        stack.pop();
                    }
                }
                obj2 = obj;
            }
            obj = obj2;
            eventType = xmlPullParser.next();
        }
        if (obj != null) {
            StringBuffer stringBuffer = new StringBuffer();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(" or ");
            }
            stringBuffer.append("path");
            throw new XmlPullParserException("no " + stringBuffer + " defined");
        }
    }

    public final /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public final boolean canApplyTheme() {
        if (this.b != null) {
            C0366a.m1051d(this.b);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r12) {
        /*
        r11 = this;
        r10 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r9 = 0;
        r4 = 1;
        r5 = 0;
        r0 = r11.b;
        if (r0 == 0) goto L_0x0011;
    L_0x000b:
        r0 = r11.b;
        r0.draw(r12);
    L_0x0010:
        return;
    L_0x0011:
        r0 = r11.f158k;
        r11.copyBounds(r0);
        r0 = r11.f158k;
        r0 = r0.width();
        if (r0 <= 0) goto L_0x0010;
    L_0x001e:
        r0 = r11.f158k;
        r0 = r0.height();
        if (r0 <= 0) goto L_0x0010;
    L_0x0026:
        r0 = r11.f153f;
        if (r0 != 0) goto L_0x0107;
    L_0x002a:
        r0 = r11.f152e;
    L_0x002c:
        r1 = r11.f157j;
        r12.getMatrix(r1);
        r1 = r11.f157j;
        r3 = r11.f156i;
        r1.getValues(r3);
        r1 = r11.f156i;
        r1 = r1[r5];
        r3 = java.lang.Math.abs(r1);
        r1 = r11.f156i;
        r6 = 4;
        r1 = r1[r6];
        r1 = java.lang.Math.abs(r1);
        r6 = r11.f156i;
        r6 = r6[r4];
        r6 = java.lang.Math.abs(r6);
        r7 = r11.f156i;
        r8 = 3;
        r7 = r7[r8];
        r7 = java.lang.Math.abs(r7);
        r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1));
        if (r6 != 0) goto L_0x0062;
    L_0x005e:
        r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r6 == 0) goto L_0x0064;
    L_0x0062:
        r1 = r2;
        r3 = r2;
    L_0x0064:
        r6 = r11.f158k;
        r6 = r6.width();
        r6 = (float) r6;
        r3 = r3 * r6;
        r3 = (int) r3;
        r6 = r11.f158k;
        r6 = r6.height();
        r6 = (float) r6;
        r1 = r1 * r6;
        r1 = (int) r1;
        r3 = java.lang.Math.min(r10, r3);
        r6 = java.lang.Math.min(r10, r1);
        if (r3 <= 0) goto L_0x0010;
    L_0x0080:
        if (r6 <= 0) goto L_0x0010;
    L_0x0082:
        r7 = r12.save();
        r1 = r11.f158k;
        r1 = r1.left;
        r1 = (float) r1;
        r8 = r11.f158k;
        r8 = r8.top;
        r8 = (float) r8;
        r12.translate(r1, r8);
        r1 = android.os.Build.VERSION.SDK_INT;
        r8 = 17;
        if (r1 < r8) goto L_0x010d;
    L_0x0099:
        r1 = r11.isAutoMirrored();
        if (r1 == 0) goto L_0x010b;
    L_0x009f:
        r1 = android.support.v4.p006a.p007a.C0366a.m1056i(r11);
        if (r1 != r4) goto L_0x010b;
    L_0x00a5:
        r1 = r4;
    L_0x00a6:
        if (r1 == 0) goto L_0x00b7;
    L_0x00a8:
        r1 = r11.f158k;
        r1 = r1.width();
        r1 = (float) r1;
        r12.translate(r1, r9);
        r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r12.scale(r1, r2);
    L_0x00b7:
        r1 = r11.f158k;
        r1.offsetTo(r5, r5);
        r2 = r11.f150c;
        r1 = r2.f141f;
        if (r1 == 0) goto L_0x00d5;
    L_0x00c2:
        r1 = r2.f141f;
        r1 = r1.getWidth();
        if (r3 != r1) goto L_0x010f;
    L_0x00ca:
        r1 = r2.f141f;
        r1 = r1.getHeight();
        if (r6 != r1) goto L_0x010f;
    L_0x00d2:
        r1 = r4;
    L_0x00d3:
        if (r1 != 0) goto L_0x00df;
    L_0x00d5:
        r1 = android.graphics.Bitmap.Config.ARGB_8888;
        r1 = android.graphics.Bitmap.createBitmap(r3, r6, r1);
        r2.f141f = r1;
        r2.f146k = r4;
    L_0x00df:
        r1 = r11.f151d;
        if (r1 != 0) goto L_0x0111;
    L_0x00e3:
        r1 = r11.f150c;
        r1.m86a(r3, r6);
    L_0x00e8:
        r2 = r11.f150c;
        r3 = r11.f158k;
        r1 = r2.f137b;
        r1 = r1.getRootAlpha();
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r1 >= r6) goto L_0x0156;
    L_0x00f6:
        r1 = r4;
    L_0x00f7:
        if (r1 != 0) goto L_0x0158;
    L_0x00f9:
        if (r0 != 0) goto L_0x0158;
    L_0x00fb:
        r0 = 0;
    L_0x00fc:
        r1 = r2.f141f;
        r2 = 0;
        r12.drawBitmap(r1, r2, r3, r0);
        r12.restoreToCount(r7);
        goto L_0x0010;
    L_0x0107:
        r0 = r11.f153f;
        goto L_0x002c;
    L_0x010b:
        r1 = r5;
        goto L_0x00a6;
    L_0x010d:
        r1 = r5;
        goto L_0x00a6;
    L_0x010f:
        r1 = r5;
        goto L_0x00d3;
    L_0x0111:
        r1 = r11.f150c;
        r2 = r1.f146k;
        if (r2 != 0) goto L_0x0154;
    L_0x0117:
        r2 = r1.f142g;
        r8 = r1.f138c;
        if (r2 != r8) goto L_0x0154;
    L_0x011d:
        r2 = r1.f143h;
        r8 = r1.f139d;
        if (r2 != r8) goto L_0x0154;
    L_0x0123:
        r2 = r1.f145j;
        r8 = r1.f140e;
        if (r2 != r8) goto L_0x0154;
    L_0x0129:
        r2 = r1.f144i;
        r1 = r1.f137b;
        r1 = r1.getRootAlpha();
        if (r2 != r1) goto L_0x0154;
    L_0x0133:
        r1 = r4;
    L_0x0134:
        if (r1 != 0) goto L_0x00e8;
    L_0x0136:
        r1 = r11.f150c;
        r1.m86a(r3, r6);
        r1 = r11.f150c;
        r2 = r1.f138c;
        r1.f142g = r2;
        r2 = r1.f139d;
        r1.f143h = r2;
        r2 = r1.f137b;
        r2 = r2.getRootAlpha();
        r1.f144i = r2;
        r2 = r1.f140e;
        r1.f145j = r2;
        r1.f146k = r5;
        goto L_0x00e8;
    L_0x0154:
        r1 = r5;
        goto L_0x0134;
    L_0x0156:
        r1 = r5;
        goto L_0x00f7;
    L_0x0158:
        r1 = r2.f147l;
        if (r1 != 0) goto L_0x0168;
    L_0x015c:
        r1 = new android.graphics.Paint;
        r1.<init>();
        r2.f147l = r1;
        r1 = r2.f147l;
        r1.setFilterBitmap(r4);
    L_0x0168:
        r1 = r2.f147l;
        r4 = r2.f137b;
        r4 = r4.getRootAlpha();
        r1.setAlpha(r4);
        r1 = r2.f147l;
        r1.setColorFilter(r0);
        r0 = r2.f147l;
        goto L_0x00fc;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.b.a.i.draw(android.graphics.Canvas):void");
    }

    public final int getAlpha() {
        return this.b != null ? C0366a.m1050c(this.b) : this.f150c.f137b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        return this.b != null ? this.b.getChangingConfigurations() : super.getChangingConfigurations() | this.f150c.getChangingConfigurations();
    }

    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public final ConstantState getConstantState() {
        if (this.b != null && VERSION.SDK_INT >= 24) {
            return new C0074g(this.b.getConstantState());
        }
        this.f150c.f136a = getChangingConfigurations();
        return this.f150c;
    }

    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.b != null ? this.b.getIntrinsicHeight() : (int) this.f150c.f137b.f123c;
    }

    public final int getIntrinsicWidth() {
        return this.b != null ? this.b.getIntrinsicWidth() : (int) this.f150c.f137b.f122b;
    }

    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.b != null ? this.b.getOpacity() : -3;
    }

    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.b != null) {
            this.b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.b != null) {
            C0366a.m1045a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0073f c0073f = this.f150c;
        c0073f.f137b = new C0072e();
        TypedArray a = C0438c.m1162a(resources, theme, attributeSet, C0055a.f61a);
        C0073f c0073f2 = this.f150c;
        C0072e c0072e = c0073f2.f137b;
        int a2 = C0438c.m1161a(a, xmlPullParser, "tintMode", 6, -1);
        Mode mode = Mode.SRC_IN;
        switch (a2) {
            case 3:
                mode = Mode.SRC_OVER;
                break;
            case 5:
                mode = Mode.SRC_IN;
                break;
            case 9:
                mode = Mode.SRC_ATOP;
                break;
            case 14:
                mode = Mode.MULTIPLY;
                break;
            case 15:
                mode = Mode.SCREEN;
                break;
            case 16:
                if (VERSION.SDK_INT >= 11) {
                    mode = Mode.ADD;
                    break;
                }
                break;
        }
        c0073f2.f139d = mode;
        ColorStateList colorStateList = a.getColorStateList(1);
        if (colorStateList != null) {
            c0073f2.f138c = colorStateList;
        }
        c0073f2.f140e = C0438c.m1166a(a, xmlPullParser, "autoMirrored", 5, c0073f2.f140e);
        c0072e.f124d = C0438c.m1157a(a, xmlPullParser, "viewportWidth", 7, c0072e.f124d);
        c0072e.f125e = C0438c.m1157a(a, xmlPullParser, "viewportHeight", 8, c0072e.f125e);
        if (c0072e.f124d <= 0.0f) {
            throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (c0072e.f125e <= 0.0f) {
            throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            c0072e.f122b = a.getDimension(3, c0072e.f122b);
            c0072e.f123c = a.getDimension(2, c0072e.f123c);
            if (c0072e.f122b <= 0.0f) {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (c0072e.f123c <= 0.0f) {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                c0072e.setAlpha(C0438c.m1157a(a, xmlPullParser, "alpha", 4, c0072e.getAlpha()));
                String string = a.getString(0);
                if (string != null) {
                    c0072e.f127g = string;
                    c0072e.f128h.put(string, c0072e);
                }
                a.recycle();
                c0073f.f136a = getChangingConfigurations();
                c0073f.f146k = true;
                m91b(resources, xmlPullParser, attributeSet, theme);
                this.f152e = m88a(c0073f.f138c, c0073f.f139d);
            }
        }
    }

    public final void invalidateSelf() {
        if (this.b != null) {
            this.b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        return this.b != null ? C0366a.m1048b(this.b) : this.f150c.f140e;
    }

    public final boolean isStateful() {
        return this.b != null ? this.b.isStateful() : super.isStateful() || !(this.f150c == null || this.f150c.f138c == null || !this.f150c.f138c.isStateful());
    }

    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        } else if (!this.f154g && super.mutate() == this) {
            this.f150c = new C0073f(this.f150c);
            this.f154g = true;
        }
        return this;
    }

    protected final void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        }
    }

    protected final boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        C0073f c0073f = this.f150c;
        if (c0073f.f138c == null || c0073f.f139d == null) {
            return false;
        }
        this.f152e = m88a(c0073f.f138c, c0073f.f139d);
        invalidateSelf();
        return true;
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        if (this.b != null) {
            this.b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
        } else if (this.f150c.f137b.getRootAlpha() != i) {
            this.f150c.f137b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z) {
        if (this.b != null) {
            C0366a.m1047a(this.b, z);
        } else {
            this.f150c.f140e = z;
        }
    }

    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
            return;
        }
        this.f153f = colorFilter;
        invalidateSelf();
    }

    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public final void setTint(int i) {
        if (this.b != null) {
            C0366a.m1041a(this.b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            C0366a.m1043a(this.b, colorStateList);
            return;
        }
        C0073f c0073f = this.f150c;
        if (c0073f.f138c != colorStateList) {
            c0073f.f138c = colorStateList;
            this.f152e = m88a(colorStateList, c0073f.f139d);
            invalidateSelf();
        }
    }

    public final void setTintMode(Mode mode) {
        if (this.b != null) {
            C0366a.m1046a(this.b, mode);
            return;
        }
        C0073f c0073f = this.f150c;
        if (c0073f.f139d != mode) {
            c0073f.f139d = mode;
            this.f152e = m88a(c0073f.f138c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return this.b != null ? this.b.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        if (this.b != null) {
            this.b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
