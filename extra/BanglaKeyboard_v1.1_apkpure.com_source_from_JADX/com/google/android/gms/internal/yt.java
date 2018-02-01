package com.google.android.gms.internal;

import java.io.IOException;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

@aqv
public final class yt {
    private final yj f7523a;
    private final int f7524b;
    private String f7525c;
    private String f7526d;
    private final boolean f7527e = false;
    private final int f7528f;
    private final int f7529g;

    public yt(int i, int i2, int i3) {
        this.f7524b = i;
        if (i2 > 64 || i2 < 0) {
            this.f7528f = 64;
        } else {
            this.f7528f = i2;
        }
        if (i3 <= 0) {
            this.f7529g = 1;
        } else {
            this.f7529g = i3;
        }
        this.f7523a = new ys(this.f7528f);
    }

    private final boolean m7046a(String str, HashSet<String> hashSet) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return true;
        }
        for (String str2 : split) {
            int i;
            String stringBuilder;
            String[] a;
            Object obj;
            int i2;
            boolean z;
            if (str2.indexOf("'") != -1) {
                StringBuilder stringBuilder2 = new StringBuilder(str2);
                i = 1;
                boolean z2 = false;
                while (i + 2 <= stringBuilder2.length()) {
                    if (stringBuilder2.charAt(i) == '\'') {
                        if (stringBuilder2.charAt(i - 1) == ' ' || !((stringBuilder2.charAt(i + 1) == 's' || stringBuilder2.charAt(i + 1) == 'S') && (i + 2 == stringBuilder2.length() || stringBuilder2.charAt(i + 2) == ' '))) {
                            stringBuilder2.setCharAt(i, ' ');
                        } else {
                            stringBuilder2.insert(i, ' ');
                            i += 2;
                        }
                        z2 = true;
                    }
                    i++;
                }
                stringBuilder = z2 ? stringBuilder2.toString() : null;
                if (stringBuilder != null) {
                    this.f7526d = stringBuilder;
                    a = yn.m7037a(stringBuilder, true);
                    if (a.length >= this.f7529g) {
                        for (i = 0; i < a.length; i++) {
                            obj = "";
                            for (i2 = 0; i2 < this.f7529g; i2++) {
                                if (i + i2 >= a.length) {
                                    z = false;
                                    break;
                                }
                                if (i2 > 0) {
                                    obj = String.valueOf(obj).concat(" ");
                                }
                                String valueOf = String.valueOf(obj);
                                String valueOf2 = String.valueOf(a[i + i2]);
                                obj = valueOf2.length() == 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                            }
                            z = true;
                            if (z) {
                                break;
                            }
                            hashSet.add(obj);
                            if (hashSet.size() >= this.f7524b) {
                                return false;
                            }
                        }
                        if (hashSet.size() >= this.f7524b) {
                            return false;
                        }
                    }
                }
            }
            stringBuilder = str2;
            a = yn.m7037a(stringBuilder, true);
            if (a.length >= this.f7529g) {
                for (i = 0; i < a.length; i++) {
                    obj = "";
                    for (i2 = 0; i2 < this.f7529g; i2++) {
                        if (i + i2 >= a.length) {
                            z = false;
                            break;
                        }
                        if (i2 > 0) {
                            obj = String.valueOf(obj).concat(" ");
                        }
                        String valueOf3 = String.valueOf(obj);
                        String valueOf22 = String.valueOf(a[i + i2]);
                        if (valueOf22.length() == 0) {
                        }
                    }
                    z = true;
                    if (z) {
                        break;
                    }
                    hashSet.add(obj);
                    if (hashSet.size() >= this.f7524b) {
                        return false;
                    }
                }
                if (hashSet.size() >= this.f7524b) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String m7047a(ArrayList<String> arrayList, ArrayList<yi> arrayList2) {
        Collections.sort(arrayList2, new yu());
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < arrayList2.size() && m7046a(Normalizer.normalize((CharSequence) arrayList.get(((yi) arrayList2.get(i)).f7507e), Form.NFKC).toLowerCase(Locale.US), hashSet)) {
            i++;
        }
        ym ymVar = new ym();
        this.f7525c = "";
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                ymVar.m7035a(this.f7523a.mo2331a((String) it.next()));
            } catch (IOException e) {
                id.m5372a(6);
            }
        }
        return ymVar.toString();
    }
}
