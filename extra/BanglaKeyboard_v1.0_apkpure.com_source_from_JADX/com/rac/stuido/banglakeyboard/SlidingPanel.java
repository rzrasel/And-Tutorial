package com.rac.stuido.banglakeyboard;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.actionbarsherlock.C0126R;

public class SlidingPanel extends LinearLayout {
    AnimationListener f2554a = new by(this);
    private int f2555b = 300;
    private boolean f2556c = false;
    private Animation f2557d = null;

    class SavedState extends BaseSavedState {
        public static final Creator CREATOR = new bz();
        int f2553a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f2553a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2553a);
        }
    }

    public SlidingPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, br.SlidingPanel, 0, 0);
        this.f2555b = obtainStyledAttributes.getInt(0, 300);
        obtainStyledAttributes.recycle();
        this.f2557d = AnimationUtils.loadAnimation(context, C0126R.anim.fade);
        "SlidingPanel construct isOpen: " + this.f2556c;
    }
}
