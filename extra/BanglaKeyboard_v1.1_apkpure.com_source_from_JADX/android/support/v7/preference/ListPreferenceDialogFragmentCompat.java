package android.support.v7.preference;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v7.app.C0823c.C0822a;
import java.util.ArrayList;

public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    private int f2787a;
    private CharSequence[] f2788b;
    private CharSequence[] f2789c;

    class C09001 implements OnClickListener {
        final /* synthetic */ ListPreferenceDialogFragmentCompat f2786a;

        C09001(ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat) {
            this.f2786a = listPreferenceDialogFragmentCompat;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f2786a.f2787a = i;
            this.f2786a.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    public static ListPreferenceDialogFragmentCompat m2644a(String str) {
        ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        listPreferenceDialogFragmentCompat.setArguments(bundle);
        return listPreferenceDialogFragmentCompat;
    }

    private static void m2645a(Bundle bundle, String str, CharSequence[] charSequenceArr) {
        ArrayList arrayList = new ArrayList(charSequenceArr.length);
        for (CharSequence charSequence : charSequenceArr) {
            arrayList.add(charSequence.toString());
        }
        bundle.putStringArrayList(str, arrayList);
    }

    private static CharSequence[] m2646a(Bundle bundle, String str) {
        ArrayList stringArrayList = bundle.getStringArrayList(str);
        return stringArrayList == null ? null : (CharSequence[]) stringArrayList.toArray(new CharSequence[stringArrayList.size()]);
    }

    protected final void mo867a(C0822a c0822a) {
        super.mo867a(c0822a);
        CharSequence[] charSequenceArr = this.f2788b;
        int i = this.f2787a;
        OnClickListener c09001 = new C09001(this);
        c0822a.f2505a.f2348s = charSequenceArr;
        c0822a.f2505a.f2350u = c09001;
        c0822a.f2505a.f2323F = i;
        c0822a.f2505a.f2322E = true;
        c0822a.m2393a(null, null);
    }

    public final void mo865a(boolean z) {
        ListPreference listPreference = (ListPreference) m2638b();
        if (z && this.f2787a >= 0) {
            listPreference.mo860a(this.f2789c[this.f2787a].toString());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) m2638b();
            if (listPreference.f2764g == null || listPreference.f2765h == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.f2787a = listPreference.m2622b(listPreference.f2766i);
            this.f2788b = listPreference.f2764g;
            this.f2789c = listPreference.f2765h;
            return;
        }
        this.f2787a = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.f2788b = m2646a(bundle, "ListPreferenceDialogFragment.entries");
        this.f2789c = m2646a(bundle, "ListPreferenceDialogFragment.entryValues");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f2787a);
        m2645a(bundle, "ListPreferenceDialogFragment.entries", this.f2788b);
        m2645a(bundle, "ListPreferenceDialogFragment.entryValues", this.f2789c);
    }
}
