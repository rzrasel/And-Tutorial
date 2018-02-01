package com.google.android.gms.internal;

import android.content.Context;
import java.util.HashSet;

final class ns {
    public final nr f1991a;
    public final String f1992b;
    public final Context f1993c;
    public final ne f1994d;
    public final dx f1995e;
    public C0394s f1996f;
    public fj f1997g;
    public ak f1998h;
    public ez f1999i;
    public fa f2000j;
    public ab f2001k;
    public dl f2002l;
    public fh f2003m = null;
    HashSet f2004n = null;

    public ns(Context context, ak akVar, String str, dx dxVar) {
        if (akVar.f938e) {
            this.f1991a = null;
        } else {
            this.f1991a = new nr(context);
            this.f1991a.setMinimumWidth(akVar.f940g);
            this.f1991a.setMinimumHeight(akVar.f937d);
            this.f1991a.setVisibility(4);
        }
        this.f1998h = akVar;
        this.f1992b = str;
        this.f1993c = context;
        this.f1994d = new ne(mr.m2625a(dxVar.f1222b, context));
        this.f1995e = dxVar;
    }
}
