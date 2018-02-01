package android.support.v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.p019a.C0626b;
import android.support.v4.view.p019a.C0635c;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

public class C0122a {
    private static final AccessibilityDelegate DEFAULT_DELEGATE = new AccessibilityDelegate();
    private static final C0607b IMPL;
    final AccessibilityDelegate mBridge = IMPL.mo585a(this);

    static class C0607b {
        C0607b() {
        }

        public C0635c mo584a(AccessibilityDelegate accessibilityDelegate, View view) {
            return null;
        }

        public AccessibilityDelegate mo585a(final C0122a c0122a) {
            return new AccessibilityDelegate(this) {
                final /* synthetic */ C0607b f1881b;

                public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return c0122a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                }

                public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0122a.onInitializeAccessibilityEvent(view, accessibilityEvent);
                }

                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    c0122a.onInitializeAccessibilityNodeInfo(view, C0626b.m1683a(accessibilityNodeInfo));
                }

                public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0122a.onPopulateAccessibilityEvent(view, accessibilityEvent);
                }

                public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return c0122a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                }

                public final void sendAccessibilityEvent(View view, int i) {
                    c0122a.sendAccessibilityEvent(view, i);
                }

                public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    c0122a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
                }
            };
        }

        public boolean mo586a(AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return false;
        }
    }

    static class C0608a extends C0607b {
        C0608a() {
        }

        public final C0635c mo584a(AccessibilityDelegate accessibilityDelegate, View view) {
            AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
            return accessibilityNodeProvider != null ? new C0635c(accessibilityNodeProvider) : null;
        }

        public final AccessibilityDelegate mo585a(final C0122a c0122a) {
            return new AccessibilityDelegate(this) {
                final /* synthetic */ C0608a f1879b;

                public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return c0122a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                }

                public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                    C0635c accessibilityNodeProvider = c0122a.getAccessibilityNodeProvider(view);
                    return accessibilityNodeProvider != null ? (AccessibilityNodeProvider) accessibilityNodeProvider.f1924a : null;
                }

                public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0122a.onInitializeAccessibilityEvent(view, accessibilityEvent);
                }

                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    c0122a.onInitializeAccessibilityNodeInfo(view, C0626b.m1683a(accessibilityNodeInfo));
                }

                public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0122a.onPopulateAccessibilityEvent(view, accessibilityEvent);
                }

                public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return c0122a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                }

                public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                    return c0122a.performAccessibilityAction(view, i, bundle);
                }

                public final void sendAccessibilityEvent(View view, int i) {
                    c0122a.sendAccessibilityEvent(view, i);
                }

                public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    c0122a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
                }
            };
        }

        public final boolean mo586a(AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            IMPL = new C0608a();
        } else {
            IMPL = new C0607b();
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return DEFAULT_DELEGATE.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C0635c getAccessibilityNodeProvider(View view) {
        return IMPL.mo584a(DEFAULT_DELEGATE, view);
    }

    AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        DEFAULT_DELEGATE.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C0626b c0626b) {
        DEFAULT_DELEGATE.onInitializeAccessibilityNodeInfo(view, c0626b.f1917b);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        DEFAULT_DELEGATE.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return DEFAULT_DELEGATE.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return IMPL.mo586a(DEFAULT_DELEGATE, view, i, bundle);
    }

    public void sendAccessibilityEvent(View view, int i) {
        DEFAULT_DELEGATE.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        DEFAULT_DELEGATE.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
