package com.google.android.gms.internal;

import java.util.PriorityQueue;

@aqv
public final class yq {
    private static long m7040a(long j, int i) {
        return i == 0 ? 1 : i != 1 ? i % 2 == 0 ? m7040a((j * j) % 1073807359, i / 2) % 1073807359 : ((m7040a((j * j) % 1073807359, i / 2) % 1073807359) * j) % 1073807359 : j;
    }

    private static long m7041a(String[] strArr, int i) {
        long a = (((long) yn.m7036a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i2 = 1; i2 < i; i2++) {
            a = (((a * 16785407) % 1073807359) + ((((long) yn.m7036a(strArr[i2])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }

    private static String m7042a(String[] strArr, int i, int i2) {
        if (strArr.length < i + i2) {
            id.m5372a(6);
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 < (i + i2) - 1; i3++) {
            stringBuffer.append(strArr[i3]);
            stringBuffer.append(' ');
        }
        stringBuffer.append(strArr[(i + i2) - 1]);
        return stringBuffer.toString();
    }

    private static void m7043a(int i, long j, String str, int i2, PriorityQueue<yr> priorityQueue) {
        yr yrVar = new yr(j, str, i2);
        if ((priorityQueue.size() != i || (((yr) priorityQueue.peek()).f7519c <= yrVar.f7519c && ((yr) priorityQueue.peek()).f7517a <= yrVar.f7517a)) && !priorityQueue.contains(yrVar)) {
            priorityQueue.add(yrVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static void m7044a(String[] strArr, int i, int i2, PriorityQueue<yr> priorityQueue) {
        if (strArr.length < i2) {
            m7043a(i, m7041a(strArr, strArr.length), m7042a(strArr, 0, strArr.length), strArr.length, priorityQueue);
            return;
        }
        long a = m7041a(strArr, i2);
        m7043a(i, a, m7042a(strArr, 0, i2), i2, priorityQueue);
        long a2 = m7040a(16785407, i2 - 1);
        for (int i3 = 1; i3 < (strArr.length - i2) + 1; i3++) {
            a += 1073807359;
            a = (((((a - ((((((long) yn.m7036a(strArr[i3 - 1])) + 2147483647L) % 1073807359) * a2) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) yn.m7036a(strArr[(i3 + i2) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            m7043a(i, a, m7042a(strArr, i3, i2), strArr.length, priorityQueue);
        }
    }
}
