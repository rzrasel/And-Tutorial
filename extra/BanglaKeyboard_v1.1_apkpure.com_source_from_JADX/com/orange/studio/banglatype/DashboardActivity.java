package com.orange.studio.banglatype;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public abstract class DashboardActivity extends AndromoActivity {
    int f7862g = -1;
    private ImageView f7863h;

    protected int getBackgroundImageDrawableId() {
        return 0;
    }

    protected abstract boolean getBackgroundImageEnabled();

    protected abstract boolean getShowAdsOnDashboard();

    protected boolean isDetailActivity() {
        return false;
    }

    protected boolean isHamburgerEnabled() {
        return isRootDashboard() ? true : super.isHamburgerEnabled();
    }

    protected boolean isHiddenActivity() {
        return false;
    }

    protected abstract boolean isRootDashboard();

    protected boolean isShareActionEnabled() {
        return true;
    }

    protected boolean isToolbarEnabled() {
        return true;
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isRootDashboard()) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo815c(false);
            }
        } else if (this.f7862g == -1 && !isHiddenActivity()) {
            String[] parentClassNamesArray = getParentClassNamesArray();
            String name = getClass().getName();
            String str = getPackageName() + ".";
            int length = parentClassNamesArray.length;
            int i = 0;
            while (i < length) {
                if (name.equals(str + parentClassNamesArray[i])) {
                    break;
                }
                i++;
            }
            i = -1;
            this.f7862g = i;
        }
        if (getBackgroundImageEnabled() && getBackgroundImageDrawableId() != 0) {
            this.f7863h = (ImageView) findViewById(R.id.background_image);
            if (this.f7863h != null) {
                if (VERSION.SDK_INT >= 14) {
                    boolean z = aj.f8133a > 0 && aj.f8134b > 0;
                    if (!z) {
                        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
                        if (viewGroup != null) {
                            viewGroup.addView(new MaxTextureSizeView(this));
                        }
                    }
                } else {
                    aj.f8133a = 1024;
                    aj.f8134b = 1024;
                }
                Resources resources = getResources();
                int backgroundImageDrawableId = getBackgroundImageDrawableId();
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(resources, backgroundImageDrawableId, options);
                options.inSampleSize = aj.m7294a(options, 1024, 1024);
                options.inJustDecodeBounds = false;
                Bitmap decodeResource = BitmapFactory.decodeResource(resources, backgroundImageDrawableId, options);
                if (decodeResource != null) {
                    this.f7863h.setImageBitmap(decodeResource);
                }
            }
        }
        if (getShowAdsOnDashboard()) {
            C1723f.m7462a((Activity) this, (LinearLayout) findViewById(R.id.contentAdLayout));
        }
        C1723f.m7469d();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        if (menuInflater != null) {
            menuInflater.inflate(R.menu.dashboard_options_menu, menu);
        }
        if (isShareActionEnabled()) {
            MenuItem add = menu.add(0, R.id.share, 0, R.string.options_menu_share);
            if (add != null) {
                add.setShowAsAction(2);
                if (add != null) {
                    add.setShowAsAction(2);
                    add.setIcon(R.drawable.ic_share_black_24dp);
                }
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        super.onDestroy();
        if (this.f7863h != null) {
            this.f7863h.setImageDrawable(null);
            this.f7863h.setBackgroundDrawable(null);
            this.f7863h = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.share:
                startActivity(ak.m7296a((Context) this));
                return true;
            default:
                return C1709b.m7363a((AppCompatActivity) this, menuItem) || super.onOptionsItemSelected(menuItem);
        }
    }

    protected void onPause() {
        super.onPause();
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
    }

    void setToolbarTitle(int i) {
        if (isRootDashboard()) {
            super.setToolbarTitle((int) R.string.app_name);
        } else {
            super.setToolbarTitle(i);
        }
    }

    void setToolbarTitle(CharSequence charSequence) {
        if (isRootDashboard()) {
            super.setToolbarTitle((int) R.string.app_name);
        } else {
            super.setToolbarTitle(charSequence);
        }
    }
}
