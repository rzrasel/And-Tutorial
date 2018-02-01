package android.support.v4.widget;

final class an implements Runnable {
    final /* synthetic */ SwipeRefreshLayout f306a;

    an(SwipeRefreshLayout swipeRefreshLayout) {
        this.f306a = swipeRefreshLayout;
    }

    public final void run() {
        this.f306a.f274s = true;
        if (this.f306a.f257b != null) {
            this.f306a.f266k = this.f306a.f267l;
            this.f306a.f278x.setDuration((long) this.f306a.f265j);
            this.f306a.f278x.setAnimationListener(this.f306a.f280z);
            this.f306a.f278x.reset();
            this.f306a.f278x.setInterpolator(this.f306a.f275t);
            this.f306a.startAnimation(this.f306a.f278x);
        }
        SwipeRefreshLayout.m567a(this.f306a, this.f306a.f269n + this.f306a.getPaddingTop(), this.f306a.f279y);
    }
}
