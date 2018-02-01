package android.support.constraint;

import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.constraint.C0104b.C0103a;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class C0102a {
    private static final int[] f423b = new int[]{0, 4, 8};
    private static SparseIntArray f424c;
    HashMap<Integer, C0076a> f425a = new HashMap();

    private static class C0076a {
        public int f221A;
        public int f222B;
        public int f223C;
        public int f224D;
        public int f225E;
        public int f226F;
        public int f227G;
        public int f228H;
        public int f229I;
        public int f230J;
        public int f231K;
        public int f232L;
        public int f233M;
        public float f234N;
        public float f235O;
        public int f236P;
        public int f237Q;
        public float f238R;
        public boolean f239S;
        public float f240T;
        public float f241U;
        public float f242V;
        public float f243W;
        public float f244X;
        public float f245Y;
        public float f246Z;
        boolean f247a;
        public float aa;
        public float ab;
        public float ac;
        public int ad;
        public int ae;
        public int af;
        public int ag;
        public int ah;
        public int ai;
        public int f248b;
        public int f249c;
        int f250d;
        public int f251e;
        public int f252f;
        public float f253g;
        public int f254h;
        public int f255i;
        public int f256j;
        public int f257k;
        public int f258l;
        public int f259m;
        public int f260n;
        public int f261o;
        public int f262p;
        public int f263q;
        public int f264r;
        public int f265s;
        public int f266t;
        public float f267u;
        public float f268v;
        public String f269w;
        public int f270x;
        public int f271y;
        public int f272z;

        private C0076a() {
            this.f247a = false;
            this.f251e = -1;
            this.f252f = -1;
            this.f253g = -1.0f;
            this.f254h = -1;
            this.f255i = -1;
            this.f256j = -1;
            this.f257k = -1;
            this.f258l = -1;
            this.f259m = -1;
            this.f260n = -1;
            this.f261o = -1;
            this.f262p = -1;
            this.f263q = -1;
            this.f264r = -1;
            this.f265s = -1;
            this.f266t = -1;
            this.f267u = 0.5f;
            this.f268v = 0.5f;
            this.f269w = null;
            this.f270x = -1;
            this.f271y = -1;
            this.f272z = -1;
            this.f221A = -1;
            this.f222B = -1;
            this.f223C = -1;
            this.f224D = -1;
            this.f225E = -1;
            this.f226F = -1;
            this.f227G = 0;
            this.f228H = -1;
            this.f229I = -1;
            this.f230J = -1;
            this.f231K = -1;
            this.f232L = -1;
            this.f233M = -1;
            this.f234N = 0.0f;
            this.f235O = 0.0f;
            this.f236P = 0;
            this.f237Q = 0;
            this.f238R = 1.0f;
            this.f239S = false;
            this.f240T = 0.0f;
            this.f241U = 0.0f;
            this.f242V = 0.0f;
            this.f243W = 1.0f;
            this.f244X = 1.0f;
            this.f245Y = 0.0f;
            this.f246Z = 0.0f;
            this.aa = 0.0f;
            this.ab = 0.0f;
            this.ac = 0.0f;
            this.ad = -1;
            this.ae = -1;
            this.af = -1;
            this.ag = -1;
            this.ah = -1;
            this.ai = -1;
        }

        public final void m97a(LayoutParams layoutParams) {
            layoutParams.f188d = this.f254h;
            layoutParams.f189e = this.f255i;
            layoutParams.f190f = this.f256j;
            layoutParams.f191g = this.f257k;
            layoutParams.f192h = this.f258l;
            layoutParams.f193i = this.f259m;
            layoutParams.f194j = this.f260n;
            layoutParams.f195k = this.f261o;
            layoutParams.f196l = this.f262p;
            layoutParams.f197m = this.f263q;
            layoutParams.f198n = this.f264r;
            layoutParams.f199o = this.f265s;
            layoutParams.f200p = this.f266t;
            layoutParams.leftMargin = this.f221A;
            layoutParams.rightMargin = this.f222B;
            layoutParams.topMargin = this.f223C;
            layoutParams.bottomMargin = this.f224D;
            layoutParams.f205u = this.f233M;
            layoutParams.f206v = this.f232L;
            layoutParams.f207w = this.f267u;
            layoutParams.f208x = this.f268v;
            layoutParams.f209y = this.f269w;
            layoutParams.f170L = this.f270x;
            layoutParams.f171M = this.f271y;
            layoutParams.f161C = this.f234N;
            layoutParams.f160B = this.f235O;
            layoutParams.f163E = this.f237Q;
            layoutParams.f162D = this.f236P;
            layoutParams.f164F = this.ad;
            layoutParams.f165G = this.ae;
            layoutParams.f168J = this.af;
            layoutParams.f169K = this.ag;
            layoutParams.f166H = this.ah;
            layoutParams.f167I = this.ai;
            layoutParams.f172N = this.f272z;
            layoutParams.f187c = this.f253g;
            layoutParams.f185a = this.f251e;
            layoutParams.f186b = this.f252f;
            layoutParams.width = this.f248b;
            layoutParams.height = this.f249c;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(this.f226F);
                layoutParams.setMarginEnd(this.f225E);
            }
            layoutParams.m92a();
        }

        public final /* synthetic */ Object clone() {
            C0076a c0076a = new C0076a();
            c0076a.f247a = this.f247a;
            c0076a.f248b = this.f248b;
            c0076a.f249c = this.f249c;
            c0076a.f251e = this.f251e;
            c0076a.f252f = this.f252f;
            c0076a.f253g = this.f253g;
            c0076a.f254h = this.f254h;
            c0076a.f255i = this.f255i;
            c0076a.f256j = this.f256j;
            c0076a.f257k = this.f257k;
            c0076a.f258l = this.f258l;
            c0076a.f259m = this.f259m;
            c0076a.f260n = this.f260n;
            c0076a.f261o = this.f261o;
            c0076a.f262p = this.f262p;
            c0076a.f263q = this.f263q;
            c0076a.f264r = this.f264r;
            c0076a.f265s = this.f265s;
            c0076a.f266t = this.f266t;
            c0076a.f267u = this.f267u;
            c0076a.f268v = this.f268v;
            c0076a.f269w = this.f269w;
            c0076a.f270x = this.f270x;
            c0076a.f271y = this.f271y;
            c0076a.f267u = this.f267u;
            c0076a.f267u = this.f267u;
            c0076a.f267u = this.f267u;
            c0076a.f267u = this.f267u;
            c0076a.f267u = this.f267u;
            c0076a.f272z = this.f272z;
            c0076a.f221A = this.f221A;
            c0076a.f222B = this.f222B;
            c0076a.f223C = this.f223C;
            c0076a.f224D = this.f224D;
            c0076a.f225E = this.f225E;
            c0076a.f226F = this.f226F;
            c0076a.f227G = this.f227G;
            c0076a.f228H = this.f228H;
            c0076a.f229I = this.f229I;
            c0076a.f230J = this.f230J;
            c0076a.f231K = this.f231K;
            c0076a.f232L = this.f232L;
            c0076a.f233M = this.f233M;
            c0076a.f234N = this.f234N;
            c0076a.f235O = this.f235O;
            c0076a.f236P = this.f236P;
            c0076a.f237Q = this.f237Q;
            c0076a.f238R = this.f238R;
            c0076a.f239S = this.f239S;
            c0076a.f240T = this.f240T;
            c0076a.f241U = this.f241U;
            c0076a.f242V = this.f242V;
            c0076a.f243W = this.f243W;
            c0076a.f244X = this.f244X;
            c0076a.f245Y = this.f245Y;
            c0076a.f246Z = this.f246Z;
            c0076a.aa = this.aa;
            c0076a.ab = this.ab;
            c0076a.ac = this.ac;
            c0076a.ad = this.ad;
            c0076a.ae = this.ae;
            c0076a.af = this.af;
            c0076a.ag = this.ag;
            c0076a.ah = this.ah;
            c0076a.ai = this.ai;
            return c0076a;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f424c = sparseIntArray;
        sparseIntArray.append(C0103a.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f424c.append(C0103a.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f424c.append(C0103a.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f424c.append(C0103a.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f424c.append(C0103a.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f424c.append(C0103a.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f424c.append(C0103a.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f424c.append(C0103a.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f424c.append(C0103a.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f424c.append(C0103a.ConstraintSet_layout_editor_absoluteX, 6);
        f424c.append(C0103a.ConstraintSet_layout_editor_absoluteY, 7);
        f424c.append(C0103a.ConstraintSet_layout_constraintGuide_begin, 17);
        f424c.append(C0103a.ConstraintSet_layout_constraintGuide_end, 18);
        f424c.append(C0103a.ConstraintSet_layout_constraintGuide_percent, 19);
        f424c.append(C0103a.ConstraintSet_android_orientation, 27);
        f424c.append(C0103a.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f424c.append(C0103a.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f424c.append(C0103a.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f424c.append(C0103a.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f424c.append(C0103a.ConstraintSet_layout_goneMarginLeft, 13);
        f424c.append(C0103a.ConstraintSet_layout_goneMarginTop, 16);
        f424c.append(C0103a.ConstraintSet_layout_goneMarginRight, 14);
        f424c.append(C0103a.ConstraintSet_layout_goneMarginBottom, 11);
        f424c.append(C0103a.ConstraintSet_layout_goneMarginStart, 15);
        f424c.append(C0103a.ConstraintSet_layout_goneMarginEnd, 12);
        f424c.append(C0103a.ConstraintSet_layout_constraintVertical_weight, 40);
        f424c.append(C0103a.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f424c.append(C0103a.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f424c.append(C0103a.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f424c.append(C0103a.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f424c.append(C0103a.ConstraintSet_layout_constraintVertical_bias, 37);
        f424c.append(C0103a.ConstraintSet_layout_constraintDimensionRatio, 5);
        f424c.append(C0103a.ConstraintSet_layout_constraintLeft_creator, 60);
        f424c.append(C0103a.ConstraintSet_layout_constraintTop_creator, 60);
        f424c.append(C0103a.ConstraintSet_layout_constraintRight_creator, 60);
        f424c.append(C0103a.ConstraintSet_layout_constraintBottom_creator, 60);
        f424c.append(C0103a.ConstraintSet_layout_constraintBaseline_creator, 60);
        f424c.append(C0103a.ConstraintSet_android_layout_marginLeft, 24);
        f424c.append(C0103a.ConstraintSet_android_layout_marginRight, 28);
        f424c.append(C0103a.ConstraintSet_android_layout_marginStart, 31);
        f424c.append(C0103a.ConstraintSet_android_layout_marginEnd, 8);
        f424c.append(C0103a.ConstraintSet_android_layout_marginTop, 34);
        f424c.append(C0103a.ConstraintSet_android_layout_marginBottom, 2);
        f424c.append(C0103a.ConstraintSet_android_layout_width, 23);
        f424c.append(C0103a.ConstraintSet_android_layout_height, 21);
        f424c.append(C0103a.ConstraintSet_android_visibility, 22);
        f424c.append(C0103a.ConstraintSet_android_alpha, 43);
        f424c.append(C0103a.ConstraintSet_android_elevation, 44);
        f424c.append(C0103a.ConstraintSet_android_rotationX, 45);
        f424c.append(C0103a.ConstraintSet_android_rotationY, 46);
        f424c.append(C0103a.ConstraintSet_android_scaleX, 47);
        f424c.append(C0103a.ConstraintSet_android_scaleY, 48);
        f424c.append(C0103a.ConstraintSet_android_transformPivotX, 49);
        f424c.append(C0103a.ConstraintSet_android_transformPivotY, 50);
        f424c.append(C0103a.ConstraintSet_android_translationX, 51);
        f424c.append(C0103a.ConstraintSet_android_translationY, 52);
        f424c.append(C0103a.ConstraintSet_android_translationZ, 53);
        f424c.append(C0103a.ConstraintSet_layout_constraintWidth_default, 54);
        f424c.append(C0103a.ConstraintSet_layout_constraintHeight_default, 55);
        f424c.append(C0103a.ConstraintSet_layout_constraintWidth_max, 56);
        f424c.append(C0103a.ConstraintSet_layout_constraintHeight_max, 57);
        f424c.append(C0103a.ConstraintSet_layout_constraintWidth_min, 58);
        f424c.append(C0103a.ConstraintSet_layout_constraintHeight_min, 59);
        f424c.append(C0103a.ConstraintSet_android_id, 38);
    }

    private static int m223a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    static void m224a(C0076a c0076a, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (f424c.get(index)) {
                case 1:
                    c0076a.f262p = C0102a.m223a(typedArray, index, c0076a.f262p);
                    break;
                case 2:
                    c0076a.f224D = typedArray.getDimensionPixelSize(index, c0076a.f224D);
                    break;
                case 3:
                    c0076a.f261o = C0102a.m223a(typedArray, index, c0076a.f261o);
                    break;
                case 4:
                    c0076a.f260n = C0102a.m223a(typedArray, index, c0076a.f260n);
                    break;
                case 5:
                    c0076a.f269w = typedArray.getString(index);
                    break;
                case 6:
                    c0076a.f270x = typedArray.getDimensionPixelOffset(index, c0076a.f270x);
                    break;
                case 7:
                    c0076a.f271y = typedArray.getDimensionPixelOffset(index, c0076a.f271y);
                    break;
                case 8:
                    c0076a.f225E = typedArray.getDimensionPixelSize(index, c0076a.f225E);
                    break;
                case 9:
                    c0076a.f260n = C0102a.m223a(typedArray, index, c0076a.f266t);
                    break;
                case 10:
                    c0076a.f265s = C0102a.m223a(typedArray, index, c0076a.f265s);
                    break;
                case 11:
                    c0076a.f231K = typedArray.getDimensionPixelSize(index, c0076a.f231K);
                    break;
                case 12:
                    c0076a.f232L = typedArray.getDimensionPixelSize(index, c0076a.f232L);
                    break;
                case 13:
                    c0076a.f228H = typedArray.getDimensionPixelSize(index, c0076a.f228H);
                    break;
                case 14:
                    c0076a.f230J = typedArray.getDimensionPixelSize(index, c0076a.f230J);
                    break;
                case 15:
                    c0076a.f233M = typedArray.getDimensionPixelSize(index, c0076a.f233M);
                    break;
                case 16:
                    c0076a.f229I = typedArray.getDimensionPixelSize(index, c0076a.f229I);
                    break;
                case 17:
                    c0076a.f251e = typedArray.getDimensionPixelOffset(index, c0076a.f251e);
                    break;
                case 18:
                    c0076a.f252f = typedArray.getDimensionPixelOffset(index, c0076a.f252f);
                    break;
                case 19:
                    c0076a.f253g = typedArray.getFloat(index, c0076a.f253g);
                    break;
                case 20:
                    c0076a.f267u = typedArray.getFloat(index, c0076a.f267u);
                    break;
                case 21:
                    c0076a.f249c = typedArray.getLayoutDimension(index, c0076a.f249c);
                    break;
                case 22:
                    c0076a.f227G = typedArray.getInt(index, c0076a.f227G);
                    c0076a.f227G = f423b[c0076a.f227G];
                    break;
                case 23:
                    c0076a.f248b = typedArray.getLayoutDimension(index, c0076a.f248b);
                    break;
                case 24:
                    c0076a.f221A = typedArray.getDimensionPixelSize(index, c0076a.f221A);
                    break;
                case 25:
                    c0076a.f254h = C0102a.m223a(typedArray, index, c0076a.f254h);
                    break;
                case 26:
                    c0076a.f255i = C0102a.m223a(typedArray, index, c0076a.f255i);
                    break;
                case 27:
                    c0076a.f272z = typedArray.getInt(index, c0076a.f272z);
                    break;
                case 28:
                    c0076a.f222B = typedArray.getDimensionPixelSize(index, c0076a.f222B);
                    break;
                case 29:
                    c0076a.f256j = C0102a.m223a(typedArray, index, c0076a.f256j);
                    break;
                case 30:
                    c0076a.f257k = C0102a.m223a(typedArray, index, c0076a.f257k);
                    break;
                case 31:
                    c0076a.f226F = typedArray.getDimensionPixelSize(index, c0076a.f226F);
                    break;
                case 32:
                    c0076a.f263q = C0102a.m223a(typedArray, index, c0076a.f263q);
                    break;
                case 33:
                    c0076a.f264r = C0102a.m223a(typedArray, index, c0076a.f264r);
                    break;
                case 34:
                    c0076a.f223C = typedArray.getDimensionPixelSize(index, c0076a.f223C);
                    break;
                case 35:
                    c0076a.f259m = C0102a.m223a(typedArray, index, c0076a.f259m);
                    break;
                case 36:
                    c0076a.f258l = C0102a.m223a(typedArray, index, c0076a.f258l);
                    break;
                case 37:
                    c0076a.f268v = typedArray.getFloat(index, c0076a.f268v);
                    break;
                case 38:
                    c0076a.f250d = typedArray.getResourceId(index, c0076a.f250d);
                    break;
                case 39:
                    c0076a.f235O = typedArray.getFloat(index, c0076a.f235O);
                    break;
                case 40:
                    c0076a.f234N = typedArray.getFloat(index, c0076a.f234N);
                    break;
                case 41:
                    c0076a.f236P = typedArray.getInt(index, c0076a.f236P);
                    break;
                case 42:
                    c0076a.f237Q = typedArray.getInt(index, c0076a.f237Q);
                    break;
                case 43:
                    c0076a.f238R = typedArray.getFloat(index, c0076a.f238R);
                    break;
                case 44:
                    c0076a.f239S = true;
                    c0076a.f240T = typedArray.getFloat(index, c0076a.f240T);
                    break;
                case 45:
                    c0076a.f241U = typedArray.getFloat(index, c0076a.f241U);
                    break;
                case 46:
                    c0076a.f242V = typedArray.getFloat(index, c0076a.f242V);
                    break;
                case 47:
                    c0076a.f243W = typedArray.getFloat(index, c0076a.f243W);
                    break;
                case 48:
                    c0076a.f244X = typedArray.getFloat(index, c0076a.f244X);
                    break;
                case 49:
                    c0076a.f245Y = typedArray.getFloat(index, c0076a.f245Y);
                    break;
                case 50:
                    c0076a.f246Z = typedArray.getFloat(index, c0076a.f246Z);
                    break;
                case 51:
                    c0076a.aa = typedArray.getFloat(index, c0076a.aa);
                    break;
                case 52:
                    c0076a.ab = typedArray.getFloat(index, c0076a.ab);
                    break;
                case 53:
                    c0076a.ac = typedArray.getFloat(index, c0076a.ac);
                    break;
                case 60:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f424c.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f424c.get(index));
                    break;
            }
        }
    }

    final void m225a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f425a.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (this.f425a.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                C0076a c0076a = (C0076a) this.f425a.get(Integer.valueOf(id));
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                c0076a.m97a(layoutParams);
                childAt.setLayoutParams(layoutParams);
                childAt.setVisibility(c0076a.f227G);
                if (VERSION.SDK_INT >= 17) {
                    childAt.setAlpha(c0076a.f238R);
                    childAt.setRotationX(c0076a.f241U);
                    childAt.setRotationY(c0076a.f242V);
                    childAt.setScaleX(c0076a.f243W);
                    childAt.setScaleY(c0076a.f244X);
                    childAt.setPivotX(c0076a.f245Y);
                    childAt.setPivotY(c0076a.f246Z);
                    childAt.setTranslationX(c0076a.aa);
                    childAt.setTranslationY(c0076a.ab);
                    if (VERSION.SDK_INT >= 21) {
                        childAt.setTranslationZ(c0076a.ac);
                        if (c0076a.f239S) {
                            childAt.setElevation(c0076a.f240T);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0076a c0076a2 = (C0076a) this.f425a.get(num);
            if (c0076a2.f247a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ViewGroup.LayoutParams a = ConstraintLayout.m93a();
                c0076a2.m97a(a);
                constraintLayout.addView(guideline, a);
            }
        }
    }
}
