package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

final class C0744f extends Filter {
    C0742a f2254a;

    interface C0742a {
        void changeCursor(Cursor cursor);

        CharSequence convertToString(Cursor cursor);

        Cursor getCursor();

        Cursor runQueryOnBackgroundThread(CharSequence charSequence);
    }

    C0744f(C0742a c0742a) {
        this.f2254a = c0742a;
    }

    public final CharSequence convertResultToString(Object obj) {
        return this.f2254a.convertToString((Cursor) obj);
    }

    protected final FilterResults performFiltering(CharSequence charSequence) {
        Cursor runQueryOnBackgroundThread = this.f2254a.runQueryOnBackgroundThread(charSequence);
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
        Cursor cursor = this.f2254a.getCursor();
        if (filterResults.values != null && filterResults.values != cursor) {
            this.f2254a.changeCursor((Cursor) filterResults.values);
        }
    }
}
