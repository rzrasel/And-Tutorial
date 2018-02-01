package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public final class C0655c {
    private final C0651a f1960a;

    interface C0651a {
        boolean mo632a(MotionEvent motionEvent);
    }

    static class C0653b implements C0651a {
        private static final int f1935l = ViewConfiguration.getLongPressTimeout();
        private static final int f1936m = ViewConfiguration.getTapTimeout();
        private static final int f1937n = ViewConfiguration.getDoubleTapTimeout();
        final Handler f1938a = new C0652a(this);
        final OnGestureListener f1939b;
        OnDoubleTapListener f1940c;
        boolean f1941d;
        boolean f1942e;
        boolean f1943f;
        MotionEvent f1944g;
        private int f1945h;
        private int f1946i;
        private int f1947j;
        private int f1948k;
        private boolean f1949o;
        private boolean f1950p;
        private MotionEvent f1951q;
        private boolean f1952r;
        private float f1953s;
        private float f1954t;
        private float f1955u;
        private float f1956v;
        private boolean f1957w;
        private VelocityTracker f1958x;

        private class C0652a extends Handler {
            final /* synthetic */ C0653b f1934a;

            C0652a(C0653b c0653b) {
                this.f1934a = c0653b;
            }

            public final void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        this.f1934a.f1939b.onShowPress(this.f1934a.f1944g);
                        return;
                    case 2:
                        C0653b c0653b = this.f1934a;
                        c0653b.f1938a.removeMessages(3);
                        c0653b.f1942e = false;
                        c0653b.f1943f = true;
                        c0653b.f1939b.onLongPress(c0653b.f1944g);
                        return;
                    case 3:
                        if (this.f1934a.f1940c == null) {
                            return;
                        }
                        if (this.f1934a.f1941d) {
                            this.f1934a.f1942e = true;
                            return;
                        } else {
                            this.f1934a.f1940c.onSingleTapConfirmed(this.f1934a.f1944g);
                            return;
                        }
                    default:
                        throw new RuntimeException("Unknown message " + message);
                }
            }
        }

        public C0653b(Context context, OnGestureListener onGestureListener) {
            this.f1939b = onGestureListener;
            if (onGestureListener instanceof OnDoubleTapListener) {
                this.f1940c = (OnDoubleTapListener) onGestureListener;
            }
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f1939b == null) {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            } else {
                this.f1957w = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f1947j = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f1948k = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f1945h = scaledTouchSlop * scaledTouchSlop;
                this.f1946i = scaledDoubleTapSlop * scaledDoubleTapSlop;
            }
        }

        public final boolean mo632a(MotionEvent motionEvent) {
            int i;
            int action = motionEvent.getAction();
            if (this.f1958x == null) {
                this.f1958x = VelocityTracker.obtain();
            }
            this.f1958x.addMovement(motionEvent);
            boolean z = (action & 255) == 6;
            int actionIndex = z ? motionEvent.getActionIndex() : -1;
            int pointerCount = motionEvent.getPointerCount();
            float f = 0.0f;
            float f2 = 0.0f;
            for (i = 0; i < pointerCount; i++) {
                if (actionIndex != i) {
                    f2 += motionEvent.getX(i);
                    f += motionEvent.getY(i);
                }
            }
            actionIndex = z ? pointerCount - 1 : pointerCount;
            f2 /= (float) actionIndex;
            f /= (float) actionIndex;
            boolean hasMessages;
            float yVelocity;
            float xVelocity;
            switch (action & 255) {
                case 0:
                    if (this.f1940c != null) {
                        hasMessages = this.f1938a.hasMessages(3);
                        if (hasMessages) {
                            this.f1938a.removeMessages(3);
                        }
                        if (!(this.f1944g == null || this.f1951q == null || !hasMessages)) {
                            MotionEvent motionEvent2 = this.f1944g;
                            MotionEvent motionEvent3 = this.f1951q;
                            if (this.f1950p && motionEvent.getEventTime() - motionEvent3.getEventTime() <= ((long) f1937n)) {
                                pointerCount = ((int) motionEvent2.getX()) - ((int) motionEvent.getX());
                                actionIndex = ((int) motionEvent2.getY()) - ((int) motionEvent.getY());
                                if ((actionIndex * actionIndex) + (pointerCount * pointerCount) < this.f1946i) {
                                    hasMessages = true;
                                    if (hasMessages) {
                                        this.f1952r = true;
                                        actionIndex = (this.f1940c.onDoubleTap(this.f1944g) | 0) | this.f1940c.onDoubleTapEvent(motionEvent);
                                        this.f1953s = f2;
                                        this.f1955u = f2;
                                        this.f1954t = f;
                                        this.f1956v = f;
                                        if (this.f1944g != null) {
                                            this.f1944g.recycle();
                                        }
                                        this.f1944g = MotionEvent.obtain(motionEvent);
                                        this.f1949o = true;
                                        this.f1950p = true;
                                        this.f1941d = true;
                                        this.f1943f = false;
                                        this.f1942e = false;
                                        if (this.f1957w) {
                                            this.f1938a.removeMessages(2);
                                            this.f1938a.sendEmptyMessageAtTime(2, (this.f1944g.getDownTime() + ((long) f1936m)) + ((long) f1935l));
                                        }
                                        this.f1938a.sendEmptyMessageAtTime(1, this.f1944g.getDownTime() + ((long) f1936m));
                                        return actionIndex | this.f1939b.onDown(motionEvent);
                                    }
                                }
                            }
                            hasMessages = false;
                            if (hasMessages) {
                                this.f1952r = true;
                                actionIndex = (this.f1940c.onDoubleTap(this.f1944g) | 0) | this.f1940c.onDoubleTapEvent(motionEvent);
                                this.f1953s = f2;
                                this.f1955u = f2;
                                this.f1954t = f;
                                this.f1956v = f;
                                if (this.f1944g != null) {
                                    this.f1944g.recycle();
                                }
                                this.f1944g = MotionEvent.obtain(motionEvent);
                                this.f1949o = true;
                                this.f1950p = true;
                                this.f1941d = true;
                                this.f1943f = false;
                                this.f1942e = false;
                                if (this.f1957w) {
                                    this.f1938a.removeMessages(2);
                                    this.f1938a.sendEmptyMessageAtTime(2, (this.f1944g.getDownTime() + ((long) f1936m)) + ((long) f1935l));
                                }
                                this.f1938a.sendEmptyMessageAtTime(1, this.f1944g.getDownTime() + ((long) f1936m));
                                return actionIndex | this.f1939b.onDown(motionEvent);
                            }
                        }
                        this.f1938a.sendEmptyMessageDelayed(3, (long) f1937n);
                    }
                    actionIndex = 0;
                    this.f1953s = f2;
                    this.f1955u = f2;
                    this.f1954t = f;
                    this.f1956v = f;
                    if (this.f1944g != null) {
                        this.f1944g.recycle();
                    }
                    this.f1944g = MotionEvent.obtain(motionEvent);
                    this.f1949o = true;
                    this.f1950p = true;
                    this.f1941d = true;
                    this.f1943f = false;
                    this.f1942e = false;
                    if (this.f1957w) {
                        this.f1938a.removeMessages(2);
                        this.f1938a.sendEmptyMessageAtTime(2, (this.f1944g.getDownTime() + ((long) f1936m)) + ((long) f1935l));
                    }
                    this.f1938a.sendEmptyMessageAtTime(1, this.f1944g.getDownTime() + ((long) f1936m));
                    return actionIndex | this.f1939b.onDown(motionEvent);
                case 1:
                    this.f1941d = false;
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    if (this.f1952r) {
                        hasMessages = this.f1940c.onDoubleTapEvent(motionEvent) | 0;
                    } else if (this.f1943f) {
                        this.f1938a.removeMessages(3);
                        this.f1943f = false;
                        hasMessages = false;
                    } else if (this.f1949o) {
                        hasMessages = this.f1939b.onSingleTapUp(motionEvent);
                        if (this.f1942e && this.f1940c != null) {
                            this.f1940c.onSingleTapConfirmed(motionEvent);
                        }
                    } else {
                        VelocityTracker velocityTracker = this.f1958x;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(1000, (float) this.f1948k);
                        yVelocity = velocityTracker.getYVelocity(pointerId);
                        xVelocity = velocityTracker.getXVelocity(pointerId);
                        hasMessages = (Math.abs(yVelocity) > ((float) this.f1947j) || Math.abs(xVelocity) > ((float) this.f1947j)) ? this.f1939b.onFling(this.f1944g, motionEvent, xVelocity, yVelocity) : false;
                    }
                    if (this.f1951q != null) {
                        this.f1951q.recycle();
                    }
                    this.f1951q = obtain;
                    if (this.f1958x != null) {
                        this.f1958x.recycle();
                        this.f1958x = null;
                    }
                    this.f1952r = false;
                    this.f1942e = false;
                    this.f1938a.removeMessages(1);
                    this.f1938a.removeMessages(2);
                    return hasMessages;
                case 2:
                    if (this.f1943f) {
                        return false;
                    }
                    xVelocity = this.f1953s - f2;
                    yVelocity = this.f1954t - f;
                    if (this.f1952r) {
                        return this.f1940c.onDoubleTapEvent(motionEvent) | 0;
                    }
                    if (this.f1949o) {
                        i = (int) (f2 - this.f1955u);
                        int i2 = (int) (f - this.f1956v);
                        i = (i * i) + (i2 * i2);
                        if (i > this.f1945h) {
                            hasMessages = this.f1939b.onScroll(this.f1944g, motionEvent, xVelocity, yVelocity);
                            this.f1953s = f2;
                            this.f1954t = f;
                            this.f1949o = false;
                            this.f1938a.removeMessages(3);
                            this.f1938a.removeMessages(1);
                            this.f1938a.removeMessages(2);
                        } else {
                            hasMessages = false;
                        }
                        if (i > this.f1945h) {
                            this.f1950p = false;
                        }
                        return hasMessages;
                    } else if (Math.abs(xVelocity) < 1.0f && Math.abs(yVelocity) < 1.0f) {
                        return false;
                    } else {
                        boolean onScroll = this.f1939b.onScroll(this.f1944g, motionEvent, xVelocity, yVelocity);
                        this.f1953s = f2;
                        this.f1954t = f;
                        return onScroll;
                    }
                case 3:
                    this.f1938a.removeMessages(1);
                    this.f1938a.removeMessages(2);
                    this.f1938a.removeMessages(3);
                    this.f1958x.recycle();
                    this.f1958x = null;
                    this.f1952r = false;
                    this.f1941d = false;
                    this.f1949o = false;
                    this.f1950p = false;
                    this.f1942e = false;
                    if (!this.f1943f) {
                        return false;
                    }
                    this.f1943f = false;
                    return false;
                case 5:
                    this.f1953s = f2;
                    this.f1955u = f2;
                    this.f1954t = f;
                    this.f1956v = f;
                    this.f1938a.removeMessages(1);
                    this.f1938a.removeMessages(2);
                    this.f1938a.removeMessages(3);
                    this.f1952r = false;
                    this.f1949o = false;
                    this.f1950p = false;
                    this.f1942e = false;
                    if (!this.f1943f) {
                        return false;
                    }
                    this.f1943f = false;
                    return false;
                case 6:
                    this.f1953s = f2;
                    this.f1955u = f2;
                    this.f1954t = f;
                    this.f1956v = f;
                    this.f1958x.computeCurrentVelocity(1000, (float) this.f1948k);
                    int actionIndex2 = motionEvent.getActionIndex();
                    actionIndex = motionEvent.getPointerId(actionIndex2);
                    f2 = this.f1958x.getXVelocity(actionIndex);
                    float yVelocity2 = this.f1958x.getYVelocity(actionIndex);
                    for (actionIndex = 0; actionIndex < pointerCount; actionIndex++) {
                        if (actionIndex != actionIndex2) {
                            i = motionEvent.getPointerId(actionIndex);
                            if ((this.f1958x.getYVelocity(i) * yVelocity2) + (this.f1958x.getXVelocity(i) * f2) < 0.0f) {
                                this.f1958x.clear();
                                return false;
                            }
                        }
                    }
                    return false;
                default:
                    return false;
            }
        }
    }

    static class C0654c implements C0651a {
        private final GestureDetector f1959a;

        public C0654c(Context context, OnGestureListener onGestureListener) {
            this.f1959a = new GestureDetector(context, onGestureListener, null);
        }

        public final boolean mo632a(MotionEvent motionEvent) {
            return this.f1959a.onTouchEvent(motionEvent);
        }
    }

    public C0655c(Context context, OnGestureListener onGestureListener) {
        this(context, onGestureListener, (byte) 0);
    }

    private C0655c(Context context, OnGestureListener onGestureListener, byte b) {
        if (VERSION.SDK_INT > 17) {
            this.f1960a = new C0654c(context, onGestureListener);
        } else {
            this.f1960a = new C0653b(context, onGestureListener);
        }
    }

    public final boolean m1742a(MotionEvent motionEvent) {
        return this.f1960a.mo632a(motionEvent);
    }
}
