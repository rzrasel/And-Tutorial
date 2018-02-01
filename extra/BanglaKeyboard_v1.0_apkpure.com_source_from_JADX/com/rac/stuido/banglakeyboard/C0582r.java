package com.rac.stuido.banglakeyboard;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;

final class C0582r implements OnClickListener, OnLongClickListener, OnItemClickListener, OnDismissListener {
    final /* synthetic */ ActivityChooserView f2839a;

    private C0582r(ActivityChooserView activityChooserView) {
        this.f2839a = activityChooserView;
    }

    public final void onClick(View view) {
        if (view == this.f2839a.f2521h) {
            this.f2839a.m3843b();
            Intent b = this.f2839a.f2515b.m4046e().m4033b(this.f2839a.f2515b.m4046e().m4029a(this.f2839a.f2515b.m4043b()));
            if (b != null) {
                this.f2839a.f2532s.startActivity(b);
            }
        } else if (view == this.f2839a.f2519f) {
            this.f2839a.f2528o = false;
            this.f2839a.m3825a(this.f2839a.f2529p);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void onDismiss() {
        if (this.f2839a.f2527n != null) {
            this.f2839a.f2527n.onDismiss();
        }
        if (this.f2839a.f2514a != null) {
            this.f2839a.f2514a.subUiVisibilityChanged(false);
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (((C0581q) adapterView.getAdapter()).getItemViewType(i)) {
            case 0:
                this.f2839a.m3843b();
                if (!this.f2839a.f2528o) {
                    if (!this.f2839a.f2515b.m4047f()) {
                        i++;
                    }
                    Intent b = this.f2839a.f2515b.m4046e().m4033b(i);
                    if (b != null) {
                        this.f2839a.f2532s.startActivity(b);
                        return;
                    }
                    return;
                } else if (i > 0) {
                    this.f2839a.f2515b.m4046e().m4035c(i);
                    return;
                } else {
                    return;
                }
            case 1:
                this.f2839a.m3825a((int) ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean onLongClick(View view) {
        if (view == this.f2839a.f2521h) {
            if (this.f2839a.f2515b.getCount() > 0) {
                this.f2839a.f2528o = true;
                this.f2839a.m3825a(this.f2839a.f2529p);
            }
            return true;
        }
        throw new IllegalArgumentException();
    }
}
