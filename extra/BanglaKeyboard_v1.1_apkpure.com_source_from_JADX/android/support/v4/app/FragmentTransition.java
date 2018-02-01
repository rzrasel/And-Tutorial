package android.support.v4.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.p018f.C0475h;
import android.support.v4.p018f.C0478a;
import android.support.v4.view.C0679r;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class FragmentTransition {
    private static final int[] INVERSE_OPS = new int[]{0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    static class FragmentContainerTransition {
        public Fragment firstOut;
        public boolean firstOutIsPop;
        public BackStackRecord firstOutTransaction;
        public Fragment lastIn;
        public boolean lastInIsPop;
        public BackStackRecord lastInTransaction;

        FragmentContainerTransition() {
        }
    }

    FragmentTransition() {
    }

    private static void addSharedElementsWithMatchingNames(ArrayList<View> arrayList, C0478a<String, View> c0478a, Collection<String> collection) {
        for (int size = c0478a.size() - 1; size >= 0; size--) {
            View view = (View) c0478a.m1250c(size);
            if (collection.contains(C0679r.m1942o(view))) {
                arrayList.add(view);
            }
        }
    }

    private static void addToFirstInLastOut(BackStackRecord backStackRecord, Op op, SparseArray<FragmentContainerTransition> sparseArray, boolean z, boolean z2) {
        Fragment fragment = op.fragment;
        if (fragment != null) {
            int i = fragment.mContainerId;
            if (i != 0) {
                int i2;
                int i3;
                FragmentContainerTransition ensureContainer;
                boolean z3;
                int i4;
                int i5;
                boolean z4;
                int i6;
                switch (z ? INVERSE_OPS[op.cmd] : op.cmd) {
                    case 1:
                    case 7:
                        z3 = z2 ? fragment.mIsNewlyAdded : (fragment.mAdded || fragment.mHidden) ? false : true;
                        i4 = 1;
                        i2 = 0;
                        i5 = 0;
                        z4 = z3;
                        break;
                    case 3:
                    case 6:
                        i6 = z2 ? (fragment.mAdded || fragment.mView == null || fragment.mView.getVisibility() != 0 || fragment.mPostponedAlpha < 0.0f) ? 0 : 1 : (!fragment.mAdded || fragment.mHidden) ? 0 : 1;
                        i4 = 0;
                        i2 = i6;
                        i5 = 1;
                        i3 = 0;
                        break;
                    case 4:
                        i6 = z2 ? (fragment.mHiddenChanged && fragment.mAdded && fragment.mHidden) ? 1 : 0 : (!fragment.mAdded || fragment.mHidden) ? 0 : 1;
                        i4 = 0;
                        i2 = i6;
                        i5 = 1;
                        i3 = 0;
                        break;
                    case 5:
                        z3 = z2 ? fragment.mHiddenChanged && !fragment.mHidden && fragment.mAdded : fragment.mHidden;
                        i4 = 1;
                        i2 = 0;
                        i5 = 0;
                        z4 = z3;
                        break;
                    default:
                        i4 = 0;
                        i2 = 0;
                        i5 = 0;
                        i3 = 0;
                        break;
                }
                FragmentContainerTransition fragmentContainerTransition = (FragmentContainerTransition) sparseArray.get(i);
                if (i3 != 0) {
                    ensureContainer = ensureContainer(fragmentContainerTransition, sparseArray, i);
                    ensureContainer.lastIn = fragment;
                    ensureContainer.lastInIsPop = z;
                    ensureContainer.lastInTransaction = backStackRecord;
                } else {
                    ensureContainer = fragmentContainerTransition;
                }
                if (!(z2 || r4 == 0)) {
                    if (ensureContainer != null && ensureContainer.firstOut == fragment) {
                        ensureContainer.firstOut = null;
                    }
                    FragmentManagerImpl fragmentManagerImpl = backStackRecord.mManager;
                    if (fragment.mState <= 0 && fragmentManagerImpl.mCurState > 0 && !backStackRecord.mReorderingAllowed) {
                        fragmentManagerImpl.makeActive(fragment);
                        fragmentManagerImpl.moveToState(fragment, 1, 0, 0, false);
                    }
                }
                if (i2 == 0 || !(ensureContainer == null || ensureContainer.firstOut == null)) {
                    fragmentContainerTransition = ensureContainer;
                } else {
                    fragmentContainerTransition = ensureContainer(ensureContainer, sparseArray, i);
                    fragmentContainerTransition.firstOut = fragment;
                    fragmentContainerTransition.firstOutIsPop = z;
                    fragmentContainerTransition.firstOutTransaction = backStackRecord;
                }
                if (!z2 && r7 != 0 && fragmentContainerTransition != null && fragmentContainerTransition.lastIn == fragment) {
                    fragmentContainerTransition.lastIn = null;
                }
            }
        }
    }

    public static void calculateFragments(BackStackRecord backStackRecord, SparseArray<FragmentContainerTransition> sparseArray, boolean z) {
        int size = backStackRecord.mOps.size();
        for (int i = 0; i < size; i++) {
            addToFirstInLastOut(backStackRecord, (Op) backStackRecord.mOps.get(i), sparseArray, false, z);
        }
    }

    private static C0478a<String, String> calculateNameOverrides(int i, ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        C0478a<String, String> c0478a = new C0478a();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            BackStackRecord backStackRecord = (BackStackRecord) arrayList.get(i4);
            if (backStackRecord.interactsWith(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                if (backStackRecord.mSharedElementSourceNames != null) {
                    ArrayList arrayList3;
                    ArrayList arrayList4;
                    int size = backStackRecord.mSharedElementSourceNames.size();
                    if (booleanValue) {
                        arrayList3 = backStackRecord.mSharedElementSourceNames;
                        arrayList4 = backStackRecord.mSharedElementTargetNames;
                    } else {
                        ArrayList arrayList5 = backStackRecord.mSharedElementSourceNames;
                        arrayList3 = backStackRecord.mSharedElementTargetNames;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String str3 = (String) c0478a.remove(str2);
                        if (str3 != null) {
                            c0478a.put(str, str3);
                        } else {
                            c0478a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c0478a;
    }

    public static void calculatePopFragments(BackStackRecord backStackRecord, SparseArray<FragmentContainerTransition> sparseArray, boolean z) {
        if (backStackRecord.mManager.mContainer.onHasView()) {
            for (int size = backStackRecord.mOps.size() - 1; size >= 0; size--) {
                addToFirstInLastOut(backStackRecord, (Op) backStackRecord.mOps.get(size), sparseArray, true, z);
            }
        }
    }

    private static void callSharedElementStartEnd(Fragment fragment, Fragment fragment2, boolean z, C0478a<String, View> c0478a, boolean z2) {
        int i = 0;
        SharedElementCallback enterTransitionCallback = z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            int size = c0478a == null ? 0 : c0478a.size();
            while (i < size) {
                arrayList2.add(c0478a.m1249b(i));
                arrayList.add(c0478a.m1250c(i));
                i++;
            }
            if (z2) {
                enterTransitionCallback.onSharedElementStart(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList2, arrayList, null);
            }
        }
    }

    private static C0478a<String, View> captureInSharedElements(C0478a<String, String> c0478a, Object obj, FragmentContainerTransition fragmentContainerTransition) {
        Fragment fragment = fragmentContainerTransition.lastIn;
        View view = fragment.getView();
        if (c0478a.isEmpty() || obj == null || view == null) {
            c0478a.clear();
            return null;
        }
        SharedElementCallback sharedElementCallback;
        Map c0478a2 = new C0478a();
        FragmentTransitionCompat21.findNamedViews(c0478a2, view);
        BackStackRecord backStackRecord = fragmentContainerTransition.lastInTransaction;
        SharedElementCallback exitTransitionCallback;
        if (fragmentContainerTransition.lastInIsPop) {
            exitTransitionCallback = fragment.getExitTransitionCallback();
            Collection collection = backStackRecord.mSharedElementSourceNames;
            sharedElementCallback = exitTransitionCallback;
        } else {
            exitTransitionCallback = fragment.getEnterTransitionCallback();
            Object obj2 = backStackRecord.mSharedElementTargetNames;
            sharedElementCallback = exitTransitionCallback;
        }
        if (collection != null) {
            C0475h.m1218a(c0478a2, collection);
        }
        if (sharedElementCallback != null) {
            sharedElementCallback.onMapSharedElements(collection, c0478a2);
            for (int size = collection.size() - 1; size >= 0; size--) {
                String str = (String) collection.get(size);
                view = (View) c0478a2.get(str);
                if (view == null) {
                    str = findKeyForValue(c0478a, str);
                    if (str != null) {
                        c0478a.remove(str);
                    }
                } else if (!str.equals(C0679r.m1942o(view))) {
                    str = findKeyForValue(c0478a, str);
                    if (str != null) {
                        c0478a.put(str, C0679r.m1942o(view));
                    }
                }
            }
        } else {
            retainValues(c0478a, c0478a2);
        }
        return c0478a2;
    }

    private static C0478a<String, View> captureOutSharedElements(C0478a<String, String> c0478a, Object obj, FragmentContainerTransition fragmentContainerTransition) {
        if (c0478a.isEmpty() || obj == null) {
            c0478a.clear();
            return null;
        }
        Collection collection;
        SharedElementCallback sharedElementCallback;
        Fragment fragment = fragmentContainerTransition.firstOut;
        Map c0478a2 = new C0478a();
        FragmentTransitionCompat21.findNamedViews(c0478a2, fragment.getView());
        BackStackRecord backStackRecord = fragmentContainerTransition.firstOutTransaction;
        SharedElementCallback enterTransitionCallback;
        if (fragmentContainerTransition.firstOutIsPop) {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
            collection = backStackRecord.mSharedElementTargetNames;
            sharedElementCallback = enterTransitionCallback;
        } else {
            enterTransitionCallback = fragment.getExitTransitionCallback();
            Object obj2 = backStackRecord.mSharedElementSourceNames;
            sharedElementCallback = enterTransitionCallback;
        }
        C0475h.m1218a(c0478a2, collection);
        if (sharedElementCallback != null) {
            sharedElementCallback.onMapSharedElements(collection, c0478a2);
            for (int size = collection.size() - 1; size >= 0; size--) {
                String str = (String) collection.get(size);
                View view = (View) c0478a2.get(str);
                if (view == null) {
                    c0478a.remove(str);
                } else if (!str.equals(C0679r.m1942o(view))) {
                    c0478a.put(C0679r.m1942o(view), (String) c0478a.remove(str));
                }
            }
        } else {
            C0475h.m1218a((Map) c0478a, c0478a2.keySet());
        }
        return c0478a2;
    }

    private static ArrayList<View> configureEnteringExitingViews(Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        ArrayList<View> arrayList2 = null;
        if (obj != null) {
            arrayList2 = new ArrayList();
            View view2 = fragment.getView();
            if (view2 != null) {
                FragmentTransitionCompat21.captureTransitioningViews(arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view);
                FragmentTransitionCompat21.addTargets(obj, arrayList2);
            }
        }
        return arrayList2;
    }

    private static Object configureSharedElementsOrdered(ViewGroup viewGroup, View view, C0478a<String, String> c0478a, FragmentContainerTransition fragmentContainerTransition, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        final Fragment fragment = fragmentContainerTransition.lastIn;
        final Fragment fragment2 = fragmentContainerTransition.firstOut;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        Object obj3;
        final boolean z = fragmentContainerTransition.lastInIsPop;
        Object sharedElementTransition = c0478a.isEmpty() ? null : getSharedElementTransition(fragment, fragment2, z);
        C0478a captureOutSharedElements = captureOutSharedElements(c0478a, sharedElementTransition, fragmentContainerTransition);
        if (c0478a.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(captureOutSharedElements.values());
            obj3 = sharedElementTransition;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        Rect rect;
        callSharedElementStartEnd(fragment, fragment2, z, captureOutSharedElements, true);
        if (obj3 != null) {
            rect = new Rect();
            FragmentTransitionCompat21.setSharedElementTargets(obj3, view, arrayList);
            setOutEpicenter(obj3, obj2, captureOutSharedElements, fragmentContainerTransition.firstOutIsPop, fragmentContainerTransition.firstOutTransaction);
            if (obj != null) {
                FragmentTransitionCompat21.setEpicenter(obj, rect);
            }
        } else {
            rect = null;
        }
        final C0478a<String, String> c0478a2 = c0478a;
        final FragmentContainerTransition fragmentContainerTransition2 = fragmentContainerTransition;
        final ArrayList<View> arrayList3 = arrayList2;
        final View view2 = view;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj4 = obj;
        OneShotPreDrawListener.add(viewGroup, new Runnable() {
            public final void run() {
                C0478a access$300 = FragmentTransition.captureInSharedElements(c0478a2, obj3, fragmentContainerTransition2);
                if (access$300 != null) {
                    arrayList3.addAll(access$300.values());
                    arrayList3.add(view2);
                }
                FragmentTransition.callSharedElementStartEnd(fragment, fragment2, z, access$300, false);
                if (obj3 != null) {
                    FragmentTransitionCompat21.swapSharedElementTargets(obj3, arrayList4, arrayList3);
                    View access$400 = FragmentTransition.getInEpicenterView(access$300, fragmentContainerTransition2, obj4, z);
                    if (access$400 != null) {
                        FragmentTransitionCompat21.getBoundsOnScreen(access$400, rect);
                    }
                }
            }
        });
        return obj3;
    }

    private static Object configureSharedElementsReordered(ViewGroup viewGroup, View view, C0478a<String, String> c0478a, FragmentContainerTransition fragmentContainerTransition, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        View view2 = null;
        final Fragment fragment = fragmentContainerTransition.lastIn;
        final Fragment fragment2 = fragmentContainerTransition.firstOut;
        if (fragment != null) {
            fragment.getView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        Object obj3;
        final boolean z = fragmentContainerTransition.lastInIsPop;
        Object sharedElementTransition = c0478a.isEmpty() ? null : getSharedElementTransition(fragment, fragment2, z);
        C0478a captureOutSharedElements = captureOutSharedElements(c0478a, sharedElementTransition, fragmentContainerTransition);
        final C0478a captureInSharedElements = captureInSharedElements(c0478a, sharedElementTransition, fragmentContainerTransition);
        if (c0478a.isEmpty()) {
            if (captureOutSharedElements != null) {
                captureOutSharedElements.clear();
            }
            if (captureInSharedElements != null) {
                captureInSharedElements.clear();
                obj3 = null;
            } else {
                obj3 = null;
            }
        } else {
            addSharedElementsWithMatchingNames(arrayList, captureOutSharedElements, c0478a.keySet());
            addSharedElementsWithMatchingNames(arrayList2, captureInSharedElements, c0478a.values());
            obj3 = sharedElementTransition;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        Rect rect;
        callSharedElementStartEnd(fragment, fragment2, z, captureOutSharedElements, true);
        if (obj3 != null) {
            arrayList2.add(view);
            FragmentTransitionCompat21.setSharedElementTargets(obj3, view, arrayList);
            setOutEpicenter(obj3, obj2, captureOutSharedElements, fragmentContainerTransition.firstOutIsPop, fragmentContainerTransition.firstOutTransaction);
            rect = new Rect();
            view2 = getInEpicenterView(captureInSharedElements, fragmentContainerTransition, obj, z);
            if (view2 != null) {
                FragmentTransitionCompat21.setEpicenter(obj, rect);
            }
        } else {
            rect = null;
        }
        OneShotPreDrawListener.add(viewGroup, new Runnable() {
            public final void run() {
                FragmentTransition.callSharedElementStartEnd(fragment, fragment2, z, captureInSharedElements, false);
                if (view2 != null) {
                    FragmentTransitionCompat21.getBoundsOnScreen(view2, rect);
                }
            }
        });
        return obj3;
    }

    private static void configureTransitionsOrdered(FragmentManagerImpl fragmentManagerImpl, int i, FragmentContainerTransition fragmentContainerTransition, View view, C0478a<String, String> c0478a) {
        View view2 = null;
        if (fragmentManagerImpl.mContainer.onHasView()) {
            view2 = (ViewGroup) fragmentManagerImpl.mContainer.onFindViewById(i);
        }
        if (view2 != null) {
            Fragment fragment = fragmentContainerTransition.lastIn;
            Fragment fragment2 = fragmentContainerTransition.firstOut;
            boolean z = fragmentContainerTransition.lastInIsPop;
            boolean z2 = fragmentContainerTransition.firstOutIsPop;
            Object enterTransition = getEnterTransition(fragment, z);
            Object exitTransition = getExitTransition(fragment2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object configureSharedElementsOrdered = configureSharedElementsOrdered(view2, view, c0478a, fragmentContainerTransition, arrayList, arrayList2, enterTransition, exitTransition);
            if (enterTransition != null || configureSharedElementsOrdered != null || exitTransition != null) {
                ArrayList configureEnteringExitingViews = configureEnteringExitingViews(exitTransition, fragment2, arrayList, view);
                Object obj = (configureEnteringExitingViews == null || configureEnteringExitingViews.isEmpty()) ? null : exitTransition;
                FragmentTransitionCompat21.addTarget(enterTransition, view);
                exitTransition = mergeTransitions(enterTransition, obj, configureSharedElementsOrdered, fragment, fragmentContainerTransition.lastInIsPop);
                if (exitTransition != null) {
                    ArrayList arrayList3 = new ArrayList();
                    FragmentTransitionCompat21.scheduleRemoveTargets(exitTransition, enterTransition, arrayList3, obj, configureEnteringExitingViews, configureSharedElementsOrdered, arrayList2);
                    scheduleTargetChange(view2, fragment, view, arrayList2, enterTransition, arrayList3, obj, configureEnteringExitingViews);
                    FragmentTransitionCompat21.setNameOverridesOrdered(view2, arrayList2, c0478a);
                    FragmentTransitionCompat21.beginDelayedTransition(view2, exitTransition);
                    FragmentTransitionCompat21.scheduleNameReset(view2, arrayList2, c0478a);
                }
            }
        }
    }

    private static void configureTransitionsReordered(FragmentManagerImpl fragmentManagerImpl, int i, FragmentContainerTransition fragmentContainerTransition, View view, C0478a<String, String> c0478a) {
        View view2 = null;
        if (fragmentManagerImpl.mContainer.onHasView()) {
            view2 = (ViewGroup) fragmentManagerImpl.mContainer.onFindViewById(i);
        }
        if (view2 != null) {
            Fragment fragment = fragmentContainerTransition.lastIn;
            Fragment fragment2 = fragmentContainerTransition.firstOut;
            boolean z = fragmentContainerTransition.lastInIsPop;
            boolean z2 = fragmentContainerTransition.firstOutIsPop;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object enterTransition = getEnterTransition(fragment, z);
            Object exitTransition = getExitTransition(fragment2, z2);
            Object configureSharedElementsReordered = configureSharedElementsReordered(view2, view, c0478a, fragmentContainerTransition, arrayList2, arrayList, enterTransition, exitTransition);
            if (enterTransition != null || configureSharedElementsReordered != null || exitTransition != null) {
                ArrayList configureEnteringExitingViews = configureEnteringExitingViews(exitTransition, fragment2, arrayList2, view);
                ArrayList configureEnteringExitingViews2 = configureEnteringExitingViews(enterTransition, fragment, arrayList, view);
                setViewVisibility(configureEnteringExitingViews2, 4);
                Object mergeTransitions = mergeTransitions(enterTransition, exitTransition, configureSharedElementsReordered, fragment, z);
                if (mergeTransitions != null) {
                    replaceHide(exitTransition, fragment2, configureEnteringExitingViews);
                    ArrayList prepareSetNameOverridesReordered = FragmentTransitionCompat21.prepareSetNameOverridesReordered(arrayList);
                    FragmentTransitionCompat21.scheduleRemoveTargets(mergeTransitions, enterTransition, configureEnteringExitingViews2, exitTransition, configureEnteringExitingViews, configureSharedElementsReordered, arrayList);
                    FragmentTransitionCompat21.beginDelayedTransition(view2, mergeTransitions);
                    FragmentTransitionCompat21.setNameOverridesReordered(view2, arrayList2, arrayList, prepareSetNameOverridesReordered, c0478a);
                    setViewVisibility(configureEnteringExitingViews2, 0);
                    FragmentTransitionCompat21.swapSharedElementTargets(configureSharedElementsReordered, arrayList2, arrayList);
                }
            }
        }
    }

    private static FragmentContainerTransition ensureContainer(FragmentContainerTransition fragmentContainerTransition, SparseArray<FragmentContainerTransition> sparseArray, int i) {
        if (fragmentContainerTransition != null) {
            return fragmentContainerTransition;
        }
        fragmentContainerTransition = new FragmentContainerTransition();
        sparseArray.put(i, fragmentContainerTransition);
        return fragmentContainerTransition;
    }

    private static String findKeyForValue(C0478a<String, String> c0478a, String str) {
        int size = c0478a.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(c0478a.m1250c(i))) {
                return (String) c0478a.m1249b(i);
            }
        }
        return null;
    }

    private static Object getEnterTransition(Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return FragmentTransitionCompat21.cloneTransition(z ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    private static Object getExitTransition(Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return FragmentTransitionCompat21.cloneTransition(z ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    private static View getInEpicenterView(C0478a<String, View> c0478a, FragmentContainerTransition fragmentContainerTransition, Object obj, boolean z) {
        BackStackRecord backStackRecord = fragmentContainerTransition.lastInTransaction;
        if (obj == null || c0478a == null || backStackRecord.mSharedElementSourceNames == null || backStackRecord.mSharedElementSourceNames.isEmpty()) {
            return null;
        }
        Object obj2;
        if (z) {
            obj2 = (String) backStackRecord.mSharedElementSourceNames.get(0);
        } else {
            String str = (String) backStackRecord.mSharedElementTargetNames.get(0);
        }
        return (View) c0478a.get(obj2);
    }

    private static Object getSharedElementTransition(Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return FragmentTransitionCompat21.wrapTransitionInSet(FragmentTransitionCompat21.cloneTransition(z ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    private static Object mergeTransitions(Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2 = true;
        if (!(obj == null || obj2 == null || fragment == null)) {
            z2 = z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        }
        return z2 ? FragmentTransitionCompat21.mergeTransitionsTogether(obj2, obj, obj3) : FragmentTransitionCompat21.mergeTransitionsInSequence(obj2, obj, obj3);
    }

    private static void replaceHide(Object obj, Fragment fragment, final ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            FragmentTransitionCompat21.scheduleHideFragmentView(obj, fragment.getView(), arrayList);
            OneShotPreDrawListener.add(fragment.mContainer, new Runnable() {
                public final void run() {
                    FragmentTransition.setViewVisibility(arrayList, 4);
                }
            });
        }
    }

    private static void retainValues(C0478a<String, String> c0478a, C0478a<String, View> c0478a2) {
        for (int size = c0478a.size() - 1; size >= 0; size--) {
            if (!c0478a2.containsKey((String) c0478a.m1250c(size))) {
                c0478a.m1251d(size);
            }
        }
    }

    private static void scheduleTargetChange(ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        final Object obj3 = obj;
        final View view2 = view;
        final Fragment fragment2 = fragment;
        final ArrayList<View> arrayList4 = arrayList;
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<View> arrayList6 = arrayList3;
        final Object obj4 = obj2;
        OneShotPreDrawListener.add(viewGroup, new Runnable() {
            public final void run() {
                if (obj3 != null) {
                    FragmentTransitionCompat21.removeTarget(obj3, view2);
                    arrayList5.addAll(FragmentTransition.configureEnteringExitingViews(obj3, fragment2, arrayList4, view2));
                }
                if (arrayList6 != null) {
                    if (obj4 != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view2);
                        FragmentTransitionCompat21.replaceTargets(obj4, arrayList6, arrayList);
                    }
                    arrayList6.clear();
                    arrayList6.add(view2);
                }
            }
        });
    }

    private static void setOutEpicenter(Object obj, Object obj2, C0478a<String, View> c0478a, boolean z, BackStackRecord backStackRecord) {
        if (backStackRecord.mSharedElementSourceNames != null && !backStackRecord.mSharedElementSourceNames.isEmpty()) {
            Object obj3;
            if (z) {
                obj3 = (String) backStackRecord.mSharedElementTargetNames.get(0);
            } else {
                String str = (String) backStackRecord.mSharedElementSourceNames.get(0);
            }
            View view = (View) c0478a.get(obj3);
            FragmentTransitionCompat21.setEpicenter(obj, view);
            if (obj2 != null) {
                FragmentTransitionCompat21.setEpicenter(obj2, view);
            }
        }
    }

    private static void setViewVisibility(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    static void startTransitions(FragmentManagerImpl fragmentManagerImpl, ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (fragmentManagerImpl.mCurState > 0 && VERSION.SDK_INT >= 21) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                BackStackRecord backStackRecord = (BackStackRecord) arrayList.get(i3);
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    calculatePopFragments(backStackRecord, sparseArray, z);
                } else {
                    calculateFragments(backStackRecord, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(fragmentManagerImpl.mHost.getContext());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C0478a calculateNameOverrides = calculateNameOverrides(keyAt, arrayList, arrayList2, i, i2);
                    FragmentContainerTransition fragmentContainerTransition = (FragmentContainerTransition) sparseArray.valueAt(i4);
                    if (z) {
                        configureTransitionsReordered(fragmentManagerImpl, keyAt, fragmentContainerTransition, view, calculateNameOverrides);
                    } else {
                        configureTransitionsOrdered(fragmentManagerImpl, keyAt, fragmentContainerTransition, view, calculateNameOverrides);
                    }
                }
            }
        }
    }
}
