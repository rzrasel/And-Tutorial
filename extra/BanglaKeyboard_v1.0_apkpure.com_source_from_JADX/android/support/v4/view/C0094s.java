package android.support.v4.view;

import android.support.v4.app.NotificationCompat;
import android.view.KeyEvent;

class C0094s implements C0093v {
    C0094s() {
    }

    private static int m481a(int i, int i2, int i3, int i4) {
        Object obj = 1;
        Object obj2 = (i2 & 1) != 0 ? 1 : null;
        int i5 = i3 | i4;
        if ((i5 & 1) == 0) {
            obj = null;
        }
        if (obj2 == null) {
            return obj != null ? i & (i2 ^ -1) : i;
        } else {
            if (obj == null) {
                return i & (i5 ^ -1);
            }
            throw new IllegalArgumentException("bad arguments");
        }
    }

    public int mo264a(int i) {
        int i2 = (i & 192) != 0 ? i | 1 : i;
        if ((i2 & 48) != 0) {
            i2 |= 2;
        }
        return i2 & 247;
    }

    public void mo261a(KeyEvent keyEvent) {
    }

    public boolean mo262b(int i) {
        return C0094s.m481a(C0094s.m481a(mo264a(i) & 247, 1, 64, NotificationCompat.FLAG_HIGH_PRIORITY), 2, 16, 32) == 1;
    }

    public boolean mo263c(int i) {
        return (mo264a(i) & 247) == 0;
    }
}
