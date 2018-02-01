package com.google.android.gms.internal;

public abstract class ru<MessageType extends rt<MessageType, BuilderType>, BuilderType extends ru<MessageType, BuilderType>> implements tm {
    protected abstract BuilderType mo2211a(MessageType messageType);

    public final /* synthetic */ tm mo2210a(tl tlVar) {
        if (mo2215j().getClass().isInstance(tlVar)) {
            return mo2211a((rt) tlVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public abstract BuilderType mo2212b();

    public /* synthetic */ Object clone() {
        return mo2212b();
    }
}
