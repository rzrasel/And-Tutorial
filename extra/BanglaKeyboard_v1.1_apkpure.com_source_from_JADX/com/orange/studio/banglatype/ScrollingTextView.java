package com.orange.studio.banglatype;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;

public class ScrollingTextView extends TextView {
    public ScrollingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScrollingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean isFocused() {
        return true;
    }

    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            super.onFocusChanged(z, i, rect);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (z) {
            super.onWindowFocusChanged(z);
        }
    }
}
