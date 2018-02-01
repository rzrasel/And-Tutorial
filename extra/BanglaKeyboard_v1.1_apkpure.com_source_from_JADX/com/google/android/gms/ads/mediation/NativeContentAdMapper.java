package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

public class NativeContentAdMapper extends NativeAdMapper {
    private String f3885e;
    private List<Image> f3886f;
    private String f3887g;
    private Image f3888h;
    private String f3889i;
    private String f3890j;
    private VideoController f3891k;

    public final String getAdvertiser() {
        return this.f3890j;
    }

    public final String getBody() {
        return this.f3887g;
    }

    public final String getCallToAction() {
        return this.f3889i;
    }

    public final String getHeadline() {
        return this.f3885e;
    }

    public final List<Image> getImages() {
        return this.f3886f;
    }

    public final Image getLogo() {
        return this.f3888h;
    }

    public final VideoController getVideoController() {
        return this.f3891k;
    }

    public final void setAdvertiser(String str) {
        this.f3890j = str;
    }

    public final void setBody(String str) {
        this.f3887g = str;
    }

    public final void setCallToAction(String str) {
        this.f3889i = str;
    }

    public final void setHeadline(String str) {
        this.f3885e = str;
    }

    public final void setImages(List<Image> list) {
        this.f3886f = list;
    }

    public final void setLogo(Image image) {
        this.f3888h = image;
    }

    public final void zza(VideoController videoController) {
        this.f3891k = videoController;
    }
}
