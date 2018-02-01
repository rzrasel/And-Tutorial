package android.support.p004b.p005a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.content.p015a.C0438c;
import android.support.v4.p006a.C0378b;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

public final class C0067g implements Interpolator {
    private float[] f89a;
    private float[] f90b;

    public C0067g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private C0067g(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0438c.m1162a(resources, theme, attributeSet, C0055a.f72l);
        if (C0438c.m1167a(xmlPullParser, "pathData")) {
            String b = C0438c.m1170b(a, xmlPullParser, "pathData", 4);
            Path a2 = C0378b.m1088a(b);
            if (a2 == null) {
                throw new InflateException("The path is null, which is created from " + b);
            }
            m73a(a2);
        } else if (!C0438c.m1167a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C0438c.m1167a(xmlPullParser, "controlY1")) {
            float a3 = C0438c.m1157a(a, xmlPullParser, "controlX1", 0, 0.0f);
            float a4 = C0438c.m1157a(a, xmlPullParser, "controlY1", 1, 0.0f);
            boolean a5 = C0438c.m1167a(xmlPullParser, "controlX2");
            if (a5 != C0438c.m1167a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (a5) {
                float a6 = C0438c.m1157a(a, xmlPullParser, "controlX2", 2, 0.0f);
                float a7 = C0438c.m1157a(a, xmlPullParser, "controlY2", 3, 0.0f);
                r0 = new Path();
                r0.moveTo(0.0f, 0.0f);
                r0.cubicTo(a3, a4, a6, a7, 1.0f, 1.0f);
                m73a(r0);
            } else {
                r0 = new Path();
                r0.moveTo(0.0f, 0.0f);
                r0.quadTo(a3, a4, 1.0f, 1.0f);
                m73a(r0);
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        a.recycle();
    }

    private void m73a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        int i2;
        this.f89a = new float[min];
        this.f90b = new float[min];
        float[] fArr = new float[2];
        for (i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, null);
            this.f89a[i2] = fArr[0];
            this.f90b[i2] = fArr[1];
        }
        if (((double) Math.abs(this.f89a[0])) > 1.0E-5d || ((double) Math.abs(this.f90b[0])) > 1.0E-5d || ((double) Math.abs(this.f89a[min - 1] - 1.0f)) > 1.0E-5d || ((double) Math.abs(this.f90b[min - 1] - 1.0f)) > 1.0E-5d) {
            throw new IllegalArgumentException("The Path must start at (0,0) and end at (1,1) start: " + this.f89a[0] + "," + this.f90b[0] + " end:" + this.f89a[min - 1] + "," + this.f90b[min - 1]);
        }
        float f = 0.0f;
        i2 = 0;
        while (i < min) {
            int i3 = i2 + 1;
            float f2 = this.f89a[i2];
            if (f2 < f) {
                throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
            }
            this.f89a[i] = f2;
            i++;
            f = f2;
            i2 = i3;
        }
        if (pathMeasure.nextContour()) {
            throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
        }
    }

    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.f89a.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f89a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.f89a[length] - this.f89a[i];
        if (f2 == 0.0f) {
            return this.f90b[i];
        }
        float f3 = (f - this.f89a[i]) / f2;
        f2 = this.f90b[i];
        return (f3 * (this.f90b[length] - f2)) + f2;
    }
}
