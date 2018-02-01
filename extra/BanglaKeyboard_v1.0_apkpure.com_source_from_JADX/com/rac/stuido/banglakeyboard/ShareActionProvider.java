package com.rac.stuido.banglakeyboard;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.View;
import com.actionbarsherlock.C0126R;
import com.actionbarsherlock.view.ActionProvider;
import com.actionbarsherlock.view.SubMenu;

public class ShareActionProvider extends ActionProvider {
    private int f2547a = 4;
    private final bx f2548b = new bx();
    private final Context f2549c;
    private String f2550d = com.actionbarsherlock.widget.ShareActionProvider.DEFAULT_SHARE_HISTORY_FILE_NAME;
    private bv f2551e;
    private C0567m f2552f;

    public ShareActionProvider(Context context) {
        super(context);
        this.f2549c = context;
    }

    public final void m3849a(Intent intent) {
        C0570e.m4015a(this.f2549c, this.f2550d).m4031a(intent);
    }

    public final void m3850a(String str) {
        this.f2550d = str;
        if (this.f2551e != null) {
            if (this.f2552f == null) {
                this.f2552f = new bw();
            }
            C0570e.m4015a(this.f2549c, this.f2550d).m4032a(this.f2552f);
        }
    }

    public boolean hasSubMenu() {
        return true;
    }

    public View onCreateActionView() {
        C0570e a = C0570e.m4015a(this.f2549c, this.f2550d);
        View activityChooserView = new ActivityChooserView(this.f2549c);
        activityChooserView.m3842a(a);
        TypedValue typedValue = new TypedValue();
        this.f2549c.getTheme().resolveAttribute(C0126R.attr.actionModeShareDrawable, typedValue, true);
        activityChooserView.m3840a(this.f2549c.getResources().getDrawable(typedValue.resourceId));
        activityChooserView.m3841a((ActionProvider) this);
        activityChooserView.m3845d();
        activityChooserView.m3839a();
        return activityChooserView;
    }

    public void onPrepareSubMenu(SubMenu subMenu) {
        int i;
        subMenu.clear();
        C0570e a = C0570e.m4015a(this.f2549c, this.f2550d);
        PackageManager packageManager = this.f2549c.getPackageManager();
        int a2 = a.m4028a();
        int min = Math.min(a2, this.f2547a);
        for (i = 0; i < min; i++) {
            ResolveInfo a3 = a.m4030a(i);
            subMenu.add(0, i, i, a3.loadLabel(packageManager)).setIcon(a3.loadIcon(packageManager)).setOnMenuItemClickListener(this.f2548b);
        }
        if (min < a2) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f2549c.getString(C0126R.string.activity_chooser_view_see_all));
            for (i = 0; i < a2; i++) {
                a3 = a.m4030a(i);
                addSubMenu.add(0, i, i, a3.loadLabel(packageManager)).setIcon(a3.loadIcon(packageManager)).setOnMenuItemClickListener(this.f2548b);
            }
        }
    }
}
