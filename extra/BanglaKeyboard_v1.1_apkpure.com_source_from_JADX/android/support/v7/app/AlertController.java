package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.NestedScrollView.C0707b;
import android.support.v7.p021a.C0780a.C0770a;
import android.support.v7.p021a.C0780a.C0779j;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;

final class AlertController {
    TextView f2357A;
    TextView f2358B;
    View f2359C;
    ListAdapter f2360D;
    int f2361E = -1;
    int f2362F;
    int f2363G;
    int f2364H;
    int f2365I;
    int f2366J;
    int f2367K;
    boolean f2368L;
    int f2369M = 0;
    Handler f2370N;
    final OnClickListener f2371O = new C07821(this);
    final Context f2372a;
    final C0234k f2373b;
    final Window f2374c;
    CharSequence f2375d;
    CharSequence f2376e;
    ListView f2377f;
    View f2378g;
    int f2379h;
    int f2380i;
    int f2381j;
    int f2382k;
    int f2383l;
    boolean f2384m = false;
    Button f2385n;
    CharSequence f2386o;
    Message f2387p;
    Button f2388q;
    CharSequence f2389r;
    Message f2390s;
    Button f2391t;
    CharSequence f2392u;
    Message f2393v;
    NestedScrollView f2394w;
    int f2395x = 0;
    Drawable f2396y;
    ImageView f2397z;

    class C07821 implements OnClickListener {
        final /* synthetic */ AlertController f2291a;

        C07821(AlertController alertController) {
            this.f2291a = alertController;
        }

        public final void onClick(View view) {
            Message obtain = (view != this.f2291a.f2385n || this.f2291a.f2387p == null) ? (view != this.f2291a.f2388q || this.f2291a.f2390s == null) ? (view != this.f2291a.f2391t || this.f2291a.f2393v == null) ? null : Message.obtain(this.f2291a.f2393v) : Message.obtain(this.f2291a.f2390s) : Message.obtain(this.f2291a.f2387p);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            this.f2291a.f2370N.obtainMessage(1, this.f2291a.f2373b).sendToTarget();
        }
    }

    class C07832 implements C0707b {
        final /* synthetic */ View f2292a;
        final /* synthetic */ View f2293b;
        final /* synthetic */ AlertController f2294c;

        C07832(AlertController alertController, View view, View view2) {
            this.f2294c = alertController;
            this.f2292a = view;
            this.f2293b = view2;
        }

        public final void mo729a(NestedScrollView nestedScrollView) {
            AlertController.m2251a(nestedScrollView, this.f2292a, this.f2293b);
        }
    }

    class C07843 implements Runnable {
        final /* synthetic */ View f2295a;
        final /* synthetic */ View f2296b;
        final /* synthetic */ AlertController f2297c;

        C07843(AlertController alertController, View view, View view2) {
            this.f2297c = alertController;
            this.f2295a = view;
            this.f2296b = view2;
        }

        public final void run() {
            AlertController.m2251a(this.f2297c.f2394w, this.f2295a, this.f2296b);
        }
    }

    class C07854 implements OnScrollListener {
        final /* synthetic */ View f2298a;
        final /* synthetic */ View f2299b;
        final /* synthetic */ AlertController f2300c;

        C07854(AlertController alertController, View view, View view2) {
            this.f2300c = alertController;
            this.f2298a = view;
            this.f2299b = view2;
        }

        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m2251a(absListView, this.f2298a, this.f2299b);
        }

        public final void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    class C07865 implements Runnable {
        final /* synthetic */ View f2301a;
        final /* synthetic */ View f2302b;
        final /* synthetic */ AlertController f2303c;

        C07865(AlertController alertController, View view, View view2) {
            this.f2303c = alertController;
            this.f2301a = view;
            this.f2302b = view2;
        }

        public final void run() {
            AlertController.m2251a(this.f2303c.f2377f, this.f2301a, this.f2302b);
        }
    }

