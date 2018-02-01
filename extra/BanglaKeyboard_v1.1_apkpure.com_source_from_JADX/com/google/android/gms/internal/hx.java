package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@aqv
public final class hx {
    private static Map<String, List<Map<String, Object>>> f6230a = new HashMap();
    private static List<MediaCodecInfo> f6231b;
    private static final Object f6232c = new Object();

    @TargetApi(16)
    public static List<Map<String, Object>> m5604a(String str) {
        Object e;
        synchronized (f6232c) {
            if (f6230a.containsKey(str)) {
                return (List) f6230a.get(str);
            }
            try {
                int i;
                synchronized (f6232c) {
                    if (f6231b != null) {
                    } else {
                        if (VERSION.SDK_INT >= 21) {
                            f6231b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else if (VERSION.SDK_INT >= 16) {
                            int codecCount = MediaCodecList.getCodecCount();
                            f6231b = new ArrayList(codecCount);
                            for (i = 0; i < codecCount; i++) {
                                f6231b.add(MediaCodecList.getCodecInfoAt(i));
                            }
                        } else {
                            f6231b = Collections.emptyList();
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (MediaCodecInfo mediaCodecInfo : f6231b) {
                    if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                        Map hashMap = new HashMap();
                        hashMap.put("codecName", mediaCodecInfo.getName());
                        CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        ArrayList arrayList2 = new ArrayList();
                        for (CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                        }
                        hashMap.put("profileLevels", arrayList2);
                        if (VERSION.SDK_INT >= 21) {
                            VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            hashMap.put("bitRatesBps", m5605a(videoCapabilities.getBitrateRange()));
                            hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            hashMap.put("frameRates", m5605a(videoCapabilities.getSupportedFrameRates()));
                            hashMap.put("widths", m5605a(videoCapabilities.getSupportedWidths()));
                            hashMap.put("heights", m5605a(videoCapabilities.getSupportedHeights()));
                        }
                        if (VERSION.SDK_INT >= 23) {
                            hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                        }
                        arrayList.add(hashMap);
                    }
                }
                f6230a.put(str, arrayList);
                return arrayList;
            } catch (RuntimeException e2) {
                e = e2;
            } catch (LinkageError e3) {
                e = e3;
            }
        }
        Map hashMap2 = new HashMap();
        hashMap2.put("error", e.getClass().getSimpleName());
        List arrayList3 = new ArrayList();
        arrayList3.add(hashMap2);
        f6230a.put(str, arrayList3);
        return arrayList3;
    }

    @TargetApi(21)
    private static Integer[] m5605a(Range<Integer> range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}
