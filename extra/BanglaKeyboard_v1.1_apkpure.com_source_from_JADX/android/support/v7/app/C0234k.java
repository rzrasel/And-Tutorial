package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.p021a.C0780a.C0770a;
import android.support.v7.view.C0852b;
import android.support.v7.view.C0852b.C0806a;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class C0234k extends Dialog implements C0233d {
    private C0810e f940a;

    public C0234k(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C0770a.dialogTheme, typedValue, true);
            i = typedValue.resourceId;
        }
        super(context, i);
        m606b().mo763a(null);
        m606b().mo759k();
    }

    private C0810e m606b() {
        if (this.f940a == null) {
            this.f940a = C0810e.m2269a((Dialog) this, (C0233d) this);
        }
        return this.f940a;
    }

    public final boolean m607a() {
        return m606b().mo774c(1);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        m606b().mo771b(view, layoutParams);
    }

    public <T extends View> T findViewById(int i) {
        return m606b().mo761a(i);
    }

    public void invalidateOptionsMenu() {
        m606b().mo778g();
    }

    public void onCreate(Bundle bundle) {
        m606b().mo779j();
        super.onCreate(bundle);
        m606b().mo763a(bundle);
    }

    protected void onStop() {
        super.onStop();
        m606b().mo756e();
    }

    public void onSupportActionModeFinished(C0852b c0852b) {
    }

    public void onSupportActionModeStarted(C0852b c0852b) {
    }

    public C0852b onWindowStartingSupportActionMode(C0806a c0806a) {
        return null;
    }

    public void setContentView(int i) {
        m606b().mo770b(i);
    }

    public void setContentView(View view) {
        m606b().mo765a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        m606b().mo766a(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        m606b().mo752a(getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m606b().mo752a(charSequence);
    }
}
