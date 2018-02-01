package android.support.design.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.design.C0116a.C0115k;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.View;

public final class TabItem extends View {
    final CharSequence f791a;
    final Drawable f792b;
    final int f793c;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0115k.TabItem);
        this.f791a = obtainStyledAttributes.getText(C0115k.TabItem_android_text);
        this.f792b = obtainStyledAttributes.getDrawable(C0115k.TabItem_android_icon);
        this.f793c = obtainStyledAttributes.getResourceId(C0115k.TabItem_android_layout, 0);
        obtainStyledAttributes.recycle();
    }
}
