package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.NotificationCompat;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.gms.C0325e;
import com.google.android.gms.C0326f;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class WalletFragmentStyle implements SafeParcelable {
    public static final Creator CREATOR = new C0554h();
    final int f2505a;
    Bundle f2506b;
    int f2507c;

    public WalletFragmentStyle() {
        this.f2505a = 1;
        this.f2506b = new Bundle();
    }

    WalletFragmentStyle(int i, Bundle bundle, int i2) {
        this.f2505a = i;
        this.f2506b = bundle;
        this.f2507c = i2;
    }

    private void m3791a(TypedArray typedArray, int i, String str) {
        if (!this.f2506b.containsKey(str)) {
            TypedValue peekValue = typedArray.peekValue(i);
            if (peekValue != null) {
                long a;
                Bundle bundle = this.f2506b;
                switch (peekValue.type) {
                    case 5:
                        a = C0547a.m3797a(NotificationCompat.FLAG_HIGH_PRIORITY, peekValue.data);
                        break;
                    case 16:
                        int i2 = peekValue.data;
                        if (i2 >= 0) {
                            a = C0547a.m3797a(0, Float.floatToIntBits((float) i2));
                            break;
                        } else if (i2 == -1 || i2 == -2) {
                            a = C0547a.m3797a(129, i2);
                            break;
                        } else {
                            throw new IllegalArgumentException("Unexpected dimension value: " + i2);
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unexpected dimension type: " + peekValue.type);
                }
                bundle.putLong(str, a);
            }
        }
    }

    private void m3792a(TypedArray typedArray, int i, String str, String str2) {
        if (!this.f2506b.containsKey(str) && !this.f2506b.containsKey(str2)) {
            TypedValue peekValue = typedArray.peekValue(i);
            if (peekValue == null) {
                return;
            }
            if (peekValue.type < 28 || peekValue.type > 31) {
                this.f2506b.putInt(str2, peekValue.resourceId);
            } else {
                this.f2506b.putInt(str, peekValue.data);
            }
        }
    }

    private void m3793b(TypedArray typedArray, int i, String str) {
        if (!this.f2506b.containsKey(str)) {
            TypedValue peekValue = typedArray.peekValue(i);
            if (peekValue != null) {
                this.f2506b.putInt(str, peekValue.data);
            }
        }
    }

    public final int m3794a(String str, DisplayMetrics displayMetrics, int i) {
        if (!this.f2506b.containsKey(str)) {
            return i;
        }
        int i2;
        long j = this.f2506b.getLong(str);
        int i3 = (int) (j >>> 32);
        i = (int) j;
        switch (i3) {
            case 0:
                i2 = 0;
                break;
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 5;
                break;
            case NotificationCompat.FLAG_HIGH_PRIORITY /*128*/:
                return TypedValue.complexToDimensionPixelSize(i, displayMetrics);
            case 129:
                return i;
            default:
                throw new IllegalStateException("Unexpected unit or type: " + i3);
        }
        return Math.round(TypedValue.applyDimension(i2, Float.intBitsToFloat(i), displayMetrics));
    }

    public final WalletFragmentStyle m3795a(int i) {
        this.f2507c = i;
        return this;
    }

    public final void m3796a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.f2507c <= 0 ? C0325e.WalletFragmentDefaultStyle : this.f2507c, C0326f.WalletFragmentStyle);
        m3791a(obtainStyledAttributes, 1, "buyButtonWidth");
        m3791a(obtainStyledAttributes, 0, "buyButtonHeight");
        m3793b(obtainStyledAttributes, 2, "buyButtonText");
        m3793b(obtainStyledAttributes, 3, "buyButtonAppearance");
        m3793b(obtainStyledAttributes, 4, "maskedWalletDetailsTextAppearance");
        m3793b(obtainStyledAttributes, 5, "maskedWalletDetailsHeaderTextAppearance");
        m3792a(obtainStyledAttributes, 6, "maskedWalletDetailsBackgroundColor", "maskedWalletDetailsBackgroundResource");
        m3793b(obtainStyledAttributes, 7, "maskedWalletDetailsButtonTextAppearance");
        m3792a(obtainStyledAttributes, 8, "maskedWalletDetailsButtonBackgroundColor", "maskedWalletDetailsButtonBackgroundResource");
        m3793b(obtainStyledAttributes, 9, "maskedWalletDetailsLogoTextColor");
        m3793b(obtainStyledAttributes, 10, "maskedWalletDetailsLogoImageType");
        obtainStyledAttributes.recycle();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0554h.m3814a(this, parcel);
    }
}
