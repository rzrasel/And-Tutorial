package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.C0679r;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertController.C07832;
import android.support.v7.app.AlertController.C07843;
import android.support.v7.app.AlertController.C07854;
import android.support.v7.app.AlertController.C07865;
import android.support.v7.app.AlertController.C0791a;
import android.support.v7.app.AlertController.C0791a.C07871;
import android.support.v7.app.AlertController.C0791a.C07882;
import android.support.v7.app.AlertController.C0791a.C07893;
import android.support.v7.app.AlertController.C0791a.C07904;
import android.support.v7.app.AlertController.C0793c;
import android.support.v7.app.AlertController.RecycleListView;
import android.support.v7.p021a.C0780a.C0770a;
import android.support.v7.p021a.C0780a.C0775f;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public final class C0823c extends C0234k implements DialogInterface {
    final AlertController f2507a = new AlertController(getContext(), this, getWindow());

    public static class C0822a {
        public final C0791a f2505a;
        private final int f2506b;

        public C0822a(Context context) {
            this(context, C0823c.m2398a(context, 0));
        }

        private C0822a(Context context, int i) {
            this.f2505a = new C0791a(new ContextThemeWrapper(context, C0823c.m2398a(context, i)));
            this.f2506b = i;
        }

        public final C0822a m2389a(OnCancelListener onCancelListener) {
            this.f2505a.f2345p = onCancelListener;
            return this;
        }

        public final C0822a m2390a(OnClickListener onClickListener) {
            this.f2505a.f2338i = this.f2505a.f2330a.getText(17039370);
            this.f2505a.f2339j = onClickListener;
            return this;
        }

        public final C0822a m2391a(Drawable drawable) {
            this.f2505a.f2333d = drawable;
            return this;
        }

        public final C0822a m2392a(CharSequence charSequence) {
            this.f2505a.f2335f = charSequence;
            return this;
        }

        public final C0822a m2393a(CharSequence charSequence, OnClickListener onClickListener) {
            this.f2505a.f2338i = charSequence;
            this.f2505a.f2339j = onClickListener;
            return this;
        }

        public final C0823c m2394a() {
            C0823c c0823c = new C0823c(this.f2505a.f2330a, this.f2506b);
            C0791a c0791a = this.f2505a;
            AlertController alertController = c0823c.f2507a;
            if (c0791a.f2336g != null) {
                alertController.f2359C = c0791a.f2336g;
            } else {
                if (c0791a.f2335f != null) {
                    alertController.m2256a(c0791a.f2335f);
                }
                if (c0791a.f2333d != null) {
                    Drawable drawable = c0791a.f2333d;
                    alertController.f2396y = drawable;
                    alertController.f2395x = 0;
                    if (alertController.f2397z != null) {
                        if (drawable != null) {
                            alertController.f2397z.setVisibility(0);
                            alertController.f2397z.setImageDrawable(drawable);
                        } else {
                            alertController.f2397z.setVisibility(8);
                        }
                    }
                }
                if (c0791a.f2332c != 0) {
                    alertController.m2254a(c0791a.f2332c);
                }
                if (c0791a.f2334e != 0) {
                    int i = c0791a.f2334e;
                    TypedValue typedValue = new TypedValue();
                    alertController.f2372a.getTheme().resolveAttribute(i, typedValue, true);
                    alertController.m2254a(typedValue.resourceId);
                }
            }
            if (c0791a.f2337h != null) {
                CharSequence charSequence = c0791a.f2337h;
                alertController.f2376e = charSequence;
                if (alertController.f2358B != null) {
                    alertController.f2358B.setText(charSequence);
                }
            }
            if (c0791a.f2338i != null) {
                alertController.m2255a(-1, c0791a.f2338i, c0791a.f2339j, null);
            }
            if (c0791a.f2340k != null) {
                alertController.m2255a(-2, c0791a.f2340k, c0791a.f2341l, null);
            }
            if (c0791a.f2342m != null) {
                alertController.m2255a(-3, c0791a.f2342m, c0791a.f2343n, null);
            }
            if (!(c0791a.f2348s == null && c0791a.f2325H == null && c0791a.f2349t == null)) {
                ListAdapter c0793c;
                RecycleListView recycleListView = (RecycleListView) c0791a.f2331b.inflate(alertController.f2364H, null);
                Object simpleCursorAdapter;
                if (!c0791a.f2321D) {
                    int i2 = c0791a.f2322E ? alertController.f2366J : alertController.f2367K;
                    if (c0791a.f2325H != null) {
                        simpleCursorAdapter = new SimpleCursorAdapter(c0791a.f2330a, i2, c0791a.f2325H, new String[]{c0791a.f2326I}, new int[]{16908308});
                    } else {
                        c0793c = c0791a.f2349t != null ? c0791a.f2349t : new C0793c(c0791a.f2330a, i2, c0791a.f2348s);
                    }
                } else if (c0791a.f2325H == null) {
                    c0793c = new C07871(c0791a, c0791a.f2330a, alertController.f2365I, c0791a.f2348s, recycleListView);
                } else {
                    simpleCursorAdapter = new C07882(c0791a, c0791a.f2330a, c0791a.f2325H, recycleListView, alertController);
                }
                alertController.f2360D = c0793c;
                alertController.f2361E = c0791a.f2323F;
                if (c0791a.f2350u != null) {
                    recycleListView.setOnItemClickListener(new C07893(c0791a, alertController));
                } else if (c0791a.f2324G != null) {
                    recycleListView.setOnItemClickListener(new C07904(c0791a, recycleListView, alertController));
                }
                if (c0791a.f2328K != null) {
                    recycleListView.setOnItemSelectedListener(c0791a.f2328K);
                }
                if (c0791a.f2322E) {
                    recycleListView.setChoiceMode(1);
                } else if (c0791a.f2321D) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f2377f = recycleListView;
            }
            if (c0791a.f2352w != null) {
                if (c0791a.f2319B) {
                    View view = c0791a.f2352w;
                    int i3 = c0791a.f2353x;
                    int i4 = c0791a.f2354y;
                    int i5 = c0791a.f2355z;
                    int i6 = c0791a.f2318A;
                    alertController.f2378g = view;
                    alertController.f2379h = 0;
                    alertController.f2384m = true;
                    alertController.f2380i = i3;
                    alertController.f2381j = i4;
                    alertController.f2382k = i5;
                    alertController.f2383l = i6;
                } else {
                    alertController.f2378g = c0791a.f2352w;
                    alertController.f2379h = 0;
                    alertController.f2384m = false;
                }
            } else if (c0791a.f2351v != 0) {
                i = c0791a.f2351v;
                alertController.f2378g = null;
                alertController.f2379h = i;
                alertController.f2384m = false;
            }
            c0823c.setCancelable(this.f2505a.f2344o);
            if (this.f2505a.f2344o) {
                c0823c.setCanceledOnTouchOutside(true);
            }
            c0823c.setOnCancelListener(this.f2505a.f2345p);
            c0823c.setOnDismissListener(this.f2505a.f2346q);
            if (this.f2505a.f2347r != null) {
                c0823c.setOnKeyListener(this.f2505a.f2347r);
            }
            return c0823c;
        }

        public final C0822a m2395b(OnClickListener onClickListener) {
            this.f2505a.f2340k = this.f2505a.f2330a.getText(17039360);
            this.f2505a.f2341l = onClickListener;
            return this;
        }

        public final C0822a m2396b(CharSequence charSequence) {
            this.f2505a.f2337h = charSequence;
            return this;
        }

        public final C0823c m2397b() {
            C0823c a = m2394a();
            a.show();
            return a;
        }
    }

    protected C0823c(Context context, int i) {
        super(context, C0823c.m2398a(context, i));
    }

    static int m2398a(Context context, int i) {
        if (((i >>> 24) & 255) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0770a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    protected final void onCreate(Bundle bundle) {
        int indexOfChild;
        super.onCreate(bundle);
        AlertController alertController = this.f2507a;
        int i = (alertController.f2363G == 0 || alertController.f2369M != 1) ? alertController.f2362F : alertController.f2363G;
        alertController.f2373b.setContentView(i);
        View findViewById = alertController.f2374c.findViewById(C0775f.parentPanel);
        View findViewById2 = findViewById.findViewById(C0775f.topPanel);
        View findViewById3 = findViewById.findViewById(C0775f.contentPanel);
        View findViewById4 = findViewById.findViewById(C0775f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(C0775f.customPanel);
        View inflate = alertController.f2378g != null ? alertController.f2378g : alertController.f2379h != 0 ? LayoutInflater.from(alertController.f2372a).inflate(alertController.f2379h, viewGroup, false) : null;
        Object obj = inflate != null ? 1 : null;
        if (obj == null || !AlertController.m2253a(inflate)) {
            alertController.f2374c.setFlags(131072, 131072);
        }
        if (obj != null) {
            FrameLayout frameLayout = (FrameLayout) alertController.f2374c.findViewById(C0775f.custom);
            frameLayout.addView(inflate, new LayoutParams(-1, -1));
            if (alertController.f2384m) {
                frameLayout.setPadding(alertController.f2380i, alertController.f2381j, alertController.f2382k, alertController.f2383l);
            }
            if (alertController.f2377f != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById5 = viewGroup.findViewById(C0775f.topPanel);
        inflate = viewGroup.findViewById(C0775f.contentPanel);
        View findViewById6 = viewGroup.findViewById(C0775f.buttonPanel);
        ViewGroup a = AlertController.m2250a(findViewById5, findViewById2);
        ViewGroup a2 = AlertController.m2250a(inflate, findViewById3);
        ViewGroup a3 = AlertController.m2250a(findViewById6, findViewById4);
        alertController.f2394w = (NestedScrollView) alertController.f2374c.findViewById(C0775f.scrollView);
        alertController.f2394w.setFocusable(false);
        alertController.f2394w.setNestedScrollingEnabled(false);
        alertController.f2358B = (TextView) a2.findViewById(16908299);
        if (alertController.f2358B != null) {
            if (alertController.f2376e != null) {
                alertController.f2358B.setText(alertController.f2376e);
            } else {
                alertController.f2358B.setVisibility(8);
                alertController.f2394w.removeView(alertController.f2358B);
                if (alertController.f2377f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f2394w.getParent();
                    indexOfChild = viewGroup2.indexOfChild(alertController.f2394w);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f2377f, indexOfChild, new LayoutParams(-1, -1));
                } else {
                    a2.setVisibility(8);
                }
            }
        }
        indexOfChild = 0;
        alertController.f2385n = (Button) a3.findViewById(16908313);
        alertController.f2385n.setOnClickListener(alertController.f2371O);
        if (TextUtils.isEmpty(alertController.f2386o)) {
            alertController.f2385n.setVisibility(8);
        } else {
            alertController.f2385n.setText(alertController.f2386o);
            alertController.f2385n.setVisibility(0);
            indexOfChild = 1;
        }
        alertController.f2388q = (Button) a3.findViewById(16908314);
        alertController.f2388q.setOnClickListener(alertController.f2371O);
        if (TextUtils.isEmpty(alertController.f2389r)) {
            alertController.f2388q.setVisibility(8);
        } else {
            alertController.f2388q.setText(alertController.f2389r);
            alertController.f2388q.setVisibility(0);
            indexOfChild |= 2;
        }
        alertController.f2391t = (Button) a3.findViewById(16908315);
        alertController.f2391t.setOnClickListener(alertController.f2371O);
        if (TextUtils.isEmpty(alertController.f2392u)) {
            alertController.f2391t.setVisibility(8);
        } else {
            alertController.f2391t.setText(alertController.f2392u);
            alertController.f2391t.setVisibility(0);
            indexOfChild |= 4;
        }
        Context context = alertController.f2372a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0770a.alertDialogCenterButtons, typedValue, true);
        if ((typedValue.data != 0 ? 1 : null) != null) {
            if (indexOfChild == 1) {
                AlertController.m2252a(alertController.f2385n);
            } else if (indexOfChild == 2) {
                AlertController.m2252a(alertController.f2388q);
            } else if (indexOfChild == 4) {
                AlertController.m2252a(alertController.f2391t);
            }
        }
        if ((indexOfChild != 0 ? 1 : null) == null) {
            a3.setVisibility(8);
        }
        if (alertController.f2359C != null) {
            a.addView(alertController.f2359C, 0, new LayoutParams(-1, -2));
            alertController.f2374c.findViewById(C0775f.title_template).setVisibility(8);
        } else {
            alertController.f2397z = (ImageView) alertController.f2374c.findViewById(16908294);
            if ((!TextUtils.isEmpty(alertController.f2375d) ? 1 : null) == null || !alertController.f2368L) {
                alertController.f2374c.findViewById(C0775f.title_template).setVisibility(8);
                alertController.f2397z.setVisibility(8);
                a.setVisibility(8);
            } else {
                alertController.f2357A = (TextView) alertController.f2374c.findViewById(C0775f.alertTitle);
                alertController.f2357A.setText(alertController.f2375d);
                if (alertController.f2395x != 0) {
                    alertController.f2397z.setImageResource(alertController.f2395x);
                } else if (alertController.f2396y != null) {
                    alertController.f2397z.setImageDrawable(alertController.f2396y);
                } else {
                    alertController.f2357A.setPadding(alertController.f2397z.getPaddingLeft(), alertController.f2397z.getPaddingTop(), alertController.f2397z.getPaddingRight(), alertController.f2397z.getPaddingBottom());
                    alertController.f2397z.setVisibility(8);
                }
            }
        }
        Object obj2 = (viewGroup == null || viewGroup.getVisibility() == 8) ? null : 1;
        Object obj3 = (a == null || a.getVisibility() == 8) ? null : 1;
        Object obj4 = (a3 == null || a3.getVisibility() == 8) ? null : 1;
        if (obj4 == null && a2 != null) {
            findViewById = a2.findViewById(C0775f.textSpacerNoButtons);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
        if (obj3 != null) {
            if (alertController.f2394w != null) {
                alertController.f2394w.setClipToPadding(true);
            }
            findViewById = null;
            if (!(alertController.f2376e == null && alertController.f2377f == null)) {
                findViewById = a.findViewById(C0775f.titleDividerNoCustom);
            }
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else if (a2 != null) {
            findViewById = a2.findViewById(C0775f.textSpacerNoTitle);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
        if (alertController.f2377f instanceof RecycleListView) {
            RecycleListView recycleListView = (RecycleListView) alertController.f2377f;
            if (obj4 == null || obj3 == null) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), obj3 != null ? recycleListView.getPaddingTop() : recycleListView.f2304a, recycleListView.getPaddingRight(), obj4 != null ? recycleListView.getPaddingBottom() : recycleListView.f2305b);
            }
        }
        if (obj2 == null) {
            inflate = alertController.f2377f != null ? alertController.f2377f : alertController.f2394w;
            if (inflate != null) {
                int i2 = (obj3 != null ? 1 : 0) | (obj4 != null ? 2 : 0);
                findViewById5 = alertController.f2374c.findViewById(C0775f.scrollIndicatorUp);
                findViewById = alertController.f2374c.findViewById(C0775f.scrollIndicatorDown);
                if (VERSION.SDK_INT >= 23) {
                    C0679r.m1931d(inflate, i2);
                    if (findViewById5 != null) {
                        a2.removeView(findViewById5);
                    }
                    if (findViewById != null) {
                        a2.removeView(findViewById);
                    }
                } else {
                    if (findViewById5 != null && (i2 & 1) == 0) {
                        a2.removeView(findViewById5);
                        findViewById5 = null;
                    }
                    if (findViewById != null && (i2 & 2) == 0) {
                        a2.removeView(findViewById);
                        findViewById = null;
                    }
                    if (!(findViewById5 == null && findViewById == null)) {
                        if (alertController.f2376e != null) {
                            alertController.f2394w.setOnScrollChangeListener(new C07832(alertController, findViewById5, findViewById));
                            alertController.f2394w.post(new C07843(alertController, findViewById5, findViewById));
                        } else if (alertController.f2377f != null) {
                            alertController.f2377f.setOnScrollListener(new C07854(alertController, findViewById5, findViewById));
                            alertController.f2377f.post(new C07865(alertController, findViewById5, findViewById));
                        } else {
                            if (findViewById5 != null) {
                                a2.removeView(findViewById5);
                            }
                            if (findViewById != null) {
                                a2.removeView(findViewById);
                            }
                        }
                    }
                }
            }
        }
        ListView listView = alertController.f2377f;
        if (listView != null && alertController.f2360D != null) {
            listView.setAdapter(alertController.f2360D);
            int i3 = alertController.f2361E;
            if (i3 >= 0) {
                listView.setItemChecked(i3, true);
                listView.setSelection(i3);
            }
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        AlertController alertController = this.f2507a;
        boolean z = alertController.f2394w != null && alertController.f2394w.m2064a(keyEvent);
        return z ? true : super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        AlertController alertController = this.f2507a;
        boolean z = alertController.f2394w != null && alertController.f2394w.m2064a(keyEvent);
        return z ? true : super.onKeyUp(i, keyEvent);
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f2507a.m2256a(charSequence);
    }
}
