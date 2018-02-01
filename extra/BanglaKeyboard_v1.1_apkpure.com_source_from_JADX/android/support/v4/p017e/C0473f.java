package android.support.v4.p017e;

import java.util.Locale;

public final class C0473f {
    public static final C0466e f1504a = new C0471e(null, false);
    public static final C0466e f1505b = new C0471e(null, true);
    public static final C0466e f1506c = new C0471e(C0469b.f1500a, false);
    public static final C0466e f1507d = new C0471e(C0469b.f1500a, true);
    public static final C0466e f1508e = new C0471e(C0468a.f1497a, false);
    public static final C0466e f1509f = C0472f.f1503a;

    private interface C0467c {
        int mo472a(CharSequence charSequence, int i);
    }

    private static class C0468a implements C0467c {
        public static final C0468a f1497a = new C0468a(true);
        public static final C0468a f1498b = new C0468a(false);
        private final boolean f1499c;

        private C0468a(boolean z) {
            this.f1499c = z;
        }

        public final int mo472a(CharSequence charSequence, int i) {
            int i2 = i + 0;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                switch (C0473f.m1215a(Character.getDirectionality(charSequence.charAt(i4)))) {
                    case 0:
                        if (!this.f1499c) {
                            i3 = 1;
                            break;
                        }
                        return 0;
                    case 1:
                        if (this.f1499c) {
                            i3 = 1;
                            break;
                        }
                        return 1;
                    default:
                        break;
                }
            }
            return i3 != 0 ? !this.f1499c ? 0 : 1 : 2;
        }
    }

    private static class C0469b implements C0467c {
        public static final C0469b f1500a = new C0469b();

        private C0469b() {
        }

        public final int mo472a(CharSequence charSequence, int i) {
            int i2 = i + 0;
            int i3 = 2;
            for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
                i3 = C0473f.m1216b(Character.getDirectionality(charSequence.charAt(i4)));
            }
            return i3;
        }
    }

    private static abstract class C0470d implements C0466e {
        private final C0467c f1501a;

        public C0470d(C0467c c0467c) {
            this.f1501a = c0467c;
        }

        protected abstract boolean mo474a();

        public final boolean mo473a(CharSequence charSequence, int i) {
            if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
                throw new IllegalArgumentException();
            } else if (this.f1501a == null) {
                return mo474a();
            } else {
                switch (this.f1501a.mo472a(charSequence, i)) {
                    case 0:
                        return true;
                    case 1:
                        return false;
                    default:
                        return mo474a();
                }
            }
        }
    }

    private static class C0471e extends C0470d {
        private final boolean f1502a;

        C0471e(C0467c c0467c, boolean z) {
            super(c0467c);
            this.f1502a = z;
        }

        protected final boolean mo474a() {
            return this.f1502a;
        }
    }

    private static class C0472f extends C0470d {
        public static final C0472f f1503a = new C0472f();

        public C0472f() {
            super(null);
        }

        protected final boolean mo474a() {
            return C0474g.m1217a(Locale.getDefault()) == 1;
        }
    }

    static int m1215a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                return 2;
        }
    }

    static int m1216b(int i) {
        switch (i) {
            case 0:
            case 14:
            case 15:
                return 1;
            case 1:
            case 2:
            case 16:
            case 17:
                return 0;
            default:
                return 2;
        }
    }
}
