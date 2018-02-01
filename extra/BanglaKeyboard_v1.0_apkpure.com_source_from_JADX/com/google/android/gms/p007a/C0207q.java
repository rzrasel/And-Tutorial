package com.google.android.gms.p007a;

import android.os.IBinder;
import java.lang.reflect.Field;

public final class C0207q extends C0205o {
    private final Object f409a;

    private C0207q(Object obj) {
        this.f409a = obj;
    }

    public static C0204n m863a(Object obj) {
        return new C0207q(obj);
    }

    public static Object m864a(C0204n c0204n) {
        if (c0204n instanceof C0207q) {
            return ((C0207q) c0204n).f409a;
        }
        IBinder asBinder = c0204n.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (field.isAccessible()) {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (Throwable e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (Throwable e2) {
                throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
            } catch (Throwable e22) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e22);
            }
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
}
