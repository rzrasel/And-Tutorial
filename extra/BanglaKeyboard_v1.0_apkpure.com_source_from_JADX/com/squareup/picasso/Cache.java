package com.squareup.picasso;

import android.graphics.Bitmap;

public interface Cache {
    public static final Cache NONE = new C05961();

    final class C05961 implements Cache {
        C05961() {
        }

        public final void clear() {
        }

        public final void clearKeyUri(String str) {
        }

        public final Bitmap get(String str) {
            return null;
        }

        public final int maxSize() {
            return 0;
        }

        public final void set(String str, Bitmap bitmap) {
        }

        public final int size() {
            return 0;
        }
    }

    void clear();

    void clearKeyUri(String str);

    Bitmap get(String str);

    int maxSize();

    void set(String str, Bitmap bitmap);

    int size();
}
