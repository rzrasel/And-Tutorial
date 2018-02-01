package android.support.v4.p017e;

import android.text.SpannableStringBuilder;
import java.util.Locale;

public final class C0460a {
    private static C0466e f1485a = C0473f.f1506c;
    private static final String f1486b = Character.toString('‎');
    private static final String f1487c = Character.toString('‏');
    private static final C0460a f1488d = new C0460a(false, 2, f1485a);
    private static final C0460a f1489e = new C0460a(true, 2, f1485a);
    private final boolean f1490f;
    private final int f1491g;
    private final C0466e f1492h;

    public static final class C0458a {
        boolean f1476a = C0460a.m1195a(Locale.getDefault());
        int f1477b = 2;
        C0466e f1478c = C0460a.f1485a;
    }

    private static class C0459b {
        private static final byte[] f1479f = new byte[1792];
        final CharSequence f1480a;
        final boolean f1481b = false;
        final int f1482c;
        int f1483d;
        char f1484e;

        static {
            for (int i = 0; i < 1792; i++) {
                f1479f[i] = Character.getDirectionality(i);
            }
        }

        C0459b(CharSequence charSequence) {
            this.f1480a = charSequence;
            this.f1482c = charSequence.length();
        }

        static byte m1192a(char c) {
            return c < '܀' ? f1479f[c] : Character.getDirectionality(c);
        }

