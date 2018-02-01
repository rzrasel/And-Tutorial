package android.support.v4.view;

import android.content.Context;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

final class ai extends SingleLineTransformationMethod {
    private Locale f166a;

    public ai(Context context) {
        this.f166a = context.getResources().getConfiguration().locale;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        CharSequence transformation = super.getTransformation(charSequence, view);
        return transformation != null ? transformation.toString().toUpperCase(this.f166a) : null;
    }
}
