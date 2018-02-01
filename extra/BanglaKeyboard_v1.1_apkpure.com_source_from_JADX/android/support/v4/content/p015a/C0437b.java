package android.support.v4.content.p015a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.content.p015a.C0436a.C0432a;
import android.support.v4.p006a.C0380c;
import android.util.TypedValue;
import android.widget.TextView;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public final class C0437b {
    public static Typeface m1155a(Context context, Resources resources, TypedValue typedValue, int i, int i2, TextView textView) {
        if (typedValue.string == null) {
            throw new NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence = typedValue.string.toString();
        if (!charSequence.startsWith("res/")) {
            return null;
        }
        Typeface a = C0380c.m1101a(resources, i, i2);
        if (a != null) {
            return a;
        }
        try {
            if (!charSequence.toLowerCase().endsWith(".xml")) {
                return C0380c.m1098a(context, resources, i, charSequence, i2);
            }
            C0432a a2 = C0436a.m1149a(resources.getXml(i), resources);
            return a2 == null ? null : C0380c.m1099a(context, a2, resources, i, i2, textView);
        } catch (XmlPullParserException e) {
            return null;
        } catch (IOException e2) {
            return null;
        }
    }

    public static Drawable m1156a(Resources resources, int i, Theme theme) {
        return VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }
}
