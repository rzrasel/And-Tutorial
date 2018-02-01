package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class ts extends tr<FieldDescriptorType, Object> {
    ts(int i) {
        super(i);
    }

    public final void mo2288a() {
        if (!this.f7139a) {
            for (int i = 0; i < m6680b(); i++) {
                Entry b = m6681b(i);
                if (((sp) b.getKey()).m6629b()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : m6682c()) {
                if (((sp) entry.getKey()).m6629b()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo2288a();
    }
}
