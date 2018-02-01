package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.C0294a;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Set;

final class C0319e {
    static C0294a m1134a(MetadataBundle metadataBundle) {
        Set a = metadataBundle.m1124a();
        if (a.size() == 1) {
            return (C0294a) a.iterator().next();
        }
        throw new IllegalArgumentException("bundle should have exactly 1 populated field");
    }
}
