package com.rac.stuido.banglakeyboard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.actionbarsherlock.C0126R;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.OnNavigationListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class C0568c implements OnNavigationListener {
    String[] f2716a;
    String[] f2717b;
    final String f2718c;
    final /* synthetic */ Context f2719d;
    final /* synthetic */ int f2720e = C0126R.array.activity_000_titles;
    final /* synthetic */ int f2721f = C0126R.array.activity_000_classes;
    final /* synthetic */ int f2722g;
    final /* synthetic */ ActionBar f2723h;

    C0568c(Context context, int i, ActionBar actionBar) {
        this.f2719d = context;
        this.f2722g = i;
        this.f2723h = actionBar;
        this.f2716a = this.f2719d.getResources().getStringArray(this.f2720e);
        this.f2717b = this.f2719d.getResources().getStringArray(this.f2721f);
        this.f2718c = this.f2719d.getPackageName();
    }

    public final boolean onNavigationItemSelected(int i, long j) {
        String str = this.f2716a[i];
        if (i != this.f2722g) {
            if (i < this.f2717b.length) {
                String[] strArr = this.f2717b;
                String str2 = this.f2718c + "." + this.f2717b[i];
                try {
                    Class cls = Class.forName(str2);
                    if (Activity.class.isAssignableFrom(cls)) {
                        Intent intent = new Intent(this.f2719d, cls);
                        intent.addFlags(67108864);
                        this.f2719d.startActivity(intent);
                    } else {
                        Object newInstance = cls.newInstance();
                        for (Method method : cls.getDeclaredMethods()) {
                            if (method.getName().equals("runIntent")) {
                                try {
                                    method.invoke(newInstance, new Object[]{this.f2719d});
                                    this.f2723h.setSelectedNavigationItem(this.f2722g);
                                } catch (InvocationTargetException e) {
                                    this.f2723h.setSelectedNavigationItem(this.f2722g);
                                }
                            }
                        }
                    }
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                    Toast.makeText(this.f2719d, "Unknown class '" + str2 + "' for '" + str + "' activity.", 0).show();
                    this.f2723h.setSelectedNavigationItem(this.f2722g);
                } catch (InstantiationException e3) {
                    this.f2723h.setSelectedNavigationItem(this.f2722g);
                } catch (IllegalAccessException e4) {
                    this.f2723h.setSelectedNavigationItem(this.f2722g);
                }
            } else {
                Toast.makeText(this.f2719d, "The '" + str + "' activity does not exist yet.", 0).show();
                this.f2723h.setSelectedNavigationItem(this.f2722g);
            }
        }
        return true;
    }
}
