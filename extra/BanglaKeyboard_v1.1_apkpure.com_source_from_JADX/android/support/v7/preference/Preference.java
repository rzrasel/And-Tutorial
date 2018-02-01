package android.support.v7.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.content.C0392a;
import android.support.v4.content.C0443d.C0442a;
import android.support.v4.content.p015a.C0438c;
import android.support.v4.view.p019a.C0626b;
import android.support.v7.preference.C0927c.C0914c;
import android.support.v7.preference.C0935f.C0931a;
import android.support.v7.preference.C0935f.C0932b;
import android.support.v7.preference.C0935f.C0933c;
import android.support.v7.preference.C0935f.C0934d;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Preference implements Comparable<Preference> {
    private boolean f2716A;
    private boolean f2717B;
    private boolean f2718C;
    private boolean f2719D;
    private boolean f2720E;
    private boolean f2721F;
    private List<Preference> f2722G;
    private boolean f2723H;
    private final OnClickListener f2724I;
    private C0921a f2725a;
    private C0905b f2726b;
    private int f2727c;
    private CharSequence f2728d;
    private int f2729e;
    private Drawable f2730f;
    private boolean f2731g;
    private boolean f2732h;
    private String f2733i;
    Context f2734j;
    C0927c f2735k;
    long f2736l;
    int f2737m;
    CharSequence f2738n;
    String f2739o;
    Intent f2740p;
    String f2741q;
    boolean f2742r;
    boolean f2743s;
    int f2744t;
    int f2745u;
    C0904a f2746v;
    boolean f2747w;
    private Object f2748x;
    private boolean f2749y;
    private boolean f2750z;

    public static class BaseSavedState extends AbsSavedState {
        public static final Creator<BaseSavedState> CREATOR = new C09031();

        static class C09031 implements Creator<BaseSavedState> {
            C09031() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new BaseSavedState[i];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    class C09021 implements OnClickListener {
        final /* synthetic */ Preference f2795a;

        C09021(Preference preference) {
            this.f2795a = preference;
        }

        public final void onClick(View view) {
            this.f2795a.mo859a(view);
        }
    }

    interface C0904a {
        void mo887a(Preference preference);
    }

    public interface C0905b {
        boolean m2657a();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0438c.m1158a(context, C0931a.preferenceStyle, 16842894));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, byte b) {
        this.f2737m = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f2727c = 0;
        this.f2731g = true;
        this.f2732h = true;
        this.f2742r = true;
        this.f2749y = true;
        this.f2750z = true;
        this.f2743s = true;
        this.f2716A = true;
        this.f2717B = true;
        this.f2719D = true;
        this.f2721F = true;
        this.f2744t = C0933c.preference;
        this.f2724I = new C09021(this);
        this.f2734j = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0934d.Preference, i, 0);
        this.f2729e = C0438c.m1159a(obtainStyledAttributes, C0934d.Preference_icon, C0934d.Preference_android_icon, 0);
        this.f2739o = C0438c.m1164a(obtainStyledAttributes, C0934d.Preference_key, C0934d.Preference_android_key);
        this.f2738n = C0438c.m1169b(obtainStyledAttributes, C0934d.Preference_title, C0934d.Preference_android_title);
        this.f2728d = C0438c.m1169b(obtainStyledAttributes, C0934d.Preference_summary, C0934d.Preference_android_summary);
        this.f2737m = obtainStyledAttributes.getInt(C0934d.Preference_order, obtainStyledAttributes.getInt(C0934d.Preference_android_order, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
        this.f2741q = C0438c.m1164a(obtainStyledAttributes, C0934d.Preference_fragment, C0934d.Preference_android_fragment);
        this.f2744t = C0438c.m1159a(obtainStyledAttributes, C0934d.Preference_layout, C0934d.Preference_android_layout, C0933c.preference);
        this.f2745u = C0438c.m1159a(obtainStyledAttributes, C0934d.Preference_widgetLayout, C0934d.Preference_android_widgetLayout, 0);
        this.f2731g = C0438c.m1165a(obtainStyledAttributes, C0934d.Preference_enabled, C0934d.Preference_android_enabled, true);
        this.f2732h = C0438c.m1165a(obtainStyledAttributes, C0934d.Preference_selectable, C0934d.Preference_android_selectable, true);
        this.f2742r = C0438c.m1165a(obtainStyledAttributes, C0934d.Preference_persistent, C0934d.Preference_android_persistent, true);
        this.f2733i = C0438c.m1164a(obtainStyledAttributes, C0934d.Preference_dependency, C0934d.Preference_android_dependency);
        this.f2716A = C0438c.m1165a(obtainStyledAttributes, C0934d.Preference_allowDividerAbove, C0934d.Preference_allowDividerAbove, this.f2732h);
        this.f2717B = C0438c.m1165a(obtainStyledAttributes, C0934d.Preference_allowDividerBelow, C0934d.Preference_allowDividerBelow, this.f2732h);
        if (obtainStyledAttributes.hasValue(C0934d.Preference_defaultValue)) {
            this.f2748x = mo852a(obtainStyledAttributes, C0934d.Preference_defaultValue);
        } else if (obtainStyledAttributes.hasValue(C0934d.Preference_android_defaultValue)) {
            this.f2748x = mo852a(obtainStyledAttributes, C0934d.Preference_android_defaultValue);
        }
        this.f2721F = C0438c.m1165a(obtainStyledAttributes, C0934d.Preference_shouldDisableView, C0934d.Preference_android_shouldDisableView, true);
        this.f2718C = obtainStyledAttributes.hasValue(C0934d.Preference_singleLineTitle);
        if (this.f2718C) {
            this.f2719D = C0438c.m1165a(obtainStyledAttributes, C0934d.Preference_singleLineTitle, C0934d.Preference_android_singleLineTitle, true);
        }
        this.f2720E = C0438c.m1165a(obtainStyledAttributes, C0934d.Preference_iconSpaceReserved, C0934d.Preference_android_iconSpaceReserved, false);
        obtainStyledAttributes.recycle();
    }

    private Preference mo860a(String str) {
        return (TextUtils.isEmpty(str) || this.f2735k == null) ? null : this.f2735k.m2713a(str);
    }

    private void m2578a(Editor editor) {
        if ((!this.f2735k.f2858b ? 1 : null) != null) {
            C0442a.m1175a();
            C0442a.m1176a(editor);
        }
    }

    private void m2579a(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                m2579a(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    private void mo857d(boolean z) {
        if (this.f2749y == z) {
            this.f2749y = !z;
            mo869a(mo855c());
            mo862b();
        }
    }

    private C0921a mo873i() {
        return this.f2725a != null ? this.f2725a : this.f2735k != null ? this.f2735k.f2857a : null;
    }

    private boolean mo874j() {
        return !TextUtils.isEmpty(this.f2739o);
    }

    private boolean mo889k() {
        return this.f2735k != null && this.f2742r && mo874j();
    }

    protected Object mo852a(TypedArray typedArray, int i) {
        return null;
    }

    protected void mo853a() {
    }

    void mo868a(Bundle bundle) {
        if (mo874j()) {
            this.f2723H = false;
            Parcelable d = mo856d();
            if (!this.f2723H) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (d != null) {
                bundle.putParcelable(this.f2739o, d);
            }
        }
    }

    protected void mo854a(Parcelable parcelable) {
        this.f2723H = true;
        if (parcelable != BaseSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public void mo875a(C0626b c0626b) {
    }

    public void mo858a(C0930e c0930e) {
        CharSequence charSequence;
        int i = 0;
        c0930e.itemView.setOnClickListener(this.f2724I);
        c0930e.itemView.setId(this.f2727c);
        TextView textView = (TextView) c0930e.m2715a(16908310);
        if (textView != null) {
            charSequence = this.f2738n;
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
            } else {
                textView.setText(charSequence);
                textView.setVisibility(0);
                if (this.f2718C) {
                    textView.setSingleLine(this.f2719D);
                }
            }
        }
        textView = (TextView) c0930e.m2715a(16908304);
        if (textView != null) {
            charSequence = mo861e();
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
            } else {
                textView.setText(charSequence);
                textView.setVisibility(0);
            }
        }
        ImageView imageView = (ImageView) c0930e.m2715a(16908294);
        if (imageView != null) {
            ImageView imageView2;
            int i2;
            if (!(this.f2729e == 0 && this.f2730f == null)) {
                if (this.f2730f == null) {
                    this.f2730f = C0392a.getDrawable(this.f2734j, this.f2729e);
                }
                if (this.f2730f != null) {
                    imageView.setImageDrawable(this.f2730f);
                }
            }
            if (this.f2730f != null) {
                imageView2 = imageView;
                i2 = 0;
            } else if (this.f2720E) {
                imageView2 = imageView;
                i2 = 4;
            } else {
                imageView2 = imageView;
                i2 = 8;
            }
            imageView2.setVisibility(i2);
        }
        View a = c0930e.m2715a(C0932b.icon_frame);
        if (a == null) {
            a = c0930e.m2715a(16908350);
        }
        if (a != null) {
            if (this.f2730f == null) {
                i = this.f2720E ? 4 : 8;
            }
            a.setVisibility(i);
        }
        if (this.f2721F) {
            m2579a(c0930e.itemView, mo876f());
        } else {
            m2579a(c0930e.itemView, true);
        }
        boolean z = this.f2732h;
        c0930e.itemView.setFocusable(z);
        c0930e.itemView.setClickable(z);
        c0930e.f2875a = this.f2716A;
        c0930e.f2876b = this.f2717B;
    }

    protected void mo859a(View view) {
        if (mo876f()) {
            mo853a();
            if (this.f2726b == null || !this.f2726b.m2657a()) {
                C0927c c0927c = this.f2735k;
                if (c0927c != null) {
                    C0914c c0914c = c0927c.f2861e;
                    if (c0914c != null && c0914c.mo881a(this)) {
                        return;
                    }
                }
                if (this.f2740p != null) {
                    this.f2734j.startActivity(this.f2740p);
                }
            }
        }
    }

    public void mo869a(boolean z) {
        List list = this.f2722G;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Preference) list.get(i)).mo857d(z);
            }
        }
    }

    protected final boolean m2592a(int i) {
        if (!mo889k()) {
            return false;
        }
        int i2 = i ^ -1;
        if (mo889k() && mo873i() == null) {
            i2 = this.f2735k.m2712a().getInt(this.f2739o, i2);
        }
        if (i == i2) {
            return true;
        }
        if (mo873i() != null) {
            throw new UnsupportedOperationException("Not implemented on this data store");
        }
        Editor b = this.f2735k.m2714b();
        b.putInt(this.f2739o, i);
        m2578a(b);
        return true;
    }

    protected void mo862b() {
        if (this.f2746v != null) {
            this.f2746v.mo887a(this);
        }
    }

    void mo870b(Bundle bundle) {
        if (mo874j()) {
            Parcelable parcelable = bundle.getParcelable(this.f2739o);
            if (parcelable != null) {
                this.f2723H = false;
                mo854a(parcelable);
                if (!this.f2723H) {
                    throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
                }
            }
        }
    }

    public final void m2595b(boolean z) {
        if (this.f2750z == z) {
            this.f2750z = !z;
            mo869a(mo855c());
            mo862b();
        }
    }

    public boolean mo855c() {
        return !mo876f();
    }

    protected final boolean m2597c(String str) {
        CharSequence charSequence = null;
        if (!mo889k()) {
            return false;
        }
        if (mo889k() && mo873i() == null) {
            charSequence = this.f2735k.m2712a().getString(this.f2739o, null);
        }
        if (TextUtils.equals(str, charSequence)) {
            return true;
        }
        if (mo873i() != null) {
            throw new UnsupportedOperationException("Not implemented on this data store");
        }
        Editor b = this.f2735k.m2714b();
        b.putString(this.f2739o, str);
        m2578a(b);
        return true;
    }

    protected final boolean m2598c(boolean z) {
        boolean z2 = false;
        if (!mo889k()) {
            return false;
        }
        if (!z) {
            z2 = true;
        }
        if (mo889k() && mo873i() == null) {
            z2 = this.f2735k.m2712a().getBoolean(this.f2739o, z2);
        }
        if (z == z2) {
            return true;
        }
        if (mo873i() != null) {
            throw new UnsupportedOperationException("Not implemented on this data store");
        }
        Editor b = this.f2735k.m2714b();
        b.putBoolean(this.f2739o, z);
        m2578a(b);
        return true;
    }

    public /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        return this.f2737m != preference.f2737m ? this.f2737m - preference.f2737m : this.f2738n == preference.f2738n ? 0 : this.f2738n == null ? 1 : preference.f2738n == null ? -1 : this.f2738n.toString().compareToIgnoreCase(preference.f2738n.toString());
    }

    protected Parcelable mo856d() {
        this.f2723H = true;
        return BaseSavedState.EMPTY_STATE;
    }

    public CharSequence mo861e() {
        return this.f2728d;
    }

    public boolean mo876f() {
        return this.f2731g && this.f2749y && this.f2750z;
    }

    public void mo871g() {
        if (!TextUtils.isEmpty(this.f2733i)) {
            Preference a = mo860a(this.f2733i);
            if (a != null) {
                if (a.f2722G == null) {
                    a.f2722G = new ArrayList();
                }
                a.f2722G.add(this);
                mo857d(a.mo855c());
                return;
            }
            throw new IllegalStateException("Dependency \"" + this.f2733i + "\" not found for preference \"" + this.f2739o + "\" (title: \"" + this.f2738n + "\"");
        }
    }

    public void mo872h() {
        if (this.f2733i != null) {
            Preference a = mo860a(this.f2733i);
            if (!(a == null || a.f2722G == null)) {
                a.f2722G.remove(this);
            }
        }
        this.f2747w = true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence charSequence = this.f2738n;
        if (!TextUtils.isEmpty(charSequence)) {
            stringBuilder.append(charSequence).append(' ');
        }
        charSequence = mo861e();
        if (!TextUtils.isEmpty(charSequence)) {
            stringBuilder.append(charSequence).append(' ');
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }
}
