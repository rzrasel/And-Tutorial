package android.support.v4.widget;

final class C0103c implements Runnable {
    final /* synthetic */ ContentLoadingProgressBar f332a;

    C0103c(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f332a = contentLoadingProgressBar;
    }

    public final void run() {
        this.f332a.f191c = false;
        if (!this.f332a.f192d) {
            this.f332a.f189a = System.currentTimeMillis();
            this.f332a.setVisibility(0);
        }
    }
}
