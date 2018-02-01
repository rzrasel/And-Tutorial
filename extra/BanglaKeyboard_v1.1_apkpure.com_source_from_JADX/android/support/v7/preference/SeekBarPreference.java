package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v7.preference.C0935f.C0931a;
import android.support.v7.preference.C0935f.C0932b;
import android.support.v7.preference.C0935f.C0934d;
import android.support.v7.preference.Preference.BaseSavedState;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class SeekBarPreference extends Preference {
    private int f2826a;
    private int f2827b;
    private int f2828c;
    private int f2829d;
    private boolean f2830e;
    private SeekBar f2831f;
    private TextView f2832g;
    private boolean f2833h;
    private boolean f2834i;
    private OnSeekBarChangeListener f2835x;
    private OnKeyListener f2836y;

    class C09161 implements OnSeekBarChangeListener {
        final /* synthetic */ SeekBarPreference f2821a;

        C09161(SeekBarPreference seekBarPreference) {
            this.f2821a = seekBarPreference;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z && !this.f2821a.f2830e) {
                SeekBarPreference.m2686a(this.f2821a, seekBar);
            }
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            this.f2821a.f2830e = true;
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            this.f2821a.f2830e = false;
            if (seekBar.getProgress() + this.f2821a.f2827b != this.f2821a.f2826a) {
                SeekBarPreference.m2686a(this.f2821a, seekBar);
            }
        }
    }

    class C09172 implements OnKeyListener {
        final /* synthetic */ SeekBarPreference f2822a;

        C09172(SeekBarPreference seekBarPreference) {
            this.f2822a = seekBarPreference;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            return keyEvent.getAction() != 0 ? false : ((!this.f2822a.f2833h && (i == 21 || i == 22)) || i == 23 || i == 66 || this.f2822a.f2831f == null) ? false : this.f2822a.f2831f.onKeyDown(i, keyEvent);
        }
    }

    private static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C09181();
        int f2823a;
        int f2824b;
        int f2825c;

        static class C09181 implements Creator<SavedState> {
            C09181() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f2823a = parcel.readInt();
            this.f2824b = parcel.readInt();
            this.f2825c = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2823a);
            parcel.writeInt(this.f2824b);
            parcel.writeInt(this.f2825c);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0931a.seekBarPreferenceStyle);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private SeekBarPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i, (byte) 0);
        this.f2835x = new C09161(this);
        this.f2836y = new C09172(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0934d.SeekBarPreference, i, 0);
        this.f2827b = obtainStyledAttributes.getInt(C0934d.SeekBarPreference_min, 0);
        int i2 = obtainStyledAttributes.getInt(C0934d.SeekBarPreference_android_max, 100);
        if (i2 < this.f2827b) {
            i2 = this.f2827b;
        }
        if (i2 != this.f2828c) {
            this.f2828c = i2;
            mo862b();
        }
        i2 = obtainStyledAttributes.getInt(C0934d.SeekBarPreference_seekBarIncrement, 0);
        if (i2 != this.f2829d) {
            this.f2829d = Math.min(this.f2828c - this.f2827b, Math.abs(i2));
            mo862b();
        }
        this.f2833h = obtainStyledAttributes.getBoolean(C0934d.SeekBarPreference_adjustable, true);
        this.f2834i = obtainStyledAttributes.getBoolean(C0934d.SeekBarPreference_showSeekBarValue, true);
        obtainStyledAttributes.recycle();
    }

    static /* synthetic */ void m2686a(SeekBarPreference seekBarPreference, SeekBar seekBar) {
        int progress = seekBarPreference.f2827b + seekBar.getProgress();
        if (progress != seekBarPreference.f2826a) {
            Integer.valueOf(progress);
            if (progress < seekBarPreference.f2827b) {
                progress = seekBarPreference.f2827b;
            }
            if (progress > seekBarPreference.f2828c) {
                progress = seekBarPreference.f2828c;
            }
            if (progress != seekBarPreference.f2826a) {
                seekBarPreference.f2826a = progress;
                if (seekBarPreference.f2832g != null) {
                    seekBarPreference.f2832g.setText(String.valueOf(seekBarPreference.f2826a));
                }
                seekBarPreference.m2592a(progress);
            }
        }
    }

    protected final Object mo852a(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    protected final void mo854a(Parcelable parcelable) {
        if (parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            super.mo854a(savedState.getSuperState());
            this.f2826a = savedState.f2823a;
            this.f2827b = savedState.f2824b;
            this.f2828c = savedState.f2825c;
            mo862b();
            return;
        }
        super.mo854a(parcelable);
    }

    public final void mo858a(C0930e c0930e) {
        super.mo858a(c0930e);
        c0930e.itemView.setOnKeyListener(this.f2836y);
        this.f2831f = (SeekBar) c0930e.m2715a(C0932b.seekbar);
        this.f2832g = (TextView) c0930e.m2715a(C0932b.seekbar_value);
        if (this.f2834i) {
            this.f2832g.setVisibility(0);
        } else {
            this.f2832g.setVisibility(8);
            this.f2832g = null;
        }
        if (this.f2831f != null) {
            this.f2831f.setOnSeekBarChangeListener(this.f2835x);
            this.f2831f.setMax(this.f2828c - this.f2827b);
            if (this.f2829d != 0) {
                this.f2831f.setKeyProgressIncrement(this.f2829d);
            } else {
                this.f2829d = this.f2831f.getKeyProgressIncrement();
            }
            this.f2831f.setProgress(this.f2826a - this.f2827b);
            if (this.f2832g != null) {
                this.f2832g.setText(String.valueOf(this.f2826a));
            }
            this.f2831f.setEnabled(mo876f());
        }
    }

    protected final Parcelable mo856d() {
        Parcelable d = super.mo856d();
        if (this.f2742r) {
            return d;
        }
        SavedState savedState = new SavedState(d);
        savedState.f2823a = this.f2826a;
        savedState.f2824b = this.f2827b;
        savedState.f2825c = this.f2828c;
        return savedState;
    }
}