        final byte m1193a() {
            this.f1484e = this.f1480a.charAt(this.f1483d - 1);
            if (Character.isLowSurrogate(this.f1484e)) {
                int codePointBefore = Character.codePointBefore(this.f1480a, this.f1483d);
                this.f1483d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f1483d--;
            byte a = C0459b.m1192a(this.f1484e);
            if (this.f1481b) {
                int i;
                CharSequence charSequence;
                int i2;
                if (this.f1484e == '>') {
                    i = this.f1483d;
                    while (this.f1483d > 0) {
                        charSequence = this.f1480a;
                        i2 = this.f1483d - 1;
                        this.f1483d = i2;
                        this.f1484e = charSequence.charAt(i2);
                        if (this.f1484e != '<') {
                            if (this.f1484e == '>') {
                                break;
                            } else if (this.f1484e == '\"' || this.f1484e == '\'') {
                                char c = this.f1484e;
                                while (this.f1483d > 0) {
                                    CharSequence charSequence2 = this.f1480a;
                                    int i3 = this.f1483d - 1;
                                    this.f1483d = i3;
                                    char charAt = charSequence2.charAt(i3);
                                    this.f1484e = charAt;
                                    if (charAt == c) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            return (byte) 12;
                        }
                    }
                    this.f1483d = i;
                    this.f1484e = '>';
                    return (byte) 13;
                } else if (this.f1484e == ';') {
                    i = this.f1483d;
                    while (this.f1483d > 0) {
                        charSequence = this.f1480a;
                        i2 = this.f1483d - 1;
                        this.f1483d = i2;
                        this.f1484e = charSequence.charAt(i2);
                        if (this.f1484e != '&') {
                            if (this.f1484e == ';') {
                                break;
                            }
                        }
                        return (byte) 12;
                    }
                    this.f1483d = i;
                    this.f1484e = ';';
                    return (byte) 13;
                }
            }
            return a;
        }
    }

    private C0460a(boolean z, int i, C0466e c0466e) {
        this.f1490f = z;
        this.f1491g = i;
        this.f1492h = c0466e;
    }

    public static C0460a m1194a() {
        C0458a c0458a = new C0458a();
        return (c0458a.f1477b == 2 && c0458a.f1478c == f1485a) ? c0458a.f1476a ? f1489e : f1488d : new C0460a(c0458a.f1476a, c0458a.f1477b, c0458a.f1478c);
    }

    static /* synthetic */ boolean m1195a(Locale locale) {
        return C0474g.m1217a(locale) == 1;
    }

    private static int m1196b(CharSequence charSequence) {
        C0459b c0459b = new C0459b(charSequence);
        c0459b.f1483d = c0459b.f1482c;
        int i = 0;
        int i2 = 0;
        while (c0459b.f1483d > 0) {
            switch (c0459b.m1193a()) {
                case (byte) 0:
                    if (i2 != 0) {
                        if (i != 0) {
                            break;
                        }
                        i = i2;
                        break;
                    }
                    return -1;
                case (byte) 1:
                case (byte) 2:
                    if (i2 != 0) {
                        if (i != 0) {
                            break;
                        }
                        i = i2;
                        break;
                    }
                    return 1;
                case (byte) 9:
                    break;
                case (byte) 14:
                case (byte) 15:
                    if (i != i2) {
                        i2--;
                        break;
                    }
                    return -1;
                case (byte) 16:
                case (byte) 17:
                    if (i != i2) {
                        i2--;
                        break;
                    }
                    return 1;
                case (byte) 18:
                    i2++;
                    break;
                default:
                    if (i != 0) {
                        break;
                    }
                    i = i2;
                    break;
            }
        }
        return 0;
    }

    private static int m1198c(CharSequence charSequence) {
        C0459b c0459b = new C0459b(charSequence);
        c0459b.f1483d = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (c0459b.f1483d < c0459b.f1482c && i == 0) {
            byte directionality;
            c0459b.f1484e = c0459b.f1480a.charAt(c0459b.f1483d);
            int codePointAt;
            if (Character.isHighSurrogate(c0459b.f1484e)) {
                codePointAt = Character.codePointAt(c0459b.f1480a, c0459b.f1483d);
                c0459b.f1483d += Character.charCount(codePointAt);
                directionality = Character.getDirectionality(codePointAt);
            } else {
                c0459b.f1483d++;
                directionality = C0459b.m1192a(c0459b.f1484e);
                if (c0459b.f1481b) {
                    if (c0459b.f1484e == '<') {
                        codePointAt = c0459b.f1483d;
                        while (c0459b.f1483d < c0459b.f1482c) {
                            CharSequence charSequence2 = c0459b.f1480a;
                            int i4 = c0459b.f1483d;
                            c0459b.f1483d = i4 + 1;
                            c0459b.f1484e = charSequence2.charAt(i4);
                            if (c0459b.f1484e == '>') {
                                directionality = (byte) 12;
                            } else if (c0459b.f1484e == '\"' || c0459b.f1484e == '\'') {
                                char c = c0459b.f1484e;
                                while (c0459b.f1483d < c0459b.f1482c) {
                                    CharSequence charSequence3 = c0459b.f1480a;
                                    int i5 = c0459b.f1483d;
                                    c0459b.f1483d = i5 + 1;
                                    char charAt = charSequence3.charAt(i5);
                                    c0459b.f1484e = charAt;
                                    if (charAt == c) {
                                    }
                                }
                            }
                        }
                        c0459b.f1483d = codePointAt;
                        c0459b.f1484e = '<';
                        directionality = (byte) 13;
                    } else if (c0459b.f1484e == '&') {
                        while (c0459b.f1483d < c0459b.f1482c) {
                            CharSequence charSequence4 = c0459b.f1480a;
                            int i6 = c0459b.f1483d;
                            c0459b.f1483d = i6 + 1;
                            char charAt2 = charSequence4.charAt(i6);
                            c0459b.f1484e = charAt2;
                            if (charAt2 == ';') {
                                directionality = (byte) 12;
                            }
                        }
                        directionality = (byte) 12;
                    }
                }
            }
            switch (directionality) {
                case (byte) 0:
                    if (i3 != 0) {
                        i = i3;
                        break;
                    }
                    return -1;
                case (byte) 1:
                case (byte) 2:
                    if (i3 != 0) {
                        i = i3;
                        break;
                    }
                    return 1;
                case (byte) 9:
                    break;
                case (byte) 14:
                case (byte) 15:
                    i3++;
                    i2 = -1;
                    break;
                case (byte) 16:
                case (byte) 17:
                    i3++;
                    i2 = 1;
                    break;
                case (byte) 18:
                    i3--;
                    i2 = 0;
                    break;
                default:
                    i = i3;
                    break;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (c0459b.f1483d > 0) {
                    switch (c0459b.m1193a()) {
                        case (byte) 14:
                        case (byte) 15:
                            if (i != i3) {
                                i3--;
                                break;
                            }
                            return -1;
                        case (byte) 16:
                        case (byte) 17:
                            if (i != i3) {
                                i3--;
                                break;
                            }
                            return 1;
                        case (byte) 18:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            }
            return i2;
        }
        return 0;
    }

    public final CharSequence m1199a(CharSequence charSequence) {
        C0466e c0466e = this.f1492h;
        if (charSequence == null) {
            return null;
        }
        boolean a;
        CharSequence charSequence2;
        boolean a2 = c0466e.mo473a(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (((this.f1491g & 2) != 0 ? 1 : null) != null) {
            a = (a2 ? C0473f.f1505b : C0473f.f1504a).mo473a(charSequence, charSequence.length());
            charSequence2 = (this.f1490f || !(a || C0460a.m1198c(charSequence) == 1)) ? (!this.f1490f || (a && C0460a.m1198c(charSequence) != -1)) ? "" : f1487c : f1486b;
            spannableStringBuilder.append(charSequence2);
        }
        if (a2 != this.f1490f) {
            spannableStringBuilder.append(a2 ? '‫' : '‪');
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append('‬');
        } else {
            spannableStringBuilder.append(charSequence);
        }
        a = (a2 ? C0473f.f1505b : C0473f.f1504a).mo473a(charSequence, charSequence.length());
        charSequence2 = (this.f1490f || !(a || C0460a.m1196b(charSequence) == 1)) ? (!this.f1490f || (a && C0460a.m1196b(charSequence) != -1)) ? "" : f1487c : f1486b;
        spannableStringBuilder.append(charSequence2);
        return spannableStringBuilder;
    }
}
