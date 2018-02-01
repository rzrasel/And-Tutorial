package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;
import java.util.ArrayList;
import java.util.List;

@aqv
public final class amy extends ams {
    private final NativeContentAdMapper f5407a;

    public amy(NativeContentAdMapper nativeContentAdMapper) {
        this.f5407a = nativeContentAdMapper;
    }

    public final String mo1940a() {
        return this.f5407a.getHeadline();
    }

    public final void mo1941a(C1398a c1398a) {
        this.f5407a.handleClick((View) C1401c.m3585a(c1398a));
    }

    public final List mo1942b() {
        List<Image> images = this.f5407a.getImages();
        if (images == null) {
            return null;
        }
        List arrayList = new ArrayList();
        for (Image image : images) {
            arrayList.add(new aeq(image.getDrawable(), image.getUri(), image.getScale()));
        }
        return arrayList;
    }

    public final void mo1943b(C1398a c1398a) {
        this.f5407a.trackView((View) C1401c.m3585a(c1398a));
    }

    public final String mo1944c() {
        return this.f5407a.getBody();
    }

    public final void mo1945c(C1398a c1398a) {
        this.f5407a.untrackView((View) C1401c.m3585a(c1398a));
    }

    public final afy mo1946d() {
        Image logo = this.f5407a.getLogo();
        return logo != null ? new aeq(logo.getDrawable(), logo.getUri(), logo.getScale()) : null;
    }

    public final String mo1947e() {
        return this.f5407a.getCallToAction();
    }

    public final String mo1948f() {
        return this.f5407a.getAdvertiser();
    }

    public final void mo1949g() {
        this.f5407a.recordImpression();
    }

    public final boolean mo1950h() {
        return this.f5407a.getOverrideImpressionRecording();
    }

    public final boolean mo1951i() {
        return this.f5407a.getOverrideClickHandling();
    }

    public final Bundle mo1952j() {
        return this.f5407a.getExtras();
    }

    public final C1398a mo1953k() {
        Object adChoicesContent = this.f5407a.getAdChoicesContent();
        return adChoicesContent == null ? null : C1401c.m3584a(adChoicesContent);
    }

    public final abv mo1954l() {
        return this.f5407a.getVideoController() != null ? this.f5407a.getVideoController().zzbc() : null;
    }

    public final aft mo1955m() {
        return null;
    }

    public final C1398a mo1956n() {
        return null;
    }
}
