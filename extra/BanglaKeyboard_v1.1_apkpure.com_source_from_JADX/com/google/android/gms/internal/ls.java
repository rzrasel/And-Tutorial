package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.p056a.C1398a;

public interface ls extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z, int i);

    int getIntFlagValue(String str, int i, int i2);

    long getLongFlagValue(String str, long j, int i);

    String getStringFlagValue(String str, String str2, int i);

    void init(C1398a c1398a);
}
