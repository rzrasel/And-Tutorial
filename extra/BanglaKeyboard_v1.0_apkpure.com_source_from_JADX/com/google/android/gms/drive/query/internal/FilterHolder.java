package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.C0312a;

public class FilterHolder implements SafeParcelable {
    public static final Creator CREATOR = new C0318d();
    final int f677a;
    final ComparisonFilter f678b;
    final FieldOnlyFilter f679c;
    final LogicalFilter f680d;
    final NotFilter f681e;
    final InFilter f682f;
    final MatchAllFilter f683g;
    private final C0312a f684h;

    FilterHolder(int i, ComparisonFilter comparisonFilter, FieldOnlyFilter fieldOnlyFilter, LogicalFilter logicalFilter, NotFilter notFilter, InFilter inFilter, MatchAllFilter matchAllFilter) {
        this.f677a = i;
        this.f678b = comparisonFilter;
        this.f679c = fieldOnlyFilter;
        this.f680d = logicalFilter;
        this.f681e = notFilter;
        this.f682f = inFilter;
        this.f683g = matchAllFilter;
        if (this.f678b != null) {
            this.f684h = this.f678b;
        } else if (this.f679c != null) {
            this.f684h = this.f679c;
        } else if (this.f680d != null) {
            this.f684h = this.f680d;
        } else if (this.f681e != null) {
            this.f684h = this.f681e;
        } else if (this.f682f != null) {
            this.f684h = this.f682f;
        } else if (this.f683g != null) {
            this.f684h = this.f683g;
        } else {
            throw new IllegalArgumentException("At least one filter must be set.");
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0318d.m1133a(this, parcel, i);
    }
}
