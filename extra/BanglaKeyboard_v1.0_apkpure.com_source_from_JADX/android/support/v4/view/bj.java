package android.support.v4.view;

final class bj implements Runnable {
    final /* synthetic */ ViewPager f172a;

    bj(ViewPager viewPager) {
        this.f172a = viewPager;
    }

    public final void run() {
        this.f172a.setScrollState(0);
        this.f172a.m91b();
    }
}
