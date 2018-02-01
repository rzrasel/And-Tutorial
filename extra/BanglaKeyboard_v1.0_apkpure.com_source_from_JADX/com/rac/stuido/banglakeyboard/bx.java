package com.rac.stuido.banglakeyboard;

import android.content.Intent;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener;

final class bx implements OnMenuItemClickListener {
    final /* synthetic */ ShareActionProvider f2714a;

    private bx(ShareActionProvider shareActionProvider) {
        this.f2714a = shareActionProvider;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Intent b = C0570e.m4015a(this.f2714a.f2549c, this.f2714a.f2550d).m4033b(menuItem.getItemId());
        if (b != null) {
            this.f2714a.f2549c.startActivity(b);
        }
        return true;
    }
}
