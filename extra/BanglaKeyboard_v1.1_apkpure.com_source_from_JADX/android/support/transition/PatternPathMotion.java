package android.support.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.content.p015a.C0438c;
import android.support.v4.p006a.C0378b;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public class PatternPathMotion extends PathMotion {
    private Path f1207a;
    private final Path f1208b = new Path();
    private final Matrix f1209c = new Matrix();

    public PatternPathMotion() {
        this.f1208b.lineTo(1.0f, 0.0f);
        this.f1207a = this.f1208b;
    }

    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.f1262k);
        try {
            String b = C0438c.m1170b(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (b == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            Path a = C0378b.m1088a(b);
            PathMeasure pathMeasure = new PathMeasure(a, false);
            float[] fArr = new float[2];
            pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
            float f = fArr[0];
            float f2 = fArr[1];
            pathMeasure.getPosTan(0.0f, fArr, null);
            float f3 = fArr[0];
            float f4 = fArr[1];
            if (f3 == f && f4 == f2) {
                throw new IllegalArgumentException("pattern must not end at the starting point");
            }
            this.f1209c.setTranslate(-f3, -f4);
            f3 = f - f3;
            f = f2 - f4;
            f4 = 1.0f / m842a(f3, f);
            this.f1209c.postScale(f4, f4);
            this.f1209c.postRotate((float) Math.toDegrees(-Math.atan2((double) f, (double) f3)));
            a.transform(this.f1209c, this.f1208b);
            this.f1207a = a;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static float m842a(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    public final Path mo206a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float a = m842a(f5, f6);
        double atan2 = Math.atan2((double) f6, (double) f5);
        this.f1209c.setScale(a, a);
        this.f1209c.postRotate((float) Math.toDegrees(atan2));
        this.f1209c.postTranslate(f, f2);
        Path path = new Path();
        this.f1208b.transform(this.f1209c, path);
        return path;
    }
}
