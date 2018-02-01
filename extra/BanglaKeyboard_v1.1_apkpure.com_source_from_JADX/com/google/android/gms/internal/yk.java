package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@aqv
public final class yk {
    private final int f7510a;
    private final int f7511b;
    private final int f7512c;
    private final yj f7513d = new yo();

    public yk(int i) {
        this.f7511b = i;
        this.f7510a = 6;
        this.f7512c = 0;
    }

    private final String m7033a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        ym ymVar = new ym();
        PriorityQueue priorityQueue = new PriorityQueue(this.f7511b, new yl());
        for (String a : split) {
            String[] a2 = yn.m7037a(a, false);
            if (a2.length != 0) {
                yq.m7044a(a2, this.f7511b, this.f7510a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                ymVar.m7035a(this.f7513d.mo2331a(((yr) it.next()).f7518b));
            } catch (IOException e) {
                id.m5372a(6);
            }
        }
        return ymVar.toString();
    }

    public final String m7034a(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            stringBuffer.append(((String) obj).toLowerCase(Locale.US));
            stringBuffer.append('\n');
        }
        return m7033a(stringBuffer.toString());
    }
}
