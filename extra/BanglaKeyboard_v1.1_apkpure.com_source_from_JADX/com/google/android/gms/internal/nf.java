package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class nf extends nd {
    private static Object f6692q = new Object();
    private static final String f6693s = nf.class.getSimpleName();
    private static volatile np f6694t = null;
    private static boolean f6695u = false;
    private static long f6696v = 0;
    protected boolean f6697r = false;
    private String f6698w;
    private boolean f6699x = false;
    private boolean f6700y = false;

    protected nf(Context context, String str) {
        super(context);
        this.f6698w = str;
        this.f6697r = false;
    }

    protected nf(Context context, String str, boolean z) {
        super(context);
        this.f6698w = str;
        this.f6697r = z;
    }

    private static oc m6042a(np npVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Throwable e;
        Method a = npVar.m6084a("ygCdsTTZXV3+pKeG4AbJxXRh6cnpj4gIRQp992ITXJ2kOEn/wIDO43cEX0qxaYsR", "EQeavYmjA7YFf1xkDcAPwi/b9mCo00wJJ6wAk4upngA=");
        if (a == null || motionEvent == null) {
            throw new nl();
        }
        try {
            return new oc((String) a.invoke(null, new Object[]{motionEvent, displayMetrics}));
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new nl(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new nl(e);
        }
    }

    protected static synchronized void m6043a(Context context, boolean z) {
        synchronized (nf.class) {
            if (!f6695u) {
                f6696v = pd.m6372a().longValue() / 1000;
                f6694t = m6045b(context, z);
                f6695u = true;
            }
        }
    }

    protected static void m6044a(List<Callable<Void>> list) {
        if (f6694t != null) {
            ExecutorService executorService = f6694t.f6729c;
            if (executorService != null && !list.isEmpty()) {
                try {
                    executorService.invokeAll(list, ((Long) zzbv.zzen().m4217a(ado.bm)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable e) {
                    String.format("class methods got exception: %s", new Object[]{pd.m6374a(e)});
                }
            }
        }
    }

    private static np m6045b(Context context, boolean z) {
        if (f6694t == null) {
            synchronized (f6692q) {
                if (f6694t == null) {
                    np a = np.m6075a(context, "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", z);
                    if (a.f6738l) {
                        a.m6086a("o7w7nD7659+FI5Gilkma9hcgrpF/prpHxl2mnzxedqbbyjgIpTwyk4wm6GfrdKne", "jmFYtmBsx6R0EkdxirPelCZXWeKwTC3D/yN9KFqdR9U=", Context.class);
                        a.m6086a("VLkZqKvDA3cRwlx9MsWkMJnpidWk/znw/5BRTUP94x2Bk2TCqV+q9ppmO0GguXNG", "/OzAFdlY3ZeznSLI5iyZCu7HHQuOARCtWi9GZTYh468=", Context.class);
                        a.m6086a("Q9PFG7p+gtOGJNQ3K8AWJdhJ2ZBvHFXdZbD//tmkbKJjl+jIEfDp7MQcwDFn/dtY", "Xdpxuv1x6vK7sOSqLM0WlTggYCbi8FF3OeBYQqyqaFM=", Context.class);
                        a.m6086a("jZyE4h4IDcCQ3j9NvhAGxc08tvf/DK6+sAwFxYtpzlVleWs2+Zk4Y5r7QSzgXn5p", "t3fHsDBJEcoGUt40Ozr8wKJ5AsCX2GIE8nf4RWy66T0=", Context.class);
                        a.m6086a("eoU493RkM7R4WOdjlRU82HCehCu78tBpgm8BoKx5O4l/qNRY1EPxjvc9qN4UMskS", "CV8Mx/7dgmcB42OQ/I0LtJ3pegaIzCPMdWZal1Z+YT4=", Context.class);
                        a.m6086a("wnss2YyVc6IIlgSPoidKgKatWex0wSwrSTLhWJc4xfk4qAZd0LovLKGDwZXqm63c", "FGU6TWbuBbz12v45zcmhHZcHGUbztxqnWPLoLh17+g4=", Context.class);
                        a.m6086a("FvrDQ4lEx5n9I1DH69M9lh3Ia/ydGeT8xNWNOXnj/DomXii38qXaxDcrWfn+DNxv", "PNWkIO/zuWzWNf21+ZLPueoGEZBbCtJBXnochI8jTrA=", Context.class);
                        a.m6086a("eBlXULj2SfPyyTYi+WsSK+4RHAIcJGBTNYaSFL3i4w/M5uZRUXvcjd+Oo5oM0CDn", "e6yAgbH+Yjnryy5VV0LGAc90cKOHsIQIEhzMbQKLMxo=", Context.class);
                        a.m6086a("ygCdsTTZXV3+pKeG4AbJxXRh6cnpj4gIRQp992ITXJ2kOEn/wIDO43cEX0qxaYsR", "EQeavYmjA7YFf1xkDcAPwi/b9mCo00wJJ6wAk4upngA=", MotionEvent.class, DisplayMetrics.class);
                        a.m6086a("jFy9bazmsqZNnU+SOelqvcHRAcN0JhqFX/zDzZ2nUnGcxX0Spncn5swbKLh6u0Gt", "D2hDwu8k1CYptMjaTTU4d9K8gWl5lr87Q0l2g2nOgpM=", MotionEvent.class, DisplayMetrics.class, Integer.TYPE);
                        a.m6086a("A+FtVw6Hq5+xXA4LpOJFov2bHOtsbsAM798tuf7tXjLIs400/k8OfSt1HPsZYL38", "R2IQMV5n3FLJT8fpZrGrc2j0YfJTGvq4G59Wd9bOgMo=", new Class[0]);
                        a.m6086a("M6cmL8dEM3pC1/BuZOmw1itHqHFOjd7WCjmW2OjN7ycZM15DO3ld/1uohUYLPJr1", "WlOvJU6+3e5WzJSTHA241Yi0b8taxohsatY6w1v0DLI=", new Class[0]);
                        a.m6086a("yZkws58bjLH9BQzzhTscQavrDUmMhoUIHj7Ma+Jgaf5FcdMVaZbW35d1Bj//fHDn", "MgQyZXlSdQWpUGa1KCPj2EeBe6JSXqLF3tA3mmNLHWw=", new Class[0]);
                        a.m6086a("htRTACCFqbbo7nI7rdgYiKqPRGXDde+UtAUxAlFOWNcGpl+SQlm1R/xANMFF3PZ0", "G552UZM6vLxpyesLn1gIplGUWK2PfjKQh5kqFN/Vapc=", new Class[0]);
                        a.m6086a("BtPauBnIwlk2K/6/CO1BBb2FR0sQwKY1S8D9RWDKA7HvOebtOHvYKk4QiKz/dcNO", "w65qTZxr1huopC2qMqX6EhFPjLQqPO2ifW47xUzMKqM=", new Class[0]);
                        a.m6086a("6J7UXF/9s98mxgN2k8LJAMo8Jnojnkig8rXVLlQN/N+V9kdUyM2qIu1aRKegSFMQ", "hH0f8LOFP14Bm7QHfoIfdhe5U9q/i2lMAd+n/1qrtZg=", new Class[0]);
                        a.m6086a("jhxdcPGDU4Mj38uT48Aaf8gYgb5lDOh2rW5r+MF76l664JxVbs8kGH8+nDmsBndo", "6u6A0c4EKS76sO3dkSviPN5o1zW6U7vrO9aegTSrCis=", Context.class, Boolean.TYPE);
                        a.m6086a("NOrz61+PseGR2sm7U+tZ21smqV//fb8QBKFv7Pi6OR8dH1e8wSOLfw3Ph4C0Yse5", "c4Ak+f+wsMlKq1bsPKMrPaeRnhQ+UV2SlCrE5FNevrI=", StackTraceElement[].class);
                        a.m6086a("1thxXj1VAD9VF+8IJT2ly5yy3w+W3oBAY1zSRv/S6kcxOQyTGi1docSw1td7RAYO", "boJ8cLPyu4TqtPUQl7O7Gwo5cPcTz5+VK6ce/40Yrsk=", View.class, DisplayMetrics.class, Boolean.TYPE);
                    }
                    f6694t = a;
                }
            }
        }
        return f6694t;
    }

    protected final long mo2204a(StackTraceElement[] stackTraceElementArr) {
        Throwable e;
        Method a = f6694t.m6084a("NOrz61+PseGR2sm7U+tZ21smqV//fb8QBKFv7Pi6OR8dH1e8wSOLfw3Ph4C0Yse5", "c4Ak+f+wsMlKq1bsPKMrPaeRnhQ+UV2SlCrE5FNevrI=");
        if (a == null || stackTraceElementArr == null) {
            throw new nl();
        }
        try {
            return new nn((String) a.invoke(null, new Object[]{stackTraceElementArr})).f6719a.longValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new nl(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new nl(e);
        }
    }

    protected kz mo2205a(Context context, View view) {
        List asList;
        kz kzVar = new kz();
        if (!TextUtils.isEmpty(this.f6698w)) {
            kzVar.f6455b = this.f6698w;
        }
        np b = m6045b(context, this.f6697r);
        if (b.f6738l) {
            oc a;
            int intValue;
            try {
                a = m6042a(b, this.a, this.p);
                kzVar.f6460g = a.f6803a;
                kzVar.f6461h = a.f6804b;
                kzVar.f6462i = a.f6805c;
                if (this.o) {
                    kzVar.f6474u = a.f6806d;
                    kzVar.f6475v = a.f6807e;
                }
            } catch (nl e) {
            }
            la laVar = new la();
            if (this.c > 0 && pd.m6375a(this.p)) {
                intValue = ((Integer) zzbv.zzen().m4217a(ado.bq)).intValue();
                if (((Boolean) zzbv.zzen().m4217a(ado.br)).booleanValue()) {
                    laVar.f6541m = Long.valueOf(pd.m6371a(this.j, intValue, this.p));
                }
                if (((Boolean) zzbv.zzen().m4217a(ado.bs)).booleanValue()) {
                    laVar.f6542n = Long.valueOf(pd.m6371a((double) (this.m - this.k), intValue, this.p));
                    laVar.f6543o = Long.valueOf(pd.m6371a((double) (this.n - this.l), intValue, this.p));
                    laVar.f6546r = Long.valueOf(pd.m6371a((double) this.k, intValue, this.p));
                    laVar.f6547s = Long.valueOf(pd.m6371a((double) this.l, intValue, this.p));
                }
                if (((Boolean) zzbv.zzen().m4217a(ado.bu)).booleanValue() && this.o && this.a != null) {
                    long a2 = pd.m6371a((double) (((this.k - this.m) + this.a.getRawX()) - this.a.getX()), intValue, this.p);
                    if (a2 != 0) {
                        laVar.f6544p = Long.valueOf(a2);
                    }
                    a2 = pd.m6371a((double) (((this.l - this.n) + this.a.getRawY()) - this.a.getY()), intValue, this.p);
                    if (a2 != 0) {
                        laVar.f6545q = Long.valueOf(a2);
                    }
                }
            }
            try {
                oc a3 = mo2207a(this.a);
                laVar.f6529a = a3.f6803a;
                laVar.f6530b = a3.f6804b;
                if (((Boolean) zzbv.zzen().m4217a(ado.bt)).booleanValue()) {
                    laVar.f6548t = a3.f6814l;
                    laVar.f6549u = a3.f6815m;
                }
                laVar.f6536h = a3.f6805c;
                if (this.o) {
                    laVar.f6531c = a3.f6807e;
                    laVar.f6533e = a3.f6806d;
                    laVar.f6535g = Integer.valueOf(a3.f6808f.longValue() != 0 ? 1 : 0);
                    if (this.d > 0) {
                        laVar.f6532d = pd.m6375a(this.p) ? Long.valueOf(Math.round(((double) this.i) / ((double) this.d))) : null;
                        laVar.f6534f = Long.valueOf(Math.round(((double) this.h) / ((double) this.d)));
                    }
                    laVar.f6538j = a3.f6811i;
                    laVar.f6537i = a3.f6812j;
                    laVar.f6539k = Integer.valueOf(a3.f6813k.longValue() != 0 ? 1 : 0);
                }
            } catch (nl e2) {
            }
            if (this.g > 0) {
                laVar.f6540l = Long.valueOf(this.g);
            }
            kzVar.f6439J = laVar;
            if (this.c > 0) {
                kzVar.f6478y = Long.valueOf(this.c);
            }
            if (this.d > 0) {
                kzVar.f6477x = Long.valueOf(this.d);
            }
            if (this.e > 0) {
                kzVar.f6476w = Long.valueOf(this.e);
            }
            if (this.f > 0) {
                kzVar.f6479z = Long.valueOf(this.f);
            }
            try {
                intValue = this.b.size() - 1;
                if (intValue > 0) {
                    kzVar.f6440K = new la[intValue];
                    for (int i = 0; i < intValue; i++) {
                        a = m6042a(f6694t, (MotionEvent) this.b.get(i), this.p);
                        la laVar2 = new la();
                        laVar2.f6529a = a.f6803a;
                        laVar2.f6530b = a.f6804b;
                        kzVar.f6440K[i] = laVar2;
                    }
                }
            } catch (nl e3) {
                kzVar.f6440K = null;
            }
            ArrayList arrayList = new ArrayList();
            Object obj;
            if (b.f6729c == null) {
                obj = arrayList;
            } else {
                int d = b.m6090d();
                arrayList.add(new re(b, kzVar));
                arrayList.add(new rh(b, "yZkws58bjLH9BQzzhTscQavrDUmMhoUIHj7Ma+Jgaf5FcdMVaZbW35d1Bj//fHDn", "MgQyZXlSdQWpUGa1KCPj2EeBe6JSXqLF3tA3mmNLHWw=", kzVar, d));
                arrayList.add(new rc(b, "A+FtVw6Hq5+xXA4LpOJFov2bHOtsbsAM798tuf7tXjLIs400/k8OfSt1HPsZYL38", "R2IQMV5n3FLJT8fpZrGrc2j0YfJTGvq4G59Wd9bOgMo=", kzVar, f6696v, d));
                arrayList.add(new rb(b, "htRTACCFqbbo7nI7rdgYiKqPRGXDde+UtAUxAlFOWNcGpl+SQlm1R/xANMFF3PZ0", "G552UZM6vLxpyesLn1gIplGUWK2PfjKQh5kqFN/Vapc=", kzVar, d));
                if (((Boolean) zzbv.zzen().m4217a(ado.bp)).booleanValue()) {
                    arrayList.add(new rg(b, "eoU493RkM7R4WOdjlRU82HCehCu78tBpgm8BoKx5O4l/qNRY1EPxjvc9qN4UMskS", "CV8Mx/7dgmcB42OQ/I0LtJ3pegaIzCPMdWZal1Z+YT4=", kzVar, d));
                }
                arrayList.add(new qw(b, "wnss2YyVc6IIlgSPoidKgKatWex0wSwrSTLhWJc4xfk4qAZd0LovLKGDwZXqm63c", "FGU6TWbuBbz12v45zcmhHZcHGUbztxqnWPLoLh17+g4=", kzVar, d));
                arrayList.add(new rf(b, "BtPauBnIwlk2K/6/CO1BBb2FR0sQwKY1S8D9RWDKA7HvOebtOHvYKk4QiKz/dcNO", "w65qTZxr1huopC2qMqX6EhFPjLQqPO2ifW47xUzMKqM=", kzVar, d));
                arrayList.add(new ra(b, "jZyE4h4IDcCQ3j9NvhAGxc08tvf/DK6+sAwFxYtpzlVleWs2+Zk4Y5r7QSzgXn5p", "t3fHsDBJEcoGUt40Ozr8wKJ5AsCX2GIE8nf4RWy66T0=", kzVar, d));
                arrayList.add(new rm(b, "FvrDQ4lEx5n9I1DH69M9lh3Ia/ydGeT8xNWNOXnj/DomXii38qXaxDcrWfn+DNxv", "PNWkIO/zuWzWNf21+ZLPueoGEZBbCtJBXnochI8jTrA=", kzVar, d));
                arrayList.add(new qx(b, "eBlXULj2SfPyyTYi+WsSK+4RHAIcJGBTNYaSFL3i4w/M5uZRUXvcjd+Oo5oM0CDn", "e6yAgbH+Yjnryy5VV0LGAc90cKOHsIQIEhzMbQKLMxo=", kzVar, d));
                arrayList.add(new rk(b, "6J7UXF/9s98mxgN2k8LJAMo8Jnojnkig8rXVLlQN/N+V9kdUyM2qIu1aRKegSFMQ", "hH0f8LOFP14Bm7QHfoIfdhe5U9q/i2lMAd+n/1qrtZg=", kzVar, d));
                arrayList.add(new rj(b, "NOrz61+PseGR2sm7U+tZ21smqV//fb8QBKFv7Pi6OR8dH1e8wSOLfw3Ph4C0Yse5", "c4Ak+f+wsMlKq1bsPKMrPaeRnhQ+UV2SlCrE5FNevrI=", kzVar, d, new Throwable().getStackTrace()));
                arrayList.add(new ro(b, "1thxXj1VAD9VF+8IJT2ly5yy3w+W3oBAY1zSRv/S6kcxOQyTGi1docSw1td7RAYO", "boJ8cLPyu4TqtPUQl7O7Gwo5cPcTz5+VK6ce/40Yrsk=", kzVar, d, view));
                obj = arrayList;
            }
        } else {
            kzVar.f6464k = Long.valueOf(16384);
            asList = Arrays.asList(new Callable[]{new re(b, kzVar)});
        }
        m6044a(asList);
        return kzVar;
    }

    protected final kz mo2206a(Context context, kw kwVar) {
        kz kzVar = new kz();
        if (!TextUtils.isEmpty(this.f6698w)) {
            kzVar.f6455b = this.f6698w;
        }
        mo2208a(m6045b(context, this.f6697r), kzVar, kwVar);
        return kzVar;
    }

    protected final oc mo2207a(MotionEvent motionEvent) {
        Throwable e;
        Method a = f6694t.m6084a("jFy9bazmsqZNnU+SOelqvcHRAcN0JhqFX/zDzZ2nUnGcxX0Spncn5swbKLh6u0Gt", "D2hDwu8k1CYptMjaTTU4d9K8gWl5lr87Q0l2g2nOgpM=");
        if (a == null || motionEvent == null) {
            throw new nl();
        }
        try {
            Object[] objArr = new Object[3];
            objArr[0] = motionEvent;
            objArr[1] = this.p;
            objArr[2] = zzbv.zzen().m4217a(ado.bq);
            return new oc((String) a.invoke(null, objArr));
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new nl(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new nl(e);
        }
    }

    protected void mo2208a(np npVar, kz kzVar, kw kwVar) {
        if (npVar.f6729c != null) {
            m6044a(mo2209b(npVar, kzVar, kwVar));
        }
    }

    protected List<Callable<Void>> mo2209b(np npVar, kz kzVar, kw kwVar) {
        int d = npVar.m6090d();
        ArrayList arrayList = new ArrayList();
        if (npVar.f6738l) {
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new qz(npVar, "jhxdcPGDU4Mj38uT48Aaf8gYgb5lDOh2rW5r+MF76l664JxVbs8kGH8+nDmsBndo", "6u6A0c4EKS76sO3dkSviPN5o1zW6U7vrO9aegTSrCis=", kzVar, d, kwVar));
            arrayList2 = arrayList;
            arrayList2.add(new rc(npVar, "A+FtVw6Hq5+xXA4LpOJFov2bHOtsbsAM798tuf7tXjLIs400/k8OfSt1HPsZYL38", "R2IQMV5n3FLJT8fpZrGrc2j0YfJTGvq4G59Wd9bOgMo=", kzVar, f6696v, d));
            arrayList2 = arrayList;
            arrayList2.add(new rh(npVar, "yZkws58bjLH9BQzzhTscQavrDUmMhoUIHj7Ma+Jgaf5FcdMVaZbW35d1Bj//fHDn", "MgQyZXlSdQWpUGa1KCPj2EeBe6JSXqLF3tA3mmNLHWw=", kzVar, d));
            arrayList2 = arrayList;
            arrayList2.add(new ri(npVar, "Q9PFG7p+gtOGJNQ3K8AWJdhJ2ZBvHFXdZbD//tmkbKJjl+jIEfDp7MQcwDFn/dtY", "Xdpxuv1x6vK7sOSqLM0WlTggYCbi8FF3OeBYQqyqaFM=", kzVar, d));
            arrayList2 = arrayList;
            arrayList2.add(new rl(npVar, "M6cmL8dEM3pC1/BuZOmw1itHqHFOjd7WCjmW2OjN7ycZM15DO3ld/1uohUYLPJr1", "WlOvJU6+3e5WzJSTHA241Yi0b8taxohsatY6w1v0DLI=", kzVar, d));
            arrayList2 = arrayList;
            arrayList2.add(new qy(npVar, "VLkZqKvDA3cRwlx9MsWkMJnpidWk/znw/5BRTUP94x2Bk2TCqV+q9ppmO0GguXNG", "/OzAFdlY3ZeznSLI5iyZCu7HHQuOARCtWi9GZTYh468=", kzVar, d));
            arrayList2 = arrayList;
            arrayList2.add(new ra(npVar, "jZyE4h4IDcCQ3j9NvhAGxc08tvf/DK6+sAwFxYtpzlVleWs2+Zk4Y5r7QSzgXn5p", "t3fHsDBJEcoGUt40Ozr8wKJ5AsCX2GIE8nf4RWy66T0=", kzVar, d));
            arrayList2 = arrayList;
            arrayList2.add(new rg(npVar, "eoU493RkM7R4WOdjlRU82HCehCu78tBpgm8BoKx5O4l/qNRY1EPxjvc9qN4UMskS", "CV8Mx/7dgmcB42OQ/I0LtJ3pegaIzCPMdWZal1Z+YT4=", kzVar, d));
            arrayList2 = arrayList;
            arrayList2.add(new qw(npVar, "wnss2YyVc6IIlgSPoidKgKatWex0wSwrSTLhWJc4xfk4qAZd0LovLKGDwZXqm63c", "FGU6TWbuBbz12v45zcmhHZcHGUbztxqnWPLoLh17+g4=", kzVar, d));
            arrayList2 = arrayList;
            arrayList2.add(new rb(npVar, "htRTACCFqbbo7nI7rdgYiKqPRGXDde+UtAUxAlFOWNcGpl+SQlm1R/xANMFF3PZ0", "G552UZM6vLxpyesLn1gIplGUWK2PfjKQh5kqFN/Vapc=", kzVar, d));
            arrayList2 = arrayList;
            arrayList2.add(new rf(npVar, "BtPauBnIwlk2K/6/CO1BBb2FR0sQwKY1S8D9RWDKA7HvOebtOHvYKk4QiKz/dcNO", "w65qTZxr1huopC2qMqX6EhFPjLQqPO2ifW47xUzMKqM=", kzVar, d));
            arrayList2 = arrayList;
            arrayList2.add(new rm(npVar, "FvrDQ4lEx5n9I1DH69M9lh3Ia/ydGeT8xNWNOXnj/DomXii38qXaxDcrWfn+DNxv", "PNWkIO/zuWzWNf21+ZLPueoGEZBbCtJBXnochI8jTrA=", kzVar, d));
            arrayList2 = arrayList;
            arrayList2.add(new qx(npVar, "eBlXULj2SfPyyTYi+WsSK+4RHAIcJGBTNYaSFL3i4w/M5uZRUXvcjd+Oo5oM0CDn", "e6yAgbH+Yjnryy5VV0LGAc90cKOHsIQIEhzMbQKLMxo=", kzVar, d));
            arrayList2 = arrayList;
            arrayList2.add(new rk(npVar, "6J7UXF/9s98mxgN2k8LJAMo8Jnojnkig8rXVLlQN/N+V9kdUyM2qIu1aRKegSFMQ", "hH0f8LOFP14Bm7QHfoIfdhe5U9q/i2lMAd+n/1qrtZg=", kzVar, d));
            return arrayList;
        }
        kzVar.f6464k = Long.valueOf(16384);
        return arrayList;
    }
}