    public static class RecycleListView extends ListView {
        final int f2304a;
        final int f2305b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0779j.RecycleListView);
            this.f2305b = obtainStyledAttributes.getDimensionPixelOffset(C0779j.RecycleListView_paddingBottomNoButtons, -1);
            this.f2304a = obtainStyledAttributes.getDimensionPixelOffset(C0779j.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    public static class C0791a {
        public int f2318A;
        public boolean f2319B = false;
        public boolean[] f2320C;
        public boolean f2321D;
        public boolean f2322E;
        public int f2323F = -1;
        public OnMultiChoiceClickListener f2324G;
        public Cursor f2325H;
        public String f2326I;
        public String f2327J;
        public OnItemSelectedListener f2328K;
        public boolean f2329L = true;
        public final Context f2330a;
        public final LayoutInflater f2331b;
        public int f2332c = 0;
        public Drawable f2333d;
        public int f2334e = 0;
        public CharSequence f2335f;
        public View f2336g;
        public CharSequence f2337h;
        public CharSequence f2338i;
        public DialogInterface.OnClickListener f2339j;
        public CharSequence f2340k;
        public DialogInterface.OnClickListener f2341l;
        public CharSequence f2342m;
        public DialogInterface.OnClickListener f2343n;
        public boolean f2344o;
        public OnCancelListener f2345p;
        public OnDismissListener f2346q;
        public OnKeyListener f2347r;
        public CharSequence[] f2348s;
        public ListAdapter f2349t;
        public DialogInterface.OnClickListener f2350u;
        public int f2351v;
        public View f2352w;
        public int f2353x;
        public int f2354y;
        public int f2355z;

        class C07871 extends ArrayAdapter<CharSequence> {
            final /* synthetic */ RecycleListView f2306a;
            final /* synthetic */ C0791a f2307b;

            C07871(C0791a c0791a, Context context, int i, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                this.f2307b = c0791a;
                this.f2306a = recycleListView;
                super(context, i, 16908308, charSequenceArr);
            }

            public final View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                if (this.f2307b.f2320C != null && this.f2307b.f2320C[i]) {
                    this.f2306a.setItemChecked(i, true);
                }
                return view2;
            }
        }

        class C07882 extends CursorAdapter {
            final /* synthetic */ RecycleListView f2308a;
            final /* synthetic */ AlertController f2309b;
            final /* synthetic */ C0791a f2310c;
            private final int f2311d;
            private final int f2312e;

            C07882(C0791a c0791a, Context context, Cursor cursor, RecycleListView recycleListView, AlertController alertController) {
                this.f2310c = c0791a;
                this.f2308a = recycleListView;
                this.f2309b = alertController;
                super(context, cursor, false);
                Cursor cursor2 = getCursor();
                this.f2311d = cursor2.getColumnIndexOrThrow(this.f2310c.f2326I);
                this.f2312e = cursor2.getColumnIndexOrThrow(this.f2310c.f2327J);
            }

            public final void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f2311d));
                this.f2308a.setItemChecked(cursor.getPosition(), cursor.getInt(this.f2312e) == 1);
            }

            public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return this.f2310c.f2331b.inflate(this.f2309b.f2365I, viewGroup, false);
            }
        }

        class C07893 implements OnItemClickListener {
            final /* synthetic */ AlertController f2313a;
            final /* synthetic */ C0791a f2314b;

            C07893(C0791a c0791a, AlertController alertController) {
                this.f2314b = c0791a;
                this.f2313a = alertController;
            }

            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                this.f2314b.f2350u.onClick(this.f2313a.f2373b, i);
                if (!this.f2314b.f2322E) {
                    this.f2313a.f2373b.dismiss();
                }
            }
        }

        class C07904 implements OnItemClickListener {
            final /* synthetic */ RecycleListView f2315a;
            final /* synthetic */ AlertController f2316b;
            final /* synthetic */ C0791a f2317c;

            C07904(C0791a c0791a, RecycleListView recycleListView, AlertController alertController) {
                this.f2317c = c0791a;
                this.f2315a = recycleListView;
                this.f2316b = alertController;
            }

            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (this.f2317c.f2320C != null) {
                    this.f2317c.f2320C[i] = this.f2315a.isItemChecked(i);
                }
                this.f2317c.f2324G.onClick(this.f2316b.f2373b, i, this.f2315a.isItemChecked(i));
            }
        }

        public C0791a(Context context) {
            this.f2330a = context;
            this.f2344o = true;
            this.f2331b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    private static final class C0792b extends Handler {
        private WeakReference<DialogInterface> f2356a;

        public C0792b(DialogInterface dialogInterface) {
            this.f2356a = new WeakReference(dialogInterface);
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case -3:
                case -2:
                case -1:
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f2356a.get(), message.what);
                    return;
                case 1:
                    ((DialogInterface) message.obj).dismiss();
                    return;
                default:
                    return;
            }
        }
    }

    private static class C0793c extends ArrayAdapter<CharSequence> {
        public C0793c(Context context, int i, CharSequence[] charSequenceArr) {
            super(context, i, 16908308, charSequenceArr);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0234k c0234k, Window window) {
        this.f2372a = context;
        this.f2373b = c0234k;
        this.f2374c = window;
        this.f2370N = new C0792b(c0234k);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0779j.AlertDialog, C0770a.alertDialogStyle, 0);
        this.f2362F = obtainStyledAttributes.getResourceId(C0779j.AlertDialog_android_layout, 0);
        this.f2363G = obtainStyledAttributes.getResourceId(C0779j.AlertDialog_buttonPanelSideLayout, 0);
        this.f2364H = obtainStyledAttributes.getResourceId(C0779j.AlertDialog_listLayout, 0);
        this.f2365I = obtainStyledAttributes.getResourceId(C0779j.AlertDialog_multiChoiceItemLayout, 0);
        this.f2366J = obtainStyledAttributes.getResourceId(C0779j.AlertDialog_singleChoiceItemLayout, 0);
        this.f2367K = obtainStyledAttributes.getResourceId(C0779j.AlertDialog_listItemLayout, 0);
        this.f2368L = obtainStyledAttributes.getBoolean(C0779j.AlertDialog_showTitle, true);
        obtainStyledAttributes.recycle();
        c0234k.m607a();
    }

    static ViewGroup m2250a(View view, View view2) {
        if (view == null) {
            return (ViewGroup) (view2 instanceof ViewStub ? ((ViewStub) view2).inflate() : view2);
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        return (ViewGroup) (view instanceof ViewStub ? ((ViewStub) view).inflate() : view);
    }

    static void m2251a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    static void m2252a(Button button) {
        LayoutParams layoutParams = (LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static boolean m2253a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m2253a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public final void m2254a(int i) {
        this.f2396y = null;
        this.f2395x = i;
        if (this.f2397z == null) {
            return;
        }
        if (i != 0) {
            this.f2397z.setVisibility(0);
            this.f2397z.setImageResource(this.f2395x);
            return;
        }
        this.f2397z.setVisibility(8);
    }

    public final void m2255a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (onClickListener != null) {
            message = this.f2370N.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.f2392u = charSequence;
                this.f2393v = message;
                return;
            case -2:
                this.f2389r = charSequence;
                this.f2390s = message;
                return;
            case -1:
                this.f2386o = charSequence;
                this.f2387p = message;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    public final void m2256a(CharSequence charSequence) {
        this.f2375d = charSequence;
        if (this.f2357A != null) {
            this.f2357A.setText(charSequence);
        }
    }
}
