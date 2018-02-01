package android.support.v7.preference;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.os.Bundle;
import android.support.v7.app.C0823c.C0822a;
import android.support.v7.preference.internal.AbstractMultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    private Set<String> f2791a = new HashSet();
    private boolean f2792b;
    private CharSequence[] f2793c;
    private CharSequence[] f2794d;

    class C09011 implements OnMultiChoiceClickListener {
        final /* synthetic */ MultiSelectListPreferenceDialogFragmentCompat f2790a;

        C09011(MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat) {
            this.f2790a = multiSelectListPreferenceDialogFragmentCompat;
        }

        public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
            if (z) {
                this.f2790a.f2792b = this.f2790a.f2792b | this.f2790a.f2791a.add(this.f2790a.f2794d[i].toString());
            } else {
                this.f2790a.f2792b = this.f2790a.f2792b | this.f2790a.f2791a.remove(this.f2790a.f2794d[i].toString());
            }
        }
    }

    public static MultiSelectListPreferenceDialogFragmentCompat m2649a(String str) {
        MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = new MultiSelectListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle);
        return multiSelectListPreferenceDialogFragmentCompat;
    }

    protected final void mo867a(C0822a c0822a) {
        super.mo867a(c0822a);
        int length = this.f2794d.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f2791a.contains(this.f2794d[i].toString());
        }
        CharSequence[] charSequenceArr = this.f2793c;
        OnMultiChoiceClickListener c09011 = new C09011(this);
        c0822a.f2505a.f2348s = charSequenceArr;
        c0822a.f2505a.f2324G = c09011;
        c0822a.f2505a.f2320C = zArr;
        c0822a.f2505a.f2321D = true;
    }

    public final void mo865a(boolean z) {
        m2638b();
        this.f2792b = false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            AbstractMultiSelectListPreference abstractMultiSelectListPreference = (AbstractMultiSelectListPreference) m2638b();
            if (abstractMultiSelectListPreference.mo873i() == null || abstractMultiSelectListPreference.mo889k() == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.f2791a.clear();
            this.f2791a.addAll(abstractMultiSelectListPreference.mo874j());
            this.f2792b = false;
            this.f2793c = abstractMultiSelectListPreference.mo873i();
            this.f2794d = abstractMultiSelectListPreference.mo889k();
            return;
        }
        this.f2791a.clear();
        this.f2791a.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.f2792b = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.f2793c = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.f2794d = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.f2791a));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f2792b);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f2793c);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f2794d);
    }
}
