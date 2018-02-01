package com.orange.studio.banglatype;

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
import com.orange.studio.banglatype.bk.C1713a;

public class SlidingPanel extends LinearLayout {
    AnimationListener f7945a = new C16821(this);
    private int f7946b = 300;
    private boolean f7947c = false;
    private Animation f7948d = null;

    class C16821 implements AnimationListener {
        final /* synthetic */ SlidingPanel f7943a;

        C16821(SlidingPanel slidingPanel) {
            this.f7943a = slidingPanel;
        }

        public final void onAnimationEnd(Animation animation) {
            this.f7943a.setVisibility(8);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    }

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C16831();
        int f7944a;

        static class C16831 implements Creator<SavedState> {
            C16831() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f7944a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7944a);
        }
    }

    public SlidingPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1713a.SlidingPanel, 0, 0);
        this.f7946b = obtainStyledAttributes.getInt(0, 300);
        obtainStyledAttributes.recycle();
        this.f7948d = AnimationUtils.loadAnimation(context, R.anim.fade);
    }
}
