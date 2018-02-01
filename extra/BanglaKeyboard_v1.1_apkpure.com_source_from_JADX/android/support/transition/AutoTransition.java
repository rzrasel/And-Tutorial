package android.support.transition;

import android.content.Context;
import android.util.AttributeSet;

public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        m769g();
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m769g();
    }

    private void m769g() {
        m754a(1);
        m761b(new Fade(2)).m761b(new ChangeBounds()).m761b(new Fade(1));
    }
}
