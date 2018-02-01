package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

final class C0108g extends Filter {
    C0104h f335a;

    C0108g(C0104h c0104h) {
        this.f335a = c0104h;
    }

    public final CharSequence convertResultToString(Object obj) {
        return this.f335a.convertToString((Cursor) obj);
    }

    protected final FilterResults performFiltering(CharSequence charSequence) {
        Cursor runQueryOnBackgroundThread = this.f335a.runQueryOnBackgroundThread(charSequence);
        FilterResults filterResults = new FilterResults();
        if (runQueryOnBackgroundThread != null) {
            filterResults.count = runQueryOnBackgroundThread.getCount();
            filterResults.values = runQueryOnBackgroundThread;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    protected final void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor cursor = this.f335a.getCursor();
        if (filterResults.values != null && filterResults.values != cursor) {
            this.f335a.changeCursor((Cursor) filterResults.values);
        }
    }
}
