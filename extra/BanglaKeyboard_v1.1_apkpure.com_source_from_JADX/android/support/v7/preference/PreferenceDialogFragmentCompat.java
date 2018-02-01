package android.support.v7.preference;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.C0823c.C0822a;
import android.support.v7.preference.DialogPreference.C0896a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements OnClickListener {
    private DialogPreference f2775a;
    private CharSequence f2776b;
    private CharSequence f2777c;
    private CharSequence f2778d;
    private CharSequence f2779e;
    private int f2780f;
    private BitmapDrawable f2781g;
    private int f2782h;

    protected void mo867a(C0822a c0822a) {
    }

    protected void mo864a(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f2779e;
            int i = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    public abstract void mo865a(boolean z);

    protected boolean mo866a() {
        return false;
    }

    public final DialogPreference m2638b() {
        if (this.f2775a == null) {
            this.f2775a = (DialogPreference) ((C0896a) getTargetFragment()).mo879a(getArguments().getString("key"));
        }
        return this.f2775a;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f2782h = i;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof C0896a) {
            C0896a c0896a = (C0896a) targetFragment;
            CharSequence string = getArguments().getString("key");
            if (bundle == null) {
                this.f2775a = (DialogPreference) c0896a.mo879a(string);
                this.f2776b = this.f2775a.f2757a;
                this.f2777c = this.f2775a.f2760d;
                this.f2778d = this.f2775a.f2761e;
                this.f2779e = this.f2775a.f2758b;
                this.f2780f = this.f2775a.f2762f;
                Drawable drawable = this.f2775a.f2759c;
                if (drawable == null || (drawable instanceof BitmapDrawable)) {
                    this.f2781g = (BitmapDrawable) drawable;
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                this.f2781g = new BitmapDrawable(getResources(), createBitmap);
                return;
            }
            this.f2776b = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f2777c = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f2778d = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f2779e = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f2780f = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f2781g = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View view = null;
        Context activity = getActivity();
        this.f2782h = -2;
        C0822a a = new C0822a(activity).m2392a(this.f2776b).m2391a(this.f2781g).m2393a(this.f2777c, this);
        a.f2505a.f2340k = this.f2778d;
        a.f2505a.f2341l = this;
        int i = this.f2780f;
        if (i != 0) {
            view = LayoutInflater.from(activity).inflate(i, null);
        }
        if (view != null) {
            mo864a(view);
            a.f2505a.f2352w = view;
            a.f2505a.f2351v = 0;
            a.f2505a.f2319B = false;
        } else {
            a.m2396b(this.f2779e);
        }
        mo867a(a);
        Dialog a2 = a.m2394a();
        if (mo866a()) {
            a2.getWindow().setSoftInputMode(5);
        }
        return a2;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo865a(this.f2782h == -1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f2776b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f2777c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f2778d);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f2779e);
        bundle.putInt("PreferenceDialogFragment.layout", this.f2780f);
        if (this.f2781g != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", this.f2781g.getBitmap());
        }
    }
}
