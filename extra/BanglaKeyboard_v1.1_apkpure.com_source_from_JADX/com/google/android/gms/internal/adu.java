package com.google.android.gms.internal;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import java.util.Map;

public final class adu {
    public final byte[] f4931a;
    public final Map<String, String> f4932b;
    public final boolean f4933c;
    private int f4934d;
    private long f4935e;

    public adu(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this.f4934d = i;
        this.f4931a = bArr;
        this.f4932b = map;
        this.f4933c = z;
        this.f4935e = j;
    }

    public adu(byte[] bArr, Map<String, String> map) {
        this(Callback.DEFAULT_DRAG_ANIMATION_DURATION, bArr, map, false, 0);
    }
}
