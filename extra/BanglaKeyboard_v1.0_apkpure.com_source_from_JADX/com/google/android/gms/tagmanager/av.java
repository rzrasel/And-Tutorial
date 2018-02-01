package com.google.android.gms.tagmanager;

import android.content.SharedPreferences.Editor;

final class av implements Runnable {
    final /* synthetic */ Editor f2320a;

    av(Editor editor) {
        this.f2320a = editor;
    }

    public final void run() {
        this.f2320a.commit();
    }
}
