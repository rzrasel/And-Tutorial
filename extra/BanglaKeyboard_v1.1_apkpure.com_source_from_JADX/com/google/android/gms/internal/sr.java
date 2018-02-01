package com.google.android.gms.internal;

public class sr<MessageType extends sq<MessageType, BuilderType>, BuilderType extends sr<MessageType, BuilderType>> extends ru<MessageType, BuilderType> {
    protected MessageType f6748a;
    private final MessageType f6749b;
    private boolean f6750c = false;

    protected sr(MessageType messageType) {
        this.f6749b = messageType;
        this.f6748a = (sq) messageType.mo2219a(sy.f7117e, null, null);
    }

    private static void m6098a(MessageType messageType, MessageType messageType2) {
        Object obj = sx.f7112a;
        messageType.mo2219a(sy.f7114b, obj, (Object) messageType2);
        messageType.f6753e = obj.mo2280a(messageType.f6753e, messageType2.f6753e);
    }

    protected final /* synthetic */ ru mo2211a(rt rtVar) {
        return m6100a((sq) rtVar);
    }

    public final BuilderType m6100a(MessageType messageType) {
        m6102c();
        m6098a(this.f6748a, messageType);
        return this;
    }

    public final /* synthetic */ ru mo2212b() {
        return (sr) clone();
    }

    protected final void m6102c() {
        if (this.f6750c) {
            sq sqVar = (sq) this.f6748a.mo2219a(sy.f7117e, null, null);
            m6098a(sqVar, this.f6748a);
            this.f6748a = sqVar;
            this.f6750c = false;
        }
    }

    public /* synthetic */ Object clone() {
        sq sqVar;
        sr srVar = (sr) this.f6749b.mo2219a(sy.f7118f, null, null);
        if (this.f6750c) {
            sqVar = this.f6748a;
        } else {
            sqVar = this.f6748a;
            sqVar.mo2219a(sy.f7116d, null, null);
            sqVar.f6753e.f7159a = false;
            this.f6750c = true;
            sqVar = this.f6748a;
        }
        srVar.m6100a(sqVar);
        return srVar;
    }

    public final MessageType m6103d() {
        if (this.f6750c) {
            return this.f6748a;
        }
        sq sqVar = this.f6748a;
        sqVar.mo2219a(sy.f7116d, null, null);
        sqVar.f6753e.f7159a = false;
        this.f6750c = true;
        return this.f6748a;
    }

    public final MessageType m6104e() {
        sq sqVar;
        boolean z = true;
        if (this.f6750c) {
            sqVar = this.f6748a;
        } else {
            sqVar = this.f6748a;
            sqVar.mo2219a(sy.f7116d, null, null);
            sqVar.f6753e.f7159a = false;
            this.f6750c = true;
            sqVar = this.f6748a;
        }
        sqVar = sqVar;
        if (sqVar.mo2219a(sy.f7113a, Boolean.TRUE, null) == null) {
            z = false;
        }
        if (z) {
            return sqVar;
        }
        throw new ud();
    }

    public final /* synthetic */ tl mo2214f() {
        sq sqVar;
        boolean z = true;
        if (this.f6750c) {
            sqVar = this.f6748a;
        } else {
            sqVar = this.f6748a;
            sqVar.mo2219a(sy.f7116d, null, null);
            sqVar.f6753e.f7159a = false;
            this.f6750c = true;
            sqVar = this.f6748a;
        }
        sqVar = sqVar;
        if (sqVar.mo2219a(sy.f7113a, Boolean.TRUE, null) == null) {
            z = false;
        }
        if (z) {
            return sqVar;
        }
        throw new ud();
    }

    public final /* synthetic */ tl mo2215j() {
        return this.f6749b;
    }
}
