package com.google.android.gms.drive.metadata;

import com.google.android.gms.internal.je;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class C0299f implements C0294a {
    private final String f655a;
    private final Set f656b;
    private final int f657c;

    public C0299f(String str, int i) {
        this.f655a = (String) je.m2474a((Object) str, (Object) "fieldName");
        this.f656b = Collections.singleton(str);
        this.f657c = i;
    }

    public C0299f(String str, Collection collection) {
        this.f655a = (String) je.m2474a((Object) str, (Object) "fieldName");
        this.f656b = Collections.unmodifiableSet(new HashSet(collection));
        this.f657c = 4100000;
    }

    public final String mo700a() {
        return this.f655a;
    }

    public String toString() {
        return this.f655a;
    }
}
