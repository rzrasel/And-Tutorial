package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.preference.C0927c.C0912a;
import android.support.v7.preference.C0927c.C0913b;
import android.support.v7.preference.C0927c.C0914c;
import android.support.v7.preference.C0935f.C0931a;
import android.support.v7.preference.C0935f.C0933c;
import android.support.v7.preference.C0935f.C0934d;
import android.support.v7.preference.DialogPreference.C0896a;
import android.support.v7.preference.internal.AbstractMultiSelectListPreference;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.State;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class PreferenceFragmentCompat extends Fragment implements C0896a, C0912a, C0913b, C0914c {
    private C0927c f2809a;
    private RecyclerView f2810b;
    private boolean f2811c;
    private boolean f2812d;
    private Context f2813e;
    private int f2814f = C0933c.preference_list_fragment;
    private final C0908a f2815g = new C0908a();
    private Handler f2816h = new C09061(this);
    private final Runnable f2817i = new C09072(this);
    private Runnable f2818j;

    class C09061 extends Handler {
        final /* synthetic */ PreferenceFragmentCompat f2803a;

        C09061(PreferenceFragmentCompat preferenceFragmentCompat) {
            this.f2803a = preferenceFragmentCompat;
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f2803a.m2679b();
                    return;
                default:
                    return;
            }
        }
    }

    class C09072 implements Runnable {
        final /* synthetic */ PreferenceFragmentCompat f2804a;

        C09072(PreferenceFragmentCompat preferenceFragmentCompat) {
            this.f2804a = preferenceFragmentCompat;
        }

        public final void run() {
            this.f2804a.f2810b.focusableViewAvailable(this.f2804a.f2810b);
        }
    }

    private class C0908a extends ItemDecoration {
        Drawable f2805a;
        int f2806b;
        boolean f2807c;
        final /* synthetic */ PreferenceFragmentCompat f2808d;

        private C0908a(PreferenceFragmentCompat preferenceFragmentCompat) {
            this.f2808d = preferenceFragmentCompat;
            this.f2807c = true;
        }

        private boolean m2671a(View view, RecyclerView recyclerView) {
            ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z = (childViewHolder instanceof C0930e) && ((C0930e) childViewHolder).f2876b;
            if (!z) {
                return false;
            }
            z = this.f2807c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild < recyclerView.getChildCount() - 1) {
                childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(indexOfChild + 1));
                z = (childViewHolder instanceof C0930e) && ((C0930e) childViewHolder).f2875a;
            }
            return z;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
            if (m2671a(view, recyclerView)) {
                rect.bottom = this.f2806b;
            }
        }

        public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, State state) {
            if (this.f2805a != null) {
                int childCount = recyclerView.getChildCount();
                int width = recyclerView.getWidth();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    if (m2671a(childAt, recyclerView)) {
                        int height = childAt.getHeight() + ((int) childAt.getY());
                        this.f2805a.setBounds(0, height, width, this.f2806b + height);
                        this.f2805a.draw(canvas);
                    }
                }
            }
        }
    }

    public interface C0909b {
        boolean m2672a();
    }

    public interface C0910c {
        boolean m2673a();
    }

    public interface C0911d {
    }

    private void m2679b() {
        PreferenceGroup preferenceGroup = this.f2809a.f2859c;
        if (preferenceGroup != null) {
            this.f2810b.setAdapter(new C0925b(preferenceGroup));
            preferenceGroup.mo871g();
        }
    }

    public final Preference mo879a(CharSequence charSequence) {
        return this.f2809a == null ? null : this.f2809a.m2713a(charSequence);
    }

    public final void mo880a() {
        if (getActivity() instanceof C0911d) {
            getActivity();
        }
    }

    public final boolean mo881a(Preference preference) {
        return (preference.f2741q == null || !(getActivity() instanceof C0910c)) ? false : ((C0910c) getActivity()).m2673a();
    }

    public final void mo882b(Preference preference) {
        if (!(getActivity() instanceof C0909b ? ((C0909b) getActivity()).m2672a() : false) && getFragmentManager().findFragmentByTag("android.support.v7.preference.PreferenceFragment.DIALOG") == null) {
            DialogFragment a;
            if (preference instanceof EditTextPreference) {
                a = EditTextPreferenceDialogFragmentCompat.m2639a(preference.f2739o);
            } else if (preference instanceof ListPreference) {
                a = ListPreferenceDialogFragmentCompat.m2644a(preference.f2739o);
            } else if (preference instanceof AbstractMultiSelectListPreference) {
                a = MultiSelectListPreferenceDialogFragmentCompat.m2649a(preference.f2739o);
            } else {
                throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
            }
            a.setTargetFragment(this, 0);
            a.show(getFragmentManager(), "android.support.v7.preference.PreferenceFragment.DIALOG");
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("android:preferences");
            if (bundle2 != null) {
                Preference preference = this.f2809a.f2859c;
                if (preference != null) {
                    preference.mo870b(bundle2);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(C0931a.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            throw new IllegalStateException("Must specify preferenceTheme in theme");
        }
        this.f2813e = new ContextThemeWrapper(getActivity(), i);
        this.f2809a = new C0927c(this.f2813e);
        this.f2809a.f2863g = this;
        if (getArguments() != null) {
            getArguments().getString("android.support.v7.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = this.f2813e.obtainStyledAttributes(null, C0934d.PreferenceFragmentCompat, C0931a.preferenceFragmentCompatStyle, 0);
        this.f2814f = obtainStyledAttributes.getResourceId(C0934d.PreferenceFragmentCompat_android_layout, this.f2814f);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0934d.PreferenceFragmentCompat_android_divider);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0934d.PreferenceFragmentCompat_android_dividerHeight, -1);
        boolean z = obtainStyledAttributes.getBoolean(C0934d.PreferenceFragmentCompat_allowDividerAfterLastItem, true);
        obtainStyledAttributes.recycle();
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(C0931a.preferenceTheme, typedValue, true);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(new ContextThemeWrapper(layoutInflater.getContext(), typedValue.resourceId));
        View inflate = cloneInContext.inflate(this.f2814f, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView recyclerView = (RecyclerView) cloneInContext.inflate(C0933c.preference_recyclerview, viewGroup2, false);
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            recyclerView.setAccessibilityDelegateCompat(new C0929d(recyclerView));
            if (recyclerView == null) {
                throw new RuntimeException("Could not create RecyclerView");
            }
            this.f2810b = recyclerView;
            recyclerView.addItemDecoration(this.f2815g);
            C0908a c0908a = this.f2815g;
            if (drawable != null) {
                c0908a.f2806b = drawable.getIntrinsicHeight();
            } else {
                c0908a.f2806b = 0;
            }
            c0908a.f2805a = drawable;
            c0908a.f2808d.f2810b.invalidateItemDecorations();
            if (dimensionPixelSize != -1) {
                c0908a = this.f2815g;
                c0908a.f2806b = dimensionPixelSize;
                c0908a.f2808d.f2810b.invalidateItemDecorations();
            }
            this.f2815g.f2807c = z;
            viewGroup2.addView(this.f2810b);
            this.f2816h.post(this.f2817i);
            return inflate;
        }
        throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    public void onDestroyView() {
        this.f2816h.removeCallbacks(this.f2817i);
        this.f2816h.removeMessages(1);
        if (this.f2811c) {
            PreferenceScreen preferenceScreen = this.f2809a.f2859c;
            if (preferenceScreen != null) {
                preferenceScreen.mo872h();
            }
        }
        this.f2810b = null;
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Preference preference = this.f2809a.f2859c;
        if (preference != null) {
            Bundle bundle2 = new Bundle();
            preference.mo868a(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    public void onStart() {
        super.onStart();
        this.f2809a.f2861e = this;
        this.f2809a.f2862f = this;
    }

    public void onStop() {
        super.onStop();
        this.f2809a.f2861e = null;
        this.f2809a.f2862f = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f2811c) {
            m2679b();
            if (this.f2818j != null) {
                this.f2818j.run();
                this.f2818j = null;
            }
        }
        this.f2812d = true;
    }
}
