package android.support.v4.widget;

final class C0102b implements Runnable {
    final /* synthetic */ ContentLoadingProgressBar f331a;

    C0102b(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f331a = contentLoadingProgressBar;
    }

    public final void run() {
        this.f331a.f190b = false;
        this.f331a.f189a = -1;
        this.f331a.setVisibility(8);
    }
}
