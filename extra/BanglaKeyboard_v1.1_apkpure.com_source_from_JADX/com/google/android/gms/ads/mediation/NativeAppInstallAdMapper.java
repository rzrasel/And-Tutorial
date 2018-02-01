package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

public class NativeAppInstallAdMapper extends NativeAdMapper {
    private String f3875e;
    private List<Image> f3876f;
    private String f3877g;
    private Image f3878h;
    private String f3879i;
    private double f3880j;
    private String f3881k;
    private String f3882l;
    private VideoController f3883m;

    public final String getBody() {
        return this.f3877g;
    }

    public final String getCallToAction() {
        return this.f3879i;
    }

    public final String getHeadline() {
        return this.f3875e;
    }

    public final Image getIcon() {
        return this.f3878h;
    }

    public final List<Image> getImages() {
        return this.f3876f;
    }

    public final String getPrice() {
        return this.f3882l;
    }

    public final double getStarRating() {
        return this.f3880j;
    }

    public final String getStore() {
        return this.f3881k;
    }

    public final VideoController getVideoController() {
        return this.f3883m;
    }

    public final void setBody(String str) {
        this.f3877g = str;
    }

    public final void setCallToAction(String str) {
        this.f3879i = str;
    }

    public final void setHeadline(String str) {
        this.f3875e = str;
    }

    public final void setIcon(Image image) {
        this.f3878h = image;
    }

    public final void setImages(List<Image> list) {
        this.f3876f = list;
    }

    public final void setPrice(String str) {
        this.f3882l = str;
    }

    public final void setStarRating(double d) {
        this.f3880j = d;
    }

    public final void setStore(String str) {
        this.f3881k = str;
    }

    public final void zza(VideoController videoController) {
        this.f3883m = videoController;
    }
}
