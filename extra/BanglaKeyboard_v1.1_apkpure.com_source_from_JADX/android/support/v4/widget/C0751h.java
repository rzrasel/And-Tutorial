package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;

public final class C0751h {
    static final C0748b f2256a;

    interface C0748b {
        ColorStateList mo713a(ImageView imageView);

        void mo714a(ImageView imageView, ColorStateList colorStateList);

        void mo715a(ImageView imageView, Mode mode);

        Mode mo716b(ImageView imageView);
    }

    static class C0749a implements C0748b {
        C0749a() {
        }

        public ColorStateList mo713a(ImageView imageView) {
            return imageView instanceof C0168n ? ((C0168n) imageView).getSupportImageTintList() : null;
        }

        public void mo714a(ImageView imageView, ColorStateList colorStateList) {
            if (imageView instanceof C0168n) {
                ((C0168n) imageView).setSupportImageTintList(colorStateList);
            }
        }

        public void mo715a(ImageView imageView, Mode mode) {
            if (imageView instanceof C0168n) {
                ((C0168n) imageView).setSupportImageTintMode(mode);
            }
        }

        public Mode mo716b(ImageView imageView) {
            return imageView instanceof C0168n ? ((C0168n) imageView).getSupportImageTintMode() : null;
        }
    }

    static class C0750c extends C0749a {
        C0750c() {
        }

        public final ColorStateList mo713a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        public final void mo714a(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                Object obj = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? null : 1;
                if (drawable != null && obj != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        }

        public final void mo715a(ImageView imageView, Mode mode) {
            imageView.setImageTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                Object obj = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? null : 1;
                if (drawable != null && obj != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        }

        public final Mode mo716b(ImageView imageView) {
            return imageView.getImageTintMode();
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f2256a = new C0750c();
        } else {
            f2256a = new C0749a();
        }
    }

    public static ColorStateList m2157a(ImageView imageView) {
        return f2256a.mo713a(imageView);
    }

    public static void m2158a(ImageView imageView, ColorStateList colorStateList) {
        f2256a.mo714a(imageView, colorStateList);
    }

    public static void m2159a(ImageView imageView, Mode mode) {
        f2256a.mo715a(imageView, mode);
    }

    public static Mode m2160b(ImageView imageView) {
        return f2256a.mo716b(imageView);
    }
}
