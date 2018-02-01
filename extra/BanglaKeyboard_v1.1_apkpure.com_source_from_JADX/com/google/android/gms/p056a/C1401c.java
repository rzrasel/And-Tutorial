package com.google.android.gms.p056a;

import android.os.IBinder;
import com.google.android.gms.p056a.C1398a.C1399a;
import java.lang.reflect.Field;

public final class C1401c<T> extends C1399a {
    private final T f3915a;

    private C1401c(T t) {
        this.f3915a = t;
    }

    public static <T> C1398a m3584a(T t) {
        return new C1401c(t);
    }

    public static <T> T m3585a(C1398a c1398a) {
        int i = 0;
        if (c1398a instanceof C1401c) {
            return ((C1401c) c1398a).f3915a;
        }
        IBinder asBinder = c1398a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int length = declaredFields.length;
        int i2 = 0;
        while (i2 < length) {
            Field field2 = declaredFields[i2];
            if (field2.isSynthetic()) {
                field2 = field;
            } else {
                i++;
            }
            i2++;
            field = field2;
        }
        if (i != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        } else if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        } else {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (Throwable e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (Throwable e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        }
    }
}
