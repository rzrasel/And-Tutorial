package android.support.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

final class C0353t<T> extends Property<T, Float> {
    private final Property<T, PointF> f1353a;
    private final PathMeasure f1354b;
    private final float f1355c;
    private final float[] f1356d = new float[2];
    private final PointF f1357e = new PointF();
    private float f1358f;

    C0353t(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f1353a = property;
        this.f1354b = new PathMeasure(path, false);
        this.f1355c = this.f1354b.getLength();
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(this.f1358f);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        Float f = (Float) obj2;
        this.f1358f = f.floatValue();
        this.f1354b.getPosTan(this.f1355c * f.floatValue(), this.f1356d, null);
        this.f1357e.x = this.f1356d[0];
        this.f1357e.y = this.f1356d[1];
        this.f1353a.set(obj, this.f1357e);
    }
}
