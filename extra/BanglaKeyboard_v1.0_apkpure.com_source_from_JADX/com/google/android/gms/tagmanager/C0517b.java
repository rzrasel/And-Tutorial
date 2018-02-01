package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class C0517b {
    public static final Object f2334a = new Object();
    static final String[] f2335b = "gtm.lifetime".toString().split("\\.");
    private static final Pattern f2336c = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ConcurrentHashMap f2337d;
    private final Map f2338e;
    private final ReentrantLock f2339f;
    private final LinkedList f2340g;
    private final C0518g f2341h;
    private final CountDownLatch f2342i;

    C0517b() {
        this(new C0520c());
    }

    C0517b(C0518g c0518g) {
        this.f2341h = c0518g;
        this.f2337d = new ConcurrentHashMap();
        this.f2338e = new HashMap();
        this.f2339f = new ReentrantLock();
        this.f2340g = new LinkedList();
        this.f2342i = new CountDownLatch(1);
        this.f2341h.mo1323a(new C0522d(this));
    }

    private static Long m3662a(String str) {
        Matcher matcher = f2336c.matcher(str);
        if (matcher.matches()) {
            long parseLong;
            try {
                parseLong = Long.parseLong(matcher.group(1));
            } catch (NumberFormatException e) {
                C0535t.m3731a("illegal number in _lifetime value: " + str);
                parseLong = 0;
            }
            if (parseLong <= 0) {
                "non-positive _lifetime: " + str;
                C0535t.m3733c();
                return null;
            }
            String group = matcher.group(2);
            if (group.length() == 0) {
                return Long.valueOf(parseLong);
            }
            switch (group.charAt(0)) {
                case 'd':
                    return Long.valueOf((((parseLong * 1000) * 60) * 60) * 24);
                case 'h':
                    return Long.valueOf(((parseLong * 1000) * 60) * 60);
                case 'm':
                    return Long.valueOf((parseLong * 1000) * 60);
                case 's':
                    return Long.valueOf(parseLong * 1000);
                default:
                    C0535t.m3731a("unknown units in _lifetime: " + str);
                    return null;
            }
        }
        "unknown _lifetime: " + str;
        C0535t.m3733c();
        return null;
    }

    static Map m3663a(String str, Object obj) {
        Map hashMap = new HashMap();
        String[] split = str.toString().split("\\.");
        int i = 0;
        Map map = hashMap;
        while (i < split.length - 1) {
            HashMap hashMap2 = new HashMap();
            map.put(split[i], hashMap2);
            i++;
            Object obj2 = hashMap2;
        }
        map.put(split[split.length - 1], obj);
        return hashMap;
    }

    private void m3666a(List list, List list2) {
        while (list2.size() < list.size()) {
            list2.add(null);
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof List) {
                if (!(list2.get(i) instanceof List)) {
                    list2.set(i, new ArrayList());
                }
                m3666a((List) obj, (List) list2.get(i));
            } else if (obj instanceof Map) {
                if (!(list2.get(i) instanceof Map)) {
                    list2.set(i, new HashMap());
                }
                m3668a((Map) obj, (Map) list2.get(i));
            } else if (obj != f2334a) {
                list2.set(i, obj);
            }
        }
    }

    private void m3667a(Map map, String str, Collection collection) {
        for (Entry entry : map.entrySet()) {
            String str2 = str + (str.length() == 0 ? "" : ".") + ((String) entry.getKey());
            if (entry.getValue() instanceof Map) {
                m3667a((Map) entry.getValue(), str2, collection);
            } else if (!str2.equals("gtm.lifetime")) {
                collection.add(new C0523e(str2, entry.getValue()));
            }
        }
    }

    private void m3668a(Map map, Map map2) {
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof List) {
                if (!(map2.get(str) instanceof List)) {
                    map2.put(str, new ArrayList());
                }
                m3666a((List) obj, (List) map2.get(str));
            } else if (obj instanceof Map) {
                if (!(map2.get(str) instanceof Map)) {
                    map2.put(str, new HashMap());
                }
                m3668a((Map) obj, (Map) map2.get(str));
            } else {
                map2.put(str, obj);
            }
        }
    }

    private void m3669b(Map map) {
        this.f2339f.lock();
        try {
            this.f2340g.offer(map);
            if (this.f2339f.getHoldCount() == 1) {
                int i = 0;
                while (true) {
                    Map map2 = (Map) this.f2340g.poll();
                    if (map2 == null) {
                        break;
                    }
                    synchronized (this.f2338e) {
                        for (String str : map2.keySet()) {
                            m3668a(C0517b.m3663a(str, map2.get(str)), this.f2338e);
                        }
                    }
                    for (C0516f a : this.f2337d.keySet()) {
                        a.mo1322a(map2);
                    }
                    int i2 = i + 1;
                    if (i2 > 500) {
                        this.f2340g.clear();
                        throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
                    }
                    i = i2;
                }
            }
            Object c = C0517b.m3670c(map);
            Long a2 = c == null ? null : C0517b.m3662a(c.toString());
            if (a2 != null) {
                List arrayList = new ArrayList();
                m3667a(map, "", arrayList);
                arrayList.remove("gtm.lifetime");
                this.f2341h.mo1324a(arrayList, a2.longValue());
            }
            this.f2339f.unlock();
        } catch (Throwable th) {
            this.f2339f.unlock();
        }
    }

    private static Object m3670c(Map map) {
        String[] strArr = f2335b;
        int length = strArr.length;
        int i = 0;
        Object obj = map;
        while (i < length) {
            Object obj2 = strArr[i];
            if (!(obj instanceof Map)) {
                return null;
            }
            i++;
            obj = ((Map) obj).get(obj2);
        }
        return obj;
    }

    final void m3671a(C0516f c0516f) {
        this.f2337d.put(c0516f, Integer.valueOf(0));
    }

    public final void m3672a(Map map) {
        try {
            this.f2342i.await();
        } catch (InterruptedException e) {
            C0535t.m3731a("DataLayer.push: unexpected InterruptedException");
        }
        m3669b(map);
    }
}
