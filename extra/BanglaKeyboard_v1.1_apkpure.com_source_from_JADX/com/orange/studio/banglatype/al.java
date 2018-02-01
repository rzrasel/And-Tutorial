package com.orange.studio.banglatype;

import android.content.Context;
import android.content.res.ColorStateList;
import android.databinding.C0002a;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.v7.p012d.C0872b;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.C1088c;
import com.bumptech.glide.C1113e;
import com.bumptech.glide.load.C1145c;
import com.bumptech.glide.load.C1176a;
import com.bumptech.glide.load.p044b.C1217b;
import com.bumptech.glide.load.p049c.C1298o;
import com.bumptech.glide.load.p049c.p051b.C1276f;
import com.bumptech.glide.load.resource.bitmap.C1320f;
import com.bumptech.glide.load.resource.bitmap.C1335p;
import com.bumptech.glide.load.resource.p040a.C1136b;
import com.bumptech.glide.load.resource.p052b.C1309c;
import com.bumptech.glide.p036f.p037b.C1103i;
import com.bumptech.glide.p036f.p039a.C1119c;
import com.bumptech.glide.p041g.C1144a;
import com.bumptech.glide.p041g.C1146b;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Set;

public abstract class al extends C0002a implements bf {
    private static int f8067l = 229;
    private final int f8068a;
    public final int f8069b;
    protected final boolean f8070c;
    public final int f8071d;
    public be f8072e;
    public C1742v f8073f;
    public WeakReference<Context> f8074g;
    public ao f8075h;
    public ap f8076i;
    public Set<bj> f8077j;
    private final int f8078k;
    private C1088c<String, InputStream, C0872b, C0872b> f8079m;
    private bq f8080n;

    public static abstract class C1699a<T extends al, B extends C1699a<T, B>> {
        int f8044a;
        int f8045b;
        boolean f8046c;
        int f8047d = 10;
        int f8048e = 10;
        ao f8049f;
        ap f8050g;
        Context f8051h;

        public final B m7229a(Context context) {
            this.f8051h = context;
            return mo2380b();
        }

        public final B m7230a(ao aoVar) {
            this.f8049f = aoVar;
            return mo2380b();
        }

        public final B m7231a(boolean z) {
            this.f8046c = z;
            return mo2380b();
        }

        protected abstract B mo2380b();

        public final B m7233b(int i) {
            this.f8044a = i;
            return mo2380b();
        }

        public final B m7234c(int i) {
            this.f8045b = i;
            return mo2380b();
        }
    }

    public static class C1708b {
        public static final C1708b f8169a = new C1707a().m7317a();
        public final al f8170b;
        public final String f8171c;
        public final C1145c f8172d;
        public final int f8173e;
        public final int f8174f;
        public final int f8175g;
        public final int f8176h;
        public final int f8177i;
        public final C1708b f8178j;
        public final ColorStateList f8179k;
        public final ColorStateList f8180l;
        public final ColorStateList f8181m;
        public final ColorStateList f8182n;
        public final int f8183o;
        public final int f8184p;
        public final int f8185q;
        public final int f8186r;
        public final int f8187s;
        public final int f8188t;

        public static class C1707a {
            al f8150a;
            String f8151b;
            C1145c f8152c;
            int f8153d;
            int f8154e;
            int f8155f;
            public int f8156g;
            int f8157h;
            C1708b f8158i;
            ColorStateList f8159j;
            ColorStateList f8160k;
            ColorStateList f8161l;
            ColorStateList f8162m;
            int f8163n;
            int f8164o;
            int f8165p;
            int f8166q;
            int f8167r;
            int f8168s;

            public C1707a() {
                this.f8168s = 9225;
                this.f8153d = -1;
                this.f8163n = -1;
                this.f8168s = 9225;
            }

            public C1707a(C1708b c1708b) {
                this.f8168s = 9225;
                this.f8150a = c1708b.f8170b;
                this.f8151b = c1708b.f8171c;
                this.f8152c = c1708b.f8172d != null ? c1708b.f8172d : C1146b.m3124a();
                this.f8153d = c1708b.f8173e;
                this.f8154e = c1708b.f8174f;
                this.f8155f = c1708b.f8175g;
                this.f8156g = c1708b.f8176h;
                this.f8157h = c1708b.f8177i;
                this.f8158i = c1708b.f8178j;
                this.f8159j = c1708b.f8179k;
                this.f8160k = c1708b.f8180l;
                this.f8161l = c1708b.f8181m;
                this.f8162m = c1708b.f8182n;
                this.f8163n = c1708b.f8183o;
                this.f8164o = c1708b.f8184p;
                this.f8165p = c1708b.f8185q;
                this.f8166q = c1708b.f8186r;
                this.f8167r = c1708b.f8187s;
                this.f8168s = c1708b.f8188t;
            }

