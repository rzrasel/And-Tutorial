package com.orange.studio.banglatype;

import android.content.ActivityNotFoundException;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.Toast;

final class af extends LinkMovementMethod {
    private static af f8125a;
    private static String f8126b;

    af() {
    }

    public static af m7279a() {
        if (f8125a == null) {
            f8125a = new af();
        } else {
            f8126b = null;
        }
        return f8125a;
    }

    public static af m7280a(String str) {
        f8126b = str;
        return f8125a;
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(textView, spannable, motionEvent);
        } catch (ActivityNotFoundException e) {
            if (motionEvent.getAction() == 1) {
                int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
                int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
                Layout layout = textView.getLayout();
                x = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
                URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(x, x, URLSpan.class);
                if (uRLSpanArr.length != 0) {
                    String url = uRLSpanArr[0].getURL();
                    if (!(f8126b == null || url == null)) {
                        Toast.makeText(textView.getContext(), String.format(f8126b, new Object[]{url}), 0).show();
                    }
                }
            }
            return true;
        }
    }
}
