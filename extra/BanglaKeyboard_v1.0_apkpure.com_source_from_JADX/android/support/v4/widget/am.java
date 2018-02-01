package android.support.v4.widget;

final class am implements Runnable {
    final /* synthetic */ SwipeRefreshLayout f305a;

    am(SwipeRefreshLayout swipeRefreshLayout) {
        this.f305a = swipeRefreshLayout;
    }

    public final void run() {
        this.f305a.f274s = true;
        SwipeRefreshLayout.m567a(this.f305a, this.f305a.f269n + this.f305a.getPaddingTop(), this.f305a.f279y);
    }
}
