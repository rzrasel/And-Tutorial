package com.google.android.gms.p007a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.C0250h;
import java.util.LinkedList;

public abstract class C0191b {
    public C0190a f387a;
    Bundle f388b;
    LinkedList f389c;
    private final C0192r f390d = new C0193c(this);

    private void m781a(Bundle bundle, C0194j c0194j) {
        if (this.f387a != null) {
            C0190a c0190a = this.f387a;
            c0194j.mo665b();
            return;
        }
        if (this.f389c == null) {
            this.f389c = new LinkedList();
        }
        this.f389c.add(c0194j);
        if (bundle != null) {
            if (this.f388b == null) {
                this.f388b = (Bundle) bundle.clone();
            } else {
                this.f388b.putAll(bundle);
            }
        }
        mo1183a(this.f390d);
    }

    public final View m782a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        m781a(bundle, new C0197f(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f387a == null) {
            mo1342a(frameLayout);
        }
        return frameLayout;
    }

    public final void m783a() {
        m781a(null, new C0199h(this));
    }

    public final void m784a(int i) {
        while (!this.f389c.isEmpty() && ((C0194j) this.f389c.getLast()).mo664a() >= i) {
            this.f389c.removeLast();
        }
    }

    public final void m785a(Activity activity, Bundle bundle, Bundle bundle2) {
        m781a(bundle2, new C0195d(this, activity, bundle, bundle2));
    }

    public final void m786a(Bundle bundle) {
        m781a(bundle, new C0196e(this, bundle));
    }

    protected void mo1342a(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        int a = C0250h.m1002a(context);
        CharSequence a2 = C0250h.m1004a(context, a);
        CharSequence b = C0250h.m1008b(context, a);
        View linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        View textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new LayoutParams(-2, -2));
        textView.setText(a2);
        linearLayout.addView(textView);
        if (b != null) {
            View button = new Button(context);
            button.setLayoutParams(new LayoutParams(-2, -2));
            button.setText(b);
            linearLayout.addView(button);
            button.setOnClickListener(new C0198g(context, a));
        }
    }

    protected abstract void mo1183a(C0192r c0192r);

    public final void m789b() {
        m781a(null, new C0200i(this));
    }

    public final void m790b(Bundle bundle) {
        if (this.f387a != null) {
            this.f387a.mo1177b(bundle);
        } else if (this.f388b != null) {
            bundle.putAll(this.f388b);
        }
    }

    public final void m791c() {
        if (this.f387a != null) {
            this.f387a.mo1178c();
        } else {
            m784a(5);
        }
    }

    public final void m792d() {
        if (this.f387a != null) {
            this.f387a.mo1180e();
        } else {
            m784a(2);
        }
    }

    public final void m793e() {
        if (this.f387a != null) {
            this.f387a.mo1181f();
        } else {
            m784a(1);
        }
    }

    public final void m794f() {
        if (this.f387a != null) {
            this.f387a.mo1182g();
        }
    }
}
