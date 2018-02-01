package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.internal.cy;
import com.google.android.gms.internal.db;
import com.google.android.gms.internal.gb;

public final class AdActivity extends Activity {
    private db f413a;

    private void m894a() {
        if (this.f413a != null) {
            try {
                this.f413a.mo866j();
            } catch (Throwable e) {
                gb.m2070a("Could not forward setContentViewSet to ad overlay:", e);
            }
        }
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f413a = cy.m1842a((Activity) this);
        if (this.f413a == null) {
            gb.m2069a("Could not create ad overlay.");
            finish();
            return;
        }
        try {
            this.f413a.mo858a(bundle);
        } catch (Throwable e) {
            gb.m2070a("Could not forward onCreate to ad overlay:", e);
            finish();
        }
    }

    protected final void onDestroy() {
        try {
            if (this.f413a != null) {
                this.f413a.mo865i();
            }
        } catch (Throwable e) {
            gb.m2070a("Could not forward onDestroy to ad overlay:", e);
        }
        super.onDestroy();
    }

    protected final void onPause() {
        try {
            if (this.f413a != null) {
                this.f413a.mo863g();
            }
        } catch (Throwable e) {
            gb.m2070a("Could not forward onPause to ad overlay:", e);
            finish();
        }
        super.onPause();
    }

    protected final void onRestart() {
        super.onRestart();
        try {
            if (this.f413a != null) {
                this.f413a.mo860d();
            }
        } catch (Throwable e) {
            gb.m2070a("Could not forward onRestart to ad overlay:", e);
            finish();
        }
    }

    protected final void onResume() {
        super.onResume();
        try {
            if (this.f413a != null) {
                this.f413a.mo862f();
            }
        } catch (Throwable e) {
            gb.m2070a("Could not forward onResume to ad overlay:", e);
            finish();
        }
    }

    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f413a != null) {
                this.f413a.mo859b(bundle);
            }
        } catch (Throwable e) {
            gb.m2070a("Could not forward onSaveInstanceState to ad overlay:", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected final void onStart() {
        super.onStart();
        try {
            if (this.f413a != null) {
                this.f413a.mo861e();
            }
        } catch (Throwable e) {
            gb.m2070a("Could not forward onStart to ad overlay:", e);
            finish();
        }
    }

    protected final void onStop() {
        try {
            if (this.f413a != null) {
                this.f413a.mo864h();
            }
        } catch (Throwable e) {
            gb.m2070a("Could not forward onStop to ad overlay:", e);
            finish();
        }
        super.onStop();
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        m894a();
    }

    public final void setContentView(View view) {
        super.setContentView(view);
        m894a();
    }

    public final void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m894a();
    }
}