            public final C1707a m7315a(ColorStateList colorStateList) {
                this.f8159j = colorStateList;
                m7318a(31);
                return this;
            }

            public final C1707a m7316a(boolean z) {
                m7319a(541200, 31, z);
                return this;
            }

            public final C1708b m7317a() {
                return new C1708b();
            }

            final void m7318a(int i) {
                this.f8168s &= (67650 & i) ^ -1;
            }

            final void m7319a(int i, int i2, boolean z) {
                if (z) {
                    this.f8168s |= i & i2;
                } else {
                    this.f8168s &= (i & i2) ^ -1;
                }
            }

            public final C1707a m7320b(boolean z) {
                m7319a(33825, 31, z);
                return this;
            }

            public final C1707a m7321c(boolean z) {
                m7319a(270600, 31, z);
                return this;
            }
        }

        private C1708b(C1707a c1707a) {
            this.f8170b = c1707a.f8150a;
            this.f8171c = c1707a.f8151b;
            this.f8172d = c1707a.f8152c != null ? c1707a.f8152c : C1146b.m3124a();
            this.f8173e = c1707a.f8153d;
            this.f8174f = c1707a.f8154e;
            this.f8175g = c1707a.f8155f;
            this.f8176h = c1707a.f8156g;
            this.f8177i = c1707a.f8157h;
            this.f8178j = c1707a.f8158i;
            this.f8179k = c1707a.f8159j;
            this.f8180l = c1707a.f8160k;
            this.f8181m = c1707a.f8161l;
            this.f8182n = c1707a.f8162m;
            this.f8183o = c1707a.f8163n;
            this.f8184p = c1707a.f8164o;
            this.f8185q = c1707a.f8165p;
            this.f8186r = c1707a.f8166q;
            this.f8187s = c1707a.f8167r;
            this.f8188t = c1707a.f8168s;
        }

        public final boolean m7322a() {
            return m7323a(541200, 31);
        }

        public final boolean m7323a(int i, int i2) {
            return (this.f8188t & (i & i2)) != 0;
        }

        public final boolean m7324b() {
            return m7323a(541200, 992);
        }

        public final boolean m7325c() {
            return m7323a(541200, 31744);
        }

        public final boolean m7326d() {
            return m7323a(541200, 1015808);
        }

        public final boolean m7327e() {
            return (this.f8171c == null || this.f8171c.isEmpty()) ? false : true;
        }

        public final String toString() {
            return getClass().getName() + "[ item: '" + this.f8170b + "', url: '" + this.f8171c + "', signature: '" + this.f8172d + ", index: " + this.f8173e + ", placeholderResId: " + this.f8174f + ", placeholderTint: " + aa.m7225a(this.f8180l) + ", tint: " + aa.m7225a(this.f8179k) + ", errorResId: " + this.f8175g + ", errorTint: " + aa.m7225a(this.f8182n) + ", fallbackColor: " + this.f8176h + ", fallbackResId: " + this.f8177i + ", fallbackTint: " + aa.m7225a(this.f8181m) + ", fallback: " + this.f8178j + "]";
        }
    }

    protected <T extends al, B extends C1699a<T, B>> al(C1699a<T, B> c1699a) {
        this.f8069b = c1699a.f8044a;
        this.f8071d = c1699a.f8045b;
        this.f8070c = c1699a.f8046c;
        this.f8068a = c1699a.f8047d;
        this.f8078k = c1699a.f8048e;
        this.f8075h = c1699a.f8049f;
        this.f8076i = c1699a.f8050g;
        if (c1699a.f8051h != null) {
            this.f8074g = new WeakReference(c1699a.f8051h);
        }
    }

    private static C1145c m7259a(Context context) {
        return context != null ? C1144a.m3121a(context) : null;
    }

