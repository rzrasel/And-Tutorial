package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.support.v7.view.C0938d;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;

public interface ThemedSpinnerAdapter extends SpinnerAdapter {

    public static final class Helper {
        private final Context mContext;
        private LayoutInflater mDropDownInflater;
        private final LayoutInflater mInflater;

        public Helper(Context context) {
            this.mContext = context;
            this.mInflater = LayoutInflater.from(context);
        }

        public final LayoutInflater getDropDownViewInflater() {
            return this.mDropDownInflater != null ? this.mDropDownInflater : this.mInflater;
        }

        public final Theme getDropDownViewTheme() {
            return this.mDropDownInflater == null ? null : this.mDropDownInflater.getContext().getTheme();
        }

        public final void setDropDownViewTheme(Theme theme) {
            if (theme == null) {
                this.mDropDownInflater = null;
            } else if (theme == this.mContext.getTheme()) {
                this.mDropDownInflater = this.mInflater;
            } else {
                this.mDropDownInflater = LayoutInflater.from(new C0938d(this.mContext, theme));
            }
        }
    }

    Theme getDropDownViewTheme();

    void setDropDownViewTheme(Theme theme);
}
