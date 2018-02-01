package android.databinding.p000a;

import android.text.Spanned;
import android.widget.TextView;

public final class C0012a {
    public static void m5a(TextView textView, CharSequence charSequence) {
        Object obj = 1;
        CharSequence text = textView.getText();
        if (charSequence == text) {
            return;
        }
        if (charSequence != null || text.length() != 0) {
            if (!(charSequence instanceof Spanned)) {
                if ((charSequence == null ? 1 : null) == (text == null ? 1 : null)) {
                    if (charSequence != null) {
                        int length = charSequence.length();
                        if (length == text.length()) {
                            for (int i = 0; i < length; i++) {
                                if (charSequence.charAt(i) != text.charAt(i)) {
                                    break;
                                }
                            }
                        }
                    }
                    obj = null;
                }
                if (obj == null) {
                    return;
                }
            } else if (charSequence.equals(text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }
}
