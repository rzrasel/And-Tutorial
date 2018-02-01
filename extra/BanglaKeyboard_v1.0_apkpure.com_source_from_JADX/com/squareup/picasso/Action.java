package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso.LoadedFrom;
import com.squareup.picasso.Picasso.Priority;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

abstract class Action {
    boolean cancelled;
    final Drawable errorDrawable;
    final int errorResId;
    final String key;
    final int memoryPolicy;
    final int networkPolicy;
    final boolean noFade;
    final Picasso picasso;
    final Request request;
    final Object tag;
    final WeakReference target;
    boolean willReplay;

    class RequestWeakReference extends WeakReference {
        final Action action;

        public RequestWeakReference(Action action, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.action = action;
        }
    }

    Action(Picasso picasso, Object obj, Request request, int i, int i2, int i3, Drawable drawable, String str, Object obj2, boolean z) {
        this.picasso = picasso;
        this.request = request;
        this.target = obj == null ? null : new RequestWeakReference(this, obj, picasso.referenceQueue);
        this.memoryPolicy = i;
        this.networkPolicy = i2;
        this.noFade = z;
        this.errorResId = i3;
        this.errorDrawable = drawable;
        this.key = str;
        if (obj2 == null) {
            Action action = this;
        }
        this.tag = obj2;
    }

    void cancel() {
        this.cancelled = true;
    }

    abstract void complete(Bitmap bitmap, LoadedFrom loadedFrom);

    abstract void error();

    String getKey() {
        return this.key;
    }

    int getMemoryPolicy() {
        return this.memoryPolicy;
    }

    int getNetworkPolicy() {
        return this.networkPolicy;
    }

    Picasso getPicasso() {
        return this.picasso;
    }

    Priority getPriority() {
        return this.request.priority;
    }

    Request getRequest() {
        return this.request;
    }

    Object getTag() {
        return this.tag;
    }

    Object getTarget() {
        return this.target == null ? null : this.target.get();
    }

    boolean isCancelled() {
        return this.cancelled;
    }

    boolean willReplay() {
        return this.willReplay;
    }
}
