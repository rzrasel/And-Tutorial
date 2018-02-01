package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class sq<MessageType extends sq<MessageType, BuilderType>, BuilderType extends sr<MessageType, BuilderType>> extends rt<MessageType, BuilderType> {
    protected ue f6753e = ue.m6701a();
    protected int f6754f = -1;

    protected static <T extends sq<T, ?>> T m6117a(T t, ry ryVar) {
        Object obj = 1;
        T a = m6118a((sq) t, ryVar, sm.m6623a());
        if (a != null) {
            if ((a.mo2219a(sy.f7113a, Boolean.TRUE, null) != null ? 1 : null) == null) {
                tf a2 = new ud().m6700a();
                a2.f7130a = a;
                throw a2;
            }
        }
        if (a != null) {
            if (a.mo2219a(sy.f7113a, Boolean.TRUE, null) == null) {
                obj = null;
            }
            if (obj == null) {
                a2 = new ud().m6700a();
                a2.f7130a = a;
                throw a2;
            }
        }
        return a;
    }

    private static <T extends sq<T, ?>> T m6118a(T t, ry ryVar, sm smVar) {
        T a;
        try {
            si d = ryVar.mo2245d();
            a = m6119a((sq) t, d, smVar);
            d.mo2250a(0);
            return a;
        } catch (tf e) {
            e.f7130a = a;
            throw e;
        } catch (tf e2) {
            throw e2;
        }
    }

    static <T extends sq<T, ?>> T m6119a(T t, si siVar, sm smVar) {
        sq sqVar = (sq) t.mo2219a(sy.f7117e, null, null);
        try {
            sqVar.mo2219a(sy.f7115c, (Object) siVar, (Object) smVar);
            sqVar.mo2219a(sy.f7116d, null, null);
            sqVar.f6753e.f7159a = false;
            return sqVar;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof tf) {
                throw ((tf) e.getCause());
            }
            throw e;
        }
    }

    protected static <T extends sq<T, ?>> T m6120a(T t, byte[] bArr) {
        T a = m6121a((sq) t, bArr, sm.m6623a());
        if (a != null) {
            if ((a.mo2219a(sy.f7113a, Boolean.TRUE, null) != null ? 1 : null) == null) {
                tf a2 = new ud().m6700a();
                a2.f7130a = a;
                throw a2;
            }
        }
        return a;
    }

    private static <T extends sq<T, ?>> T m6121a(T t, byte[] bArr, sm smVar) {
        T a;
        try {
            si a2 = si.m6551a(bArr);
            a = m6119a((sq) t, a2, smVar);
            a2.mo2250a(0);
            return a;
        } catch (tf e) {
            e.f7130a = a;
            throw e;
        } catch (tf e2) {
            throw e2;
        }
    }

    static Object m6122a(Method method, Object obj, Object... objArr) {
        Throwable e;
        try {
            return method.invoke(obj, objArr);
        } catch (Throwable e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            e2 = e3.getCause();
            if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            } else if (e2 instanceof Error) {
                throw ((Error) e2);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", e2);
            }
        }
    }

    protected abstract Object mo2219a(int i, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((sq) mo2219a(sy.f7119g, null, null)).getClass().isInstance(obj)) {
            return false;
        }
        try {
            Object obj2 = st.f7108a;
            obj = (sq) obj;
            mo2219a(sy.f7114b, obj2, obj);
            this.f6753e = obj2.mo2280a(this.f6753e, obj.f6753e);
            return true;
        } catch (su e) {
            return false;
        }
    }

    public int hashCode() {
        if (this.d != 0) {
            return this.d;
        }
        Object swVar = new sw();
        mo2219a(sy.f7114b, swVar, (Object) this);
        this.f6753e = swVar.mo2280a(this.f6753e, this.f6753e);
        this.d = swVar.f7111a;
        return this.d;
    }

    public final /* synthetic */ tm mo2218i() {
        sr srVar = (sr) mo2219a(sy.f7118f, null, null);
        srVar.m6100a(this);
        return srVar;
    }

    public final /* synthetic */ tl mo2215j() {
        return (sq) mo2219a(sy.f7119g, null, null);
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ").append(obj);
        to.m6665a(this, stringBuilder, 0);
        return stringBuilder.toString();
    }
}
