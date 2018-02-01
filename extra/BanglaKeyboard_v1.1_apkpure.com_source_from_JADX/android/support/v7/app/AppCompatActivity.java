package android.support.v7.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.app.TaskStackBuilder.SupportParentable;
import android.support.v7.app.C0819a.C0794b;
import android.support.v7.app.C0819a.C0813a;
import android.support.v7.view.C0852b;
import android.support.v7.view.C0852b.C0806a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.VectorEnabledTintResources;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public class AppCompatActivity extends FragmentActivity implements SupportParentable, C0794b, C0233d {
    private C0810e f2398a;
    private int f2399b = 0;
    private Resources f2400c;

    private boolean performMenuItemShortcut(int i, KeyEvent keyEvent) {
        if (!(VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()))) {
            Window window = getWindow();
            if (!(window == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent))) {
                return true;
            }
        }
        return false;
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        getDelegate().mo771b(view, layoutParams);
    }

    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo821f()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        return (keyCode == 82 && supportActionBar != null && supportActionBar.mo809a(keyEvent)) ? true : super.dispatchKeyEvent(keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return getDelegate().mo761a(i);
    }

    public C0810e getDelegate() {
        if (this.f2398a == null) {
            this.f2398a = C0810e.m2268a((Activity) this, (C0233d) this);
        }
        return this.f2398a;
    }

    public C0813a getDrawerToggleDelegate() {
        return getDelegate().mo758i();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().mo753b();
    }

    public Resources getResources() {
        if (this.f2400c == null && VectorEnabledTintResources.shouldBeUsed()) {
            this.f2400c = new VectorEnabledTintResources(this, super.getResources());
        }
        return this.f2400c == null ? super.getResources() : this.f2400c;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo751a();
    }

    public Intent getSupportParentActivityIntent() {
        return NavUtils.getParentActivityIntent(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().mo778g();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().mo762a(configuration);
        if (this.f2400c != null) {
            this.f2400c.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreate(Bundle bundle) {
        C0810e delegate = getDelegate();
        delegate.mo779j();
        delegate.mo763a(bundle);
        if (delegate.mo759k() && this.f2399b != 0) {
            if (VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f2399b, false);
            } else {
                setTheme(this.f2399b);
            }
        }
        super.onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        taskStackBuilder.addParentStack((Activity) this);
    }

    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo757h();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return performMenuItemShortcut(i, keyEvent) ? true : super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        return (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo814c() & 4) == 0) ? false : onSupportNavigateUp();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo773c();
    }

    protected void onPostResume() {
        super.onPostResume();
        getDelegate().mo777f();
    }

    public void onPrepareSupportNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().mo754b(bundle);
    }

    public void onStart() {
        super.onStart();
        getDelegate().mo755d();
    }

    public void onStop() {
        super.onStop();
        getDelegate().mo756e();
    }

    public void onSupportActionModeFinished(C0852b c0852b) {
    }

    public void onSupportActionModeStarted(C0852b c0852b) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            TaskStackBuilder create = TaskStackBuilder.create(this);
            onCreateSupportNavigateUpTaskStack(create);
            onPrepareSupportNavigateUpTaskStack(create);
            create.startActivities();
            try {
                ActivityCompat.finishAffinity(this);
            } catch (IllegalStateException e) {
                finish();
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
        }
        return true;
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo752a(charSequence);
    }

    public C0852b onWindowStartingSupportActionMode(C0806a c0806a) {
        return null;
    }

    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo819e()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        getDelegate().mo770b(i);
    }

    public void setContentView(View view) {
        getDelegate().mo765a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        getDelegate().mo766a(view, layoutParams);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo764a(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.f2399b = i;
    }

    public C0852b startSupportActionMode(C0806a c0806a) {
        return getDelegate().mo760a(c0806a);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().mo778g();
    }

    public void supportNavigateUpTo(Intent intent) {
        NavUtils.navigateUpTo(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo774c(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return NavUtils.shouldUpRecreateTask(this, intent);
    }
}