    private void m7260a(int i, C1741t c1741t) {
        if (i >= 0 && i <= 9) {
            if (this.f8073f == null) {
                this.f8073f = new C1743u(this.f8078k);
            }
            C1741t a = this.f8073f.mo2415a(i);
            int i2 = a != null ? !a.equals(c1741t) ? 1 : 0 : 1;
            this.f8073f.mo2416a(i, c1741t);
            if (i2 != 0) {
                switch (i) {
                    case 0:
                        m2a(2);
                        m2a(1);
                        return;
                    case 1:
                        m2a(3);
                        return;
                    case 2:
                        m2a(4);
                        return;
                    case 3:
                        m2a(5);
                        return;
                    case 4:
                        m2a(6);
                        return;
                    case 5:
                        m2a(7);
                        return;
                    case 6:
                        m2a(8);
                        return;
                    case 7:
                        m2a(9);
                        return;
                    case 8:
                        m2a(10);
                        return;
                    case 9:
                        m2a(11);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public static void m7261a(ImageView imageView, C1707a c1707a) {
        if (c1707a != null) {
            C1708b a = c1707a.m7317a();
            if (imageView == null) {
                throw new IllegalArgumentException("target imageView is null");
            } else if (a.f8170b == null) {
                throw new IllegalArgumentException("imageInfo.item is null");
            } else {
                a.f8170b.m7262a(imageView, a);
            }
        }
    }

    private void m7262a(ImageView imageView, C1708b c1708b) {
        if (imageView != null) {
            if (c1708b == null) {
                imageView.setImageDrawable(null);
            } else if (c1708b.m7327e()) {
                Context context = imageView.getContext();
                if (this.f8070c) {
                    Object obj = (c1708b.f8173e < 0 || !c1708b.m7323a(33825, 31)) ? null : 1;
                    if (obj != null) {
                        obj = this.f8072e != null ? this.f8072e.mo2399a(c1708b.f8173e) != null ? 1 : null : null;
                        if (obj != null) {
                            m7265b(c1708b.f8173e);
                        } else if (c1708b != null) {
                            Object obj2 = c1708b.f8171c;
                            C1145c c1145c = c1708b.f8172d;
                            if (!(obj2 == null || c1145c == null)) {
                                C1088c c1088c;
                                if (this.f8080n != null) {
                                    C1113e.m3027a(this.f8080n);
                                }
                                r0 = bj.m7391a((View) imageView);
                                if (r0 != null) {
                                    r0.mo1305c();
                                }
                                C1103i bjVar = new bj(imageView, this, c1708b.f8173e);
                                if (this.f8077j != null) {
                                    this.f8077j.add(bjVar);
                                }
                                Context context2 = imageView.getContext();
                                if (this.f8079m == null) {
                                    this.f8079m = C1113e.m3029b(context2).m3160a(new C1276f(context2), InputStream.class).m3128a(String.class).m3127a(C0872b.class).mo1270b(C1217b.ALL).mo1266a(new bb(new bd())).mo1264a(new C1298o()).mo1265a(new C1309c(new ba(new bc(), new C1335p(C1320f.f3709b, C1113e.m3022a(context2).f3325b, C1176a.f3477d)))).mo1269b(256, 256).mo1280h().mo1279g();
                                    c1088c = this.f8079m;
                                } else {
                                    c1088c = this.f8079m.mo1277f();
                                }
                                c1088c.mo1271b(c1145c).mo1273b(obj2).m2887a(bjVar);
                            }
                        }
                    }
                }
                if (!(c1708b.f8183o == -1 || c1708b.f8185q == 0)) {
                    c1708b.f8170b.m7260a(c1708b.f8183o, new C1741t(c1708b.f8185q));
                }
                final C1708b c1708b2 = c1708b;
                final ImageView imageView2 = imageView;
                C1113e.m3029b(context).m3159a(String.class).m2903a(bt.m7424a(c1708b.f8171c) ? C1217b.NONE : C1217b.ALL).m2922d().m2914b(c1708b.f8174f).m2921c(c1708b.f8177i).m2920c().m2904a(c1708b.f8172d).m2905a(c1708b.f8171c).m2887a(new bu(this, imageView, c1708b.m7322a() ? c1708b.f8179k : null, c1708b.m7324b() ? c1708b.f8180l : null, c1708b.m7326d() ? c1708b.f8182n : null, (c1708b.f8188t & 135300) & 131204) {
                    final /* synthetic */ al f8149d;

                    public final void mo2392a(C1136b c1136b, C1119c<? super C1136b> c1119c) {
                        super.mo2392a(c1136b, (C1119c) c1119c);
                        if (c1708b2.f8183o != -1 && c1708b2.f8184p != 0) {
                            c1708b2.f8170b.m7260a(c1708b2.f8183o, new C1741t(c1708b2.f8184p));
                        }
                    }

                    public final void mo1283a(Exception exception, Drawable drawable) {
                        super.mo1283a(exception, drawable);
                        if (!(c1708b2.f8183o == -1 || c1708b2.f8187s == 0)) {
                            c1708b2.f8170b.m7260a(c1708b2.f8183o, new C1741t(c1708b2.f8187s));
                        }
                        this.f8149d.m7266b(imageView2, c1708b2);
                    }

                    public final void mo1311c(Drawable drawable) {
                        if (drawable != null) {
                            boolean z = drawable.getOpacity() == -1;
                            if (c1708b2.m7323a(270600, 31) && z && (drawable instanceof TransitionDrawable)) {
                                ((TransitionDrawable) drawable).setCrossFadeEnabled(false);
                            }
                        }
                        super.mo1311c(drawable);
                    }
                });
            } else {
                r0 = bj.m7391a((View) imageView);
                if (r0 != null) {
                    r0.mo1305c();
                }
                m7266b(imageView, c1708b);
            }
        }
    }

    private void m7265b(int i) {
        switch (i) {
            case 0:
                m2a(27);
                m2a(26);
                return;
            case 1:
                m2a(28);
                return;
            case 2:
                m2a(29);
                return;
            case 3:
                m2a(30);
                return;
            case 4:
                m2a(31);
                return;
            case 5:
                m2a(32);
                return;
            case 6:
                m2a(33);
                return;
            case 7:
                m2a(34);
                return;
            case 8:
                m2a(35);
                return;
            case 9:
                m2a(36);
                return;
            default:
                return;
        }
    }

    private void m7266b(ImageView imageView, C1708b c1708b) {
        boolean z = true;
        if (imageView != null) {
            if (c1708b == null) {
                imageView.setImageDrawable(null);
            } else if (c1708b.f8178j != null && (c1708b.f8178j instanceof C1708b)) {
                boolean z2 = (c1708b.f8179k == null && c1708b.f8180l == null && c1708b.f8181m == null && c1708b.f8182n == null) ? false : true;
                if (z2) {
                    if ((!c1708b.f8178j.m7323a(67650, 2097151)) && c1708b.f8178j.m7323a(541200, 2097151)) {
                        C1708b c1708b2;
                        r3 = new C1707a(c1708b.f8178j);
                        if (c1708b.f8178j.f8170b != this) {
                            r3.f8150a = this;
                        }
                        if (c1708b.f8178j.f8180l == null) {
                            c1708b2 = c1708b.f8178j;
                            z2 = c1708b2.f8180l == null && c1708b2.m7323a(67650, 992);
                            if (!z2 && c1708b.f8178j.m7324b()) {
                                r3.f8160k = c1708b.f8180l;
                                r3.m7318a(992);
                            }
                        }
                        if (c1708b.f8178j.f8181m == null) {
                            c1708b2 = c1708b.f8178j;
                            z2 = c1708b2.f8181m == null && c1708b2.m7323a(67650, 31744);
                            if (!z2 && c1708b.f8178j.m7325c()) {
                                r3.f8161l = c1708b.f8181m;
                                r3.m7318a(31744);
                            }
                        }
                        if (c1708b.f8178j.f8182n == null) {
                            c1708b2 = c1708b.f8178j;
                            z2 = c1708b2.f8182n == null && c1708b2.m7323a(67650, 1015808);
                            if (!z2 && c1708b.f8178j.m7326d()) {
                                r3.f8162m = c1708b.f8182n;
                                r3.m7318a(1015808);
                            }
                        }
                        if (c1708b.f8178j.f8179k == null) {
                            c1708b2 = c1708b.f8178j;
                            if (!(c1708b2.f8179k == null && c1708b2.m7323a(67650, 31))) {
                                z = false;
                            }
                            if (!z && c1708b.f8178j.m7322a()) {
                                r3.m7315a(c1708b.f8179k);
                            }
                        }
                        if (c1708b.f8178j.f8183o == -1) {
                            r3.f8163n = c1708b.f8183o;
                        }
                        if (c1708b.f8178j.f8184p == 0) {
                            r3.f8166q = c1708b.f8186r;
                        }
                        r0 = r3.m7317a();
                        m7267c(c1708b.f8173e);
                        m7262a(imageView, r0);
                    }
                }
                if (c1708b.f8178j.f8170b != this) {
                    C1707a c1707a = new C1707a(c1708b.f8178j);
                    c1707a.f8150a = this;
                    r0 = c1707a.m7317a();
                } else {
                    r0 = c1708b.f8178j;
                }
                m7267c(c1708b.f8173e);
                m7262a(imageView, r0);
            } else if (c1708b.f8177i != 0) {
                r2 = new C1707a(c1708b);
                r2.f8150a = this;
                r2.f8151b = bt.m7432e(imageView.getContext(), c1708b.f8177i);
                r2.f8152c = m7259a(imageView.getContext());
                r2 = r2.m7315a(c1708b.f8181m).m7316a(c1708b.m7325c());
                r2.f8156g = c1708b.f8176h;
                if (!c1708b.m7323a(1048576, 2097151)) {
                    r3 = r2.m7321c(c1708b.m7323a(270600, 31744));
                    r3.f8164o = c1708b.f8186r;
                    if (c1708b.f8173e == -1 || !c1708b.m7323a(33825, 31744)) {
                        z = false;
                    }
                    r3.m7320b(z).m7315a(c1708b.f8181m).m7316a(c1708b.m7325c());
                }
                r2.m7319a(1048576, 2097151, false);
                m7267c(c1708b.f8173e);
                m7262a(imageView, r2.m7317a());
            } else if (c1708b.f8176h != 0) {
                imageView.setImageDrawable(new ColorDrawable(c1708b.f8176h));
            } else if (c1708b.f8175g == 0 || !c1708b.m7327e()) {
                imageView.setImageDrawable(null);
                if (c1708b.f8183o != -1 && c1708b.f8186r != 0) {
                    c1708b.f8170b.m7260a(c1708b.f8183o, new C1741t(c1708b.f8186r));
                }
            } else {
                r2 = new C1707a(c1708b);
                r2.f8150a = this;
                r2.f8151b = bt.m7432e(imageView.getContext(), c1708b.f8175g);
                r2.f8152c = m7259a(imageView.getContext());
                r2 = r2.m7315a(c1708b.f8182n).m7316a(c1708b.m7326d()).m7321c(c1708b.m7323a(270600, 1015808));
                r2.f8164o = c1708b.f8187s;
                r2.f8153d = c1708b.f8173e;
                r2.f8154e = c1708b.f8174f;
                if (c1708b.f8173e == -1 || !c1708b.m7323a(33825, 1015808)) {
                    z = false;
                }
                r0 = r2.m7320b(z).m7317a();
                m7267c(c1708b.f8173e);
                m7262a(imageView, r0);
            }
        }
    }

    private void m7267c(int i) {
        if (i >= 0 && i < this.f8068a && this.f8072e != null) {
            this.f8072e.mo2400a(i, null);
        }
    }

    public CharSequence mo2381b() {
        return null;
    }

    public CharSequence mo2382c() {
        return null;
    }

    public C1707a mo2383d() {
        return null;
    }

    public void onPaletteReady(C0872b c0872b) {
    }

    public void onPaletteReady(C0872b c0872b, View view, int i) {
        Object obj = 1;
        if (this.f8070c && i >= 0 && i < this.f8068a) {
            if (this.f8072e == null) {
                this.f8072e = new ay(this.f8068a);
            }
            C0872b a = this.f8072e.mo2399a(i);
            if (a != null && bi.m7386a(a, c0872b)) {
                obj = null;
            }
            this.f8072e.mo2400a(i, c0872b);
            if (obj != null) {
                m7265b(i);
            }
        }
    }

    public String toString() {
        return getClass().getName() + "[ layoutId: " + this.f8069b + ", primaryColor: " + aa.m7224a(this.f8071d) + ", isAutoEnabled: " + this.f8070c + ", paletteCapacity: " + this.f8068a + ", autoColorCapacity: " + this.f8078k + ", palettes: " + (this.f8072e != null ? this.f8072e.toString() : "null") + ", autoColors: " + (this.f8073f != null ? this.f8073f.toString() : "null") + ", clickListener: '" + (this.f8075h != null ? "present" : "null") + ", longClickListener: '" + (this.f8076i != null ? "present" : "null") + "]";
    }
}
