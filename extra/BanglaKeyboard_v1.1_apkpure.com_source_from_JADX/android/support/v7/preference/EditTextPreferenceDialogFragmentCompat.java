package android.support.v7.preference;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    private EditText f2783a;
    private CharSequence f2784b;

    public static EditTextPreferenceDialogFragmentCompat m2639a(String str) {
        EditTextPreferenceDialogFragmentCompat editTextPreferenceDialogFragmentCompat = new EditTextPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        editTextPreferenceDialogFragmentCompat.setArguments(bundle);
        return editTextPreferenceDialogFragmentCompat;
    }

    protected final void mo864a(View view) {
        super.mo864a(view);
        this.f2783a = (EditText) view.findViewById(16908291);
        if (this.f2783a == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        this.f2783a.setText(this.f2784b);
    }

    public final void mo865a(boolean z) {
        if (z) {
            String obj = this.f2783a.getText().toString();
            m2638b();
            ((EditTextPreference) m2638b()).mo860a(obj);
        }
    }

    protected final boolean mo866a() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f2784b = ((EditTextPreference) m2638b()).f2774g;
        } else {
            this.f2784b = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f2784b);
    }
}
