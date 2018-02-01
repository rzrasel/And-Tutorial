package android.support.v7.preference;

import android.content.Context;
import android.support.v7.preference.C0935f.C0931a;
import android.support.v7.preference.C0935f.C0932b;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DropDownPreference extends ListPreference {
    private final OnItemSelectedListener f2769A;
    private final Context f2770x;
    private final ArrayAdapter f2771y;
    private Spinner f2772z;

    class C08971 implements OnItemSelectedListener {
        final /* synthetic */ DropDownPreference f2763a;

        C08971(DropDownPreference dropDownPreference) {
            this.f2763a = dropDownPreference;
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = this.f2763a.f2765h[i].toString();
                if (!charSequence.equals(this.f2763a.f2766i)) {
                    this.f2763a.mo860a(charSequence);
                }
            }
        }

        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0931a.dropdownPreferenceStyle);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private DropDownPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i, (byte) 0);
        this.f2769A = new C08971(this);
        this.f2770x = context;
        this.f2771y = new ArrayAdapter(this.f2770x, 17367049);
        m2625i();
    }

    private void m2625i() {
        this.f2771y.clear();
        if (this.f2764g != null) {
            for (CharSequence charSequence : this.f2764g) {
                this.f2771y.add(charSequence.toString());
            }
        }
    }

    protected final void mo853a() {
        this.f2772z.performClick();
    }

    public final void mo858a(C0930e c0930e) {
        int length;
        this.f2772z = (Spinner) c0930e.itemView.findViewById(C0932b.spinner);
        this.f2772z.setAdapter(this.f2771y);
        this.f2772z.setOnItemSelectedListener(this.f2769A);
        Spinner spinner = this.f2772z;
        String str = this.f2766i;
        CharSequence[] charSequenceArr = this.f2765h;
        if (!(str == null || charSequenceArr == null)) {
            length = charSequenceArr.length - 1;
            while (length >= 0) {
                if (charSequenceArr[length].equals(str)) {
                    break;
                }
                length--;
            }
        }
        length = -1;
        spinner.setSelection(length);
        super.mo858a(c0930e);
    }

    protected final void mo862b() {
        super.mo862b();
        this.f2771y.notifyDataSetChanged();
    }
}
