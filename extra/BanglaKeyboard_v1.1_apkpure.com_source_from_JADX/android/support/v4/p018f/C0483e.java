package android.support.v4.p018f;

import java.io.Writer;

public final class C0483e extends Writer {
    private final String f1538a;
    private StringBuilder f1539b = new StringBuilder(128);

    public C0483e(String str) {
        this.f1538a = str;
    }

    private void m1275a() {
        if (this.f1539b.length() > 0) {
            this.f1539b.delete(0, this.f1539b.length());
        }
    }

    public final void close() {
        m1275a();
    }

    public final void flush() {
        m1275a();
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m1275a();
            } else {
                this.f1539b.append(c);
            }
        }
    }
}
