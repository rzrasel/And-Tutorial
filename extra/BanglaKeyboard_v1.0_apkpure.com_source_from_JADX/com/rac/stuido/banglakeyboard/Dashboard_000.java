package com.rac.stuido.banglakeyboard;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.actionbarsherlock.C0126R;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockListActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.widget.ShareActionProvider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Dashboard_000 extends SherlockListActivity implements bi {
    private static C0569d f2540g = new C0569d();
    int f2541a = -1;
    private boolean f2542b = true;
    private boolean f2543c = true;
    private boolean f2544d = false;
    private ImageView f2545e;
    private bj f2546f = null;

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, Dashboard_000.class);
        intent.addFlags(67108864);
        return intent;
    }

    public String[] getClassNamesArray(Context context) {
        return context.getResources().getStringArray(C0126R.array.activity_000_classes);
    }

    public int getClassNamesArrayResId() {
        return C0126R.array.activity_000_classes;
    }

    public void onBackPressed() {
        C0588y.m4065d(this);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.layout.dashboard_000_layout);
        if (VERSION.SDK_INT <= 10) {
            overridePendingTransition(C0126R.anim.slide_in_left, C0126R.anim.slide_out_right);
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            if (this.f2542b) {
                C0566b.m3935a(supportActionBar, true, false);
                CharSequence string = getString(C0126R.string.app_name);
                if (supportActionBar != null) {
                    supportActionBar.setTitle(string);
                }
                supportActionBar.setHomeButtonEnabled(false);
            } else {
                if (this.f2541a == -1) {
                    this.f2541a = C0566b.m3930a((Context) this);
                }
                C0566b.m3935a(supportActionBar, false, f2540g.m4014a(this, "list"));
                C0566b.m3939b(supportActionBar, this.f2541a);
            }
        }
        this.f2546f = new bj(this);
        setListAdapter(this.f2546f);
        if (this.f2543c) {
            C0588y.m4058a(this, (LinearLayout) findViewById(C0126R.id.RootView));
        }
        C0588y.m4064d();
        C0583s.m4048a(this);
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case 0:
                return C0564a.m3857a(this);
            default:
                return super.onCreateDialog(i);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater supportMenuInflater = getSupportMenuInflater();
        if (this.f2544d) {
            supportMenuInflater.inflate(C0126R.menu.dashboard_options_menu, menu);
            MenuItem findItem = menu.findItem(C0126R.id.share);
            if (findItem != null) {
                ShareActionProvider shareActionProvider = (ShareActionProvider) findItem.getActionProvider();
                shareActionProvider.m3850a(ShareActionProvider.DEFAULT_SHARE_HISTORY_FILE_NAME);
                shareActionProvider.m3849a(be.m3943a((Context) this));
            }
        }
        supportMenuInflater.inflate(C0126R.menu.default_options_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        C0588y.m4063c(this);
        super.onDestroy();
        this.f2546f.m3941a();
        if (this.f2545e != null) {
            this.f2545e.setImageDrawable(null);
            this.f2545e.setBackgroundDrawable(null);
            this.f2545e = null;
        }
    }

    protected void onListItemClick(ListView listView, View view, int i, long j) {
        "onListItemClick: " + i;
        getResources().getStringArray(C0126R.array.activity_000_titles);
        String[] stringArray = getResources().getStringArray(C0126R.array.activity_000_classes);
        if (i < stringArray.length) {
            try {
                Class cls = Class.forName(getPackageName() + "." + stringArray[i]);
                if (Activity.class.isAssignableFrom(cls)) {
                    Intent intent = new Intent(this, cls);
                    intent.addFlags(67108864);
                    startActivity(intent);
                } else {
                    Object newInstance = cls.newInstance();
                    for (Method method : cls.getDeclaredMethods()) {
                        if (method.getName().equals("runIntent")) {
                            try {
                                method.invoke(newInstance, new Object[]{this});
                            } catch (InvocationTargetException e) {
                            }
                        }
                    }
                }
            } catch (ClassNotFoundException e2) {
            } catch (InstantiationException e3) {
            } catch (IllegalAccessException e4) {
            }
        }
        super.onListItemClick(listView, view, i, j);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getItemId();
        return C0566b.m3937a((Activity) this, menuItem) || super.onOptionsItemSelected(menuItem);
    }

    protected void onPause() {
        C0588y.m4057a(this);
        super.onPause();
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        super.onPrepareDialog(i, dialog);
    }

    protected void onResume() {
        super.onResume();
        this.f2546f.m3942a(this);
        C0588y.m4061b(this);
    }

    protected void onStart() {
        super.onStart();
        if (!this.f2542b) {
            C0566b.m3934a(getSupportActionBar(), this.f2541a);
        }
    }

    protected void onStop() {
        super.onStop();
        C0588y.m4062c();
    }
}
