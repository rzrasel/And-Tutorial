package com.orange.studio.banglatype;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.databinding.C0043k;
import android.databinding.ObservableInt;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.p018f.C0494j;
import android.support.v4.view.C0679r;
import android.support.v7.p012d.C0872b;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import com.orange.studio.banglatype.AndromoActivity.C1673b;
import com.orange.studio.banglatype.p057a.C1695b;
import java.util.ArrayList;
import java.util.List;

public class Dashboard_000 extends DashboardActivity implements ao, au {
    private static final boolean f7903m = true;
    private static C1673b f7904n = new C1673b();
    private static at f7905o;
    private boolean f7906h = true;
    private boolean f7907i = true;
    private RecyclerView f7908j;
    private ad f7909k;
    private LayoutManager f7910l;

    class C16761 implements OnPreDrawListener {
        final /* synthetic */ Dashboard_000 f7902a;

        C16761(Dashboard_000 dashboard_000) {
            this.f7902a = dashboard_000;
        }

        public final boolean onPreDraw() {
            this.f7902a.f7908j.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f7902a.supportStartPostponedEnterTransition();
            return true;
        }
    }

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, Dashboard_000.class);
        intent.addFlags(67108864);
        return intent;
    }

    private void setPalette(C0872b c0872b) {
    }

    private void unbindDrawables(View view) {
        if (view != null) {
            if (view.getBackground() != null) {
                view.getBackground().setCallback(null);
            }
            if (view instanceof ViewGroup) {
                for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
                    unbindDrawables(((ViewGroup) view).getChildAt(i));
                }
                ((ViewGroup) view).removeAllViews();
            }
        }
    }

    protected String getActivityTitleForAnalytics() {
        return getString(R.string.Dashboard_000_activity_title);
    }

    protected String getActivityTypeForAnalytics() {
        return "Dashboard";
    }

    protected int getBackgroundImageDrawableId() {
        return 0;
    }

    protected boolean getBackgroundImageEnabled() {
        return false;
    }

    public C1695b getBinding(C0043k c0043k) {
        return (C1695b) C1695b.class.cast(c0043k);
    }

    public String[] getClassNamesArray(Context context) {
        return context.getResources().getStringArray(R.array.activity_000_classes);
    }

    protected boolean getHandleCustomWindowColor() {
        return false;
    }

    public Class<C1695b> getItemBindingClass() {
        return C1695b.class;
    }

    public an getItemBindingUtils() {
        if (f7905o == null) {
            f7905o = new at();
        }
        return f7905o;
    }

    public String[] getParentClassNamesArray() {
        return getResources().getStringArray(R.array.activity_000_classes);
    }

    protected boolean getShowAdsOnDashboard() {
        return true;
    }

    protected boolean isDetailActivity() {
        return false;
    }

    protected boolean isHiddenActivity() {
        return false;
    }

    protected boolean isParentReachable() {
        return !isRootDashboard() && f7904n.m7146a(this, "material");
    }

    protected boolean isRootDashboard() {
        return f7903m;
    }

    protected boolean isShareActionEnabled() {
        return true;
    }

    protected boolean isToolbarEnabled() {
        return true;
    }

    public void onActivityReenter(int i, Intent intent) {
        super.onActivityReenter(i, intent);
        if (this.a) {
            supportPostponeEnterTransition();
            this.f7908j.getViewTreeObserver().addOnPreDrawListener(new C16761(this));
        }
    }

    public void onBackPressed() {
        if (this.f7908j != null) {
            this.f7908j.stopScroll();
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setToolbarTitle((int) R.string.Dashboard_000_activity_title);
        this.f7908j = (RecyclerView) findViewById(R.id.recycler);
        this.f7908j.setHasFixedSize(true);
        this.f7910l = new LinearLayoutManager(this);
        this.f7908j.setLayoutManager(this.f7910l);
        this.f7909k = new ad(this, this, "16:9");
        this.f7908j.setAdapter(this.f7909k);
        if (!AndromoActivity.isAutomaticBackgroundColorEnabled(this) || usingToolbarColorsFromTheme()) {
            onToolbarColorsFromTheme();
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        ad adVar = this.f7909k;
        if (adVar.f8101b && adVar.f8103d != null) {
            try {
                adVar.unregisterAdapterDataObserver(adVar.f8103d.f8195a);
            } catch (IllegalStateException e) {
            }
        }
    }

    public void onItemClick(View view, int i, long j, C0043k c0043k) {
        getResources().getStringArray(R.array.activity_000_titles);
        String[] stringArray = getResources().getStringArray(R.array.activity_000_classes);
        if (i < stringArray.length) {
            String str = stringArray[i];
            if (this.a) {
                boolean z;
                boolean z2;
                switch (bt.m7431d(bt.m7426b((Context) this, str), R.attr.app_bar_layout)) {
                    case R.layout.collapsing_app_bar_no_image:
                        z = true;
                        z2 = true;
                        break;
                    case R.layout.collapsing_app_bar_with_image:
                        z = true;
                        z2 = false;
                        break;
                    case R.layout.standard_app_bar_no_image:
                        z = false;
                        z2 = true;
                        break;
                    case R.layout.standard_app_bar_with_image_inside:
                        z = false;
                        z2 = false;
                        break;
                    case R.layout.standard_app_bar_with_image_outside:
                        z = false;
                        z2 = false;
                        break;
                    default:
                        z = false;
                        z2 = false;
                        break;
                }
                C1695b c1695b = (C1695b) c0043k;
                View view2 = c1695b.f7993h;
                if (view2 != null) {
                    C0679r.m1918a(view2, "item_root_" + j);
                }
                View view3 = c1695b.f7992g;
                if (view3 != null) {
                    C0679r.m1918a(view3, "item_image_" + j);
                }
                View findViewById = findViewById(16908335);
                View findViewById2 = findViewById(16908336);
                List arrayList = new ArrayList(8);
                if (view3 != null) {
                    if ((((ImageView) view3).getDrawable() instanceof ColorDrawable) || r4) {
                        arrayList.add(C0494j.m1287a(view3, "app_bar_layout"));
                    } else {
                        arrayList.add(C0494j.m1287a(view3, "activity_image"));
                    }
                }
                view2 = c1695b.f7995j;
                if (view2 != null) {
                    C0679r.m1918a(view2, "item_title_" + j);
                    if (z) {
                        arrayList.add(C0494j.m1287a(view2, "collapsing_toolbar"));
                    } else {
                        arrayList.add(C0494j.m1287a(view2, "toolbar"));
                    }
                }
                arrayList.add(C0494j.m1287a(findViewById, "android:status:background"));
                arrayList.add(C0494j.m1287a(findViewById2, "android:navigation:background"));
                arrayList.add(C0494j.m1287a(this.b, "toolbar"));
                String str2 = stringArray[i];
                arrayList.toArray(new C0494j[arrayList.size()]);
                C1735p.m7519a((Activity) this, str2);
            } else {
                C1735p.m7519a((Activity) this, stringArray[i]);
            }
            bi.f8215k = false;
            bi.f8214j = 0;
        }
    }

    public void onItemClick(View view, aq aqVar) {
        onItemClick(view, aqVar.getAdapterPosition(), aqVar.getItemId(), aqVar.f8189a);
    }

    protected void onPause() {
        super.onPause();
    }

    protected void onResume() {
        super.onResume();
        ad.m7276a();
    }

    protected void onToolbarColorsReady(int i, int i2) {
        if (this.f7909k != null) {
            ObservableInt observableInt = this.f7909k.f8102c;
            if (i != observableInt.f6a) {
                observableInt.f6a = i;
                observableInt.c_();
            }
        }
    }

    protected void setContentView() {
        setContentView((int) R.layout.material_dashboard_vertical_main);
    }
}
