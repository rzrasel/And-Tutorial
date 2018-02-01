package com.rac.stuido.banglakeyboard;

public enum bf {
    GOOGLE_PLAY(0),
    AMAZON_APP_STORE(1),
    SAMSUNG_APP_STORE(2);
    
    private final int f2698d;

    private bf(int i) {
        this.f2698d = i;
    }

    public static bf m3949a() {
        return GOOGLE_PLAY.f2698d == 0 ? GOOGLE_PLAY : AMAZON_APP_STORE.f2698d == 0 ? AMAZON_APP_STORE : SAMSUNG_APP_STORE.f2698d == 0 ? SAMSUNG_APP_STORE : GOOGLE_PLAY;
    }
}
