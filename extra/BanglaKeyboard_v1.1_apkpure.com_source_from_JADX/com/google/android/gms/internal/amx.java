package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;
import java.util.ArrayList;
import java.util.List;

@aqv
public final class amx extends amp {
    private final NativeAppInstallAdMapper f5406a;

    public amx(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.f5406a = nativeAppInstallAdMapper;
    }

    public final String mo1921a() {
        return this.f5406a.getHeadline();
    }

    public final void mo1922a(C1398a c1398a) {
        this.f5406a.handleClick((View) C1401c.m3585a(c1398a));
    }

    public final List mo1923b() {
        List<Image> images = this.f5406a.getImages();
        if (images == null) {
            return null;
        }
        List arrayList = new ArrayList();
        for (Image image : images) {
            arrayList.add(new aeq(image.getDrawable(), image.getUri(), image.getScale()));
        }
        return arrayList;
    }

    public final void mo1924b(C1398a c1398a) {
        this.f5406a.trackView((View) C1401c.m3585a(c1398a));
    }

    public final String mo1925c() {
        return this.f5406a.getBody();
    }

    public final void mo1926c(C1398a c1398a) {
        this.f5406a.untrackView((View) C1401c.m3585a(c1398a));
    }

    public final afy mo1927d() {
        Image icon = this.f5406a.getIcon();
        return icon != null ? new aeq(icon.getDrawable(), icon.getUri(), icon.getScale()) : null;
    }

    public final String mo1928e() {
        return this.f5406a.getCallToAction();
    }

    public final double mo1929f() {
        return this.f5406a.getStarRating();
    }

    public final String mo1930g() {
        return this.f5406a.getStore();
    }

    public final String mo1931h() {
        return this.f5406a.getPrice();
    }

    public final void mo1932i() {
        this.f5406a.recordImpression();
    }

    public final boolean mo1933j() {
        return this.f5406a.getOverrideImpressionRecording();
    }

    public final boolean mo1934k() {
        return this.f5406a.getOverrideClickHandling();
    }

    public final Bundle mo1935l() {
        return this.f5406a.getExtras();
    }

    public final abv mo1936m() {
        return this.f5406a.getVideoController() != null ? this.f5406a.getVideoController().zzbc() : null;
    }

    public final C1398a mo1937n() {
        Object adChoicesContent = this.f5406a.getAdChoicesContent();
        return adChoicesContent == null ? null : C1401c.m3584a(adChoicesContent);
    }

    public final aft mo1938o() {
        return null;
    }

    public final C1398a mo1939p() {
        return null;
    }
}
